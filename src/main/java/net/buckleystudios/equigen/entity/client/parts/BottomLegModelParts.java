package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class BottomLegModelParts{
    public static PartDefinition[] Generate(
            PartDefinition frontLeftLegRootUpper, PartDefinition backLeftLegRootUpper,
            PartDefinition frontRightLegRootUpper, PartDefinition backRightLegRootUpper,
            PartDefinition frontLeftLegRootLower, PartDefinition backLeftLegRootLower,
            PartDefinition frontRightLegRootLower, PartDefinition backRightLegRootLower,
            String thickness, String length, int variation) {

        //Models are split between upper/lower because communication sucks and I requested the wrong file setup
        //Maybe fix in later update?

            if (thickness.equals("thin") && length.equals("short") && variation == 1) {
                //UPPER
                PartDefinition bottom_front_left_thin_short1 = frontLeftLegRootUpper.addOrReplaceChild("bottom_front_left_thin_short1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

                PartDefinition cube_r1 = bottom_front_left_thin_short1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(6, 3).addBox(-0.5427F, -0.4691F, -1.7977F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0239F, 0.0134F, -0.095F, 1.5708F, 0.0F, 0.0F));

                PartDefinition bottom_front_right_thin_short1 = frontRightLegRootUpper.addOrReplaceChild("bottom_front_right_thin_short1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

                PartDefinition cube_r2 = bottom_front_right_thin_short1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(6, 6).addBox(-0.5427F, -0.4691F, -1.7977F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0239F, 0.0134F, -0.095F, 1.5708F, 0.0F, 0.0F));

                PartDefinition bottom_back_left_thin_short1 = backLeftLegRootUpper.addOrReplaceChild("bottom_back_left_thin_short1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

                PartDefinition cube_r3 = bottom_back_left_thin_short1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5427F, -0.4691F, -1.7977F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0239F, 0.0134F, -0.095F, 1.5708F, 0.0F, 0.0F));

                PartDefinition bottom_back_right_thin_short1 = backRightLegRootUpper.addOrReplaceChild("bottom_back_right_thin_short1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

                PartDefinition cube_r4 = bottom_back_right_thin_short1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(6, 9).addBox(-0.5427F, -0.4691F, -1.7977F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0239F, 0.0134F, -0.095F, 1.5708F, 0.0F, 0.0F));

                //LOWER
                PartDefinition bottom_2_front_left_thin_short1 = frontLeftLegRootLower.addOrReplaceChild("bottom_2_front_left_thin_short1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

                PartDefinition cube_r5 = bottom_2_front_left_thin_short1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5363F, -0.4237F, -1.9046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0552F, -0.1251F, -0.0536F, 1.0036F, 0.0F, 0.0F));

                PartDefinition bottom_2_front_right_thin_short1 = frontRightLegRootLower.addOrReplaceChild("bottom_2_front_right_thin_short1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

                PartDefinition cube_r6 = bottom_2_front_right_thin_short1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 3).addBox(-0.5363F, -0.4237F, -1.9046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0552F, -0.1251F, -0.0536F, 1.0036F, 0.0F, 0.0F));

                PartDefinition bottom_2_back_left_thin_short1 = backLeftLegRootLower.addOrReplaceChild("bottom_2_back_left_thin_short1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

                PartDefinition cube_r7 = bottom_2_back_left_thin_short1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 6).addBox(-0.5363F, -0.4237F, -1.9046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0552F, -0.1251F, -0.0536F, 1.0036F, 0.0F, 0.0F));

                PartDefinition bottom_2_back_right_thin_short1 = backRightLegRootLower.addOrReplaceChild("bottom_2_back_right_thin_short1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

                PartDefinition cube_r8 = bottom_2_back_right_thin_short1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(6, 0).addBox(-0.5363F, -0.4237F, -1.9046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0552F, -0.1251F, -0.0536F, 1.0036F, 0.0F, 0.0F));

            } else if (thickness.equals("thin") && length.equals("short") && variation == 2) {
                //Insert Model Here
            } else if (thickness.equals("thin") && length.equals("short") && variation == 3) {
                //Insert Model Here
            } else if (thickness.equals("thin") && length.equals("average") && variation == 1) {
                //Insert Model Here
            } else if (thickness.equals("thin") && length.equals("average") && variation == 2) {
                //Insert Model Here
            } else if (thickness.equals("thin") && length.equals("average") && variation == 3) {
                //Insert Model Here
            } else if (thickness.equals("thin") && length.equals("long") && variation == 1) {
                //Insert Model Here
            } else if (thickness.equals("thin") && length.equals("long") && variation == 2) {
                //Insert Model Here
            } else if (thickness.equals("thin") && length.equals("long") && variation == 3) {
                //Insert Model Here
            } else if (thickness.equals("average") && length.equals("short") && variation == 1) {
                //Insert Model Here
            } else if (thickness.equals("average") && length.equals("short") && variation == 2) {
                //Insert Model Here
            } else if (thickness.equals("average") && length.equals("short") && variation == 3) {
                //Insert Model Here
            } else if (thickness.equals("average") && length.equals("average") && variation == 1) {
                //Insert Model Here
            } else if (thickness.equals("average") && length.equals("average") && variation == 2) {
                //Insert Model Here
            } else if (thickness.equals("average") && length.equals("average") && variation == 3) {
                //Insert Model Here
            } else if (thickness.equals("average") && length.equals("long") && variation == 1) {
                //Insert Model Here
            } else if (thickness.equals("average") && length.equals("long") && variation == 2) {
                //Insert Model Here
            } else if (thickness.equals("average") && length.equals("long") && variation == 3) {
                //Insert Model Here
            } else if (thickness.equals("thick") && length.equals("short") && variation == 1) {
                //Insert Model Here
            } else if (thickness.equals("thick") && length.equals("short") && variation == 2) {
                //Insert Model Here
            } else if (thickness.equals("thick") && length.equals("short") && variation == 3) {
                //Insert Model Here
            } else if (thickness.equals("thick") && length.equals("average") && variation == 1) {
                //Insert Model Here
            } else if (thickness.equals("thick") && length.equals("average") && variation == 2) {
                //Insert Model Here
            } else if (thickness.equals("thick") && length.equals("average") && variation == 3) {
                //Insert Model Here
            } else if (thickness.equals("thick") && length.equals("long") && variation == 1) {
                //Insert Model Here
            } else if (thickness.equals("thick") && length.equals("long") && variation == 2) {
                //Insert Model Here
            } else if (thickness.equals("thick") && length.equals("long") && variation == 3) {
                //Insert Model Here
            } else {
                EquigenMod.LOGGER.error("Invalid Part Generated: Upper Bottom Leg / " + length + " / " + thickness + ", Returning Null Value");
                return null;
            }
        //    public static PartDefinition[] Generate(
        //            PartDefinition frontLeftLegRootUpper, PartDefinition backLeftLegRootUpper,
        //            PartDefinition frontRightLegRootUpper, PartDefinition backRightLegRootUpper,
        //            PartDefinition frontLeftLegRootLower, PartDefinition backLeftLegRootLower,
        //            PartDefinition frontRightLegRootLower, PartDefinition backRightLegRootLower,

        return new PartDefinition[]{
                frontLeftLegRootUpper, backLeftLegRootUpper, frontRightLegRootUpper, backRightLegRootUpper,
                frontLeftLegRootLower, backLeftLegRootLower, frontRightLegRootLower, backRightLegRootLower};
    }
}