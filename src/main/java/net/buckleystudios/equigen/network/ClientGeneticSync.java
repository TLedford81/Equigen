package net.buckleystudios.equigen.network;

import net.buckleystudios.equigen.entity.custom.genetics.Genetics;
import net.buckleystudios.equigen.entity.custom.genetics.GeneticsHandler;
import net.minecraft.world.entity.LivingEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientGeneticSync {
    private static final Map<Integer, List<Entry>> PENDING = new HashMap<>();
    private static final int MAX_TICKS = 40;

    private record Entry(Genetics gene, float value, int ticksLeft) {}

    public static void queue(int entityId, Genetics gene, float value) {
        PENDING.computeIfAbsent(entityId, k -> new ArrayList<>())
                .add(new Entry(gene, value, MAX_TICKS));
    }

    public static void clientTick(net.minecraft.client.multiplayer.ClientLevel level) {
        var it = PENDING.entrySet().iterator();
        while (it.hasNext()) {
            var entry = it.next();
            int id = entry.getKey();

            var e = level.getEntity(id);
            if (e instanceof LivingEntity living) {
                for (Entry g : entry.getValue()) {
                    GeneticsHandler.setEntityGenetic(living, g.gene(), g.value());
                }
                it.remove();
                continue;
            }

            // decrement
            List<Entry> next = new ArrayList<>();
            for (Entry g : entry.getValue()) {
                if (g.ticksLeft() > 1) next.add(new Entry(g.gene(), g.value(), g.ticksLeft() - 1));
            }
            if (next.isEmpty()) it.remove();
            else entry.setValue(next);
        }
    }
}