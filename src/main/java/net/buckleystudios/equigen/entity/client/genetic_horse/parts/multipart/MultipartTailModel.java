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

        for(String part : partsToRender){
            if(part.startsWith("tail")){
                partName = part;
            }
        }

        ModelPart tailConnector = root().getChild(partName).getChild(partName + "_tail_connector");
        ModelPart tailTop = tailConnector.getChild(partName + "_tail_top");
        ModelPart tailMiddle = tailTop.getChild(partName + "_tail_middle");

        x += 0.1f;
        tailConnector.setRotation(x, tailConnector.yRot, tailConnector.zRot);
        tailTop.setRotation(-x, tailConnector.yRot, tailConnector.zRot);
        tailMiddle.setRotation(x, tailConnector.yRot, tailConnector.zRot);
    }
}
