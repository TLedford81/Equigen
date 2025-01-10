package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class HoofModelParts {
    public static PartDefinition[] Generate(PartDefinition foreLeftRoot, PartDefinition foreRightRoot, PartDefinition hindLeftRoot, PartDefinition hindRightRoot, String size) {
        if (size.equals("average")) {
            PartDefinition hoof_front_left = foreLeftRoot.addOrReplaceChild("hoof_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0168F, 0.0F));

            PartDefinition hoof_front_left_average = hoof_front_left.addOrReplaceChild("hoof_front_left_average", CubeListBuilder.create().texOffs(82, 63).addBox(-1.0F, 0.0168F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hoof_front_right = foreRightRoot.addOrReplaceChild("hoof_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0168F, 0.0F));

            PartDefinition hoof_front_right_average = hoof_front_right.addOrReplaceChild("hoof_front_right_average", CubeListBuilder.create().texOffs(82, 63).addBox(-1.0F, 0.0168F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hoof_back_left = hindLeftRoot.addOrReplaceChild("hoof_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0168F, 0.0F));

            PartDefinition hoof_back_left_average = hoof_back_left.addOrReplaceChild("hoof_back_left_average", CubeListBuilder.create().texOffs(82, 63).addBox(-1.0F, 0.0168F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hoof_back_right = hindRightRoot.addOrReplaceChild("hoof_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0168F, 0.0F));

            PartDefinition hoof_back_right_average = hoof_back_right.addOrReplaceChild("hoof_back_right_average", CubeListBuilder.create().texOffs(82, 63).addBox(-1.0F, 0.0168F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        } else if (size.equals("large")) {
            PartDefinition hoof_front_left = foreLeftRoot.addOrReplaceChild("hoof_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0335F, 0.0F));

            PartDefinition hoof_front_left_large = hoof_front_left.addOrReplaceChild("hoof_front_left_large", CubeListBuilder.create().texOffs(26, 75).addBox(-1.0F, -0.0168F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0168F, 0.0F));

            PartDefinition hoof_front_right = foreRightRoot.addOrReplaceChild("hoof_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0335F, 0.0F));

            PartDefinition hoof_front_right_large = hoof_front_right.addOrReplaceChild("hoof_front_right_large", CubeListBuilder.create().texOffs(26, 75).addBox(-1.0F, -0.0168F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0168F, 0.0F));

            PartDefinition hoof_back_left = hindLeftRoot.addOrReplaceChild("hoof_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0335F, 0.0F));

            PartDefinition hoof_back_left_large = hoof_back_left.addOrReplaceChild("hoof_back_left_large", CubeListBuilder.create().texOffs(26, 75).addBox(-1.0F, -0.0168F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0168F, 0.0F));

            PartDefinition hoof_back_right = hindRightRoot.addOrReplaceChild("hoof_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0335F, 0.0F));

            PartDefinition hoof_back_right_large = hoof_back_right.addOrReplaceChild("hoof_back_right_large", CubeListBuilder.create().texOffs(26, 75).addBox(-1.0F, -0.0168F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0168F, 0.0F));

        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Hoof / " + size + ", Returning Null Value");
            return null;
        }
        return new PartDefinition[]{foreLeftRoot, foreRightRoot, hindLeftRoot, hindRightRoot};
    }
}
