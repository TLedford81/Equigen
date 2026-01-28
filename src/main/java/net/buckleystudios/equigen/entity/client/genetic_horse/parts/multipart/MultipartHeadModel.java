package net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart;

import com.mojang.blaze3d.vertex.PoseStack;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

import java.util.List;
import java.util.Map;

@OnlyIn(Dist.CLIENT)
public abstract class MultipartHeadModel <E extends GeneticHorseEntity> extends MultipartModel<GeneticHorseEntity> {

    public void handlePartChildPosition(GeneticHorseEntity e, PoseStack pose, float partialTicks, int LegID) {
        float zPos = 0.0f;
        float yPos = 0.0f;
        List<String> partsToRender = e.getPartsToRender();
        Map<String,Float> renderGenetics = e.getRenderGenetics();
        for(String part : partsToRender){
            if(part.startsWith("head")){
                switch (Math.round(renderGenetics.get("NECK_POS"))) {
                    case 1 -> {
                        switch (Math.round(renderGenetics.get("NECK_CURVE"))) {
                            case 1 -> {
                                zPos = 1.5F;
                                yPos = -1.0f;
                            } // Swan
                            case 2 -> {
                                zPos = 0.0F;
                                yPos = 0.0f;
                            } // Straight
                            case 3 -> {
                                zPos = 1.2F;
                                yPos = -0.7f;
                            } // Ewed
                            case 4 -> {
                                zPos = 1.25F;
                                yPos = -1.0F;
                            } // Arched
                            default -> zPos = 0.0F;
                        }
                    }
                    case 2 -> {
                        switch (Math.round(renderGenetics.get("NECK_CURVE"))) {
                            case 1 -> {
                                zPos = 0.5F;
                                yPos = -0.5f;
                            } // Swan
                            case 2 -> {
                                zPos = 0.0F;
                                yPos = 0.0f;
                            } // Straight
                            case 3 -> {
                                zPos = 1.0F;
                                yPos = -0.3f;
                            } // Ewed
                            case 4 -> {
                                zPos = 1.25F;
                                yPos = -1.0F;
                            } // Arched
                            default -> zPos = 0.0F;
                        }                    }
                    case 3 -> zPos = 0.0f;
                    default ->  zPos    = 0.0f;
                }            }

        }
        zPos /= 16;
        yPos /= 16;
        pose.translate(0, yPos, zPos);
    }
}
