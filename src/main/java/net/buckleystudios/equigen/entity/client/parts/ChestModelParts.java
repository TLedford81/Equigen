package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class ChestModelParts {
    public static PartDefinition Generate(PartDefinition root, String muscleMass) {
        if (muscleMass.equals("average")) {
            PartDefinition chest2 = root.addOrReplaceChild("chest2", CubeListBuilder.create().texOffs(0, 20).addBox(-7.0F, -6.648F, -1.8939F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.0F))
                    .texOffs(38, 0).addBox(-8.0894F, -5.8436F, -0.7318F, 10.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0447F, 19.7095F, -0.1115F));

            PartDefinition cube_r1 = chest2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(82, 78).addBox(-5.08F, -4.0F, -0.92F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -2.8789F, -4.2512F, -0.829F, 0.0F, 0.0F));

            PartDefinition cube_r2 = chest2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(89, 40).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -4.1725F, 3.6348F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r3 = chest2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(80, 57).addBox(-5.0708F, -7.7168F, -4.5652F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9645F, -4.4046F, 4.3226F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = chest2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(90, 91).addBox(-4.0792F, -7.6432F, -3.4848F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0091F, -1.7741F, 3.2763F, 1.9199F, 0.0F, 0.0F));

            PartDefinition cube_r5 = chest2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(84, 12).addBox(-5.08F, -7.68F, -4.52F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -2.2525F, 3.8636F, 1.9199F, 0.0F, 0.0F));

            return root;
        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Chest / " + muscleMass + ", Returning Null Value");
            return null;
        }
    }
}
