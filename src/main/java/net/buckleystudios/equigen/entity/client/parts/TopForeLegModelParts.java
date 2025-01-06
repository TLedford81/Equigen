package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class TopForeLegModelParts {
    public static PartDefinition Generate(PartDefinition root, String width, String length, int variation) {
        if (width.equals("average") && length.equals("short") && variation == 0) {
            //Insert Model Here
            return root;
        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Top Forelegs / " + width + " / " + length + " / Variation " + variation + ", Returning Null Value");
            return null;
        }
    }
}
