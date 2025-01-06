package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class StomachModelParts {
    public static PartDefinition Generate(PartDefinition root, String muscleMass, String curve, String length, int variation) {
        if (muscleMass.equals("") && curve.equals("") && length.equals("") && variation == 0) {
            //Insert Model Here
            return root;
        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Stomach / " + muscleMass + " / " + curve +  " / "  + length + " / Variation " + variation + ", Returning Null Value");
            return null;
        }
    }
}
