package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class HipsModelParts {
    public static PartDefinition Generate(PartDefinition root, String muscleMass, String size) {
        if (muscleMass.equals("average") && size.equals("small")) {
            //Insert Model Here
            return root;
        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Hips / " + muscleMass + " / " + size + ", Returning Null Value");
            return null;
        }
    }
}
