package net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry.ModelPartRegistries;

import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.hooves.*;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry.ModelPartRegistryKeys;
import net.buckleystudios.equigen.entity.custom.genetics.Genetics;

public class HoovesModelPartRegistry {
    private HoovesModelPartRegistry(){}

    public static void registerModels(){
        ModelPartRegistry.register(new ModelPartRegistryKeys.Hoof(
                        Genetics.values.HOOF_SIZE.AVERAGE
                ),
                ModModelLayers.HOOF_AVERAGE,
                hoof_average::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Hoof(
                        Genetics.values.HOOF_SIZE.LARGE
                ),
                ModModelLayers.HOOF_LARGE,
                hoof_large::new);
    }
}
