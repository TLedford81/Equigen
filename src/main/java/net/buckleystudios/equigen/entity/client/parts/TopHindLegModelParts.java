package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

import java.util.ArrayList;
import java.util.List;

public class TopHindLegModelParts {
    private static List<String> allParts = new ArrayList<>();
    public static List<String> getAllParts(){
        return allParts;
    }
    public static PartDefinition[] Generate(PartDefinition leftRoot, PartDefinition rightRoot, String thickness, String length, int variation) {
        if (thickness.equals("thin") && length.equals("short") && variation == 1) {
            PartDefinition top_back_legs_thin_short_1_top_back_right_individual = rightRoot.addOrReplaceChild("top_back_legs_thin_short_1_top_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_short_1_top_back_right_front = top_back_legs_thin_short_1_top_back_right_individual.addOrReplaceChild("top_back_legs_thin_short_1_top_back_right_front", CubeListBuilder.create(), PartPose.offset(-0.055F, 2.6467F, 0.2392F));

            PartDefinition cube_r1 = top_back_legs_thin_short_1_top_back_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(141, 287).mirror().addBox(-1.055F, -2.0F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.055F, 1.4651F, 1.6892F, 1.9635F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_short_1_top_back_right_back = top_back_legs_thin_short_1_top_back_right_individual.addOrReplaceChild("top_back_legs_thin_short_1_top_back_right_back", CubeListBuilder.create(), PartPose.offset(0.055F, 2.3126F, 0.8522F));

            PartDefinition cube_r2 = top_back_legs_thin_short_1_top_back_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(140, 278).mirror().addBox(-0.945F, -2.0F, 0.08F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.055F, 3.4188F, 1.4587F, 1.7017F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_short_1_top_back_left_individual = leftRoot.addOrReplaceChild("top_back_legs_thin_short_1_top_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_short_1_top_back_left_front = top_back_legs_thin_short_1_top_back_left_individual.addOrReplaceChild("top_back_legs_thin_short_1_top_back_left_front", CubeListBuilder.create(), PartPose.offset(0.055F, 2.6467F, 0.2392F));

            PartDefinition cube_r3 = top_back_legs_thin_short_1_top_back_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(123, 287).addBox(-0.945F, -2.0F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.055F, 1.4651F, 1.6892F, 1.9635F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_short_1_top_back_left_back = top_back_legs_thin_short_1_top_back_left_individual.addOrReplaceChild("top_back_legs_thin_short_1_top_back_left_back", CubeListBuilder.create(), PartPose.offset(-0.055F, 2.3126F, 0.8522F));

            PartDefinition cube_r4 = top_back_legs_thin_short_1_top_back_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(122, 278).addBox(-1.055F, -2.0F, 0.08F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.055F, 3.4188F, 1.4587F, 1.7017F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("short") && variation == 2) {
            PartDefinition top_back_legs_thin_short_2_top_back_right_individual = rightRoot.addOrReplaceChild("top_back_legs_thin_short_2_top_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_short_2_top_back_right_front = top_back_legs_thin_short_2_top_back_right_individual.addOrReplaceChild("top_back_legs_thin_short_2_top_back_right_front", CubeListBuilder.create(), PartPose.offset(-0.055F, 2.6316F, 0.1435F));

            PartDefinition cube_r1 = top_back_legs_thin_short_2_top_back_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(174, 291).mirror().addBox(-1.055F, -2.0F, -1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.055F, 1.927F, 1.8806F, 1.9635F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_short_2_top_back_right_back = top_back_legs_thin_short_2_top_back_right_individual.addOrReplaceChild("top_back_legs_thin_short_2_top_back_right_back", CubeListBuilder.create(), PartPose.offset(0.055F, 2.2638F, 0.8826F));

            PartDefinition cube_r2 = top_back_legs_thin_short_2_top_back_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(173, 281).mirror().addBox(-0.945F, -2.0F, 0.08F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.055F, 3.9146F, 1.524F, 1.7017F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_short_2_top_back_left_individual = leftRoot.addOrReplaceChild("top_back_legs_thin_short_2_top_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_short_2_top_back_left_front = top_back_legs_thin_short_2_top_back_left_individual.addOrReplaceChild("top_back_legs_thin_short_2_top_back_left_front", CubeListBuilder.create(), PartPose.offset(0.055F, 2.6316F, 0.1435F));

            PartDefinition cube_r3 = top_back_legs_thin_short_2_top_back_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(154, 291).addBox(-0.945F, -2.0F, -1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.055F, 1.927F, 1.8806F, 1.9635F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_short_2_top_back_left_back = top_back_legs_thin_short_2_top_back_left_individual.addOrReplaceChild("top_back_legs_thin_short_2_top_back_left_back", CubeListBuilder.create(), PartPose.offset(-0.055F, 2.2638F, 0.8826F));

            PartDefinition cube_r4 = top_back_legs_thin_short_2_top_back_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(153, 281).addBox(-1.055F, -2.0F, 0.08F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.055F, 3.9146F, 1.524F, 1.7017F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("average") && variation == 1) {
            PartDefinition top_back_legs_thin_average_1_top_back_right_individual = rightRoot.addOrReplaceChild("top_back_legs_thin_average_1_top_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_average_1_top_back_right_front = top_back_legs_thin_average_1_top_back_right_individual.addOrReplaceChild("top_back_legs_thin_average_1_top_back_right_front", CubeListBuilder.create(), PartPose.offset(-0.1444F, 4.5021F, -0.1733F));

            PartDefinition cube_r1 = top_back_legs_thin_average_1_top_back_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(209, 275).mirror().addBox(-1.1444F, -3.0F, -2.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1444F, 0.5035F, 3.6749F, 2.0071F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_average_1_top_back_right_back = top_back_legs_thin_average_1_top_back_right_individual.addOrReplaceChild("top_back_legs_thin_average_1_top_back_right_back", CubeListBuilder.create(), PartPose.offset(0.1444F, 4.2658F, 1.3854F));

            PartDefinition cube_r2 = top_back_legs_thin_average_1_top_back_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(210, 286).mirror().addBox(-0.8556F, -1.0F, -1.92F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1444F, 0.4824F, 0.5501F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_average_1_top_back_left_individual = leftRoot.addOrReplaceChild("top_back_legs_thin_average_1_top_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_average_1_top_back_left_front = top_back_legs_thin_average_1_top_back_left_individual.addOrReplaceChild("top_back_legs_thin_average_1_top_back_left_front", CubeListBuilder.create(), PartPose.offset(0.1444F, 4.5021F, -0.1733F));

            PartDefinition cube_r3 = top_back_legs_thin_average_1_top_back_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(187, 275).addBox(-0.8556F, -3.0F, -2.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1444F, 0.5035F, 3.6749F, 2.0071F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_average_1_top_back_left_back = top_back_legs_thin_average_1_top_back_left_individual.addOrReplaceChild("top_back_legs_thin_average_1_top_back_left_back", CubeListBuilder.create(), PartPose.offset(-0.1444F, 4.2658F, 1.3854F));

            PartDefinition cube_r4 = top_back_legs_thin_average_1_top_back_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(188, 286).addBox(-1.1444F, -1.0F, -1.92F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1444F, 0.4824F, 0.5501F, 1.789F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("average") && variation == 2) {
            PartDefinition top_back_legs_thin_average_2_top_back_right_individual = rightRoot.addOrReplaceChild("top_back_legs_thin_average_2_top_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_average_2_top_back_right_front = top_back_legs_thin_average_2_top_back_right_individual.addOrReplaceChild("top_back_legs_thin_average_2_top_back_right_front", CubeListBuilder.create(), PartPose.offset(-0.1444F, 4.2549F, 0.4433F));

            PartDefinition cube_r1 = top_back_legs_thin_average_2_top_back_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(249, 280).mirror().addBox(-1.1444F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1444F, 3.0747F, 3.2475F, 1.9199F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_average_2_top_back_right_back = top_back_legs_thin_average_2_top_back_right_individual.addOrReplaceChild("top_back_legs_thin_average_2_top_back_right_back", CubeListBuilder.create(), PartPose.offset(0.1444F, 3.3983F, 1.618F));

            PartDefinition cube_r2 = top_back_legs_thin_average_2_top_back_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(250, 292).mirror().addBox(-0.8556F, -1.0F, -0.92F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1444F, 3.4951F, 0.7749F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_average_2_top_back_left_individual = leftRoot.addOrReplaceChild("top_back_legs_thin_average_2_top_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_average_2_top_back_left_front = top_back_legs_thin_average_2_top_back_left_individual.addOrReplaceChild("top_back_legs_thin_average_2_top_back_left_front", CubeListBuilder.create(), PartPose.offset(0.1444F, 4.2549F, 0.4433F));

            PartDefinition cube_r3 = top_back_legs_thin_average_2_top_back_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(225, 280).addBox(-0.8556F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1444F, 3.0747F, 3.2475F, 1.9199F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_average_2_top_back_left_back = top_back_legs_thin_average_2_top_back_left_individual.addOrReplaceChild("top_back_legs_thin_average_2_top_back_left_back", CubeListBuilder.create(), PartPose.offset(-0.1444F, 3.3983F, 1.618F));

            PartDefinition cube_r4 = top_back_legs_thin_average_2_top_back_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(226, 292).addBox(-1.1444F, -1.0F, -0.92F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1444F, 3.4951F, 0.7749F, 1.789F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("long") && variation == 1) {
            PartDefinition top_back_legs_thin_long_1_top_back_right_individual = rightRoot.addOrReplaceChild("top_back_legs_thin_long_1_top_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_long_1_top_back_right_front = top_back_legs_thin_long_1_top_back_right_individual.addOrReplaceChild("top_back_legs_thin_long_1_top_back_right_front", CubeListBuilder.create(), PartPose.offset(-0.1444F, 4.1162F, 0.1543F));

            PartDefinition cube_r1 = top_back_legs_thin_long_1_top_back_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(290, 285).mirror().addBox(-1.1444F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1444F, 3.2135F, 3.1103F, 1.8762F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_long_1_top_back_right_back = top_back_legs_thin_long_1_top_back_right_individual.addOrReplaceChild("top_back_legs_thin_long_1_top_back_right_back", CubeListBuilder.create(), PartPose.offset(0.1444F, 3.8602F, 1.4319F));

            PartDefinition cube_r2 = top_back_legs_thin_long_1_top_back_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(290, 273).mirror().addBox(-0.8556F, -1.0F, -1.92F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1444F, 3.0332F, 0.5348F, 1.7453F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_long_1_top_back_left_individual = leftRoot.addOrReplaceChild("top_back_legs_thin_long_1_top_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_long_1_top_back_left_front = top_back_legs_thin_long_1_top_back_left_individual.addOrReplaceChild("top_back_legs_thin_long_1_top_back_left_front", CubeListBuilder.create(), PartPose.offset(0.1444F, 4.1162F, 0.1543F));

            PartDefinition cube_r3 = top_back_legs_thin_long_1_top_back_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(266, 285).addBox(-0.8556F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1444F, 3.2135F, 3.1103F, 1.8762F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_long_1_top_back_left_back = top_back_legs_thin_long_1_top_back_left_individual.addOrReplaceChild("top_back_legs_thin_long_1_top_back_left_back", CubeListBuilder.create(), PartPose.offset(-0.1444F, 3.8602F, 1.4319F));

            PartDefinition cube_r4 = top_back_legs_thin_long_1_top_back_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(266, 273).addBox(-1.1444F, -1.0F, -1.92F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1444F, 3.0332F, 0.5348F, 1.7453F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("long") && variation == 2) {
            PartDefinition top_back_legs_thin_long_2_top_back_right_individual = rightRoot.addOrReplaceChild("top_back_legs_thin_long_2_top_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_long_2_top_back_right_front = top_back_legs_thin_long_2_top_back_right_individual.addOrReplaceChild("top_back_legs_thin_long_2_top_back_right_front", CubeListBuilder.create(), PartPose.offset(-0.1444F, 4.2949F, 0.4225F));

            PartDefinition cube_r1 = top_back_legs_thin_long_2_top_back_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(333, 291).mirror().addBox(-1.1444F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1444F, 3.2135F, 3.1103F, 1.8762F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_long_2_top_back_right_back = top_back_legs_thin_long_2_top_back_right_individual.addOrReplaceChild("top_back_legs_thin_long_2_top_back_right_back", CubeListBuilder.create(), PartPose.offset(0.1444F, 4.2632F, 1.6975F));

            PartDefinition cube_r2 = top_back_legs_thin_long_2_top_back_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(332, 278).mirror().addBox(-0.8556F, -1.0F, -2.92F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1444F, 2.5408F, 0.448F, 1.7453F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_long_2_top_back_left_individual = leftRoot.addOrReplaceChild("top_back_legs_thin_long_2_top_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_long_2_top_back_left_front = top_back_legs_thin_long_2_top_back_left_individual.addOrReplaceChild("top_back_legs_thin_long_2_top_back_left_front", CubeListBuilder.create(), PartPose.offset(0.1444F, 4.2949F, 0.4225F));

            PartDefinition cube_r3 = top_back_legs_thin_long_2_top_back_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(308, 291).addBox(-0.8556F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1444F, 3.2135F, 3.1103F, 1.8762F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thin_long_2_top_back_left_back = top_back_legs_thin_long_2_top_back_left_individual.addOrReplaceChild("top_back_legs_thin_long_2_top_back_left_back", CubeListBuilder.create(), PartPose.offset(-0.1444F, 4.2632F, 1.6975F));

            PartDefinition cube_r4 = top_back_legs_thin_long_2_top_back_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(307, 278).addBox(-1.1444F, -1.0F, -2.92F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1444F, 2.5408F, 0.448F, 1.7453F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("short") && variation == 1) {
            PartDefinition top_back_legs_average_short_1_top_back_right_individual = rightRoot.addOrReplaceChild("top_back_legs_average_short_1_top_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_short_1_top_back_right_front = top_back_legs_average_short_1_top_back_right_individual.addOrReplaceChild("top_back_legs_average_short_1_top_back_right_front", CubeListBuilder.create(), PartPose.offset(-0.055F, 2.736F, -0.029F));

            PartDefinition cube_r1 = top_back_legs_average_short_1_top_back_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(143, 326).mirror().addBox(-1.055F, -2.0F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.055F, 1.4651F, 1.6892F, 1.9635F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_short_1_top_back_right_back = top_back_legs_average_short_1_top_back_right_individual.addOrReplaceChild("top_back_legs_average_short_1_top_back_right_back", CubeListBuilder.create(), PartPose.offset(0.055F, 2.3367F, 1.1692F));

            PartDefinition cube_r2 = top_back_legs_average_short_1_top_back_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(142, 316).mirror().addBox(-0.945F, -2.0F, 0.08F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.055F, 3.4841F, 0.963F, 1.7017F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_short_1_top_back_left_individual = leftRoot.addOrReplaceChild("top_back_legs_average_short_1_top_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_short_1_top_back_left_front = top_back_legs_average_short_1_top_back_left_individual.addOrReplaceChild("top_back_legs_average_short_1_top_back_left_front", CubeListBuilder.create(), PartPose.offset(0.055F, 2.736F, -0.029F));

            PartDefinition cube_r3 = top_back_legs_average_short_1_top_back_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(125, 326).addBox(-0.945F, -2.0F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.055F, 1.4651F, 1.6892F, 1.9635F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_short_1_top_back_left_back = top_back_legs_average_short_1_top_back_left_individual.addOrReplaceChild("top_back_legs_average_short_1_top_back_left_back", CubeListBuilder.create(), PartPose.offset(-0.055F, 2.3367F, 1.1692F));

            PartDefinition cube_r4 = top_back_legs_average_short_1_top_back_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(124, 316).addBox(-1.055F, -2.0F, 0.08F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.055F, 3.4841F, 0.963F, 1.7017F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("short") && variation == 2) {
            PartDefinition top_back_legs_average_short_2_top_back_right_individual = rightRoot.addOrReplaceChild("top_back_legs_average_short_2_top_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_short_2_top_back_right_front = top_back_legs_average_short_2_top_back_right_individual.addOrReplaceChild("top_back_legs_average_short_2_top_back_right_front", CubeListBuilder.create(), PartPose.offset(-0.055F, 2.8104F, -0.1247F));

            PartDefinition cube_r1 = top_back_legs_average_short_2_top_back_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(175, 331).mirror().addBox(-1.055F, -2.0F, -1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.055F, 1.927F, 1.8806F, 1.9635F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_short_2_top_back_right_back = top_back_legs_average_short_2_top_back_right_individual.addOrReplaceChild("top_back_legs_average_short_2_top_back_right_back", CubeListBuilder.create(), PartPose.offset(0.055F, 2.9136F, 1.1102F));

            PartDefinition cube_r2 = top_back_legs_average_short_2_top_back_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(174, 320).mirror().addBox(-0.945F, -2.0F, 0.08F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.055F, 3.9798F, 1.0283F, 1.7017F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_short_2_top_back_left_individual = leftRoot.addOrReplaceChild("top_back_legs_average_short_2_top_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_short_2_top_back_left_front = top_back_legs_average_short_2_top_back_left_individual.addOrReplaceChild("top_back_legs_average_short_2_top_back_left_front", CubeListBuilder.create(), PartPose.offset(0.055F, 2.8104F, -0.1247F));

            PartDefinition cube_r3 = top_back_legs_average_short_2_top_back_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(155, 331).addBox(-0.945F, -2.0F, -1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.055F, 1.927F, 1.8806F, 1.9635F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_short_2_top_back_left_back = top_back_legs_average_short_2_top_back_left_individual.addOrReplaceChild("top_back_legs_average_short_2_top_back_left_back", CubeListBuilder.create(), PartPose.offset(-0.055F, 2.9136F, 1.1102F));

            PartDefinition cube_r4 = top_back_legs_average_short_2_top_back_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(154, 320).addBox(-1.055F, -2.0F, 0.08F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.055F, 3.9798F, 1.0283F, 1.7017F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("average") && variation == 1) {
            PartDefinition top_back_legs_average_average_1_top_back_right_individual = rightRoot.addOrReplaceChild("top_back_legs_average_average_1_top_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_average_1_top_back_right_front = top_back_legs_average_average_1_top_back_right_individual.addOrReplaceChild("top_back_legs_average_average_1_top_back_right_front", CubeListBuilder.create(), PartPose.offset(-0.1444F, 3.6744F, 0.5431F));

            PartDefinition cube_r1 = top_back_legs_average_average_1_top_back_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(210, 314).mirror().addBox(-1.1444F, -3.0F, -2.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1444F, 1.4205F, 2.8692F, 2.0071F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_average_1_top_back_right_back = top_back_legs_average_average_1_top_back_right_individual.addOrReplaceChild("top_back_legs_average_average_1_top_back_right_back", CubeListBuilder.create(), PartPose.offset(0.1444F, 2.788F, 1.616F));

            PartDefinition cube_r2 = top_back_legs_average_average_1_top_back_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(211, 325).mirror().addBox(-0.8556F, -1.0F, -1.92F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1444F, 2.1389F, -0.038F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_average_1_top_back_left_individual = leftRoot.addOrReplaceChild("top_back_legs_average_average_1_top_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_average_1_top_back_left_front = top_back_legs_average_average_1_top_back_left_individual.addOrReplaceChild("top_back_legs_average_average_1_top_back_left_front", CubeListBuilder.create(), PartPose.offset(0.1444F, 3.6744F, 0.5431F));

            PartDefinition cube_r3 = top_back_legs_average_average_1_top_back_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(188, 314).addBox(-0.8556F, -3.0F, -2.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1444F, 1.4205F, 2.8692F, 2.0071F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_average_1_top_back_left_back = top_back_legs_average_average_1_top_back_left_individual.addOrReplaceChild("top_back_legs_average_average_1_top_back_left_back", CubeListBuilder.create(), PartPose.offset(-0.1444F, 2.788F, 1.616F));

            PartDefinition cube_r4 = top_back_legs_average_average_1_top_back_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(189, 325).addBox(-1.1444F, -1.0F, -1.92F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1444F, 2.1389F, -0.038F, 1.789F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("average") && variation == 2) {
            PartDefinition top_back_legs_average_average_2_top_back_right_individual = rightRoot.addOrReplaceChild("top_back_legs_average_average_2_top_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_average_2_top_back_right_front = top_back_legs_average_average_2_top_back_right_individual.addOrReplaceChild("top_back_legs_average_average_2_top_back_right_front", CubeListBuilder.create(), PartPose.offset(-0.1444F, 4.1655F, 0.1751F));

            PartDefinition cube_r1 = top_back_legs_average_average_2_top_back_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(249, 318).mirror().addBox(-1.1444F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1444F, 3.0747F, 3.2475F, 1.9199F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_average_2_top_back_right_back = top_back_legs_average_average_2_top_back_right_individual.addOrReplaceChild("top_back_legs_average_average_2_top_back_right_back", CubeListBuilder.create(), PartPose.offset(0.1444F, 3.4597F, 1.4591F));

            PartDefinition cube_r2 = top_back_legs_average_average_2_top_back_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(250, 330).mirror().addBox(-0.8556F, -1.0F, -0.92F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1444F, 3.6124F, 0.1293F, 1.7453F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_average_2_top_back_left_individual = leftRoot.addOrReplaceChild("top_back_legs_average_average_2_top_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_average_2_top_back_left_front = top_back_legs_average_average_2_top_back_left_individual.addOrReplaceChild("top_back_legs_average_average_2_top_back_left_front", CubeListBuilder.create(), PartPose.offset(0.1444F, 4.1655F, 0.1751F));

            PartDefinition cube_r3 = top_back_legs_average_average_2_top_back_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(225, 318).addBox(-0.8556F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1444F, 3.0747F, 3.2475F, 1.9199F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_average_2_top_back_left_back = top_back_legs_average_average_2_top_back_left_individual.addOrReplaceChild("top_back_legs_average_average_2_top_back_left_back", CubeListBuilder.create(), PartPose.offset(-0.1444F, 3.4597F, 1.4591F));

            PartDefinition cube_r4 = top_back_legs_average_average_2_top_back_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(226, 330).addBox(-1.1444F, -1.0F, -0.92F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1444F, 3.6124F, 0.1293F, 1.7453F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("long") && variation == 1) {
            PartDefinition top_back_legs_right_average_long_1_top_back_right_individual = rightRoot.addOrReplaceChild("top_back_legs_right_average_long_1_top_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_long_2_top_back_right_front = top_back_legs_right_average_long_1_top_back_right_individual.addOrReplaceChild("top_back_legs_thick_long_2_top_back_right_front", CubeListBuilder.create(), PartPose.offset(-0.1444F, 4.0268F, -0.2032F));

            PartDefinition cube_r1 = top_back_legs_thick_long_2_top_back_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(290, 324).mirror().addBox(-1.1444F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1444F, 3.2135F, 3.1103F, 1.8762F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_long_2_top_back_right_back = top_back_legs_right_average_long_1_top_back_right_individual.addOrReplaceChild("top_back_legs_thick_long_2_top_back_right_back", CubeListBuilder.create(), PartPose.offset(0.1444F, 3.6851F, 0.9878F));

            PartDefinition cube_r2 = top_back_legs_thick_long_2_top_back_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(290, 311).mirror().addBox(-0.8556F, -1.0F, -1.92F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1444F, 3.1189F, -0.0937F, 1.7017F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_long_1_top_back_left_individual = leftRoot.addOrReplaceChild("top_back_legs_average_long_1_top_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_long_2_top_back_left_front = top_back_legs_average_long_1_top_back_left_individual.addOrReplaceChild("top_back_legs_thick_long_2_top_back_left_front", CubeListBuilder.create(), PartPose.offset(0.1444F, 4.0268F, -0.2032F));

            PartDefinition cube_r3 = top_back_legs_thick_long_2_top_back_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(266, 324).addBox(-0.8556F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1444F, 3.2135F, 3.1103F, 1.8762F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_long_2_top_back_left_back = top_back_legs_average_long_1_top_back_left_individual.addOrReplaceChild("top_back_legs_thick_long_2_top_back_left_back", CubeListBuilder.create(), PartPose.offset(-0.1444F, 3.6851F, 0.9878F));

            PartDefinition cube_r4 = top_back_legs_thick_long_2_top_back_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(266, 311).addBox(-1.1444F, -1.0F, -1.92F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1444F, 3.1189F, -0.0937F, 1.7017F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("long") && variation == 2) {
            PartDefinition top_back_legs_average_long_2_top_back_right_individual = rightRoot.addOrReplaceChild("top_back_legs_average_long_2_top_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_long_2_top_back_right_front = top_back_legs_average_long_2_top_back_right_individual.addOrReplaceChild("top_back_legs_average_long_2_top_back_right_front", CubeListBuilder.create(), PartPose.offset(-0.1444F, 4.6525F, 0.065F));

            PartDefinition cube_r1 = top_back_legs_average_long_2_top_back_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(334, 330).mirror().addBox(-1.1444F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1444F, 3.2135F, 3.1103F, 1.8762F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_long_2_top_back_right_back = top_back_legs_average_long_2_top_back_right_individual.addOrReplaceChild("top_back_legs_average_long_2_top_back_right_back", CubeListBuilder.create(), PartPose.offset(0.1444F, 4.2658F, 1.3854F));

            PartDefinition cube_r2 = top_back_legs_average_long_2_top_back_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(333, 316).mirror().addBox(-0.8556F, -1.0F, -2.92F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1444F, 2.6276F, -0.0444F, 1.7453F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_long_2_top_back_left_individual = leftRoot.addOrReplaceChild("top_back_legs_average_long_2_top_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_long_2_top_back_left_front = top_back_legs_average_long_2_top_back_left_individual.addOrReplaceChild("top_back_legs_average_long_2_top_back_left_front", CubeListBuilder.create(), PartPose.offset(0.1444F, 4.6525F, 0.065F));

            PartDefinition cube_r3 = top_back_legs_average_long_2_top_back_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(308, 330).addBox(-0.8556F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1444F, 3.2135F, 3.1103F, 1.8762F, 0.0F, 0.0F));

            PartDefinition top_back_legs_average_long_2_top_back_left_back = top_back_legs_average_long_2_top_back_left_individual.addOrReplaceChild("top_back_legs_average_long_2_top_back_left_back", CubeListBuilder.create(), PartPose.offset(-0.1444F, 4.2658F, 1.3854F));

            PartDefinition cube_r4 = top_back_legs_average_long_2_top_back_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(307, 316).addBox(-1.1444F, -1.0F, -2.92F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1444F, 2.6276F, -0.0444F, 1.7453F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("short") && variation == 1) {
            PartDefinition top_back_legs_thick_short_1_top_back_right_individual = rightRoot.addOrReplaceChild("top_back_legs_thick_short_1_top_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_short_1_top_back_right_front = top_back_legs_thick_short_1_top_back_right_individual.addOrReplaceChild("top_back_legs_thick_short_1_top_back_right_front", CubeListBuilder.create(), PartPose.offset(-0.055F, 2.3659F, 0.1648F));

            PartDefinition cube_r1 = top_back_legs_thick_short_1_top_back_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(142, 364).mirror().addBox(-1.055F, -2.0F, -1.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.055F, 1.6564F, 1.2273F, 1.9635F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_short_1_top_back_right_back = top_back_legs_thick_short_1_top_back_right_individual.addOrReplaceChild("top_back_legs_thick_short_1_top_back_right_back", CubeListBuilder.create(), PartPose.offset(0.055F, 2.1579F, 1.2586F));

            PartDefinition cube_r2 = top_back_legs_thick_short_1_top_back_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(141, 354).mirror().addBox(-0.945F, -2.0F, 0.08F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.055F, 3.4841F, 0.963F, 1.7017F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_short_1_top_back_left_individual = leftRoot.addOrReplaceChild("top_back_legs_thick_short_1_top_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_short_1_top_back_left_front = top_back_legs_thick_short_1_top_back_left_individual.addOrReplaceChild("top_back_legs_thick_short_1_top_back_left_front", CubeListBuilder.create(), PartPose.offset(0.055F, 2.3659F, 0.1648F));

            PartDefinition cube_r3 = top_back_legs_thick_short_1_top_back_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(124, 364).addBox(-0.945F, -2.0F, -1.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.055F, 1.6564F, 1.2273F, 1.9635F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_short_1_top_back_left_back = top_back_legs_thick_short_1_top_back_left_individual.addOrReplaceChild("top_back_legs_thick_short_1_top_back_left_back", CubeListBuilder.create(), PartPose.offset(-0.055F, 2.1579F, 1.2586F));

            PartDefinition cube_r4 = top_back_legs_thick_short_1_top_back_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(123, 354).addBox(-1.055F, -2.0F, 0.08F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.055F, 3.4841F, 0.963F, 1.7017F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("short") && variation == 2) {
            PartDefinition top_back_legs_thick_short_2_top_back_right_individual = rightRoot.addOrReplaceChild("top_back_legs_thick_short_2_top_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_short_2_top_back_right_front = top_back_legs_thick_short_2_top_back_right_individual.addOrReplaceChild("top_back_legs_thick_short_2_top_back_right_front", CubeListBuilder.create(), PartPose.offset(-0.055F, 2.5297F, -0.199F));

            PartDefinition cube_r1 = top_back_legs_thick_short_2_top_back_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(175, 369).mirror().addBox(-1.055F, -2.0F, -1.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.055F, 2.1184F, 1.4186F, 1.9635F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_short_2_top_back_right_back = top_back_legs_thick_short_2_top_back_right_individual.addOrReplaceChild("top_back_legs_thick_short_2_top_back_right_back", CubeListBuilder.create(), PartPose.offset(0.055F, 2.8242F, 1.1996F));

            PartDefinition cube_r2 = top_back_legs_thick_short_2_top_back_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(174, 358).mirror().addBox(-0.945F, -2.0F, 0.08F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.055F, 3.9798F, 1.0283F, 1.7017F, 0.0F, 0.0F));

            PartDefinition top_back_legs_right_short_2_top_back_left_individual = leftRoot.addOrReplaceChild("top_back_legs_right_short_2_top_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_short_2_top_back_left_front = top_back_legs_right_short_2_top_back_left_individual.addOrReplaceChild("top_back_legs_thick_short_2_top_back_left_front", CubeListBuilder.create(), PartPose.offset(0.055F, 2.5297F, -0.199F));

            PartDefinition cube_r3 = top_back_legs_thick_short_2_top_back_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(155, 369).addBox(-0.945F, -2.0F, -1.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.055F, 2.1184F, 1.4186F, 1.9635F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_short_2_top_back_left_back = top_back_legs_right_short_2_top_back_left_individual.addOrReplaceChild("top_back_legs_thick_short_2_top_back_left_back", CubeListBuilder.create(), PartPose.offset(-0.055F, 2.8242F, 1.1996F));

            PartDefinition cube_r4 = top_back_legs_thick_short_2_top_back_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(154, 358).addBox(-1.055F, -2.0F, 0.08F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.055F, 3.9798F, 1.0283F, 1.7017F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("average") && variation == 1) {
            PartDefinition top_back_legs_thick_average_1_top_back_right_individual = rightRoot.addOrReplaceChild("top_back_legs_thick_average_1_top_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_average_1_top_back_right_front = top_back_legs_thick_average_1_top_back_right_individual.addOrReplaceChild("top_back_legs_thick_average_1_top_back_right_front", CubeListBuilder.create(), PartPose.offset(-0.1444F, 3.7313F, 0.5493F));

            PartDefinition cube_r1 = top_back_legs_thick_average_1_top_back_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(210, 351).mirror().addBox(-1.1444F, -3.0F, -2.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1444F, 1.6318F, 2.416F, 2.0071F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_average_1_top_back_right_back = top_back_legs_thick_average_1_top_back_right_individual.addOrReplaceChild("top_back_legs_thick_average_1_top_back_right_back", CubeListBuilder.create(), PartPose.offset(0.1444F, 3.0562F, 1.616F));

            PartDefinition cube_r2 = top_back_legs_thick_average_1_top_back_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(211, 363).mirror().addBox(-0.8556F, -1.0F, -1.92F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1444F, 2.1389F, -0.038F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_average_1_top_back_left_individual = leftRoot.addOrReplaceChild("top_back_legs_thick_average_1_top_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_average_1_top_back_left_front = top_back_legs_thick_average_1_top_back_left_individual.addOrReplaceChild("top_back_legs_thick_average_1_top_back_left_front", CubeListBuilder.create(), PartPose.offset(0.1444F, 3.7313F, 0.5493F));

            PartDefinition cube_r3 = top_back_legs_thick_average_1_top_back_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(188, 351).addBox(-0.8556F, -3.0F, -2.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1444F, 1.6318F, 2.416F, 2.0071F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_average_1_top_back_left_back = top_back_legs_thick_average_1_top_back_left_individual.addOrReplaceChild("top_back_legs_thick_average_1_top_back_left_back", CubeListBuilder.create(), PartPose.offset(-0.1444F, 3.0562F, 1.616F));

            PartDefinition cube_r4 = top_back_legs_thick_average_1_top_back_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(189, 363).addBox(-1.1444F, -1.0F, -1.92F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1444F, 2.1389F, -0.038F, 1.789F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("average") && variation == 2) {
            PartDefinition top_back_legs_thick_average_2_top_back_right_individual = rightRoot.addOrReplaceChild("top_back_legs_thick_average_2_top_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_average_2_top_back_right_front = top_back_legs_thick_average_2_top_back_right_individual.addOrReplaceChild("top_back_legs_thick_average_2_top_back_right_front", CubeListBuilder.create(), PartPose.offset(-0.1444F, 3.9945F, 0.0193F));

            PartDefinition cube_r1 = top_back_legs_thick_average_2_top_back_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(249, 356).mirror().addBox(-1.1444F, -3.0F, -1.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1444F, 3.2457F, 2.7776F, 1.9199F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_average_2_top_back_right_back = top_back_legs_thick_average_2_top_back_right_individual.addOrReplaceChild("top_back_legs_thick_average_2_top_back_right_back", CubeListBuilder.create(), PartPose.offset(0.1444F, 3.4597F, 1.4591F));

            PartDefinition cube_r2 = top_back_legs_thick_average_2_top_back_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(250, 369).mirror().addBox(-0.8556F, -1.0F, -0.92F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1444F, 3.6124F, 0.1293F, 1.7453F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_average_2_top_back_left_individual = leftRoot.addOrReplaceChild("top_back_legs_thick_average_2_top_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_average_2_top_back_left_front = top_back_legs_thick_average_2_top_back_left_individual.addOrReplaceChild("top_back_legs_thick_average_2_top_back_left_front", CubeListBuilder.create(), PartPose.offset(0.1444F, 3.9945F, 0.0193F));

            PartDefinition cube_r3 = top_back_legs_thick_average_2_top_back_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(225, 356).addBox(-0.8556F, -3.0F, -1.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1444F, 3.2457F, 2.7776F, 1.9199F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_average_2_top_back_left_back = top_back_legs_thick_average_2_top_back_left_individual.addOrReplaceChild("top_back_legs_thick_average_2_top_back_left_back", CubeListBuilder.create(), PartPose.offset(-0.1444F, 3.4597F, 1.4591F));

            PartDefinition cube_r4 = top_back_legs_thick_average_2_top_back_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(226, 369).addBox(-1.1444F, -1.0F, -0.92F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1444F, 3.6124F, 0.1293F, 1.7453F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("long") && variation == 1) {
            PartDefinition top_back_legs_thick_long_1_top_back_right_individual = rightRoot.addOrReplaceChild("top_back_legs_thick_long_1_top_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_long_1_top_back_right_front = top_back_legs_thick_long_1_top_back_right_individual.addOrReplaceChild("top_back_legs_thick_long_1_top_back_right_front", CubeListBuilder.create(), PartPose.offset(0.1444F, 4.1446F, 0.0949F));

            PartDefinition cube_r1 = top_back_legs_thick_long_1_top_back_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(265, 362).addBox(-0.8556F, -3.0F, -1.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1444F, 3.3638F, 2.6334F, 1.8762F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_long_1_top_back_right_back = top_back_legs_thick_long_1_top_back_right_individual.addOrReplaceChild("top_back_legs_thick_long_1_top_back_right_back", CubeListBuilder.create(), PartPose.offset(-0.1444F, 3.9533F, 1.5241F));

            PartDefinition cube_r2 = top_back_legs_thick_long_1_top_back_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(265, 349).addBox(-1.1444F, -1.0F, -1.92F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1444F, 3.1189F, -0.0937F, 1.7017F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_long_1_top_back_left_individual = leftRoot.addOrReplaceChild("top_back_legs_thick_long_1_top_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_long_1_top_back_left_front = top_back_legs_thick_long_1_top_back_left_individual.addOrReplaceChild("top_back_legs_thick_long_1_top_back_left_front", CubeListBuilder.create(), PartPose.offset(-0.1444F, 4.1446F, 0.0949F));

            PartDefinition cube_r3 = top_back_legs_thick_long_1_top_back_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(289, 362).mirror().addBox(-1.1444F, -3.0F, -1.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1444F, 3.3638F, 2.6334F, 1.8762F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_long_1_top_back_left_back = top_back_legs_thick_long_1_top_back_left_individual.addOrReplaceChild("top_back_legs_thick_long_1_top_back_left_back", CubeListBuilder.create(), PartPose.offset(0.1444F, 3.9533F, 1.5241F));

            PartDefinition cube_r4 = top_back_legs_thick_long_1_top_back_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(289, 349).mirror().addBox(-0.8556F, -1.0F, -1.92F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1444F, 3.1189F, -0.0937F, 1.7017F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("long") && variation == 2) {
            PartDefinition top_back_legs_thick_long_2_top_back_right_individual = rightRoot.addOrReplaceChild("top_back_legs_thick_long_2_top_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_long_2_top_back_right_front = top_back_legs_thick_long_2_top_back_right_individual.addOrReplaceChild("top_back_legs_thick_long_2_top_back_right_front", CubeListBuilder.create(), PartPose.offset(-0.1444F, 4.5021F, -0.1733F));

            PartDefinition cube_r1 = top_back_legs_thick_long_2_top_back_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(331, 368).mirror().addBox(-1.1444F, -3.0F, -1.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1444F, 3.3638F, 2.6334F, 1.8762F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_long_2_top_back_right_back = top_back_legs_thick_long_2_top_back_right_individual.addOrReplaceChild("top_back_legs_thick_long_2_top_back_right_back", CubeListBuilder.create(), PartPose.offset(0.1444F, 4.2658F, 1.3854F));

            PartDefinition cube_r2 = top_back_legs_thick_long_2_top_back_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(331, 354).mirror().addBox(-0.8556F, -1.0F, -2.92F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1444F, 2.6276F, -0.0444F, 1.7453F, 0.0F, 0.0F));

            PartDefinition top_back_legs_right_long_2_top_back_left_individual = leftRoot.addOrReplaceChild("top_back_legs_right_long_2_top_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_long_2_top_back_left_front = top_back_legs_right_long_2_top_back_left_individual.addOrReplaceChild("top_back_legs_thick_long_2_top_back_left_front", CubeListBuilder.create(), PartPose.offset(0.1444F, 4.5021F, -0.1733F));

            PartDefinition cube_r3 = top_back_legs_thick_long_2_top_back_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(307, 368).addBox(-0.8556F, -3.0F, -1.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1444F, 3.3638F, 2.6334F, 1.8762F, 0.0F, 0.0F));

            PartDefinition top_back_legs_thick_long_2_top_back_left_back = top_back_legs_right_long_2_top_back_left_individual.addOrReplaceChild("top_back_legs_thick_long_2_top_back_left_back", CubeListBuilder.create(), PartPose.offset(-0.1444F, 4.2658F, 1.3854F));

            PartDefinition cube_r4 = top_back_legs_thick_long_2_top_back_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(305, 354).addBox(-1.1444F, -1.0F, -2.92F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1444F, 2.6276F, -0.0444F, 1.7453F, 0.0F, 0.0F));

        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Top Hind Legs / " + thickness + " / " + length + " / Variation " + variation + ", Cancelling Generation...");
        }

        allParts.add("top_back_legs_" + thickness + "_" + length + "_" + variation + "_top_back_right_individual");
        allParts.add("top_back_legs_" + thickness + "_" + length + "_" + variation + "_top_back_left_individual");

        return new PartDefinition[]{leftRoot, rightRoot};
    }

    public static PartDefinition[] GenerateAll(PartDefinition leftRoot, PartDefinition rightRoot) {
        List<String> thickness = List.of("thin", "average", "thick");
        List<String> length = List.of("short", "average", "long");
        PartDefinition[] roots;

        for(String variable1 : thickness){
            for(String variable2 : length){
                roots = Generate(leftRoot, rightRoot, variable1, variable2, 1);
                leftRoot = roots[0];
                rightRoot = roots[1];

                roots = Generate(leftRoot, rightRoot, variable1, variable2, 2);
                leftRoot = roots[0];
                rightRoot = roots[1];
            }
        }
        return new PartDefinition[]{leftRoot, rightRoot};
    }
}