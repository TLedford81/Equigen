package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

import java.util.List;

public class TailModelParts {
    public static PartDefinition Generate(PartDefinition rootTail, String thickness, String length) {
        if (thickness.equals("thin") && length.equals("short")) {

            PartDefinition tail_connector_thin_short = rootTail.addOrReplaceChild("tail_connector_thin_short", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.5922F));

            PartDefinition cube_r1 = tail_connector_thin_short.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(577, 16).addBox(-0.5531F, 0.0071F, -0.555F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5363F, 0.7151F, -0.2182F, 0.0F, 0.0F));

            PartDefinition tail_top_thin_short = rootTail.addOrReplaceChild("tail_top_thin_short", CubeListBuilder.create(), PartPose.offset(0.4469F, -1.162F, 0.5217F));

            PartDefinition cube_r2 = tail_top_thin_short.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(566, 23).addBox(-1.0F, -1.0785F, 0.1082F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, 0.8939F, -0.8045F, -1.3963F, 0.0F, 0.0F));

            PartDefinition tail_middle_thin_short = rootTail.addOrReplaceChild("tail_middle_thin_short", CubeListBuilder.create(), PartPose.offset(0.0894F, 0.0179F, -0.0147F));

            PartDefinition cube_r3 = tail_middle_thin_short.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(566, 15).addBox(-1.0F, -0.9635F, -0.1495F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6257F, -0.0179F, 0.6257F, -1.6144F, 0.0F, 0.0F));

            PartDefinition tail_bottom_thin_short = rootTail.addOrReplaceChild("tail_bottom_thin_short", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, -0.0147F));

            PartDefinition cube_r4 = tail_bottom_thin_short.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(578, 22).addBox(-1.0F, -0.8391F, -0.9493F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2682F, 0.5363F, 0.0894F, -1.6144F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("average")) {
            PartDefinition tail_connector_thin_average = rootTail.addOrReplaceChild("tail_connector_thin_average", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.5922F));

            PartDefinition cube_r1 = tail_connector_thin_average.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(605, 16).addBox(-0.5531F, 0.0071F, -0.555F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5363F, 0.7151F, -0.2182F, 0.0F, 0.0F));

            PartDefinition tail_top_thin_average = rootTail.addOrReplaceChild("tail_top_thin_average", CubeListBuilder.create(), PartPose.offset(0.4469F, -1.0726F, 0.7898F));

            PartDefinition cube_r2 = tail_top_thin_average.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(594, 23).addBox(-1.0F, -1.0785F, 0.1082F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, 0.8939F, -0.8045F, -1.3963F, 0.0F, 0.0F));

            PartDefinition tail_middle_thin_average = rootTail.addOrReplaceChild("tail_middle_thin_average", CubeListBuilder.create(), PartPose.offset(0.0894F, 0.0179F, -0.0147F));

            PartDefinition cube_r3 = tail_middle_thin_average.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(593, 14).addBox(-1.0F, -0.9635F, -0.1495F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6257F, -0.0179F, 0.6257F, -1.6144F, 0.0F, 0.0F));

            PartDefinition tail_bottom_thin_average = rootTail.addOrReplaceChild("tail_bottom_thin_average", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, -0.0147F));

            PartDefinition cube_r4 = tail_bottom_thin_average.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(605, 20).addBox(-1.0F, -0.8391F, -0.9493F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2682F, 0.5363F, 0.0894F, -1.6144F, 0.0F, 0.0F));


        } else if (thickness.equals("thin") && length.equals("long")) {
            PartDefinition tail_connector_thin_long = rootTail.addOrReplaceChild("tail_connector_thin_long", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.5922F));

            PartDefinition cube_r1 = tail_connector_thin_long.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(634, 16).addBox(-0.5531F, 0.0071F, -0.555F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5363F, 0.7151F, -0.2182F, 0.0F, 0.0F));

            PartDefinition tail_top_thin_long = rootTail.addOrReplaceChild("tail_top_thin_long", CubeListBuilder.create(), PartPose.offset(0.4469F, -1.2514F, 0.611F));

            PartDefinition cube_r2 = tail_top_thin_long.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(623, 23).addBox(-1.0F, -1.0785F, 0.1082F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, 0.8939F, -0.8045F, -1.3963F, 0.0F, 0.0F));

            PartDefinition tail_middle_thin_long = rootTail.addOrReplaceChild("tail_middle_thin_long", CubeListBuilder.create(), PartPose.offset(0.0894F, 0.0179F, -0.0147F));

            PartDefinition cube_r3 = tail_middle_thin_long.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(620, 12).addBox(-1.0F, -0.9635F, -0.1495F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6257F, -0.0179F, 0.6257F, -1.6144F, 0.0F, 0.0F));

            PartDefinition tail_bottom_thin_long = rootTail.addOrReplaceChild("tail_bottom_thin_long", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, -0.0147F));

            PartDefinition cube_r4 = tail_bottom_thin_long.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(636, 20).addBox(-1.0F, -0.8391F, -0.9493F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2682F, 0.5363F, 0.0894F, -1.6144F, 0.0F, 0.0F));


        } else if (thickness.equals("average") && length.equals("short")) {
            PartDefinition tail_connector_thick_short = rootTail.addOrReplaceChild("tail_connector_average_short", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.5922F));

            PartDefinition cube_r1 = tail_connector_thick_short.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(579, 43).addBox(-0.5531F, 0.0071F, -0.555F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, -0.5363F, 0.7151F, -0.2182F, 0.0F, 0.0F));

            PartDefinition tail_top_thick_short = rootTail.addOrReplaceChild("tail_top_thick_short", CubeListBuilder.create(), PartPose.offset(0.4469F, -1.2514F, 0.7898F));

            PartDefinition cube_r2 = tail_top_thick_short.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(566, 53).addBox(-1.0F, -2.0785F, 0.1082F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9832F, 0.8939F, -1.2514F, -1.3963F, 0.0F, 0.0F));

            PartDefinition tail_middle_thick_short = rootTail.addOrReplaceChild("tail_middle_thick_short", CubeListBuilder.create(), PartPose.offset(-0.3575F, 0.0179F, 0.3429F));

            PartDefinition cube_r3 = tail_middle_thick_short.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(566, 43).addBox(-1.0F, 0.0365F, -0.1495F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6257F, -0.0179F, 1.6089F, -1.6144F, 0.0F, 0.0F));

            PartDefinition tail_bottom_thick_short = rootTail.addOrReplaceChild("tail_bottom_thick_short", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, -0.0147F));

            PartDefinition cube_r4 = tail_bottom_thick_short.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(579, 51).addBox(-1.0F, -1.8391F, -0.9493F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6257F, 0.5363F, -0.5363F, -1.6144F, 0.0F, 0.0F));


        } else if (thickness.equals("average") && length.equals("average")) {
            PartDefinition tail_connector_average_average = rootTail.addOrReplaceChild("tail_connector_average_average", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.5922F));

            PartDefinition cube_r1 = tail_connector_average_average.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(610, 43).addBox(-0.5531F, 0.0071F, -0.555F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3575F, -0.5363F, 0.7151F, -0.2182F, 0.0F, 0.0F));

            PartDefinition tail_top_average_average = rootTail.addOrReplaceChild("tail_top_average_average", CubeListBuilder.create(), PartPose.offset(0.4469F, -1.0726F, 0.4323F));

            PartDefinition cube_r2 = tail_top_average_average.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(597, 52).addBox(-1.0F, -2.0785F, 0.1082F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8939F, 0.8939F, -1.2514F, -1.3963F, 0.0F, 0.0F));

            PartDefinition tail_middle_average_average = rootTail.addOrReplaceChild("tail_middle_average_average", CubeListBuilder.create(), PartPose.offset(0.0894F, 0.0179F, -0.0147F));

            PartDefinition cube_r3 = tail_middle_average_average.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(596, 42).addBox(-1.0F, -1.9635F, -0.1495F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0726F, -0.0179F, -0.0894F, -1.6144F, 0.0F, 0.0F));

            PartDefinition tail_bottom_average_average = rootTail.addOrReplaceChild("tail_bottom_average_average", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.2535F));

            PartDefinition cube_r4 = tail_bottom_average_average.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(610, 49).addBox(-1.0F, -1.8391F, -0.9493F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7151F, 0.5363F, -0.6257F, -1.6144F, 0.0F, 0.0F));


        } else if (thickness.equals("average") && length.equals("long")) {
            PartDefinition tail_connector_thick_long = rootTail.addOrReplaceChild("tail_connector_average_long", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.5922F));

            PartDefinition cube_r1 = tail_connector_thick_long.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(654, 72).addBox(-0.5531F, 0.0071F, -0.555F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, -0.5363F, 0.7151F, -0.2182F, 0.0F, 0.0F));

            PartDefinition tail_top_thick_long = rootTail.addOrReplaceChild("tail_top_thick_long", CubeListBuilder.create(), PartPose.offset(0.4469F, -1.0726F, 0.4323F));

            PartDefinition cube_r2 = tail_top_thick_long.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(639, 82).addBox(-1.0F, -2.0785F, 0.1082F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9832F, 0.8939F, -1.2514F, -1.3963F, 0.0F, 0.0F));

            PartDefinition tail_middle_thick_long = rootTail.addOrReplaceChild("tail_middle_thick_long", CubeListBuilder.create(), PartPose.offset(0.0894F, 0.0F, -0.0147F));

            PartDefinition cube_r3 = tail_middle_thick_long.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(636, 69).addBox(-1.0F, -0.9635F, -0.1495F, 5.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6089F, -0.0179F, 1.3408F, -1.6144F, 0.0F, 0.0F));

            PartDefinition tail_bottom_thick_long = rootTail.addOrReplaceChild("tail_bottom_thick_long", CubeListBuilder.create(), PartPose.offset(0.1788F, -0.0179F, 0.0747F));

            PartDefinition cube_r4 = tail_bottom_thick_long.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(656, 77).addBox(-1.0F, -1.8391F, -0.9493F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7151F, 0.5363F, -0.5363F, -1.6144F, 0.0F, 0.0F));


        } else if (thickness.equals("thick") && length.equals("short")) {
            PartDefinition tail_connector_thick_short = rootTail.addOrReplaceChild("tail_connector_thick_short", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1788F, -0.0147F));

            PartDefinition cube_r1 = tail_connector_thick_short.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(581, 75).addBox(-0.5531F, 0.0071F, -0.555F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, -0.5363F, 0.7151F, -0.2182F, 0.0F, 0.0F));

            PartDefinition tail_top_thick_short = rootTail.addOrReplaceChild("tail_top_thick_short", CubeListBuilder.create(), PartPose.offset(0.4469F, -1.4302F, 0.611F));

            PartDefinition cube_r2 = tail_top_thick_short.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(566, 85).addBox(-1.0F, -2.0785F, 0.1082F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9832F, 0.8939F, -1.2514F, -1.3963F, 0.0F, 0.0F));

            PartDefinition tail_middle_thick_short = rootTail.addOrReplaceChild("tail_middle_thick_short", CubeListBuilder.create(), PartPose.offset(-0.3575F, 0.0179F, 0.3429F));

            PartDefinition cube_r3 = tail_middle_thick_short.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(566, 75).addBox(-1.0F, -0.9635F, -0.1495F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.162F, -0.0179F, 0.9832F, -1.6144F, 0.0F, 0.0F));

            PartDefinition tail_bottom_thick_short = rootTail.addOrReplaceChild("tail_bottom_thick_short", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, -0.0147F));

            PartDefinition cube_r4 = tail_bottom_thick_short.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(581, 83).addBox(-1.0F, -1.8391F, -0.9493F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6257F, 0.5363F, -0.5363F, -1.6144F, 0.0F, 0.0F));


        } else if (thickness.equals("thick") && length.equals("average")) {
            PartDefinition tail_connector_thick_average = rootTail.addOrReplaceChild("tail_connector_thick_average", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.5922F));

            PartDefinition cube_r1 = tail_connector_thick_average.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(616, 74).addBox(-0.5531F, 0.0071F, -0.555F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3575F, -0.5363F, 0.7151F, -0.2182F, 0.0F, 0.0F));

            PartDefinition tail_top_thick_average = rootTail.addOrReplaceChild("tail_top_thick_average", CubeListBuilder.create(), PartPose.offset(0.4469F, -1.162F, 0.611F));

            PartDefinition cube_r2 = tail_top_thick_average.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(601, 84).addBox(-1.0F, -2.0785F, 0.1082F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8939F, 0.8939F, -1.2514F, -1.3963F, 0.0F, 0.0F));

            PartDefinition tail_middle_thick_average = rootTail.addOrReplaceChild("tail_middle_thick_average", CubeListBuilder.create(), PartPose.offset(0.0894F, 0.0179F, -0.0147F));

            PartDefinition cube_r3 = tail_middle_thick_average.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(600, 73).addBox(-1.0F, -1.9635F, -0.1495F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5196F, -0.0179F, 0.5363F, -1.6144F, 0.0F, 0.0F));

            PartDefinition tail_bottom_thick_average = rootTail.addOrReplaceChild("tail_bottom_thick_average", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, -0.0147F));

            PartDefinition cube_r4 = tail_bottom_thick_average.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(616, 80).addBox(-1.0F, -1.8391F, -0.9493F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7151F, 0.5363F, -0.6257F, -1.6144F, 0.0F, 0.0F));


        } else if (thickness.equals("thick") && length.equals("long")) {
            PartDefinition tail_connector_thick_long = rootTail.addOrReplaceChild("tail_connector_thick_long", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.5922F));

            PartDefinition cube_r1 = tail_connector_thick_long.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(654, 72).addBox(-0.5531F, 0.0071F, -0.555F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, -0.5363F, 0.7151F, -0.2182F, 0.0F, 0.0F));

            PartDefinition tail_top_thick_long = rootTail.addOrReplaceChild("tail_top_thick_long", CubeListBuilder.create(), PartPose.offset(0.4469F, -1.0726F, 0.5217F));

            PartDefinition cube_r2 = tail_top_thick_long.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(639, 82).addBox(-1.0F, -2.0785F, 0.1082F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9832F, 0.8939F, -1.2514F, -1.3963F, 0.0F, 0.0F));

            PartDefinition tail_middle_thick_long = rootTail.addOrReplaceChild("tail_middle_thick_long", CubeListBuilder.create(), PartPose.offset(0.0894F, 0.0179F, 0.0F));

            PartDefinition cube_r3 = tail_middle_thick_long.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(636, 69).addBox(-1.0F, -0.9635F, -0.1495F, 5.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6089F, -0.0179F, 1.3408F, -1.6144F, 0.0F, 0.0F));

            PartDefinition tail_bottom_thick_long = rootTail.addOrReplaceChild("tail_bottom_thick_long", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, -0.0147F));

            PartDefinition cube_r4 = tail_bottom_thick_long.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(656, 77).addBox(-1.0F, -1.8391F, -0.9493F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7151F, 0.5363F, -0.5363F, -1.6144F, 0.0F, 0.0F));


        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Tail / " + thickness + " / " + length + ", Cancelling Generation...");
        }
        return rootTail;
    }
    public static PartDefinition GenerateAll(PartDefinition root) {
        List<String> TAIL_THICKNESS = List.of("thin", "average", "thick");
        List<String> TAIL_LENGTH = List.of("short", "average", "long");

        for (String variable1 : TAIL_THICKNESS) {
            for (String variable2 : TAIL_LENGTH) {
                root = Generate(root, variable1, variable2);
            }
        }
        return root;
    }
}
