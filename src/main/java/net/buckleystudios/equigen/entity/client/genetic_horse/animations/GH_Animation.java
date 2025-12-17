package net.buckleystudios.equigen.entity.client.genetic_horse.animations;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.animation.AnimationDefinition;

public abstract class GH_Animation {
    protected static final int LegID_FrontLeft = 1;
    protected static final int LegID_FrontRight = 2;
    protected static final int LegID_BackLeft = 3;
    protected static final int LegID_BackRight = 4;

    public static AnimationDefinition inanimate() {
        return AnimationDefinition.Builder.withLength(1.0F).build();
    }

    protected static boolean isValidLegID(int legID){
        if(legID > 4 || legID < 0){
            EquigenMod.LOGGER.error("INVALID LEG ID ({}) IN ANIMATION FILE", legID);
            return false;
        }
        return true;
    }
}