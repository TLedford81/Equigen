package net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart;

import com.mojang.blaze3d.vertex.PoseStack;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.util.Mth;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class MultipartHeadModel <E extends GeneticHorseEntity> extends MultipartModel<GeneticHorseEntity> {

    @Override
    public void afterAttached(GeneticHorseEntity e, PoseStack pose, float partialTicks) {
//        PartTransform parentAnchor = this.getAnchorForParent();
//        var += 1F;
//        pose.rotateAround(Axis.YP.rotationDegrees(var),
//                (float) parentAnchor.position.x,
//                (float) parentAnchor.position.y,
//                (float) parentAnchor.position.z);
    }

    public float getNetYaw(GeneticHorseEntity e, float partialTicks) {
        float bodyYaw = Mth.rotLerp(partialTicks, e.yBodyRotO, e.yBodyRot);
        float headYaw = Mth.rotLerp(partialTicks, e.yHeadRotO, e.getYHeadRot());
        float netYaw = Mth.clamp(headYaw - bodyYaw, -45f, 45f);

        return netYaw * ((float)Math.PI / 180f);
    }
}
