package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

import java.util.Map;

@OnlyIn(Dist.CLIENT)
public abstract class MultipartBackModel <E extends GeneticHorseEntity> extends MultipartModel<GeneticHorseEntity> {

    @Override
    public Map<String, PartTransform> anchors() {
        return Map.of();
    }


}
