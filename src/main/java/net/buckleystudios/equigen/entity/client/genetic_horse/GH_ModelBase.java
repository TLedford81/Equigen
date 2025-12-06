package net.buckleystudios.equigen.entity.client.genetic_horse;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;

public class GH_ModelBase<T extends GeneticHorseEntity> extends HierarchicalModel<T> {

    public final ModelPart main;

    public GH_ModelBase(ModelPart root) {
        this.main = root.getChild("main");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2682F, 24.0F, 7.2696F, 0.0F, 1.5708F, 0.0F));

        return LayerDefinition.create(meshdefinition, 1024, 1024);
    }

    @Override
    public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        //SETUP ANIMATION
//        this.root().getAllParts().forEach(ModelPart::resetPose);
//        applyHeadRotation(netHeadYaw, headPitch);

//        this.animateWalk(GeneticHorseAnimations.GetAnimation("walking", entity), limbSwing, limbSwingAmount, 10f, 2.5f);
//        this.animateWalk(GeneticHorseAnimations.GetAnimation("galloping", entity), limbSwing, limbSwingAmount, 2f, 2.5f);
//        this.animate(entity.idleAnimationState, GeneticHorseAnimations.GetAnimation("idle", entity), ageInTicks, 1);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        main.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);

    }

    @Override
    public ModelPart root() {
        return main;
    }

    private void applyHeadRotation(float headYaw, float headPitch) {
        headYaw = Mth.clamp(headYaw, -30f, 30f);
        headPitch = Mth.clamp(headPitch, -25f, 45f);
    }
}
