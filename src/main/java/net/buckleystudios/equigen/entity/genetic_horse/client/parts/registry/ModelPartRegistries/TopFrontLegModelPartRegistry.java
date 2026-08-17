package net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistries;

import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.partmodels.topfrontlegs.*;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistryKeys;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;

public class TopFrontLegModelPartRegistry {
    private TopFrontLegModelPartRegistry(){}

    public static void registerModels(){
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Front_Legs(
                        GeneticValues.LEG_WIDTH.AVERAGE,
                        GeneticValues.TOP_LEG.SHORT_1
                ),
                ModModelLayers.TOP_FRONT_LEGS_AVERAGE_SHORT_1,
                top_front_legs_average_short_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Front_Legs(
                        GeneticValues.LEG_WIDTH.AVERAGE,
                        GeneticValues.TOP_LEG.SHORT_2
                ),
                ModModelLayers.TOP_FRONT_LEGS_AVERAGE_SHORT_2,
                top_front_legs_average_short_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Front_Legs(
                        GeneticValues.LEG_WIDTH.AVERAGE,
                        GeneticValues.TOP_LEG.SHORT_3
                ),
                ModModelLayers.TOP_FRONT_LEGS_AVERAGE_SHORT_3,
                top_front_legs_average_short_3::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Front_Legs(
                        GeneticValues.LEG_WIDTH.AVERAGE,
                        GeneticValues.TOP_LEG.AVERAGE_1
                ),
                ModModelLayers.TOP_FRONT_LEGS_AVERAGE_AVERAGE_1,
                top_front_legs_average_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Front_Legs(
                        GeneticValues.LEG_WIDTH.AVERAGE,
                        GeneticValues.TOP_LEG.AVERAGE_2
                ),
                ModModelLayers.TOP_FRONT_LEGS_AVERAGE_AVERAGE_2,
                top_front_legs_average_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Front_Legs(
                        GeneticValues.LEG_WIDTH.AVERAGE,
                        GeneticValues.TOP_LEG.AVERAGE_3
                ),
                ModModelLayers.TOP_FRONT_LEGS_AVERAGE_AVERAGE_3,
                top_front_legs_average_average_3::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Front_Legs(
                        GeneticValues.LEG_WIDTH.AVERAGE,
                        GeneticValues.TOP_LEG.LONG_1
                ),
                ModModelLayers.TOP_FRONT_LEGS_AVERAGE_LONG_1,
                top_front_legs_average_long_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Front_Legs(
                        GeneticValues.LEG_WIDTH.AVERAGE,
                        GeneticValues.TOP_LEG.LONG_2
                ),
                ModModelLayers.TOP_FRONT_LEGS_AVERAGE_LONG_2,
                top_front_legs_average_long_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Front_Legs(
                        GeneticValues.LEG_WIDTH.AVERAGE,
                        GeneticValues.TOP_LEG.LONG_3
                ),
                ModModelLayers.TOP_FRONT_LEGS_AVERAGE_LONG_3,
                top_front_legs_average_long_3::new);



        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Front_Legs(
                        GeneticValues.LEG_WIDTH.THICK,
                        GeneticValues.TOP_LEG.SHORT_1
                ),
                ModModelLayers.TOP_FRONT_LEGS_THICK_SHORT_1,
                top_front_legs_thick_short_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Front_Legs(
                        GeneticValues.LEG_WIDTH.THICK,
                        GeneticValues.TOP_LEG.SHORT_2
                ),
                ModModelLayers.TOP_FRONT_LEGS_THICK_SHORT_2,
                top_front_legs_thick_short_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Front_Legs(
                        GeneticValues.LEG_WIDTH.THICK,
                        GeneticValues.TOP_LEG.SHORT_3
                ),
                ModModelLayers.TOP_FRONT_LEGS_THICK_SHORT_3,
                top_front_legs_thick_short_3::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Front_Legs(
                        GeneticValues.LEG_WIDTH.THICK,
                        GeneticValues.TOP_LEG.AVERAGE_1
                ),
                ModModelLayers.TOP_FRONT_LEGS_THICK_AVERAGE_1,
                top_front_legs_thick_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Front_Legs(
                        GeneticValues.LEG_WIDTH.THICK,
                        GeneticValues.TOP_LEG.AVERAGE_2
                ),
                ModModelLayers.TOP_FRONT_LEGS_THICK_AVERAGE_2,
                top_front_legs_thick_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Front_Legs(
                        GeneticValues.LEG_WIDTH.THICK,
                        GeneticValues.TOP_LEG.AVERAGE_3
                ),
                ModModelLayers.TOP_FRONT_LEGS_THICK_AVERAGE_3,
                top_front_legs_thick_average_3::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Front_Legs(
                        GeneticValues.LEG_WIDTH.THICK,
                        GeneticValues.TOP_LEG.LONG_1
                ),
                ModModelLayers.TOP_FRONT_LEGS_THICK_LONG_1,
                top_front_legs_thick_long_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Front_Legs(
                        GeneticValues.LEG_WIDTH.THICK,
                        GeneticValues.TOP_LEG.LONG_2
                ),
                ModModelLayers.TOP_FRONT_LEGS_THICK_LONG_2,
                top_front_legs_thick_long_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Front_Legs(
                        GeneticValues.LEG_WIDTH.THICK,
                        GeneticValues.TOP_LEG.LONG_3
                ),
                ModModelLayers.TOP_FRONT_LEGS_THICK_LONG_3,
                top_front_legs_thick_long_3::new);
    }
}
