package net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistries;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.partmodels.hooves.hoof_average;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.partmodels.hooves.hoof_large;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistryKeys;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;

public class HoovesModelPartRegistry {
    private HoovesModelPartRegistry(){}

    public static void registerModels(){
        EquigenMod.LOGGER.info("HOOVES REGISTER MODELS CALLED");

        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Hoof(
                        GeneticValues.HOOF_SIZE.AVERAGE
                ),

                ModModelLayers.HOOF_AVERAGE_FRONT_LEFT,
                ModModelLayers.HOOF_AVERAGE_FRONT_RIGHT,
                ModModelLayers.HOOF_AVERAGE_BACK_LEFT,
                ModModelLayers.HOOF_AVERAGE_BACK_RIGHT,

                hoof_average::new,
                hoof_average::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Hoof(
                        GeneticValues.HOOF_SIZE.LARGE
                ),

                ModModelLayers.HOOF_LARGE_FRONT_LEFT,
                ModModelLayers.HOOF_LARGE_FRONT_RIGHT,
                ModModelLayers.HOOF_LARGE_BACK_LEFT,
                ModModelLayers.HOOF_LARGE_BACK_RIGHT,

                hoof_large::new,
                hoof_large::createBodyLayer);
    }
}
