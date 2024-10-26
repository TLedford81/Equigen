package net.buckleystudios.equigen.sound;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, EquigenMod.MODID);

    //Sounds
    public static final DeferredHolder<SoundEvent, SoundEvent> TEST_SOUND = registerVariableSound("test_sound");
    public static final DeferredHolder<SoundEvent, SoundEvent> EGRET_AMBIENT = registerVariableSound("egret_ambient");
    public static final DeferredHolder<SoundEvent, SoundEvent> EGRET_HURT = registerVariableSound("egret_hurt");
    public static final DeferredHolder<SoundEvent, SoundEvent> EGRET_DEATH = registerVariableSound("egret_death");

    //Registers
    private static DeferredHolder<SoundEvent, SoundEvent> registerVariableSound(String name){
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, name)));
    }
}
