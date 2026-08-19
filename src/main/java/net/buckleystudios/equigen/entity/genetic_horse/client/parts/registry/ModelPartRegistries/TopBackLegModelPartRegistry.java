package net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistries;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.partmodels.topbacklegs.*;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistryKeys;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;

public class TopBackLegModelPartRegistry {
    private TopBackLegModelPartRegistry(){}

    public static void registerModels(){
        EquigenMod.LOGGER.info("TOP BACK LEG REGISTER MODELS CALLED");

        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Top_Back_Legs(
                        GeneticValues.TOP_HIND_LEG_WIDTH.THIN,
                        GeneticValues.TOP_LEG.SHORT_1
                ),

                ModModelLayers.TOP_BACK_LEGS_THIN_SHORT_1_FRONT_LEFT,
                ModModelLayers.TOP_BACK_LEGS_THIN_SHORT_1_FRONT_RIGHT,
                ModModelLayers.TOP_BACK_LEGS_THIN_SHORT_1_BACK_LEFT,
                ModModelLayers.TOP_BACK_LEGS_THIN_SHORT_1_BACK_RIGHT,

                top_back_legs_thin_short_1::new,
                top_back_legs_thin_short_1::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Top_Back_Legs(
                        GeneticValues.TOP_HIND_LEG_WIDTH.THIN,
                        GeneticValues.TOP_LEG.SHORT_2
                ),

                ModModelLayers.TOP_BACK_LEGS_THIN_SHORT_2_FRONT_LEFT,
                ModModelLayers.TOP_BACK_LEGS_THIN_SHORT_2_FRONT_RIGHT,
                ModModelLayers.TOP_BACK_LEGS_THIN_SHORT_2_BACK_LEFT,
                ModModelLayers.TOP_BACK_LEGS_THIN_SHORT_2_BACK_RIGHT,

                top_back_legs_thin_short_2::new,
                top_back_legs_thin_short_2::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Top_Back_Legs(
                        GeneticValues.TOP_HIND_LEG_WIDTH.THIN,
                        GeneticValues.TOP_LEG.AVERAGE_1
                ),

                ModModelLayers.TOP_BACK_LEGS_THIN_AVERAGE_1_FRONT_LEFT,
                ModModelLayers.TOP_BACK_LEGS_THIN_AVERAGE_1_FRONT_RIGHT,
                ModModelLayers.TOP_BACK_LEGS_THIN_AVERAGE_1_BACK_LEFT,
                ModModelLayers.TOP_BACK_LEGS_THIN_AVERAGE_1_BACK_RIGHT,

                top_back_legs_thin_average_1::new,
                top_back_legs_thin_average_1::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Top_Back_Legs(
                        GeneticValues.TOP_HIND_LEG_WIDTH.THIN,
                        GeneticValues.TOP_LEG.AVERAGE_2
                ),

                ModModelLayers.TOP_BACK_LEGS_THIN_AVERAGE_2_FRONT_LEFT,
                ModModelLayers.TOP_BACK_LEGS_THIN_AVERAGE_2_FRONT_RIGHT,
                ModModelLayers.TOP_BACK_LEGS_THIN_AVERAGE_2_BACK_LEFT,
                ModModelLayers.TOP_BACK_LEGS_THIN_AVERAGE_2_BACK_RIGHT,

                top_back_legs_thin_average_2::new,
                top_back_legs_thin_average_2::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Top_Back_Legs(
                        GeneticValues.TOP_HIND_LEG_WIDTH.THIN,
                        GeneticValues.TOP_LEG.LONG_1
                ),

                ModModelLayers.TOP_BACK_LEGS_THIN_LONG_1_FRONT_LEFT,
                ModModelLayers.TOP_BACK_LEGS_THIN_LONG_1_FRONT_RIGHT,
                ModModelLayers.TOP_BACK_LEGS_THIN_LONG_1_BACK_LEFT,
                ModModelLayers.TOP_BACK_LEGS_THIN_LONG_1_BACK_RIGHT,

                top_back_legs_thin_long_1::new,
                top_back_legs_thin_long_1::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Top_Back_Legs(
                        GeneticValues.TOP_HIND_LEG_WIDTH.THIN,
                        GeneticValues.TOP_LEG.LONG_2
                ),

                ModModelLayers.TOP_BACK_LEGS_THIN_LONG_2_FRONT_LEFT,
                ModModelLayers.TOP_BACK_LEGS_THIN_LONG_2_FRONT_RIGHT,
                ModModelLayers.TOP_BACK_LEGS_THIN_LONG_2_BACK_LEFT,
                ModModelLayers.TOP_BACK_LEGS_THIN_LONG_2_BACK_RIGHT,

                top_back_legs_thin_long_2::new,
                top_back_legs_thin_long_2::createBodyLayer);

