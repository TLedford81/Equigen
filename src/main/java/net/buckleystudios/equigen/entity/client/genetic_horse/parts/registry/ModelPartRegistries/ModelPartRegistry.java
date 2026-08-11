package net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry.ModelPartRegistries;

import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartModel;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry.ModelPartRegistryKeys;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry.RegisteredModelPart;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ModelPartRegistry {
    private static final Map<ModelPartRegistryKeys.Back, RegisteredModelPart> BACK_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Bottom_Legs, RegisteredModelPart> BOTTOM_LEGS_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Chest, RegisteredModelPart> CHEST_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Ears, RegisteredModelPart> EARS_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Head, RegisteredModelPart> HEAD_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Hips, RegisteredModelPart> HIPS_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Hoof, RegisteredModelPart> HOOF_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Knees, RegisteredModelPart> KNEES_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Neck, RegisteredModelPart> NECK_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Stomach, RegisteredModelPart> STOMACH_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Tail, RegisteredModelPart> TAIL_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Top_Back_Legs, RegisteredModelPart> TOP_BACK_LEGS_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Top_Front_Legs, RegisteredModelPart> TOP_FRONT_LEGS_MODELS = new HashMap<>();
    private static final Map<ModelPartRegistryKeys.Withers, RegisteredModelPart> WITHERS_MODELS = new HashMap<>();
    private ModelPartRegistry() {}

    public static void registerAllModels(){
        BackModelPartRegistry.registerModels();
        BottomLegModelPartRegistry.registerModels();
    }

    public static void register(ModelPartRegistryKeys.Back key, ModelLayerLocation layer,
                                Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory
    ) {
        BACK_MODELS.put(key, new RegisteredModelPart(layer, factory));
    }

    public static EntityModel<GeneticHorseEntity> create(ModelPartRegistryKeys.Back key, EntityModelSet modelSet) {
        RegisteredModelPart model = BACK_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static RegisteredModelPart find(ModelPartRegistryKeys.Back key) {
        return BACK_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Back, RegisteredModelPart> getAllBackModels() {
        return BACK_MODELS;
    }

    public static EntityModel<GeneticHorseEntity> create(ModelPartRegistryKeys.Bottom_Legs key, EntityModelSet modelSet) {
        RegisteredModelPart model = BOTTOM_LEGS_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static RegisteredModelPart find(ModelPartRegistryKeys.Bottom_Legs key) {
        return BOTTOM_LEGS_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Bottom_Legs, RegisteredModelPart> getAllBottom_LegsModels() {
        return BOTTOM_LEGS_MODELS;
    }

    public static EntityModel<GeneticHorseEntity> create(ModelPartRegistryKeys.Chest key, EntityModelSet modelSet) {
        RegisteredModelPart model = CHEST_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static RegisteredModelPart find(ModelPartRegistryKeys.Chest key) {
        return CHEST_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Chest, RegisteredModelPart> getAllChestModels() {
        return CHEST_MODELS;
    }

    public static EntityModel<GeneticHorseEntity> create(ModelPartRegistryKeys.Ears key, EntityModelSet modelSet) {
        RegisteredModelPart model = EARS_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static RegisteredModelPart find(ModelPartRegistryKeys.Ears key) {
        return EARS_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Ears, RegisteredModelPart> getAllEarsModels() {
        return EARS_MODELS;
    }

    public static EntityModel<GeneticHorseEntity> create(ModelPartRegistryKeys.Head key, EntityModelSet modelSet) {
        RegisteredModelPart model = HEAD_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static RegisteredModelPart find(ModelPartRegistryKeys.Head key) {
        return HEAD_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Head, RegisteredModelPart> getAllHeadModels() {
        return HEAD_MODELS;
    }

    public static EntityModel<GeneticHorseEntity> create(ModelPartRegistryKeys.Hips key, EntityModelSet modelSet) {
        RegisteredModelPart model = HIPS_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static RegisteredModelPart find(ModelPartRegistryKeys.Hips key) {
        return HIPS_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Hips, RegisteredModelPart> getAllHipsModels() {
        return HIPS_MODELS;
    }

    public static EntityModel<GeneticHorseEntity> create(ModelPartRegistryKeys.Hoof key, EntityModelSet modelSet) {
        RegisteredModelPart model = HOOF_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static RegisteredModelPart find(ModelPartRegistryKeys.Hoof key) {
        return HOOF_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Hoof, RegisteredModelPart> getAllHoofModels() {
        return HOOF_MODELS;
    }

    public static EntityModel<GeneticHorseEntity> create(ModelPartRegistryKeys.Knees key, EntityModelSet modelSet) {
        RegisteredModelPart model = KNEES_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static RegisteredModelPart find(ModelPartRegistryKeys.Knees key) {
        return KNEES_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Knees, RegisteredModelPart> getAllKneesModels() {
        return KNEES_MODELS;
    }

    public static EntityModel<GeneticHorseEntity> create(ModelPartRegistryKeys.Neck key, EntityModelSet modelSet) {
        RegisteredModelPart model = NECK_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static RegisteredModelPart find(ModelPartRegistryKeys.Neck key) {
        return NECK_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Neck, RegisteredModelPart> getAllNeckModels() {
        return NECK_MODELS;
    }

    public static EntityModel<GeneticHorseEntity> create(ModelPartRegistryKeys.Stomach key, EntityModelSet modelSet) {
        RegisteredModelPart model = STOMACH_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static RegisteredModelPart find(ModelPartRegistryKeys.Stomach key) {
        return STOMACH_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Stomach, RegisteredModelPart> getAllStomachModels() {
        return STOMACH_MODELS;
    }

    public static EntityModel<GeneticHorseEntity> create(ModelPartRegistryKeys.Tail key, EntityModelSet modelSet) {
        RegisteredModelPart model = TAIL_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static RegisteredModelPart find(ModelPartRegistryKeys.Tail key) {
        return TAIL_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Tail, RegisteredModelPart> getAllTailModels() {
        return TAIL_MODELS;
    }

    public static EntityModel<GeneticHorseEntity> create(ModelPartRegistryKeys.Top_Back_Legs key, EntityModelSet modelSet) {
        RegisteredModelPart model = TOP_BACK_LEGS_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static RegisteredModelPart find(ModelPartRegistryKeys.Top_Back_Legs key) {
        return TOP_BACK_LEGS_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Top_Back_Legs, RegisteredModelPart> getAllTop_Back_LegsModels() {
        return TOP_BACK_LEGS_MODELS;
    }

    public static EntityModel<GeneticHorseEntity> create(ModelPartRegistryKeys.Top_Front_Legs key, EntityModelSet modelSet) {
        RegisteredModelPart model = TOP_FRONT_LEGS_MODELS.get(key);
        return model == null ? null : model.create(modelSet);
    }

    public static RegisteredModelPart find(ModelPartRegistryKeys.Top_Front_Legs key) {
        return TOP_FRONT_LEGS_MODELS.get(key);
    }

    public static Map<ModelPartRegistryKeys.Top_Front_Legs, RegisteredModelPart> getAllTop_Front_LegsModels() {
        return TOP_FRONT_LEGS_MODELS;
    }

    public static EntityModel<GeneticHorseEntity> create(ModelPartRegistryKeys.Withers key, EntityModelSet modelSet) {
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
