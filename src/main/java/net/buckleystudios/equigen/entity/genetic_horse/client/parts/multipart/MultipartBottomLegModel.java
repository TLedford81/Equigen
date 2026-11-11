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
    protected static int getUVYOffset(GeneticValues.LEG leg, int blockNum, int zLength) {
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
        return offset - zLength;
    }

    }
