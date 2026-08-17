package net.buckleystudios.equigen.entity.genetic_horse.client.parts.multipart;

import com.mojang.blaze3d.vertex.PoseStack;
import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
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

}
