package com.github.alexthe666.rats.server.block.entity;

import com.github.alexthe666.rats.registry.RatsBlockEntityRegistry;
import com.github.alexthe666.rats.registry.RatsBlockRegistry;
import com.github.alexthe666.rats.registry.RatsItemRegistry;
import com.github.alexthe666.rats.server.block.RatCageBlock;
import com.github.alexthe666.rats.server.block.RatCageWheelBlock;
import com.github.alexthe666.rats.server.entity.rat.TamedRat;
import com.github.alexthe666.rats.server.misc.RatUpgradeUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.Mth;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.EnergyStorage;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.concurrent.atomic.AtomicInteger;

public class RatCageWheelBlockEntity extends DecoratedRatCageBlockEntity {

	public int useTicks = 0;
	public float rotationSpeed = 1.0F;
	private TamedRat wheeler;
	private int dismountCooldown = 0;
	private final EnergyStorage energyStorage;
	private final LazyOptional<EnergyStorage> energyCap;

	public RatCageWheelBlockEntity(BlockPos pos, BlockState state) {
		super(RatsBlockEntityRegistry.RAT_CAGE_WHEEL.get(), pos, state);
		this.energyStorage = new EnergyStorage(1000, 10, 10, 0);
		this.energyCap = LazyOptional.of(() -> this.energyStorage);
	}

	@Override
	public ItemStack getContainedItem() {
		return new ItemStack(RatsItemRegistry.RAT_WHEEL.get());
	}

	@Override
	public void setContainedItem(ItemStack stack) {
	}

	@Override
	public void saveAdditional(CompoundTag compound) {
		compound.putInt("UseTicks", this.useTicks);
		compound.put("Energy", this.energyStorage.serializeNBT());

		compound.putInt("DismountCooldown", this.dismountCooldown);
		super.saveAdditional(compound);
	}

	@Override
	public void load(CompoundTag compound) {
		super.load(compound);
		this.useTicks = compound.getInt("UseTicks");
		this.dismountCooldown = compound.getInt("DismountCooldown");
		if (compound.contains("Energy")) {
			this.energyStorage.deserializeNBT(compound.get("Energy"));
		}
	}

	public void removeWheeler() {
		if (this.wheeler != null) {
			this.wheeler.setInWheel(false);
			this.wheeler = null;
		}
	}

	public static void tick(Level level, BlockPos pos, BlockState state, RatCageWheelBlockEntity te) {
		if (te.dismountCooldown > 0) {
			--te.dismountCooldown;
		}

		if (te.wheeler == null) {
			te.useTicks = 0;
			if (te.dismountCooldown <= 0) {
				for (TamedRat rat : level.getEntitiesOfClass(TamedRat.class, new AABB(pos))) {
					if (rat.isTame()) {
						te.wheeler = rat;
						te.wheeler.setInWheel(true);
						te.rotationSpeed = RatUpgradeUtils.hasUpgrade(rat, RatsItemRegistry.RAT_UPGRADE_SPEED.get()) ? 2.0F : 1.0F;
						break;
					}
				}
			}
		} else {
			++te.useTicks;
			te.sendEnergy(level, pos);

			if (!level.isClientSide()) {
				Direction facing = Direction.NORTH;
				if (state.is(RatsBlockRegistry.RAT_CAGE_WHEEL.get())) {
					facing = state.getValue(RatCageWheelBlock.FACING);
				}

				te.wheeler.setYRot(te.wheeler.yRotO = facing.toYRot());
				te.wheeler.yHeadRot = te.wheeler.yHeadRotO = te.wheeler.getYRot();
				te.wheeler.yBodyRot = te.wheeler.yBodyRotO = te.wheeler.getYRot();

				int nrg = Mth.ceil(10 * te.rotationSpeed);
				if (te.energyStorage.receiveEnergy(nrg, true) != 0) {
					te.energyStorage.receiveEnergy(nrg, false);
				}

				if (te.useTicks > 200 && te.useTicks % 100 == 0 && level.getRandom().nextFloat() > 0.25F) {
					for (Direction direction : Direction.values()) {
						if (RatCageBlock.runConnectionLogic(level.getBlockState(pos.relative(direction))) == 1 && te.wheeler != null) {
							te.wheeler.setPos((float) pos.relative(direction).getX() + 0.5F, (float) pos.relative(direction).getY() + 0.5F, (float) pos.relative(direction).getZ() + 0.5F);
							te.removeWheeler();
							te.dismountCooldown = 1200 + level.getRandom().nextInt(1200);
						}
					}
				}
			}
		}
	}

	private void sendEnergy(Level level, BlockPos pos) {
		AtomicInteger capacity = new AtomicInteger(this.energyStorage.getEnergyStored());

		for (int i = 0; (i < Direction.values().length) && (capacity.get() > 0); i++) {
			Direction facing = Direction.values()[i];
			if (facing.equals(Direction.UP))
				continue;

			BlockEntity blockEntity = level.getBlockEntity(pos.relative(facing));
			if (blockEntity == null)
				continue;
			blockEntity.getCapability(ForgeCapabilities.ENERGY, facing.getOpposite()).ifPresent(handler -> {
				if (handler.canReceive()) {
					int received = handler.receiveEnergy(Math.min(capacity.get(), 10), false);
					capacity.addAndGet(-received);
					this.energyStorage.extractEnergy(received, false);
					this.setChanged();
				}
			});
		}
	}

	@Override
	public void setRemoved() {
		super.setRemoved();
		this.energyCap.invalidate();
	}

	@NotNull
	@Override
	public <T> LazyOptional<T> getCapability(Capability<T> capability, @Nullable Direction facing) {
		return capability == ForgeCapabilities.ENERGY ? this.energyCap.cast() : super.getCapability(capability, facing);
	}
}
