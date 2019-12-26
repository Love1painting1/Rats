package com.github.alexthe666.rats.client.model;

import com.github.alexthe666.citadel.animation.IAnimatedEntity;
import com.github.alexthe666.citadel.client.model.AdvancedEntityModel;
import com.github.alexthe666.citadel.client.model.AdvancedRendererModel;
import com.github.alexthe666.citadel.client.model.ModelAnimator;
import com.github.alexthe666.rats.server.entity.EntityFeralRatlantean;
import net.minecraft.entity.Entity;

public class ModelFeralRatlantean extends AdvancedEntityModel {
    public AdvancedRendererModel lowerbody;
    public AdvancedRendererModel midBody;
    public AdvancedRendererModel backLeftThigh;
    public AdvancedRendererModel backRightThigh;
    public AdvancedRendererModel tail1;
    public AdvancedRendererModel tatters3;
    public AdvancedRendererModel frontBody;
    public AdvancedRendererModel tatters1;
    public AdvancedRendererModel tatters2;
    public AdvancedRendererModel frontRightLeg;
    public AdvancedRendererModel frontLeftLeg;
    public AdvancedRendererModel neck;
    public AdvancedRendererModel frontRightHeel;
    public AdvancedRendererModel frontRightFoot;
    public AdvancedRendererModel frontLeftHeel;
    public AdvancedRendererModel frontLeftFoot;
    public AdvancedRendererModel head1;
    public AdvancedRendererModel tatters4;
    public AdvancedRendererModel snoutUpper;
    public AdvancedRendererModel mouth1;
    public AdvancedRendererModel ear1;
    public AdvancedRendererModel ear2;
    public AdvancedRendererModel nose;
    public AdvancedRendererModel teeth;
    public AdvancedRendererModel wisker1;
    public AdvancedRendererModel wisker2;
    public AdvancedRendererModel backLeftLeg;
    public AdvancedRendererModel backLeftHeel;
    public AdvancedRendererModel backLeftFoot;
    public AdvancedRendererModel backRightLeg;
    public AdvancedRendererModel backRightHeel;
    public AdvancedRendererModel backRightFoot;
    public AdvancedRendererModel tail2;
    public AdvancedRendererModel tail3;
    public AdvancedRendererModel tail4;
    public ModelAnimator animator;

