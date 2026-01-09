package net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart;

import com.mojang.blaze3d.vertex.PoseStack;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.util.Mth;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import org.joml.Vector3f;

import java.util.List;
import java.util.Map;

@OnlyIn(Dist.CLIENT)
public abstract class MultipartHeadModel <E extends GeneticHorseEntity> extends MultipartModel<GeneticHorseEntity> {

    float var = 0;
    public Map<String, Float> getGenetics(GeneticHorseEntity entity){
        return entity.getRenderGenetics();
    }

    @Override
    public void afterAttached(GeneticHorseEntity e, PoseStack pose, float partialTicks) {
//        PartTransform parentAnchor = this.getAnchorForParent();
//        var += 1F;
//        pose.rotateAround(Axis.YP.rotationDegrees(var),
//                (float) parentAnchor.position.x,
//                (float) parentAnchor.position.y,
//                (float) parentAnchor.position.z);
    }

    @Override
    public Vector3f getBaseRotation(GeneticHorseEntity e) {
        String targetPart = "";
        Map<String, Float> neckGenetics = getGenetics(e);
        List<String> partsToRender = e.getPartsToRender();
        for(String part : partsToRender){
            if(part.startsWith("head")){
                targetPart = part.substring(5);
            }
        }
        float pitch;
        // Neck Curves: 1 = Swan, 2 = Straight, 3 = Ewed, 4 = Arched
        if (targetPart.startsWith("dished")) {
            switch (Math.round(neckGenetics.get("NECK_CURVE"))) {
                case 1 -> pitch = -20.0F; // Roughly adjusted, need to test w/ varying lengths.
                case 2 -> pitch = -29.0F; // Roughly adjusted, need to test w/ varying lengths.
                case 3 -> pitch = -28.0F; // Roughly adjusted, need to test w/ varying lengths.
                case 4 -> pitch = -25.0F; // Roughly adjusted, need to test w/ varying lengths.
                default -> pitch = 0.0F;
            }
            // minus the neck rotation here
        } else if (targetPart.startsWith("roman")) {
            switch (Math.round(neckGenetics.get("NECK_CURVE"))) {
                case 1 -> pitch = -20.0F; // Roughly adjusted, need to test w/ varying lengths.
                case 2 -> pitch = -25.0F; // Roughly adjusted, need to test w/ varying lengths.
                case 3 -> pitch = -30.0F; // Roughly adjusted, need to test w/ varying lengths.
                case 4 -> pitch = -20.0F; // Roughly adjusted, need to test w/ varying lengths.
                default -> pitch = 0.0F;
            }
            // minus the neck rotation here
        } else if (targetPart.startsWith("stocky")) {
            switch (Math.round(neckGenetics.get("NECK_CURVE"))) {
                case 1 -> pitch = -25.0F; // Roughly adjusted, need to test w/ varying lengths.
                case 2 -> pitch = -20.0F; // Roughly adjusted, need to test w/ varying lengths.
                case 3 -> pitch = -25.0F; // Roughly adjusted, need to test w/ varying lengths.
                case 4 -> pitch = -20.0F; // Roughly adjusted, need to test w/ varying lengths.
                default -> pitch = 0.0F;
            }
            // minus the neck rotation here
        } else if (targetPart.startsWith("straight")) {
            switch (Math.round(neckGenetics.get("NECK_CURVE"))) {
                case 1 -> pitch = -13.0F; // Roughly adjusted, need to test w/ varying lengths.
                case 2 -> pitch = -10.0F; // Roughly adjusted, need to test w/ varying lengths.
                case 3 -> pitch = -15.0F; // Roughly adjusted, need to test w/ varying lengths.
                case 4 -> pitch = -5.0F; // Roughly adjusted, need to test w/ varying lengths.
                default -> pitch = 0.0F;
            }
            // minus the neck rotation here
        } else {
            pitch = 0;
        }


//        pitch = pitch * ((float)Math.PI / 180f);
//        EquigenMod.LOGGER.info("Pitch {}", pitch);
        return new Vector3f(pitch, 0, 0);
//        return pitch = 0;
    }

    public float getNetYaw(GeneticHorseEntity e, float partialTicks) {
        float bodyYaw = Mth.rotLerp(partialTicks, e.yBodyRotO, e.yBodyRot);
        float headYaw = Mth.rotLerp(partialTicks, e.yHeadRotO, e.getYHeadRot());
        float netYaw = Mth.clamp(headYaw - bodyYaw, -45f, 45f);

        return netYaw * ((float)Math.PI / 180f);
    }
}
