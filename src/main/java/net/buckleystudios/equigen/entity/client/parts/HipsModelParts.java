package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

import java.util.ArrayList;
import java.util.List;

public class HipsModelParts {
    private static List<String> allParts = new ArrayList<>();
    public static List<String> getAllParts(){
        return allParts;
    }
    public static PartDefinition Generate(PartDefinition partdefinition, String muscleMass, String size, int variation) {
        if (muscleMass.equals("lean") && size.equals("small") && variation == 1) {
            PartDefinition hips_lean_small_1 = partdefinition.addOrReplaceChild("hips_lean_small_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition hips_lean_small_1_left_hip = hips_lean_small_1.addOrReplaceChild("hips_lean_small_1_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_lean_small_1_left_hip_glute_base = hips_lean_small_1_left_hip.addOrReplaceChild("hips_lean_small_1_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.0894F, 0.0F, -0.8939F));

            PartDefinition hips_lean_small_1_left_hip_glute_base_individual = hips_lean_small_1_left_hip_glute_base.addOrReplaceChild("hips_lean_small_1_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(0, 886).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(1.6648F, -0.0391F, 0.2144F));

            PartDefinition hips_lean_small_1_left_hip_glute_outer = hips_lean_small_1_left_hip_glute_base.addOrReplaceChild("hips_lean_small_1_left_hip_glute_outer", CubeListBuilder.create().texOffs(4, 898).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.1117F, -0.0363F, 0.2339F));

            PartDefinition hips_lean_small_1_right_hip = hips_lean_small_1.addOrReplaceChild("hips_lean_small_1_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_lean_small_1_right_hip_glute_base = hips_lean_small_1_right_hip.addOrReplaceChild("hips_lean_small_1_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.0894F, 0.0F, -0.8939F));

            PartDefinition hips_lean_small_1_right_hip_glue_base_individual = hips_lean_small_1_right_hip_glute_base.addOrReplaceChild("hips_lean_small_1_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(21, 907).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.3418F, -0.0705F, 0.2333F));

            PartDefinition hips_lean_small_1_right_hip_glue_outer = hips_lean_small_1_right_hip_glute_base.addOrReplaceChild("hips_lean_small_1_right_hip_glue_outer", CubeListBuilder.create().texOffs(3, 908).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8883F, -0.0363F, 0.2339F));

            PartDefinition hips_lean_small_1_hips_top = hips_lean_small_1.addOrReplaceChild("hips_lean_small_1_hips_top", CubeListBuilder.create(), PartPose.offset(-0.0894F, -1.162F, -0.0894F));

            PartDefinition hips_lean_small_1_hips_top_upper = hips_lean_small_1_hips_top.addOrReplaceChild("hips_lean_small_1_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.1511F, 0.0156F, 0.7394F));

            PartDefinition cube_r1 = hips_lean_small_1_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(22, 897).addBox(-4.08F, -5.24F, -4.36F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -0.6699F, 3.2432F, 1.1781F, 0.0F, 0.0F));

            PartDefinition hips_lean_small_1_hips_top_lower = hips_lean_small_1_hips_top.addOrReplaceChild("hips_lean_small_1_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.1511F, 1.3965F, 0.4887F));

            PartDefinition cube_r2 = hips_lean_small_1_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(20, 886).addBox(-5.08F, -4.24F, -5.36F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -1.5145F, 2.5107F, 1.1781F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && size.equals("small") && variation == 2) {
            PartDefinition hips_lean_small_2 = partdefinition.addOrReplaceChild("hips_lean_small_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition hips_lean_small_2_left_hip = hips_lean_small_2.addOrReplaceChild("hips_lean_small_2_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_lean_small_2_left_hip_glute_base = hips_lean_small_2_left_hip.addOrReplaceChild("hips_lean_small_2_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.3575F, 0.0F, -0.6257F));

            PartDefinition hips_lean_small_2_left_hip_glute_base_individual = hips_lean_small_2_left_hip_glute_base.addOrReplaceChild("hips_lean_small_2_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(72, 906).addBox(-2.0F, -3.5F, -3.0F, 4.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(1.8436F, 0.2654F, -0.0538F));

            PartDefinition hips_lean_small_2_left_hip_glute_outer = hips_lean_small_2_left_hip_glute_base.addOrReplaceChild("hips_lean_small_2_left_hip_glute_outer", CubeListBuilder.create().texOffs(53, 896).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.3799F, -0.1257F, -0.0342F));

            PartDefinition hips_lean_small_2_right_hip = hips_lean_small_2.addOrReplaceChild("hips_lean_small_2_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_lean_small_2_right_hip_glute_base = hips_lean_small_2_right_hip.addOrReplaceChild("hips_lean_small_2_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.3575F, 0.0F, -0.6257F));

            PartDefinition hips_lean_small_2_right_hip_glue_base_individual = hips_lean_small_2_right_hip_glute_base.addOrReplaceChild("hips_lean_small_2_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(52, 906).addBox(-2.0F, -3.5F, -3.0F, 4.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.1649F, 0.2277F, -0.0232F));

            PartDefinition hips_lean_small_2_right_hip_glue_outer = hips_lean_small_2_right_hip_glute_base.addOrReplaceChild("hips_lean_small_2_right_hip_glue_outer", CubeListBuilder.create().texOffs(51, 886).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.6201F, 0.1425F, -0.0342F));

            PartDefinition hips_lean_small_2_hips_top = hips_lean_small_2.addOrReplaceChild("hips_lean_small_2_hips_top", CubeListBuilder.create(), PartPose.offset(-0.3575F, -0.9832F, 1.0726F));

            PartDefinition hips_lean_small_2_hips_top_upper = hips_lean_small_2_hips_top.addOrReplaceChild("hips_lean_small_2_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.4192F, -0.342F, -0.4226F));

            PartDefinition cube_r1 = hips_lean_small_2_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(71, 896).addBox(-4.1694F, -5.24F, -4.36F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1694F, -0.6699F, 3.2432F, 1.1781F, 0.0F, 0.0F));

            PartDefinition hips_lean_small_2_hips_top_lower = hips_lean_small_2_hips_top.addOrReplaceChild("hips_lean_small_2_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.4192F, 1.1283F, -0.6733F));

            PartDefinition cube_r2 = hips_lean_small_2_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(69, 885).addBox(-5.1694F, -4.909F, -6.3143F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1694F, -2.1402F, 3.4939F, 1.1781F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && size.equals("average") && variation == 1) {
            PartDefinition hips_lean_average_1 = partdefinition.addOrReplaceChild("hips_lean_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition hips_lean_average_1_left_hip = hips_lean_average_1.addOrReplaceChild("hips_lean_average_1_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_lean_average_1_left_hip_glute_base = hips_lean_average_1_left_hip.addOrReplaceChild("hips_lean_average_1_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -1.0726F));

            PartDefinition hips_lean_average_1_left_hip_glute_base_individual = hips_lean_average_1_left_hip_glute_base.addOrReplaceChild("hips_lean_average_1_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(103, 884).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5196F, 0.1927F, 0.1446F));

            PartDefinition hips_lean_average_1_left_hip_glute_outer = hips_lean_average_1_left_hip_glute_base.addOrReplaceChild("hips_lean_average_1_left_hip_glute_outer", CubeListBuilder.create().texOffs(107, 898).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9665F, -0.0196F, 0.1446F));

            PartDefinition hips_lean_average_1_right_hip = hips_lean_average_1.addOrReplaceChild("hips_lean_average_1_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_lean_average_1_right_hip_glute_base = hips_lean_average_1_right_hip.addOrReplaceChild("hips_lean_average_1_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -1.0726F));

            PartDefinition hips_lean_average_1_right_hip_glue_base_individual = hips_lean_average_1_right_hip_glute_base.addOrReplaceChild("hips_lean_average_1_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(125, 885).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.4856F, 0.1558F, 0.1808F));

            PartDefinition hips_lean_average_1_right_hip_glue_outer = hips_lean_average_1_right_hip_glute_base.addOrReplaceChild("hips_lean_average_1_right_hip_glue_outer", CubeListBuilder.create().texOffs(125, 899).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0335F, -0.0196F, 0.1446F));

            PartDefinition hips_lean_average_1_hips_top = hips_lean_average_1.addOrReplaceChild("hips_lean_average_1_hips_top", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9832F, 0.8939F));

            PartDefinition hips_lean_average_1_hips_top_upper = hips_lean_average_1_hips_top.addOrReplaceChild("hips_lean_average_1_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.0086F, -0.0966F, -0.002F));

            PartDefinition cube_r1 = hips_lean_average_1_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(127, 909).addBox(-5.08F, -4.24F, -5.36F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -1.4515F, 2.9121F, 1.2217F, 0.0F, 0.0F));

            PartDefinition hips_lean_average_1_hips_top_lower = hips_lean_average_1_hips_top.addOrReplaceChild("hips_lean_average_1_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.0617F, 0.7001F, -0.3367F));

            PartDefinition cube_r2 = hips_lean_average_1_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(103, 908).addBox(-5.08F, -4.24F, -5.36F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -1.6226F, 2.4422F, 1.2217F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && size.equals("average") && variation == 2) {
            PartDefinition hips_lean_average_2 = partdefinition.addOrReplaceChild("hips_lean_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition hips_lean_average_2_left_hip = hips_lean_average_2.addOrReplaceChild("hips_lean_average_2_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_lean_average_2_left_hip_glute_base = hips_lean_average_2_left_hip.addOrReplaceChild("hips_lean_average_2_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.0894F, 0.0F, -0.4469F));

            PartDefinition hips_lean_average_2_left_hip_glute_base_individual = hips_lean_average_2_left_hip_glute_base.addOrReplaceChild("hips_lean_average_2_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(158, 882).addBox(-2.0F, -4.0F, -3.5F, 4.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(1.6816F, 0.1229F, -0.1068F));

            PartDefinition hips_lean_average_2_left_hip_glute_outer = hips_lean_average_2_left_hip_glute_base.addOrReplaceChild("hips_lean_average_2_left_hip_glute_outer", CubeListBuilder.create().texOffs(180, 896).addBox(-2.0F, -3.0F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.1453F, 0.1061F, -0.0342F));

            PartDefinition hips_lean_average_2_right_hip = hips_lean_average_2.addOrReplaceChild("hips_lean_average_2_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_lean_average_2_right_hip_glute_base = hips_lean_average_2_right_hip.addOrReplaceChild("hips_lean_average_2_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.0894F, 0.0F, -0.4469F));

            PartDefinition hips_lean_average_2_right_hip_glue_base_individual = hips_lean_average_2_right_hip_glute_base.addOrReplaceChild("hips_lean_average_2_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(180, 881).addBox(-2.0F, -4.0F, -3.5F, 4.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.3253F, 0.0817F, -0.069F));

            PartDefinition hips_lean_average_2_right_hip_glue_outer = hips_lean_average_2_right_hip_glute_base.addOrReplaceChild("hips_lean_average_2_right_hip_glue_outer", CubeListBuilder.create().texOffs(162, 897).addBox(-2.0F, -3.0F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8547F, 0.1061F, -0.0342F));

            PartDefinition hips_lean_average_2_hips_top = hips_lean_average_2.addOrReplaceChild("hips_lean_average_2_hips_top", CubeListBuilder.create(), PartPose.offset(-0.0894F, -0.9832F, 1.4302F));

            PartDefinition hips_lean_average_2_hips_top_upper = hips_lean_average_2_hips_top.addOrReplaceChild("hips_lean_average_2_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.2404F, 0.3962F, -0.9698F));

            PartDefinition cube_r1 = hips_lean_average_2_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(155, 908).addBox(-4.08F, -4.24F, -7.36F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.3912F, 3.2541F, 1.2217F, 0.0F, 0.0F));

            PartDefinition hips_lean_average_2_hips_top_lower = hips_lean_average_2_hips_top.addOrReplaceChild("hips_lean_average_2_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.2404F, 1.0141F, -0.9468F));

            PartDefinition cube_r2 = hips_lean_average_2_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(179, 907).addBox(-5.08F, -4.24F, -7.36F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.5623F, 2.7843F, 1.2217F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && size.equals("large") && variation == 1) {
            PartDefinition hips_lean_large_1 = partdefinition.addOrReplaceChild("hips_lean_large_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition hips_lean_large_1_left_hip = hips_lean_large_1.addOrReplaceChild("hips_lean_large_1_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_lean_large_1_left_hip_glute_base = hips_lean_large_1_left_hip.addOrReplaceChild("hips_lean_large_1_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.3575F, 0.0F, -0.3575F));

            PartDefinition hips_lean_large_1_left_hip_glute_base_individual = hips_lean_large_1_left_hip_glute_base.addOrReplaceChild("hips_lean_large_1_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(238, 879).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.1453F, 0.2123F, -0.2325F));

            PartDefinition hips_lean_large_1_left_hip_glute_outer = hips_lean_large_1_left_hip_glute_base.addOrReplaceChild("hips_lean_large_1_left_hip_glute_outer", CubeListBuilder.create().texOffs(219, 896).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(1.6089F, 0.1955F, -0.3387F));

            PartDefinition hips_lean_large_1_right_hip = hips_lean_large_1.addOrReplaceChild("hips_lean_large_1_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_lean_large_1_right_hip_glute_base = hips_lean_large_1_right_hip.addOrReplaceChild("hips_lean_large_1_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.3575F, 0.0F, -0.3575F));

            PartDefinition hips_lean_large_1_right_hip_glue_base_individual = hips_lean_large_1_right_hip_glute_base.addOrReplaceChild("hips_lean_large_1_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(214, 880).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8692F, 0.1735F, -0.1854F));

            PartDefinition hips_lean_large_1_right_hip_glue_outer = hips_lean_large_1_right_hip_glute_base.addOrReplaceChild("hips_lean_large_1_right_hip_glue_outer", CubeListBuilder.create().texOffs(239, 895).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.3911F, 0.1955F, -0.3387F));

            PartDefinition hips_lean_large_1_hips_top = hips_lean_large_1.addOrReplaceChild("hips_lean_large_1_hips_top", CubeListBuilder.create(), PartPose.offset(0.3575F, 0.5363F, 0.2682F));

            PartDefinition hips_lean_large_1_hips_top_upper = hips_lean_large_1_hips_top.addOrReplaceChild("hips_lean_large_1_hips_top_upper", CubeListBuilder.create(), PartPose.offset(-0.2959F, -1.034F, 0.371F));

            PartDefinition cube_r1 = hips_lean_large_1_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(215, 908).addBox(-4.08F, -4.24F, -7.36F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.3912F, 3.2541F, 1.2217F, 0.0F, 0.0F));

            PartDefinition hips_lean_large_1_hips_top_lower = hips_lean_large_1_hips_top.addOrReplaceChild("hips_lean_large_1_hips_top_lower", CubeListBuilder.create(), PartPose.offset(-0.2959F, -0.4161F, 0.3939F));

            PartDefinition cube_r2 = hips_lean_large_1_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(239, 907).addBox(-5.08F, -4.24F, -7.36F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.5623F, 2.7843F, 1.2217F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && size.equals("large") && variation == 2) {
            PartDefinition hips_lean_large_2 = partdefinition.addOrReplaceChild("hips_lean_large_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition hips_muscular_large_2_left_hip = hips_lean_large_2.addOrReplaceChild("hips_muscular_large_2_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_lean_large_2_left_hip_glute_base = hips_muscular_large_2_left_hip.addOrReplaceChild("hips_lean_large_2_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_lean_large_2_left_hip_glute_base_individual = hips_lean_large_2_left_hip_glute_base.addOrReplaceChild("hips_lean_large_2_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(295, 890).addBox(-2.4312F, -4.457F, -4.0414F, 4.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6491F, 0.295F, -0.1017F));

            PartDefinition hips_lean_large_2_left_hip_glute_outer = hips_lean_large_2_left_hip_glute_base.addOrReplaceChild("hips_lean_large_2_left_hip_glute_outer", CubeListBuilder.create().texOffs(297, 877).addBox(-2.0F, -3.5F, -3.0F, 4.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6816F, 0.2318F, -0.0705F));

            PartDefinition hips_lean_large_2_right_hip = hips_lean_large_2.addOrReplaceChild("hips_lean_large_2_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_lean_large_2_right_hip_glute_base = hips_lean_large_2_right_hip.addOrReplaceChild("hips_lean_large_2_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_lean_large_2_right_hip_glue_base_individual = hips_lean_large_2_right_hip_glute_base.addOrReplaceChild("hips_lean_large_2_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(273, 877).addBox(-2.0F, -4.5F, -4.0F, 4.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.7943F, 0.295F, -0.1017F));

            PartDefinition hips_lean_large_2_right_hip_glue_outer = hips_lean_large_2_right_hip_glute_base.addOrReplaceChild("hips_lean_large_2_right_hip_glue_outer", CubeListBuilder.create().texOffs(275, 894).addBox(-2.0F, -3.5F, -3.0F, 4.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.3184F, 0.2318F, -0.0705F));

            PartDefinition hips_lean_large_2_hips_top = hips_lean_large_2.addOrReplaceChild("hips_lean_large_2_hips_top", CubeListBuilder.create(), PartPose.offset(0.0F, -1.162F, 1.2514F));

            PartDefinition hips_lean_large_2_hips_top_upper = hips_lean_large_2_hips_top.addOrReplaceChild("hips_lean_large_2_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.6874F, -0.1402F, -0.1653F));

            PartDefinition cube_r1 = hips_lean_large_2_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(298, 907).addBox(-4.08F, -4.24F, -7.36F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.3912F, 3.2541F, 1.2217F, 0.0F, 0.0F));

            PartDefinition hips_lean_large_2_hips_top_lower = hips_lean_large_2_hips_top.addOrReplaceChild("hips_lean_large_2_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.6874F, 0.5672F, -0.4105F));

            PartDefinition cube_r2 = hips_lean_large_2_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(270, 907).addBox(-5.08F, -4.24F, -7.36F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.5623F, 2.7843F, 1.2217F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && size.equals("small") && variation == 1) {
            PartDefinition hips_average_small_1 = partdefinition.addOrReplaceChild("hips_average_small_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition hips_average_small_1_left_hip = hips_average_small_1.addOrReplaceChild("hips_average_small_1_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_average_small_1_left_hip_glute_base = hips_average_small_1_left_hip.addOrReplaceChild("hips_average_small_1_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_average_small_1_left_hip_glute_base_individual = hips_average_small_1_left_hip_glute_base.addOrReplaceChild("hips_average_small_1_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(20, 934).addBox(-2.5374F, -2.619F, -1.79F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6491F, -0.2413F, -1.2637F));

            PartDefinition hips_average_small_1_left_hip_glute_outer = hips_average_small_1_left_hip_glute_base.addOrReplaceChild("hips_average_small_1_left_hip_glute_outer", CubeListBuilder.create().texOffs(0, 957).addBox(-3.5168F, -2.0531F, -1.3017F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(3.1648F, -0.3045F, -1.2325F));

            PartDefinition hips_average_small_1_right_hip = hips_average_small_1.addOrReplaceChild("hips_average_small_1_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_average_small_1_right_hip_glute_base = hips_average_small_1_right_hip.addOrReplaceChild("hips_average_small_1_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_average_small_1_right_hip_glue_base_individual = hips_average_small_1_right_hip_glute_base.addOrReplaceChild("hips_average_small_1_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(0, 935).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8883F, 0.1397F, -0.0538F));

            PartDefinition hips_average_small_1_right_hip_glue_outer = hips_average_small_1_right_hip_glute_base.addOrReplaceChild("hips_average_small_1_right_hip_glue_outer", CubeListBuilder.create().texOffs(0, 947).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8768F, 0.113F, -0.0212F));

            PartDefinition hips_average_small_1_hips_top = hips_average_small_1.addOrReplaceChild("hips_average_small_1_hips_top", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9832F, 0.5363F));

            PartDefinition hips_average_small_1_hips_top_upper = hips_average_small_1_hips_top.addOrReplaceChild("hips_average_small_1_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.1511F, 0.0156F, 0.7394F));

            PartDefinition cube_r1 = hips_average_small_1_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 946).addBox(-4.08F, -5.24F, -4.36F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -0.6699F, 3.2432F, 1.1781F, 0.0F, 0.0F));

            PartDefinition hips_average_small_1_hips_top_lower = hips_average_small_1_hips_top.addOrReplaceChild("hips_average_small_1_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.1511F, 1.3965F, 0.4887F));

            PartDefinition cube_r2 = hips_average_small_1_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(20, 956).addBox(-5.08F, -4.24F, -5.36F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -1.5145F, 2.5107F, 1.1781F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && size.equals("small") && variation == 2) {
            PartDefinition hips_average_small_2 = partdefinition.addOrReplaceChild("hips_average_small_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition hips_average_small_2_left_hip = hips_average_small_2.addOrReplaceChild("hips_average_small_2_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_average_small_2_left_hip_glute_base = hips_average_small_2_left_hip.addOrReplaceChild("hips_average_small_2_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_average_small_2_left_hip_glute_base_individual = hips_average_small_2_left_hip_glute_base.addOrReplaceChild("hips_average_small_2_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(70, 933).addBox(-2.0F, -3.5F, -3.0F, 4.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.4693F, -0.0028F, -0.0538F));

            PartDefinition hips_average_small_2_left_hip_glute_outer = hips_average_small_2_left_hip_glute_base.addOrReplaceChild("hips_average_small_2_left_hip_glute_outer", CubeListBuilder.create().texOffs(51, 957).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.4162F, -0.1257F, -0.0342F));

            PartDefinition hips_average_small_2_right_hip = hips_average_small_2.addOrReplaceChild("hips_average_small_2_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_average_small_2_right_hip_glute_base = hips_average_small_2_right_hip.addOrReplaceChild("hips_average_small_2_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_average_small_2_right_hip_glue_base_individual = hips_average_small_2_right_hip_glute_base.addOrReplaceChild("hips_average_small_2_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(50, 934).addBox(-2.0F, -3.5F, -3.0F, 4.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5307F, -0.0028F, -0.0538F));

            PartDefinition hips_average_small_2_right_hip_glue_outer = hips_average_small_2_right_hip_glute_base.addOrReplaceChild("hips_average_small_2_right_hip_glue_outer", CubeListBuilder.create().texOffs(51, 947).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.6113F, -0.1525F, -0.0096F));

            PartDefinition hips_average_small_2_hips_top = hips_average_small_2.addOrReplaceChild("hips_average_small_2_hips_top", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9832F, 1.6983F));

            PartDefinition hips_average_small_2_hips_top_upper = hips_average_small_2_hips_top.addOrReplaceChild("hips_average_small_2_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.3298F, -0.342F, -0.4226F));

            PartDefinition cube_r1 = hips_average_small_2_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(71, 946).addBox(-4.08F, -5.24F, -4.36F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -0.6699F, 3.2432F, 1.1781F, 0.0F, 0.0F));

            PartDefinition hips_average_small_2_hips_top_lower = hips_average_small_2_hips_top.addOrReplaceChild("hips_average_small_2_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.3298F, 1.1283F, -0.6733F));

            PartDefinition cube_r2 = hips_average_small_2_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(71, 956).addBox(-5.08F, -4.24F, -5.36F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -1.5145F, 2.5107F, 1.1781F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && size.equals("average") && variation == 1) {
            PartDefinition hips_average_average_1 = partdefinition.addOrReplaceChild("hips_average_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition hips_average_average_1_left_hip = hips_average_average_1.addOrReplaceChild("hips_average_average_1_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_average_average_1_left_hip_glute_base = hips_average_average_1_left_hip.addOrReplaceChild("hips_average_average_1_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.8045F));

            PartDefinition hips_average_average_1_left_hip_glute_base_individual = hips_average_average_1_left_hip_glute_base.addOrReplaceChild("hips_average_average_1_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(102, 933).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9665F, 0.1927F, -0.1236F));

            PartDefinition hips_average_average_1_left_hip_glute_outer = hips_average_average_1_left_hip_glute_base.addOrReplaceChild("hips_average_average_1_left_hip_glute_outer", CubeListBuilder.create().texOffs(103, 957).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0028F, -0.0196F, -0.1236F));

            PartDefinition hips_average_average_1_right_hip = hips_average_average_1.addOrReplaceChild("hips_average_average_1_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_average_average_1_right_hip_glute_base = hips_average_average_1_right_hip.addOrReplaceChild("hips_average_average_1_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.8045F));

            PartDefinition hips_average_average_1_right_hip_glue_base_individual = hips_average_average_1_right_hip_glute_base.addOrReplaceChild("hips_average_average_1_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(124, 932).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0335F, 0.1927F, -0.1236F));

            PartDefinition hips_average_average_1_right_hip_glue_outer = hips_average_average_1_right_hip_glute_base.addOrReplaceChild("hips_average_average_1_right_hip_glue_outer", CubeListBuilder.create().texOffs(102, 947).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0206F, -0.0474F, -0.0981F));

            PartDefinition hips_average_average_1_hips_top = hips_average_average_1.addOrReplaceChild("hips_average_average_1_hips_top", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_average_average_1_hips_top_upper = hips_average_average_1_hips_top.addOrReplaceChild("hips_average_average_1_hips_top_upper", CubeListBuilder.create(), PartPose.offset(-0.1702F, -1.0798F, 0.8918F));

            PartDefinition cube_r1 = hips_average_average_1_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(122, 946).addBox(-5.08F, -4.24F, -5.36F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -1.4515F, 2.9121F, 1.2217F, 0.0F, 0.0F));

            PartDefinition hips_average_average_1_hips_top_lower = hips_average_average_1_hips_top.addOrReplaceChild("hips_average_average_1_hips_top_lower", CubeListBuilder.create(), PartPose.offset(-0.0808F, -0.2831F, 0.5572F));

            PartDefinition cube_r2 = hips_average_average_1_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(123, 956).addBox(-6.08F, -4.24F, -5.36F, 7.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -1.6226F, 2.4422F, 1.2217F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && size.equals("average") && variation == 2) {
            PartDefinition hips_average_average_2 = partdefinition.addOrReplaceChild("hips_average_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition hips_average_average_2_left_hip = hips_average_average_2.addOrReplaceChild("hips_average_average_2_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_average_average_2_left_hip_glute_base = hips_average_average_2_left_hip.addOrReplaceChild("hips_average_average_2_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.1788F, 0.0F, -0.2682F));

            PartDefinition hips_average_average_2_left_hip_glute_base_individual = hips_average_average_2_left_hip_glute_base.addOrReplaceChild("hips_average_average_2_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(160, 940).addBox(-2.4312F, -3.6358F, -3.6839F, 4.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6491F, -0.2413F, -0.1017F));

            PartDefinition hips_average_average_2_left_hip_glute_outer = hips_average_average_2_left_hip_glute_base.addOrReplaceChild("hips_average_average_2_left_hip_glute_outer", CubeListBuilder.create().texOffs(182, 956).addBox(-3.4832F, -2.5894F, -2.6425F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(3.1648F, -0.3045F, -0.0705F));

            PartDefinition hips_average_average_2_right_hip = hips_average_average_2.addOrReplaceChild("hips_average_average_2_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_average_average_2_right_hip_glute_base = hips_average_average_2_right_hip.addOrReplaceChild("hips_average_average_2_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.1788F, 0.0F, -0.2682F));

            PartDefinition hips_average_average_2_right_hip_glue_base_individual = hips_average_average_2_right_hip_glute_base.addOrReplaceChild("hips_average_average_2_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(160, 925).addBox(-2.4832F, -3.6788F, -3.6425F, 4.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.2989F, -0.1983F, -0.1431F));

            PartDefinition hips_average_average_2_right_hip_glue_outer = hips_average_average_2_right_hip_glute_base.addOrReplaceChild("hips_average_average_2_right_hip_glue_outer", CubeListBuilder.create().texOffs(182, 945).addBox(-2.5084F, -2.6235F, -2.616F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8352F, -0.3045F, -0.0705F));

            PartDefinition hips_average_average_2_hips_top = hips_average_average_2.addOrReplaceChild("hips_average_average_2_hips_top", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9832F, 0.0F));

            PartDefinition hips_average_average_2_hips_top_upper = hips_average_average_2_hips_top.addOrReplaceChild("hips_average_average_2_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.7237F, -0.1402F, 1.2649F));

            PartDefinition cube_r1 = hips_average_average_2_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(158, 955).addBox(-4.08F, -4.24F, -7.36F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5074F, -1.8549F, 2.4496F, 1.2217F, 0.0F, 0.0F));

            PartDefinition hips_average_average_2_hips_top_lower = hips_average_average_2_hips_top.addOrReplaceChild("hips_average_average_2_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.6343F, 0.5672F, 1.0196F));

            PartDefinition cube_r2 = hips_average_average_2_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(175, 932).addBox(-5.08F, -4.24F, -7.36F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5968F, -2.1153F, 2.2479F, 1.2217F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && size.equals("large") && variation == 1) {
            PartDefinition hips_average_large_1 = partdefinition.addOrReplaceChild("hips_average_large_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition hips_average_large_1_left_hip = hips_average_large_1.addOrReplaceChild("hips_average_large_1_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_average_large_1_left_hip_glute_base = hips_average_large_1_left_hip.addOrReplaceChild("hips_average_large_1_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.3575F, 0.0F, 0.2682F));

            PartDefinition hips_average_large_1_left_hip_glute_base_individual = hips_average_large_1_left_hip_glute_base.addOrReplaceChild("hips_average_large_1_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(217, 938).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.6816F, -0.324F, -0.8582F));

            PartDefinition hips_average_large_1_left_hip_glute_outer = hips_average_large_1_left_hip_glute_base.addOrReplaceChild("hips_average_large_1_left_hip_glute_outer", CubeListBuilder.create().texOffs(240, 955).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(1.7346F, -0.3408F, -0.9644F));

            PartDefinition hips_muscular_large_2_right_hip = hips_average_large_1.addOrReplaceChild("hips_muscular_large_2_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_average_large_1_right_hip_glute_base = hips_muscular_large_2_right_hip.addOrReplaceChild("hips_average_large_1_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.3575F, 0.0F, 0.2682F));

            PartDefinition hips_average_large_1_right_hip_glue_base_individual = hips_average_large_1_right_hip_glute_base.addOrReplaceChild("hips_average_large_1_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(224, 922).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.3184F, -0.324F, -0.8582F));

            PartDefinition hips_average_large_1_right_hip_glue_outer = hips_average_large_1_right_hip_glute_base.addOrReplaceChild("hips_average_large_1_right_hip_glue_outer", CubeListBuilder.create().texOffs(241, 943).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.2861F, -0.3704F, -0.9254F));

            PartDefinition hips_average_large_1_hips_top = hips_average_large_1.addOrReplaceChild("hips_average_large_1_hips_top", CubeListBuilder.create(), PartPose.offset(0.3575F, -1.6089F, 1.6983F));

            PartDefinition hips_average_large_1_hips_top_upper = hips_average_large_1_hips_top.addOrReplaceChild("hips_average_large_1_hips_top_upper", CubeListBuilder.create(), PartPose.offset(-0.2065F, 0.5749F, -1.0591F));

            PartDefinition cube_r1 = hips_average_large_1_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(216, 954).addBox(-4.08F, -4.24F, -7.36F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.3912F, 3.2541F, 1.2217F, 0.0F, 0.0F));

            PartDefinition hips_average_large_1_hips_top_lower = hips_average_large_1_hips_top.addOrReplaceChild("hips_average_large_1_hips_top_lower", CubeListBuilder.create(), PartPose.offset(-0.2065F, 1.1929F, -1.0362F));

            PartDefinition cube_r2 = hips_average_large_1_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(240, 930).addBox(-5.08F, -4.24F, -7.36F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.5623F, 2.7843F, 1.2217F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && size.equals("large") && variation == 2) {
            PartDefinition hips_average_large_2 = partdefinition.addOrReplaceChild("hips_average_large_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition hips_average_large_2_left_hip = hips_average_large_2.addOrReplaceChild("hips_average_large_2_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.7151F));

            PartDefinition hips_average_large_2_left_hip_glute_base = hips_average_large_2_left_hip.addOrReplaceChild("hips_average_large_2_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.6257F, 0.0F, 0.0F));

            PartDefinition hips_average_large_2_left_hip_glute_base_individual = hips_average_large_2_left_hip_glute_base.addOrReplaceChild("hips_average_large_2_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(297, 925).addBox(-2.0F, -4.5F, -4.0F, 4.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6648F, -0.1983F, -0.1431F));

            PartDefinition hips_average_large_2_left_hip_glute_outer = hips_average_large_2_left_hip_glute_base.addOrReplaceChild("hips_average_large_2_left_hip_glute_outer", CubeListBuilder.create().texOffs(275, 942).addBox(-2.5F, -3.5F, -3.0F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.7179F, -0.3045F, -0.0705F));

            PartDefinition hips_average_large_2_right_hip = hips_average_large_2.addOrReplaceChild("hips_average_large_2_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_average_large_2_right_hip_glute_base = hips_average_large_2_right_hip.addOrReplaceChild("hips_average_large_2_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.6257F, 0.0F, -0.7151F));

            PartDefinition hips_average_large_2_right_hip_glue_base_individual = hips_average_large_2_right_hip_glute_base.addOrReplaceChild("hips_average_large_2_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(273, 925).addBox(-2.0F, -4.5F, -4.0F, 4.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.3352F, -0.1983F, -0.1431F));

            PartDefinition hips_average_large_2_right_hip_glue_outer = hips_average_large_2_right_hip_glute_base.addOrReplaceChild("hips_average_large_2_right_hip_glue_outer", CubeListBuilder.create().texOffs(297, 942).addBox(-2.5F, -3.5F, -3.0F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.3127F, -0.3395F, -0.0405F));

            PartDefinition hips_average_large_2_hips_top = hips_average_large_2.addOrReplaceChild("hips_average_large_2_hips_top", CubeListBuilder.create(), PartPose.offset(0.0F, -1.4302F, 0.6257F));

            PartDefinition hips_average_large_2_hips_top_upper = hips_average_large_2_hips_top.addOrReplaceChild("hips_average_large_2_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.2404F, -0.1402F, -0.1653F));

            PartDefinition cube_r1 = hips_average_large_2_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(300, 955).addBox(-4.08F, -4.24F, -7.36F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.3912F, 3.2541F, 1.2217F, 0.0F, 0.0F));

            PartDefinition hips_average_large_2_hips_top_lower = hips_average_large_2_hips_top.addOrReplaceChild("hips_average_large_2_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.2404F, 0.5672F, -0.4105F));

            PartDefinition cube_r2 = hips_average_large_2_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(272, 955).addBox(-5.08F, -4.24F, -7.36F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.5623F, 2.7843F, 1.2217F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && size.equals("small") && variation == 1) {
            PartDefinition hips_muscular_small_1 = partdefinition.addOrReplaceChild("hips_muscular_small_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition hips_muscular_small_1_left_hip = hips_muscular_small_1.addOrReplaceChild("hips_muscular_small_1_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_muscular_small_1_left_hip_glute_base = hips_muscular_small_1_left_hip.addOrReplaceChild("hips_muscular_small_1_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_muscular_small_1_left_hip_glute_base_individual = hips_muscular_small_1_left_hip_glute_base.addOrReplaceChild("hips_muscular_small_1_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(22, 982).addBox(-3.0904F, -2.619F, -1.79F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6491F, -0.2413F, -0.1017F));

            PartDefinition hips_muscular_small_1_left_hip_glute_outer = hips_muscular_small_1_left_hip_glute_base.addOrReplaceChild("hips_muscular_small_1_left_hip_glute_outer", CubeListBuilder.create().texOffs(1, 1005).addBox(-3.0698F, -2.0531F, -1.3017F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(3.1648F, -0.3045F, -0.0705F));

            PartDefinition hips_muscular_small_1_right_hip = hips_muscular_small_1.addOrReplaceChild("hips_muscular_small_1_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_muscular_small_1_right_hip_glute_base = hips_muscular_small_1_right_hip.addOrReplaceChild("hips_muscular_small_1_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_muscular_small_1_right_hip_glue_base_individual = hips_muscular_small_1_right_hip_glute_base.addOrReplaceChild("hips_muscular_small_1_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(0, 983).addBox(-3.148F, -2.6934F, -1.7297F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.2989F, -0.1983F, -0.1431F));

            PartDefinition hips_muscular_small_1_right_hip_glue_outer = hips_muscular_small_1_right_hip_glute_base.addOrReplaceChild("hips_muscular_small_1_right_hip_glue_outer", CubeListBuilder.create().texOffs(0, 995).addBox(-3.0698F, -2.0531F, -1.3017F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8352F, -0.3045F, -0.0705F));

            PartDefinition hips_muscular_small_1_hips_top = hips_muscular_small_1.addOrReplaceChild("hips_muscular_small_1_hips_top", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9832F, 1.6983F));

            PartDefinition hips_muscular_small_1_hips_top_upper = hips_muscular_small_1_hips_top.addOrReplaceChild("hips_muscular_small_1_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.9025F, -0.1402F, -0.1653F));

            PartDefinition cube_r1 = hips_muscular_small_1_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(21, 1005).addBox(-5.08F, -5.24F, -4.36F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8649F, -0.5141F, 4.148F, 1.1781F, 0.0F, 0.0F));

            PartDefinition hips_muscular_small_1_hips_top_lower = hips_muscular_small_1_hips_top.addOrReplaceChild("hips_muscular_small_1_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.8131F, 0.5672F, -0.4105F));

            PartDefinition cube_r2 = hips_muscular_small_1_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(20, 994).addBox(-6.08F, -4.24F, -5.36F, 7.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0437F, -0.6852F, 3.41F, 1.1781F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && size.equals("small") && variation == 2) {
            PartDefinition hips_muscular_small_2 = partdefinition.addOrReplaceChild("hips_muscular_small_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition hips_muscular_small_2_left_hip = hips_muscular_small_2.addOrReplaceChild("hips_muscular_small_2_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_muscular_small_2_left_hip_glute_base = hips_muscular_small_2_left_hip.addOrReplaceChild("hips_muscular_small_2_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.5363F, 0.0F, -0.6257F));

            PartDefinition hips_muscular_small_2_left_hip_glute_base_individual = hips_muscular_small_2_left_hip_glute_base.addOrReplaceChild("hips_muscular_small_2_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(73, 992).addBox(-2.5F, -3.5F, -3.0F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5056F, -0.0028F, -0.0538F));

            PartDefinition hips_muscular_small_2_left_hip_glute_outer = hips_muscular_small_2_left_hip_glute_base.addOrReplaceChild("hips_muscular_small_2_left_hip_glute_outer", CubeListBuilder.create().texOffs(50, 982).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0419F, -0.1257F, -0.0342F));

            PartDefinition hips_muscular_small_2_right_hip = hips_muscular_small_2.addOrReplaceChild("hips_muscular_small_2_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_muscular_small_2_right_hip_glute_base = hips_muscular_small_2_right_hip.addOrReplaceChild("hips_muscular_small_2_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.5363F, 0.0F, -0.6257F));

            PartDefinition hips_muscular_small_2_right_hip_glue_base_individual = hips_muscular_small_2_right_hip_glute_base.addOrReplaceChild("hips_muscular_small_2_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(51, 992).addBox(-2.5F, -3.5F, -3.0F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5045F, -0.0378F, -0.0232F));

            PartDefinition hips_muscular_small_2_right_hip_glue_outer = hips_muscular_small_2_right_hip_glute_base.addOrReplaceChild("hips_muscular_small_2_right_hip_glue_outer", CubeListBuilder.create().texOffs(53, 1005).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9581F, -0.1257F, -0.0342F));

            PartDefinition hips_muscular_small_2_hips_top = hips_muscular_small_2.addOrReplaceChild("hips_muscular_small_2_hips_top", CubeListBuilder.create(), PartPose.offset(-0.5363F, -0.9832F, 1.0726F));

            PartDefinition hips_muscular_small_2_hips_top_upper = hips_muscular_small_2_hips_top.addOrReplaceChild("hips_muscular_small_2_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.3661F, -0.342F, -0.4226F));

            PartDefinition cube_r1 = hips_muscular_small_2_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(73, 1005).addBox(-5.08F, -5.24F, -4.36F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -0.6699F, 3.2432F, 1.1781F, 0.0F, 0.0F));

            PartDefinition hips_muscular_small_2_hips_top_lower = hips_muscular_small_2_hips_top.addOrReplaceChild("hips_muscular_small_2_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.3661F, 1.1283F, -0.6733F));

            PartDefinition cube_r2 = hips_muscular_small_2_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(70, 981).addBox(-6.08F, -4.24F, -5.36F, 7.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -1.5145F, 2.5107F, 1.1781F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && size.equals("average") && variation == 1) {
            PartDefinition hips_muscular_average_1 = partdefinition.addOrReplaceChild("hips_muscular_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition hips_muscular_average_1_left_hip = hips_muscular_average_1.addOrReplaceChild("hips_muscular_average_1_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_muscular_average_1_left_hip_glute_base = hips_muscular_average_1_left_hip.addOrReplaceChild("hips_muscular_average_1_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.3575F, 0.0F, -0.8045F));

            PartDefinition hips_muscular_average_1_left_hip_glute_base_individual = hips_muscular_average_1_left_hip_glute_base.addOrReplaceChild("hips_muscular_average_1_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(107, 977).addBox(-2.5F, -3.5F, -3.5F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9134F, 0.1927F, -0.1236F));

            PartDefinition hips_muscular_average_1_left_hip_glute_outer = hips_muscular_average_1_left_hip_glute_base.addOrReplaceChild("hips_muscular_average_1_left_hip_glute_outer", CubeListBuilder.create().texOffs(127, 1006).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.4497F, 0.2486F, -0.1236F));

            PartDefinition hips_muscular_average_1_right_hip = hips_muscular_average_1.addOrReplaceChild("hips_muscular_average_1_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_muscular_average_1_right_hip_glute_base = hips_muscular_average_1_right_hip.addOrReplaceChild("hips_muscular_average_1_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.3575F, 0.0F, -0.8045F));

            PartDefinition hips_muscular_average_1_right_hip_glue_base_individual = hips_muscular_average_1_right_hip_glute_base.addOrReplaceChild("hips_muscular_average_1_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(101, 991).addBox(-2.5F, -3.5F, -3.5F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0907F, 0.1558F, -0.0874F));

            PartDefinition hips_muscular_average_1_right_hip_glue_outer = hips_muscular_average_1_right_hip_glute_base.addOrReplaceChild("hips_muscular_average_1_right_hip_glue_outer", CubeListBuilder.create().texOffs(109, 1005).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0503F, 0.2486F, -0.1236F));

            PartDefinition hips_muscular_average_1_hips_top = hips_muscular_average_1.addOrReplaceChild("hips_muscular_average_1_hips_top", CubeListBuilder.create(), PartPose.offset(0.3575F, 0.0F, -0.8045F));

            PartDefinition hips_muscular_average_1_hips_top_upper = hips_muscular_average_1_hips_top.addOrReplaceChild("hips_muscular_average_1_hips_top_upper", CubeListBuilder.create(), PartPose.offset(-0.1702F, -1.0798F, 1.6963F));

            PartDefinition cube_r1 = hips_muscular_average_1_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(125, 996).addBox(-5.08F, -4.24F, -5.36F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -1.4515F, 2.9121F, 1.2217F, 0.0F, 0.0F));

            PartDefinition hips_muscular_average_1_hips_top_lower = hips_muscular_average_1_hips_top.addOrReplaceChild("hips_muscular_average_1_hips_top_lower", CubeListBuilder.create(), PartPose.offset(-0.1171F, -0.2831F, 1.3617F));

            PartDefinition cube_r2 = hips_muscular_average_1_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(125, 985).addBox(-5.08F, -4.24F, -5.36F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -1.6226F, 2.4422F, 1.2217F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && size.equals("average") && variation == 2) {
            PartDefinition hips_muscular_average_2 = partdefinition.addOrReplaceChild("hips_muscular_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition hips_muscular_average_2_left_hip = hips_muscular_average_2.addOrReplaceChild("hips_muscular_average_2_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_muscular_average_2_left_hip_glute_base = hips_muscular_average_2_left_hip.addOrReplaceChild("hips_muscular_average_2_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.2682F, 0.0F, -0.2682F));

            PartDefinition hips_muscular_average_2_left_hip_glute_base_individual = hips_muscular_average_2_left_hip_glute_base.addOrReplaceChild("hips_muscular_average_2_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(155, 989).addBox(-2.5F, -4.0F, -3.5F, 5.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(2.2542F, 0.1229F, -0.2856F));

            PartDefinition hips_muscular_average_2_left_hip_glute_outer = hips_muscular_average_2_left_hip_glute_base.addOrReplaceChild("hips_muscular_average_2_left_hip_glute_outer", CubeListBuilder.create().texOffs(184, 1005).addBox(-2.5F, -3.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.7179F, 0.1061F, -0.213F));

            PartDefinition hips_muscular_average_2_right_hip = hips_muscular_average_2.addOrReplaceChild("hips_muscular_average_2_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_muscular_average_2_right_hip_glute_base = hips_muscular_average_2_right_hip.addOrReplaceChild("hips_muscular_average_2_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.2682F, 0.0F, -0.2682F));

            PartDefinition hips_muscular_average_2_right_hip_glue_base_individual = hips_muscular_average_2_right_hip_glute_base.addOrReplaceChild("hips_muscular_average_2_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(160, 974).addBox(-2.5F, -4.0F, -3.5F, 5.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.7534F, 0.0817F, -0.2477F));

            PartDefinition hips_muscular_average_2_right_hip_glue_outer = hips_muscular_average_2_right_hip_glute_base.addOrReplaceChild("hips_muscular_average_2_right_hip_glue_outer", CubeListBuilder.create().texOffs(184, 981).addBox(-2.5F, -3.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.2821F, 0.1061F, -0.213F));

            PartDefinition hips_muscular_average_2_hips_top = hips_muscular_average_2.addOrReplaceChild("hips_muscular_average_2_hips_top", CubeListBuilder.create(), PartPose.offset(-0.2682F, 0.0F, -0.2682F));

            PartDefinition hips_muscular_average_2_hips_top_upper = hips_muscular_average_2_hips_top.addOrReplaceChild("hips_muscular_average_2_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.3661F, -0.5871F, 0.7286F));

            PartDefinition cube_r1 = hips_muscular_average_2_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(158, 1004).addBox(-5.08F, -4.24F, -7.36F, 5.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.3912F, 3.2541F, 1.2217F, 0.0F, 0.0F));

            PartDefinition hips_muscular_average_2_hips_top_lower = hips_muscular_average_2_hips_top.addOrReplaceChild("hips_muscular_average_2_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.3661F, 0.0309F, 0.7515F));

            PartDefinition cube_r2 = hips_muscular_average_2_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(179, 992).addBox(-6.08F, -4.24F, -7.36F, 7.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.5623F, 2.7843F, 1.2217F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && size.equals("large") && variation == 1) {
            PartDefinition hips_muscular_large_1 = partdefinition.addOrReplaceChild("hips_muscular_large_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition hips_muscular_large_1_left_hip = hips_muscular_large_1.addOrReplaceChild("hips_muscular_large_1_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_muscular_large_1_left_hip_glute_base = hips_muscular_large_1_left_hip.addOrReplaceChild("hips_muscular_large_1_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.2682F, 0.0F, 0.2682F));

            PartDefinition hips_muscular_large_1_left_hip_glute_base_individual = hips_muscular_large_1_left_hip_glute_base.addOrReplaceChild("hips_muscular_large_1_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(215, 972).addBox(-2.5F, -4.0F, -4.0F, 5.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.8966F, -0.324F, -0.8582F));

            PartDefinition hips_muscular_large_1_left_hip_glute_outer = hips_muscular_large_1_left_hip_glute_base.addOrReplaceChild("hips_muscular_large_1_left_hip_glute_outer", CubeListBuilder.create().texOffs(242, 1005).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.2709F, -0.3408F, -0.9644F));

            PartDefinition hips_muscular_large_1_right_hip = hips_muscular_large_1.addOrReplaceChild("hips_muscular_large_1_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_muscular_large_1_right_hip_glute_base = hips_muscular_large_1_right_hip.addOrReplaceChild("hips_muscular_large_1_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.2682F, 0.0F, 0.2682F));

            PartDefinition hips_muscular_large_1_right_hip_glue_base_individual = hips_muscular_large_1_right_hip_glute_base.addOrReplaceChild("hips_muscular_large_1_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(215, 988).addBox(-2.5F, -4.0F, -4.0F, 5.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.1073F, -0.3608F, -0.8096F));

            PartDefinition hips_muscular_large_1_right_hip_glue_outer = hips_muscular_large_1_right_hip_glute_base.addOrReplaceChild("hips_muscular_large_1_right_hip_glue_outer", CubeListBuilder.create().texOffs(241, 993).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.7291F, -0.3408F, -0.9644F));

            PartDefinition hips_muscular_large_1_hips_top = hips_muscular_large_1.addOrReplaceChild("hips_muscular_large_1_hips_top", CubeListBuilder.create(), PartPose.offset(0.2682F, -0.7151F, 1.5196F));

            PartDefinition hips_muscular_large_1_hips_top_upper = hips_muscular_large_1_hips_top.addOrReplaceChild("hips_muscular_large_1_hips_top_upper", CubeListBuilder.create(), PartPose.offset(-0.2596F, -0.3189F, -0.8804F));

            PartDefinition cube_r1 = hips_muscular_large_1_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(216, 1004).addBox(-5.08F, -4.24F, -7.36F, 5.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.3912F, 3.2541F, 1.2217F, 0.0F, 0.0F));

            PartDefinition hips_muscular_large_1_hips_top_lower = hips_muscular_large_1_hips_top.addOrReplaceChild("hips_muscular_large_1_hips_top_lower", CubeListBuilder.create(), PartPose.offset(-0.1702F, 0.299F, -0.8575F));

            PartDefinition cube_r2 = hips_muscular_large_1_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(233, 980).addBox(-6.08F, -4.24F, -7.36F, 7.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.5623F, 2.7843F, 1.2217F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && size.equals("large") && variation == 2) {
            PartDefinition hips_muscular_large_2 = partdefinition.addOrReplaceChild("hips_muscular_large_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition hips_muscular_large_2_left_hip = hips_muscular_large_2.addOrReplaceChild("hips_muscular_large_2_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_muscular_large_2_left_hip_glute_base = hips_muscular_large_2_left_hip.addOrReplaceChild("hips_muscular_large_2_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.6257F, 0.0F, 0.0F));

            PartDefinition hips_muscular_large_2_left_hip_glute_base_individual = hips_muscular_large_2_left_hip_glute_base.addOrReplaceChild("hips_muscular_large_2_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(273, 986).addBox(-2.5F, -4.5F, -4.0F, 5.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6491F, -0.2413F, -0.1017F));

            PartDefinition hips_muscular_large_2_left_hip_glute_outer = hips_muscular_large_2_left_hip_glute_base.addOrReplaceChild("hips_muscular_large_2_left_hip_glute_outer", CubeListBuilder.create().texOffs(274, 973).addBox(-2.5F, -3.5F, -3.0F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(3.1648F, -0.3045F, -0.0705F));

            PartDefinition hips_muscular_large_2_right_hip = hips_muscular_large_2.addOrReplaceChild("hips_muscular_large_2_right_hip", CubeListBuilder.create(), PartPose.offset(-0.6257F, 0.0F, 0.0F));

            PartDefinition hips_muscular_large_2_right_hip_glute_base = hips_muscular_large_2_right_hip.addOrReplaceChild("hips_muscular_large_2_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hips_muscular_large_2_right_hip_glue_base_individual = hips_muscular_large_2_right_hip_glute_base.addOrReplaceChild("hips_muscular_large_2_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(296, 974).addBox(-2.5F, -4.5F, -4.0F, 5.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.2989F, -0.1983F, -0.1431F));

            PartDefinition hips_muscular_large_2_right_hip_glue_outer = hips_muscular_large_2_right_hip_glute_base.addOrReplaceChild("hips_muscular_large_2_right_hip_glue_outer", CubeListBuilder.create().texOffs(299, 991).addBox(-2.5F, -3.5F, -3.0F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8352F, -0.3045F, -0.0705F));

            PartDefinition hips_muscular_large_2_hips_top = hips_muscular_large_2.addOrReplaceChild("hips_muscular_large_2_hips_top", CubeListBuilder.create(), PartPose.offset(-0.6257F, -1.4302F, 1.3408F));

            PartDefinition hips_muscular_large_2_hips_top_upper = hips_muscular_large_2_hips_top.addOrReplaceChild("hips_muscular_large_2_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.9025F, -0.1402F, -0.1653F));

            PartDefinition cube_r1 = hips_muscular_large_2_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(303, 1004).addBox(-5.08F, -4.24F, -7.36F, 5.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.3912F, 3.2541F, 1.2217F, 0.0F, 0.0F));

            PartDefinition hips_muscular_large_2_hips_top_lower = hips_muscular_large_2_hips_top.addOrReplaceChild("hips_muscular_large_2_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.8131F, 0.5672F, -0.4105F));

            PartDefinition cube_r2 = hips_muscular_large_2_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(273, 1003).addBox(-6.08F, -4.24F, -7.36F, 7.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.5623F, 2.7843F, 1.2217F, 0.0F, 0.0F));

        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Hips / " + muscleMass + " / " + size + ", Cancelling Generation...");
        }
        allParts.add("hips_" + muscleMass + "_" + size + "_"+ variation);
        return partdefinition;
    }

    public static PartDefinition GenerateAll(PartDefinition root){
        List<String> muscleMass = List.of("lean", "average", "muscular");
        List<String> size = List.of("small", "average", "large");

        for(String variable1 : muscleMass){
            for(String variable2 : size){
                root = Generate(root, variable1, variable2, 1);
                root = Generate(root, variable1, variable2, 2);
            }
        }
        return root;
    }
}