        //AVERAGE
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Top_Back_Legs(
                        GeneticValues.TOP_HIND_LEG_WIDTH.AVERAGE,
                        GeneticValues.TOP_LEG.SHORT_1
                ),

                ModModelLayers.TOP_BACK_LEGS_AVERAGE_SHORT_1_FRONT_LEFT,
                ModModelLayers.TOP_BACK_LEGS_AVERAGE_SHORT_1_FRONT_RIGHT,
                ModModelLayers.TOP_BACK_LEGS_AVERAGE_SHORT_1_BACK_LEFT,
                ModModelLayers.TOP_BACK_LEGS_AVERAGE_SHORT_1_BACK_RIGHT,

                top_back_legs_average_short_1::new,
                top_back_legs_average_short_1::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Top_Back_Legs(
                        GeneticValues.TOP_HIND_LEG_WIDTH.AVERAGE,
                        GeneticValues.TOP_LEG.SHORT_2
                ),

                ModModelLayers.TOP_BACK_LEGS_AVERAGE_SHORT_2_FRONT_LEFT,
                ModModelLayers.TOP_BACK_LEGS_AVERAGE_SHORT_2_FRONT_RIGHT,
                ModModelLayers.TOP_BACK_LEGS_AVERAGE_SHORT_2_BACK_LEFT,
                ModModelLayers.TOP_BACK_LEGS_AVERAGE_SHORT_2_BACK_RIGHT,

                top_back_legs_average_short_2::new,
                top_back_legs_average_short_2::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Top_Back_Legs(
                        GeneticValues.TOP_HIND_LEG_WIDTH.AVERAGE,
                        GeneticValues.TOP_LEG.AVERAGE_1
                ),

                ModModelLayers.TOP_BACK_LEGS_AVERAGE_AVERAGE_1_FRONT_LEFT,
                ModModelLayers.TOP_BACK_LEGS_AVERAGE_AVERAGE_1_FRONT_RIGHT,
                ModModelLayers.TOP_BACK_LEGS_AVERAGE_AVERAGE_1_BACK_LEFT,
                ModModelLayers.TOP_BACK_LEGS_AVERAGE_AVERAGE_1_BACK_RIGHT,

                top_back_legs_average_average_1::new,
                top_back_legs_average_average_1::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Top_Back_Legs(
                        GeneticValues.TOP_HIND_LEG_WIDTH.AVERAGE,
                        GeneticValues.TOP_LEG.AVERAGE_2
                ),

                ModModelLayers.TOP_BACK_LEGS_AVERAGE_AVERAGE_2_FRONT_LEFT,
                ModModelLayers.TOP_BACK_LEGS_AVERAGE_AVERAGE_2_FRONT_RIGHT,
                ModModelLayers.TOP_BACK_LEGS_AVERAGE_AVERAGE_2_BACK_LEFT,
                ModModelLayers.TOP_BACK_LEGS_AVERAGE_AVERAGE_2_BACK_RIGHT,

                top_back_legs_average_average_2::new,
                top_back_legs_average_average_2::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Top_Back_Legs(
                        GeneticValues.TOP_HIND_LEG_WIDTH.AVERAGE,
                        GeneticValues.TOP_LEG.LONG_1
                ),

                ModModelLayers.TOP_BACK_LEGS_AVERAGE_LONG_1_FRONT_LEFT,
                ModModelLayers.TOP_BACK_LEGS_AVERAGE_LONG_1_FRONT_RIGHT,
                ModModelLayers.TOP_BACK_LEGS_AVERAGE_LONG_1_BACK_LEFT,
                ModModelLayers.TOP_BACK_LEGS_AVERAGE_LONG_1_BACK_RIGHT,

                top_back_legs_average_long_1::new,
                top_back_legs_average_long_1::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Top_Back_Legs(
                        GeneticValues.TOP_HIND_LEG_WIDTH.AVERAGE,
                        GeneticValues.TOP_LEG.LONG_2
                ),

                ModModelLayers.TOP_BACK_LEGS_AVERAGE_LONG_2_FRONT_LEFT,
                ModModelLayers.TOP_BACK_LEGS_AVERAGE_LONG_2_FRONT_RIGHT,
                ModModelLayers.TOP_BACK_LEGS_AVERAGE_LONG_2_BACK_LEFT,
                ModModelLayers.TOP_BACK_LEGS_AVERAGE_LONG_2_BACK_RIGHT,

