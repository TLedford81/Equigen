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

    //Registers
    private static DeferredHolder<SoundEvent, SoundEvent> registerVariableSound(String name){
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(EquigenMod.MODID, name)));
    }
}
