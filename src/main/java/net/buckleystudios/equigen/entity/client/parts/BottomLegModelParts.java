package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

import java.util.ArrayList;
import java.util.List;

public class BottomLegModelParts{
    private static List<String> allParts = new ArrayList<>();
    public static List<String> getAllParts(){
        return allParts;
    }

    //Models are split between upper/lower because communication sucks and I requested the wrong file setup
    //Maybe fix in later update?

    public static PartDefinition[] Generate(PartDefinition rootForeLegLeft, PartDefinition rootForeLegRight, PartDefinition rootHindLegLeft, PartDefinition rootHindLegRight, String thickness, String length, int variation){
        PartDefinition[] roots;
        roots = GenerateUpper(rootForeLegLeft, rootForeLegRight, rootHindLegLeft, rootHindLegRight, thickness, length, variation);
        rootForeLegLeft = roots[0];
        rootForeLegRight = roots[1];
        rootHindLegLeft = roots[2];
        rootHindLegRight = roots[3];
        roots = GenerateLower(rootForeLegLeft, rootForeLegRight, rootHindLegLeft, rootHindLegRight, thickness, length, variation);
        rootForeLegLeft = roots[0];
        rootForeLegRight = roots[1];
        rootHindLegLeft = roots[2];
        rootHindLegRight = roots[3];

        allParts.add("bottom_legs_" + thickness + "_" + length + "_" + variation + "_bottom_front_left");
        allParts.add("bottom_legs_" + thickness + "_" + length + "_" + variation + "_bottom_front_right");
        allParts.add("bottom_legs_" + thickness + "_" + length + "_" + variation + "_bottom_back_left");
        allParts.add("bottom_legs_" + thickness + "_" + length + "_" + variation + "_bottom_back_right");

        allParts.add("bottom_2_legs_" + thickness + "_" + length + "_" + variation + "_bottom_front_left");
        allParts.add("bottom_2_legs_" + thickness + "_" + length + "_" + variation + "_bottom_front_right");
        allParts.add("bottom_2_legs_" + thickness + "_" + length + "_" + variation + "_bottom_back_left");
        allParts.add("bottom_2_legs_" + thickness + "_" + length + "_" + variation + "_bottom_back_right");

        return new PartDefinition[]{rootForeLegLeft, rootForeLegRight, rootHindLegLeft, rootHindLegRight};
    }

