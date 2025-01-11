package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class BackModelParts {
    //BackAverageLong
    public static PartDefinition Generate(PartDefinition root, String muscleMass, String length, String girth) {
        if (muscleMass.equals("lean") && length.equals("short") && girth.equals("thin")) {
            PartDefinition back_lean_short_thin = root.addOrReplaceChild("back_lean_short_thin", CubeListBuilder.create().texOffs(296, 227).addBox(-6.3944F, -5.2737F, -3.5028F, 6.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 2.4134F, -2.5515F));

            PartDefinition cube_r1 = back_lean_short_thin.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(287, 223).addBox(-4.08F, -6.24F, -5.52F, 4.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_lean_short_thin.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(319, 224).addBox(-4.08F, -6.24F, -4.52F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7913F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));


        } else if (muscleMass.equals("lean") && length.equals("short") && girth.equals("average")) {
            PartDefinition back_lean_short_average = root.addOrReplaceChild("back_lean_short_average", CubeListBuilder.create().texOffs(351, 230).addBox(-6.3944F, -5.2737F, -3.5028F, 6.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 1.6983F, -2.2833F));

            PartDefinition cube_r1 = back_lean_short_average.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(340, 225).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_lean_short_average.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(374, 226).addBox(-4.08F, -6.24F, -5.52F, 5.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7913F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));


        } else if (muscleMass.equals("lean") && length.equals("short") && girth.equals("thick")) {
            PartDefinition back_lean_short_thick = root.addOrReplaceChild("back_lean_short_thick", CubeListBuilder.create().texOffs(408, 238).addBox(-6.3944F, -5.2737F, -3.5028F, 6.0F, 8.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 1.2514F, -2.1939F));

            PartDefinition cube_r1 = back_lean_short_thick.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(397, 233).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_lean_short_thick.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(431, 234).addBox(-4.08F, -6.24F, -5.52F, 5.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7913F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));


        } else if (muscleMass.equals("lean") && length.equals("average") && girth.equals("thin")) {
            PartDefinition back_lean_average_thin = root.addOrReplaceChild("back_lean_average_thin", CubeListBuilder.create().texOffs(465, 241).addBox(-6.3944F, -5.2737F, -4.5028F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 2.4134F, -1.3894F));

            PartDefinition cube_r1 = back_lean_average_thin.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(457, 238).addBox(-4.08F, -6.24F, -5.52F, 4.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_lean_average_thin.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(489, 239).addBox(-4.08F, -6.24F, -4.52F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7913F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));


        } else if (muscleMass.equals("lean") && length.equals("average") && girth.equals("average")) {
            PartDefinition back_lean_average_average = root.addOrReplaceChild("back_lean_average_average", CubeListBuilder.create().texOffs(221, 250).addBox(-6.3944F, -5.2737F, -4.5028F, 6.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 1.6983F, -1.3001F));

            PartDefinition cube_r1 = back_lean_average_average.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(211, 246).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_lean_average_average.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(245, 247).addBox(-4.08F, -6.24F, -5.52F, 5.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7913F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));


        } else if (muscleMass.equals("lean") && length.equals("average") && girth.equals("thick")) {
            PartDefinition back_lean_average_thick = root.addOrReplaceChild("back_lean_average_thick", CubeListBuilder.create().texOffs(279, 252).addBox(-6.3944F, -5.2737F, -4.5028F, 6.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 1.2514F, -1.6576F));

            PartDefinition cube_r1 = back_lean_average_thick.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(269, 248).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_lean_average_thick.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(303, 249).addBox(-4.08F, -6.24F, -5.52F, 5.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7913F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));
            
        } else if (muscleMass.equals("lean") && length.equals("long") && girth.equals("thin")) {
            PartDefinition back_lean_long_thin = root.addOrReplaceChild("back_lean_long_thin", CubeListBuilder.create().texOffs(333, 253).addBox(-6.3944F, -5.2737F, -5.5028F, 6.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 2.4134F, -0.7637F));

            PartDefinition cube_r1 = back_lean_long_thin.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(326, 250).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_lean_long_thin.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(358, 251).addBox(-4.08F, -7.24F, -4.52F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7913F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));


        } else if (muscleMass.equals("lean") && length.equals("long") && girth.equals("average")) {
            PartDefinition back_lean_long_average = root.addOrReplaceChild("back_lean_long_average", CubeListBuilder.create().texOffs(388, 261).addBox(-6.3944F, -5.2737F, -5.5028F, 6.0F, 7.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 1.6983F, -0.6744F));

            PartDefinition cube_r1 = back_lean_long_average.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(379, 257).addBox(-4.08F, -7.24F, -6.52F, 4.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_lean_long_average.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(413, 258).addBox(-4.08F, -7.24F, -5.52F, 5.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7913F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));


        } else if (muscleMass.equals("lean") && length.equals("long") && girth.equals("thick")) {
            PartDefinition back_lean_long_thick = root.addOrReplaceChild("back_lean_long_thick", CubeListBuilder.create().texOffs(447, 264).addBox(-6.3944F, -5.2737F, -5.5028F, 6.0F, 8.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 1.2514F, -0.7637F));

            PartDefinition cube_r1 = back_lean_long_thick.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(438, 260).addBox(-4.08F, -7.24F, -6.52F, 4.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_lean_long_thick.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(472, 261).addBox(-4.08F, -7.24F, -5.52F, 5.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7913F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));


        } else if (muscleMass.equals("average") && length.equals("short") && girth.equals("thin")) {
            PartDefinition back_average_short_thin = root.addOrReplaceChild("back_average_short_thin", CubeListBuilder.create().texOffs(224, 276).addBox(-6.8581F, -5.2737F, -3.5028F, 7.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(3.3647F, 2.4134F, -2.5515F));

            PartDefinition cube_r1 = back_average_short_thin.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(215, 272).addBox(-4.08F, -6.24F, -5.52F, 4.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_average_short_thin.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(249, 273).addBox(-5.08F, -6.24F, -4.52F, 6.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));


        } else if (muscleMass.equals("average") && length.equals("short") && girth.equals("average")) {
            PartDefinition back_average_short_average = root.addOrReplaceChild("back_average_short_average", CubeListBuilder.create().texOffs(284, 278).addBox(-6.8581F, -5.2737F, -3.5028F, 7.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 1.6983F, -2.2833F));

            PartDefinition cube_r1 = back_average_short_average.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(273, 273).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_average_short_average.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(309, 274).addBox(-5.08F, -6.24F, -5.52F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));


        } else if (muscleMass.equals("average") && length.equals("short") && girth.equals("thick")) {
            PartDefinition back_average_short_thick = root.addOrReplaceChild("back_average_short_thick", CubeListBuilder.create().texOffs(345, 281).addBox(-6.8581F, -5.2737F, -3.5028F, 7.0F, 8.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 1.2514F, -2.1939F));

            PartDefinition cube_r1 = back_average_short_thick.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(334, 276).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_average_short_thick.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(370, 277).addBox(-5.08F, -6.24F, -5.52F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));


        } else if (muscleMass.equals("average") && length.equals("average") && girth.equals("thin")) {
            PartDefinition back_average_average_thin = root.addOrReplaceChild("back_average_average_thin", CubeListBuilder.create().texOffs(403, 286).addBox(-6.8581F, -5.2737F, -4.5028F, 7.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 2.4134F, -1.3894F));

            PartDefinition cube_r1 = back_average_average_thin.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(395, 283).addBox(-4.08F, -6.24F, -5.52F, 4.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_average_average_thin.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(429, 284).addBox(-5.08F, -6.24F, -4.52F, 6.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));


        } else if (muscleMass.equals("average") && length.equals("average") && girth.equals("average")) {
            PartDefinition back_average_average_average = root.addOrReplaceChild("back_average_average_average", CubeListBuilder.create().texOffs(462, 291).addBox(-6.9475F, -5.2737F, -4.5028F, 7.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 1.6983F, -1.3001F));

            PartDefinition cube_r1 = back_average_average_average.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(452, 287).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_average_average_average.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(488, 288).addBox(-5.08F, -6.24F, -5.52F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3444F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));


        } else if (muscleMass.equals("average") && length.equals("average") && girth.equals("thick")) {
            PartDefinition back_average_average_thick = root.addOrReplaceChild("back_average_average_thick", CubeListBuilder.create().texOffs(231, 300).addBox(-6.8581F, -5.2737F, -4.5028F, 7.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 1.2514F, -1.6576F));

            PartDefinition cube_r1 = back_average_average_thick.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(221, 296).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_average_average_thick.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(257, 297).addBox(-5.08F, -6.24F, -5.52F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));


        } else if (muscleMass.equals("average") && length.equals("long") && girth.equals("thin")) {
            PartDefinition back_average_long_thin = root.addOrReplaceChild("back_average_long_thin", CubeListBuilder.create().texOffs(292, 301).addBox(-6.8581F, -5.2737F, -5.5028F, 7.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 2.4134F, -0.7637F));

            PartDefinition cube_r1 = back_average_long_thin.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(285, 298).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_average_long_thin.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(319, 299).addBox(-5.08F, -7.24F, -4.52F, 6.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));


        } else if (muscleMass.equals("average") && length.equals("long") && girth.equals("average")) {
            PartDefinition back_average_long_average = root.addOrReplaceChild("back_average_long_average", CubeListBuilder.create().texOffs(351, 305).addBox(-6.9475F, -5.2737F, -5.5028F, 7.0F, 7.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 1.6983F, -0.6744F));

            PartDefinition cube_r1 = back_average_long_average.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(342, 301).addBox(-4.08F, -7.24F, -6.52F, 4.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_average_long_average.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(378, 302).addBox(-5.08F, -7.24F, -5.52F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3444F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));


        } else if (muscleMass.equals("average") && length.equals("long") && girth.equals("thick")) {
            PartDefinition back_average_long_thick = root.addOrReplaceChild("back_average_long_thick", CubeListBuilder.create().texOffs(412, 309).addBox(-6.8581F, -5.2737F, -5.5028F, 7.0F, 8.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 1.2514F, -0.7637F));

            PartDefinition cube_r1 = back_average_long_thick.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(403, 305).addBox(-4.08F, -7.24F, -6.52F, 4.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_average_long_thick.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(439, 306).addBox(-5.08F, -7.24F, -5.52F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));


        } else if (muscleMass.equals("muscular") && length.equals("short") && girth.equals("thin")) {
            PartDefinition back_muscular_short_thin = root.addOrReplaceChild("back_muscular_short_thin", CubeListBuilder.create().texOffs(220, 326).addBox(-7.4112F, -5.2737F, -3.5028F, 8.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(3.3647F, 2.4134F, -2.5515F));

            PartDefinition cube_r1 = back_muscular_short_thin.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(211, 322).addBox(-4.08F, -6.24F, -5.52F, 4.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_muscular_short_thin.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(247, 323).addBox(-6.08F, -6.24F, -4.52F, 7.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.808F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));
            
        } else if (muscleMass.equals("muscular") && length.equals("short") && girth.equals("average")) {
            PartDefinition back_muscular_short_average = root.addOrReplaceChild("back_muscular_short_average", CubeListBuilder.create().texOffs(284, 325).addBox(-7.4112F, -5.2737F, -3.5028F, 8.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 1.6983F, -2.2833F));

            PartDefinition cube_r1 = back_muscular_short_average.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(273, 320).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_muscular_short_average.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(311, 321).addBox(-6.08F, -6.24F, -5.52F, 7.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.808F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));


        } else if (muscleMass.equals("muscular") && length.equals("short") && girth.equals("thick")) {
            PartDefinition back_muscular_short_thick = root.addOrReplaceChild("back_muscular_short_thick", CubeListBuilder.create().texOffs(351, 331).addBox(-7.3218F, -5.2737F, -3.5028F, 8.0F, 8.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 1.2514F, -2.1939F));

            PartDefinition cube_r1 = back_muscular_short_thick.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(340, 326).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_muscular_short_thick.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(378, 327).addBox(-6.08F, -6.24F, -5.52F, 7.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7187F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));


        } else if (muscleMass.equals("muscular") && length.equals("average") && girth.equals("thin")) {
            PartDefinition back_muscular_average_thin = root.addOrReplaceChild("back_muscular_average_thin", CubeListBuilder.create().texOffs(407, 342).addBox(-7.2324F, -5.2737F, -4.5028F, 8.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 2.4134F, -1.3894F));

            PartDefinition cube_r1 = back_muscular_average_thin.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(399, 339).addBox(-4.08F, -6.24F, -5.52F, 4.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_muscular_average_thin.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(435, 340).addBox(-6.08F, -6.24F, -4.52F, 7.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6293F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));


        } else if (muscleMass.equals("muscular") && length.equals("average") && girth.equals("average")) {
            PartDefinition back_muscular_average_average = root.addOrReplaceChild("back_muscular_average_average", CubeListBuilder.create().texOffs(461, 327).addBox(-7.5006F, -5.2737F, -4.5028F, 8.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 1.6983F, -1.3001F));

            PartDefinition cube_r1 = back_muscular_average_average.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(451, 323).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_muscular_average_average.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(486, 312).addBox(-6.08F, -6.24F, -5.52F, 7.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8974F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));


        } else if (muscleMass.equals("muscular") && length.equals("average") && girth.equals("thick")) {
            PartDefinition back_muscular_average_thick = root.addOrReplaceChild("back_muscular_average_thick", CubeListBuilder.create().texOffs(194, 347).addBox(-7.3218F, -5.2737F, -4.5028F, 8.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 1.2514F, -1.6576F));

            PartDefinition cube_r1 = back_muscular_average_thick.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(184, 343).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_muscular_average_thick.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(222, 344).addBox(-6.08F, -6.24F, -5.52F, 7.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7187F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));


        } else if (muscleMass.equals("muscular") && length.equals("long") && girth.equals("thin")) {
            PartDefinition back_muscular_long_thin = root.addOrReplaceChild("back_muscular_long_thin", CubeListBuilder.create().texOffs(256, 347).addBox(-7.3218F, -5.2737F, -5.5028F, 8.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 2.4134F, -0.7637F));

            PartDefinition cube_r1 = back_muscular_long_thin.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(249, 344).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_muscular_long_thin.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(285, 345).addBox(-6.08F, -7.24F, -4.52F, 7.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7187F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));


        } else if (muscleMass.equals("muscular") && length.equals("long") && girth.equals("average")) {
            PartDefinition back_muscular_long_average = root.addOrReplaceChild("back_muscular_long_average", CubeListBuilder.create().texOffs(321, 354).addBox(-7.4112F, -5.2737F, -5.5028F, 8.0F, 7.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 1.6983F, -0.6744F));

            PartDefinition cube_r1 = back_muscular_long_average.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(312, 350).addBox(-4.08F, -7.24F, -6.52F, 4.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_muscular_long_average.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(350, 351).addBox(-6.08F, -7.24F, -5.52F, 7.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.808F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));


        } else if (muscleMass.equals("muscular") && length.equals("long") && girth.equals("thick")) {
            PartDefinition back_muscular_long_thick = root.addOrReplaceChild("back_muscular_long_thick", CubeListBuilder.create().texOffs(382, 365).addBox(-7.3218F, -5.2737F, -5.5028F, 8.0F, 8.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 1.2514F, -0.7637F));

            PartDefinition cube_r1 = back_muscular_long_thick.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(373, 361).addBox(-4.08F, -7.24F, -6.52F, 4.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_muscular_long_thick.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(411, 362).addBox(-6.08F, -7.24F, -5.52F, 7.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7187F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));

        } else {
            EquigenMod.LOGGER.error("Invalid Part: Back / " + muscleMass + " / " + length + " / Girth " + girth + ", Returning Null Value");
            return null;
        }
        return root;
    }
}
