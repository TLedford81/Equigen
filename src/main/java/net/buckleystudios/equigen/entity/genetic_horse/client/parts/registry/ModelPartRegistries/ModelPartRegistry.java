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

    private static final Map<Class<? extends MultipartModel<GeneticHorseEntity>>, Object> MODEL_KEYS = new HashMap<>();

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
                                Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory,
                                Class<? extends MultipartModel<GeneticHorseEntity>> modelClass
    ) {
        RegisteredModelPart part = new RegisteredModelPart(layer, factory);
        BACK_MODELS.put(key, part);
        MODEL_KEYS.put(modelClass, key);
    }
    public static void register(
            ModelPartRegistryKeys.Bottom_Legs key,
            ModelLayerLocation frontLeftLayer,
            ModelLayerLocation frontRightLayer,
            ModelLayerLocation backLeftLayer,
            ModelLayerLocation backRightLayer,
            Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory,
            Function<GeneticValues.LEG, LayerDefinition> layerFactory,
            Class<? extends MultipartModel<GeneticHorseEntity>> modelClass
    ) {
        RegisteredLegModelPart part = new RegisteredLegModelPart(
                frontLeftLayer,
                frontRightLayer,
                backLeftLayer,
                backRightLayer,
                factory,
                layerFactory
        );
        BOTTOM_LEGS_MODELS.put(key, part);
        MODEL_KEYS.put(modelClass, key);

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
                                Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory,
                                        Class<? extends MultipartModel<GeneticHorseEntity>> modelClass
    ) {
        RegisteredModelPart part = new RegisteredModelPart(layer, factory);
        CHEST_MODELS.put(key, part);
        MODEL_KEYS.put(modelClass, key);
    }
    public static void register(ModelPartRegistryKeys.Ears key, ModelLayerLocation layer,
                                Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory,
                                Class<? extends MultipartModel<GeneticHorseEntity>> modelClass
    ) {
        RegisteredModelPart part = new RegisteredModelPart(layer, factory);
        EARS_MODELS.put(key, part);
        MODEL_KEYS.put(modelClass, key);
    }
    public static void register(ModelPartRegistryKeys.Head key, ModelLayerLocation layer,
                                Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory,
                                Class<? extends MultipartModel<GeneticHorseEntity>> modelClass
    ) {
        RegisteredModelPart part = new RegisteredModelPart(layer, factory);
        HEAD_MODELS.put(key, part);
        MODEL_KEYS.put(modelClass, key);
    }
    public static void register(ModelPartRegistryKeys.Hips key, ModelLayerLocation layer,
                                Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory,
                                Class<? extends MultipartModel<GeneticHorseEntity>> modelClass
    ) {
        RegisteredModelPart part = new RegisteredModelPart(layer, factory);
        HIPS_MODELS.put(key, part);
        MODEL_KEYS.put(modelClass, key);
    }

    public static void register(
            ModelPartRegistryKeys.Hoof key,
            ModelLayerLocation frontLeftLayer,
            ModelLayerLocation frontRightLayer,
            ModelLayerLocation backLeftLayer,
            ModelLayerLocation backRightLayer,
            Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory,
            Function<GeneticValues.LEG, LayerDefinition> layerFactory,
            Class<? extends MultipartModel<GeneticHorseEntity>> modelClass
    ) {
        RegisteredLegModelPart part = new RegisteredLegModelPart(
                frontLeftLayer,
                frontRightLayer,
                backLeftLayer,
                backRightLayer,
                factory,
                layerFactory
        );
        HOOF_MODELS.put(key, part);
        MODEL_KEYS.put(modelClass, key);
    }

    public static void register(
            ModelPartRegistryKeys.Knees key,
            ModelLayerLocation frontLeftLayer,
            ModelLayerLocation frontRightLayer,
            ModelLayerLocation backLeftLayer,
            ModelLayerLocation backRightLayer,
            Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory,
            Function<GeneticValues.LEG, LayerDefinition> layerFactory,
            Class<? extends MultipartModel<GeneticHorseEntity>> modelClass
    ) {
        RegisteredLegModelPart part = new RegisteredLegModelPart(
                frontLeftLayer,
                frontRightLayer,
                backLeftLayer,
                backRightLayer,
                factory,
                layerFactory
        );
        KNEES_MODELS.put(key, part);
        MODEL_KEYS.put(modelClass, key);
    }
    public static void register(ModelPartRegistryKeys.Neck key, ModelLayerLocation layer,
                                Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory,
                                Class<? extends MultipartModel<GeneticHorseEntity>> modelClass
    ) {
        RegisteredModelPart part = new RegisteredModelPart(layer, factory);
        NECK_MODELS.put(key, part);
        MODEL_KEYS.put(modelClass, key);
    }
    public static void register(ModelPartRegistryKeys.Stomach key, ModelLayerLocation layer,
                                Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory,
                                Class<? extends MultipartModel<GeneticHorseEntity>> modelClass
    ) {
        RegisteredModelPart part = new RegisteredModelPart(layer, factory);
        STOMACH_MODELS.put(key, part);
        MODEL_KEYS.put(modelClass, key);
    }
    public static void register(ModelPartRegistryKeys.Tail key, ModelLayerLocation layer,
                                Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory,
                                Class<? extends MultipartModel<GeneticHorseEntity>> modelClass
    ) {
        RegisteredModelPart part = new RegisteredModelPart(layer, factory);
        TAIL_MODELS.put(key, part);
        MODEL_KEYS.put(modelClass, key);
    }

    public static void register(
            ModelPartRegistryKeys.Top_Back_Legs key,
            ModelLayerLocation backLeftLayer,
            ModelLayerLocation backRightLayer,
            Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory,
            Function<GeneticValues.LEG, LayerDefinition> layerFactory,
            Class<? extends MultipartModel<GeneticHorseEntity>> modelClass
    ) {
        RegisteredLegModelPart part = new RegisteredLegModelPart(
                null,
                null,
                backLeftLayer,
                backRightLayer,
                factory,
                layerFactory
        );
        TOP_BACK_LEGS_MODELS.put(key, part);
        MODEL_KEYS.put(modelClass, key);
    }

    public static void register(
            ModelPartRegistryKeys.Top_Front_Legs key,
            ModelLayerLocation frontLeftLayer,
            ModelLayerLocation frontRightLayer,
            Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory,
            Function<GeneticValues.LEG, LayerDefinition> layerFactory,
            Class<? extends MultipartModel<GeneticHorseEntity>> modelClass
    ) {
        RegisteredLegModelPart part = new RegisteredLegModelPart(
                frontLeftLayer,
                frontRightLayer,
                null,
                null,
                factory,
                layerFactory
        );
        TOP_FRONT_LEGS_MODELS.put(key, part);
        MODEL_KEYS.put(modelClass, key);
    }
    public static void register(ModelPartRegistryKeys.Withers key, ModelLayerLocation layer,
                                Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory,
                                Class<? extends MultipartModel<GeneticHorseEntity>> modelClass
    ) {
        RegisteredModelPart part = new RegisteredModelPart(layer, factory);
        WITHERS_MODELS.put(key, part);
        MODEL_KEYS.put(modelClass, key);
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Back key, EntityModelSet modelSet) {
        RegisteredModelPart model = BACK_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Bottom_Legs key, EntityModelSet modelSet, GeneticValues.LEG leg) {
        RegisteredLegModelPart model = BOTTOM_LEGS_MODELS.get(key);
        return model == null ? null : model.create(modelSet, leg);
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Chest key, EntityModelSet modelSet) {
        RegisteredModelPart model = CHEST_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Ears key, EntityModelSet modelSet) {
        RegisteredModelPart model = EARS_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Head key, EntityModelSet modelSet) {
        RegisteredModelPart model = HEAD_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Hips key, EntityModelSet modelSet) {
        RegisteredModelPart model = HIPS_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Hoof key, EntityModelSet modelSet, GeneticValues.LEG leg) {
        RegisteredLegModelPart model = HOOF_MODELS.get(key);
        return model == null ? null : model.create(modelSet, leg);
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Knees key, EntityModelSet modelSet, GeneticValues.LEG leg) {
        RegisteredLegModelPart model = KNEES_MODELS.get(key);
        return model == null ? null : model.create(modelSet, leg);
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Neck key, EntityModelSet modelSet) {
        RegisteredModelPart model = NECK_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Stomach key, EntityModelSet modelSet) {
        RegisteredModelPart model = STOMACH_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Tail key, EntityModelSet modelSet) {
        RegisteredModelPart model = TAIL_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Top_Back_Legs key, EntityModelSet modelSet, GeneticValues.LEG leg) {
        RegisteredLegModelPart model = TOP_BACK_LEGS_MODELS.get(key);
        if (leg == GeneticValues.LEG.FRONT_RIGHT || leg == GeneticValues.LEG.FRONT_LEFT) {
            return null;
        }
        return model == null ? null : model.create(modelSet, leg);
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Top_Front_Legs key, EntityModelSet modelSet, GeneticValues.LEG leg) {
        RegisteredLegModelPart model = TOP_FRONT_LEGS_MODELS.get(key);
        if (leg == GeneticValues.LEG.BACK_RIGHT || leg == GeneticValues.LEG.BACK_LEFT) {
            return null;
        }
        return model == null ? null : model.create(modelSet, leg);
    }

    public static MultipartModel<GeneticHorseEntity> getModel(ModelPartRegistryKeys.Withers key, EntityModelSet modelSet) {
        RegisteredModelPart model = WITHERS_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    @SuppressWarnings("unchecked")
    public static <KEY> KEY getKeyFromModel(MultipartModel<GeneticHorseEntity> model) {
        return (KEY) MODEL_KEYS.get(model.getClass());
    }
}
