package net.buckleystudios.equigen.entity;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEntityAttributes {

    public static final DeferredRegister<Attribute> ATTRIBUTES = DeferredRegister.create(Registries.ATTRIBUTE, EquigenMod.MODID);

    public static final DeferredHolder<Attribute, Attribute> HUNGER = register("hunger", 20, 0, 20);

    private static DeferredHolder<Attribute, Attribute> register(String name, double defaultValue, double min, double max){
        return ATTRIBUTES.register(name, () -> new RangedAttribute("attribute." + EquigenMod.MODID + "." + name, defaultValue, min, max).setSyncable(true));
    }
}
