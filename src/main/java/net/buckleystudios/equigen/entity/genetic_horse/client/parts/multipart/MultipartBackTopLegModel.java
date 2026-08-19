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

    protected static int getUVXOffset(GeneticValues.LEG leg) {
        switch (leg) {
            case GeneticValues.LEG.FRONT_LEFT -> {
                return 20;
            }
            case GeneticValues.LEG.FRONT_RIGHT -> {
                return 50;
            }
            case GeneticValues.LEG.BACK_LEFT -> {
                return 100;
            }
            case GeneticValues.LEG.BACK_RIGHT -> {
                return 150;
            }
            default -> {
                return 0;
            }
        }
    }
    protected static int getUVYOffset(GeneticValues.LEG leg) {
        switch (leg) {
            case GeneticValues.LEG.FRONT_LEFT -> {
                return 10;
            }
            case GeneticValues.LEG.FRONT_RIGHT -> {
                return 20;
            }
            case GeneticValues.LEG.BACK_LEFT -> {
                return 30;
            }
            case GeneticValues.LEG.BACK_RIGHT -> {
                return 40;
            }
            default -> {
                return 0;
            }
        }
    }
}

