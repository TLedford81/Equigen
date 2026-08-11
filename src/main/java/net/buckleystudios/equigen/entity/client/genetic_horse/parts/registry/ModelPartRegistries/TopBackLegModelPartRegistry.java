package net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry.ModelPartRegistries;

import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.topbacklegs.*;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry.ModelPartRegistryKeys;
import net.buckleystudios.equigen.entity.custom.genetics.Genetics;

public class TopBackLegModelPartRegistry {
    private TopBackLegModelPartRegistry(){}

    public static void registerModels(){
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Back_Legs(
                        Genetics.values.TOP_HIND_LEG_WIDTH.THIN,
                        Genetics.values.TOP_LEG.SHORT_1
                ),
                ModModelLayers.TOP_BACK_LEGS_THIN_SHORT_1,
                top_back_legs_thin_short_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Back_Legs(
                        Genetics.values.TOP_HIND_LEG_WIDTH.THIN,
                        Genetics.values.TOP_LEG.SHORT_2
                ),
                ModModelLayers.TOP_BACK_LEGS_THIN_SHORT_2,
                top_back_legs_thin_short_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Back_Legs(
                        Genetics.values.TOP_HIND_LEG_WIDTH.THIN,
                        Genetics.values.TOP_LEG.AVERAGE_1
                ),
                ModModelLayers.TOP_BACK_LEGS_THIN_AVERAGE_1,
                top_back_legs_thin_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Back_Legs(
                        Genetics.values.TOP_HIND_LEG_WIDTH.THIN,
                        Genetics.values.TOP_LEG.AVERAGE_2
                ),
                ModModelLayers.TOP_BACK_LEGS_THIN_AVERAGE_2,
                top_back_legs_thin_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Back_Legs(
                        Genetics.values.TOP_HIND_LEG_WIDTH.THIN,
                        Genetics.values.TOP_LEG.LONG_1
                ),
                ModModelLayers.TOP_BACK_LEGS_THIN_LONG_1,
                top_back_legs_thin_long_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Back_Legs(
                        Genetics.values.TOP_HIND_LEG_WIDTH.THIN,
                        Genetics.values.TOP_LEG.LONG_2
                ),
                ModModelLayers.TOP_BACK_LEGS_THIN_LONG_2,
                top_back_legs_thin_long_2::new);
        //AVERAGE
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Back_Legs(
                        Genetics.values.TOP_HIND_LEG_WIDTH.AVERAGE,
                        Genetics.values.TOP_LEG.SHORT_1
                ),
                ModModelLayers.TOP_BACK_LEGS_AVERAGE_SHORT_1,
                top_back_legs_average_short_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Back_Legs(
                        Genetics.values.TOP_HIND_LEG_WIDTH.AVERAGE,
                        Genetics.values.TOP_LEG.SHORT_2
                ),
                ModModelLayers.TOP_BACK_LEGS_AVERAGE_SHORT_2,
                top_back_legs_average_short_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Back_Legs(
                        Genetics.values.TOP_HIND_LEG_WIDTH.AVERAGE,
                        Genetics.values.TOP_LEG.AVERAGE_1
                ),
                ModModelLayers.TOP_BACK_LEGS_AVERAGE_AVERAGE_1,
                top_back_legs_average_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Back_Legs(
                        Genetics.values.TOP_HIND_LEG_WIDTH.AVERAGE,
                        Genetics.values.TOP_LEG.AVERAGE_2
                ),
                ModModelLayers.TOP_BACK_LEGS_AVERAGE_AVERAGE_2,
                top_back_legs_average_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Back_Legs(
                        Genetics.values.TOP_HIND_LEG_WIDTH.AVERAGE,
                        Genetics.values.TOP_LEG.LONG_1
                ),
                ModModelLayers.TOP_BACK_LEGS_AVERAGE_LONG_1,
                top_back_legs_average_long_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Back_Legs(
                        Genetics.values.TOP_HIND_LEG_WIDTH.AVERAGE,
                        Genetics.values.TOP_LEG.LONG_2
                ),
                ModModelLayers.TOP_BACK_LEGS_AVERAGE_LONG_2,
                top_back_legs_average_long_2::new);
        //MUSCULAR
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Back_Legs(
                        Genetics.values.TOP_HIND_LEG_WIDTH.THICK,
                        Genetics.values.TOP_LEG.SHORT_1
                ),
                ModModelLayers.TOP_BACK_LEGS_THICK_SHORT_1,
                top_back_legs_thick_short_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Back_Legs(
                        Genetics.values.TOP_HIND_LEG_WIDTH.THICK,
                        Genetics.values.TOP_LEG.SHORT_2
                ),
                ModModelLayers.TOP_BACK_LEGS_THICK_SHORT_2,
                top_back_legs_thick_short_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Back_Legs(
                        Genetics.values.TOP_HIND_LEG_WIDTH.THICK,
                        Genetics.values.TOP_LEG.AVERAGE_1
                ),
                ModModelLayers.TOP_BACK_LEGS_THICK_AVERAGE_1,
                top_back_legs_thick_average_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Back_Legs(
                        Genetics.values.TOP_HIND_LEG_WIDTH.THICK,
                        Genetics.values.TOP_LEG.AVERAGE_2
                ),
                ModModelLayers.TOP_BACK_LEGS_THICK_AVERAGE_2,
                top_back_legs_thick_average_2::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Back_Legs(
                        Genetics.values.TOP_HIND_LEG_WIDTH.THICK,
                        Genetics.values.TOP_LEG.LONG_1
                ),
                ModModelLayers.TOP_BACK_LEGS_THICK_LONG_1,
                top_back_legs_thick_long_1::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Top_Back_Legs(
                        Genetics.values.TOP_HIND_LEG_WIDTH.THICK,
                        Genetics.values.TOP_LEG.LONG_2
                ),
                ModModelLayers.TOP_BACK_LEGS_THICK_LONG_2,
                top_back_legs_thick_long_2::new);
    }
}
