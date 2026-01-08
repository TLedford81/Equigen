package net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart;

import com.mojang.blaze3d.vertex.PoseStack;
import net.buckleystudios.equigen.entity.client.genetic_horse.animations.GH_Animation;
import net.buckleystudios.equigen.entity.client.genetic_horse.animations.GH_GallopAnimation;
import net.buckleystudios.equigen.entity.client.genetic_horse.animations.GH_IdleAnimation;
import net.buckleystudios.equigen.entity.client.genetic_horse.animations.GH_WalkAnimation;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector3f;

import java.util.*;

public abstract class MultipartModel<E extends GeneticHorseEntity> extends HierarchicalModel<GeneticHorseEntity> {

    protected final Map<String, PartTransform> anchors = new HashMap<>();
    protected final Map<String, List<ModelPart>> anchorPaths = new HashMap<>();

    private boolean anchorPathsInitialized = false;

    protected void defineAnchorPaths() {
        // subclasses override
    }

    public Map<String, PartTransform> anchors() {
        return anchors;
    }

    @Deprecated
    public PartTransform getAnchorForParent(){
        return null;
    }

    private int legID = 0;
    public void setLegID(int legID){
        this.legID = legID;
    }

    @Override
    public void setupAnim(GeneticHorseEntity entity,
                          float limbSwing,
                          float limbSwingAmount,
                          float ageInTicks,
                          float netHeadYaw,
                          float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);

        int gait = entity.getCurrentGait();

        this.animate(entity.idleAnimationState,
                GH_IdleAnimation.animate(animationRoot(), this.legID),
                ageInTicks, 1);

        AnimationDefinition clip = switch (gait) {
            case 0 -> GH_WalkAnimation.animate(animationRoot(), this.legID);
//            case 1 -> GH_TrotAnimation.animate(animationRoot(), this.legID);
//            case 2 -> GH_CanterAnimation.animate(animationRoot(), this.legID);
            case 3 -> GH_GallopAnimation.animate(animationRoot(), this.legID);
            default -> GH_Animation.inanimate();
        };

        this.animateWalk(clip,
                limbSwing, limbSwingAmount,
                2f, 2.5f
        );

        if (!anchorPathsInitialized) {
            defineAnchorPaths();
            anchorPathsInitialized = true;
        }

        recomputeAnchors();
    }

    public abstract String animationRoot();

    protected void registerAnchorPath(String name, ModelPart... parts) {
        if (parts == null || parts.length == 0) {
            // optionally log here
            return;
        }
        anchorPaths.put(name, Arrays.asList(parts));
    }

    private void recomputeAnchors() {
        anchors.clear();
        for (Map.Entry<String, List<ModelPart>> entry : anchorPaths.entrySet()) {
            String name = entry.getKey();
            List<ModelPart> path = entry.getValue();
            if (!path.isEmpty()) {
                anchors.put(name, computeTransformForPath(path));
            }
        }
//        EquigenMod.LOGGER.debug("Anchors for {}: {}", this.getClass().getSimpleName(), anchors.keySet());
    }

    private PartTransform computeTransformForPath(List<ModelPart> path) {
        PoseStack pose = new PoseStack();
        pose.pushPose();

        for (ModelPart part : path) {
            part.translateAndRotate(pose);
        }

        var matrix = pose.last().pose();

        float tx = matrix.m30();
        float ty = matrix.m31();
        float tz = matrix.m32();

        ModelPart target = path.get(path.size() - 1);

        PartTransform result = new PartTransform(
                new Vec3(tx, ty, tz),
                new Vec3(target.xRot, target.yRot, target.zRot),
                new Vec3(1.0, 1.0, 1.0)
        );

        pose.popPose();
        return result;
    }

    protected PartTransform asTransform(ModelPart part) {
        return new PartTransform(
                new Vec3(part.x / 16.0, part.y / 16.0, part.z / 16.0),
                new Vec3(Math.toRadians(part.xRot), Math.toRadians(part.yRot), Math.toRadians(part.zRot)),
                new Vec3(1, 1, 1)
        );
    }

    public Vector3f getBaseRotation(GeneticHorseEntity e) { return new Vector3f(0,0,0); }
    public void afterAttached(GeneticHorseEntity e, PoseStack pose, float partialTicks) { }
    public void beforeAttached(E entity, float partialTicks, PoseStack pose) { }
}
