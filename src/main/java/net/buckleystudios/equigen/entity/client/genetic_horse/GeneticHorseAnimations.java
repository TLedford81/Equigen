package net.buckleystudios.equigen.entity.client.genetic_horse;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class GeneticHorseAnimations {
        public AnimationDefinition walking = AnimationDefinition.Builder.withLength(0.9167F).build();
        public AnimationDefinition idle = net.minecraft.client.animation.AnimationDefinition.Builder.withLength(0).build();

        public static AnimationDefinition GetAnimation(String animation, GeneticHorseEntity entity) {
                if(animation.equals("idle")) {
                        return AnimationDefinition.Builder.withLength(1.0f).build();
                } else if (animation.equals("galloping")) {
                        return AnimationDefinition.Builder.withLength(1.0F).looping()
                                .addAnimation("body_front", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.1667F, KeyframeAnimations.degreeVec(6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.3333F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("body_front", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("neck", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.1667F, KeyframeAnimations.degreeVec(36.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.3333F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(36.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.6667F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.8333F, KeyframeAnimations.degreeVec(36.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.1667F, KeyframeAnimations.degreeVec(-24.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.3333F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(-24.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.6667F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.8333F, KeyframeAnimations.degreeVec(-24.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-65.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.0833F, KeyframeAnimations.degreeVec(-53.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.2917F, KeyframeAnimations.degreeVec(-24.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.4167F, KeyframeAnimations.degreeVec(1.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(24.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5833F, KeyframeAnimations.degreeVec(28.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(-65.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("withers", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("body_back", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.0833F, KeyframeAnimations.degreeVec(11.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.2083F, KeyframeAnimations.degreeVec(39.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.2917F, KeyframeAnimations.degreeVec(45.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(-9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5833F, KeyframeAnimations.degreeVec(-21.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.7083F, KeyframeAnimations.degreeVec(-17.67F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.7917F, KeyframeAnimations.degreeVec(-15.72F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.875F, KeyframeAnimations.degreeVec(-4.64F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(1.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("top_front_right", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("top_front_right", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.5196F, -1.6983F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -1.5196F, -1.6983F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("knee_front_right", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(51.7279F, -5.35F, 0.7598F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.0833F, KeyframeAnimations.degreeVec(29.7279F, -5.35F, 0.7598F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.2083F, KeyframeAnimations.degreeVec(6.7279F, -5.35F, 0.7598F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(51.7279F, -5.35F, 0.7598F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("bottom_2_front_right", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.2083F, KeyframeAnimations.degreeVec(19.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("top_front_left", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("top_front_left", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("knee_front_left", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("bottom_2_front_left", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.2917F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("top_back_left", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("knee_back_left", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.2917F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.4167F, KeyframeAnimations.degreeVec(6.04F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5833F, KeyframeAnimations.degreeVec(-23.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("bottom_back_left", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.2917F, KeyframeAnimations.degreeVec(-14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("bottom_2_back_left", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("top_back_right", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("bottom_back_right", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("bottom_2_back_right", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("chest_left", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("chest_right", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.2083F, KeyframeAnimations.degreeVec(7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.4583F, KeyframeAnimations.degreeVec(-11.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.7917F, KeyframeAnimations.degreeVec(11.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION,
                                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.2083F, KeyframeAnimations.posVec(0.0F, 1.9F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 1.7F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5417F, KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.7917F, KeyframeAnimations.posVec(0.0F, 1.9F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.0833F, KeyframeAnimations.degreeVec(-9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.2083F, KeyframeAnimations.degreeVec(21.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.2917F, KeyframeAnimations.degreeVec(37.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(29.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5833F, KeyframeAnimations.degreeVec(24.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.9167F, KeyframeAnimations.degreeVec(-61.62F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("bottom_front_left", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.2917F, KeyframeAnimations.degreeVec(14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.4167F, KeyframeAnimations.degreeVec(49.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(61.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5833F, KeyframeAnimations.degreeVec(71.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.7917F, KeyframeAnimations.degreeVec(92.25F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("hoof_front_left", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.2917F, KeyframeAnimations.degreeVec(44.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("bottom_front_right", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.2917F, KeyframeAnimations.degreeVec(-11.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.4167F, KeyframeAnimations.degreeVec(8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5833F, KeyframeAnimations.degreeVec(46.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("hoof_front_right", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.2083F, KeyframeAnimations.degreeVec(14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.2917F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.4167F, KeyframeAnimations.degreeVec(-32.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("tail_top", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(45.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.25F, KeyframeAnimations.degreeVec(64.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(82.07F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.75F, KeyframeAnimations.degreeVec(64.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(45.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("tail_middle", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.25F, KeyframeAnimations.degreeVec(11.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(23.35F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("tail_bottom", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("hoof_back_left", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.0833F, KeyframeAnimations.degreeVec(-37.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.2917F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5833F, KeyframeAnimations.degreeVec(62.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(21.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.0833F, KeyframeAnimations.degreeVec(33.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.2083F, KeyframeAnimations.degreeVec(26.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.2917F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.4167F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5833F, KeyframeAnimations.degreeVec(-44.3779F, 7.6802F, 9.2482F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.7083F, KeyframeAnimations.degreeVec(-23.3779F, 7.6802F, 9.2482F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.7917F, KeyframeAnimations.degreeVec(0.5195F, 6.5128F, 7.8425F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(21.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("knee_back_right", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(23.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.2083F, KeyframeAnimations.degreeVec(-36.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5833F, KeyframeAnimations.degreeVec(-13.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(23.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("hoof_back_right", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(21.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.2083F, KeyframeAnimations.degreeVec(6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.2917F, KeyframeAnimations.degreeVec(33.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.7083F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(21.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .build();
                } else if(animation.equals("walking")){
                        return AnimationDefinition.Builder.withLength(3.0F).looping()
                                .addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-3.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.25F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.75F, KeyframeAnimations.degreeVec(-3.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.25F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.75F, KeyframeAnimations.degreeVec(-3.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.25F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.75F, KeyframeAnimations.degreeVec(-3.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(3.0F, KeyframeAnimations.degreeVec(-3.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("neck", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(26.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.25F, KeyframeAnimations.degreeVec(32.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.75F, KeyframeAnimations.degreeVec(26.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.25F, KeyframeAnimations.degreeVec(32.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.75F, KeyframeAnimations.degreeVec(26.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.25F, KeyframeAnimations.degreeVec(32.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.75F, KeyframeAnimations.degreeVec(26.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(3.0F, KeyframeAnimations.degreeVec(26.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(3.0F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-54.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.25F, KeyframeAnimations.degreeVec(-65.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(-18.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.75F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.25F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.5F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.75F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.0F, KeyframeAnimations.degreeVec(11.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.25F, KeyframeAnimations.degreeVec(18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.5F, KeyframeAnimations.degreeVec(-27.06F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(3.0F, KeyframeAnimations.degreeVec(-54.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("knee_front_left", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(57.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.25F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.25F, KeyframeAnimations.degreeVec(6.3364F, -2.1549F, -0.3088F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.5F, KeyframeAnimations.degreeVec(75.2987F, -1.676F, -0.2402F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(3.0F, KeyframeAnimations.degreeVec(57.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("bottom_2_front_left", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(59.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.75F, KeyframeAnimations.degreeVec(7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.75F, KeyframeAnimations.degreeVec(2.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.0F, KeyframeAnimations.degreeVec(23.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.25F, KeyframeAnimations.degreeVec(43.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.5F, KeyframeAnimations.degreeVec(69.89F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(3.0F, KeyframeAnimations.degreeVec(59.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.25F, KeyframeAnimations.degreeVec(14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(19.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.75F, KeyframeAnimations.degreeVec(24.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(-25.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.25F, KeyframeAnimations.degreeVec(-35.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.5F, KeyframeAnimations.degreeVec(-50.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.75F, KeyframeAnimations.degreeVec(-40.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.0F, KeyframeAnimations.degreeVec(-18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.25F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.5F, KeyframeAnimations.degreeVec(-6.98F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(3.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("knee_front_right", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.75F, KeyframeAnimations.degreeVec(12.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(84.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.25F, KeyframeAnimations.degreeVec(64.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.5F, KeyframeAnimations.degreeVec(69.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.75F, KeyframeAnimations.degreeVec(31.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.0F, KeyframeAnimations.degreeVec(-0.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(3.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("bottom_2_front_right", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.75F, KeyframeAnimations.degreeVec(48.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(65.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.75F, KeyframeAnimations.degreeVec(45.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.0F, KeyframeAnimations.degreeVec(13.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(3.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("tail_top", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(21.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.5F, KeyframeAnimations.degreeVec(21.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.0F, KeyframeAnimations.degreeVec(27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.5F, KeyframeAnimations.degreeVec(21.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(3.0F, KeyframeAnimations.degreeVec(27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.25F, KeyframeAnimations.degreeVec(-1.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.75F, KeyframeAnimations.degreeVec(12.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(17.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.25F, KeyframeAnimations.degreeVec(27.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.5F, KeyframeAnimations.degreeVec(34.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.75F, KeyframeAnimations.degreeVec(24.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.0F, KeyframeAnimations.degreeVec(13.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.25F, KeyframeAnimations.degreeVec(-16.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.5F, KeyframeAnimations.degreeVec(-32.8F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(3.0F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("knee_back_left", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.75F, KeyframeAnimations.degreeVec(-9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.0F, KeyframeAnimations.degreeVec(-31.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.25F, KeyframeAnimations.degreeVec(-37.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(3.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("bottom_2_back_left", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.25F, KeyframeAnimations.degreeVec(-3.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.75F, KeyframeAnimations.degreeVec(-13.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.25F, KeyframeAnimations.degreeVec(-20.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.75F, KeyframeAnimations.degreeVec(34.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.0F, KeyframeAnimations.degreeVec(83.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.25F, KeyframeAnimations.degreeVec(94.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(3.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("hoof_back_left", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(3.0F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(22.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.75F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(-24.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.25F, KeyframeAnimations.degreeVec(-32.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.5F, KeyframeAnimations.degreeVec(-34.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.75F, KeyframeAnimations.degreeVec(-22.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.0F, KeyframeAnimations.degreeVec(-13.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.25F, KeyframeAnimations.degreeVec(7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.5F, KeyframeAnimations.degreeVec(24.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(3.0F, KeyframeAnimations.degreeVec(22.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("knee_back_right", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-16.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.25F, KeyframeAnimations.degreeVec(7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(-58.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.75F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.25F, KeyframeAnimations.degreeVec(-12.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.5F, KeyframeAnimations.degreeVec(3.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.25F, KeyframeAnimations.degreeVec(-24.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(3.0F, KeyframeAnimations.degreeVec(-16.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("bottom_2_back_right", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(13.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.25F, KeyframeAnimations.degreeVec(14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(75.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.75F, KeyframeAnimations.degreeVec(51.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.5F, KeyframeAnimations.degreeVec(33.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(1.75F, KeyframeAnimations.degreeVec(21.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.25F, KeyframeAnimations.degreeVec(32.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(3.0F, KeyframeAnimations.degreeVec(13.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .addAnimation("hoof_back_right", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-16.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(0.25F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(2.25F, KeyframeAnimations.degreeVec(-9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                                        new Keyframe(3.0F, KeyframeAnimations.degreeVec(-16.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                                ))
                                .build();
                } else {
                        EquigenMod.LOGGER.error("Can't Find Animation for Genetic Horse: " + animation);
                        return AnimationDefinition.Builder.withLength(0f).build();
                }
        }
}
