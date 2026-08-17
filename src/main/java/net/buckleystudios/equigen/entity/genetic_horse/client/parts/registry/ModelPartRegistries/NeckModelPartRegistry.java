package net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistries;

import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.partmodels.necks.arched.*;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.partmodels.necks.ewed.*;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.partmodels.necks.straight.*;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.partmodels.necks.swan.*;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistryKeys;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;

public class NeckModelPartRegistry {
    private NeckModelPartRegistry(){}

    public static void registerModels(){
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.NECK_CURVE.EWED,
                        GeneticValues.NECK_LENGTH.SHORT_1
                ),
                ModModelLayers.NECK_LEAN_EWED_SHORT_1,
                neck_lean_ewed_short_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.NECK_CURVE.EWED,
                        GeneticValues.NECK_LENGTH.SHORT_2
                ),
                ModModelLayers.NECK_LEAN_EWED_SHORT_2,
                neck_lean_ewed_short_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.NECK_CURVE.EWED,
                        GeneticValues.NECK_LENGTH.AVERAGE_1
                ),
                ModModelLayers.NECK_LEAN_EWED_AVERAGE_1,
                neck_lean_ewed_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.NECK_CURVE.EWED,
                        GeneticValues.NECK_LENGTH.AVERAGE_2
                ),
                ModModelLayers.NECK_LEAN_EWED_AVERAGE_2,
                neck_lean_ewed_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.NECK_CURVE.EWED,
                        GeneticValues.NECK_LENGTH.LONG_1
                ),
                ModModelLayers.NECK_LEAN_EWED_LONG_1,
                neck_lean_ewed_long_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.NECK_CURVE.EWED,
                        GeneticValues.NECK_LENGTH.LONG_2
                ),
                ModModelLayers.NECK_LEAN_EWED_LONG_2,
                neck_lean_ewed_long_2::new);
        // AVERAGE EWED
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.NECK_CURVE.EWED,
                        GeneticValues.NECK_LENGTH.SHORT_1
                ),
                ModModelLayers.NECK_AVERAGE_EWED_SHORT_1,
                neck_average_ewed_short_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.NECK_CURVE.EWED,
                        GeneticValues.NECK_LENGTH.SHORT_2
                ),
                ModModelLayers.NECK_AVERAGE_EWED_SHORT_2,
                neck_average_ewed_short_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.NECK_CURVE.EWED,
                        GeneticValues.NECK_LENGTH.AVERAGE_1
                ),
                ModModelLayers.NECK_AVERAGE_EWED_AVERAGE_1,
                neck_average_ewed_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.NECK_CURVE.EWED,
                        GeneticValues.NECK_LENGTH.AVERAGE_2
                ),
                ModModelLayers.NECK_AVERAGE_EWED_AVERAGE_2,
                neck_average_ewed_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.NECK_CURVE.EWED,
                        GeneticValues.NECK_LENGTH.LONG_1
                ),
                ModModelLayers.NECK_AVERAGE_EWED_LONG_1,
                neck_average_ewed_long_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.NECK_CURVE.EWED,
                        GeneticValues.NECK_LENGTH.LONG_2
                ),
                ModModelLayers.NECK_AVERAGE_EWED_LONG_2,
                neck_average_ewed_long_2::new);
        // MUSCULAR EWED
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.NECK_CURVE.EWED,
                        GeneticValues.NECK_LENGTH.SHORT_1
                ),
                ModModelLayers.NECK_MUSCULAR_EWED_SHORT_1,
                neck_muscular_ewed_short_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.NECK_CURVE.EWED,
                        GeneticValues.NECK_LENGTH.SHORT_2
                ),
                ModModelLayers.NECK_MUSCULAR_EWED_SHORT_2,
                neck_muscular_ewed_short_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.NECK_CURVE.EWED,
                        GeneticValues.NECK_LENGTH.AVERAGE_1
                ),
                ModModelLayers.NECK_MUSCULAR_EWED_AVERAGE_1,
                neck_muscular_ewed_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.NECK_CURVE.EWED,
                        GeneticValues.NECK_LENGTH.AVERAGE_2
                ),
                ModModelLayers.NECK_MUSCULAR_EWED_AVERAGE_2,
                neck_muscular_ewed_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.NECK_CURVE.EWED,
                        GeneticValues.NECK_LENGTH.LONG_1
                ),
                ModModelLayers.NECK_MUSCULAR_EWED_LONG_1,
                neck_muscular_ewed_long_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.NECK_CURVE.EWED,
                        GeneticValues.NECK_LENGTH.LONG_2
                ),
                ModModelLayers.NECK_MUSCULAR_EWED_LONG_2,
                neck_muscular_ewed_long_2::new);


