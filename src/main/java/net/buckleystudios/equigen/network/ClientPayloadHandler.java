package net.buckleystudios.equigen.network;

import net.buckleystudios.equigen.network.packets.KeybindData;
import net.minecraft.network.chat.Component;
import net.neoforged.neoforge.network.handling.IPayloadContext;

public class ClientPayloadHandler {
    // Packet Handling from Client to Server
    // The following code is on SERVER LEVEL
    public static void handleDataOnMain(KeybindData keybindData, IPayloadContext context) {
        context.player().sendSystemMessage(Component.literal(
                "Player: " + keybindData.player() + " / Value: " + keybindData.value()));
    }
}