    public ModelFeralRatlantean() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.tail2 = new AdvancedRendererModel(this, 15, 50);
        this.tail2.setRotationPoint(0.0F, 0.1F, 7.5F);
        this.tail2.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 8, 0.0F);
        this.setRotateAngle(tail2, 0.2617993877991494F, 0.0F, 0.0F);
        this.frontLeftHeel = new AdvancedRendererModel(this, 34, 0);
        this.frontLeftHeel.setRotationPoint(1.0F, 4.7F, 1.0F);
        this.frontLeftHeel.addBox(-0.5F, 0.0F, -2.0F, 1, 6, 2, 0.0F);
        this.setRotateAngle(frontLeftHeel, -0.9599310885968813F, 0.0F, 0.0F);
        this.frontRightHeel = new AdvancedRendererModel(this, 34, 0);
        this.frontRightHeel.setRotationPoint(-1.0F, 4.7F, 1.0F);
        this.frontRightHeel.addBox(-0.5F, 0.0F, -2.0F, 1, 6, 2, 0.0F);
        this.setRotateAngle(frontRightHeel, -0.9599310885968813F, 0.0F, 0.0F);
        this.nose = new AdvancedRendererModel(this, 36, 27);
        this.nose.setRotationPoint(0.0F, 0.5F, -4.0F);
        this.nose.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(nose, 0.31869712141416456F, 0.0F, 0.0F);
        this.teeth = new AdvancedRendererModel(this, 24, 43);
        this.teeth.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.teeth.addBox(-2.0F, -0.1F, -5.0F, 4, 2, 5, 0.0F);
        this.tail4 = new AdvancedRendererModel(this, 0, 53);
        this.tail4.setRotationPoint(0.0F, 0.0F, 7.5F);
        this.tail4.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 8, 0.0F);
        this.setRotateAngle(tail4, 0.2617993877991494F, 0.0F, 0.0F);
        this.lowerbody = new AdvancedRendererModel(this, 0, 0);
        this.lowerbody.setRotationPoint(0.0F, 12.3F, 4.0F);
        this.lowerbody.addBox(-3.5F, -4.0F, -1.0F, 7, 8, 10, 0.0F);
        this.setRotateAngle(lowerbody, -0.08726646259971647F, 0.0F, 0.0F);
        this.tatters4 = new AdvancedRendererModel(this, 89, 0);
        this.tatters4.setRotationPoint(-2.0F, -1.0F, -1.0F);
        this.tatters4.addBox(0.0F, 0.0F, -3.0F, 0, 9, 6, 0.0F);
        this.setRotateAngle(tatters4, 0.0F, 0.0F, 0.2617993877991494F);
        this.frontBody = new AdvancedRendererModel(this, 15, 27);
        this.frontBody.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.frontBody.addBox(-3.5F, -3.5F, -7.0F, 7, 7, 7, 0.0F);
        this.setRotateAngle(frontBody, 0.2617993877991494F, 0.0F, 0.0F);
        this.frontLeftFoot = new AdvancedRendererModel(this, 0, 29);
        this.frontLeftFoot.setRotationPoint(0.0F, 5.1F, -0.7F);
        this.frontLeftFoot.addBox(-1.0F, 0.0F, -5.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(frontLeftFoot, 0.08726646259971647F, 0.0F, 0.0F);
        this.mouth1 = new AdvancedRendererModel(this, 13, 41);
        this.mouth1.setRotationPoint(0.0F, 1.5F, -5.0F);
        this.mouth1.addBox(-1.5F, 0.0F, -5.7F, 3, 1, 5, 0.0F);
        this.backLeftHeel = new AdvancedRendererModel(this, 0, 44);
        this.backLeftHeel.setRotationPoint(0.0F, 6.0F, 0.2F);
        this.backLeftHeel.addBox(-0.5F, 0.0F, -2.0F, 1, 6, 2, 0.0F);
        this.setRotateAngle(backLeftHeel, -2.007128639793479F, 0.0F, 0.0F);
        this.backRightFoot = new AdvancedRendererModel(this, 1, 47);
        this.backRightFoot.setRotationPoint(0.0F, 5.1F, -0.7F);
        this.backRightFoot.addBox(-1.0F, 0.0F, -5.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(backRightFoot, 0.6108652381980153F, 0.0F, 0.0F);
        this.tail3 = new AdvancedRendererModel(this, 0, 53);
        this.tail3.setRotationPoint(0.0F, 0.0F, 7.5F);
        this.tail3.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 8, 0.0F);
        this.setRotateAngle(tail3, 0.2617993877991494F, 0.0F, 0.0F);
        this.tatters3 = new AdvancedRendererModel(this, 102, 0);
        this.tatters3.setRotationPoint(3.5F, -4.0F, 7.0F);
        this.tatters3.addBox(0.0F, 0.0F, -3.0F, 0, 9, 6, 0.0F);
        this.setRotateAngle(tatters3, 0.0F, 0.0F, -0.9105382707654417F);
        this.backLeftThigh = new AdvancedRendererModel(this, 30, 15);
        this.backLeftThigh.setRotationPoint(3.5F, 0.0F, 5.0F);
        this.backLeftThigh.addBox(0.0F, -1.0F, -2.0F, 3, 8, 4, 0.0F);
        this.setRotateAngle(backLeftThigh, -0.7853981633974483F, 0.0F, 0.0F);
        this.ear1 = new AdvancedRendererModel(this, 71, -3);
        this.ear1.setRotationPoint(2.5F, -2.0F, -2.0F);
        this.ear1.addBox(0.0F, 0.0F, 0.0F, 0, 3, 3, 0.0F);
        this.setRotateAngle(ear1, 0.7853981633974483F, 0.7853981633974483F, 0.0F);
        this.frontRightFoot = new AdvancedRendererModel(this, 0, 29);
        this.frontRightFoot.setRotationPoint(0.0F, 5.1F, -0.7F);
        this.frontRightFoot.addBox(-1.0F, 0.0F, -5.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(frontRightFoot, 0.08726646259971647F, 0.0F, 0.0F);
        this.tatters2 = new AdvancedRendererModel(this, 76, 0);
        this.tatters2.setRotationPoint(-3.0F, -3.0F, -6.0F);
        this.tatters2.addBox(0.0F, 0.0F, -3.0F, 0, 8, 6, 0.0F);
        this.setRotateAngle(tatters2, 0.0F, 0.0F, 0.5235987755982988F);
        this.frontLeftLeg = new AdvancedRendererModel(this, 0, 0);
        this.frontLeftLeg.setRotationPoint(3.5F, 2.0F, -4.0F);
        this.frontLeftLeg.addBox(0.0F, -1.0F, -1.5F, 2, 6, 3, 0.0F);
        this.setRotateAngle(frontLeftLeg, 0.5235987755982988F, 0.0F, 0.0F);
        this.neck = new AdvancedRendererModel(this, 43, 27);
        this.neck.setRotationPoint(0.0F, -0.5F, -7.0F);
        this.neck.addBox(-2.0F, -2.5F, -4.0F, 4, 5, 5, 0.0F);
        this.setRotateAngle(neck, -0.2617993877991494F, 0.0F, 0.0F);
        this.tail1 = new AdvancedRendererModel(this, 0, 18);
        this.tail1.setRotationPoint(0.0F, -1.0F, 8.0F);
        this.tail1.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 8, 0.0F);
        this.setRotateAngle(tail1, -0.6981317007977318F, 0.0F, 0.0F);
        this.frontRightLeg = new AdvancedRendererModel(this, 0, 0);
        this.frontRightLeg.setRotationPoint(-3.5F, 2.0F, -4.0F);
        this.frontRightLeg.addBox(-2.0F, -1.0F, -1.5F, 2, 6, 3, 0.0F);
        this.setRotateAngle(frontRightLeg, 0.5235987755982988F, 0.0F, 0.0F);
        this.midBody = new AdvancedRendererModel(this, 34, 0);
        this.midBody.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.midBody.addBox(-3.0F, -3.0F, -7.0F, 6, 7, 8, 0.0F);
        this.setRotateAngle(midBody, 0.17453292519943295F, 0.0F, 0.0F);
        this.snoutUpper = new AdvancedRendererModel(this, 0, 36);
        this.snoutUpper.setRotationPoint(0.0F, -1.3F, -6.0F);
        this.snoutUpper.addBox(-2.0F, 0.0F, -5.0F, 4, 3, 5, 0.0F);
        this.ear2 = new AdvancedRendererModel(this, 71, -3);
        this.ear2.setRotationPoint(-2.5F, -2.0F, -2.0F);
        this.ear2.addBox(0.0F, 0.0F, 0.0F, 0, 3, 3, 0.0F);
        this.setRotateAngle(ear2, 0.7853981633974483F, -0.7853981633974483F, 0.0F);
        this.wisker1 = new AdvancedRendererModel(this, 63, 0);
        this.wisker1.mirror = true;
        this.wisker1.setRotationPoint(2.0F, 1.0F, -4.0F);
        this.wisker1.addBox(0.0F, -2.0F, 0.0F, 4, 4, 0, 0.0F);
        this.setRotateAngle(wisker1, 0.0F, -0.8726646259971648F, 0.0F);
        this.backLeftFoot = new AdvancedRendererModel(this, 1, 47);
        this.backLeftFoot.mirror = true;
        this.backLeftFoot.setRotationPoint(0.0F, 5.1F, -0.7F);
        this.backLeftFoot.addBox(-1.0F, 0.0F, -5.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(backLeftFoot, 0.6108652381980153F, 0.0F, 0.0F);
        this.backLeftLeg = new AdvancedRendererModel(this, 0, 18);
        this.backLeftLeg.setRotationPoint(1.2F, 7.0F, 1.5F);
        this.backLeftLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(backLeftLeg, 2.2689280275926285F, 0.0F, 0.0F);
        this.tatters1 = new AdvancedRendererModel(this, 63, 0);
        this.tatters1.setRotationPoint(3.0F, -1.0F, -3.0F);
        this.tatters1.addBox(0.0F, 0.0F, -3.0F, 0, 9, 6, 0.0F);
        this.setRotateAngle(tatters1, 0.0F, 0.0F, -0.2617993877991494F);
        this.head1 = new AdvancedRendererModel(this, 37, 37);
        this.head1.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.head1.addBox(-3.0F, -2.5F, -6.0F, 6, 5, 6, 0.0F);
        this.setRotateAngle(head1, -0.08726646259971647F, 0.0F, 0.0F);
        this.backRightThigh = new AdvancedRendererModel(this, 30, 15);
        this.backRightThigh.setRotationPoint(-3.5F, 0.0F, 5.0F);
        this.backRightThigh.addBox(-3.0F, -1.0F, -2.0F, 3, 8, 4, 0.0F);
        this.setRotateAngle(backRightThigh, -0.7853981633974483F, 0.0F, 0.0F);
        this.backRightHeel = new AdvancedRendererModel(this, 0, 44);
        this.backRightHeel.setRotationPoint(0.0F, 6.0F, 0.2F);
        this.backRightHeel.addBox(-0.5F, 0.0F, -2.0F, 1, 6, 2, 0.0F);
        this.setRotateAngle(backRightHeel, -2.007128639793479F, 0.0F, 0.0F);
        this.wisker2 = new AdvancedRendererModel(this, 63, 0);
        this.wisker2.setRotationPoint(-2.0F, 1.0F, -4.0F);
        this.wisker2.addBox(-4.0F, -2.0F, 0.0F, 4, 4, 0, 0.0F);
        this.setRotateAngle(wisker2, 0.0F, 0.8726646259971648F, 0.0F);
        this.backRightLeg = new AdvancedRendererModel(this, 0, 18);
        this.backRightLeg.setRotationPoint(-1.2F, 7.0F, 1.5F);
        this.backRightLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(backRightLeg, 2.2689280275926285F, 0.0F, 0.0F);
        this.tail1.addChild(this.tail2);
        this.frontLeftLeg.addChild(this.frontLeftHeel);
        this.frontRightLeg.addChild(this.frontRightHeel);
        this.snoutUpper.addChild(this.nose);
        this.snoutUpper.addChild(this.teeth);
        this.tail3.addChild(this.tail4);
        this.neck.addChild(this.tatters4);
        this.midBody.addChild(this.frontBody);
        this.frontLeftHeel.addChild(this.frontLeftFoot);
        this.head1.addChild(this.mouth1);
        this.backLeftLeg.addChild(this.backLeftHeel);
        this.backRightHeel.addChild(this.backRightFoot);
        this.tail2.addChild(this.tail3);
        this.lowerbody.addChild(this.tatters3);
        this.lowerbody.addChild(this.backLeftThigh);
        this.head1.addChild(this.ear1);
        this.frontRightHeel.addChild(this.frontRightFoot);
        this.midBody.addChild(this.tatters2);
        this.frontBody.addChild(this.frontLeftLeg);
        this.frontBody.addChild(this.neck);
        this.lowerbody.addChild(this.tail1);
        this.frontBody.addChild(this.frontRightLeg);
        this.lowerbody.addChild(this.midBody);
        this.head1.addChild(this.snoutUpper);
        this.head1.addChild(this.ear2);
        this.snoutUpper.addChild(this.wisker1);
        this.backLeftHeel.addChild(this.backLeftFoot);
        this.backLeftThigh.addChild(this.backLeftLeg);
        this.midBody.addChild(this.tatters1);
        this.neck.addChild(this.head1);
        this.lowerbody.addChild(this.backRightThigh);
        this.backRightLeg.addChild(this.backRightHeel);
        this.snoutUpper.addChild(this.wisker2);
        this.backRightThigh.addChild(this.backRightLeg);
        this.animator = ModelAnimator.create();
        this.teeth.setScale(0.99F, 0.99F, 0.99F);
        this.tail3.setScale(0.99F, 0.99F, 0.99F);
        this.tail4.setScale(0.98F, 0.98F, 0.98F);
        this.updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.resetToDefaultPose();
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.lowerbody.render(f5);
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (EntityFeralRatlantean) entity);
        animator.update(entity);
        animator.setAnimation(EntityFeralRatlantean.ANIMATION_BITE);
        animator.startKeyframe(5);
        rotateFrom(lowerbody, 0, 10, 0);
        rotateFrom(midBody, 0, 10, 0);
        rotateFrom(frontBody, 0, -30, 0);
        rotateFrom(neck, 0, -30, 0);
        rotateFrom(head1, 0, 60, 0);
        rotateFrom(frontRightFoot, 20, 0, 0);
        rotateFrom(frontLeftFoot, 20, 0, 0);
        animator.move(frontRightLeg, 0, 1, 0);
        animator.move(frontLeftLeg, 0, 1, 0);
        animator.move(lowerbody, 0, 0, 2);
        animator.endKeyframe();
        animator.startKeyframe(5);
        animator.move(lowerbody, 0, 0, -4);
        rotateFrom(neck, -5, -5, 0);
        rotateFrom(head1, -30, 5, 0);
        rotateFrom(mouth1, 40, 5, 0);
        animator.endKeyframe();
        animator.startKeyframe(2);
        animator.move(lowerbody, 0, 0, -1);
        rotateFrom(neck, -5, -5, 0);
        rotateFrom(head1, -20, 5, 0);
        rotateFrom(mouth1, -10, 5, 0);
        animator.endKeyframe();
        animator.resetKeyframe(3);
        animator.setAnimation(EntityFeralRatlantean.ANIMATION_SNIFF);
        animator.startKeyframe(5);
        animator.rotate(lowerbody, (float) Math.toRadians(-40), 0, 0);
        animator.rotate(midBody, (float) Math.toRadians(-15), 0, 0);
        animator.rotate(frontBody, (float) Math.toRadians(-5), 0, (float) Math.toRadians(-5));
        animator.rotate(backLeftThigh, (float) Math.toRadians(40), 0, 0);
        animator.rotate(backRightThigh, (float) Math.toRadians(40), 0, 0);
        rotateFrom(frontLeftFoot, 150, 0, 0);
        rotateFrom(frontRightFoot, 150, 0, 0);
        rotateFrom(tail1, 20, 0, 0);
        rotateFrom(head1, 10, 0, 0);
        animator.move(lowerbody, 0, -3, -1);
        animator.endKeyframe();
        animator.startKeyframe(2);
        animator.rotate(lowerbody, (float) Math.toRadians(-40), 0, 0);
        animator.rotate(midBody, (float) Math.toRadians(-15), 0, 0);
        animator.rotate(frontBody, (float) Math.toRadians(-5), 0, (float) Math.toRadians(5));
        animator.rotate(backLeftThigh, (float) Math.toRadians(40), 0, 0);
        animator.rotate(backRightThigh, (float) Math.toRadians(40), 0, 0);
        rotateFrom(frontLeftFoot, 150, 0, 0);
        rotateFrom(frontRightFoot, 150, 0, 0);
        rotateFrom(tail1, 20, 0, 0);
        rotateFrom(head1, -20, 0, 0);
        animator.move(lowerbody, 0, -3, -1);
        animator.endKeyframe();
        animator.startKeyframe(2);
        animator.rotate(lowerbody, (float) Math.toRadians(-40), 0, 0);
        animator.rotate(midBody, (float) Math.toRadians(-15), 0, 0);
        animator.rotate(frontBody, (float) Math.toRadians(-5), 0, (float) Math.toRadians(-5));
        animator.rotate(backLeftThigh, (float) Math.toRadians(40), 0, 0);
        animator.rotate(backRightThigh, (float) Math.toRadians(40), 0, 0);
        rotateFrom(frontLeftFoot, 150, 0, 0);
        rotateFrom(frontRightFoot, 150, 0, 0);
        rotateFrom(tail1, 20, 0, 0);
        rotateFrom(head1, 20, 0, 0);
        animator.move(lowerbody, 0, -3, -1);
        animator.endKeyframe();
        animator.startKeyframe(2);
        animator.rotate(lowerbody, (float) Math.toRadians(-40), 0, 0);
        animator.rotate(midBody, (float) Math.toRadians(-15), 0, 0);
        animator.rotate(frontBody, (float) Math.toRadians(-5), 0, (float) Math.toRadians(5));
        animator.rotate(backLeftThigh, (float) Math.toRadians(40), 0, 0);
        animator.rotate(backRightThigh, (float) Math.toRadians(40), 0, 0);
        rotateFrom(frontLeftFoot, 150, 0, 0);
        rotateFrom(frontRightFoot, 150, 0, 0);
        rotateFrom(tail1, 20, 0, 0);
        rotateFrom(head1, -20, 0, 0);
        animator.move(lowerbody, 0, -3, -1);
        animator.endKeyframe();
        animator.startKeyframe(2);
        animator.rotate(lowerbody, (float) Math.toRadians(-40), 0, 0);
        animator.rotate(midBody, (float) Math.toRadians(-15), 0, 0);
        animator.rotate(frontBody, (float) Math.toRadians(-5), 0, (float) Math.toRadians(-5));
        animator.rotate(backLeftThigh, (float) Math.toRadians(40), 0, 0);
        animator.rotate(backRightThigh, (float) Math.toRadians(40), 0, 0);
        rotateFrom(frontLeftFoot, 150, 0, 0);
        rotateFrom(frontRightFoot, 150, 0, 0);
        rotateFrom(tail1, 20, 0, 0);
        rotateFrom(head1, 20, 0, 0);
        animator.move(lowerbody, 0, -3, -1);
        animator.endKeyframe();
        animator.startKeyframe(2);
        animator.rotate(lowerbody, (float) Math.toRadians(-40), 0, 0);
        animator.rotate(midBody, (float) Math.toRadians(-15), 0, 0);
        animator.rotate(frontBody, (float) Math.toRadians(-5), 0, (float) Math.toRadians(5));
        animator.rotate(backLeftThigh, (float) Math.toRadians(40), 0, 0);
        animator.rotate(backRightThigh, (float) Math.toRadians(40), 0, 0);
        rotateFrom(frontLeftFoot, 150, 0, 0);
        rotateFrom(frontRightFoot, 150, 0, 0);
        rotateFrom(tail1, 20, 0, 0);
        rotateFrom(head1, -20, 0, 0);
        animator.move(lowerbody, 0, -3, -1);
        animator.endKeyframe();
        animator.resetKeyframe(5);
        animator.setAnimation(EntityFeralRatlantean.ANIMATION_SLASH);
        animator.startKeyframe(5);
        animator.rotate(lowerbody, (float) Math.toRadians(-40), 0, 0);
        animator.rotate(midBody, (float) Math.toRadians(-15), 0, 0);
        animator.rotate(frontBody, (float) Math.toRadians(-5), 0, (float) Math.toRadians(-25));
        animator.rotate(backLeftThigh, (float) Math.toRadians(40), 0, 0);
        animator.rotate(backRightThigh, (float) Math.toRadians(40), 0, 0);
        rotateFrom(frontLeftLeg, -5, 0, -75);
        rotateFrom(frontLeftHeel, -30, 0, 0);
        rotateFrom(frontRightLeg, 50, 0, 15);
        animator.rotate(frontLeftFoot, (float) Math.toRadians(-10), (float) Math.toRadians(-45), (float) Math.toRadians(45));
        rotateFrom(frontRightFoot, 150, 0, 0);
        rotateFrom(tail1, 20, 0, 0);
        rotateFrom(head1, 60, 0, 10);
        rotateFrom(mouth1, 30, 0, 0);
        animator.move(lowerbody, 0, -3, -1);
        animator.endKeyframe();
        animator.startKeyframe(3);
        animator.rotate(lowerbody, (float) Math.toRadians(-40), 0, 0);
        animator.rotate(midBody, (float) Math.toRadians(-15), 0, 0);
        animator.rotate(frontBody, (float) Math.toRadians(-5), 0, (float) Math.toRadians(25));
        animator.rotate(backLeftThigh, (float) Math.toRadians(40), 0, 0);
        animator.rotate(backRightThigh, (float) Math.toRadians(40), 0, 0);
        rotateFrom(frontLeftLeg, -5, 0, 45);
        rotateFrom(frontLeftHeel, -30, 0, 0);
        rotateFrom(frontRightLeg, 50, 0, 15);
        animator.rotate(frontLeftFoot, (float) Math.toRadians(-10), (float) Math.toRadians(-45), (float) Math.toRadians(45));
        rotateFrom(frontRightFoot, 150, 0, 0);
        rotateFrom(tail1, 20, 0, 0);
        rotateFrom(head1, 60, 0, -10);
        rotateFrom(mouth1, 30, 0, 0);
        animator.move(lowerbody, 0, -3, -1);
        animator.endKeyframe();
        animator.startKeyframe(5);
        animator.rotate(lowerbody, (float) Math.toRadians(-40), 0, 0);
        animator.rotate(midBody, (float) Math.toRadians(-15), 0, 0);
        animator.rotate(frontBody, (float) Math.toRadians(-5), 0, (float) Math.toRadians(25));
        animator.rotate(backLeftThigh, (float) Math.toRadians(40), 0, 0);
        animator.rotate(backRightThigh, (float) Math.toRadians(40), 0, 0);
        rotateFrom(frontRightLeg, -5, 0, 75);
        rotateFrom(frontRightHeel, -30, 0, 0);
        rotateFrom(frontLeftLeg, 50, 0, -15);
        animator.rotate(frontRightFoot, (float) Math.toRadians(-10), (float) Math.toRadians(45), (float) Math.toRadians(-45));
        rotateFrom(frontLeftFoot, 150, 0, 0);
        rotateFrom(tail1, 20, 0, 0);
        rotateFrom(head1, 30, 0, -10);
        rotateFrom(mouth1, 60, 0, 0);
        animator.move(lowerbody, 0, -3, -1);
        animator.endKeyframe();
        animator.startKeyframe(3);
        animator.rotate(lowerbody, (float) Math.toRadians(-40), 0, 0);
        animator.rotate(midBody, (float) Math.toRadians(-15), 0, 0);
        animator.rotate(frontBody, (float) Math.toRadians(-5), 0, (float) Math.toRadians(-25));
        animator.rotate(backLeftThigh, (float) Math.toRadians(40), 0, 0);
        animator.rotate(backRightThigh, (float) Math.toRadians(40), 0, 0);
        rotateFrom(frontRightLeg, -5, 0, -45);
        rotateFrom(frontRightHeel, -30, 0, 0);
        rotateFrom(frontLeftLeg, 50, 0, -15);
        animator.rotate(frontRightFoot, (float) Math.toRadians(-10), (float) Math.toRadians(45), (float) Math.toRadians(-45));
        rotateFrom(frontLeftFoot, 150, 0, 0);
        rotateFrom(tail1, 20, 0, 0);
        rotateFrom(head1, 60, 0, 10);
        rotateFrom(mouth1, 30, 0, 0);
        animator.move(lowerbody, 0, -3, -1);
        animator.endKeyframe();
        animator.resetKeyframe(9);

    }

    private void rotateFrom(AdvancedRendererModel renderer, float degX, float degY, float degZ) {
        animator.rotate(renderer, (float) Math.toRadians(degX) - renderer.defaultRotationX, (float) Math.toRadians(degY) - renderer.defaultRotationY, (float) Math.toRadians(degZ) - renderer.defaultRotationZ);
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, EntityFeralRatlantean rat) {
        float idleSpeed = 0.3F;
        float idleDegree = 0.1F;
        float walkSpeed = 0.4F;
        float walkDegree = 0.3F;
        AdvancedRendererModel[] tailParts = new AdvancedRendererModel[]{tail1, tail2, tail3, tail4};
        this.bob(lowerbody, idleSpeed, idleDegree * 1.5F, false, f2, 1);
        this.bob(backLeftThigh, idleSpeed, -idleDegree * 1.5F, false, f2, 1);
        this.bob(backRightThigh, idleSpeed, -idleDegree * 1.5F, false, f2, 1);
        this.bob(frontLeftLeg, idleSpeed, -idleDegree * 1.5F, false, f2, 1);
        this.bob(frontRightLeg, idleSpeed, -idleDegree * 1.5F, false, f2, 1);
        this.walk(backLeftThigh, idleSpeed, -idleDegree * 0.25F, false, 3.0F, 0, f2, 1);
        this.walk(backLeftLeg, idleSpeed, idleDegree * 0.15F, false, 3.0F, 0, f2, 1);
        this.walk(backLeftHeel, idleSpeed, idleDegree * 0.1F, false, 3.0F, 0, f2, 1);
        this.walk(backRightThigh, idleSpeed, -idleDegree * 0.25F, false, 3.0F, 0, f2, 1);
        this.walk(backRightLeg, idleSpeed, idleDegree * 0.15F, false, 3.0F, 0, f2, 1);
        this.walk(backRightHeel, idleSpeed, idleDegree * 0.1F, false, 3.0F, 0, f2, 1);
        this.walk(frontLeftLeg, idleSpeed, idleDegree * 0.15F, false, 3.0F, 0, f2, 1);
        this.walk(frontLeftHeel, idleSpeed, -idleDegree * 0.15F, false, 3.0F, 0, f2, 1);
        this.walk(frontRightLeg, idleSpeed, idleDegree * 0.15F, false, 3.0F, 0, f2, 1);
        this.walk(frontRightHeel, idleSpeed, -idleDegree * 0.15F, false, 3.0F, 0, f2, 1);
        this.walk(frontRightFoot, idleSpeed, idleDegree * 0.25F, false, 2.0F, 0, f2, 1);
        this.walk(frontLeftFoot, idleSpeed, idleDegree * 0.25F, false, 2.0F, 0, f2, 1);
        this.walk(frontBody, idleSpeed, -idleDegree * 0.25F, false, 2.0F, 0, f2, 1);
        this.walk(neck, idleSpeed, idleDegree * 0.15F, false, 2.0F, 0, f2, 1);
        this.chainSwing(tailParts, idleSpeed, idleDegree * 0.5F, 1, f2, 1);
        this.swing(backLeftThigh, idleSpeed, -idleDegree * 0.95F, true, 1.0F, -0.1F, f2, 1);
        this.swing(backRightThigh, idleSpeed, -idleDegree * 0.95F, false, 1.0F, 0.1F, f2, 1);
        this.swing(frontLeftLeg, idleSpeed, -idleDegree * 0.95F, true, 1.0F, -0.1F, f2, 1);
        this.swing(frontRightLeg, idleSpeed, -idleDegree * 0.95F, false, 1.0F, 0.1F, f2, 1);

        this.swing(backLeftFoot, idleSpeed, idleDegree * 0.95F, true, 1.0F, -0.1F, f2, 1);
        this.swing(backRightFoot, idleSpeed, idleDegree * 0.95F, false, 1.0F, 0.1F, f2, 1);
        this.swing(frontLeftFoot, idleSpeed, idleDegree * 0.95F, true, 1.0F, -0.1F, f2, 1);
        this.swing(frontRightFoot, idleSpeed, idleDegree * 0.95F, false, 1.0F, 0.1F, f2, 1);

        float ulatingScale = 0.9F + (float) Math.sin(f2 * 0.75F) * 0.1F;
        this.swing(this.wisker2, idleSpeed, idleDegree, false, 0, 0, f2, 1);
        this.swing(this.wisker1, idleSpeed, idleDegree, true, 0, 0, f2, 1);
        this.flap(this.wisker2, idleSpeed, idleDegree, false, 1, 0, f2, 1);
        this.flap(this.wisker1, idleSpeed, idleDegree, false, 1, 0, f2, 1);
        this.walk(this.wisker2, idleSpeed, idleDegree, false, 2, 0, f2, 1);
        this.walk(this.wisker1, idleSpeed, idleDegree, false, 2, 0, f2, 1);
        this.nose.setScale(ulatingScale, ulatingScale, ulatingScale);
        this.walk(this.mouth1, idleSpeed * 0.75F, idleDegree, true, 4, -0.1F, f2, 1);
        this.flap(this.tatters1, idleSpeed * 0.25F, idleDegree, true, 3, -0.1F, f2, 1);
        this.flap(this.tatters2, idleSpeed * 0.25F, idleDegree, true, 3, -0.1F, f2, 1);
        this.flap(this.tatters3, idleSpeed * 0.5F, idleDegree, true, 3, 0.1F, f2, 1);
        this.flap(this.tatters4, idleSpeed * 0.5F, idleDegree, true, 3, 0.1F, f2, 1);
        this.bob(this.lowerbody, walkSpeed, walkDegree * 5F, false, f, f1);
        this.walk(this.midBody, walkSpeed, walkDegree, false, 0, 0, f, f1);
        this.walk(this.frontBody, walkSpeed, walkDegree * 0.5F, false, 1, -0.1F, f, f1);
        this.walk(this.neck, walkSpeed, walkDegree * 0.5F, false, 2, 0, f, f1);
        this.walk(this.tail1, walkSpeed, walkDegree * 1F, false, -1, 0.3F, f, f1);
        this.walk(this.tail2, walkSpeed, walkDegree * 0.5F, false, -2, 0.1F, f, f1);
        this.walk(this.tail3, walkSpeed, walkDegree * 0.5F, false, -3, 0.0F, f, f1);
        this.walk(this.tail4, walkSpeed, walkDegree * 0.5F, false, -4, 0.1F, f, f1);
        this.walk(this.backLeftThigh, walkSpeed, walkDegree * 2F, true, 0, 0, f, f1);
        this.walk(this.backRightThigh, walkSpeed, walkDegree * 2F, true, 0, 0, f, f1);
        this.walk(this.backLeftLeg, walkSpeed, walkDegree * 2F, true, 0, 0, f, f1);
        this.walk(this.backRightLeg, walkSpeed, walkDegree * 2F, true, 0, 0, f, f1);
        this.walk(this.backLeftHeel, walkSpeed, walkDegree * 1F, true, 1, 0, f, f1);
        this.walk(this.backRightHeel, walkSpeed, walkDegree * 1F, true, 1, 0, f, f1);
        this.walk(this.backLeftFoot, walkSpeed, walkDegree * 6F, false, 0.7F, 0.4F, f, f1);
        this.walk(this.backRightFoot, walkSpeed, walkDegree * 6F, false, 0.7F, 0.4F, f, f1);
        this.walk(this.frontLeftLeg, walkSpeed, walkDegree * 2F, true, 2, 0.1F, f, f1);
        this.walk(this.frontRightLeg, walkSpeed, walkDegree * 2F, true, 2, 0.1F, f, f1);
        this.walk(this.frontLeftHeel, walkSpeed, walkDegree * 2F, true, 2, -0.2F, f, f1);
        this.walk(this.frontRightHeel, walkSpeed, walkDegree * 2F, true, 2, -0.2F, f, f1);
        this.walk(this.frontLeftFoot, walkSpeed, walkDegree * 4F, false, 2.6F, 0.01F, f, f1);
        this.walk(this.frontRightFoot, walkSpeed, walkDegree * 4F, false, 2.6F, 0.01F, f, f1);
        this.swing(frontLeftLeg, walkSpeed, -walkDegree * 1F, false, 1.5F, -0.25F, f, f1);
        this.swing(frontRightLeg, walkSpeed, -walkDegree * 1F, true, 1.5F, -0.25F, f, f1);
        this.swing(backLeftThigh, walkSpeed, -walkDegree * 1.25F, false, 0F, -0.25F, f, f1);
        this.swing(backRightThigh, walkSpeed, -walkDegree * 1.25F, true, 0F, -0.25F, f, f1);
        this.faceTarget(f3, f4, 2, neck, head1);
    }

    public void setRotateAngle(AdvancedRendererModel advancedRendererModel, float x, float y, float z) {
        advancedRendererModel.rotateAngleX = x;
        advancedRendererModel.rotateAngleY = y;
        advancedRendererModel.rotateAngleZ = z;
    }
}
