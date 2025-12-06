package net.buckleystudios.equigen.entity.client.genetic_horse.animations;

import com.google.common.collect.Maps;
import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record ModAnimationDefinition(float lengthInSeconds, boolean looping, Map<String, List<AnimationChannel>> boneAnimations) {
    @OnlyIn(Dist.CLIENT)
    public static class Builder {
        private final float length;
        private final Map<String, List<AnimationChannel>> animationByBone = Maps.newHashMap();
        private boolean looping;
        private String part;
        private int legID = 0;

        public static ModAnimationDefinition.Builder withLength(float lengthInSeconds) {
            return new ModAnimationDefinition.Builder(lengthInSeconds);
        }

        private Builder(float lengthInSeconds) {
            this.length = lengthInSeconds;
        }

        public ModAnimationDefinition.Builder looping() {
            this.looping = true;
            return this;
        }

        public ModAnimationDefinition.Builder addAnimation(String bonePrefix, String boneSuffix, int legID, AnimationChannel animationChannel) {
            if(this.part.startsWith(bonePrefix) && legID == this.legID) {
                this.animationByBone.computeIfAbsent(this.part + boneSuffix, p_329694_ -> new ArrayList<>()).add(animationChannel);
            }
            return this;
        }

        public ModAnimationDefinition.Builder addAnimation(String bonePrefix, int legID, AnimationChannel animationChannel) {
            return this.addAnimation(bonePrefix, "", legID, animationChannel);
        }

        public ModAnimationDefinition.Builder addAnimation(String bonePrefix, String boneSuffix, AnimationChannel animationChannel) {
            return this.addAnimation(bonePrefix, boneSuffix, 0, animationChannel);
        }


        public ModAnimationDefinition.Builder addAnimation(String bonePrefix, AnimationChannel animationChannel) {
            return this.addAnimation(bonePrefix, "", 0, animationChannel);
        }

        public ModAnimationDefinition.Builder setPart(String part, int legID) {
            this.part = part;
            this.legID = legID;
            return this;
        }

        public AnimationDefinition build() {
            return new AnimationDefinition(this.length, this.looping, this.animationByBone);
        }
    }
}
