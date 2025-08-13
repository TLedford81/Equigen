package net.buckleystudios.equigen.network;

import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.server.level.ServerPlayer;
import net.neoforged.neoforge.network.handling.IPayloadContext;

public class ServerPayloadHandler {
    public static void handleGaitChange(final GaitChangePayload payload, final IPayloadContext context) {
        context.enqueueWork(() -> {
            if (context.player() instanceof ServerPlayer player) {
                if(player.getVehicle() instanceof GeneticHorseEntity ghe){
                    ghe.alterGait(payload.gait());
                }
            }
        });
    }
}
