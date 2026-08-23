package net.buckleystudios.equigen.entity.genetic_horse.client.parts.multipart;

import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class MultipartKneeModel <E extends GeneticHorseEntity> extends MultipartModel<GeneticHorseEntity> {

    protected static int getUVXOffset(GeneticValues.LEG leg) {
        switch (leg) {
            case GeneticValues.LEG.FRONT_LEFT, GeneticValues.LEG.BACK_LEFT -> {
                return 25;
            }
            case GeneticValues.LEG.FRONT_RIGHT, GeneticValues.LEG.BACK_RIGHT -> {
                return 34;
            }
            default -> {
                return 0;
            }
        }
    }
    protected static int getUVYOffset(GeneticValues.LEG leg) {
        switch (leg) {
            case GeneticValues.LEG.FRONT_LEFT, GeneticValues.LEG.FRONT_RIGHT -> {
                return 3;
            }
            case GeneticValues.LEG.BACK_LEFT, GeneticValues.LEG.BACK_RIGHT -> {
                return 8;
            }
            default -> {
                return 0;
            }
        }
    }
}
