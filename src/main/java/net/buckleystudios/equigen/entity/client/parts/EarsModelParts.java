package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class EarsModelParts {
    public static PartDefinition Generate(PartDefinition root, String size) {
        if (size.equals("average")) {
            //Insert Model Here
            return root;
        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Ears / " + size + ", Returning Null Value");
            return null;
        }
    }
}
