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
        event.registerLayerDefinition(ModModelLayers.BACK_LEG_TOP_THIN_SHORT_1, net.buckleystudios.equigen.entity.client.parts.backtoplegs.back_leg_top_thin_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEG_TOP_THIN_SHORT_2, net.buckleystudios.equigen.entity.client.parts.backtoplegs.back_leg_top_thin_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEG_TOP_THIN_AVERAGE_1, net.buckleystudios.equigen.entity.client.parts.backtoplegs.back_leg_top_thin_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEG_TOP_THIN_AVERAGE_2, net.buckleystudios.equigen.entity.client.parts.backtoplegs.back_leg_top_thin_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEG_TOP_THIN_LONG_1, net.buckleystudios.equigen.entity.client.parts.backtoplegs.back_leg_top_thin_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEG_TOP_THIN_LONG_2, net.buckleystudios.equigen.entity.client.parts.backtoplegs.back_leg_top_thin_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEG_TOP_AVERAGE_SHORT_1, net.buckleystudios.equigen.entity.client.parts.backtoplegs.back_leg_top_average_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEG_TOP_AVERAGE_SHORT_2, net.buckleystudios.equigen.entity.client.parts.backtoplegs.back_leg_top_average_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEG_TOP_AVERAGE_AVERAGE_1, net.buckleystudios.equigen.entity.client.parts.backtoplegs.back_leg_top_average_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEG_TOP_AVERAGE_AVERAGE_2, net.buckleystudios.equigen.entity.client.parts.backtoplegs.back_leg_top_average_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEG_TOP_AVERAGE_LONG_1, net.buckleystudios.equigen.entity.client.parts.backtoplegs.back_leg_top_average_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEG_TOP_AVERAGE_LONG_2, net.buckleystudios.equigen.entity.client.parts.backtoplegs.back_leg_top_average_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEG_TOP_THICK_SHORT_1, net.buckleystudios.equigen.entity.client.parts.backtoplegs.back_leg_top_thick_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEG_TOP_THICK_SHORT_2, net.buckleystudios.equigen.entity.client.parts.backtoplegs.back_leg_top_thick_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEG_TOP_THICK_AVERAGE_1, net.buckleystudios.equigen.entity.client.parts.backtoplegs.back_leg_top_thick_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEG_TOP_THICK_AVERAGE_2, net.buckleystudios.equigen.entity.client.parts.backtoplegs.back_leg_top_thick_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEG_TOP_THICK_LONG_1, net.buckleystudios.equigen.entity.client.parts.backtoplegs.back_leg_top_thick_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BACK_LEG_TOP_THICK_LONG_2, net.buckleystudios.equigen.entity.client.parts.backtoplegs.back_leg_top_thick_long_2::createBodyLayer);

        //Chests
        event.registerLayerDefinition(ModModelLayers.CHEST_LEAN_SMALL_1 , net.buckleystudios.equigen.entity.client.parts.chests.chest_lean_small_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_LEAN_SMALL_2 , net.buckleystudios.equigen.entity.client.parts.chests.chest_lean_small_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_LEAN_AVERAGE_1 , net.buckleystudios.equigen.entity.client.parts.chests.chest_lean_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_LEAN_AVERAGE_2 , net.buckleystudios.equigen.entity.client.parts.chests.chest_lean_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_LEAN_LARGE_1 , net.buckleystudios.equigen.entity.client.parts.chests.chest_lean_large_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_LEAN_LARGE_2 , net.buckleystudios.equigen.entity.client.parts.chests.chest_lean_large_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_AVERAGE_SMALL_1 , net.buckleystudios.equigen.entity.client.parts.chests.chest_average_small_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_AVERAGE_SMALL_2 , net.buckleystudios.equigen.entity.client.parts.chests.chest_average_small_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_AVERAGE_AVERAGE_1 , net.buckleystudios.equigen.entity.client.parts.chests.chest_average_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_AVERAGE_AVERAGE_2 , net.buckleystudios.equigen.entity.client.parts.chests.chest_average_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_AVERAGE_LARGE_1 , net.buckleystudios.equigen.entity.client.parts.chests.chest_average_large_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_AVERAGE_LARGE_2 , net.buckleystudios.equigen.entity.client.parts.chests.chest_average_large_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_MUSCULAR_SMALL_1 , net.buckleystudios.equigen.entity.client.parts.chests.chest_muscular_small_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_MUSCULAR_SMALL_2 , net.buckleystudios.equigen.entity.client.parts.chests.chest_muscular_small_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_MUSCULAR_AVERAGE_1 , net.buckleystudios.equigen.entity.client.parts.chests.chest_muscular_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_MUSCULAR_AVERAGE_2 , net.buckleystudios.equigen.entity.client.parts.chests.chest_muscular_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_MUSCULAR_LARGE_1 , net.buckleystudios.equigen.entity.client.parts.chests.chest_muscular_large_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CHEST_MUSCULAR_LARGE_2 , net.buckleystudios.equigen.entity.client.parts.chests.chest_muscular_large_2::createBodyLayer);

        // Necks
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_ARCHED_SHORT_1, net.buckleystudios.equigen.entity.client.parts.necks.arched.neck_lean_arched_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_ARCHED_SHORT_2, net.buckleystudios.equigen.entity.client.parts.necks.arched.neck_lean_arched_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_ARCHED_AVERAGE_1, net.buckleystudios.equigen.entity.client.parts.necks.arched.neck_lean_arched_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_ARCHED_AVERAGE_2, net.buckleystudios.equigen.entity.client.parts.necks.arched.neck_lean_arched_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_ARCHED_LONG_1, net.buckleystudios.equigen.entity.client.parts.necks.arched.neck_lean_arched_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_ARCHED_LONG_2, net.buckleystudios.equigen.entity.client.parts.necks.arched.neck_lean_arched_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_EWED_SHORT_1, net.buckleystudios.equigen.entity.client.parts.necks.ewed.neck_lean_ewed_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_EWED_SHORT_2, net.buckleystudios.equigen.entity.client.parts.necks.ewed.neck_lean_ewed_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_EWED_AVERAGE_1, net.buckleystudios.equigen.entity.client.parts.necks.ewed.neck_lean_ewed_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_EWED_AVERAGE_2, net.buckleystudios.equigen.entity.client.parts.necks.ewed.neck_lean_ewed_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_EWED_LONG_1, net.buckleystudios.equigen.entity.client.parts.necks.ewed.neck_lean_ewed_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_EWED_LONG_2, net.buckleystudios.equigen.entity.client.parts.necks.ewed.neck_lean_ewed_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_STRAIGHT_SHORT_1, net.buckleystudios.equigen.entity.client.parts.necks.straight.neck_lean_straight_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_STRAIGHT_SHORT_2, net.buckleystudios.equigen.entity.client.parts.necks.straight.neck_lean_straight_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_STRAIGHT_AVERAGE_1, net.buckleystudios.equigen.entity.client.parts.necks.straight.neck_lean_straight_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_STRAIGHT_AVERAGE_2, net.buckleystudios.equigen.entity.client.parts.necks.straight.neck_lean_straight_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_STRAIGHT_LONG_1, net.buckleystudios.equigen.entity.client.parts.necks.straight.neck_lean_straight_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_STRAIGHT_LONG_2, net.buckleystudios.equigen.entity.client.parts.necks.straight.neck_lean_straight_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_SWAN_SHORT_1, net.buckleystudios.equigen.entity.client.parts.necks.swan.neck_lean_swan_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_SWAN_SHORT_2, net.buckleystudios.equigen.entity.client.parts.necks.swan.neck_lean_swan_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_SWAN_AVERAGE_1, net.buckleystudios.equigen.entity.client.parts.necks.swan.neck_lean_swan_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_SWAN_AVERAGE_2, net.buckleystudios.equigen.entity.client.parts.necks.swan.neck_lean_swan_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_SWAN_LONG_1, net.buckleystudios.equigen.entity.client.parts.necks.swan.neck_lean_swan_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_LEAN_SWAN_LONG_2, net.buckleystudios.equigen.entity.client.parts.necks.swan.neck_lean_swan_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_ARCHED_SHORT_1, net.buckleystudios.equigen.entity.client.parts.necks.arched.neck_average_arched_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_ARCHED_SHORT_2, net.buckleystudios.equigen.entity.client.parts.necks.arched.neck_average_arched_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_ARCHED_AVERAGE_1, net.buckleystudios.equigen.entity.client.parts.necks.arched.neck_average_arched_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_ARCHED_AVERAGE_2, net.buckleystudios.equigen.entity.client.parts.necks.arched.neck_average_arched_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_ARCHED_LONG_1, net.buckleystudios.equigen.entity.client.parts.necks.arched.neck_average_arched_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_ARCHED_LONG_2, net.buckleystudios.equigen.entity.client.parts.necks.arched.neck_average_arched_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_EWED_SHORT_1, net.buckleystudios.equigen.entity.client.parts.necks.ewed.neck_average_ewed_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_EWED_SHORT_2, net.buckleystudios.equigen.entity.client.parts.necks.ewed.neck_average_ewed_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_EWED_AVERAGE_1, net.buckleystudios.equigen.entity.client.parts.necks.ewed.neck_average_ewed_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_EWED_AVERAGE_2, net.buckleystudios.equigen.entity.client.parts.necks.ewed.neck_average_ewed_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_EWED_LONG_1, net.buckleystudios.equigen.entity.client.parts.necks.ewed.neck_average_ewed_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_EWED_LONG_2, net.buckleystudios.equigen.entity.client.parts.necks.ewed.neck_average_ewed_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_STRAIGHT_SHORT_1, net.buckleystudios.equigen.entity.client.parts.necks.straight.neck_average_straight_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_STRAIGHT_SHORT_2, net.buckleystudios.equigen.entity.client.parts.necks.straight.neck_average_straight_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_STRAIGHT_AVERAGE_1, net.buckleystudios.equigen.entity.client.parts.necks.straight.neck_average_straight_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_STRAIGHT_AVERAGE_2, net.buckleystudios.equigen.entity.client.parts.necks.straight.neck_average_straight_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_STRAIGHT_LONG_1, net.buckleystudios.equigen.entity.client.parts.necks.straight.neck_average_straight_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_STRAIGHT_LONG_2, net.buckleystudios.equigen.entity.client.parts.necks.straight.neck_average_straight_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_SWAN_SHORT_1, net.buckleystudios.equigen.entity.client.parts.necks.swan.neck_average_swan_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_SWAN_SHORT_2, net.buckleystudios.equigen.entity.client.parts.necks.swan.neck_average_swan_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_SWAN_AVERAGE_1, net.buckleystudios.equigen.entity.client.parts.necks.swan.neck_average_swan_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_SWAN_AVERAGE_2, net.buckleystudios.equigen.entity.client.parts.necks.swan.neck_average_swan_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_SWAN_LONG_1, net.buckleystudios.equigen.entity.client.parts.necks.swan.neck_average_swan_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_AVERAGE_SWAN_LONG_2, net.buckleystudios.equigen.entity.client.parts.necks.swan.neck_average_swan_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_ARCHED_SHORT_1, net.buckleystudios.equigen.entity.client.parts.necks.arched.neck_muscular_arched_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_ARCHED_SHORT_2, net.buckleystudios.equigen.entity.client.parts.necks.arched.neck_muscular_arched_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_ARCHED_AVERAGE_1, net.buckleystudios.equigen.entity.client.parts.necks.arched.neck_muscular_arched_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_ARCHED_AVERAGE_2, net.buckleystudios.equigen.entity.client.parts.necks.arched.neck_muscular_arched_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_ARCHED_LONG_1, net.buckleystudios.equigen.entity.client.parts.necks.arched.neck_muscular_arched_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_ARCHED_LONG_2, net.buckleystudios.equigen.entity.client.parts.necks.arched.neck_muscular_arched_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_EWED_SHORT_1, net.buckleystudios.equigen.entity.client.parts.necks.ewed.neck_muscular_ewed_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_EWED_SHORT_2, net.buckleystudios.equigen.entity.client.parts.necks.ewed.neck_muscular_ewed_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_EWED_AVERAGE_1, net.buckleystudios.equigen.entity.client.parts.necks.ewed.neck_muscular_ewed_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_EWED_AVERAGE_2, net.buckleystudios.equigen.entity.client.parts.necks.ewed.neck_muscular_ewed_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_EWED_LONG_1, net.buckleystudios.equigen.entity.client.parts.necks.ewed.neck_muscular_ewed_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_EWED_LONG_2, net.buckleystudios.equigen.entity.client.parts.necks.ewed.neck_muscular_ewed_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_STRAIGHT_SHORT_1, net.buckleystudios.equigen.entity.client.parts.necks.straight.neck_muscular_straight_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_STRAIGHT_SHORT_2, net.buckleystudios.equigen.entity.client.parts.necks.straight.neck_muscular_straight_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_STRAIGHT_AVERAGE_1, net.buckleystudios.equigen.entity.client.parts.necks.straight.neck_muscular_straight_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_STRAIGHT_AVERAGE_2, net.buckleystudios.equigen.entity.client.parts.necks.straight.neck_muscular_straight_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_STRAIGHT_LONG_1, net.buckleystudios.equigen.entity.client.parts.necks.straight.neck_muscular_straight_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_STRAIGHT_LONG_2, net.buckleystudios.equigen.entity.client.parts.necks.straight.neck_muscular_straight_long_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_SWAN_SHORT_1, net.buckleystudios.equigen.entity.client.parts.necks.swan.neck_muscular_swan_short_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_SWAN_SHORT_2, net.buckleystudios.equigen.entity.client.parts.necks.swan.neck_muscular_swan_short_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_SWAN_AVERAGE_1, net.buckleystudios.equigen.entity.client.parts.necks.swan.neck_muscular_swan_average_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_SWAN_AVERAGE_2, net.buckleystudios.equigen.entity.client.parts.necks.swan.neck_muscular_swan_average_2::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_SWAN_LONG_1, net.buckleystudios.equigen.entity.client.parts.necks.swan.neck_muscular_swan_long_1::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NECK_MUSCULAR_SWAN_LONG_2, net.buckleystudios.equigen.entity.client.parts.necks.swan.neck_muscular_swan_long_2::createBodyLayer);

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
