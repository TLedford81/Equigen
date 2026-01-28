package net.buckleystudios.equigen.util;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.ChunkPos;

import java.util.*;

public final class SpawnMarkerIndex {
    private static final Map<ServerLevel, SpawnMarkerIndex> BY_LEVEL = new HashMap<>();

    public static SpawnMarkerIndex get(ServerLevel level) {
        return BY_LEVEL.computeIfAbsent(level, l -> new SpawnMarkerIndex());
    }

    private final Map<ChunkPos, LongSet> markersByChunk = new HashMap<>();

    public void add(BlockPos pos) {
        ChunkPos cp = new ChunkPos(pos);
        markersByChunk.computeIfAbsent(cp, k -> new LongOpenHashSet()).add(pos.asLong());
    }

    public void remove(BlockPos pos) {
        ChunkPos cp = new ChunkPos(pos);
        LongSet set = markersByChunk.get(cp);
        if (set == null) return;
        if (set.remove(pos.asLong()) && set.isEmpty()) markersByChunk.remove(cp);
    }

    public List<BlockPos> getWithinRadius(ServerLevel level, BlockPos center, int radius) {
        int r2 = radius * radius;

        int minChunkX = (center.getX() - radius) >> 4;
        int maxChunkX = (center.getX() + radius) >> 4;
        int minChunkZ = (center.getZ() - radius) >> 4;
        int maxChunkZ = (center.getZ() + radius) >> 4;

        List<BlockPos> out = new ArrayList<>();

        for (int cx = minChunkX; cx <= maxChunkX; cx++) {
            for (int cz = minChunkZ; cz <= maxChunkZ; cz++) {
                if (!level.hasChunk(cx, cz)) continue; // don't touch unloaded chunks

                ChunkPos cp = new ChunkPos(cx, cz);
                LongSet set = markersByChunk.get(cp);
                if (set == null || set.isEmpty()) continue;

                for (long packed : set) {
                    BlockPos p = BlockPos.of(packed);
                    if (p.distSqr(center) <= r2) out.add(p);
                }
            }
        }
        return out;
    }
}