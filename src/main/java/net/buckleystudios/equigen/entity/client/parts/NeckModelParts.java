package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

import java.util.ArrayList;
import java.util.List;

//Upon entering this realm, only two things can save you from the horrors within. Amnesia, or Death... Make your choice.
//By continuing down this path, I ask one thing and one thing only.
//May God have mercy on your soul.

public class NeckModelParts {
    private static List<String> allParts = new ArrayList<>();
    public static List<String> getAllParts(){
        return allParts;
    }
    public static PartDefinition GenerateArched(PartDefinition partdefinition, String muscleMass, String length, int variation) {
        /* Arched Neck */
        if (muscleMass.equals("lean") && length.equals("short") && variation == 1) {
            PartDefinition neck_lean_arched_short_1 = partdefinition.addOrReplaceChild("neck_lean_arched_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_lean_arched_short_1_individual = neck_lean_arched_short_1.addOrReplaceChild("neck_lean_arched_short_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2927F, 2.6458F, -0.5718F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_short_1_crest = neck_lean_arched_short_1_individual.addOrReplaceChild("neck_lean_arched_short_1_crest", CubeListBuilder.create(), PartPose.offset(-0.2927F, -6.8469F, -0.2327F));

            PartDefinition neck_lean_arched_short_1_crest_upper = neck_lean_arched_short_1_crest.addOrReplaceChild("neck_lean_arched_short_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.2279F, -1.3802F, -1.4952F));

            PartDefinition cube_r1 = neck_lean_arched_short_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(392, 583).addBox(-3.1434F, -5.8622F, -2.7188F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1434F, 0.2644F, 2.3426F, 1.5708F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_short_1_crest_lower = neck_lean_arched_short_1_crest.addOrReplaceChild("neck_lean_arched_short_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1756F, 0.7513F, 0.8261F));

            PartDefinition cube_r2 = neck_lean_arched_short_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(364, 583).addBox(-4.08F, -10.0F, -0.92F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 4.6528F, 4.5396F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_short_1_middle_individual = neck_lean_arched_short_1_individual.addOrReplaceChild("neck_lean_arched_short_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.2724F, -4.1169F, -0.5094F));

            PartDefinition cube_r3 = neck_lean_arched_short_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(376, 583).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1077F, 6.9822F, 0.7481F, 0.2618F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_lean_arched_short_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(365, 572).addBox(-4.0F, -10.0F, -1.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9707F, 4.401F, 3.6331F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_short_1_lower_individual = neck_lean_arched_short_1_individual.addOrReplaceChild("neck_lean_arched_short_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.2065F, -2.289F, -0.4566F));

            PartDefinition cube_r5 = neck_lean_arched_short_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(381, 573).addBox(-4.08F, -11.0F, -0.92F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 8.0069F, 1.0274F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_short_1_mane = neck_lean_arched_short_1.addOrReplaceChild("neck_lean_arched_short_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -5.5419F, 0.8045F));

            PartDefinition neck_lean_arched_short_1_top_mane = neck_lean_arched_short_1_mane.addOrReplaceChild("neck_lean_arched_short_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, -1.019F, -1.6906F));

            PartDefinition neck_lean_arched_short_1_top_mane_connector = neck_lean_arched_short_1_top_mane.addOrReplaceChild("neck_lean_arched_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -0.8939F, -0.5363F));

            PartDefinition neck_lean_arched_short_1_top_mane_connector_individual = neck_lean_arched_short_1_top_mane_connector.addOrReplaceChild("neck_lean_arched_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

            PartDefinition cube_r6 = neck_lean_arched_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(723, 769).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_short_1_top_mane_connector2 = neck_lean_arched_short_1_top_mane_connector.addOrReplaceChild("neck_lean_arched_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.4469F));

            PartDefinition neck_lean_arched_short_1_top_mane_connector2_individual = neck_lean_arched_short_1_top_mane_connector2.addOrReplaceChild("neck_lean_arched_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.5034F, -0.3893F));

            PartDefinition cube_r7 = neck_lean_arched_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(723, 776).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_short_1_top_mane_flow = neck_lean_arched_short_1_top_mane_connector2.addOrReplaceChild("neck_lean_arched_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, 0.2682F, -0.1745F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_lean_arched_short_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(709, 770).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

            PartDefinition neck_lean_arched_short_1_bottom_mane = neck_lean_arched_short_1_mane.addOrReplaceChild("neck_lean_arched_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, 2.914F, 1.9742F));

            PartDefinition neck_lean_arched_short_1_bottom_mane_connector = neck_lean_arched_short_1_bottom_mane.addOrReplaceChild("neck_lean_arched_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_lean_arched_short_1_bottom_mane_connector_individual = neck_lean_arched_short_1_bottom_mane_connector.addOrReplaceChild("neck_lean_arched_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -2.1016F, -1.5962F));

            PartDefinition cube_r9 = neck_lean_arched_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(732, 772).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5733F, -1.7004F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_short_1_bottom_mane_connector2 = neck_lean_arched_short_1_bottom_mane_connector.addOrReplaceChild("neck_lean_arched_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -2.4134F, -0.8045F));

            PartDefinition neck_lean_arched_short_1_bottom_mane_connector2_individual = neck_lean_arched_short_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_arched_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, -0.0807F, -0.3996F));

            PartDefinition cube_r10 = neck_lean_arched_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(730, 781).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2769F, -2.1032F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_short_1_bottom_mane_flow = neck_lean_arched_short_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_arched_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.1788F, 0.0F));

            PartDefinition cube_r11 = neck_lean_arched_short_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(714, 775).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, 1.4302F, 1.2514F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("lean") && length.equals("short") && variation == 2) {
            PartDefinition neck_lean_arched_short_2 = partdefinition.addOrReplaceChild("neck_lean_arched_short_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_lean_arched_short_2_individual = neck_lean_arched_short_2.addOrReplaceChild("neck_lean_arched_short_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2927F, -0.2145F, -0.5718F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_short_2_crest = neck_lean_arched_short_2_individual.addOrReplaceChild("neck_lean_arched_short_2_crest", CubeListBuilder.create(), PartPose.offset(-0.2927F, -4.076F, -1.7523F));

            PartDefinition neck_lean_arched_short_2_crest_upper = neck_lean_arched_short_2_crest.addOrReplaceChild("neck_lean_arched_short_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.2279F, -1.6092F, -1.3784F));

            PartDefinition cube_r1 = neck_lean_arched_short_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(445, 583).addBox(-3.1434F, -5.8622F, -2.7188F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1434F, 0.1751F, 2.6108F, 1.5708F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_short_2_crest_lower = neck_lean_arched_short_2_crest.addOrReplaceChild("neck_lean_arched_short_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1756F, 0.8064F, 1.48F));

            PartDefinition cube_r2 = neck_lean_arched_short_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(417, 583).addBox(-4.08F, -10.0F, -0.92F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 4.2992F, 4.1861F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_short_2_middle_individual = neck_lean_arched_short_2_individual.addOrReplaceChild("neck_lean_arched_short_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.2724F, -1.2262F, -1.4871F));

            PartDefinition cube_r3 = neck_lean_arched_short_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(429, 583).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1077F, 6.5639F, 0.5066F, 0.2618F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_lean_arched_short_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(418, 571).addBox(-4.0F, -10.0F, -1.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9707F, 3.9827F, 3.3916F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_short_2_lower_individual = neck_lean_arched_short_2_individual.addOrReplaceChild("neck_lean_arched_short_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.2065F, 0.6665F, -1.5464F));

            PartDefinition cube_r5 = neck_lean_arched_short_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(434, 572).addBox(-4.08F, -11.0F, -0.92F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 7.524F, 0.8979F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_short_2_mane = neck_lean_arched_short_2.addOrReplaceChild("neck_lean_arched_short_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -4.8268F, 0.0F));

            PartDefinition neck_lean_arched_short_2_top_mane = neck_lean_arched_short_2_mane.addOrReplaceChild("neck_lean_arched_short_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, -2.9855F, -0.0817F));

            PartDefinition neck_lean_arched_short_2_top_mane_connector = neck_lean_arched_short_2_top_mane.addOrReplaceChild("neck_lean_arched_short_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -0.2682F, -2.5922F));

            PartDefinition neck_lean_arched_short_2_top_mane_connector_individual = neck_lean_arched_short_2_top_mane_connector.addOrReplaceChild("neck_lean_arched_short_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

            PartDefinition cube_r6 = neck_lean_arched_short_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(767, 770).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_short_2_top_mane_connector2 = neck_lean_arched_short_2_top_mane_connector.addOrReplaceChild("neck_lean_arched_short_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.4469F));

            PartDefinition neck_lean_arched_short_2_top_mane_connector2_individual = neck_lean_arched_short_2_top_mane_connector2.addOrReplaceChild("neck_lean_arched_short_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.5034F, -0.3893F));

            PartDefinition cube_r7 = neck_lean_arched_short_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(767, 777).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_short_2_top_mane_flow = neck_lean_arched_short_2_top_mane_connector2.addOrReplaceChild("neck_lean_arched_short_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, 0.2682F, -0.1745F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_lean_arched_short_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(753, 771).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

            PartDefinition neck_lean_arched_short_2_bottom_mane = neck_lean_arched_short_2_mane.addOrReplaceChild("neck_lean_arched_short_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, 1.5732F, 1.5273F));

            PartDefinition neck_lean_arched_short_2_bottom_mane_connector = neck_lean_arched_short_2_bottom_mane.addOrReplaceChild("neck_lean_arched_short_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_lean_arched_short_2_bottom_mane_connector_individual = neck_lean_arched_short_2_bottom_mane_connector.addOrReplaceChild("neck_lean_arched_short_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -1.7049F, -1.2918F));

            PartDefinition cube_r9 = neck_lean_arched_short_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(776, 771).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.97F, -2.0048F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_short_2_bottom_mane_connector2 = neck_lean_arched_short_2_bottom_mane_connector.addOrReplaceChild("neck_lean_arched_short_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -2.4134F, -0.8045F));

            PartDefinition neck_lean_arched_short_2_bottom_mane_connector2_individual = neck_lean_arched_short_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_arched_short_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.316F, -0.0952F));

            PartDefinition cube_r10 = neck_lean_arched_short_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(775, 781).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6736F, -2.4076F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_short_2_bottom_mane_flow = neck_lean_arched_short_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_arched_short_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.1788F, 0.0F));

            PartDefinition cube_r11 = neck_lean_arched_short_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(757, 775).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, 1.4302F, 1.2514F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("lean") && length.equals("average") && variation == 1) {
            PartDefinition neck_lean_arched_average_1 = partdefinition.addOrReplaceChild("neck_lean_arched_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_lean_arched_average_1_individual = neck_lean_arched_average_1.addOrReplaceChild("neck_lean_arched_average_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2927F, -1.2872F, -0.3036F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_average_1_crest = neck_lean_arched_average_1_individual.addOrReplaceChild("neck_lean_arched_average_1_crest", CubeListBuilder.create(), PartPose.offset(-0.2927F, -3.8972F, -1.3947F));

            PartDefinition neck_lean_arched_average_1_crest_upper = neck_lean_arched_average_1_crest.addOrReplaceChild("neck_lean_arched_average_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.2279F, -1.6986F, -1.6466F));

            PartDefinition cube_r1 = neck_lean_arched_average_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(500, 584).addBox(-3.1434F, -5.8622F, -2.7188F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1434F, 0.0857F, 2.5214F, 1.5708F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_average_1_crest_lower = neck_lean_arched_average_1_crest.addOrReplaceChild("neck_lean_arched_average_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1756F, 0.9812F, 1.476F));

            PartDefinition cube_r2 = neck_lean_arched_average_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(472, 584).addBox(-4.08F, -10.0F, -0.92F, 4.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 3.9457F, 3.8325F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_average_1_middle_individual = neck_lean_arched_average_1_individual.addOrReplaceChild("neck_lean_arched_average_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.2724F, -0.8079F, -1.2457F));

            PartDefinition cube_r3 = neck_lean_arched_average_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(484, 584).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1077F, 6.1456F, 0.2651F, 0.2618F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_lean_arched_average_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(473, 571).addBox(-4.0F, -10.0F, -1.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9707F, 3.5644F, 3.1501F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_average_1_lower_individual = neck_lean_arched_average_1_individual.addOrReplaceChild("neck_lean_arched_average_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.2065F, 1.1864F, -1.2176F));

            PartDefinition cube_r5 = neck_lean_arched_average_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(489, 572).addBox(-4.08F, -7.7191F, -1.7991F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 3.6074F, 0.9268F, 0.3054F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_average_1_mane = neck_lean_arched_average_1.addOrReplaceChild("neck_lean_arched_average_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -6.6145F, 0.0F));

            PartDefinition neck_lean_arched_average_1_top_mane = neck_lean_arched_average_1_mane.addOrReplaceChild("neck_lean_arched_average_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, -2.6279F, 0.1865F));

            PartDefinition neck_lean_arched_average_1_top_mane_connector = neck_lean_arched_average_1_top_mane.addOrReplaceChild("neck_lean_arched_average_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, 0.0894F, -2.5922F));

            PartDefinition neck_lean_arched_average_1_top_mane_connector_individual = neck_lean_arched_average_1_top_mane_connector.addOrReplaceChild("neck_lean_arched_average_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

            PartDefinition cube_r6 = neck_lean_arched_average_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(819, 770).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_average_1_top_mane_connector2 = neck_lean_arched_average_1_top_mane_connector.addOrReplaceChild("neck_lean_arched_average_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.4469F));

            PartDefinition neck_lean_arched_average_1_top_mane_connector2_individual = neck_lean_arched_average_1_top_mane_connector2.addOrReplaceChild("neck_lean_arched_average_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.5034F, -0.3893F));

            PartDefinition cube_r7 = neck_lean_arched_average_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(819, 777).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_average_1_top_mane_flow = neck_lean_arched_average_1_top_mane_connector2.addOrReplaceChild("neck_lean_arched_average_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, 0.2682F, -0.1745F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_lean_arched_average_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(805, 771).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

            PartDefinition neck_lean_arched_average_1_bottom_mane = neck_lean_arched_average_1_mane.addOrReplaceChild("neck_lean_arched_average_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, 2.2883F, 1.7954F));

            PartDefinition neck_lean_arched_average_1_bottom_mane_connector = neck_lean_arched_average_1_bottom_mane.addOrReplaceChild("neck_lean_arched_average_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_lean_arched_average_1_bottom_mane_connector_individual = neck_lean_arched_average_1_bottom_mane_connector.addOrReplaceChild("neck_lean_arched_average_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -1.3083F, -0.9874F));

            PartDefinition cube_r9 = neck_lean_arched_average_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(828, 769).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3667F, -2.3092F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_average_1_bottom_mane_connector2 = neck_lean_arched_average_1_bottom_mane_connector.addOrReplaceChild("neck_lean_arched_average_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -2.4134F, -0.8045F));

            PartDefinition neck_lean_arched_average_1_bottom_mane_connector2_individual = neck_lean_arched_average_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_arched_average_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.7127F, 0.2091F));

            PartDefinition cube_r10 = neck_lean_arched_average_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(828, 780).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0702F, -2.7119F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_average_1_bottom_mane_flow = neck_lean_arched_average_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_arched_average_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.1788F, 0.0F));

            PartDefinition cube_r11 = neck_lean_arched_average_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(808, 774).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, 1.4302F, 1.2514F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("lean") && length.equals("average") && variation == 2) {
            PartDefinition neck_lean_arched_average_2 = partdefinition.addOrReplaceChild("neck_lean_arched_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_lean_arched_average_2_individual = neck_lean_arched_average_2.addOrReplaceChild("neck_lean_arched_average_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2927F, -2.0022F, -0.8399F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_average_2_crest = neck_lean_arched_average_2_individual.addOrReplaceChild("neck_lean_arched_average_2_crest", CubeListBuilder.create(), PartPose.offset(-0.2927F, -3.7184F, -0.6796F));

            PartDefinition neck_lean_arched_average_2_crest_upper = neck_lean_arched_average_2_crest.addOrReplaceChild("neck_lean_arched_average_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.2279F, -1.8773F, -1.6466F));

            PartDefinition cube_r1 = neck_lean_arched_average_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(556, 584).addBox(-3.1434F, -5.8622F, -2.7188F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1434F, 0.0857F, 1.8063F, 1.5708F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_average_2_crest_lower = neck_lean_arched_average_2_crest.addOrReplaceChild("neck_lean_arched_average_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1756F, 1.1559F, 1.1145F));

            PartDefinition cube_r2 = neck_lean_arched_average_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(528, 584).addBox(-4.08F, -10.0F, -0.92F, 4.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 3.5921F, 3.479F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_average_2_middle_individual = neck_lean_arched_average_2_individual.addOrReplaceChild("neck_lean_arched_average_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.2724F, -0.3896F, -1.0042F));

            PartDefinition cube_r3 = neck_lean_arched_average_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(540, 584).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1077F, 5.7274F, 0.0236F, 0.2618F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_lean_arched_average_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(530, 570).addBox(-2.0F, -5.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0293F, -1.0965F, 0.0802F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_average_2_lower_individual = neck_lean_arched_average_2_individual.addOrReplaceChild("neck_lean_arched_average_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.2065F, 1.6633F, -1.0673F));

            PartDefinition cube_r5 = neck_lean_arched_average_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(546, 571).addBox(-4.08F, -7.7191F, -1.7991F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 3.1305F, 0.7764F, 0.3054F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_average_2_mane = neck_lean_arched_average_2.addOrReplaceChild("neck_lean_arched_average_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -6.7933F, 0.0F));

            PartDefinition neck_lean_arched_average_2_top_mane = neck_lean_arched_average_2_mane.addOrReplaceChild("neck_lean_arched_average_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, -2.3598F, -3.8358F));

            PartDefinition neck_lean_arched_average_2_top_mane_connector = neck_lean_arched_average_2_top_mane.addOrReplaceChild("neck_lean_arched_average_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -0.7151F, 0.8939F));

            PartDefinition neck_lean_arched_average_2_top_mane_connector_individual = neck_lean_arched_average_2_top_mane_connector.addOrReplaceChild("neck_lean_arched_average_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

            PartDefinition cube_r6 = neck_lean_arched_average_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(871, 770).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_average_2_top_mane_connector2 = neck_lean_arched_average_2_top_mane_connector.addOrReplaceChild("neck_lean_arched_average_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.4469F));

            PartDefinition neck_lean_arched_average_2_top_mane_connector2_individual = neck_lean_arched_average_2_top_mane_connector2.addOrReplaceChild("neck_lean_arched_average_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.5034F, -0.3893F));

            PartDefinition cube_r7 = neck_lean_arched_average_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(871, 777).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_average_2_top_mane_flow = neck_lean_arched_average_2_top_mane_connector2.addOrReplaceChild("neck_lean_arched_average_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, 0.2682F, -0.1745F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_lean_arched_average_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(857, 771).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

            PartDefinition neck_lean_arched_average_2_bottom_mane = neck_lean_arched_average_2_mane.addOrReplaceChild("neck_lean_arched_average_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, 1.752F, 1.2591F));

            PartDefinition neck_lean_arched_average_2_bottom_mane_connector = neck_lean_arched_average_2_bottom_mane.addOrReplaceChild("neck_lean_arched_average_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_lean_arched_average_2_bottom_mane_connector_individual = neck_lean_arched_average_2_bottom_mane_connector.addOrReplaceChild("neck_lean_arched_average_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.9116F, -0.6831F));

            PartDefinition cube_r9 = neck_lean_arched_average_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(880, 767).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7634F, -2.6136F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_average_2_bottom_mane_connector2 = neck_lean_arched_average_2_bottom_mane_connector.addOrReplaceChild("neck_lean_arched_average_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -2.4134F, -0.8045F));

            PartDefinition neck_lean_arched_average_2_bottom_mane_connector2_individual = neck_lean_arched_average_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_arched_average_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 1.1094F, 0.5135F));

            PartDefinition cube_r10 = neck_lean_arched_average_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(881, 779).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4669F, -3.0163F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_average_2_bottom_mane_flow = neck_lean_arched_average_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_arched_average_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.1788F, 0.0F));

            PartDefinition cube_r11 = neck_lean_arched_average_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(859, 773).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, 1.4302F, 1.2514F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("lean") && length.equals("long") && variation == 1) {
            PartDefinition neck_lean_arched_long_1 = partdefinition.addOrReplaceChild("neck_lean_arched_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_lean_arched_long_1_individual = neck_lean_arched_long_1.addOrReplaceChild("neck_lean_arched_long_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0245F, -1.5553F, -1.7338F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_long_1_crest = neck_lean_arched_long_1_individual.addOrReplaceChild("neck_lean_arched_long_1_crest", CubeListBuilder.create(), PartPose.offset(-0.0245F, -5.1486F, -0.4115F));

            PartDefinition neck_lean_arched_long_1_crest_upper = neck_lean_arched_long_1_crest.addOrReplaceChild("neck_lean_arched_long_1_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.0402F, -2.8104F, -2.4784F));

            PartDefinition cube_r1 = neck_lean_arched_long_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(586, 581).addBox(-3.1434F, -5.8622F, -2.7188F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1434F, 0.1751F, 2.5214F, 1.5708F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_long_1_crest_lower = neck_lean_arched_long_1_crest.addOrReplaceChild("neck_lean_arched_long_1_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.0926F, 1.0194F, 1.7049F));

            PartDefinition cube_r2 = neck_lean_arched_long_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(614, 571).addBox(-4.08F, -10.0F, -0.92F, 4.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 2.885F, 2.7719F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_long_1_middle_individual = neck_lean_arched_long_1_individual.addOrReplaceChild("neck_lean_arched_long_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.0042F, -2.1312F, -0.1863F));

            PartDefinition cube_r3 = neck_lean_arched_long_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(598, 585).addBox(-5.0784F, -9.0F, -0.9017F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1077F, 5.5526F, -0.0171F, 0.2618F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_lean_arched_long_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(598, 569).addBox(-4.0F, -10.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9707F, 2.6139F, 2.2422F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_long_1_lower_individual = neck_lean_arched_long_1_individual.addOrReplaceChild("neck_lean_arched_long_1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r5 = neck_lean_arched_long_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(614, 585).addBox(-4.0792F, -11.0F, -0.9108F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9538F, 5.8819F, 0.1126F, 0.3054F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_long_1_mane = neck_lean_arched_long_1.addOrReplaceChild("neck_lean_arched_long_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.2235F, 0.0F));

            PartDefinition neck_lean_arched_long_1_top_mane = neck_lean_arched_long_1_mane.addOrReplaceChild("neck_lean_arched_long_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.5308F, -2.2704F, -4.0146F));

            PartDefinition neck_lean_arched_long_1_top_mane_connector = neck_lean_arched_long_1_top_mane.addOrReplaceChild("neck_lean_arched_long_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.162F, 0.6257F));

            PartDefinition neck_lean_arched_long_1_top_mane_connector_individual = neck_lean_arched_long_1_top_mane_connector.addOrReplaceChild("neck_lean_arched_long_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

            PartDefinition cube_r6 = neck_lean_arched_long_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(930, 768).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_long_1_top_mane_connector2 = neck_lean_arched_long_1_top_mane_connector.addOrReplaceChild("neck_lean_arched_long_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

            PartDefinition neck_lean_arched_long_1_top_mane_connector2_individual = neck_lean_arched_long_1_top_mane_connector2.addOrReplaceChild("neck_lean_arched_long_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.5034F, -0.7469F));

            PartDefinition cube_r7 = neck_lean_arched_long_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(930, 777).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_long_1_top_mane_flow = neck_lean_arched_long_1_top_mane_connector2.addOrReplaceChild("neck_lean_arched_long_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, -0.0894F, -0.1745F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_lean_arched_long_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(916, 771).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

            PartDefinition neck_lean_arched_long_1_bottom_mane = neck_lean_arched_long_1_mane.addOrReplaceChild("neck_lean_arched_long_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.5308F, 1.3944F, 0.8122F));

            PartDefinition neck_lean_arched_long_1_bottom_mane_connector = neck_lean_arched_long_1_bottom_mane.addOrReplaceChild("neck_lean_arched_long_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_lean_arched_long_1_bottom_mane_connector_individual = neck_lean_arched_long_1_bottom_mane_connector.addOrReplaceChild("neck_lean_arched_long_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.1182F, -0.0743F));

            PartDefinition cube_r9 = neck_lean_arched_long_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(942, 763).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5567F, -3.2223F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_long_1_bottom_mane_connector2 = neck_lean_arched_long_1_bottom_mane_connector.addOrReplaceChild("neck_lean_arched_long_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));

            PartDefinition neck_lean_arched_long_1_bottom_mane_connector2_individual = neck_lean_arched_long_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_arched_long_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, -0.5107F, -0.4867F));

            PartDefinition cube_r10 = neck_lean_arched_long_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(942, 777).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2603F, -3.6251F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_long_1_bottom_mane_flow = neck_lean_arched_long_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_arched_long_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.3575F, 0.0F));

            PartDefinition cube_r11 = neck_lean_arched_long_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(916, 771).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("lean") && length.equals("long") && variation == 2) {
            PartDefinition neck_lean_arched_long_2 = partdefinition.addOrReplaceChild("neck_lean_arched_long_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_lean_arched_long_2_individual = neck_lean_arched_long_2.addOrReplaceChild("neck_lean_arched_long_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0245F, 0.0536F, 0.1433F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_long_2_crest = neck_lean_arched_long_2_individual.addOrReplaceChild("neck_lean_arched_long_2_crest", CubeListBuilder.create(), PartPose.offset(-0.0245F, -0.0536F, -0.1433F));

            PartDefinition neck_lean_arched_long_2_crest_upper = neck_lean_arched_long_2_crest.addOrReplaceChild("neck_lean_arched_long_2_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.0402F, -9.9154F, -5.7723F));

            PartDefinition cube_r1 = neck_lean_arched_long_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(638, 582).addBox(-3.1434F, -5.8622F, -2.7188F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1434F, 0.4432F, 2.3426F, 1.5708F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_long_2_crest_lower = neck_lean_arched_long_2_crest.addOrReplaceChild("neck_lean_arched_long_2_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.0926F, -5.4639F, -1.4142F));

            PartDefinition cube_r2 = neck_lean_arched_long_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(666, 571).addBox(-4.08F, -10.0F, -0.92F, 4.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 2.5314F, 2.4183F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_long_2_middle_individual = neck_lean_arched_long_2_individual.addOrReplaceChild("neck_lean_arched_long_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.0042F, -3.2313F, -2.8365F));

            PartDefinition cube_r3 = neck_lean_arched_long_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(650, 569).addBox(-4.0F, -10.0F, -1.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9707F, 1.9721F, 1.6879F, 0.7854F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_lean_arched_long_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(650, 586).addBox(-5.0784F, -9.0F, -0.9017F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1077F, 5.3578F, 0.0543F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_long_2_lower_individual = neck_lean_arched_long_2_individual.addOrReplaceChild("neck_lean_arched_long_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1254F, -0.9561F, -3.5567F));

            PartDefinition cube_r5 = neck_lean_arched_long_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(666, 586).addBox(-4.0792F, -11.0F, -0.9108F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, 5.0961F, 0.4647F, 0.3054F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_long_2_mane = neck_lean_arched_long_2.addOrReplaceChild("neck_lean_arched_long_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -6.6145F, 0.0F));

            PartDefinition neck_lean_arched_long_2_top_mane = neck_lean_arched_long_2_mane.addOrReplaceChild("neck_lean_arched_long_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.5308F, -4.505F, -3.7465F));

            PartDefinition neck_lean_arched_long_2_top_mane_connector = neck_lean_arched_long_2_top_mane.addOrReplaceChild("neck_lean_arched_long_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.0726F, -0.7151F));

            PartDefinition neck_lean_arched_long_2_top_mane_connector_individual = neck_lean_arched_long_2_top_mane_connector.addOrReplaceChild("neck_lean_arched_long_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

            PartDefinition cube_r6 = neck_lean_arched_long_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(976, 770).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_long_2_top_mane_connector2 = neck_lean_arched_long_2_top_mane_connector.addOrReplaceChild("neck_lean_arched_long_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

            PartDefinition neck_lean_arched_long_2_top_mane_connector2_individual = neck_lean_arched_long_2_top_mane_connector2.addOrReplaceChild("neck_lean_arched_long_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.5034F, -0.7469F));

            PartDefinition cube_r7 = neck_lean_arched_long_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(976, 777).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_long_2_top_mane_flow = neck_lean_arched_long_2_top_mane_connector2.addOrReplaceChild("neck_lean_arched_long_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, -0.0894F, -0.1745F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_lean_arched_long_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(993, 763).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

            PartDefinition neck_lean_arched_long_2_bottom_mane = neck_lean_arched_long_2_mane.addOrReplaceChild("neck_lean_arched_long_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.5308F, -0.7508F, -0.2604F));

            PartDefinition neck_lean_arched_long_2_bottom_mane_connector = neck_lean_arched_long_2_bottom_mane.addOrReplaceChild("neck_lean_arched_long_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_lean_arched_long_2_bottom_mane_connector_individual = neck_lean_arched_long_2_bottom_mane_connector.addOrReplaceChild("neck_lean_arched_long_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.2784F, 0.2301F));

            PartDefinition cube_r9 = neck_lean_arched_long_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(992, 762).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9534F, -3.5267F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_long_2_bottom_mane_connector2 = neck_lean_arched_long_2_bottom_mane_connector.addOrReplaceChild("neck_lean_arched_long_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.3575F, 0.0F, 0.8045F));

            PartDefinition neck_lean_arched_long_2_bottom_mane_connector2_individual = neck_lean_arched_long_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_arched_long_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.9665F, -0.114F, -0.1823F));

            PartDefinition cube_r10 = neck_lean_arched_long_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(992, 777).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6569F, -3.9295F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_arched_long_2_bottom_mane_flow = neck_lean_arched_long_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_arched_long_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.6089F, -0.3575F, 0.0F));

            PartDefinition cube_r11 = neck_lean_arched_long_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(977, 770).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("average") && length.equals("short") && variation == 1) {
            PartDefinition neck_average_arched_short_1 = partdefinition.addOrReplaceChild("neck_average_arched_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_average_arched_short_1_individual = neck_average_arched_short_1.addOrReplaceChild("neck_average_arched_short_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2927F, 2.6458F, -0.5718F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_short_1_crest = neck_average_arched_short_1_individual.addOrReplaceChild("neck_average_arched_short_1_crest", CubeListBuilder.create(), PartPose.offset(-0.2927F, -6.4894F, -1.931F));

            PartDefinition neck_average_arched_short_1_crest_upper = neck_average_arched_short_1_crest.addOrReplaceChild("neck_average_arched_short_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.2279F, -1.8272F, -0.8695F));

            PartDefinition cube_r1 = neck_average_arched_short_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(393, 618).addBox(-3.1434F, -5.8622F, -2.7188F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1434F, 0.5326F, 2.432F, 1.5708F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_short_1_crest_lower = neck_average_arched_short_1_crest.addOrReplaceChild("neck_average_arched_short_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1756F, 0.5924F, 1.4567F));

            PartDefinition cube_r2 = neck_average_arched_short_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(365, 618).addBox(-4.08F, -10.0F, -0.92F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 4.6528F, 4.5396F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_short_1_middle_individual = neck_average_arched_short_1_individual.addOrReplaceChild("neck_average_arched_short_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.2095F, -3.9183F, -1.5772F));

            PartDefinition cube_r3 = neck_average_arched_short_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(365, 607).addBox(-5.0F, -10.0F, -1.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5336F, 4.401F, 3.6331F, 0.7854F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_average_arched_short_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(377, 618).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0449F, 6.9822F, 0.7481F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_short_1_lower_individual = neck_average_arched_short_1_individual.addOrReplaceChild("neck_average_arched_short_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1702F, -2.0903F, -1.5243F));

            PartDefinition cube_r5 = neck_average_arched_short_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(383, 608).addBox(-5.08F, -11.0F, -0.92F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 8.0069F, 1.0274F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_short_1_mane = neck_average_arched_short_1.addOrReplaceChild("neck_average_arched_short_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -4.7374F, -1.0726F));

            PartDefinition neck_average_arched_short_1_top_mane = neck_average_arched_short_1_mane.addOrReplaceChild("neck_average_arched_short_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, -1.6447F, -2.4951F));

            PartDefinition neck_average_arched_short_1_top_mane_connector = neck_average_arched_short_1_top_mane.addOrReplaceChild("neck_average_arched_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.0726F, 1.3408F));

            PartDefinition neck_average_arched_short_1_top_mane_connector_individual = neck_average_arched_short_1_top_mane_connector.addOrReplaceChild("neck_average_arched_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

            PartDefinition cube_r6 = neck_average_arched_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(723, 769).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_short_1_top_mane_connector2 = neck_average_arched_short_1_top_mane_connector.addOrReplaceChild("neck_average_arched_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.4469F));

            PartDefinition neck_average_arched_short_1_top_mane_connector2_individual = neck_average_arched_short_1_top_mane_connector2.addOrReplaceChild("neck_average_arched_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.5034F, -0.3893F));

            PartDefinition cube_r7 = neck_average_arched_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(723, 776).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_short_1_top_mane_flow = neck_average_arched_short_1_top_mane_connector2.addOrReplaceChild("neck_average_arched_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, 0.2682F, -0.1745F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_average_arched_short_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(709, 770).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

            PartDefinition neck_average_arched_short_1_bottom_mane = neck_average_arched_short_1_mane.addOrReplaceChild("neck_average_arched_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, 2.1095F, 3.0468F));

            PartDefinition neck_average_arched_short_1_bottom_mane_connector = neck_average_arched_short_1_bottom_mane.addOrReplaceChild("neck_average_arched_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_average_arched_short_1_bottom_mane_connector_individual = neck_average_arched_short_1_bottom_mane_connector.addOrReplaceChild("neck_average_arched_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -2.1016F, -1.5962F));

            PartDefinition cube_r9 = neck_average_arched_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(732, 772).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5733F, -1.7004F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_short_1_bottom_mane_connector2 = neck_average_arched_short_1_bottom_mane_connector.addOrReplaceChild("neck_average_arched_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -2.4134F, -0.8045F));

            PartDefinition neck_average_arched_short_1_bottom_mane_connector2_individual = neck_average_arched_short_1_bottom_mane_connector2.addOrReplaceChild("neck_average_arched_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, -0.0807F, -0.3996F));

            PartDefinition cube_r10 = neck_average_arched_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(730, 781).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2769F, -2.1032F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_short_1_bottom_mane_flow = neck_average_arched_short_1_bottom_mane_connector2.addOrReplaceChild("neck_average_arched_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.1788F, 0.0F));

            PartDefinition cube_r11 = neck_average_arched_short_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(714, 775).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, 1.4302F, 1.2514F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("average") && length.equals("short") && variation == 2) {
            PartDefinition neck_average_arched_short_2 = partdefinition.addOrReplaceChild("neck_average_arched_short_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_average_arched_short_2_individual = neck_average_arched_short_2.addOrReplaceChild("neck_average_arched_short_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2927F, -0.2145F, -0.5718F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_short_2_crest = neck_average_arched_short_2_individual.addOrReplaceChild("neck_average_arched_short_2_crest", CubeListBuilder.create(), PartPose.offset(-0.2927F, -3.8078F, -1.2159F));

            PartDefinition neck_average_arched_short_2_crest_upper = neck_average_arched_short_2_crest.addOrReplaceChild("neck_average_arched_short_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.2279F, -2.0561F, -1.8254F));

            PartDefinition cube_r1 = neck_average_arched_short_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(445, 618).addBox(-3.1434F, -5.8622F, -2.7188F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1434F, 0.3538F, 2.5214F, 1.5708F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_short_2_crest_lower = neck_average_arched_short_2_crest.addOrReplaceChild("neck_average_arched_short_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1756F, 0.5382F, 0.9437F));

            PartDefinition cube_r2 = neck_average_arched_short_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(417, 618).addBox(-4.08F, -10.0F, -0.92F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 4.2992F, 4.1861F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_short_2_middle_individual = neck_average_arched_short_2_individual.addOrReplaceChild("neck_average_arched_short_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1648F, -1.2262F, -1.4871F));

            PartDefinition cube_r3 = neck_average_arched_short_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(429, 618).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0002F, 6.5639F, 0.5066F, 0.2618F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_average_arched_short_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(417, 606).addBox(-5.0F, -10.0F, -1.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5782F, 3.9827F, 3.3916F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_short_2_lower_individual = neck_average_arched_short_2_individual.addOrReplaceChild("neck_average_arched_short_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0808F, 0.6665F, -1.5464F));

            PartDefinition cube_r5 = neck_average_arched_short_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(435, 607).addBox(-5.08F, -11.0F, -0.92F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 7.524F, 0.8979F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_short_2_mane = neck_average_arched_short_2.addOrReplaceChild("neck_average_arched_short_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_short_2_top_mane = neck_average_arched_short_2_mane.addOrReplaceChild("neck_average_arched_short_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, 0.6793F, -0.0817F));

            PartDefinition neck_average_arched_short_2_top_mane_connector = neck_average_arched_short_2_top_mane.addOrReplaceChild("neck_average_arched_short_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -8.7598F, -2.5922F));

            PartDefinition neck_average_arched_short_2_top_mane_connector_individual = neck_average_arched_short_2_top_mane_connector.addOrReplaceChild("neck_average_arched_short_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

            PartDefinition cube_r6 = neck_average_arched_short_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(767, 770).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_short_2_top_mane_connector2 = neck_average_arched_short_2_top_mane_connector.addOrReplaceChild("neck_average_arched_short_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.4469F));

            PartDefinition neck_average_arched_short_2_top_mane_connector2_individual = neck_average_arched_short_2_top_mane_connector2.addOrReplaceChild("neck_average_arched_short_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.5034F, -0.3893F));

            PartDefinition cube_r7 = neck_average_arched_short_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(767, 777).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_short_2_top_mane_flow = neck_average_arched_short_2_top_mane_connector2.addOrReplaceChild("neck_average_arched_short_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, 0.2682F, -0.1745F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_average_arched_short_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(753, 771).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

            PartDefinition neck_average_arched_short_2_bottom_mane = neck_average_arched_short_2_mane.addOrReplaceChild("neck_average_arched_short_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, -3.2536F, 1.5273F));

            PartDefinition neck_average_arched_short_2_bottom_mane_connector = neck_average_arched_short_2_bottom_mane.addOrReplaceChild("neck_average_arched_short_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_average_arched_short_2_bottom_mane_connector_individual = neck_average_arched_short_2_bottom_mane_connector.addOrReplaceChild("neck_average_arched_short_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -1.7049F, -1.2918F));

            PartDefinition cube_r9 = neck_average_arched_short_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(776, 771).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.97F, -2.0048F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_short_2_bottom_mane_connector2 = neck_average_arched_short_2_bottom_mane_connector.addOrReplaceChild("neck_average_arched_short_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -2.4134F, -0.8045F));

            PartDefinition neck_average_arched_short_2_bottom_mane_connector2_individual = neck_average_arched_short_2_bottom_mane_connector2.addOrReplaceChild("neck_average_arched_short_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.316F, -0.0952F));

            PartDefinition cube_r10 = neck_average_arched_short_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(775, 781).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6736F, -2.4076F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_short_2_bottom_mane_flow = neck_average_arched_short_2_bottom_mane_connector2.addOrReplaceChild("neck_average_arched_short_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.1788F, 0.0F));

            PartDefinition cube_r11 = neck_average_arched_short_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(757, 775).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, 1.4302F, 1.2514F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("average") && length.equals("average") && variation == 1) {
            PartDefinition neck_average_arched_average_1 = partdefinition.addOrReplaceChild("neck_average_arched_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_average_arched_average_1_individual = neck_average_arched_average_1.addOrReplaceChild("neck_average_arched_average_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2927F, -1.2872F, -0.3036F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_average_1_crest = neck_average_arched_average_1_individual.addOrReplaceChild("neck_average_arched_average_1_crest", CubeListBuilder.create(), PartPose.offset(-0.2927F, -4.4335F, -1.3053F));

            PartDefinition neck_average_arched_average_1_crest_upper = neck_average_arched_average_1_crest.addOrReplaceChild("neck_average_arched_average_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.2279F, -1.4304F, -1.5572F));

            PartDefinition cube_r1 = neck_average_arched_average_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(500, 619).addBox(-3.1434F, -5.8622F, -2.7188F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1434F, 0.3538F, 2.3426F, 1.5708F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_average_1_crest_lower = neck_average_arched_average_1_crest.addOrReplaceChild("neck_average_arched_average_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1756F, 1.5175F, 1.3866F));

            PartDefinition cube_r2 = neck_average_arched_average_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(472, 619).addBox(-4.08F, -10.0F, -0.92F, 4.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 3.9457F, 3.8325F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_average_1_middle_individual = neck_average_arched_average_1_individual.addOrReplaceChild("neck_average_arched_average_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1648F, -0.8079F, -1.2457F));

            PartDefinition cube_r3 = neck_average_arched_average_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(484, 619).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0002F, 6.1456F, 0.2651F, 0.2618F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_average_arched_average_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(472, 606).addBox(-5.0F, -10.0F, -1.0F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5782F, 3.5644F, 3.1501F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_average_1_lower_individual = neck_average_arched_average_1_individual.addOrReplaceChild("neck_average_arched_average_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0808F, 1.1864F, -1.2176F));

            PartDefinition cube_r5 = neck_average_arched_average_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(490, 607).addBox(-5.08F, -7.7191F, -1.7991F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 3.6074F, 0.9268F, 0.3054F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_average_1_mane = neck_average_arched_average_1.addOrReplaceChild("neck_average_arched_average_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -6.3464F, -1.0726F));

            PartDefinition neck_average_arched_average_1_top_mane = neck_average_arched_average_1_mane.addOrReplaceChild("neck_average_arched_average_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, -1.8235F, -1.78F));

            PartDefinition neck_average_arched_average_1_top_mane_connector = neck_average_arched_average_1_top_mane.addOrReplaceChild("neck_average_arched_average_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -0.9832F, 0.4469F));

            PartDefinition neck_average_arched_average_1_top_mane_connector_individual = neck_average_arched_average_1_top_mane_connector.addOrReplaceChild("neck_average_arched_average_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

            PartDefinition cube_r6 = neck_average_arched_average_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(819, 770).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_average_1_top_mane_connector2 = neck_average_arched_average_1_top_mane_connector.addOrReplaceChild("neck_average_arched_average_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.4469F));

            PartDefinition neck_average_arched_average_1_top_mane_connector2_individual = neck_average_arched_average_1_top_mane_connector2.addOrReplaceChild("neck_average_arched_average_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.5034F, -0.3893F));

            PartDefinition cube_r7 = neck_average_arched_average_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(819, 777).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_average_1_top_mane_flow = neck_average_arched_average_1_top_mane_connector2.addOrReplaceChild("neck_average_arched_average_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, 0.2682F, -0.1745F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_average_arched_average_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(805, 771).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

            PartDefinition neck_average_arched_average_1_bottom_mane = neck_average_arched_average_1_mane.addOrReplaceChild("neck_average_arched_average_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, 2.0201F, 2.8681F));

            PartDefinition neck_average_arched_average_1_bottom_mane_connector = neck_average_arched_average_1_bottom_mane.addOrReplaceChild("neck_average_arched_average_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_average_arched_average_1_bottom_mane_connector_individual = neck_average_arched_average_1_bottom_mane_connector.addOrReplaceChild("neck_average_arched_average_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -1.3083F, -0.9874F));

            PartDefinition cube_r9 = neck_average_arched_average_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(828, 769).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3667F, -2.3092F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_average_1_bottom_mane_connector2 = neck_average_arched_average_1_bottom_mane_connector.addOrReplaceChild("neck_average_arched_average_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -2.4134F, -0.8045F));

            PartDefinition neck_average_arched_average_1_bottom_mane_connector2_individual = neck_average_arched_average_1_bottom_mane_connector2.addOrReplaceChild("neck_average_arched_average_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.7127F, 0.2091F));

            PartDefinition cube_r10 = neck_average_arched_average_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(828, 780).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0702F, -2.7119F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_average_1_bottom_mane_flow = neck_average_arched_average_1_bottom_mane_connector2.addOrReplaceChild("neck_average_arched_average_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.1788F, 0.0F));

            PartDefinition cube_r11 = neck_average_arched_average_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(808, 774).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, 1.4302F, 1.2514F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("average") && length.equals("average") && variation == 2) {
            PartDefinition neck_average_arched_average_2 = partdefinition.addOrReplaceChild("neck_average_arched_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_average_arched_average_2_individual = neck_average_arched_average_2.addOrReplaceChild("neck_average_arched_average_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2927F, -2.0022F, -0.8399F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_average_2_crest = neck_average_arched_average_2_individual.addOrReplaceChild("neck_average_arched_average_2_crest", CubeListBuilder.create(), PartPose.offset(-0.2927F, -3.8972F, -0.9478F));

            PartDefinition neck_average_arched_average_2_crest_upper = neck_average_arched_average_2_crest.addOrReplaceChild("neck_average_arched_average_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.2279F, -1.9667F, -2.0935F));

            PartDefinition cube_r1 = neck_average_arched_average_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(556, 619).addBox(-3.1434F, -5.8622F, -2.7188F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1434F, 0.3538F, 2.432F, 1.5708F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_average_2_crest_lower = neck_average_arched_average_2_crest.addOrReplaceChild("neck_average_arched_average_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1756F, 1.3347F, 1.3826F));

            PartDefinition cube_r2 = neck_average_arched_average_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(528, 619).addBox(-4.08F, -10.0F, -0.92F, 4.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 3.5921F, 3.479F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_average_2_middle_individual = neck_average_arched_average_2_individual.addOrReplaceChild("neck_average_arched_average_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1648F, -0.3896F, -1.0042F));

            PartDefinition cube_r3 = neck_average_arched_average_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(540, 619).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0002F, 5.7274F, 0.0236F, 0.2618F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_average_arched_average_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(529, 605).addBox(-5.0F, -10.0F, -1.0F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5782F, 3.1462F, 2.9086F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_average_2_lower_individual = neck_average_arched_average_2_individual.addOrReplaceChild("neck_average_arched_average_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0808F, 1.6633F, -1.0673F));

            PartDefinition cube_r5 = neck_average_arched_average_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(547, 606).addBox(-5.08F, -7.7191F, -1.7991F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 3.1305F, 0.7764F, 0.3054F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_average_2_mane = neck_average_arched_average_2.addOrReplaceChild("neck_average_arched_average_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0615F, -1.2514F));

            PartDefinition neck_average_arched_average_2_top_mane = neck_average_arched_average_2_mane.addOrReplaceChild("neck_average_arched_average_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, -1.1978F, -1.0649F));

            PartDefinition neck_average_arched_average_2_top_mane_connector = neck_average_arched_average_2_top_mane.addOrReplaceChild("neck_average_arched_average_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.6089F, -0.6257F));

            PartDefinition neck_average_arched_average_2_top_mane_connector_individual = neck_average_arched_average_2_top_mane_connector.addOrReplaceChild("neck_average_arched_average_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

            PartDefinition cube_r6 = neck_average_arched_average_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(871, 770).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_average_2_top_mane_connector2 = neck_average_arched_average_2_top_mane_connector.addOrReplaceChild("neck_average_arched_average_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.4469F));

            PartDefinition neck_average_arched_average_2_top_mane_connector2_individual = neck_average_arched_average_2_top_mane_connector2.addOrReplaceChild("neck_average_arched_average_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.5034F, -0.3893F));

            PartDefinition cube_r7 = neck_average_arched_average_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(871, 777).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_average_2_top_mane_flow = neck_average_arched_average_2_top_mane_connector2.addOrReplaceChild("neck_average_arched_average_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, 0.2682F, -0.1745F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_average_arched_average_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(857, 771).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

            PartDefinition neck_average_arched_average_2_bottom_mane = neck_average_arched_average_2_mane.addOrReplaceChild("neck_average_arched_average_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, 2.0201F, 2.5105F));

            PartDefinition neck_average_arched_average_2_bottom_mane_connector = neck_average_arched_average_2_bottom_mane.addOrReplaceChild("neck_average_arched_average_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_average_arched_average_2_bottom_mane_connector_individual = neck_average_arched_average_2_bottom_mane_connector.addOrReplaceChild("neck_average_arched_average_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.9116F, -0.6831F));

            PartDefinition cube_r9 = neck_average_arched_average_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(880, 767).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7634F, -2.6136F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_average_2_bottom_mane_connector2 = neck_average_arched_average_2_bottom_mane_connector.addOrReplaceChild("neck_average_arched_average_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -2.4134F, -0.8045F));

            PartDefinition neck_average_arched_average_2_bottom_mane_connector2_individual = neck_average_arched_average_2_bottom_mane_connector2.addOrReplaceChild("neck_average_arched_average_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 1.1094F, 0.5135F));

            PartDefinition cube_r10 = neck_average_arched_average_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(881, 779).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4669F, -3.0163F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_average_2_bottom_mane_flow = neck_average_arched_average_2_bottom_mane_connector2.addOrReplaceChild("neck_average_arched_average_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.1788F, 0.0F));

            PartDefinition cube_r11 = neck_average_arched_average_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(859, 773).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, 1.4302F, 1.2514F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("average") && length.equals("long") && variation == 1) {
            PartDefinition neck_average_arched_long_1 = partdefinition.addOrReplaceChild("neck_average_arched_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_average_arched_long_1_individual = neck_average_arched_long_1.addOrReplaceChild("neck_average_arched_long_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0245F, -1.5553F, -1.7338F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_long_1_crest = neck_average_arched_long_1_individual.addOrReplaceChild("neck_average_arched_long_1_crest", CubeListBuilder.create(), PartPose.offset(-0.0245F, -5.7743F, -0.9478F));

            PartDefinition neck_average_arched_long_1_crest_upper = neck_average_arched_long_1_crest.addOrReplaceChild("neck_average_arched_long_1_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.0402F, -2.0059F, -2.0315F));

            PartDefinition cube_r1 = neck_average_arched_long_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(585, 619).addBox(-3.1434F, -5.8622F, -2.7188F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1434F, -0.0037F, 2.5214F, 1.5708F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_long_1_crest_lower = neck_average_arched_long_1_crest.addOrReplaceChild("neck_average_arched_long_1_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.0926F, 1.6451F, 2.2412F));

            PartDefinition cube_r2 = neck_average_arched_long_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(615, 609).addBox(-4.08F, -10.0F, -0.92F, 4.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 2.885F, 2.7719F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_long_1_middle_individual = neck_average_arched_long_1_individual.addOrReplaceChild("neck_average_arched_long_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.0308F, -2.1312F, -0.1863F));

            PartDefinition cube_r3 = neck_average_arched_long_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(597, 607).addBox(-5.0F, -10.0F, -1.0F, 5.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4442F, 2.6139F, 2.2422F, 0.7854F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_average_arched_long_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(598, 623).addBox(-5.0784F, -9.0F, -0.9017F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1342F, 5.5526F, -0.0171F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_long_1_lower_individual = neck_average_arched_long_1_individual.addOrReplaceChild("neck_average_arched_long_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0891F, 0.309F, -0.5025F));

            PartDefinition cube_r5 = neck_average_arched_long_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(614, 623).addBox(-5.0792F, -11.0F, -0.9108F, 5.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5792F, 5.573F, 0.6151F, 0.3054F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_long_1_mane = neck_average_arched_long_1.addOrReplaceChild("neck_average_arched_long_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.4022F, -1.2514F));

            PartDefinition neck_average_arched_long_1_top_mane = neck_average_arched_long_1_mane.addOrReplaceChild("neck_average_arched_long_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.5308F, -2.3598F, -2.8526F));

            PartDefinition neck_average_arched_long_1_top_mane_connector = neck_average_arched_long_1_top_mane.addOrReplaceChild("neck_average_arched_long_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -0.8939F, 0.7151F));

            PartDefinition neck_average_arched_long_1_top_mane_connector_individual = neck_average_arched_long_1_top_mane_connector.addOrReplaceChild("neck_average_arched_long_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

            PartDefinition cube_r6 = neck_average_arched_long_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(930, 768).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_long_1_top_mane_connector2 = neck_average_arched_long_1_top_mane_connector.addOrReplaceChild("neck_average_arched_long_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

            PartDefinition neck_average_arched_long_1_top_mane_connector2_individual = neck_average_arched_long_1_top_mane_connector2.addOrReplaceChild("neck_average_arched_long_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.5034F, -0.7469F));

            PartDefinition cube_r7 = neck_average_arched_long_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(930, 777).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_long_1_top_mane_flow = neck_average_arched_long_1_top_mane_connector2.addOrReplaceChild("neck_average_arched_long_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, -0.0894F, -0.1745F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_average_arched_long_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(916, 771).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

            PartDefinition neck_average_arched_long_1_bottom_mane = neck_average_arched_long_1_mane.addOrReplaceChild("neck_average_arched_long_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.5308F, 1.5732F, 2.0636F));

            PartDefinition neck_average_arched_long_1_bottom_mane_connector = neck_average_arched_long_1_bottom_mane.addOrReplaceChild("neck_average_arched_long_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_average_arched_long_1_bottom_mane_connector_individual = neck_average_arched_long_1_bottom_mane_connector.addOrReplaceChild("neck_average_arched_long_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.1182F, -0.0743F));

            PartDefinition cube_r9 = neck_average_arched_long_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(942, 763).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5567F, -3.2223F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_long_1_bottom_mane_connector2 = neck_average_arched_long_1_bottom_mane_connector.addOrReplaceChild("neck_average_arched_long_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));

            PartDefinition neck_average_arched_long_1_bottom_mane_connector2_individual = neck_average_arched_long_1_bottom_mane_connector2.addOrReplaceChild("neck_average_arched_long_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, -0.5107F, -0.4867F));

            PartDefinition cube_r10 = neck_average_arched_long_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(942, 777).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2603F, -3.6251F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_long_1_bottom_mane_flow = neck_average_arched_long_1_bottom_mane_connector2.addOrReplaceChild("neck_average_arched_long_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.3575F, 0.0F));

            PartDefinition cube_r11 = neck_average_arched_long_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(916, 771).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("average") && length.equals("long") && variation == 2) {
            PartDefinition neck_average_arched_long_2 = partdefinition.addOrReplaceChild("neck_average_arched_long_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_average_arched_long_2_individual = neck_average_arched_long_2.addOrReplaceChild("neck_average_arched_long_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0245F, 0.0536F, 0.1433F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_long_2_crest = neck_average_arched_long_2_individual.addOrReplaceChild("neck_average_arched_long_2_crest", CubeListBuilder.create(), PartPose.offset(-0.0245F, -8.1877F, -4.3444F));

            PartDefinition neck_average_arched_long_2_crest_upper = neck_average_arched_long_2_crest.addOrReplaceChild("neck_average_arched_long_2_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.0402F, -1.6026F, -1.7499F));

            PartDefinition cube_r1 = neck_average_arched_long_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(636, 620).addBox(-3.1434F, -5.8622F, -2.7188F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1434F, 0.2644F, 2.5214F, 1.5708F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_long_2_crest_lower = neck_average_arched_long_2_crest.addOrReplaceChild("neck_average_arched_long_2_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.0926F, 2.6701F, 2.7869F));

            PartDefinition cube_r2 = neck_average_arched_long_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(666, 609).addBox(-4.08F, -10.0F, -0.92F, 4.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 2.5314F, 2.4183F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_long_2_middle_individual = neck_average_arched_long_2_individual.addOrReplaceChild("neck_average_arched_long_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.0308F, -3.2313F, -2.8365F));

            PartDefinition cube_r3 = neck_average_arched_long_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(648, 607).addBox(-5.0F, -10.0F, -1.0F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4442F, 1.9721F, 1.6879F, 0.7854F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_average_arched_long_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(649, 624).addBox(-5.0784F, -9.0F, -0.9017F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1342F, 5.3578F, 0.0543F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_long_2_lower_individual = neck_average_arched_long_2_individual.addOrReplaceChild("neck_average_arched_long_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0891F, -0.9561F, -3.5567F));

            PartDefinition cube_r5 = neck_average_arched_long_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(665, 624).addBox(-5.0792F, -11.0F, -0.9108F, 5.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5792F, 5.0961F, 0.4647F, 0.3054F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_long_2_mane = neck_average_arched_long_2.addOrReplaceChild("neck_average_arched_long_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.3296F, -0.8045F));

            PartDefinition neck_average_arched_long_2_top_mane = neck_average_arched_long_2_mane.addOrReplaceChild("neck_average_arched_long_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.5308F, -3.5218F, -3.4783F));

            PartDefinition neck_average_arched_long_2_top_mane_connector = neck_average_arched_long_2_top_mane.addOrReplaceChild("neck_average_arched_long_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.3408F, -0.1788F));

            PartDefinition neck_average_arched_long_2_top_mane_connector_individual = neck_average_arched_long_2_top_mane_connector.addOrReplaceChild("neck_average_arched_long_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

            PartDefinition cube_r6 = neck_average_arched_long_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(976, 770).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_long_2_top_mane_connector2 = neck_average_arched_long_2_top_mane_connector.addOrReplaceChild("neck_average_arched_long_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

            PartDefinition neck_average_arched_long_2_top_mane_connector2_individual = neck_average_arched_long_2_top_mane_connector2.addOrReplaceChild("neck_average_arched_long_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.5034F, -0.7469F));

            PartDefinition cube_r7 = neck_average_arched_long_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(976, 777).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_long_2_top_mane_flow = neck_average_arched_long_2_top_mane_connector2.addOrReplaceChild("neck_average_arched_long_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, -0.0894F, -0.1745F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_average_arched_long_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(993, 763).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

            PartDefinition neck_average_arched_long_2_bottom_mane = neck_average_arched_long_2_mane.addOrReplaceChild("neck_average_arched_long_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.5308F, -0.0358F, 0.544F));

            PartDefinition neck_average_arched_long_2_bottom_mane_connector = neck_average_arched_long_2_bottom_mane.addOrReplaceChild("neck_average_arched_long_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_average_arched_long_2_bottom_mane_connector_individual = neck_average_arched_long_2_bottom_mane_connector.addOrReplaceChild("neck_average_arched_long_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.2784F, 0.2301F));

            PartDefinition cube_r9 = neck_average_arched_long_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(992, 762).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9534F, -3.5267F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_long_2_bottom_mane_connector2 = neck_average_arched_long_2_bottom_mane_connector.addOrReplaceChild("neck_average_arched_long_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.3575F, 0.0F, 0.8045F));

            PartDefinition neck_average_arched_long_2_bottom_mane_connector2_individual = neck_average_arched_long_2_bottom_mane_connector2.addOrReplaceChild("neck_average_arched_long_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.9665F, -0.114F, -0.1823F));

            PartDefinition cube_r10 = neck_average_arched_long_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(992, 777).addBox(-1.0F, -0.5F, -6.5F, 2.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_arched_long_2_bottom_mane_flow = neck_average_arched_long_2_bottom_mane_connector2.addOrReplaceChild("neck_average_arched_long_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.6089F, -0.3575F, 0.0F));

            PartDefinition cube_r11 = neck_average_arched_long_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(977, 770).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("muscular") && length.equals("short") && variation == 1) {
            PartDefinition neck_muscular_arched_short_1 = partdefinition.addOrReplaceChild("neck_muscular_arched_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_muscular_arched_short_1_individual = neck_muscular_arched_short_1.addOrReplaceChild("neck_muscular_arched_short_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2927F, 2.6458F, -0.5718F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_short_1_crest = neck_muscular_arched_short_1_individual.addOrReplaceChild("neck_muscular_arched_short_1_crest", CubeListBuilder.create(), PartPose.offset(-0.2927F, -6.3106F, -2.0204F));

            PartDefinition neck_muscular_arched_short_1_crest_upper = neck_muscular_arched_short_1_crest.addOrReplaceChild("neck_muscular_arched_short_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.2642F, -1.559F, -0.9589F));

            PartDefinition cube_r1 = neck_muscular_arched_short_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(393, 655).addBox(-4.1434F, -5.8622F, -2.7188F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6434F, 0.0857F, 2.6108F, 1.5708F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_short_1_crest_lower = neck_muscular_arched_short_1_crest.addOrReplaceChild("neck_muscular_arched_short_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2119F, 0.4136F, 1.546F));

            PartDefinition cube_r2 = neck_muscular_arched_short_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(363, 655).addBox(-5.08F, -10.0F, -0.92F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 4.6528F, 4.5396F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_short_1_middle_individual = neck_muscular_arched_short_1_individual.addOrReplaceChild("neck_muscular_arched_short_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1467F, -3.9183F, -1.5772F));

            PartDefinition cube_r3 = neck_muscular_arched_short_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(377, 655).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.982F, 6.9822F, 0.7481F, 0.2618F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_muscular_arched_short_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(363, 644).addBox(-6.0F, -10.0F, -1.0F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0964F, 4.401F, 3.6331F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_short_1_lower_individual = neck_muscular_arched_short_1_individual.addOrReplaceChild("neck_muscular_arched_short_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0445F, -2.0903F, -1.5243F));

            PartDefinition cube_r5 = neck_muscular_arched_short_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(383, 645).addBox(-6.08F, -11.0F, -0.92F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.08F, 8.0069F, 1.0274F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_short_1_mane = neck_muscular_arched_short_1.addOrReplaceChild("neck_muscular_arched_short_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -5.2737F, 0.0F));

            PartDefinition neck_muscular_arched_short_1_top_mane = neck_muscular_arched_short_1_mane.addOrReplaceChild("neck_muscular_arched_short_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, -0.3933F, -1.3331F));

            PartDefinition neck_muscular_arched_short_1_top_mane_connector = neck_muscular_arched_short_1_top_mane.addOrReplaceChild("neck_muscular_arched_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.7877F, -0.8939F));

            PartDefinition neck_muscular_arched_short_1_top_mane_connector_individual = neck_muscular_arched_short_1_top_mane_connector.addOrReplaceChild("neck_muscular_arched_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

            PartDefinition cube_r6 = neck_muscular_arched_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(723, 808).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_short_1_top_mane_connector2 = neck_muscular_arched_short_1_top_mane_connector.addOrReplaceChild("neck_muscular_arched_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.4469F));

            PartDefinition neck_muscular_arched_short_1_top_mane_connector2_individual = neck_muscular_arched_short_1_top_mane_connector2.addOrReplaceChild("neck_muscular_arched_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.5034F, -0.3893F));

            PartDefinition cube_r7 = neck_muscular_arched_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(723, 815).addBox(-2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_short_1_top_mane_flow = neck_muscular_arched_short_1_top_mane_connector2.addOrReplaceChild("neck_muscular_arched_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7709F, 0.0F, 0.2682F, -0.1745F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_muscular_arched_short_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(709, 809).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

            PartDefinition neck_muscular_arched_short_1_bottom_mane = neck_muscular_arched_short_1_mane.addOrReplaceChild("neck_muscular_arched_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, 2.6458F, 1.9742F));

            PartDefinition neck_muscular_arched_short_1_bottom_mane_connector = neck_muscular_arched_short_1_bottom_mane.addOrReplaceChild("neck_muscular_arched_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_muscular_arched_short_1_bottom_mane_connector_individual = neck_muscular_arched_short_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_arched_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -2.1016F, -1.5962F));

            PartDefinition cube_r9 = neck_muscular_arched_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(734, 811).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5733F, -1.7004F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_short_1_bottom_mane_connector2 = neck_muscular_arched_short_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_arched_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -2.4134F, -0.8045F));

            PartDefinition neck_muscular_arched_short_1_bottom_mane_connector2_individual = neck_muscular_arched_short_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_arched_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, -0.0807F, -0.3996F));

            PartDefinition cube_r10 = neck_muscular_arched_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(732, 820).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2769F, -2.1032F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_short_1_bottom_mane_flow = neck_muscular_arched_short_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_arched_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.4134F, -0.1788F, 0.0F));

            PartDefinition cube_r11 = neck_muscular_arched_short_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(714, 814).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, 1.4302F, 1.2514F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("muscular") && length.equals("short") && variation == 2) {
            PartDefinition neck_muscular_arched_short_2 = partdefinition.addOrReplaceChild("neck_muscular_arched_short_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_muscular_arched_short_2_individual = neck_muscular_arched_short_2.addOrReplaceChild("neck_muscular_arched_short_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2927F, -0.2145F, -0.5718F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_short_2_crest = neck_muscular_arched_short_2_individual.addOrReplaceChild("neck_muscular_arched_short_2_crest", CubeListBuilder.create(), PartPose.offset(-0.2927F, -4.3441F, -1.5735F));

            PartDefinition neck_muscular_arched_short_2_crest_upper = neck_muscular_arched_short_2_crest.addOrReplaceChild("neck_muscular_arched_short_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3536F, -1.6092F, -1.2891F));

            PartDefinition cube_r1 = neck_muscular_arched_short_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(444, 657).addBox(-4.1434F, -5.8622F, -2.7188F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6434F, 0.4432F, 2.3426F, 1.5708F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_short_2_crest_lower = neck_muscular_arched_short_2_crest.addOrReplaceChild("neck_muscular_arched_short_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.3013F, 1.0745F, 1.3012F));

            PartDefinition cube_r2 = neck_muscular_arched_short_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(414, 657).addBox(-5.08F, -10.0F, -0.92F, 5.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 4.2992F, 4.1861F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_short_2_middle_individual = neck_muscular_arched_short_2_individual.addOrReplaceChild("neck_muscular_arched_short_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.102F, -1.2262F, -1.4871F));

            PartDefinition cube_r3 = neck_muscular_arched_short_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(414, 645).addBox(-6.0F, -10.0F, -1.0F, 6.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1411F, 3.9827F, 3.3916F, 0.7854F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_muscular_arched_short_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(428, 657).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9373F, 6.5639F, 0.5066F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_short_2_lower_individual = neck_muscular_arched_short_2_individual.addOrReplaceChild("neck_muscular_arched_short_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0445F, 0.6665F, -1.5464F));

            PartDefinition cube_r5 = neck_muscular_arched_short_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(434, 646).addBox(-6.08F, -11.0F, -0.92F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.08F, 7.524F, 0.8979F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_short_2_mane = neck_muscular_arched_short_2.addOrReplaceChild("neck_muscular_arched_short_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -5.5419F, -0.8939F));

            PartDefinition neck_muscular_arched_short_2_top_mane = neck_muscular_arched_short_2_mane.addOrReplaceChild("neck_muscular_arched_short_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, -1.1084F, -1.9587F));

            PartDefinition neck_muscular_arched_short_2_top_mane_connector = neck_muscular_arched_short_2_top_mane.addOrReplaceChild("neck_muscular_arched_short_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.4302F, 0.1788F));

            PartDefinition neck_muscular_arched_short_2_top_mane_connector_individual = neck_muscular_arched_short_2_top_mane_connector.addOrReplaceChild("neck_muscular_arched_short_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

            PartDefinition cube_r6 = neck_muscular_arched_short_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(768, 809).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_short_2_top_mane_connector2 = neck_muscular_arched_short_2_top_mane_connector.addOrReplaceChild("neck_muscular_arched_short_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.4469F));

            PartDefinition neck_muscular_arched_short_2_top_mane_connector2_individual = neck_muscular_arched_short_2_top_mane_connector2.addOrReplaceChild("neck_muscular_arched_short_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.5034F, -0.3893F));

            PartDefinition cube_r7 = neck_muscular_arched_short_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(768, 816).addBox(-2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_short_2_top_mane_flow = neck_muscular_arched_short_2_top_mane_connector2.addOrReplaceChild("neck_muscular_arched_short_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8603F, 0.0F, 0.2682F, -0.1745F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_muscular_arched_short_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(754, 810).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

            PartDefinition neck_muscular_arched_short_2_bottom_mane = neck_muscular_arched_short_2_mane.addOrReplaceChild("neck_muscular_arched_short_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, 2.2883F, 2.4211F));

            PartDefinition neck_muscular_arched_short_2_bottom_mane_connector = neck_muscular_arched_short_2_bottom_mane.addOrReplaceChild("neck_muscular_arched_short_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_muscular_arched_short_2_bottom_mane_connector_individual = neck_muscular_arched_short_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_arched_short_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -1.7049F, -1.2918F));

            PartDefinition cube_r9 = neck_muscular_arched_short_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(779, 810).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.97F, -2.0048F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_short_2_bottom_mane_connector2 = neck_muscular_arched_short_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_arched_short_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -2.4134F, -0.8045F));

            PartDefinition neck_muscular_arched_short_2_bottom_mane_connector2_individual = neck_muscular_arched_short_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_arched_short_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.316F, -0.0952F));

            PartDefinition cube_r10 = neck_muscular_arched_short_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(776, 820).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6736F, -2.4076F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_short_2_bottom_mane_flow = neck_muscular_arched_short_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_arched_short_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.5028F, -0.1788F, 0.0F));

            PartDefinition cube_r11 = neck_muscular_arched_short_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(758, 814).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, 1.4302F, 1.2514F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("muscular") && length.equals("average") && variation == 1) {
            PartDefinition neck_muscular_arched_average_1 = partdefinition.addOrReplaceChild("neck_muscular_arched_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_muscular_arched_average_1_individual = neck_muscular_arched_average_1.addOrReplaceChild("neck_muscular_arched_average_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2927F, -1.2872F, -0.3036F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_average_1_crest = neck_muscular_arched_average_1_individual.addOrReplaceChild("neck_muscular_arched_average_1_crest", CubeListBuilder.create(), PartPose.offset(-0.2927F, -4.076F, -1.8416F));

            PartDefinition neck_muscular_arched_average_1_crest_upper = neck_muscular_arched_average_1_crest.addOrReplaceChild("neck_muscular_arched_average_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1748F, -1.7879F, -1.1103F));

            PartDefinition cube_r1 = neck_muscular_arched_average_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(502, 658).addBox(-4.1434F, -5.8622F, -2.7188F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6434F, 0.3538F, 2.432F, 1.5708F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_average_1_crest_lower = neck_muscular_arched_average_1_crest.addOrReplaceChild("neck_muscular_arched_average_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2119F, 1.1599F, 1.9229F));

            PartDefinition cube_r2 = neck_muscular_arched_average_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(472, 658).addBox(-5.08F, -10.0F, -0.92F, 5.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 3.9457F, 3.8325F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_average_1_middle_individual = neck_muscular_arched_average_1_individual.addOrReplaceChild("neck_muscular_arched_average_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1914F, -0.8079F, -1.2457F));

            PartDefinition cube_r3 = neck_muscular_arched_average_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(472, 645).addBox(-6.0F, -10.0F, -1.0F, 6.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0517F, 3.5644F, 3.1501F, 0.7854F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_muscular_arched_average_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(486, 658).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0267F, 6.1456F, 0.2651F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_average_1_lower_individual = neck_muscular_arched_average_1_individual.addOrReplaceChild("neck_muscular_arched_average_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1339F, 1.1864F, -1.2176F));

            PartDefinition cube_r5 = neck_muscular_arched_average_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(492, 646).addBox(-6.08F, -7.7191F, -1.7991F, 6.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.08F, 3.6074F, 0.9268F, 0.3054F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_average_1_mane = neck_muscular_arched_average_1.addOrReplaceChild("neck_muscular_arched_average_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -6.3464F, 0.0F));

            PartDefinition neck_muscular_arched_average_1_top_mane = neck_muscular_arched_average_1_mane.addOrReplaceChild("neck_muscular_arched_average_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, -1.5553F, -2.3163F));

            PartDefinition neck_muscular_arched_average_1_top_mane_connector = neck_muscular_arched_average_1_top_mane.addOrReplaceChild("neck_muscular_arched_average_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.2514F, -0.0894F));

            PartDefinition neck_muscular_arched_average_1_top_mane_connector_individual = neck_muscular_arched_average_1_top_mane_connector.addOrReplaceChild("neck_muscular_arched_average_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

            PartDefinition cube_r6 = neck_muscular_arched_average_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(819, 809).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_average_1_top_mane_connector2 = neck_muscular_arched_average_1_top_mane_connector.addOrReplaceChild("neck_muscular_arched_average_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.4469F));

            PartDefinition neck_muscular_arched_average_1_top_mane_connector2_individual = neck_muscular_arched_average_1_top_mane_connector2.addOrReplaceChild("neck_muscular_arched_average_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.5034F, -0.3893F));

            PartDefinition cube_r7 = neck_muscular_arched_average_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(819, 816).addBox(-2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_average_1_top_mane_flow = neck_muscular_arched_average_1_top_mane_connector2.addOrReplaceChild("neck_muscular_arched_average_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8603F, 0.0F, 0.2682F, -0.1745F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_muscular_arched_average_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(805, 810).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

            PartDefinition neck_muscular_arched_average_1_bottom_mane = neck_muscular_arched_average_1_mane.addOrReplaceChild("neck_muscular_arched_average_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, 2.0201F, 1.7954F));

            PartDefinition neck_muscular_arched_average_1_bottom_mane_connector = neck_muscular_arched_average_1_bottom_mane.addOrReplaceChild("neck_muscular_arched_average_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_muscular_arched_average_1_bottom_mane_connector_individual = neck_muscular_arched_average_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_arched_average_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -1.3083F, -0.9874F));

            PartDefinition cube_r9 = neck_muscular_arched_average_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(830, 808).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3667F, -2.3092F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_average_1_bottom_mane_connector2 = neck_muscular_arched_average_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_arched_average_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -2.4134F, -0.8045F));

            PartDefinition neck_muscular_arched_average_1_bottom_mane_connector2_indivdiual = neck_muscular_arched_average_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_arched_average_1_bottom_mane_connector2_indivdiual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.7127F, 0.2091F));

            PartDefinition cube_r10 = neck_muscular_arched_average_1_bottom_mane_connector2_indivdiual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(828, 819).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0702F, -2.7119F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_average_1_bottom_mane_flow = neck_muscular_arched_average_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_arched_average_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.324F, -0.1788F, 0.0F));

            PartDefinition cube_r11 = neck_muscular_arched_average_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(808, 813).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, 1.4302F, 1.2514F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("muscular") && length.equals("average") && variation == 2) {
            PartDefinition neck_muscular_arched_average_2 = partdefinition.addOrReplaceChild("neck_muscular_arched_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_muscular_arched_average_2_individual = neck_muscular_arched_average_2.addOrReplaceChild("neck_muscular_arched_average_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2927F, -2.0022F, -0.8399F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_average_2_crest = neck_muscular_arched_average_2_individual.addOrReplaceChild("neck_muscular_arched_average_2_crest", CubeListBuilder.create(), PartPose.offset(-0.2927F, -3.3609F, -0.8584F));

            PartDefinition neck_muscular_arched_average_2_crest_upper = neck_muscular_arched_average_2_crest.addOrReplaceChild("neck_muscular_arched_average_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1748F, -2.8606F, -2.0935F));

            PartDefinition cube_r1 = neck_muscular_arched_average_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(559, 660).addBox(-4.1434F, -5.8622F, -2.7188F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6434F, 0.7114F, 2.432F, 1.5708F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_average_2_crest_lower = neck_muscular_arched_average_2_crest.addOrReplaceChild("neck_muscular_arched_average_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1225F, 0.7984F, 1.2933F));

            PartDefinition cube_r2 = neck_muscular_arched_average_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(529, 660).addBox(-5.08F, -10.0F, -0.92F, 5.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 3.5921F, 3.479F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_average_2_middle_individual = neck_muscular_arched_average_2_individual.addOrReplaceChild("neck_muscular_arched_average_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1914F, -0.3896F, -1.0042F));

            PartDefinition cube_r3 = neck_muscular_arched_average_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(543, 660).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0267F, 5.7274F, 0.0236F, 0.2618F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_muscular_arched_average_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(530, 646).addBox(-6.0F, -10.0F, -1.0F, 6.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0517F, 3.1462F, 2.9086F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_average_2_lower_individual = neck_muscular_arched_average_2_individual.addOrReplaceChild("neck_muscular_arched_average_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1339F, 1.6633F, -1.0673F));

            PartDefinition cube_r5 = neck_muscular_arched_average_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(550, 647).addBox(-6.08F, -7.7191F, -1.7991F, 6.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.08F, 3.1305F, 0.7764F, 0.3054F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_average_2_mane = neck_muscular_arched_average_2.addOrReplaceChild("neck_muscular_arched_average_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -6.8827F, -1.0726F));

            PartDefinition neck_muscular_arched_average_2_top_mane = neck_muscular_arched_average_2_mane.addOrReplaceChild("neck_muscular_arched_average_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, -1.1978F, -1.1543F));

            PartDefinition neck_muscular_arched_average_2_top_mane_connector = neck_muscular_arched_average_2_top_mane.addOrReplaceChild("neck_muscular_arched_average_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.7877F, -0.7151F));

            PartDefinition neck_muscular_arched_average_2_top_mane_connector_individual = neck_muscular_arched_average_2_top_mane_connector.addOrReplaceChild("neck_muscular_arched_average_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

            PartDefinition cube_r6 = neck_muscular_arched_average_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(871, 809).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_average_2_top_mane_connector2 = neck_muscular_arched_average_2_top_mane_connector.addOrReplaceChild("neck_muscular_arched_average_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.4469F));

            PartDefinition neck_muscular_arched_average_2_top_mane_connector2_individual = neck_muscular_arched_average_2_top_mane_connector2.addOrReplaceChild("neck_muscular_arched_average_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.5034F, -0.3893F));

            PartDefinition cube_r7 = neck_muscular_arched_average_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(871, 816).addBox(-2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_average_2_top_mane_flow = neck_muscular_arched_average_2_top_mane_connector2.addOrReplaceChild("neck_muscular_arched_average_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7709F, 0.0F, 0.2682F, -0.1745F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_muscular_arched_average_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(857, 810).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

            PartDefinition neck_muscular_arched_average_2_bottom_mane = neck_muscular_arched_average_2_mane.addOrReplaceChild("neck_muscular_arched_average_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, 1.8413F, 2.3318F));

            PartDefinition neck_muscular_arched_average_2_bottom_mane_connector = neck_muscular_arched_average_2_bottom_mane.addOrReplaceChild("neck_muscular_arched_average_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_muscular_arched_average_2_bottom_mane_connector_individual = neck_muscular_arched_average_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_arched_average_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.9116F, -0.6831F));

            PartDefinition cube_r9 = neck_muscular_arched_average_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(882, 806).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7634F, -2.6136F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_average_2_bottom_mane_connector2 = neck_muscular_arched_average_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_arched_average_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -2.4134F, -0.8045F));

            PartDefinition neck_muscular_arched_average_2_bottom_mane_connector2_individual = neck_muscular_arched_average_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_arched_average_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 1.1094F, 0.5135F));

            PartDefinition cube_r10 = neck_muscular_arched_average_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(881, 818).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4669F, -3.0163F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_average_2_bottom_mane_flow = neck_muscular_arched_average_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_arched_average_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.4134F, -0.1788F, 0.0F));

            PartDefinition cube_r11 = neck_muscular_arched_average_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(859, 812).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, 1.4302F, 1.2514F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("muscular") && length.equals("long") && variation == 1) {
            PartDefinition neck_muscular_arched_long_1 = partdefinition.addOrReplaceChild("neck_muscular_arched_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_muscular_arched_long_1_individual = neck_muscular_arched_long_1.addOrReplaceChild("neck_muscular_arched_long_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0245F, -1.5553F, -1.7338F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_long_1_crest = neck_muscular_arched_long_1_individual.addOrReplaceChild("neck_muscular_arched_long_1_crest", CubeListBuilder.create(), PartPose.offset(-0.0245F, -4.4335F, 0.2142F));

            PartDefinition neck_muscular_arched_long_1_crest_upper = neck_muscular_arched_long_1_crest.addOrReplaceChild("neck_muscular_arched_long_1_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.0933F, -3.883F, -3.1935F));

            PartDefinition cube_r1 = neck_muscular_arched_long_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(594, 675).addBox(-4.1434F, -5.8622F, -2.7188F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6434F, 0.5326F, 2.5214F, 1.5708F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_long_1_crest_lower = neck_muscular_arched_long_1_crest.addOrReplaceChild("neck_muscular_arched_long_1_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.0562F, 0.3043F, 1.0792F));

            PartDefinition cube_r2 = neck_muscular_arched_long_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(610, 648).addBox(-5.08F, -10.0F, -0.92F, 5.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 2.885F, 2.7719F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_long_1_middle_individual = neck_muscular_arched_long_1_individual.addOrReplaceChild("neck_muscular_arched_long_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.0126F, -1.7289F, -0.1863F));

            PartDefinition cube_r3 = neck_muscular_arched_long_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(590, 646).addBox(-6.0F, -10.0F, -1.0F, 6.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9623F, 2.2116F, 2.2422F, 0.7854F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_muscular_arched_long_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(592, 662).addBox(-5.0784F, -9.0F, -0.9017F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1161F, 5.9548F, -0.0171F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_long_1_lower_individual = neck_muscular_arched_long_1_individual.addOrReplaceChild("neck_muscular_arched_long_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0528F, 0.309F, -0.5025F));

            PartDefinition cube_r5 = neck_muscular_arched_long_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(608, 662).addBox(-6.0792F, -11.0F, -0.9108F, 6.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0792F, 5.573F, 0.6151F, 0.3054F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_long_1_mane = neck_muscular_arched_long_1.addOrReplaceChild("neck_muscular_arched_long_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.1341F, -1.3408F));

            PartDefinition neck_muscular_arched_long_1_top_mane = neck_muscular_arched_long_1_mane.addOrReplaceChild("neck_muscular_arched_long_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.5308F, -1.9128F, 0.544F));

            PartDefinition neck_muscular_arched_long_1_top_mane_connector = neck_muscular_arched_long_1_top_mane.addOrReplaceChild("neck_muscular_arched_long_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.6089F, -2.5922F));

            PartDefinition neck_muscular_arched_long_1_top_mane_connector_individual = neck_muscular_arched_long_1_top_mane_connector.addOrReplaceChild("neck_muscular_arched_long_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

            PartDefinition cube_r6 = neck_muscular_arched_long_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(920, 807).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_long_1_top_mane_connector2 = neck_muscular_arched_long_1_top_mane_connector.addOrReplaceChild("neck_muscular_arched_long_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

            PartDefinition neck_muscular_arched_long_1_top_mane_connector2_individual = neck_muscular_arched_long_1_top_mane_connector2.addOrReplaceChild("neck_muscular_arched_long_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.5034F, -0.7469F));

            PartDefinition cube_r7 = neck_muscular_arched_long_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(918, 814).addBox(-2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_long_1_top_mane_flow = neck_muscular_arched_long_1_top_mane_connector2.addOrReplaceChild("neck_muscular_arched_long_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8603F, 0.0F, -0.0894F, -0.1745F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_muscular_arched_long_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(936, 801).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

            PartDefinition neck_muscular_arched_long_1_bottom_mane = neck_muscular_arched_long_1_mane.addOrReplaceChild("neck_muscular_arched_long_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.5308F, 1.305F, 2.153F));

            PartDefinition neck_muscular_arched_long_1_bottom_mane_connector = neck_muscular_arched_long_1_bottom_mane.addOrReplaceChild("neck_muscular_arched_long_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_muscular_arched_long_1_bottom_mane_connector_individual = neck_muscular_arched_long_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_arched_long_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.1182F, -0.0743F));

            PartDefinition cube_r9 = neck_muscular_arched_long_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(936, 801).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5567F, -3.2223F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_long_1_bottom_mane_connector2 = neck_muscular_arched_long_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_arched_long_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));

            PartDefinition neck_muscular_arched_long_1_bottom_mane_connector2_individual = neck_muscular_arched_long_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_arched_long_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, -0.5107F, -0.4867F));

            PartDefinition cube_r10 = neck_muscular_arched_long_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(936, 815).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.2603F, -3.6251F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_long_1_bottom_mane_flow = neck_muscular_arched_long_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_arched_long_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.4134F, -0.3575F, 0.0F));

            PartDefinition cube_r11 = neck_muscular_arched_long_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(922, 808).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("muscular") && length.equals("long") && variation == 2) {
            PartDefinition neck_muscular_arched_long_2 = partdefinition.addOrReplaceChild("neck_muscular_arched_long_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_muscular_arched_long_2_individual = neck_muscular_arched_long_2.addOrReplaceChild("neck_muscular_arched_long_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0245F, 0.0536F, 0.1433F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_long_2_crest = neck_muscular_arched_long_2_individual.addOrReplaceChild("neck_muscular_arched_long_2_crest", CubeListBuilder.create(), PartPose.offset(-0.0245F, -7.6514F, -3.8975F));

            PartDefinition neck_muscular_arched_long_2_crest_upper = neck_muscular_arched_long_2_crest.addOrReplaceChild("neck_muscular_arched_long_2_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.1827F, -3.2115F, -2.3756F));

            PartDefinition cube_r1 = neck_muscular_arched_long_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(647, 675).addBox(-4.1434F, -5.8622F, -2.7188F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6434F, 1.3371F, 2.7002F, 1.5708F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_long_2_crest_lower = neck_muscular_arched_long_2_crest.addOrReplaceChild("neck_muscular_arched_long_2_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1456F, 2.1338F, 2.34F));

            PartDefinition cube_r2 = neck_muscular_arched_long_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(664, 646).addBox(-5.08F, -10.0F, -0.92F, 5.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 2.5314F, 2.4183F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_long_2_middle_individual = neck_muscular_arched_long_2_individual.addOrReplaceChild("neck_muscular_arched_long_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.0126F, -2.7397F, -2.8365F));

            PartDefinition cube_r3 = neck_muscular_arched_long_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(645, 661).addBox(-5.0784F, -9.0F, -0.9017F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1161F, 5.8494F, 0.0543F, 0.2618F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_muscular_arched_long_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(645, 644).addBox(-6.0F, -10.0F, -1.0F, 6.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9623F, 1.4805F, 1.6879F, 0.7854F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_long_2_lower_individual = neck_muscular_arched_long_2_individual.addOrReplaceChild("neck_muscular_arched_long_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0528F, -0.9561F, -3.5567F));

            PartDefinition cube_r5 = neck_muscular_arched_long_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(661, 661).addBox(-6.0792F, -11.0F, -0.9108F, 6.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0792F, 5.0961F, 0.4647F, 0.3054F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_long_2_mane = neck_muscular_arched_long_2.addOrReplaceChild("neck_muscular_arched_long_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.8492F, -1.7877F));

            PartDefinition neck_muscular_arched_long_2_top_mane = neck_muscular_arched_long_2_mane.addOrReplaceChild("neck_muscular_arched_long_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.5308F, -1.2872F, -1.8694F));

            PartDefinition neck_muscular_arched_long_2_top_mane_connector = neck_muscular_arched_long_2_top_mane.addOrReplaceChild("neck_muscular_arched_long_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -2.0559F, -0.8045F));

            PartDefinition neck_muscular_arched_long_2_top_mane_connector_individual = neck_muscular_arched_long_2_top_mane_connector.addOrReplaceChild("neck_muscular_arched_long_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

            PartDefinition cube_r6 = neck_muscular_arched_long_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(976, 813).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_long_2_top_mane_connector2 = neck_muscular_arched_long_2_top_mane_connector.addOrReplaceChild("neck_muscular_arched_long_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

            PartDefinition neck_muscular_arched_long_2_top_mane_connector2_individual = neck_muscular_arched_long_2_top_mane_connector2.addOrReplaceChild("neck_muscular_arched_long_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.5034F, -0.7469F));

            PartDefinition cube_r7 = neck_muscular_arched_long_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(974, 807).addBox(-2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_long_2_top_mane_flow = neck_muscular_arched_long_2_top_mane_connector2.addOrReplaceChild("neck_muscular_arched_long_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7709F, 0.0F, -0.0894F, -0.1745F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_muscular_arched_long_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(993, 800).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

            PartDefinition neck_muscular_arched_long_2_bottom_mane = neck_muscular_arched_long_2_mane.addOrReplaceChild("neck_muscular_arched_long_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.5308F, 1.4838F, 1.5273F));

            PartDefinition neck_muscular_arched_long_2_bottom_mane_connector = neck_muscular_arched_long_2_bottom_mane.addOrReplaceChild("neck_muscular_arched_long_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_muscular_arched_long_2_bottom_mane_connector_individual = neck_muscular_arched_long_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_arched_long_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.2784F, 0.2301F));

            PartDefinition cube_r9 = neck_muscular_arched_long_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(992, 799).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9534F, -3.5267F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_long_2_bottom_mane_connector2 = neck_muscular_arched_long_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_arched_long_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.3575F, 0.0F, 0.8045F));

            PartDefinition neck_muscular_arched_long_2_bottom_mane_connector2_individual = neck_muscular_arched_long_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_arched_long_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.4665F, -0.114F, -0.1823F));

            PartDefinition cube_r10 = neck_muscular_arched_long_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(992, 814).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6569F, -3.9295F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_arched_long_2_bottom_mane_flow = neck_muscular_arched_long_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_arched_long_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.2346F, -0.3575F, 0.0F));

            PartDefinition cube_r11 = neck_muscular_arched_long_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(977, 807).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));
        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Neck / " + muscleMass + " / " + "arched" +  " / "  + length + " / Variation " + variation + ", Cancelling Generation...");
        }
        allParts.add("neck_" + muscleMass + "_" + "arched" + "_" + length  + "_" +  variation);
        return partdefinition;
    }

    /* Ewed Neck */
    public static PartDefinition GenerateEwed(PartDefinition partdefinition, String muscleMass, String length, int variation) {
        if (muscleMass.equals("lean") && length.equals("short") && variation == 1) {
            PartDefinition neck_lean_ewed_short_1 = partdefinition.addOrReplaceChild("neck_lean_ewed_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_lean_ewed_short_1_individual = neck_lean_ewed_short_1.addOrReplaceChild("neck_lean_ewed_short_1_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, 1.2156F, 0.9016F));

            PartDefinition neck_lean_ewed_short_1_crest = neck_lean_ewed_short_1_individual.addOrReplaceChild("neck_lean_ewed_short_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -6.5251F, -2.6816F));

            PartDefinition neck_lean_ewed_short_1_crest_upper = neck_lean_ewed_short_1_crest.addOrReplaceChild("neck_lean_ewed_short_1_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.1534F, -0.912F, -0.0958F));

            PartDefinition cube_r1 = neck_lean_ewed_short_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(365, 707).addBox(-3.08F, -4.0F, -2.92F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 0.3935F, 0.4677F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_short_1_crest_lower = neck_lean_ewed_short_1_crest.addOrReplaceChild("neck_lean_ewed_short_1_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1171F, 1.4221F, 1.9259F));

            PartDefinition cube_r2 = neck_lean_ewed_short_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(379, 707).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 3.3225F, 2.2288F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_short_1_middle_individual = neck_lean_ewed_short_1_individual.addOrReplaceChild("neck_lean_ewed_short_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1955F, -4.1346F, -2.924F));

            PartDefinition cube_r3 = neck_lean_ewed_short_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(364, 696).addBox(-3.0F, -8.0F, -1.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.2598F, 1.7619F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_short_1_lower_individual = neck_lean_ewed_short_1_individual.addOrReplaceChild("neck_lean_ewed_short_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.19F, -2.9078F, -3.6503F));

            PartDefinition cube_r4 = neck_lean_ewed_short_1_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(380, 696).addBox(-4.0784F, -8.0F, -0.9017F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 4.6309F, 0.1038F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_short_1_mane = neck_lean_ewed_short_1.addOrReplaceChild("neck_lean_ewed_short_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -5.9888F, 0.0F));

            PartDefinition neck_lean_ewed_short_1_top_mane = neck_lean_ewed_short_1_mane.addOrReplaceChild("neck_lean_ewed_short_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -1.5553F, -1.0649F));

            PartDefinition neck_lean_ewed_short_1_top_mane_connector = neck_lean_ewed_short_1_top_mane.addOrReplaceChild("neck_lean_ewed_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -1.2514F, -1.0726F));

            PartDefinition neck_lean_ewed_short_1_top_mane_connector_individual = neck_lean_ewed_short_1_top_mane_connector.addOrReplaceChild("neck_lean_ewed_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.0747F, 0.1266F));

            PartDefinition cube_r5 = neck_lean_ewed_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(725, 844).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8192F, -0.5736F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_short_1_top_mane_connector2 = neck_lean_ewed_short_1_top_mane_connector.addOrReplaceChild("neck_lean_ewed_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.4469F, 0.8045F));

            PartDefinition neck_lean_ewed_short_1_top_mane_connector2_individual = neck_lean_ewed_short_1_top_mane_connector2.addOrReplaceChild("neck_lean_ewed_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.9665F, 0.1121F, -0.391F));

            PartDefinition cube_r6 = neck_lean_ewed_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(725, 850).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2287F, -0.8604F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_short_1_top_mane_flow = neck_lean_ewed_short_1_top_mane_connector2.addOrReplaceChild("neck_lean_ewed_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, -0.3575F, 0.0894F, -0.1309F, 0.0F, 0.0F));

            PartDefinition cube_r7 = neck_lean_ewed_short_1_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(713, 844).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9832F, -0.3569F, -0.7381F, -0.4276F, -0.2206F, -0.3514F));

            PartDefinition neck_lean_ewed_short_1_bottom_mane = neck_lean_ewed_short_1_mane.addOrReplaceChild("neck_lean_ewed_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 0.4112F, 0.7228F));

            PartDefinition neck_lean_ewed_short_1_bottom_mane_connector = neck_lean_ewed_short_1_bottom_mane.addOrReplaceChild("neck_lean_ewed_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

            PartDefinition neck_lean_ewed_short_1_bottom_mane_connector_individual = neck_lean_ewed_short_1_bottom_mane_connector.addOrReplaceChild("neck_lean_ewed_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 0.5466F, 0.2301F));

            PartDefinition cube_r8 = neck_lean_ewed_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(733, 845).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9534F, -3.5267F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_short_1_bottom_mane_connector2 = neck_lean_ewed_short_1_bottom_mane_connector.addOrReplaceChild("neck_lean_ewed_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, 0.0F, 0.9832F));

            PartDefinition neck_lean_ewed_short_1_bottom_mane_connector2_individual = neck_lean_ewed_short_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_ewed_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.1542F, -0.361F));

            PartDefinition cube_r9 = neck_lean_ewed_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(732, 854).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6569F, -3.9295F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_short_1_bottom_mane_flow = neck_lean_ewed_short_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_ewed_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.6983F, 0.0894F, 0.0F));

            PartDefinition cube_r10 = neck_lean_ewed_short_1_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(716, 848).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.8939F, -0.4469F, -0.8901F, -0.0927F, -0.1377F));

        } else if (muscleMass.equals("lean") && length.equals("short") && variation == 2) {
            PartDefinition neck_lean_ewed_short_2 = partdefinition.addOrReplaceChild("neck_lean_ewed_short_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_lean_ewed_short_2_individual = neck_lean_ewed_short_2.addOrReplaceChild("neck_lean_ewed_short_2_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, 0.0536F, 0.0077F));

            PartDefinition neck_lean_ewed_short_2_crest = neck_lean_ewed_short_2_individual.addOrReplaceChild("neck_lean_ewed_short_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -5.3631F, -1.8771F));

            PartDefinition neck_lean_ewed_short_2_crest_upper = neck_lean_ewed_short_2_crest.addOrReplaceChild("neck_lean_ewed_short_2_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.1534F, -2.074F, -1.2578F));

            PartDefinition cube_r1 = neck_lean_ewed_short_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(422, 708).addBox(-3.08F, -4.0F, -2.92F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 0.3935F, 0.8252F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_short_2_crest_lower = neck_lean_ewed_short_2_crest.addOrReplaceChild("neck_lean_ewed_short_2_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1171F, 0.6697F, 1.4082F));

            PartDefinition cube_r2 = neck_lean_ewed_short_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(436, 708).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 2.9129F, 1.942F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_short_2_middle_individual = neck_lean_ewed_short_2_individual.addOrReplaceChild("neck_lean_ewed_short_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1955F, -3.725F, -2.6372F));

            PartDefinition cube_r3 = neck_lean_ewed_short_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(421, 696).addBox(-3.0F, -8.0F, -1.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.8502F, 1.4752F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_short_2_lower_individual = neck_lean_ewed_short_2_individual.addOrReplaceChild("neck_lean_ewed_short_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.19F, -2.4249F, -3.5209F));

            PartDefinition cube_r4 = neck_lean_ewed_short_2_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(437, 696).addBox(-4.0784F, -8.0F, -0.9017F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 4.148F, -0.0256F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_short_2_mane = neck_lean_ewed_short_2.addOrReplaceChild("neck_lean_ewed_short_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.1508F, -0.7151F));

            PartDefinition neck_lean_ewed_short_2_top_mane = neck_lean_ewed_short_2_mane.addOrReplaceChild("neck_lean_ewed_short_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -1.1084F, -0.2604F));

            PartDefinition neck_lean_ewed_short_2_top_mane_connector = neck_lean_ewed_short_2_top_mane.addOrReplaceChild("neck_lean_ewed_short_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -1.5196F, -1.8771F));

            PartDefinition neck_lean_ewed_short_2_top_mane_connector_individual = neck_lean_ewed_short_2_top_mane_connector.addOrReplaceChild("neck_lean_ewed_short_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, -0.0147F, 0.1266F));

            PartDefinition cube_r5 = neck_lean_ewed_short_2_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(772, 844).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8192F, -0.5736F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_short_2_top_mane_connector2 = neck_lean_ewed_short_2_top_mane_connector.addOrReplaceChild("neck_lean_ewed_short_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.5196F, -0.4469F, 0.8045F));

            PartDefinition neck_lean_ewed_short_2_top_mane_connector2_individual = neck_lean_ewed_short_2_top_mane_connector2.addOrReplaceChild("neck_lean_ewed_short_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.6089F, 0.0227F, -0.391F));

            PartDefinition cube_r6 = neck_lean_ewed_short_2_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(772, 850).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2287F, -0.8604F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_short_2_top_mane_flow = neck_lean_ewed_short_2_top_mane_connector2.addOrReplaceChild("neck_lean_ewed_short_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, -0.3575F, 0.0894F, -0.1309F, 0.0F, 0.0F));

            PartDefinition cube_r7 = neck_lean_ewed_short_2_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(760, 844).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6257F, -0.4463F, -0.7381F, -0.4276F, -0.2206F, -0.3514F));

            PartDefinition neck_lean_ewed_short_2_bottom_mane = neck_lean_ewed_short_2_mane.addOrReplaceChild("neck_lean_ewed_short_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 1.5732F, 1.5273F));

            PartDefinition neck_lean_ewed_short_2_bottom_mane_connector = neck_lean_ewed_short_2_bottom_mane.addOrReplaceChild("neck_lean_ewed_short_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

            PartDefinition neck_lean_ewed_short_2_bottom_mane_connector_individual = neck_lean_ewed_short_2_bottom_mane_connector.addOrReplaceChild("neck_lean_ewed_short_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, -0.0288F, -0.0743F));

            PartDefinition cube_r8 = neck_lean_ewed_short_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(780, 843).addBox(-2.0F, -2.0F, -0.01F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5567F, -3.2223F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_short_2_bottom_mane_connector2 = neck_lean_ewed_short_2_bottom_mane_connector.addOrReplaceChild("neck_lean_ewed_short_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.7151F, 0.6257F));

            PartDefinition neck_lean_ewed_short_2_bottom_mane_connector2_individual = neck_lean_ewed_short_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_ewed_short_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.2938F, -0.3079F));

            PartDefinition cube_r9 = neck_lean_ewed_short_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(780, 853).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2603F, -3.6251F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_short_2_bottom_mane_flow = neck_lean_ewed_short_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_ewed_short_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.6983F, -0.2682F, -0.0894F));

            PartDefinition cube_r10 = neck_lean_ewed_short_2_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(762, 847).addBox(-0.8139F, -0.0002F, -3.3921F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2682F, 0.0F, -0.8901F, -0.0927F, -0.1377F));

        } else if (muscleMass.equals("lean") && length.equals("average") && variation == 1) {
            PartDefinition neck_lean_ewed_average_1 = partdefinition.addOrReplaceChild("neck_lean_ewed_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_lean_ewed_average_1_individual = neck_lean_ewed_average_1.addOrReplaceChild("neck_lean_ewed_average_1_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, -0.5721F, 0.0971F));

            PartDefinition neck_lean_ewed_average_1_crest = neck_lean_ewed_average_1_individual.addOrReplaceChild("neck_lean_ewed_average_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.4693F, -1.2514F));

            PartDefinition neck_lean_ewed_average_1_crest_upper = neck_lean_ewed_average_1_crest.addOrReplaceChild("neck_lean_ewed_average_1_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.1534F, -2.9678F, -1.8835F));

            PartDefinition cube_r1 = neck_lean_ewed_average_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(480, 708).addBox(-3.08F, -4.0F, -2.92F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 0.3935F, 0.5571F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_average_1_crest_lower = neck_lean_ewed_average_1_crest.addOrReplaceChild("neck_lean_ewed_average_1_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1171F, 0.1854F, 1.0693F));

            PartDefinition cube_r2 = neck_lean_ewed_average_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(494, 708).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 2.5033F, 1.6552F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_average_1_middle_individual = neck_lean_ewed_average_1_individual.addOrReplaceChild("neck_lean_ewed_average_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1955F, -3.3155F, -2.3504F));

            PartDefinition cube_r3 = neck_lean_ewed_average_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(479, 695).addBox(-3.0F, -8.0F, -1.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.4406F, 1.1884F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_average_1_lower_individual = neck_lean_ewed_average_1_individual.addOrReplaceChild("neck_lean_ewed_average_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.19F, -1.9419F, -3.3914F));

            PartDefinition cube_r4 = neck_lean_ewed_average_1_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(495, 695).addBox(-4.0784F, -8.0F, -0.9017F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 3.665F, -0.155F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_average_1_mane = neck_lean_ewed_average_1.addOrReplaceChild("neck_lean_ewed_average_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.6872F, 0.0F));

            PartDefinition neck_lean_ewed_average_1_top_mane = neck_lean_ewed_average_1_mane.addOrReplaceChild("neck_lean_ewed_average_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -0.8402F, -0.9755F));

            PartDefinition neck_lean_ewed_average_1_top_mane_connector = neck_lean_ewed_average_1_top_mane.addOrReplaceChild("neck_lean_ewed_average_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -2.2346F, -1.5196F));

            PartDefinition neck_lean_ewed_average_1_top_mane_connector_individual = neck_lean_ewed_average_1_top_mane_connector.addOrReplaceChild("neck_lean_ewed_average_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.395F, -0.7819F));

            PartDefinition cube_r5 = neck_lean_ewed_average_1_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(820, 844).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3927F, 0.2456F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_average_1_top_mane_connector2 = neck_lean_ewed_average_1_top_mane_connector.addOrReplaceChild("neck_lean_ewed_average_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

            PartDefinition neck_lean_ewed_average_1_top_mane_connector2_individual = neck_lean_ewed_average_1_top_mane_connector2.addOrReplaceChild("neck_lean_ewed_average_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.2536F, -0.4057F));

            PartDefinition cube_r6 = neck_lean_ewed_average_1_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(820, 850).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8023F, -0.0412F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_average_1_top_mane_flow = neck_lean_ewed_average_1_top_mane_connector2.addOrReplaceChild("neck_lean_ewed_average_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, -0.0894F, -0.1309F, 0.0F, 0.0F));

            PartDefinition cube_r7 = neck_lean_ewed_average_1_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(807, 844).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4712F, -0.2206F, -0.3514F));

            PartDefinition neck_lean_ewed_average_1_bottom_mane = neck_lean_ewed_average_1_mane.addOrReplaceChild("neck_lean_ewed_average_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 1.4838F, 0.8122F));

            PartDefinition neck_lean_ewed_average_1_bottom_mane_connector = neck_lean_ewed_average_1_bottom_mane.addOrReplaceChild("neck_lean_ewed_average_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_lean_ewed_average_1_bottom_mane_connector_individual = neck_lean_ewed_average_1_bottom_mane_connector.addOrReplaceChild("neck_lean_ewed_average_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.5149F, -0.3787F));

            PartDefinition cube_r8 = neck_lean_ewed_average_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(828, 841).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.16F, -2.9179F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_average_1_bottom_mane_connector2 = neck_lean_ewed_average_1_bottom_mane_connector.addOrReplaceChild("neck_lean_ewed_average_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -1.4302F, 0.0894F));

            PartDefinition neck_lean_ewed_average_1_bottom_mane_connector2_individual = neck_lean_ewed_average_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_ewed_average_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.5228F, -0.076F));

            PartDefinition cube_r9 = neck_lean_ewed_average_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(828, 852).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.8636F, -3.3207F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_average_1_bottom_mane_flow = neck_lean_ewed_average_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_ewed_average_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, 0.3575F, 0.2682F));

            PartDefinition cube_r10 = neck_lean_ewed_average_1_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(808, 846).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2682F, 0.1788F, -0.8901F, -0.0927F, -0.1377F));

        } else if (muscleMass.equals("lean") && length.equals("average") && variation == 2) {
            PartDefinition neck_lean_ewed_average_2 = partdefinition.addOrReplaceChild("neck_lean_ewed_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_lean_ewed_average_2_individual = neck_lean_ewed_average_2.addOrReplaceChild("neck_lean_ewed_average_2_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, -0.9296F, -0.4392F));

            PartDefinition neck_lean_ewed_average_2_crest = neck_lean_ewed_average_2_individual.addOrReplaceChild("neck_lean_ewed_average_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.648F, -1.7877F));

            PartDefinition neck_lean_ewed_average_2_crest_upper = neck_lean_ewed_average_2_crest.addOrReplaceChild("neck_lean_ewed_average_2_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.1534F, -2.7891F, -1.2578F));

            PartDefinition cube_r1 = neck_lean_ewed_average_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(535, 709).addBox(-3.08F, -4.0F, -2.92F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 0.3935F, 0.4677F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_average_2_crest_lower = neck_lean_ewed_average_2_crest.addOrReplaceChild("neck_lean_ewed_average_2_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1171F, 0.7737F, 1.8924F));

            PartDefinition cube_r2 = neck_lean_ewed_average_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(549, 709).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 2.0938F, 1.3684F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_average_2_middle_individual = neck_lean_ewed_average_2_individual.addOrReplaceChild("neck_lean_ewed_average_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1955F, -2.9059F, -2.0636F));

            PartDefinition cube_r3 = neck_lean_ewed_average_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(534, 695).addBox(-3.0F, -8.0F, -1.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.031F, 0.9016F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_average_2_lower_individual = neck_lean_ewed_average_2_individual.addOrReplaceChild("neck_lean_ewed_average_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.19F, -1.4589F, -3.262F));

            PartDefinition cube_r4 = neck_lean_ewed_average_2_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(550, 695).addBox(-4.0784F, -8.0F, -0.9017F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 3.182F, -0.2844F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_average_2_mane = neck_lean_ewed_average_2.addOrReplaceChild("neck_lean_ewed_average_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.6872F, 0.0F));

            PartDefinition neck_lean_ewed_average_2_top_mane = neck_lean_ewed_average_2_mane.addOrReplaceChild("neck_lean_ewed_average_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -1.3765F, -1.5118F));

            PartDefinition neck_lean_ewed_average_2_top_mane_connector = neck_lean_ewed_average_2_top_mane.addOrReplaceChild("neck_lean_ewed_average_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -2.0559F, -1.5196F));

            PartDefinition neck_lean_ewed_average_2_top_mane_connector_individual = neck_lean_ewed_average_2_top_mane_connector.addOrReplaceChild("neck_lean_ewed_average_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.395F, -0.7819F));

            PartDefinition cube_r5 = neck_lean_ewed_average_2_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(871, 844).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3927F, 0.2456F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_average_2_top_mane_connector2 = neck_lean_ewed_average_2_top_mane_connector.addOrReplaceChild("neck_lean_ewed_average_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

            PartDefinition neck_lean_ewed_average_2_top_mane_connector2_individual = neck_lean_ewed_average_2_top_mane_connector2.addOrReplaceChild("neck_lean_ewed_average_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.2536F, -0.4057F));

            PartDefinition cube_r6 = neck_lean_ewed_average_2_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(871, 850).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8023F, -0.0412F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_average_2_top_mane_flow = neck_lean_ewed_average_2_top_mane_connector2.addOrReplaceChild("neck_lean_ewed_average_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, -0.0894F, -0.1309F, 0.0F, 0.0F));

            PartDefinition cube_r7 = neck_lean_ewed_average_2_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(859, 844).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4712F, -0.2206F, -0.3514F));

            PartDefinition neck_lean_ewed_average_2_bottom_mane = neck_lean_ewed_average_2_mane.addOrReplaceChild("neck_lean_ewed_average_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 1.1263F, 0.2759F));

            PartDefinition neck_lean_ewed_average_2_bottom_mane_connector = neck_lean_ewed_average_2_bottom_mane.addOrReplaceChild("neck_lean_ewed_average_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_lean_ewed_average_2_bottom_mane_connector_individual = neck_lean_ewed_average_2_bottom_mane_connector.addOrReplaceChild("neck_lean_ewed_average_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.1182F, -0.0743F));

            PartDefinition cube_r8 = neck_lean_ewed_average_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(883, 839).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5567F, -3.2223F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_average_2_bottom_mane_connector2 = neck_lean_ewed_average_2_bottom_mane_connector.addOrReplaceChild("neck_lean_ewed_average_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -1.4302F, 0.0894F));

            PartDefinition neck_lean_ewed_average_2_bottom_mane_connector2_individual = neck_lean_ewed_average_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_ewed_average_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.9195F, 0.2284F));

            PartDefinition cube_r9 = neck_lean_ewed_average_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(881, 851).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2603F, -3.6251F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_average_2_bottom_mane_flow = neck_lean_ewed_average_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_ewed_average_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, 0.3575F, 0.2682F));

            PartDefinition cube_r10 = neck_lean_ewed_average_2_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(859, 845).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2682F, 0.1788F, -0.8901F, -0.0927F, -0.1377F));

        } else if (muscleMass.equals("lean") && length.equals("long") && variation == 1) {
            PartDefinition neck_lean_ewed_long_1 = partdefinition.addOrReplaceChild("neck_lean_ewed_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_lean_ewed_long_1_individual = neck_lean_ewed_long_1.addOrReplaceChild("neck_lean_ewed_long_1_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, -2.0916F, -0.4392F));

            PartDefinition neck_lean_ewed_long_1_crest = neck_lean_ewed_long_1_individual.addOrReplaceChild("neck_lean_ewed_long_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.5587F, -1.2514F));

            PartDefinition neck_lean_ewed_long_1_crest_upper = neck_lean_ewed_long_1_crest.addOrReplaceChild("neck_lean_ewed_long_1_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.1534F, -2.8784F, -1.7942F));

            PartDefinition cube_r1 = neck_lean_ewed_long_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(596, 710).addBox(-3.08F, -4.0F, -2.92F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 0.3935F, 0.4677F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_long_1_crest_lower = neck_lean_ewed_long_1_crest.addOrReplaceChild("neck_lean_ewed_long_1_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1171F, 1.0939F, 1.6428F));

            PartDefinition cube_r2 = neck_lean_ewed_long_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(610, 710).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 1.6842F, 1.0816F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_long_1_middle_individual = neck_lean_ewed_long_1_individual.addOrReplaceChild("neck_lean_ewed_long_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1955F, -2.4963F, -1.7768F));

            PartDefinition cube_r3 = neck_lean_ewed_long_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(595, 695).addBox(-3.0F, -8.0F, -1.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.6215F, 0.6148F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_long_1_lower_individual = neck_lean_ewed_long_1_individual.addOrReplaceChild("neck_lean_ewed_long_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.19F, -0.976F, -3.1326F));

            PartDefinition cube_r4 = neck_lean_ewed_long_1_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(611, 695).addBox(-4.0784F, -8.0F, -0.9017F, 3.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 2.6991F, -0.4138F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_long_1_mane = neck_lean_ewed_long_1.addOrReplaceChild("neck_lean_ewed_long_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.6704F, 0.0F));

            PartDefinition neck_lean_ewed_long_1_top_mane = neck_lean_ewed_long_1_mane.addOrReplaceChild("neck_lean_ewed_long_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -1.7341F, -1.5118F));

            PartDefinition neck_lean_ewed_long_1_top_mane_connector = neck_lean_ewed_long_1_top_mane.addOrReplaceChild("neck_lean_ewed_long_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.8771F, -1.5196F));

            PartDefinition neck_lean_ewed_long_1_top_mane_connector_individual = neck_lean_ewed_long_1_top_mane_connector.addOrReplaceChild("neck_lean_ewed_long_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.395F, -0.7819F));

            PartDefinition cube_r5 = neck_lean_ewed_long_1_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(930, 842).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3927F, 0.2456F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_long_1_top_mane_connector2 = neck_lean_ewed_long_1_top_mane_connector.addOrReplaceChild("neck_lean_ewed_long_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

            PartDefinition neck_lean_ewed_long_1_top_mane_connector2_individual = neck_lean_ewed_long_1_top_mane_connector2.addOrReplaceChild("neck_lean_ewed_long_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.2536F, -0.4057F));

            PartDefinition cube_r6 = neck_lean_ewed_long_1_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(930, 850).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8023F, -0.0412F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_long_1_top_mane_flow = neck_lean_ewed_long_1_top_mane_connector2.addOrReplaceChild("neck_lean_ewed_long_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, -0.0894F, -0.1309F, 0.0F, 0.0F));

            PartDefinition cube_r7 = neck_lean_ewed_long_1_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(918, 844).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4712F, -0.2206F, -0.3514F));

            PartDefinition neck_lean_ewed_long_1_bottom_mane = neck_lean_ewed_long_1_mane.addOrReplaceChild("neck_lean_ewed_long_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 0.9475F, 0.2759F));

            PartDefinition neck_lean_ewed_long_1_bottom_mane_connector = neck_lean_ewed_long_1_bottom_mane.addOrReplaceChild("neck_lean_ewed_long_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_lean_ewed_long_1_bottom_mane_connector_individual = neck_lean_ewed_long_1_bottom_mane_connector.addOrReplaceChild("neck_lean_ewed_long_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.2784F, 0.2301F));

            PartDefinition cube_r8 = neck_lean_ewed_long_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(941, 837).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9534F, -3.5267F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_long_1_bottom_mane_connector2 = neck_lean_ewed_long_1_bottom_mane_connector.addOrReplaceChild("neck_lean_ewed_long_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));

            PartDefinition neck_lean_ewed_long_1_bottom_mane_connector2_individual = neck_lean_ewed_long_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_ewed_long_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, -0.114F, -0.1823F));

            PartDefinition cube_r9 = neck_lean_ewed_long_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(941, 850).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6569F, -3.9295F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_long_1_bottom_mane_flow = neck_lean_ewed_long_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_ewed_long_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.3575F, 0.0894F));

            PartDefinition cube_r10 = neck_lean_ewed_long_1_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(917, 844).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("lean") && length.equals("long") && variation == 2) {
            PartDefinition neck_lean_ewed_long_2 = partdefinition.addOrReplaceChild("neck_lean_ewed_long_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_lean_ewed_long_2_individual = neck_lean_ewed_long_2.addOrReplaceChild("neck_lean_ewed_long_2_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, -2.8067F, -1.0649F));

            PartDefinition neck_lean_ewed_long_2_crest = neck_lean_ewed_long_2_individual.addOrReplaceChild("neck_lean_ewed_long_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.8268F, -1.9665F));

            PartDefinition neck_lean_ewed_long_2_crest_upper = neck_lean_ewed_long_2_crest.addOrReplaceChild("neck_lean_ewed_long_2_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.1534F, -2.6103F, -1.2578F));

            PartDefinition cube_r1 = neck_lean_ewed_long_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(647, 711).addBox(-3.08F, -4.0F, -2.92F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 0.3935F, 0.6464F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_long_2_crest_lower = neck_lean_ewed_long_2_crest.addOrReplaceChild("neck_lean_ewed_long_2_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1171F, 1.7716F, 2.6447F));

            PartDefinition cube_r2 = neck_lean_ewed_long_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(661, 711).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 1.2746F, 0.7948F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_long_2_middle_individual = neck_lean_ewed_long_2_individual.addOrReplaceChild("neck_lean_ewed_long_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1955F, -2.0867F, -1.49F));

            PartDefinition cube_r3 = neck_lean_ewed_long_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(645, 695).addBox(-3.0F, -8.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.2119F, 0.328F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_long_2_lower_individual = neck_lean_ewed_long_2_individual.addOrReplaceChild("neck_lean_ewed_long_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.19F, -0.493F, -3.0032F));

            PartDefinition cube_r4 = neck_lean_ewed_long_2_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(661, 695).addBox(-4.0784F, -8.0F, -0.9017F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 2.2161F, -0.5432F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_long_2_mane = neck_lean_ewed_long_2.addOrReplaceChild("neck_lean_ewed_long_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -9.5642F, -1.5196F));

            PartDefinition neck_lean_ewed_long_2_top_mane = neck_lean_ewed_long_2_mane.addOrReplaceChild("neck_lean_ewed_long_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -2.0916F, -0.618F));

            PartDefinition neck_lean_ewed_long_2_top_mane_connector = neck_lean_ewed_long_2_top_mane.addOrReplaceChild("neck_lean_ewed_long_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.3408F, -1.5196F));

            PartDefinition neck_lean_ewed_long_2_top_mane_connector_individual = neck_lean_ewed_long_2_top_mane_connector.addOrReplaceChild("neck_lean_ewed_long_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.395F, -0.7819F));

            PartDefinition cube_r5 = neck_lean_ewed_long_2_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(993, 841).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3927F, 0.2456F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_long_2_top_mane_connector2 = neck_lean_ewed_long_2_top_mane_connector.addOrReplaceChild("neck_lean_ewed_long_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

            PartDefinition neck_lean_ewed_long_2_top_mane_connector2_individual = neck_lean_ewed_long_2_top_mane_connector2.addOrReplaceChild("neck_lean_ewed_long_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.2536F, -0.4057F));

            PartDefinition cube_r6 = neck_lean_ewed_long_2_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(990, 849).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8023F, -0.0412F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_long_2_top_mane_flow = neck_lean_ewed_long_2_top_mane_connector2.addOrReplaceChild("neck_lean_ewed_long_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, -0.0894F, -0.1309F, 0.0F, 0.0F));

            PartDefinition cube_r7 = neck_lean_ewed_long_2_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(978, 843).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4712F, -0.2206F, -0.3514F));

            PartDefinition neck_lean_ewed_long_2_bottom_mane = neck_lean_ewed_long_2_mane.addOrReplaceChild("neck_lean_ewed_long_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 1.1263F, 1.1697F));

            PartDefinition neck_lean_ewed_long_2_bottom_mane_connector = neck_lean_ewed_long_2_bottom_mane.addOrReplaceChild("neck_lean_ewed_long_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_lean_ewed_long_2_bottom_mane_connector_individual = neck_lean_ewed_long_2_bottom_mane_connector.addOrReplaceChild("neck_lean_ewed_long_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.6751F, 0.5345F));

            PartDefinition cube_r8 = neck_lean_ewed_long_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(993, 835).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.3501F, -3.8311F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_long_2_bottom_mane_connector2 = neck_lean_ewed_long_2_bottom_mane_connector.addOrReplaceChild("neck_lean_ewed_long_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));

            PartDefinition neck_lean_ewed_long_2_bottom_mane_connector2_individual = neck_lean_ewed_long_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_ewed_long_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.2827F, 0.1221F));

            PartDefinition cube_r9 = neck_lean_ewed_long_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(993, 849).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0536F, -4.2338F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_ewed_long_2_bottom_mane_flow = neck_lean_ewed_long_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_ewed_long_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.3575F, 0.0894F));

            PartDefinition cube_r10 = neck_lean_ewed_long_2_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(976, 842).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("average") && length.equals("short") && variation == 1) {
            PartDefinition neck_average_ewed_short_1 = partdefinition.addOrReplaceChild("neck_average_ewed_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_average_ewed_short_1_individual = neck_average_ewed_short_1.addOrReplaceChild("neck_average_ewed_short_1_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, 0.9475F, 0.991F));

            PartDefinition neck_average_ewed_short_1_crest = neck_average_ewed_short_1_individual.addOrReplaceChild("neck_average_ewed_short_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -6.4358F, -1.9665F));

            PartDefinition neck_average_ewed_short_1_crest_upper = neck_average_ewed_short_1_crest.addOrReplaceChild("neck_average_ewed_short_1_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.1897F, -1.0014F, -0.8109F));

            PartDefinition cube_r1 = neck_average_ewed_short_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(366, 741).addBox(-3.08F, -4.0F, -2.92F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.08F, 0.3935F, 0.4677F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_short_1_crest_lower = neck_average_ewed_short_1_crest.addOrReplaceChild("neck_average_ewed_short_1_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1171F, 1.3327F, 1.2108F));

            PartDefinition cube_r2 = neck_average_ewed_short_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(382, 741).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 3.3225F, 2.2288F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_short_1_middle_individual = neck_average_ewed_short_1_individual.addOrReplaceChild("neck_average_ewed_short_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.0698F, -4.1346F, -2.924F));

            PartDefinition cube_r3 = neck_average_ewed_short_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(362, 730).addBox(-4.0F, -8.0F, -1.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 4.2598F, 1.7619F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_short_1_lower_individual = neck_average_ewed_short_1_individual.addOrReplaceChild("neck_average_ewed_short_1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0251F, -2.9078F, -3.6503F));

            PartDefinition cube_r4 = neck_average_ewed_short_1_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(380, 730).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 4.6309F, 0.1038F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_short_1_mane = neck_average_ewed_short_1.addOrReplaceChild("neck_average_ewed_short_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -6.7039F, 0.0F));

            PartDefinition neck_average_ewed_short_1_top_mane = neck_average_ewed_short_1_mane.addOrReplaceChild("neck_average_ewed_short_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -1.2872F, -0.9755F));

            PartDefinition neck_average_ewed_short_1_top_mane_connector = neck_average_ewed_short_1_top_mane.addOrReplaceChild("neck_average_ewed_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.8045F, -1.162F));

            PartDefinition neck_average_ewed_short_1_top_mane_connector_individual = neck_average_ewed_short_1_top_mane_connector.addOrReplaceChild("neck_average_ewed_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, -0.0147F, 0.1266F));

            PartDefinition cube_r5 = neck_average_ewed_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(725, 844).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8192F, -0.5736F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_short_1_top_mane_connector2 = neck_average_ewed_short_1_top_mane_connector.addOrReplaceChild("neck_average_ewed_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.4469F, 0.8045F));

            PartDefinition neck_average_ewed_short_1_top_mane_connector2_individual = neck_average_ewed_short_1_top_mane_connector2.addOrReplaceChild("neck_average_ewed_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.9665F, 0.0227F, -0.391F));

            PartDefinition cube_r6 = neck_average_ewed_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(725, 850).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2287F, -0.8604F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_short_1_top_mane_flow = neck_average_ewed_short_1_top_mane_connector2.addOrReplaceChild("neck_average_ewed_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0559F, -0.3575F, 0.0894F, -0.1309F, 0.0F, 0.0F));

            PartDefinition cube_r7 = neck_average_ewed_short_1_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(713, 844).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6257F, -0.4463F, -0.7381F, -0.4276F, -0.2206F, -0.3514F));

            PartDefinition neck_average_ewed_short_1_bottom_mane = neck_average_ewed_short_1_mane.addOrReplaceChild("neck_average_ewed_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 1.1263F, 0.8122F));

            PartDefinition neck_average_ewed_short_1_bottom_mane_connector = neck_average_ewed_short_1_bottom_mane.addOrReplaceChild("neck_average_ewed_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

            PartDefinition neck_average_ewed_short_1_bottom_mane_connector_individual = neck_average_ewed_short_1_bottom_mane_connector.addOrReplaceChild("neck_average_ewed_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 0.3678F, 0.2301F));

            PartDefinition cube_r8 = neck_average_ewed_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(733, 845).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9534F, -3.5267F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_short_1_bottom_mane_connector2 = neck_average_ewed_short_1_bottom_mane_connector.addOrReplaceChild("neck_average_ewed_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.7151F, 0.6257F));

            PartDefinition neck_average_ewed_short_1_bottom_mane_connector2_individual = neck_average_ewed_short_1_bottom_mane_connector2.addOrReplaceChild("neck_average_ewed_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.6905F, -0.0035F));

            PartDefinition cube_r9 = neck_average_ewed_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(732, 854).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6569F, -3.9295F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_short_1_bottom_mane_flow = neck_average_ewed_short_1_bottom_mane_connector2.addOrReplaceChild("neck_average_ewed_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.6983F, 0.3575F, 0.3575F));

            PartDefinition cube_r10 = neck_average_ewed_short_1_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(716, 848).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.8939F, -0.4469F, -0.8901F, -0.0927F, -0.1377F));

        } else if (muscleMass.equals("average") && length.equals("short") && variation == 2) {
            PartDefinition neck_average_ewed_average_1 = partdefinition.addOrReplaceChild("neck_average_ewed_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_average_ewed_average_1_individual = neck_average_ewed_average_1.addOrReplaceChild("neck_average_ewed_average_1_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, -0.5721F, 0.0971F));

            PartDefinition neck_average_ewed_average_1_crest = neck_average_ewed_average_1_individual.addOrReplaceChild("neck_average_ewed_average_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -5.8101F, -1.9665F));

            PartDefinition neck_average_ewed_average_1_crest_upper = neck_average_ewed_average_1_crest.addOrReplaceChild("neck_average_ewed_average_1_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.0277F, -1.6271F, -0.9897F));

            PartDefinition cube_r1 = neck_average_ewed_average_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(478, 743).addBox(-4.08F, -4.0F, -2.92F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 0.3935F, 0.3783F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_average_1_crest_lower = neck_average_ewed_average_1_crest.addOrReplaceChild("neck_average_ewed_average_1_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1171F, 1.5262F, 1.7844F));

            PartDefinition cube_r2 = neck_average_ewed_average_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(494, 743).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 2.5033F, 1.6552F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_average_1_middle_individual = neck_average_ewed_average_1_individual.addOrReplaceChild("neck_average_ewed_average_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.0698F, -3.3155F, -2.3504F));

            PartDefinition cube_r3 = neck_average_ewed_average_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(477, 730).addBox(-4.0F, -8.0F, -1.0F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 3.4406F, 1.1884F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_average_1_lower_individual = neck_average_ewed_average_1_individual.addOrReplaceChild("neck_average_ewed_average_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0643F, -1.9419F, -3.3914F));

            PartDefinition cube_r4 = neck_average_ewed_average_1_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(495, 730).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 3.665F, -0.155F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_average_1_mane = neck_average_ewed_average_1.addOrReplaceChild("neck_average_ewed_average_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.2402F, 0.0F));

            PartDefinition neck_average_ewed_average_1_top_mane = neck_average_ewed_average_1_mane.addOrReplaceChild("neck_average_ewed_average_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -2.0022F, -0.9755F));

            PartDefinition neck_average_ewed_average_1_top_mane_connector = neck_average_ewed_average_1_top_mane.addOrReplaceChild("neck_average_ewed_average_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.5196F, -1.5196F));

            PartDefinition neck_average_ewed_average_1_top_mane_connector_individual = neck_average_ewed_average_1_top_mane_connector.addOrReplaceChild("neck_average_ewed_average_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.395F, -0.7819F));

            PartDefinition cube_r5 = neck_average_ewed_average_1_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(820, 844).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3927F, 0.2456F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_average_1_top_mane_connector2 = neck_average_ewed_average_1_top_mane_connector.addOrReplaceChild("neck_average_ewed_average_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

            PartDefinition neck_average_ewed_average_1_top_mane_connector2_individual = neck_average_ewed_average_1_top_mane_connector2.addOrReplaceChild("neck_average_ewed_average_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.2536F, -0.4057F));

            PartDefinition cube_r6 = neck_average_ewed_average_1_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(820, 850).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8023F, -0.0412F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_average_1_top_mane_flow = neck_average_ewed_average_1_top_mane_connector2.addOrReplaceChild("neck_average_ewed_average_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, -0.0894F, -0.1309F, 0.0F, 0.0F));

            PartDefinition cube_r7 = neck_average_ewed_average_1_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(807, 844).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4712F, -0.2206F, -0.3514F));

            PartDefinition neck_average_ewed_average_1_bottom_mane = neck_average_ewed_average_1_mane.addOrReplaceChild("neck_average_ewed_average_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 1.0369F, 0.8122F));

            PartDefinition neck_average_ewed_average_1_bottom_mane_connector = neck_average_ewed_average_1_bottom_mane.addOrReplaceChild("neck_average_ewed_average_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_average_ewed_average_1_bottom_mane_connector_individual = neck_average_ewed_average_1_bottom_mane_connector.addOrReplaceChild("neck_average_ewed_average_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.5149F, -0.3787F));

            PartDefinition cube_r8 = neck_average_ewed_average_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(828, 841).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.16F, -2.9179F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_average_1_bottom_mane_connector2 = neck_average_ewed_average_1_bottom_mane_connector.addOrReplaceChild("neck_average_ewed_average_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -1.4302F, 0.0894F));

            PartDefinition neck_average_ewed_average_1_bottom_mane_connector2_individual = neck_average_ewed_average_1_bottom_mane_connector2.addOrReplaceChild("neck_average_ewed_average_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.5228F, -0.076F));

            PartDefinition cube_r9 = neck_average_ewed_average_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(828, 852).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.8636F, -3.3207F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_average_1_bottom_mane_flow = neck_average_ewed_average_1_bottom_mane_connector2.addOrReplaceChild("neck_average_ewed_average_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, 0.3575F, 0.2682F));

            PartDefinition cube_r10 = neck_average_ewed_average_1_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(808, 846).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2682F, 0.1788F, -0.8901F, -0.0927F, -0.1377F));

        } else if (muscleMass.equals("average") && length.equals("average") && variation == 1) {
            PartDefinition neck_average_ewed_average_2 = partdefinition.addOrReplaceChild("neck_average_ewed_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_average_ewed_average_2_individual = neck_average_ewed_average_2.addOrReplaceChild("neck_average_ewed_average_2_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, -0.9296F, -0.4392F));

            PartDefinition neck_average_ewed_average_2_crest = neck_average_ewed_average_2_individual.addOrReplaceChild("neck_average_ewed_average_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.1117F, -0.9832F));

            PartDefinition neck_average_ewed_average_2_crest_upper = neck_average_ewed_average_2_crest.addOrReplaceChild("neck_average_ewed_average_2_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.2065F, -3.3254F, -1.9729F));

            PartDefinition cube_r1 = neck_average_ewed_average_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(533, 744).addBox(-4.08F, -4.0F, -2.92F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 0.3935F, 0.3783F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_average_2_crest_lower = neck_average_ewed_average_2_crest.addOrReplaceChild("neck_average_ewed_average_2_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1171F, 0.2374F, 1.0879F));

            PartDefinition cube_r2 = neck_average_ewed_average_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(549, 744).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 2.0938F, 1.3684F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_average_2_middle_individual = neck_average_ewed_average_2_individual.addOrReplaceChild("neck_average_ewed_average_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1592F, -2.9059F, -2.0636F));

            PartDefinition cube_r3 = neck_average_ewed_average_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(532, 730).addBox(-4.0F, -8.0F, -1.0F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 3.031F, 0.9016F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_average_2_lower_individual = neck_average_ewed_average_2_individual.addOrReplaceChild("neck_average_ewed_average_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1537F, -1.4589F, -3.262F));

            PartDefinition cube_r4 = neck_average_ewed_average_2_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(550, 730).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 3.182F, -0.2844F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_average_2_mane = neck_average_ewed_average_2.addOrReplaceChild("neck_average_ewed_average_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.419F, -1.0726F));

            PartDefinition neck_average_ewed_average_2_top_mane = neck_average_ewed_average_2_mane.addOrReplaceChild("neck_average_ewed_average_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -1.9128F, -1.6906F));

            PartDefinition neck_average_ewed_average_2_top_mane_connector = neck_average_ewed_average_2_top_mane.addOrReplaceChild("neck_average_ewed_average_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.7877F, -0.2682F));

            PartDefinition neck_average_ewed_average_2_top_mane_connector_individual = neck_average_ewed_average_2_top_mane_connector.addOrReplaceChild("neck_average_ewed_average_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.395F, -0.7819F));

            PartDefinition cube_r5 = neck_average_ewed_average_2_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(871, 844).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3927F, 0.2456F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_average_2_top_mane_connector2 = neck_average_ewed_average_2_top_mane_connector.addOrReplaceChild("neck_average_ewed_average_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

            PartDefinition neck_average_ewed_average_2_top_mane_connector2_individual = neck_average_ewed_average_2_top_mane_connector2.addOrReplaceChild("neck_average_ewed_average_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.2536F, -0.4057F));

            PartDefinition cube_r6 = neck_average_ewed_average_2_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(871, 850).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8023F, -0.0412F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_average_2_top_mane_flow = neck_average_ewed_average_2_top_mane_connector2.addOrReplaceChild("neck_average_ewed_average_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, -0.0894F, -0.1309F, 0.0F, 0.0F));

            PartDefinition cube_r7 = neck_average_ewed_average_2_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(859, 844).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4712F, -0.2206F, -0.3514F));

            PartDefinition neck_average_ewed_average_2_bottom_mane = neck_average_ewed_average_2_mane.addOrReplaceChild("neck_average_ewed_average_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 0.8581F, 1.3485F));

            PartDefinition neck_average_ewed_average_2_bottom_mane_connector = neck_average_ewed_average_2_bottom_mane.addOrReplaceChild("neck_average_ewed_average_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_average_ewed_average_2_bottom_mane_connector_individual = neck_average_ewed_average_2_bottom_mane_connector.addOrReplaceChild("neck_average_ewed_average_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.1182F, -0.0743F));

            PartDefinition cube_r8 = neck_average_ewed_average_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(883, 839).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5567F, -3.2223F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_average_2_bottom_mane_connector2 = neck_average_ewed_average_2_bottom_mane_connector.addOrReplaceChild("neck_average_ewed_average_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -1.4302F, 0.0894F));

            PartDefinition neck_average_ewed_average_2_bottom_mane_connector2_individual = neck_average_ewed_average_2_bottom_mane_connector2.addOrReplaceChild("neck_average_ewed_average_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(-0.1788F, 5.3631F, -2.5028F));

            PartDefinition cube_r9 = neck_average_ewed_average_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(881, 851).addBox(-1.0F, -0.5F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.324F, -4.4436F, 2.7312F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_average_2_bottom_mane_flow = neck_average_ewed_average_2_bottom_mane_connector2.addOrReplaceChild("neck_average_ewed_average_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, 0.3575F, 0.2682F));

            PartDefinition cube_r10 = neck_average_ewed_average_2_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(859, 845).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2682F, 0.1788F, -0.8901F, -0.0927F, -0.1377F));

        } else if (muscleMass.equals("average") && length.equals("average") && variation == 2) {
            PartDefinition neck_average_ewed_short_2 = partdefinition.addOrReplaceChild("neck_average_ewed_short_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_average_ewed_short_2_individual = neck_average_ewed_short_2.addOrReplaceChild("neck_average_ewed_short_2_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, 0.0536F, 0.0077F));

            PartDefinition neck_average_ewed_short_2_crest = neck_average_ewed_short_2_individual.addOrReplaceChild("neck_average_ewed_short_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -5.4525F, -1.5196F));

            PartDefinition neck_average_ewed_short_2_crest_upper = neck_average_ewed_short_2_crest.addOrReplaceChild("neck_average_ewed_short_2_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.1897F, -1.9846F, -1.1685F));

            PartDefinition cube_r1 = neck_average_ewed_short_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(420, 742).addBox(-3.08F, -4.0F, -2.92F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.08F, 0.3935F, 0.3783F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_short_2_crest_lower = neck_average_ewed_short_2_crest.addOrReplaceChild("neck_average_ewed_short_2_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1171F, 0.759F, 1.0506F));

            PartDefinition cube_r2 = neck_average_ewed_short_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(436, 742).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 2.9129F, 1.942F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_short_2_middle_individual = neck_average_ewed_short_2_individual.addOrReplaceChild("neck_average_ewed_short_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.0698F, -3.725F, -2.6372F));

            PartDefinition cube_r3 = neck_average_ewed_short_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(417, 730).addBox(-4.0F, -8.0F, -1.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 3.8502F, 1.4752F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_short_2_lower_individual = neck_average_ewed_short_2_individual.addOrReplaceChild("neck_average_ewed_short_2_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0251F, -2.4249F, -3.5209F));

            PartDefinition cube_r4 = neck_average_ewed_short_2_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(435, 730).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 4.148F, -0.0256F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_short_2_mane = neck_average_ewed_short_2.addOrReplaceChild("neck_average_ewed_short_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.6872F, 0.0F));

            PartDefinition neck_average_ewed_short_2_top_mane = neck_average_ewed_short_2_mane.addOrReplaceChild("neck_average_ewed_short_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -0.3933F, -0.9755F));

            PartDefinition neck_average_ewed_short_2_top_mane_connector = neck_average_ewed_short_2_top_mane.addOrReplaceChild("neck_average_ewed_short_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -1.6983F, -1.8771F));

            PartDefinition neck_average_ewed_short_2_top_mane_connector_individual = neck_average_ewed_short_2_top_mane_connector.addOrReplaceChild("neck_average_ewed_short_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, -0.0147F, 0.1266F));

            PartDefinition cube_r5 = neck_average_ewed_short_2_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(772, 844).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8192F, -0.5736F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_short_2_top_mane_connector2 = neck_average_ewed_short_2_top_mane_connector.addOrReplaceChild("neck_average_ewed_short_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

            PartDefinition neck_average_ewed_short_2_top_mane_connector2_individual = neck_average_ewed_short_2_top_mane_connector2.addOrReplaceChild("neck_average_ewed_short_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.8771F, 0.0227F, -0.391F));

            PartDefinition cube_r6 = neck_average_ewed_short_2_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(772, 850).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2287F, -0.8604F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_short_2_top_mane_flow = neck_average_ewed_short_2_top_mane_connector2.addOrReplaceChild("neck_average_ewed_short_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, -0.3575F, 0.0894F, -0.1309F, 0.0F, 0.0F));

            PartDefinition cube_r7 = neck_average_ewed_short_2_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(760, 844).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.4276F, -0.2206F, -0.3514F));

            PartDefinition neck_average_ewed_short_2_bottom_mane = neck_average_ewed_short_2_mane.addOrReplaceChild("neck_average_ewed_short_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 2.1095F, 0.8122F));

            PartDefinition neck_average_ewed_short_2_bottom_mane_connector = neck_average_ewed_short_2_bottom_mane.addOrReplaceChild("neck_average_ewed_short_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

            PartDefinition neck_average_ewed_short_2_bottom_mane_connector_individual = neck_average_ewed_short_2_bottom_mane_connector.addOrReplaceChild("neck_average_ewed_short_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, -0.0288F, -0.0743F));

            PartDefinition cube_r8 = neck_average_ewed_short_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(780, 843).addBox(-2.0F, -2.0F, -0.01F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5567F, -3.2223F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_short_2_bottom_mane_connector2 = neck_average_ewed_short_2_bottom_mane_connector.addOrReplaceChild("neck_average_ewed_short_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.7151F, 0.6257F));

            PartDefinition neck_average_ewed_short_2_bottom_mane_connector2_individual = neck_average_ewed_short_2_bottom_mane_connector2.addOrReplaceChild("neck_average_ewed_short_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.2938F, -0.3079F));

            PartDefinition cube_r9 = neck_average_ewed_short_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(780, 853).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2603F, -3.6251F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_short_2_bottom_mane_flow = neck_average_ewed_short_2_bottom_mane_connector2.addOrReplaceChild("neck_average_ewed_short_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.6983F, -0.2682F, -0.0894F));

            PartDefinition cube_r10 = neck_average_ewed_short_2_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(762, 847).addBox(-0.8139F, -0.0002F, -3.3921F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2682F, 0.0F, -0.8901F, -0.0927F, -0.1377F));

        } else if (muscleMass.equals("average") && length.equals("long") && variation == 1) {
            PartDefinition neck_average_ewed_long_1 = partdefinition.addOrReplaceChild("neck_average_ewed_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_average_ewed_long_1_individual = neck_average_ewed_long_1.addOrReplaceChild("neck_average_ewed_long_1_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, -1.1084F, -0.4392F));

            PartDefinition neck_average_ewed_long_1_crest = neck_average_ewed_long_1_individual.addOrReplaceChild("neck_average_ewed_long_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -5.7207F, -1.162F));

            PartDefinition neck_average_ewed_long_1_crest_upper = neck_average_ewed_long_1_crest.addOrReplaceChild("neck_average_ewed_long_1_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.1359F, -2.6322F, -1.4791F));

            PartDefinition cube_r1 = neck_average_ewed_long_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(593, 743).addBox(-4.0792F, -4.0F, -2.8908F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, 0.4175F, 0.0934F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_long_1_crest_lower = neck_average_ewed_long_1_crest.addOrReplaceChild("neck_average_ewed_long_1_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1171F, 1.2727F, 1.5535F));

            PartDefinition cube_r2 = neck_average_ewed_long_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(609, 743).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 1.6842F, 1.0816F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_long_1_middle_individual = neck_average_ewed_long_1_individual.addOrReplaceChild("neck_average_ewed_long_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1592F, -3.4796F, -1.7768F));

            PartDefinition cube_r3 = neck_average_ewed_long_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(592, 728).addBox(-4.0F, -8.0F, -1.0F, 5.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 2.6215F, 0.6148F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_long_1_lower_individual = neck_average_ewed_long_1_individual.addOrReplaceChild("neck_average_ewed_long_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1537F, -1.9592F, -3.1326F));

            PartDefinition cube_r4 = neck_average_ewed_long_1_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(610, 728).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 2.6991F, -0.4138F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_long_1_mane = neck_average_ewed_long_1.addOrReplaceChild("neck_average_ewed_long_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.8659F, 0.0F));

            PartDefinition neck_average_ewed_long_1_top_mane = neck_average_ewed_long_1_mane.addOrReplaceChild("neck_average_ewed_long_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -2.3598F, -1.5118F));

            PartDefinition neck_average_ewed_long_1_top_mane_connector = neck_average_ewed_long_1_top_mane.addOrReplaceChild("neck_average_ewed_long_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -2.0559F, -1.5196F));

            PartDefinition neck_average_ewed_long_1_top_mane_connector_individual = neck_average_ewed_long_1_top_mane_connector.addOrReplaceChild("neck_average_ewed_long_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.395F, -0.7819F));

            PartDefinition cube_r5 = neck_average_ewed_long_1_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(930, 842).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3927F, 0.2456F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_long_1_top_mane_connector2 = neck_average_ewed_long_1_top_mane_connector.addOrReplaceChild("neck_average_ewed_long_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

            PartDefinition neck_average_ewed_long_1_top_mane_connector2_individual = neck_average_ewed_long_1_top_mane_connector2.addOrReplaceChild("neck_average_ewed_long_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.2536F, -0.4057F));

            PartDefinition cube_r6 = neck_average_ewed_long_1_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(930, 850).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8023F, -0.0412F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_long_1_top_mane_flow = neck_average_ewed_long_1_top_mane_connector2.addOrReplaceChild("neck_average_ewed_long_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, -0.0894F, -0.1309F, 0.0F, 0.0F));

            PartDefinition cube_r7 = neck_average_ewed_long_1_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(918, 844).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4712F, -0.2206F, -0.3514F));

            PartDefinition neck_average_ewed_long_1_bottom_mane = neck_average_ewed_long_1_mane.addOrReplaceChild("neck_average_ewed_long_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 0.143F, 0.2759F));

            PartDefinition neck_average_ewed_long_1_bottom_mane_connector = neck_average_ewed_long_1_bottom_mane.addOrReplaceChild("neck_average_ewed_long_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_average_ewed_long_1_bottom_mane_connector_individual = neck_average_ewed_long_1_bottom_mane_connector.addOrReplaceChild("neck_average_ewed_long_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.2784F, 0.2301F));

            PartDefinition cube_r8 = neck_average_ewed_long_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(941, 837).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9534F, -3.5267F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_long_1_bottom_mane_connector2 = neck_average_ewed_long_1_bottom_mane_connector.addOrReplaceChild("neck_average_ewed_long_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));

            PartDefinition neck_average_ewed_long_1_bottom_mane_connector2_individual = neck_average_ewed_long_1_bottom_mane_connector2.addOrReplaceChild("neck_average_ewed_long_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, -0.114F, -0.1823F));

            PartDefinition cube_r9 = neck_average_ewed_long_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(941, 850).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6569F, -3.9295F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_long_1_bottom_mane_flow = neck_average_ewed_long_1_bottom_mane_connector2.addOrReplaceChild("neck_average_ewed_long_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.3575F, 0.0894F));

            PartDefinition cube_r10 = neck_average_ewed_long_1_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(917, 844).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("average") && length.equals("long") && variation == 2) {
            PartDefinition neck_average_ewed_long_2 = partdefinition.addOrReplaceChild("neck_average_ewed_long_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_average_ewed_long_2_individual = neck_average_ewed_long_2.addOrReplaceChild("neck_average_ewed_long_2_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, -2.8067F, -1.0649F));

            PartDefinition neck_average_ewed_long_2_crest = neck_average_ewed_long_2_individual.addOrReplaceChild("neck_average_ewed_long_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.2905F, 0.0F));

            PartDefinition neck_average_ewed_long_2_crest_upper = neck_average_ewed_long_2_crest.addOrReplaceChild("neck_average_ewed_long_2_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.1359F, -3.072F, -2.903F));

            PartDefinition cube_r1 = neck_average_ewed_long_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(645, 744).addBox(-4.0792F, -4.0F, -2.8908F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, 0.4175F, 0.3615F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_long_2_crest_lower = neck_average_ewed_long_2_crest.addOrReplaceChild("neck_average_ewed_long_2_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1171F, 1.2353F, 0.6782F));

            PartDefinition cube_r2 = neck_average_ewed_long_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(661, 744).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 1.2746F, 0.7948F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_long_2_middle_individual = neck_average_ewed_long_2_individual.addOrReplaceChild("neck_average_ewed_long_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1592F, -2.0867F, -1.49F));

            PartDefinition cube_r3 = neck_average_ewed_long_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(643, 728).addBox(-4.0F, -8.0F, -1.0F, 5.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 2.2119F, 0.328F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_long_2_lower_individual = neck_average_ewed_long_2_individual.addOrReplaceChild("neck_average_ewed_long_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0643F, -0.493F, -3.0032F));

            PartDefinition cube_r4 = neck_average_ewed_long_2_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(661, 728).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 2.2161F, -0.5432F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_long_2_mane = neck_average_ewed_long_2.addOrReplaceChild("neck_average_ewed_long_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.4916F, -1.0726F));

            PartDefinition neck_average_ewed_long_2_top_mane = neck_average_ewed_long_2_mane.addOrReplaceChild("neck_average_ewed_long_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -2.8961F, -1.0649F));

            PartDefinition neck_average_ewed_long_2_top_mane_connector = neck_average_ewed_long_2_top_mane.addOrReplaceChild("neck_average_ewed_long_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.6089F, -1.5196F));

            PartDefinition neck_average_ewed_long_2_top_mane_connector_individual = neck_average_ewed_long_2_top_mane_connector.addOrReplaceChild("neck_average_ewed_long_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.395F, -0.7819F));

            PartDefinition cube_r5 = neck_average_ewed_long_2_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(993, 841).mirror().addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 1.3927F, 0.2456F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_long_2_top_mane_connector2 = neck_average_ewed_long_2_top_mane_connector.addOrReplaceChild("neck_average_ewed_long_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

            PartDefinition neck_average_ewed_long_2_top_mane_connector2_individual = neck_average_ewed_long_2_top_mane_connector2.addOrReplaceChild("neck_average_ewed_long_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.2536F, -0.4057F));

            PartDefinition cube_r6 = neck_average_ewed_long_2_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(990, 849).mirror().addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 1.8023F, -0.0412F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_long_2_top_mane_flow = neck_average_ewed_long_2_top_mane_connector2.addOrReplaceChild("neck_average_ewed_long_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, -0.0894F, -0.1309F, 0.0F, 0.0F));

            PartDefinition cube_r7 = neck_average_ewed_long_2_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(978, 843).mirror().addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4712F, -0.2206F, -0.3514F));

            PartDefinition neck_average_ewed_long_2_bottom_mane = neck_average_ewed_long_2_mane.addOrReplaceChild("neck_average_ewed_long_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 0.0536F, 0.7228F));

            PartDefinition neck_average_ewed_long_2_bottom_mane_connector = neck_average_ewed_long_2_bottom_mane.addOrReplaceChild("neck_average_ewed_long_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_average_ewed_long_2_bottom_mane_connector_individual = neck_average_ewed_long_2_bottom_mane_connector.addOrReplaceChild("neck_average_ewed_long_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.6751F, 0.5345F));

            PartDefinition cube_r8 = neck_average_ewed_long_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(993, 835).mirror().addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -3.3501F, -3.8311F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_long_2_bottom_mane_connector2 = neck_average_ewed_long_2_bottom_mane_connector.addOrReplaceChild("neck_average_ewed_long_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));

            PartDefinition neck_average_ewed_long_2_bottom_mane_connector2_individual = neck_average_ewed_long_2_bottom_mane_connector2.addOrReplaceChild("neck_average_ewed_long_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.2827F, 0.1221F));

            PartDefinition cube_r9 = neck_average_ewed_long_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(993, 849).mirror().addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -3.0536F, -4.2338F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_ewed_long_2_bottom_mane_flow = neck_average_ewed_long_2_bottom_mane_connector2.addOrReplaceChild("neck_average_ewed_long_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.3575F, 0.0894F));

            PartDefinition cube_r10 = neck_average_ewed_long_2_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(976, 842).mirror().addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("muscular") && length.equals("short") && variation == 1) {
            PartDefinition neck_muscular_ewed_short_1 = partdefinition.addOrReplaceChild("neck_muscular_ewed_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_muscular_ewed_short_1_individual = neck_muscular_ewed_short_1.addOrReplaceChild("neck_muscular_ewed_short_1_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, 0.9475F, 0.991F));

            PartDefinition cube_r1 = neck_muscular_ewed_short_1_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(364, 777).addBox(-4.08F, -4.0F, -2.92F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.516F, -7.0436F, -2.3097F, 0.9599F, 0.0F, 0.0F));

            PartDefinition cube_r2 = neck_muscular_ewed_short_1_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(380, 766).addBox(-6.0784F, -8.0F, -0.9017F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5504F, 1.7231F, -3.5465F, 0.2618F, 0.0F, 0.0F));

            PartDefinition cube_r3 = neck_muscular_ewed_short_1_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(382, 777).addBox(-5.08F, -7.0F, -0.92F, 5.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4992F, -1.7806F, 1.4731F, 0.6109F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_muscular_ewed_short_1_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(360, 766).addBox(-5.0F, -8.0F, -1.0F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9665F, 0.1251F, -1.162F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_short_1_mane = neck_muscular_ewed_short_1.addOrReplaceChild("neck_muscular_ewed_short_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.3296F, 0.0F));

            PartDefinition neck_muscular_ewed_short_1_top_mane = neck_muscular_ewed_short_1_mane.addOrReplaceChild("neck_muscular_ewed_short_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -1.2872F, -0.9755F));

            PartDefinition neck_muscular_ewed_short_1_top_mane_connector = neck_muscular_ewed_short_1_top_mane.addOrReplaceChild("neck_muscular_ewed_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.1788F, -1.162F));

            PartDefinition neck_muscular_ewed_short_1_top_mane_connector_individual = neck_muscular_ewed_short_1_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, -0.0147F, 0.1266F));

            PartDefinition cube_r5 = neck_muscular_ewed_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(725, 874).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8192F, -0.5736F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_short_1_top_mane_connector2 = neck_muscular_ewed_short_1_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.4469F, 0.8045F));

            PartDefinition neck_muscular_ewed_short_1_top_mane_connector2_individual = neck_muscular_ewed_short_1_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.4665F, 0.0227F, -0.391F));

            PartDefinition cube_r6 = neck_muscular_ewed_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(725, 880).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2287F, -0.8604F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_short_1_top_mane_flow = neck_muscular_ewed_short_1_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7709F, -0.3575F, 0.0894F, -0.1309F, 0.0F, 0.0F));

            PartDefinition cube_r7 = neck_muscular_ewed_short_1_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(713, 874).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, -0.4463F, -0.7381F, -0.4276F, -0.2206F, -0.3514F));

            PartDefinition neck_muscular_ewed_short_1_bottom_mane = neck_muscular_ewed_short_1_mane.addOrReplaceChild("neck_muscular_ewed_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 1.752F, 0.8122F));

            PartDefinition neck_muscular_ewed_short_1_bottom_mane_connector = neck_muscular_ewed_short_1_bottom_mane.addOrReplaceChild("neck_muscular_ewed_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

            PartDefinition neck_muscular_ewed_short_1_bottom_mane_connector_individual = neck_muscular_ewed_short_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 0.3678F, 0.2301F));

            PartDefinition cube_r8 = neck_muscular_ewed_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(735, 875).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9534F, -3.5267F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_short_1_bottom_mane_connector2 = neck_muscular_ewed_short_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.7151F, 0.6257F));

            PartDefinition neck_muscular_ewed_short_1_bottom_mane_connector2_individual = neck_muscular_ewed_short_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, 0.6905F, -0.0035F));

            PartDefinition cube_r9 = neck_muscular_ewed_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(732, 884).addBox(-2.0F, -2.0F, 1.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6569F, -3.9295F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_short_1_bottom_mane_flow = neck_muscular_ewed_short_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.5922F, 0.3575F, 0.3575F));

            PartDefinition cube_r10 = neck_muscular_ewed_short_1_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(716, 878).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7151F, -0.8939F, -0.4469F, -0.8901F, -0.0927F, -0.1377F));

        } else if (muscleMass.equals("muscular") && length.equals("short") && variation == 2) {
            PartDefinition neck_muscular_ewed_short_2 = partdefinition.addOrReplaceChild("neck_muscular_ewed_short_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_muscular_ewed_short_2_individual = neck_muscular_ewed_short_2.addOrReplaceChild("neck_muscular_ewed_short_2_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, 0.0536F, 0.0077F));

            PartDefinition neck_muscular_ewed_short_2_crest = neck_muscular_ewed_short_2_individual.addOrReplaceChild("neck_muscular_ewed_short_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -5.8101F, -1.5196F));

            PartDefinition neck_muscular_ewed_short_2_crest_upper = neck_muscular_ewed_short_2_crest.addOrReplaceChild("neck_muscular_ewed_short_2_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.064F, -1.6271F, -1.2578F));

            PartDefinition cube_r1 = neck_muscular_ewed_short_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(417, 777).addBox(-4.08F, -4.0F, -2.92F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 0.3935F, 0.4677F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_short_2_crest_lower = neck_muscular_ewed_short_2_crest.addOrReplaceChild("neck_muscular_ewed_short_2_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.0808F, 1.1166F, 1.0506F));

            PartDefinition cube_r2 = neck_muscular_ewed_short_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(435, 777).addBox(-5.08F, -7.0F, -0.92F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 2.9129F, 1.942F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_short_2_middle_individual = neck_muscular_ewed_short_2_individual.addOrReplaceChild("neck_muscular_ewed_short_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1229F, -3.725F, -2.6372F));

            PartDefinition cube_r3 = neck_muscular_ewed_short_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(414, 765).addBox(-5.0F, -8.0F, -1.0F, 6.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 3.8502F, 1.4752F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_short_2_lower_individual = neck_muscular_ewed_short_2_individual.addOrReplaceChild("neck_muscular_ewed_short_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1174F, -2.4249F, -3.5209F));

            PartDefinition cube_r4 = neck_muscular_ewed_short_2_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(434, 765).addBox(-6.0784F, -8.0F, -0.9017F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 4.148F, -0.0256F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_short_2_mane = neck_muscular_ewed_short_2.addOrReplaceChild("neck_muscular_ewed_short_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.5978F, 0.0F));

            PartDefinition neck_muscular_ewed_short_2_top_mane = neck_muscular_ewed_short_2_mane.addOrReplaceChild("neck_muscular_ewed_short_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -0.3039F, -0.9755F));

            PartDefinition neck_muscular_ewed_short_2_top_mane_connector = neck_muscular_ewed_short_2_top_mane.addOrReplaceChild("neck_muscular_ewed_short_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -1.8771F, -1.8771F));

            PartDefinition neck_muscular_ewed_short_2_top_mane_connector_individual = neck_muscular_ewed_short_2_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_short_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, -0.0147F, 0.1266F));

            PartDefinition cube_r5 = neck_muscular_ewed_short_2_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(772, 874).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8192F, -0.5736F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_short_2_top_mane_connector2 = neck_muscular_ewed_short_2_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_short_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

            PartDefinition neck_muscular_ewed_short_2_top_mane_connector2_individual = neck_muscular_ewed_short_2_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_short_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.3771F, 0.0227F, -0.391F));

            PartDefinition cube_r6 = neck_muscular_ewed_short_2_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(772, 880).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2287F, -0.8604F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_short_2_top_mane_flow = neck_muscular_ewed_short_2_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_short_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4134F, -0.3575F, 0.0894F, -0.1309F, 0.0F, 0.0F));

            PartDefinition cube_r7 = neck_muscular_ewed_short_2_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(760, 874).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.4276F, -0.2206F, -0.3514F));

            PartDefinition neck_muscular_ewed_short_2_bottom_mane = neck_muscular_ewed_short_2_mane.addOrReplaceChild("neck_muscular_ewed_short_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 2.0201F, 0.8122F));

            PartDefinition neck_muscular_ewed_short_2_bottom_mane_connector = neck_muscular_ewed_short_2_bottom_mane.addOrReplaceChild("neck_muscular_ewed_short_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

            PartDefinition neck_muscular_ewed_short_2_bottom_mane_connector_individual = neck_muscular_ewed_short_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_short_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, -0.0288F, -0.0743F));

            PartDefinition cube_r8 = neck_muscular_ewed_short_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(782, 873).addBox(-2.0F, -2.0F, -0.01F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5567F, -3.2223F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_short_2_bottom_mane_connector2 = neck_muscular_ewed_short_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_short_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.7151F, 0.6257F));

            PartDefinition neck_muscular_ewed_short_2_bottom_mane_connector2_individual = neck_muscular_ewed_short_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_short_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, 0.2938F, -0.3079F));

            PartDefinition cube_r9 = neck_muscular_ewed_short_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(780, 883).addBox(-2.0F, -2.0F, 0.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.2603F, -3.6251F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_short_2_bottom_mane_flow = neck_muscular_ewed_short_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_short_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.5922F, -0.2682F, -0.0894F));

            PartDefinition cube_r10 = neck_muscular_ewed_short_2_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(762, 877).addBox(-0.8139F, -0.0002F, -3.3921F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2682F, 0.0F, -0.8901F, -0.0927F, -0.1377F));

        } else if (muscleMass.equals("muscular") && length.equals("average") && variation == 1) {
            PartDefinition neck_muscular_ewed_average_1 = partdefinition.addOrReplaceChild("neck_muscular_ewed_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_muscular_ewed_average_1_individual = neck_muscular_ewed_average_1.addOrReplaceChild("neck_muscular_ewed_average_1_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, -0.5721F, 0.0971F));

            PartDefinition neck_muscular_ewed_average_1_crest = neck_muscular_ewed_average_1_individual.addOrReplaceChild("neck_muscular_ewed_average_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.7374F, -1.0726F));

            PartDefinition neck_muscular_ewed_average_1_crest_upper = neck_muscular_ewed_average_1_crest.addOrReplaceChild("neck_muscular_ewed_average_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.0086F, -2.6997F, -1.8835F));

            PartDefinition cube_r1 = neck_muscular_ewed_average_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(474, 777).addBox(-5.08F, -4.0F, -2.92F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 0.3935F, 0.3783F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_average_1_crest_lower = neck_muscular_ewed_average_1_crest.addOrReplaceChild("neck_muscular_ewed_average_1_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.0808F, 0.4535F, 0.8905F));

            PartDefinition cube_r2 = neck_muscular_ewed_average_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(492, 777).addBox(-5.08F, -7.0F, -0.92F, 5.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 2.5033F, 1.6552F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_average_1_middle_individual = neck_muscular_ewed_average_1_individual.addOrReplaceChild("neck_muscular_ewed_average_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.0335F, -3.3155F, -2.3504F));

            PartDefinition cube_r3 = neck_muscular_ewed_average_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(473, 764).addBox(-5.0F, -8.0F, -1.0F, 6.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 3.4406F, 1.1884F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_average_1_lower_individual = neck_muscular_ewed_average_1_individual.addOrReplaceChild("neck_muscular_ewed_average_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.028F, -1.9419F, -3.3914F));

            PartDefinition cube_r4 = neck_muscular_ewed_average_1_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(493, 764).addBox(-6.0784F, -8.0F, -0.9017F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 3.665F, -0.155F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_average_1_mane = neck_muscular_ewed_average_1.addOrReplaceChild("neck_muscular_ewed_average_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.6872F, 0.0F));

            PartDefinition neck_muscular_ewed_average_1_top_mane = neck_muscular_ewed_average_1_mane.addOrReplaceChild("neck_muscular_ewed_average_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -1.1978F, -0.9755F));

            PartDefinition neck_muscular_ewed_average_1_top_mane_connector = neck_muscular_ewed_average_1_top_mane.addOrReplaceChild("neck_muscular_ewed_average_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.8771F, -1.5196F));

            PartDefinition neck_muscular_ewed_average_1_top_mane_connector_individual = neck_muscular_ewed_average_1_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_average_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.395F, -0.7819F));

            PartDefinition cube_r5 = neck_muscular_ewed_average_1_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(820, 874).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3927F, 0.2456F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_average_1_top_mane_connector2 = neck_muscular_ewed_average_1_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_average_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

            PartDefinition neck_muscular_ewed_average_1_top_mane_connector2_individual = neck_muscular_ewed_average_1_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_average_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.2536F, -0.4057F));

            PartDefinition cube_r6 = neck_muscular_ewed_average_1_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(820, 880).addBox(-2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8023F, -0.0412F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_average_1_top_mane_flow = neck_muscular_ewed_average_1_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_average_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5922F, 0.0F, -0.0894F, -0.1309F, 0.0F, 0.0F));

            PartDefinition cube_r7 = neck_muscular_ewed_average_1_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(808, 874).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4712F, -0.2206F, -0.3514F));

            PartDefinition neck_muscular_ewed_average_1_bottom_mane = neck_muscular_ewed_average_1_mane.addOrReplaceChild("neck_muscular_ewed_average_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 1.4838F, 0.8122F));

            PartDefinition neck_muscular_ewed_average_1_bottom_mane_connector = neck_muscular_ewed_average_1_bottom_mane.addOrReplaceChild("neck_muscular_ewed_average_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_muscular_ewed_average_1_bottom_mane_connector_individual = neck_muscular_ewed_average_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_average_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.5149F, -0.3787F));

            PartDefinition cube_r8 = neck_muscular_ewed_average_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(830, 871).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.16F, -2.9179F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_average_1_bottom_mane_connector2 = neck_muscular_ewed_average_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_average_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -1.4302F, 0.0894F));

            PartDefinition neck_muscular_ewed_average_1_bottom_mane_connector2_individual = neck_muscular_ewed_average_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_average_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.5228F, -0.076F));

            PartDefinition cube_r9 = neck_muscular_ewed_average_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(829, 882).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8636F, -3.3207F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_average_1_bottom_mane_flow = neck_muscular_ewed_average_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_average_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.4134F, 0.3575F, 0.2682F));

            PartDefinition cube_r10 = neck_muscular_ewed_average_1_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(809, 876).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2682F, 0.1788F, -0.8901F, -0.0927F, -0.1377F));

        } else if (muscleMass.equals("muscular") && length.equals("average") && variation == 2) {
            PartDefinition neck_muscular_ewed_average_2 = partdefinition.addOrReplaceChild("neck_muscular_ewed_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_muscular_ewed_average_2_individual = neck_muscular_ewed_average_2.addOrReplaceChild("neck_muscular_ewed_average_2_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, -0.9296F, -0.4392F));

            PartDefinition neck_muscular_ewed_average_2_crest = neck_muscular_ewed_average_2_individual.addOrReplaceChild("neck_muscular_ewed_average_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.7374F, -1.162F));

            PartDefinition neck_muscular_ewed_average_2_crest_upper = neck_muscular_ewed_average_2_crest.addOrReplaceChild("neck_muscular_ewed_average_2_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.1934F, -2.6439F, -1.8366F));

            PartDefinition cube_r1 = neck_muscular_ewed_average_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(529, 777).addBox(-5.0792F, -4.0F, -2.8908F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5792F, 0.4175F, 0.4509F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_average_2_crest_lower = neck_muscular_ewed_average_2_crest.addOrReplaceChild("neck_muscular_ewed_average_2_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1702F, 0.8631F, 1.2667F));

            PartDefinition cube_r2 = neck_muscular_ewed_average_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(547, 777).addBox(-5.08F, -7.0F, -0.92F, 5.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 2.0938F, 1.3684F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_average_2_middle_individual = neck_muscular_ewed_average_2_individual.addOrReplaceChild("neck_muscular_ewed_average_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.2123F, -2.9059F, -2.0636F));

            PartDefinition cube_r3 = neck_muscular_ewed_average_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(528, 763).addBox(-5.0F, -8.0F, -1.0F, 6.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 3.031F, 0.9016F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_average_2_lower_individual = neck_muscular_ewed_average_2_individual.addOrReplaceChild("neck_muscular_ewed_average_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.2068F, -1.4589F, -3.262F));

            PartDefinition cube_r4 = neck_muscular_ewed_average_2_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(548, 763).addBox(-6.0784F, -8.0F, -0.9017F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 3.182F, -0.2844F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_average_2_mane = neck_muscular_ewed_average_2.addOrReplaceChild("neck_muscular_ewed_average_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -6.9721F, 0.0F));

            PartDefinition neck_muscular_ewed_average_2_top_mane = neck_muscular_ewed_average_2_mane.addOrReplaceChild("neck_muscular_ewed_average_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -2.0022F, -1.5118F));

            PartDefinition neck_muscular_ewed_average_2_top_mane_connector = neck_muscular_ewed_average_2_top_mane.addOrReplaceChild("neck_muscular_ewed_average_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -2.1453F, -1.5196F));

            PartDefinition neck_muscular_ewed_average_2_top_mane_connector_individual = neck_muscular_ewed_average_2_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_average_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.395F, -0.7819F));

            PartDefinition cube_r5 = neck_muscular_ewed_average_2_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(871, 874).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3927F, 0.2456F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_average_2_top_mane_connector2 = neck_muscular_ewed_average_2_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_average_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

            PartDefinition neck_muscular_ewed_average_2_top_mane_connector2_individual = neck_muscular_ewed_average_2_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_average_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.2536F, -0.4057F));

            PartDefinition cube_r6 = neck_muscular_ewed_average_2_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(871, 880).addBox(-2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8023F, -0.0412F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_average_2_top_mane_flow = neck_muscular_ewed_average_2_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_average_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7709F, 0.0F, -0.0894F, -0.1309F, 0.0F, 0.0F));

            PartDefinition cube_r7 = neck_muscular_ewed_average_2_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(859, 874).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4712F, -0.2206F, -0.3514F));

            PartDefinition neck_muscular_ewed_average_2_bottom_mane = neck_muscular_ewed_average_2_mane.addOrReplaceChild("neck_muscular_ewed_average_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 0.4112F, 0.2759F));

            PartDefinition neck_muscular_ewed_average_2_bottom_mane_connector = neck_muscular_ewed_average_2_bottom_mane.addOrReplaceChild("neck_muscular_ewed_average_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_muscular_ewed_average_2_bottom_mane_connector_individual = neck_muscular_ewed_average_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_average_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.1182F, -0.0743F));

            PartDefinition cube_r8 = neck_muscular_ewed_average_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(883, 869).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5567F, -3.2223F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_average_2_bottom_mane_connector2 = neck_muscular_ewed_average_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_average_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -1.4302F, 0.0894F));

            PartDefinition neck_muscular_ewed_average_2_bottom_mane_connector2_individual = neck_muscular_ewed_average_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_average_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.9195F, 0.2284F));

            PartDefinition cube_r9 = neck_muscular_ewed_average_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(881, 881).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.2603F, -3.6251F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_average_2_bottom_mane_flow = neck_muscular_ewed_average_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_average_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.5028F, 0.3575F, 0.2682F));

            PartDefinition cube_r10 = neck_muscular_ewed_average_2_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(859, 875).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2682F, 0.1788F, -0.8901F, -0.0927F, -0.1377F));

        } else if (muscleMass.equals("muscular") && length.equals("long") && variation == 1) {
            PartDefinition neck_muscular_ewed_long_1 = partdefinition.addOrReplaceChild("neck_muscular_ewed_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_muscular_ewed_long_1_individual = neck_muscular_ewed_long_1.addOrReplaceChild("neck_muscular_ewed_long_1_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, -2.0916F, -0.4392F));

            PartDefinition neck_muscular_ewed_long_1_crest = neck_muscular_ewed_long_1_individual.addOrReplaceChild("neck_muscular_ewed_long_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -5.095F, -0.3575F));

            PartDefinition neck_muscular_ewed_long_1_crest_upper = neck_muscular_ewed_long_1_crest.addOrReplaceChild("neck_muscular_ewed_long_1_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.0996F, -2.2747F, -2.3729F));

            PartDefinition cube_r1 = neck_muscular_ewed_long_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(589, 777).addBox(-5.0792F, -4.0F, -2.8908F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5792F, 0.4175F, 0.1828F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_long_1_crest_lower = neck_muscular_ewed_long_1_crest.addOrReplaceChild("neck_muscular_ewed_long_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.0086F, 1.6302F, 0.749F));

            PartDefinition cube_r2 = neck_muscular_ewed_long_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(607, 777).addBox(-5.08F, -7.0F, -0.92F, 5.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 1.6842F, 1.0816F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_long_1_middle_individual = neck_muscular_ewed_long_1_individual.addOrReplaceChild("neck_muscular_ewed_long_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1229F, -2.4963F, -1.7768F));

            PartDefinition cube_r3 = neck_muscular_ewed_long_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(588, 762).addBox(-5.0F, -8.0F, -1.0F, 6.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 2.6215F, 0.6148F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_long_1_lower_individual = neck_muscular_ewed_long_1_individual.addOrReplaceChild("neck_muscular_ewed_long_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1174F, -0.976F, -3.1326F));

            PartDefinition cube_r4 = neck_muscular_ewed_long_1_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(608, 762).addBox(-6.0784F, -8.0F, -0.9017F, 5.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 2.6991F, -0.4138F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_long_1_mane = neck_muscular_ewed_long_1.addOrReplaceChild("neck_muscular_ewed_long_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.4022F, 0.0F));

            PartDefinition neck_muscular_ewed_long_1_top_mane = neck_muscular_ewed_long_1_mane.addOrReplaceChild("neck_muscular_ewed_long_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -2.3598F, -1.5118F));

            PartDefinition neck_muscular_ewed_long_1_top_mane_connector = neck_muscular_ewed_long_1_top_mane.addOrReplaceChild("neck_muscular_ewed_long_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.5196F, -1.5196F));

            PartDefinition neck_muscular_ewed_long_1_top_mane_connector_individual = neck_muscular_ewed_long_1_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_long_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.395F, -0.7819F));

            PartDefinition cube_r5 = neck_muscular_ewed_long_1_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(929, 874).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3927F, 0.2456F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_long_1_top_mane_connector2 = neck_muscular_ewed_long_1_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_long_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

            PartDefinition neck_muscular_ewed_long_1_top_mane_connector2_individual = neck_muscular_ewed_long_1_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_long_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.2536F, -0.4057F));

            PartDefinition cube_r6 = neck_muscular_ewed_long_1_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(929, 880).addBox(-2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8023F, -0.0412F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_long_1_top_mane_flow = neck_muscular_ewed_long_1_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_long_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8603F, 0.0F, -0.0894F, -0.1745F, 0.0F, 0.0F));

            PartDefinition cube_r7 = neck_muscular_ewed_long_1_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(917, 874).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4712F, -0.2206F, -0.3514F));

            PartDefinition neck_muscular_ewed_long_1_bottom_mane = neck_muscular_ewed_long_1_mane.addOrReplaceChild("neck_muscular_ewed_long_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 0.6793F, 0.2759F));

            PartDefinition neck_muscular_ewed_long_1_bottom_mane_connector = neck_muscular_ewed_long_1_bottom_mane.addOrReplaceChild("neck_muscular_ewed_long_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_muscular_ewed_long_1_bottom_mane_connector_individual = neck_muscular_ewed_long_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_long_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.2784F, 0.2301F));

            PartDefinition cube_r8 = neck_muscular_ewed_long_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(941, 867).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9534F, -3.5267F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_long_1_bottom_mane_connector2 = neck_muscular_ewed_long_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_long_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));

            PartDefinition neck_muscular_ewed_long_1_bottom_mane_connector2_individual = neck_muscular_ewed_long_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_long_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, -0.114F, -0.1823F));

            PartDefinition cube_r9 = neck_muscular_ewed_long_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(940, 880).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6569F, -3.9295F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_long_1_bottom_mane_flow = neck_muscular_ewed_long_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_long_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.324F, -0.3575F, 0.0894F));

            PartDefinition cube_r10 = neck_muscular_ewed_long_1_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(916, 874).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("muscular") && length.equals("long") && variation == 2) {
            PartDefinition neck_muscular_ewed_long_2 = partdefinition.addOrReplaceChild("neck_muscular_ewed_long_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_muscular_ewed_long_2_individual = neck_muscular_ewed_long_2.addOrReplaceChild("neck_muscular_ewed_long_2_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, -2.8067F, -1.0649F));

            PartDefinition neck_muscular_ewed_long_2_crest = neck_muscular_ewed_long_2_individual.addOrReplaceChild("neck_muscular_ewed_long_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -3.3966F, -2.1453F));

            PartDefinition neck_muscular_ewed_long_2_crest_upper = neck_muscular_ewed_long_2_crest.addOrReplaceChild("neck_muscular_ewed_long_2_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.0996F, -3.9659F, -0.8471F));

            PartDefinition cube_r1 = neck_muscular_ewed_long_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(642, 778).addBox(-5.0792F, -4.0F, -2.8908F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5792F, 0.4175F, 0.4509F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_long_2_crest_lower = neck_muscular_ewed_long_2_crest.addOrReplaceChild("neck_muscular_ewed_long_2_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.0808F, 0.3415F, 2.8235F));

            PartDefinition cube_r2 = neck_muscular_ewed_long_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(660, 778).addBox(-5.08F, -7.0F, -0.92F, 5.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 1.2746F, 0.7948F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_long_2_middle_individual = neck_muscular_ewed_long_2_individual.addOrReplaceChild("neck_muscular_ewed_long_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1229F, -2.0867F, -1.49F));

            PartDefinition cube_r3 = neck_muscular_ewed_long_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(640, 762).addBox(-5.0F, -8.0F, -1.0F, 6.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 2.2119F, 0.328F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_long_2_lower_individual = neck_muscular_ewed_long_2_individual.addOrReplaceChild("neck_muscular_ewed_long_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1174F, -0.493F, -3.0032F));

            PartDefinition cube_r4 = neck_muscular_ewed_long_2_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(660, 762).addBox(-6.0784F, -8.0F, -0.9017F, 5.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 2.2161F, -0.5432F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_long_2_mane = neck_muscular_ewed_long_2.addOrReplaceChild("neck_muscular_ewed_long_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.4916F, 0.0F));

            PartDefinition neck_muscular_ewed_long_2_top_mane = neck_muscular_ewed_long_2_mane.addOrReplaceChild("neck_muscular_ewed_long_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -2.9855F, -2.1375F));

            PartDefinition neck_muscular_ewed_long_2_top_mane_connector = neck_muscular_ewed_long_2_top_mane.addOrReplaceChild("neck_muscular_ewed_long_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.5196F, -1.5196F));

            PartDefinition neck_muscular_ewed_long_2_top_mane_connector_individual = neck_muscular_ewed_long_2_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_long_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.395F, -0.7819F));

            PartDefinition cube_r5 = neck_muscular_ewed_long_2_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(989, 870).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3927F, 0.2456F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_long_2_top_mane_connector2 = neck_muscular_ewed_long_2_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_long_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

            PartDefinition neck_muscular_ewed_long_2_top_mane_connector2_individual = neck_muscular_ewed_long_2_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_long_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.2536F, -0.4057F));

            PartDefinition cube_r6 = neck_muscular_ewed_long_2_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(989, 878).addBox(-2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8023F, -0.0412F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_long_2_top_mane_flow = neck_muscular_ewed_long_2_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_long_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9497F, 0.0F, -0.0894F, -0.1309F, 0.0F, 0.0F));

            PartDefinition cube_r7 = neck_muscular_ewed_long_2_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(977, 872).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4712F, -0.2206F, -0.3514F));

            PartDefinition neck_muscular_ewed_long_2_bottom_mane = neck_muscular_ewed_long_2_mane.addOrReplaceChild("neck_muscular_ewed_long_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 0.0536F, -0.3498F));

            PartDefinition neck_muscular_ewed_long_2_bottom_mane_connector = neck_muscular_ewed_long_2_bottom_mane.addOrReplaceChild("neck_muscular_ewed_long_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition neck_muscular_ewed_long_2_bottom_mane_connector_individual = neck_muscular_ewed_long_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_long_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.6751F, 0.5345F));

            PartDefinition cube_r8 = neck_muscular_ewed_long_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(993, 864).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_long_2_bottom_mane_connector2 = neck_muscular_ewed_long_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_long_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));

            PartDefinition neck_muscular_ewed_long_2_bottom_mane_connector2_individual = neck_muscular_ewed_long_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_long_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.2827F, 0.1221F));

            PartDefinition cube_r9 = neck_muscular_ewed_long_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(993, 878).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.0536F, -4.2338F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_ewed_long_2_bottom_mane_flow = neck_muscular_ewed_long_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_long_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.5922F, -0.3575F, 0.0894F));

            PartDefinition cube_r10 = neck_muscular_ewed_long_2_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(975, 871).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));
        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Neck / " + muscleMass + " / " + "ewed" +  " / "  + length + " / Variation " + variation + ", Cancelling Generation...");
        }
        allParts.add("neck_" + muscleMass + "_" + "ewed" + "_" + length  + "_" +  variation);
        return partdefinition;
    }


    /* Straight Neck */
    public static PartDefinition GenerateStraight(PartDefinition partdefinition, String muscleMass, String length, int variation) {
        if (muscleMass.equals("lean") && length.equals("short") && variation == 1) {
            PartDefinition neck_lean_straight_short_1 = partdefinition.addOrReplaceChild("neck_lean_straight_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_lean_straight_short_1_individual = neck_lean_straight_short_1.addOrReplaceChild("neck_lean_straight_short_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, 0.8939F, 0.0894F, -0.5672F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_short_1_crest = neck_lean_straight_short_1_individual.addOrReplaceChild("neck_lean_straight_short_1_crest", CubeListBuilder.create(), PartPose.offset(0.2682F, -4.5587F, -2.9497F));

            PartDefinition neck_lean_straight_short_1_crest_upper = neck_lean_straight_short_1_crest.addOrReplaceChild("neck_lean_straight_short_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.0952F, -0.1892F, -1.6032F));

            PartDefinition cube_r1 = neck_lean_straight_short_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(361, 836).addBox(-2.08F, -4.0F, -3.92F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.08F, -0.754F, 0.7523F, 1.6144F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_short_1_crest_lower = neck_lean_straight_short_1_crest.addOrReplaceChild("neck_lean_straight_short_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.0254F, 0.2768F, 1.3257F));

            PartDefinition cube_r2 = neck_lean_straight_short_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(377, 836).addBox(-3.08F, -5.0F, -0.92F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 1.1291F, 2.232F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_short_1_middle_individual = neck_lean_straight_short_1_individual.addOrReplaceChild("neck_lean_straight_short_1_middle_individual", CubeListBuilder.create(), PartPose.offset(0.3511F, -1.319F, -2.6837F));

            PartDefinition cube_r3 = neck_lean_straight_short_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(361, 825).addBox(-4.0708F, -11.03F, -0.9292F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0811F, 6.8804F, 4.3189F, 0.8727F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_lean_straight_short_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(377, 826).addBox(-3.0F, -7.0F, -1.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9897F, 1.3769F, 3.9638F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_short_1_lower_individual = neck_lean_straight_short_1_individual.addOrReplaceChild("neck_lean_straight_short_1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3463F, -0.2308F, -4.2206F));

            PartDefinition cube_r5 = neck_lean_straight_short_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(373, 817).addBox(-4.0784F, -5.0F, -0.9017F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 2.3336F, 1.4179F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_short_1_mane = neck_lean_straight_short_1.addOrReplaceChild("neck_lean_straight_short_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -5.7207F, 0.0F));

            PartDefinition neck_lean_straight_short_1_top_mane = neck_lean_straight_short_1_mane.addOrReplaceChild("neck_lean_straight_short_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -0.5721F, -0.171F));

            PartDefinition neck_lean_straight_short_1_top_mane_connector = neck_lean_straight_short_1_top_mane.addOrReplaceChild("neck_lean_straight_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.9832F, -2.0559F));

            PartDefinition neck_lean_straight_short_1_top_mane_connector_individual = neck_lean_straight_short_1_top_mane_connector.addOrReplaceChild("neck_lean_straight_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

            PartDefinition cube_r6 = neck_lean_straight_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(724, 910).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_short_1_top_mane_connector2 = neck_lean_straight_short_1_top_mane_connector.addOrReplaceChild("neck_lean_straight_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

            PartDefinition neck_lean_straight_short_1_top_mane_connector2_individual = neck_lean_straight_short_1_top_mane_connector2.addOrReplaceChild("neck_lean_straight_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.8771F, 0.2024F, -0.0684F));

            PartDefinition cube_r7 = neck_lean_straight_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(726, 917).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_short_1_top_mane_flow = neck_lean_straight_short_1_top_mane_connector2.addOrReplaceChild("neck_lean_straight_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, -0.3575F, 0.0894F, -0.1745F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_lean_straight_short_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(712, 911).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

            PartDefinition neck_lean_straight_short_1_bottom_mane = neck_lean_straight_short_1_mane.addOrReplaceChild("neck_lean_straight_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, 1.9307F, 1.6167F));

            PartDefinition neck_lean_straight_short_1_bottom_mane_connector = neck_lean_straight_short_1_bottom_mane.addOrReplaceChild("neck_lean_straight_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

            PartDefinition neck_lean_straight_short_1_bottom_mane_connector_individual = neck_lean_straight_short_1_bottom_mane_connector.addOrReplaceChild("neck_lean_straight_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 0.1093F, -0.1889F));

            PartDefinition cube_r9 = neck_lean_straight_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(735, 914).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6948F, -3.1077F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_short_1_bottom_mane_connector2 = neck_lean_straight_short_1_bottom_mane_connector.addOrReplaceChild("neck_lean_straight_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.7151F, 0.6257F));

            PartDefinition neck_lean_straight_short_1_bottom_mane_connector2_individual = neck_lean_straight_short_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_straight_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.4498F, -0.4099F));

            PartDefinition cube_r10 = neck_lean_straight_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(732, 923).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.4162F, -3.523F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_short_1_bottom_mane_flow = neck_lean_straight_short_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_straight_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.6983F, 0.1788F, -0.0894F));

            PartDefinition cube_r11 = neck_lean_straight_short_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(718, 917).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2682F, 0.0F, -0.9774F, -0.0927F, -0.1377F));

        } else if (muscleMass.equals("lean") && length.equals("short") && variation == 2) {
            PartDefinition neck_lean_straight_short_2 = partdefinition.addOrReplaceChild("neck_lean_straight_short_2", CubeListBuilder.create(), PartPose.offset(-3.8436F, 21.1397F, 4.0077F));

            PartDefinition neck_lean_straight_short_2_individual = neck_lean_straight_short_2.addOrReplaceChild("neck_lean_straight_short_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5754F, 2.8603F, -4.0077F, -0.5672F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_short_2_crest = neck_lean_straight_short_2_individual.addOrReplaceChild("neck_lean_straight_short_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0223F, -3.486F));

            PartDefinition neck_lean_straight_short_2_crest_upper = neck_lean_straight_short_2_crest.addOrReplaceChild("neck_lean_straight_short_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3634F, -0.7255F, -0.5306F));

            PartDefinition cube_r1 = neck_lean_straight_short_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(412, 832).addBox(-2.08F, -4.0F, -3.92F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.08F, -0.754F, 0.216F, 1.6144F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_short_2_crest_lower = neck_lean_straight_short_2_crest.addOrReplaceChild("neck_lean_straight_short_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2935F, -0.2595F, 1.862F));

            PartDefinition cube_r2 = neck_lean_straight_short_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(442, 832).addBox(-3.08F, -5.0F, -0.92F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 1.1291F, 2.232F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_short_2_middle_individual = neck_lean_straight_short_2_individual.addOrReplaceChild("neck_lean_straight_short_2_middle_individual", CubeListBuilder.create(), PartPose.offset(0.3511F, -1.0526F, -2.2656F));

            PartDefinition cube_r3 = neck_lean_straight_short_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(415, 820).addBox(-4.0708F, -11.03F, -0.9292F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0811F, 6.614F, 3.9008F, 0.8727F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_lean_straight_short_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(431, 821).addBox(-3.0F, -7.0F, -1.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9897F, 1.1105F, 3.5457F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_short_2_lower_individual = neck_lean_straight_short_2_individual.addOrReplaceChild("neck_lean_straight_short_2_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3463F, -0.2308F, -4.2206F));

            PartDefinition cube_r5 = neck_lean_straight_short_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(428, 832).addBox(-4.0784F, -5.0F, -0.9017F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 2.3336F, 1.4179F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_short_2_mane = neck_lean_straight_short_2.addOrReplaceChild("neck_lean_straight_short_2_mane", CubeListBuilder.create(), PartPose.offset(3.8436F, -3.5754F, -4.0077F));

            PartDefinition neck_lean_straight_short_2_top_mane = neck_lean_straight_short_2_mane.addOrReplaceChild("neck_lean_straight_short_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -1.7341F, -0.2604F));

            PartDefinition neck_lean_straight_short_2_top_mane_connector = neck_lean_straight_short_2_top_mane.addOrReplaceChild("neck_lean_straight_short_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, 0.0F, -2.0559F));

            PartDefinition neck_lean_straight_short_2_top_mane_connector_individual = neck_lean_straight_short_2_top_mane_connector.addOrReplaceChild("neck_lean_straight_short_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

            PartDefinition cube_r6 = neck_lean_straight_short_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(776, 911).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_short_2_top_mane_connector2 = neck_lean_straight_short_2_top_mane_connector.addOrReplaceChild("neck_lean_straight_short_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

            PartDefinition neck_lean_straight_short_2_top_mane_connector2_individual = neck_lean_straight_short_2_top_mane_connector2.addOrReplaceChild("neck_lean_straight_short_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.8771F, 0.2024F, -0.0684F));

            PartDefinition cube_r7 = neck_lean_straight_short_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(776, 918).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_short_2_top_mane_flow = neck_lean_straight_short_2_top_mane_connector2.addOrReplaceChild("neck_lean_straight_short_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, -0.3575F, 0.0894F, -0.1745F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_lean_straight_short_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(762, 912).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

            PartDefinition neck_lean_straight_short_2_bottom_mane = neck_lean_straight_short_2_mane.addOrReplaceChild("neck_lean_straight_short_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, 1.752F, 1.5273F));

            PartDefinition neck_lean_straight_short_2_bottom_mane_connector = neck_lean_straight_short_2_bottom_mane.addOrReplaceChild("neck_lean_straight_short_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

            PartDefinition neck_lean_straight_short_2_bottom_mane_connector_individual = neck_lean_straight_short_2_bottom_mane_connector.addOrReplaceChild("neck_lean_straight_short_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 0.5189F, 0.0979F));

            PartDefinition cube_r9 = neck_lean_straight_short_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(785, 914).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.1044F, -3.3945F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_short_2_bottom_mane_connector2 = neck_lean_straight_short_2_bottom_mane_connector.addOrReplaceChild("neck_lean_straight_short_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.7151F, 0.6257F));

            PartDefinition neck_lean_straight_short_2_bottom_mane_connector2_individual = neck_lean_straight_short_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_straight_short_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.8593F, -0.1231F));

            PartDefinition cube_r10 = neck_lean_straight_short_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(783, 923).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.8258F, -3.8098F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_short_2_bottom_mane_flow = neck_lean_straight_short_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_straight_short_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.6983F, 0.1788F, -0.0894F));

            PartDefinition cube_r11 = neck_lean_straight_short_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(767, 917).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2682F, 0.0F, -0.9774F, -0.0927F, -0.1377F));

        } else if (muscleMass.equals("lean") && length.equals("average") && variation == 1) {
            PartDefinition neck_lean_straight_average_1 = partdefinition.addOrReplaceChild("neck_lean_straight_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_lean_straight_average_1_individual = neck_lean_straight_average_1.addOrReplaceChild("neck_lean_straight_average_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, -1.6089F, -0.0894F, -0.5672F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_average_1_crest = neck_lean_straight_average_1_individual.addOrReplaceChild("neck_lean_straight_average_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.7374F, -3.933F));

            PartDefinition neck_lean_straight_average_1_crest_upper = neck_lean_straight_average_1_crest.addOrReplaceChild("neck_lean_straight_average_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3634F, -0.1892F, -0.5306F));

            PartDefinition cube_r1 = neck_lean_straight_average_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(469, 830).addBox(-2.08F, -4.0F, -3.92F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.08F, -0.5752F, 0.663F, 1.6144F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_average_1_crest_lower = neck_lean_straight_average_1_crest.addOrReplaceChild("neck_lean_straight_average_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2682F, 0.6669F, 2.7621F));

            PartDefinition cube_r2 = neck_lean_straight_average_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(499, 830).addBox(-3.08F, -5.0F, -0.92F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 0.9177F, 1.7788F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_average_1_middle_individual = neck_lean_straight_average_1_individual.addOrReplaceChild("neck_lean_straight_average_1_middle_individual", CubeListBuilder.create(), PartPose.offset(0.3511F, -0.9778F, -1.6868F));

            PartDefinition cube_r3 = neck_lean_straight_average_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(489, 818).addBox(-3.0F, -7.0F, -1.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9897F, 1.0357F, 2.9669F, 1.1345F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_lean_straight_average_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(471, 816).addBox(-4.0708F, -11.03F, -0.9292F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0811F, 6.5392F, 3.322F, 0.8727F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_average_1_lower_individual = neck_lean_straight_average_1_individual.addOrReplaceChild("neck_lean_straight_average_1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3463F, 0.056F, -3.811F));

            PartDefinition cube_r5 = neck_lean_straight_average_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(485, 830).addBox(-4.0784F, -5.0F, -0.9017F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 2.0468F, 1.0083F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_average_1_mane = neck_lean_straight_average_1.addOrReplaceChild("neck_lean_straight_average_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.8659F, 0.0F));

            PartDefinition neck_lean_straight_average_1_top_mane = neck_lean_straight_average_1_mane.addOrReplaceChild("neck_lean_straight_average_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -2.3598F, -0.3498F));

            PartDefinition neck_lean_straight_average_1_top_mane_connector = neck_lean_straight_average_1_top_mane.addOrReplaceChild("neck_lean_straight_average_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, 0.4469F, -2.0559F));

            PartDefinition neck_lean_straight_average_1_top_mane_connector_individual = neck_lean_straight_average_1_top_mane_connector.addOrReplaceChild("neck_lean_straight_average_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

            PartDefinition cube_r6 = neck_lean_straight_average_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(823, 910).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_average_1_top_mane_connector2 = neck_lean_straight_average_1_top_mane_connector.addOrReplaceChild("neck_lean_straight_average_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

            PartDefinition neck_lean_straight_average_1_top_mane_connector2_individual = neck_lean_straight_average_1_top_mane_connector2.addOrReplaceChild("neck_lean_straight_average_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.8771F, 0.2024F, -0.0684F));

            PartDefinition cube_r7 = neck_lean_straight_average_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(823, 917).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_average_1_top_mane_flow = neck_lean_straight_average_1_top_mane_connector2.addOrReplaceChild("neck_lean_straight_average_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, -0.3575F, 0.0894F, -0.1309F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_lean_straight_average_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(809, 911).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

            PartDefinition neck_lean_straight_average_1_bottom_mane = neck_lean_straight_average_1_mane.addOrReplaceChild("neck_lean_straight_average_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, 1.5732F, 1.4379F));

            PartDefinition neck_lean_straight_average_1_bottom_mane_connector = neck_lean_straight_average_1_bottom_mane.addOrReplaceChild("neck_lean_straight_average_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

            PartDefinition neck_lean_straight_average_1_bottom_mane_connector_individual = neck_lean_straight_average_1_bottom_mane_connector.addOrReplaceChild("neck_lean_straight_average_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 0.9284F, 0.3847F));

            PartDefinition cube_r9 = neck_lean_straight_average_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(832, 911).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.514F, -3.6813F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_average_1_bottom_mane_connector2 = neck_lean_straight_average_1_bottom_mane_connector.addOrReplaceChild("neck_lean_straight_average_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, 0.5363F, 1.2514F));

            PartDefinition neck_lean_straight_average_1_bottom_mane_connector2_individual = neck_lean_straight_average_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_straight_average_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.0175F, -0.462F));

            PartDefinition cube_r10 = neck_lean_straight_average_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(831, 921).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.2354F, -4.0966F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_average_1_bottom_mane_flow = neck_lean_straight_average_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_straight_average_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.6983F, 0.1788F, 0.0894F));

            PartDefinition cube_r11 = neck_lean_straight_average_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(813, 915).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -1.5196F, -0.8045F, -0.9774F, -0.0927F, -0.1377F));

        } else if (muscleMass.equals("lean") && length.equals("average") && variation == 2) {
            PartDefinition neck_lean_straight_average_2 = partdefinition.addOrReplaceChild("neck_lean_straight_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_lean_straight_average_2_individual = neck_lean_straight_average_2.addOrReplaceChild("neck_lean_straight_average_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, -1.6089F, -0.0894F, -0.5672F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_average_2_crest = neck_lean_straight_average_2_individual.addOrReplaceChild("neck_lean_straight_average_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -3.7542F, -3.2179F));

            PartDefinition neck_lean_straight_average_2_crest_upper = neck_lean_straight_average_2_crest.addOrReplaceChild("neck_lean_straight_average_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3634F, -1.0831F, -0.9775F));

            PartDefinition cube_r1 = neck_lean_straight_average_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(525, 829).addBox(-2.08F, -4.0F, -3.92F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.08F, -0.6646F, 0.3948F, 1.6144F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_average_2_crest_lower = neck_lean_straight_average_2_crest.addOrReplaceChild("neck_lean_straight_average_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2935F, -0.1051F, 2.5001F));

            PartDefinition cube_r2 = neck_lean_straight_average_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(555, 829).addBox(-3.08F, -5.0F, -0.92F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 0.7064F, 1.3257F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_average_2_middle_individual = neck_lean_straight_average_2_individual.addOrReplaceChild("neck_lean_straight_average_2_middle_individual", CubeListBuilder.create(), PartPose.offset(0.3511F, -0.8902F, -1.1793F));

            PartDefinition cube_r3 = neck_lean_straight_average_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(545, 816).addBox(-3.0F, -7.0F, -1.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9897F, 0.9481F, 2.4594F, 1.1345F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_lean_straight_average_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(527, 814).addBox(-4.0708F, -11.03F, -0.9292F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0811F, 6.094F, 2.9933F, 0.8727F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_average_2_lower_individual = neck_lean_straight_average_2_individual.addOrReplaceChild("neck_lean_straight_average_2_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3463F, 0.3427F, -2.7757F));

            PartDefinition cube_r5 = neck_lean_straight_average_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(541, 829).addBox(-4.0784F, -5.0F, -0.9017F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 1.76F, 0.5988F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_average_2_mane = neck_lean_straight_average_2.addOrReplaceChild("neck_lean_straight_average_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0447F, 0.0F));

            PartDefinition neck_lean_straight_average_2_top_mane = neck_lean_straight_average_2_mane.addOrReplaceChild("neck_lean_straight_average_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -0.7508F, -0.3498F));

            PartDefinition neck_lean_straight_average_2_top_mane_connector = neck_lean_straight_average_2_top_mane.addOrReplaceChild("neck_lean_straight_average_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.9832F, -2.0559F));

            PartDefinition neck_lean_straight_average_2_top_mane_connector_individual = neck_lean_straight_average_2_top_mane_connector.addOrReplaceChild("neck_lean_straight_average_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

            PartDefinition cube_r6 = neck_lean_straight_average_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(875, 908).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_average_2_top_mane_connector2 = neck_lean_straight_average_2_top_mane_connector.addOrReplaceChild("neck_lean_straight_average_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

            PartDefinition neck_lean_straight_average_2_top_mane_connector2_individual = neck_lean_straight_average_2_top_mane_connector2.addOrReplaceChild("neck_lean_straight_average_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.8771F, 0.2024F, -0.0684F));

            PartDefinition cube_r7 = neck_lean_straight_average_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(875, 915).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_average_2_top_mane_flow = neck_lean_straight_average_2_top_mane_connector2.addOrReplaceChild("neck_lean_straight_average_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, -0.3575F, 0.0894F, -0.1309F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_lean_straight_average_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(861, 909).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

            PartDefinition neck_lean_straight_average_2_bottom_mane = neck_lean_straight_average_2_mane.addOrReplaceChild("neck_lean_straight_average_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, 1.752F, 1.4379F));

            PartDefinition neck_lean_straight_average_2_bottom_mane_connector = neck_lean_straight_average_2_bottom_mane.addOrReplaceChild("neck_lean_straight_average_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

            PartDefinition neck_lean_straight_average_2_bottom_mane_connector_individual = neck_lean_straight_average_2_bottom_mane_connector.addOrReplaceChild("neck_lean_straight_average_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 1.338F, 0.6715F));

            PartDefinition cube_r9 = neck_lean_straight_average_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(884, 907).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.9236F, -3.9681F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_average_2_bottom_mane_connector2 = neck_lean_straight_average_2_bottom_mane_connector.addOrReplaceChild("neck_lean_straight_average_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, 0.5363F, 1.2514F));

            PartDefinition neck_lean_straight_average_2_bottom_mane_connector2_individual = neck_lean_straight_average_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_straight_average_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.4271F, -0.1753F));

            PartDefinition cube_r10 = neck_lean_straight_average_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(884, 918).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.645F, -4.3834F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_average_2_bottom_mane_flow = neck_lean_straight_average_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_straight_average_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.6983F, 0.1788F, 0.0894F));

            PartDefinition cube_r11 = neck_lean_straight_average_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(864, 912).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -1.5196F, -0.8045F, -0.9753F, -0.1144F, -0.1002F));

        } else if (muscleMass.equals("lean") && length.equals("long") && variation == 1) {
            PartDefinition neck_lean_straight_long_1 = partdefinition.addOrReplaceChild("neck_lean_straight_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_lean_straight_long_1_individual = neck_lean_straight_long_1.addOrReplaceChild("neck_lean_straight_long_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, -2.6816F, -1.0726F, -0.5672F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_long_1_crest = neck_lean_straight_long_1_individual.addOrReplaceChild("neck_lean_straight_long_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -3.933F, -1.4302F));

            PartDefinition neck_lean_straight_long_1_crest_upper = neck_lean_straight_long_1_crest.addOrReplaceChild("neck_lean_straight_long_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3634F, -0.1892F, -2.5864F));

            PartDefinition cube_r1 = neck_lean_straight_long_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(583, 828).addBox(-2.08F, -4.0F, -3.92F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.08F, -1.3797F, 0.216F, 1.6144F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_long_1_crest_lower = neck_lean_straight_long_1_crest.addOrReplaceChild("neck_lean_straight_long_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2935F, 0.285F, 1.1656F));

            PartDefinition cube_r2 = neck_lean_straight_long_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(613, 828).addBox(-3.08F, -5.0F, -0.92F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 0.4951F, 0.8725F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_long_1_middle_individual = neck_lean_straight_long_1_individual.addOrReplaceChild("neck_lean_straight_long_1_middle_individual", CubeListBuilder.create(), PartPose.offset(0.3511F, -0.6239F, -0.7612F));

            PartDefinition cube_r3 = neck_lean_straight_long_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(585, 812).addBox(-4.0708F, -11.03F, -0.9292F, 4.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0811F, 5.8277F, 2.5752F, 0.8727F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_lean_straight_long_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(603, 814).addBox(-3.0F, -7.0F, -1.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9897F, 0.6818F, 2.0413F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_long_1_lower_individual = neck_lean_straight_long_1_individual.addOrReplaceChild("neck_lean_straight_long_1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3463F, 0.3427F, -2.7757F));

            PartDefinition cube_r5 = neck_lean_straight_long_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(599, 828).addBox(-4.0784F, -5.0F, -0.9017F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 1.76F, 0.5988F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_long_1_mane = neck_lean_straight_long_1.addOrReplaceChild("neck_lean_straight_long_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.6704F, 0.0F));

            PartDefinition neck_lean_straight_long_1_top_mane = neck_lean_straight_long_1_mane.addOrReplaceChild("neck_lean_straight_long_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -1.019F, -1.3331F));

            PartDefinition neck_lean_straight_long_1_top_mane_connector = neck_lean_straight_long_1_top_mane.addOrReplaceChild("neck_lean_straight_long_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -1.162F, -2.0559F));

            PartDefinition neck_lean_straight_long_1_top_mane_connector_individual = neck_lean_straight_long_1_top_mane_connector.addOrReplaceChild("neck_lean_straight_long_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

            PartDefinition cube_r6 = neck_lean_straight_long_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(932, 907).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_long_1_top_mane_connector2 = neck_lean_straight_long_1_top_mane_connector.addOrReplaceChild("neck_lean_straight_long_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

            PartDefinition neck_lean_straight_long_1_top_mane_connector2_individual = neck_lean_straight_long_1_top_mane_connector2.addOrReplaceChild("neck_lean_straight_long_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.8771F, 0.2024F, -0.0684F));

            PartDefinition cube_r7 = neck_lean_straight_long_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(932, 914).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_long_1_top_mane_flow = neck_lean_straight_long_1_top_mane_connector2.addOrReplaceChild("neck_lean_straight_long_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, -0.3575F, 0.0894F, -0.1309F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_lean_straight_long_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(918, 908).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

            PartDefinition neck_lean_straight_long_1_bottom_mane = neck_lean_straight_long_1_mane.addOrReplaceChild("neck_lean_straight_long_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, 1.305F, 0.4547F));

            PartDefinition neck_lean_straight_long_1_bottom_mane_connector = neck_lean_straight_long_1_bottom_mane.addOrReplaceChild("neck_lean_straight_long_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

            PartDefinition neck_lean_straight_long_1_bottom_mane_connector_individual = neck_lean_straight_long_1_bottom_mane_connector.addOrReplaceChild("neck_lean_straight_long_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 1.7476F, 0.9583F));

            PartDefinition cube_r9 = neck_lean_straight_long_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(941, 904).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.3331F, -4.2549F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_long_1_bottom_mane_connector2 = neck_lean_straight_long_1_bottom_mane_connector.addOrReplaceChild("neck_lean_straight_long_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, 1.4302F, 1.8771F));

            PartDefinition neck_lean_straight_long_1_bottom_mane_connector2_individual = neck_lean_straight_long_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_straight_long_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, -0.0572F, -0.5142F));

            PartDefinition cube_r10 = neck_lean_straight_long_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(942, 916).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.0545F, -4.6702F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_long_1_bottom_mane_flow = neck_lean_straight_long_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_straight_long_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.6983F, 0.4469F, 0.5363F));

            PartDefinition cube_r11 = neck_lean_straight_long_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(920, 910).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -2.6816F, -1.8771F, -0.9753F, -0.1144F, -0.1002F));

        } else if (muscleMass.equals("lean") && length.equals("long") && variation == 2) {
            PartDefinition neck_lean_straight_long_2 = partdefinition.addOrReplaceChild("neck_lean_straight_long_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_lean_straight_long_2_individual = neck_lean_straight_long_2.addOrReplaceChild("neck_lean_straight_long_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, -3.5754F, -1.8771F, -0.5672F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_long_2_crest = neck_lean_straight_long_2_individual.addOrReplaceChild("neck_lean_straight_long_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -3.933F, -2.8603F));

            PartDefinition neck_lean_straight_long_2_crest_upper = neck_lean_straight_long_2_crest.addOrReplaceChild("neck_lean_straight_long_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3634F, -0.8149F, -1.5138F));

            PartDefinition cube_r1 = neck_lean_straight_long_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(637, 831).addBox(-2.08F, -4.0F, -3.92F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.08F, -0.754F, 0.5736F, 1.6144F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_long_2_crest_lower = neck_lean_straight_long_2_crest.addOrReplaceChild("neck_lean_straight_long_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2935F, 0.4963F, 3.0489F));

            PartDefinition cube_r2 = neck_lean_straight_long_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(667, 831).addBox(-3.08F, -5.0F, -0.92F, 3.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 0.2838F, 0.4193F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_long_2_middle_individual = neck_lean_straight_long_2_individual.addOrReplaceChild("neck_lean_straight_long_2_middle_individual", CubeListBuilder.create(), PartPose.offset(0.3511F, -0.3575F, -0.3432F));

            PartDefinition cube_r3 = neck_lean_straight_long_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(657, 816).addBox(-3.0F, -7.0F, -1.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9897F, 0.4154F, 1.6232F, 1.1345F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_lean_straight_long_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(639, 814).addBox(-4.0708F, -11.03F, -0.9292F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0811F, 5.5613F, 2.1571F, 0.8727F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_long_2_lower_individual = neck_lean_straight_long_2_individual.addOrReplaceChild("neck_lean_straight_long_2_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3463F, 0.3427F, -2.7757F));

            PartDefinition cube_r5 = neck_lean_straight_long_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(653, 831).addBox(-4.0784F, -5.0F, -0.9017F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 1.76F, 0.5988F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_long_2_mane = neck_lean_straight_long_2.addOrReplaceChild("neck_lean_straight_long_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.1341F, 0.0F));

            PartDefinition neck_lean_straight_long_2_top_mane = neck_lean_straight_long_2_mane.addOrReplaceChild("neck_lean_straight_long_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -3.0749F, -3.1208F));

            PartDefinition neck_lean_straight_long_2_top_mane_connector = neck_lean_straight_long_2_top_mane.addOrReplaceChild("neck_lean_straight_long_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.5363F, -1.0726F));

            PartDefinition neck_lean_straight_long_2_top_mane_connector_individual = neck_lean_straight_long_2_top_mane_connector.addOrReplaceChild("neck_lean_straight_long_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

            PartDefinition cube_r6 = neck_lean_straight_long_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(988, 906).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_long_2_top_mane_connector2 = neck_lean_straight_long_2_top_mane_connector.addOrReplaceChild("neck_lean_straight_long_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

            PartDefinition neck_lean_straight_long_2_top_mane_connector2_individual = neck_lean_straight_long_2_top_mane_connector2.addOrReplaceChild("neck_lean_straight_long_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.8771F, 0.2024F, -0.0684F));

            PartDefinition cube_r7 = neck_lean_straight_long_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(988, 913).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_long_2_top_mane_flow = neck_lean_straight_long_2_top_mane_connector2.addOrReplaceChild("neck_lean_straight_long_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, -0.3575F, 0.0894F, -0.1309F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_lean_straight_long_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(974, 907).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

            PartDefinition neck_lean_straight_long_2_bottom_mane = neck_lean_straight_long_2_mane.addOrReplaceChild("neck_lean_straight_long_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -0.1251F, -0.3498F));

            PartDefinition neck_lean_straight_long_2_bottom_mane_connector = neck_lean_straight_long_2_bottom_mane.addOrReplaceChild("neck_lean_straight_long_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

            PartDefinition neck_lean_straight_long_2_bottom_mane_connector_individual = neck_lean_straight_long_2_bottom_mane_connector.addOrReplaceChild("neck_lean_straight_long_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 2.1572F, 1.245F));

            PartDefinition cube_r9 = neck_lean_straight_long_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(997, 902).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.7427F, -4.5417F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_long_2_bottom_mane_connector2 = neck_lean_straight_long_2_bottom_mane_connector.addOrReplaceChild("neck_lean_straight_long_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, 1.4302F, 1.8771F));

            PartDefinition neck_lean_straight_long_2_bottom_mane_connector2_individual = neck_lean_straight_long_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_straight_long_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.3524F, -0.2274F));

            PartDefinition cube_r10 = neck_lean_straight_long_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(991, 915).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.4641F, -4.957F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_lean_straight_long_2_bottom_mane_flow = neck_lean_straight_long_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_straight_long_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.6983F, 0.4469F, 0.5363F));

            PartDefinition cube_r11 = neck_lean_straight_long_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(975, 908).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -2.6816F, -1.8771F, -0.9753F, -0.1144F, -0.1002F));

        } else if (muscleMass.equals("average") && length.equals("short") && variation == 1) {
            PartDefinition neck_average_straight_short_1 = partdefinition.addOrReplaceChild("neck_average_straight_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_average_straight_short_1_individual = neck_average_straight_short_1.addOrReplaceChild("neck_average_straight_short_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, 0.8939F, 0.0894F, -0.5672F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_short_1_crest = neck_average_straight_short_1_individual.addOrReplaceChild("neck_average_straight_short_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -3.8436F, -3.5754F));

            PartDefinition neck_average_straight_short_1_crest_upper = neck_average_straight_short_1_crest.addOrReplaceChild("neck_average_straight_short_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3997F, -0.7255F, -0.7987F));

            PartDefinition cube_r1 = neck_average_straight_short_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(360, 865).addBox(-3.08F, -4.0F, -3.92F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -0.9328F, 0.5736F, 1.6144F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_short_1_crest_lower = neck_average_straight_short_1_crest.addOrReplaceChild("neck_average_straight_short_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.3298F, -0.4383F, 1.9514F));

            PartDefinition cube_r2 = neck_average_straight_short_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(378, 865).addBox(-4.08F, -5.0F, -0.92F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 1.1291F, 2.232F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_short_1_middle_individual = neck_average_straight_short_1_individual.addOrReplaceChild("neck_average_straight_short_1_middle_individual", CubeListBuilder.create(), PartPose.offset(0.3874F, -1.319F, -2.6837F));

            PartDefinition cube_r3 = neck_average_straight_short_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(360, 854).addBox(-5.0708F, -11.03F, -0.9292F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5811F, 6.8804F, 4.3189F, 0.8727F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_average_straight_short_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(378, 855).addBox(-4.0F, -7.0F, -1.0F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4897F, 1.3769F, 3.9638F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_short_1_lower_individual = neck_average_straight_short_1_individual.addOrReplaceChild("neck_average_straight_short_1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3826F, -0.2308F, -4.2206F));

            PartDefinition cube_r5 = neck_average_straight_short_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(374, 846).addBox(-5.0784F, -5.0F, -0.9017F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 2.3336F, 1.4179F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_short_1_mane = neck_average_straight_short_1.addOrReplaceChild("neck_average_straight_short_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -5.7207F, 0.0F));

            PartDefinition neck_average_straight_short_1_top_mane = neck_average_straight_short_1_mane.addOrReplaceChild("neck_average_straight_short_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -0.5721F, -0.171F));

            PartDefinition neck_average_straight_short_1_top_mane_connector = neck_average_straight_short_1_top_mane.addOrReplaceChild("neck_average_straight_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.9832F, -2.0559F));

            PartDefinition neck_average_straight_short_1_top_mane_connector_individual = neck_average_straight_short_1_top_mane_connector.addOrReplaceChild("neck_average_straight_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

            PartDefinition cube_r6 = neck_average_straight_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(722, 933).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_short_1_top_mane_connector2 = neck_average_straight_short_1_top_mane_connector.addOrReplaceChild("neck_average_straight_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

            PartDefinition neck_average_straight_short_1_top_mane_connector2_individual = neck_average_straight_short_1_top_mane_connector2.addOrReplaceChild("neck_average_straight_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.3771F, 0.2024F, -0.0684F));

            PartDefinition cube_r7 = neck_average_straight_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(724, 940).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_short_1_top_mane_flow = neck_average_straight_short_1_top_mane_connector2.addOrReplaceChild("neck_average_straight_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5028F, -0.3575F, 0.0894F, -0.1326F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_average_straight_short_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(710, 934).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

            PartDefinition neck_average_straight_short_1_bottom_mane = neck_average_straight_short_1_mane.addOrReplaceChild("neck_average_straight_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, 1.9307F, 1.6167F));

            PartDefinition neck_average_straight_short_1_bottom_mane_connector = neck_average_straight_short_1_bottom_mane.addOrReplaceChild("neck_average_straight_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

            PartDefinition neck_average_straight_short_1_bottom_mane_connector_individual = neck_average_straight_short_1_bottom_mane_connector.addOrReplaceChild("neck_average_straight_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 0.1093F, -0.1889F));

            PartDefinition cube_r9 = neck_average_straight_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(736, 940).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6948F, -3.1077F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_short_1_bottom_mane_connector2 = neck_average_straight_short_1_bottom_mane_connector.addOrReplaceChild("neck_average_straight_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.7151F, 0.6257F));

            PartDefinition neck_average_straight_short_1_bottom_mane_connector2_individual = neck_average_straight_short_1_bottom_mane_connector2.addOrReplaceChild("neck_average_straight_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, 0.4498F, -0.4099F));

            PartDefinition cube_r10 = neck_average_straight_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(724, 947).addBox(-2.0F, -2.0F, 1.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.4162F, -3.523F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_short_1_bottom_mane_flow = neck_average_straight_short_1_bottom_mane_connector2.addOrReplaceChild("neck_average_straight_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.5922F, 0.1788F, -0.0894F));

            PartDefinition cube_r11 = neck_average_straight_short_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(716, 940).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2682F, 0.0F, -0.9774F, -0.0927F, -0.1377F));

        } else if (muscleMass.equals("average") && length.equals("short") && variation == 2) {
            PartDefinition neck_average_straight_short_2 = partdefinition.addOrReplaceChild("neck_average_straight_short_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_average_straight_short_2_individual = neck_average_straight_short_2.addOrReplaceChild("neck_average_straight_short_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5672F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_short_2_crest = neck_average_straight_short_2_individual.addOrReplaceChild("neck_average_straight_short_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.2011F, -2.8603F));

            PartDefinition neck_average_straight_short_2_crest_upper = neck_average_straight_short_2_crest.addOrReplaceChild("neck_average_straight_short_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.2209F, -0.6361F, -1.1563F));

            PartDefinition cube_r1 = neck_average_straight_short_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(408, 864).addBox(-3.08F, -4.0F, -3.92F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -0.6646F, 0.216F, 1.6144F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_short_2_crest_lower = neck_average_straight_short_2_crest.addOrReplaceChild("neck_average_straight_short_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2404F, -0.0808F, 1.2363F));

            PartDefinition cube_r2 = neck_average_straight_short_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(426, 864).addBox(-4.08F, -5.0F, -0.92F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 1.1291F, 2.232F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_short_2_middle_individual = neck_average_straight_short_2_individual.addOrReplaceChild("neck_average_straight_short_2_middle_individual", CubeListBuilder.create(), PartPose.offset(0.298F, -1.0526F, -2.2656F));

            PartDefinition cube_r3 = neck_average_straight_short_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(412, 852).addBox(-5.0708F, -11.03F, -0.9292F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5811F, 6.614F, 3.9008F, 0.8727F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_average_straight_short_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(430, 853).addBox(-4.0F, -7.0F, -1.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4897F, 1.1105F, 3.5457F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_short_2_lower_individual = neck_average_straight_short_2_individual.addOrReplaceChild("neck_average_straight_short_2_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3826F, -0.2308F, -4.2206F));

            PartDefinition cube_r5 = neck_average_straight_short_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(438, 864).addBox(-5.0784F, -5.0F, -0.9017F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 2.3336F, 1.4179F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_short_2_mane = neck_average_straight_short_2.addOrReplaceChild("neck_average_straight_short_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -6.7933F, 0.0F));

            PartDefinition neck_average_straight_short_2_top_mane = neck_average_straight_short_2_mane.addOrReplaceChild("neck_average_straight_short_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.8883F, -0.3933F, -0.2604F));

            PartDefinition neck_average_straight_short_2_top_mane_connector = neck_average_straight_short_2_top_mane.addOrReplaceChild("neck_average_straight_short_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.9832F, -2.0559F));

            PartDefinition neck_average_straight_short_2_top_mane_connector_individual = neck_average_straight_short_2_top_mane_connector.addOrReplaceChild("neck_average_straight_short_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

            PartDefinition cube_r6 = neck_average_straight_short_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(774, 933).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_short_2_top_mane_connector2 = neck_average_straight_short_2_top_mane_connector.addOrReplaceChild("neck_average_straight_short_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

            PartDefinition neck_average_straight_short_2_top_mane_connector2_individual = neck_average_straight_short_2_top_mane_connector2.addOrReplaceChild("neck_average_straight_short_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.3771F, 0.2024F, -0.0684F));

            PartDefinition cube_r7 = neck_average_straight_short_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(774, 940).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_short_2_top_mane_flow = neck_average_straight_short_2_top_mane_connector2.addOrReplaceChild("neck_average_straight_short_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5028F, -0.3575F, 0.0894F, -0.1309F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_average_straight_short_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(760, 934).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

            PartDefinition neck_average_straight_short_2_bottom_mane = neck_average_straight_short_2_mane.addOrReplaceChild("neck_average_straight_short_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.8883F, 2.1095F, 1.5273F));

            PartDefinition neck_average_straight_short_2_bottom_mane_connector = neck_average_straight_short_2_bottom_mane.addOrReplaceChild("neck_average_straight_short_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

            PartDefinition neck_average_straight_short_2_bottom_mane_connector_individual = neck_average_straight_short_2_bottom_mane_connector.addOrReplaceChild("neck_average_straight_short_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 0.5189F, 0.0979F));

            PartDefinition cube_r9 = neck_average_straight_short_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(785, 936).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.1044F, -3.3945F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_short_2_bottom_mane_connector2 = neck_average_straight_short_2_bottom_mane_connector.addOrReplaceChild("neck_average_straight_short_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.7151F, 0.6257F));

            PartDefinition neck_average_straight_short_2_bottom_mane_connector2_individual = neck_average_straight_short_2_bottom_mane_connector2.addOrReplaceChild("neck_average_straight_short_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, 0.8593F, -0.1231F));

            PartDefinition cube_r10 = neck_average_straight_short_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(781, 946).addBox(-2.0F, -2.0F, 1.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.8258F, -3.8098F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_short_2_bottom_mane_flow = neck_average_straight_short_2_bottom_mane_connector2.addOrReplaceChild("neck_average_straight_short_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6816F, 0.3575F, -0.1788F, 0.0F, 0.0F, 0.0436F));

            PartDefinition cube_r11 = neck_average_straight_short_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(765, 939).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2682F, 0.0F, -0.9774F, -0.0927F, -0.1377F));

        } else if (muscleMass.equals("average") && length.equals("average") && variation == 1) {
            PartDefinition neck_average_straight_average_1 = partdefinition.addOrReplaceChild("neck_average_straight_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_average_straight_average_1_individual = neck_average_straight_average_1.addOrReplaceChild("neck_average_straight_average_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, -1.6089F, -0.0894F, -0.5672F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_average_1_crest = neck_average_straight_average_1_individual.addOrReplaceChild("neck_average_straight_average_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.6302F, -2.9497F));

            PartDefinition neck_average_straight_average_1_crest_upper = neck_average_straight_average_1_crest.addOrReplaceChild("neck_average_straight_average_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3103F, -0.2071F, -1.5138F));

            PartDefinition cube_r1 = neck_average_straight_average_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(465, 864).addBox(-3.08F, -4.0F, -3.92F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -0.6646F, 0.663F, 1.6144F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_average_1_crest_lower = neck_average_straight_average_1_crest.addOrReplaceChild("neck_average_straight_average_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2404F, 0.5596F, 1.7788F));

            PartDefinition cube_r2 = neck_average_straight_average_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(497, 864).addBox(-4.08F, -5.0F, -0.92F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 0.9177F, 1.7788F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_average_1_middle_individual = neck_average_straight_average_1_individual.addOrReplaceChild("neck_average_straight_average_1_middle_individual", CubeListBuilder.create(), PartPose.offset(0.298F, -0.9778F, -1.6868F));

            PartDefinition cube_r3 = neck_average_straight_average_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(487, 852).addBox(-4.0F, -7.0F, -1.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4897F, 1.0357F, 2.9669F, 1.1345F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_average_straight_average_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(467, 850).addBox(-5.0708F, -11.03F, -0.9292F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5811F, 6.5392F, 3.322F, 0.8727F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_average_1_lower_individual = neck_average_straight_average_1_individual.addOrReplaceChild("neck_average_straight_average_1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3463F, 0.056F, -3.811F));

            PartDefinition cube_r5 = neck_average_straight_average_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(483, 864).addBox(-4.0784F, -5.0F, -0.9017F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 2.0468F, 1.0083F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_average_1_mane = neck_average_straight_average_1.addOrReplaceChild("neck_average_straight_average_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.4022F, 0.0F));

            PartDefinition neck_average_straight_average_1_top_mane = neck_average_straight_average_1_mane.addOrReplaceChild("neck_average_straight_average_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -1.1084F, -0.3498F));

            PartDefinition neck_average_straight_average_1_top_mane_connector = neck_average_straight_average_1_top_mane.addOrReplaceChild("neck_average_straight_average_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.2682F, -2.0559F));

            PartDefinition neck_average_straight_average_1_top_mane_connector_individual = neck_average_straight_average_1_top_mane_connector.addOrReplaceChild("neck_average_straight_average_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

            PartDefinition cube_r6 = neck_average_straight_average_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(823, 934).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_average_1_top_mane_connector2 = neck_average_straight_average_1_top_mane_connector.addOrReplaceChild("neck_average_straight_average_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

            PartDefinition neck_average_straight_average_1_top_mane_connector2_individual = neck_average_straight_average_1_top_mane_connector2.addOrReplaceChild("neck_average_straight_average_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.3771F, 0.2024F, -0.0684F));

            PartDefinition cube_r7 = neck_average_straight_average_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(822, 941).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_average_1_top_mane_flow = neck_average_straight_average_1_top_mane_connector2.addOrReplaceChild("neck_average_straight_average_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.324F, -0.3575F, 0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_average_straight_average_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(808, 935).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

            PartDefinition neck_average_straight_average_1_bottom_mane = neck_average_straight_average_1_mane.addOrReplaceChild("neck_average_straight_average_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, 2.1095F, 1.4379F));

            PartDefinition neck_average_straight_average_1_bottom_mane_connector = neck_average_straight_average_1_bottom_mane.addOrReplaceChild("neck_average_straight_average_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

            PartDefinition neck_average_straight_average_1_bottom_mane_connector_individual = neck_average_straight_average_1_bottom_mane_connector.addOrReplaceChild("neck_average_straight_average_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 0.9284F, 0.3847F));

            PartDefinition cube_r9 = neck_average_straight_average_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(833, 935).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.514F, -3.6813F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_average_1_bottom_mane_connector2 = neck_average_straight_average_1_bottom_mane_connector.addOrReplaceChild("neck_average_straight_average_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, 0.5363F, 1.2514F));

            PartDefinition neck_average_straight_average_1_bottom_mane_connector2_individual = neck_average_straight_average_1_bottom_mane_connector2.addOrReplaceChild("neck_average_straight_average_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, 0.0175F, -0.462F));

            PartDefinition cube_r10 = neck_average_straight_average_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(830, 945).addBox(-2.0F, -2.0F, 1.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.2354F, -4.0966F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_average_1_bottom_mane_flow = neck_average_straight_average_1_bottom_mane_connector2.addOrReplaceChild("neck_average_straight_average_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.2346F, 0.0894F, 0.2682F));

            PartDefinition cube_r11 = neck_average_straight_average_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(812, 939).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -1.5196F, -0.8045F, -0.9774F, -0.0927F, -0.1377F));

        } else if (muscleMass.equals("average") && length.equals("average") && variation == 2) {
            PartDefinition neck_average_straight_average_2 = partdefinition.addOrReplaceChild("neck_average_straight_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_average_straight_average_2_individual = neck_average_straight_average_2.addOrReplaceChild("neck_average_straight_average_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, -1.6089F, -0.0894F, -0.5672F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_average_2_crest = neck_average_straight_average_2_individual.addOrReplaceChild("neck_average_straight_average_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.1117F, -3.0391F));

            PartDefinition neck_average_straight_average_2_crest_upper = neck_average_straight_average_2_crest.addOrReplaceChild("neck_average_straight_average_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3997F, -0.8149F, -1.4244F));

            PartDefinition cube_r1 = neck_average_straight_average_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(520, 863).addBox(-2.4543F, -4.0F, -3.92F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0457F, -0.5752F, 0.663F, 1.6144F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_average_2_crest_lower = neck_average_straight_average_2_crest.addOrReplaceChild("neck_average_straight_average_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.4192F, 0.2525F, 2.3214F));

            PartDefinition cube_r2 = neck_average_straight_average_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(554, 863).addBox(-4.08F, -5.0F, -0.92F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 0.7064F, 1.3257F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_average_2_middle_individual = neck_average_straight_average_2_individual.addOrReplaceChild("neck_average_straight_average_2_middle_individual", CubeListBuilder.create(), PartPose.offset(0.3874F, -0.8902F, -1.1793F));

            PartDefinition cube_r3 = neck_average_straight_average_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(542, 850).addBox(-4.0F, -7.0F, -1.0F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4897F, 0.9481F, 2.4594F, 1.1345F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_average_straight_average_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(522, 848).addBox(-5.0708F, -11.03F, -0.9292F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5811F, 6.094F, 2.9933F, 0.8727F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_average_2_lower_individual = neck_average_straight_average_2_individual.addOrReplaceChild("neck_average_straight_average_2_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3826F, 0.3427F, -2.7757F));

            PartDefinition cube_r5 = neck_average_straight_average_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(538, 863).addBox(-5.0784F, -5.0F, -0.9017F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 1.76F, 0.5988F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_average_2_mane = neck_average_straight_average_2.addOrReplaceChild("neck_average_straight_average_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.4916F, 0.0F));

            PartDefinition neck_average_straight_average_2_top_mane = neck_average_straight_average_2_mane.addOrReplaceChild("neck_average_straight_average_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -0.6615F, -0.3498F));

            PartDefinition neck_average_straight_average_2_top_mane_connector = neck_average_straight_average_2_top_mane.addOrReplaceChild("neck_average_straight_average_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.6257F, -2.0559F));

            PartDefinition neck_average_straight_average_2_top_mane_connector_individual = neck_average_straight_average_2_top_mane_connector.addOrReplaceChild("neck_average_straight_average_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

            PartDefinition cube_r6 = neck_average_straight_average_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(874, 934).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_average_2_top_mane_connector2 = neck_average_straight_average_2_top_mane_connector.addOrReplaceChild("neck_average_straight_average_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

            PartDefinition neck_average_straight_average_2_top_mane_connector2_individual = neck_average_straight_average_2_top_mane_connector2.addOrReplaceChild("neck_average_straight_average_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.3771F, 0.2024F, -0.0684F));

            PartDefinition cube_r7 = neck_average_straight_average_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(874, 941).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_average_2_top_mane_flow = neck_average_straight_average_2_top_mane_connector2.addOrReplaceChild("neck_average_straight_average_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4134F, -0.3575F, 0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_average_straight_average_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(860, 935).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

            PartDefinition neck_average_straight_average_2_bottom_mane = neck_average_straight_average_2_mane.addOrReplaceChild("neck_average_straight_average_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, 2.1989F, 1.4379F));

            PartDefinition neck_average_straight_average_2_bottom_mane_connector = neck_average_straight_average_2_bottom_mane.addOrReplaceChild("neck_average_straight_average_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

            PartDefinition neck_average_straight_average_2_bottom_mane_connector_individual = neck_average_straight_average_2_bottom_mane_connector.addOrReplaceChild("neck_average_straight_average_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 1.338F, 0.6715F));

            PartDefinition cube_r9 = neck_average_straight_average_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(885, 933).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.9236F, -3.9681F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_average_2_bottom_mane_connector2 = neck_average_straight_average_2_bottom_mane_connector.addOrReplaceChild("neck_average_straight_average_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, 0.5363F, 1.2514F));

            PartDefinition neck_average_straight_average_2_bottom_mane_connector2_individual = neck_average_straight_average_2_bottom_mane_connector2.addOrReplaceChild("neck_average_straight_average_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, 0.4271F, -0.1753F));

            PartDefinition cube_r10 = neck_average_straight_average_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(883, 944).addBox(-2.0F, -2.0F, 1.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.645F, -4.3834F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_average_2_bottom_mane_flow = neck_average_straight_average_2_bottom_mane_connector2.addOrReplaceChild("neck_average_straight_average_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.1453F, -0.1788F, -0.0894F));

            PartDefinition cube_r11 = neck_average_straight_average_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(863, 938).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -1.5196F, -0.8045F, -0.9753F, -0.1144F, -0.1002F));

        } else if (muscleMass.equals("average") && length.equals("long") && variation == 1) {
            PartDefinition neck_average_straight_long_1 = partdefinition.addOrReplaceChild("neck_average_straight_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_average_straight_long_1_individual = neck_average_straight_long_1.addOrReplaceChild("neck_average_straight_long_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, -2.6816F, -1.0726F, -0.5672F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_long_1_crest = neck_average_straight_long_1_individual.addOrReplaceChild("neck_average_straight_long_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.1117F, -1.2514F));

            PartDefinition neck_average_straight_long_1_crest_upper = neck_average_straight_long_1_crest.addOrReplaceChild("neck_average_straight_long_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3997F, -0.6361F, -2.6758F));

            PartDefinition cube_r1 = neck_average_straight_long_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(579, 863).addBox(-3.08F, -4.0F, -3.92F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -0.754F, 0.1266F, 1.6144F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_long_1_crest_lower = neck_average_straight_long_1_crest.addOrReplaceChild("neck_average_straight_long_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2404F, 0.4638F, 0.9868F));

            PartDefinition cube_r2 = neck_average_straight_long_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(613, 863).addBox(-4.08F, -5.0F, -0.92F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 0.4951F, 0.8725F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_long_1_middle_individual = neck_average_straight_long_1_individual.addOrReplaceChild("neck_average_straight_long_1_middle_individual", CubeListBuilder.create(), PartPose.offset(0.3874F, -0.6239F, -0.7612F));

            PartDefinition cube_r3 = neck_average_straight_long_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(581, 847).addBox(-5.0708F, -11.03F, -0.9292F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5811F, 5.8277F, 2.5752F, 0.8727F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_average_straight_long_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(601, 849).addBox(-4.0F, -7.0F, -1.0F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4897F, 0.6818F, 2.0413F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_long_1_lower_individual = neck_average_straight_long_1_individual.addOrReplaceChild("neck_average_straight_long_1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3826F, 0.3427F, -2.7757F));

            PartDefinition cube_r5 = neck_average_straight_long_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(597, 863).addBox(-5.0784F, -5.0F, -0.9017F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 1.76F, 0.5988F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_long_1_mane = neck_average_straight_long_1.addOrReplaceChild("neck_average_straight_long_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -9.0279F, 0.0F));

            PartDefinition neck_average_straight_long_1_top_mane = neck_average_straight_long_1_mane.addOrReplaceChild("neck_average_straight_long_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -1.1084F, -1.3331F));

            PartDefinition neck_average_straight_long_1_top_mane_connector = neck_average_straight_long_1_top_mane.addOrReplaceChild("neck_average_straight_long_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.7151F, -2.0559F));

            PartDefinition neck_average_straight_long_1_top_mane_connector_individual = neck_average_straight_long_1_top_mane_connector.addOrReplaceChild("neck_average_straight_long_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

            PartDefinition cube_r6 = neck_average_straight_long_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(930, 934).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_long_1_top_mane_connector2 = neck_average_straight_long_1_top_mane_connector.addOrReplaceChild("neck_average_straight_long_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

            PartDefinition neck_average_straight_long_1_top_mane_connector2_individual = neck_average_straight_long_1_top_mane_connector2.addOrReplaceChild("neck_average_straight_long_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.3771F, 0.2024F, -0.0684F));

            PartDefinition cube_r7 = neck_average_straight_long_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(930, 941).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_long_1_top_mane_flow = neck_average_straight_long_1_top_mane_connector2.addOrReplaceChild("neck_average_straight_long_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5028F, -0.3575F, 0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_average_straight_long_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(916, 935).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

            PartDefinition neck_average_straight_long_1_bottom_mane = neck_average_straight_long_1_mane.addOrReplaceChild("neck_average_straight_long_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, 1.6626F, 0.4547F));

            PartDefinition neck_average_straight_long_1_bottom_mane_connector = neck_average_straight_long_1_bottom_mane.addOrReplaceChild("neck_average_straight_long_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

            PartDefinition neck_average_straight_long_1_bottom_mane_connector_individual = neck_average_straight_long_1_bottom_mane_connector.addOrReplaceChild("neck_average_straight_long_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 1.7476F, 0.9583F));

            PartDefinition cube_r9 = neck_average_straight_long_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(941, 931).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.3331F, -4.2549F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_long_1_bottom_mane_connector2 = neck_average_straight_long_1_bottom_mane_connector.addOrReplaceChild("neck_average_straight_long_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, 1.4302F, 1.8771F));

            PartDefinition neck_average_straight_long_1_bottom_mane_connector2_individual = neck_average_straight_long_1_bottom_mane_connector2.addOrReplaceChild("neck_average_straight_long_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, -0.0572F, -0.5142F));

            PartDefinition cube_r10 = neck_average_straight_long_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(940, 943).addBox(-2.0F, -2.0F, 1.0F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.0545F, -4.6702F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_long_1_bottom_mane_flow = neck_average_straight_long_1_bottom_mane_connector2.addOrReplaceChild("neck_average_straight_long_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.324F, 0.2682F, 0.6257F));

            PartDefinition cube_r11 = neck_average_straight_long_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(918, 937).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -2.6816F, -1.8771F, -0.9753F, -0.1144F, -0.1002F));

        } else if (muscleMass.equals("average") && length.equals("long") && variation == 2) {
            PartDefinition neck_average_straight_long_2 = partdefinition.addOrReplaceChild("neck_average_straight_long_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_average_straight_long_2_individual = neck_average_straight_long_2.addOrReplaceChild("neck_average_straight_long_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, -3.5754F, -1.8771F, -0.5672F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_long_2_crest = neck_average_straight_long_2_individual.addOrReplaceChild("neck_average_straight_long_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.3799F, -1.5196F));

            PartDefinition neck_average_straight_long_2_crest_upper = neck_average_straight_long_2_crest.addOrReplaceChild("neck_average_straight_long_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3103F, -0.1892F, -2.7652F));

            PartDefinition cube_r1 = neck_average_straight_long_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(634, 862).addBox(-3.08F, -4.0F, -3.92F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -0.9328F, 0.4842F, 1.6144F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_long_2_crest_lower = neck_average_straight_long_2_crest.addOrReplaceChild("neck_average_straight_long_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.3298F, 0.9433F, 1.7081F));

            PartDefinition cube_r2 = neck_average_straight_long_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(668, 862).addBox(-4.08F, -5.0F, -0.92F, 4.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 0.2838F, 0.4193F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_long_2_middle_individual = neck_average_straight_long_2_individual.addOrReplaceChild("neck_average_straight_long_2_middle_individual", CubeListBuilder.create(), PartPose.offset(0.298F, -0.3575F, -0.3432F));

            PartDefinition cube_r3 = neck_average_straight_long_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(656, 847).addBox(-4.0F, -7.0F, -1.0F, 5.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4897F, 0.4154F, 1.6232F, 1.1345F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_average_straight_long_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(636, 845).addBox(-5.0708F, -11.03F, -0.9292F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5811F, 5.5613F, 2.1571F, 0.8727F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_long_2_lower_individual = neck_average_straight_long_2_individual.addOrReplaceChild("neck_average_straight_long_2_lower_individual", CubeListBuilder.create(), PartPose.offset(0.2932F, 0.3427F, -2.7757F));

            PartDefinition cube_r5 = neck_average_straight_long_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(652, 862).addBox(-5.0784F, -5.0F, -0.9017F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 1.76F, 0.5988F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_long_2_mane = neck_average_straight_long_2.addOrReplaceChild("neck_average_straight_long_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.6704F, 0.0F));

            PartDefinition neck_average_straight_long_2_top_mane = neck_average_straight_long_2_mane.addOrReplaceChild("neck_average_straight_long_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -2.4492F, -2.1375F));

            PartDefinition neck_average_straight_long_2_top_mane_connector = neck_average_straight_long_2_top_mane.addOrReplaceChild("neck_average_straight_long_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.6257F, -2.0559F));

            PartDefinition neck_average_straight_long_2_top_mane_connector_individual = neck_average_straight_long_2_top_mane_connector.addOrReplaceChild("neck_average_straight_long_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

            PartDefinition cube_r6 = neck_average_straight_long_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(986, 932).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_long_2_top_mane_connector2 = neck_average_straight_long_2_top_mane_connector.addOrReplaceChild("neck_average_straight_long_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

            PartDefinition neck_average_straight_long_2_top_mane_connector2_individual = neck_average_straight_long_2_top_mane_connector2.addOrReplaceChild("neck_average_straight_long_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.3771F, 0.2024F, -0.0684F));

            PartDefinition cube_r7 = neck_average_straight_long_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(986, 939).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_long_2_top_mane_flow = neck_average_straight_long_2_top_mane_connector2.addOrReplaceChild("neck_average_straight_long_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.324F, -0.3575F, 0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_average_straight_long_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(972, 933).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

            PartDefinition neck_average_straight_long_2_bottom_mane = neck_average_straight_long_2_mane.addOrReplaceChild("neck_average_straight_long_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, 0.4112F, -0.3498F));

            PartDefinition neck_average_straight_long_2_bottom_mane_connector = neck_average_straight_long_2_bottom_mane.addOrReplaceChild("neck_average_straight_long_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

            PartDefinition neck_average_straight_long_2_bottom_mane_connector_individual = neck_average_straight_long_2_bottom_mane_connector.addOrReplaceChild("neck_average_straight_long_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 2.1572F, 1.245F));

            PartDefinition cube_r9 = neck_average_straight_long_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(997, 928).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.7427F, -4.5417F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_long_2_bottom_mane_connector2 = neck_average_straight_long_2_bottom_mane_connector.addOrReplaceChild("neck_average_straight_long_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, 1.4302F, 1.8771F));

            PartDefinition neck_average_straight_long_2_bottom_mane_connector2_individual = neck_average_straight_long_2_bottom_mane_connector2.addOrReplaceChild("neck_average_straight_long_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, 0.3524F, -0.2274F));

            PartDefinition cube_r10 = neck_average_straight_long_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(991, 941).addBox(-2.0F, -2.0F, 1.0F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.4641F, -4.957F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_average_straight_long_2_bottom_mane_flow = neck_average_straight_long_2_bottom_mane_connector2.addOrReplaceChild("neck_average_straight_long_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.1453F, 0.2682F, 0.6257F));

            PartDefinition cube_r11 = neck_average_straight_long_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(973, 934).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -2.6816F, -1.8771F, -0.9753F, -0.1144F, -0.1002F));

        } else if (muscleMass.equals("muscular") && length.equals("short") && variation == 1) {
            PartDefinition neck_muscular_straight_short_1 = partdefinition.addOrReplaceChild("neck_muscular_straight_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_muscular_straight_short_1_individual = neck_muscular_straight_short_1.addOrReplaceChild("neck_muscular_straight_short_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, 0.8939F, 0.0894F, -0.5672F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_short_1_crest = neck_muscular_straight_short_1_individual.addOrReplaceChild("neck_muscular_straight_short_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.1117F, -2.8603F));

            PartDefinition neck_muscular_straight_short_1_crest_upper = neck_muscular_straight_short_1_crest.addOrReplaceChild("neck_muscular_straight_short_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3466F, -0.2786F, -0.5306F));

            PartDefinition cube_r1 = neck_muscular_straight_short_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(358, 896).addBox(-4.08F, -4.0F, -3.92F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.08F, -1.1116F, -0.4097F, 1.6144F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_short_1_crest_lower = neck_muscular_straight_short_1_crest.addOrReplaceChild("neck_muscular_straight_short_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.3298F, -0.1701F, 1.2363F));

            PartDefinition cube_r2 = neck_muscular_straight_short_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(378, 896).addBox(-4.08F, -5.0F, -0.92F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 1.1291F, 2.232F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_short_1_middle_individual = neck_muscular_straight_short_1_individual.addOrReplaceChild("neck_muscular_straight_short_1_middle_individual", CubeListBuilder.create(), PartPose.offset(0.4684F, -1.319F, -2.6837F));

            PartDefinition cube_r3 = neck_muscular_straight_short_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(358, 885).addBox(-6.0708F, -11.03F, -0.9292F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0364F, 6.8804F, 4.3189F, 0.8727F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_muscular_straight_short_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(378, 886).addBox(-5.0F, -7.0F, -1.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0344F, 1.3769F, 3.9638F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_short_1_lower_individual = neck_muscular_straight_short_1_individual.addOrReplaceChild("neck_muscular_straight_short_1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3826F, -0.2308F, -4.2206F));

            PartDefinition cube_r5 = neck_muscular_straight_short_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(374, 877).addBox(-5.0784F, -5.0F, -0.9017F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 2.3336F, 1.4179F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_short_1_mane = neck_muscular_straight_short_1.addOrReplaceChild("neck_muscular_straight_short_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -5.6313F, 0.0F));

            PartDefinition neck_muscular_straight_short_1_top_mane = neck_muscular_straight_short_1_mane.addOrReplaceChild("neck_muscular_straight_short_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -0.3933F, -0.171F));

            PartDefinition neck_muscular_straight_short_1_top_mane_connector = neck_muscular_straight_short_1_top_mane.addOrReplaceChild("neck_muscular_straight_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -1.2514F, -2.0559F));

            PartDefinition neck_muscular_straight_short_1_top_mane_connector_individual = neck_muscular_straight_short_1_top_mane_connector.addOrReplaceChild("neck_muscular_straight_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

            PartDefinition cube_r6 = neck_muscular_straight_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(722, 933).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_short_1_top_mane_connector2 = neck_muscular_straight_short_1_top_mane_connector.addOrReplaceChild("neck_muscular_straight_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

            PartDefinition neck_muscular_straight_short_1_top_mane_connector2_individual = neck_muscular_straight_short_1_top_mane_connector2.addOrReplaceChild("neck_muscular_straight_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.3771F, 0.2024F, -0.0684F));

            PartDefinition cube_r7 = neck_muscular_straight_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(724, 940).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_short_1_top_mane_flow = neck_muscular_straight_short_1_top_mane_connector2.addOrReplaceChild("neck_muscular_straight_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5028F, -0.3575F, 0.0894F, -0.1134F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_muscular_straight_short_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(710, 934).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

            PartDefinition neck_muscular_straight_short_1_bottom_mane = neck_muscular_straight_short_1_mane.addOrReplaceChild("neck_muscular_straight_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, 1.8413F, 1.6167F));

            PartDefinition neck_muscular_straight_short_1_bottom_mane_connector = neck_muscular_straight_short_1_bottom_mane.addOrReplaceChild("neck_muscular_straight_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

            PartDefinition neck_muscular_straight_short_1_bottom_mane_connector_individual = neck_muscular_straight_short_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_straight_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 0.1093F, -0.1889F));

            PartDefinition cube_r9 = neck_muscular_straight_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(736, 940).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6948F, -3.1077F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_short_1_bottom_mane_connector2 = neck_muscular_straight_short_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_straight_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.7151F, 0.6257F));

            PartDefinition neck_muscular_straight_short_1_bottom_mane_connector2_individual = neck_muscular_straight_short_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_straight_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, 0.4498F, -0.4099F));

            PartDefinition cube_r10 = neck_muscular_straight_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(724, 947).addBox(-2.0F, -2.0F, 1.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.4162F, -3.523F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_short_1_bottom_mane_flow = neck_muscular_straight_short_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_straight_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.5922F, 0.1788F, -0.0894F));

            PartDefinition cube_r11 = neck_muscular_straight_short_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(716, 940).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2682F, 0.0F, -0.9774F, -0.0927F, -0.1377F));

        } else if (muscleMass.equals("muscular") && length.equals("short") && variation == 2) {
            PartDefinition neck_muscular_straight_short_2 = partdefinition.addOrReplaceChild("neck_muscular_straight_short_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_muscular_straight_short_2_individual = neck_muscular_straight_short_2.addOrReplaceChild("neck_muscular_straight_short_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5672F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_short_2_crest = neck_muscular_straight_short_2_individual.addOrReplaceChild("neck_muscular_straight_short_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.5587F, -3.3073F));

            PartDefinition neck_muscular_straight_short_2_crest_upper = neck_muscular_straight_short_2_crest.addOrReplaceChild("neck_muscular_straight_short_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3466F, -0.0998F, -0.62F));

            PartDefinition cube_r1 = neck_muscular_straight_short_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(408, 894).addBox(-4.08F, -4.0F, -3.92F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.08F, -0.8434F, 0.1266F, 1.6144F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_short_2_crest_lower = neck_muscular_straight_short_2_crest.addOrReplaceChild("neck_muscular_straight_short_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2404F, 0.2768F, 1.6832F));

            PartDefinition cube_r2 = neck_muscular_straight_short_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(428, 894).addBox(-4.08F, -5.0F, -0.92F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 1.1291F, 2.232F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_short_2_middle_individual = neck_muscular_straight_short_2_individual.addOrReplaceChild("neck_muscular_straight_short_2_middle_individual", CubeListBuilder.create(), PartPose.offset(0.3343F, -1.0526F, -2.2656F));

            PartDefinition cube_r3 = neck_muscular_straight_short_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(412, 882).addBox(-6.0708F, -11.03F, -0.9292F, 6.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0811F, 6.614F, 3.9008F, 0.8727F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_muscular_straight_short_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(432, 883).addBox(-5.0F, -7.0F, -1.0F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9897F, 1.1105F, 3.5457F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_short_2_lower_individual = neck_muscular_straight_short_2_individual.addOrReplaceChild("neck_muscular_straight_short_2_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3826F, -0.2308F, -4.2206F));

            PartDefinition cube_r5 = neck_muscular_straight_short_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(440, 894).addBox(-5.0784F, -5.0F, -0.9017F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 2.3336F, 1.4179F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_short_2_mane = neck_muscular_straight_short_2.addOrReplaceChild("neck_muscular_straight_short_2_mane", CubeListBuilder.create(), PartPose.offset(-3.5754F, -7.1508F, 0.7898F));

            PartDefinition neck_muscular_straight_short_2_top_mane = neck_muscular_straight_short_2_mane.addOrReplaceChild("neck_muscular_straight_short_2_top_mane", CubeListBuilder.create(), PartPose.offset(4.4637F, -0.2145F, -1.0502F));

            PartDefinition neck_muscular_straight_short_2_top_mane_connector = neck_muscular_straight_short_2_top_mane.addOrReplaceChild("neck_muscular_straight_short_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.8045F, -2.0559F));

            PartDefinition neck_muscular_straight_short_2_top_mane_connector_individual = neck_muscular_straight_short_2_top_mane_connector.addOrReplaceChild("neck_muscular_straight_short_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

            PartDefinition cube_r6 = neck_muscular_straight_short_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(774, 933).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_short_2_top_mane_connector2 = neck_muscular_straight_short_2_top_mane_connector.addOrReplaceChild("neck_muscular_straight_short_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

            PartDefinition neck_muscular_straight_short_2_top_mane_connector2_individual = neck_muscular_straight_short_2_top_mane_connector2.addOrReplaceChild("neck_muscular_straight_short_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.3771F, 0.2024F, -0.0684F));

            PartDefinition cube_r7 = neck_muscular_straight_short_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(774, 940).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_short_2_top_mane_flow = neck_muscular_straight_short_2_top_mane_connector2.addOrReplaceChild("neck_muscular_straight_short_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5028F, -0.3575F, 0.0894F, -0.1309F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_muscular_straight_short_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(760, 934).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

            PartDefinition neck_muscular_straight_short_2_bottom_mane = neck_muscular_straight_short_2_mane.addOrReplaceChild("neck_muscular_straight_short_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(4.4637F, 2.467F, 0.7375F));

            PartDefinition neck_muscular_straight_short_2_bottom_mane_connector = neck_muscular_straight_short_2_bottom_mane.addOrReplaceChild("neck_muscular_straight_short_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

            PartDefinition neck_muscular_straight_short_2_bottom_mane_connector_individual = neck_muscular_straight_short_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_straight_short_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 0.5189F, 0.0979F));

            PartDefinition cube_r9 = neck_muscular_straight_short_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(785, 936).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.1044F, -3.3945F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_short_2_bottom_mane_connector2 = neck_muscular_straight_short_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_straight_short_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.7151F, 0.6257F));

            PartDefinition neck_muscular_straight_short_2_bottom_mane_connector2_individual = neck_muscular_straight_short_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_straight_short_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, 0.8593F, -0.1231F));

            PartDefinition cube_r10 = neck_muscular_straight_short_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(781, 946).addBox(-2.0F, -2.0F, 1.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.8258F, -3.8098F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_short_2_bottom_mane_flow = neck_muscular_straight_short_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_straight_short_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6816F, 0.3575F, -0.1788F, 0.0F, 0.0F, 0.0436F));

            PartDefinition cube_r11 = neck_muscular_straight_short_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(765, 939).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2682F, 0.0F, -0.9774F, -0.0927F, -0.1377F));

        } else if (muscleMass.equals("muscular") && length.equals("average") && variation == 1) {
            PartDefinition neck_muscular_straight_average_1 = partdefinition.addOrReplaceChild("neck_muscular_straight_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_muscular_straight_average_1_individual = neck_muscular_straight_average_1.addOrReplaceChild("neck_muscular_straight_average_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, -1.6089F, -0.0894F, -0.5672F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_average_1_crest = neck_muscular_straight_average_1_individual.addOrReplaceChild("neck_muscular_straight_average_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.3799F, -3.5754F));

            PartDefinition neck_muscular_straight_average_1_crest_upper = neck_muscular_straight_average_1_crest.addOrReplaceChild("neck_muscular_straight_average_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.274F, 0.2577F, -0.7987F));

            PartDefinition cube_r1 = neck_muscular_straight_average_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(463, 893).addBox(-3.08F, -4.0F, -3.92F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.08F, -1.3797F, 0.5736F, 1.6144F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_average_1_crest_lower = neck_muscular_straight_average_1_crest.addOrReplaceChild("neck_muscular_straight_average_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2404F, 0.3093F, 2.4045F));

            PartDefinition cube_r2 = neck_muscular_straight_average_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(497, 893).addBox(-4.08F, -5.0F, -0.92F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 0.9177F, 1.7788F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_average_1_middle_individual = neck_muscular_straight_average_1_individual.addOrReplaceChild("neck_muscular_straight_average_1_middle_individual", CubeListBuilder.create(), PartPose.offset(0.2617F, -0.9778F, -1.6868F));

            PartDefinition cube_r3 = neck_muscular_straight_average_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(487, 881).addBox(-4.0F, -7.0F, -1.0F, 6.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9897F, 1.0357F, 2.9669F, 1.1345F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_muscular_straight_average_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(465, 879).addBox(-5.0708F, -11.03F, -0.9292F, 6.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0811F, 6.5392F, 3.322F, 0.8727F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_average_1_lower_individual = neck_muscular_straight_average_1_individual.addOrReplaceChild("neck_muscular_straight_average_1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3463F, 0.056F, -3.811F));

            PartDefinition cube_r5 = neck_muscular_straight_average_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(483, 893).addBox(-4.0784F, -5.0F, -0.9017F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 2.0468F, 1.0083F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_average_1_mane = neck_muscular_straight_average_1.addOrReplaceChild("neck_muscular_straight_average_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_average_1_top_mane = neck_muscular_straight_average_1_mane.addOrReplaceChild("neck_muscular_straight_average_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -2.7173F, -0.3498F));

            PartDefinition neck_muscular_straight_average_1_top_mane_connector = neck_muscular_straight_average_1_top_mane.addOrReplaceChild("neck_muscular_straight_average_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -7.0615F, -2.0559F));

            PartDefinition neck_muscular_straight_average_1_top_mane_connector_individual = neck_muscular_straight_average_1_top_mane_connector.addOrReplaceChild("neck_muscular_straight_average_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.8045F, 7.7765F, 1.8771F));

            PartDefinition cube_r6 = neck_muscular_straight_average_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(823, 934).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3575F, -6.9721F, -2.324F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_average_1_top_mane_connector2 = neck_muscular_straight_average_1_top_mane_connector.addOrReplaceChild("neck_muscular_straight_average_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

            PartDefinition neck_muscular_straight_average_1_top_mane_connector2_individual = neck_muscular_straight_average_1_top_mane_connector2.addOrReplaceChild("neck_muscular_straight_average_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(-0.4469F, 8.2235F, 1.0726F));

            PartDefinition cube_r7 = neck_muscular_straight_average_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(822, 941).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.324F, -6.9721F, -2.324F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_average_1_top_mane_flow = neck_muscular_straight_average_1_top_mane_connector2.addOrReplaceChild("neck_muscular_straight_average_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.324F, -0.3575F, 0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_muscular_straight_average_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(808, 935).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

            PartDefinition neck_muscular_straight_average_1_bottom_mane = neck_muscular_straight_average_1_mane.addOrReplaceChild("neck_muscular_straight_average_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -6.2927F, 1.4379F));

            PartDefinition neck_muscular_straight_average_1_bottom_mane_connector = neck_muscular_straight_average_1_bottom_mane.addOrReplaceChild("neck_muscular_straight_average_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

            PartDefinition neck_muscular_straight_average_1_bottom_mane_connector_individual = neck_muscular_straight_average_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_straight_average_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2682F, -0.2682F));

            PartDefinition cube_r9 = neck_muscular_straight_average_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(833, 935).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2613F, -2.3174F, -3.0285F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_average_1_bottom_mane_connector2 = neck_muscular_straight_average_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_straight_average_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, 0.5363F, 1.2514F));

            PartDefinition neck_muscular_straight_average_1_bottom_mane_connector2_individual = neck_muscular_straight_average_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_straight_average_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.7151F, -0.6257F, 0.0F));

            PartDefinition cube_r10 = neck_muscular_straight_average_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(830, 945).addBox(-2.0F, -2.0F, 1.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3408F, -2.5922F, -4.5587F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_average_1_bottom_mane_flow = neck_muscular_straight_average_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_straight_average_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.2346F, 0.0894F, 0.2682F));

            PartDefinition cube_r11 = neck_muscular_straight_average_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(812, 939).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -1.5196F, -0.8045F, -0.9774F, -0.0927F, -0.1377F));

        } else if (muscleMass.equals("muscular") && length.equals("average") && variation == 2) {
            PartDefinition neck_muscular_straight_average_2 = partdefinition.addOrReplaceChild("neck_muscular_straight_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_muscular_straight_average_2_individual = neck_muscular_straight_average_2.addOrReplaceChild("neck_muscular_straight_average_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, -1.6089F, -0.0894F, -0.5672F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_average_2_crest = neck_muscular_straight_average_2_individual.addOrReplaceChild("neck_muscular_straight_average_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0223F, -2.5922F));

            PartDefinition neck_muscular_straight_average_2_crest_upper = neck_muscular_straight_average_2_crest.addOrReplaceChild("neck_muscular_straight_average_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3634F, -0.1892F, -1.6211F));

            PartDefinition cube_r1 = neck_muscular_straight_average_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(518, 892).addBox(-3.08F, -4.0F, -3.92F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.08F, -1.2903F, 0.4127F, 1.6144F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_average_2_crest_lower = neck_muscular_straight_average_2_crest.addOrReplaceChild("neck_muscular_straight_average_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2404F, 0.1631F, 1.8744F));

            PartDefinition cube_r2 = neck_muscular_straight_average_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(554, 892).addBox(-4.08F, -5.0F, -0.92F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 0.7064F, 1.3257F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_average_2_middle_individual = neck_muscular_straight_average_2_individual.addOrReplaceChild("neck_muscular_straight_average_2_middle_individual", CubeListBuilder.create(), PartPose.offset(0.3511F, -0.8902F, -1.1793F));

            PartDefinition cube_r3 = neck_muscular_straight_average_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(520, 877).addBox(-5.0708F, -11.03F, -0.9292F, 6.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0811F, 6.094F, 2.9933F, 0.8727F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_muscular_straight_average_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(542, 879).addBox(-4.0F, -7.0F, -1.0F, 6.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9897F, 0.9481F, 2.4594F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_average_2_lower_individual = neck_muscular_straight_average_2_individual.addOrReplaceChild("neck_muscular_straight_average_2_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3826F, 0.3427F, -2.7757F));

            PartDefinition cube_r5 = neck_muscular_straight_average_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(538, 892).addBox(-5.0784F, -5.0F, -0.9017F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 1.76F, 0.5988F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_average_2_mane = neck_muscular_straight_average_2.addOrReplaceChild("neck_muscular_straight_average_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.3296F, 0.2682F));

            PartDefinition neck_muscular_straight_average_2_top_mane = neck_muscular_straight_average_2_mane.addOrReplaceChild("neck_muscular_straight_average_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -0.4827F, -0.618F));

            PartDefinition neck_muscular_straight_average_2_top_mane_connector = neck_muscular_straight_average_2_top_mane.addOrReplaceChild("neck_muscular_straight_average_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -1.9665F, -2.0559F));

            PartDefinition neck_muscular_straight_average_2_top_mane_connector_individual = neck_muscular_straight_average_2_top_mane_connector.addOrReplaceChild("neck_muscular_straight_average_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

            PartDefinition cube_r6 = neck_muscular_straight_average_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(874, 934).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_average_2_top_mane_connector2 = neck_muscular_straight_average_2_top_mane_connector.addOrReplaceChild("neck_muscular_straight_average_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

            PartDefinition neck_muscular_straight_average_2_top_mane_connector2_individual = neck_muscular_straight_average_2_top_mane_connector2.addOrReplaceChild("neck_muscular_straight_average_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.3771F, 0.2024F, -0.0684F));

            PartDefinition cube_r7 = neck_muscular_straight_average_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(874, 941).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_average_2_top_mane_flow = neck_muscular_straight_average_2_top_mane_connector2.addOrReplaceChild("neck_muscular_straight_average_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4134F, -0.3575F, 0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_muscular_straight_average_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(860, 935).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

            PartDefinition neck_muscular_straight_average_2_bottom_mane = neck_muscular_straight_average_2_mane.addOrReplaceChild("neck_muscular_straight_average_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, 1.0369F, 1.1697F));

            PartDefinition neck_muscular_straight_average_2_bottom_mane_connector = neck_muscular_straight_average_2_bottom_mane.addOrReplaceChild("neck_muscular_straight_average_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

            PartDefinition neck_muscular_straight_average_2_bottom_mane_connector_individual = neck_muscular_straight_average_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_straight_average_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 1.338F, 0.6715F));

            PartDefinition cube_r9 = neck_muscular_straight_average_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(885, 933).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.9236F, -3.9681F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_average_2_bottom_mane_connector2 = neck_muscular_straight_average_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_straight_average_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, 0.5363F, 1.2514F));

            PartDefinition neck_muscular_straight_average_2_bottom_mane_connector2_individual = neck_muscular_straight_average_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_straight_average_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, 0.4271F, -0.1753F));

            PartDefinition cube_r10 = neck_muscular_straight_average_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(883, 944).addBox(-2.0F, -2.0F, 1.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.645F, -4.3834F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_average_2_bottom_mane_flow = neck_muscular_straight_average_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_straight_average_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.1453F, -0.1788F, -0.0894F));

            PartDefinition cube_r11 = neck_muscular_straight_average_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(863, 938).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -1.5196F, -0.8045F, -0.9753F, -0.1144F, -0.1002F));

        } else if (muscleMass.equals("muscular") && length.equals("long") && variation == 1) {
            PartDefinition neck_muscular_straight_long_1 = partdefinition.addOrReplaceChild("neck_muscular_straight_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_muscular_straight_long_1_individual = neck_muscular_straight_long_1.addOrReplaceChild("neck_muscular_straight_long_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, -2.6816F, -1.0726F, -0.5672F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_long_1_crest = neck_muscular_straight_long_1_individual.addOrReplaceChild("neck_muscular_straight_long_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -3.5754F, -3.2179F));

            PartDefinition neck_muscular_straight_long_1_crest_upper = neck_muscular_straight_long_1_crest.addOrReplaceChild("neck_muscular_straight_long_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3634F, -1.0831F, -0.7093F));

            PartDefinition cube_r1 = neck_muscular_straight_long_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(578, 893).addBox(-3.08F, -4.0F, -3.92F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.08F, -0.8434F, 0.1266F, 1.6144F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_long_1_crest_lower = neck_muscular_straight_long_1_crest.addOrReplaceChild("neck_muscular_straight_long_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2404F, -0.0725F, 2.9533F));

            PartDefinition cube_r2 = neck_muscular_straight_long_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(614, 893).addBox(-4.08F, -5.0F, -0.92F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 0.4951F, 0.8725F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_long_1_middle_individual = neck_muscular_straight_long_1_individual.addOrReplaceChild("neck_muscular_straight_long_1_middle_individual", CubeListBuilder.create(), PartPose.offset(0.3511F, -0.6239F, -0.7612F));

            PartDefinition cube_r3 = neck_muscular_straight_long_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(602, 879).addBox(-4.0F, -7.0F, -1.0F, 6.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9897F, 0.6818F, 2.0413F, 1.1345F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_muscular_straight_long_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(580, 877).addBox(-5.0708F, -11.03F, -0.9292F, 6.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0811F, 5.8277F, 2.5752F, 0.8727F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_long_1_lower_individual = neck_muscular_straight_long_1_individual.addOrReplaceChild("neck_muscular_straight_long_1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3826F, 0.3427F, -2.7757F));

            PartDefinition cube_r5 = neck_muscular_straight_long_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(598, 893).addBox(-5.0784F, -5.0F, -0.9017F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 1.76F, 0.5988F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_long_1_mane = neck_muscular_straight_long_1.addOrReplaceChild("neck_muscular_straight_long_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.581F, 0.0F));

            PartDefinition neck_muscular_straight_long_1_top_mane = neck_muscular_straight_long_1_mane.addOrReplaceChild("neck_muscular_straight_long_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -2.6279F, -1.3331F));

            PartDefinition neck_muscular_straight_long_1_top_mane_connector = neck_muscular_straight_long_1_top_mane.addOrReplaceChild("neck_muscular_straight_long_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, 0.3575F, -2.0559F));

            PartDefinition neck_muscular_straight_long_1_top_mane_connector_individual = neck_muscular_straight_long_1_top_mane_connector.addOrReplaceChild("neck_muscular_straight_long_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

            PartDefinition cube_r6 = neck_muscular_straight_long_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(930, 934).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_long_1_top_mane_connector2 = neck_muscular_straight_long_1_top_mane_connector.addOrReplaceChild("neck_muscular_straight_long_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

            PartDefinition neck_muscular_straight_long_1_top_mane_connector2_individual = neck_muscular_straight_long_1_top_mane_connector2.addOrReplaceChild("neck_muscular_straight_long_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.3771F, 0.2024F, -0.0684F));

            PartDefinition cube_r7 = neck_muscular_straight_long_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(930, 941).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_long_1_top_mane_flow = neck_muscular_straight_long_1_top_mane_connector2.addOrReplaceChild("neck_muscular_straight_long_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5028F, -0.3575F, 0.0894F, -0.0436F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_muscular_straight_long_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(916, 935).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

            PartDefinition neck_muscular_straight_long_1_bottom_mane = neck_muscular_straight_long_1_mane.addOrReplaceChild("neck_muscular_straight_long_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, 1.2156F, 0.4547F));

            PartDefinition neck_muscular_straight_long_1_bottom_mane_connector = neck_muscular_straight_long_1_bottom_mane.addOrReplaceChild("neck_muscular_straight_long_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

            PartDefinition neck_muscular_straight_long_1_bottom_mane_connector_individual = neck_muscular_straight_long_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_straight_long_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 1.7476F, 0.9583F));

            PartDefinition cube_r9 = neck_muscular_straight_long_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(941, 931).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.3331F, -4.2549F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_long_1_bottom_mane_connector2 = neck_muscular_straight_long_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_straight_long_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, 1.4302F, 1.8771F));

            PartDefinition neck_muscular_straight_long_1_bottom_mane_connector2_individual = neck_muscular_straight_long_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_straight_long_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.7151F, -1.5196F, -0.6257F));

            PartDefinition cube_r10 = neck_muscular_straight_long_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(940, 943).addBox(-1.5F, -0.5F, -5.0F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8408F, 1.4624F, 0.1115F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_long_1_bottom_mane_flow = neck_muscular_straight_long_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_straight_long_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.324F, 0.2682F, 0.6257F));

            PartDefinition cube_r11 = neck_muscular_straight_long_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(918, 937).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -2.6816F, -1.8771F, -0.9753F, -0.1144F, -0.1002F));

        } else if (muscleMass.equals("muscular") && length.equals("long") && variation == 2) {
            PartDefinition neck_muscular_straight_long_2 = partdefinition.addOrReplaceChild("neck_muscular_straight_long_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_muscular_straight_long_2_individual = neck_muscular_straight_long_2.addOrReplaceChild("neck_muscular_straight_long_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, -3.5754F, -1.8771F, -0.5672F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_long_2_crest = neck_muscular_straight_long_2_individual.addOrReplaceChild("neck_muscular_straight_long_2_crest", CubeListBuilder.create(), PartPose.offset(0.2682F, -5.4525F, -3.486F));

            PartDefinition neck_muscular_straight_long_2_crest_upper = neck_muscular_straight_long_2_crest.addOrReplaceChild("neck_muscular_straight_long_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.0058F, 0.1683F, -0.2624F));

            PartDefinition cube_r1 = neck_muscular_straight_long_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(633, 893).addBox(-3.08F, -4.0F, -3.92F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.08F, -0.2177F, -0.0521F, 1.6144F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_long_2_crest_lower = neck_muscular_straight_long_2_crest.addOrReplaceChild("neck_muscular_straight_long_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.0617F, 2.0159F, 3.6746F));

            PartDefinition cube_r2 = neck_muscular_straight_long_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(669, 893).addBox(-4.08F, -5.0F, -0.92F, 4.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 0.2838F, 0.4193F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_long_2_middle_individual = neck_muscular_straight_long_2_individual.addOrReplaceChild("neck_muscular_straight_long_2_middle_individual", CubeListBuilder.create(), PartPose.offset(0.298F, -0.3575F, -0.3432F));

            PartDefinition cube_r3 = neck_muscular_straight_long_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(635, 876).addBox(-5.0708F, -11.03F, -0.9292F, 6.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0448F, 5.5613F, 2.1571F, 0.8727F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_muscular_straight_long_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(657, 878).addBox(-5.0F, -7.0F, -1.0F, 6.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.026F, 0.4154F, 1.6232F, 1.1345F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_long_2_lower_individual = neck_muscular_straight_long_2_individual.addOrReplaceChild("neck_muscular_straight_long_2_lower_individual", CubeListBuilder.create(), PartPose.offset(0.2932F, 0.3427F, -2.7757F));

            PartDefinition cube_r5 = neck_muscular_straight_long_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(653, 893).addBox(-5.0784F, -5.0F, -0.9017F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 1.76F, 0.5988F, 0.9599F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_long_2_mane = neck_muscular_straight_long_2.addOrReplaceChild("neck_muscular_straight_long_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.8492F, 0.0F));

            PartDefinition neck_muscular_straight_long_2_top_mane = neck_muscular_straight_long_2_mane.addOrReplaceChild("neck_muscular_straight_long_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -2.7173F, -2.942F));

            PartDefinition neck_muscular_straight_long_2_top_mane_connector = neck_muscular_straight_long_2_top_mane.addOrReplaceChild("neck_muscular_straight_long_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.1788F, -1.2514F));

            PartDefinition neck_muscular_straight_long_2_top_mane_connector_individual = neck_muscular_straight_long_2_top_mane_connector.addOrReplaceChild("neck_muscular_straight_long_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

            PartDefinition cube_r6 = neck_muscular_straight_long_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(986, 932).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_long_2_top_mane_connector2 = neck_muscular_straight_long_2_top_mane_connector.addOrReplaceChild("neck_muscular_straight_long_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

            PartDefinition neck_muscular_straight_long_2_top_mane_connector2_individual = neck_muscular_straight_long_2_top_mane_connector2.addOrReplaceChild("neck_muscular_straight_long_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.3771F, 0.2024F, -0.0684F));

            PartDefinition cube_r7 = neck_muscular_straight_long_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(986, 939).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_long_2_top_mane_flow = neck_muscular_straight_long_2_top_mane_connector2.addOrReplaceChild("neck_muscular_straight_long_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.324F, -0.3575F, 0.0894F, -0.0436F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_muscular_straight_long_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(972, 933).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

            PartDefinition neck_muscular_straight_long_2_bottom_mane = neck_muscular_straight_long_2_mane.addOrReplaceChild("neck_muscular_straight_long_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, 0.5899F, -0.3498F));

            PartDefinition neck_muscular_straight_long_2_bottom_mane_connector = neck_muscular_straight_long_2_bottom_mane.addOrReplaceChild("neck_muscular_straight_long_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

            PartDefinition neck_muscular_straight_long_2_bottom_mane_connector_individual = neck_muscular_straight_long_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_straight_long_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 2.1572F, 1.245F));

            PartDefinition cube_r9 = neck_muscular_straight_long_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(997, 928).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.7427F, -4.5417F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_long_2_bottom_mane_connector2 = neck_muscular_straight_long_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_straight_long_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, 1.4302F, 1.8771F));

            PartDefinition neck_muscular_straight_long_2_bottom_mane_connector2_individual = neck_muscular_straight_long_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_straight_long_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, 0.3524F, -0.2274F));

            PartDefinition cube_r10 = neck_muscular_straight_long_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(991, 941).addBox(-2.0F, -2.0F, 1.0F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.4641F, -4.957F, -0.9599F, 0.0F, 0.0F));

            PartDefinition neck_muscular_straight_long_2_bottom_mane_flow = neck_muscular_straight_long_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_straight_long_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.1453F, 0.2682F, 0.6257F));

            PartDefinition neck_muscular_straight_long_2_bottom_mane_flow_individual = neck_muscular_straight_long_2_bottom_mane_flow.addOrReplaceChild("neck_muscular_straight_long_2_bottom_mane_flow_individual", CubeListBuilder.create(), PartPose.offset(-1.9665F, -4.4693F, -3.0391F));

            PartDefinition cube_r11 = neck_muscular_straight_long_2_bottom_mane_flow_individual.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(973, 934).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8603F, 1.7877F, 1.162F, -0.9753F, -0.1144F, -0.1002F));
        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Neck / " + muscleMass + " / " + "straight" +  " / "  + length + " / Variation " + variation + ", Cancelling Generation...");
        }
        allParts.add("neck_" + muscleMass + "_" + "straight" + "_" + length  + "_" +  variation);
        return partdefinition;
    }


    /* Swan Neck */
    public static PartDefinition GenerateSwan(PartDefinition partdefinition, String muscleMass, String length, int variation) {
        if (muscleMass.equals("lean") && length.equals("short") && variation == 1) {
            PartDefinition neck_lean_swan_short_1 = partdefinition.addOrReplaceChild("neck_lean_swan_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_lean_swan_short_1_individual = neck_lean_swan_short_1.addOrReplaceChild("neck_lean_swan_short_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_short_1_crest = neck_lean_swan_short_1_individual.addOrReplaceChild("neck_lean_swan_short_1_crest", CubeListBuilder.create(), PartPose.offset(-0.3575F, -6.8827F, 0.8045F));

            PartDefinition neck_lean_swan_short_1_crest_upper = neck_lean_swan_short_1_crest.addOrReplaceChild("neck_lean_swan_short_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1807F, 0.7117F, -0.9359F));

            PartDefinition cube_r1 = neck_lean_swan_short_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(375, 958).addBox(-3.0892F, -6.0F, -3.8808F, 3.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, 0.1605F, 0.8852F, 1.0908F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_short_1_crest_lower = neck_lean_swan_short_1_crest.addOrReplaceChild("neck_lean_swan_short_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1147F, 2.8919F, 1.2998F));

            PartDefinition cube_r2 = neck_lean_swan_short_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(365, 960).addBox(-3.08F, -12.0F, -0.92F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 7.4183F, 5.0967F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_short_1_middle_individual = neck_lean_swan_short_1_individual.addOrReplaceChild("neck_lean_swan_short_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.2178F, -2.1533F, -0.4137F));

            PartDefinition cube_r3 = neck_lean_swan_short_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(349, 946).addBox(-4.0F, -10.0F, -2.0F, 4.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0055F, 4.8942F, 3.4242F, 0.5672F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_lean_swan_short_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(349, 958).addBox(-5.08F, -9.0F, -0.92F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0745F, 6.9315F, 0.1563F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_short_1_lower_individual = neck_lean_swan_short_1_individual.addOrReplaceChild("neck_lean_swan_short_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1174F, -1.2684F, -1.5479F));

            PartDefinition cube_r5 = neck_lean_swan_short_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(367, 947).addBox(-5.0784F, -9.0F, -0.9017F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 5.6073F, 0.1181F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_short_1_mane = neck_lean_swan_short_1.addOrReplaceChild("neck_lean_swan_short_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -6.9721F, 0.0F));

            PartDefinition neck_lean_swan_short_1_top_mane = neck_lean_swan_short_1_mane.addOrReplaceChild("neck_lean_swan_short_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -1.3765F, -1.6906F));

            PartDefinition neck_lean_swan_short_1_top_mane_connector = neck_lean_swan_short_1_top_mane.addOrReplaceChild("neck_lean_swan_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -0.6257F, 1.2514F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_short_1_top_mane_connector_individual = neck_lean_swan_short_1_top_mane_connector.addOrReplaceChild("neck_lean_swan_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

            PartDefinition cube_r6 = neck_lean_swan_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(723, 972).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_short_1_top_mane_connector2 = neck_lean_swan_short_1_top_mane_connector.addOrReplaceChild("neck_lean_swan_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.8045F, -0.8045F));

            PartDefinition neck_lean_swan_short_1_top_mane_connector2_individual = neck_lean_swan_short_1_top_mane_connector2.addOrReplaceChild("neck_lean_swan_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.1269F, -0.5098F));

            PartDefinition cube_r7 = neck_lean_swan_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(724, 980).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_short_1_top_mane_flow = neck_lean_swan_short_1_top_mane_connector2.addOrReplaceChild("neck_lean_swan_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8771F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_lean_swan_short_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(709, 974).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4086F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

            PartDefinition neck_lean_swan_short_1_bottom_mane = neck_lean_swan_short_1_mane.addOrReplaceChild("neck_lean_swan_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, 2.1989F, 3.1362F));

            PartDefinition neck_lean_swan_short_1_bottom_mane_connector = neck_lean_swan_short_1_bottom_mane.addOrReplaceChild("neck_lean_swan_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_short_1_bottom_mane_connector_individual = neck_lean_swan_short_1_bottom_mane_connector.addOrReplaceChild("neck_lean_swan_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -1.3083F, -0.9874F));

            PartDefinition cube_r9 = neck_lean_swan_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(734, 977).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3667F, -2.3092F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_short_1_bottom_mane_connector2 = neck_lean_swan_short_1_bottom_mane_connector.addOrReplaceChild("neck_lean_swan_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.2682F, -1.6983F, -0.3575F));

            PartDefinition neck_lean_swan_short_1_bottom_mane_connector2_individual = neck_lean_swan_short_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_swan_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, -0.0024F, -0.2378F));

            PartDefinition cube_r10 = neck_lean_swan_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(724, 987).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0702F, -2.7119F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_short_1_bottom_mane_flow = neck_lean_swan_short_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_swan_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.9665F, -0.1788F, 0.0894F));

            PartDefinition cube_r11 = neck_lean_swan_short_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(715, 980).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, 0.7151F, 0.8045F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("lean") && length.equals("short") && variation == 2) {
            PartDefinition neck_lean_swan_short_2 = partdefinition.addOrReplaceChild("neck_lean_swan_short_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_lean_swan_short_2_individual = neck_lean_swan_short_2.addOrReplaceChild("neck_lean_swan_short_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_short_2_crest = neck_lean_swan_short_2_individual.addOrReplaceChild("neck_lean_swan_short_2_crest", CubeListBuilder.create(), PartPose.offset(-0.3575F, -7.2402F, -0.3575F));

            PartDefinition neck_lean_swan_short_2_crest_upper = neck_lean_swan_short_2_crest.addOrReplaceChild("neck_lean_swan_short_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1807F, 0.5648F, -0.0278F));

            PartDefinition cube_r1 = neck_lean_swan_short_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(435, 954).addBox(-3.0892F, -6.0F, -3.8808F, 3.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, 0.1605F, 0.3489F, 1.0908F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_short_2_crest_lower = neck_lean_swan_short_2_crest.addOrReplaceChild("neck_lean_swan_short_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1147F, 3.1227F, 2.0335F));

            PartDefinition cube_r2 = neck_lean_swan_short_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(425, 955).addBox(-3.08F, -12.0F, -0.92F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 7.0087F, 4.8099F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_short_2_middle_individual = neck_lean_swan_short_2_individual.addOrReplaceChild("neck_lean_swan_short_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.2178F, -2.2372F, -0.9297F));

            PartDefinition cube_r3 = neck_lean_swan_short_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(409, 941).addBox(-4.0F, -10.0F, -2.0F, 4.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0055F, 4.4419F, 3.2252F, 0.5672F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_lean_swan_short_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(409, 954).addBox(-5.08F, -9.0F, -0.92F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0745F, 6.4792F, -0.0428F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_short_2_lower_individual = neck_lean_swan_short_2_individual.addOrReplaceChild("neck_lean_swan_short_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1174F, -1.3166F, -2.1548F));

            PartDefinition cube_r5 = neck_lean_swan_short_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(427, 942).addBox(-5.0784F, -9.0F, -0.9017F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 5.1192F, 0.0099F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_short_2_mane = neck_lean_swan_short_2.addOrReplaceChild("neck_lean_swan_short_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.419F, 0.0F));

            PartDefinition neck_lean_swan_short_2_top_mane = neck_lean_swan_short_2_mane.addOrReplaceChild("neck_lean_swan_short_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -1.1978F, -2.3163F));

            PartDefinition neck_lean_swan_short_2_top_mane_connector = neck_lean_swan_short_2_top_mane.addOrReplaceChild("neck_lean_swan_short_2_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -0.8939F, 1.162F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_short_2_top_mane_connector_individual = neck_lean_swan_short_2_top_mane_connector.addOrReplaceChild("neck_lean_swan_short_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

            PartDefinition cube_r6 = neck_lean_swan_short_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(772, 973).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_short_2_top_mane_connector2 = neck_lean_swan_short_2_top_mane_connector.addOrReplaceChild("neck_lean_swan_short_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.8045F, -0.8045F));

            PartDefinition neck_lean_swan_short_2_top_mane_connector2_individual = neck_lean_swan_short_2_top_mane_connector2.addOrReplaceChild("neck_lean_swan_short_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.1269F, -0.5098F));

            PartDefinition cube_r7 = neck_lean_swan_short_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(772, 981).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_short_2_top_mane_flow = neck_lean_swan_short_2_top_mane_connector2.addOrReplaceChild("neck_lean_swan_short_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8771F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_lean_swan_short_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(756, 975).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4086F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

            PartDefinition neck_lean_swan_short_2_bottom_mane = neck_lean_swan_short_2_mane.addOrReplaceChild("neck_lean_swan_short_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, 2.1095F, 2.4211F));

            PartDefinition neck_lean_swan_short_2_bottom_mane_connector = neck_lean_swan_short_2_bottom_mane.addOrReplaceChild("neck_lean_swan_short_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_short_2_bottom_mane_connector_individual = neck_lean_swan_short_2_bottom_mane_connector.addOrReplaceChild("neck_lean_swan_short_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.9116F, -0.6831F));

            PartDefinition cube_r9 = neck_lean_swan_short_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(782, 976).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7634F, -2.6136F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_short_2_bottom_mane_connector2 = neck_lean_swan_short_2_bottom_mane_connector.addOrReplaceChild("neck_lean_swan_short_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.2682F, -1.162F, 0.3575F));

            PartDefinition neck_lean_swan_short_2_bottom_mane_connector2_individual = neck_lean_swan_short_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_swan_short_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, -0.142F, -0.6485F));

            PartDefinition cube_r10 = neck_lean_swan_short_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(780, 986).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4669F, -3.0163F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_short_2_bottom_mane_flow = neck_lean_swan_short_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_swan_short_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.9665F, -0.1788F, -0.2682F));

            PartDefinition cube_r11 = neck_lean_swan_short_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(762, 980).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, 0.1788F, 0.4469F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("lean") && length.equals("average") && variation == 1) {
            PartDefinition neck_lean_swan_average_1 = partdefinition.addOrReplaceChild("neck_lean_swan_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_lean_swan_average_1_individual = neck_lean_swan_average_1.addOrReplaceChild("neck_lean_swan_average_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_average_1_crest = neck_lean_swan_average_1_individual.addOrReplaceChild("neck_lean_swan_average_1_crest", CubeListBuilder.create(), PartPose.offset(-0.3575F, -8.2235F, -1.162F));

            PartDefinition neck_lean_swan_average_1_crest_upper = neck_lean_swan_average_1_crest.addOrReplaceChild("neck_lean_swan_average_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1807F, 0.7507F, -0.0438F));

            PartDefinition cube_r1 = neck_lean_swan_average_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(490, 950).addBox(-3.0892F, -6.0F, -3.8808F, 3.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, 0.1605F, 0.4383F, 1.0908F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_average_1_crest_lower = neck_lean_swan_average_1_crest.addOrReplaceChild("neck_lean_swan_average_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1147F, 3.7111F, 2.4097F));

            PartDefinition cube_r2 = neck_lean_swan_average_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(480, 950).addBox(-3.08F, -12.0F, -0.92F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 6.5991F, 4.5231F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_average_1_middle_individual = neck_lean_swan_average_1_individual.addOrReplaceChild("neck_lean_swan_average_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.2178F, -2.5894F, -1.4458F));

            PartDefinition cube_r3 = neck_lean_swan_average_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(464, 936).addBox(-4.0F, -10.0F, -2.0F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0055F, 3.9896F, 3.0261F, 0.5672F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_lean_swan_average_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(464, 950).addBox(-5.08F, -9.0F, -0.92F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0745F, 6.0269F, -0.2418F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_average_1_lower_individual = neck_lean_swan_average_1_individual.addOrReplaceChild("neck_lean_swan_average_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1174F, -1.6329F, -2.7617F));

            PartDefinition cube_r5 = neck_lean_swan_average_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(482, 937).addBox(-5.0784F, -9.0F, -0.9017F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 4.631F, -0.0983F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_average_1_mane = neck_lean_swan_average_1.addOrReplaceChild("neck_lean_swan_average_1_mane", CubeListBuilder.create(), PartPose.offset(0.1788F, -8.2235F, -1.162F));

            PartDefinition neck_lean_swan_average_1_top_mane = neck_lean_swan_average_1_mane.addOrReplaceChild("neck_lean_swan_average_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -0.5721F, -1.5118F));

            PartDefinition neck_lean_swan_average_1_top_mane_connector = neck_lean_swan_average_1_top_mane.addOrReplaceChild("neck_lean_swan_average_1_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -1.5196F, 0.8045F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_average_1_top_mane_connector_individual = neck_lean_swan_average_1_top_mane_connector.addOrReplaceChild("neck_lean_swan_average_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

            PartDefinition cube_r6 = neck_lean_swan_average_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(822, 974).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_average_1_top_mane_connector2 = neck_lean_swan_average_1_top_mane_connector.addOrReplaceChild("neck_lean_swan_average_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.8045F, -0.8045F));

            PartDefinition neck_lean_swan_average_1_top_mane_connector2_individual = neck_lean_swan_average_1_top_mane_connector2.addOrReplaceChild("neck_lean_swan_average_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.1269F, -0.5098F));

            PartDefinition cube_r7 = neck_lean_swan_average_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(822, 982).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_average_1_top_mane_flow = neck_lean_swan_average_1_top_mane_connector2.addOrReplaceChild("neck_lean_swan_average_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8771F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_lean_swan_average_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(806, 976).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4086F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

            PartDefinition neck_lean_swan_average_1_bottom_mane = neck_lean_swan_average_1_mane.addOrReplaceChild("neck_lean_swan_average_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, 2.1095F, 2.8681F));

            PartDefinition neck_lean_swan_average_1_bottom_mane_connector = neck_lean_swan_average_1_bottom_mane.addOrReplaceChild("neck_lean_swan_average_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_average_1_bottom_mane_connector_individual = neck_lean_swan_average_1_bottom_mane_connector.addOrReplaceChild("neck_lean_swan_average_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.5149F, -0.3787F));

            PartDefinition cube_r9 = neck_lean_swan_average_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(832, 975).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.16F, -2.9179F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_average_1_bottom_mane_connector2 = neck_lean_swan_average_1_bottom_mane_connector.addOrReplaceChild("neck_lean_swan_average_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.2682F, -1.0726F, 0.3575F));

            PartDefinition neck_lean_swan_average_1_bottom_mane_connector2_individual = neck_lean_swan_average_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_swan_average_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.1653F, -0.3441F));

            PartDefinition cube_r10 = neck_lean_swan_average_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(831, 986).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.8636F, -3.3207F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_average_1_bottom_mane_flow = neck_lean_swan_average_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_swan_average_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.9665F, 0.0894F, -0.0894F));

            PartDefinition cube_r11 = neck_lean_swan_average_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(811, 980).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, -0.1788F, 0.2682F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("lean") && length.equals("average") && variation == 2) {
            PartDefinition neck_lean_swan_average_2 = partdefinition.addOrReplaceChild("neck_lean_swan_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_lean_swan_average_2_individual = neck_lean_swan_average_2.addOrReplaceChild("neck_lean_swan_average_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_average_2_crest = neck_lean_swan_average_2_individual.addOrReplaceChild("neck_lean_swan_average_2_crest", CubeListBuilder.create(), PartPose.offset(-0.3575F, -9.2067F, -1.5196F));

            PartDefinition neck_lean_swan_average_2_crest_upper = neck_lean_swan_average_2_crest.addOrReplaceChild("neck_lean_swan_average_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1807F, 0.6461F, 0.1435F));

            PartDefinition cube_r1 = neck_lean_swan_average_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(546, 944).addBox(-3.0892F, -6.0F, -3.8808F, 3.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, 0.1605F, 0.0807F, 1.0908F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_average_2_crest_lower = neck_lean_swan_average_2_crest.addOrReplaceChild("neck_lean_swan_average_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1147F, 4.1206F, 2.6071F));

            PartDefinition cube_r2 = neck_lean_swan_average_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(536, 944).addBox(-3.08F, -12.0F, -0.92F, 3.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 6.1895F, 4.2363F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_average_2_middle_individual = neck_lean_swan_average_2_individual.addOrReplaceChild("neck_lean_swan_average_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.2178F, -3.1203F, -1.6937F));

            PartDefinition cube_r3 = neck_lean_swan_average_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(520, 929).addBox(-4.0F, -10.0F, -2.0F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0055F, 3.5373F, 2.8271F, 0.5672F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_lean_swan_average_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(520, 944).addBox(-5.08F, -9.0F, -0.92F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0745F, 5.5745F, -0.4408F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_average_2_lower_individual = neck_lean_swan_average_2_individual.addOrReplaceChild("neck_lean_swan_average_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1174F, -2.128F, -3.1004F));

            PartDefinition cube_r5 = neck_lean_swan_average_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(538, 930).addBox(-5.0784F, -9.0F, -0.9017F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 4.1429F, -0.2065F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_average_2_mane = neck_lean_swan_average_2.addOrReplaceChild("neck_lean_swan_average_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.1341F, 0.0F));

            PartDefinition neck_lean_swan_average_2_top_mane = neck_lean_swan_average_2_mane.addOrReplaceChild("neck_lean_swan_average_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -1.8235F, -1.8694F));

            PartDefinition neck_lean_swan_average_2_top_mane_connector = neck_lean_swan_average_2_top_mane.addOrReplaceChild("neck_lean_swan_average_2_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -1.3408F, -0.4469F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_average_2_top_mane_connector_individual = neck_lean_swan_average_2_top_mane_connector.addOrReplaceChild("neck_lean_swan_average_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

            PartDefinition cube_r6 = neck_lean_swan_average_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(874, 973).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_average_2_top_mane_connector2 = neck_lean_swan_average_2_top_mane_connector.addOrReplaceChild("neck_lean_swan_average_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.9832F, -0.8045F, -0.8045F));

            PartDefinition neck_lean_swan_average_2_top_mane_connector2_individual = neck_lean_swan_average_2_top_mane_connector2.addOrReplaceChild("neck_lean_swan_average_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.9665F, 0.1269F, -0.5098F));

            PartDefinition cube_r7 = neck_lean_swan_average_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(874, 981).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_average_2_top_mane_flow = neck_lean_swan_average_2_top_mane_connector2.addOrReplaceChild("neck_lean_swan_average_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_lean_swan_average_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(860, 975).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4086F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

            PartDefinition neck_lean_swan_average_2_bottom_mane = neck_lean_swan_average_2_mane.addOrReplaceChild("neck_lean_swan_average_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, 1.0369F, 1.2591F));

            PartDefinition neck_lean_swan_average_2_bottom_mane_connector = neck_lean_swan_average_2_bottom_mane.addOrReplaceChild("neck_lean_swan_average_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_average_2_bottom_mane_connector_individual = neck_lean_swan_average_2_bottom_mane_connector.addOrReplaceChild("neck_lean_swan_average_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.1182F, -0.0743F));

            PartDefinition cube_r9 = neck_lean_swan_average_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(884, 972).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5567F, -3.2223F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_average_2_bottom_mane_connector2 = neck_lean_swan_average_2_bottom_mane_connector.addOrReplaceChild("neck_lean_swan_average_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.2682F, -0.6257F, 0.7151F));

            PartDefinition neck_lean_swan_average_2_bottom_mane_connector2_individual = neck_lean_swan_average_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_swan_average_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.115F, -0.3973F));

            PartDefinition cube_r10 = neck_lean_swan_average_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(884, 984).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2603F, -3.6251F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_average_2_bottom_mane_flow = neck_lean_swan_average_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_swan_average_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.9665F, -0.0894F, -0.2682F));

            PartDefinition cube_r11 = neck_lean_swan_average_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(862, 978).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, -0.4469F, 0.0894F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("lean") && length.equals("long") && variation == 1) {
            PartDefinition neck_lean_swan_long_1 = partdefinition.addOrReplaceChild("neck_lean_swan_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_lean_swan_long_1_individual = neck_lean_swan_long_1.addOrReplaceChild("neck_lean_swan_long_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_long_1_crest = neck_lean_swan_long_1_individual.addOrReplaceChild("neck_lean_swan_long_1_crest", CubeListBuilder.create(), PartPose.offset(-0.3575F, -9.6536F, -3.0391F));

            PartDefinition neck_lean_swan_long_1_crest_upper = neck_lean_swan_long_1_crest.addOrReplaceChild("neck_lean_swan_long_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1807F, 0.4673F, 0.7692F));

            PartDefinition cube_r1 = neck_lean_swan_long_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(605, 939).addBox(-3.0892F, -6.0F, -3.8808F, 3.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, 0.1605F, 0.3489F, 1.0908F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_long_1_crest_lower = neck_lean_swan_long_1_crest.addOrReplaceChild("neck_lean_swan_long_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1147F, 4.2621F, 3.6983F));

            PartDefinition cube_r2 = neck_lean_swan_long_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(595, 939).addBox(-3.08F, -12.0F, -0.92F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 5.78F, 3.9495F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_long_1_middle_individual = neck_lean_swan_long_1_individual.addOrReplaceChild("neck_lean_swan_long_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.2178F, -3.383F, -2.2097F));

            PartDefinition cube_r3 = neck_lean_swan_long_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(579, 923).addBox(-4.0F, -10.0F, -2.0F, 4.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0055F, 3.0849F, 2.6281F, 0.5672F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_lean_swan_long_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(579, 939).addBox(-5.08F, -9.0F, -0.92F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0745F, 5.1222F, -0.6399F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_long_1_lower_individual = neck_lean_swan_long_1_individual.addOrReplaceChild("neck_lean_swan_long_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1174F, -2.3549F, -3.7072F));

            PartDefinition cube_r5 = neck_lean_swan_long_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(597, 924).addBox(-5.0784F, -9.0F, -0.9017F, 3.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 3.6548F, -0.3147F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_long_1_mane = neck_lean_swan_long_1.addOrReplaceChild("neck_lean_swan_long_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_long_1_top_mane = neck_lean_swan_long_1_mane.addOrReplaceChild("neck_lean_swan_long_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -3.6112F, -1.2437F));

            PartDefinition neck_lean_swan_long_1_top_mane_connector = neck_lean_swan_long_1_top_mane.addOrReplaceChild("neck_lean_swan_long_1_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -8.4022F, -1.7877F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_long_1_top_mane_connector_individual = neck_lean_swan_long_1_top_mane_connector.addOrReplaceChild("neck_lean_swan_long_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.7151F, 8.7598F, 1.5196F));

            PartDefinition cube_r6 = neck_lean_swan_long_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(931, 970).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3575F, -6.9721F, -2.0559F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_long_1_top_mane_connector2 = neck_lean_swan_long_1_top_mane_connector.addOrReplaceChild("neck_lean_swan_long_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.9832F, -0.8045F, -0.8045F));

            PartDefinition neck_lean_swan_long_1_top_mane_connector2_individual = neck_lean_swan_long_1_top_mane_connector2.addOrReplaceChild("neck_lean_swan_long_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(-0.2682F, 9.5642F, 2.324F));

            PartDefinition cube_r7 = neck_lean_swan_long_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(931, 978).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2346F, -7.0615F, -2.0559F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_long_1_top_mane_flow = neck_lean_swan_long_1_top_mane_connector2.addOrReplaceChild("neck_lean_swan_long_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_lean_swan_long_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(915, 972).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4086F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

            PartDefinition neck_lean_swan_long_1_bottom_mane = neck_lean_swan_long_1_mane.addOrReplaceChild("neck_lean_swan_long_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -7.8123F, 0.544F));

            PartDefinition neck_lean_swan_long_1_bottom_mane_connector = neck_lean_swan_long_1_bottom_mane.addOrReplaceChild("neck_lean_swan_long_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_long_1_bottom_mane_connector_individual = neck_lean_swan_long_1_bottom_mane_connector.addOrReplaceChild("neck_lean_swan_long_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 3.933F, -2.4134F));

            PartDefinition cube_r9 = neck_lean_swan_long_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(941, 967).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3674F, -6.6079F, -0.8832F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_long_1_bottom_mane_connector2 = neck_lean_swan_long_1_bottom_mane_connector.addOrReplaceChild("neck_lean_swan_long_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.2682F, -0.4469F, 0.8045F));

            PartDefinition neck_lean_swan_long_1_bottom_mane_connector2_individual = neck_lean_swan_long_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_swan_long_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(-0.2682F, 4.3799F, -3.2179F));

            PartDefinition cube_r10 = neck_lean_swan_long_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(942, 980).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.324F, -6.7039F, -0.8939F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_long_1_bottom_mane_flow = neck_lean_swan_long_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_swan_long_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.9665F, -0.0894F, -0.1788F));

            PartDefinition cube_r11 = neck_lean_swan_long_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(918, 974).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, -0.6257F, -0.0894F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("lean") && length.equals("long") && variation == 2) {
            PartDefinition neck_lean_swan_long_2 = partdefinition.addOrReplaceChild("neck_lean_swan_long_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_lean_swan_long_2_individual = neck_lean_swan_long_2.addOrReplaceChild("neck_lean_swan_long_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_long_2_crest = neck_lean_swan_long_2_individual.addOrReplaceChild("neck_lean_swan_long_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -10.0112F, -2.5922F));

            PartDefinition neck_lean_swan_long_2_crest_upper = neck_lean_swan_long_2_crest.addOrReplaceChild("neck_lean_swan_long_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1807F, 0.0292F, -0.5486F));

            PartDefinition cube_r1 = neck_lean_swan_long_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(665, 940).addBox(-3.0892F, -6.0F, -3.8808F, 3.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, 0.518F, 0.8852F, 1.0908F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_long_2_crest_lower = neck_lean_swan_long_2_crest.addOrReplaceChild("neck_lean_swan_long_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1147F, 4.5822F, 3.1807F));

            PartDefinition cube_r2 = neck_lean_swan_long_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(650, 924).addBox(-3.08F, -12.0F, -0.92F, 3.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 5.3704F, 3.6627F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_long_2_middle_individual = neck_lean_swan_long_2_individual.addOrReplaceChild("neck_lean_swan_long_2_middle_individual", CubeListBuilder.create(), PartPose.offset(0.1398F, -3.6198F, -2.4883F));

            PartDefinition cube_r3 = neck_lean_swan_long_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(632, 920).addBox(-4.0F, -10.0F, -2.0F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0055F, 2.8748F, 2.5491F, 0.5672F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_lean_swan_long_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(660, 925).addBox(-5.08F, -12.0F, -0.92F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0745F, 7.3255F, -0.1825F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_long_2_lower_individual = neck_lean_swan_long_2_individual.addOrReplaceChild("neck_lean_swan_long_2_lower_individual", CubeListBuilder.create(), PartPose.offset(0.2402F, -3.7781F, -4.2812F));

            PartDefinition cube_r5 = neck_lean_swan_long_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(640, 937).addBox(-5.0784F, -9.0F, -0.9017F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 4.631F, -0.0983F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_long_2_mane = neck_lean_swan_long_2.addOrReplaceChild("neck_lean_swan_long_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.7598F, -2.4134F));

            PartDefinition neck_lean_swan_long_2_top_mane = neck_lean_swan_long_2_mane.addOrReplaceChild("neck_lean_swan_long_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -1.4659F, -2.3163F));

            PartDefinition neck_lean_swan_long_2_top_mane_connector = neck_lean_swan_long_2_top_mane.addOrReplaceChild("neck_lean_swan_long_2_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -2.2346F, 1.3408F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_long_2_top_mane_connector_individual = neck_lean_swan_long_2_top_mane_connector.addOrReplaceChild("neck_lean_swan_long_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

            PartDefinition cube_r6 = neck_lean_swan_long_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(985, 969).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_long_2_top_mane_connector2 = neck_lean_swan_long_2_top_mane_connector.addOrReplaceChild("neck_lean_swan_long_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

            PartDefinition neck_lean_swan_long_2_top_mane_connector2_individual = neck_lean_swan_long_2_top_mane_connector2.addOrReplaceChild("neck_lean_swan_long_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, -0.32F, -1.2249F));

            PartDefinition cube_r7 = neck_lean_swan_long_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(985, 977).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_long_2_top_mane_flow = neck_lean_swan_long_2_top_mane_connector2.addOrReplaceChild("neck_lean_swan_long_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8771F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_lean_swan_long_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(969, 971).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4274F, -0.2133F, -0.3647F));

            PartDefinition neck_lean_swan_long_2_bottom_mane = neck_lean_swan_long_2_mane.addOrReplaceChild("neck_lean_swan_long_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 0.5006F, 2.5999F));

            PartDefinition neck_lean_swan_long_2_bottom_mane_connector = neck_lean_swan_long_2_bottom_mane.addOrReplaceChild("neck_lean_swan_long_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_long_2_bottom_mane_connector_individual = neck_lean_swan_long_2_bottom_mane_connector.addOrReplaceChild("neck_lean_swan_long_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.6751F, 0.5345F));

            PartDefinition cube_r9 = neck_lean_swan_long_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(995, 965).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.3501F, -3.8311F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_long_2_bottom_mane_connector2 = neck_lean_swan_long_2_bottom_mane_connector.addOrReplaceChild("neck_lean_swan_long_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));

            PartDefinition neck_lean_swan_long_2_bottom_mane_connector2_individual = neck_lean_swan_long_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_swan_long_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.2827F, 0.1221F));

            PartDefinition cube_r10 = neck_lean_swan_long_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(989, 979).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0536F, -4.2338F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_lean_swan_long_2_bottom_mane_flow = neck_lean_swan_long_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_swan_long_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.5196F, -0.3575F, 0.0894F));

            PartDefinition cube_r11 = neck_lean_swan_long_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(971, 972).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("average") && length.equals("short") && variation == 1) {
            PartDefinition neck_average_swan_short_1 = partdefinition.addOrReplaceChild("neck_average_swan_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_average_swan_short_1_individual = neck_average_swan_short_1.addOrReplaceChild("neck_average_swan_short_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_short_1_crest = neck_average_swan_short_1_individual.addOrReplaceChild("neck_average_swan_short_1_crest", CubeListBuilder.create(), PartPose.offset(-0.3575F, -6.7933F, -0.3575F));

            PartDefinition neck_average_swan_short_1_crest_upper = neck_average_swan_short_1_crest.addOrReplaceChild("neck_average_swan_short_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3064F, 0.2696F, -0.0306F));

            PartDefinition cube_r1 = neck_average_swan_short_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(380, 981).addBox(-4.0892F, -6.0F, -3.8808F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0892F, 0.518F, 1.064F, 1.0908F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_short_1_crest_lower = neck_average_swan_short_1_crest.addOrReplaceChild("neck_average_swan_short_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.3298F, 2.8025F, 2.4618F));

            PartDefinition cube_r2 = neck_average_swan_short_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(368, 984).addBox(-4.08F, -12.0F, -0.92F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 7.4183F, 5.0967F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_short_1_middle_individual = neck_average_swan_short_1_individual.addOrReplaceChild("neck_average_swan_short_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1731F, -2.1533F, -0.4137F));

            PartDefinition cube_r3 = neck_average_swan_short_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(350, 982).addBox(-5.08F, -9.0F, -0.92F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5829F, 6.9315F, 0.1563F, 0.2618F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_average_swan_short_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(349, 970).addBox(-5.0F, -10.0F, -2.0F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4971F, 4.8942F, 3.4242F, 0.5672F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_short_1_lower_individual = neck_average_swan_short_1_individual.addOrReplaceChild("neck_average_swan_short_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1174F, -1.2684F, -1.5479F));

            PartDefinition cube_r5 = neck_average_swan_short_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(369, 971).addBox(-5.0784F, -9.0F, -0.9017F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 5.6073F, 0.1181F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_short_1_mane = neck_average_swan_short_1.addOrReplaceChild("neck_average_swan_short_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -5.9888F, 0.0F));

            PartDefinition neck_average_swan_short_1_top_mane = neck_average_swan_short_1_mane.addOrReplaceChild("neck_average_swan_short_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -1.6447F, -1.6906F));

            PartDefinition neck_average_swan_short_1_top_mane_connector = neck_average_swan_short_1_top_mane.addOrReplaceChild("neck_average_swan_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -1.3408F, 1.2514F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_short_1_top_mane_connector_individual = neck_average_swan_short_1_top_mane_connector.addOrReplaceChild("neck_average_swan_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

            PartDefinition cube_r6 = neck_average_swan_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(723, 972).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_short_1_top_mane_connector2 = neck_average_swan_short_1_top_mane_connector.addOrReplaceChild("neck_average_swan_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.8045F, -0.8045F));

            PartDefinition neck_average_swan_short_1_top_mane_connector2_individual = neck_average_swan_short_1_top_mane_connector2.addOrReplaceChild("neck_average_swan_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.1269F, -0.5098F));

            PartDefinition cube_r7 = neck_average_swan_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(724, 980).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_short_1_top_mane_flow = neck_average_swan_short_1_top_mane_connector2.addOrReplaceChild("neck_average_swan_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8771F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_average_swan_short_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(709, 974).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4086F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

            PartDefinition neck_average_swan_short_1_bottom_mane = neck_average_swan_short_1_mane.addOrReplaceChild("neck_average_swan_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, 1.2156F, 3.1362F));

            PartDefinition neck_average_swan_short_1_bottom_mane_connector = neck_average_swan_short_1_bottom_mane.addOrReplaceChild("neck_average_swan_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_short_1_bottom_mane_connector_individual = neck_average_swan_short_1_bottom_mane_connector.addOrReplaceChild("neck_average_swan_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -1.3083F, -0.9874F));

            PartDefinition cube_r9 = neck_average_swan_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(734, 977).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3667F, -2.3092F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_short_1_bottom_mane_connector2 = neck_average_swan_short_1_bottom_mane_connector.addOrReplaceChild("neck_average_swan_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.2682F, -1.6983F, -0.3575F));

            PartDefinition neck_average_swan_short_1_bottom_mane_connector2_individual = neck_average_swan_short_1_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, -0.0024F, -0.2378F));

            PartDefinition cube_r10 = neck_average_swan_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(724, 987).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0702F, -2.7119F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_short_1_bottom_mane_flow = neck_average_swan_short_1_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.9665F, -0.1788F, 0.0894F));

            PartDefinition cube_r11 = neck_average_swan_short_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(715, 980).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, 0.7151F, 0.8045F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("average") && length.equals("short") && variation == 2) {
            PartDefinition neck_average_swan_short_2 = partdefinition.addOrReplaceChild("neck_average_swan_short_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_average_swan_short_2_individual = neck_average_swan_short_2.addOrReplaceChild("neck_average_swan_short_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_short_2_crest = neck_average_swan_short_2_individual.addOrReplaceChild("neck_average_swan_short_2_crest", CubeListBuilder.create(), PartPose.offset(-0.3575F, -7.2402F, -0.8939F));

            PartDefinition neck_average_swan_short_2_crest_upper = neck_average_swan_short_2_crest.addOrReplaceChild("neck_average_swan_short_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1444F, 0.5225F, 0.2461F));

            PartDefinition cube_r1 = neck_average_swan_short_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(438, 980).addBox(-3.0892F, -6.0F, -3.8808F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0892F, 0.1605F, 0.6171F, 1.0908F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_short_2_crest_lower = neck_average_swan_short_2_crest.addOrReplaceChild("neck_average_swan_short_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1511F, 3.1227F, 2.5698F));

            PartDefinition cube_r2 = neck_average_swan_short_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(426, 980).addBox(-4.08F, -12.0F, -0.92F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 7.0087F, 4.8099F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_short_2_middle_individual = neck_average_swan_short_2_individual.addOrReplaceChild("neck_average_swan_short_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1815F, -2.2372F, -0.9297F));

            PartDefinition cube_r3 = neck_average_swan_short_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(408, 967).addBox(-5.0F, -10.0F, -2.0F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5055F, 4.4419F, 3.2252F, 0.5672F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_average_swan_short_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(408, 980).addBox(-6.08F, -9.0F, -0.92F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5745F, 6.4792F, -0.0428F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_short_2_lower_individual = neck_average_swan_short_2_individual.addOrReplaceChild("neck_average_swan_short_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1174F, -1.3166F, -2.1548F));

            PartDefinition cube_r5 = neck_average_swan_short_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(428, 968).addBox(-5.0784F, -9.0F, -0.9017F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 5.1192F, 0.0099F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_short_2_mane = neck_average_swan_short_2.addOrReplaceChild("neck_average_swan_short_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.1508F, 0.0F));

            PartDefinition neck_average_swan_short_2_top_mane = neck_average_swan_short_2_mane.addOrReplaceChild("neck_average_swan_short_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -0.9296F, -2.4951F));

            PartDefinition neck_average_swan_short_2_top_mane_connector = neck_average_swan_short_2_top_mane.addOrReplaceChild("neck_average_swan_short_2_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -1.4302F, 1.3408F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_short_2_top_mane_connector_individual = neck_average_swan_short_2_top_mane_connector.addOrReplaceChild("neck_average_swan_short_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

            PartDefinition cube_r6 = neck_average_swan_short_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(772, 973).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_short_2_top_mane_connector2 = neck_average_swan_short_2_top_mane_connector.addOrReplaceChild("neck_average_swan_short_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.8045F, -0.8045F));

            PartDefinition neck_average_swan_short_2_top_mane_connector2_individual = neck_average_swan_short_2_top_mane_connector2.addOrReplaceChild("neck_average_swan_short_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.1269F, -0.5098F));

            PartDefinition cube_r7 = neck_average_swan_short_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(772, 981).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_short_2_top_mane_flow = neck_average_swan_short_2_top_mane_connector2.addOrReplaceChild("neck_average_swan_short_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8771F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_average_swan_short_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(756, 975).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4086F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

            PartDefinition neck_average_swan_short_2_bottom_mane = neck_average_swan_short_2_mane.addOrReplaceChild("neck_average_swan_short_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, 1.8413F, 2.4211F));

            PartDefinition neck_average_swan_short_2_bottom_mane_connector = neck_average_swan_short_2_bottom_mane.addOrReplaceChild("neck_average_swan_short_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_short_2_bottom_mane_connector_individual = neck_average_swan_short_2_bottom_mane_connector.addOrReplaceChild("neck_average_swan_short_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.9116F, -0.6831F));

            PartDefinition cube_r9 = neck_average_swan_short_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(782, 976).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7634F, -2.6136F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_short_2_bottom_mane_connector2 = neck_average_swan_short_2_bottom_mane_connector.addOrReplaceChild("neck_average_swan_short_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.2682F, -1.162F, 0.3575F));

            PartDefinition neck_average_swan_short_2_bottom_mane_connector2_individual = neck_average_swan_short_2_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_short_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, -0.142F, -0.6485F));

            PartDefinition cube_r10 = neck_average_swan_short_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(780, 986).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4669F, -3.0163F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_short_2_bottom_mane_flow = neck_average_swan_short_2_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_short_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.9665F, -0.1788F, -0.2682F));

            PartDefinition cube_r11 = neck_average_swan_short_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(762, 980).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, 0.1788F, 0.4469F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("average") && length.equals("average") && variation == 1) {
            PartDefinition neck_average_swan_average_1 = partdefinition.addOrReplaceChild("neck_average_swan_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_average_swan_average_1_individual = neck_average_swan_average_1.addOrReplaceChild("neck_average_swan_average_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_average_1_crest = neck_average_swan_average_1_individual.addOrReplaceChild("neck_average_swan_average_1_crest", CubeListBuilder.create(), PartPose.offset(-0.3575F, -7.7765F, -1.3408F));

            PartDefinition neck_average_swan_average_1_crest_upper = neck_average_swan_average_1_crest.addOrReplaceChild("neck_average_swan_average_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1276F, 0.3211F, -0.0949F));

            PartDefinition cube_r1 = neck_average_swan_average_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(494, 978).addBox(-4.0892F, -6.0F, -3.8808F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0892F, 0.1605F, 0.7064F, 1.0908F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_average_1_crest_lower = neck_average_swan_average_1_crest.addOrReplaceChild("neck_average_swan_average_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.0617F, 3.2641F, 2.5885F));

            PartDefinition cube_r2 = neck_average_swan_average_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(482, 978).addBox(-4.08F, -12.0F, -0.92F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 6.5991F, 4.5231F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_average_1_middle_individual = neck_average_swan_average_1_individual.addOrReplaceChild("neck_average_swan_average_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1647F, -2.5894F, -1.4458F));

            PartDefinition cube_r3 = neck_average_swan_average_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(464, 978).addBox(-5.08F, -9.0F, -0.92F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5745F, 6.0269F, -0.2418F, 0.2618F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_average_swan_average_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(464, 964).addBox(-4.0F, -10.0F, -2.0F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5055F, 3.9896F, 3.0261F, 0.5672F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_average_1_lower_individual = neck_average_swan_average_1_individual.addOrReplaceChild("neck_average_swan_average_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1174F, -1.6329F, -2.7617F));

            PartDefinition cube_r5 = neck_average_swan_average_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(484, 965).addBox(-5.0784F, -9.0F, -0.9017F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 4.631F, -0.0983F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_average_1_mane = neck_average_swan_average_1.addOrReplaceChild("neck_average_swan_average_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.6704F, -1.6983F));

            PartDefinition neck_average_swan_average_1_top_mane = neck_average_swan_average_1_mane.addOrReplaceChild("neck_average_swan_average_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -0.9296F, -2.3163F));

            PartDefinition neck_average_swan_average_1_top_mane_connector = neck_average_swan_average_1_top_mane.addOrReplaceChild("neck_average_swan_average_1_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -0.7151F, 2.1453F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_average_1_top_mane_connector_individual = neck_average_swan_average_1_top_mane_connector.addOrReplaceChild("neck_average_swan_average_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

            PartDefinition cube_r6 = neck_average_swan_average_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(822, 974).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_average_1_top_mane_connector2 = neck_average_swan_average_1_top_mane_connector.addOrReplaceChild("neck_average_swan_average_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.8045F, -0.8045F));

            PartDefinition neck_average_swan_average_1_top_mane_connector2_individual = neck_average_swan_average_1_top_mane_connector2.addOrReplaceChild("neck_average_swan_average_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.1269F, -0.5098F));

            PartDefinition cube_r7 = neck_average_swan_average_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(822, 982).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_average_1_top_mane_flow = neck_average_swan_average_1_top_mane_connector2.addOrReplaceChild("neck_average_swan_average_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8771F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_average_swan_average_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(806, 976).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4086F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

            PartDefinition neck_average_swan_average_1_bottom_mane = neck_average_swan_average_1_mane.addOrReplaceChild("neck_average_swan_average_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, 2.5564F, 3.4044F));

            PartDefinition neck_average_swan_average_1_bottom_mane_connector = neck_average_swan_average_1_bottom_mane.addOrReplaceChild("neck_average_swan_average_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9832F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_average_1_bottom_mane_connector_individual = neck_average_swan_average_1_bottom_mane_connector.addOrReplaceChild("neck_average_swan_average_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.3507F, -0.5149F, -0.3787F));

            PartDefinition cube_r9 = neck_average_swan_average_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(832, 975).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.16F, -2.9179F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_average_1_bottom_mane_connector2 = neck_average_swan_average_1_bottom_mane_connector.addOrReplaceChild("neck_average_swan_average_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -1.0726F, 0.3575F));

            PartDefinition neck_average_swan_average_1_bottom_mane_connector2_individual = neck_average_swan_average_1_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_average_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.1653F, -0.3441F));

            PartDefinition cube_r10 = neck_average_swan_average_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(831, 986).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.8636F, -3.3207F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_average_1_bottom_mane_flow = neck_average_swan_average_1_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_average_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.9665F, 0.0894F, -0.0894F));

            PartDefinition cube_r11 = neck_average_swan_average_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(811, 980).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, -0.1788F, 0.2682F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("average") && length.equals("average") && variation == 2) {
            PartDefinition neck_average_swan_average_2 = partdefinition.addOrReplaceChild("neck_average_swan_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_average_swan_average_2_individual = neck_average_swan_average_2.addOrReplaceChild("neck_average_swan_average_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_average_2_crest = neck_average_swan_average_2_individual.addOrReplaceChild("neck_average_swan_average_2_crest", CubeListBuilder.create(), PartPose.offset(-0.3575F, -9.1173F, -1.3408F));

            PartDefinition neck_average_swan_average_2_crest_upper = neck_average_swan_average_2_crest.addOrReplaceChild("neck_average_swan_average_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1444F, 0.6461F, -0.4822F));

            PartDefinition cube_r1 = neck_average_swan_average_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(549, 975).addBox(-3.0892F, -6.0F, -3.8808F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0892F, 0.1605F, 0.7064F, 1.0908F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_average_2_crest_lower = neck_average_swan_average_2_crest.addOrReplaceChild("neck_average_swan_average_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1511F, 4.0312F, 2.4283F));

            PartDefinition cube_r2 = neck_average_swan_average_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(537, 975).addBox(-4.08F, -12.0F, -0.92F, 4.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 6.1895F, 4.2363F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_average_2_middle_individual = neck_average_swan_average_2_individual.addOrReplaceChild("neck_average_swan_average_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1731F, -3.1203F, -1.6937F));

            PartDefinition cube_r3 = neck_average_swan_average_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(518, 960).addBox(-5.0F, -10.0F, -2.0F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4971F, 3.5373F, 2.8271F, 0.5672F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_average_swan_average_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(519, 975).addBox(-5.08F, -9.0F, -0.92F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5829F, 5.5745F, -0.4408F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_average_2_lower_individual = neck_average_swan_average_2_individual.addOrReplaceChild("neck_average_swan_average_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.2068F, -2.128F, -3.1004F));

            PartDefinition cube_r5 = neck_average_swan_average_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(538, 961).addBox(-4.8996F, -9.0F, -0.9017F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3996F, 4.1429F, -0.2065F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_average_2_mane = neck_average_swan_average_2.addOrReplaceChild("neck_average_swan_average_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.1508F, -0.9832F));

            PartDefinition neck_average_swan_average_2_top_mane = neck_average_swan_average_2_mane.addOrReplaceChild("neck_average_swan_average_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -1.9128F, -3.0314F));

            PartDefinition neck_average_swan_average_2_top_mane_connector = neck_average_swan_average_2_top_mane.addOrReplaceChild("neck_average_swan_average_2_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -2.2346F, 1.6983F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_average_2_top_mane_connector_individual = neck_average_swan_average_2_top_mane_connector.addOrReplaceChild("neck_average_swan_average_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

            PartDefinition cube_r6 = neck_average_swan_average_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(874, 973).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_average_2_top_mane_connector2 = neck_average_swan_average_2_top_mane_connector.addOrReplaceChild("neck_average_swan_average_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.9832F, -0.8045F, -0.8045F));

            PartDefinition neck_average_swan_average_2_top_mane_connector2_individual = neck_average_swan_average_2_top_mane_connector2.addOrReplaceChild("neck_average_swan_average_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.9665F, 0.1269F, -0.5098F));

            PartDefinition cube_r7 = neck_average_swan_average_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(874, 981).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_average_2_top_mane_flow = neck_average_swan_average_2_top_mane_connector2.addOrReplaceChild("neck_average_swan_average_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_average_swan_average_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(860, 975).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4086F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

            PartDefinition neck_average_swan_average_2_bottom_mane = neck_average_swan_average_2_mane.addOrReplaceChild("neck_average_swan_average_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(-1.3463F, 0.0536F, 2.2424F));

            PartDefinition neck_average_swan_average_2_bottom_mane_connector = neck_average_swan_average_2_bottom_mane.addOrReplaceChild("neck_average_swan_average_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3575F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_average_2_bottom_mane_connector_individual = neck_average_swan_average_2_bottom_mane_connector.addOrReplaceChild("neck_average_swan_average_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.4401F, -0.1182F, -0.0743F));

            PartDefinition cube_r9 = neck_average_swan_average_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(884, 972).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5567F, -3.2223F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_average_2_bottom_mane_connector2 = neck_average_swan_average_2_bottom_mane_connector.addOrReplaceChild("neck_average_swan_average_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.3408F, -0.6257F, 0.7151F));

            PartDefinition neck_average_swan_average_2_bottom_mane_connector2_individual = neck_average_swan_average_2_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_average_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.115F, -0.3973F));

            PartDefinition cube_r10 = neck_average_swan_average_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(884, 984).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2603F, -3.6251F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_average_2_bottom_mane_flow = neck_average_swan_average_2_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_average_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.9665F, -0.0894F, -0.2682F));

            PartDefinition cube_r11 = neck_average_swan_average_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(862, 978).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, -0.4469F, 0.0894F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("average") && length.equals("long") && variation == 1) {
            PartDefinition neck_average_swan_long_1 = partdefinition.addOrReplaceChild("neck_average_swan_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_average_swan_long_1_individual = neck_average_swan_long_1.addOrReplaceChild("neck_average_swan_long_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_long_1_crest = neck_average_swan_long_1_individual.addOrReplaceChild("neck_average_swan_long_1_crest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3575F, -9.6536F, -3.0391F, 0.0873F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_long_1_crest_upper = neck_average_swan_long_1_crest.addOrReplaceChild("neck_average_swan_long_1_crest_upper", CubeListBuilder.create(), PartPose.offsetAndRotation(0.217F, 0.2351F, -0.2113F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r1 = neck_average_swan_long_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(607, 970).addBox(-4.0892F, -6.0F, -3.8808F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0892F, -0.0165F, 1.2194F, 1.0908F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_long_1_crest_lower = neck_average_swan_long_1_crest.addOrReplaceChild("neck_average_swan_long_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2404F, 4.208F, 3.3233F));

            PartDefinition cube_r2 = neck_average_swan_long_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(595, 971).addBox(-4.08F, -12.0F, -0.92F, 4.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 6.1022F, 3.4307F, 0.5236F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_long_1_middle_individual = neck_average_swan_long_1_individual.addOrReplaceChild("neck_average_swan_long_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1647F, -3.383F, -2.2097F));

            PartDefinition cube_r3 = neck_average_swan_long_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(577, 955).addBox(-4.0F, -10.0F, -2.0F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5055F, 3.0849F, 2.6281F, 0.5672F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_average_swan_long_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(577, 971).addBox(-5.08F, -9.0F, -0.92F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5745F, 5.1222F, -0.6399F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_long_1_lower_individual = neck_average_swan_long_1_individual.addOrReplaceChild("neck_average_swan_long_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1174F, -2.3549F, -3.7072F));

            PartDefinition cube_r5 = neck_average_swan_long_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(597, 956).addBox(-5.0784F, -9.0F, -0.9017F, 3.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 3.6548F, -0.3147F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_long_1_mane = neck_average_swan_long_1.addOrReplaceChild("neck_average_swan_long_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.6872F, -1.8771F));

            PartDefinition neck_average_swan_long_1_top_mane = neck_average_swan_long_1_mane.addOrReplaceChild("neck_average_swan_long_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -4.0581F, -2.4951F));

            PartDefinition neck_average_swan_long_1_top_mane_connector = neck_average_swan_long_1_top_mane.addOrReplaceChild("neck_average_swan_long_1_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -0.2682F, 1.3408F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_long_1_top_mane_connector_individual = neck_average_swan_long_1_top_mane_connector.addOrReplaceChild("neck_average_swan_long_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

            PartDefinition cube_r6 = neck_average_swan_long_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(931, 970).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_long_1_top_mane_connector2 = neck_average_swan_long_1_top_mane_connector.addOrReplaceChild("neck_average_swan_long_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.9832F, -0.8045F, -0.8045F));

            PartDefinition neck_average_swan_long_1_top_mane_connector2_individual = neck_average_swan_long_1_top_mane_connector2.addOrReplaceChild("neck_average_swan_long_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.9665F, 0.1269F, -0.5098F));

            PartDefinition cube_r7 = neck_average_swan_long_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(931, 978).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_long_1_top_mane_flow = neck_average_swan_long_1_top_mane_connector2.addOrReplaceChild("neck_average_swan_long_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_average_swan_long_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(915, 972).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4086F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

            PartDefinition neck_average_swan_long_1_bottom_mane = neck_average_swan_long_1_mane.addOrReplaceChild("neck_average_swan_long_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -0.1251F, 2.4211F));

            PartDefinition neck_average_swan_long_1_bottom_mane_connector = neck_average_swan_long_1_bottom_mane.addOrReplaceChild("neck_average_swan_long_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_long_1_bottom_mane_connector_individual = neck_average_swan_long_1_bottom_mane_connector.addOrReplaceChild("neck_average_swan_long_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.2784F, 0.2301F));

            PartDefinition cube_r9 = neck_average_swan_long_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(941, 967).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9534F, -3.5267F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_long_1_bottom_mane_connector2 = neck_average_swan_long_1_bottom_mane_connector.addOrReplaceChild("neck_average_swan_long_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.2682F, -0.4469F, 0.8045F));

            PartDefinition neck_average_swan_long_1_bottom_mane_connector2_individual = neck_average_swan_long_1_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_long_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.3329F, -0.1823F));

            PartDefinition cube_r10 = neck_average_swan_long_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(942, 980).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6569F, -3.9295F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_long_1_bottom_mane_flow = neck_average_swan_long_1_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_long_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.9665F, -0.0894F, -0.1788F));

            PartDefinition cube_r11 = neck_average_swan_long_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(918, 974).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, -0.6257F, -0.0894F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("average") && length.equals("long") && variation == 2) {
            PartDefinition neck_average_swan_long_2 = partdefinition.addOrReplaceChild("neck_average_swan_long_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_average_swan_long_2_individual = neck_average_swan_long_2.addOrReplaceChild("neck_average_swan_long_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2682F, -0.0894F, 0.0873F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_long_2_crest = neck_average_swan_long_2_individual.addOrReplaceChild("neck_average_swan_long_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -9.8324F, -2.5028F));

            PartDefinition neck_average_swan_long_2_crest_upper = neck_average_swan_long_2_crest.addOrReplaceChild("neck_average_swan_long_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1276F, 1.1018F, -0.638F));

            PartDefinition cube_r1 = neck_average_swan_long_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(655, 972).addBox(-4.0892F, -6.0F, -3.8808F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0892F, -0.5546F, 0.9746F, 1.0908F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_long_2_crest_lower = neck_average_swan_long_2_crest.addOrReplaceChild("neck_average_swan_long_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1511F, 4.6716F, 3.1807F));

            PartDefinition cube_r2 = neck_average_swan_long_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(652, 956).addBox(-4.08F, -12.0F, -0.92F, 4.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 5.3704F, 3.6627F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_long_2_middle_individual = neck_average_swan_long_2_individual.addOrReplaceChild("neck_average_swan_long_2_middle_individual", CubeListBuilder.create(), PartPose.offset(0.1314F, -3.3517F, -2.3989F));

            PartDefinition cube_r3 = neck_average_swan_long_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(664, 957).addBox(-6.08F, -12.0F, -0.92F, 5.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6192F, 7.3255F, -0.1825F, 0.2618F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_average_swan_long_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(632, 952).addBox(-5.0F, -10.0F, -2.0F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4608F, 2.8748F, 2.5491F, 0.5672F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_long_2_lower_individual = neck_average_swan_long_2_individual.addOrReplaceChild("neck_average_swan_long_2_lower_individual", CubeListBuilder.create(), PartPose.offset(0.2402F, -3.51F, -4.1918F));

            PartDefinition cube_r5 = neck_average_swan_long_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(641, 969).addBox(-5.0784F, -9.0F, -0.9017F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 4.631F, -0.0983F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_long_2_mane = neck_average_swan_long_2.addOrReplaceChild("neck_average_swan_long_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -10.0112F, -2.4134F));

            PartDefinition neck_average_swan_long_2_top_mane = neck_average_swan_long_2_mane.addOrReplaceChild("neck_average_swan_long_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -0.9296F, -2.5844F));

            PartDefinition neck_average_swan_long_2_top_mane_connector = neck_average_swan_long_2_top_mane.addOrReplaceChild("neck_average_swan_long_2_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -1.5196F, 1.6089F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_long_2_top_mane_connector_individual = neck_average_swan_long_2_top_mane_connector.addOrReplaceChild("neck_average_swan_long_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

            PartDefinition cube_r6 = neck_average_swan_long_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(985, 969).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_long_2_top_mane_connector2 = neck_average_swan_long_2_top_mane_connector.addOrReplaceChild("neck_average_swan_long_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

            PartDefinition neck_average_swan_long_2_top_mane_connector2_individual = neck_average_swan_long_2_top_mane_connector2.addOrReplaceChild("neck_average_swan_long_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, -0.32F, -1.2249F));

            PartDefinition cube_r7 = neck_average_swan_long_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(985, 977).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_long_2_top_mane_flow = neck_average_swan_long_2_top_mane_connector2.addOrReplaceChild("neck_average_swan_long_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8771F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_average_swan_long_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(969, 971).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4274F, -0.2133F, -0.3647F));

            PartDefinition neck_average_swan_long_2_bottom_mane = neck_average_swan_long_2_mane.addOrReplaceChild("neck_average_swan_long_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 1.752F, 2.5999F));

            PartDefinition neck_average_swan_long_2_bottom_mane_connector = neck_average_swan_long_2_bottom_mane.addOrReplaceChild("neck_average_swan_long_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_long_2_bottom_mane_connector_individual = neck_average_swan_long_2_bottom_mane_connector.addOrReplaceChild("neck_average_swan_long_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.6751F, 0.5345F));

            PartDefinition cube_r9 = neck_average_swan_long_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(995, 965).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.3501F, -3.8311F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_long_2_bottom_mane_connector2 = neck_average_swan_long_2_bottom_mane_connector.addOrReplaceChild("neck_average_swan_long_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));

            PartDefinition neck_average_swan_long_2_bottom_mane_connector2_individual = neck_average_swan_long_2_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_long_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.2827F, 0.1221F));

            PartDefinition cube_r10 = neck_average_swan_long_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(989, 979).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0536F, -4.2338F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_average_swan_long_2_bottom_mane_flow = neck_average_swan_long_2_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_long_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.5196F, -0.3575F, 0.0894F));

            PartDefinition cube_r11 = neck_average_swan_long_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(971, 972).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("muscular") && length.equals("short") && variation == 1) {
            PartDefinition neck_muscular_swan_short_1 = partdefinition.addOrReplaceChild("neck_muscular_swan_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_muscular_swan_short_1_individual = neck_muscular_swan_short_1.addOrReplaceChild("neck_muscular_swan_short_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_short_1_crest = neck_muscular_swan_short_1_individual.addOrReplaceChild("neck_muscular_swan_short_1_crest", CubeListBuilder.create(), PartPose.offset(-0.3575F, -6.7933F, -0.3575F));

            PartDefinition neck_muscular_swan_short_1_crest_upper = neck_muscular_swan_short_1_crest.addOrReplaceChild("neck_muscular_swan_short_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = neck_muscular_swan_short_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(383, 1005).addBox(-5.0892F, -6.0F, -3.8808F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9319F, 0.7876F, 1.0334F, 1.0908F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_short_1_crest_lower = neck_muscular_swan_short_1_crest.addOrReplaceChild("neck_muscular_swan_short_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2768F, 2.8025F, 2.4618F));

            PartDefinition cube_r2 = neck_muscular_swan_short_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(369, 1008).addBox(-5.08F, -12.0F, -0.92F, 5.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 7.4183F, 5.0967F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_short_1_middle_individual = neck_muscular_swan_short_1_individual.addOrReplaceChild("neck_muscular_swan_short_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.039F, -2.1533F, -0.4137F));

            PartDefinition cube_r3 = neck_muscular_swan_short_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(349, 1006).addBox(-6.08F, -9.0F, -0.92F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0745F, 6.9315F, 0.1563F, 0.2618F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_muscular_swan_short_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(349, 994).addBox(-5.0F, -10.0F, -2.0F, 6.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0055F, 4.8942F, 3.4242F, 0.5672F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_short_1_lower_individual = neck_muscular_swan_short_1_individual.addOrReplaceChild("neck_muscular_swan_short_1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0083F, -1.2684F, -1.5479F));

            PartDefinition cube_r5 = neck_muscular_swan_short_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(371, 995).addBox(-6.0784F, -9.0F, -0.9017F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0784F, 5.6073F, 0.1181F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_short_1_mane = neck_muscular_swan_short_1.addOrReplaceChild("neck_muscular_swan_short_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0615F, 0.0F));

            PartDefinition neck_muscular_swan_short_1_top_mane = neck_muscular_swan_short_1_mane.addOrReplaceChild("neck_muscular_swan_short_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -0.8402F, -2.1375F));

            PartDefinition neck_muscular_swan_short_1_top_mane_connector = neck_muscular_swan_short_1_top_mane.addOrReplaceChild("neck_muscular_swan_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -1.0726F, 1.6983F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_short_1_top_mane_connector_individual = neck_muscular_swan_short_1_top_mane_connector.addOrReplaceChild("neck_muscular_swan_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

            PartDefinition cube_r6 = neck_muscular_swan_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(722, 997).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_short_1_top_mane_connector2 = neck_muscular_swan_short_1_top_mane_connector.addOrReplaceChild("neck_muscular_swan_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.8045F, -0.8045F));

            PartDefinition neck_muscular_swan_short_1_top_mane_connector2_individual = neck_muscular_swan_short_1_top_mane_connector2.addOrReplaceChild("neck_muscular_swan_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.1269F, -0.5098F));

            PartDefinition cube_r7 = neck_muscular_swan_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(723, 1005).addBox(-2.0F, -2.0F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_short_1_top_mane_flow = neck_muscular_swan_short_1_top_mane_connector2.addOrReplaceChild("neck_muscular_swan_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8603F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_muscular_swan_short_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(707, 999).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4086F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

            PartDefinition neck_muscular_swan_short_1_bottom_mane = neck_muscular_swan_short_1_mane.addOrReplaceChild("neck_muscular_swan_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, 2.2883F, 3.1362F));

            PartDefinition neck_muscular_swan_short_1_bottom_mane_connector = neck_muscular_swan_short_1_bottom_mane.addOrReplaceChild("neck_muscular_swan_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_short_1_bottom_mane_connector_individual = neck_muscular_swan_short_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_swan_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -1.3083F, -0.9874F));

            PartDefinition cube_r9 = neck_muscular_swan_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(735, 1002).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3667F, -2.3092F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_short_1_bottom_mane_connector2 = neck_muscular_swan_short_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_swan_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.2682F, -1.6983F, -0.3575F));

            PartDefinition neck_muscular_swan_short_1_bottom_mane_connector2_individual = neck_muscular_swan_short_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_swan_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, -0.0024F, -0.2378F));

            PartDefinition cube_r10 = neck_muscular_swan_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(723, 1012).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0702F, -2.7119F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_short_1_bottom_mane_flow = neck_muscular_swan_short_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_swan_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.7709F, -0.1788F, 0.0894F));

            PartDefinition cube_r11 = neck_muscular_swan_short_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(714, 1005).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, 0.7151F, 0.8045F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("muscular") && length.equals("short") && variation == 2) {
            PartDefinition neck_muscular_swan_short_2 = partdefinition.addOrReplaceChild("neck_muscular_swan_short_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_muscular_swan_short_2_individual = neck_muscular_swan_short_2.addOrReplaceChild("neck_muscular_swan_short_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_short_2_crest = neck_muscular_swan_short_2_individual.addOrReplaceChild("neck_muscular_swan_short_2_crest", CubeListBuilder.create(), PartPose.offset(-0.3575F, -7.2402F, -0.8939F));

            PartDefinition neck_muscular_swan_short_2_crest_upper = neck_muscular_swan_short_2_crest.addOrReplaceChild("neck_muscular_swan_short_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.108F, 1.5951F, -1.0053F));

            PartDefinition cube_r1 = neck_muscular_swan_short_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(439, 1006).addBox(-3.0892F, -6.0F, -3.8808F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5892F, -0.9122F, 1.8684F, 1.0908F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_short_2_crest_lower = neck_muscular_swan_short_2_crest.addOrReplaceChild("neck_muscular_swan_short_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.098F, 3.1227F, 2.5698F));

            PartDefinition cube_r2 = neck_muscular_swan_short_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(425, 1006).addBox(-5.08F, -12.0F, -0.92F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 7.0087F, 4.8099F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_short_2_middle_individual = neck_muscular_swan_short_2_individual.addOrReplaceChild("neck_muscular_swan_short_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.2261F, -2.2372F, -0.9297F));

            PartDefinition cube_r3 = neck_muscular_swan_short_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(406, 993).addBox(-5.0F, -10.0F, -2.0F, 6.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0139F, 4.4419F, 3.2252F, 0.5672F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_muscular_swan_short_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(405, 1006).addBox(-7.08F, -9.0F, -0.92F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0661F, 6.4792F, -0.0428F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_short_2_lower_individual = neck_muscular_swan_short_2_individual.addOrReplaceChild("neck_muscular_swan_short_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.2431F, -1.3166F, -2.1548F));

            PartDefinition cube_r5 = neck_muscular_swan_short_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(428, 994).addBox(-5.0784F, -9.0F, -0.9017F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 5.1192F, 0.0099F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_short_2_mane = neck_muscular_swan_short_2.addOrReplaceChild("neck_muscular_swan_short_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -6.5251F, 0.0F));

            PartDefinition neck_muscular_swan_short_2_top_mane = neck_muscular_swan_short_2_mane.addOrReplaceChild("neck_muscular_swan_short_2_top_mane", CubeListBuilder.create(), PartPose.offset(-0.7206F, -2.6279F, -2.4951F));

            PartDefinition neck_muscular_swan_short_2_top_mane_connector = neck_muscular_swan_short_2_top_mane.addOrReplaceChild("neck_muscular_swan_short_2_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0894F, -0.3575F, 1.3408F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_short_2_top_mane_connector_individual = neck_muscular_swan_short_2_top_mane_connector.addOrReplaceChild("neck_muscular_swan_short_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

            PartDefinition cube_r6 = neck_muscular_swan_short_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(771, 997).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_short_2_top_mane_connector2 = neck_muscular_swan_short_2_top_mane_connector.addOrReplaceChild("neck_muscular_swan_short_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.8045F, -0.8045F));

            PartDefinition neck_muscular_swan_short_2_top_mane_connector2_individual = neck_muscular_swan_short_2_top_mane_connector2.addOrReplaceChild("neck_muscular_swan_short_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.1269F, -0.5098F));

            PartDefinition cube_r7 = neck_muscular_swan_short_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(771, 1005).addBox(-2.0F, -2.0F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_short_2_top_mane_flow = neck_muscular_swan_short_2_top_mane_connector2.addOrReplaceChild("neck_muscular_swan_short_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0391F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_muscular_swan_short_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(755, 999).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4086F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

            PartDefinition neck_muscular_swan_short_2_bottom_mane = neck_muscular_swan_short_2_mane.addOrReplaceChild("neck_muscular_swan_short_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, 1.2156F, 2.4211F));

            PartDefinition neck_muscular_swan_short_2_bottom_mane_connector = neck_muscular_swan_short_2_bottom_mane.addOrReplaceChild("neck_muscular_swan_short_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2514F, 0.2682F, -0.1788F, 0.0436F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_short_2_bottom_mane_connector_individual = neck_muscular_swan_short_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_swan_short_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.6188F, -0.4378F, -0.0775F));

            PartDefinition cube_r9 = neck_muscular_swan_short_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(783, 1001).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7634F, -2.6136F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_short_2_bottom_mane_connector2 = neck_muscular_swan_short_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_swan_short_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.5196F, -0.6882F, 0.9631F));

            PartDefinition neck_muscular_swan_short_2_bottom_mane_connector2_individual = neck_muscular_swan_short_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_swan_short_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, -0.142F, -0.6485F));

            PartDefinition cube_r10 = neck_muscular_swan_short_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(781, 1011).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4669F, -3.0163F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_short_2_bottom_mane_flow = neck_muscular_swan_short_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_swan_short_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1285F, -0.1788F, -0.2682F, 0.0021F, 0.0044F, 0.0048F));

            PartDefinition cube_r11 = neck_muscular_swan_short_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(761, 1004).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2682F, 0.1788F, 0.4469F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("muscular") && length.equals("average") && variation == 1) {
            PartDefinition neck_muscular_swan_average_1 = partdefinition.addOrReplaceChild("neck_muscular_swan_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_1_individual = neck_muscular_swan_average_1.addOrReplaceChild("neck_muscular_swan_average_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3575F, 1.8771F, 1.4302F, 0.0873F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_1_crest = neck_muscular_swan_average_1_individual.addOrReplaceChild("neck_muscular_swan_average_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -9.743F, -2.7709F));

            PartDefinition neck_muscular_swan_average_1_crest_upper = neck_muscular_swan_average_1_crest.addOrReplaceChild("neck_muscular_swan_average_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.0913F, 0.3211F, -2.6871F));

            PartDefinition cube_r1 = neck_muscular_swan_average_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(495, 1006).addBox(-4.0892F, -6.0F, -3.8808F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, 0.1605F, 3.2986F, 1.0908F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_1_crest_lower = neck_muscular_swan_average_1_crest.addOrReplaceChild("neck_muscular_swan_average_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.098F, 3.3535F, 2.5885F));

            PartDefinition cube_r2 = neck_muscular_swan_average_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(481, 1006).addBox(-5.08F, -12.0F, -0.92F, 5.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 6.5991F, 4.5231F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_1_middle_individual = neck_muscular_swan_average_1_individual.addOrReplaceChild("neck_muscular_swan_average_1_middle_individual", CubeListBuilder.create(), PartPose.offset(0.1565F, -4.4665F, -2.876F));

            PartDefinition cube_r3 = neck_muscular_swan_average_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(461, 1006).addBox(-5.08F, -9.0F, -0.92F, 6.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0745F, 6.0269F, -0.2418F, 0.2618F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_muscular_swan_average_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(461, 992).addBox(-4.0F, -10.0F, -2.0F, 6.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0055F, 3.9896F, 3.0261F, 0.5672F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_1_lower_individual = neck_muscular_swan_average_1_individual.addOrReplaceChild("neck_muscular_swan_average_1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.1145F, -3.51F, -4.1918F));

            PartDefinition cube_r5 = neck_muscular_swan_average_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(483, 993).addBox(-5.0784F, -9.0F, -0.9017F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 4.631F, -0.0983F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_1_mane = neck_muscular_swan_average_1.addOrReplaceChild("neck_muscular_swan_average_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -6.7933F, 0.0F));

            PartDefinition neck_muscular_swan_average_1_top_mane = neck_muscular_swan_average_1_mane.addOrReplaceChild("neck_muscular_swan_average_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -2.4492F, -3.2101F));

            PartDefinition neck_muscular_swan_average_1_top_mane_connector = neck_muscular_swan_average_1_top_mane.addOrReplaceChild("neck_muscular_swan_average_1_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -1.0726F, 1.3408F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_1_top_mane_connector_individual = neck_muscular_swan_average_1_top_mane_connector.addOrReplaceChild("neck_muscular_swan_average_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

            PartDefinition cube_r6 = neck_muscular_swan_average_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(821, 998).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_1_top_mane_connector2 = neck_muscular_swan_average_1_top_mane_connector.addOrReplaceChild("neck_muscular_swan_average_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.8045F, -0.8045F));

            PartDefinition neck_muscular_swan_average_1_top_mane_connector2_individual = neck_muscular_swan_average_1_top_mane_connector2.addOrReplaceChild("neck_muscular_swan_average_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.1269F, -0.5098F));

            PartDefinition cube_r7 = neck_muscular_swan_average_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(821, 1006).addBox(-2.0F, -2.0F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_1_top_mane_flow = neck_muscular_swan_average_1_top_mane_connector2.addOrReplaceChild("neck_muscular_swan_average_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9497F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_muscular_swan_average_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(805, 1000).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4086F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

            PartDefinition neck_muscular_swan_average_1_bottom_mane = neck_muscular_swan_average_1_mane.addOrReplaceChild("neck_muscular_swan_average_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, 0.6793F, 1.7061F));

            PartDefinition neck_muscular_swan_average_1_bottom_mane_connector = neck_muscular_swan_average_1_bottom_mane.addOrReplaceChild("neck_muscular_swan_average_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_1_bottom_mane_connector_individual = neck_muscular_swan_average_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_swan_average_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.5149F, -0.3787F));

            PartDefinition cube_r9 = neck_muscular_swan_average_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(833, 999).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.16F, -2.9179F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_1_bottom_mane_connector2 = neck_muscular_swan_average_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_swan_average_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.2682F, -1.0726F, 0.3575F));

            PartDefinition neck_muscular_swan_average_1_bottom_mane_connector2_individual = neck_muscular_swan_average_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_swan_average_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, 0.1653F, -0.3441F));

            PartDefinition cube_r10 = neck_muscular_swan_average_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(830, 1010).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8636F, -3.3207F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_1_bottom_mane_flow = neck_muscular_swan_average_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_swan_average_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.7709F, 0.0894F, -0.0894F));

            PartDefinition cube_r11 = neck_muscular_swan_average_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(810, 1004).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, -0.1788F, 0.2682F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("muscular") && length.equals("average") && variation == 2) {
            PartDefinition neck_muscular_swan_average_2 = partdefinition.addOrReplaceChild("neck_muscular_swan_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_2_individual = neck_muscular_swan_average_2.addOrReplaceChild("neck_muscular_swan_average_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3575F, 0.8939F, 0.9832F, 0.0873F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_2_crest = neck_muscular_swan_average_2_individual.addOrReplaceChild("neck_muscular_swan_average_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -11.0838F, -3.0391F));

            PartDefinition neck_muscular_swan_average_2_crest_upper = neck_muscular_swan_average_2_crest.addOrReplaceChild("neck_muscular_swan_average_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1974F, 1.6293F, -2.4487F));

            PartDefinition cube_r1 = neck_muscular_swan_average_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(553, 1006).addBox(-3.0892F, -6.0F, -3.8808F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5892F, 0.1605F, 3.2986F, 1.0908F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_2_crest_lower = neck_muscular_swan_average_2_crest.addOrReplaceChild("neck_muscular_swan_average_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2768F, 5.1039F, 3.1434F));

            PartDefinition cube_r2 = neck_muscular_swan_average_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(539, 1006).addBox(-5.08F, -12.0F, -0.92F, 5.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 6.1895F, 4.2363F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_2_middle_individual = neck_muscular_swan_average_2_individual.addOrReplaceChild("neck_muscular_swan_average_2_middle_individual", CubeListBuilder.create(), PartPose.offset(0.1482F, -4.0141F, -2.6769F));

            PartDefinition cube_r3 = neck_muscular_swan_average_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(519, 1006).addBox(-5.08F, -9.0F, -0.92F, 6.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0829F, 5.5745F, -0.4408F, 0.2618F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_muscular_swan_average_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(518, 991).addBox(-5.0F, -10.0F, -2.0F, 6.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9971F, 3.5373F, 2.8271F, 0.5672F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_2_lower_individual = neck_muscular_swan_average_2_individual.addOrReplaceChild("neck_muscular_swan_average_2_lower_individual", CubeListBuilder.create(), PartPose.offset(0.1145F, -3.0218F, -4.0836F));

            PartDefinition cube_r5 = neck_muscular_swan_average_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(540, 992).addBox(-4.8996F, -9.0F, -0.9017F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8996F, 4.1429F, -0.2065F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_2_mane = neck_muscular_swan_average_2.addOrReplaceChild("neck_muscular_swan_average_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_2_top_mane = neck_muscular_swan_average_2_mane.addOrReplaceChild("neck_muscular_swan_average_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -2.8961F, -0.5286F));

            PartDefinition neck_muscular_swan_average_2_top_mane_connector = neck_muscular_swan_average_2_top_mane.addOrReplaceChild("neck_muscular_swan_average_2_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -8.4022F, -1.7877F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_2_top_mane_connector_individual = neck_muscular_swan_average_2_top_mane_connector.addOrReplaceChild("neck_muscular_swan_average_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

            PartDefinition cube_r6 = neck_muscular_swan_average_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(873, 998).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_2_top_mane_connector2 = neck_muscular_swan_average_2_top_mane_connector.addOrReplaceChild("neck_muscular_swan_average_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.9832F, -0.8045F, -0.8045F));

            PartDefinition neck_muscular_swan_average_2_top_mane_connector2_individual = neck_muscular_swan_average_2_top_mane_connector2.addOrReplaceChild("neck_muscular_swan_average_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.4665F, 0.1269F, -0.5098F));

            PartDefinition cube_r7 = neck_muscular_swan_average_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(873, 1006).addBox(-2.0F, -2.0F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_2_top_mane_flow = neck_muscular_swan_average_2_top_mane_connector2.addOrReplaceChild("neck_muscular_swan_average_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5922F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_muscular_swan_average_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(857, 1000).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4086F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

            PartDefinition neck_muscular_swan_average_2_bottom_mane = neck_muscular_swan_average_2_mane.addOrReplaceChild("neck_muscular_swan_average_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -7.0972F, 1.2591F));

            PartDefinition neck_muscular_swan_average_2_bottom_mane_connector = neck_muscular_swan_average_2_bottom_mane.addOrReplaceChild("neck_muscular_swan_average_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_2_bottom_mane_connector_individual = neck_muscular_swan_average_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_swan_average_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.1182F, -0.0743F));

            PartDefinition cube_r9 = neck_muscular_swan_average_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(885, 997).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5567F, -3.2223F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_2_bottom_mane_connector2 = neck_muscular_swan_average_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_swan_average_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.2682F, -0.6257F, 0.7151F));

            PartDefinition neck_muscular_swan_average_2_bottom_mane_connector2_individual = neck_muscular_swan_average_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_swan_average_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, 0.115F, -0.3973F));

            PartDefinition cube_r10 = neck_muscular_swan_average_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(883, 1009).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.2603F, -3.6251F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_average_2_bottom_mane_flow = neck_muscular_swan_average_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_swan_average_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.6816F, -0.0894F, -0.2682F));

            PartDefinition cube_r11 = neck_muscular_swan_average_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(861, 1003).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, -0.4469F, 0.0894F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("muscular") && length.equals("long") && variation == 1) {
            PartDefinition neck_muscular_swan_long_1 = partdefinition.addOrReplaceChild("neck_muscular_swan_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_1_individual = neck_muscular_swan_long_1.addOrReplaceChild("neck_muscular_swan_long_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3575F, 0.1788F, 0.2682F, 0.0873F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_1_crest = neck_muscular_swan_long_1_individual.addOrReplaceChild("neck_muscular_swan_long_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -10.3687F, -3.2179F));

            PartDefinition neck_muscular_swan_long_1_crest_upper = neck_muscular_swan_long_1_crest.addOrReplaceChild("neck_muscular_swan_long_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1807F, 0.6461F, -3.0744F));

            PartDefinition cube_r1 = neck_muscular_swan_long_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(610, 1003).addBox(-4.0892F, -6.0F, -3.8808F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, 0.1605F, 3.2986F, 1.0908F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_1_crest_lower = neck_muscular_swan_long_1_crest.addOrReplaceChild("neck_muscular_swan_long_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1874F, 4.7984F, 3.609F));

            PartDefinition cube_r2 = neck_muscular_swan_long_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(596, 1004).addBox(-5.08F, -12.0F, -0.92F, 5.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 5.78F, 3.9495F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_1_middle_individual = neck_muscular_swan_long_1_individual.addOrReplaceChild("neck_muscular_swan_long_1_middle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, -2.2346F, -0.8045F));

            PartDefinition cube_r3 = neck_muscular_swan_long_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(576, 988).addBox(-4.0F, -10.0F, -2.0F, 6.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.162F, 1.7578F, 0.9547F, 0.5672F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_muscular_swan_long_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(576, 1004).addBox(-5.08F, -9.0F, -0.92F, 6.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, 3.795F, -2.3133F, 0.2618F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_1_lower_individual = neck_muscular_swan_long_1_individual.addOrReplaceChild("neck_muscular_swan_long_1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.1145F, -2.5337F, -3.9754F));

            PartDefinition cube_r5 = neck_muscular_swan_long_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(598, 989).addBox(-5.0784F, -9.0F, -0.9017F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 3.6548F, -0.3147F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_1_mane = neck_muscular_swan_long_1.addOrReplaceChild("neck_muscular_swan_long_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -9.0279F, -2.0559F));

            PartDefinition neck_muscular_swan_long_1_top_mane = neck_muscular_swan_long_1_mane.addOrReplaceChild("neck_muscular_swan_long_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0559F, -2.4134F));

            PartDefinition neck_muscular_swan_long_1_top_mane_connector = neck_muscular_swan_long_1_top_mane.addOrReplaceChild("neck_muscular_swan_long_1_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6312F, -0.9296F, 0.0077F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_1_top_mane_connector_individual = neck_muscular_swan_long_1_top_mane_connector.addOrReplaceChild("neck_muscular_swan_long_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.1309F, -0.2048F));

            PartDefinition cube_r6 = neck_muscular_swan_long_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(927, 998).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_1_top_mane_connector2 = neck_muscular_swan_long_1_top_mane_connector.addOrReplaceChild("neck_muscular_swan_long_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.9832F, -0.4949F, 0.5918F));

            PartDefinition neck_muscular_swan_long_1_top_mane_connector2_individual = neck_muscular_swan_long_1_top_mane_connector2.addOrReplaceChild("neck_muscular_swan_long_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.4665F, 0.1269F, -0.5098F));

            PartDefinition cube_r7 = neck_muscular_swan_long_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(927, 1006).addBox(-2.0F, -2.0F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_1_top_mane_flow = neck_muscular_swan_long_1_top_mane_connector2.addOrReplaceChild("neck_muscular_swan_long_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5028F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_muscular_swan_long_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(911, 1000).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4086F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

            PartDefinition neck_muscular_swan_long_1_bottom_mane = neck_muscular_swan_long_1_mane.addOrReplaceChild("neck_muscular_swan_long_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, 1.2156F, 2.5999F));

            PartDefinition neck_muscular_swan_long_1_bottom_mane_connector = neck_muscular_swan_long_1_bottom_mane.addOrReplaceChild("neck_muscular_swan_long_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_1_bottom_mane_connector_individual = neck_muscular_swan_long_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_swan_long_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.2784F, 0.2301F));

            PartDefinition cube_r9 = neck_muscular_swan_long_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(939, 995).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9534F, -3.5267F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_1_bottom_mane_connector2 = neck_muscular_swan_long_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_swan_long_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.2682F, -0.4469F, 0.8045F));

            PartDefinition neck_muscular_swan_long_1_bottom_mane_connector_individual2 = neck_muscular_swan_long_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_swan_long_1_bottom_mane_connector_individual2", CubeListBuilder.create(), PartPose.offset(1.5559F, 0.3329F, -0.1823F));

            PartDefinition cube_r10 = neck_muscular_swan_long_1_bottom_mane_connector_individual2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(938, 1008).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6569F, -3.9295F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_1_bottom_mane_flow = neck_muscular_swan_long_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_swan_long_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.4134F, -0.0894F, -0.1788F));

            PartDefinition cube_r11 = neck_muscular_swan_long_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(914, 1002).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, -0.6257F, -0.0894F, -0.8937F, -0.1201F, -0.1036F));

        } else if (muscleMass.equals("muscular") && length.equals("long") && variation == 2) {
            PartDefinition neck_muscular_swan_long_2 = partdefinition.addOrReplaceChild("neck_muscular_swan_long_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_2_individual = neck_muscular_swan_long_2.addOrReplaceChild("neck_muscular_swan_long_2_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_2_crest = neck_muscular_swan_long_2_individual.addOrReplaceChild("neck_muscular_swan_long_2_crest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.8324F, -3.486F, 0.0873F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_2_crest_upper = neck_muscular_swan_long_2_crest.addOrReplaceChild("neck_muscular_swan_long_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.0913F, 0.3867F, -2.962F));

            PartDefinition cube_r1 = neck_muscular_swan_long_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(653, 1006).addBox(-4.0892F, -6.0F, -3.8808F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, 0.1605F, 3.2986F, 1.0908F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_2_crest_lower = neck_muscular_swan_long_2_crest.addOrReplaceChild("neck_muscular_swan_long_2_crest_lower", CubeListBuilder.create(), PartPose.offsetAndRotation(0.098F, 4.7418F, 3.6752F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r2 = neck_muscular_swan_long_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(650, 990).addBox(-5.08F, -12.0F, -0.92F, 5.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 5.3704F, 3.6627F, 0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_2_middle_individual = neck_muscular_swan_long_2_individual.addOrReplaceChild("neck_muscular_swan_long_2_middle_individual", CubeListBuilder.create(), PartPose.offset(0.0504F, -3.6198F, -2.4883F));

            PartDefinition cube_r3 = neck_muscular_swan_long_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(664, 991).addBox(-6.08F, -12.0F, -0.92F, 6.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0745F, 7.3255F, -0.1825F, 0.2618F, 0.0F, 0.0F));

            PartDefinition cube_r4 = neck_muscular_swan_long_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(628, 986).addBox(-5.0F, -10.0F, -2.0F, 6.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0055F, 2.8748F, 2.5491F, 0.5672F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_2_lower_individual = neck_muscular_swan_long_2_individual.addOrReplaceChild("neck_muscular_swan_long_2_lower_individual", CubeListBuilder.create(), PartPose.offset(0.1145F, -3.7781F, -4.2812F));

            PartDefinition cube_r5 = neck_muscular_swan_long_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(637, 1003).addBox(-5.0784F, -9.0F, -0.9017F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 4.631F, -0.0983F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_2_mane = neck_muscular_swan_long_2.addOrReplaceChild("neck_muscular_swan_long_2_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -4.0581F, -1.6012F));

            PartDefinition neck_muscular_swan_long_2_top_mane = neck_muscular_swan_long_2_mane.addOrReplaceChild("neck_muscular_swan_long_2_top_mane", CubeListBuilder.create(), PartPose.offset(-0.4414F, -6.4894F, 0.618F));

            PartDefinition neck_muscular_swan_long_2_top_mane_connector = neck_muscular_swan_long_2_top_mane.addOrReplaceChild("neck_muscular_swan_long_2_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2737F, -1.9128F, -3.8358F, 0.2182F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_2_top_mane_connector_individual = neck_muscular_swan_long_2_top_mane_connector.addOrReplaceChild("neck_muscular_swan_long_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.1309F, -0.2048F));

            PartDefinition cube_r6 = neck_muscular_swan_long_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(983, 997).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_2_top_mane_connector2 = neck_muscular_swan_long_2_top_mane_connector.addOrReplaceChild("neck_muscular_swan_long_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.048F, 1.3069F));

            PartDefinition neck_muscular_swan_long_2_top_mane_connector2_individual = neck_muscular_swan_long_2_top_mane_connector2.addOrReplaceChild("neck_muscular_swan_long_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, -0.32F, -1.2249F));

            PartDefinition cube_r7 = neck_muscular_swan_long_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(983, 1005).addBox(-2.0F, -2.0F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_2_top_mane_flow = neck_muscular_swan_long_2_top_mane_connector2.addOrReplaceChild("neck_muscular_swan_long_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7709F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r8 = neck_muscular_swan_long_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(967, 999).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4274F, -0.2133F, -0.3647F));

            PartDefinition neck_muscular_swan_long_2_bottom_mane = neck_muscular_swan_long_2_top_mane.addOrReplaceChild("neck_muscular_swan_long_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 3.3609F, 1.9742F));

            PartDefinition neck_muscular_swan_long_2_bottom_mane_connector = neck_muscular_swan_long_2_bottom_mane.addOrReplaceChild("neck_muscular_swan_long_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3575F, -0.3575F, 0.0436F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_2_bottom_mane_connector_individual = neck_muscular_swan_long_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_swan_long_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.6751F, 0.5345F));

            PartDefinition cube_r9 = neck_muscular_swan_long_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(995, 993).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.3501F, -3.8311F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_2_bottom_mane_connector2 = neck_muscular_swan_long_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_swan_long_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));

            PartDefinition neck_muscular_swan_long_2_bottom_mane_connector2_individual = neck_muscular_swan_long_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_swan_long_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.2827F, 0.1221F));

            PartDefinition cube_r10 = neck_muscular_swan_long_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(990, 1007).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.0536F, -4.2338F, -0.9163F, 0.0F, 0.0F));

            PartDefinition neck_muscular_swan_long_2_bottom_mane_flow = neck_muscular_swan_long_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_swan_long_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.1453F, -0.3575F, 0.0894F));

            PartDefinition cube_r11 = neck_muscular_swan_long_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(969, 1000).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));

        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Neck / " + muscleMass + " / " + "swan" +  " / "  + length + " / Variation " + variation + ", Cancelling Generation...");
        }
        allParts.add("neck_" + muscleMass + "_" + "swan" + "_" + length + "_" + variation);
        return partdefinition;
    }

    public static PartDefinition GenerateAll(PartDefinition root) {
        List<String> muscleMass = List.of("lean", "average", "muscular");
        List<String> curve = List.of("arched", "ewed", "straight", "swan");
        List<String> length = List.of("short", "average", "long");

        for(String variable1 : muscleMass){
            for(String variable3 : length){
                for(String variable2 : curve){
                    if(variable2.equals("arched")){
                        root = GenerateArched(root, variable1, variable3, 1);
                        root = GenerateArched(root, variable1, variable3, 2);
                    } else if(variable2.equals("ewed")){
                        root = GenerateEwed(root, variable1, variable3, 1);
                        root = GenerateEwed(root, variable1, variable3, 2);
                    } else if(variable2.equals("straight")){
                        root = GenerateStraight(root, variable1, variable3, 1);
                        root = GenerateStraight(root, variable1, variable3, 2);
                    } else if(variable2.equals("swan")){
                        root = GenerateSwan(root, variable1, variable3, 1);
                        root = GenerateSwan(root, variable1, variable3, 2);
                    }
                }
            }
        }
        return root;
    }
}
