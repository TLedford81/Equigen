package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class BackModelParts {
    //BackAverageLong
    public static PartDefinition Generate(PartDefinition root, String muscleMass, String girth, String length, int variation) {
        if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("average") && girth.equals("average") && length.equals("average")) {
            PartDefinition back_lean_average_thin = root.addOrReplaceChild("back_lean_average_thin", CubeListBuilder.create().texOffs(465, 241).addBox(-6.3944F, -5.2737F, -4.5028F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(4.2905F, 2.4134F, -1.3894F));

            PartDefinition cube_r1 = back_lean_average_thin.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(457, 238).addBox(-4.08F, -6.24F, -5.52F, 4.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.255F, -5.878F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            PartDefinition cube_r2 = back_lean_average_thin.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(489, 239).addBox(-4.08F, -6.24F, -4.52F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7913F, -5.1629F, 4.7982F, 1.6581F, 0.0F, 0.0F));

            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else if (muscleMass.equals("") && girth.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else {
            EquigenMod.LOGGER.error("Invalid Part: Back / " + muscleMass + " / " + length + " / Variation " + variation + ", Returning Null Value");
            return null;
        }
    }
}