                top_back_legs_average_long_2::new,
                top_back_legs_average_long_2::createBodyLayer);

        //THICK
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Top_Back_Legs(
                        GeneticValues.TOP_HIND_LEG_WIDTH.THICK,
                        GeneticValues.TOP_LEG.SHORT_1
                ),

                ModModelLayers.TOP_BACK_LEGS_THICK_SHORT_1_FRONT_LEFT,
                ModModelLayers.TOP_BACK_LEGS_THICK_SHORT_1_FRONT_RIGHT,
                ModModelLayers.TOP_BACK_LEGS_THICK_SHORT_1_BACK_LEFT,
                ModModelLayers.TOP_BACK_LEGS_THICK_SHORT_1_BACK_RIGHT,

                top_back_legs_thick_short_1::new,
                top_back_legs_thick_short_1::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Top_Back_Legs(
                        GeneticValues.TOP_HIND_LEG_WIDTH.THICK,
                        GeneticValues.TOP_LEG.SHORT_2
                ),

                ModModelLayers.TOP_BACK_LEGS_THICK_SHORT_2_FRONT_LEFT,
                ModModelLayers.TOP_BACK_LEGS_THICK_SHORT_2_FRONT_RIGHT,
                ModModelLayers.TOP_BACK_LEGS_THICK_SHORT_2_BACK_LEFT,
                ModModelLayers.TOP_BACK_LEGS_THICK_SHORT_2_BACK_RIGHT,

                top_back_legs_thick_short_2::new,
                top_back_legs_thick_short_2::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Top_Back_Legs(
                        GeneticValues.TOP_HIND_LEG_WIDTH.THICK,
                        GeneticValues.TOP_LEG.AVERAGE_1
                ),

                ModModelLayers.TOP_BACK_LEGS_THICK_AVERAGE_1_FRONT_LEFT,
                ModModelLayers.TOP_BACK_LEGS_THICK_AVERAGE_1_FRONT_RIGHT,
                ModModelLayers.TOP_BACK_LEGS_THICK_AVERAGE_1_BACK_LEFT,
                ModModelLayers.TOP_BACK_LEGS_THICK_AVERAGE_1_BACK_RIGHT,

                top_back_legs_thick_average_1::new,
                top_back_legs_thick_average_1::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Top_Back_Legs(
                        GeneticValues.TOP_HIND_LEG_WIDTH.THICK,
                        GeneticValues.TOP_LEG.AVERAGE_2
                ),

                ModModelLayers.TOP_BACK_LEGS_THICK_AVERAGE_2_FRONT_LEFT,
                ModModelLayers.TOP_BACK_LEGS_THICK_AVERAGE_2_FRONT_RIGHT,
                ModModelLayers.TOP_BACK_LEGS_THICK_AVERAGE_2_BACK_LEFT,
                ModModelLayers.TOP_BACK_LEGS_THICK_AVERAGE_2_BACK_RIGHT,

                top_back_legs_thick_average_2::new,
                top_back_legs_thick_average_2::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Top_Back_Legs(
                        GeneticValues.TOP_HIND_LEG_WIDTH.THICK,
                        GeneticValues.TOP_LEG.LONG_1
                ),

                ModModelLayers.TOP_BACK_LEGS_THICK_LONG_1_FRONT_LEFT,
                ModModelLayers.TOP_BACK_LEGS_THICK_LONG_1_FRONT_RIGHT,
                ModModelLayers.TOP_BACK_LEGS_THICK_LONG_1_BACK_LEFT,
                ModModelLayers.TOP_BACK_LEGS_THICK_LONG_1_BACK_RIGHT,

                top_back_legs_thick_long_1::new,
                top_back_legs_thick_long_1::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Top_Back_Legs(
                        GeneticValues.TOP_HIND_LEG_WIDTH.THICK,
                        GeneticValues.TOP_LEG.LONG_2
                ),

                ModModelLayers.TOP_BACK_LEGS_THICK_LONG_2_FRONT_LEFT,
                ModModelLayers.TOP_BACK_LEGS_THICK_LONG_2_FRONT_RIGHT,
                ModModelLayers.TOP_BACK_LEGS_THICK_LONG_2_BACK_LEFT,
                ModModelLayers.TOP_BACK_LEGS_THICK_LONG_2_BACK_RIGHT,

                top_back_legs_thick_long_2::new,
                top_back_legs_thick_long_2::createBodyLayer);
    }
}
