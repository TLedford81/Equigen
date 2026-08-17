package net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistries;

import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.partmodels.backs.*;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistryKeys;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;

public final class BackModelPartRegistry {
    private BackModelPartRegistry(){}

    public static void registerModels() {
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.BACK_LENGTH.SHORT,
                        GeneticValues.BACK_GIRTH.THIN
                ),
                ModModelLayers.BACK_LEAN_SHORT_THIN,
                back_lean_short_thin::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.BACK_LENGTH.SHORT,
                        GeneticValues.BACK_GIRTH.AVERAGE
                ),
                ModModelLayers.BACK_LEAN_SHORT_AVERAGE,
                back_lean_short_average::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.BACK_LENGTH.SHORT,
                        GeneticValues.BACK_GIRTH.THICK
                ),
                ModModelLayers.BACK_LEAN_SHORT_THICK,
                back_lean_short_thick::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.BACK_LENGTH.AVERAGE,
                        GeneticValues.BACK_GIRTH.THIN
                ),
                ModModelLayers.BACK_LEAN_AVERAGE_THIN,
                back_lean_average_thin::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.BACK_LENGTH.AVERAGE,
                        GeneticValues.BACK_GIRTH.AVERAGE
                ),
                ModModelLayers.BACK_LEAN_AVERAGE_AVERAGE,
                back_lean_average_average::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.BACK_LENGTH.AVERAGE,
                        GeneticValues.BACK_GIRTH.THICK
                ),
                ModModelLayers.BACK_LEAN_AVERAGE_THICK,
                back_lean_average_average::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.BACK_LENGTH.LONG,
                        GeneticValues.BACK_GIRTH.THIN
                ),
                ModModelLayers.BACK_LEAN_LONG_THIN,
                back_lean_long_thin::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.BACK_LENGTH.LONG,
                        GeneticValues.BACK_GIRTH.AVERAGE
                ),
                ModModelLayers.BACK_LEAN_LONG_AVERAGE,
                back_lean_long_average::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.BACK_LENGTH.LONG,
                        GeneticValues.BACK_GIRTH.THICK
                ),
                ModModelLayers.BACK_LEAN_LONG_THICK,
                back_lean_long_average::new);
        
       //AVERAGE
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.BACK_LENGTH.SHORT,
                        GeneticValues.BACK_GIRTH.THIN
                ),
                ModModelLayers.BACK_AVERAGE_SHORT_THIN,
                back_average_short_thin::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.BACK_LENGTH.SHORT,
                        GeneticValues.BACK_GIRTH.AVERAGE
                ),
                ModModelLayers.BACK_AVERAGE_SHORT_AVERAGE,
                back_average_short_average::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.BACK_LENGTH.SHORT,
                        GeneticValues.BACK_GIRTH.THICK
                ),
                ModModelLayers.BACK_AVERAGE_SHORT_THICK,
                back_average_short_thick::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.BACK_LENGTH.AVERAGE,
                        GeneticValues.BACK_GIRTH.THIN
                ),
                ModModelLayers.BACK_AVERAGE_AVERAGE_THIN,
                back_average_average_thin::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.BACK_LENGTH.AVERAGE,
                        GeneticValues.BACK_GIRTH.AVERAGE
                ),
                ModModelLayers.BACK_AVERAGE_AVERAGE_AVERAGE,
                back_average_average_average::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.BACK_LENGTH.AVERAGE,
                        GeneticValues.BACK_GIRTH.THICK
                ),
                ModModelLayers.BACK_AVERAGE_AVERAGE_THICK,
                back_average_average_average::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.BACK_LENGTH.LONG,
                        GeneticValues.BACK_GIRTH.THIN
                ),
                ModModelLayers.BACK_AVERAGE_LONG_THIN,
                back_average_long_thin::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.BACK_LENGTH.LONG,
                        GeneticValues.BACK_GIRTH.AVERAGE
                ),
                ModModelLayers.BACK_AVERAGE_LONG_AVERAGE,
                back_average_long_average::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.BACK_LENGTH.LONG,
                        GeneticValues.BACK_GIRTH.THICK
                ),
                ModModelLayers.BACK_AVERAGE_LONG_THICK,
                back_average_long_average::new);
        //MUSCULAR
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.BACK_LENGTH.SHORT,
                        GeneticValues.BACK_GIRTH.THIN
                ),
                ModModelLayers.BACK_MUSCULAR_SHORT_THIN,
                back_muscular_short_thin::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.BACK_LENGTH.SHORT,
                        GeneticValues.BACK_GIRTH.AVERAGE
                ),
                ModModelLayers.BACK_MUSCULAR_SHORT_AVERAGE,
                back_muscular_short_average::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.BACK_LENGTH.SHORT,
                        GeneticValues.BACK_GIRTH.THICK
                ),
                ModModelLayers.BACK_MUSCULAR_SHORT_THICK,
                back_muscular_short_thick::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.BACK_LENGTH.AVERAGE,
                        GeneticValues.BACK_GIRTH.THIN
                ),
                ModModelLayers.BACK_MUSCULAR_AVERAGE_THIN,
                back_muscular_average_thin::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.BACK_LENGTH.AVERAGE,
                        GeneticValues.BACK_GIRTH.AVERAGE
                ),
                ModModelLayers.BACK_MUSCULAR_AVERAGE_AVERAGE,
                back_muscular_average_average::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.BACK_LENGTH.AVERAGE,
                        GeneticValues.BACK_GIRTH.THICK
                ),
                ModModelLayers.BACK_MUSCULAR_AVERAGE_THICK,
                back_muscular_average_average::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.BACK_LENGTH.LONG,
                        GeneticValues.BACK_GIRTH.THIN
                ),
                ModModelLayers.BACK_MUSCULAR_LONG_THIN,
                back_muscular_long_thin::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.BACK_LENGTH.LONG,
                        GeneticValues.BACK_GIRTH.AVERAGE
                ),
                ModModelLayers.BACK_MUSCULAR_LONG_AVERAGE,
                back_muscular_long_average::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.BACK_LENGTH.LONG,
                        GeneticValues.BACK_GIRTH.THICK
                ),
                ModModelLayers.BACK_MUSCULAR_LONG_THICK,
                back_muscular_long_average::new);
    }
}






/*
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                GeneticValues.MUSCLE_MASS.LEAN,
                GeneticValues.BACK_LENGTH.LONG,
                GeneticValues.BACK_GIRTH.THICK
                ),
                ModModelLayers.BACK_LEAN_LONG_THICK,
                back_lean_long_thick::new);
    }
 */