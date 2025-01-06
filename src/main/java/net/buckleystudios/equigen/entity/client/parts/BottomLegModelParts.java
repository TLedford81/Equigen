package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class BottomLegModelParts{
    public static PartDefinition[] Generate(PartDefinition upperRoot, PartDefinition lowerRoot, String length, String thickness, int variation) {
        if (length.equals("long") && thickness.equals("thin")) {
            //Insert Model Here
            PartDefinition[] returnedRoots = new PartDefinition[2];
            returnedRoots[0] = upperRoot;
            returnedRoots[1] = lowerRoot;
            return returnedRoots;
        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Bottom Leg / " + length + " / " + thickness + ", Returning Null Value");
            return null;
        }
    }
}
