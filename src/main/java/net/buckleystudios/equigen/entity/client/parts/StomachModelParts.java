package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class StomachModelParts {
    public static PartDefinition Generate(PartDefinition root, String muscleMass, String curve, String length) {
        if (muscleMass.equals("lean") && curve.equals("short") && length.equals("low")) {
            PartDefinition stomach_lean_short_low = root.addOrReplaceChild("stomach_lean_short_low", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_lean_short_low.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(439, 106).addBox(-4.0792F, -7.2976F, -5.4648F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2088F, -4.6759F, 6.3357F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_lean_short_low.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(455, 106).addBox(-5.0984F, -7.2952F, -5.4096F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7228F, -4.9626F, 6.2574F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_lean_short_low.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(458, 123).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_lean_short_low.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(438, 123).addBox(-4.0892F, -3.2676F, -5.4648F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7618F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && curve.equals("short") && length.equals("medium")) {
            PartDefinition stomach_lean_short_medium = root.addOrReplaceChild("stomach_lean_short_medium", CubeListBuilder.create(), PartPose.offset(-0.8045F, 4.9162F, 2.7709F));

            PartDefinition cube_r1 = stomach_lean_short_medium.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(478, 116).addBox(-4.0792F, -4.2976F, -5.4648F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2088F, -4.1449F, 6.4241F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r2 = stomach_lean_short_medium.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(494, 116).addBox(-5.0984F, -4.2952F, -5.4096F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7228F, -4.4263F, 6.3467F, 1.7453F, 0.0F, 0.0F));

            PartDefinition cube_r3 = stomach_lean_short_medium.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(494, 130).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -3.5218F, -1.4055F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = stomach_lean_short_medium.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(474, 130).addBox(-4.0892F, -3.2676F, -5.4648F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7618F, -3.8504F, -2.4569F, 1.5708F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && curve.equals("short") && length.equals("high")) {

        } else if (muscleMass.equals("lean") && curve.equals("average") && length.equals("low")) {

        } else if (muscleMass.equals("lean") && curve.equals("average") && length.equals("medium")) {

        } else if (muscleMass.equals("lean") && curve.equals("average") && length.equals("high")) {

        } else if (muscleMass.equals("lean") && curve.equals("long") && length.equals("low")) {

        } else if (muscleMass.equals("lean") && curve.equals("long") && length.equals("medium")) {

        } else if (muscleMass.equals("lean") && curve.equals("long") && length.equals("high")) {

        } else if (muscleMass.equals("average") && curve.equals("short") && length.equals("low")) {

        } else if (muscleMass.equals("average") && curve.equals("short") && length.equals("medium")) {

        } else if (muscleMass.equals("average") && curve.equals("short") && length.equals("high")) {

        } else if (muscleMass.equals("average") && curve.equals("average") && length.equals("low")) {

        } else if (muscleMass.equals("average") && curve.equals("average") && length.equals("medium")) {

        } else if (muscleMass.equals("average") && curve.equals("average") && length.equals("high")) {

        } else if (muscleMass.equals("average") && curve.equals("long") && length.equals("low")) {

        } else if (muscleMass.equals("average") && curve.equals("long") && length.equals("medium")) {

        } else if (muscleMass.equals("average") && curve.equals("long") && length.equals("high")) {

        } else if (muscleMass.equals("muscular") && curve.equals("short") && length.equals("low")) {

        } else if (muscleMass.equals("muscular") && curve.equals("short") && length.equals("medium")) {

        } else if (muscleMass.equals("muscular") && curve.equals("short") && length.equals("high")) {

        } else if (muscleMass.equals("muscular") && curve.equals("average") && length.equals("low")) {

        } else if (muscleMass.equals("muscular") && curve.equals("average") && length.equals("medium")) {

        } else if (muscleMass.equals("muscular") && curve.equals("average") && length.equals("high")) {

        } else if (muscleMass.equals("muscular") && curve.equals("long") && length.equals("low")) {

        } else if (muscleMass.equals("muscular") && curve.equals("long") && length.equals("medium")) {

        } else if (muscleMass.equals("muscular") && curve.equals("long") && length.equals("high")) {

        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Stomach / " + muscleMass + " / " + curve +  " / "  + length + ", Returning Null Value");
            return null;
        }
        return root;
    }
}
