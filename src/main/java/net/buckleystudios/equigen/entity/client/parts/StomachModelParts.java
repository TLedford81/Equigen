package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

import java.util.ArrayList;
import java.util.List;

public class StomachModelParts {
    private static List<String> allParts = new ArrayList<>();
    public static List<String> getAllParts(){
        return allParts;
    }
    public static PartDefinition Generate(PartDefinition partdefinition, String muscleMass, String length, String curve) {
        if (muscleMass.equals("lean") && length.equals("short") && curve.equals("low")) {
            PartDefinition stomach_lean_short_low = partdefinition.addOrReplaceChild("stomach_lean_short_low", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_lean_short_low_stomach_front_upper = stomach_lean_short_low.addOrReplaceChild("stomach_lean_short_low_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_lean_short_low_stomach_front_upper_individual = stomach_lean_short_low_stomach_front_upper.addOrReplaceChild("stomach_lean_short_low_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0241F, -0.8856F, -0.4158F));

            PartDefinition cube_r1 = stomach_lean_short_low_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(406, 320).addBox(-4.0892F, -3.2676F, -5.4648F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, -2.9648F, 0.2676F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_lean_short_low_stomach_front_lower = stomach_lean_short_low_stomach_front_upper.addOrReplaceChild("stomach_lean_short_low_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.0026F, -0.5018F, -0.3368F));

            PartDefinition cube_r2 = stomach_lean_short_low_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(426, 320).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.02F, 1.24F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_lean_short_low_stomach_back_upper = stomach_lean_short_low.addOrReplaceChild("stomach_lean_short_low_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition stomach_lean_short_low_stomach_back_upper_individual = stomach_lean_short_low_stomach_back_upper.addOrReplaceChild("stomach_lean_short_low_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0241F, -1.4667F, 4.3526F));

            PartDefinition cube_r3 = stomach_lean_short_low_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(423, 303).addBox(-5.0984F, -7.2952F, -5.4096F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5984F, -3.4959F, 0.191F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_lean_short_low_stomach_back_lower = stomach_lean_short_low_stomach_back_upper.addOrReplaceChild("stomach_lean_short_low_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(-0.0189F, -1.1252F, 4.4382F));

            PartDefinition cube_r4 = stomach_lean_short_low_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(407, 303).addBox(-4.0792F, -7.2976F, -5.4648F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, -3.5507F, 0.1838F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && length.equals("short") && curve.equals("medium")) {
            PartDefinition stomach_lean_short_medium = partdefinition.addOrReplaceChild("stomach_lean_short_medium", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_lean_short_medium_stomach_front_upper = stomach_lean_short_medium.addOrReplaceChild("stomach_lean_short_medium_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_lean_short_medium_stomach_front_upper_individual = stomach_lean_short_medium_stomach_front_upper.addOrReplaceChild("stomach_lean_short_medium_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0241F, -0.8856F, -0.4487F));

            PartDefinition cube_r1 = stomach_lean_short_medium_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(449, 318).addBox(-4.0892F, -3.2676F, -5.4648F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, -2.9648F, -1.2324F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_lean_short_medium_stomach_front_lower = stomach_lean_short_medium_stomach_front_upper.addOrReplaceChild("stomach_lean_short_medium_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.0026F, -0.5018F, -0.3697F));

            PartDefinition cube_r2 = stomach_lean_short_medium_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(469, 318).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.02F, -0.26F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_lean_short_medium_stomach_back_upper = stomach_lean_short_medium.addOrReplaceChild("stomach_lean_short_medium_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition stomach_lean_short_medium_stomach_back_upper_individual = stomach_lean_short_medium_stomach_back_upper.addOrReplaceChild("stomach_lean_short_medium_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0241F, -1.1909F, 4.3864F));

            PartDefinition cube_r3 = stomach_lean_short_medium_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(469, 304).addBox(-5.0984F, -4.2952F, -5.4096F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5984F, -3.2354F, -1.2862F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_lean_short_medium_stomach_back_lower = stomach_lean_short_medium_stomach_back_upper.addOrReplaceChild("stomach_lean_short_medium_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(-0.0189F, -0.8548F, 4.471F));

            PartDefinition cube_r4 = stomach_lean_short_medium_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(453, 304).addBox(-4.0792F, -4.2976F, -5.4648F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, -3.2902F, -1.2934F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && length.equals("short") && curve.equals("high")) {
            PartDefinition stomach_lean_short_high = partdefinition.addOrReplaceChild("stomach_lean_short_high", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_lean_short_high_stomach_front_upper = stomach_lean_short_high.addOrReplaceChild("stomach_lean_short_high_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_lean_short_high_stomach_front_upper_individual = stomach_lean_short_high_stomach_front_upper.addOrReplaceChild("stomach_lean_short_high_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0241F, -0.3856F, -0.4335F));

            PartDefinition cube_r1 = stomach_lean_short_high_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(494, 315).addBox(-4.0892F, -3.2676F, -5.4648F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, -3.4648F, -3.2324F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_lean_short_high_stomach_front_lower = stomach_lean_short_high_stomach_front_upper.addOrReplaceChild("stomach_lean_short_high_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.0026F, -0.0018F, -0.3545F));

            PartDefinition cube_r2 = stomach_lean_short_high_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(512, 315).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.52F, -2.26F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_lean_short_high_stomach_back_upper = stomach_lean_short_high.addOrReplaceChild("stomach_lean_short_high_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 1.7877F));

            PartDefinition stomach_lean_short_high_stomach_back_upper_individual = stomach_lean_short_high_stomach_back_upper.addOrReplaceChild("stomach_lean_short_high_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0241F, -0.8231F, 2.5835F));

            PartDefinition cube_r3 = stomach_lean_short_high_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(511, 305).addBox(-5.0984F, -0.2952F, -5.4096F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5984F, -2.8881F, -3.2558F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_lean_short_high_stomach_back_lower = stomach_lean_short_high_stomach_back_upper.addOrReplaceChild("stomach_lean_short_high_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(-0.0189F, -0.4941F, 2.6681F));

            PartDefinition cube_r4 = stomach_lean_short_high_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(495, 305).addBox(-4.0792F, -0.2976F, -5.4648F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, -2.9429F, -3.263F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && length.equals("average") && curve.equals("low")) {
            PartDefinition stomach_lean_average_low = partdefinition.addOrReplaceChild("stomach_lean_average_low", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_lean_average_low_stomach_front_upper = stomach_lean_average_low.addOrReplaceChild("stomach_lean_average_low_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_lean_average_low_stomach_front_upper_individual = stomach_lean_average_low_stomach_front_upper.addOrReplaceChild("stomach_lean_average_low_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0241F, -0.8856F, -0.7757F));

            PartDefinition cube_r1 = stomach_lean_average_low_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(537, 320).addBox(-4.0892F, -4.2676F, -5.4648F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, -2.9648F, 0.7676F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_lean_average_low_stomach_front_lower = stomach_lean_average_low_stomach_front_upper.addOrReplaceChild("stomach_lean_average_low_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.0026F, -0.5018F, -0.6966F));

            PartDefinition cube_r2 = stomach_lean_average_low_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(557, 320).addBox(-4.08F, -5.24F, -5.52F, 4.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.02F, 1.74F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_lean_average_low_stomach_back_upper = stomach_lean_average_low.addOrReplaceChild("stomach_lean_average_low_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.4469F));

            PartDefinition stomach_lean_average_low_stomach_back_upper_individual = stomach_lean_average_low_stomach_back_upper.addOrReplaceChild("stomach_lean_average_low_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0241F, -1.5561F, 4.9397F));

            PartDefinition cube_r3 = stomach_lean_average_low_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(554, 303).addBox(-5.0984F, -7.2952F, -5.4096F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5984F, -3.4959F, 0.191F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_lean_average_low_stomach_back_lower = stomach_lean_average_low_stomach_back_upper.addOrReplaceChild("stomach_lean_average_low_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(0.0026F, -1.1281F, 5.2449F));

            PartDefinition cube_r4 = stomach_lean_average_low_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(538, 303).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.595F, 0.1175F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && length.equals("average") && curve.equals("medium")) {
            PartDefinition stomach_lean_average_medium = partdefinition.addOrReplaceChild("stomach_lean_average_medium", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_lean_average_medium_stomach_front_upper = stomach_lean_average_medium.addOrReplaceChild("stomach_lean_average_medium_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_lean_average_medium_stomach_front_upper_individual = stomach_lean_average_medium_stomach_front_upper.addOrReplaceChild("stomach_lean_average_medium_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0241F, -0.8856F, -0.2727F));

            PartDefinition cube_r1 = stomach_lean_average_medium_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(388, 352).addBox(-4.0892F, -4.2676F, -5.4648F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, -2.9648F, -0.7324F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_lean_average_medium_stomach_front_lower = stomach_lean_average_medium_stomach_front_upper.addOrReplaceChild("stomach_lean_average_medium_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.0026F, -0.5018F, -0.1936F));

            PartDefinition cube_r2 = stomach_lean_average_medium_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(408, 352).addBox(-4.08F, -5.24F, -5.52F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.02F, 0.24F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_lean_average_medium_stomach_back_upper = stomach_lean_average_medium.addOrReplaceChild("stomach_lean_average_medium_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition stomach_lean_average_medium_stomach_back_upper_individual = stomach_lean_average_medium_stomach_back_upper.addOrReplaceChild("stomach_lean_average_medium_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0241F, -1.1909F, 4.1686F));

            PartDefinition cube_r3 = stomach_lean_average_medium_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(408, 338).addBox(-5.0984F, -4.2952F, -5.4096F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5984F, -3.2354F, -1.2862F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_lean_average_medium_stomach_back_lower = stomach_lean_average_medium_stomach_back_upper.addOrReplaceChild("stomach_lean_average_medium_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(0.0026F, -0.8523F, 4.295F));

            PartDefinition cube_r4 = stomach_lean_average_medium_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(392, 338).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.3346F, -1.3597F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && length.equals("average") && curve.equals("high")) {
            PartDefinition stomach_lean_average_high = partdefinition.addOrReplaceChild("stomach_lean_average_high", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_lean_average_high_stomach_front_upper = stomach_lean_average_high.addOrReplaceChild("stomach_lean_average_high_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_lean_average_high_stomach_front_upper_individual = stomach_lean_average_high_stomach_front_upper.addOrReplaceChild("stomach_lean_average_high_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0241F, -0.3856F, -0.79F));

            PartDefinition cube_r1 = stomach_lean_average_high_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(434, 350).addBox(-4.0892F, -3.2676F, -5.4648F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, -3.4648F, -3.2324F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_lean_average_high_stomach_front_lower = stomach_lean_average_high_stomach_front_upper.addOrReplaceChild("stomach_lean_average_high_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.0026F, -0.0018F, -0.711F));

            PartDefinition cube_r2 = stomach_lean_average_high_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(452, 350).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.52F, -2.26F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_lean_average_high_stomach_back_upper = stomach_lean_average_high.addOrReplaceChild("stomach_lean_average_high_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 1.5196F));

            PartDefinition stomach_lean_average_high_stomach_back_upper_individual = stomach_lean_average_high_stomach_back_upper.addOrReplaceChild("stomach_lean_average_high_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0241F, -0.9993F, 3.2557F));

            PartDefinition cube_r3 = stomach_lean_average_high_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(451, 339).addBox(-5.0984F, -0.2952F, -5.4096F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5984F, -2.8013F, -3.7482F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_lean_average_high_stomach_back_lower = stomach_lean_average_high_stomach_back_upper.addOrReplaceChild("stomach_lean_average_high_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(0.0026F, -0.5713F, 3.2928F));

            PartDefinition cube_r4 = stomach_lean_average_high_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(435, 339).addBox(-4.08F, -0.24F, -5.52F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.9004F, -3.8217F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && length.equals("long") && curve.equals("low")) {
            PartDefinition stomach_lean_long_low = partdefinition.addOrReplaceChild("stomach_lean_long_low", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_lean_long_low_stomach_front_upper = stomach_lean_long_low.addOrReplaceChild("stomach_lean_long_low_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_lean_long_low_stomach_front_upper_individual = stomach_lean_long_low_stomach_front_upper.addOrReplaceChild("stomach_lean_long_low_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0241F, -0.8856F, -1.0219F));

            PartDefinition cube_r1 = stomach_lean_long_low_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(476, 355).addBox(-4.0892F, -4.2676F, -5.4648F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, -2.9648F, 0.7676F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_lean_long_low_stomach_front_lower = stomach_lean_long_low_stomach_front_upper.addOrReplaceChild("stomach_lean_long_low_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.0026F, -0.5018F, -0.9429F));

            PartDefinition cube_r2 = stomach_lean_long_low_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(496, 355).addBox(-4.08F, -5.24F, -5.52F, 4.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.02F, 1.74F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_lean_long_low_stomach_back_upper = stomach_lean_long_low.addOrReplaceChild("stomach_lean_long_low_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition stomach_lean_long_low_stomach_back_upper_individual = stomach_lean_long_low_stomach_back_upper.addOrReplaceChild("stomach_lean_long_low_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0241F, -1.6429F, 4.739F));

            PartDefinition cube_r3 = stomach_lean_long_low_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(493, 337).addBox(-5.0984F, -7.2952F, -5.4096F, 5.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5984F, -3.4091F, -0.3014F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_lean_long_low_stomach_back_lower = stomach_lean_long_low_stomach_back_upper.addOrReplaceChild("stomach_lean_long_low_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(0.0026F, -1.2149F, 5.0442F));

            PartDefinition cube_r4 = stomach_lean_long_low_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(477, 337).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.5082F, -0.3749F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && length.equals("long") && curve.equals("medium")) {
            PartDefinition stomach_lean_long_medium = partdefinition.addOrReplaceChild("stomach_lean_long_medium", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_lean_long_medium_stomach_front_upper = stomach_lean_long_medium.addOrReplaceChild("stomach_lean_long_medium_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_lean_long_medium_stomach_front_upper_individual = stomach_lean_long_medium_stomach_front_upper.addOrReplaceChild("stomach_lean_long_medium_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0241F, -0.8856F, -0.9612F));

            PartDefinition cube_r1 = stomach_lean_long_medium_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(521, 352).addBox(-4.0892F, -4.2676F, -5.4648F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, -2.9648F, -1.2324F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_lean_long_medium_stomach_front_lower = stomach_lean_long_medium_stomach_front_upper.addOrReplaceChild("stomach_lean_long_medium_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.0026F, -0.5018F, -0.8822F));

            PartDefinition cube_r2 = stomach_lean_long_medium_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(541, 352).addBox(-4.08F, -5.24F, -5.52F, 4.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.02F, -0.26F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_lean_long_medium_stomach_back_upper = stomach_lean_long_medium.addOrReplaceChild("stomach_lean_long_medium_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition stomach_lean_long_medium_stomach_back_upper_individual = stomach_lean_long_medium_stomach_back_upper.addOrReplaceChild("stomach_lean_long_medium_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0241F, -1.1909F, 4.8571F));

            PartDefinition cube_r3 = stomach_lean_long_medium_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(541, 338).addBox(-5.0984F, -4.2952F, -5.4096F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5984F, -3.2354F, -1.2862F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_lean_long_medium_stomach_back_lower = stomach_lean_long_medium_stomach_back_upper.addOrReplaceChild("stomach_lean_long_medium_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(0.0026F, -0.8523F, 4.9835F));

            PartDefinition cube_r4 = stomach_lean_long_medium_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(525, 338).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.3346F, -1.3597F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && length.equals("long") && curve.equals("high")) {
            PartDefinition stomach_lean_long_high = partdefinition.addOrReplaceChild("stomach_lean_long_high", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_lean_long_high_stomach_front_upper = stomach_lean_long_high.addOrReplaceChild("stomach_lean_long_high_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_lean_long_high_stomach_front_upper_individual = stomach_lean_long_high_stomach_front_upper.addOrReplaceChild("stomach_lean_long_high_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0241F, -0.3856F, -1.0316F));

            PartDefinition cube_r1 = stomach_lean_long_high_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(566, 350).addBox(-4.0892F, -3.2676F, -5.4648F, 5.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, -3.4648F, -3.7324F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_lean_long_high_stomach_front_lower = stomach_lean_long_high_stomach_front_upper.addOrReplaceChild("stomach_lean_long_high_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.0026F, -0.0018F, -0.9526F));

            PartDefinition cube_r2 = stomach_lean_long_high_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(584, 350).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.52F, -2.76F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_lean_long_high_stomach_back_upper = stomach_lean_long_high.addOrReplaceChild("stomach_lean_long_high_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 1.2514F));

            PartDefinition stomach_lean_long_high_stomach_back_upper_individual = stomach_lean_long_high_stomach_back_upper.addOrReplaceChild("stomach_lean_long_high_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0241F, -0.9993F, 3.7655F));

            PartDefinition cube_r3 = stomach_lean_long_high_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(583, 339).addBox(-5.0984F, -0.2952F, -5.4096F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5984F, -2.8013F, -3.7482F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_lean_long_high_stomach_back_lower = stomach_lean_long_high_stomach_back_upper.addOrReplaceChild("stomach_lean_long_high_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(0.0026F, -0.5713F, 3.8025F));

            PartDefinition cube_r4 = stomach_lean_long_high_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(567, 339).addBox(-4.08F, -0.24F, -5.52F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.9004F, -3.8217F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("short") && curve.equals("low")) {
            PartDefinition stomach_average_short_low = partdefinition.addOrReplaceChild("stomach_average_short_low", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_average_short_low_stomach_front_upper = stomach_average_short_low.addOrReplaceChild("stomach_average_short_low_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_average_short_low_stomach_front_upper_individual = stomach_average_short_low_stomach_front_upper.addOrReplaceChild("stomach_average_short_low_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0084F, -0.8856F, -0.5257F));

            PartDefinition cube_r1 = stomach_average_short_low_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(397, 398).addBox(-5.0892F, -3.2676F, -5.4648F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0892F, -2.9648F, 0.2676F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_average_short_low_stomach_front_lower = stomach_average_short_low_stomach_front_upper.addOrReplaceChild("stomach_average_short_low_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(-0.0495F, -0.5018F, -0.4466F));

            PartDefinition cube_r2 = stomach_average_short_low_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(419, 398).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.02F, 1.24F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_average_short_low_stomach_back_upper = stomach_average_short_low.addOrReplaceChild("stomach_average_short_low_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition stomach_average_short_low_stomach_back_upper_individual = stomach_average_short_low_stomach_back_upper.addOrReplaceChild("stomach_average_short_low_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0495F, -1.4667F, 4.3322F));

            PartDefinition cube_r3 = stomach_average_short_low_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(415, 381).addBox(-6.0984F, -7.2952F, -5.4096F, 6.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0984F, -3.4959F, 0.191F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_average_short_low_stomach_back_lower = stomach_average_short_low_stomach_back_upper.addOrReplaceChild("stomach_average_short_low_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(-0.0495F, -1.1281F, 4.548F));

            PartDefinition cube_r4 = stomach_average_short_low_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(399, 381).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.595F, 0.1175F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("short") && curve.equals("medium")) {
            PartDefinition stomach_average_short_medium = partdefinition.addOrReplaceChild("stomach_average_short_medium", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_average_short_medium_stomach_front_upper = stomach_average_short_medium.addOrReplaceChild("stomach_average_short_medium_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_average_short_medium_stomach_front_upper_individual = stomach_average_short_medium_stomach_front_upper.addOrReplaceChild("stomach_average_short_medium_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0084F, -0.8856F, -0.559F));

            PartDefinition cube_r1 = stomach_average_short_medium_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(443, 381).addBox(-5.0892F, -3.2676F, -5.4648F, 6.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0892F, -2.9648F, -1.2324F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_average_short_medium_stomach_front_lower = stomach_average_short_medium_stomach_front_upper.addOrReplaceChild("stomach_average_short_medium_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.0399F, -0.5018F, -0.4799F));

            PartDefinition cube_r2 = stomach_average_short_medium_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(465, 381).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.02F, -0.26F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_average_short_medium_stomach_back_upper = stomach_average_short_medium.addOrReplaceChild("stomach_average_short_medium_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition stomach_average_short_medium_stomach_back_upper_individual = stomach_average_short_medium_stomach_back_upper.addOrReplaceChild("stomach_average_short_medium_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0399F, -1.2803F, 4.3655F));

            PartDefinition cube_r3 = stomach_average_short_medium_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(461, 395).addBox(-6.0984F, -4.2952F, -5.4096F, 6.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0984F, -3.2354F, -1.2862F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_average_short_medium_stomach_back_lower = stomach_average_short_medium_stomach_back_upper.addOrReplaceChild("stomach_average_short_medium_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(0.0399F, -0.9417F, 4.5813F));

            PartDefinition cube_r4 = stomach_average_short_medium_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(445, 395).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.3346F, -1.3597F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("short") && curve.equals("high")) {
            PartDefinition stomach_average_short_high = partdefinition.addOrReplaceChild("stomach_average_short_high", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_average_short_high_stomach_front_upper = stomach_average_short_high.addOrReplaceChild("stomach_average_short_high_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_average_short_high_stomach_front_upper_individual = stomach_average_short_high_stomach_front_upper.addOrReplaceChild("stomach_average_short_high_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0084F, -0.3856F, -0.6332F));

            PartDefinition cube_r1 = stomach_average_short_high_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(490, 393).addBox(-5.0892F, -3.2676F, -5.4648F, 6.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0892F, -3.4648F, -3.2324F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_average_short_high_stomach_front_lower = stomach_average_short_high_stomach_front_upper.addOrReplaceChild("stomach_average_short_high_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.0399F, -0.0018F, -0.5541F));

            PartDefinition cube_r2 = stomach_average_short_high_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(510, 393).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.52F, -2.26F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_average_short_high_stomach_back_upper = stomach_average_short_high.addOrReplaceChild("stomach_average_short_high_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 1.6089F));

            PartDefinition stomach_average_short_high_stomach_back_upper_individual = stomach_average_short_high_stomach_back_upper.addOrReplaceChild("stomach_average_short_high_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0399F, -0.9125F, 2.8307F));

            PartDefinition cube_r3 = stomach_average_short_high_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(508, 383).addBox(-6.0984F, -0.2952F, -5.4096F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0984F, -2.8881F, -3.2558F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_average_short_high_stomach_back_lower = stomach_average_short_high_stomach_back_upper.addOrReplaceChild("stomach_average_short_high_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(0.0399F, -0.5739F, 3.0466F));

            PartDefinition cube_r4 = stomach_average_short_high_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(492, 383).addBox(-4.08F, -0.24F, -5.52F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.9873F, -3.3293F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("average") && curve.equals("low")) {
            PartDefinition stomach_average_average_low = partdefinition.addOrReplaceChild("stomach_average_average_low", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_average_average_low_stomach_front_upper = stomach_average_average_low.addOrReplaceChild("stomach_average_average_low_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_average_average_low_stomach_front_upper_individual = stomach_average_average_low_stomach_front_upper.addOrReplaceChild("stomach_average_average_low_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0289F, -0.8856F, -0.7757F));

            PartDefinition cube_r1 = stomach_average_average_low_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(535, 398).addBox(-5.0892F, -4.2676F, -5.4648F, 6.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0892F, -2.9648F, 0.7676F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_average_average_low_stomach_front_lower = stomach_average_average_low_stomach_front_upper.addOrReplaceChild("stomach_average_average_low_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(-0.0289F, -0.5018F, -0.6966F));

            PartDefinition cube_r2 = stomach_average_average_low_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(557, 398).addBox(-4.08F, -5.24F, -5.52F, 4.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.02F, 1.74F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_average_average_low_stomach_back_upper = stomach_average_average_low.addOrReplaceChild("stomach_average_average_low_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition stomach_average_average_low_stomach_back_upper_individual = stomach_average_average_low_stomach_back_upper.addOrReplaceChild("stomach_average_average_low_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0193F, -1.5561F, 4.4928F));

            PartDefinition cube_r3 = stomach_average_average_low_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(553, 381).addBox(-6.0984F, -7.2952F, -5.4096F, 6.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0984F, -3.4959F, 0.191F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_average_average_low_stomach_back_lower = stomach_average_average_low_stomach_back_upper.addOrReplaceChild("stomach_average_average_low_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(-0.0289F, -1.1281F, 4.798F));

            PartDefinition cube_r4 = stomach_average_average_low_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(537, 381).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.595F, 0.1175F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("average") && curve.equals("medium")) {
            PartDefinition stomach_average_average_medium = partdefinition.addOrReplaceChild("stomach_average_average_medium", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_average_average_medium_stomach_front_upper = stomach_average_average_medium.addOrReplaceChild("stomach_average_average_medium_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_average_average_medium_stomach_front_upper_individual = stomach_average_average_medium_stomach_front_upper.addOrReplaceChild("stomach_average_average_medium_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0206F, -0.8856F, -0.2727F));

            PartDefinition cube_r1 = stomach_average_average_medium_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(380, 430).addBox(-5.0892F, -4.2676F, -5.4648F, 6.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0892F, -2.9648F, -0.7324F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_average_average_medium_stomach_front_lower = stomach_average_average_medium_stomach_front_upper.addOrReplaceChild("stomach_average_average_medium_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.011F, -0.5018F, -0.1936F));

            PartDefinition cube_r2 = stomach_average_average_medium_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(402, 430).addBox(-4.08F, -5.24F, -5.52F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.02F, 0.24F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_average_average_medium_stomach_back_upper = stomach_average_average_medium.addOrReplaceChild("stomach_average_average_medium_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition stomach_average_average_medium_stomach_back_upper_individual = stomach_average_average_medium_stomach_back_upper.addOrReplaceChild("stomach_average_average_medium_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0206F, -1.1909F, 4.1686F));

            PartDefinition cube_r3 = stomach_average_average_medium_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(401, 416).addBox(-6.0984F, -4.2952F, -5.4096F, 6.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0984F, -3.2354F, -1.2862F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_average_average_medium_stomach_back_lower = stomach_average_average_medium_stomach_back_upper.addOrReplaceChild("stomach_average_average_medium_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(0.011F, -0.8523F, 4.295F));

            PartDefinition cube_r4 = stomach_average_average_medium_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(385, 416).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.3346F, -1.3597F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("average") && curve.equals("high")) {
            PartDefinition stomach_average_average_high = partdefinition.addOrReplaceChild("stomach_average_average_high", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_average_average_high_stomach_front_upper = stomach_average_average_high.addOrReplaceChild("stomach_average_average_high_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_average_average_high_stomach_front_upper_individual = stomach_average_average_high_stomach_front_upper.addOrReplaceChild("stomach_average_average_high_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0084F, -0.3856F, -0.79F));

            PartDefinition cube_r1 = stomach_average_average_high_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(429, 428).addBox(-5.0892F, -3.2676F, -5.4648F, 6.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0892F, -3.4648F, -3.2324F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_average_average_high_stomach_front_lower = stomach_average_average_high_stomach_front_upper.addOrReplaceChild("stomach_average_average_high_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(-0.0495F, -0.0018F, -0.711F));

            PartDefinition cube_r2 = stomach_average_average_high_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(449, 428).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.52F, -2.26F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_average_average_high_stomach_back_upper = stomach_average_average_high.addOrReplaceChild("stomach_average_average_high_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 1.9665F));

            PartDefinition stomach_average_average_high_stomach_back_upper_individual = stomach_average_average_high_stomach_back_upper.addOrReplaceChild("stomach_average_average_high_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0495F, -0.9993F, 2.8088F));

            PartDefinition cube_r3 = stomach_average_average_high_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(447, 417).addBox(-6.0984F, -0.2952F, -5.4096F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0984F, -2.8013F, -3.7482F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_average_average_high_stomach_back_lower = stomach_average_average_high_stomach_back_upper.addOrReplaceChild("stomach_average_average_high_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(-0.0495F, -0.5713F, 2.8458F));

            PartDefinition cube_r4 = stomach_average_average_high_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(431, 417).addBox(-4.08F, -0.24F, -5.52F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.9004F, -3.8217F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("long") && curve.equals("low")) {
            PartDefinition stomach_average_long_low = partdefinition.addOrReplaceChild("stomach_average_long_low", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_average_long_low_stomach_front_upper = stomach_average_long_low.addOrReplaceChild("stomach_average_long_low_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_average_long_low_stomach_front_upper_individual = stomach_average_long_low_stomach_front_upper.addOrReplaceChild("stomach_average_long_low_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0289F, -0.8856F, -1.0219F));

            PartDefinition cube_r1 = stomach_average_long_low_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(473, 434).addBox(-5.0892F, -4.2676F, -5.4648F, 6.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0892F, -2.9648F, 0.7676F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_average_long_low_stomach_front_lower = stomach_average_long_low_stomach_front_upper.addOrReplaceChild("stomach_average_long_low_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(-0.0289F, -0.5018F, -0.9429F));

            PartDefinition cube_r2 = stomach_average_long_low_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(495, 434).addBox(-4.08F, -5.24F, -5.52F, 4.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.02F, 1.74F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_average_long_low_stomach_back_upper = stomach_average_long_low.addOrReplaceChild("stomach_average_long_low_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition stomach_average_long_low_stomach_back_upper_individual = stomach_average_long_low_stomach_back_upper.addOrReplaceChild("stomach_average_long_low_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0193F, -1.6429F, 4.739F));

            PartDefinition cube_r3 = stomach_average_long_low_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(491, 416).addBox(-6.0984F, -7.2952F, -5.4096F, 6.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0984F, -3.4091F, -0.3014F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_average_long_low_stomach_back_lower = stomach_average_long_low_stomach_back_upper.addOrReplaceChild("stomach_average_long_low_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(-0.0289F, -1.2149F, 5.0442F));

            PartDefinition cube_r4 = stomach_average_long_low_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(475, 416).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.5082F, -0.3749F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("long") && curve.equals("medium")) {
            PartDefinition stomach_average_long_medium = partdefinition.addOrReplaceChild("stomach_average_long_medium", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_average_long_medium_stomach_front_upper = stomach_average_long_medium.addOrReplaceChild("stomach_average_long_medium_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_average_long_medium_stomach_front_upper_individual = stomach_average_long_medium_stomach_front_upper.addOrReplaceChild("stomach_average_long_medium_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0084F, -0.8856F, -0.9612F));

            PartDefinition cube_r1 = stomach_average_long_medium_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(520, 431).addBox(-5.0892F, -4.2676F, -5.4648F, 6.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0892F, -2.9648F, -1.2324F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_average_long_medium_stomach_front_lower = stomach_average_long_medium_stomach_front_upper.addOrReplaceChild("stomach_average_long_medium_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.0399F, -0.5018F, -0.8822F));

            PartDefinition cube_r2 = stomach_average_long_medium_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(541, 431).addBox(-4.08F, -5.24F, -5.52F, 4.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.02F, -0.26F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_average_long_medium_stomach_back_upper = stomach_average_long_medium.addOrReplaceChild("stomach_average_long_medium_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition stomach_average_long_medium_stomach_back_upper_individual = stomach_average_long_medium_stomach_back_upper.addOrReplaceChild("stomach_average_long_medium_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0399F, -1.1909F, 4.8571F));

            PartDefinition cube_r3 = stomach_average_long_medium_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(540, 417).addBox(-6.0984F, -4.2952F, -5.4096F, 6.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0984F, -3.2354F, -1.2862F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_average_long_medium_stomach_back_lower = stomach_average_long_medium_stomach_back_upper.addOrReplaceChild("stomach_average_long_medium_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(0.0399F, -0.8523F, 4.9835F));

            PartDefinition cube_r4 = stomach_average_long_medium_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(525, 417).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.3346F, -1.3597F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("long") && curve.equals("high")) {
            PartDefinition stomach_average_long_high = partdefinition.addOrReplaceChild("stomach_average_long_high", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_average_long_high_stomach_front_upper = stomach_average_long_high.addOrReplaceChild("stomach_average_long_high_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_average_long_high_stomach_front_upper_individual = stomach_average_long_high_stomach_front_upper.addOrReplaceChild("stomach_average_long_high_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0206F, -0.3856F, -1.0316F));

            PartDefinition cube_r1 = stomach_average_long_high_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(566, 430).addBox(-5.0892F, -3.2676F, -5.4648F, 6.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0892F, -3.4648F, -3.7324F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_average_long_high_stomach_front_lower = stomach_average_long_high_stomach_front_upper.addOrReplaceChild("stomach_average_long_high_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.011F, -0.0018F, -0.9526F));

            PartDefinition cube_r2 = stomach_average_long_high_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(586, 430).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.52F, -2.76F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_average_long_high_stomach_back_upper = stomach_average_long_high.addOrReplaceChild("stomach_average_long_high_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 1.6089F));

            PartDefinition stomach_average_long_high_stomach_back_upper_individual = stomach_average_long_high_stomach_back_upper.addOrReplaceChild("stomach_average_long_high_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0206F, -0.9993F, 3.4079F));

            PartDefinition cube_r3 = stomach_average_long_high_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(584, 419).addBox(-6.0984F, -0.2952F, -5.4096F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0984F, -2.8013F, -3.7482F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_average_long_high_stomach_back_lower = stomach_average_long_high_stomach_back_upper.addOrReplaceChild("stomach_average_long_high_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(0.011F, -0.5713F, 3.445F));

            PartDefinition cube_r4 = stomach_average_long_high_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(568, 419).addBox(-4.08F, -0.24F, -5.52F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.9004F, -3.8217F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("short") && curve.equals("low")) {
            PartDefinition stomach_muscular_long_high = partdefinition.addOrReplaceChild("stomach_muscular_long_high", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_muscular_long_high_stomach_front_upper = stomach_muscular_long_high.addOrReplaceChild("stomach_muscular_long_high_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_muscular_long_high_stomach_front_upper_individual = stomach_muscular_long_high_stomach_front_upper.addOrReplaceChild("stomach_muscular_long_high_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.1051F, -0.3856F, -1.0316F));

            PartDefinition cube_r1 = stomach_muscular_long_high_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(562, 509).addBox(-6.0892F, -3.2676F, -5.4648F, 7.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5892F, -3.4648F, -3.7324F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_long_high_stomach_front_lower = stomach_muscular_long_high_stomach_front_upper.addOrReplaceChild("stomach_muscular_long_high_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.1051F, -0.0018F, -0.9526F));

            PartDefinition cube_r2 = stomach_muscular_long_high_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(584, 509).addBox(-5.08F, -4.24F, -5.52F, 5.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -3.52F, -2.76F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_long_high_stomach_back_upper = stomach_muscular_long_high.addOrReplaceChild("stomach_muscular_long_high_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_long_high_stomach_back_upper_individual = stomach_muscular_long_high_stomach_back_upper.addOrReplaceChild("stomach_muscular_long_high_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.064F, -0.9993F, 5.0169F));

            PartDefinition cube_r3 = stomach_muscular_long_high_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(582, 498).addBox(-7.0984F, -0.2952F, -5.4096F, 7.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5984F, -2.8013F, -3.7482F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_long_high_stomach_back_lower = stomach_muscular_long_high_stomach_back_upper.addOrReplaceChild("stomach_muscular_long_high_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(0.0158F, -0.5713F, 5.0539F));

            PartDefinition cube_r4 = stomach_muscular_long_high_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(564, 498).addBox(-5.08F, -0.24F, -5.52F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.9004F, -3.8217F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("short") && curve.equals("medium")) {
            PartDefinition stomach_muscular_long_medium = partdefinition.addOrReplaceChild("stomach_muscular_long_medium", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_muscular_long_medium_stomach_front_upper = stomach_muscular_long_medium.addOrReplaceChild("stomach_muscular_long_medium_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_muscular_long_medium_stomach_front_upper_individual = stomach_muscular_long_medium_stomach_front_upper.addOrReplaceChild("stomach_muscular_long_medium_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0206F, -0.8856F, -0.9099F));

            PartDefinition cube_r1 = stomach_muscular_long_medium_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(513, 510).addBox(-6.0892F, -4.2676F, -5.4648F, 7.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5892F, -2.9648F, -1.2324F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_long_medium_stomach_front_lower = stomach_muscular_long_medium_stomach_front_upper.addOrReplaceChild("stomach_muscular_long_medium_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.011F, -0.5018F, -0.8309F));

            PartDefinition cube_r2 = stomach_muscular_long_medium_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(537, 510).addBox(-5.08F, -5.24F, -5.52F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -3.02F, -0.26F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_long_medium_stomach_back_upper = stomach_muscular_long_medium.addOrReplaceChild("stomach_muscular_long_medium_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_long_medium_stomach_back_upper_individual = stomach_muscular_long_medium_stomach_back_upper.addOrReplaceChild("stomach_muscular_long_medium_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0206F, -1.1909F, 4.9084F));

            PartDefinition cube_r3 = stomach_muscular_long_medium_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(536, 496).addBox(-7.0984F, -4.2952F, -5.4096F, 7.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5984F, -3.2354F, -1.2862F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_long_medium_stomach_back_lower = stomach_muscular_long_medium_stomach_back_upper.addOrReplaceChild("stomach_muscular_long_medium_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(-0.0135F, -0.8548F, 4.9323F));

            PartDefinition cube_r4 = stomach_muscular_long_medium_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(518, 496).addBox(-5.0792F, -4.2976F, -5.4648F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5792F, -3.2902F, -1.2934F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("short") && curve.equals("high")) {
            PartDefinition stomach_muscular_long_low = partdefinition.addOrReplaceChild("stomach_muscular_long_low", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_muscular_long_low_stomach_front_upper = stomach_muscular_long_low.addOrReplaceChild("stomach_muscular_long_low_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_muscular_long_low_stomach_front_upper_individual = stomach_muscular_long_low_stomach_front_upper.addOrReplaceChild("stomach_muscular_long_low_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0084F, -0.8856F, -1.0219F));

            PartDefinition cube_r1 = stomach_muscular_long_low_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(464, 513).addBox(-6.0892F, -4.2676F, -5.4648F, 7.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5892F, -2.9648F, 0.7676F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_long_low_stomach_front_lower = stomach_muscular_long_low_stomach_front_upper.addOrReplaceChild("stomach_muscular_long_low_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(-0.0495F, -0.5018F, -0.9429F));

            PartDefinition cube_r2 = stomach_muscular_long_low_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(488, 513).addBox(-5.08F, -5.24F, -5.52F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -3.02F, 1.74F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_long_low_stomach_back_upper = stomach_muscular_long_low.addOrReplaceChild("stomach_muscular_long_low_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_long_low_stomach_back_upper_individual = stomach_muscular_long_low_stomach_back_upper.addOrReplaceChild("stomach_muscular_long_low_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0495F, -1.6429F, 4.739F));

            PartDefinition cube_r3 = stomach_muscular_long_low_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(484, 495).addBox(-7.0984F, -7.2952F, -5.4096F, 7.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5984F, -3.4091F, -0.3014F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_long_low_stomach_back_lower = stomach_muscular_long_low_stomach_back_upper.addOrReplaceChild("stomach_muscular_long_low_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(-0.0495F, -1.2149F, 5.0442F));

            PartDefinition cube_r4 = stomach_muscular_long_low_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(466, 495).addBox(-5.08F, -7.24F, -5.52F, 5.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -3.5082F, -0.3749F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("average") && curve.equals("low")) {
            PartDefinition stomach_muscular_average_high = partdefinition.addOrReplaceChild("stomach_muscular_average_high", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_muscular_average_high_stomach_front_upper = stomach_muscular_average_high.addOrReplaceChild("stomach_muscular_average_high_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_muscular_average_high_stomach_front_upper_individual = stomach_muscular_average_high_stomach_front_upper.addOrReplaceChild("stomach_muscular_average_high_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0289F, -0.3856F, -0.79F));

            PartDefinition cube_r1 = stomach_muscular_average_high_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(418, 508).addBox(-6.0892F, -3.2676F, -5.4648F, 7.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5892F, -3.4648F, -3.2324F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_average_high_stomach_front_lower = stomach_muscular_average_high_stomach_front_upper.addOrReplaceChild("stomach_muscular_average_high_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(-0.0289F, -0.0018F, -0.711F));

            PartDefinition cube_r2 = stomach_muscular_average_high_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(440, 508).addBox(-5.08F, -4.24F, -5.52F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -3.52F, -2.26F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_average_high_stomach_back_upper = stomach_muscular_average_high.addOrReplaceChild("stomach_muscular_average_high_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_average_high_stomach_back_upper_individual = stomach_muscular_average_high_stomach_back_upper.addOrReplaceChild("stomach_muscular_average_high_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0193F, -0.9993F, 4.7753F));

            PartDefinition cube_r3 = stomach_muscular_average_high_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(438, 497).addBox(-7.0984F, -0.2952F, -5.4096F, 7.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5984F, -2.8013F, -3.7482F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_average_high_stomach_back_lower = stomach_muscular_average_high_stomach_back_upper.addOrReplaceChild("stomach_muscular_average_high_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(-0.0289F, -0.5713F, 4.8123F));

            PartDefinition cube_r4 = stomach_muscular_average_high_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(420, 497).addBox(-5.08F, -0.24F, -5.52F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.9004F, -3.8217F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("average") && curve.equals("medium")) {
            PartDefinition stomach_muscular_average_medium = partdefinition.addOrReplaceChild("stomach_muscular_average_medium", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_muscular_average_medium_stomach_front_upper = stomach_muscular_average_medium.addOrReplaceChild("stomach_muscular_average_medium_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_muscular_average_medium_stomach_front_upper_individual = stomach_muscular_average_medium_stomach_front_upper.addOrReplaceChild("stomach_muscular_average_medium_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0392F, -0.8856F, -0.7133F));

            PartDefinition cube_r1 = stomach_muscular_average_medium_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(368, 510).addBox(-6.0892F, -4.2676F, -5.4648F, 7.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5892F, -2.9648F, -0.7324F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_average_medium_stomach_front_lower = stomach_muscular_average_medium_stomach_front_upper.addOrReplaceChild("stomach_muscular_average_medium_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(-0.0186F, -0.5018F, -0.6343F));

            PartDefinition cube_r2 = stomach_muscular_average_medium_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(392, 510).addBox(-5.08F, -5.24F, -5.52F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -3.02F, 0.24F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_average_medium_stomach_back_upper = stomach_muscular_average_medium.addOrReplaceChild("stomach_muscular_average_medium_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_average_medium_stomach_back_upper_individual = stomach_muscular_average_medium_stomach_back_upper.addOrReplaceChild("stomach_muscular_average_medium_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0392F, -1.19F, 4.6167F));

            PartDefinition cube_r3 = stomach_muscular_average_medium_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(391, 496).addBox(-7.0974F, -4.3522F, -5.3555F, 7.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5974F, -3.192F, -1.2206F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_average_medium_stomach_back_lower = stomach_muscular_average_medium_stomach_back_upper.addOrReplaceChild("stomach_muscular_average_medium_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(-0.0387F, -0.8548F, 4.7357F));

            PartDefinition cube_r4 = stomach_muscular_average_medium_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(373, 496).addBox(-5.0792F, -4.2976F, -5.4648F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5792F, -3.2902F, -1.2934F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("average") && curve.equals("high")) {
            PartDefinition stomach_muscular_average_low = partdefinition.addOrReplaceChild("stomach_muscular_average_low", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_muscular_average_low_stomach_front_upper = stomach_muscular_average_low.addOrReplaceChild("stomach_muscular_average_low_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_muscular_average_low_stomach_front_upper_individual = stomach_muscular_average_low_stomach_front_upper.addOrReplaceChild("stomach_muscular_average_low_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0363F, -0.8856F, -0.7757F));

            PartDefinition cube_r1 = stomach_muscular_average_low_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(532, 478).addBox(-6.0892F, -4.2676F, -5.4648F, 7.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5892F, -2.9648F, 0.7676F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_average_low_stomach_front_lower = stomach_muscular_average_low_stomach_front_upper.addOrReplaceChild("stomach_muscular_average_low_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.0846F, -0.5018F, -0.6966F));

            PartDefinition cube_r2 = stomach_muscular_average_low_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(556, 478).addBox(-5.08F, -5.24F, -5.52F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -3.02F, 1.74F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_average_low_stomach_back_upper = stomach_muscular_average_low.addOrReplaceChild("stomach_muscular_average_low_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_average_low_stomach_back_upper_individual = stomach_muscular_average_low_stomach_back_upper.addOrReplaceChild("stomach_muscular_average_low_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0846F, -1.5561F, 4.4928F));

            PartDefinition cube_r3 = stomach_muscular_average_low_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(552, 461).addBox(-7.0984F, -7.2952F, -5.4096F, 7.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5984F, -3.4959F, 0.191F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_average_low_stomach_back_lower = stomach_muscular_average_low_stomach_back_upper.addOrReplaceChild("stomach_muscular_average_low_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(0.0846F, -1.1281F, 4.798F));

            PartDefinition cube_r4 = stomach_muscular_average_low_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(534, 461).addBox(-5.08F, -7.24F, -5.52F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -3.595F, 0.1175F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("long") && curve.equals("low")) {
            PartDefinition stomach_muscular_short_high = partdefinition.addOrReplaceChild("stomach_muscular_short_high", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_muscular_short_high_stomach_front_upper = stomach_muscular_short_high.addOrReplaceChild("stomach_muscular_short_high_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_muscular_short_high_stomach_front_upper_individual = stomach_muscular_short_high_stomach_front_upper.addOrReplaceChild("stomach_muscular_short_high_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0084F, -0.3856F, -0.5885F));

            PartDefinition cube_r1 = stomach_muscular_short_high_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(485, 473).addBox(-6.0892F, -3.2676F, -5.4648F, 7.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5892F, -3.4648F, -3.2324F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_short_high_stomach_front_lower = stomach_muscular_short_high_stomach_front_upper.addOrReplaceChild("stomach_muscular_short_high_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(-0.0495F, -0.0018F, -0.5094F));

            PartDefinition cube_r2 = stomach_muscular_short_high_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(507, 473).addBox(-5.08F, -4.24F, -5.52F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -3.52F, -2.26F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_short_high_stomach_back_upper = stomach_muscular_short_high.addOrReplaceChild("stomach_muscular_short_high_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 3.2F));

            PartDefinition stomach_muscular_short_high_stomach_back_upper_individual = stomach_muscular_short_high_stomach_back_upper.addOrReplaceChild("stomach_muscular_short_high_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0495F, -0.9125F, 1.2844F));

            PartDefinition cube_r3 = stomach_muscular_short_high_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(505, 463).addBox(-7.0984F, -0.2952F, -5.4096F, 7.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5984F, -2.8881F, -3.2558F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_short_high_stomach_back_lower = stomach_muscular_short_high_stomach_back_upper.addOrReplaceChild("stomach_muscular_short_high_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(-0.0495F, -0.4845F, 1.4108F));

            PartDefinition cube_r4 = stomach_muscular_short_high_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(487, 463).addBox(-5.08F, -0.24F, -5.52F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.9873F, -3.3293F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("long") && curve.equals("medium")) {
            PartDefinition stomach_muscular_short_low = partdefinition.addOrReplaceChild("stomach_muscular_short_low", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_muscular_short_low_stomach_front_upper = stomach_muscular_short_low.addOrReplaceChild("stomach_muscular_short_low_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_muscular_short_low_stomach_front_upper_individual = stomach_muscular_short_low_stomach_front_upper.addOrReplaceChild("stomach_muscular_short_low_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0289F, -0.8856F, -0.5257F));

            PartDefinition cube_r1 = stomach_muscular_short_low_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(389, 479).addBox(-6.0892F, -3.2676F, -5.4648F, 7.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5892F, -2.9648F, 0.2676F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_short_low_stomach_front_lower = stomach_muscular_short_low_stomach_front_upper.addOrReplaceChild("stomach_muscular_short_low_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(-0.0289F, -0.5018F, -0.4466F));

            PartDefinition cube_r2 = stomach_muscular_short_low_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(413, 479).addBox(-5.08F, -4.24F, -5.52F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -3.02F, 1.24F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_short_low_stomach_back_upper = stomach_muscular_short_low.addOrReplaceChild("stomach_muscular_short_low_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_short_low_stomach_back_upper_individual = stomach_muscular_short_low_stomach_back_upper.addOrReplaceChild("stomach_muscular_short_low_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0193F, -1.4667F, 4.3322F));

            PartDefinition cube_r3 = stomach_muscular_short_low_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(409, 462).addBox(-7.0984F, -7.2952F, -5.4096F, 7.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5984F, -3.4959F, 0.191F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_short_low_stomach_back_lower = stomach_muscular_short_low_stomach_back_upper.addOrReplaceChild("stomach_muscular_short_low_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(-0.0289F, -1.1281F, 4.548F));

            PartDefinition cube_r4 = stomach_muscular_short_low_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(391, 462).addBox(-5.08F, -7.24F, -5.52F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -3.595F, 0.1175F, 1.7453F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("long") && curve.equals("high")) {
            PartDefinition stomach_muscular_short_medium = partdefinition.addOrReplaceChild("stomach_muscular_short_medium", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition stomach_muscular_short_medium_stomach_front_upper = stomach_muscular_short_medium.addOrReplaceChild("stomach_muscular_short_medium_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

            PartDefinition stomach_muscular_short_medium_stomach_front_upper_individual = stomach_muscular_short_medium_stomach_front_upper.addOrReplaceChild("stomach_muscular_short_medium_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0084F, -0.8856F, -0.559F));

            PartDefinition cube_r1 = stomach_muscular_short_medium_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(437, 462).addBox(-6.0892F, -3.2676F, -5.4648F, 7.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5892F, -2.9648F, -1.2324F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_short_medium_stomach_front_lower = stomach_muscular_short_medium_stomach_front_upper.addOrReplaceChild("stomach_muscular_short_medium_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.0399F, -0.5018F, -0.4799F));

            PartDefinition cube_r2 = stomach_muscular_short_medium_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(461, 462).addBox(-5.08F, -4.24F, -5.52F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -3.02F, -0.26F, 1.5708F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_short_medium_stomach_back_upper = stomach_muscular_short_medium.addOrReplaceChild("stomach_muscular_short_medium_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_short_medium_stomach_back_upper_individual = stomach_muscular_short_medium_stomach_back_upper.addOrReplaceChild("stomach_muscular_short_medium_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0399F, -1.2803F, 4.3655F));

            PartDefinition cube_r3 = stomach_muscular_short_medium_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(457, 476).addBox(-7.0984F, -4.2952F, -5.4096F, 7.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5984F, -3.2354F, -1.2862F, 1.7453F, 0.0F, 0.0F));

            PartDefinition stomach_muscular_short_medium_stomach_back_lower = stomach_muscular_short_medium_stomach_back_upper.addOrReplaceChild("stomach_muscular_short_medium_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(0.0399F, -0.9417F, 4.5813F));

            PartDefinition cube_r4 = stomach_muscular_short_medium_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(439, 476).addBox(-5.08F, -4.24F, -5.52F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -3.3346F, -1.3597F, 1.7453F, 0.0F, 0.0F));

        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Stomach / " + muscleMass + " / " + length +  " /Curve "  + curve + ", Cancelling Generation...");
        }
        allParts.add("stomach_" + muscleMass + "_" + length + "_" + curve);
        return partdefinition;
    }

    public static PartDefinition GenerateAll(PartDefinition root){
        List<String> muscleMass = List.of("lean", "average", "muscular");
        List<String> length = List.of("short", "average", "long");
        List<String> curve = List.of("low", "medium", "high");

        for(String variable1 : muscleMass){
            for(String variable2 : length){
                for(String variable3 : curve) {
                    root = Generate(root, variable1, variable2, variable3);
                }
            }
        }
        return root;
    }
}
