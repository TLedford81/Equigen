package net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistries;

import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.partmodels.withers.withers_average;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.partmodels.withers.withers_lean;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.partmodels.withers.withers_muscular;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistryKeys;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;

public class WithersModelPartRegistry {
    private WithersModelPartRegistry(){}

    public static void registerModels(){
        ModelPartRegistry.register(new ModelPartRegistryKeys.Withers(
                        GeneticValues.MUSCLE_MASS.LEAN
                ),
                ModModelLayers.WITHERS_LEAN,
                withers_lean::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Withers(
                        GeneticValues.MUSCLE_MASS.AVERAGE
                ),
                ModModelLayers.WITHERS_AVERAGE,
                withers_average::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Withers(
                        GeneticValues.MUSCLE_MASS.MUSCULAR
                ),
                ModModelLayers.WITHERS_MUSCULAR,
                withers_muscular::new);
    }
}
