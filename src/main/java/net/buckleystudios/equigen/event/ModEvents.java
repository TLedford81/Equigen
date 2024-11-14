package net.buckleystudios.equigen.event;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.command.TestCommand;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.RegisterCommandsEvent;
import net.neoforged.neoforge.server.command.ConfigCommand;

@EventBusSubscriber(modid = EquigenMod.MODID)
public class ModEvents {
    @SubscribeEvent
    public static void onCommandsRegister(RegisterCommandsEvent event){
        new TestCommand(event.getDispatcher());
        ConfigCommand.register(event.getDispatcher());
    }
}
