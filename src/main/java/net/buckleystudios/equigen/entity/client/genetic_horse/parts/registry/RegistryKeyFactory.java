package net.buckleystudios.equigen.entity.client.genetic_horse.parts.registry;

import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.custom.genetics.GeneticsHandler;

public class RegistryKeyFactory
{
    public static ModelPartRegistryKeys.Back getBackKey(GeneticHorseEntity entity) {
        return new ModelPartRegistryKeys.Back(
                GeneticsHandler.getMuscleMassValue(entity),
                GeneticsHandler.getBackLengthValue(entity),
                GeneticsHandler.getBackGirthValue(entity)
        );
    }
    public static ModelPartRegistryKeys.Chest getChestKey(GeneticHorseEntity entity) {
        return new ModelPartRegistryKeys.Chest(
                GeneticsHandler.getMuscleMassValue(entity),
                GeneticsHandler.getChestSizeValue(entity)
        );
    }
    public static ModelPartRegistryKeys.Neck getNeckKey(GeneticHorseEntity entity) {
        return new ModelPartRegistryKeys.Neck(
                GeneticsHandler.getMuscleMassValue(entity),
                GeneticsHandler.getNeckCurveValue(entity),
                GeneticsHandler.getNeckLengthValue(entity)

        );
    }
}
