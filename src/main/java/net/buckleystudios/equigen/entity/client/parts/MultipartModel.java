package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.phys.Vec3;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

import java.util.Map;

@OnlyIn(Dist.CLIENT)
public abstract class MultipartModel<E extends GeneticHorseEntity> extends HierarchicalModel<GeneticHorseEntity> {

    public Map<String, PartTransform> anchors() {
        return Map.of();
    }

    public PartTransform origin() {
        return PartTransform.IDENTITY;
    }


    @Override
    public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    protected PartTransform asTransform(ModelPart part) {
        return new PartTransform(
                new Vec3(part.x / 16.0, part.y / 16.0, part.z / 16.0),
                new Vec3(Math.toDegrees(part.xRot), Math.toDegrees(part.yRot), Math.toDegrees(part.zRot)),
                new Vec3(1, 1, 1)
        );
    }
}
