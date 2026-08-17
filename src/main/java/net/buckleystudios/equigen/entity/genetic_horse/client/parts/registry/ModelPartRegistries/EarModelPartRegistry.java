package net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistries;

import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.partmodels.ears.left_ear;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.partmodels.ears.right_ear;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistryKeys;

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
