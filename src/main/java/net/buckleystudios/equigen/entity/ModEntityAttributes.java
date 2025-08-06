package net.buckleystudios.equigen.entity;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEntityAttributes {

    public static final DeferredRegister<Attribute> ATTRIBUTES = DeferredRegister.create(Registries.ATTRIBUTE, EquigenMod.MODID);

    public static final DeferredHolder<Attribute, Attribute> MAX_HUNGER = register("max_hunger", 20, 0, 20);
    public static final DeferredHolder<Attribute, Attribute> MAX_THIRST = register("max_thirst", 20, 0, 20);
    public static final DeferredHolder<Attribute, Attribute> MAX_HAPPINESS = register("max_happiness", 20, 0, 20);
    public static final DeferredHolder<Attribute, Attribute> MAX_STRESS = register("max_stress", 20, 0, 20);

    public static final DeferredHolder<Attribute, Attribute> MAX_SKILL_SPEED = register("max_skill_speed", 10, 1, 20);
    public static final DeferredHolder<Attribute, Attribute> MAX_SKILL_STRENGTH = register("max_skill_strength", 10, 1, 20);
    public static final DeferredHolder<Attribute, Attribute> MAX_SKILL_JUMP = register("max_skill_jump", 10, 1, 20);
    public static final DeferredHolder<Attribute, Attribute> MAX_SKILL_ENDURANCE = register("max_skill_endurance", 10, 1, 20);
    public static final DeferredHolder<Attribute, Attribute> MAX_SKILL_AGILITY = register("max_skill_agility", 10, 1, 20);


    private static DeferredHolder<Attribute, Attribute> register(String name, double defaultValue, double min, double max){
        return ATTRIBUTES.register(name, () -> new RangedAttribute("attribute." + EquigenMod.MODID + "." + name, defaultValue, min, max).setSyncable(true));
    }
}
