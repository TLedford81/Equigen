package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class MultipartModel<E extends GeneticHorseEntity> extends HierarchicalModel<GeneticHorseEntity> {

    public void PositionParts(){
    }

    public void PositionParts(ModelPart part1, ModelPart part2){
    }

    @Override
    public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }
}
