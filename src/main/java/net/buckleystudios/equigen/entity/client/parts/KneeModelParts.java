package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class KneeModelParts {
    public static PartDefinition[] Generate(PartDefinition foreLeftRoot, PartDefinition foreRightRoot, PartDefinition hindLeftRoot, PartDefinition hindRightRoot) {
        if (true) {
            PartDefinition knee_front_left = foreLeftRoot.addOrReplaceChild("knee_front_left", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-1.2996F, -1.0F, -0.7549F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.2996F, 0.0F, -0.2451F));

            PartDefinition knee_front_right = foreRightRoot.addOrReplaceChild("knee_front_right", CubeListBuilder.create().texOffs(8, 48).addBox(-0.7004F, -1.0F, -0.7549F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.2996F, 0.0F, -0.2451F));

            PartDefinition knee_back_left = hindLeftRoot.addOrReplaceChild("knee_back_left", CubeListBuilder.create().texOffs(0, 51).addBox(-0.7004F, -1.0F, -0.7549F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.2996F, 0.0F, -0.2451F));

            PartDefinition knee_back_right = hindRightRoot.addOrReplaceChild("knee_back_right", CubeListBuilder.create().texOffs(8, 54).addBox(-0.7004F, -1.0F, -0.7549F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.2996F, 0.0F, -0.2451F));

        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Tail" + ", Cancelling Generation...");
        }
        return new PartDefinition[]{foreLeftRoot, foreRightRoot, hindLeftRoot, hindRightRoot};
    }

    public static PartDefinition[] GenerateAll(PartDefinition rootForeLegKneeLeft, PartDefinition rootForeLegKneeRight, PartDefinition rootHindLegKneeLeft, PartDefinition rootHindLegKneeRight) {
        PartDefinition[] roots;

        roots = Generate(rootForeLegKneeLeft, rootForeLegKneeRight, rootHindLegKneeLeft, rootHindLegKneeRight);
        rootForeLegKneeLeft = roots[0];
        rootForeLegKneeRight = roots[1];
        rootHindLegKneeLeft = roots[2];
        rootHindLegKneeRight = roots[3];

        return new PartDefinition[]{rootForeLegKneeLeft, rootForeLegKneeRight, rootHindLegKneeLeft, rootHindLegKneeRight};
    }
}
