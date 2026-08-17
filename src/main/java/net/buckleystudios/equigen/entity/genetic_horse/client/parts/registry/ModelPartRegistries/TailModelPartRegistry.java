package net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistries;

import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.partmodels.tails.*;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistryKeys;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;

public class TailModelPartRegistry {
    private TailModelPartRegistry(){}

    public static void registerModels(){
        ModelPartRegistry.register(new ModelPartRegistryKeys.Tail(
                        GeneticValues.TAIL_THICKNESS.THIN,
                        GeneticValues.TAIL_LENGTH.SHORT
                ),
                ModModelLayers.TAIL_THIN_SHORT,
                tail_thin_short::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Tail(
                        GeneticValues.TAIL_THICKNESS.THIN,
                        GeneticValues.TAIL_LENGTH.AVERAGE
                ),
                ModModelLayers.TAIL_THIN_AVERAGE,
                tail_thin_average::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Tail(
                        GeneticValues.TAIL_THICKNESS.THIN,
                        GeneticValues.TAIL_LENGTH.LONG
                ),
                ModModelLayers.TAIL_THIN_LONG,
                tail_thin_long::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Tail(
                        GeneticValues.TAIL_THICKNESS.AVERAGE,
                        GeneticValues.TAIL_LENGTH.SHORT
                ),
                ModModelLayers.TAIL_AVERAGE_SHORT,
                tail_average_short::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Tail(
                        GeneticValues.TAIL_THICKNESS.AVERAGE,
                        GeneticValues.TAIL_LENGTH.AVERAGE
                ),
                ModModelLayers.TAIL_AVERAGE_AVERAGE,
                tail_average_average::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Tail(
                        GeneticValues.TAIL_THICKNESS.AVERAGE,
                        GeneticValues.TAIL_LENGTH.LONG
                ),
                ModModelLayers.TAIL_AVERAGE_LONG,
                tail_average_long::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Tail(
                        GeneticValues.TAIL_THICKNESS.THICK,
                        GeneticValues.TAIL_LENGTH.SHORT
                ),
                ModModelLayers.TAIL_THICK_SHORT,
                tail_thick_short::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Tail(
                        GeneticValues.TAIL_THICKNESS.THICK,
                        GeneticValues.TAIL_LENGTH.AVERAGE
                ),
                ModModelLayers.TAIL_THICK_AVERAGE,
                tail_thick_average::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Tail(
                        GeneticValues.TAIL_THICKNESS.THICK,
                        GeneticValues.TAIL_LENGTH.LONG
                ),
                ModModelLayers.TAIL_THICK_LONG,
                tail_thick_long::new);
    }
}
