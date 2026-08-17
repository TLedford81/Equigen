package net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry;

import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.multipart.MultipartModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;

import java.util.function.Function;

public record RegisteredModelPart(
        ModelLayerLocation layer,
        Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory) {
    public MultipartModel<GeneticHorseEntity> create(EntityModelSet modelSet) {
        ModelPart root = modelSet.bakeLayer(layer);
        return factory.apply(root);
    }
}
