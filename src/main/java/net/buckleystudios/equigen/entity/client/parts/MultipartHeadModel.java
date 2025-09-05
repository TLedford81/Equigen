package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

import java.util.Map;

@OnlyIn(Dist.CLIENT)
public abstract class MultipartHeadModel <E extends GeneticHorseEntity> extends MultipartModel<GeneticHorseEntity> {

    public Map<String, Float> getNeckGenetics(GeneticHorseEntity entity){
        //NECK_POS AND NECK_CURVE
        Map<String, Float> renderGenetics = entity.getRenderGenetics();
            return Map.of(
                    "NECK_POS", renderGenetics.get("NECK_POS"),
                    "NECK_CURVE", renderGenetics.get("NECK_CURVE")
            );

    }

}
