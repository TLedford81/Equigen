package net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry.ModelPartRegistries;

import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.backs.back_average_short_thin;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.backs.back_lean_long_thick;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry.ModelPartRegistryKeys;
import net.buckleystudios.equigen.entity.custom.genetics.Genetics;

public final class BackModelPartRegistry {
    private BackModelPartRegistry(){}

    public static void registerModels() {
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                        Genetics.values.MUSCLE_MASS.LEAN,
                        Genetics.values.BACK_LENGTH.LONG,
                        Genetics.values.BACK_GIRTH.THICK
                ),
                ModModelLayers.BACK_LEAN_LONG_THICK,
                back_lean_long_thick::new);

        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                Genetics.values.MUSCLE_MASS.AVERAGE,
                Genetics.values.BACK_LENGTH.SHORT,
                Genetics.values.BACK_GIRTH.THIN
                ),
                ModModelLayers.BACK_AVERAGE_SHORT_THIN,
                back_average_short_thin::new
        );
    }
}






/*
        ModelPartRegistry.register(new ModelPartRegistryKeys.Back(
                Genetics.values.MUSCLE_MASS.LEAN,
                Genetics.values.BACK_LENGTH.LONG,
                Genetics.values.BACK_GIRTH.THICK
                ),
                ModModelLayers.BACK_LEAN_LONG_THICK,
                back_lean_long_thick::new);
    }
 */