    public static PartDefinition[] GenerateUpper(PartDefinition rootForeLegLeft, PartDefinition rootForeLegRight, PartDefinition rootHindLegLeft, PartDefinition rootHindLegRight, String thickness, String length, int variation) {
        if (thickness.equals("thin") && length.equals("short") && variation == 1) {
            PartDefinition bottom_legs_thin_short_1_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_thin_short_1_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_short_1_bottom_front_left_individual = bottom_legs_thin_short_1_bottom_front_left.addOrReplaceChild("bottom_legs_thin_short_1_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 0.8468F, -0.1072F));

            PartDefinition cube_r1 = bottom_legs_thin_short_1_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 203).addBox(-0.5427F, -0.4691F, -1.7977F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0427F, -0.7977F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_short_1_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_thin_short_1_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_short_1_bottom_front_right_individual = bottom_legs_thin_short_1_bottom_front_right.addOrReplaceChild("bottom_legs_thin_short_1_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 0.8468F, -0.1072F));

            PartDefinition cube_r2 = bottom_legs_thin_short_1_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(10, 203).addBox(-0.5427F, -0.4691F, -1.7977F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0427F, -0.7977F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_short_1_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_thin_short_1_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_short_1_bottom_back_left_individual = bottom_legs_thin_short_1_bottom_back_left.addOrReplaceChild("bottom_legs_thin_short_1_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 0.8468F, -0.1072F));

            PartDefinition cube_r3 = bottom_legs_thin_short_1_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(10, 209).addBox(-0.5427F, -0.4691F, -1.7977F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0427F, -0.7977F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_short_1_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_thin_short_1_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_short_1_bottom_back_right_individual = bottom_legs_thin_short_1_bottom_back_right.addOrReplaceChild("bottom_legs_thin_short_1_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 0.8468F, -0.1072F));

            PartDefinition cube_r4 = bottom_legs_thin_short_1_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(16, 209).addBox(-0.5427F, -0.4691F, -1.7977F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0427F, -0.7977F, -0.0309F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("short") && variation == 2) {
            PartDefinition bottom_legs_thin_short_2_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_thin_short_2_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_short_2_bottom_front_left_individual = bottom_legs_thin_short_2_bottom_front_left.addOrReplaceChild("bottom_legs_thin_short_2_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8468F, 0.0005F));

            PartDefinition cube_r1 = bottom_legs_thin_short_2_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(28, 197).addBox(-0.5F, -0.4691F, -1.887F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.887F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_short_2_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_thin_short_2_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_short_2_bottom_front_right_individual = bottom_legs_thin_short_2_bottom_front_right.addOrReplaceChild("bottom_legs_thin_short_2_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8468F, 0.0005F));

            PartDefinition cube_r2 = bottom_legs_thin_short_2_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 197).addBox(-0.5F, -0.4691F, -1.887F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.887F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_short_2_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_thin_short_2_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_short_2_bottom_back_left_individual = bottom_legs_thin_short_2_bottom_back_left.addOrReplaceChild("bottom_legs_thin_short_2_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8468F, 0.0005F));

            PartDefinition cube_r3 = bottom_legs_thin_short_2_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(28, 204).addBox(-0.5F, -0.4691F, -1.887F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.887F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_short_2_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_thin_short_2_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_short_2_bottom_back_right_individual = bottom_legs_thin_short_2_bottom_back_right.addOrReplaceChild("bottom_legs_thin_short_2_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8468F, 0.0005F));

            PartDefinition cube_r4 = bottom_legs_thin_short_2_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 204).addBox(-0.5F, -0.4691F, -1.887F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.887F, -0.0309F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("short") && variation == 3) {
            PartDefinition bottom_legs_thin_short_3_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_thin_short_3_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_short_3_bottom_front_left_individual = bottom_legs_thin_short_3_bottom_front_left.addOrReplaceChild("bottom_legs_thin_short_3_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.2478F, 0.024F));

            PartDefinition cube_r1 = bottom_legs_thin_short_3_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(46, 196).addBox(-0.5189F, -0.4691F, -2.7809F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.2809F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_short_3_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_thin_short_3_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_short_3_bottom_front_right_individual = bottom_legs_thin_short_3_bottom_front_right.addOrReplaceChild("bottom_legs_thin_short_3_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.2478F, 0.024F));

            PartDefinition cube_r2 = bottom_legs_thin_short_3_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(54, 196).addBox(-0.5189F, -0.4691F, -2.7809F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.2809F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_short_3_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_thin_short_3_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_short_3_bottom_back_left_individual = bottom_legs_thin_short_3_bottom_back_left.addOrReplaceChild("bottom_legs_thin_short_3_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.2478F, 0.024F));

            PartDefinition cube_r3 = bottom_legs_thin_short_3_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(46, 204).addBox(-0.5189F, -0.4691F, -2.7809F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.2809F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_short_3_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_thin_short_3_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_short_3_bottom_back_right_individual = bottom_legs_thin_short_3_bottom_back_right.addOrReplaceChild("bottom_legs_thin_short_3_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.2478F, 0.024F));

            PartDefinition cube_r4 = bottom_legs_thin_short_3_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(54, 204).addBox(-0.5189F, -0.4691F, -2.7809F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.2809F, -0.0309F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("average") && variation == 1) {
            PartDefinition bottom_legs_thin_average_1_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_thin_average_1_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_average_1_bottom_front_left_individual = bottom_legs_thin_average_1_bottom_front_left.addOrReplaceChild("bottom_legs_thin_average_1_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.9002F, 0.0555F));

            PartDefinition cube_r1 = bottom_legs_thin_average_1_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(64, 200).addBox(-0.5189F, -0.4485F, -3.8645F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8645F, -0.0515F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_average_1_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_thin_average_1_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_average_1_bottom_front_right_individual = bottom_legs_thin_average_1_bottom_front_right.addOrReplaceChild("bottom_legs_thin_average_1_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.9002F, 0.0555F));

            PartDefinition cube_r2 = bottom_legs_thin_average_1_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(74, 200).addBox(-0.5189F, -0.4485F, -3.8645F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8645F, -0.0515F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_average_1_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_thin_average_1_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_average_1_bottom_back_left_individual = bottom_legs_thin_average_1_bottom_back_left.addOrReplaceChild("bottom_legs_thin_average_1_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.9002F, 0.0555F));

            PartDefinition cube_r3 = bottom_legs_thin_average_1_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(64, 209).addBox(-0.5189F, -0.4485F, -3.8645F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8645F, -0.0515F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_average_1_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_thin_average_1_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_average_1_bottom_back_right_individual = bottom_legs_thin_average_1_bottom_back_right.addOrReplaceChild("bottom_legs_thin_average_1_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.9002F, 0.0555F));

            PartDefinition cube_r4 = bottom_legs_thin_average_1_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(74, 209).addBox(-0.5189F, -0.4485F, -3.8645F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8645F, -0.0515F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("average") && variation == 2) {
            PartDefinition bottom_legs_thin_average_2_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_thin_average_2_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_average_2_bottom_front_left_individual = bottom_legs_thin_average_2_bottom_front_left.addOrReplaceChild("bottom_legs_thin_average_2_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0171F, 1.8835F, 0.0885F));

            PartDefinition cube_r1 = bottom_legs_thin_average_2_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(86, 194).addBox(-0.4829F, -0.4485F, -3.8477F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0171F, -1.8477F, -0.0515F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_average_2_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_thin_average_2_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_average_2_bottom_front_right_individual = bottom_legs_thin_average_2_bottom_front_right.addOrReplaceChild("bottom_legs_thin_average_2_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0171F, 1.8835F, 0.0885F));

            PartDefinition cube_r2 = bottom_legs_thin_average_2_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(96, 194).addBox(-0.4829F, -0.4485F, -3.8477F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0171F, -1.8477F, -0.0515F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_average_2_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_thin_average_2_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_average_2_bottom_back_left_individual = bottom_legs_thin_average_2_bottom_back_left.addOrReplaceChild("bottom_legs_thin_average_2_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0171F, 1.8725F, 0.0775F));

            PartDefinition cube_r3 = bottom_legs_thin_average_2_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(86, 204).addBox(-0.4829F, -0.4485F, -3.8368F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0171F, -1.8368F, -0.0515F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_average_2_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_thin_average_2_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_average_2_bottom_back_right_individual = bottom_legs_thin_average_2_bottom_back_right.addOrReplaceChild("bottom_legs_thin_average_2_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0171F, 1.8725F, 0.0775F));

            PartDefinition cube_r4 = bottom_legs_thin_average_2_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(96, 204).addBox(-0.4829F, -0.4485F, -3.8368F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0171F, -1.8368F, -0.0515F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("average") && variation == 3) {
            PartDefinition bottom_legs_thin_average_3_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_thin_average_3_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_average_3_bottom_front_left_individual = bottom_legs_thin_average_3_bottom_front_left.addOrReplaceChild("bottom_legs_thin_average_3_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0171F, 1.908F, 0.0447F));

            PartDefinition cube_r1 = bottom_legs_thin_average_3_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(7, 223).addBox(-0.4829F, -0.4128F, -3.8186F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0171F, -1.8186F, -0.0872F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_average_3_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_thin_average_3_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_average_3_bottom_front_right_individual = bottom_legs_thin_average_3_bottom_front_right.addOrReplaceChild("bottom_legs_thin_average_3_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0171F, 1.8931F, 0.0569F));

            PartDefinition cube_r2 = bottom_legs_thin_average_3_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(17, 223).addBox(-0.4829F, -0.4691F, -3.8368F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0171F, -1.8368F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_average_3_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_thin_average_3_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_average_3_bottom_back_left_individual = bottom_legs_thin_average_3_bottom_back_left.addOrReplaceChild("bottom_legs_thin_average_3_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0171F, 1.9041F, 0.0679F));

            PartDefinition cube_r3 = bottom_legs_thin_average_3_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(7, 233).addBox(-0.4829F, -0.4691F, -3.8477F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0171F, -1.8477F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_average_3_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_thin_average_3_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_average_3_bottom_back_right_individual = bottom_legs_thin_average_3_bottom_back_right.addOrReplaceChild("bottom_legs_thin_average_3_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0171F, 1.8835F, 0.0885F));

            PartDefinition cube_r4 = bottom_legs_thin_average_3_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(17, 233).addBox(-0.4829F, -0.4485F, -3.8477F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0171F, -1.8477F, -0.0515F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("long") && variation == 1) {
            PartDefinition bottom_legs_thin_long_1_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_thin_long_1_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_long_1_bottom_front_left_individual = bottom_legs_thin_long_1_bottom_front_left.addOrReplaceChild("bottom_legs_thin_long_1_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.9098F, -0.007F));

            PartDefinition cube_r1 = bottom_legs_thin_long_1_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(32, 223).addBox(-0.5189F, -0.4691F, -3.8535F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8535F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_long_1_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_thin_long_1_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_long_1_bottom_front_right_individual = bottom_legs_thin_long_1_bottom_front_right.addOrReplaceChild("bottom_legs_thin_long_1_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.9098F, -0.007F));

            PartDefinition cube_r2 = bottom_legs_thin_long_1_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(42, 223).addBox(-0.5189F, -0.4691F, -3.8535F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8535F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_long_1_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_thin_long_1_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_long_1_bottom_back_left_individual = bottom_legs_thin_long_1_bottom_back_left.addOrReplaceChild("bottom_legs_thin_long_1_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.9098F, -0.007F));

            PartDefinition cube_r3 = bottom_legs_thin_long_1_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(32, 233).addBox(-0.5189F, -0.4691F, -3.8535F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8535F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_long_1_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_thin_long_1_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_long_1_bottom_back_right_individual = bottom_legs_thin_long_1_bottom_back_right.addOrReplaceChild("bottom_legs_thin_long_1_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.9098F, -0.007F));

            PartDefinition cube_r4 = bottom_legs_thin_long_1_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(42, 233).addBox(-0.5189F, -0.469F, -3.8535F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8535F, -0.031F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("long") && variation == 2) {
            PartDefinition bottom_legs_thin_long_2_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_thin_long_2_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_long_2_bottom_front_left_individual = bottom_legs_thin_long_2_bottom_front_left.addOrReplaceChild("bottom_legs_thin_long_2_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 2.8912F, -0.0732F));

            PartDefinition cube_r1 = bottom_legs_thin_long_2_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(54, 228).addBox(-0.5F, -0.5307F, -5.8912F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8912F, 0.0307F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_long_2_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_thin_long_2_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_long_2_bottom_front_right_individual = bottom_legs_thin_long_2_bottom_front_right.addOrReplaceChild("bottom_legs_thin_long_2_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 2.8912F, -0.0732F));

            PartDefinition cube_r2 = bottom_legs_thin_long_2_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(68, 228).addBox(-0.5F, -0.5307F, -5.8912F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8912F, 0.0307F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_long_2_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_thin_long_2_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_long_2_bottom_back_left_individual = bottom_legs_thin_long_2_bottom_back_left.addOrReplaceChild("bottom_legs_thin_long_2_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 2.8912F, -0.0732F));

            PartDefinition cube_r3 = bottom_legs_thin_long_2_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(54, 239).addBox(-0.5F, -0.5307F, -5.8912F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8912F, 0.0307F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_long_2_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_thin_long_2_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_long_2_bottom_back_right_individual = bottom_legs_thin_long_2_bottom_back_right.addOrReplaceChild("bottom_legs_thin_long_2_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 2.8912F, -0.0732F));

            PartDefinition cube_r4 = bottom_legs_thin_long_2_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(68, 239).addBox(-0.5F, -0.5307F, -5.8912F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8912F, 0.0307F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("long") && variation == 3) {
            PartDefinition bottom_legs_thin_long_3_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_thin_long_3_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_long_3_bottom_front_left_individual = bottom_legs_thin_long_3_bottom_front_left.addOrReplaceChild("bottom_legs_thin_long_3_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 2.3037F, -0.007F));

            PartDefinition cube_r1 = bottom_legs_thin_long_3_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(84, 225).addBox(-0.5189F, -0.4691F, -4.8368F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -2.3368F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_long_3_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_thin_long_3_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_long_3_bottom_front_right_individual = bottom_legs_thin_long_3_bottom_front_right.addOrReplaceChild("bottom_legs_thin_long_3_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 2.3037F, -0.007F));

            PartDefinition cube_r2 = bottom_legs_thin_long_3_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(96, 225).addBox(-0.5189F, -0.4691F, -4.8368F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -2.3368F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_long_3_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_thin_long_3_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_long_3_bottom_back_left_individual = bottom_legs_thin_long_3_bottom_back_left.addOrReplaceChild("bottom_legs_thin_long_3_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 2.3037F, -0.007F));

            PartDefinition cube_r3 = bottom_legs_thin_long_3_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(84, 236).addBox(-0.5189F, -0.4691F, -4.8368F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -2.3368F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_long_3_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_thin_long_3_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thin_long_3_bottom_back_right_individual = bottom_legs_thin_long_3_bottom_back_right.addOrReplaceChild("bottom_legs_thin_long_3_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 2.3037F, -0.007F));

            PartDefinition cube_r4 = bottom_legs_thin_long_3_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(96, 236).addBox(-0.5189F, -0.4691F, -4.8368F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -2.3368F, -0.0309F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("short") && variation == 1) {
            PartDefinition bottom_legs_average_short_1_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_average_short_1_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_short_1_bottom_front_left_individual = bottom_legs_average_short_1_bottom_front_left.addOrReplaceChild("bottom_legs_average_short_1_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 0.8468F, -0.1072F));

            PartDefinition cube_r1 = bottom_legs_average_short_1_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 270).addBox(-1.0189F, -0.4691F, -1.7977F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -0.7977F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_short_1_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_average_short_1_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_short_1_bottom_front_right_individual = bottom_legs_average_short_1_bottom_front_right.addOrReplaceChild("bottom_legs_average_short_1_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 0.8468F, -0.1072F));

            PartDefinition cube_r2 = bottom_legs_average_short_1_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(9, 271).addBox(-1.0189F, -0.4691F, -1.7977F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -0.7977F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_short_1_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_average_short_1_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_short_1_bottom_back_left_individual = bottom_legs_average_short_1_bottom_back_left.addOrReplaceChild("bottom_legs_average_short_1_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 0.8468F, -0.1072F));

            PartDefinition cube_r3 = bottom_legs_average_short_1_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 276).addBox(-1.0189F, -0.4691F, -1.7977F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -0.7977F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_short_1_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_average_short_1_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_short_1_bottom_back_right_individual = bottom_legs_average_short_1_bottom_back_right.addOrReplaceChild("bottom_legs_average_short_1_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 0.8468F, -0.1072F));

            PartDefinition cube_r4 = bottom_legs_average_short_1_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(9, 277).addBox(-1.0189F, -0.4691F, -1.7977F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -0.7977F, -0.0309F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("short") && variation == 2) {
            PartDefinition bottom_legs_average_short_2_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_average_short_2_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_short_2_bottom_front_left_individual = bottom_legs_average_short_2_bottom_front_left.addOrReplaceChild("bottom_legs_average_short_2_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0025F, 0.8468F, 0.0005F));

            PartDefinition cube_r1 = bottom_legs_average_short_2_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(22, 267).addBox(-1.0025F, -0.4691F, -1.887F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0025F, -0.887F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_short_2_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_average_short_2_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_short_2_bottom_front_right_individual = bottom_legs_average_short_2_bottom_front_right.addOrReplaceChild("bottom_legs_average_short_2_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0025F, 0.8468F, 0.0005F));

            PartDefinition cube_r2 = bottom_legs_average_short_2_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(30, 269).addBox(-1.0025F, -0.4691F, -1.887F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0025F, -0.887F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_short_2_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_average_short_2_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_short_2_bottom_back_left_individual = bottom_legs_average_short_2_bottom_back_left.addOrReplaceChild("bottom_legs_average_short_2_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0025F, 0.8468F, 0.0005F));

            PartDefinition cube_r3 = bottom_legs_average_short_2_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(22, 274).addBox(-1.0025F, -0.4691F, -1.887F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0025F, -0.887F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_short_2_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_average_short_2_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_short_2_bottom_back_right_individual = bottom_legs_average_short_2_bottom_back_right.addOrReplaceChild("bottom_legs_average_short_2_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0025F, 0.8468F, 0.0005F));

            PartDefinition cube_r4 = bottom_legs_average_short_2_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(30, 276).addBox(-1.0025F, -0.4691F, -1.887F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0025F, -0.887F, -0.0309F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("short") && variation == 3) {
            PartDefinition bottom_legs_average_short_3_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_average_short_3_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_short_3_bottom_front_left_individual = bottom_legs_average_short_3_bottom_front_left.addOrReplaceChild("bottom_legs_average_short_3_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.2478F, 0.024F));

            PartDefinition cube_r1 = bottom_legs_average_short_3_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(40, 268).addBox(-1.0189F, -0.4691F, -2.7809F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.2809F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_short_3_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_average_short_3_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_short_3_bottom_front_right_individual = bottom_legs_average_short_3_bottom_front_right.addOrReplaceChild("bottom_legs_average_short_3_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.2478F, 0.024F));

            PartDefinition cube_r2 = bottom_legs_average_short_3_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(48, 270).addBox(-1.0189F, -0.4691F, -2.7809F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.2809F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_short_3_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_average_short_3_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_short_3_bottom_back_left_individual = bottom_legs_average_short_3_bottom_back_left.addOrReplaceChild("bottom_legs_average_short_3_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.2478F, 0.024F));

            PartDefinition cube_r3 = bottom_legs_average_short_3_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(40, 276).addBox(-1.0189F, -0.4691F, -2.7809F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.2809F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_short_3_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_average_short_3_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_short_3_bottom_back_right_individual = bottom_legs_average_short_3_bottom_back_right.addOrReplaceChild("bottom_legs_average_short_3_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.2478F, 0.024F));

            PartDefinition cube_r4 = bottom_legs_average_short_3_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(48, 278).addBox(-1.0189F, -0.4691F, -2.7809F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.2809F, -0.0309F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("average") && variation == 1) {
            PartDefinition bottom_legs_average_average_1_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_average_average_1_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_average_1_bottom_front_left_individual = bottom_legs_average_average_1_bottom_front_left.addOrReplaceChild("bottom_legs_average_average_1_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.8204F, 0.024F));

            PartDefinition cube_r1 = bottom_legs_average_average_1_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(62, 266).addBox(-1.0189F, -0.4691F, -3.8535F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8535F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_average_1_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_average_average_1_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_average_1_bottom_front_right_individual = bottom_legs_average_average_1_bottom_front_right.addOrReplaceChild("bottom_legs_average_average_1_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.8204F, 0.024F));

            PartDefinition cube_r2 = bottom_legs_average_average_1_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(71, 268).addBox(-1.0189F, -0.4691F, -3.8535F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8535F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_average_1_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_average_average_1_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_average_1_bottom_back_left_individual = bottom_legs_average_average_1_bottom_back_left.addOrReplaceChild("bottom_legs_average_average_1_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.8204F, 0.024F));

            PartDefinition cube_r3 = bottom_legs_average_average_1_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(62, 275).addBox(-1.0189F, -0.4691F, -3.8535F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8535F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_average_1_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_average_average_1_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_average_1_bottom_back_right_individual = bottom_legs_average_average_1_bottom_back_right.addOrReplaceChild("bottom_legs_average_average_1_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.8204F, 0.024F));

            PartDefinition cube_r4 = bottom_legs_average_average_1_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(71, 277).addBox(-1.0189F, -0.4691F, -3.8535F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8535F, -0.0309F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("average") && variation == 2) {
            PartDefinition bottom_legs_average_average_2_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_average_average_2_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_average_2_bottom_front_left_individual = bottom_legs_average_average_2_bottom_front_left.addOrReplaceChild("bottom_legs_average_average_2_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0171F, 1.8037F, 0.0569F));

            PartDefinition cube_r1 = bottom_legs_average_average_2_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(85, 268).addBox(-0.9829F, -0.4691F, -3.8368F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0171F, -1.8368F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_average_2_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_average_average_2_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_average_2_bottom_front_right_individual = bottom_legs_average_average_2_bottom_front_right.addOrReplaceChild("bottom_legs_average_average_2_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0171F, 1.8037F, 0.0569F));

            PartDefinition cube_r2 = bottom_legs_average_average_2_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(94, 270).addBox(-0.9829F, -0.4691F, -3.8368F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0171F, -1.8368F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_average_2_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_average_average_2_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_average_2_bottom_back_left_individual = bottom_legs_average_average_2_bottom_back_left.addOrReplaceChild("bottom_legs_average_average_2_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0171F, 1.8037F, 0.0569F));

            PartDefinition cube_r3 = bottom_legs_average_average_2_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(85, 278).addBox(-0.9829F, -0.4691F, -3.8368F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0171F, -1.8368F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_average_2_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_average_average_2_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_average_2_bottom_back_right_individual = bottom_legs_average_average_2_bottom_back_right.addOrReplaceChild("bottom_legs_average_average_2_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0171F, 1.8037F, 0.0569F));

            PartDefinition cube_r4 = bottom_legs_average_average_2_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(94, 280).addBox(-0.9829F, -0.4691F, -3.8368F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0171F, -1.8368F, -0.0309F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("average") && variation == 3) {
            PartDefinition bottom_legs_average_average_3_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_average_average_3_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_average_3_bottom_front_left_individual = bottom_legs_average_average_3_bottom_front_left.addOrReplaceChild("bottom_legs_average_average_3_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.005F, 2.3186F, 0.0139F));

            PartDefinition cube_r1 = bottom_legs_average_average_3_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 305).addBox(-0.995F, -0.5307F, -4.8186F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -2.3186F, 0.0307F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_average_3_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_average_average_3_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_average_3_bottom_front_right_individual = bottom_legs_average_average_3_bottom_front_right.addOrReplaceChild("bottom_legs_average_average_3_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.005F, 2.3186F, 0.0139F));

            PartDefinition cube_r2 = bottom_legs_average_average_3_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 307).addBox(-0.995F, -0.5307F, -4.8186F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -2.3186F, 0.0307F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_average_3_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_average_average_3_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_average_3_bottom_back_left_individual = bottom_legs_average_average_3_bottom_back_left.addOrReplaceChild("bottom_legs_average_average_3_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.005F, 2.3186F, 0.0139F));

            PartDefinition cube_r3 = bottom_legs_average_average_3_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 315).addBox(-0.995F, -0.5307F, -4.8186F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -2.3186F, 0.0307F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_average_3_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_average_average_3_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_average_3_bottom_back_right_individual = bottom_legs_average_average_3_bottom_back_right.addOrReplaceChild("bottom_legs_average_average_3_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.005F, 2.3186F, 0.0139F));

            PartDefinition cube_r4 = bottom_legs_average_average_3_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(12, 317).addBox(-0.995F, -0.5307F, -4.8186F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -2.3186F, 0.0307F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("long") && variation == 1) {
            PartDefinition bottom_legs_average_long_1_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_average_long_1_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_long_1_bottom_front_left_individual = bottom_legs_average_long_1_bottom_front_left.addOrReplaceChild("bottom_legs_average_long_1_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.8204F, -0.007F));

            PartDefinition cube_r1 = bottom_legs_average_long_1_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(31, 298).addBox(-1.0189F, -0.4691F, -3.8535F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8535F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_long_1_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_average_long_1_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_long_1_bottom_front_right_individual = bottom_legs_average_long_1_bottom_front_right.addOrReplaceChild("bottom_legs_average_long_1_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.8204F, -0.007F));

            PartDefinition cube_r2 = bottom_legs_average_long_1_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(40, 300).addBox(-1.0189F, -0.4691F, -3.8535F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8535F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_long_1_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_average_long_1_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_long_1_bottom_back_left_individual = bottom_legs_average_long_1_bottom_back_left.addOrReplaceChild("bottom_legs_average_long_1_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.8204F, -0.007F));

            PartDefinition cube_r3 = bottom_legs_average_long_1_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(31, 308).addBox(-1.0189F, -0.4691F, -3.8535F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8535F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_long_1_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_average_long_1_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_long_1_bottom_back_right_individual = bottom_legs_average_long_1_bottom_back_right.addOrReplaceChild("bottom_legs_average_long_1_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.8204F, -0.007F));

            PartDefinition cube_r4 = bottom_legs_average_long_1_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 310).addBox(-1.0189F, -0.4691F, -3.8535F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8535F, -0.0309F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("long") && variation == 2) {
            PartDefinition bottom_legs_average_long_2_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_average_long_2_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_long_2_bottom_front_left_individual = bottom_legs_average_long_2_bottom_front_left.addOrReplaceChild("bottom_legs_average_long_2_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.005F, 2.8018F, 0.0139F));

            PartDefinition cube_r1 = bottom_legs_average_long_2_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(55, 305).addBox(-0.995F, -0.5307F, -5.8912F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -2.8912F, 0.0307F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_long_2_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_average_long_2_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_long_2_bottom_front_right_individual = bottom_legs_average_long_2_bottom_front_right.addOrReplaceChild("bottom_legs_average_long_2_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.005F, 2.8018F, 0.0139F));

            PartDefinition cube_r2 = bottom_legs_average_long_2_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(66, 303).addBox(-0.995F, -0.5307F, -5.8912F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -2.8912F, 0.0307F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_long_2_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_average_long_2_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_long_2_bottom_back_left_individual = bottom_legs_average_long_2_bottom_back_left.addOrReplaceChild("bottom_legs_average_long_2_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.005F, 2.8018F, 0.0139F));

            PartDefinition cube_r3 = bottom_legs_average_long_2_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(55, 316).addBox(-0.995F, -0.5307F, -5.8912F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -2.8912F, 0.0307F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_long_2_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_average_long_2_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_long_2_bottom_back_right_individual = bottom_legs_average_long_2_bottom_back_right.addOrReplaceChild("bottom_legs_average_long_2_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.005F, 2.8018F, 0.0139F));

            PartDefinition cube_r4 = bottom_legs_average_long_2_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(66, 314).addBox(-0.995F, -0.5307F, -5.8912F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -2.8912F, 0.0307F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("long") && variation == 3) {
            PartDefinition bottom_legs_average_long_3_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_average_long_3_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_long_3_bottom_front_left_individual = bottom_legs_average_long_3_bottom_front_left.addOrReplaceChild("bottom_legs_average_long_3_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 2.3037F, -0.007F));

            PartDefinition cube_r1 = bottom_legs_average_long_3_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(83, 300).addBox(-1.0189F, -0.4691F, -4.8368F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -2.3368F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_long_3_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_average_long_3_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_long_3_bottom_front_right_individual = bottom_legs_average_long_3_bottom_front_right.addOrReplaceChild("bottom_legs_average_long_3_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 2.3037F, -0.007F));

            PartDefinition cube_r2 = bottom_legs_average_long_3_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(93, 302).addBox(-1.0189F, -0.4691F, -4.8368F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -2.3368F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_long_3_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_average_long_3_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_long_3_bottom_back_left_individual = bottom_legs_average_long_3_bottom_back_left.addOrReplaceChild("bottom_legs_average_long_3_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 2.3037F, -0.007F));

            PartDefinition cube_r3 = bottom_legs_average_long_3_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(83, 311).addBox(-1.0189F, -0.4691F, -4.8368F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -2.3368F, -0.0309F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_long_3_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_average_long_3_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_average_long_3_bottom_back_right_individual = bottom_legs_average_long_3_bottom_back_right.addOrReplaceChild("bottom_legs_average_long_3_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 2.3037F, -0.007F));

            PartDefinition cube_r4 = bottom_legs_average_long_3_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(93, 313).addBox(-1.0189F, -0.4691F, -4.8368F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -2.3368F, -0.0309F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("short") && variation == 1) {
            PartDefinition bottom_legs_thick_short_1_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_thick_short_1_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_short_1_bottom_front_left_individual = bottom_legs_thick_short_1_bottom_front_left.addOrReplaceChild("bottom_legs_thick_short_1_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 0.8468F, -0.1463F));

            PartDefinition cube_r1 = bottom_legs_thick_short_1_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 340).addBox(-1.0189F, -1.1115F, -1.7977F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -0.7977F, 0.1115F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_short_1_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_thick_short_1_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_short_1_bottom_front_right_individual = bottom_legs_thick_short_1_bottom_front_right.addOrReplaceChild("bottom_legs_thick_short_1_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 0.8468F, -0.1463F));

            PartDefinition cube_r2 = bottom_legs_thick_short_1_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 340).addBox(-1.0189F, -1.1115F, -1.7977F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -0.7977F, 0.1115F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_short_1_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_thick_short_1_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_short_1_bottom_back_left_individual = bottom_legs_thick_short_1_bottom_back_left.addOrReplaceChild("bottom_legs_thick_short_1_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 0.8468F, -0.1463F));

            PartDefinition cube_r3 = bottom_legs_thick_short_1_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 348).addBox(-1.0189F, -1.1115F, -1.7977F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -0.7977F, 0.1115F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_short_1_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_thick_short_1_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_short_1_bottom_back_right_individual = bottom_legs_thick_short_1_bottom_back_right.addOrReplaceChild("bottom_legs_thick_short_1_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 0.8468F, -0.1463F));

            PartDefinition cube_r4 = bottom_legs_thick_short_1_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(8, 348).addBox(-1.0189F, -1.1115F, -1.7977F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -0.7977F, 0.1115F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("short") && variation == 2) {
            PartDefinition bottom_legs_thick_short_2_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_thick_short_2_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_short_2_bottom_front_left_individual = bottom_legs_thick_short_2_bottom_front_left.addOrReplaceChild("bottom_legs_thick_short_2_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0025F, 0.668F, 0.0508F));

            PartDefinition cube_r1 = bottom_legs_thick_short_2_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 339).addBox(-1.0025F, -1.0221F, -1.887F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0025F, -0.887F, 0.0221F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_short_2_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_thick_short_2_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_short_2_bottom_front_right_individual = bottom_legs_thick_short_2_bottom_front_right.addOrReplaceChild("bottom_legs_thick_short_2_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0025F, 0.668F, 0.0508F));

            PartDefinition cube_r2 = bottom_legs_thick_short_2_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(29, 341).addBox(-1.0025F, -1.0221F, -1.887F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0025F, -0.887F, 0.0221F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_short_2_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_thick_short_2_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_short_2_bottom_back_left_individual = bottom_legs_thick_short_2_bottom_back_left.addOrReplaceChild("bottom_legs_thick_short_2_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0025F, 0.668F, 0.0508F));

            PartDefinition cube_r3 = bottom_legs_thick_short_2_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(20, 348).addBox(-1.0025F, -1.0221F, -1.887F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0025F, -0.887F, 0.0221F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_short_2_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_thick_short_2_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_short_2_bottom_back_right_individual = bottom_legs_thick_short_2_bottom_back_right.addOrReplaceChild("bottom_legs_thick_short_2_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0025F, 0.668F, 0.0508F));

            PartDefinition cube_r4 = bottom_legs_thick_short_2_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(29, 350).addBox(-1.0025F, -1.0221F, -1.887F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0025F, -0.887F, 0.0221F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("short") && variation == 3) {
            PartDefinition bottom_legs_thick_short_3_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_thick_short_3_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_short_3_bottom_front_left_individual = bottom_legs_thick_short_3_bottom_front_left.addOrReplaceChild("bottom_legs_thick_short_3_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.2478F, -0.0152F));

            PartDefinition cube_r1 = bottom_legs_thick_short_3_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(38, 338).addBox(-1.0189F, -1.0221F, -2.7809F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.2809F, 0.0221F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_short_3_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_thick_short_3_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_short_3_bottom_front_right_individual = bottom_legs_thick_short_3_bottom_front_right.addOrReplaceChild("bottom_legs_thick_short_3_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.2478F, -0.0152F));

            PartDefinition cube_r2 = bottom_legs_thick_short_3_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(47, 340).addBox(-1.0189F, -1.0221F, -2.7809F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.2809F, 0.0221F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_short_3_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_thick_short_3_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_short_3_bottom_back_left_individual = bottom_legs_thick_short_3_bottom_back_left.addOrReplaceChild("bottom_legs_thick_short_3_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.2478F, -0.0152F));

            PartDefinition cube_r3 = bottom_legs_thick_short_3_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(38, 348).addBox(-1.0189F, -1.0221F, -2.7809F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.2809F, 0.0221F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_short_3_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_thick_short_3_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_short_3_bottom_back_right_individual = bottom_legs_thick_short_3_bottom_back_right.addOrReplaceChild("bottom_legs_thick_short_3_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.2478F, -0.0152F));

            PartDefinition cube_r4 = bottom_legs_thick_short_3_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(47, 350).addBox(-1.0189F, -1.0221F, -2.7809F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.2809F, 0.0221F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("average") && variation == 1) {
            PartDefinition bottom_legs_thick_average_1_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_thick_average_1_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_average_1_bottom_front_left_individual = bottom_legs_thick_average_1_bottom_front_left.addOrReplaceChild("bottom_legs_thick_average_1_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 2.3037F, -0.0353F));

            PartDefinition cube_r1 = bottom_legs_thick_average_1_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(59, 337).addBox(-1.0189F, -1.0221F, -3.8535F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -2.3368F, 0.0422F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_average_1_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_thick_average_1_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_average_1_bottom_front_right_individual = bottom_legs_thick_average_1_bottom_front_right.addOrReplaceChild("bottom_legs_thick_average_1_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 2.3037F, -0.0353F));

            PartDefinition cube_r2 = bottom_legs_thick_average_1_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(69, 339).addBox(-1.0189F, -1.0221F, -3.8535F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -2.3368F, 0.0422F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_average_1_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_thick_average_1_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_average_1_bottom_back_left_individual = bottom_legs_thick_average_1_bottom_back_left.addOrReplaceChild("bottom_legs_thick_average_1_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 2.3037F, -0.0353F));

            PartDefinition cube_r3 = bottom_legs_thick_average_1_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(59, 348).addBox(-1.0189F, -1.0221F, -3.8535F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -2.3368F, 0.0422F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_average_1_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_thick_average_1_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_average_1_bottom_back_right_individual = bottom_legs_thick_average_1_bottom_back_right.addOrReplaceChild("bottom_legs_thick_average_1_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 2.3037F, -0.0353F));

            PartDefinition cube_r4 = bottom_legs_thick_average_1_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(69, 350).addBox(-1.0189F, -1.0221F, -3.8535F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -2.3368F, 0.0422F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("average") && variation == 2) {
            PartDefinition bottom_legs_thick_average_2_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_thick_average_2_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_average_2_bottom_front_left_individual = bottom_legs_thick_average_2_bottom_front_left.addOrReplaceChild("bottom_legs_thick_average_2_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0171F, 1.8037F, 0.1229F));

            PartDefinition cube_r1 = bottom_legs_thick_average_2_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(83, 338).addBox(-0.9829F, -1.0221F, -3.8368F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0171F, -1.8368F, 0.0221F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_average_2_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_thick_average_2_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_average_2_bottom_front_right_individual = bottom_legs_thick_average_2_bottom_front_right.addOrReplaceChild("bottom_legs_thick_average_2_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0171F, 1.8037F, 0.1229F));

            PartDefinition cube_r2 = bottom_legs_thick_average_2_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(95, 339).addBox(-0.9829F, -1.0221F, -3.8368F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0171F, -1.8368F, 0.0221F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_average_2_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_thick_average_2_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_average_2_bottom_back_left_individual = bottom_legs_thick_average_2_bottom_back_left.addOrReplaceChild("bottom_legs_thick_average_2_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0171F, 1.8037F, 0.1229F));

            PartDefinition cube_r3 = bottom_legs_thick_average_2_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(83, 350).addBox(-0.9829F, -1.0221F, -3.8368F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0171F, -1.8368F, 0.0221F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_average_2_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_thick_average_2_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_average_2_bottom_back_right_individual = bottom_legs_thick_average_2_bottom_back_right.addOrReplaceChild("bottom_legs_thick_average_2_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0171F, 1.8037F, 0.1229F));

            PartDefinition cube_r4 = bottom_legs_thick_average_2_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(95, 351).addBox(-0.9829F, -1.0221F, -3.8368F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0171F, -1.8368F, 0.0221F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("average") && variation == 3) {
            PartDefinition bottom_legs_thick_average_3_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_thick_average_3_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_average_3_bottom_front_left_individual = bottom_legs_thick_average_3_bottom_front_left.addOrReplaceChild("bottom_legs_thick_average_3_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 2.3186F, -0.0072F));

            PartDefinition cube_r1 = bottom_legs_thick_average_3_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 372).addBox(-1.0F, -0.9944F, -4.8186F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3186F, -0.0056F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_average_3_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_thick_average_3_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_average_3_bottom_front_right_individual = bottom_legs_thick_average_3_bottom_front_right.addOrReplaceChild("bottom_legs_thick_average_3_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 2.3186F, -0.0072F));

            PartDefinition cube_r2 = bottom_legs_thick_average_3_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 369).addBox(-1.0F, -0.9944F, -4.8186F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3186F, -0.0056F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_average_3_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_thick_average_3_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_average_3_bottom_back_left_individual = bottom_legs_thick_average_3_bottom_back_left.addOrReplaceChild("bottom_legs_thick_average_3_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 2.3186F, -0.0072F));

            PartDefinition cube_r3 = bottom_legs_thick_average_3_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 384).addBox(-1.0F, -0.9944F, -4.8186F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3186F, -0.0056F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_average_3_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_thick_average_3_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_average_3_bottom_back_right_individual = bottom_legs_thick_average_3_bottom_back_right.addOrReplaceChild("bottom_legs_thick_average_3_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 2.3186F, -0.0072F));

            PartDefinition cube_r4 = bottom_legs_thick_average_3_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(12, 381).addBox(-1.0F, -0.9944F, -4.8186F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3186F, -0.0056F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("long") && variation == 1) {
            PartDefinition bottom_legs_thick_long_1_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_thick_long_1_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_long_1_bottom_front_left_individual = bottom_legs_thick_long_1_bottom_front_left.addOrReplaceChild("bottom_legs_thick_long_1_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.9098F, 0.0541F));

            PartDefinition cube_r1 = bottom_legs_thick_long_1_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(27, 370).addBox(-1.0189F, -1.0221F, -3.8535F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8535F, 0.0221F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_long_1_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_thick_long_1_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_long_1_bottom_front_right_individual = bottom_legs_thick_long_1_bottom_front_right.addOrReplaceChild("bottom_legs_thick_long_1_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.9098F, 0.0541F));

            PartDefinition cube_r2 = bottom_legs_thick_long_1_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 373).addBox(-1.0189F, -1.0221F, -3.8535F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8535F, 0.0221F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_long_1_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_thick_long_1_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_long_1_bottom_back_left_individual = bottom_legs_thick_long_1_bottom_back_left.addOrReplaceChild("bottom_legs_thick_long_1_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.9098F, 0.0541F));

            PartDefinition cube_r3 = bottom_legs_thick_long_1_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(27, 382).addBox(-1.0189F, -1.0221F, -3.8535F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8535F, 0.0221F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_long_1_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_thick_long_1_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_long_1_bottom_back_right_individual = bottom_legs_thick_long_1_bottom_back_right.addOrReplaceChild("bottom_legs_thick_long_1_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 1.9098F, 0.0541F));

            PartDefinition cube_r4 = bottom_legs_thick_long_1_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 385).addBox(-1.0189F, -1.0221F, -3.8535F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -1.8535F, 0.0221F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("long") && variation == 2) {
            PartDefinition bottom_legs_thick_long_2_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_thick_long_2_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_long_2_bottom_front_left_individual = bottom_legs_thick_long_2_bottom_front_left.addOrReplaceChild("bottom_legs_thick_long_2_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 2.8018F, -0.0072F));

            PartDefinition cube_r1 = bottom_legs_thick_long_2_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(50, 376).addBox(-1.0F, -0.9944F, -5.8912F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8912F, -0.0056F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_long_2_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_thick_long_2_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_long_2_bottom_front_right_individual = bottom_legs_thick_long_2_bottom_front_right.addOrReplaceChild("bottom_legs_thick_long_2_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 2.8018F, -0.0072F));

            PartDefinition cube_r2 = bottom_legs_thick_long_2_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(64, 379).addBox(-1.0F, -0.9944F, -5.8912F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8912F, -0.0056F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_long_2_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_thick_long_2_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_long_2_bottom_back_left_individual = bottom_legs_thick_long_2_bottom_back_left.addOrReplaceChild("bottom_legs_thick_long_2_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 2.8018F, -0.0072F));

            PartDefinition cube_r3 = bottom_legs_thick_long_2_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(50, 389).addBox(-1.0F, -0.9944F, -5.8912F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8912F, -0.0056F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_long_2_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_thick_long_2_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_long_2_bottom_back_right_individual = bottom_legs_thick_long_2_bottom_back_right.addOrReplaceChild("bottom_legs_thick_long_2_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 2.8018F, -0.0072F));

            PartDefinition cube_r4 = bottom_legs_thick_long_2_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(64, 392).addBox(-1.0F, -0.9944F, -5.8912F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8912F, -0.0056F, 1.5708F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("long") && variation == 3) {
            PartDefinition bottom_legs_thick_long_3_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_legs_thick_long_3_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_long_3_bottom_front_left_individual = bottom_legs_thick_long_3_bottom_front_left.addOrReplaceChild("bottom_legs_thick_long_3_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 2.3037F, -0.0353F));

            PartDefinition cube_r1 = bottom_legs_thick_long_3_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(83, 374).addBox(-1.0189F, -0.9327F, -4.8368F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -2.3368F, -0.0673F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_long_3_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_legs_thick_long_3_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_long_3_bottom_front_right_individual = bottom_legs_thick_long_3_bottom_front_right.addOrReplaceChild("bottom_legs_thick_long_3_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 2.3037F, -0.0353F));

            PartDefinition cube_r2 = bottom_legs_thick_long_3_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(92, 371).addBox(-1.0189F, -0.9327F, -4.8368F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -2.3368F, -0.0673F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_long_3_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_legs_thick_long_3_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_long_3_bottom_back_left_individual = bottom_legs_thick_long_3_bottom_back_left.addOrReplaceChild("bottom_legs_thick_long_3_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 2.3037F, -0.0353F));

            PartDefinition cube_r3 = bottom_legs_thick_long_3_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(83, 387).addBox(-1.0189F, -0.9327F, -4.8368F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -2.3368F, -0.0673F, 1.5708F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_long_3_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_legs_thick_long_3_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_legs_thick_long_3_bottom_back_right_individual = bottom_legs_thick_long_3_bottom_back_right.addOrReplaceChild("bottom_legs_thick_long_3_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0189F, 2.3037F, -0.0353F));

            PartDefinition cube_r4 = bottom_legs_thick_long_3_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(92, 384).addBox(-1.0189F, -0.9327F, -4.8368F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0189F, -2.3368F, -0.0673F, 1.5708F, 0.0F, 0.0F));

        } else {
            EquigenMod.LOGGER.error("Invalid Part: Upper Bottom Leg / " + length + " / " + thickness + ", Cancelling Generation...");
        }
        return new PartDefinition[]{rootForeLegLeft, rootForeLegRight, rootHindLegLeft, rootHindLegRight};
    }

    public static PartDefinition[] GenerateLower(PartDefinition rootForeLegLeft, PartDefinition rootForeLegRight, PartDefinition rootHindLegLeft, PartDefinition rootHindLegRight, String thickness, String length, int variation) {
        if (thickness.equals("thin") && length.equals("short") && variation == 1) {
            PartDefinition bottom_2_legs_thin_short_1_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_thin_short_1_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_short_1_bottom_front_left_individual = bottom_2_legs_thin_short_1_bottom_front_left.addOrReplaceChild("bottom_2_legs_thin_short_1_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 0.7146F, -0.5185F));

            PartDefinition cube_r1 = bottom_2_legs_thin_short_1_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(10, 200).addBox(-0.5363F, -0.4237F, -1.9046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0363F, -0.804F, 0.4217F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bone = bottom_2_legs_thin_short_1_bottom_front_left_individual.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_short_1_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_thin_short_1_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_short_1_bottom_front_right_individual = bottom_2_legs_thin_short_1_bottom_front_right.addOrReplaceChild("bottom_2_legs_thin_short_1_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 0.7146F, -0.5185F));

            PartDefinition cube_r2 = bottom_2_legs_thin_short_1_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 206).addBox(-0.5363F, -0.4237F, -1.9046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0363F, -0.804F, 0.4217F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_short_1_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_thin_short_1_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_short_1_bottom_back_left_individual = bottom_2_legs_thin_short_1_bottom_back_left.addOrReplaceChild("bottom_2_legs_thin_short_1_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 0.7146F, -0.5185F));

            PartDefinition cube_r3 = bottom_2_legs_thin_short_1_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(10, 206).addBox(-0.5363F, -0.4237F, -1.9046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0363F, -0.804F, 0.4217F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_short_1_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_thin_short_1_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_short_1_bottom_back_right_individual = bottom_2_legs_thin_short_1_bottom_back_right.addOrReplaceChild("bottom_2_legs_thin_short_1_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 0.7146F, -0.5185F));

            PartDefinition cube_r4 = bottom_2_legs_thin_short_1_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(16, 200).addBox(-0.5363F, -0.4237F, -1.9046F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0363F, -0.804F, 0.4217F, 1.0036F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("short") && variation == 2) {
            PartDefinition bottom_2_legs_thin_short_2_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_thin_short_2_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_short_2_bottom_front_left_individual = bottom_2_legs_thin_short_2_bottom_front_left.addOrReplaceChild("bottom_2_legs_thin_short_2_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0974F, -0.7156F));

            PartDefinition cube_r1 = bottom_2_legs_thin_short_2_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(27, 200).addBox(-0.5F, -0.4438F, -2.8713F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1867F, 0.6894F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_short_2_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_thin_short_2_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_short_2_bottom_front_right_individual = bottom_2_legs_thin_short_2_bottom_front_right.addOrReplaceChild("bottom_2_legs_thin_short_2_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0974F, -0.7156F));

            PartDefinition cube_r2 = bottom_2_legs_thin_short_2_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(35, 200).addBox(-0.5F, -0.4438F, -2.8713F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1867F, 0.6894F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_short_2_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_thin_short_2_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_short_2_bottom_back_left_individual = bottom_2_legs_thin_short_2_bottom_back_left.addOrReplaceChild("bottom_2_legs_thin_short_2_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0974F, -0.7156F));

            PartDefinition cube_r3 = bottom_2_legs_thin_short_2_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(27, 207).addBox(-0.5F, -0.4438F, -2.8713F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1867F, 0.6894F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_short_2_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_thin_short_2_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_short_2_bottom_back_right_individual = bottom_2_legs_thin_short_2_bottom_back_right.addOrReplaceChild("bottom_2_legs_thin_short_2_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0974F, -0.7156F));

            PartDefinition cube_r4 = bottom_2_legs_thin_short_2_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(35, 207).addBox(-0.5F, -0.4438F, -2.8713F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1867F, 0.6894F, 1.0036F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("short") && variation == 3) {
            PartDefinition bottom_2_legs_thin_short_3_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_thin_short_3_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_short_3_bottom_front_left_individual = bottom_2_legs_thin_short_3_bottom_front_left.addOrReplaceChild("bottom_2_legs_thin_short_3_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.1867F, -0.739F));

            PartDefinition cube_r1 = bottom_2_legs_thin_short_3_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(46, 200).addBox(-0.4811F, -0.4711F, -2.9947F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.2761F, 0.7787F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_short_3_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_thin_short_3_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_short_3_bottom_front_right_individual = bottom_2_legs_thin_short_3_bottom_front_right.addOrReplaceChild("bottom_2_legs_thin_short_3_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.1867F, -0.739F));

            PartDefinition cube_r2 = bottom_2_legs_thin_short_3_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(54, 200).addBox(-0.6257F, -0.4711F, -2.9947F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1257F, -1.2761F, 0.7787F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_short_3_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_thin_short_3_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_short_3_bottom_back_left_individual = bottom_2_legs_thin_short_3_bottom_back_left.addOrReplaceChild("bottom_2_legs_thin_short_3_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.1867F, -0.739F));

            PartDefinition cube_r3 = bottom_2_legs_thin_short_3_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(46, 208).addBox(-0.4811F, -0.4711F, -2.9947F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.2761F, 0.7787F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_short_3_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_thin_short_3_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_short_3_bottom_back_right_individual = bottom_2_legs_thin_short_3_bottom_back_right.addOrReplaceChild("bottom_2_legs_thin_short_3_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.1867F, -0.739F));

            PartDefinition cube_r4 = bottom_2_legs_thin_short_3_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(54, 208).addBox(-0.4811F, -0.4711F, -2.9947F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.2761F, 0.7787F, 1.0036F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("average") && variation == 1) {
            PartDefinition bottom_2_legs_thin_average_1_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_thin_average_1_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_average_1_bottom_front_left_individual = bottom_2_legs_thin_average_1_bottom_front_left.addOrReplaceChild("bottom_2_legs_thin_average_1_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.246F, -0.7556F));

            PartDefinition cube_r1 = bottom_2_legs_thin_average_1_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(65, 196).addBox(-0.4811F, -0.5191F, -2.8836F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.1566F, 0.7595F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_average_1_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_thin_average_1_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_average_1_bottom_front_right_individual = bottom_2_legs_thin_average_1_bottom_front_right.addOrReplaceChild("bottom_2_legs_thin_average_1_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.246F, -0.7556F));

            PartDefinition cube_r2 = bottom_2_legs_thin_average_1_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(75, 196).addBox(-0.4811F, -0.5191F, -2.8836F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.1566F, 0.7595F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_average_1_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_thin_average_1_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_average_1_bottom_back_left_individual = bottom_2_legs_thin_average_1_bottom_back_left.addOrReplaceChild("bottom_2_legs_thin_average_1_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.246F, -0.7556F));

            PartDefinition cube_r3 = bottom_2_legs_thin_average_1_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(65, 205).addBox(-0.4811F, -0.5191F, -2.8836F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.1566F, 0.7595F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_average_1_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_thin_average_1_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_average_1_bottom_back_right_individual = bottom_2_legs_thin_average_1_bottom_back_right.addOrReplaceChild("bottom_2_legs_thin_average_1_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.246F, -0.7556F));

            PartDefinition cube_r4 = bottom_2_legs_thin_average_1_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(75, 205).addBox(-0.4811F, -0.5191F, -2.8836F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.1566F, 0.7595F, 1.0036F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("average") && variation == 2) {
            PartDefinition bottom_2_legs_thin_average_2_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_thin_average_2_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_average_2_bottom_front_left_individual = bottom_2_legs_thin_average_2_bottom_front_left.addOrReplaceChild("bottom_2_legs_thin_average_2_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0171F, 1.8085F, -0.787F));

            PartDefinition cube_r1 = bottom_2_legs_thin_average_2_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(86, 199).addBox(-0.5171F, -0.4825F, -3.9873F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0171F, -1.8085F, 0.824F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_average_2_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_thin_average_2_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_average_2_bottom_front_right_individual = bottom_2_legs_thin_average_2_bottom_front_right.addOrReplaceChild("bottom_2_legs_thin_average_2_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0171F, 1.8085F, -0.787F));

            PartDefinition cube_r2 = bottom_2_legs_thin_average_2_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(96, 199).addBox(-0.5171F, -0.4825F, -3.9873F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0171F, -1.8085F, 0.824F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_average_2_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_thin_average_2_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_average_2_bottom_back_left_individual = bottom_2_legs_thin_average_2_bottom_back_left.addOrReplaceChild("bottom_2_legs_thin_average_2_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0171F, 1.8321F, -0.772F));

            PartDefinition cube_r3 = bottom_2_legs_thin_average_2_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(86, 209).addBox(-0.5171F, -0.4825F, -4.0133F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0171F, -1.8321F, 0.835F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_average_2_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_thin_average_2_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_average_2_bottom_back_right_individual = bottom_2_legs_thin_average_2_bottom_back_right.addOrReplaceChild("bottom_2_legs_thin_average_2_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0171F, 1.8321F, -0.772F));

            PartDefinition cube_r4 = bottom_2_legs_thin_average_2_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(96, 209).addBox(-0.5171F, -0.4825F, -4.0133F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0171F, -1.8321F, 0.835F, 1.1345F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("average") && variation == 3) {
            PartDefinition bottom_2_legs_thin_average_3_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_thin_average_3_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_average_3_bottom_front_left_individual = bottom_2_legs_thin_average_3_bottom_front_left.addOrReplaceChild("bottom_2_legs_thin_average_3_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.005F, 1.8311F, -0.7835F));

            PartDefinition cube_r1 = bottom_2_legs_thin_average_3_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(7, 228).addBox(-0.505F, -0.4232F, -3.0644F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.005F, -0.9971F, 0.3803F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_average_3_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_thin_average_3_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_average_3_bottom_front_right_individual = bottom_2_legs_thin_average_3_bottom_front_right.addOrReplaceChild("bottom_2_legs_thin_average_3_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0171F, 1.8321F, -0.772F));

            PartDefinition cube_r2 = bottom_2_legs_thin_average_3_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(17, 228).addBox(-0.5171F, -0.4825F, -4.0133F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0171F, -1.8321F, 0.835F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_average_3_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_thin_average_3_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_average_3_bottom_back_left_individual = bottom_2_legs_thin_average_3_bottom_back_left.addOrReplaceChild("bottom_2_legs_thin_average_3_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0171F, 1.8321F, -0.772F));

            PartDefinition cube_r3 = bottom_2_legs_thin_average_3_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(7, 238).addBox(-0.5171F, -0.4825F, -4.0133F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0171F, -1.8321F, 0.835F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_average_3_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_thin_average_3_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_average_3_bottom_back_right_individual = bottom_2_legs_thin_average_3_bottom_back_right.addOrReplaceChild("bottom_2_legs_thin_average_3_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0171F, 1.8321F, -0.772F));

            PartDefinition cube_r4 = bottom_2_legs_thin_average_3_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(17, 238).addBox(-0.5171F, -0.4825F, -4.0133F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0171F, -1.8321F, 0.835F, 1.1345F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("long") && variation == 1) {
            PartDefinition bottom_2_legs_thin_long_1_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_thin_long_1_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_long_1_bottom_front_left_individual = bottom_2_legs_thin_long_1_bottom_front_left.addOrReplaceChild("bottom_2_legs_thin_long_1_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.7164F, -0.8868F));

            PartDefinition cube_r1 = bottom_2_legs_thin_long_1_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(32, 228).addBox(-0.4811F, -0.5431F, -3.8567F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.627F, 0.8955F, 1.0908F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_long_1_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_thin_long_1_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_long_1_bottom_front_right_individual = bottom_2_legs_thin_long_1_bottom_front_right.addOrReplaceChild("bottom_2_legs_thin_long_1_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.7164F, -0.8868F));

            PartDefinition cube_r2 = bottom_2_legs_thin_long_1_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(42, 228).addBox(-0.4811F, -0.5431F, -3.8567F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.627F, 0.8955F, 1.0908F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_long_1_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_thin_long_1_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_long_1_bottom_back_left_individual = bottom_2_legs_thin_long_1_bottom_back_left.addOrReplaceChild("bottom_2_legs_thin_long_1_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.7164F, -0.8868F));

            PartDefinition cube_r3 = bottom_2_legs_thin_long_1_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(32, 238).addBox(-0.4811F, -0.5431F, -3.8567F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.627F, 0.8955F, 1.0908F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_long_1_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_thin_long_1_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_long_1_bottom_back_right_individual = bottom_2_legs_thin_long_1_bottom_back_right.addOrReplaceChild("bottom_2_legs_thin_long_1_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.7164F, -0.8868F));

            PartDefinition cube_r4 = bottom_2_legs_thin_long_1_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(42, 238).addBox(-0.4811F, -0.5431F, -3.8567F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.627F, 0.8955F, 1.0908F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("long") && variation == 2) {
            PartDefinition bottom_2_legs_thin_long_2_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_thin_long_2_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_long_2_bottom_front_left_individual = bottom_2_legs_thin_long_2_bottom_front_left.addOrReplaceChild("bottom_2_legs_thin_long_2_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.005F, 1.2125F, -0.4585F));

            PartDefinition cube_r1 = bottom_2_legs_thin_long_2_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(57, 224).addBox(-0.505F, -0.498F, -2.904F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.005F, -1.2733F, 0.5916F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_long_2_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_thin_long_2_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_long_2_bottom_front_right_individual = bottom_2_legs_thin_long_2_bottom_front_right.addOrReplaceChild("bottom_2_legs_thin_long_2_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.005F, 1.2125F, -0.4585F));

            PartDefinition cube_r2 = bottom_2_legs_thin_long_2_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(71, 224).addBox(-0.6294F, -0.498F, -2.904F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1294F, -1.2733F, 0.5916F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_long_2_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_thin_long_2_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_long_2_bottom_back_left_individual = bottom_2_legs_thin_long_2_bottom_back_left.addOrReplaceChild("bottom_2_legs_thin_long_2_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.005F, 1.2125F, -0.4585F));

            PartDefinition cube_r3 = bottom_2_legs_thin_long_2_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(57, 235).addBox(-0.505F, -0.498F, -2.904F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.005F, -1.2733F, 0.5916F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_long_2_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_thin_long_2_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_long_2_bottom_back_right_individual = bottom_2_legs_thin_long_2_bottom_back_right.addOrReplaceChild("bottom_2_legs_thin_long_2_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.005F, 1.2125F, -0.4585F));

            PartDefinition cube_r4 = bottom_2_legs_thin_long_2_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(71, 235).addBox(-0.505F, -0.498F, -2.904F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.005F, -1.2733F, 0.5916F, 1.1345F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("long") && variation == 3) {
            PartDefinition bottom_2_legs_thin_long_3_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_thin_long_3_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_long_3_bottom_front_left_individual = bottom_2_legs_thin_long_3_bottom_front_left.addOrReplaceChild("bottom_2_legs_thin_long_3_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.627F, -0.8868F));

            PartDefinition cube_r1 = bottom_2_legs_thin_long_3_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(85, 231).addBox(-0.4811F, -0.5018F, -3.9359F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.7164F, 0.8955F, 1.0908F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_long_3_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_thin_long_3_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_long_3_bottom_front_right_individual = bottom_2_legs_thin_long_3_bottom_front_right.addOrReplaceChild("bottom_2_legs_thin_long_3_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.627F, -0.8868F));

            PartDefinition cube_r2 = bottom_2_legs_thin_long_3_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(97, 231).addBox(-0.4811F, -0.5018F, -3.9359F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.7164F, 0.8955F, 1.0908F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_long_3_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_thin_long_3_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_long_3_bottom_back_left_individual = bottom_2_legs_thin_long_3_bottom_back_left.addOrReplaceChild("bottom_2_legs_thin_long_3_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.627F, -0.8868F));

            PartDefinition cube_r3 = bottom_2_legs_thin_long_3_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(85, 242).addBox(-0.4811F, -0.5018F, -3.9359F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.7164F, 0.8955F, 1.0908F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_long_3_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_thin_long_3_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thin_long_3_bottom_back_right_individual = bottom_2_legs_thin_long_3_bottom_back_right.addOrReplaceChild("bottom_2_legs_thin_long_3_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.627F, -0.8868F));

            PartDefinition cube_r4 = bottom_2_legs_thin_long_3_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(97, 242).addBox(-0.4811F, -0.5018F, -3.9359F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.7164F, 0.8955F, 1.0908F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("short") && variation == 1) {
            PartDefinition bottom_2_legs_average_short_1_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_average_short_1_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_short_1_bottom_front_left_individual = bottom_2_legs_average_short_1_bottom_front_left.addOrReplaceChild("bottom_2_legs_average_short_1_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 0.6252F, -0.6079F));

            PartDefinition cube_r1 = bottom_2_legs_average_short_1_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 273).addBox(-0.9811F, -0.4237F, -1.9046F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -0.804F, 0.4217F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_short_1_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_average_short_1_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_short_1_bottom_front_right_individual = bottom_2_legs_average_short_1_bottom_front_right.addOrReplaceChild("bottom_2_legs_average_short_1_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 0.6252F, -0.6079F));

            PartDefinition cube_r2 = bottom_2_legs_average_short_1_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(9, 274).addBox(-0.9811F, -0.4237F, -1.9046F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -0.804F, 0.4217F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_short_1_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_average_short_1_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_short_1_bottom_back_left_individual = bottom_2_legs_average_short_1_bottom_back_left.addOrReplaceChild("bottom_2_legs_average_short_1_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 0.6252F, -0.6079F));

            PartDefinition cube_r3 = bottom_2_legs_average_short_1_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 279).addBox(-0.9811F, -0.4237F, -1.9046F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -0.804F, 0.4217F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_short_1_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_average_short_1_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_short_1_bottom_back_right_individual = bottom_2_legs_average_short_1_bottom_back_right.addOrReplaceChild("bottom_2_legs_average_short_1_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 0.6252F, -0.6079F));

            PartDefinition cube_r4 = bottom_2_legs_average_short_1_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(9, 280).addBox(-0.9811F, -0.4237F, -1.9046F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -0.804F, 0.4217F, 1.0036F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("short") && variation == 2) {
            PartDefinition bottom_2_legs_average_short_2_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_average_short_2_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_short_2_bottom_front_left_individual = bottom_2_legs_average_short_2_bottom_front_left.addOrReplaceChild("bottom_2_legs_average_short_2_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0025F, 1.1867F, -0.7156F));

            PartDefinition cube_r1 = bottom_2_legs_average_short_2_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(21, 270).addBox(-0.9975F, -0.4438F, -2.8713F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0025F, -1.1867F, 0.6894F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_short_2_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_average_short_2_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_short_2_bottom_front_right_individual = bottom_2_legs_average_short_2_bottom_front_right.addOrReplaceChild("bottom_2_legs_average_short_2_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0025F, 1.1867F, -0.7156F));

            PartDefinition cube_r2 = bottom_2_legs_average_short_2_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(29, 272).addBox(-0.9975F, -0.4438F, -2.8713F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0025F, -1.1867F, 0.6894F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_short_2_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_average_short_2_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_short_2_bottom_back_left_individual = bottom_2_legs_average_short_2_bottom_back_left.addOrReplaceChild("bottom_2_legs_average_short_2_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0025F, 1.1867F, -0.7156F));

            PartDefinition cube_r3 = bottom_2_legs_average_short_2_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(21, 277).addBox(-0.9975F, -0.4438F, -2.8713F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0025F, -1.1867F, 0.6894F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_short_2_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_average_short_2_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_short_2_bottom_back_right_individual = bottom_2_legs_average_short_2_bottom_back_right.addOrReplaceChild("bottom_2_legs_average_short_2_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0025F, 1.1867F, -0.7156F));

            PartDefinition cube_r4 = bottom_2_legs_average_short_2_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(29, 279).addBox(-0.9975F, -0.4438F, -2.8713F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0025F, -1.1867F, 0.6894F, 1.0036F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("short") && variation == 3) {
            PartDefinition bottom_2_legs_average_short_3_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_average_short_3_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_short_3_bottom_front_left_individual = bottom_2_legs_average_short_3_bottom_front_left.addOrReplaceChild("bottom_2_legs_average_short_3_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 0.9186F, -0.739F));

            PartDefinition cube_r1 = bottom_2_legs_average_short_3_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(40, 272).addBox(-0.9811F, -0.4711F, -2.9947F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.2761F, 0.7787F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_short_3_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_average_short_3_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_short_3_bottom_front_right_individual = bottom_2_legs_average_short_3_bottom_front_right.addOrReplaceChild("bottom_2_legs_average_short_3_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 0.9186F, -0.739F));

            PartDefinition cube_r2 = bottom_2_legs_average_short_3_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(48, 274).addBox(-0.9811F, -0.4711F, -2.9947F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.2761F, 0.7787F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_short_3_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_average_short_3_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_short_3_bottom_back_left_individual = bottom_2_legs_average_short_3_bottom_back_left.addOrReplaceChild("bottom_2_legs_average_short_3_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 0.9186F, -0.739F));

            PartDefinition cube_r3 = bottom_2_legs_average_short_3_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(40, 280).addBox(-0.9811F, -0.4711F, -2.9947F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.2761F, 0.7787F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_short_3_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_average_short_3_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_short_3_bottom_back_right_individual = bottom_2_legs_average_short_3_bottom_back_right.addOrReplaceChild("bottom_2_legs_average_short_3_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 0.9186F, -0.739F));

            PartDefinition cube_r4 = bottom_2_legs_average_short_3_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(48, 282).addBox(-0.9811F, -0.4711F, -2.9947F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.2761F, 0.7787F, 1.0036F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("average") && variation == 1) {
            PartDefinition bottom_2_legs_average_average_1_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_average_average_1_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_average_1_bottom_front_left_individual = bottom_2_legs_average_average_1_bottom_front_left.addOrReplaceChild("bottom_2_legs_average_average_1_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.1867F, -0.739F));

            PartDefinition cube_r1 = bottom_2_legs_average_average_1_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(63, 271).addBox(-0.9811F, -0.5191F, -2.9193F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.1867F, 0.7787F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_average_1_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_average_average_1_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_average_1_bottom_front_right_individual = bottom_2_legs_average_average_1_bottom_front_right.addOrReplaceChild("bottom_2_legs_average_average_1_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.1867F, -0.739F));

            PartDefinition cube_r2 = bottom_2_legs_average_average_1_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(72, 273).addBox(-0.9811F, -0.5191F, -2.9193F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.1867F, 0.7787F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_average_1_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_average_average_1_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_average_1_bottom_back_left_individual = bottom_2_legs_average_average_1_bottom_back_left.addOrReplaceChild("bottom_2_legs_average_average_1_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.1867F, -0.739F));

            PartDefinition cube_r3 = bottom_2_legs_average_average_1_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(63, 280).addBox(-0.9811F, -0.5191F, -2.9193F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.1867F, 0.7787F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_average_1_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_average_average_1_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_average_1_bottom_back_right_individual = bottom_2_legs_average_average_1_bottom_back_right.addOrReplaceChild("bottom_2_legs_average_average_1_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.1867F, -0.739F));

            PartDefinition cube_r4 = bottom_2_legs_average_average_1_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(72, 282).addBox(-0.9811F, -0.5191F, -2.9193F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.1867F, 0.7787F, 1.0036F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("average") && variation == 2) {
            PartDefinition bottom_2_legs_average_average_2_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_average_average_2_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_average_2_bottom_front_left_individual = bottom_2_legs_average_average_2_bottom_front_left.addOrReplaceChild("bottom_2_legs_average_average_2_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0171F, 1.8321F, -0.772F));

            PartDefinition cube_r1 = bottom_2_legs_average_average_2_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(85, 273).addBox(-1.0171F, -0.4825F, -4.0133F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0171F, -1.8321F, 0.835F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_average_2_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_average_average_2_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_average_2_bottom_front_right_individual = bottom_2_legs_average_average_2_bottom_front_right.addOrReplaceChild("bottom_2_legs_average_average_2_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0171F, 1.8321F, -0.772F));

            PartDefinition cube_r2 = bottom_2_legs_average_average_2_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(94, 275).addBox(-1.0171F, -0.4825F, -4.0133F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0171F, -1.8321F, 0.835F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_average_2_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_average_average_2_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_average_2_bottom_back_left_individual = bottom_2_legs_average_average_2_bottom_back_left.addOrReplaceChild("bottom_2_legs_average_average_2_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0171F, 1.8321F, -0.772F));

            PartDefinition cube_r3 = bottom_2_legs_average_average_2_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(85, 283).addBox(-1.0171F, -0.4825F, -4.0133F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0171F, -1.8321F, 0.835F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_average_2_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_average_average_2_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_average_2_bottom_back_right_individual = bottom_2_legs_average_average_2_bottom_back_right.addOrReplaceChild("bottom_2_legs_average_average_2_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0171F, 1.8321F, -0.772F));

            PartDefinition cube_r4 = bottom_2_legs_average_average_2_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(94, 285).addBox(-1.0171F, -0.4825F, -4.0133F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0171F, -1.8321F, 0.835F, 1.1345F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("average") && variation == 3) {
            PartDefinition bottom_2_legs_average_average_3_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_average_average_3_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_average_3_bottom_front_left_individual = bottom_2_legs_average_average_3_bottom_front_left.addOrReplaceChild("bottom_2_legs_average_average_3_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.005F, 1.301F, -0.5502F));

            PartDefinition cube_r1 = bottom_2_legs_average_average_3_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(4, 301).addBox(-1.005F, -0.4232F, -3.0644F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.005F, -1.4503F, 0.5916F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_average_3_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_average_average_3_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_average_3_bottom_front_right_individual = bottom_2_legs_average_average_3_bottom_front_right.addOrReplaceChild("bottom_2_legs_average_average_3_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.005F, 1.301F, -0.5502F));

            PartDefinition cube_r2 = bottom_2_legs_average_average_3_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 303).addBox(-1.005F, -0.4232F, -3.0644F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.005F, -1.4503F, 0.5916F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_average_3_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_average_average_3_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_average_3_bottom_back_left_individual = bottom_2_legs_average_average_3_bottom_back_left.addOrReplaceChild("bottom_2_legs_average_average_3_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_back_left_average_average_3 = bottom_2_legs_average_average_3_bottom_back_left_individual.addOrReplaceChild("bottom_2_back_left_average_average_3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.0302F));

            PartDefinition cube_r3 = bottom_2_back_left_average_average_3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(4, 311).addBox(-1.005F, -0.4232F, -3.0644F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1493F, 0.0716F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_average_3_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_average_average_3_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_average_3_bottom_back_right_individual = bottom_2_legs_average_average_3_bottom_back_right.addOrReplaceChild("bottom_2_legs_average_average_3_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.005F, 1.301F, -0.5502F));

            PartDefinition cube_r4 = bottom_2_legs_average_average_3_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(14, 313).addBox(-1.005F, -0.4232F, -3.0644F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.005F, -1.4503F, 0.5916F, 1.1345F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("long") && variation == 1) {
            PartDefinition bottom_2_legs_average_long_1_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_average_long_1_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_long_1_bottom_front_left_individual = bottom_2_legs_average_long_1_bottom_front_left.addOrReplaceChild("bottom_2_legs_average_long_1_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.627F, -0.8868F));

            PartDefinition cube_r1 = bottom_2_legs_average_long_1_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(31, 303).addBox(-0.9811F, -0.5431F, -3.8567F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.627F, 0.8955F, 1.0908F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_long_1_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_average_long_1_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_long_1_bottom_front_right_individual = bottom_2_legs_average_long_1_bottom_front_right.addOrReplaceChild("bottom_2_legs_average_long_1_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.627F, -0.8868F));

            PartDefinition cube_r2 = bottom_2_legs_average_long_1_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(40, 305).addBox(-0.9811F, -0.5431F, -3.8567F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.627F, 0.8955F, 1.0908F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_long_1_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_average_long_1_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_long_1_bottom_back_left_individual = bottom_2_legs_average_long_1_bottom_back_left.addOrReplaceChild("bottom_2_legs_average_long_1_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.627F, -0.8868F));

            PartDefinition cube_r3 = bottom_2_legs_average_long_1_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(31, 313).addBox(-0.9811F, -0.5431F, -3.8567F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.627F, 0.8955F, 1.0908F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_long_1_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_average_long_1_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_long_1_bottom_back_right_individual = bottom_2_legs_average_long_1_bottom_back_right.addOrReplaceChild("bottom_2_legs_average_long_1_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.627F, -0.8868F));

            PartDefinition cube_r4 = bottom_2_legs_average_long_1_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 315).addBox(-0.9811F, -0.5431F, -3.8567F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.627F, 0.8955F, 1.0908F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("long") && variation == 2) {
            PartDefinition bottom_2_legs_average_long_2_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_average_long_2_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_long_2_bottom_front_left_individual = bottom_2_legs_average_long_2_bottom_front_left.addOrReplaceChild("bottom_2_legs_average_long_2_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.005F, 1.2125F, -0.4608F));

            PartDefinition cube_r1 = bottom_2_legs_average_long_2_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(58, 301).addBox(-1.005F, -0.498F, -2.904F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.005F, -1.2733F, 0.5916F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_long_2_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_average_long_2_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_long_2_bottom_front_right_individual = bottom_2_legs_average_long_2_bottom_front_right.addOrReplaceChild("bottom_2_legs_average_long_2_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.005F, 1.2125F, -0.4608F));

            PartDefinition cube_r2 = bottom_2_legs_average_long_2_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(69, 299).addBox(-1.005F, -0.498F, -2.904F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.005F, -1.2733F, 0.5916F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_long_2_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_average_long_2_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_long_2_bottom_back_left_individual = bottom_2_legs_average_long_2_bottom_back_left.addOrReplaceChild("bottom_2_legs_average_long_2_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.005F, 1.2125F, -0.4608F));

            PartDefinition cube_r3 = bottom_2_legs_average_long_2_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(58, 312).addBox(-1.005F, -0.498F, -2.904F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.005F, -1.2733F, 0.5916F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_long_2_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_average_long_2_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_long_2_bottom_back_right_individual = bottom_2_legs_average_long_2_bottom_back_right.addOrReplaceChild("bottom_2_legs_average_long_2_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.005F, 1.2125F, -0.4608F));

            PartDefinition cube_r4 = bottom_2_legs_average_long_2_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(69, 310).addBox(-1.005F, -0.498F, -2.904F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.005F, -1.2733F, 0.5916F, 1.1345F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("long") && variation == 3) {
            PartDefinition bottom_2_legs_average_long_3_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_average_long_3_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_long_3_bottom_front_left_individual = bottom_2_legs_average_long_3_bottom_front_left.addOrReplaceChild("bottom_2_legs_average_long_3_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.627F, -0.9762F));

            PartDefinition cube_r1 = bottom_2_legs_average_long_3_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(84, 306).addBox(-0.9811F, -0.5018F, -3.9359F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.7164F, 0.8955F, 1.0908F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_long_3_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_average_long_3_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_long_3_bottom_front_right_individual = bottom_2_legs_average_long_3_bottom_front_right.addOrReplaceChild("bottom_2_legs_average_long_3_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.627F, -0.9762F));

            PartDefinition cube_r2 = bottom_2_legs_average_long_3_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(94, 308).addBox(-0.9811F, -0.5018F, -3.9359F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.7164F, 0.8955F, 1.0908F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_long_3_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_average_long_3_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_long_3_bottom_back_left_individual = bottom_2_legs_average_long_3_bottom_back_left.addOrReplaceChild("bottom_2_legs_average_long_3_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.627F, -0.9762F));

            PartDefinition cube_r3 = bottom_2_legs_average_long_3_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(84, 317).addBox(-0.9811F, -0.5018F, -3.9359F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.7164F, 0.8955F, 1.0908F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_long_3_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_average_long_3_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_average_long_3_bottom_back_right_individual = bottom_2_legs_average_long_3_bottom_back_right.addOrReplaceChild("bottom_2_legs_average_long_3_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.627F, -0.9762F));

            PartDefinition cube_r4 = bottom_2_legs_average_long_3_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(94, 319).addBox(-0.9811F, -0.5018F, -3.9359F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.7164F, 0.8955F, 1.0908F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("short") && variation == 1) {
            PartDefinition bottom_2_legs_thick_short_1_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_thick_short_1_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_short_1_bottom_front_left_individual = bottom_2_legs_thick_short_1_bottom_front_left.addOrReplaceChild("bottom_2_legs_thick_short_1_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 0.6247F, -0.39F));

            PartDefinition cube_r1 = bottom_2_legs_thick_short_1_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 344).addBox(-0.9811F, -1.4237F, -1.9046F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -0.5353F, 0.8434F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_short_1_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_thick_short_1_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_short_1_bottom_front_right_individual = bottom_2_legs_thick_short_1_bottom_front_right.addOrReplaceChild("bottom_2_legs_thick_short_1_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 0.6247F, -0.39F));

            PartDefinition cube_r2 = bottom_2_legs_thick_short_1_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 344).addBox(-0.9811F, -1.4237F, -1.9046F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -0.5353F, 0.8434F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_short_1_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_thick_short_1_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_short_1_bottom_back_left_individual = bottom_2_legs_thick_short_1_bottom_back_left.addOrReplaceChild("bottom_2_legs_thick_short_1_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 0.6247F, -0.39F));

            PartDefinition cube_r3 = bottom_2_legs_thick_short_1_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 352).addBox(-0.9811F, -1.4237F, -1.9046F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -0.5353F, 0.8434F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_short_1_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_thick_short_1_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_short_1_bottom_back_right_individual = bottom_2_legs_thick_short_1_bottom_back_right.addOrReplaceChild("bottom_2_legs_thick_short_1_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 0.6247F, -0.39F));

            PartDefinition cube_r4 = bottom_2_legs_thick_short_1_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(8, 352).addBox(-0.9811F, -1.4237F, -1.9046F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -0.5353F, 0.8434F, 1.0036F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("short") && variation == 2) {
            PartDefinition bottom_2_legs_thick_short_2_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_thick_short_2_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_short_2_bottom_front_left_individual = bottom_2_legs_thick_short_2_bottom_front_left.addOrReplaceChild("bottom_2_legs_thick_short_2_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0025F, 0.8287F, -0.4083F));

            PartDefinition cube_r1 = bottom_2_legs_thick_short_2_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(19, 343).addBox(-0.9975F, -1.1422F, -2.6792F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0025F, -0.9181F, 0.7535F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_short_2_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_thick_short_2_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_short_2_bottom_front_right_individual = bottom_2_legs_thick_short_2_bottom_front_right.addOrReplaceChild("bottom_2_legs_thick_short_2_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0025F, 0.8287F, -0.4083F));

            PartDefinition cube_r2 = bottom_2_legs_thick_short_2_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(28, 345).addBox(-0.9975F, -1.1422F, -2.6792F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0025F, -0.9181F, 0.7535F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_short_2_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_thick_short_2_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_short_2_bottom_back_left_individual = bottom_2_legs_thick_short_2_bottom_back_left.addOrReplaceChild("bottom_2_legs_thick_short_2_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0025F, 0.8287F, -0.4083F));

            PartDefinition cube_r3 = bottom_2_legs_thick_short_2_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(19, 352).addBox(-0.9975F, -1.1422F, -2.6792F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0025F, -0.9181F, 0.7535F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_short_2_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_thick_short_2_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_short_2_bottom_back_right_individual = bottom_2_legs_thick_short_2_bottom_back_right.addOrReplaceChild("bottom_2_legs_thick_short_2_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0025F, 0.8287F, -0.4083F));

            PartDefinition cube_r4 = bottom_2_legs_thick_short_2_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(28, 354).addBox(-0.9975F, -1.1422F, -2.6792F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0025F, -0.9181F, 0.7535F, 1.0036F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("short") && variation == 3) {
            PartDefinition bottom_2_legs_thick_short_3_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_thick_short_3_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_short_3_bottom_front_left_individual = bottom_2_legs_thick_short_3_bottom_front_left.addOrReplaceChild("bottom_2_legs_thick_short_3_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.0075F, -0.5211F));

            PartDefinition cube_r1 = bottom_2_legs_thick_short_3_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(38, 343).addBox(-0.9811F, -1.0188F, -2.7065F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.0075F, 0.6641F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_short_3_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_thick_short_3_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_short_3_bottom_front_right_individual = bottom_2_legs_thick_short_3_bottom_front_right.addOrReplaceChild("bottom_2_legs_thick_short_3_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.0075F, -0.5211F));

            PartDefinition cube_r2 = bottom_2_legs_thick_short_3_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(47, 345).addBox(-0.9811F, -1.0188F, -2.7065F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.0075F, 0.6641F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_short_3_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_thick_short_3_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_short_3_bottom_back_left_individual = bottom_2_legs_thick_short_3_bottom_back_left.addOrReplaceChild("bottom_2_legs_thick_short_3_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.0075F, -0.5211F));

            PartDefinition cube_r3 = bottom_2_legs_thick_short_3_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(38, 353).addBox(-0.9811F, -1.0188F, -2.7065F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.0075F, 0.6641F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_short_3_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_thick_short_3_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_short_3_bottom_back_right_individual = bottom_2_legs_thick_short_3_bottom_back_right.addOrReplaceChild("bottom_2_legs_thick_short_3_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.0075F, -0.5211F));

            PartDefinition cube_r4 = bottom_2_legs_thick_short_3_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(47, 355).addBox(-0.9811F, -1.0188F, -2.7065F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.0075F, 0.6641F, 1.0036F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("average") && variation == 1) {
            PartDefinition bottom_2_legs_thick_average_1_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_thick_average_1_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_average_1_bottom_front_left_individual = bottom_2_legs_thick_average_1_bottom_front_left.addOrReplaceChild("bottom_2_legs_thick_average_1_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 0.9181F, -0.6999F));

            PartDefinition cube_r1 = bottom_2_legs_thick_average_1_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(60, 343).addBox(-0.9811F, -1.0668F, -2.6312F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -0.9181F, 0.6641F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_average_1_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_thick_average_1_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_average_1_bottom_front_right_individual = bottom_2_legs_thick_average_1_bottom_front_right.addOrReplaceChild("bottom_2_legs_thick_average_1_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 0.9181F, -0.6999F));

            PartDefinition cube_r2 = bottom_2_legs_thick_average_1_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(70, 345).addBox(-0.9811F, -1.0668F, -2.6312F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -0.9181F, 0.6641F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_average_1_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_thick_average_1_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_average_1_bottom_back_left_individual = bottom_2_legs_thick_average_1_bottom_back_left.addOrReplaceChild("bottom_2_legs_thick_average_1_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 0.9181F, -0.6999F));

            PartDefinition cube_r3 = bottom_2_legs_thick_average_1_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(60, 354).addBox(-0.9811F, -1.0668F, -2.6312F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -0.9181F, 0.6641F, 1.0036F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_average_1_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_thick_average_1_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_average_1_bottom_back_right_individual = bottom_2_legs_thick_average_1_bottom_back_right.addOrReplaceChild("bottom_2_legs_thick_average_1_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 0.9181F, -0.6999F));

            PartDefinition cube_r4 = bottom_2_legs_thick_average_1_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(70, 356).addBox(-0.9811F, -1.0668F, -2.6312F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -0.9181F, 0.6641F, 1.0036F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("average") && variation == 2) {
            PartDefinition bottom_2_legs_thick_average_2_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_thick_average_2_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_average_2_bottom_front_left_individual = bottom_2_legs_thick_average_2_bottom_front_left.addOrReplaceChild("bottom_2_legs_thick_average_2_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0171F, 1.6208F, -0.7486F));

            PartDefinition cube_r1 = bottom_2_legs_thick_average_2_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(83, 344).addBox(-1.0171F, -0.9964F, -3.7867F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0171F, -1.6208F, 0.7518F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_average_2_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_thick_average_2_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_average_2_bottom_front_right_individual = bottom_2_legs_thick_average_2_bottom_front_right.addOrReplaceChild("bottom_2_legs_thick_average_2_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0171F, 1.6208F, -0.7486F));

            PartDefinition cube_r2 = bottom_2_legs_thick_average_2_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(95, 345).addBox(-1.0171F, -0.9964F, -3.7867F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0171F, -1.6208F, 0.7518F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_average_2_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_thick_average_2_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_average_2_bottom_back_left_individual = bottom_2_legs_thick_average_2_bottom_back_left.addOrReplaceChild("bottom_2_legs_thick_average_2_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.0171F, 1.6208F, -0.7486F));

            PartDefinition cube_r3 = bottom_2_legs_thick_average_2_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(83, 356).addBox(-1.0171F, -0.9964F, -3.7867F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0171F, -1.6208F, 0.7518F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_average_2_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_thick_average_2_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_average_2_bottom_back_right_individual = bottom_2_legs_thick_average_2_bottom_back_right.addOrReplaceChild("bottom_2_legs_thick_average_2_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.0171F, 1.6208F, -0.7486F));

            PartDefinition cube_r4 = bottom_2_legs_thick_average_2_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(95, 357).addBox(-1.0171F, -0.9964F, -3.7867F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0171F, -1.6208F, 0.7518F, 1.1345F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("average") && variation == 3) {
            PartDefinition bottom_2_legs_thick_average_3_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_thick_average_3_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_average_3_bottom_front_left_individual = bottom_2_legs_thick_average_3_bottom_front_left.addOrReplaceChild("bottom_2_legs_thick_average_3_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.01F, 1.0897F, -0.5292F));

            PartDefinition cube_r1 = bottom_2_legs_thick_average_3_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 379).addBox(-1.01F, -1.0222F, -2.8774F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -1.239F, 0.6023F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_average_3_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_thick_average_3_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_average_3_bottom_front_right_individual = bottom_2_legs_thick_average_3_bottom_front_right.addOrReplaceChild("bottom_2_legs_thick_average_3_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.01F, 1.0897F, -0.5292F));

            PartDefinition cube_r2 = bottom_2_legs_thick_average_3_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 376).addBox(-1.01F, -1.0222F, -2.8774F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -1.239F, 0.6023F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_average_3_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_thick_average_3_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_average_3_bottom_back_left_individual = bottom_2_legs_thick_average_3_bottom_back_left.addOrReplaceChild("bottom_2_legs_thick_average_3_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.01F, 1.0897F, -0.5292F));

            PartDefinition cube_r3 = bottom_2_legs_thick_average_3_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 391).addBox(-1.01F, -1.0222F, -2.8774F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -1.239F, 0.6023F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_average_3_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_thick_average_3_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_average_3_bottom_back_right_individual = bottom_2_legs_thick_average_3_bottom_back_right.addOrReplaceChild("bottom_2_legs_thick_average_3_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.01F, 1.0897F, -0.5292F));

            PartDefinition cube_r4 = bottom_2_legs_thick_average_3_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(14, 388).addBox(-1.01F, -1.0222F, -2.8774F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -1.239F, 0.6023F, 1.1345F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("long") && variation == 1) {
            PartDefinition bottom_2_legs_thick_long_1_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_thick_long_1_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_long_1_bottom_front_left_individual = bottom_2_legs_thick_long_1_bottom_front_left.addOrReplaceChild("bottom_2_legs_thick_long_1_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.3961F, -0.7692F));

            PartDefinition cube_r1 = bottom_2_legs_thick_long_1_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(27, 376).addBox(-0.9811F, -1.0674F, -3.609F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.3961F, 0.8027F, 1.0908F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_long_1_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_thick_long_1_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_long_1_bottom_front_right_individual = bottom_2_legs_thick_long_1_bottom_front_right.addOrReplaceChild("bottom_2_legs_thick_long_1_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.3961F, -0.7692F));

            PartDefinition cube_r2 = bottom_2_legs_thick_long_1_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 379).addBox(-0.9811F, -1.0674F, -3.609F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.3961F, 0.8027F, 1.0908F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_long_1_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_thick_long_1_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_long_1_bottom_back_left_individual = bottom_2_legs_thick_long_1_bottom_back_left.addOrReplaceChild("bottom_2_legs_thick_long_1_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.3961F, -0.7692F));

            PartDefinition cube_r3 = bottom_2_legs_thick_long_1_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(27, 388).addBox(-0.9811F, -1.0674F, -3.609F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.3961F, 0.8027F, 1.0908F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_long_1_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_thick_long_1_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_long_1_bottom_back_right_individual = bottom_2_legs_thick_long_1_bottom_back_right.addOrReplaceChild("bottom_2_legs_thick_long_1_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.3961F, -0.7692F));

            PartDefinition cube_r4 = bottom_2_legs_thick_long_1_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 391).addBox(-0.9811F, -1.0674F, -3.609F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.3961F, 0.8027F, 1.0908F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("long") && variation == 2) {
            PartDefinition bottom_2_legs_thick_long_2_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_thick_long_2_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_long_2_bottom_front_left_individual = bottom_2_legs_thick_long_2_bottom_front_left.addOrReplaceChild("bottom_2_legs_thick_long_2_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(-0.01F, 1.0012F, -0.5292F));

            PartDefinition cube_r1 = bottom_2_legs_thick_long_2_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(53, 371).addBox(-1.01F, -1.0168F, -2.6796F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -1.062F, 0.5138F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_long_2_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_thick_long_2_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_long_2_bottom_front_right_individual = bottom_2_legs_thick_long_2_bottom_front_right.addOrReplaceChild("bottom_2_legs_thick_long_2_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(-0.01F, 1.0012F, -0.5292F));

            PartDefinition cube_r2 = bottom_2_legs_thick_long_2_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(67, 374).addBox(-1.01F, -1.0168F, -2.6796F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -1.062F, 0.5138F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_long_2_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_thick_long_2_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_long_2_bottom_back_left_individual = bottom_2_legs_thick_long_2_bottom_back_left.addOrReplaceChild("bottom_2_legs_thick_long_2_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(-0.01F, 1.0012F, -0.5292F));

            PartDefinition cube_r3 = bottom_2_legs_thick_long_2_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(53, 384).addBox(-1.01F, -1.0168F, -2.6796F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -1.062F, 0.5138F, 1.1345F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_long_2_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_thick_long_2_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_long_2_bottom_back_right_individual = bottom_2_legs_thick_long_2_bottom_back_right.addOrReplaceChild("bottom_2_legs_thick_long_2_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(-0.01F, 1.0012F, -0.5292F));

            PartDefinition cube_r4 = bottom_2_legs_thick_long_2_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(67, 387).addBox(-1.01F, -1.0168F, -2.6796F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -1.062F, 0.5138F, 1.1345F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("long") && variation == 3) {
            PartDefinition bottom_2_legs_thick_long_3_bottom_front_left = rootForeLegLeft.addOrReplaceChild("bottom_2_legs_thick_long_3_bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_long_3_bottom_front_left_individual = bottom_2_legs_thick_long_3_bottom_front_left.addOrReplaceChild("bottom_2_legs_thick_long_3_bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.5749F, -0.7692F));

            PartDefinition cube_r1 = bottom_2_legs_thick_long_3_bottom_front_left_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(84, 381).addBox(-0.9811F, -1.0261F, -3.6883F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.4855F, 0.8027F, 1.0908F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_long_3_bottom_front_right = rootForeLegRight.addOrReplaceChild("bottom_2_legs_thick_long_3_bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_long_3_bottom_front_right_individual = bottom_2_legs_thick_long_3_bottom_front_right.addOrReplaceChild("bottom_2_legs_thick_long_3_bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.5749F, -0.7692F));

            PartDefinition cube_r2 = bottom_2_legs_thick_long_3_bottom_front_right_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(93, 378).addBox(-0.9811F, -1.0261F, -3.6883F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.4855F, 0.8027F, 1.0908F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_long_3_bottom_back_left = rootHindLegLeft.addOrReplaceChild("bottom_2_legs_thick_long_3_bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_long_3_bottom_back_left_individual = bottom_2_legs_thick_long_3_bottom_back_left.addOrReplaceChild("bottom_2_legs_thick_long_3_bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.5749F, -0.7692F));

            PartDefinition cube_r3 = bottom_2_legs_thick_long_3_bottom_back_left_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(84, 394).addBox(-0.9811F, -1.0261F, -3.6883F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.4855F, 0.8027F, 1.0908F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_long_3_bottom_back_right = rootHindLegRight.addOrReplaceChild("bottom_2_legs_thick_long_3_bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition bottom_2_legs_thick_long_3_bottom_back_right_individual = bottom_2_legs_thick_long_3_bottom_back_right.addOrReplaceChild("bottom_2_legs_thick_long_3_bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0189F, 1.5749F, -0.7692F));

            PartDefinition cube_r4 = bottom_2_legs_thick_long_3_bottom_back_right_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(93, 391).addBox(-0.9811F, -1.0261F, -3.6883F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0189F, -1.4855F, 0.8027F, 1.0908F, 0.0F, 0.0F));

        } else {
            EquigenMod.LOGGER.error("Invalid Part: Upper Bottom Leg / " + length + " / " + thickness + ", Cancelling Generation...");
        }
        return new PartDefinition[]{rootForeLegLeft, rootForeLegRight, rootHindLegLeft, rootHindLegRight};
    }

    public static PartDefinition[] GenerateAll(PartDefinition rootForeLegLeft, PartDefinition rootForeLegRight, PartDefinition rootHindLegLeft, PartDefinition rootHindLegRight) {
        List<String> thickness = List.of("thin", "average", "thick");
        List<String> length = List.of("short", "average", "long");
        PartDefinition[] roots;

        for (String variable1 : thickness) {
            for (String variable2 : length) {
                roots = Generate(rootForeLegLeft, rootForeLegRight, rootHindLegLeft, rootHindLegRight, variable1, variable2, 1);
                rootForeLegLeft = roots[0];
                rootForeLegRight = roots[1];
                rootHindLegLeft = roots[2];
                rootHindLegRight = roots[3];
                roots = Generate(rootForeLegLeft, rootForeLegRight, rootHindLegLeft, rootHindLegRight, variable1, variable2, 2);
                rootForeLegLeft = roots[0];
                rootForeLegRight = roots[1];
                rootHindLegLeft = roots[2];
                rootHindLegRight = roots[3];
            }
        }
        return new PartDefinition[]{rootForeLegLeft, rootForeLegRight, rootHindLegLeft, rootHindLegRight};
    }
}