package net.buckleystudios.equigen.entity.genetic_horse.client.parts.multipart;

import com.mojang.blaze3d.vertex.PoseStack;
import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class MultipartBackTopLegModel <E extends GeneticHorseEntity> extends MultipartModel<GeneticHorseEntity> {
    float x;
    @Override
    public void handlePartChildPosition(GeneticHorseEntity e, PoseStack pose, float partialTicks, int LegID) {
        float difference = e.getDifference();
        String tallerPart = e.getTallerHalf();
        if (tallerPart.equals("BACK")) {
            pose.translate(0, -difference, 0);
        }
    }

    protected static int getUVXOffset(GeneticValues.LEG leg, int blockNum) {
        int offset;
        switch (leg) {
            case GeneticValues.LEG.BACK_LEFT -> {
                switch (blockNum) {
                    case 0 -> offset = 52 / 2;
                    case 1 -> offset = 22 / 2;
                    default -> offset = 0;
                }
            }
            case GeneticValues.LEG.BACK_RIGHT -> {
                switch (blockNum) {
                    case 0 -> offset = 116 / 2;
                    case 1 -> offset = 86 / 2;
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
            case GeneticValues.LEG.BACK_LEFT, GeneticValues.LEG.BACK_RIGHT -> {
                switch (blockNum) {
                    case 0 -> offset = 114 / 2;
                    case 1 -> offset = 120 / 2;
                    default -> offset = 0;
                }
            }
            default -> offset = 0;
        }

        return offset - zLength;

    }
}

