package net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart;

import com.mojang.blaze3d.vertex.PoseStack;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.custom.genetics.Genetics;
import net.buckleystudios.equigen.entity.custom.genetics.GeneticsHandler;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

import java.util.List;

@OnlyIn(Dist.CLIENT)
public abstract class MultipartHeadModel <E extends GeneticHorseEntity> extends MultipartModel<GeneticHorseEntity> {

    public void handlePartChildPosition(GeneticHorseEntity e, PoseStack pose, float partialTicks, int LegID) {
        float zPos = 0.0f;
        float yPos = 0.0f;
        List<String> partsToRender = e.getPartsToRender();
//        Map<String,Float> renderGenetics = e.getRenderGenetics();
        for(String part : partsToRender){
            if(part.startsWith("head")){
                switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_POS))) {
                    case 1 -> {
                        switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_CURVE))) {
                            case 1 -> {
                                switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.HEAD_TYPE))) {
                                    case 1 -> {
                                        switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                            case 1 ->
                                            {
                                                zPos = 0.1F;
                                                yPos = -0.5f;
                                            }
                                            case 2 -> {
                                                zPos = 0.8F;
                                                yPos = -1.2f;
                                            }
                                            case 3 -> {
                                                zPos = 0.0F;
                                                yPos = -0.7f;
                                            }
                                            case 4 -> {
                                                zPos = 0.5F;
                                                yPos = -0.5f;
                                            }
                                            case 5 -> {
                                                zPos = 0.7F;
                                                yPos = -0.8f;
                                            }
                                            case 6 -> {
                                                zPos = 0.1F;
                                                yPos = -0.7f;
                                            }
                                            default -> {
                                                yPos = 0.0f;
                                                zPos = 0.0f;
                                            }
                                        }
                                    } // Dished ADJUSTED AND FINISHED
                                    case 2 -> {
                                        switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                            case 1 ->
                                            {
                                                zPos = 0.0F;
                                                yPos = -0.3f;
                                            }
                                            case 2, 5 -> {
                                                zPos = 0.0F;
                                                yPos = -0.0f;
                                            }
                                            case 3 -> {
                                                zPos = 0.0F;
                                                yPos = 0.3F;
                                            }
                                            case 4 -> {
                                                zPos = -0.4F;
                                                yPos = 0.4f;
                                            }
                                            case 6 -> {
                                                zPos = 0.0F;
                                                yPos = 0.2f;
                                            }
                                            default -> {
                                                yPos = 0.0f;
                                                zPos = 0.0f;
                                            }
                                        }
                                    } // Roman ADJUSTED AND FINISHED
                                    case 3 -> {
                                        switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                            case 1 ->
                                            {
                                                zPos = 0.4F;
                                                yPos = 0.15f;
                                            }
                                            case 2 -> {
                                                zPos = 0.0F;
                                                yPos = 0.15f;
                                            }
                                            case 3 -> {
                                                zPos = 0.5F;
                                                yPos = 0.1F;
                                            }
                                            case 4 -> {
                                                zPos = 0.2F;
                                                yPos = 0.0f;
                                            }
                                            case 5 -> {
                                                zPos = -0.0F;
                                                yPos = 0.0f;
                                            }
                                            case 6 -> {
                                                zPos = 0.1F;
                                                yPos = 0.0f;
                                            }
                                            default -> {
                                                yPos = 0.0f;
                                                zPos = 0.0f;
                                            }
                                        }
                                    } // Stocky ADJUSTED AND FINISHED
                                    case 4 -> {
                                        switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                            case 1, 2, 4, 5, 6 ->
                                            {
                                                yPos = -0.8f;
                                                zPos = -0.5f;
                                            }
                                            case 3 -> {
                                                yPos = -0.5f;
                                                zPos = -0.3f;
                                            }
                                            default -> {
                                                yPos = 0.0f;
                                                zPos = 0.0f;
                                            }
                                        }
                                    } // Straight ADJUSTED, TODO Fix the weirdness with the straight head and this neck? Idk how tho.
                                    default -> zPos = 0.0F;
                                }
                            } // Swan
                            case 2 -> {
                                switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.HEAD_TYPE))) {
                                    case 1 -> {
                                        switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                            case 1 -> {
                                                zPos = 0.55F;
                                                yPos = -0.35f;
                                            }
                                            case 2, 6 -> {
                                                zPos = 0.0F;
                                                yPos = -0.0f;
                                            }
                                            case 3 -> {
                                                zPos = 0.3F;
                                                yPos = -0.2f;
                                            }
                                            case 4 -> {
                                                zPos = 0.2F;
                                                yPos = -0.1f;
                                            }
                                            case 5 -> {
                                                zPos = 0.1F;
                                                yPos = -0.1f;
                                            }
                                            default -> {
                                                yPos = 0.0f;
                                                zPos = 0.0f;
                                            }
                                        }
                                    } // Dished TODO Fix Dished Head shading + highlight map due to changes made for this
                                    case 2 -> {
                                        switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                            case 1 ->
                                            {
                                                zPos = -0.2F;
                                                yPos = 0.6f;
                                            }
                                            case 2 -> {
                                                zPos = -0.2F;
                                                yPos = 0.3f;
                                            }
                                            case 3 -> {
                                                zPos = -0.2F;
                                                yPos = 0.5F;
                                            }
                                            case 4 -> {
                                                zPos = -0.4F;
                                                yPos = 0.6f;
                                            }
                                            case 5 -> {
                                                zPos = -0.4F;
                                                yPos = 0.7f;
                                            }
                                            case 6 -> {
                                                zPos = -0.3F;
                                                yPos = 0.6f;
                                            }
                                            default -> {
                                                yPos = 0.0f;
                                                zPos = 0.0f;
                                            }
                                        }
                                    } // Roman
                                    case 3 -> {
                                        switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                            case 1 ->
                                            {
                                                zPos = 0.45F;
                                                yPos = 0.2f;
                                            }
                                            case 2 -> {
                                                zPos = 0.3F;
                                                yPos = 0.0F;
                                            }
                                            case 3 -> {
                                                zPos = 0.3F;
                                                yPos = 0.3F;
                                            }
                                            case 4 -> {
                                                zPos = 0.4F;
                                                yPos = 0.2f;
                                            }
                                            case 5 -> {
                                                zPos = 0.3F;
                                                yPos = 0.1f;
                                            }
                                            case 6 -> {
                                                zPos = 0.7F;
                                                yPos = 0.2f;
                                            }
                                            default -> {
                                                yPos = 0.0f;
                                                zPos = 0.0f;
                                            }
                                        }
                                    } // Stocky Adjusted and Finished
                                    case 4 -> {
                                        switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                            case 1 -> {
                                                yPos = -0.4f;
                                                zPos = 0.2f;
                                            }
                                            case 2, 4, 5 -> {
                                                yPos = -0.4f;
                                                zPos = 0.5f;
                                            }
                                            case 3 -> {
                                                yPos = -0.5f;
                                                zPos = 0.55f;
                                            }
                                            case 6 -> {
                                                yPos = -0.4f;
                                                zPos = 0.35f;
                                            }

                                            default -> {
                                                yPos = 0.0f;
                                                zPos = 0.0f;
                                            }
                                        }
                                    } // Straight Adjusted TODO clips through like the other stocky necks. Idk man.
                                    default -> zPos = 0.0F;
                                }
                            } // Straight
                            case 3 -> {
                                switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.HEAD_TYPE))) {
                                    case 1 -> {
                                        zPos = 0.7F;
                                        yPos = -0.4f;
                                    } // Dished ADJUSTED AND FINISHED
                                    case 2 -> {
                                        switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                            case 1 ->
                                            {
                                                zPos = -0.0F;
                                                yPos = 0.20f;
                                            }
                                            case 2 -> {
                                                zPos = 0.4F;
                                                yPos = 0.2f;
                                            }
                                            case 3 -> {
                                                zPos = 0.4F;
                                                yPos = 0.4F;
                                            }
                                            case 4, 5 -> {
                                                zPos = 0.8F;
                                                yPos = 0.2f;
                                            }
                                            case 6 -> {
                                                zPos = 0.5F;
                                                yPos = 0.2f;
                                            }
                                            default -> {
                                                yPos = 0.0f;
                                                zPos = 0.0f;
                                            }
                                        }
                                    } // Roman ADJUSTED AND FINISHED
                                    case 3 -> {
                                        switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                            case 1 ->
                                            {
                                                zPos = 1.1F;
                                                yPos = 0.2f;
                                            }
                                            case 2 -> {
                                                zPos = 1.2F;
                                                yPos = 0.0F;
                                            }
                                            case 3 -> {
                                                zPos = 1.0F;
                                                yPos = 0.1F;
                                            }
                                            case 4 -> {
                                                zPos = 1.4F;
                                                yPos = -0.2F;
                                            }
                                            case 5 -> {
                                                zPos = 1.25F;
                                                yPos = 0.3F;
                                            }
                                            case 6 -> {
                                                zPos = 1.0F;
                                                yPos = 0.15F;
                                            }
                                            default -> {
                                                yPos = 0.0f;
                                                zPos = 0.0f;
                                            }
                                        }
                                    } // Stocky FINSIHED AND ADJUSTED (slightly off)
                                    case 4 -> {
                                        switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                            case 1, 3 -> {
                                                yPos = -0.8f;
                                                zPos = 0.6F;
                                            }
                                            case 2 -> {
                                                yPos = -0.8f;
                                                zPos = 0.8f;
                                            }
                                            case 4, 5, 6 -> {
                                                yPos = -0.8f;
                                                zPos = 0.9f;
                                            }
                                            default -> {
                                                yPos = 0.0f;
                                                zPos = 0.0f;
                                            }
                                        }
                                    } // Straight ADJUSTED, Doesn't match exactly.
                                    default -> zPos = 0.0F;
                                }
                            } // Ewed
                            case 4 -> {
                                switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.HEAD_TYPE))) {
                                    case 1 -> {
                                        switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                            case 1 -> {
                                                zPos = 0.8F;
                                                yPos = -1.0f;
                                            }
                                            case 2 -> {
                                                zPos = 1.0F;
                                                yPos = -0.5f;
                                            }
                                            case 3 -> {
                                                zPos = 0.8F;
                                                yPos = -0.5f;
                                            }
                                            case 4, 6 -> {
                                                zPos = 1.0F;
                                                yPos = -0.7f;
                                            }
                                            case 5 -> {
                                                zPos = 1.1F;
                                                yPos = -0.7f;
                                            }
                                            default -> {
                                                yPos = 0.0f;
                                                zPos = 0.0f;
                                            }
                                        }
                                    } // Dished ADJUSTED TODO I hate how this turned out. Experiment with ways to fix?
                                    case 2 -> {
                                        switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                            case 1 ->
                                            {
                                                zPos = 0.5F;
                                                yPos = 0.4f;
                                            }
                                            case 2 -> {
                                                zPos = 0.2F;
                                                yPos = 0.3f;
                                            }
                                            case 3 -> {
                                                zPos = 0.2F;
                                                yPos = 0.4F;
                                            }
                                            case 4, 5 -> {
                                                zPos = 0.6F;
                                                yPos = 0.3f;
                                            }
                                            case 6 -> {
                                                zPos = 0.5F;
                                                yPos = 0.2f;
                                            }
                                            default -> {
                                                yPos = 0.0f;
                                                zPos = 0.0f;
                                            }
                                        }
                                    } // Roman ADJUSTED AND FINISHED
                                    case 3 -> {
                                        switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                            case 1, 2, 3, 4 ->
                                            {
                                                zPos = 0.7F;
                                                yPos = 0.2f;
                                            }
                                            case 5, 6 -> {
                                                zPos = 0.9F;
                                                yPos = 0.2f;
                                            }
                                            default -> {
                                                yPos = 0.0f;
                                                zPos = 0.0f;
                                            }
                                        }
                                    } // Stocky ADJUSTED
                                    case 4 -> {
                                        switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                            case 1, 4 -> {
                                                yPos = -0.6f;
                                                zPos = 0.9F;
                                            }
                                            case 2, 3 -> {
                                                yPos = -0.9f;
                                                zPos = 0.8f;
                                            }
                                            case 5, 6 -> {
                                                yPos = -0.9f;
                                                zPos = 0.9F;
                                            }
                                            default -> {
                                                yPos = 0.0f;
                                                zPos = 0.0f;
                                            }
                                        }
                                    } // Straight
                                    default -> zPos = 0.0F;
                                }
                            } // Arched
                            default -> zPos = 0.0F;
                        }
                    }
                    case 2 -> {
                        switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_CURVE))) {
                            case 1 -> {
                                zPos = 0.5F;
                                yPos = -0.5f;
                            } // Swan
                            case 2 -> {
                                switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.HEAD_TYPE))) {
                                    case 1 -> {
                                        switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                            case 2 -> {
                                                zPos = 0.2F;
                                            }
                                            case 3 -> {
                                                zPos = 0.4F;
                                                yPos = -0.2F;
                                            }
                                            case 4 -> {
                                                zPos = 0.4F;
                                                yPos = -0.25F;
                                            }
                                            case 5 -> {
                                                zPos = 0.35F;
                                                yPos = -0.3F;
                                            }
                                            case 6 -> {
                                                zPos = 0.1F;
                                                yPos = -0.05F;
                                            }
                                            default -> {
                                                yPos = 0.0f;
                                                zPos = 0.0f;
                                            }
                                        }
                                    } // Dished FINSIHED
                                    case 2 -> {
                                        switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                            case 1 -> {
                                                zPos = -0.5F;
                                                yPos = 0.2f;
                                            }
                                            default -> {
                                                yPos = 0.0f;
                                                zPos = 0.0f;
                                            }
                                        }
                                    } // Roman
                                    case 3 -> {
                                        switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                            case 1, 2, 3, 4 -> {
                                                zPos = 0.7F;
                                                yPos = 0.2f;
                                            }
                                            default -> {
                                                yPos = 0.0f;
                                                zPos = 0.0f;
                                            }
                                        }
                                    } // Stocky
                                    case 4 -> {
                                        switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                            case 1, 4 -> {
                                                yPos = -0.6f;
                                                zPos = 0.9F;
                                            }
                                            default -> {
                                                yPos = 0.0f;
                                                zPos = 0.0f;
                                            }
                                        }
                                    }
                                }
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
