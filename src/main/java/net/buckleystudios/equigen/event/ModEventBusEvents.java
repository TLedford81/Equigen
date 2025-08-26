package net.buckleystudios.equigen.event;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.ModEntities;
import net.buckleystudios.equigen.entity.ModEntityAttributes;
import net.buckleystudios.equigen.entity.client.*;
import net.buckleystudios.equigen.entity.client.parts.partmodels.backs.*;
import net.buckleystudios.equigen.entity.custom.EgretEntity;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.custom.PillagerKingEntity;
import net.buckleystudios.equigen.entity.custom.TestEntityEntity;
import net.buckleystudios.equigen.util.ModKeyMappings;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.levelgen.Heightmap;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeModificationEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

@EventBusSubscriber(modid = EquigenMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.PILLAGER_KING, PillagerKingModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.EGRET, EgretModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.GENETIC_HORSE, GeneticHorseModelBase::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TEST_ENTITY, TestEntityModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.SODIUM_GRENADE, SodiumGrenadeProjectileModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.LASSO, SodiumGrenadeProjectileModel::createBodyLayer);

        event.registerLayerDefinition(ModModelLayers.BASE, GeneticHorseModelBase::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_1, Back_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_2, Back_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_3, Back_3::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEAN_SHORT_THIN, back_lean_short_thin::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEAN_SHORT_AVERAGE, back_lean_short_average::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEAN_SHORT_THICK, back_lean_short_thick::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEAN_AVERAGE_THIN, back_lean_average_thin::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEAN_AVERAGE_AVERAGE, back_lean_average_average::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEAN_AVERAGE_THICK, back_lean_average_thick::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEAN_LONG_THIN, back_lean_long_thin::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEAN_LONG_AVERAGE, back_lean_long_average::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEAN_LONG_THICK, back_lean_long_thick::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_AVERAGE_SHORT_THIN, back_average_short_thin::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_AVERAGE_SHORT_AVERAGE, back_average_short_average::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_AVERAGE_SHORT_THICK, back_average_short_thick::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_AVERAGE_AVERAGE_THIN, back_average_average_thin::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_AVERAGE_AVERAGE_AVERAGE, back_average_average_average::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_AVERAGE_AVERAGE_THICK, back_average_average_thick::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_AVERAGE_LONG_THIN, back_average_long_thin::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_AVERAGE_LONG_AVERAGE, back_average_long_average::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_AVERAGE_LONG_THICK, back_average_long_thick::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_MUSCULAR_SHORT_THIN, back_muscular_short_thin::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_MUSCULAR_SHORT_AVERAGE, back_muscular_short_average::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_MUSCULAR_SHORT_THICK, back_muscular_short_thick::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_MUSCULAR_AVERAGE_THIN, back_muscular_average_thin::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_MUSCULAR_AVERAGE_AVERAGE, back_muscular_average_average::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_MUSCULAR_AVERAGE_THICK, back_muscular_average_thick::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_MUSCULAR_LONG_THIN, back_muscular_long_thin::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_MUSCULAR_LONG_AVERAGE, back_muscular_long_average::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_MUSCULAR_LONG_THICK, back_muscular_long_thick::createBodyLayer);




    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.PILLAGER_KING.get(), PillagerKingEntity.createAttributes().build());
        event.put(ModEntities.EGRET.get(), EgretEntity.createAttributes().build());
        event.put(ModEntities.GENETIC_HORSE.get(), GeneticHorseEntity.createAttributes().build());
        event.put(ModEntities.TEST_ENTITY.get(), TestEntityEntity.createAttributes().build());
    }

    @SubscribeEvent
    public static void addAttributes(EntityAttributeModificationEvent event) {
        event.add(ModEntities.GENETIC_HORSE.get(), ModEntityAttributes.MAX_HUNGER);
    }

    @SubscribeEvent
    public static void registerSpawnPlacements(RegisterSpawnPlacementsEvent event) {
        event.register(ModEntities.EGRET.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(ModEntities.GENETIC_HORSE.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
    }

    @SubscribeEvent
    public static void registerBindings(RegisterKeyMappingsEvent event) {
        event.register(ModKeyMappings.GAIT_UP.get());
        event.register(ModKeyMappings.GAIT_DOWN.get());
    }
}
