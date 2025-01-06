package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class TailModelParts {
    public static PartDefinition Generate(PartDefinition root, String set, String thickness, String length) {
        if (set.equals("") && thickness.equals("") && length.equals("")) {
            //Insert Model Here
            return root;
        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Tail / " + set + " / " + thickness + " / " + length + ", Returning Null Value");
            return null;
        }
    }
}
