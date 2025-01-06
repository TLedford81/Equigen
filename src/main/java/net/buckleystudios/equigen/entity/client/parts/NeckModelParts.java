package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class NeckModelParts {
    public static PartDefinition Generate(PartDefinition root, String muscleMass, String curve, String length, int variation) {
        if (muscleMass.equals("average") && curve.equals("ewed") && length.equals("short") && variation == 1) {
            PartDefinition neck_ewed_short2 = root.addOrReplaceChild("neck_ewed_short2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = neck_ewed_short2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(74, 91).addBox(-3.08F, -4.0F, -2.92F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8903F, -7.0436F, -2.3097F, 0.9599F, 0.0F, 0.0F));

            PartDefinition cube_r2 = neck_ewed_short2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(58, 88).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1035F, 1.7231F, -3.5465F, 0.2618F, 0.0F, 0.0F));

            PartDefinition cube_r3 = neck_ewed_short2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9629F, -1.7806F, 1.4731F, 0.6109F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_ewed_short2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(20, 86).addBox(-4.0F, -8.0F, -1.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4302F, 0.1251F, -1.162F, 0.6109F, 0.0F, 0.0F));

            PartDefinition top_mane = neck_ewed_short2.addOrReplaceChild("top_mane", CubeListBuilder.create(), PartPose.offset(0.4469F, -2.0559F, -1.8771F));

            PartDefinition top_mane_connector = top_mane.addOrReplaceChild("top_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r5 = top_mane_connector.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(109, 6).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3575F, -6.9721F, -2.0559F, -0.6109F, 0.0F, 0.0F));

            PartDefinition top_mane_connector2 = top_mane_connector.addOrReplaceChild("top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r6 = top_mane_connector2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(108, 19).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2346F, -6.9721F, -2.0559F, -0.6109F, 0.0F, 0.0F));

            PartDefinition top_mane_flow2 = top_mane_connector2.addOrReplaceChild("top_mane_flow2", CubeListBuilder.create(), PartPose.offset(2.4134F, -7.7765F, 0.0F));

            PartDefinition cube_r7 = top_mane_flow2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(55, 105).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.162F, -1.8771F, -0.4692F, -0.1069F, -0.417F));

            PartDefinition bottom_mane = top_mane.addOrReplaceChild("bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0615F, 1.7877F));

            PartDefinition bottom_mane_connector = bottom_mane.addOrReplaceChild("bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0615F, -1.7877F));

            PartDefinition cube_r8 = bottom_mane_connector.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(95, 103).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3575F, -6.7039F, -0.8939F, -0.9163F, 0.0F, 0.0F));

            PartDefinition bottom_mane_connector2 = bottom_mane_connector.addOrReplaceChild("bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r9 = bottom_mane_connector2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(95, 115).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.324F, -6.7039F, -0.8939F, -0.9163F, 0.0F, 0.0F));

            PartDefinition bottom_mane_flow2 = bottom_mane_connector2.addOrReplaceChild("bottom_mane_flow2", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0615F, 1.7877F));

            PartDefinition cube_r10 = bottom_mane_flow2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(69, 104).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8603F, 1.7877F, 1.162F, -0.8901F, -0.0927F, -0.1377F));

            return root;
        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Neck / " + muscleMass + " / " + curve +  " / "  + length + " / Variation " + variation + ", Returning Null Value");
            return null;
        }
    }
}
