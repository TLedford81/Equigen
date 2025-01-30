package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

import java.util.ArrayList;
import java.util.List;

public class KneeModelParts {
    private static List<String> allParts = new ArrayList<>();
    public static List<String> getAllParts(){
        return allParts;
    }
    public static PartDefinition[] Generate(PartDefinition rootForeLegLeft, PartDefinition rootForeLegRight, PartDefinition rootHindLegLeft, PartDefinition rootHindLegRight) {
        if (true) {
            PartDefinition knee_front_left = rootForeLegLeft.addOrReplaceChild("knee_front_left", CubeListBuilder.create(), PartPose.offset(0.2996F, 0.0F, -0.2451F));

            PartDefinition knee_front_left_individual = knee_front_left.addOrReplaceChild("knee_front_left_individual", CubeListBuilder.create().texOffs(40, 142).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.2996F, 0.0F, 0.2451F));

            PartDefinition knee_front_right = rootForeLegRight.addOrReplaceChild("knee_front_right", CubeListBuilder.create(), PartPose.offset(-0.2996F, 0.0F, -0.2451F));

            PartDefinition knee_front_right_individual = knee_front_right.addOrReplaceChild("knee_front_right_individual", CubeListBuilder.create().texOffs(48, 145).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.2996F, 0.0F, 0.2451F));

            PartDefinition knee_back_left = rootHindLegLeft.addOrReplaceChild("knee_back_left", CubeListBuilder.create(), PartPose.offset(-0.2996F, 0.0F, -0.2451F));

            PartDefinition knee_back_left_individual = knee_back_left.addOrReplaceChild("knee_back_left_individual", CubeListBuilder.create().texOffs(40, 148).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.2996F, 0.0F, 0.2451F));

            PartDefinition knee_back_right = rootHindLegRight.addOrReplaceChild("knee_back_right", CubeListBuilder.create(), PartPose.offset(-0.2996F, 0.0F, -0.2451F));

            PartDefinition knee_back_right_individual = knee_back_right.addOrReplaceChild("knee_back_right_individual", CubeListBuilder.create().texOffs(48, 151).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.2996F, 0.0F, 0.2451F));

        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Knee" + ", Cancelling Generation...");
        }
        allParts.add("knee_front_left");
        allParts.add("knee_front_right");
        allParts.add("knee_back_left");
        allParts.add("knee_back_right");

        return new PartDefinition[]{rootForeLegLeft, rootForeLegRight, rootHindLegLeft, rootHindLegRight};
    }

    public static PartDefinition[] GenerateAll(PartDefinition rootForeLegLeft, PartDefinition rootForeLegRight, PartDefinition rootHindLegLeft, PartDefinition rootHindLegRight) {
        PartDefinition[] roots;
        roots = Generate(rootForeLegLeft, rootForeLegRight, rootHindLegLeft, rootHindLegRight);
        rootForeLegLeft = roots[0];
        rootForeLegRight = roots[1];
        rootHindLegLeft = roots[2];
        rootHindLegRight = roots[3];

        return new PartDefinition[]{rootForeLegLeft, rootForeLegRight, rootHindLegLeft, rootHindLegRight};
    }
}
