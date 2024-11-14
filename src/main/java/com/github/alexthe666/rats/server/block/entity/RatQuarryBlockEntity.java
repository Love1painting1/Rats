package com.github.alexthe666.rats.server.block.entity;

import com.github.alexthe666.rats.data.tags.RatsBlockTags;
import com.github.alexthe666.rats.registry.RatsBlockEntityRegistry;
import com.github.alexthe666.rats.registry.RatsBlockRegistry;
import com.github.alexthe666.rats.server.misc.RatsLangConstants;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.SidedInvWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.stream.IntStream;

public class RatQuarryBlockEntity extends BaseContainerBlockEntity implements WorldlyContainer {
	private static final int[] STACKS = IntStream.range(0, 64).toArray();
	private final LazyOptional<? extends IItemHandler>[] handlers = SidedInvWrapper.create(this, Direction.UP, Direction.DOWN);
	private NonNullList<ItemStack> inventory = NonNullList.withSize(64, ItemStack.EMPTY);
	private int tick;

	public RatQuarryBlockEntity(BlockPos pos, BlockState state) {
		super(RatsBlockEntityRegistry.RAT_QUARRY.get(), pos, state);
	}

	@Override
	public int getContainerSize() {
		return this.inventory.size();
	}

	@Override
	public boolean isEmpty() {
		for (ItemStack itemstack : this.inventory) {
			if (!itemstack.isEmpty()) {
				return false;
			}
		}

		return true;
	}

	@Override
	public ItemStack getItem(int index) {
		return this.inventory.get(index);
	}

	@Override
	public ItemStack removeItem(int index, int count) {
		return ContainerHelper.removeItem(this.inventory, index, count);
	}

	@Override
	public ItemStack removeItemNoUpdate(int index) {
		return ContainerHelper.takeItem(this.inventory, index);
	}

	@Override
	public int[] getSlotsForFace(Direction direction) {
		return STACKS;
	}

	@Override
	public boolean canPlaceItemThroughFace(int index, ItemStack stack, @Nullable Direction direction) {
		return this.canPlaceItem(index, stack);
	}

	@Override
	public boolean canTakeItemThroughFace(int index, ItemStack stack, Direction direction) {
		return true;
	}

	public void setItem(int index, ItemStack stack) {
		this.inventory.set(index, stack);

		if (stack.getCount() > this.getMaxStackSize()) {
			stack.setCount(this.getMaxStackSize());
		}
		this.setChanged();
	}

	public boolean stillValid(Player player) {
		if (player.level().getBlockEntity(this.getBlockPos()) != this) {
			return false;
		} else {
			return player.distanceToSqr((double) this.getBlockPos().getX() + 0.5D, (double) this.getBlockPos().getY() + 0.5D, (double) this.getBlockPos().getZ() + 0.5D) <= 64.0D;
		}
	}

	@Override
	public void clearContent() {
		this.inventory.clear();
	}


	public static void tick(Level level, BlockPos pos, BlockState state, RatQuarryBlockEntity te) {
		if (!level.isClientSide()) {
			te.tick++;
			if (te.tick % 20 == 0) {
				BlockPos nextStairPos = te.getNextPosForStairs(level);
				if (level.isEmptyBlock(nextStairPos) || level.getBlockState(nextStairPos).canBeReplaced()) {
					level.setBlockAndUpdate(nextStairPos, RatsBlockRegistry.RAT_QUARRY_PLATFORM.get().defaultBlockState());
					level.playSound(null, nextStairPos, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS);
				}
			}
		}
	}

	public void load(CompoundTag compound) {
		super.load(compound);
		this.inventory = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
		ContainerHelper.loadAllItems(compound, this.inventory);
	}

	public void saveAdditional(CompoundTag compound) {
		super.saveAdditional(compound);
		ContainerHelper.saveAllItems(compound, this.inventory);
	}

	@Override
	protected Component getDefaultName() {
		return Component.translatable(RatsLangConstants.QUARRY);
	}

	@Override
	protected AbstractContainerMenu createMenu(int id, Inventory player) {
		return new ChestMenu(MenuType.GENERIC_9x6, id, player, this, 6);
	}

	@Nullable
	@Override
	public AbstractContainerMenu createMenu(int id, Inventory playerInventory, Player player) {
		return new ChestMenu(MenuType.GENERIC_9x6, id, playerInventory, this, 6);
	}

	@Override
	public boolean hasCustomName() {
		return false;
	}

	@NotNull
	@Override
	public <T> LazyOptional<T> getCapability(Capability<T> capability, @Nullable Direction facing) {
		if (!this.remove && facing != null && capability == ForgeCapabilities.ITEM_HANDLER) {
			return handlers[0].cast();
		}
		return super.getCapability(capability, facing);
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this, BlockEntity::getUpdateTag);
	}

	@Override
	public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket packet) {
		this.handleUpdateTag(packet.getTag());
	}

	public CompoundTag getUpdateTag() {
		return this.saveWithId();
	}

	public int getRadius() {
		return 2;
	}

	public BlockPos getNextPosForStairs(Level level) {
		int yLevel = this.getBlockPos().getY() - 1;
		BlockPos stairPos = this.getBlockPos().offset(-this.getRadius(), -1, -this.getRadius());
		int passedLevels = 0;
		while (yLevel > this.getLevel().getMinBuildHeight() + 1) {
			if (yLevel == this.getBlockPos().getY() - 1) {
				BlockPos checkingPos = this.getBlockPos().below();
				for (int i = 0; i < this.getRadius(); i++) {
					if (level.isEmptyBlock(checkingPos)) {
						return checkingPos;
					}
					checkingPos = checkingPos.relative(Direction.NORTH);
				}
				for (int i = 0; i <= this.getRadius(); i++) {
					if (level.isEmptyBlock(checkingPos)) {
						return checkingPos;
					}
					checkingPos = checkingPos.relative(Direction.WEST);
				}
			}
			boolean atLevel = false;
			for (BlockPos pos : BlockPos.betweenClosedStream(new BlockPos(this.getBlockPos().getX() - this.getRadius(), yLevel, this.getBlockPos().getZ() - this.getRadius()), new BlockPos(this.getBlockPos().getX() + this.getRadius(), yLevel, this.getBlockPos().getZ() + this.getRadius())).map(BlockPos::immutable).toList()) {
				if (level.getBlockState(pos).is(RatsBlockRegistry.RAT_QUARRY_PLATFORM.get()) || level.getBlockState(pos).is(RatsBlockTags.QUARRY_IGNORABLES)) {
					atLevel = true;
					break;
				}
			}
			if (!atLevel) {
				break;
			}
			passedLevels++;
			yLevel--;
		}
		stairPos = stairPos.below(passedLevels);
		Direction buildDir = Direction.SOUTH;
		for (int i = 0; i < passedLevels; i++) {
			if (i > 0 && i % (this.getRadius() * 2) == 0) {
				buildDir = buildDir.getCounterClockWise();
			}
			stairPos = stairPos.relative(buildDir);
		}
		return stairPos;
	}
}
