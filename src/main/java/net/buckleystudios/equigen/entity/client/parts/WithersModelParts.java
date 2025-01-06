package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class WithersModelParts{
    public static PartDefinition Generate(PartDefinition root, String muscleMass, String length) {
        if (muscleMass.equals("average") && length.equals("average")) {
            PartDefinition withers_medium = root.addOrReplaceChild("withers_medium", CubeListBuilder.create(), PartPose.offset(0.0F, 23.1508F, 3.8436F));

            PartDefinition cube_r1 = withers_medium.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 37).addBox(-4.0792F, -6.9812F, -5.4648F, 4.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0091F, -27.3661F, -4.1867F, 1.2654F, 0.0F, 0.0F));

            PartDefinition cube_r2 = withers_medium.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(26, 31).addBox(-5.08F, -6.88F, -5.52F, 6.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -26.737F, -4.194F, 1.2654F, 0.0F, 0.0F));

            return root;
        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Withers / " + muscleMass + " / " + length + ", Returning Null Value");
            return null;
        }
    }
}
