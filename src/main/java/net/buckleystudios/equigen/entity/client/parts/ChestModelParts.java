package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

import java.util.ArrayList;
import java.util.List;

public class ChestModelParts {
    private static List<String> allParts = new ArrayList<>();
    public static List<String> getAllParts(){
        return allParts;
    }
    public static PartDefinition Generate(PartDefinition root, String muscleMass, String size, int variation) {
        if (muscleMass.equals("lean") && size.equals("small") && variation == 1) {
            PartDefinition chest_lean_small_1 = root.addOrReplaceChild("chest_lean_small_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition chest_lean_small_1_chest_front = chest_lean_small_1.addOrReplaceChild("chest_lean_small_1_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 1.162F, -2.7709F));

            PartDefinition chest_lean_small_1_chest_front_upper = chest_lean_small_1_chest_front.addOrReplaceChild("chest_lean_small_1_chest_front_upper", CubeListBuilder.create(), PartPose.offset(-0.0879F, -0.9905F, 0.0067F));

            PartDefinition cube_r1 = chest_lean_small_1_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(32, 683).addBox(-3.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_lean_small_1_chest_front_lower = chest_lean_small_1_chest_front.addOrReplaceChild("chest_lean_small_1_chest_front_lower", CubeListBuilder.create(), PartPose.offset(-0.0835F, 1.8262F, 0.5892F));

            PartDefinition cube_r2 = chest_lean_small_1_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(22, 692).addBox(-3.0792F, -7.6432F, -3.4848F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5792F, -3.7952F, 4.624F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_lean_small_1_chest_left = chest_lean_small_1.addOrReplaceChild("chest_lean_small_1_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_lean_small_1_chest_left_pectoral = chest_lean_small_1_chest_left.addOrReplaceChild("chest_lean_small_1_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.2346F));

            PartDefinition chest_lean_small_1_chest_left_pectoral_top = chest_lean_small_1_chest_left_pectoral.addOrReplaceChild("chest_lean_small_1_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.0015F, -1.4279F, -0.0622F));

            PartDefinition cube_r3 = chest_lean_small_1_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(23, 679).addBox(-2.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_lean_small_1_chest_left_pectoral_middle = chest_lean_small_1_chest_left_pectoral.addOrReplaceChild("chest_lean_small_1_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.033F, 0.1634F, -0.1467F));

            PartDefinition cube_r4 = chest_lean_small_1_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(32, 660).addBox(-2.0708F, -7.7168F, -4.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5708F, -2.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_lean_small_1_chest_left_pectoral_bottom = chest_lean_small_1_chest_left_pectoral.addOrReplaceChild("chest_lean_small_1_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.0015F, 2.7733F, 0.3674F));

            PartDefinition cube_r5 = chest_lean_small_1_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(23, 671).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -4.3107F, 4.4756F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_lean_small_1_chest_left_deltoid = chest_lean_small_1_chest_left.addOrReplaceChild("chest_lean_small_1_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_lean_small_1_chest_left_deltoid_outer = chest_lean_small_1_chest_left_deltoid.addOrReplaceChild("chest_lean_small_1_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(29, 693).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9879F, 0.0335F, 0.0296F));

            PartDefinition chest_lean_small_1_chest_left_deltoid_base = chest_lean_small_1_chest_left_deltoid.addOrReplaceChild("chest_lean_small_1_chest_left_deltoid_base", CubeListBuilder.create().texOffs(8, 678).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(1.4622F, -0.0754F, 0.0827F));

            PartDefinition chest_lean_small_1_chest_right = chest_lean_small_1.addOrReplaceChild("chest_lean_small_1_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_lean_small_1_chest_right_pectoral = chest_lean_small_1_chest_right.addOrReplaceChild("chest_lean_small_1_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.0559F));

            PartDefinition chest_lean_small_1_chest_right_pectoral_top = chest_lean_small_1_chest_right_pectoral.addOrReplaceChild("chest_lean_small_1_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.0035F, -1.4056F, -0.1971F));

            PartDefinition cube_r6 = chest_lean_small_1_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(33, 669).addBox(-4.0692F, -3.98F, -0.9108F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5692F, 1.2102F, -2.9329F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_lean_small_1_chest_right_pectoral_middle = chest_lean_small_1_chest_right_pectoral.addOrReplaceChild("chest_lean_small_1_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-0.9723F, 0.1367F, -0.3217F));

            PartDefinition cube_r7 = chest_lean_small_1_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(16, 662).addBox(-4.0601F, -7.6796F, -4.5195F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5601F, -2.0195F, 5.6796F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_lean_small_1_chest_right_pectoral_bottom = chest_lean_small_1_chest_right_pectoral.addOrReplaceChild("chest_lean_small_1_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.0035F, 2.7336F, 0.1816F));

            PartDefinition cube_r8 = chest_lean_small_1_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(34, 675).addBox(-4.0692F, -7.6432F, -4.4748F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5692F, -4.2556F, 4.4564F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_lean_small_1_chest_right_deltoid = chest_lean_small_1_chest_right.addOrReplaceChild("chest_lean_small_1_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_lean_small_1_chest_right_deltoid_outer = chest_lean_small_1_chest_right_deltoid.addOrReplaceChild("chest_lean_small_1_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(2, 666).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0121F, 0.0335F, 0.0296F));

            PartDefinition chest_lean_small_1_chest_right_deltoid_base = chest_lean_small_1_chest_right_deltoid.addOrReplaceChild("chest_lean_small_1_chest_right_deltoid_base", CubeListBuilder.create().texOffs(7, 692).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5424F, -0.1097F, 0.1168F));

        } else if (muscleMass.equals("lean") && size.equals("small") && variation == 2) {
            PartDefinition chest_lean_small_2 = root.addOrReplaceChild("chest_lean_small_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition chest_lean_small_2_chest_front = chest_lean_small_2.addOrReplaceChild("chest_lean_small_2_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 1.8771F, -3.3073F));

            PartDefinition chest_lean_small_2_chest_front_upper = chest_lean_small_2_chest_front.addOrReplaceChild("chest_lean_small_2_chest_front_upper", CubeListBuilder.create(), PartPose.offset(-0.064F, -1.5799F, 0.2999F));

            PartDefinition cube_r1 = chest_lean_small_2_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(87, 686).addBox(-3.08F, -7.68F, -3.52F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -1.52F, 5.68F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_lean_small_2_chest_front_lower = chest_lean_small_2_chest_front.addOrReplaceChild("chest_lean_small_2_chest_front_lower", CubeListBuilder.create(), PartPose.offset(-0.1553F, 1.1641F, 0.8197F));

            PartDefinition cube_r2 = chest_lean_small_2_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(75, 686).addBox(-3.0792F, -7.6432F, -4.4848F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5792F, -4.7349F, 4.282F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_lean_small_2_chest_left = chest_lean_small_2.addOrReplaceChild("chest_lean_small_2_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_lean_small_2_chest_left_pectoral = chest_lean_small_2_chest_left.addOrReplaceChild("chest_lean_small_2_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.7709F));

            PartDefinition chest_lean_small_2_chest_left_pectoral_top = chest_lean_small_2_chest_left_pectoral.addOrReplaceChild("chest_lean_small_2_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(0.8466F, -1.4279F, 0.1058F));

            PartDefinition cube_r3 = chest_lean_small_2_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(58, 666).addBox(-2.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_lean_small_2_chest_left_pectoral_middle = chest_lean_small_2_chest_left_pectoral.addOrReplaceChild("chest_lean_small_2_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(0.8466F, -0.9179F, 0.0317F));

            PartDefinition cube_r4 = chest_lean_small_2_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(63, 686).addBox(-2.08F, -7.68F, -2.52F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -1.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_lean_small_2_chest_left_pectoral_bottom = chest_lean_small_2_chest_left_pectoral.addOrReplaceChild("chest_lean_small_2_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(0.9241F, 2.1442F, 0.6844F));

            PartDefinition cube_r5 = chest_lean_small_2_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(83, 695).addBox(-2.0892F, -7.6432F, -5.4748F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5892F, -4.7255F, 4.2854F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_lean_small_2_chest_left_deltoid = chest_lean_small_2_chest_left.addOrReplaceChild("chest_lean_small_2_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_lean_small_2_chest_left_deltoid_outer = chest_lean_small_2_chest_left_deltoid.addOrReplaceChild("chest_lean_small_2_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(72, 662).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9497F, -0.0922F, -0.1772F));

            PartDefinition chest_lean_small_2_chest_left_deltoid_base = chest_lean_small_2_chest_left_deltoid.addOrReplaceChild("chest_lean_small_2_chest_left_deltoid_base", CubeListBuilder.create().texOffs(60, 672).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(1.324F, -0.1112F, -0.2141F));

            PartDefinition chest_lean_small_2_chest_right = chest_lean_small_2.addOrReplaceChild("chest_lean_small_2_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_lean_small_2_chest_right_pectoral = chest_lean_small_2_chest_right.addOrReplaceChild("chest_lean_small_2_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.4134F));

            PartDefinition chest_lean_small_2_chest_right_pectoral_top = chest_lean_small_2_chest_right_pectoral.addOrReplaceChild("chest_lean_small_2_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.1569F, -1.4056F, -0.2042F));

            PartDefinition cube_r6 = chest_lean_small_2_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(85, 661).addBox(-4.0692F, -3.98F, -0.9108F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5692F, 1.2102F, -2.9329F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_lean_small_2_chest_right_pectoral_middle = chest_lean_small_2_chest_right_pectoral.addOrReplaceChild("chest_lean_small_2_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.1569F, -0.9237F, -0.3184F));

            PartDefinition cube_r7 = chest_lean_small_2_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(76, 693).addBox(-4.0692F, -7.6432F, -2.4948F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5692F, -0.9948F, 5.6432F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_lean_small_2_chest_right_pectoral_bottom = chest_lean_small_2_chest_right_pectoral.addOrReplaceChild("chest_lean_small_2_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.0801F, 2.1061F, 0.3203F));

            PartDefinition cube_r8 = chest_lean_small_2_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(85, 667).addBox(-4.0783F, -7.6068F, -5.4201F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5783F, -4.6616F, 4.2699F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_lean_small_2_chest_right_deltoid = chest_lean_small_2_chest_right.addOrReplaceChild("chest_lean_small_2_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_lean_small_2_chest_right_deltoid_outer = chest_lean_small_2_chest_right_deltoid.addOrReplaceChild("chest_lean_small_2_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(82, 676).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0503F, -0.0922F, -0.1772F));

            PartDefinition chest_lean_small_2_chest_right_deltoid_base = chest_lean_small_2_chest_right_deltoid.addOrReplaceChild("chest_lean_small_2_chest_right_deltoid_base", CubeListBuilder.create().texOffs(61, 693).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.6792F, -0.1451F, -0.177F));

        } else if (muscleMass.equals("lean") && size.equals("average") && variation == 1) {
            PartDefinition chest_lean_average_1 = root.addOrReplaceChild("chest_lean_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition chest_lean_average_1_chest_front = chest_lean_average_1.addOrReplaceChild("chest_lean_average_1_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 1.6089F, -3.7542F));

            PartDefinition chest_lean_average_1_chest_front_upper = chest_lean_average_1_chest_front.addOrReplaceChild("chest_lean_average_1_chest_front_upper", CubeListBuilder.create(), PartPose.offset(0.0254F, -2.1525F, 0.4429F));

            PartDefinition cube_r1 = chest_lean_average_1_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(128, 682).addBox(-3.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_lean_average_1_chest_front_lower = chest_lean_average_1_chest_front.addOrReplaceChild("chest_lean_average_1_chest_front_lower", CubeListBuilder.create(), PartPose.offset(-0.064F, 1.476F, 0.8727F));

            PartDefinition cube_r2 = chest_lean_average_1_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(144, 683).addBox(-3.08F, -7.68F, -3.52F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -3.371F, 4.8176F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_lean_average_1_chest_left = chest_lean_average_1.addOrReplaceChild("chest_lean_average_1_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_lean_average_1_chest_left_pectoral = chest_lean_average_1_chest_left.addOrReplaceChild("chest_lean_average_1_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.1285F));

            PartDefinition chest_lean_average_1_chest_left_pectoral_top = chest_lean_average_1_chest_left_pectoral.addOrReplaceChild("chest_lean_average_1_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.0254F, -2.2521F, 0.2735F));

            PartDefinition cube_r3 = chest_lean_average_1_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(126, 657).addBox(-2.08F, -3.0F, -0.92F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 0.8927F, -2.5728F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_lean_average_1_chest_left_pectoral_middle = chest_lean_average_1_chest_left_pectoral.addOrReplaceChild("chest_lean_average_1_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(0.9842F, -0.926F, 0.4682F));

            PartDefinition cube_r4 = chest_lean_average_1_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(115, 657).addBox(-1.0708F, -7.7168F, -3.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4292F, -1.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_lean_average_1_chest_left_pectoral_bottom = chest_lean_average_1_chest_left_pectoral.addOrReplaceChild("chest_lean_average_1_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.0254F, 2.8397F, 0.8113F));

            PartDefinition cube_r5 = chest_lean_average_1_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(112, 682).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_lean_average_1_chest_left_deltoid = chest_lean_average_1_chest_left.addOrReplaceChild("chest_lean_average_1_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_lean_average_1_chest_left_deltoid_outer = chest_lean_average_1_chest_left_deltoid.addOrReplaceChild("chest_lean_average_1_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(135, 691).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0559F, -0.324F, 0.125F));

            PartDefinition chest_lean_average_1_chest_left_deltoid_base = chest_lean_average_1_chest_left_deltoid.addOrReplaceChild("chest_lean_average_1_chest_left_deltoid_base", CubeListBuilder.create().texOffs(110, 666).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5196F, -0.3073F, 0.0524F));

            PartDefinition chest_lean_average_1_chest_right = chest_lean_average_1.addOrReplaceChild("chest_lean_average_1_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_lean_average_1_chest_right_pectoral = chest_lean_average_1_chest_right.addOrReplaceChild("chest_lean_average_1_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.9497F));

            PartDefinition chest_lean_average_1_chest_right_pectoral_top = chest_lean_average_1_chest_right_pectoral.addOrReplaceChild("chest_lean_average_1_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.0352F, -2.2182F, 0.1405F));

            PartDefinition cube_r6 = chest_lean_average_1_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(127, 691).addBox(-2.0892F, -2.98F, -0.9108F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5892F, 0.8724F, -2.5643F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_lean_average_1_chest_right_pectoral_middle = chest_lean_average_1_chest_right_pectoral.addOrReplaceChild("chest_lean_average_1_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.0206F, -0.9418F, 0.2961F));

            PartDefinition cube_r7 = chest_lean_average_1_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(137, 661).addBox(-3.0701F, -7.6796F, -3.5295F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5701F, -1.0295F, 5.6796F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_lean_average_1_chest_right_pectoral_bottom = chest_lean_average_1_chest_right_pectoral.addOrReplaceChild("chest_lean_average_1_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-0.9799F, 2.7947F, 0.6284F));

            PartDefinition cube_r8 = chest_lean_average_1_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(126, 665).addBox(-4.0692F, -7.6432F, -4.4748F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5692F, -3.7858F, 4.6275F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_lean_average_1_chest_right_deltoid = chest_lean_average_1_chest_right.addOrReplaceChild("chest_lean_average_1_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_lean_average_1_chest_right_deltoid_outer = chest_lean_average_1_chest_right_deltoid.addOrReplaceChild("chest_lean_average_1_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(136, 670).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9441F, -0.324F, 0.125F));

            PartDefinition chest_lean_average_1_chest_right_deltoid_base = chest_lean_average_1_chest_right_deltoid.addOrReplaceChild("chest_lean_average_1_chest_right_deltoid_base", CubeListBuilder.create().texOffs(111, 691).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.4856F, -0.3442F, 0.0919F));

        } else if (muscleMass.equals("lean") && size.equals("average") && variation == 2) {
            PartDefinition chest_lean_average_2 = root.addOrReplaceChild("chest_lean_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition chest_lean_average_2_chest_front = chest_lean_average_2.addOrReplaceChild("chest_lean_average_2_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 1.2514F, -3.3966F));

            PartDefinition chest_lean_average_2_chest_front_upper = chest_lean_average_2_chest_front.addOrReplaceChild("chest_lean_average_2_chest_front_upper", CubeListBuilder.create(), PartPose.offset(0.1147F, -1.4374F, -0.004F));

            PartDefinition cube_r1 = chest_lean_average_2_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(192, 684).addBox(-3.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_lean_average_2_chest_front_lower = chest_lean_average_2_chest_front.addOrReplaceChild("chest_lean_average_2_chest_front_lower", CubeListBuilder.create(), PartPose.offset(0.0254F, 2.1911F, 0.4258F));

            PartDefinition cube_r2 = chest_lean_average_2_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(192, 668).addBox(-3.08F, -7.68F, -3.52F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -3.371F, 4.8176F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_lean_average_2_chest_left = chest_lean_average_2.addOrReplaceChild("chest_lean_average_2_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_lean_average_2_chest_left_pectoral = chest_lean_average_2_chest_left.addOrReplaceChild("chest_lean_average_2_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.5922F));

            PartDefinition chest_lean_average_2_chest_left_pectoral_top = chest_lean_average_2_chest_left_pectoral.addOrReplaceChild("chest_lean_average_2_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.0254F, -1.8945F, -0.4416F));

            PartDefinition cube_r3 = chest_lean_average_2_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(199, 657).addBox(-2.08F, -3.0F, -0.92F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 0.8927F, -2.5728F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_lean_average_2_chest_left_pectoral_middle = chest_lean_average_2_chest_left_pectoral.addOrReplaceChild("chest_lean_average_2_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.0736F, -0.4791F, -0.1575F));

            PartDefinition cube_r4 = chest_lean_average_2_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(188, 659).addBox(-1.0708F, -7.7168F, -3.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4292F, -1.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_lean_average_2_chest_left_pectoral_bottom = chest_lean_average_2_chest_left_pectoral.addOrReplaceChild("chest_lean_average_2_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.1147F, 3.1973F, 0.1856F));

            PartDefinition cube_r5 = chest_lean_average_2_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(176, 684).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_lean_average_2_chest_left_deltoid = chest_lean_average_2_chest_left.addOrReplaceChild("chest_lean_average_2_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_lean_average_2_chest_left_deltoid_outer = chest_lean_average_2_chest_left_deltoid.addOrReplaceChild("chest_lean_average_2_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(201, 693).addBox(-2.0F, -3.0F, -3.5F, 4.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(2.1453F, -0.0559F, -0.0007F));

            PartDefinition chest_lean_average_2_chest_left_deltoid_base = chest_lean_average_2_chest_left_deltoid.addOrReplaceChild("chest_lean_average_2_chest_left_deltoid_base", CubeListBuilder.create().texOffs(176, 668).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.6089F, 0.0503F, -0.037F));

            PartDefinition chest_lean_average_2_chest_right = chest_lean_average_2.addOrReplaceChild("chest_lean_average_2_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_lean_average_2_chest_right_pectoral = chest_lean_average_2_chest_right.addOrReplaceChild("chest_lean_average_2_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.4313F));

            PartDefinition chest_lean_average_2_chest_right_pectoral_top = chest_lean_average_2_chest_right_pectoral.addOrReplaceChild("chest_lean_average_2_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-0.9467F, -1.8642F, -0.555F));

            PartDefinition cube_r6 = chest_lean_average_2_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(194, 693).addBox(-2.0892F, -2.98F, -0.9108F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5892F, 0.8724F, -2.5643F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_lean_average_2_chest_right_pectoral_middle = chest_lean_average_2_chest_right_pectoral.addOrReplaceChild("chest_lean_average_2_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-0.9321F, -0.4993F, -0.3109F));

            PartDefinition cube_r7 = chest_lean_average_2_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(204, 662).addBox(-3.0701F, -7.6796F, -3.5295F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5701F, -1.0295F, 5.6796F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_lean_average_2_chest_right_pectoral_bottom = chest_lean_average_2_chest_right_pectoral.addOrReplaceChild("chest_lean_average_2_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-0.8914F, 3.1487F, 0.0214F));

            PartDefinition cube_r8 = chest_lean_average_2_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(208, 684).addBox(-4.0692F, -7.6432F, -4.4748F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5692F, -3.7858F, 4.6275F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_lean_average_2_chest_right_deltoid = chest_lean_average_2_chest_right.addOrReplaceChild("chest_lean_average_2_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_lean_average_2_chest_right_deltoid_outer = chest_lean_average_2_chest_right_deltoid.addOrReplaceChild("chest_lean_average_2_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(200, 671).addBox(-2.0F, -3.0F, -3.5F, 4.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8547F, -0.0559F, -0.0007F));

            PartDefinition chest_lean_average_2_chest_right_deltoid_base = chest_lean_average_2_chest_right_deltoid.addOrReplaceChild("chest_lean_average_2_chest_right_deltoid_base", CubeListBuilder.create().texOffs(177, 693).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.3972F, 0.0098F, 0.0034F));

        } else if (muscleMass.equals("lean") && size.equals("large") && variation == 1) {
            PartDefinition chest_lean_large_1 = root.addOrReplaceChild("chest_lean_large_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition chest_lean_large_1_chest_front = chest_lean_large_1.addOrReplaceChild("chest_lean_large_1_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 2.4134F, -4.7374F));

            PartDefinition chest_lean_large_1_chest_front_upper = chest_lean_large_1_chest_front.addOrReplaceChild("chest_lean_large_1_chest_front_upper", CubeListBuilder.create(), PartPose.offset(0.0254F, -2.4207F, 0.8005F));

            PartDefinition cube_r1 = chest_lean_large_1_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(229, 681).addBox(-3.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_lean_large_1_chest_front_lower = chest_lean_large_1_chest_front.addOrReplaceChild("chest_lean_large_1_chest_front_lower", CubeListBuilder.create(), PartPose.offset(0.0039F, 1.2831F, 1.5951F));

            PartDefinition cube_r2 = chest_lean_large_1_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(247, 664).addBox(-3.0792F, -7.6432F, -3.4848F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5792F, -3.3253F, 4.795F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_lean_large_1_chest_left = chest_lean_large_1.addOrReplaceChild("chest_lean_large_1_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_lean_large_1_chest_left_pectoral = chest_lean_large_1_chest_left.addOrReplaceChild("chest_lean_large_1_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.3966F));

            PartDefinition chest_lean_large_1_chest_left_pectoral_top = chest_lean_large_1_chest_left_pectoral.addOrReplaceChild("chest_lean_large_1_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(0.9116F, -1.6711F, -0.2829F));

            PartDefinition cube_r3 = chest_lean_large_1_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(248, 658).addBox(-2.0892F, -3.98F, -0.9108F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5892F, 1.2102F, -2.9329F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_lean_large_1_chest_left_pectoral_middle = chest_lean_large_1_chest_left_pectoral.addOrReplaceChild("chest_lean_large_1_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(0.9675F, -0.1942F, -0.0681F));

            PartDefinition cube_r4 = chest_lean_large_1_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(248, 690).addBox(-0.5F, -2.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_lean_large_1_chest_left_pectoral_bottom = chest_lean_large_1_chest_left_pectoral.addOrReplaceChild("chest_lean_large_1_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(0.936F, 3.7336F, 0.7219F));

            PartDefinition cube_r5 = chest_lean_large_1_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(265, 681).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_lean_large_1_chest_left_deltoid = chest_lean_large_1_chest_left.addOrReplaceChild("chest_lean_large_1_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_lean_large_1_chest_left_deltoid_outer = chest_lean_large_1_chest_left_deltoid.addOrReplaceChild("chest_lean_large_1_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(258, 693).addBox(-2.0F, -3.5F, -3.0F, 4.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0559F, -0.1983F, 0.1976F));

            PartDefinition chest_lean_large_1_chest_left_deltoid_base = chest_lean_large_1_chest_left_deltoid.addOrReplaceChild("chest_lean_large_1_chest_left_deltoid_base", CubeListBuilder.create().texOffs(230, 663).addBox(-2.0F, -4.5F, -4.5F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5028F, -0.0028F, 0.1781F));

            PartDefinition chest_lean_large_1_chest_right = chest_lean_large_1.addOrReplaceChild("chest_lean_large_1_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_lean_large_1_chest_right_pectoral = chest_lean_large_1_chest_right.addOrReplaceChild("chest_lean_large_1_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.8603F));

            PartDefinition chest_lean_large_1_chest_right_pectoral_top = chest_lean_large_1_chest_right_pectoral.addOrReplaceChild("chest_lean_large_1_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.064F, -1.696F, -0.8774F));

            PartDefinition cube_r6 = chest_lean_large_1_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(261, 662).addBox(-4.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_lean_large_1_chest_right_pectoral_middle = chest_lean_large_1_chest_right_pectoral.addOrReplaceChild("chest_lean_large_1_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.0372F, -0.2172F, -0.5897F));

            PartDefinition cube_r7 = chest_lean_large_1_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(245, 681).addBox(-2.505F, -2.02F, -2.475F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.005F, 0.025F, 0.02F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_lean_large_1_chest_right_pectoral_bottom = chest_lean_large_1_chest_right_pectoral.addOrReplaceChild("chest_lean_large_1_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.0684F, 3.6796F, 0.185F));

            PartDefinition cube_r8 = chest_lean_large_1_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(261, 681).addBox(-4.0692F, -7.6432F, -4.4748F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5692F, -3.7858F, 4.6275F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_lean_large_1_chest_right_deltoid = chest_lean_large_1_chest_right.addOrReplaceChild("chest_lean_large_1_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_lean_large_1_chest_right_deltoid_outer = chest_lean_large_1_chest_right_deltoid.addOrReplaceChild("chest_lean_large_1_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(256, 668).addBox(-2.0F, -3.5F, -3.0F, 4.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9441F, -0.1983F, 0.1976F));

            PartDefinition chest_lean_large_1_chest_right_deltoid_base = chest_lean_large_1_chest_right_deltoid.addOrReplaceChild("chest_lean_large_1_chest_right_deltoid_base", CubeListBuilder.create().texOffs(231, 690).addBox(-2.0F, -4.5F, -4.5F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5022F, -0.0478F, 0.2213F));

        } else if (muscleMass.equals("lean") && size.equals("large") && variation == 2) {
            PartDefinition chest_lean_large_2 = root.addOrReplaceChild("chest_lean_large_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition chest_lean_large_2_chest_front = chest_lean_large_2.addOrReplaceChild("chest_lean_large_2_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 2.4134F, -3.7542F));

            PartDefinition chest_lean_large_2_chest_front_upper = chest_lean_large_2_chest_front.addOrReplaceChild("chest_lean_large_2_chest_front_upper", CubeListBuilder.create(), PartPose.offset(-0.1534F, -2.4207F, -0.4509F));

            PartDefinition cube_r1 = chest_lean_large_2_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(299, 682).addBox(-3.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_lean_large_2_chest_front_lower = chest_lean_large_2_chest_front.addOrReplaceChild("chest_lean_large_2_chest_front_lower", CubeListBuilder.create(), PartPose.offset(-0.1749F, 1.2831F, 0.3437F));

            PartDefinition cube_r2 = chest_lean_large_2_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(302, 665).addBox(-3.0792F, -7.6432F, -3.4848F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5792F, -3.3253F, 4.795F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_lean_large_2_chest_left = chest_lean_large_2.addOrReplaceChild("chest_lean_large_2_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_lean_large_2_chest_left_pectoral = chest_lean_large_2_chest_left.addOrReplaceChild("chest_lean_large_2_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.933F));

            PartDefinition chest_lean_large_2_chest_left_pectoral_top = chest_lean_large_2_chest_left_pectoral.addOrReplaceChild("chest_lean_large_2_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(0.7572F, -1.696F, -0.073F));

            PartDefinition cube_r3 = chest_lean_large_2_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(318, 656).addBox(-2.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_lean_large_2_chest_left_pectoral_middle = chest_lean_large_2_chest_left_pectoral.addOrReplaceChild("chest_lean_large_2_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(0.7887F, -0.1942F, 0.2001F));

            PartDefinition cube_r4 = chest_lean_large_2_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(283, 682).addBox(-0.5F, -2.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_lean_large_2_chest_left_pectoral_bottom = chest_lean_large_2_chest_left_pectoral.addOrReplaceChild("chest_lean_large_2_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(0.7572F, 3.7336F, 0.9901F));

            PartDefinition cube_r5 = chest_lean_large_2_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(299, 691).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_lean_large_2_chest_left_deltoid = chest_lean_large_2_chest_left.addOrReplaceChild("chest_lean_large_2_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_lean_large_2_chest_left_deltoid_outer = chest_lean_large_2_chest_left_deltoid.addOrReplaceChild("chest_lean_large_2_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(308, 693).addBox(-2.7514F, -3.3212F, -3.8939F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6285F, -0.1983F, 0.287F));

            PartDefinition chest_lean_large_2_chest_left_deltoid_base = chest_lean_large_2_chest_left_deltoid.addOrReplaceChild("chest_lean_large_2_chest_left_deltoid_base", CubeListBuilder.create().texOffs(285, 664).addBox(-2.0F, -4.5F, -4.5F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(1.324F, -0.0028F, -0.0901F));

            PartDefinition chest_lean_large_2_chest_right = chest_lean_large_2.addOrReplaceChild("chest_lean_large_2_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_lean_large_2_chest_right_pectoral = chest_lean_large_2_chest_right.addOrReplaceChild("chest_lean_large_2_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.8436F));

            PartDefinition chest_lean_large_2_chest_right_pectoral_top = chest_lean_large_2_chest_right_pectoral.addOrReplaceChild("chest_lean_large_2_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.2454F, -1.6711F, -0.1014F));

            PartDefinition cube_r6 = chest_lean_large_2_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(317, 662).addBox(-4.0692F, -3.98F, -0.9108F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5692F, 1.2102F, -2.9329F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_lean_large_2_chest_right_pectoral_middle = chest_lean_large_2_chest_right_pectoral.addOrReplaceChild("chest_lean_large_2_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.2142F, -0.2172F, 0.128F));

            PartDefinition cube_r7 = chest_lean_large_2_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(302, 656).addBox(-2.505F, -2.02F, -2.475F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.005F, 0.025F, 0.02F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_lean_large_2_chest_right_pectoral_bottom = chest_lean_large_2_chest_right_pectoral.addOrReplaceChild("chest_lean_large_2_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.2454F, 3.6796F, 0.9028F));

            PartDefinition cube_r8 = chest_lean_large_2_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(315, 682).addBox(-4.0692F, -7.6432F, -4.4748F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5692F, -3.7858F, 4.6275F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_lean_large_2_chest_right_deltoid = chest_lean_large_2_chest_right.addOrReplaceChild("chest_lean_large_2_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_lean_large_2_chest_right_deltoid_outer = chest_lean_large_2_chest_right_deltoid.addOrReplaceChild("chest_lean_large_2_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(311, 668).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.1229F, -0.0196F, -0.1068F));

            PartDefinition chest_lean_large_2_chest_right_deltoid_base = chest_lean_large_2_chest_right_deltoid.addOrReplaceChild("chest_lean_large_2_chest_right_deltoid_base", CubeListBuilder.create().texOffs(282, 691).addBox(-2.0F, -4.5F, -4.5F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.6792F, -0.0478F, -0.0442F));

        } else if (muscleMass.equals("average") && size.equals("small") && variation == 1) {
            PartDefinition chest_average_small_1 = root.addOrReplaceChild("chest_average_small_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition chest_average_small_1_chest_front = chest_average_small_1.addOrReplaceChild("chest_average_small_1_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 2.4134F, -4.7374F));

            PartDefinition chest_average_small_1_chest_front_upper = chest_average_small_1_chest_front.addOrReplaceChild("chest_average_small_1_chest_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, -2.2419F, 1.9732F));

            PartDefinition cube_r1 = chest_average_small_1_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(34, 745).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_average_small_1_chest_front_lower = chest_average_small_1_chest_front.addOrReplaceChild("chest_average_small_1_chest_front_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5748F, 2.5557F));

            PartDefinition cube_r2 = chest_average_small_1_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 734).addBox(-4.0792F, -7.6432F, -3.4848F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, -3.7952F, 4.624F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_average_small_1_chest_left = chest_average_small_1.addOrReplaceChild("chest_average_small_1_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_average_small_1_chest_left_pectoral = chest_average_small_1_chest_left.addOrReplaceChild("chest_average_small_1_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.7709F));

            PartDefinition chest_average_small_1_chest_left_pectoral_top = chest_average_small_1_chest_left_pectoral.addOrReplaceChild("chest_average_small_1_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.5378F, -1.4279F, 0.4741F));

            PartDefinition cube_r3 = chest_average_small_1_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(22, 761).addBox(-2.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_average_small_1_chest_left_pectoral_middle = chest_average_small_1_chest_left_pectoral.addOrReplaceChild("chest_average_small_1_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.5693F, 0.1634F, 0.3896F));

            PartDefinition cube_r4 = chest_average_small_1_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(5, 745).addBox(-2.0708F, -7.7168F, -4.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5708F, -2.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_average_small_1_chest_left_pectoral_bottom = chest_average_small_1_chest_left_pectoral.addOrReplaceChild("chest_average_small_1_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.5378F, 2.7733F, 0.9037F));

            PartDefinition cube_r5 = chest_average_small_1_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(10, 725).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -4.3107F, 4.4756F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_average_small_1_chest_left_deltoid = chest_average_small_1_chest_left.addOrReplaceChild("chest_average_small_1_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_average_small_1_chest_left_deltoid_outer = chest_average_small_1_chest_left_deltoid.addOrReplaceChild("chest_average_small_1_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(30, 761).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.2136F, 0.0335F, 0.0296F));

            PartDefinition chest_average_small_1_chest_left_deltoid_base = chest_average_small_1_chest_left_deltoid.addOrReplaceChild("chest_average_small_1_chest_left_deltoid_base", CubeListBuilder.create().texOffs(19, 747).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(2.1773F, -0.0754F, 0.0827F));

            PartDefinition chest_average_small_1_chest_right = chest_average_small_1.addOrReplaceChild("chest_average_small_1_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_average_small_1_chest_right_pectoral = chest_average_small_1_chest_right.addOrReplaceChild("chest_average_small_1_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.5922F));

            PartDefinition chest_average_small_1_chest_right_pectoral_top = chest_average_small_1_chest_right_pectoral.addOrReplaceChild("chest_average_small_1_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.4622F, -1.4279F, 0.2953F));

            PartDefinition cube_r6 = chest_average_small_1_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(20, 729).addBox(-5.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_average_small_1_chest_right_pectoral_middle = chest_average_small_1_chest_right_pectoral.addOrReplaceChild("chest_average_small_1_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.4307F, 0.1634F, 0.2108F));

            PartDefinition cube_r7 = chest_average_small_1_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(30, 724).addBox(-5.0708F, -7.7168F, -4.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5708F, -2.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_average_small_1_chest_right_pectoral_bottom = chest_average_small_1_chest_right_pectoral.addOrReplaceChild("chest_average_small_1_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.4622F, 2.7733F, 0.7249F));

            PartDefinition cube_r8 = chest_average_small_1_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(32, 733).addBox(-5.08F, -7.68F, -4.52F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, -4.3107F, 4.4756F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_average_small_1_chest_right_deltoid = chest_average_small_1_chest_right.addOrReplaceChild("chest_average_small_1_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_average_small_1_chest_right_deltoid_outer = chest_average_small_1_chest_right_deltoid.addOrReplaceChild("chest_average_small_1_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(16, 735).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.7936F, 0.0032F, 0.0593F));

            PartDefinition chest_average_small_1_chest_right_deltoid_base = chest_average_small_1_chest_right_deltoid.addOrReplaceChild("chest_average_small_1_chest_right_deltoid_base", CubeListBuilder.create().texOffs(4, 760).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8227F, -0.0754F, 0.0827F));

        } else if (muscleMass.equals("average") && size.equals("small") && variation == 2) {
            PartDefinition chest_average_small_2 = root.addOrReplaceChild("chest_average_small_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition chest_average_small_2_chest_front = chest_average_small_2.addOrReplaceChild("chest_average_small_2_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 2.4134F, -3.5754F));

            PartDefinition chest_average_small_2_chest_front_upper = chest_average_small_2_chest_front.addOrReplaceChild("chest_average_small_2_chest_front_upper", CubeListBuilder.create(), PartPose.offset(-0.0277F, -2.1162F, 0.568F));

            PartDefinition cube_r1 = chest_average_small_2_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(87, 753).addBox(-4.08F, -7.68F, -3.52F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -1.52F, 5.68F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_average_small_2_chest_front_lower = chest_average_small_2_chest_front.addOrReplaceChild("chest_average_small_2_chest_front_lower", CubeListBuilder.create(), PartPose.offset(-0.0296F, 0.6278F, 1.0879F));

            PartDefinition cube_r2 = chest_average_small_2_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(73, 753).addBox(-4.0792F, -7.6432F, -4.4848F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, -4.7349F, 4.282F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_average_small_2_chest_left = chest_average_small_2.addOrReplaceChild("chest_average_small_2_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_average_small_2_chest_left_pectoral = chest_average_small_2_chest_left.addOrReplaceChild("chest_average_small_2_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.9497F));

            PartDefinition chest_average_small_2_chest_left_pectoral_top = chest_average_small_2_chest_left_pectoral.addOrReplaceChild("chest_average_small_2_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.3541F, -1.4056F, 0.3321F));

            PartDefinition cube_r3 = chest_average_small_2_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(61, 733).addBox(-2.0892F, -3.98F, -0.9108F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5892F, 1.2102F, -2.9329F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_average_small_2_chest_left_pectoral_middle = chest_average_small_2_chest_left_pectoral.addOrReplaceChild("chest_average_small_2_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.3829F, -0.9179F, 0.2105F));

            PartDefinition cube_r4 = chest_average_small_2_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(61, 753).addBox(-2.08F, -7.68F, -2.52F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -1.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_average_small_2_chest_left_pectoral_bottom = chest_average_small_2_chest_left_pectoral.addOrReplaceChild("chest_average_small_2_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.3711F, 2.1442F, 0.8631F));

            PartDefinition cube_r5 = chest_average_small_2_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(71, 728).addBox(-2.0892F, -7.6432F, -5.4748F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5892F, -4.7255F, 4.2854F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_average_small_2_chest_left_deltoid = chest_average_small_2_chest_left.addOrReplaceChild("chest_average_small_2_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_average_small_2_chest_left_deltoid_outer = chest_average_small_2_chest_left_deltoid.addOrReplaceChild("chest_average_small_2_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(82, 761).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(1.8966F, -0.0922F, -0.1772F));

            PartDefinition chest_average_small_2_chest_left_deltoid_base = chest_average_small_2_chest_left_deltoid.addOrReplaceChild("chest_average_small_2_chest_left_deltoid_base", CubeListBuilder.create().texOffs(58, 739).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(1.8603F, -0.1112F, -0.2141F));

            PartDefinition chest_average_small_2_chest_right = chest_average_small_2.addOrReplaceChild("chest_average_small_2_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_average_small_2_chest_right_pectoral = chest_average_small_2_chest_right.addOrReplaceChild("chest_average_small_2_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5363F, -3.3073F));

            PartDefinition chest_average_small_2_chest_right_pectoral_top = chest_average_small_2_chest_right_pectoral.addOrReplaceChild("chest_average_small_2_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.6459F, -1.9419F, 0.6897F));

            PartDefinition cube_r6 = chest_average_small_2_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(73, 760).addBox(-5.0892F, -3.98F, -0.9108F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5892F, 1.2102F, -2.9329F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_average_small_2_chest_right_pectoral_middle = chest_average_small_2_chest_right_pectoral.addOrReplaceChild("chest_average_small_2_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.6171F, -1.4542F, 0.568F));

            PartDefinition cube_r7 = chest_average_small_2_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(73, 739).addBox(-5.08F, -7.68F, -2.52F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, -1.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_average_small_2_chest_right_pectoral_bottom = chest_average_small_2_chest_right_pectoral.addOrReplaceChild("chest_average_small_2_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.6289F, 1.6079F, 1.2207F));

            PartDefinition cube_r8 = chest_average_small_2_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(82, 733).addBox(-5.0892F, -7.6432F, -5.4748F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5892F, -4.7255F, 4.2854F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_average_small_2_chest_right_deltoid = chest_average_small_2_chest_right.addOrReplaceChild("chest_average_small_2_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_average_small_2_chest_right_deltoid_outer = chest_average_small_2_chest_right_deltoid.addOrReplaceChild("chest_average_small_2_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(80, 743).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.1073F, -0.1163F, -0.1505F));

            PartDefinition chest_average_small_2_chest_right_deltoid_base = chest_average_small_2_chest_right_deltoid.addOrReplaceChild("chest_average_small_2_chest_right_deltoid_base", CubeListBuilder.create().texOffs(58, 760).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.1397F, -0.1112F, -0.2141F));

        } else if (muscleMass.equals("average") && size.equals("average") && variation == 1) {
            PartDefinition chest_average_average_1 = root.addOrReplaceChild("chest_average_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition chest_average_average_1_chest_front = chest_average_average_1.addOrReplaceChild("chest_average_average_1_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 1.8771F, -4.2011F));

            PartDefinition chest_average_average_1_chest_front_upper = chest_average_average_1_chest_front.addOrReplaceChild("chest_average_average_1_chest_front_upper", CubeListBuilder.create(), PartPose.offset(0.2404F, -2.4207F, 0.8898F));

            PartDefinition cube_r1 = chest_average_average_1_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(130, 752).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_average_average_1_chest_front_lower = chest_average_average_1_chest_front.addOrReplaceChild("chest_average_average_1_chest_front_lower", CubeListBuilder.create(), PartPose.offset(0.2404F, 1.2079F, 1.3196F));

            PartDefinition cube_r2 = chest_average_average_1_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(148, 752).addBox(-4.08F, -7.68F, -3.52F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.371F, 4.8176F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_average_average_1_chest_left = chest_average_average_1.addOrReplaceChild("chest_average_average_1_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_average_average_1_chest_left_pectoral = chest_average_average_1_chest_left.addOrReplaceChild("chest_average_average_1_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.0391F));

            PartDefinition chest_average_average_1_chest_left_pectoral_top = chest_average_average_1_chest_left_pectoral.addOrReplaceChild("chest_average_average_1_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.5617F, -2.3415F, 0.0947F));

            PartDefinition cube_r3 = chest_average_average_1_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(127, 739).addBox(-2.08F, -3.0F, -0.92F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 0.8927F, -2.5728F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_average_average_1_chest_left_pectoral_middle = chest_average_average_1_chest_left_pectoral.addOrReplaceChild("chest_average_average_1_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.6099F, -0.926F, 0.3788F));

            PartDefinition cube_r4 = chest_average_average_1_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(126, 727).addBox(-1.0708F, -7.7168F, -3.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4292F, -1.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_average_average_1_chest_left_pectoral_bottom = chest_average_average_1_chest_left_pectoral.addOrReplaceChild("chest_average_average_1_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.6511F, 2.8397F, 0.7219F));

            PartDefinition cube_r5 = chest_average_average_1_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(114, 752).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_average_average_1_chest_left_deltoid = chest_average_average_1_chest_left.addOrReplaceChild("chest_average_average_1_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_average_average_1_chest_left_deltoid_outer = chest_average_average_1_chest_left_deltoid.addOrReplaceChild("chest_average_average_1_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(135, 766).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0028F, -0.2346F, 0.0356F));

            PartDefinition chest_average_average_1_chest_left_deltoid_base = chest_average_average_1_chest_left_deltoid.addOrReplaceChild("chest_average_average_1_chest_left_deltoid_base", CubeListBuilder.create().texOffs(111, 736).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9665F, -0.3073F, 0.0524F));

            PartDefinition chest_average_average_1_chest_right = chest_average_average_1.addOrReplaceChild("chest_average_average_1_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_average_average_1_chest_right_pectoral = chest_average_average_1_chest_right.addOrReplaceChild("chest_average_average_1_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.5028F));

            PartDefinition chest_average_average_1_chest_right_pectoral_top = chest_average_average_1_chest_right_pectoral.addOrReplaceChild("chest_average_average_1_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.388F, -2.3415F, -0.4416F));

            PartDefinition cube_r6 = chest_average_average_1_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(134, 761).addBox(-2.08F, -3.0F, -0.92F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 0.8927F, -2.5728F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_average_average_1_chest_right_pectoral_middle = chest_average_average_1_chest_right_pectoral.addOrReplaceChild("chest_average_average_1_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.3901F, -0.926F, -0.1575F));

            PartDefinition cube_r7 = chest_average_average_1_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(137, 731).addBox(-4.0708F, -7.7168F, -3.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5708F, -1.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_average_average_1_chest_right_pectoral_bottom = chest_average_average_1_chest_right_pectoral.addOrReplaceChild("chest_average_average_1_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.3489F, 2.8397F, 0.1856F));

            PartDefinition cube_r8 = chest_average_average_1_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(151, 760).addBox(-5.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_average_average_1_chest_right_deltoid = chest_average_average_1_chest_right.addOrReplaceChild("chest_average_average_1_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_average_average_1_chest_right_deltoid_outer = chest_average_average_1_chest_right_deltoid.addOrReplaceChild("chest_average_average_1_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(135, 740).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0022F, -0.2623F, 0.0653F));

            PartDefinition chest_average_average_1_chest_right_deltoid_base = chest_average_average_1_chest_right_deltoid.addOrReplaceChild("chest_average_average_1_chest_right_deltoid_base", CubeListBuilder.create().texOffs(111, 761).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0335F, -0.3073F, 0.0524F));

        } else if (muscleMass.equals("average") && size.equals("average") && variation == 2) {
            PartDefinition chest_average_average_2 = root.addOrReplaceChild("chest_average_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition chest_average_average_2_chest_front = chest_average_average_2.addOrReplaceChild("chest_average_average_2_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 0.9832F, -4.1117F));

            PartDefinition chest_average_average_2_chest_front_upper = chest_average_average_2_chest_front.addOrReplaceChild("chest_average_average_2_chest_front_upper", CubeListBuilder.create(), PartPose.offset(0.4192F, -1.1693F, 0.7111F));

            PartDefinition cube_r1 = chest_average_average_2_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(187, 754).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_average_average_2_chest_front_lower = chest_average_average_2_chest_front.addOrReplaceChild("chest_average_average_2_chest_front_lower", CubeListBuilder.create(), PartPose.offset(0.4192F, 2.4593F, 1.1409F));

            PartDefinition cube_r2 = chest_average_average_2_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(189, 738).addBox(-4.08F, -7.68F, -3.52F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.371F, 4.8176F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_average_average_2_chest_left = chest_average_average_2.addOrReplaceChild("chest_average_average_2_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_average_average_2_chest_left_pectoral = chest_average_average_2_chest_left.addOrReplaceChild("chest_average_average_2_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.933F));

            PartDefinition chest_average_average_2_chest_left_pectoral_top = chest_average_average_2_chest_left_pectoral.addOrReplaceChild("chest_average_average_2_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.7796F, -1.7378F, 0.9472F));

            PartDefinition cube_r3 = chest_average_average_2_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(193, 732).addBox(-5.08F, -3.0F, -0.92F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, 1.0041F, -2.5314F, -0.7854F, 0.0F, 0.0F));

            PartDefinition chest_average_average_2_chest_left_pectoral_middle = chest_average_average_2_chest_left_pectoral.addOrReplaceChild("chest_average_average_2_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.7887F, -0.3897F, 1.1833F));

            PartDefinition cube_r4 = chest_average_average_2_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(176, 729).addBox(-1.0708F, -7.7168F, -3.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4292F, -1.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_average_average_2_chest_left_pectoral_bottom = chest_average_average_2_chest_left_pectoral.addOrReplaceChild("chest_average_average_2_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.8298F, 3.1973F, 1.5264F));

            PartDefinition cube_r5 = chest_average_average_2_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(171, 754).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_average_average_2_chest_left_deltoid = chest_average_average_2_chest_left.addOrReplaceChild("chest_average_average_2_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_average_average_2_chest_left_deltoid_outer = chest_average_average_2_chest_left_deltoid.addOrReplaceChild("chest_average_average_2_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(198, 756).addBox(-2.5F, -3.0F, -3.5F, 5.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0922F, -0.0559F, -0.0007F));

            PartDefinition chest_average_average_2_chest_left_deltoid_base = chest_average_average_2_chest_left_deltoid.addOrReplaceChild("chest_average_average_2_chest_left_deltoid_base", CubeListBuilder.create().texOffs(173, 738).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0559F, 0.0503F, -0.037F));

            PartDefinition chest_average_average_2_chest_right = chest_average_average_2.addOrReplaceChild("chest_average_average_2_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_average_average_2_chest_right_pectoral = chest_average_average_2_chest_right.addOrReplaceChild("chest_average_average_2_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.1285F));

            PartDefinition chest_average_average_2_chest_right_pectoral_top = chest_average_average_2_chest_right_pectoral.addOrReplaceChild("chest_average_average_2_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.1702F, -1.7378F, 0.1427F));

            PartDefinition cube_r6 = chest_average_average_2_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(209, 769).addBox(-5.08F, -3.0F, -0.92F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, 1.0041F, -2.5314F, -0.7854F, 0.0F, 0.0F));

            PartDefinition chest_average_average_2_chest_right_pectoral_middle = chest_average_average_2_chest_right_pectoral.addOrReplaceChild("chest_average_average_2_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.2113F, -0.3897F, 0.3788F));

            PartDefinition cube_r7 = chest_average_average_2_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(202, 732).addBox(-4.0708F, -7.7168F, -3.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5708F, -1.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_average_average_2_chest_right_pectoral_bottom = chest_average_average_2_chest_right_pectoral.addOrReplaceChild("chest_average_average_2_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.1702F, 3.1973F, 0.7219F));

            PartDefinition cube_r8 = chest_average_average_2_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(198, 769).addBox(-5.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_average_average_2_chest_right_deltoid = chest_average_average_2_chest_right.addOrReplaceChild("chest_average_average_2_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_average_average_2_chest_right_deltoid_outer = chest_average_average_2_chest_right_deltoid.addOrReplaceChild("chest_average_average_2_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(198, 741).addBox(-2.5F, -3.0F, -3.5F, 5.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9137F, -0.0853F, 0.0343F));

            PartDefinition chest_average_average_2_chest_right_deltoid_base = chest_average_average_2_chest_right_deltoid.addOrReplaceChild("chest_average_average_2_chest_right_deltoid_base", CubeListBuilder.create().texOffs(174, 763).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9441F, 0.0503F, -0.037F));

        } else if (muscleMass.equals("average") && size.equals("large") && variation == 1) {
            PartDefinition chest_average_large_1 = root.addOrReplaceChild("chest_average_large_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition chest_average_large_1_chest_front = chest_average_large_1.addOrReplaceChild("chest_average_large_1_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 2.4134F, -4.7374F));

            PartDefinition chest_average_large_1_chest_front_upper = chest_average_large_1_chest_front.addOrReplaceChild("chest_average_large_1_chest_front_upper", CubeListBuilder.create(), PartPose.offset(0.1511F, -2.4207F, 0.8005F));

            PartDefinition cube_r1 = chest_average_large_1_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(227, 753).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_average_large_1_chest_front_lower = chest_average_large_1_chest_front.addOrReplaceChild("chest_average_large_1_chest_front_lower", CubeListBuilder.create(), PartPose.offset(0.1296F, 1.2831F, 1.5951F));

            PartDefinition cube_r2 = chest_average_large_1_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(245, 736).addBox(-4.0792F, -7.6432F, -3.4848F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, -3.3253F, 4.795F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_average_large_1_chest_left = chest_average_large_1.addOrReplaceChild("chest_average_large_1_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_average_large_1_chest_left_pectoral = chest_average_large_1_chest_left.addOrReplaceChild("chest_average_large_1_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.933F));

            PartDefinition chest_average_large_1_chest_left_pectoral_top = chest_average_large_1_chest_left_pectoral.addOrReplaceChild("chest_average_large_1_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.5617F, -1.696F, 0.1952F));

            PartDefinition cube_r3 = chest_average_large_1_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(246, 730).addBox(-2.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_average_large_1_chest_left_pectoral_middle = chest_average_large_1_chest_left_pectoral.addOrReplaceChild("chest_average_large_1_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.5932F, -0.1942F, 0.4682F));

            PartDefinition cube_r4 = chest_average_large_1_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(245, 753).addBox(-0.5F, -2.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_average_large_1_chest_left_pectoral_bottom = chest_average_large_1_chest_left_pectoral.addOrReplaceChild("chest_average_large_1_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.5617F, 3.7336F, 1.2582F));

            PartDefinition cube_r5 = chest_average_large_1_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(261, 753).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_average_large_1_chest_left_deltoid = chest_average_large_1_chest_left.addOrReplaceChild("chest_average_large_1_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_average_large_1_chest_left_deltoid_outer = chest_average_large_1_chest_left_deltoid.addOrReplaceChild("chest_average_large_1_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(255, 765).addBox(-2.5F, -3.5F, -3.0F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0028F, -0.0196F, 0.287F));

            PartDefinition chest_average_large_1_chest_left_deltoid_base = chest_average_large_1_chest_left_deltoid.addOrReplaceChild("chest_average_large_1_chest_left_deltoid_base", CubeListBuilder.create().texOffs(228, 735).addBox(-2.0F, -4.5F, -4.5F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9497F, -0.0028F, 0.1781F));

            PartDefinition chest_average_large_1_chest_right = chest_average_large_1.addOrReplaceChild("chest_average_large_1_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_average_large_1_chest_right_pectoral = chest_average_large_1_chest_right.addOrReplaceChild("chest_average_large_1_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.3799F));

            PartDefinition chest_average_large_1_chest_right_pectoral_top = chest_average_large_1_chest_right_pectoral.addOrReplaceChild("chest_average_large_1_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.4383F, -1.696F, 0.6421F));

            PartDefinition cube_r6 = chest_average_large_1_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(258, 734).addBox(-5.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_average_large_1_chest_right_pectoral_middle = chest_average_large_1_chest_right_pectoral.addOrReplaceChild("chest_average_large_1_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.4068F, -0.1942F, 0.9152F));

            PartDefinition cube_r7 = chest_average_large_1_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(245, 762).addBox(-3.5F, -2.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_average_large_1_chest_right_pectoral_bottom = chest_average_large_1_chest_right_pectoral.addOrReplaceChild("chest_average_large_1_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.4383F, 3.7336F, 1.7052F));

            PartDefinition cube_r8 = chest_average_large_1_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(256, 725).addBox(-5.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_average_large_1_chest_right_deltoid = chest_average_large_1_chest_right.addOrReplaceChild("chest_average_large_1_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_average_large_1_chest_right_deltoid_outer = chest_average_large_1_chest_right_deltoid.addOrReplaceChild("chest_average_large_1_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(255, 740).addBox(-2.5F, -3.5F, -3.0F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0022F, -0.0544F, 0.3142F));

            PartDefinition chest_average_large_1_chest_right_deltoid_base = chest_average_large_1_chest_right_deltoid.addOrReplaceChild("chest_average_large_1_chest_right_deltoid_base", CubeListBuilder.create().texOffs(228, 762).addBox(-2.0F, -4.5F, -4.5F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0503F, -0.0028F, 0.1781F));

        } else if (muscleMass.equals("average") && size.equals("large") && variation == 2) {
            PartDefinition chest_average_large_2 = root.addOrReplaceChild("chest_average_large_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition chest_average_large_2_chest_front = chest_average_large_2.addOrReplaceChild("chest_average_large_2_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 2.4134F, -4.7374F));

            PartDefinition chest_average_large_2_chest_front_upper = chest_average_large_2_chest_front.addOrReplaceChild("chest_average_large_2_chest_front_upper", CubeListBuilder.create(), PartPose.offset(-0.2065F, -2.4207F, 0.5323F));

            PartDefinition cube_r1 = chest_average_large_2_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(298, 772).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_average_large_2_chest_front_lower = chest_average_large_2_chest_front.addOrReplaceChild("chest_average_large_2_chest_front_lower", CubeListBuilder.create(), PartPose.offset(-0.1386F, 1.2831F, 1.3269F));

            PartDefinition cube_r2 = chest_average_large_2_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(299, 755).addBox(-4.0792F, -7.6432F, -3.4848F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, -3.3253F, 4.795F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_average_large_2_chest_left = chest_average_large_2.addOrReplaceChild("chest_average_large_2_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_average_large_2_chest_left_pectoral = chest_average_large_2_chest_left.addOrReplaceChild("chest_average_large_2_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.933F));

            PartDefinition chest_average_large_2_chest_left_pectoral_top = chest_average_large_2_chest_left_pectoral.addOrReplaceChild("chest_average_large_2_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.2935F, -1.696F, -0.073F));

            PartDefinition cube_r3 = chest_average_large_2_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(310, 732).addBox(-2.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_average_large_2_chest_left_pectoral_middle = chest_average_large_2_chest_left_pectoral.addOrReplaceChild("chest_average_large_2_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.325F, -0.1942F, 0.2001F));

            PartDefinition cube_r4 = chest_average_large_2_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(282, 772).addBox(-0.5F, -2.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_average_large_2_chest_left_pectoral_bottom = chest_average_large_2_chest_left_pectoral.addOrReplaceChild("chest_average_large_2_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.2935F, 3.7336F, 0.9901F));

            PartDefinition cube_r5 = chest_average_large_2_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(297, 736).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_average_large_2_chest_left_deltoid = chest_average_large_2_chest_left.addOrReplaceChild("chest_average_large_2_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_average_large_2_chest_left_deltoid_outer = chest_average_large_2_chest_left_deltoid.addOrReplaceChild("chest_average_large_2_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(307, 738).addBox(-2.5F, -3.5F, -3.5F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9134F, -0.0196F, -0.0174F));

            PartDefinition chest_average_large_2_chest_left_deltoid_base = chest_average_large_2_chest_left_deltoid.addOrReplaceChild("chest_average_large_2_chest_left_deltoid_base", CubeListBuilder.create().texOffs(282, 754).addBox(-2.0F, -4.5F, -4.5F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(1.8603F, -0.0028F, -0.0901F));

            PartDefinition chest_average_large_2_chest_right = chest_average_large_2.addOrReplaceChild("chest_average_large_2_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_average_large_2_chest_right_pectoral = chest_average_large_2_chest_right.addOrReplaceChild("chest_average_large_2_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.933F));

            PartDefinition chest_average_large_2_chest_right_pectoral_top = chest_average_large_2_chest_right_pectoral.addOrReplaceChild("chest_average_large_2_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.7065F, -1.696F, -0.073F));

            PartDefinition cube_r6 = chest_average_large_2_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(313, 752).addBox(-5.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_average_large_2_chest_right_pectoral_middle = chest_average_large_2_chest_right_pectoral.addOrReplaceChild("chest_average_large_2_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.675F, -0.1942F, 0.2001F));

            PartDefinition cube_r7 = chest_average_large_2_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(298, 727).addBox(-3.5F, -2.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_average_large_2_chest_right_pectoral_bottom = chest_average_large_2_chest_right_pectoral.addOrReplaceChild("chest_average_large_2_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.7065F, 3.7336F, 0.9901F));

            PartDefinition cube_r8 = chest_average_large_2_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(316, 772).addBox(-5.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_average_large_2_chest_right_deltoid = chest_average_large_2_chest_right.addOrReplaceChild("chest_average_large_2_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_average_large_2_chest_right_deltoid_outer = chest_average_large_2_chest_right_deltoid.addOrReplaceChild("chest_average_large_2_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(308, 758).addBox(-2.5F, -3.5F, -3.5F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0907F, -0.0544F, 0.0177F));

            PartDefinition chest_average_large_2_chest_right_deltoid_base = chest_average_large_2_chest_right_deltoid.addOrReplaceChild("chest_average_large_2_chest_right_deltoid_base", CubeListBuilder.create().texOffs(281, 736).addBox(-2.0F, -4.5F, -4.5F, 4.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.1397F, -0.0028F, -0.0901F));

        } else if (muscleMass.equals("muscular") && size.equals("small") && variation == 1) {
            PartDefinition chest_muscular_small_1 = root.addOrReplaceChild("chest_muscular_small_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition chest_muscular_small_1_chest_front = chest_muscular_small_1.addOrReplaceChild("chest_muscular_small_1_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 2.4134F, -4.7374F));

            PartDefinition chest_muscular_small_1_chest_front_upper = chest_muscular_small_1_chest_front.addOrReplaceChild("chest_muscular_small_1_chest_front_upper", CubeListBuilder.create(), PartPose.offset(-0.0516F, -2.2419F, 1.9732F));

            PartDefinition cube_r1 = chest_muscular_small_1_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 809).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_muscular_small_1_chest_front_lower = chest_muscular_small_1_chest_front.addOrReplaceChild("chest_muscular_small_1_chest_front_lower", CubeListBuilder.create(), PartPose.offset(-0.0472F, 0.5748F, 2.5557F));

            PartDefinition cube_r2 = chest_muscular_small_1_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(33, 805).addBox(-4.0792F, -7.6432F, -3.4848F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, -3.7952F, 4.624F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_muscular_small_1_chest_left = chest_muscular_small_1.addOrReplaceChild("chest_muscular_small_1_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_muscular_small_1_chest_left_pectoral = chest_muscular_small_1_chest_left.addOrReplaceChild("chest_muscular_small_1_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.9497F));

            PartDefinition chest_muscular_small_1_chest_left_pectoral_top = chest_muscular_small_1_chest_left_pectoral.addOrReplaceChild("chest_muscular_small_1_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.5378F, -1.4279F, 0.6529F));

            PartDefinition cube_r3 = chest_muscular_small_1_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(19, 831).addBox(-2.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_muscular_small_1_chest_left_pectoral_middle = chest_muscular_small_1_chest_left_pectoral.addOrReplaceChild("chest_muscular_small_1_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.5693F, 0.1634F, 0.5684F));

            PartDefinition cube_r4 = chest_muscular_small_1_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(29, 796).addBox(-2.0708F, -7.7168F, -4.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5708F, -2.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_muscular_small_1_chest_left_pectoral_bottom = chest_muscular_small_1_chest_left_pectoral.addOrReplaceChild("chest_muscular_small_1_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.5378F, 2.7733F, 1.0824F));

            PartDefinition cube_r5 = chest_muscular_small_1_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(19, 801).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -4.3107F, 4.4756F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_muscular_small_1_chest_left_deltoid = chest_muscular_small_1_chest_left.addOrReplaceChild("chest_muscular_small_1_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_muscular_small_1_chest_left_deltoid_outer = chest_muscular_small_1_chest_left_deltoid.addOrReplaceChild("chest_muscular_small_1_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(24, 818).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6605F, -0.0559F, 0.0296F));

            PartDefinition chest_muscular_small_1_chest_left_deltoid_base = chest_muscular_small_1_chest_left_deltoid.addOrReplaceChild("chest_muscular_small_1_chest_left_deltoid_base", CubeListBuilder.create().texOffs(26, 830).addBox(-2.5F, -3.5F, -3.5F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(2.1242F, -0.0754F, 0.0827F));

            PartDefinition chest_muscular_small_1_chest_right = chest_muscular_small_1.addOrReplaceChild("chest_muscular_small_1_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_muscular_small_1_chest_right_pectoral = chest_muscular_small_1_chest_right.addOrReplaceChild("chest_muscular_small_1_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.324F));

            PartDefinition chest_muscular_small_1_chest_right_pectoral_top = chest_muscular_small_1_chest_right_pectoral.addOrReplaceChild("chest_muscular_small_1_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.4622F, -1.4279F, 0.0272F));

            PartDefinition cube_r6 = chest_muscular_small_1_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(38, 812).addBox(-5.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_muscular_small_1_chest_right_pectoral_middle = chest_muscular_small_1_chest_right_pectoral.addOrReplaceChild("chest_muscular_small_1_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.4307F, 0.1634F, -0.0573F));

            PartDefinition cube_r7 = chest_muscular_small_1_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(4, 809).addBox(-5.0708F, -7.7168F, -4.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5708F, -2.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_muscular_small_1_chest_right_pectoral_bottom = chest_muscular_small_1_chest_right_pectoral.addOrReplaceChild("chest_muscular_small_1_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.4622F, 2.7733F, 0.4567F));

            PartDefinition cube_r8 = chest_muscular_small_1_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(5, 801).addBox(-5.08F, -7.68F, -4.52F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, -4.3107F, 4.4756F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_muscular_small_1_chest_right_deltoid = chest_muscular_small_1_chest_right.addOrReplaceChild("chest_muscular_small_1_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_muscular_small_1_chest_right_deltoid_outer = chest_muscular_small_1_chest_right_deltoid.addOrReplaceChild("chest_muscular_small_1_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(2, 818).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.3395F, -0.0559F, 0.0296F));

            PartDefinition chest_muscular_small_1_chest_right_deltoid_base = chest_muscular_small_1_chest_right_deltoid.addOrReplaceChild("chest_muscular_small_1_chest_right_deltoid_base", CubeListBuilder.create().texOffs(2, 830).addBox(-2.5F, -3.5F, -3.5F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8821F, -0.1097F, 0.1168F));

        } else if (muscleMass.equals("muscular") && size.equals("small") && variation == 2) {
            PartDefinition chest_muscular_small_2 = root.addOrReplaceChild("chest_muscular_small_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition chest_muscular_small_2_chest_front = chest_muscular_small_2.addOrReplaceChild("chest_muscular_small_2_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 1.9665F, -3.933F));

            PartDefinition chest_muscular_small_2_chest_front_upper = chest_muscular_small_2_chest_front.addOrReplaceChild("chest_muscular_small_2_chest_front_upper", CubeListBuilder.create(), PartPose.offset(-0.0277F, -1.6693F, 0.9256F));

            PartDefinition cube_r1 = chest_muscular_small_2_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(86, 823).addBox(-4.08F, -7.68F, -3.52F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -1.52F, 5.68F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_muscular_small_2_chest_front_lower = chest_muscular_small_2_chest_front.addOrReplaceChild("chest_muscular_small_2_chest_front_lower", CubeListBuilder.create(), PartPose.offset(-0.0296F, 1.0747F, 1.4454F));

            PartDefinition cube_r2 = chest_muscular_small_2_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(72, 823).addBox(-4.0792F, -7.6432F, -4.4848F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, -4.7349F, 4.282F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_muscular_small_2_chest_left = chest_muscular_small_2.addOrReplaceChild("chest_muscular_small_2_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_muscular_small_2_chest_left_pectoral = chest_muscular_small_2_chest_left.addOrReplaceChild("chest_muscular_small_2_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.7709F));

            PartDefinition chest_muscular_small_2_chest_left_pectoral_top = chest_muscular_small_2_chest_left_pectoral.addOrReplaceChild("chest_muscular_small_2_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.3829F, -1.4279F, 0.1058F));

            PartDefinition cube_r3 = chest_muscular_small_2_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(68, 796).addBox(-2.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_muscular_small_2_chest_left_pectoral_middle = chest_muscular_small_2_chest_left_pectoral.addOrReplaceChild("chest_muscular_small_2_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.3829F, -0.9179F, 0.0317F));

            PartDefinition cube_r4 = chest_muscular_small_2_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(60, 823).addBox(-2.08F, -7.68F, -2.52F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -1.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_muscular_small_2_chest_left_pectoral_bottom = chest_muscular_small_2_chest_left_pectoral.addOrReplaceChild("chest_muscular_small_2_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.3711F, 2.1442F, 0.6844F));

            PartDefinition cube_r5 = chest_muscular_small_2_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(57, 800).addBox(-2.0892F, -7.6432F, -5.4748F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5892F, -4.7255F, 4.2854F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_muscular_small_2_chest_left_deltoid = chest_muscular_small_2_chest_left.addOrReplaceChild("chest_muscular_small_2_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_muscular_small_2_chest_left_deltoid_outer = chest_muscular_small_2_chest_left_deltoid.addOrReplaceChild("chest_muscular_small_2_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(83, 831).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.433F, -0.0922F, -0.1772F));

            PartDefinition chest_muscular_small_2_chest_left_deltoid_base = chest_muscular_small_2_chest_left_deltoid.addOrReplaceChild("chest_muscular_small_2_chest_left_deltoid_base", CubeListBuilder.create().texOffs(56, 809).addBox(-2.5F, -3.5F, -3.5F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(1.8966F, -0.1112F, -0.2141F));

            PartDefinition chest_muscular_small_2_chest_right = chest_muscular_small_2.addOrReplaceChild("chest_muscular_small_2_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_muscular_small_2_chest_right_pectoral = chest_muscular_small_2_chest_right.addOrReplaceChild("chest_muscular_small_2_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.0391F));

            PartDefinition chest_muscular_small_2_chest_right_pectoral_top = chest_muscular_small_2_chest_right_pectoral.addOrReplaceChild("chest_muscular_small_2_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.6171F, -1.4279F, 0.374F));

            PartDefinition cube_r6 = chest_muscular_small_2_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(74, 830).addBox(-5.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_muscular_small_2_chest_right_pectoral_middle = chest_muscular_small_2_chest_right_pectoral.addOrReplaceChild("chest_muscular_small_2_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.6171F, -0.9179F, 0.2999F));

            PartDefinition cube_r7 = chest_muscular_small_2_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(73, 802).addBox(-5.08F, -7.68F, -2.52F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, -1.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_muscular_small_2_chest_right_pectoral_bottom = chest_muscular_small_2_chest_right_pectoral.addOrReplaceChild("chest_muscular_small_2_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.6289F, 2.1442F, 0.9525F));

            PartDefinition cube_r8 = chest_muscular_small_2_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(80, 804).addBox(-5.0892F, -7.6432F, -5.4748F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5892F, -4.7255F, 4.2854F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_muscular_small_2_chest_right_deltoid = chest_muscular_small_2_chest_right.addOrReplaceChild("chest_muscular_small_2_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_muscular_small_2_chest_right_deltoid_outer = chest_muscular_small_2_chest_right_deltoid.addOrReplaceChild("chest_muscular_small_2_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(80, 813).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.567F, -0.0922F, -0.1772F));

            PartDefinition chest_muscular_small_2_chest_right_deltoid_base = chest_muscular_small_2_chest_right_deltoid.addOrReplaceChild("chest_muscular_small_2_chest_right_deltoid_base", CubeListBuilder.create().texOffs(57, 830).addBox(-2.5F, -3.5F, -3.5F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.1073F, -0.1451F, -0.177F));

        } else if (muscleMass.equals("muscular") && size.equals("average") && variation == 1) {
            PartDefinition chest_muscular_average_1 = root.addOrReplaceChild("chest_muscular_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition chest_muscular_average_1_chest_front = chest_muscular_average_1.addOrReplaceChild("chest_muscular_average_1_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 2.4134F, -4.7374F));

            PartDefinition chest_muscular_average_1_chest_front_upper = chest_muscular_average_1_chest_front.addOrReplaceChild("chest_muscular_average_1_chest_front_upper", CubeListBuilder.create(), PartPose.offset(0.2404F, -2.957F, 1.4261F));

            PartDefinition cube_r1 = chest_muscular_average_1_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(132, 821).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_muscular_average_1_chest_front_lower = chest_muscular_average_1_chest_front.addOrReplaceChild("chest_muscular_average_1_chest_front_lower", CubeListBuilder.create(), PartPose.offset(0.2404F, 0.6716F, 1.8559F));

            PartDefinition cube_r2 = chest_muscular_average_1_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(150, 821).addBox(-4.08F, -7.68F, -3.52F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.371F, 4.8176F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_muscular_average_1_chest_left = chest_muscular_average_1.addOrReplaceChild("chest_muscular_average_1_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_muscular_average_1_chest_left_pectoral = chest_muscular_average_1_chest_left.addOrReplaceChild("chest_muscular_average_1_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.0391F));

            PartDefinition chest_muscular_average_1_chest_left_pectoral_top = chest_muscular_average_1_chest_left_pectoral.addOrReplaceChild("chest_muscular_average_1_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.6511F, -2.2323F, 0.374F));

            PartDefinition cube_r3 = chest_muscular_average_1_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(130, 807).addBox(-2.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_muscular_average_1_chest_left_pectoral_middle = chest_muscular_average_1_chest_left_pectoral.addOrReplaceChild("chest_muscular_average_1_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.6099F, -0.5685F, 0.3788F));

            PartDefinition cube_r4 = chest_muscular_average_1_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(140, 791).addBox(-1.0708F, -7.7168F, -3.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4292F, -1.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_muscular_average_1_chest_left_pectoral_bottom = chest_muscular_average_1_chest_left_pectoral.addOrReplaceChild("chest_muscular_average_1_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.6511F, 2.8397F, 0.7219F));

            PartDefinition cube_r5 = chest_muscular_average_1_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(116, 821).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_muscular_average_1_chest_left_deltoid = chest_muscular_average_1_chest_left.addOrReplaceChild("chest_muscular_average_1_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_muscular_average_1_chest_left_deltoid_outer = chest_muscular_average_1_chest_left_deltoid.addOrReplaceChild("chest_muscular_average_1_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(138, 830).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6285F, -0.0559F, 0.2144F));

            PartDefinition chest_muscular_average_1_chest_left_deltoid_base = chest_muscular_average_1_chest_left_deltoid.addOrReplaceChild("chest_muscular_average_1_chest_left_deltoid_base", CubeListBuilder.create().texOffs(112, 805).addBox(-2.5F, -4.0F, -4.0F, 5.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(2.1816F, -0.3073F, 0.0524F));

            PartDefinition chest_muscular_average_1_chest_right = chest_muscular_average_1.addOrReplaceChild("chest_muscular_average_1_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_muscular_average_1_chest_right_pectoral = chest_muscular_average_1_chest_right.addOrReplaceChild("chest_muscular_average_1_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.6648F));

            PartDefinition chest_muscular_average_1_chest_right_pectoral_top = chest_muscular_average_1_chest_right_pectoral.addOrReplaceChild("chest_muscular_average_1_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.3489F, -2.2323F, 0.9997F));

            PartDefinition cube_r6 = chest_muscular_average_1_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(130, 796).addBox(-5.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_muscular_average_1_chest_right_pectoral_middle = chest_muscular_average_1_chest_right_pectoral.addOrReplaceChild("chest_muscular_average_1_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.3901F, -0.5685F, 1.0045F));

            PartDefinition cube_r7 = chest_muscular_average_1_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(142, 800).addBox(-4.0708F, -7.7168F, -3.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5708F, -1.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_muscular_average_1_chest_right_pectoral_bottom = chest_muscular_average_1_chest_right_pectoral.addOrReplaceChild("chest_muscular_average_1_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.3489F, 2.8397F, 1.3476F));

            PartDefinition cube_r8 = chest_muscular_average_1_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(114, 796).addBox(-5.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_muscular_average_1_chest_right_deltoid = chest_muscular_average_1_chest_right.addOrReplaceChild("chest_muscular_average_1_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_muscular_average__chest_right_deltoid_outer = chest_muscular_average_1_chest_right_deltoid.addOrReplaceChild("chest_muscular_average__chest_right_deltoid_outer", CubeListBuilder.create().texOffs(138, 809).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.3715F, -0.0559F, 0.2144F));

            PartDefinition chest_muscular_average__chest_right_deltoid_base = chest_muscular_average_1_chest_right_deltoid.addOrReplaceChild("chest_muscular_average__chest_right_deltoid_base", CubeListBuilder.create().texOffs(112, 830).addBox(-2.5F, -4.0F, -4.0F, 5.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8253F, -0.3442F, 0.0919F));

        } else if (muscleMass.equals("muscular") && size.equals("average") && variation == 2) {
            PartDefinition chest_muscular_average_2 = root.addOrReplaceChild("chest_muscular_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition chest_muscular_average_2_chest_front = chest_muscular_average_2.addOrReplaceChild("chest_muscular_average_2_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 1.2514F, -4.1117F));

            PartDefinition chest_muscular_average_2_chest_front_upper = chest_muscular_average_2_chest_front.addOrReplaceChild("chest_muscular_average_2_chest_front_upper", CubeListBuilder.create(), PartPose.offset(0.0741F, -1.4374F, 0.7111F));

            PartDefinition cube_r1 = chest_muscular_average_2_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(185, 839).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_muscular_average_2_chest_front_lower = chest_muscular_average_2_chest_front.addOrReplaceChild("chest_muscular_average_2_chest_front_lower", CubeListBuilder.create(), PartPose.offset(0.0741F, 2.1911F, 1.1409F));

            PartDefinition cube_r2 = chest_muscular_average_2_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(188, 823).addBox(-4.08F, -7.68F, -3.52F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.371F, 4.8176F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_muscular_average_2_chest_left = chest_muscular_average_2.addOrReplaceChild("chest_muscular_average_2_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_muscular_average_2_chest_left_pectoral = chest_muscular_average_2_chest_left.addOrReplaceChild("chest_muscular_average_2_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.486F));

            PartDefinition chest_muscular_average_2_chest_left_pectoral_top = chest_muscular_average_2_chest_left_pectoral.addOrReplaceChild("chest_muscular_average_2_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.422F, -1.696F, 0.8209F));

            PartDefinition cube_r3 = chest_muscular_average_2_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(195, 795).addBox(-5.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_muscular_average_2_chest_left_pectoral_middle = chest_muscular_average_2_chest_left_pectoral.addOrReplaceChild("chest_muscular_average_2_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.4436F, -0.0322F, 0.7364F));

            PartDefinition cube_r4 = chest_muscular_average_2_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(200, 801).addBox(-1.0708F, -7.7168F, -3.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4292F, -1.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_muscular_average_2_chest_left_pectoral_bottom = chest_muscular_average_2_chest_left_pectoral.addOrReplaceChild("chest_muscular_average_2_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.4847F, 3.6671F, 1.2505F));

            PartDefinition cube_r5 = chest_muscular_average_2_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(171, 839).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -4.3107F, 4.4756F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_muscular_average_2_chest_left_deltoid = chest_muscular_average_2_chest_left.addOrReplaceChild("chest_muscular_average_2_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_muscular_average_2_chest_left_deltoid_outer = chest_muscular_average_2_chest_left_deltoid.addOrReplaceChild("chest_muscular_average_2_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(198, 810).addBox(-2.5F, -3.0F, -3.5F, 5.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(2.4622F, -0.0559F, -0.0007F));

            PartDefinition chest_muscular_average_2_chest_left_deltoid_base = chest_muscular_average_2_chest_left_deltoid.addOrReplaceChild("chest_muscular_average_2_chest_left_deltoid_base", CubeListBuilder.create().texOffs(170, 823).addBox(-2.5F, -4.0F, -4.0F, 5.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9259F, 0.0503F, -0.037F));

            PartDefinition chest_muscular_average_2_chest_right = chest_muscular_average_2.addOrReplaceChild("chest_muscular_average_2_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_muscular_average_2_chest_right_pectoral = chest_muscular_average_2_chest_right.addOrReplaceChild("chest_muscular_average_2_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.1285F));

            PartDefinition chest_muscular_average_2_chest_right_pectoral_top = chest_muscular_average_2_chest_right_pectoral.addOrReplaceChild("chest_muscular_average_2_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.5277F, -1.696F, 0.4634F));

            PartDefinition cube_r6 = chest_muscular_average_2_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(190, 809).addBox(-5.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_muscular_average_2_chest_right_pectoral_middle = chest_muscular_average_2_chest_right_pectoral.addOrReplaceChild("chest_muscular_average_2_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.5564F, -0.0322F, 0.3788F));

            PartDefinition cube_r7 = chest_muscular_average_2_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(184, 798).addBox(-4.0708F, -7.7168F, -3.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5708F, -1.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_muscular_average_2_chest_right_pectoral_bottom = chest_muscular_average_2_chest_right_pectoral.addOrReplaceChild("chest_muscular_average_2_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.5153F, 3.6671F, 0.8929F));

            PartDefinition cube_r8 = chest_muscular_average_2_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(203, 839).addBox(-5.08F, -7.68F, -4.52F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, -4.3107F, 4.4756F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_muscular_average_2_chest_right_deltoid = chest_muscular_average_2_chest_right.addOrReplaceChild("chest_muscular_average_2_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_muscular_average_2_chest_right_deltoid_outer = chest_muscular_average_2_chest_right_deltoid.addOrReplaceChild("chest_muscular_average_2_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(197, 826).addBox(-2.5F, -3.0F, -3.5F, 5.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5378F, -0.0559F, -0.0007F));

            PartDefinition chest_muscular_average_2_chest_right_deltoid_base = chest_muscular_average_2_chest_right_deltoid.addOrReplaceChild("chest_muscular_average_2_chest_right_deltoid_base", CubeListBuilder.create().texOffs(172, 807).addBox(-2.5F, -4.0F, -4.0F, 5.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0784F, 0.0098F, 0.0034F));

        } else if (muscleMass.equals("muscular") && size.equals("large") && variation == 1) {
            PartDefinition chest_muscular_large_1 = root.addOrReplaceChild("chest_muscular_large_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition chest_muscular_large_1_chest_front = chest_muscular_large_1.addOrReplaceChild("chest_muscular_large_1_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 2.4134F, -4.7374F));

            PartDefinition chest_muscular_large_1_chest_front_upper = chest_muscular_large_1_chest_front.addOrReplaceChild("chest_muscular_large_1_chest_front_upper", CubeListBuilder.create(), PartPose.offset(-0.2065F, -2.4207F, 0.5323F));

            PartDefinition cube_r1 = chest_muscular_large_1_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(228, 805).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4375F, -2.02F, 5.9482F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_muscular_large_1_chest_front_lower = chest_muscular_large_1_chest_front.addOrReplaceChild("chest_muscular_large_1_chest_front_lower", CubeListBuilder.create(), PartPose.offset(-0.1386F, 1.2831F, 1.3269F));

            PartDefinition cube_r2 = chest_muscular_large_1_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(246, 815).addBox(-4.0792F, -7.6432F, -3.4848F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3474F, -3.3253F, 5.0632F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_muscular_large_1_chest_left = chest_muscular_large_1.addOrReplaceChild("chest_muscular_large_1_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_muscular_large_1_chest_left_pectoral = chest_muscular_large_1_chest_left.addOrReplaceChild("chest_muscular_large_1_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.933F));

            PartDefinition chest_muscular_large_1_chest_left_pectoral_top = chest_muscular_large_1_chest_left_pectoral.addOrReplaceChild("chest_muscular_large_1_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.5617F, -1.696F, 0.1952F));

            PartDefinition cube_r3 = chest_muscular_large_1_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(248, 832).addBox(-2.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_muscular_large_1_chest_left_pectoral_middle = chest_muscular_large_1_chest_left_pectoral.addOrReplaceChild("chest_muscular_large_1_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.5932F, -0.1942F, 0.4682F));

            PartDefinition cube_r4 = chest_muscular_large_1_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(241, 797).addBox(-0.5F, -2.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_muscular_large_1_chest_left_pectoral_bottom = chest_muscular_large_1_chest_left_pectoral.addOrReplaceChild("chest_muscular_large_1_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.5617F, 3.7336F, 1.2582F));

            PartDefinition cube_r5 = chest_muscular_large_1_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(257, 795).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_muscular_large_1_chest_left_deltoid = chest_muscular_large_1_chest_left.addOrReplaceChild("chest_muscular_large_1_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_muscular_large_1_chest_left_deltoid_outer = chest_muscular_large_1_chest_left_deltoid.addOrReplaceChild("chest_muscular_large_1_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(257, 832).addBox(-2.5F, -3.5F, -3.0F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6285F, -0.1983F, 0.287F));

            PartDefinition chest_muscular_large_1_chest_left_deltoid_base = chest_muscular_large_1_chest_left_deltoid.addOrReplaceChild("chest_muscular_large_1_chest_left_deltoid_base", CubeListBuilder.create().texOffs(227, 814).addBox(-2.5F, -4.5F, -4.5F, 5.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0754F, -0.0028F, 0.1781F));

            PartDefinition chest_muscular_large_1_chest_right = chest_muscular_large_1.addOrReplaceChild("chest_muscular_large_1_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_muscular_large_1_chest_right_pectoral = chest_muscular_large_1_chest_right.addOrReplaceChild("chest_muscular_large_1_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.3799F));

            PartDefinition chest_muscular_large_1_chest_right_pectoral_top = chest_muscular_large_1_chest_right_pectoral.addOrReplaceChild("chest_muscular_large_1_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.4383F, -1.696F, 0.6421F));

            PartDefinition cube_r6 = chest_muscular_large_1_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(258, 813).addBox(-5.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_muscular_large_1_chest_right_pectoral_middle = chest_muscular_large_1_chest_right_pectoral.addOrReplaceChild("chest_muscular_large_1_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.4068F, -0.1942F, 0.9152F));

            PartDefinition cube_r7 = chest_muscular_large_1_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(246, 806).addBox(-3.5F, -2.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_muscular_large_1_chest_right_pectoral_bottom = chest_muscular_large_1_chest_right_pectoral.addOrReplaceChild("chest_muscular_large_1_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.4383F, 3.7336F, 1.7052F));

            PartDefinition cube_r8 = chest_muscular_large_1_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(262, 804).addBox(-5.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_muscular_large_1_chest_right_deltoid = chest_muscular_large_1_chest_right.addOrReplaceChild("chest_muscular_large_1_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_muscular_large_1_chest_right_deltoid_outer = chest_muscular_large_1_chest_right_deltoid.addOrReplaceChild("chest_muscular_large_1_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(256, 819).addBox(-2.5F, -3.5F, -3.0F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.3715F, -0.1983F, 0.287F));

            PartDefinition chest_muscular_large_1_chest_right_deltoid_base = chest_muscular_large_1_chest_right_deltoid.addOrReplaceChild("chest_muscular_large_1_chest_right_deltoid_base", CubeListBuilder.create().texOffs(229, 832).addBox(-2.5F, -4.5F, -4.5F, 5.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9303F, -0.0478F, 0.2213F));

        } else if (muscleMass.equals("muscular") && size.equals("large") && variation == 2) {
            PartDefinition chest_muscular_large_2 = root.addOrReplaceChild("chest_muscular_large_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition chest_muscular_large_2_chest_front = chest_muscular_large_2.addOrReplaceChild("chest_muscular_large_2_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 2.4134F, -4.7374F));

            PartDefinition chest_muscular_large_2_chest_front_upper = chest_muscular_large_2_chest_front.addOrReplaceChild("chest_muscular_large_2_chest_front_upper", CubeListBuilder.create(), PartPose.offset(-0.2065F, -2.4207F, 0.5323F));

            PartDefinition cube_r1 = chest_muscular_large_2_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(297, 806).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_muscular_large_2_chest_front_lower = chest_muscular_large_2_chest_front.addOrReplaceChild("chest_muscular_large_2_chest_front_lower", CubeListBuilder.create(), PartPose.offset(-0.1386F, 1.2831F, 1.3269F));

            PartDefinition cube_r2 = chest_muscular_large_2_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(286, 801).addBox(-4.0792F, -7.6432F, -3.4848F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, -3.3253F, 4.795F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_muscular_large_2_chest_left = chest_muscular_large_2.addOrReplaceChild("chest_muscular_large_2_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_muscular_large_2_chest_left_pectoral = chest_muscular_large_2_chest_left.addOrReplaceChild("chest_muscular_large_2_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.7374F));

            PartDefinition chest_muscular_large_2_chest_left_pectoral_top = chest_muscular_large_2_chest_left_pectoral.addOrReplaceChild("chest_muscular_large_2_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.2935F, -1.696F, 0.7315F));

            PartDefinition cube_r3 = chest_muscular_large_2_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(283, 809).addBox(-2.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_muscular_large_2_chest_left_pectoral_middle = chest_muscular_large_2_chest_left_pectoral.addOrReplaceChild("chest_muscular_large_2_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.325F, -0.1942F, 1.0045F));

            PartDefinition cube_r4 = chest_muscular_large_2_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(282, 815).addBox(-0.5F, -2.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_muscular_large_2_chest_left_pectoral_bottom = chest_muscular_large_2_chest_left_pectoral.addOrReplaceChild("chest_muscular_large_2_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.2935F, 3.7336F, 1.7945F));

            PartDefinition cube_r5 = chest_muscular_large_2_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(310, 801).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_muscular_large_2_chest_left_deltoid = chest_muscular_large_2_chest_left.addOrReplaceChild("chest_muscular_large_2_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_muscular_large_2_chest_left_deltoid_outer = chest_muscular_large_2_chest_left_deltoid.addOrReplaceChild("chest_muscular_large_2_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(310, 828).addBox(-2.5F, -3.5F, -3.5F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(2.3603F, -0.1983F, 0.0719F));

            PartDefinition chest_muscular_large_2_chest_left_deltoid_base = chest_muscular_large_2_chest_left_deltoid.addOrReplaceChild("chest_muscular_large_2_chest_left_deltoid_base", CubeListBuilder.create().texOffs(289, 815).addBox(-2.5F, -4.5F, -4.5F, 5.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(1.8073F, -0.0028F, -0.0901F));

            PartDefinition chest_muscular_large_2_chest_right = chest_muscular_large_2.addOrReplaceChild("chest_muscular_large_2_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_muscular_large_2_chest_right_pectoral = chest_muscular_large_2_chest_right.addOrReplaceChild("chest_muscular_large_2_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.2011F));

            PartDefinition chest_muscular_large_2_chest_right_pectoral_top = chest_muscular_large_2_chest_right_pectoral.addOrReplaceChild("chest_muscular_large_2_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.7065F, -1.696F, 0.1952F));

            PartDefinition cube_r6 = chest_muscular_large_2_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(319, 842).addBox(-5.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

            PartDefinition chest_muscular_large_2_chest_right_pectoral_middle = chest_muscular_large_2_chest_right_pectoral.addOrReplaceChild("chest_muscular_large_2_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.675F, -0.1942F, 0.4682F));

            PartDefinition cube_r7 = chest_muscular_large_2_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(298, 796).addBox(-3.5F, -2.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

            PartDefinition chest_muscular_large_2_chest_right_pectoral_bottom = chest_muscular_large_2_chest_right_pectoral.addOrReplaceChild("chest_muscular_large_2_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.7065F, 3.7336F, 1.2582F));

            PartDefinition cube_r8 = chest_muscular_large_2_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(284, 833).addBox(-5.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

            PartDefinition chest_muscular_large_2_chest_right_deltoid = chest_muscular_large_2_chest_right.addOrReplaceChild("chest_muscular_large_2_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest_muscular_large_2_chest_right_deltoid_outer = chest_muscular_large_2_chest_right_deltoid.addOrReplaceChild("chest_muscular_large_2_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(308, 810).addBox(-2.5F, -3.5F, -3.5F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.7291F, -0.1983F, 0.0719F));

            PartDefinition chest_muscular_large_2_chest_right_deltoid_base = chest_muscular_large_2_chest_right_deltoid.addOrReplaceChild("chest_muscular_large_2_chest_right_deltoid_base", CubeListBuilder.create().texOffs(291, 833).addBox(-2.5F, -4.5F, -4.5F, 5.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.1958F, -0.0478F, -0.0442F));

        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Chest / " + muscleMass + " / " + size + " / Variation " + variation + ", Cancelling Generation...");
        }
        allParts.add("chest_" + muscleMass + "_" + size + "_" + variation);
        return root;
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
