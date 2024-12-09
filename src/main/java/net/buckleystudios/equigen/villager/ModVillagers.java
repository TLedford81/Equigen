package net.buckleystudios.equigen.villager;

import com.google.common.collect.ImmutableSet;
import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.block.ModBlocks;
import net.buckleystudios.equigen.sound.ModSounds;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(BuiltInRegistries.POINT_OF_INTEREST_TYPE, EquigenMod.MODID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(BuiltInRegistries.VILLAGER_PROFESSION, EquigenMod.MODID);

    //POI TYPES
    public static final Holder<PoiType> TEST_POI = POI_TYPES.register("test_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.FOLIRITE_BLOCK.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    //VILLAGER PROFESSIONS
    public static final Holder<VillagerProfession> STABLEMASTER = VILLAGER_PROFESSIONS.register("stablemaster",
            () -> new VillagerProfession("stablemaster", poiTypeHolder -> poiTypeHolder.value() == TEST_POI.value(),
                    poiTypeHolder -> poiTypeHolder.value() == TEST_POI.value(), ImmutableSet.of(), ImmutableSet.of(),
                    ModSounds.TEST_SOUND.get()));
}
