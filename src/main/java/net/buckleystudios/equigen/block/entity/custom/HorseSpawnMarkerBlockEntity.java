package net.buckleystudios.equigen.block.entity.custom;


import net.buckleystudios.equigen.block.entity.ModBlockEntities;
import net.buckleystudios.equigen.entity.ModEntities;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.custom.genetics.GeneticBreeds;
import net.buckleystudios.equigen.util.SpawnMarkerIndex;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class HorseSpawnMarkerBlockEntity extends BlockEntity {

    public HorseSpawnMarkerBlockEntity(BlockPos pos, BlockState blockState) {
        super(ModBlockEntities.HORSE_SPAWN_MARKER.get(), pos, blockState);
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
    }

    public GeneticHorseEntity SummonNewHorseForTrader(){
        if(this.getLevel() instanceof ServerLevel serverLevel) {
            GeneticHorseEntity entity = new GeneticHorseEntity(ModEntities.GENETIC_HORSE.get(), serverLevel);
            entity.HandleNewSpawnWithCustomGenetics(getTargetBreed(serverLevel, this.worldPosition), getTargetGenes());
            serverLevel.addFreshEntity(entity);
            BlockPos pos = this.getBlockPos();
            entity.moveTo(new Vec3(pos.getX(), pos.getY(), pos.getZ()));
            entity.finalizeSpawn(
                    serverLevel,
                    serverLevel.getCurrentDifficultyAt(entity.blockPosition()),
                    MobSpawnType.STRUCTURE,
                    null
            );

            float gender = entity.getGenetic("GENDER");

            List<String> maleNames = List.of(
                    "Hoover",
                    "Bingus",
                    "Georgicus III",
                    "Shadow",
                    "Cash",
                    "Duke",
                    "Dash",
                    "Biscuit",
                    "Bandit",
                    "Comet"
            );
            List<String> femaleNames = List.of(
                    "Bertha",
                    "Girtha",
                    "Chorsea",
                    "Taylor",
                    "Cookie",
                    "Stardust",
                    "Bella",
                    "Daisy",
                    "Spirit",
                    "Lady"
            );

            List<String> names = gender == 1 ? maleNames : femaleNames;

            Random random = new Random();
            entity.setCustomName(Component.literal(names.get(random.nextInt(0, names.size()))));
            return entity;
        }
        return null;
    }

    private GeneticBreeds getTargetBreed(ServerLevel level, BlockPos pos) {
        Map<GeneticBreeds, Integer> weightMap = new HashMap<>();
        if(level.getBiome(pos).is(Biomes.DESERT))
        {
            weightMap = Map.of(
                    GeneticBreeds.ARABIAN, 10
            );
            return GeneticBreeds.getRandomWeighted(weightMap, true);
        }

        return GeneticBreeds.getRandom();
    }

    private Map<String, Float> getTargetGenes() {
        return Map.of();
    }

    @Override
    public void onLoad() {
        super.onLoad();
        if (level instanceof ServerLevel serverLevel) {
            SpawnMarkerIndex.get(serverLevel).add(this.worldPosition);
        }
    }

    @Override
    public void setRemoved() {
        if (level instanceof ServerLevel serverLevel) {
            SpawnMarkerIndex.get(serverLevel).remove(this.worldPosition);
        }
        super.setRemoved();
    }
}
