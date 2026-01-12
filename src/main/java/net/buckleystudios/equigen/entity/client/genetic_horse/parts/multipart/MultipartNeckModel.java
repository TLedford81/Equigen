package net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart;

import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

import java.util.Map;

@OnlyIn(Dist.CLIENT)
public abstract class MultipartNeckModel <E extends GeneticHorseEntity> extends MultipartModel<GeneticHorseEntity> {
 private float neckRotation;

    public Map<String, Float> getGenetics(GeneticHorseEntity entity){
        return entity.getRenderGenetics();
    }




    public float getNetYaw(GeneticHorseEntity e, float partialTicks) {
        float bodyYaw = net.minecraft.util.Mth.rotLerp(partialTicks, e.yBodyRotO, e.yBodyRot);
        float headYaw = net.minecraft.util.Mth.rotLerp(partialTicks, e.yHeadRotO, e.getYHeadRot());
        float netYaw = net.minecraft.util.Mth.clamp(headYaw - bodyYaw, -45f, 45f);

        return netYaw * ((float) Math.PI / 180f);
    }

    public float getNeckRotation() {
        return neckRotation;
    }
}
