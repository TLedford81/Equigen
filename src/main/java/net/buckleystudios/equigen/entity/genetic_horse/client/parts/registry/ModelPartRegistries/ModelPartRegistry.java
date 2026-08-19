package net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistries;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.multipart.MultipartModel;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistryKeys;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.RegisteredLegModelPart;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.RegisteredModelPart;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ModelPartRegistry {
    private static final Map<ModelPartRegistryKeys.Back, RegisteredModelPart> BACK_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Bottom_Legs, RegisteredLegModelPart> BOTTOM_LEGS_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Chest, RegisteredModelPart> CHEST_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Ears, RegisteredModelPart> EARS_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Head, RegisteredModelPart> HEAD_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Hips, RegisteredModelPart> HIPS_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Hoof, RegisteredLegModelPart> HOOF_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Knees, RegisteredLegModelPart> KNEES_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Neck, RegisteredModelPart> NECK_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Stomach, RegisteredModelPart> STOMACH_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Tail, RegisteredModelPart> TAIL_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Top_Back_Legs, RegisteredLegModelPart> TOP_BACK_LEGS_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Top_Front_Legs, RegisteredLegModelPart> TOP_FRONT_LEGS_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Withers, RegisteredModelPart> WITHERS_MODELS = new HashMap<>();
    private static boolean modelsRegistered = false;

    private ModelPartRegistry() {}

    public static void registerAllModels(){
        EquigenMod.LOGGER.info("REGISTER ALL MODELS CALLED");
        if (modelsRegistered) {
            return;
        }
        modelsRegistered = true;
        
        BackModelPartRegistry.registerModels();
        BottomLegModelPartRegistry.registerModels();
        ChestModelPartRegistry.registerModels();
        EarModelPartRegistry.registerModels();
        HeadModelPartRegistry.registerModels();
        HipModelPartRegistry.registerModels();
        HoovesModelPartRegistry.registerModels();
        KneesModelPartRegistry.registerModels();
        NeckModelPartRegistry.registerModels();
        StomachModelPartRegistry.registerModels();
        TailModelPartRegistry.registerModels();
        TopBackLegModelPartRegistry.registerModels();
        TopFrontLegModelPartRegistry.registerModels();
        WithersModelPartRegistry.registerModels();
    }

    public static void register(ModelPartRegistryKeys.Back key, ModelLayerLocation layer,
                                Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory
    ) {
        BACK_MODELS.put(key, new RegisteredModelPart(layer, factory));
    }
    public static void register(
            ModelPartRegistryKeys.Bottom_Legs key,
            ModelLayerLocation frontLeftLayer,
            ModelLayerLocation frontRightLayer,
            ModelLayerLocation backLeftLayer,
            ModelLayerLocation backRightLayer,
            Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory,
            Function<GeneticValues.LEG, LayerDefinition> layerFactory
    ) {
        BOTTOM_LEGS_MODELS.put(
                key,
                new RegisteredLegModelPart(
                        frontLeftLayer,
                        frontRightLayer,
                        backLeftLayer,
                        backRightLayer,
                        factory,
                        layerFactory
                )
        );
    }
    public static void registerLegLayers(
            EntityRenderersEvent.RegisterLayerDefinitions event) {

        ModelPartRegistry.registerAllModels();
        EquigenMod.LOGGER.info(
                "REGISTERING TOP FRONT LEG LAYERS: {} models",
                TOP_FRONT_LEGS_MODELS.size()
        );
        EquigenMod.LOGGER.info(
                "REGISTERING TOP BACK LEG LAYERS: {} models",
                TOP_BACK_LEGS_MODELS.size()
        );
        EquigenMod.LOGGER.info(
                "REGISTERING KNEE LEG LAYERS: {} models",
                KNEES_MODELS.size()
        );
        EquigenMod.LOGGER.info(
                "REGISTERING BOTTOM LEG LAYERS: {} models",
                BOTTOM_LEGS_MODELS.size()
        );
        EquigenMod.LOGGER.info(
                "REGISTERING HOOF LEG LAYERS: {} models",
                HOOF_MODELS.size()
        );
        for (RegisteredLegModelPart model : TOP_FRONT_LEGS_MODELS.values()) {
            model.registerLayers(event);
        }
        for (RegisteredLegModelPart model : TOP_BACK_LEGS_MODELS.values()) {
            model.registerLayers(event);
        }
        for (RegisteredLegModelPart model : KNEES_MODELS.values()) {
            model.registerLayers(event);
        }
        for (RegisteredLegModelPart model : BOTTOM_LEGS_MODELS.values()) {
            model.registerLayers(event);
        }
        for (RegisteredLegModelPart model : HOOF_MODELS.values()) {
            EquigenMod.LOGGER.info("Registering hoof leg layer set");
            model.registerLayers(event);
        }

    }
    public static void register(ModelPartRegistryKeys.Chest key, ModelLayerLocation layer,
                                Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory
    ) {
        CHEST_MODELS.put(key, new RegisteredModelPart(layer, factory));
    }
    public static void register(ModelPartRegistryKeys.Ears key, ModelLayerLocation layer,
                                Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory
    ) {
        EARS_MODELS.put(key, new RegisteredModelPart(layer, factory));
    }
    public static void register(ModelPartRegistryKeys.Head key, ModelLayerLocation layer,
                                Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory
    ) {
        HEAD_MODELS.put(key, new RegisteredModelPart(layer, factory));
    }
    public static void register(ModelPartRegistryKeys.Hips key, ModelLayerLocation layer,
                                Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory
    ) {
        HIPS_MODELS.put(key, new RegisteredModelPart(layer, factory));
    }
    public static void register(
            ModelPartRegistryKeys.Hoof key,
            ModelLayerLocation frontLeftLayer,
            ModelLayerLocation frontRightLayer,
            ModelLayerLocation backLeftLayer,
            ModelLayerLocation backRightLayer,
            Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory,
            Function<GeneticValues.LEG, LayerDefinition> layerFactory
    ) {
        HOOF_MODELS.put(
                key,
                new RegisteredLegModelPart(
                        frontLeftLayer,
                        frontRightLayer,
                        backLeftLayer,
                        backRightLayer,
                        factory,
                        layerFactory
                )
        );
    }
    public static void register(
            ModelPartRegistryKeys.Knees key,
            ModelLayerLocation frontLeftLayer,
            ModelLayerLocation frontRightLayer,
            ModelLayerLocation backLeftLayer,
            ModelLayerLocation backRightLayer,
            Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory,
            Function<GeneticValues.LEG, LayerDefinition> layerFactory
    ) {
        KNEES_MODELS.put(
                key,
                new RegisteredLegModelPart(
                        frontLeftLayer,
                        frontRightLayer,
                        backLeftLayer,
                        backRightLayer,
                        factory,
                        layerFactory
                )
        );
    }
    public static void register(ModelPartRegistryKeys.Neck key, ModelLayerLocation layer,
                                Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory
    ) {
        NECK_MODELS.put(key, new RegisteredModelPart(layer, factory));
    }
    public static void register(ModelPartRegistryKeys.Stomach key, ModelLayerLocation layer,
                                Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory
    ) {
        STOMACH_MODELS.put(key, new RegisteredModelPart(layer, factory));
    }
    public static void register(ModelPartRegistryKeys.Tail key, ModelLayerLocation layer,
                                Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory
    ) {
        TAIL_MODELS.put(key, new RegisteredModelPart(layer, factory));
    }
    public static void register(
            ModelPartRegistryKeys.Top_Back_Legs key,
            ModelLayerLocation frontLeftLayer,
            ModelLayerLocation frontRightLayer,
            ModelLayerLocation backLeftLayer,
            ModelLayerLocation backRightLayer,
            Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory,
            Function<GeneticValues.LEG, LayerDefinition> layerFactory
    ) {
        TOP_BACK_LEGS_MODELS.put(
                key,
                new RegisteredLegModelPart(
                        frontLeftLayer,
                        frontRightLayer,
                        backLeftLayer,
                        backRightLayer,
                        factory,
                        layerFactory
                )
        );
    }
    public static void register(
            ModelPartRegistryKeys.Top_Front_Legs key,
            ModelLayerLocation frontLeftLayer,
            ModelLayerLocation frontRightLayer,
            ModelLayerLocation backLeftLayer,
            ModelLayerLocation backRightLayer,
            Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory,
            Function<GeneticValues.LEG, LayerDefinition> layerFactory
    ) {
        TOP_FRONT_LEGS_MODELS.put(
                key,
                new RegisteredLegModelPart(
                        frontLeftLayer,
                        frontRightLayer,
                        backLeftLayer,
                        backRightLayer,
                        factory,
                        layerFactory
                )
        );
    }
    public static void register(ModelPartRegistryKeys.Withers key, ModelLayerLocation layer,
                                Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory
    ) {
        WITHERS_MODELS.put(key, new RegisteredModelPart(layer, factory));
    }


    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Back key, EntityModelSet modelSet) {
        RegisteredModelPart model = BACK_MODELS.get(key);
//        EquigenMod.LOGGER.error("Requested back key: {}", key);
//        EquigenMod.LOGGER.error("Registered back keys: {}", BACK_MODELS.keySet());
        return model == null ? null : model.create(modelSet);

    }

    public static RegisteredModelPart find(ModelPartRegistryKeys.Back key) {
        return BACK_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Back, RegisteredModelPart> getAllBackModels() {
        return BACK_MODELS;
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Bottom_Legs key, EntityModelSet modelSet, GeneticValues.LEG leg) {
        RegisteredLegModelPart model = BOTTOM_LEGS_MODELS.get(key);
        return model == null ? null : model.create(modelSet, leg);
    }

    public static RegisteredLegModelPart find(ModelPartRegistryKeys.Bottom_Legs key) {
        return BOTTOM_LEGS_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Bottom_Legs, RegisteredLegModelPart> getAllBottom_LegsModels() {
        return BOTTOM_LEGS_MODELS;
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Chest key, EntityModelSet modelSet) {
        RegisteredModelPart model = CHEST_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static RegisteredModelPart find(ModelPartRegistryKeys.Chest key) {
        return CHEST_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Chest, RegisteredModelPart> getAllChestModels() {
        return CHEST_MODELS;
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Ears key, EntityModelSet modelSet) {
        RegisteredModelPart model = EARS_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static RegisteredModelPart find(ModelPartRegistryKeys.Ears key) {
        return EARS_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Ears, RegisteredModelPart> getAllEarsModels() {
        return EARS_MODELS;
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Head key, EntityModelSet modelSet) {
        RegisteredModelPart model = HEAD_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static RegisteredModelPart find(ModelPartRegistryKeys.Head key) {
        return HEAD_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Head, RegisteredModelPart> getAllHeadModels() {
        return HEAD_MODELS;
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Hips key, EntityModelSet modelSet) {
        RegisteredModelPart model = HIPS_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }


    public static RegisteredModelPart find(ModelPartRegistryKeys.Hips key) {
        return HIPS_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Hips, RegisteredModelPart> getAllHipsModels() {
        return HIPS_MODELS;
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Hoof key, EntityModelSet modelSet, GeneticValues.LEG leg) {
        RegisteredLegModelPart model = HOOF_MODELS.get(key);
        return model == null ? null : model.create(modelSet, leg);
    }
    public static RegisteredLegModelPart find(ModelPartRegistryKeys.Hoof key) {
        return HOOF_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Hoof, RegisteredLegModelPart> getAllHoofModels() {
        return HOOF_MODELS;
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Knees key, EntityModelSet modelSet, GeneticValues.LEG leg) {
        RegisteredLegModelPart model = KNEES_MODELS.get(key);
        return model == null ? null : model.create(modelSet, leg);
    }

    public static RegisteredLegModelPart find(ModelPartRegistryKeys.Knees key) {
        return KNEES_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Knees, RegisteredLegModelPart> getAllKneesModels() {
        return KNEES_MODELS;
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Neck key, EntityModelSet modelSet) {
        RegisteredModelPart model = NECK_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static RegisteredModelPart find(ModelPartRegistryKeys.Neck key) {
        return NECK_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Neck, RegisteredModelPart> getAllNeckModels() {
        return NECK_MODELS;
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Stomach key, EntityModelSet modelSet) {
        RegisteredModelPart model = STOMACH_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static RegisteredModelPart find(ModelPartRegistryKeys.Stomach key) {
        return STOMACH_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Stomach, RegisteredModelPart> getAllStomachModels() {
        return STOMACH_MODELS;
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Tail key, EntityModelSet modelSet) {
        RegisteredModelPart model = TAIL_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static RegisteredModelPart find(ModelPartRegistryKeys.Tail key) {
        return TAIL_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Tail, RegisteredModelPart> getAllTailModels() {
        return TAIL_MODELS;
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Top_Back_Legs key, EntityModelSet modelSet, GeneticValues.LEG leg) {
        RegisteredLegModelPart model = TOP_BACK_LEGS_MODELS.get(key);
        return model == null ? null : model.create(modelSet, leg);
    }

    public static RegisteredLegModelPart find(ModelPartRegistryKeys.Top_Back_Legs key) {
        return TOP_BACK_LEGS_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Top_Back_Legs, RegisteredLegModelPart> getAllTop_Back_LegsModels() {
        return TOP_BACK_LEGS_MODELS;
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Top_Front_Legs key, EntityModelSet modelSet, GeneticValues.LEG leg) {
        RegisteredLegModelPart model = TOP_FRONT_LEGS_MODELS.get(key);
        return model == null ? null : model.create(modelSet, leg);
    }

    public static RegisteredLegModelPart find(ModelPartRegistryKeys.Top_Front_Legs key) {
        return TOP_FRONT_LEGS_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Top_Front_Legs, RegisteredLegModelPart> getAllTop_Front_LegsModels() {
        return TOP_FRONT_LEGS_MODELS;
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Withers key, EntityModelSet modelSet) {
        RegisteredModelPart model = WITHERS_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static RegisteredModelPart find(ModelPartRegistryKeys.Withers key) {
        return WITHERS_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Withers, RegisteredModelPart> getAllWithersModels() {
        return WITHERS_MODELS;
    }
}
