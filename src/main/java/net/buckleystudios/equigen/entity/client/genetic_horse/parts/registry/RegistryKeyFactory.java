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

    public static ModelPartRegistryKeys.Head getHeadKey(GeneticHorseEntity entity) {
        return new ModelPartRegistryKeys.Head(
                GeneticsHandler.getHeadTypeValue(entity),
                GeneticsHandler.getMuscleMassValue(entity)


        );
    }

    public static ModelPartRegistryKeys.Ears getLeftEarKey(GeneticHorseEntity entity) {
        return new ModelPartRegistryKeys.Ears();
    }

    public static ModelPartRegistryKeys.Ears getRightEarKey(GeneticHorseEntity entity) {
        return new ModelPartRegistryKeys.Ears();
    }

    public static ModelPartRegistryKeys.Top_Front_Legs getTopFrontLegKey(GeneticHorseEntity entity) {
        return new ModelPartRegistryKeys.Top_Front_Legs(
                GeneticsHandler.getLegWidthValue(entity),
                GeneticsHandler.getTopLegValue(entity)
        );
    }

    public static ModelPartRegistryKeys.Knees getKneeKey(GeneticHorseEntity entity) {
        return new ModelPartRegistryKeys.Knees();
    }

    public static ModelPartRegistryKeys.Bottom_Legs getBottomLegKey(GeneticHorseEntity entity) {
        return new ModelPartRegistryKeys.Bottom_Legs(
                GeneticsHandler.getLegWidthValue(entity),
                GeneticsHandler.getBottomLegValue(entity)
        );
    }

    public static ModelPartRegistryKeys.Hoof getHoofKey(GeneticHorseEntity entity) {
        return new ModelPartRegistryKeys.Hoof(
                GeneticsHandler.getHoofSizeValue(entity)
        );    }

    public static ModelPartRegistryKeys.Hips getHipKey(GeneticHorseEntity entity) {
        return new ModelPartRegistryKeys.Hips(
                GeneticsHandler.getMuscleMassValue(entity),
                GeneticsHandler.getHipSizeValue(entity)
        );
    }

    public static ModelPartRegistryKeys.Tail getTailKey(GeneticHorseEntity entity) {
        return new ModelPartRegistryKeys.Tail(
                GeneticsHandler.getTailThicknessValue(entity),
                GeneticsHandler.getTailLengthValue(entity)
        );
    }

    public static ModelPartRegistryKeys.Top_Back_Legs getTopBackLegKey(GeneticHorseEntity entity) {
        return new ModelPartRegistryKeys.Top_Back_Legs(
                GeneticsHandler.getTopHindLegWidthValue(entity),
                GeneticsHandler.getTopLegValue(entity)
        );
    }

    public static ModelPartRegistryKeys.Withers getWitherKey(GeneticHorseEntity entity) {
        return new ModelPartRegistryKeys.Withers(
                GeneticsHandler.getMuscleMassValue(entity)
        );
    }

    public static ModelPartRegistryKeys.Stomach getStomachKey(GeneticHorseEntity entity) {
        return new ModelPartRegistryKeys.Stomach(
                GeneticsHandler.getMuscleMassValue(entity),
                GeneticsHandler.getStomachLengthValue(entity),
                GeneticsHandler.getStomachCurveValue(entity)
        );
    }
}
