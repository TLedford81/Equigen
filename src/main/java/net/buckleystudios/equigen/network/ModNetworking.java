package net.buckleystudios.equigen.network;

import net.buckleystudios.equigen.EquigenMod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;

@EventBusSubscriber(modid = EquigenMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModNetworking {

    @SubscribeEvent
    public static void register(final RegisterPayloadHandlersEvent event) {
        // Bump this string if you ever change your net protocol in a breaking way
        final PayloadRegistrar registrar = event.registrar("1");

        // C -> S only
        registrar.playToServer(
                CTSSeatAnchor.TYPE,
                CTSSeatAnchor.STREAM_CODEC,
                ServerPayloadHandler::handleSeatAnchor
        );
    }
}