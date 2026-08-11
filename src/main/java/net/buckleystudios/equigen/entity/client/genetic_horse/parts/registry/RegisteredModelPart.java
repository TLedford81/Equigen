package net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry;

import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
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
