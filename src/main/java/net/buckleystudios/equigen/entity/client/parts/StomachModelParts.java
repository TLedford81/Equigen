package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class StomachModelParts {
    public static PartDefinition Generate(PartDefinition root, String muscleMass, String curve, String length) {
        if (muscleMass.equals("lean") && length.equals("short") && curve.equals("low")) {
            PartDefinition stomach_lean_short_low = root.addOrReplaceChild("stomach_lean_short_low", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_lean_short_low.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(439, 106).addBox(-4.0792F, -7.2976F, -5.4648F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2088F, -4.6759F, 6.3357F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_lean_short_low.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(455, 106).addBox(-5.0984F, -7.2952F, -5.4096F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7228F, -4.9626F, 6.2574F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_lean_short_low.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(458, 123).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_lean_short_low.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(438, 123).addBox(-4.0892F, -3.2676F, -5.4648F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7618F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && length.equals("short") && curve.equals("medium")) {
            PartDefinition stomach_lean_short_medium = root.addOrReplaceChild("stomach_lean_short_medium", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_lean_short_medium.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(478, 116).addBox(-4.0792F, -4.2976F, -5.4648F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2088F, -4.1449F, 6.4241F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_lean_short_medium.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(494, 116).addBox(-5.0984F, -4.2952F, -5.4096F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7228F, -4.4263F, 6.3467F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_lean_short_medium.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(494, 130).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_lean_short_medium.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(474, 130).addBox(-4.0892F, -3.2676F, -5.4648F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7618F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && length.equals("short") && curve.equals("high")) {
            PartDefinition stomach_lean_short_high = root.addOrReplaceChild("stomach_lean_short_high", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_lean_short_high.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(187, 117).addBox(-4.0792F, -0.2976F, -5.4648F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2088F, -3.437F, 6.4241F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_lean_short_high.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(203, 117).addBox(-5.0984F, -0.2952F, -5.4096F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7228F, -3.7112F, 6.3467F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_lean_short_high.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(204, 127).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_lean_short_high.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(186, 127).addBox(-4.0892F, -3.2676F, -5.4648F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7618F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && length.equals("average") && curve.equals("low")) {
            PartDefinition stomach_lean_average_low = root.addOrReplaceChild("stomach_lean_average_low", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_lean_average_low.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(223, 119).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -4.7231F, 6.489F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_lean_average_low.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(239, 119).addBox(-5.0984F, -7.2952F, -5.4096F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7228F, -5.052F, 6.2574F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_lean_average_low.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(242, 136).addBox(-4.08F, -5.24F, -5.52F, 4.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_lean_average_low.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(222, 136).addBox(-4.0892F, -4.2676F, -5.4648F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7618F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && length.equals("average") && curve.equals("medium")) {
            PartDefinition stomach_lean_average_medium = root.addOrReplaceChild("stomach_lean_average_medium", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_lean_average_medium.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(266, 124).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -4.1868F, 5.5058F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_lean_average_medium.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(282, 124).addBox(-5.0984F, -4.2952F, -5.4096F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7228F, -4.4263F, 5.4529F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_lean_average_medium.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(282, 138).addBox(-4.08F, -5.24F, -5.52F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_lean_average_medium.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(262, 138).addBox(-4.0892F, -4.2676F, -5.4648F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7618F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && length.equals("average") && curve.equals("high")) {
            PartDefinition stomach_lean_average_high = root.addOrReplaceChild("stomach_lean_average_high", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_lean_average_high.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(302, 129).addBox(-4.08F, -0.24F, -5.52F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.4717F, 6.5784F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_lean_average_high.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(318, 129).addBox(-5.0984F, -0.2952F, -5.4096F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7228F, -3.8006F, 6.6149F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_lean_average_high.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(319, 140).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_lean_average_high.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(301, 140).addBox(-4.0892F, -3.2676F, -5.4648F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7618F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && length.equals("long") && curve.equals("low")) {
            PartDefinition stomach_lean_long_low = root.addOrReplaceChild("stomach_lean_long_low", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_lean_long_low.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(339, 130).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -4.7231F, 6.489F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_lean_long_low.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(355, 130).addBox(-5.0984F, -7.2952F, -5.4096F, 5.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7228F, -5.052F, 6.2574F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_lean_long_low.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(358, 148).addBox(-4.08F, -5.24F, -5.52F, 4.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_lean_long_low.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(338, 148).addBox(-4.0892F, -4.2676F, -5.4648F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7618F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && length.equals("long") && curve.equals("medium")) {

            PartDefinition stomach_lean_long_medium = root.addOrReplaceChild("stomach_lean_long_medium", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_lean_long_medium.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(382, 132).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -4.1868F, 7.3829F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_lean_long_medium.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(398, 132).addBox(-5.0984F, -4.2952F, -5.4096F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7228F, -4.4263F, 7.33F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_lean_long_medium.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(398, 146).addBox(-4.08F, -5.24F, -5.52F, 4.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_lean_long_medium.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(378, 146).addBox(-4.0892F, -4.2676F, -5.4648F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7618F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && length.equals("long") && curve.equals("high")) {
            PartDefinition stomach_lean_long_high = root.addOrReplaceChild("stomach_lean_long_high", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_lean_long_high.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(420, 135).addBox(-4.08F, -0.24F, -5.52F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.4717F, 7.5617F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_lean_long_high.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(436, 135).addBox(-5.0984F, -0.2952F, -5.4096F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7228F, -3.8006F, 7.5981F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_lean_long_high.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(437, 146).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_lean_long_high.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(419, 146).addBox(-4.0892F, -3.2676F, -5.4648F, 5.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7618F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("short") && curve.equals("low")) {
            PartDefinition stomach_average_short_low = root.addOrReplaceChild("stomach_average_short_low", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_average_short_low.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(457, 145).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -4.7231F, 6.489F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_average_short_low.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(473, 145).addBox(-6.0984F, -7.2952F, -5.4096F, 6.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3485F, -4.9626F, 6.3467F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_average_short_low.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(477, 162).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_average_short_low.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(455, 162).addBox(-5.0892F, -3.2676F, -5.4648F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2981F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("short") && curve.equals("medium")) {

            PartDefinition stomach_average_short_medium = root.addOrReplaceChild("stomach_average_short_medium", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_average_short_medium.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(185, 161).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -4.2762F, 6.5784F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_average_short_medium.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(201, 161).addBox(-6.0984F, -4.2952F, -5.4096F, 6.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1697F, -4.5157F, 6.4361F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_average_short_medium.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(205, 147).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_average_short_medium.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(183, 147).addBox(-5.0892F, -3.2676F, -5.4648F, 6.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2088F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("short") && curve.equals("high")) {
            PartDefinition stomach_average_short_high = root.addOrReplaceChild("stomach_average_short_high", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_average_short_high.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(226, 149).addBox(-4.08F, -0.24F, -5.52F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.5611F, 6.7572F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_average_short_high.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(242, 149).addBox(-6.0984F, -0.2952F, -5.4096F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1697F, -3.8006F, 6.6149F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_average_short_high.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(244, 159).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_average_short_high.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(224, 159).addBox(-5.0892F, -3.2676F, -5.4648F, 6.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2088F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("average") && curve.equals("low")) {
            PartDefinition stomach_average_average_low = root.addOrReplaceChild("stomach_average_average_low", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_average_average_low.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(263, 155).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -4.7231F, 6.489F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_average_average_low.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(279, 155).addBox(-6.0984F, -7.2952F, -5.4096F, 6.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2591F, -5.052F, 6.2574F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_average_average_low.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(283, 172).addBox(-4.08F, -5.24F, -5.52F, 4.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_average_average_low.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(261, 172).addBox(-5.0892F, -4.2676F, -5.4648F, 6.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2981F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("average") && curve.equals("medium")) {
            PartDefinition stomach_average_average_medium = root.addOrReplaceChild("stomach_average_average_medium", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_average_average_medium.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(307, 161).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -4.1868F, 5.5058F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_average_average_medium.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(323, 161).addBox(-6.0984F, -4.2952F, -5.4096F, 6.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2591F, -4.4263F, 5.4529F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_average_average_medium.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(324, 175).addBox(-4.08F, -5.24F, -5.52F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_average_average_medium.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(302, 175).addBox(-5.0892F, -4.2676F, -5.4648F, 6.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2088F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("average") && curve.equals("high")) {
            PartDefinition stomach_average_average_high = root.addOrReplaceChild("stomach_average_average_high", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_average_average_high.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(346, 163).addBox(-4.08F, -0.24F, -5.52F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.4717F, 6.5784F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_average_average_high.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(362, 163).addBox(-6.0984F, -0.2952F, -5.4096F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3485F, -3.8006F, 6.6149F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_average_average_high.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(364, 174).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_average_average_high.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(344, 174).addBox(-5.0892F, -3.2676F, -5.4648F, 6.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2981F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("long") && curve.equals("low")) {
            PartDefinition stomach_average_long_low = root.addOrReplaceChild("stomach_average_long_low", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_average_long_low.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(385, 164).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -4.7231F, 6.489F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_average_long_low.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(401, 164).addBox(-6.0984F, -7.2952F, -5.4096F, 6.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2591F, -5.052F, 6.2574F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_average_long_low.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(405, 182).addBox(-4.08F, -5.24F, -5.52F, 4.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_average_long_low.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(383, 182).addBox(-5.0892F, -4.2676F, -5.4648F, 6.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2981F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("long") && curve.equals("medium")) {
            PartDefinition stomach = root.addOrReplaceChild("stomach", CubeListBuilder.create(), PartPose.offset(0.6933F, 19.0838F, -6.53F));

            PartDefinition stomach_average_long_medium = stomach.addOrReplaceChild("stomach_average_long_medium", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_average_long_medium.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(428, 174).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -4.1868F, 7.3829F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_average_long_medium.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(443, 174).addBox(-6.0984F, -4.2952F, -5.4096F, 6.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1697F, -4.4263F, 7.33F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_average_long_medium.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(444, 188).addBox(-4.08F, -5.24F, -5.52F, 4.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_average_long_medium.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(423, 188).addBox(-5.0892F, -4.2676F, -5.4648F, 6.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2088F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && length.equals("long") && curve.equals("high")) {
            PartDefinition stomach_average_long_high = root.addOrReplaceChild("stomach_average_long_high", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_average_long_high.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(466, 175).addBox(-4.08F, -0.24F, -5.52F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.4717F, 7.5617F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_average_long_high.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(482, 175).addBox(-6.0984F, -0.2952F, -5.4096F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2591F, -3.8006F, 7.5981F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_average_long_high.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(484, 186).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_average_long_high.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(464, 186).addBox(-5.0892F, -3.2676F, -5.4648F, 6.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2088F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("short") && curve.equals("low")) {
            PartDefinition stomach_muscular_short_low = root.addOrReplaceChild("stomach_muscular_short_low", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_muscular_short_low.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(204, 180).addBox(-5.08F, -7.24F, -5.52F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8568F, -4.7231F, 6.489F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_muscular_short_low.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(222, 180).addBox(-7.0984F, -7.2952F, -5.4096F, 7.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8848F, -4.9626F, 6.3467F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_muscular_short_low.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(226, 197).addBox(-5.08F, -4.24F, -5.52F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8568F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_muscular_short_low.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(202, 197).addBox(-6.0892F, -3.2676F, -5.4648F, 7.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9238F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("short") && curve.equals("medium")) {
            PartDefinition stomach_muscular_short_medium = root.addOrReplaceChild("stomach_muscular_short_medium", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_muscular_short_medium.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(249, 201).addBox(-5.08F, -4.24F, -5.52F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.678F, -4.2762F, 6.5784F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_muscular_short_medium.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(267, 201).addBox(-7.0984F, -4.2952F, -5.4096F, 7.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6166F, -4.5157F, 6.4361F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_muscular_short_medium.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(271, 187).addBox(-5.08F, -4.24F, -5.52F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.678F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_muscular_short_medium.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(247, 187).addBox(-6.0892F, -3.2676F, -5.4648F, 7.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6557F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("short") && curve.equals("high")) {
            PartDefinition stomach_muscular_short_high = root.addOrReplaceChild("stomach_muscular_short_high", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_muscular_short_high.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(293, 191).addBox(-5.08F, -0.24F, -5.52F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5886F, -3.4717F, 6.6678F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_muscular_short_high.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(311, 191).addBox(-7.0984F, -0.2952F, -5.4096F, 7.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.706F, -3.8006F, 6.6149F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_muscular_short_high.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(313, 201).addBox(-5.08F, -4.24F, -5.52F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5886F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_muscular_short_high.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(291, 201).addBox(-6.0892F, -3.2676F, -5.4648F, 7.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6557F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("average") && curve.equals("low")) {
            PartDefinition stomach_muscular_average_low = root.addOrReplaceChild("stomach_muscular_average_low", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_muscular_average_low.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(335, 194).addBox(-5.08F, -7.24F, -5.52F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9461F, -4.7231F, 6.489F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_muscular_average_low.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(353, 194).addBox(-7.0984F, -7.2952F, -5.4096F, 7.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7954F, -5.052F, 6.2574F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_muscular_average_low.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(357, 211).addBox(-5.08F, -5.24F, -5.52F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9461F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_muscular_average_low.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(333, 211).addBox(-6.0892F, -4.2676F, -5.4648F, 7.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8344F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("average") && curve.equals("medium")) {
            PartDefinition stomach_muscular_average_medium = root.addOrReplaceChild("stomach_muscular_average_medium", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_muscular_average_medium.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(382, 196).addBox(-5.0792F, -4.2976F, -5.4648F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6571F, -4.1449F, 6.4534F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_muscular_average_medium.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(400, 196).addBox(-7.0974F, -4.3522F, -5.3555F, 7.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6748F, -4.382F, 6.4073F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_muscular_average_medium.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(401, 210).addBox(-5.08F, -5.24F, -5.52F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.678F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_muscular_average_medium.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(377, 210).addBox(-6.0892F, -4.2676F, -5.4648F, 7.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7451F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("average") && curve.equals("high")) {
            PartDefinition stomach_muscular_average_high = root.addOrReplaceChild("stomach_muscular_average_high", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_muscular_average_high.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(426, 205).addBox(-5.08F, -0.24F, -5.52F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7674F, -3.4717F, 6.5784F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_muscular_average_high.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(444, 205).addBox(-7.0984F, -0.2952F, -5.4096F, 7.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7954F, -3.8006F, 6.6149F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_muscular_average_high.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(446, 216).addBox(-5.08F, -4.24F, -5.52F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7674F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_muscular_average_high.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(424, 216).addBox(-6.0892F, -3.2676F, -5.4648F, 7.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8344F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("long") && curve.equals("low")) {
            PartDefinition stomach_muscular_long_low = root.addOrReplaceChild("stomach_muscular_long_low", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_muscular_long_low.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(470, 206).addBox(-5.08F, -7.24F, -5.52F, 5.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7674F, -4.7231F, 6.489F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_muscular_long_low.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(488, 206).addBox(-7.0984F, -7.2952F, -5.4096F, 7.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8848F, -5.052F, 6.2574F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_muscular_long_low.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(492, 224).addBox(-5.08F, -5.24F, -5.52F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7674F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_muscular_long_low.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(468, 224).addBox(-6.0892F, -4.2676F, -5.4648F, 7.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8344F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && length.equals("long") && curve.equals("medium")) {
            PartDefinition stomach_muscular_long_medium = root.addOrReplaceChild("stomach_muscular_long_medium", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_muscular_long_medium.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(204, 212).addBox(-5.0792F, -4.2976F, -5.4648F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6527F, -4.1449F, 7.3466F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_muscular_long_medium.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(222, 212).addBox(-7.0984F, -4.2952F, -5.4096F, 7.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.706F, -4.4263F, 7.33F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_muscular_long_medium.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(223, 226).addBox(-5.08F, -5.24F, -5.52F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.678F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_muscular_long_medium.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(199, 226).addBox(-6.0892F, -4.2676F, -5.4648F, 7.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6557F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));


        } else if (muscleMass.equals("muscular") && length.equals("long") && curve.equals("high")) {
            PartDefinition stomach_muscular_long_high = root.addOrReplaceChild("stomach_muscular_long_high", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_muscular_long_high.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(247, 217).mirror().addBox(-5.08F, -0.24F, -5.52F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.7674F, -3.4717F, 7.5617F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_muscular_long_high.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(265, 217).mirror().addBox(-7.0984F, -0.2952F, -5.4096F, 7.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.706F, -3.8006F, 7.5981F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_muscular_long_high.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(267, 228).mirror().addBox(-5.08F, -4.24F, -5.52F, 5.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.8568F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_muscular_long_high.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(245, 228).mirror().addBox(-6.0892F, -3.2676F, -5.4648F, 7.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.6557F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Stomach / " + muscleMass + " / " + length +  " /Curve "  + curve + ", Returning Null Value");
            return null;
        }
        return root;
    }
}
