package net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry.ModelPartRegistries;

import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.stomachs.*;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry.ModelPartRegistryKeys;
import net.buckleystudios.equigen.entity.custom.genetics.Genetics;

public class StomachModelPartRegistry {
    private StomachModelPartRegistry(){}

    public static void registerModels(){
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.LEAN,
                        Genetics.values.STOMACH_LENGTH.SHORT,
                        Genetics.values.STOMACH_CURVE.LOW
                ),
                ModModelLayers.STOMACH_LEAN_SHORT_LOW,
                stomach_lean_short_low::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.LEAN,
                        Genetics.values.STOMACH_LENGTH.SHORT,
                        Genetics.values.STOMACH_CURVE.MEDIUM
                ),
                ModModelLayers.STOMACH_LEAN_SHORT_MEDIUM,
                stomach_lean_short_medium::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.LEAN,
                        Genetics.values.STOMACH_LENGTH.SHORT,
                        Genetics.values.STOMACH_CURVE.HIGH
                ),
                ModModelLayers.STOMACH_LEAN_SHORT_HIGH,
                stomach_lean_short_high::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.LEAN,
                        Genetics.values.STOMACH_LENGTH.AVERAGE,
                        Genetics.values.STOMACH_CURVE.LOW
                ),
                ModModelLayers.STOMACH_LEAN_AVERAGE_LOW,
                stomach_lean_average_low::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.LEAN,
                        Genetics.values.STOMACH_LENGTH.AVERAGE,
                        Genetics.values.STOMACH_CURVE.MEDIUM
                ),
                ModModelLayers.STOMACH_LEAN_AVERAGE_MEDIUM,
                stomach_lean_average_medium::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.LEAN,
                        Genetics.values.STOMACH_LENGTH.AVERAGE,
                        Genetics.values.STOMACH_CURVE.HIGH
                ),
                ModModelLayers.STOMACH_LEAN_AVERAGE_HIGH,
                stomach_lean_average_high::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.LEAN,
                        Genetics.values.STOMACH_LENGTH.LONG,
                        Genetics.values.STOMACH_CURVE.LOW
                ),
                ModModelLayers.STOMACH_LEAN_LONG_LOW,
                stomach_lean_long_low::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.LEAN,
                        Genetics.values.STOMACH_LENGTH.LONG,
                        Genetics.values.STOMACH_CURVE.MEDIUM
                ),
                ModModelLayers.STOMACH_LEAN_LONG_MEDIUM,
                stomach_lean_long_medium::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.LEAN,
                        Genetics.values.STOMACH_LENGTH.LONG,
                        Genetics.values.STOMACH_CURVE.HIGH
                ),
                ModModelLayers.STOMACH_LEAN_LONG_HIGH,
                stomach_lean_long_high::new);
        //AVERAGE
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.AVERAGE,
                        Genetics.values.STOMACH_LENGTH.SHORT,
                        Genetics.values.STOMACH_CURVE.LOW
                ),
                ModModelLayers.STOMACH_AVERAGE_SHORT_LOW,
                stomach_average_short_low::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.AVERAGE,
                        Genetics.values.STOMACH_LENGTH.SHORT,
                        Genetics.values.STOMACH_CURVE.MEDIUM
                ),
                ModModelLayers.STOMACH_AVERAGE_SHORT_MEDIUM,
                stomach_average_short_medium::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.AVERAGE,
                        Genetics.values.STOMACH_LENGTH.SHORT,
                        Genetics.values.STOMACH_CURVE.HIGH
                ),
                ModModelLayers.STOMACH_AVERAGE_SHORT_HIGH,
                stomach_average_short_high::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.AVERAGE,
                        Genetics.values.STOMACH_LENGTH.AVERAGE,
                        Genetics.values.STOMACH_CURVE.LOW
                ),
                ModModelLayers.STOMACH_AVERAGE_AVERAGE_LOW,
                stomach_average_average_low::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.AVERAGE,
                        Genetics.values.STOMACH_LENGTH.AVERAGE,
                        Genetics.values.STOMACH_CURVE.MEDIUM
                ),
                ModModelLayers.STOMACH_AVERAGE_AVERAGE_MEDIUM,
                stomach_average_average_medium::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.AVERAGE,
                        Genetics.values.STOMACH_LENGTH.AVERAGE,
                        Genetics.values.STOMACH_CURVE.HIGH
                ),
                ModModelLayers.STOMACH_AVERAGE_AVERAGE_HIGH,
                stomach_average_average_high::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.AVERAGE,
                        Genetics.values.STOMACH_LENGTH.LONG,
                        Genetics.values.STOMACH_CURVE.LOW
                ),
                ModModelLayers.STOMACH_AVERAGE_LONG_LOW,
                stomach_average_long_low::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.AVERAGE,
                        Genetics.values.STOMACH_LENGTH.LONG,
                        Genetics.values.STOMACH_CURVE.MEDIUM
                ),
                ModModelLayers.STOMACH_AVERAGE_LONG_MEDIUM,
                stomach_average_long_medium::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.AVERAGE,
                        Genetics.values.STOMACH_LENGTH.LONG,
                        Genetics.values.STOMACH_CURVE.HIGH
                ),
                ModModelLayers.STOMACH_AVERAGE_LONG_HIGH,
                stomach_average_long_high::new);
        
        //MUSCULAR
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.MUSCULAR,
                        Genetics.values.STOMACH_LENGTH.SHORT,
                        Genetics.values.STOMACH_CURVE.LOW
                ),
                ModModelLayers.STOMACH_MUSCULAR_SHORT_LOW,
                stomach_muscular_short_low::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.MUSCULAR,
                        Genetics.values.STOMACH_LENGTH.SHORT,
                        Genetics.values.STOMACH_CURVE.MEDIUM
                ),
                ModModelLayers.STOMACH_MUSCULAR_SHORT_MEDIUM,
                stomach_muscular_short_medium::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.MUSCULAR,
                        Genetics.values.STOMACH_LENGTH.SHORT,
                        Genetics.values.STOMACH_CURVE.HIGH
                ),
                ModModelLayers.STOMACH_MUSCULAR_SHORT_HIGH,
                stomach_muscular_short_high::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.MUSCULAR,
                        Genetics.values.STOMACH_LENGTH.AVERAGE,
                        Genetics.values.STOMACH_CURVE.LOW
                ),
                ModModelLayers.STOMACH_MUSCULAR_AVERAGE_LOW,
                stomach_muscular_average_low::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.MUSCULAR,
                        Genetics.values.STOMACH_LENGTH.AVERAGE,
                        Genetics.values.STOMACH_CURVE.MEDIUM
                ),
                ModModelLayers.STOMACH_MUSCULAR_AVERAGE_MEDIUM,
                stomach_muscular_average_medium::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.MUSCULAR,
                        Genetics.values.STOMACH_LENGTH.AVERAGE,
                        Genetics.values.STOMACH_CURVE.HIGH
                ),
                ModModelLayers.STOMACH_MUSCULAR_AVERAGE_HIGH,
                stomach_muscular_average_high::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.MUSCULAR,
                        Genetics.values.STOMACH_LENGTH.LONG,
                        Genetics.values.STOMACH_CURVE.LOW
                ),
                ModModelLayers.STOMACH_MUSCULAR_LONG_LOW,
                stomach_muscular_long_low::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.MUSCULAR,
                        Genetics.values.STOMACH_LENGTH.LONG,
                        Genetics.values.STOMACH_CURVE.MEDIUM
                ),
                ModModelLayers.STOMACH_MUSCULAR_LONG_MEDIUM,
                stomach_muscular_long_medium::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Stomach(
                        Genetics.values.MUSCLE_MASS.MUSCULAR,
                        Genetics.values.STOMACH_LENGTH.LONG,
                        Genetics.values.STOMACH_CURVE.HIGH
                ),
                ModModelLayers.STOMACH_MUSCULAR_LONG_HIGH,
                stomach_muscular_long_high::new);
    }
}
