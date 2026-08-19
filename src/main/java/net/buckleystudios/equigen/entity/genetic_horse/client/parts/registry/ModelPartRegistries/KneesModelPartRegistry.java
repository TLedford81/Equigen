package net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistries;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.client.ModModelLayers;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.partmodels.knees.knees;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistryKeys;

public class KneesModelPartRegistry {
    private KneesModelPartRegistry(){}

    public static void registerModels(){
        EquigenMod.LOGGER.info("KNEES REGISTER MODELS CALLED");

        ModelPartRegistry.register(
                new ModelPartRegistryKeys.Knees(
                ),

                ModModelLayers.KNEE_FRONT_LEFT,
                ModModelLayers.KNEE_FRONT_RIGHT,
                ModModelLayers.KNEE_BACK_LEFT,
                ModModelLayers.KNEE_BACK_RIGHT,

                knees::new,
                knees::createBodyLayer);
    }
}
