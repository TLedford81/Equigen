package net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart;

import com.mojang.blaze3d.vertex.PoseStack;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.custom.genetics.Genetics;
import net.buckleystudios.equigen.entity.custom.genetics.GeneticsHandler;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

import java.util.List;

@OnlyIn(Dist.CLIENT)
public abstract class MultipartNeckModel <E extends GeneticHorseEntity> extends MultipartModel<GeneticHorseEntity> {
    public float x;

    @Override
    public void handlePartChildRotation(GeneticHorseEntity e, PoseStack pose, float partialTicks, int LegID) {
        String partName = "";
        float pitch = 0.0f;
        float manePitch = 0.0f;
        List<String> partsToRender = e.getPartsToRender();
//        Map<String,Float> renderGenetics = e.getRenderGenetics();
        for(String part : partsToRender){
            if(part.startsWith("neck")){
                partName = part;
            }
            switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_POS))) {
                case 1 -> {
                    switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_CURVE))) {
                        case 1 -> pitch = -5.0F; // Swan
                        case 2 -> pitch = 0.0F; // Straight
                        case 3 -> pitch = -10.0F; // Ewed
                        case 4 -> pitch = -30.0F; // Arched
                        default -> pitch = 0.0F;
                }
                }
                case 2 -> {
                    switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_CURVE))) {
                        case 1 -> pitch = 0.0F; // Swan
                        case 2 -> pitch = 0.0F; // Straight
                        case 3 -> pitch = -2.0F; // Ewed
                        case 4 -> pitch = -5.0F;// Arched
                        default -> pitch = 0.0F;
                    }                }
                case 3 -> pitch = 0.0f;
                default ->  pitch = 0.0f;
            }
        }
        switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_CURVE))) {
            case 1 -> manePitch = 5.0F; // Swan
            case 2 -> manePitch = -32.5f; // Straight
            case 3 -> manePitch = 0.0F; // Ewed
            case 4 -> manePitch = -7.5f; // Arched
            default -> pitch = 0.0F;
        } // Accounts for the rotation already applied to the manes in the model file, so that the rotations are the same.
//        pitch /= 16;
        pitch *= Mth.DEG_TO_RAD; //Convert Degrees (Readable Terms) into Radians (Minecraft's Rotation Units)
        manePitch *= Mth.DEG_TO_RAD;
//        pitch = (pitch + x) * Mth.DEG_TO_RAD;
//        EquigenMod.LOGGER.info("Pitch calculated = {}", pitch);
        ModelPart individual = root().getChild(partName).getChild(partName + "_individual");
        ModelPart crest = individual.getChild(partName + "_crest");
        ModelPart crestUpper = crest.getChild(partName + "_crest_upper");
//        ModelPart mane = root().getChild(partName).getChild(partName + "_mane");
        ModelPart topMane = crestUpper.getChild(partName + "_top_mane");
//        ModelPart maneConnector = topMane.getChild(partName + "_top_mane_connector");

//        individual.setRotation(individual.xRot, individual.yRot, individual.zRot);
//        crest.setRotation(crest.xRot, crest.yRot, crest.zRot);
        crestUpper.setRotation(pitch, crestUpper.yRot, crestUpper.zRot);
//        mane.setRotation(mane.xRot, mane.yRot, mane.zRot);
        topMane.setRotation(-manePitch, topMane.yRot, topMane.zRot);
