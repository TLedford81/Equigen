package net.buckleystudios.equigen.event;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.ModEntities;
import net.buckleystudios.equigen.entity.client.*;
import net.buckleystudios.equigen.entity.client.egret.EgretModel;
import net.buckleystudios.equigen.entity.client.genetic_horse.GeneticHorseModelBase;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.backs.*;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.bottomlegs.*;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.chests.*;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.ears.ears;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.heads.*;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.hips.*;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.hooves.hoof_average;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.hooves.hoof_large;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.knees.knees;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.necks.arched.*;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.necks.ewed.*;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.necks.straight.*;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.necks.swan.*;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.stomachs.*;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.tails.*;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.topbacklegs.*;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.topfrontlegs.*;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.withers.withers_average;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.withers.withers_lean;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.withers.withers_muscular;
import net.buckleystudios.equigen.entity.client.pillager_king.PillagerKingModel;
import net.buckleystudios.equigen.entity.client.projectile.SodiumGrenadeProjectileModel;
import net.buckleystudios.equigen.entity.client.test_entity.TestEntityModel;
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
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

@EventBusSubscriber(modid = EquigenMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.PILLAGER_KING, PillagerKingModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.EGRET, EgretModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.GENETIC_HORSE, GeneticHorseModelBase::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.GENETIC_HORSE_MARKINGS, GeneticHorseModelBase::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TEST_ENTITY, TestEntityModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.SODIUM_GRENADE, SodiumGrenadeProjectileModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.LASSO, SodiumGrenadeProjectileModel::createBodyLayer);

        event.registerLayerDefinition(ModModelLayers.BASE, GeneticHorseModelBase::createBodyLayer);
        // Backs
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
// Back Top Legs
        event.registerLayerDefinition(ModModelLayers.TOP_BACK_LEGS_THIN_SHORT_1, top_back_legs_thin_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_BACK_LEGS_THIN_SHORT_2, top_back_legs_thin_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_BACK_LEGS_THIN_AVERAGE_1, top_back_legs_thin_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_BACK_LEGS_THIN_AVERAGE_2, top_back_legs_thin_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_BACK_LEGS_THIN_LONG_1, top_back_legs_thin_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_BACK_LEGS_THIN_LONG_2, top_back_legs_thin_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_BACK_LEGS_AVERAGE_SHORT_1, top_back_legs_average_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_BACK_LEGS_AVERAGE_SHORT_2, top_back_legs_average_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_BACK_LEGS_AVERAGE_AVERAGE_1, top_back_legs_average_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_BACK_LEGS_AVERAGE_AVERAGE_2, top_back_legs_average_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_BACK_LEGS_AVERAGE_LONG_1, top_back_legs_average_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_BACK_LEGS_AVERAGE_LONG_2, top_back_legs_average_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_BACK_LEGS_THICK_SHORT_1, top_back_legs_thick_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_BACK_LEGS_THICK_SHORT_2, top_back_legs_thick_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_BACK_LEGS_THICK_AVERAGE_1, top_back_legs_thick_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_BACK_LEGS_THICK_AVERAGE_2, top_back_legs_thick_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_BACK_LEGS_THICK_LONG_1, top_back_legs_thick_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_BACK_LEGS_THICK_LONG_2, top_back_legs_thick_long_2::createBodyLayer);
        
        // Front Top Legs
        event.registerLayerDefinition(ModModelLayers.TOP_FRONT_LEGS_AVERAGE_SHORT_1, top_front_legs_average_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_FRONT_LEGS_AVERAGE_SHORT_2, top_front_legs_average_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_FRONT_LEGS_AVERAGE_SHORT_3, top_front_legs_average_short_3::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_FRONT_LEGS_AVERAGE_AVERAGE_1, top_front_legs_average_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_FRONT_LEGS_AVERAGE_AVERAGE_2, top_front_legs_average_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_FRONT_LEGS_AVERAGE_AVERAGE_3, top_front_legs_average_average_3::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_FRONT_LEGS_AVERAGE_LONG_1, top_front_legs_average_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_FRONT_LEGS_AVERAGE_LONG_2, top_front_legs_average_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_FRONT_LEGS_AVERAGE_LONG_3, top_front_legs_average_long_3::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_FRONT_LEGS_THICK_SHORT_1, top_front_legs_thick_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_FRONT_LEGS_THICK_SHORT_2, top_front_legs_thick_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_FRONT_LEGS_THICK_SHORT_3, top_front_legs_thick_short_3::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_FRONT_LEGS_THICK_AVERAGE_1, top_front_legs_thick_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_FRONT_LEGS_THICK_AVERAGE_2, top_front_legs_thick_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_FRONT_LEGS_THICK_AVERAGE_3, top_front_legs_thick_average_3::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_FRONT_LEGS_THICK_LONG_1, top_front_legs_thick_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_FRONT_LEGS_THICK_LONG_2, top_front_legs_thick_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TOP_FRONT_LEGS_THICK_LONG_3, top_front_legs_thick_long_3::createBodyLayer);

        //Chests
        event.registerLayerDefinition(ModModelLayers.CHEST_LEAN_SMALL_1 , chest_lean_small_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_LEAN_SMALL_2 , chest_lean_small_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_LEAN_AVERAGE_1 , chest_lean_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_LEAN_AVERAGE_2 , chest_lean_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_LEAN_LARGE_1 , chest_lean_large_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_LEAN_LARGE_2 , chest_lean_large_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_AVERAGE_SMALL_1 , chest_average_small_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_AVERAGE_SMALL_2 , chest_average_small_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_AVERAGE_AVERAGE_1 , chest_average_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_AVERAGE_AVERAGE_2 , chest_average_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_AVERAGE_LARGE_1 , chest_average_large_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_AVERAGE_LARGE_2 , chest_average_large_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_MUSCULAR_SMALL_1 , chest_muscular_small_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_MUSCULAR_SMALL_2 , chest_muscular_small_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_MUSCULAR_AVERAGE_1 , chest_muscular_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_MUSCULAR_AVERAGE_2 , chest_muscular_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_MUSCULAR_LARGE_1 , chest_muscular_large_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_MUSCULAR_LARGE_2 , chest_muscular_large_2::createBodyLayer);

        // Necks
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_ARCHED_SHORT_1, neck_lean_arched_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_ARCHED_SHORT_2, neck_lean_arched_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_ARCHED_AVERAGE_1, neck_lean_arched_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_ARCHED_AVERAGE_2, neck_lean_arched_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_ARCHED_LONG_1, neck_lean_arched_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_ARCHED_LONG_2, neck_lean_arched_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_EWED_SHORT_1, neck_lean_ewed_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_EWED_SHORT_2, neck_lean_ewed_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_EWED_AVERAGE_1, neck_lean_ewed_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_EWED_AVERAGE_2, neck_lean_ewed_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_EWED_LONG_1, neck_lean_ewed_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_EWED_LONG_2, neck_lean_ewed_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_STRAIGHT_SHORT_1, neck_lean_straight_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_STRAIGHT_SHORT_2, neck_lean_straight_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_STRAIGHT_AVERAGE_1, neck_lean_straight_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_STRAIGHT_AVERAGE_2, neck_lean_straight_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_STRAIGHT_LONG_1, neck_lean_straight_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_STRAIGHT_LONG_2, neck_lean_straight_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_SWAN_SHORT_1, neck_lean_swan_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_SWAN_SHORT_2, neck_lean_swan_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_SWAN_AVERAGE_1, neck_lean_swan_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_SWAN_AVERAGE_2, neck_lean_swan_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_SWAN_LONG_1, neck_lean_swan_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_SWAN_LONG_2, neck_lean_swan_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_ARCHED_SHORT_1, neck_average_arched_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_ARCHED_SHORT_2, neck_average_arched_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_ARCHED_AVERAGE_1, neck_average_arched_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_ARCHED_AVERAGE_2, neck_average_arched_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_ARCHED_LONG_1, neck_average_arched_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_ARCHED_LONG_2, neck_average_arched_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_EWED_SHORT_1, neck_average_ewed_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_EWED_SHORT_2, neck_average_ewed_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_EWED_AVERAGE_1, neck_average_ewed_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_EWED_AVERAGE_2, neck_average_ewed_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_EWED_LONG_1, neck_average_ewed_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_EWED_LONG_2, neck_average_ewed_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_STRAIGHT_SHORT_1, neck_average_straight_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_STRAIGHT_SHORT_2, neck_average_straight_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_STRAIGHT_AVERAGE_1, neck_average_straight_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_STRAIGHT_AVERAGE_2, neck_average_straight_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_STRAIGHT_LONG_1, neck_average_straight_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_STRAIGHT_LONG_2, neck_average_straight_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_SWAN_SHORT_1, neck_average_swan_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_SWAN_SHORT_2, neck_average_swan_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_SWAN_AVERAGE_1, neck_average_swan_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_SWAN_AVERAGE_2, neck_average_swan_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_SWAN_LONG_1, neck_average_swan_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_SWAN_LONG_2, neck_average_swan_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_ARCHED_SHORT_1, neck_muscular_arched_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_ARCHED_SHORT_2, neck_muscular_arched_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_ARCHED_AVERAGE_1, neck_muscular_arched_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_ARCHED_AVERAGE_2, neck_muscular_arched_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_ARCHED_LONG_1, neck_muscular_arched_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_ARCHED_LONG_2, neck_muscular_arched_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_EWED_SHORT_1, neck_muscular_ewed_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_EWED_SHORT_2, neck_muscular_ewed_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_EWED_AVERAGE_1, neck_muscular_ewed_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_EWED_AVERAGE_2, neck_muscular_ewed_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_EWED_LONG_1, neck_muscular_ewed_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_EWED_LONG_2, neck_muscular_ewed_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_STRAIGHT_SHORT_1, neck_muscular_straight_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_STRAIGHT_SHORT_2, neck_muscular_straight_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_STRAIGHT_AVERAGE_1, neck_muscular_straight_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_STRAIGHT_AVERAGE_2, neck_muscular_straight_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_STRAIGHT_LONG_1, neck_muscular_straight_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_STRAIGHT_LONG_2, neck_muscular_straight_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_SWAN_SHORT_1, neck_muscular_swan_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_SWAN_SHORT_2, neck_muscular_swan_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_SWAN_AVERAGE_1, neck_muscular_swan_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_SWAN_AVERAGE_2, neck_muscular_swan_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_SWAN_LONG_1, neck_muscular_swan_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_SWAN_LONG_2, neck_muscular_swan_long_2::createBodyLayer);

        // Ears
        event.registerLayerDefinition(ModModelLayers.EARS, ears::createBodyLayer);

        // Heads
        event.registerLayerDefinition(ModModelLayers.HEAD_DISHED_LEAN, head_dished_lean::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HEAD_DISHED_AVERAGE, head_dished_average::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HEAD_DISHED_MUSCULAR, head_dished_muscular::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HEAD_ROMAN_LEAN, head_roman_lean::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HEAD_ROMAN_AVERAGE, head_roman_average::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HEAD_ROMAN_MUSCULAR, head_roman_muscular::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HEAD_STOCKY_LEAN, head_stocky_lean::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HEAD_STOCKY_AVERAGE, head_stocky_average::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HEAD_STOCKY_MUSCULAR, head_stocky_muscular::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HEAD_STRAIGHT_LEAN, head_straight_lean::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HEAD_STRAIGHT_AVERAGE, head_straight_average::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HEAD_STRAIGHT_MUSCULAR, head_straight_muscular::createBodyLayer);

        //Hips
        event.registerLayerDefinition(ModModelLayers.HIPS_LEAN_SMALL_1, hips_lean_small_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HIPS_LEAN_SMALL_2, hips_lean_small_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HIPS_LEAN_AVERAGE_1, hips_lean_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HIPS_LEAN_AVERAGE_2, hips_lean_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HIPS_LEAN_LARGE_1, hips_lean_large_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HIPS_LEAN_LARGE_2, hips_lean_large_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HIPS_AVERAGE_SMALL_1, hips_average_small_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HIPS_AVERAGE_SMALL_2, hips_average_small_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HIPS_AVERAGE_AVERAGE_1, hips_average_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HIPS_AVERAGE_AVERAGE_2, hips_average_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HIPS_AVERAGE_LARGE_1, hips_average_large_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HIPS_AVERAGE_LARGE_2, hips_average_large_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HIPS_MUSCULAR_SMALL_1, hips_muscular_small_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HIPS_MUSCULAR_SMALL_2, hips_muscular_small_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HIPS_MUSCULAR_AVERAGE_1, hips_muscular_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HIPS_MUSCULAR_AVERAGE_2, hips_muscular_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HIPS_MUSCULAR_LARGE_1, hips_muscular_large_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HIPS_MUSCULAR_LARGE_2, hips_muscular_large_2::createBodyLayer);

        //Stomachs

        event.registerLayerDefinition(ModModelLayers.STOMACH_AVERAGE_AVERAGE_HIGH, stomach_average_average_high::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_AVERAGE_AVERAGE_LOW, stomach_average_average_low::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_AVERAGE_AVERAGE_MEDIUM, stomach_average_average_medium::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_AVERAGE_LONG_HIGH, stomach_average_long_high::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_AVERAGE_LONG_LOW, stomach_average_long_low::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_AVERAGE_LONG_MEDIUM, stomach_average_long_medium::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_AVERAGE_SHORT_HIGH, stomach_average_short_high::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_AVERAGE_SHORT_LOW, stomach_average_short_low::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_AVERAGE_SHORT_MEDIUM, stomach_average_short_medium::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_LEAN_AVERAGE_HIGH, stomach_lean_average_high::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_LEAN_AVERAGE_LOW, stomach_lean_average_low::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_LEAN_AVERAGE_MEDIUM, stomach_lean_average_medium::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_LEAN_LONG_HIGH, stomach_lean_long_high::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_LEAN_LONG_LOW, stomach_lean_long_low::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_LEAN_LONG_MEDIUM, stomach_lean_long_medium::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_LEAN_SHORT_HIGH, stomach_lean_short_high::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_LEAN_SHORT_LOW, stomach_lean_short_low::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_LEAN_SHORT_MEDIUM, stomach_lean_short_medium::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_MUSCULAR_AVERAGE_HIGH, stomach_muscular_average_high::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_MUSCULAR_AVERAGE_LOW, stomach_muscular_average_low::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_MUSCULAR_AVERAGE_MEDIUM, stomach_muscular_average_medium::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_MUSCULAR_LONG_HIGH, stomach_muscular_long_high::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_MUSCULAR_LONG_LOW, stomach_muscular_long_low::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_MUSCULAR_LONG_MEDIUM, stomach_muscular_long_medium::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_MUSCULAR_SHORT_HIGH, stomach_muscular_short_high::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_MUSCULAR_SHORT_LOW, stomach_muscular_short_low::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.STOMACH_MUSCULAR_SHORT_MEDIUM, stomach_muscular_short_medium::createBodyLayer);

        //Tails
        event.registerLayerDefinition(ModModelLayers.TAIL_AVERAGE_AVERAGE, tail_average_average::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TAIL_AVERAGE_SHORT, tail_average_short::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TAIL_AVERAGE_LONG, tail_average_long::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TAIL_THICK_AVERAGE, tail_thick_average::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TAIL_THICK_SHORT, tail_thick_short::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TAIL_THICK_LONG, tail_thick_long::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TAIL_THIN_AVERAGE, tail_thin_average::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TAIL_THIN_SHORT, tail_thin_short::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TAIL_THIN_LONG, tail_thin_long::createBodyLayer);

        //Withers
        event.registerLayerDefinition(ModModelLayers.WITHERS_AVERAGE, withers_average::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.WITHERS_LEAN, withers_lean::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.WITHERS_MUSCULAR, withers_muscular::createBodyLayer);

        //Hooves
        event.registerLayerDefinition(ModModelLayers.HOOF_AVERAGE, hoof_average::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HOOF_LARGE, hoof_large::createBodyLayer);


        //Knees
        event.registerLayerDefinition(ModModelLayers.KNEES, knees::createBodyLayer);

        //Bottom Legs
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_THIN_SHORT_1, bottom_legs_thin_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_THIN_SHORT_2, bottom_legs_thin_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_THIN_SHORT_3, bottom_legs_thin_short_3::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_THIN_AVERAGE_1, bottom_legs_thin_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_THIN_AVERAGE_2, bottom_legs_thin_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_THIN_AVERAGE_3, bottom_legs_thin_average_3::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_THIN_LONG_1, bottom_legs_thin_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_THIN_LONG_2, bottom_legs_thin_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_THIN_LONG_3, bottom_legs_thin_long_3::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_AVERAGE_SHORT_1, bottom_legs_average_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_AVERAGE_SHORT_2, bottom_legs_average_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_AVERAGE_SHORT_3, bottom_legs_average_short_3::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_AVERAGE_AVERAGE_1, bottom_legs_average_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_AVERAGE_AVERAGE_2, bottom_legs_average_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_AVERAGE_AVERAGE_3, bottom_legs_average_average_3::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_AVERAGE_LONG_1, bottom_legs_average_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_AVERAGE_LONG_2, bottom_legs_average_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_AVERAGE_LONG_3, bottom_legs_average_long_3::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_THICK_SHORT_1, bottom_legs_thick_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_THICK_SHORT_2, bottom_legs_thick_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_THICK_SHORT_3, bottom_legs_thick_short_3::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_THICK_AVERAGE_1, bottom_legs_thick_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_THICK_AVERAGE_2, bottom_legs_thick_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_THICK_AVERAGE_3, bottom_legs_thick_average_3::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_THICK_LONG_1, bottom_legs_thick_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_THICK_LONG_2, bottom_legs_thick_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOTTOM_LEGS_THICK_LONG_3, bottom_legs_thick_long_3::createBodyLayer);




    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.PILLAGER_KING.get(), PillagerKingEntity.createAttributes().build());
        event.put(ModEntities.EGRET.get(), EgretEntity.createAttributes().build());
        event.put(ModEntities.GENETIC_HORSE.get(), GeneticHorseEntity.createAttributes().build());
        event.put(ModEntities.TEST_ENTITY.get(), TestEntityEntity.createAttributes().build());
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
