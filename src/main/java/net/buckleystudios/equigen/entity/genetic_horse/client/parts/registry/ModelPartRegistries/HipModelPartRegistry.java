package net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistries;

import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.partmodels.hips.*;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistryKeys;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;

public class HipModelPartRegistry {
    private HipModelPartRegistry(){}

    public static void registerModels(){
        ModelPartRegistry.register(new ModelPartRegistryKeys.Hips(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.HIP_SIZE.SMALL_1
                ),
                ModModelLayers.HIPS_LEAN_SMALL_1,
                hips_lean_small_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Hips(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.HIP_SIZE.SMALL_2
                ),
                ModModelLayers.HIPS_LEAN_SMALL_2,
                hips_lean_small_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Hips(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.HIP_SIZE.AVERAGE_1
                ),
                ModModelLayers.HIPS_LEAN_AVERAGE_1,
                hips_lean_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Hips(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.HIP_SIZE.AVERAGE_2
                ),
                ModModelLayers.HIPS_LEAN_AVERAGE_2,
                hips_lean_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Hips(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.HIP_SIZE.LARGE_1
                ),
                ModModelLayers.HIPS_LEAN_LARGE_1,
                hips_lean_large_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Hips(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.HIP_SIZE.LARGE_2
                ),
                ModModelLayers.HIPS_LEAN_LARGE_2,
                hips_lean_large_2::new);
        //Average
        ModelPartRegistry.register(new ModelPartRegistryKeys.Hips(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.HIP_SIZE.SMALL_1
                ),
                ModModelLayers.HIPS_AVERAGE_SMALL_1,
                hips_average_small_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Hips(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.HIP_SIZE.SMALL_2
                ),
                ModModelLayers.HIPS_AVERAGE_SMALL_2,
                hips_average_small_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Hips(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.HIP_SIZE.AVERAGE_1
                ),
                ModModelLayers.HIPS_AVERAGE_AVERAGE_1,
                hips_average_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Hips(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.HIP_SIZE.AVERAGE_2
                ),
                ModModelLayers.HIPS_AVERAGE_AVERAGE_2,
                hips_average_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Hips(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.HIP_SIZE.LARGE_1
                ),
                ModModelLayers.HIPS_AVERAGE_LARGE_1,
                hips_average_large_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Hips(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.HIP_SIZE.LARGE_2
                ),
                ModModelLayers.HIPS_AVERAGE_LARGE_2,
                hips_average_large_2::new);
        //Muscular
        ModelPartRegistry.register(new ModelPartRegistryKeys.Hips(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.HIP_SIZE.SMALL_1
                ),
                ModModelLayers.HIPS_MUSCULAR_SMALL_1,
                hips_muscular_small_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Hips(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.HIP_SIZE.SMALL_2
                ),
                ModModelLayers.HIPS_MUSCULAR_SMALL_2,
                hips_muscular_small_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Hips(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.HIP_SIZE.AVERAGE_1
                ),
                ModModelLayers.HIPS_MUSCULAR_AVERAGE_1,
                hips_muscular_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Hips(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.HIP_SIZE.AVERAGE_2
                ),
                ModModelLayers.HIPS_MUSCULAR_AVERAGE_2,
                hips_muscular_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Hips(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.HIP_SIZE.LARGE_1
                ),
                ModModelLayers.HIPS_MUSCULAR_LARGE_1,
                hips_muscular_large_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Hips(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.HIP_SIZE.LARGE_2
                ),
                ModModelLayers.HIPS_MUSCULAR_LARGE_2,
                hips_muscular_large_2::new);
    }
}
