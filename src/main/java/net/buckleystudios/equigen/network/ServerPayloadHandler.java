package net.buckleystudios.equigen.network;

import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.server.level.ServerPlayer;
import net.neoforged.neoforge.network.handling.IPayloadContext;

public class ServerPayloadHandler {
    public static void handleSeatAnchor(final CTSSeatAnchor data, final IPayloadContext ctx) {
        ctx.enqueueWork(() -> {
            ServerPlayer player = (ServerPlayer) ctx.player();
            if (player == null) return;

            var level = player.serverLevel();
            var e = level.getEntity(data.entityId());
            if (e instanceof GeneticHorseEntity horse) {
                // Optional: validate player is riding/nearby the horse before accepting
                horse.setSeatLocal(data.offX(), data.offY(), data.offZ());
            }
        });
        // (no heavy work here; this runs on main via enqueueWork)
    }
}