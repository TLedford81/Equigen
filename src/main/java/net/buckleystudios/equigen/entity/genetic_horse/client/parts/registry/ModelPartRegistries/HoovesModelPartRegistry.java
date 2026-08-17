package net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistries;

import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.partmodels.hooves.hoof_average;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.partmodels.hooves.hoof_large;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistryKeys;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;

public class HoovesModelPartRegistry {
    private HoovesModelPartRegistry(){}

    public static void registerModels(){
        ModelPartRegistry.register(new ModelPartRegistryKeys.Hoof(
                        GeneticValues.HOOF_SIZE.AVERAGE
                ),
                ModModelLayers.HOOF_AVERAGE,
                hoof_average::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Hoof(
                        GeneticValues.HOOF_SIZE.LARGE
                ),
                ModModelLayers.HOOF_LARGE,
                hoof_large::new);
    }
}
