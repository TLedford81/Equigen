package net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class GH_ModelPartRegistry {
    private static final Map<GH_ModelPartKeys, GH_RegisteredModelPart> MODELS =
            new HashMap<>();

    private GH_ModelPartRegistry() {
    }

    public static void register(GH_ModelPartKeys key, ModelLayerLocation layer,
            Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory
    ) {
        GH_RegisteredModelPart previous = MODELS.put(key,
                new GH_RegisteredModelPart(layer, factory)
        );

        if (previous != null) {
            EquigenMod.LOGGER.error("Duplicate horse model registered for key: " + key);
        }
    }

    public static EntityModel<GeneticHorseEntity> create(GH_ModelPartKeys key, EntityModelSet modelSet) {
        GH_RegisteredModelPart registeredModel = MODELS.get(key);

        if (registeredModel == null) {
            EquigenMod.LOGGER.error("No horse model found for key: {}", key);
            return null;
        }
        return registeredModel.create(modelSet);
    }

    public static GH_RegisteredModelPart find(GH_ModelPartKeys key) {
        return MODELS.get(key);
    }

    public static Map<GH_ModelPartKeys, GH_RegisteredModelPart> getAllModels() {
        return MODELS;
    }
}
