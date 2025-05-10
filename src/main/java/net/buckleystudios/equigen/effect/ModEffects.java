package net.buckleystudios.equigen.effect;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.effect.GeneticHorse.*;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, EquigenMod.MODID);

    public static final Holder<MobEffect> STARVING_EFFECT = MOB_EFFECTS.register("starving",
            () -> new StarvingEffect(MobEffectCategory.HARMFUL, 0x36ebab));

    public static final Holder<MobEffect> DEHYDRATED_EFFECT = MOB_EFFECTS.register("dehydrated",
            () -> new DehydratedEffect(MobEffectCategory.HARMFUL, 0x2986cc));

    public static final Holder<MobEffect> DEPRESSED_EFFECT = MOB_EFFECTS.register("depressed",
            () -> new DepressedEffect(MobEffectCategory.HARMFUL, 0x444444));

    public static final Holder<MobEffect> FILTHY_EFFECT = MOB_EFFECTS.register("filthy",
            () -> new FilthyEffect(MobEffectCategory.HARMFUL, 0xb45f06));

    public static final Holder<MobEffect> STRESSED_EFFECT = MOB_EFFECTS.register("stressed",
            () -> new StressedEffect(MobEffectCategory.HARMFUL, 0xa64d79));

}
