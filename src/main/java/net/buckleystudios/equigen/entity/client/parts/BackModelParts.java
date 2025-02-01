package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

import java.util.ArrayList;
import java.util.List;

public class BackModelParts {
    private static List<String> allParts = new ArrayList<>();
    public static List<String> getAllParts(){
        return allParts;
    }

    public static PartDefinition Generate(PartDefinition partdefinition, String muscleMass, String length, String girth) {
        if (muscleMass.equals("lean") && length.equals("short") && girth.equals("thin")) {
            PartDefinition back_lean_short_thin = partdefinition.addOrReplaceChild("back_lean_short_thin", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_lean_short_thin_back_ribs = back_lean_short_thin.addOrReplaceChild("back_lean_short_thin_back_ribs", CubeListBuilder.create().texOffs(86, 427).addBox(-3.0F, -3.0F, -5.5F, 6.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0297F, 0.1397F, -0.0179F));

            PartDefinition back_lean_short_thin_back_top_lower = back_lean_short_thin.addOrReplaceChild("back_lean_short_thin_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.6257F));

            PartDefinition back_lean_short_thin_back_top_lower_individual = back_lean_short_thin_back_top_lower.addOrReplaceChild("back_lean_short_thin_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0066F, -0.5855F, 0.6001F));

            PartDefinition cube_r1 = back_lean_short_thin_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(109, 424).addBox(-4.08F, -6.24F, -4.52F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -2.164F, 1.5573F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_lean_short_thin_back_top_upper = back_lean_short_thin_back_top_lower.addOrReplaceChild("back_lean_short_thin_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.8025F, 0.6436F));

            PartDefinition cube_r2 = back_lean_short_thin_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(77, 423).addBox(-4.08F, -6.24F, -5.52F, 4.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && length.equals("short") && girth.equals("average")) {
            PartDefinition back_lean_short_average = partdefinition.addOrReplaceChild("back_lean_short_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_lean_short_average_back_ribs = back_lean_short_average.addOrReplaceChild("back_lean_short_average_back_ribs", CubeListBuilder.create().texOffs(150, 427).addBox(-3.0F, -3.5F, -5.5F, 6.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0297F, -0.0754F, -0.0179F));

            PartDefinition back_lean_short_average_back_top_lower = back_lean_short_average.addOrReplaceChild("back_lean_short_average_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.6257F));

            PartDefinition back_lean_short_average_back_top_lower_individual = back_lean_short_average_back_top_lower.addOrReplaceChild("back_lean_short_average_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0066F, -0.8025F, 0.6436F));

            PartDefinition cube_r1 = back_lean_short_average_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(173, 423).addBox(-4.08F, -6.24F, -5.52F, 5.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_lean_short_average_back_top_upper = back_lean_short_average_back_top_lower.addOrReplaceChild("back_lean_short_average_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.0195F, 0.6872F));

            PartDefinition cube_r2 = back_lean_short_average_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(139, 422).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.1602F, 1.4702F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && length.equals("short") && girth.equals("thick")) {
            PartDefinition back_lean_short_thick = partdefinition.addOrReplaceChild("back_lean_short_thick", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_lean_short_thick_back_ribs = back_lean_short_thick.addOrReplaceChild("back_lean_short_thick_back_ribs", CubeListBuilder.create().texOffs(215, 427).addBox(-3.0F, -4.0F, -5.5F, 6.0F, 8.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0297F, -0.0223F, -0.0179F));

            PartDefinition back_lean_short_thick_back_top_lower = back_lean_short_thick.addOrReplaceChild("back_lean_short_thick_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.6257F));

            PartDefinition back_lean_short_thick_back_top_lower_individual = back_lean_short_thick_back_top_lower.addOrReplaceChild("back_lean_short_thick_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0066F, -1.2494F, 0.6436F));

            PartDefinition cube_r1 = back_lean_short_thick_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(238, 423).addBox(-4.08F, -6.24F, -5.52F, 5.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_lean_short_thick_back_top_upper = back_lean_short_thick_back_top_lower.addOrReplaceChild("back_lean_short_thick_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.4664F, 0.6872F));

            PartDefinition cube_r2 = back_lean_short_thick_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(204, 422).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.1602F, 1.4702F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && length.equals("average") && girth.equals("thin")) {
            PartDefinition back_lean_average_thin = partdefinition.addOrReplaceChild("back_lean_average_thin", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_lean_average_thin_back_ribs = back_lean_average_thin.addOrReplaceChild("back_lean_average_thin_back_ribs", CubeListBuilder.create().texOffs(274, 426).addBox(-3.0F, -3.0F, -6.0F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0297F, 0.1397F, 0.0184F));

            PartDefinition back_lean_average_thin_back_top_lower = back_lean_average_thin.addOrReplaceChild("back_lean_average_thin_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.0894F));

            PartDefinition back_lean_average_thin_back_top_lower_individual = back_lean_average_thin_back_top_lower.addOrReplaceChild("back_lean_average_thin_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0066F, -0.5855F, 1.8514F));

            PartDefinition cube_r1 = back_lean_average_thin_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(298, 424).addBox(-4.08F, -6.24F, -4.52F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -2.164F, 1.5573F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_lean_average_thin_back_top_upper = back_lean_average_thin_back_top_lower.addOrReplaceChild("back_lean_average_thin_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.8025F, 1.895F));

            PartDefinition cube_r2 = back_lean_average_thin_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(266, 423).addBox(-4.08F, -6.24F, -5.52F, 4.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && length.equals("average") && girth.equals("average")) {
            PartDefinition back_lean_average_average = partdefinition.addOrReplaceChild("back_lean_average_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_lean_average_average_back_ribs = back_lean_average_average.addOrReplaceChild("back_lean_average_average_back_ribs", CubeListBuilder.create().texOffs(48, 457).addBox(-3.0F, -3.5F, -6.0F, 6.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0297F, -0.0754F, 0.0184F));

            PartDefinition back_lean_average_average_back_top_lower = back_lean_average_average.addOrReplaceChild("back_lean_average_average_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.1788F));

            PartDefinition back_lean_average_average_back_top_lower_individual = back_lean_average_average_back_top_lower.addOrReplaceChild("back_lean_average_average_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0066F, -0.8025F, 1.9844F));

            PartDefinition cube_r1 = back_lean_average_average_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(72, 454).addBox(-4.08F, -6.24F, -5.52F, 5.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_lean_average_average_back_top_upper = back_lean_average_average_back_top_lower.addOrReplaceChild("back_lean_average_average_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.0195F, 2.028F));

            PartDefinition cube_r2 = back_lean_average_average_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(38, 453).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.1602F, 1.4702F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && length.equals("average") && girth.equals("thick")) {
            PartDefinition back_lean_average_thick = partdefinition.addOrReplaceChild("back_lean_average_thick", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_lean_average_thick_back_ribs = back_lean_average_thick.addOrReplaceChild("back_lean_average_thick_back_ribs", CubeListBuilder.create().texOffs(112, 457).addBox(-3.0F, -4.0F, -6.0F, 6.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0297F, -0.0223F, 0.0184F));

            PartDefinition back_lean_average_thick_back_top_lower = back_lean_average_thick.addOrReplaceChild("back_lean_average_thick_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.1788F));

            PartDefinition back_lean_average_thick_back_top_lower_individual = back_lean_average_thick_back_top_lower.addOrReplaceChild("back_lean_average_thick_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0066F, -1.2494F, 1.6269F));

            PartDefinition cube_r1 = back_lean_average_thick_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(136, 454).addBox(-4.08F, -6.24F, -5.52F, 5.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_lean_average_thick_back_top_upper = back_lean_average_thick_back_top_lower.addOrReplaceChild("back_lean_average_thick_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.4664F, 1.6704F));

            PartDefinition cube_r2 = back_lean_average_thick_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(102, 453).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.1602F, 1.4702F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && length.equals("long") && girth.equals("thin")) {
            PartDefinition back_lean_long_thin = partdefinition.addOrReplaceChild("back_lean_long_thin", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_lean_long_thin_back_ribs = back_lean_long_thin.addOrReplaceChild("back_lean_long_thin_back_ribs", CubeListBuilder.create().texOffs(174, 456).addBox(-3.0F, -3.0F, -6.5F, 6.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0297F, 0.1397F, -0.0347F));

            PartDefinition back_lean_long_thin_back_top_lower = back_lean_long_thin.addOrReplaceChild("back_lean_long_thin_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.2682F));

            PartDefinition back_lean_long_thin_back_top_lower_individual = back_lean_long_thin_back_top_lower.addOrReplaceChild("back_lean_long_thin_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0066F, -0.542F, 1.979F));

            PartDefinition cube_r1 = back_lean_long_thin_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(199, 454).addBox(-4.08F, -7.24F, -4.52F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -2.2075F, 2.0554F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_lean_long_thin_back_top_upper = back_lean_long_thin_back_top_lower.addOrReplaceChild("back_lean_long_thin_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.7589F, 2.0226F));

            PartDefinition cube_r2 = back_lean_long_thin_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(167, 453).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.7056F, 2.0118F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && length.equals("long") && girth.equals("average")) {
            PartDefinition back_lean_long_average = partdefinition.addOrReplaceChild("back_lean_long_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_lean_long_average_back_ribs = back_lean_long_average.addOrReplaceChild("back_lean_long_average_back_ribs", CubeListBuilder.create().texOffs(236, 456).addBox(-3.0F, -3.5F, -6.5F, 6.0F, 7.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0297F, -0.0754F, -0.0347F));

            PartDefinition back_lean_long_average_back_top_lower = back_lean_long_average.addOrReplaceChild("back_lean_long_average_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.3575F));

            PartDefinition back_lean_long_average_back_top_lower_individual = back_lean_long_average_back_top_lower.addOrReplaceChild("back_lean_long_average_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0066F, -0.7589F, 2.112F));

            PartDefinition cube_r1 = back_lean_long_average_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(261, 453).addBox(-4.08F, -7.24F, -5.52F, 5.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -2.7056F, 2.0118F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_lean_long_average_back_top_upper = back_lean_long_average_back_top_lower.addOrReplaceChild("back_lean_long_average_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.9759F, 2.1556F));

            PartDefinition cube_r2 = back_lean_long_average_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(227, 452).addBox(-4.08F, -7.24F, -6.52F, 4.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.2037F, 1.9683F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && length.equals("long") && girth.equals("thick")) {
            PartDefinition back_lean_long_thick = partdefinition.addOrReplaceChild("back_lean_long_thick", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_lean_long_thick_back_ribs = back_lean_long_thick.addOrReplaceChild("back_lean_long_thick_back_ribs", CubeListBuilder.create().texOffs(298, 456).addBox(-3.0F, -4.0F, -6.5F, 6.0F, 8.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0297F, -0.0223F, 0.0547F));

            PartDefinition back_lean_long_thick_back_top_lower = back_lean_long_thick.addOrReplaceChild("back_lean_long_thick_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.1788F));

            PartDefinition back_lean_long_thick_back_top_lower_individual = back_lean_long_thick_back_top_lower.addOrReplaceChild("back_lean_long_thick_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0066F, -1.2059F, 2.0226F));

            PartDefinition cube_r1 = back_lean_long_thick_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(323, 453).addBox(-4.08F, -7.24F, -5.52F, 5.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -2.7056F, 2.0118F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_lean_long_thick_back_top_upper = back_lean_long_thick_back_top_lower.addOrReplaceChild("back_lean_long_thick_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.4229F, 2.0662F));

            PartDefinition cube_r2 = back_lean_long_thick_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(289, 452).addBox(-4.08F, -7.24F, -6.52F, 4.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.2037F, 1.9683F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("short") && girth.equals("thin")) {
            PartDefinition back_average_short_thin = partdefinition.addOrReplaceChild("back_average_short_thin", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_average_short_thin_back_ribs = back_average_short_thin.addOrReplaceChild("back_average_short_thin_back_ribs", CubeListBuilder.create().texOffs(73, 488).addBox(-3.5F, -3.0F, -5.5F, 7.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0066F, 0.1397F, -0.0179F));

            PartDefinition back_average_short_thin_back_top_lower = back_average_short_thin.addOrReplaceChild("back_average_short_thin_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.6257F));

            PartDefinition back_average_short_thin_back_top_lower_individual = back_average_short_thin_back_top_lower.addOrReplaceChild("back_average_short_thin_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.5855F, 0.6001F));

            PartDefinition cube_r1 = back_average_short_thin_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(98, 485).addBox(-5.08F, -6.24F, -4.52F, 6.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.164F, 1.5573F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_average_short_thin_back_top_upper = back_average_short_thin_back_top_lower.addOrReplaceChild("back_average_short_thin_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.4229F, 2.0662F));

            PartDefinition cube_r2 = back_average_short_thin_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(64, 484).addBox(-4.08F, -6.24F, -5.52F, 4.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.0417F, 0.0912F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("short") && girth.equals("average")) {
            PartDefinition back_average_short_average = partdefinition.addOrReplaceChild("back_average_short_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_average_short_average_back_ribs = back_average_short_average.addOrReplaceChild("back_average_short_average_back_ribs", CubeListBuilder.create().texOffs(143, 488).addBox(-3.5F, -3.5F, -5.5F, 7.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0066F, 0.014F, -0.0179F));

            PartDefinition back_average_short_average_back_top_lower = back_average_short_average.addOrReplaceChild("back_average_short_average_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.6257F));

            PartDefinition back_average_short_average_back_top_lower_individual = back_average_short_average_back_top_lower.addOrReplaceChild("back_average_short_average_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.7131F, 0.6436F));

            PartDefinition cube_r1 = back_average_short_average_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(168, 484).addBox(-5.08F, -6.24F, -5.52F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_average_short_average_back_top_upper = back_average_short_average_back_top_lower.addOrReplaceChild("back_average_short_average_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.9301F, 0.6872F));

            PartDefinition cube_r2 = back_average_short_average_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(132, 483).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.1602F, 1.4702F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("short") && girth.equals("thick")) {
            PartDefinition back_average_short_thick = partdefinition.addOrReplaceChild("back_average_short_thick", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_average_short_thick_back_ribs = back_average_short_thick.addOrReplaceChild("back_average_short_thick_back_ribs", CubeListBuilder.create().texOffs(210, 489).addBox(-3.5F, -4.0F, -5.5F, 7.0F, 8.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0066F, -0.0223F, -0.0179F));

            PartDefinition back_average_short_thick_back_top_lower = back_average_short_thick.addOrReplaceChild("back_average_short_thick_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.6257F));

            PartDefinition back_average_short_thick_back_top_lower_individual = back_average_short_thick_back_top_lower.addOrReplaceChild("back_average_short_thick_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.2494F, 0.6436F));

            PartDefinition cube_r1 = back_average_short_thick_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(235, 485).addBox(-5.08F, -6.24F, -5.52F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_average_short_thick_back_top_upper = back_average_short_thick_back_top_lower.addOrReplaceChild("back_average_short_thick_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.4664F, 0.6872F));

            PartDefinition cube_r2 = back_average_short_thick_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(199, 484).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.1602F, 1.4702F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("average") && girth.equals("thin")) {
            PartDefinition back_average_average_thin = partdefinition.addOrReplaceChild("back_average_average_thin", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_average_average_thin_back_ribs = back_average_average_thin.addOrReplaceChild("back_average_average_thin_back_ribs", CubeListBuilder.create().texOffs(272, 488).addBox(-3.5F, -3.0F, -6.0F, 7.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0066F, -0.0391F, 0.0184F));

            PartDefinition back_average_average_thin_back_top_lower = back_average_average_thin.addOrReplaceChild("back_average_average_thin_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, -0.1788F, 0.0894F));

            PartDefinition back_average_average_thin_back_top_lower_individual = back_average_average_thin_back_top_lower.addOrReplaceChild("back_average_average_thin_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.5855F, 1.8514F));

            PartDefinition cube_r1 = back_average_average_thin_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(298, 486).addBox(-5.08F, -6.24F, -4.52F, 6.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.164F, 1.5573F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_average_average_thin_back_top_upper = back_average_average_thin_back_top_lower.addOrReplaceChild("back_average_average_thin_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.8025F, 1.895F));

            PartDefinition cube_r2 = back_average_average_thin_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(264, 485).addBox(-4.08F, -6.24F, -5.52F, 4.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("average") && girth.equals("average")) {
            PartDefinition back_average_average_average = partdefinition.addOrReplaceChild("back_average_average_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_average_average_average_back_ribs = back_average_average_average.addOrReplaceChild("back_average_average_average_back_ribs", CubeListBuilder.create().texOffs(32, 518).addBox(-3.5F, -3.5F, -6.0F, 7.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0828F, -0.0754F, 0.0184F));

            PartDefinition back_average_average_average_back_top_lower = back_average_average_average.addOrReplaceChild("back_average_average_average_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.1788F));

            PartDefinition back_average_average_average_top_lower_individual = back_average_average_average_back_top_lower.addOrReplaceChild("back_average_average_average_top_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0597F, -0.8025F, 1.9844F));

            PartDefinition cube_r1 = back_average_average_average_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(58, 515).addBox(-5.08F, -6.24F, -5.52F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_average_average_average_top_upper = back_average_average_average_back_top_lower.addOrReplaceChild("back_average_average_average_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.0195F, 2.028F));

            PartDefinition cube_r2 = back_average_average_average_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(22, 514).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.1602F, 1.4702F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("average") && girth.equals("thick")) {
            PartDefinition back_average_average_thick = partdefinition.addOrReplaceChild("back_average_average_thick", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_average_average_thick_back_ribs = back_average_average_thick.addOrReplaceChild("back_average_average_thick_back_ribs", CubeListBuilder.create().texOffs(101, 518).addBox(-3.5F, -4.0F, -6.0F, 7.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0066F, -0.0223F, -0.071F));

            PartDefinition back_average_average_thick_back_top_lower = back_average_average_thick.addOrReplaceChild("back_average_average_thick_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0894F));

            PartDefinition back_average_average_thick_back_top_lower_individual = back_average_average_thick_back_top_lower.addOrReplaceChild("back_average_average_thick_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.2494F, 1.6269F));

            PartDefinition cube_r1 = back_average_average_thick_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(127, 515).addBox(-5.08F, -6.24F, -5.52F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_average_average_thick_back_top_upper = back_average_average_thick_back_top_lower.addOrReplaceChild("back_average_average_thick_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.4664F, 1.6704F));

            PartDefinition cube_r2 = back_average_average_thick_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(91, 514).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.1602F, 1.4702F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("long") && girth.equals("thin")) {
            PartDefinition back_average_long_thin = partdefinition.addOrReplaceChild("back_average_long_thin", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_average_long_thin_back_ribs = back_average_long_thin.addOrReplaceChild("back_average_long_thin_back_ribs", CubeListBuilder.create().texOffs(165, 519).addBox(-3.5F, -3.0F, -6.5F, 7.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0066F, 0.1397F, 0.0547F));

            PartDefinition back_average_long_thin_back_top_lower = back_average_long_thin.addOrReplaceChild("back_average_long_thin_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.1788F));

            PartDefinition back_average_long_thin_back_top_lower_individual = back_average_long_thin_back_top_lower.addOrReplaceChild("back_average_long_thin_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.542F, 1.979F));

            PartDefinition cube_r1 = back_average_long_thin_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(192, 517).addBox(-5.08F, -7.24F, -4.52F, 6.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.2075F, 2.0554F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_average_long_thin_back_top_upper = back_average_long_thin_back_top_lower.addOrReplaceChild("back_average_long_thin_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.7589F, 2.0226F));

            PartDefinition cube_r2 = back_average_long_thin_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(158, 516).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.7056F, 2.0118F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("long") && girth.equals("average")) {
            PartDefinition back_average_long_average = partdefinition.addOrReplaceChild("back_average_long_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_average_long_average_back_ribs = back_average_long_average.addOrReplaceChild("back_average_long_average_back_ribs", CubeListBuilder.create().texOffs(230, 519).addBox(-3.5F, -3.486F, -6.5F, 7.0F, 7.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0828F, 0.0F, -0.0347F));

            PartDefinition back_average_long_average_back_top_lower = back_average_long_average.addOrReplaceChild("back_average_long_average_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1788F, -0.3575F));

            PartDefinition back_average_long_average_back_top_lower_individual = back_average_long_average_back_top_lower.addOrReplaceChild("back_average_long_average_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0597F, -0.7589F, 2.112F));

            PartDefinition cube_r1 = back_average_long_average_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(257, 516).addBox(-5.08F, -7.24F, -5.52F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.7056F, 2.0118F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_average_long_average_back_top_upper = back_average_long_average_back_top_lower.addOrReplaceChild("back_average_long_average_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.9759F, 2.1556F));

            PartDefinition cube_r2 = back_average_long_average_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(221, 515).addBox(-4.08F, -7.24F, -6.52F, 4.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.2037F, 1.9683F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("long") && girth.equals("thick")) {
            PartDefinition back_average_long_thick = partdefinition.addOrReplaceChild("back_average_long_thick", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_average_long_thick_back_ribs = back_average_long_thick.addOrReplaceChild("back_average_long_thick_back_ribs", CubeListBuilder.create().texOffs(294, 519).addBox(-3.5F, -4.0F, -6.5F, 7.0F, 8.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0066F, -0.0223F, 0.0547F));

            PartDefinition back_average_long_thick_back_top_lower = back_average_long_thick.addOrReplaceChild("back_average_long_thick_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.1788F));

            PartDefinition back_average_long_thick_back_top_lower_individual = back_average_long_thick_back_top_lower.addOrReplaceChild("back_average_long_thick_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.2059F, 2.0226F));

            PartDefinition cube_r1 = back_average_long_thick_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(321, 516).addBox(-5.08F, -7.24F, -5.52F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.7056F, 2.0118F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_average_long_thick_back_top_upper = back_average_long_thick_back_top_lower.addOrReplaceChild("back_average_long_thick_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.4229F, 2.0662F));

            PartDefinition cube_r2 = back_average_long_thick_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(285, 515).addBox(-4.08F, -7.24F, -6.52F, 4.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.2037F, 1.9683F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("short") && girth.equals("thin")) {
            PartDefinition back_muscular_short_thin = partdefinition.addOrReplaceChild("back_muscular_short_thin", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_muscular_short_thin_back_ribs = back_muscular_short_thin.addOrReplaceChild("back_muscular_short_thin_back_ribs", CubeListBuilder.create().texOffs(68, 553).addBox(-4.0F, -3.0F, -5.5F, 8.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0465F, 0.1397F, -0.0179F));

            PartDefinition back_muscular_short_thin_back_top_lower = back_muscular_short_thin.addOrReplaceChild("back_muscular_short_thin_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.6257F));

            PartDefinition back_muscular_short_thin_back_top_lower_individual = back_muscular_short_thin_back_top_lower.addOrReplaceChild("back_muscular_short_thin_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0234F, -0.5855F, 0.6001F));

            PartDefinition cube_r1 = back_muscular_short_thin_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(95, 550).addBox(-6.08F, -6.24F, -4.52F, 7.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.164F, 1.5573F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_muscular_short_thin_back_top_upper = back_muscular_short_thin_back_top_lower.addOrReplaceChild("back_muscular_short_thin_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.8025F, 0.6436F));

            PartDefinition cube_r2 = back_muscular_short_thin_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(59, 549).addBox(-4.08F, -6.24F, -5.52F, 4.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("short") && girth.equals("average")) {
            PartDefinition back_muscular_short_average = partdefinition.addOrReplaceChild("back_muscular_short_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_muscular_short_average_back_ribs = back_muscular_short_average.addOrReplaceChild("back_muscular_short_average_back_ribs", CubeListBuilder.create().texOffs(136, 553).addBox(-4.0F, -3.5F, -5.5F, 8.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0465F, -0.0754F, -0.0179F));

            PartDefinition back_muscular_short_average_back_top_lower = back_muscular_short_average.addOrReplaceChild("back_muscular_short_average_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.6257F));

            PartDefinition back_muscular_short_average_back_top_lower_individual = back_muscular_short_average_back_top_lower.addOrReplaceChild("back_muscular_short_average_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0234F, -0.8025F, 0.6436F));

            PartDefinition cube_r1 = back_muscular_short_average_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(163, 549).addBox(-6.08F, -6.24F, -5.52F, 7.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_muscular_short_average_back_top_upper = back_muscular_short_average_back_top_lower.addOrReplaceChild("back_muscular_short_average_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.0195F, 0.6872F));

            PartDefinition cube_r2 = back_muscular_short_average_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(125, 548).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.1602F, 1.4702F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("short") && girth.equals("thick")) {
            PartDefinition back_muscular_short_thick = partdefinition.addOrReplaceChild("back_muscular_short_thick", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_muscular_short_thick_back_ribs = back_muscular_short_thick.addOrReplaceChild("back_muscular_short_thick_back_ribs", CubeListBuilder.create().texOffs(204, 553).addBox(-4.0F, -4.0F, -5.5F, 8.0F, 8.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0429F, -0.0223F, -0.0179F));

            PartDefinition back_muscular_short_thick_back_top_lower = back_muscular_short_thick.addOrReplaceChild("back_muscular_short_thick_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.6257F));

            PartDefinition back_muscular_short_thick_back_top_lower_individual = back_muscular_short_thick_back_top_lower.addOrReplaceChild("back_muscular_short_thick_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(0.066F, -1.2494F, 0.6436F));

            PartDefinition cube_r1 = back_muscular_short_thick_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(231, 549).addBox(-6.08F, -6.24F, -5.52F, 7.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_muscular_short_thick_back_top_upper = back_muscular_short_thick_back_top_lower.addOrReplaceChild("back_muscular_short_thick_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.4664F, 0.6872F));

            PartDefinition cube_r2 = back_muscular_short_thick_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(193, 548).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.1602F, 1.4702F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("average") && girth.equals("thin")) {
            PartDefinition back_muscular_average_thin = partdefinition.addOrReplaceChild("back_muscular_average_thin", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_muscular_average_thin_back_ribs = back_muscular_average_thin.addOrReplaceChild("back_muscular_average_thin_back_ribs", CubeListBuilder.create().texOffs(268, 554).addBox(-4.0F, -3.0F, -6.0F, 8.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0465F, 0.1397F, 0.0184F));

            PartDefinition back_muscular_average_thin_back_top_lower = back_muscular_average_thin.addOrReplaceChild("back_muscular_average_thin_back_top_lower", CubeListBuilder.create(), PartPose.offset(-0.1788F, 0.0F, -0.0894F));

            PartDefinition back_muscular_average_thin_back_top_lower_individual = back_muscular_average_thin_back_top_lower.addOrReplaceChild("back_muscular_average_thin_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(0.1554F, -0.5855F, 1.8514F));

            PartDefinition cube_r1 = back_muscular_average_thin_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(296, 552).addBox(-6.08F, -6.24F, -4.52F, 7.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.164F, 1.5573F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_muscular_average_thin_back_top_upper = back_muscular_average_thin_back_top_lower.addOrReplaceChild("back_muscular_average_thin_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.8025F, 1.895F));

            PartDefinition cube_r2 = back_muscular_average_thin_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(260, 551).addBox(-4.08F, -6.24F, -5.52F, 4.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("average") && girth.equals("average")) {
            PartDefinition back_muscular_average_average = partdefinition.addOrReplaceChild("back_muscular_average_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_muscular_average_average_back_ribs = back_muscular_average_average.addOrReplaceChild("back_muscular_average_average_back_ribs", CubeListBuilder.create().texOffs(23, 580).addBox(-4.0F, -3.5F, -6.0F, 8.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0429F, -0.0754F, 0.0184F));

            PartDefinition back_muscular_average_average_back_top_lower = back_muscular_average_average.addOrReplaceChild("back_muscular_average_average_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, -0.0894F));

            PartDefinition back_muscular_average_average_back_top_lower_individual = back_muscular_average_average_back_top_lower.addOrReplaceChild("back_muscular_average_average_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1127F, -0.8025F, 1.9844F));

            PartDefinition cube_r1 = back_muscular_average_average_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(51, 578).addBox(-6.08F, -6.24F, -5.52F, 7.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_muscular_average_average_back_top_upper = back_muscular_average_average_back_top_lower.addOrReplaceChild("back_muscular_average_average_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.0195F, 2.028F));

            PartDefinition cube_r2 = back_muscular_average_average_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(13, 576).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.1602F, 1.4702F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("average") && girth.equals("thick")) {
            PartDefinition back_muscular_average_thick = partdefinition.addOrReplaceChild("back_muscular_average_thick", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_muscular_average_thick_back_ribs = back_muscular_average_thick.addOrReplaceChild("back_muscular_average_thick_back_ribs", CubeListBuilder.create().texOffs(91, 581).addBox(-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0429F, -0.0223F, 0.0184F));

            PartDefinition back_muscular_average_thick_back_top_lower = back_muscular_average_thick.addOrReplaceChild("back_muscular_average_thick_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.1788F));

            PartDefinition back_muscular_average_thick_back_top_lower_individual = back_muscular_average_thick_back_top_lower.addOrReplaceChild("back_muscular_average_thick_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(0.066F, -1.2494F, 1.6269F));

            PartDefinition cube_r1 = back_muscular_average_thick_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(119, 578).addBox(-6.08F, -6.24F, -5.52F, 7.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_muscular_average_thick_back_top_upper = back_muscular_average_thick_back_top_lower.addOrReplaceChild("back_muscular_average_thick_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.4664F, 1.6704F));

            PartDefinition cube_r2 = back_muscular_average_thick_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(81, 577).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.1602F, 1.4702F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("long") && girth.equals("thin")) {
            PartDefinition back_muscular_long_thin = partdefinition.addOrReplaceChild("back_muscular_long_thin", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_muscular_long_thin_back_ribs = back_muscular_long_thin.addOrReplaceChild("back_muscular_long_thin_back_ribs", CubeListBuilder.create().texOffs(156, 581).addBox(-4.0F, -3.0F, -6.5F, 8.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0429F, 0.1397F, 0.0547F));

            PartDefinition back_muscular_long_thin_back_top_lower = back_muscular_long_thin.addOrReplaceChild("back_muscular_long_thin_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.1788F));

            PartDefinition back_muscular_long_thin_back_top_lower_individual = back_muscular_long_thin_back_top_lower.addOrReplaceChild("back_muscular_long_thin_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(0.066F, -0.542F, 1.979F));

            PartDefinition cube_r1 = back_muscular_long_thin_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(185, 579).addBox(-6.08F, -7.24F, -4.52F, 7.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.2075F, 2.0554F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_muscular_long_thin_back_top_upper = back_muscular_long_thin_back_top_lower.addOrReplaceChild("back_muscular_long_thin_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.7589F, 2.0226F));

            PartDefinition cube_r2 = back_muscular_long_thin_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(149, 578).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.7056F, 2.0118F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("long") && girth.equals("average")) {
            PartDefinition back_muscular_long_average = partdefinition.addOrReplaceChild("back_muscular_long_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_muscular_long_average_back_ribs = back_muscular_long_average.addOrReplaceChild("back_muscular_long_average_back_ribs", CubeListBuilder.create().texOffs(223, 581).addBox(-4.0F, -3.5F, -6.5F, 8.0F, 7.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0465F, -0.0754F, -0.0347F));

            PartDefinition back_muscular_long_average_back_top_lower = back_muscular_long_average.addOrReplaceChild("back_muscular_long_average_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.3575F));

            PartDefinition back_muscular_long_average_back_top_lower_individual = back_muscular_long_average_back_top_lower.addOrReplaceChild("back_muscular_long_average_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0234F, -0.7589F, 2.112F));

            PartDefinition cube_r1 = back_muscular_long_average_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(252, 578).addBox(-6.08F, -7.24F, -5.52F, 7.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.7056F, 2.0118F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_muscular_long_average_back_top_upper = back_muscular_long_average_back_top_lower.addOrReplaceChild("back_muscular_long_average_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.9759F, 2.1556F));

            PartDefinition cube_r2 = back_muscular_long_average_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(214, 577).addBox(-4.08F, -7.24F, -6.52F, 4.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.2037F, 1.9683F, 1.6581F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("long") && girth.equals("thick")) {
            PartDefinition back_muscular_long_thick = partdefinition.addOrReplaceChild("back_muscular_long_thick", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition back_muscular_long_thick_back_ribs = back_muscular_long_thick.addOrReplaceChild("back_muscular_long_thick_back_ribs", CubeListBuilder.create().texOffs(290, 581).addBox(-4.0F, -4.0F, -6.5F, 8.0F, 8.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0429F, -0.0223F, -0.0347F));

            PartDefinition back_muscular_long_thick_back_top_lower = back_muscular_long_thick.addOrReplaceChild("back_muscular_long_thick_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.2682F));

            PartDefinition back_muscular_long_thick_back_top_lower_individual = back_muscular_long_thick_back_top_lower.addOrReplaceChild("back_muscular_long_thick_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(0.066F, -1.2059F, 2.0226F));

            PartDefinition cube_r1 = back_muscular_long_thick_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(319, 578).addBox(-6.08F, -7.24F, -5.52F, 7.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.7056F, 2.0118F, 1.6581F, 0.0F, 0.0F));

            PartDefinition back_muscular_long_thick_back_top_upper = back_muscular_long_thick_back_top_lower.addOrReplaceChild("back_muscular_long_thick_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.4229F, 2.0662F));

            PartDefinition cube_r2 = back_muscular_long_thick_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(281, 577).addBox(-4.08F, -7.24F, -6.52F, 4.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.2037F, 1.9683F, 1.6581F, 0.0F, 0.0F));

        } else {
            EquigenMod.LOGGER.error("Invalid Part: Back / " + muscleMass + " / " + length + " / Girth " + girth + ", Cancelling Generation...");
        }
        allParts.add("back_" + muscleMass + "_" + length + "_" + girth);
        return partdefinition;
    }

    public static PartDefinition GenerateAll(PartDefinition root){
        List<String> muscleMass = List.of("lean", "average", "muscular");
        List<String> length = List.of("short", "average", "long");
        List<String> girth = List.of("thin", "average", "thick");

        for(String variable1 : muscleMass){
            for(String variable2 : length){
                for(String variable3 : girth){
                    root = Generate(root, variable1, variable2, variable3);
                }
            }
        }
        return root;
    }
}
