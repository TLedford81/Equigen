package net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.multipart.MultipartModel;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistries.ModelPartRegistry;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

import java.util.function.Function;

public record RegisteredLegModelPart(
        ModelLayerLocation frontLeftLayer,
        ModelLayerLocation frontRightLayer,
        ModelLayerLocation backLeftLayer,
        ModelLayerLocation backRightLayer,
        Function<ModelPart, MultipartModel<GeneticHorseEntity>> factory,
        Function<GeneticValues.LEG, LayerDefinition> layerFactory
) {

    public MultipartModel<GeneticHorseEntity> create(
            EntityModelSet modelSet,
            GeneticValues.LEG leg) {

        ModelLayerLocation layer = switch (leg) {
            case FRONT_LEFT -> frontLeftLayer;
            case FRONT_RIGHT -> frontRightLayer;
            case BACK_LEFT -> backLeftLayer;
            case BACK_RIGHT -> backRightLayer;
        };

        ModelPart root = modelSet.bakeLayer(layer);

        return factory.apply(root);
    }

    public void registerLayers(
            EntityRenderersEvent.RegisterLayerDefinitions event) {
        EquigenMod.LOGGER.info(
                "REGISTERING LEG LAYERS: {}, {}, {}, {}",
                frontLeftLayer,
                frontRightLayer,
                backLeftLayer,
                backRightLayer
        );
        ModelPartRegistry.registerAllModels();


        event.registerLayerDefinition(
                frontLeftLayer,
                () -> layerFactory.apply(GeneticValues.LEG.FRONT_LEFT)
        );

        event.registerLayerDefinition(
                frontRightLayer,
                () -> layerFactory.apply(GeneticValues.LEG.FRONT_RIGHT)
        );

        event.registerLayerDefinition(
                backLeftLayer,
                () -> layerFactory.apply(GeneticValues.LEG.BACK_LEFT)
        );

        event.registerLayerDefinition(
                backRightLayer,
                () -> layerFactory.apply(GeneticValues.LEG.BACK_RIGHT)
        );
    }
}