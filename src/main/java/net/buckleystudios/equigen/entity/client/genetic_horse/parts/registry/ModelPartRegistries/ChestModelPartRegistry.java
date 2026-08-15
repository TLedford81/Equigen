package net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry.ModelPartRegistries;

import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.chests.*;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry.ModelPartRegistryKeys;
import net.buckleystudios.equigen.entity.custom.genetics.GeneticValues;

public class ChestModelPartRegistry {

    private ChestModelPartRegistry(){}

    public static void registerModels(){
        ModelPartRegistry.register(new ModelPartRegistryKeys.Chest(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.CHEST_SIZE.SMALL_1
                ),
                ModModelLayers.CHEST_LEAN_SMALL_1,
                chest_lean_small_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Chest(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.CHEST_SIZE.SMALL_2
                ),
                ModModelLayers.CHEST_LEAN_SMALL_2,
                chest_lean_small_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Chest(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.CHEST_SIZE.AVERAGE_1
                ),
                ModModelLayers.CHEST_LEAN_AVERAGE_1,
                chest_lean_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Chest(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.CHEST_SIZE.AVERAGE_2
                ),
                ModModelLayers.CHEST_LEAN_AVERAGE_2,
                chest_lean_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Chest(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.CHEST_SIZE.LARGE_1
                ),
                ModModelLayers.CHEST_LEAN_LARGE_1,
                chest_lean_large_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Chest(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.CHEST_SIZE.LARGE_2
                ),
                ModModelLayers.CHEST_LEAN_LARGE_2,
                chest_lean_large_2::new);
        //Average
        ModelPartRegistry.register(new ModelPartRegistryKeys.Chest(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.CHEST_SIZE.SMALL_1
                ),
                ModModelLayers.CHEST_AVERAGE_SMALL_1,
                chest_average_small_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Chest(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.CHEST_SIZE.SMALL_2
                ),
                ModModelLayers.CHEST_AVERAGE_SMALL_2,
                chest_average_small_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Chest(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.CHEST_SIZE.AVERAGE_1
                ),
                ModModelLayers.CHEST_AVERAGE_AVERAGE_1,
                chest_average_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Chest(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.CHEST_SIZE.AVERAGE_2
                ),
                ModModelLayers.CHEST_AVERAGE_AVERAGE_2,
                chest_average_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Chest(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.CHEST_SIZE.LARGE_1
                ),
                ModModelLayers.CHEST_AVERAGE_LARGE_1,
                chest_average_large_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Chest(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.CHEST_SIZE.LARGE_2
                ),
                ModModelLayers.CHEST_AVERAGE_LARGE_2,
                chest_average_large_2::new);
        //Muscular
        ModelPartRegistry.register(new ModelPartRegistryKeys.Chest(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.CHEST_SIZE.SMALL_1
                ),
                ModModelLayers.CHEST_MUSCULAR_SMALL_1,
                chest_muscular_small_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Chest(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.CHEST_SIZE.SMALL_2
                ),
                ModModelLayers.CHEST_MUSCULAR_SMALL_2,
                chest_muscular_small_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Chest(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.CHEST_SIZE.AVERAGE_1
                ),
                ModModelLayers.CHEST_MUSCULAR_AVERAGE_1,
                chest_muscular_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Chest(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.CHEST_SIZE.AVERAGE_2
                ),
                ModModelLayers.CHEST_MUSCULAR_AVERAGE_2,
                chest_muscular_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Chest(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.CHEST_SIZE.LARGE_1
                ),
                ModModelLayers.CHEST_MUSCULAR_LARGE_1,
                chest_muscular_large_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Chest(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.CHEST_SIZE.LARGE_2
                ),
                ModModelLayers.CHEST_MUSCULAR_LARGE_2,
                chest_muscular_large_2::new);
    }
}
