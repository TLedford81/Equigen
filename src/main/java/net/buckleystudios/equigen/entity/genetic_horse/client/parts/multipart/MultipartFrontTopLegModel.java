package net.buckleystudios.equigen.entity.genetic_horse.client.parts.multipart;

import com.mojang.blaze3d.vertex.PoseStack;
import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class MultipartFrontTopLegModel <E extends GeneticHorseEntity> extends MultipartModel<GeneticHorseEntity> {
    @Override
    public void handlePartChildPosition(GeneticHorseEntity e, PoseStack pose, float partialTicks, int LegID) {
        float difference = e.getDifference();
        String tallerPart = e.getTallerHalf();
        if (tallerPart.equals("FRONT")) {
            pose.translate(0, -difference, 0);
        }
    }

    protected static int getUVXOffset(GeneticValues.LEG leg, int blockNum) {
        int offset;
        switch (leg) {
            case GeneticValues.LEG.FRONT_LEFT -> {
                switch (blockNum) {
                    case 0 -> offset = 82 / 2;
                    case 1 -> offset = 48 / 2;
                    case 2 -> offset = 22 / 2;
                    default -> offset = 0;
                }
            }
            case GeneticValues.LEG.FRONT_RIGHT -> {
                switch (blockNum) {
                    case 0 -> offset = 144 / 2;
                    case 1 -> offset = 110 / 2;
                    case 2 -> offset = 76 / 2;
                    default -> offset = 0;
                }
            }
            default -> offset = 0;
        }
            return offset;
    }
    protected static int getUVYOffset(GeneticValues.LEG leg, int blockNum, int zLength) {
        int offset;
        switch (leg) {
            case GeneticValues.LEG.FRONT_LEFT -> {
                switch (blockNum) {
                    case 0, 2 -> offset = 90 / 2;
                    case 1 -> offset = 84 / 2;
                    default -> offset = 0;
                }
            }
            case GeneticValues.LEG.FRONT_RIGHT -> {
                switch (blockNum) {
                    case 0 -> offset = 108 / 2;
                    case 1 -> offset = 84 / 2;
                    case 2 -> offset = 66 / 2;
                    default -> offset = 0;
                }
            }
            default -> offset = 0;
        }

        return offset - zLength;

        }
}
