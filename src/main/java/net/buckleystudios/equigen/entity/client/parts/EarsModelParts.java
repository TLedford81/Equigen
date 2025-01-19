package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class EarsModelParts {
    public static PartDefinition Generate(PartDefinition root) {
        if (true) {
            PartDefinition right_ear = root.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = right_ear.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(530, 25).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5182F, -0.3039F, -0.7556F, 0.5236F, 0.0F, 0.0F));

            PartDefinition cube_r2 = right_ear.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(534, 25).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0182F, 0.6793F, -0.2193F, 0.5236F, 0.0F, 0.0F));

            PartDefinition left_ear = root.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = left_ear.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(540, 25).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5182F, -0.3039F, -0.7556F, 0.5236F, 0.0F, 0.0F));

            PartDefinition cube_r4 = left_ear.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(534, 21).addBox(-1.0F, -2.0384F, -0.6584F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0182F, -0.4827F, -0.1299F, 0.5236F, 0.0F, 0.0F));

        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Ears, Cancelling Generation...");
        }
        return root;
    }

    public static PartDefinition GenerateAll(PartDefinition root) {

        root = Generate(root);

        return root;
    }
}
