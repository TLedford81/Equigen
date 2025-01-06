package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class HeadModelParts {
    public static PartDefinition Generate(PartDefinition root, String size) {
        if (size.equals("straight")) {
            PartDefinition straight_head = root.addOrReplaceChild("straight_head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0873F, 0.0F));

            PartDefinition cube_r1 = straight_head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 73).addBox(-3.08F, -4.0F, -1.92F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2646F, -3.0606F, -0.4004F, 2.2253F, 0.0F, 0.0F));

            PartDefinition cube_r2 = straight_head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 98).addBox(-3.0708F, -3.2124F, -1.8584F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7256F, 1.0938F, -1.8607F, 1.8326F, 0.0F, 0.0F));

            PartDefinition cube_r3 = straight_head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(70, 45).addBox(-3.08F, -3.24F, -1.84F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7115F, -0.6758F, -2.8675F, 2.2253F, 0.0F, 0.0F));

            PartDefinition cube_r4 = straight_head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(50, 41).addBox(-3.9595F, -1.919F, -2.081F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0709F, 1.7817F, -1.4229F, 0.3491F, 0.0F, 0.0F));

            PartDefinition fringe = straight_head.addOrReplaceChild("fringe", CubeListBuilder.create(), PartPose.offset(0.2682F, 4.9698F, 3.486F));

            PartDefinition cube_r5 = fringe.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(105, 76).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0894F, -8.2235F, -6.4358F, -1.5333F, 0.6643F, -1.5315F));

            PartDefinition muzzle = straight_head.addOrReplaceChild("muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 1.9665F, -4.5587F));

            PartDefinition cube_r6 = muzzle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(26, 0).addBox(-1.4469F, -1.7862F, -3.7184F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, -0.8045F, 0.1788F, 0.7418F, 0.0F, 0.0F));

            PartDefinition mouth = muzzle.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2682F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r7 = mouth.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(26, 6).addBox(-1.9832F, -0.6095F, -3.149F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1788F, 0.7151F, 0.5363F, 0.7854F, 0.0F, 0.0F));

            return root;
        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Head / " + size + ", Returning Null Value");
            return null;
        }
    }
}
