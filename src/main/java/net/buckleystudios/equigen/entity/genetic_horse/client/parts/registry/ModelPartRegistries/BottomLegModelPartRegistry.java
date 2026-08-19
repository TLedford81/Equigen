package net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistries;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.partmodels.bottomlegs.*;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistryKeys;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;

public class BottomLegModelPartRegistry {
    private BottomLegModelPartRegistry(){}

    public static void registerModels(){
        EquigenMod.LOGGER.info("BOTTOM LEG REGISTER MODELS CALLED");
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Bottom_Legs(
                        GeneticValues.LEG_WIDTH.AVERAGE,
                        GeneticValues.BOTTOM_LEG.SHORT_1
                ),

                ModModelLayers.BOTTOM_LEGS_AVERAGE_SHORT_1_FRONT_LEFT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_SHORT_1_FRONT_RIGHT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_SHORT_1_BACK_LEFT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_SHORT_1_BACK_RIGHT,

                bottom_legs_average_short_1::new,
                bottom_legs_average_short_1::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Bottom_Legs(
                        GeneticValues.LEG_WIDTH.AVERAGE,
                        GeneticValues.BOTTOM_LEG.SHORT_2
                ),

                ModModelLayers.BOTTOM_LEGS_AVERAGE_SHORT_2_FRONT_LEFT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_SHORT_2_FRONT_RIGHT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_SHORT_2_BACK_LEFT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_SHORT_2_BACK_RIGHT,

                bottom_legs_average_short_2::new,
                bottom_legs_average_short_2::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Bottom_Legs(
                        GeneticValues.LEG_WIDTH.AVERAGE,
                        GeneticValues.BOTTOM_LEG.SHORT_3
                ),

                ModModelLayers.BOTTOM_LEGS_AVERAGE_SHORT_3_FRONT_LEFT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_SHORT_3_FRONT_RIGHT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_SHORT_3_BACK_LEFT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_SHORT_3_BACK_RIGHT,

                bottom_legs_average_short_3::new,
                bottom_legs_average_short_3::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Bottom_Legs(
                        GeneticValues.LEG_WIDTH.AVERAGE,
                        GeneticValues.BOTTOM_LEG.AVERAGE_1
                ),

                ModModelLayers.BOTTOM_LEGS_AVERAGE_AVERAGE_1_FRONT_LEFT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_AVERAGE_1_FRONT_RIGHT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_AVERAGE_1_BACK_LEFT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_AVERAGE_1_BACK_RIGHT,

                bottom_legs_average_average_1::new,
                bottom_legs_average_average_1::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Bottom_Legs(
                        GeneticValues.LEG_WIDTH.AVERAGE,
                        GeneticValues.BOTTOM_LEG.AVERAGE_2
                ),

                ModModelLayers.BOTTOM_LEGS_AVERAGE_AVERAGE_2_FRONT_LEFT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_AVERAGE_2_FRONT_RIGHT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_AVERAGE_2_BACK_LEFT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_AVERAGE_2_BACK_RIGHT,

                bottom_legs_average_average_2::new,
                bottom_legs_average_average_2::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Bottom_Legs(
                        GeneticValues.LEG_WIDTH.AVERAGE,
                        GeneticValues.BOTTOM_LEG.AVERAGE_3
                ),

                ModModelLayers.BOTTOM_LEGS_AVERAGE_AVERAGE_3_FRONT_LEFT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_AVERAGE_3_FRONT_RIGHT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_AVERAGE_3_BACK_LEFT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_AVERAGE_3_BACK_RIGHT,

                bottom_legs_average_average_3::new,
                bottom_legs_average_average_3::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Bottom_Legs(
                        GeneticValues.LEG_WIDTH.AVERAGE,
                        GeneticValues.BOTTOM_LEG.LONG_1
                ),

                ModModelLayers.BOTTOM_LEGS_AVERAGE_LONG_1_FRONT_LEFT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_LONG_1_FRONT_RIGHT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_LONG_1_BACK_LEFT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_LONG_1_BACK_RIGHT,

                bottom_legs_average_long_1::new,
                bottom_legs_average_long_1::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Bottom_Legs(
                        GeneticValues.LEG_WIDTH.AVERAGE,
                        GeneticValues.BOTTOM_LEG.LONG_2
                ),

                ModModelLayers.BOTTOM_LEGS_AVERAGE_LONG_2_FRONT_LEFT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_LONG_2_FRONT_RIGHT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_LONG_2_BACK_LEFT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_LONG_2_BACK_RIGHT,

                bottom_legs_average_long_2::new,
                bottom_legs_average_long_2::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Bottom_Legs(
                        GeneticValues.LEG_WIDTH.AVERAGE,
                        GeneticValues.BOTTOM_LEG.LONG_3
                ),

                ModModelLayers.BOTTOM_LEGS_AVERAGE_LONG_3_FRONT_LEFT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_LONG_3_FRONT_RIGHT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_LONG_3_BACK_LEFT,
                ModModelLayers.BOTTOM_LEGS_AVERAGE_LONG_3_BACK_RIGHT,

                bottom_legs_average_long_3::new,
                bottom_legs_average_long_3::createBodyLayer);
        //THICK
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Bottom_Legs(
                        GeneticValues.LEG_WIDTH.THICK,
                        GeneticValues.BOTTOM_LEG.SHORT_1
                ),

                ModModelLayers.BOTTOM_LEGS_THICK_SHORT_1_FRONT_LEFT,
                ModModelLayers.BOTTOM_LEGS_THICK_SHORT_1_FRONT_RIGHT,
                ModModelLayers.BOTTOM_LEGS_THICK_SHORT_1_BACK_LEFT,
                ModModelLayers.BOTTOM_LEGS_THICK_SHORT_1_BACK_RIGHT,

