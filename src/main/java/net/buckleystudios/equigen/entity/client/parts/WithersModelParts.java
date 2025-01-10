package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class WithersModelParts{
    public static PartDefinition Generate(PartDefinition root, String muscleMass) {
        if (muscleMass.equals("lean")) {
            PartDefinition withers_lean = root.addOrReplaceChild("withers_lean", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition cube_r1 = withers_lean.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(70, 418).addBox(-4.0792F, -6.9812F, -5.4648F, 4.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.03F, -3.5896F, -1.0729F, 1.2654F, 0.0F, 0.0F));

            PartDefinition cube_r2 = withers_lean.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(90, 418).addBox(-4.08F, -6.88F, -5.52F, 5.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.516F, -2.9604F, -1.0801F, 1.2654F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average")) {
            PartDefinition withers_average = root.addOrReplaceChild("withers_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition cube_r1 = withers_average.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(115, 418).addBox(-4.0792F, -6.9812F, -5.4648F, 4.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.03F, -3.5896F, -1.0729F, 1.2654F, 0.0F, 0.0F));

            PartDefinition cube_r2 = withers_average.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(135, 418).addBox(-5.08F, -6.88F, -5.52F, 6.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0523F, -2.9604F, -1.0801F, 1.2654F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular")) {
            PartDefinition withers_muscular = root.addOrReplaceChild("withers_muscular", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition cube_r1 = withers_muscular.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(162, 418).addBox(-5.0792F, -6.9812F, -5.4648F, 5.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5663F, -3.5896F, -1.0729F, 1.2654F, 0.0F, 0.0F));

            PartDefinition cube_r2 = withers_muscular.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(184, 418).addBox(-6.08F, -6.88F, -5.52F, 7.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.678F, -2.9604F, -1.0801F, 1.2654F, 0.0F, 0.0F));

        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Withers / " + muscleMass + ", Returning Null Value");
            return null;
        }
        return root;
    }
}
