package net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry.ModelPartRegistries;

import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.bottomlegs.*;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry.ModelPartRegistryKeys;
import net.buckleystudios.equigen.entity.custom.genetics.Genetics;

public class BottomLegModelPartRegistry {
    private BottomLegModelPartRegistry(){}

    public static void registerModels(){
        ModelPartRegistry.register(new ModelPartRegistryKeys.Bottom_Legs(
                        Genetics.values.LEG_WIDTH.AVERAGE,
                        Genetics.values.BOTTOM_LEG.SHORT_1
                ),
                ModModelLayers.BOTTOM_LEGS_AVERAGE_SHORT_1,
                bottom_legs_average_short_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Bottom_Legs(
                        Genetics.values.LEG_WIDTH.AVERAGE,
                        Genetics.values.BOTTOM_LEG.SHORT_2
                ),
                ModModelLayers.BOTTOM_LEGS_AVERAGE_SHORT_2,
                bottom_legs_average_short_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Bottom_Legs(
                        Genetics.values.LEG_WIDTH.AVERAGE,
                        Genetics.values.BOTTOM_LEG.SHORT_3
                ),
                ModModelLayers.BOTTOM_LEGS_AVERAGE_SHORT_3,
                bottom_legs_average_short_3::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Bottom_Legs(
                        Genetics.values.LEG_WIDTH.AVERAGE,
                        Genetics.values.BOTTOM_LEG.AVERAGE_1
                ),
                ModModelLayers.BOTTOM_LEGS_AVERAGE_AVERAGE_1,
                bottom_legs_average_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Bottom_Legs(
                        Genetics.values.LEG_WIDTH.AVERAGE,
                        Genetics.values.BOTTOM_LEG.AVERAGE_2
                ),
                ModModelLayers.BOTTOM_LEGS_AVERAGE_AVERAGE_2,
                bottom_legs_average_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Bottom_Legs(
                        Genetics.values.LEG_WIDTH.AVERAGE,
                        Genetics.values.BOTTOM_LEG.AVERAGE_3
                ),
                ModModelLayers.BOTTOM_LEGS_AVERAGE_AVERAGE_3,
                bottom_legs_average_average_3::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Bottom_Legs(
                        Genetics.values.LEG_WIDTH.AVERAGE,
                        Genetics.values.BOTTOM_LEG.LONG_1
                ),
                ModModelLayers.BOTTOM_LEGS_AVERAGE_LONG_1,
                bottom_legs_average_long_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Bottom_Legs(
                        Genetics.values.LEG_WIDTH.AVERAGE,
                        Genetics.values.BOTTOM_LEG.LONG_2
                ),
                ModModelLayers.BOTTOM_LEGS_AVERAGE_LONG_2,
                bottom_legs_average_long_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Bottom_Legs(
                        Genetics.values.LEG_WIDTH.AVERAGE,
                        Genetics.values.BOTTOM_LEG.LONG_3
                ),
                ModModelLayers.BOTTOM_LEGS_AVERAGE_LONG_3,
                bottom_legs_average_long_3::new);
        //THICK
        ModelPartRegistry.register(new ModelPartRegistryKeys.Bottom_Legs(
                        Genetics.values.LEG_WIDTH.THICK,
                        Genetics.values.BOTTOM_LEG.SHORT_1
                ),
                ModModelLayers.BOTTOM_LEGS_THICK_SHORT_1,
                bottom_legs_thick_short_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Bottom_Legs(
                        Genetics.values.LEG_WIDTH.THICK,
                        Genetics.values.BOTTOM_LEG.SHORT_2
                ),
                ModModelLayers.BOTTOM_LEGS_THICK_SHORT_2,
                bottom_legs_thick_short_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Bottom_Legs(
                        Genetics.values.LEG_WIDTH.THICK,
                        Genetics.values.BOTTOM_LEG.SHORT_3
                ),
                ModModelLayers.BOTTOM_LEGS_THICK_SHORT_3,
                bottom_legs_thick_short_3::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Bottom_Legs(
                        Genetics.values.LEG_WIDTH.THICK,
                        Genetics.values.BOTTOM_LEG.AVERAGE_1
                ),
                ModModelLayers.BOTTOM_LEGS_THICK_AVERAGE_1,
                bottom_legs_thick_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Bottom_Legs(
                        Genetics.values.LEG_WIDTH.THICK,
                        Genetics.values.BOTTOM_LEG.AVERAGE_2
                ),
                ModModelLayers.BOTTOM_LEGS_THICK_AVERAGE_2,
                bottom_legs_thick_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Bottom_Legs(
                        Genetics.values.LEG_WIDTH.THICK,
                        Genetics.values.BOTTOM_LEG.AVERAGE_3
                ),
                ModModelLayers.BOTTOM_LEGS_THICK_AVERAGE_3,
                bottom_legs_thick_average_3::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Bottom_Legs(
                        Genetics.values.LEG_WIDTH.THICK,
                        Genetics.values.BOTTOM_LEG.LONG_1
                ),
                ModModelLayers.BOTTOM_LEGS_THICK_LONG_1,
                bottom_legs_thick_long_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Bottom_Legs(
                        Genetics.values.LEG_WIDTH.THICK,
                        Genetics.values.BOTTOM_LEG.LONG_2
                ),
                ModModelLayers.BOTTOM_LEGS_THICK_LONG_2,
                bottom_legs_thick_long_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Bottom_Legs(
                        Genetics.values.LEG_WIDTH.THICK,
                        Genetics.values.BOTTOM_LEG.LONG_3
                ),
                ModModelLayers.BOTTOM_LEGS_THICK_LONG_3,
                bottom_legs_thick_long_3::new);
    }
    
    
}
