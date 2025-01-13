package net.buckleystudios.equigen.entity.client;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

import java.util.Map;

public class GeneticHorseAnimations {
        public AnimationDefinition walking = AnimationDefinition.Builder.withLength(0.9167F).build();
        public AnimationDefinition idle = net.minecraft.client.animation.AnimationDefinition.Builder.withLength(0).build();

        public static AnimationDefinition GetAnimation(String animation, Map<String, String> modelParts) {
                if (animation.equals("walking")) {
                        return AnimationDefinition.Builder.withLength(0.5F)
                                .addAnimation(modelParts.get("back"), new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0417F, KeyframeAnimations.degreeVec(35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                        new Keyframe(0.375F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                        new Keyframe(0.5417F, KeyframeAnimations.degreeVec(35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                                        new Keyframe(0.875F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                                )).build();
                } else {
                        return AnimationDefinition.Builder.withLength(0f).build();
                }
        }
}