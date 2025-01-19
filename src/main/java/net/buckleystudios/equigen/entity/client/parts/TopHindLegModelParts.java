package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

import java.util.List;

public class TopHindLegModelParts {
    public static PartDefinition[] Generate(PartDefinition leftLegRoot, PartDefinition rightLegRoot, String thickness, String length, int variation) {
        if (thickness.equals("average") && length.equals("short") && variation == 1) {
            PartDefinition top_back_right_leg = rightLegRoot.addOrReplaceChild("top_back_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_average_short1 = top_back_right_leg.addOrReplaceChild("top_front_right_average_short1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_average_short1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(220, 67).mirror().addBox(-0.945F, -2.0F, 0.08F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.8208F, 2.0988F, 1.7017F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_average_short1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(221, 77).mirror().addBox(-1.055F, -2.0F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.2011F, 1.6268F, 1.9635F, 0.0F, 0.0F));

            PartDefinition top_back_left_leg = leftLegRoot.addOrReplaceChild("top_back_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_average_short1 = top_back_left_leg.addOrReplaceChild("top_front_left_average_short1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_average_short1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(202, 67).addBox(-1.055F, -2.0F, 0.08F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8208F, 2.0988F, 1.7017F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_average_short1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(203, 77).addBox(-0.945F, -2.0F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.2011F, 1.6268F, 1.9635F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("short") && variation == 2) {
            PartDefinition top_back_right_leg = rightLegRoot.addOrReplaceChild("top_back_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_average_short2 = top_back_right_leg.addOrReplaceChild("top_front_right_average_short2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_average_short2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(253, 70).mirror().addBox(-0.945F, -2.0F, 0.08F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.8934F, 2.1401F, 1.7017F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_average_short2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(254, 81).mirror().addBox(-1.055F, -2.0F, -1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.7374F, 1.7575F, 1.9635F, 0.0F, 0.0F));

            PartDefinition top_back_left_leg = leftLegRoot.addOrReplaceChild("top_back_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_average_short2 = top_back_left_leg.addOrReplaceChild("top_front_left_average_short2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_average_short2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(233, 70).addBox(-1.055F, -2.0F, 0.08F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8934F, 2.1401F, 1.7017F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_average_short2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(234, 81).addBox(-0.945F, -2.0F, -1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7374F, 1.7575F, 1.9635F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("average") && variation == 1) {
            PartDefinition top_back_right_leg = rightLegRoot.addOrReplaceChild("top_back_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.0016F));

            PartDefinition top_front_right_average_average1 = top_back_right_leg.addOrReplaceChild("top_front_right_average_average1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0016F));

            PartDefinition cube_r1 = top_front_right_average_average1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(291, 77).mirror().addBox(-0.8556F, -1.0F, -1.92F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.9269F, 1.578F, 1.789F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_average_average1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(290, 66).mirror().addBox(-1.1444F, -3.0F, -2.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.0949F, 3.4122F, 2.0071F, 0.0F, 0.0F));

            PartDefinition top_back_left_leg = leftLegRoot.addOrReplaceChild("top_back_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_average_average1 = top_back_left_leg.addOrReplaceChild("top_front_left_average_average1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_average_average1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(269, 77).addBox(-1.1444F, -1.0F, -1.92F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.9269F, 1.578F, 1.789F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_average_average1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(268, 66).addBox(-0.8556F, -3.0F, -2.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.095F, 3.4122F, 2.0071F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("average") && variation == 2) {
            PartDefinition top_back_right_leg = rightLegRoot.addOrReplaceChild("top_back_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_average_average2 = top_back_right_leg.addOrReplaceChild("top_front_right_average_average2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_average_average2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(330, 81).mirror().addBox(-0.8556F, -1.0F, -0.92F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.0722F, 1.59F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_average_average2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(329, 69).mirror().addBox(-1.1444F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.2402F, 3.4242F, 1.9199F, 0.0F, 0.0F));

            PartDefinition top_back_left_leg = leftLegRoot.addOrReplaceChild("top_back_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_average_average2 = top_back_left_leg.addOrReplaceChild("top_front_left_average_average2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_average_average2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(306, 81).addBox(-1.1444F, -1.0F, -0.92F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0722F, 1.59F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_average_average2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(305, 69).addBox(-0.8556F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.2402F, 3.4242F, 1.9199F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("long") && variation == 1) {
            PartDefinition top_back_right_leg = rightLegRoot.addOrReplaceChild("top_back_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_average_long1 = top_back_right_leg.addOrReplaceChild("top_front_right_average_long1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_average_long1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(369, 73).mirror().addBox(-0.8556F, -1.0F, -1.92F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.804F, 0.8957F, 1.7017F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_average_long1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(369, 86).mirror().addBox(-1.1444F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.2402F, 2.9087F, 1.8762F, 0.0F, 0.0F));

            PartDefinition top_back_left_leg = leftLegRoot.addOrReplaceChild("top_back_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_average_long1 = top_back_left_leg.addOrReplaceChild("top_front_left_average_long1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_average_long1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(345, 73).addBox(-1.1444F, -1.0F, -1.92F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.804F, 0.8957F, 1.7017F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_average_long1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(345, 86).addBox(-0.8556F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.2402F, 2.9087F, 1.8762F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("long") && variation == 2) {
            PartDefinition top_back_right_leg = rightLegRoot.addOrReplaceChild("top_back_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_average_long2 = top_back_right_leg.addOrReplaceChild("top_front_right_average_long2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_average_long2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(411, 76).mirror().addBox(-0.8556F, -1.0F, -2.92F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.8934F, 1.3426F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_average_long2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(412, 90).mirror().addBox(-1.1444F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.8659F, 3.1768F, 1.8762F, 0.0F, 0.0F));

            PartDefinition top_back_left_leg = leftLegRoot.addOrReplaceChild("top_back_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_average_long2 = top_back_left_leg.addOrReplaceChild("top_front_left_average_long2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_average_long2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(385, 76).addBox(-1.1444F, -1.0F, -2.92F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8934F, 1.3426F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_average_long2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(386, 90).addBox(-0.8556F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.8659F, 3.1768F, 1.8762F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("short") && variation == 1) {
            PartDefinition top_back_right_leg = rightLegRoot.addOrReplaceChild("top_back_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_right_thin_short1 = top_back_right_leg.addOrReplaceChild("top_back_right_thin_short1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_back_right_thin_short1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(327, 48).mirror().addBox(-0.945F, -2.0F, 0.08F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.7314F, 2.2775F, 1.7017F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_back_right_thin_short1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(328, 57).mirror().addBox(-1.055F, -2.0F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.1117F, 1.895F, 1.9635F, 0.0F, 0.0F));

            PartDefinition top_back_left_leg = leftLegRoot.addOrReplaceChild("top_back_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_left_thin_short1 = top_back_left_leg.addOrReplaceChild("top_back_left_thin_short1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_back_left_thin_short1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(309, 48).addBox(-1.055F, -2.0F, 0.08F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.7314F, 2.2775F, 1.7017F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_back_left_thin_short1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(310, 57).addBox(-0.945F, -2.0F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.1117F, 1.8949F, 1.9635F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("short") && variation == 2) {
            PartDefinition top_back_right_leg = rightLegRoot.addOrReplaceChild("top_back_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_thin_short2 = top_back_right_leg.addOrReplaceChild("top_front_right_thin_short2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_thin_short2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(369, 49).mirror().addBox(-0.945F, -2.0F, 0.08F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.1783F, 2.4082F, 1.7017F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_thin_short2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(370, 59).mirror().addBox(-1.055F, -2.0F, -1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.5587F, 2.0257F, 1.9635F, 0.0F, 0.0F));

            PartDefinition top_back_left_leg = leftLegRoot.addOrReplaceChild("top_back_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_thin_short2 = top_back_left_leg.addOrReplaceChild("top_front_left_thin_short2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_thin_short2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(349, 49).addBox(-1.055F, -2.0F, 0.08F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.1783F, 2.4082F, 1.7017F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_thin_short2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(350, 59).addBox(-0.945F, -2.0F, -1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5587F, 2.0257F, 1.9635F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("average") && variation == 1) {
            PartDefinition top_back_right_leg = rightLegRoot.addOrReplaceChild("top_back_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_thin_average1 = top_back_right_leg.addOrReplaceChild("top_front_right_thin_average1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_thin_average1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(409, 63).mirror().addBox(-0.8556F, -1.0F, -1.92F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.7481F, 1.9371F, 1.789F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_thin_average1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(408, 52).mirror().addBox(-1.1444F, -3.0F, -2.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.0055F, 3.5031F, 2.0071F, 0.0F, 0.0F));

            PartDefinition top_back_left_leg = leftLegRoot.addOrReplaceChild("top_back_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_thin_average1 = top_back_left_leg.addOrReplaceChild("top_front_left_thin_average1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_thin_average1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(387, 63).addBox(-1.1444F, -1.0F, -1.92F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7482F, 1.9372F, 1.789F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_thin_average1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(386, 52).addBox(-0.8556F, -3.0F, -2.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0056F, 3.5032F, 2.0071F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("average") && variation == 2) {
            PartDefinition top_back_right_leg = rightLegRoot.addOrReplaceChild("top_back_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_thin_average2 = top_back_right_leg.addOrReplaceChild("top_front_right_thin_average2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_thin_average2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(451, 68).mirror().addBox(-0.8556F, -1.0F, -0.92F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.8934F, 2.3945F, 1.789F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_thin_average2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(450, 56).mirror().addBox(-1.1444F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.3296F, 3.6924F, 1.9199F, 0.0F, 0.0F));

            PartDefinition top_back_left_leg = leftLegRoot.addOrReplaceChild("top_back_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_thin_average2 = top_back_left_leg.addOrReplaceChild("top_front_left_thin_average2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_thin_average2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(427, 68).addBox(-1.1444F, -1.0F, -0.92F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8934F, 2.3945F, 1.789F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_thin_average2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(426, 56).addBox(-0.8556F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.3296F, 3.6923F, 1.9199F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("long") && variation == 1) {
            PartDefinition top_back_right_leg = rightLegRoot.addOrReplaceChild("top_back_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_thin_long1 = top_back_right_leg.addOrReplaceChild("top_front_right_thin_long1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_thin_long1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(488, 51).mirror().addBox(-0.8556F, -1.0F, -1.92F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.8934F, 1.9683F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_thin_long1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(488, 63).mirror().addBox(-1.1444F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.3296F, 3.2661F, 1.8762F, 0.0F, 0.0F));

            PartDefinition top_back_left_leg = leftLegRoot.addOrReplaceChild("top_back_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_thin_long1 = top_back_left_leg.addOrReplaceChild("top_front_left_thin_long1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_thin_long1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(464, 51).addBox(-1.1444F, -1.0F, -1.92F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8934F, 1.9683F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_thin_long1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(464, 63).addBox(-0.8556F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.3296F, 3.2662F, 1.8762F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("long") && variation == 2) {
            PartDefinition top_back_right_leg = rightLegRoot.addOrReplaceChild("top_back_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_thin_long2 = top_back_right_leg.addOrReplaceChild("top_front_right_thin_long2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_thin_long2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(486, 78).mirror().addBox(-0.8556F, -1.0F, -2.92F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.8041F, 2.0577F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_thin_long2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(487, 91).mirror().addBox(-1.1444F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.5084F, 3.4449F, 1.8762F, 0.0F, 0.0F));

            PartDefinition top_back_left_leg = leftLegRoot.addOrReplaceChild("top_back_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_thin_long2 = top_back_left_leg.addOrReplaceChild("top_front_left_thin_long2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_thin_long2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(463, 76).addBox(-1.1444F, -1.0F, -2.92F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.804F, 2.0577F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_thin_long2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(464, 89).addBox(-0.8556F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.5084F, 3.445F, 1.8762F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("short") && variation == 1) {
            PartDefinition top_back_right_leg = rightLegRoot.addOrReplaceChild("top_back_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_thick_short1 = top_back_right_leg.addOrReplaceChild("top_front_right_thick_short1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_thick_short1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(195, 89).mirror().addBox(-0.945F, -2.0F, 0.08F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.642F, 2.1882F, 1.7017F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_thick_short1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(196, 99).mirror().addBox(-1.055F, -2.0F, -1.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0223F, 1.3587F, 1.9635F, 0.0F, 0.0F));

            PartDefinition top_back_left_leg = leftLegRoot.addOrReplaceChild("top_back_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_thick_short1 = top_back_left_leg.addOrReplaceChild("top_front_left_thick_short1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_thick_short1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(178, 80).addBox(-1.055F, -2.0F, 0.08F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.642F, 2.1882F, 1.7017F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_thick_short1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(179, 90).addBox(-0.945F, -2.0F, -1.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0223F, 1.3587F, 1.9635F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("short") && variation == 2) {
            PartDefinition top_back_right_leg = rightLegRoot.addOrReplaceChild("top_back_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_thick_short2 = top_back_right_leg.addOrReplaceChild("top_front_right_thick_short2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_thick_short2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(231, 92).mirror().addBox(-0.945F, -2.0F, 0.08F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.8041F, 2.2295F, 1.7017F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_thick_short2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(232, 103).mirror().addBox(-1.055F, -2.0F, -1.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.6481F, 1.2212F, 1.9635F, 0.0F, 0.0F));

            PartDefinition top_back_left_leg = leftLegRoot.addOrReplaceChild("top_back_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_thick_short2 = top_back_left_leg.addOrReplaceChild("top_front_left_thick_short2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_thick_short2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(211, 92).addBox(-1.055F, -2.0F, 0.08F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.804F, 2.2295F, 1.7017F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_thick_short2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(212, 103).addBox(-0.945F, -2.0F, -1.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.648F, 1.2212F, 1.9635F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("average") && variation == 1) {
            PartDefinition top_back_right_leg = rightLegRoot.addOrReplaceChild("top_back_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_thick_average1 = top_back_right_leg.addOrReplaceChild("top_front_right_thick_average1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_thick_average1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(269, 107).mirror().addBox(-0.8556F, -1.0F, -1.92F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.1951F, 1.5797F, 1.789F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_thick_average1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(268, 95).mirror().addBox(-1.1444F, -3.0F, -2.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.3631F, 2.9669F, 2.0071F, 0.0F, 0.0F));

            PartDefinition top_back_left_leg = leftLegRoot.addOrReplaceChild("top_back_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_thick_average1 = top_back_left_leg.addOrReplaceChild("top_front_left_thick_average1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_thick_average1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(247, 107).addBox(-1.1444F, -1.0F, -1.92F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.1951F, 1.5796F, 1.789F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_thick_average1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(246, 95).addBox(-0.8556F, -3.0F, -2.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.3631F, 2.9669F, 2.0071F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("average") && variation == 2) {

            PartDefinition top_back_right_leg = rightLegRoot.addOrReplaceChild("top_back_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_thick_average2 = top_back_right_leg.addOrReplaceChild("top_front_right_thick_average2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_thick_average2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(309, 111).mirror().addBox(-0.8556F, -1.0F, -0.92F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.0722F, 1.59F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_thick_average2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(308, 98).mirror().addBox(-1.1444F, -3.0F, -1.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.2402F, 2.7985F, 1.9199F, 0.0F, 0.0F));

            PartDefinition top_back_left_leg = leftLegRoot.addOrReplaceChild("top_back_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_thick_average2 = top_back_left_leg.addOrReplaceChild("top_front_left_thick_average2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_thick_average2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(285, 111).addBox(-1.1444F, -1.0F, -0.92F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0722F, 1.59F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_thick_average2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(284, 98).addBox(-0.8556F, -3.0F, -1.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.2402F, 2.7985F, 1.9199F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("long") && variation == 1) {
            PartDefinition top_back_right_leg = rightLegRoot.addOrReplaceChild("top_back_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_thick_long1 = top_back_right_leg.addOrReplaceChild("top_front_right_thick_long1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_thick_long1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(353, 102).mirror().addBox(-0.8556F, -1.0F, -1.92F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.0722F, 1.432F, 1.7017F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_thick_long1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(353, 115).mirror().addBox(-1.1444F, -3.0F, -1.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.5084F, 2.7299F, 1.8762F, 0.0F, 0.0F));

            PartDefinition top_back_left_leg = leftLegRoot.addOrReplaceChild("top_back_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_thick_long1 = top_back_left_leg.addOrReplaceChild("top_front_left_thick_long1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_thick_long1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(329, 102).addBox(-1.1444F, -1.0F, -1.92F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0722F, 1.432F, 1.7017F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_thick_long1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(329, 115).addBox(-0.8556F, -3.0F, -1.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.5084F, 2.7299F, 1.8762F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("long") && variation == 2) {
            PartDefinition top_back_right_leg = rightLegRoot.addOrReplaceChild("top_back_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_thick_long2 = top_back_right_leg.addOrReplaceChild("top_front_right_thick_long2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_thick_long2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(408, 104).mirror().addBox(-0.8556F, -1.0F, -2.92F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.8934F, 1.3426F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_thick_long2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(409, 118).mirror().addBox(-1.1444F, -3.0F, -1.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.8659F, 2.4617F, 1.8762F, 0.0F, 0.0F));

            PartDefinition top_back_left_leg = leftLegRoot.addOrReplaceChild("top_back_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_thick_long2 = top_back_left_leg.addOrReplaceChild("top_front_left_thick_long2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_thick_long2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(382, 104).addBox(-1.1444F, -1.0F, -2.92F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8934F, 1.3426F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_thick_long2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(383, 118).addBox(-0.8556F, -3.0F, -1.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.8659F, 2.4617F, 1.8762F, 0.0F, 0.0F));

        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Top Hind Legs / " + thickness + " / " + length + " / Variation " + variation + ", Cancelling Generation...");
        }
        return new PartDefinition[]{leftLegRoot, rightLegRoot};
    }

    public static PartDefinition[] GenerateAll(PartDefinition rootTopHindLegLeft, PartDefinition rootTopHindLegRight) {
        List<String> thickness = List.of("thin", "average", "thick");
        List<String> length = List.of("short", "average", "long");
        PartDefinition[] roots;

        for(String variable1 : thickness){
            for(String variable2 : length){
                roots = Generate(rootTopHindLegLeft, rootTopHindLegRight, variable1, variable2, 1);
                rootTopHindLegLeft = roots[0];
                rootTopHindLegRight = roots[1];

                roots = Generate(rootTopHindLegLeft, rootTopHindLegRight, variable1, variable2, 2);
                rootTopHindLegLeft = roots[0];
                rootTopHindLegRight = roots[1];
            }
        }
        return new PartDefinition[]{rootTopHindLegLeft, rootTopHindLegRight};
    }
}