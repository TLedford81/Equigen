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
public abstract class MultipartBackTopLegModel <E extends GeneticHorseEntity> extends MultipartModel<GeneticHorseEntity> {
    @Override
    public void handlePartChildPositions(GeneticHorseEntity e, PoseStack pose, float partialTicks) {
        String partName = "";
        float pitch = 0.0f;
        List<String> partsToRender = e.getPartsToRender();
        Map<String,Float> renderGenetics = e.getRenderGenetics();
        for(String part : partsToRender){
            if(part.startsWith("top_back_legs")){
                partName = part;
            }
        }
//        EquigenMod.LOGGER.info("PARTNAME = {}", partName);
        ModelPart legs = root().getChild(partName);
//        EquigenMod.LOGGER.info("LEGS = {}", legs);


//        legs.setRotation(legs.xRot, legs.yRot, (Mth.DEG_TO_RAD * -50));
//        crest.setRotation(crest.xRot, crest.yRot, crest.zRot);
        legs.setPos(legs.x, 100 , legs.z);
        EquigenMod.LOGGER.info("LEGS POS = X - {} Y - {} Z - {}", legs.x, legs.y, legs.z);
    }
}