//        maneConnector.setRotation(manePitch, maneConnector.yRot, maneConnector.zRot);
    }

    public float getNetYaw(GeneticHorseEntity e, float partialTicks) {
        float bodyYaw = net.minecraft.util.Mth.rotLerp(partialTicks, e.yBodyRotO, e.yBodyRot);
        float headYaw = net.minecraft.util.Mth.rotLerp(partialTicks, e.yHeadRotO, e.getYHeadRot());
        float netYaw = net.minecraft.util.Mth.clamp(headYaw - bodyYaw, -45f, 45f);

        return netYaw * ((float) Math.PI / 180f);
    }

    public void handlePartChildPosition(GeneticHorseEntity e, PoseStack pose, float partialTicks, int LegID) {
        float yPos = 0.0f;
        float zPos = 0.0f;
        List<String> partsToRender = e.getPartsToRender();
//        Map<String,Float> renderGenetics = e.getRenderGenetics();
        for(String part : partsToRender){
            if(part.startsWith("neck")){
                switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_POS))) {
                    case 1 -> {
                        switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_CURVE))) {
                            case 1 -> {
                                switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                    case 1 ->
                                     {
                                         yPos = 1.7F;
                                         zPos = -2.3f;
                                     }
                                     case 2 -> {
                                         yPos = 1.5F;
                                         zPos = -3.0f;
                                     }
                                     case 3 -> {
                                         yPos = 2.5F;
                                         zPos = -3.0f;
                                     }
                                     case 4 -> {
                                         yPos = 2.4F;
                                         zPos = -2.2f;
                                     }
                                    case 5 -> {
                                        yPos = 2.25F;
                                        zPos = -2.2f;
                                    }
                                    case 6 -> {
                                        yPos = 2.5F;
                                        zPos = -2.3f;
                                    }
                                    default -> {
                                        yPos = 0.0f;
                                        zPos = 0.0f;
                                    }
                                }
                            } // Swan TESTED AND FINISHED
                            case 2 -> {
                                switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                    case 1 ->
                                    {
                                        yPos = 1.5F;
                                        zPos = -4.5f;
                                    }
                                    case 2 -> {
                                        yPos = 2.0F;
                                        zPos = -4.0f;
                                    }
                                    case 3 -> {
                                        yPos = 3.0F;
                                        zPos = -3.5f;
                                    }
                                    case 4 -> {
                                        yPos = 3.8F;
                                        zPos = -3.5f;
                                    }
                                    case 5 -> {
                                        yPos = 3.2F;
                                        zPos = -3.5f;
                                    }
                                    case 6 -> {
                                        yPos = 2.6F;
                                        zPos = -4.5f;
                                    }
                                    default -> {
                                        yPos = 0.0f;
                                        zPos = 0.0f;
                                    }
                                }
                            } // Straight TESTED AND FINISHED
                            case 3 -> {
                                switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                    case 1 ->
                                    {
                                        yPos = 0.75F;
                                        zPos = -4.5f;
                                    }
                                    case 2 -> {
                                        yPos = 1.1F;
                                        zPos = -4.3f;
                                    }
                                    case 3 -> {
                                        yPos = 0.4F;
                                        zPos = -4.8f;
                                    }
                                    case 4 -> {
                                        yPos = 1.0F; // START FROM HERE!! Only finished up to 3.
                                        zPos = -4.8f;
                                    }
                                    case 5 -> {
                                        yPos = 2.0F;
                                        zPos = -4.3f;
                                    }
                                    case 6 -> {
                                        yPos = 1.75F;
                                        zPos = -4.5f;
                                    }
                                    default -> {
                                        yPos = 0.0f;
                                        zPos = 0.0f;
                                    }
                                }
                            } // Ewed TESTED AND FINISHED
                            case 4 -> {
                                switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                    case 1 ->
                                    {
                                        yPos = 1.0F;
                                        zPos = -3.5f;
                                    }
                                    case 2 -> {
                                        yPos = 1.1F;
                                        zPos = -4.0f;
                                    }
                                    case 3 -> {
                                        yPos = 0.2F;
                                        zPos = -4.8f;
                                    }
                                    case 4 -> {
                                        yPos = 0.75F;
                                        zPos = -4.8f;
                                    }
                                    case 5 -> {
                                        yPos = 1.8F;
                                        zPos = -4.3f;
                                    }
                                    case 6 -> {
                                        yPos = 0.9F;
                                        zPos = -4.2f;
                                    }
                                    default -> {
                                        yPos = 0.0f;
                                        zPos = 0.0f;
                                    }
                                }
                            } // Arched TESTED AND FINISHED
                            default -> yPos = 0.0F;
                        }
                    }
                    case 2 -> {
                        switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_CURVE))) {
                            case 1 -> {
                                switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                    case 1 ->
                                    {
                                        yPos = 1.0F;
                                        zPos = 0.0f;
                                    }
                                    case 2 -> {
                                        yPos = 0.75F;
                                        zPos = 0.3f;
                                    }
                                    case 3 -> {
                                        yPos = 1.2F;
                                        zPos = -1.0f;
                                    }
                                    case 4 -> {
                                        yPos = 1.15F;
                                        zPos = 0.0f;
                                    }
                                    case 5 -> {
                                        yPos = 1.0F;
                                        zPos = 0.3f;
                                    }
                                    case 6 -> {
                                        yPos = 1.1F;
                                        zPos = 0.0f;
                                    }
                                    default -> {
                                        yPos = 0.0f;
                                        zPos = 0.0f;
                                    }
                                }
                            } // Swan
                            case 2 -> {
                                switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                    case 1 ->
                                    {
                                        yPos = 1.0F;
                                        zPos = -1.0f;
                                    }
                                    case 2 -> {
                                        yPos = 1.0F;
                                        zPos = -0.9f;
                                    }
                                    case 3 -> {
                                        yPos = 1.2F;
                                        zPos = -0.5f;
                                    }
                                    case 4 -> {
                                        yPos = 1.3F;
                                        zPos = 0.0f;
                                    }
                                    case 5 -> {
                                        yPos = 1.3F;
                                        zPos = 0.1f;
                                    }
                                    case 6 -> {
                                        yPos = 1.5F;
                                        zPos = 0.0f;
                                    }
                                    default -> {
                                        yPos = 0.0f;
                                        zPos = 0.0f;
                                    }
                                }
                            } // Straight TESTED AND FINISHED
                            case 3 -> {
                                switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                    case 1 ->
                                    {
                                        yPos = 1.0F;
                                        zPos = 0.0f;
                                    }
                                    case 2 -> {
                                        yPos = 1.2F;
                                        zPos = -0.1f;
                                    }
                                    case 3 -> {
                                        yPos = 1.3F;
                                        zPos = 0.0f;
                                    }
                                    case 4 -> {
                                        yPos = 1.3F;
                                        zPos = 0.3f;
                                    }
                                    case 5 -> {
                                        yPos = 1.4F;
                                        zPos = 0.0f;
                                    }
                                    case 6 -> {
                                        yPos = 1.5F;
                                        zPos = 0.0f;
                                    }
                                    default -> {
                                        yPos = 0.0F;
                                        zPos = 0.0f;
                                    }
                                }
                            } // Ewed TESTED AND FINISHED
                            case 4 -> {
                                switch (Math.round(GeneticsHandler.getEntityGenetic(e, Genetics.NECK_LENGTH))) {
                                    case 1 ->
                                    {
                                        yPos = 0.8F;
                                        zPos = -0.5f;
                                    }
                                    case 2 -> {
                                        yPos = 0.8F;
                                        zPos = -1.0f;
                                    }
                                    case 3 -> {
                                        yPos = 0.5F;
                                        zPos = -1.0f;
                                    }
                                    case 4 -> {
                                        yPos = 0.4F;
                                        zPos = -1.0f;
                                    }
                                    case 5 -> {
                                        yPos = 1.0F;
                                        zPos = 0.0f;
                                    }
                                    case 6 -> {
                                        yPos = 1.1F;
                                        zPos = 0.15f;
                                    }
                                    default -> {
                                        yPos = 0.0F;
                                        zPos = 0.0f;
                                    }
                                }
                            } // Arched
                            default -> yPos = 0.0F;
                        }
                    }
                    case 3 -> yPos = 0.0f;
                    default ->  yPos = 0.0f;
                }            }

        }
        yPos /= 16;
        zPos /= 16;

        pose.translate(0, yPos, zPos);
    }
}
