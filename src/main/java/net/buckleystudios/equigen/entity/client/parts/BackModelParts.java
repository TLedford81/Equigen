package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class BackModelParts {
    //BackAverageLong
    public static PartDefinition Generate(PartDefinition root, String muscleMass, String length, int variation) {
        if (muscleMass.equals("average") && length.equals("long") && variation == 1) {
            //Insert Model Here
            return root;
        } else {
            EquigenMod.LOGGER.error("Invalid Part: Back / " + muscleMass + " / " + length + " / Variation " + variation + ", Returning Null Value");
            return null;
        }
    }
}
