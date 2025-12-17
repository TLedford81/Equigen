package net.buckleystudios.equigen.entity.client.genetic_horse.animations;

import net.minecraft.client.animation.AnimationDefinition;

public class GH_IdleAnimation extends GH_Animation {
    public static AnimationDefinition animate(String part, int legID) {
        if (!isValidLegID(legID)) return inanimate();

        return ModAnimationDefinition.Builder.withLength(3.0F).looping().setPart(part, legID)
                .build();
    }
}

