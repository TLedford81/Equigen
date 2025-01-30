package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

import java.util.ArrayList;
import java.util.List;

public class HoofModelParts {
    private static List<String> allParts = new ArrayList<>();
    public static List<String> getAllParts(){
        return allParts;
    }
    public static PartDefinition[] Generate(PartDefinition rootForeLegLeft, PartDefinition rootForeLegRight, PartDefinition rootHindLegLeft, PartDefinition rootHindLegRight, String size) {
        if (size.equals("average")) {
            PartDefinition hoof_average_front_left = rootForeLegLeft.addOrReplaceChild("hoof_average_front_left", CubeListBuilder.create().texOffs(73, 132).addBox(-1.0F, 0.0168F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0168F, 0.0F));

            PartDefinition hoof_average_front_right = rootForeLegRight.addOrReplaceChild("hoof_average_front_right", CubeListBuilder.create().texOffs(81, 132).addBox(-1.0F, 0.0168F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0168F, 0.0F));

            PartDefinition hoof_average_back_left = rootHindLegLeft.addOrReplaceChild("hoof_average_back_left", CubeListBuilder.create().texOffs(73, 136).addBox(-1.0F, 0.0168F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0168F, 0.0F));

            PartDefinition hoof_average_back_right = rootHindLegRight.addOrReplaceChild("hoof_average_back_right", CubeListBuilder.create().texOffs(81, 136).addBox(-1.0F, 0.0168F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0168F, 0.0F));

        } else if (size.equals("large")) {
            PartDefinition hoof_large_front_left = rootForeLegLeft.addOrReplaceChild("hoof_large_front_left", CubeListBuilder.create().texOffs(81, 146).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0335F, 0.0F));

            PartDefinition hoof_large_front_right = rootForeLegRight.addOrReplaceChild("hoof_large_front_right", CubeListBuilder.create().texOffs(71, 151).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0335F, 0.0F));

            PartDefinition hoof_large_back_left = rootHindLegLeft.addOrReplaceChild("hoof_large_back_left", CubeListBuilder.create().texOffs(81, 151).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0335F, 0.0F));

            PartDefinition hoof_large_back_right = rootHindLegRight.addOrReplaceChild("hoof_large_back_right", CubeListBuilder.create().texOffs(71, 146).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0335F, 0.0F));

        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Hoof / " + size + ", Cancelling Generation...");
        }
        allParts.add("hoof_" + size + "_front_left");
        allParts.add("hoof_" + size + "_front_right");
        allParts.add("hoof_" + size + "_back_left");
        allParts.add("hoof_" + size + "_back_right");

        return new PartDefinition[]{rootForeLegLeft, rootForeLegRight, rootHindLegLeft, rootHindLegRight};
    }

    public static PartDefinition[] GenerateAll(PartDefinition rootForeLegLeft, PartDefinition rootForeLegRight, PartDefinition rootHindLegLeft, PartDefinition rootHindLegRight) {
        List<String> size = List.of("average", "large");
        PartDefinition[] roots;
        for (String variable1 : size) {
            roots = Generate(rootForeLegLeft, rootForeLegRight, rootHindLegLeft, rootHindLegRight, variable1);
        }
        return new PartDefinition[]{rootForeLegLeft, rootForeLegRight, rootHindLegLeft, rootHindLegRight};
    }
}
