package net.buckleystudios.equigen.entity.client.genetic_horse.animations;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.animation.AnimationDefinition;

import java.util.List;

public abstract class GeneticHorseAnimation {
    protected static final int LegID_FrontLeft = 1;
    protected static final int LegID_FrontRight = 2;
    protected static final int LegID_BackLeft = 3;
    protected static final int LegID_BackRight = 4;

    public static AnimationDefinition inanimate() {
        return AnimationDefinition.Builder.withLength(1.0F).build();
    }

    public static boolean isInanimate(String part, List<String> inanimateParts){
        for(String p : inanimateParts){
            if(part.startsWith(p)) return true;
        }
        return false;
    }

    protected static boolean isValidLegID(int legID){
        if(legID > 4 || legID < 0){
            EquigenMod.LOGGER.error("INVALID LEG ID ({}) IN ANIMATION FILE", legID);
            return false;
        }
        return true;
    }

    protected static AnimationDefinition missingPart(String part, int legID, List<String> inanimateParts) {
        if (!isInanimate(part, inanimateParts)) {
            EquigenMod.LOGGER.error("GALLOP ANIMATION MISSING FOR PART '" + part + "'" +
                    (legID == 0 ? "" : " IN LEG " + legID));
        }
        return inanimate();
    }
}