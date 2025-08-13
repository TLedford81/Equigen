package net.buckleystudios.equigen.event;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.ModEntities;
import net.buckleystudios.equigen.entity.ModEntityAttributes;
import net.buckleystudios.equigen.entity.client.*;
import net.buckleystudios.equigen.entity.custom.EgretEntity;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.custom.PillagerKingEntity;
import net.buckleystudios.equigen.entity.custom.TestEntityEntity;
import net.buckleystudios.equigen.network.GaitChangePayload;
import net.buckleystudios.equigen.network.ServerPayloadHandler;
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
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;

@EventBusSubscriber(modid = EquigenMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.PILLAGER_KING, PillagerKingModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.EGRET, EgretModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.GENETIC_HORSE, GeneticHorseModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TEST_ENTITY, TestEntityModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.SODIUM_GRENADE, SodiumGrenadeProjectileModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.LASSO, SodiumGrenadeProjectileModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.PILLAGER_KING.get(), PillagerKingEntity.createAttributes().build());
        event.put(ModEntities.EGRET.get(), EgretEntity.createAttributes().build());
        event.put(ModEntities.GENETIC_HORSE.get(), GeneticHorseEntity.createAttributes().build());
        event.put(ModEntities.TEST_ENTITY.get(), TestEntityEntity.createAttributes().build());
    }

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

    @SubscribeEvent
    public static void registerPayloads(RegisterPayloadHandlersEvent event) {
        PayloadRegistrar registrar = event.registrar("1");

        registrar.playToServer(
                GaitChangePayload.TYPE,
                GaitChangePayload.STREAM_CODEC,
                ServerPayloadHandler::handleGaitChange
        );
    }
}
