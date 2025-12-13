package net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart;

import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.util.Mth;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

import java.util.Map;

@OnlyIn(Dist.CLIENT)
public abstract class MultipartHeadModel <E extends GeneticHorseEntity> extends MultipartModel<GeneticHorseEntity> {

    public Map<String, Float> getGenetics(GeneticHorseEntity entity){
        return entity.getRenderGenetics();
    }

    public float getPitch(GeneticHorseEntity e, String headType) {
        Map<String, Float> neckGenetics = getGenetics(e);
        float pitch;
        // Neck Curves: 1 = Swan, 2 = Straight, 3 = Ewed, 4 = Arched
//        switch (headType) {
//            case "dished" -> {
//                switch (Math.round(neckGenetics.get("NECK_CURVE"))) {
//                    case 1 -> pitch = -25.0F; // Roughly adjusted, need to test w/ varying lengths.
//                    case 2 -> pitch = -34.0F; // Roughly adjusted, need to test w/ varying lengths.
//                    case 3 -> pitch = -33.0F; // Roughly adjusted, need to test w/ varying lengths.
//                    case 4 -> pitch = -30.0F; // Roughly adjusted, need to test w/ varying lengths.
//                    default -> pitch = 0.0F;
//                }
//                // minus the neck rotation here
//            }
//            case "roman" -> {
//                switch (Math.round(neckGenetics.get("NECK_CURVE"))) {
//                    case 1 -> pitch = -25.0F; // Roughly adjusted, need to test w/ varying lengths.
//                    case 2 -> pitch = -30.0F; // Roughly adjusted, need to test w/ varying lengths.
//                    case 3 -> pitch = -35.0F; // Roughly adjusted, need to test w/ varying lengths.
//                    case 4 -> pitch = -25.0F; // Roughly adjusted, need to test w/ varying lengths.
//                    default -> pitch = 0.0F;
//                }
//                // minus the neck rotation here
//            }
//            case "stocky" -> {
//                switch (Math.round(neckGenetics.get("NECK_CURVE"))) {
//                    case 1 -> pitch = -30.0F; // Roughly adjusted, need to test w/ varying lengths.
//                    case 2 -> pitch = -25.0F; // Roughly adjusted, need to test w/ varying lengths.
//                    case 3 -> pitch = -30.0F; // Roughly adjusted, need to test w/ varying lengths.
//                    case 4 -> pitch = -25.0F; // Roughly adjusted, need to test w/ varying lengths.
//                    default -> pitch = 0.0F;
//                }
//                // minus the neck rotation here
//            }
//
//            case "straight" -> {
//                switch (Math.round(neckGenetics.get("NECK_CURVE"))) {
//                    case 1 -> pitch = -18.0F; // Roughly adjusted, need to test w/ varying lengths.
//                    case 2 -> pitch = -15.0F; // Roughly adjusted, need to test w/ varying lengths.
//                    case 3 -> pitch = -20.0F; // Roughly adjusted, need to test w/ varying lengths.
//                    case 4 -> pitch = -10.0F; // Roughly adjusted, need to test w/ varying lengths.
//                    default -> pitch = 0.0F;
//                }
//                // minus the neck rotation here
//            }
//            default -> pitch = 0;
//        }


//        return pitch * ((float)Math.PI / 180f);
        return pitch = 0;
    }

    public float getNetYaw(GeneticHorseEntity e, float partialTicks) {
        float bodyYaw = Mth.rotLerp(partialTicks, e.yBodyRotO, e.yBodyRot);
        float headYaw = Mth.rotLerp(partialTicks, e.yHeadRotO, e.getYHeadRot());
        float netYaw = Mth.clamp(headYaw - bodyYaw, -45f, 45f);

        return netYaw * ((float)Math.PI / 180f);
    }
}
