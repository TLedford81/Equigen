package net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry.ModelPartRegistries;

import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.withers.*;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry.ModelPartRegistryKeys;
import net.buckleystudios.equigen.entity.custom.genetics.Genetics;

public class WithersModelPartRegistry {
    private WithersModelPartRegistry(){}

    public static void registerModels(){
        ModelPartRegistry.register(new ModelPartRegistryKeys.Withers(
                        Genetics.values.MUSCLE_MASS.LEAN
                ),
                ModModelLayers.WITHERS_LEAN,
                withers_lean::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Withers(
                        Genetics.values.MUSCLE_MASS.AVERAGE
                ),
                ModModelLayers.WITHERS_AVERAGE,
                withers_average::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Withers(
                        Genetics.values.MUSCLE_MASS.MUSCULAR
                ),
                ModModelLayers.WITHERS_MUSCULAR,
                withers_muscular::new);
    }
}
