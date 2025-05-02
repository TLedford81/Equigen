package net.buckleystudios.equigen.effect;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.effect.GeneticHorse.StarvingEffect;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, EquigenMod.MODID);

    public static final Holder<MobEffect> STARVING_EFFECT = MOB_EFFECTS.register("starving",
            () -> new StarvingEffect(MobEffectCategory.HARMFUL, 0x36ebab).addAttributeModifier(Attributes.MOVEMENT_SPEED,
                    ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "starving"), 0.75f, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

}
