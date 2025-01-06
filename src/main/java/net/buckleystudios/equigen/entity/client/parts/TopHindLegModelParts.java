package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class TopHindLegModelParts {
    public static PartDefinition Generate(PartDefinition root, String width, String thickness, String length, int variation) {
        if (width.equals("average") && thickness.equals("short") && length.equals("") && variation == 0) {
            //Insert Model Here
            return root;
        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Top Hindlegs / " + width + " / " + thickness + " / " + length + " / Variation " + variation + ", Returning Null Value");
            return null;
        }
    }
}
