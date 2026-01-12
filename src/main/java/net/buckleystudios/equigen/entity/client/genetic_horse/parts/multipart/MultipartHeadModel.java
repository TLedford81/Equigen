package net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart;

import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.util.Mth;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class MultipartHeadModel <E extends GeneticHorseEntity> extends MultipartModel<GeneticHorseEntity> {

    public float getNetYaw(GeneticHorseEntity e, float partialTicks) {
        float bodyYaw = Mth.rotLerp(partialTicks, e.yBodyRotO, e.yBodyRot);
        float headYaw = Mth.rotLerp(partialTicks, e.yHeadRotO, e.getYHeadRot());
        float netYaw = Mth.clamp(headYaw - bodyYaw, -45f, 45f);

        return netYaw * ((float)Math.PI / 180f);
    }
}
