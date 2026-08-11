package net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry.ModelPartRegistries;

import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.ears.*;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry.ModelPartRegistryKeys;

public class EarModelPartRegistry {
    private EarModelPartRegistry(){}

    public static void registerModels(){
        ModelPartRegistry.register(new ModelPartRegistryKeys.Ears(
                ),
                ModModelLayers.LEFT_EAR,
                left_ear::new);
        ModelPartRegistry.register(new ModelPartRegistryKeys.Ears(
                ),
                ModModelLayers.RIGHT_EAR,
                right_ear::new);
    }
}
