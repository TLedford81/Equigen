package net.buckleystudios.equigen.network;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.custom.genetics.Genetics;
import net.buckleystudios.equigen.entity.custom.genetics.GeneticsHandler;
import net.buckleystudios.equigen.network.packets.GeneticData;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.neoforge.network.handling.IPayloadContext;

public class ServerPayloadHandler {
    // Packet Handling from Server to Client
    // The following code is on CLIENT LEVEL
    public static void handleGeneticDataOnClient(GeneticData geneticData, IPayloadContext context) {
        context.enqueueWork(() -> {
            Genetics gene;
            try {
                gene = Genetics.valueOf(geneticData.genetic());
            } catch (IllegalArgumentException e) {
                EquigenMod.LOGGER.error("GeneticData: unknown gene '{}'", geneticData.genetic());
                return;
            }

            var level = context.player().level();
            var e = level.getEntity(geneticData.entityID());

            if (!(e instanceof LivingEntity living)) {
                ClientGeneticSync.queue(geneticData.entityID(), gene, geneticData.value());
                return;
            }

            GeneticsHandler.setEntityGenetic(living, gene, geneticData.value());
        });
    }
}
