package net.buckleystudios.equigen.entity.genetic_horse.client.parts.multipart;

import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

import java.util.Objects;

@OnlyIn(Dist.CLIENT)
public abstract class MultipartBottomLegModel <E extends GeneticHorseEntity> extends MultipartModel<GeneticHorseEntity> {

protected static int getUVXOffset(GeneticValues.LEG leg, int blockNum) {
    if (Objects.requireNonNull(leg) == GeneticValues.LEG.FRONT_LEFT) {
        if (blockNum == 0) {
            return 16 / 2;
        } else {
            return 0;
        }
    }
    return 0;
}
    protected static int getUVYOffset(GeneticValues.LEG leg, int blockNum, int legLength) {
        int offset;
        switch (leg) {
            case GeneticValues.LEG.FRONT_LEFT -> {
                switch (blockNum) {
                    case 0 -> offset = 52/2;
                    case 1 -> offset = 42/2;
                    default -> offset = 0;
                };
            }
            case GeneticValues.LEG.FRONT_RIGHT -> {
                switch (blockNum) {
                    case 0 -> offset = 72/2;
                    case 1 -> offset = 56/2;
                    default -> offset = 0;
                };
            }
            case GeneticValues.LEG.BACK_LEFT -> {
                switch (blockNum) {
                    case 0 -> offset = 100/2;
                    case 1 -> offset = 84/2;
                    default -> offset = 0;
                };
            }
            case GeneticValues.LEG.BACK_RIGHT -> {
                switch (blockNum) {
                    case 0 -> offset = 128/2;
                    case 1 -> offset = 112/2;
                    default -> offset = 0;
                };
            }
            default -> {
                return 0;
            }
        }
        return offset - getLegLengthOffset(blockNum, legLength) + 1;
    }

    private static int getLegLengthOffset(int blockNum, int legLength) {
        switch (legLength) {
            case 1 -> {
                return switch (blockNum) {
                    case 0 -> 4;
                    case 1 -> 4;
                    default -> 0;
                };
            }
            case 2 -> {
                return switch (blockNum) {
                    case 0 -> 3;
                    case 1 -> 4;
                    default -> 0;
                };
            }
            case 3 -> {
                return switch (blockNum) {
                    case 0 -> 3;
                    case 1 -> 3;
                    default -> 0;
                };
            }
            case 4 -> {
                return switch (blockNum) {
                    case 0 -> 5;
                    case 1 -> 4;
                    default -> 0;
                };
            }
            case 5, 7 -> {
                return switch (blockNum) {
                    case 0 -> 5;
                    case 1 -> 5;
                    default -> 0;
                };
            }
            case 6 -> {
                return switch (blockNum) {
                    case 0 -> 6;
                    case 1 -> 4;
                    default -> 0;
                };
            }
            case 8 -> {
                return switch (blockNum) {
                    case 0 -> 7;
                    case 1 -> 4;
                    default -> 0;
                };
            }
            case 9 -> {
                return switch (blockNum) {
                    case 0 -> 6;
                    case 1 -> 5;
                    default -> 0;
                };
            }
            default -> {
                return 0;
            }
        }
    }
}