// ARCHED
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.NECK_CURVE.ARCHED,
                        GeneticValues.NECK_LENGTH.SHORT_1
                ),
                ModModelLayers.NECK_LEAN_ARCHED_SHORT_1,
                neck_lean_arched_short_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.NECK_CURVE.ARCHED,
                        GeneticValues.NECK_LENGTH.SHORT_2
                ),
                ModModelLayers.NECK_LEAN_ARCHED_SHORT_2,
                neck_lean_arched_short_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.NECK_CURVE.ARCHED,
                        GeneticValues.NECK_LENGTH.AVERAGE_1
                ),
                ModModelLayers.NECK_LEAN_ARCHED_AVERAGE_1,
                neck_lean_arched_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.NECK_CURVE.ARCHED,
                        GeneticValues.NECK_LENGTH.AVERAGE_2
                ),
                ModModelLayers.NECK_LEAN_ARCHED_AVERAGE_2,
                neck_lean_arched_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.NECK_CURVE.ARCHED,
                        GeneticValues.NECK_LENGTH.LONG_1
                ),
                ModModelLayers.NECK_LEAN_ARCHED_LONG_1,
                neck_lean_arched_long_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.NECK_CURVE.ARCHED,
                        GeneticValues.NECK_LENGTH.LONG_2
                ),
                ModModelLayers.NECK_LEAN_ARCHED_LONG_2,
                neck_lean_arched_long_2::new);
        // AVERAGE ARCHED
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.NECK_CURVE.ARCHED,
                        GeneticValues.NECK_LENGTH.SHORT_1
                ),
                ModModelLayers.NECK_AVERAGE_ARCHED_SHORT_1,
                neck_average_arched_short_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.NECK_CURVE.ARCHED,
                        GeneticValues.NECK_LENGTH.SHORT_2
                ),
                ModModelLayers.NECK_AVERAGE_ARCHED_SHORT_2,
                neck_average_arched_short_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.NECK_CURVE.ARCHED,
                        GeneticValues.NECK_LENGTH.AVERAGE_1
                ),
                ModModelLayers.NECK_AVERAGE_ARCHED_AVERAGE_1,
                neck_average_arched_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.NECK_CURVE.ARCHED,
                        GeneticValues.NECK_LENGTH.AVERAGE_2
                ),
                ModModelLayers.NECK_AVERAGE_ARCHED_AVERAGE_2,
                neck_average_arched_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.NECK_CURVE.ARCHED,
                        GeneticValues.NECK_LENGTH.LONG_1
                ),
                ModModelLayers.NECK_AVERAGE_ARCHED_LONG_1,
                neck_average_arched_long_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.NECK_CURVE.ARCHED,
                        GeneticValues.NECK_LENGTH.LONG_2
                ),
                ModModelLayers.NECK_AVERAGE_ARCHED_LONG_2,
                neck_average_arched_long_2::new);
        // MUSCULAR ARCHED
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.NECK_CURVE.ARCHED,
                        GeneticValues.NECK_LENGTH.SHORT_1
                ),
                ModModelLayers.NECK_MUSCULAR_ARCHED_SHORT_1,
                neck_muscular_arched_short_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.NECK_CURVE.ARCHED,
                        GeneticValues.NECK_LENGTH.SHORT_2
                ),
                ModModelLayers.NECK_MUSCULAR_ARCHED_SHORT_2,
                neck_muscular_arched_short_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.NECK_CURVE.ARCHED,
                        GeneticValues.NECK_LENGTH.AVERAGE_1
                ),
                ModModelLayers.NECK_MUSCULAR_ARCHED_AVERAGE_1,
                neck_muscular_arched_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.NECK_CURVE.ARCHED,
                        GeneticValues.NECK_LENGTH.AVERAGE_2
                ),
                ModModelLayers.NECK_MUSCULAR_ARCHED_AVERAGE_2,
                neck_muscular_arched_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.NECK_CURVE.ARCHED,
                        GeneticValues.NECK_LENGTH.LONG_1
                ),
                ModModelLayers.NECK_MUSCULAR_ARCHED_LONG_1,
                neck_muscular_arched_long_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.NECK_CURVE.ARCHED,
                        GeneticValues.NECK_LENGTH.LONG_2
                ),
                ModModelLayers.NECK_MUSCULAR_ARCHED_LONG_2,
                neck_muscular_arched_long_2::new);



        //STRAIGHT
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.NECK_CURVE.STRAIGHT,
                        GeneticValues.NECK_LENGTH.SHORT_1
                ),
                ModModelLayers.NECK_LEAN_STRAIGHT_SHORT_1,
                neck_lean_straight_short_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.NECK_CURVE.STRAIGHT,
                        GeneticValues.NECK_LENGTH.SHORT_2
                ),
                ModModelLayers.NECK_LEAN_STRAIGHT_SHORT_2,
                neck_lean_straight_short_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.NECK_CURVE.STRAIGHT,
                        GeneticValues.NECK_LENGTH.AVERAGE_1
                ),
                ModModelLayers.NECK_LEAN_STRAIGHT_AVERAGE_1,
                neck_lean_straight_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.NECK_CURVE.STRAIGHT,
                        GeneticValues.NECK_LENGTH.AVERAGE_2
                ),
                ModModelLayers.NECK_LEAN_STRAIGHT_AVERAGE_2,
                neck_lean_straight_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.NECK_CURVE.STRAIGHT,
                        GeneticValues.NECK_LENGTH.LONG_1
                ),
                ModModelLayers.NECK_LEAN_STRAIGHT_LONG_1,
                neck_lean_straight_long_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.NECK_CURVE.STRAIGHT,
                        GeneticValues.NECK_LENGTH.LONG_2
                ),
                ModModelLayers.NECK_LEAN_STRAIGHT_LONG_2,
                neck_lean_straight_long_2::new);
        // AVERAGE STRAIGHT
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.NECK_CURVE.STRAIGHT,
                        GeneticValues.NECK_LENGTH.SHORT_1
                ),
                ModModelLayers.NECK_AVERAGE_STRAIGHT_SHORT_1,
                neck_average_straight_short_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.NECK_CURVE.STRAIGHT,
                        GeneticValues.NECK_LENGTH.SHORT_2
                ),
                ModModelLayers.NECK_AVERAGE_STRAIGHT_SHORT_2,
                neck_average_straight_short_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.NECK_CURVE.STRAIGHT,
                        GeneticValues.NECK_LENGTH.AVERAGE_1
                ),
                ModModelLayers.NECK_AVERAGE_STRAIGHT_AVERAGE_1,
                neck_average_straight_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.NECK_CURVE.STRAIGHT,
                        GeneticValues.NECK_LENGTH.AVERAGE_2
                ),
                ModModelLayers.NECK_AVERAGE_STRAIGHT_AVERAGE_2,
                neck_average_straight_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.NECK_CURVE.STRAIGHT,
                        GeneticValues.NECK_LENGTH.LONG_1
                ),
                ModModelLayers.NECK_AVERAGE_STRAIGHT_LONG_1,
                neck_average_straight_long_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.NECK_CURVE.STRAIGHT,
                        GeneticValues.NECK_LENGTH.LONG_2
                ),
                ModModelLayers.NECK_AVERAGE_STRAIGHT_LONG_2,
                neck_average_straight_long_2::new);
        // MUSCULAR STRAIGHT
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.NECK_CURVE.STRAIGHT,
                        GeneticValues.NECK_LENGTH.SHORT_1
                ),
                ModModelLayers.NECK_MUSCULAR_STRAIGHT_SHORT_1,
                neck_muscular_straight_short_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.NECK_CURVE.STRAIGHT,
                        GeneticValues.NECK_LENGTH.SHORT_2
                ),
                ModModelLayers.NECK_MUSCULAR_STRAIGHT_SHORT_2,
                neck_muscular_straight_short_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.NECK_CURVE.STRAIGHT,
                        GeneticValues.NECK_LENGTH.AVERAGE_1
                ),
                ModModelLayers.NECK_MUSCULAR_STRAIGHT_AVERAGE_1,
                neck_muscular_straight_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.NECK_CURVE.STRAIGHT,
                        GeneticValues.NECK_LENGTH.AVERAGE_2
                ),
                ModModelLayers.NECK_MUSCULAR_STRAIGHT_AVERAGE_2,
                neck_muscular_straight_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.NECK_CURVE.STRAIGHT,
                        GeneticValues.NECK_LENGTH.LONG_1
                ),
                ModModelLayers.NECK_MUSCULAR_STRAIGHT_LONG_1,
                neck_muscular_straight_long_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.NECK_CURVE.STRAIGHT,
                        GeneticValues.NECK_LENGTH.LONG_2
                ),
                ModModelLayers.NECK_MUSCULAR_STRAIGHT_LONG_2,
                neck_muscular_straight_long_2::new);


        //SWAN
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.NECK_CURVE.SWAN,
                        GeneticValues.NECK_LENGTH.SHORT_1
                ),
                ModModelLayers.NECK_LEAN_SWAN_SHORT_1,
                neck_lean_swan_short_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.NECK_CURVE.SWAN,
                        GeneticValues.NECK_LENGTH.SHORT_2
                ),
                ModModelLayers.NECK_LEAN_SWAN_SHORT_2,
                neck_lean_swan_short_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.NECK_CURVE.SWAN,
                        GeneticValues.NECK_LENGTH.AVERAGE_1
                ),
                ModModelLayers.NECK_LEAN_SWAN_AVERAGE_1,
                neck_lean_swan_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.NECK_CURVE.SWAN,
                        GeneticValues.NECK_LENGTH.AVERAGE_2
                ),
                ModModelLayers.NECK_LEAN_SWAN_AVERAGE_2,
                neck_lean_swan_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.NECK_CURVE.SWAN,
                        GeneticValues.NECK_LENGTH.LONG_1
                ),
                ModModelLayers.NECK_LEAN_SWAN_LONG_1,
                neck_lean_swan_long_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.LEAN,
                        GeneticValues.NECK_CURVE.SWAN,
                        GeneticValues.NECK_LENGTH.LONG_2
                ),
                ModModelLayers.NECK_LEAN_SWAN_LONG_2,
                neck_lean_swan_long_2::new);
        // AVERAGE SWAN
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.NECK_CURVE.SWAN,
                        GeneticValues.NECK_LENGTH.SHORT_1
                ),
                ModModelLayers.NECK_AVERAGE_SWAN_SHORT_1,
                neck_average_swan_short_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.NECK_CURVE.SWAN,
                        GeneticValues.NECK_LENGTH.SHORT_2
                ),
                ModModelLayers.NECK_AVERAGE_SWAN_SHORT_2,
                neck_average_swan_short_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.NECK_CURVE.SWAN,
                        GeneticValues.NECK_LENGTH.AVERAGE_1
                ),
                ModModelLayers.NECK_AVERAGE_SWAN_AVERAGE_1,
                neck_average_swan_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.NECK_CURVE.SWAN,
                        GeneticValues.NECK_LENGTH.AVERAGE_2
                ),
                ModModelLayers.NECK_AVERAGE_SWAN_AVERAGE_2,
                neck_average_swan_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.NECK_CURVE.SWAN,
                        GeneticValues.NECK_LENGTH.LONG_1
                ),
                ModModelLayers.NECK_AVERAGE_SWAN_LONG_1,
                neck_average_swan_long_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.AVERAGE,
                        GeneticValues.NECK_CURVE.SWAN,
                        GeneticValues.NECK_LENGTH.LONG_2
                ),
                ModModelLayers.NECK_AVERAGE_SWAN_LONG_2,
                neck_average_swan_long_2::new);
        // MUSCULAR SWAN
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.NECK_CURVE.SWAN,
                        GeneticValues.NECK_LENGTH.SHORT_1
                ),
                ModModelLayers.NECK_MUSCULAR_SWAN_SHORT_1,
                neck_muscular_swan_short_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.NECK_CURVE.SWAN,
                        GeneticValues.NECK_LENGTH.SHORT_2
                ),
                ModModelLayers.NECK_MUSCULAR_SWAN_SHORT_2,
                neck_muscular_swan_short_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.NECK_CURVE.SWAN,
                        GeneticValues.NECK_LENGTH.AVERAGE_1
                ),
                ModModelLayers.NECK_MUSCULAR_SWAN_AVERAGE_1,
                neck_muscular_swan_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.NECK_CURVE.SWAN,
                        GeneticValues.NECK_LENGTH.AVERAGE_2
                ),
                ModModelLayers.NECK_MUSCULAR_SWAN_AVERAGE_2,
                neck_muscular_swan_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.NECK_CURVE.SWAN,
                        GeneticValues.NECK_LENGTH.LONG_1
                ),
                ModModelLayers.NECK_MUSCULAR_SWAN_LONG_1,
                neck_muscular_swan_long_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Neck(
                        GeneticValues.MUSCLE_MASS.MUSCULAR,
                        GeneticValues.NECK_CURVE.SWAN,
                        GeneticValues.NECK_LENGTH.LONG_2
                ),
                ModModelLayers.NECK_MUSCULAR_SWAN_LONG_2,
                neck_muscular_swan_long_2::new);
    }
}
