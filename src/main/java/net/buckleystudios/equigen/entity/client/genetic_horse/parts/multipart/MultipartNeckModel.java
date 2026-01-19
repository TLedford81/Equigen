package net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart;

import com.mojang.blaze3d.vertex.PoseStack;
import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

import java.util.List;
import java.util.Map;

@OnlyIn(Dist.CLIENT)
public abstract class MultipartNeckModel <E extends GeneticHorseEntity> extends MultipartModel<GeneticHorseEntity> {
 private float neckRotation;

    public Map<String, Float> getGenetics(GeneticHorseEntity entity){
        return entity.getRenderGenetics();
    }
    @Override
    public void handlePartChildRotations(GeneticHorseEntity e, PoseStack pose, float partialTicks) {
        String partName = "";
        List<String> partsToRender = e.getPartsToRender();
        Map<String,Float> renderGenetics = e.getRenderGenetics();
        float pitch = 0.0f;
        for(String part : partsToRender){
            if(part.startsWith("neck")){
                partName = part;
            }
            switch (Math.round(renderGenetics.get("NECK_POS"))) {
                case 1 -> pitch = 0.0f;
                case 2 -> pitch = 100.0f;
                case 3 -> pitch = 100.0f;
                default ->  pitch = 0.0f;
            }
        }
        EquigenMod.LOGGER.info("Pitch = {}", pitch);
//        pitch /= 16;
        EquigenMod.LOGGER.info("Pitch calculated = {}", pitch);
        ModelPart individual = root().getChild(partName).getChild(partName + "_individual");
        ModelPart crest = individual.getChild(partName + "_crest");
        ModelPart crestUpper = crest.getChild(partName + "_crest_upper");
        ModelPart mane = root().getChild(partName).getChild(partName + "_mane");
        ModelPart topMane = mane.getChild(partName + "_top_mane");
        ModelPart maneConnector = topMane.getChild(partName + "_top_mane_connector");

//        individual.setRotation(individual.xRot, individual.yRot, individual.zRot);
//        crest.setRotation(crest.xRot, crest.yRot, crest.zRot);
        crestUpper.setRotation(pitch, crestUpper.yRot, crestUpper.zRot);
//        mane.setRotation(mane.xRot, mane.yRot, mane.zRot);
//        topMane.setRotation(topMane.xRot, topMane.yRot, topMane.zRot);
        maneConnector.setRotation(pitch, maneConnector.yRot, maneConnector.zRot);
    }



    public float getNetYaw(GeneticHorseEntity e, float partialTicks) {
        float bodyYaw = net.minecraft.util.Mth.rotLerp(partialTicks, e.yBodyRotO, e.yBodyRot);
        float headYaw = net.minecraft.util.Mth.rotLerp(partialTicks, e.yHeadRotO, e.getYHeadRot());
        float netYaw = net.minecraft.util.Mth.clamp(headYaw - bodyYaw, -45f, 45f);

        return netYaw * ((float) Math.PI / 180f);
    }

    public float getNeckRotation() {
        return neckRotation;
    }
}
