package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class MultipartChestModel <E extends GeneticHorseEntity> extends MultipartModel<GeneticHorseEntity> {

    @Override
    public void PositionParts(ModelPart part1, ModelPart part2) {
        super.PositionParts(part1, part2);
        //Positioning Goes Here
    }
}
