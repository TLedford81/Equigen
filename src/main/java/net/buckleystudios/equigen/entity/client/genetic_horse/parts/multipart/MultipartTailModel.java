package net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart;

import com.mojang.blaze3d.vertex.PoseStack;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

import java.util.List;
import java.util.Map;

@OnlyIn(Dist.CLIENT)
public abstract class MultipartTailModel <E extends GeneticHorseEntity> extends MultipartModel<GeneticHorseEntity> {

    float x = 0;
    @Override
    public void handlePartChildRotations(GeneticHorseEntity e, PoseStack pose, float partialTicks) {
        String partName = "";
        List<String> partsToRender = e.getPartsToRender();
        Map<String,Float> renderGenetics = e.getRenderGenetics();
        float pitch = 0.0f;
        for(String part : partsToRender){
            if(part.startsWith("tail")){
                partName = part;
            }
            switch (Math.round(renderGenetics.get("TAIL_SET"))) {
                case 1 -> pitch = 0.0f;
                case 2 -> pitch = 7.5f;
                case 3 -> pitch = 15.0f;
                default ->  pitch = 0.0f;
            }
        }
        pitch /= 16;

        ModelPart tailConnector = root().getChild(partName).getChild(partName + "_tail_connector");
        ModelPart tailTop = tailConnector.getChild(partName + "_tail_top");
        ModelPart tailMiddle = tailTop.getChild(partName + "_tail_middle");

//        x += 0.1f;
        tailConnector.setRotation(pitch, tailConnector.yRot, tailConnector.zRot);
        tailTop.setRotation(0.0f, tailConnector.yRot, tailConnector.zRot);
        tailMiddle.setRotation(-pitch, tailConnector.yRot, tailConnector.zRot);
    }
}