                bottom_legs_thick_short_1::new,
                bottom_legs_thick_short_1::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Bottom_Legs(
                        GeneticValues.LEG_WIDTH.THICK,
                        GeneticValues.BOTTOM_LEG.SHORT_2
                ),

                ModModelLayers.BOTTOM_LEGS_THICK_SHORT_2_FRONT_LEFT,
                ModModelLayers.BOTTOM_LEGS_THICK_SHORT_2_FRONT_RIGHT,
                ModModelLayers.BOTTOM_LEGS_THICK_SHORT_2_BACK_LEFT,
                ModModelLayers.BOTTOM_LEGS_THICK_SHORT_2_BACK_RIGHT,

                bottom_legs_thick_short_2::new,
                bottom_legs_thick_short_2::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Bottom_Legs(
                        GeneticValues.LEG_WIDTH.THICK,
                        GeneticValues.BOTTOM_LEG.SHORT_3
                ),

                ModModelLayers.BOTTOM_LEGS_THICK_SHORT_3_FRONT_LEFT,
                ModModelLayers.BOTTOM_LEGS_THICK_SHORT_3_FRONT_RIGHT,
                ModModelLayers.BOTTOM_LEGS_THICK_SHORT_3_BACK_LEFT,
                ModModelLayers.BOTTOM_LEGS_THICK_SHORT_3_BACK_RIGHT,

                bottom_legs_thick_short_3::new,
                bottom_legs_thick_short_3::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Bottom_Legs(
                        GeneticValues.LEG_WIDTH.THICK,
                        GeneticValues.BOTTOM_LEG.AVERAGE_1
                ),

                ModModelLayers.BOTTOM_LEGS_THICK_AVERAGE_1_FRONT_LEFT,
                ModModelLayers.BOTTOM_LEGS_THICK_AVERAGE_1_FRONT_RIGHT,
                ModModelLayers.BOTTOM_LEGS_THICK_AVERAGE_1_BACK_LEFT,
                ModModelLayers.BOTTOM_LEGS_THICK_AVERAGE_1_BACK_RIGHT,

                bottom_legs_thick_average_1::new,
                bottom_legs_thick_average_1::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Bottom_Legs(
                        GeneticValues.LEG_WIDTH.THICK,
                        GeneticValues.BOTTOM_LEG.AVERAGE_2
                ),

                ModModelLayers.BOTTOM_LEGS_THICK_AVERAGE_2_FRONT_LEFT,
                ModModelLayers.BOTTOM_LEGS_THICK_AVERAGE_2_FRONT_RIGHT,
                ModModelLayers.BOTTOM_LEGS_THICK_AVERAGE_2_BACK_LEFT,
                ModModelLayers.BOTTOM_LEGS_THICK_AVERAGE_2_BACK_RIGHT,

                bottom_legs_thick_average_2::new,
                bottom_legs_thick_average_2::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Bottom_Legs(
                        GeneticValues.LEG_WIDTH.THICK,
                        GeneticValues.BOTTOM_LEG.AVERAGE_3
                ),

                ModModelLayers.BOTTOM_LEGS_THICK_AVERAGE_3_FRONT_LEFT,
                ModModelLayers.BOTTOM_LEGS_THICK_AVERAGE_3_FRONT_RIGHT,
                ModModelLayers.BOTTOM_LEGS_THICK_AVERAGE_3_BACK_LEFT,
                ModModelLayers.BOTTOM_LEGS_THICK_AVERAGE_3_BACK_RIGHT,

                bottom_legs_thick_average_3::new,
                bottom_legs_thick_average_3::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Bottom_Legs(
                        GeneticValues.LEG_WIDTH.THICK,
                        GeneticValues.BOTTOM_LEG.LONG_1
                ),

                ModModelLayers.BOTTOM_LEGS_THICK_LONG_1_FRONT_LEFT,
                ModModelLayers.BOTTOM_LEGS_THICK_LONG_1_FRONT_RIGHT,
                ModModelLayers.BOTTOM_LEGS_THICK_LONG_1_BACK_LEFT,
                ModModelLayers.BOTTOM_LEGS_THICK_LONG_1_BACK_RIGHT,

                bottom_legs_thick_long_1::new,
                bottom_legs_thick_long_1::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Bottom_Legs(
                        GeneticValues.LEG_WIDTH.THICK,
                        GeneticValues.BOTTOM_LEG.LONG_2
                ),

                ModModelLayers.BOTTOM_LEGS_THICK_LONG_2_FRONT_LEFT,
                ModModelLayers.BOTTOM_LEGS_THICK_LONG_2_FRONT_RIGHT,
                ModModelLayers.BOTTOM_LEGS_THICK_LONG_2_BACK_LEFT,
                ModModelLayers.BOTTOM_LEGS_THICK_LONG_2_BACK_RIGHT,

                bottom_legs_thick_long_2::new,
                bottom_legs_thick_long_2::createBodyLayer);
        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Bottom_Legs(
                        GeneticValues.LEG_WIDTH.THICK,
                        GeneticValues.BOTTOM_LEG.LONG_3
                ),

                ModModelLayers.BOTTOM_LEGS_THICK_LONG_3_FRONT_LEFT,
                ModModelLayers.BOTTOM_LEGS_THICK_LONG_3_FRONT_RIGHT,
                ModModelLayers.BOTTOM_LEGS_THICK_LONG_3_BACK_LEFT,
                ModModelLayers.BOTTOM_LEGS_THICK_LONG_3_BACK_RIGHT,

                bottom_legs_thick_long_3::new,
                bottom_legs_thick_long_3::createBodyLayer);
    }
    
    
}
