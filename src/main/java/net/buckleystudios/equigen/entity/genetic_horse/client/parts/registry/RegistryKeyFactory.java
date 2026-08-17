package net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry;


import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticsHandler;

public class RegistryKeyFactory
{


    public static ModelPartRegistryKeys.Back getBackKey(GeneticHorseEntity entity) {
        return new ModelPartRegistryKeys.Back(
                GeneticsHandler.getMuscleMassValue(entity),
                GeneticsHandler.getBackLengthValue(entity),
                GeneticsHandler.getBackGirthValue(entity)
        );
    }
    public static ModelPartRegistryKeys.Back getBackKey(float muscleMass, float backLength, float backGirth) {
        return new ModelPartRegistryKeys.Back(
                GeneticsHandler.getMuscleMassValue(muscleMass),
                GeneticsHandler.getBackLengthValue(backLength),
                GeneticsHandler.getBackGirthValue(backGirth)
        );
    }
    public static ModelPartRegistryKeys.Chest getChestKey(GeneticHorseEntity entity) {
        return new ModelPartRegistryKeys.Chest(
                GeneticsHandler.getMuscleMassValue(entity),
                GeneticsHandler.getChestSizeValue(entity)
        );
    }
    public static ModelPartRegistryKeys.Chest getChestKey(float muscleMass, float chestSize) {
        return new ModelPartRegistryKeys.Chest(
                GeneticsHandler.getMuscleMassValue(muscleMass),
                GeneticsHandler.getChestSizeValue(chestSize)
        );
    }
    public static ModelPartRegistryKeys.Neck getNeckKey(GeneticHorseEntity entity) {
        return new ModelPartRegistryKeys.Neck(
                GeneticsHandler.getMuscleMassValue(entity),
                GeneticsHandler.getNeckCurveValue(entity),
                GeneticsHandler.getNeckLengthValue(entity)

        );
    }
    public static ModelPartRegistryKeys.Neck getNeckKey(float muscleMass, float neckCurve, float neckLength) {
        return new ModelPartRegistryKeys.Neck(
                GeneticsHandler.getMuscleMassValue(muscleMass),
                GeneticsHandler.getNeckCurveValue(neckCurve),
                GeneticsHandler.getNeckLengthValue(neckLength)
        );
    }

    public static ModelPartRegistryKeys.Head getHeadKey(GeneticHorseEntity entity) {
        return new ModelPartRegistryKeys.Head(
                GeneticsHandler.getHeadTypeValue(entity),
                GeneticsHandler.getMuscleMassValue(entity)
        );
    }
    public static ModelPartRegistryKeys.Head getHeadKey(float headType, float muscleMass) {
        return new ModelPartRegistryKeys.Head(
                GeneticsHandler.getHeadTypeValue(headType),
                GeneticsHandler.getMuscleMassValue(muscleMass)
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
    public static ModelPartRegistryKeys.Top_Front_Legs getTopFrontLegKey(float legWidth, float topLeg) {
        return new ModelPartRegistryKeys.Top_Front_Legs(
                GeneticsHandler.getLegWidthValue(legWidth),
                GeneticsHandler.getTopLegValue(topLeg)
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
    public static ModelPartRegistryKeys.Bottom_Legs getBottomLegKey(float legWidth, float bottomLeg) {
        return new ModelPartRegistryKeys.Bottom_Legs(
                GeneticsHandler.getLegWidthValue(legWidth),
                GeneticsHandler.getBottomLegValue(bottomLeg)
        );
    }

    public static ModelPartRegistryKeys.Hoof getHoofKey(GeneticHorseEntity entity) {
        return new ModelPartRegistryKeys.Hoof(
                GeneticsHandler.getHoofSizeValue(entity)
        );    }
    public static ModelPartRegistryKeys.Hoof getHoofKey(float hoofSize) {
        return new ModelPartRegistryKeys.Hoof(
                GeneticsHandler.getHoofSizeValue(hoofSize)
        );    }

    public static ModelPartRegistryKeys.Hips getHipKey(GeneticHorseEntity entity) {
        return new ModelPartRegistryKeys.Hips(
                GeneticsHandler.getMuscleMassValue(entity),
                GeneticsHandler.getHipSizeValue(entity)
        );
    }
    public static ModelPartRegistryKeys.Hips getHipKey(float muscleMass, float hipSize) {
        return new ModelPartRegistryKeys.Hips(
                GeneticsHandler.getMuscleMassValue(muscleMass),
                GeneticsHandler.getHipSizeValue(hipSize)
        );
    }

    public static ModelPartRegistryKeys.Tail getTailKey(GeneticHorseEntity entity) {
        return new ModelPartRegistryKeys.Tail(
                GeneticsHandler.getTailThicknessValue(entity),
                GeneticsHandler.getTailLengthValue(entity)
        );
    }
    public static ModelPartRegistryKeys.Tail getTailKey(float tailThickness, float tailLength) {
        return new ModelPartRegistryKeys.Tail(
                GeneticsHandler.getTailThicknessValue(tailThickness),
                GeneticsHandler.getTailLengthValue(tailLength)
        );
    }

    public static ModelPartRegistryKeys.Top_Back_Legs getTopBackLegKey(GeneticHorseEntity entity) {
        GeneticValues.TOP_LEG topLeg = GeneticsHandler.getTopLegValue(entity);

        if (topLeg.equals(GeneticValues.TOP_LEG.SHORT_3)) topLeg = GeneticValues.TOP_LEG.SHORT_2;
        if (topLeg.equals(GeneticValues.TOP_LEG.AVERAGE_3)) topLeg = GeneticValues.TOP_LEG.AVERAGE_2;
        if (topLeg.equals(GeneticValues.TOP_LEG.LONG_3)) topLeg = GeneticValues.TOP_LEG.LONG_2;


        return new ModelPartRegistryKeys.Top_Back_Legs(
                GeneticsHandler.getTopHindLegWidthValue(entity),
                topLeg
        );
    }
    public static ModelPartRegistryKeys.Top_Back_Legs getTopBackLegKey(float topHindLegWidth, float topLeg) {
        return new ModelPartRegistryKeys.Top_Back_Legs(
                GeneticsHandler.getTopHindLegWidthValue(topHindLegWidth),
                GeneticsHandler.getTopLegValue(topLeg)
        );
    }

    public static ModelPartRegistryKeys.Withers getWitherKey(GeneticHorseEntity entity) {
        return new ModelPartRegistryKeys.Withers(
                GeneticsHandler.getMuscleMassValue(entity)
        );
    }
    public static ModelPartRegistryKeys.Withers getWitherKey(float muscleMass) {
        return new ModelPartRegistryKeys.Withers(
                GeneticsHandler.getMuscleMassValue(muscleMass)
        );
    }

    public static ModelPartRegistryKeys.Stomach getStomachKey(GeneticHorseEntity entity) {
        return new ModelPartRegistryKeys.Stomach(
                GeneticsHandler.getMuscleMassValue(entity),
                GeneticsHandler.getStomachLengthValue(entity),
                GeneticsHandler.getStomachCurveValue(entity)
        );
    }
    public static ModelPartRegistryKeys.Stomach getStomachKey(float muscleMass, float stomachLength, float stomachCurve) {
        return new ModelPartRegistryKeys.Stomach(
                GeneticsHandler.getMuscleMassValue(muscleMass),
                GeneticsHandler.getStomachLengthValue(stomachLength),
                GeneticsHandler.getStomachCurveValue(stomachCurve)
        );
    }
}
