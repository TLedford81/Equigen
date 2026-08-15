package net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry.ModelPartRegistries;

import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.heads.*;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry.ModelPartRegistryKeys;
import net.buckleystudios.equigen.entity.custom.genetics.GeneticValues;

public class HeadModelPartRegistry {
    private HeadModelPartRegistry(){}

    public static void registerModels(){
        ModelPartRegistry.register(new ModelPartRegistryKeys.Head(
                        GeneticValues.HEAD_TYPE.DISHED,
                        GeneticValues.MUSCLE_MASS.LEAN
                        ),
                ModModelLayers.HEAD_DISHED_LEAN,
                head_dished_lean::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Head(
                        GeneticValues.HEAD_TYPE.DISHED,
                        GeneticValues.MUSCLE_MASS.AVERAGE
                ),
                ModModelLayers.HEAD_DISHED_AVERAGE,
                head_dished_average::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Head(
                        GeneticValues.HEAD_TYPE.DISHED,
                        GeneticValues.MUSCLE_MASS.MUSCULAR
                ),
                ModModelLayers.HEAD_DISHED_MUSCULAR,
                head_dished_muscular::new);

        ModelPartRegistry.register(new ModelPartRegistryKeys.Head(
                        GeneticValues.HEAD_TYPE.ROMAN,
                        GeneticValues.MUSCLE_MASS.LEAN
                ),
                ModModelLayers.HEAD_ROMAN_LEAN,
                head_roman_lean::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Head(
                        GeneticValues.HEAD_TYPE.ROMAN,
                        GeneticValues.MUSCLE_MASS.AVERAGE
                ),
                ModModelLayers.HEAD_ROMAN_AVERAGE,
                head_roman_average::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Head(
                        GeneticValues.HEAD_TYPE.ROMAN,
                        GeneticValues.MUSCLE_MASS.MUSCULAR
                ),
                ModModelLayers.HEAD_ROMAN_MUSCULAR,
                head_roman_muscular::new);

        ModelPartRegistry.register(new ModelPartRegistryKeys.Head(
                        GeneticValues.HEAD_TYPE.STOCKY,
                        GeneticValues.MUSCLE_MASS.LEAN
                ),
                ModModelLayers.HEAD_STOCKY_LEAN,
                head_stocky_lean::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Head(
                        GeneticValues.HEAD_TYPE.STOCKY,
                        GeneticValues.MUSCLE_MASS.AVERAGE
                ),
                ModModelLayers.HEAD_STOCKY_AVERAGE,
                head_stocky_average::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Head(
                        GeneticValues.HEAD_TYPE.STOCKY,
                        GeneticValues.MUSCLE_MASS.MUSCULAR
                ),
                ModModelLayers.HEAD_STOCKY_MUSCULAR,
                head_stocky_muscular::new);

        ModelPartRegistry.register(new ModelPartRegistryKeys.Head(
                        GeneticValues.HEAD_TYPE.STRAIGHT,
                        GeneticValues.MUSCLE_MASS.LEAN
                ),
                ModModelLayers.HEAD_STRAIGHT_LEAN,
                head_straight_lean::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Head(
                        GeneticValues.HEAD_TYPE.STRAIGHT,
                        GeneticValues.MUSCLE_MASS.AVERAGE
                ),
                ModModelLayers.HEAD_STRAIGHT_AVERAGE,
                head_straight_average::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Head(
                        GeneticValues.HEAD_TYPE.STRAIGHT,
                        GeneticValues.MUSCLE_MASS.MUSCULAR
                ),
                ModModelLayers.HEAD_STRAIGHT_MUSCULAR,
                head_straight_muscular::new);
    }
}
