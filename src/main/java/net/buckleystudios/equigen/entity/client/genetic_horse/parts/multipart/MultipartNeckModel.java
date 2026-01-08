package net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart;

import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

import java.util.Map;

@OnlyIn(Dist.CLIENT)
public abstract class MultipartNeckModel <E extends GeneticHorseEntity> extends MultipartModel<GeneticHorseEntity> {

    public Map<String, Float> getGenetics(GeneticHorseEntity entity){
        return entity.getRenderGenetics();
    }

    public float getPitch(GeneticHorseEntity e, String neckCurve) {
        Map<String, Float> neckGenetics = getGenetics(e);
        float pitch;
        // Neck Curves: 1 = Swan, 2 = Straight, 3 = Ewed, 4 = Arched
        switch (neckCurve) {
            case "swan" -> {
                switch (Math.round(neckGenetics.get("NECK_POS"))) {
                    case 1 -> pitch = -25.0F;
                    case 2 -> pitch = -34.0F;
                    case 3 -> pitch = -33.0F;
                    default -> pitch = 0.0F;
                }
            }
            case "straight" -> {
                switch (Math.round(neckGenetics.get("NECK_POS"))) {
                    case 1 -> pitch = -25.0F;
                    case 2 -> pitch = -30.0F;
                    case 3 -> pitch = -35.0F;
                    default -> pitch = 0.0F;
                }
            }
            case "ewed" -> {
                switch (Math.round(neckGenetics.get("NECK_POS"))) {
                    case 1 -> pitch = -30.0F;
                    case 2 -> pitch = -25.0F;
                    case 3 -> pitch = -30.0F;
                    default -> pitch = 0.0F;
                }
            }

            case "arched" -> {
                switch (Math.round(neckGenetics.get("NECK_POS"))) {
                    case 1 -> pitch = -100.0F; // Roughly adjusted, need to test w/ varying lengths.
                    case 2 -> pitch = -25.0F; // Roughly adjusted, need to test w/ varying lengths.
                    case 3 -> pitch = 50.0F; // Roughly adjusted, need to test w/ varying lengths.
                    default -> pitch = 0.0F;
                }
                // minus the neck rotation here
            }
            default -> pitch = 0;
        }
//        return pitch / 180;
        return pitch = 0;
    }


    public float getNetYaw(GeneticHorseEntity e, float partialTicks) {
        float bodyYaw = net.minecraft.util.Mth.rotLerp(partialTicks, e.yBodyRotO, e.yBodyRot);
        float headYaw = net.minecraft.util.Mth.rotLerp(partialTicks, e.yHeadRotO, e.getYHeadRot());
        float netYaw = net.minecraft.util.Mth.clamp(headYaw - bodyYaw, -45f, 45f);

        return netYaw * ((float) Math.PI / 180f);
    }
}
