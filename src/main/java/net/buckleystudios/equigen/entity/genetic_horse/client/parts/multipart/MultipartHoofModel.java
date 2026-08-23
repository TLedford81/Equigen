package net.buckleystudios.equigen.entity.genetic_horse.client.parts.multipart;

import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class MultipartHoofModel <E extends GeneticHorseEntity> extends MultipartModel<GeneticHorseEntity> {
    protected static int getUVXOffset(GeneticValues.LEG leg) {
        switch (leg) {
            case GeneticValues.LEG.FRONT_LEFT -> {
                return 45;
            }
            case GeneticValues.LEG.FRONT_RIGHT -> {
                return 54;
            }
            case GeneticValues.LEG.BACK_LEFT -> {
                return 44;
            }
            case GeneticValues.LEG.BACK_RIGHT -> {
                return 53;
            }
            default -> {
                return 0;
            }
        }
    }
    protected static int getUVYOffset(GeneticValues.LEG leg, int size) {
        switch (leg) {
            case GeneticValues.LEG.FRONT_LEFT -> {
                return switch (size) {
                    case 0 -> 69;
                    case 1 -> 68;
                    default -> 0;
                };
            }
            case GeneticValues.LEG.FRONT_RIGHT -> {
                return switch (size) {
                    case 0 -> 72;
                    case 1 -> 71;
                    default -> 0;
                };            }
            case GeneticValues.LEG.BACK_LEFT -> {
                return switch (size) {
                    case 0 -> 75;
                    case 1 -> 74;
                    default -> 0;
                };
            }
            case GeneticValues.LEG.BACK_RIGHT -> {
                return switch (size) {
                    case 0 -> 78;
                    case 1 -> 77;
                    default -> 0;
                };
            }
            default -> {
                return 0;
            }
        }
    }

}
