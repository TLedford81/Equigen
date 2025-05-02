package net.buckleystudios.equigen.effect.GeneticHorse;

import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class DepressedEffect extends MobEffect {

    public int stressTickTimer;

    public DepressedEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
        if(livingEntity instanceof GeneticHorseEntity horse){
            this.stressTickTimer++;
            if(this.stressTickTimer >= 200){
                this.stressTickTimer = 0;
                horse.alterStress(1.0f);
            }
        } else {
            livingEntity.sendSystemMessage(Component.literal("You're not a horse, why do you have that effect?"));
            return false;
        }
        return super.applyEffectTick(livingEntity, amplifier);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }
}
