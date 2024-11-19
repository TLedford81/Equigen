package net.buckleystudios.equigen.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.custom.TestEntityEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;

public class TestEntityModel extends HierarchicalModel<TestEntityEntity> {
    private final ModelPart main;
    private final ModelPart head;

    public TestEntityModel(ModelPart root) {
        this.main = root.getChild("main");
        this.head = main.getChild("body").getChild("head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -11.8101F, -6.0F, 12.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition body_connectors = body.addOrReplaceChild("body_connectors", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition body_connector_left_back = body_connectors.addOrReplaceChild("body_connector_left_back", CubeListBuilder.create().texOffs(32, 34).addBox(3.648F, -5.8436F, 3.8268F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition body_connector_left_front = body_connectors.addOrReplaceChild("body_connector_left_front", CubeListBuilder.create().texOffs(34, 28).addBox(3.648F, -5.8436F, -5.4693F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition body_connector_right_front = body_connectors.addOrReplaceChild("body_connector_right_front", CubeListBuilder.create().texOffs(40, 32).addBox(-5.4693F, -5.8436F, -5.4693F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition body_connector_right_back = body_connectors.addOrReplaceChild("body_connector_right_back", CubeListBuilder.create().texOffs(24, 39).addBox(-5.4693F, -5.8436F, 3.7374F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 18).addBox(-3.7151F, -17.6201F, -10.6313F, 7.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition legs = body.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition legs_long = legs.addOrReplaceChild("legs_long", CubeListBuilder.create().texOffs(26, 26).addBox(-5.4693F, -6.0F, 3.7374F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 30).addBox(-5.4693F, -6.0F, -5.4693F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(8, 30).addBox(3.648F, -6.0F, -5.4693F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(26, 18).addBox(3.648F, -6.0F, 3.8268F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition legs_long_connectors = legs_long.addOrReplaceChild("legs_long_connectors", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition legs_long_connector_right_front = legs_long_connectors.addOrReplaceChild("legs_long_connector_right_front", CubeListBuilder.create().texOffs(40, 36).addBox(-5.4693F, -5.8436F, -5.4693F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition legs_long_connector_right_back = legs_long_connectors.addOrReplaceChild("legs_long_connector_right_back", CubeListBuilder.create().texOffs(40, 40).addBox(-5.4693F, -5.8436F, 3.7374F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition legs_long_connector_left_front = legs_long_connectors.addOrReplaceChild("legs_long_connector_left_front", CubeListBuilder.create().texOffs(0, 38).addBox(3.648F, -5.8436F, -5.4693F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition legs_long_connector_left_back = legs_long_connectors.addOrReplaceChild("legs_long_connector_left_back", CubeListBuilder.create().texOffs(16, 35).addBox(3.648F, -5.8436F, 3.8268F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition legs_short = legs.addOrReplaceChild("legs_short", CubeListBuilder.create().texOffs(34, 18).addBox(-5.4693F, -3.0F, 3.7374F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(34, 23).addBox(-5.4693F, -3.0F, -5.4693F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(24, 34).addBox(3.648F, -3.0F, -5.4693F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(16, 30).addBox(3.648F, -3.0F, 3.8268F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition legs_short_connectors = legs_short.addOrReplaceChild("legs_short_connectors", CubeListBuilder.create(), PartPose.offset(0.0F, 2.7709F, 0.0F));

        PartDefinition legs_short_connector_right_front = legs_short_connectors.addOrReplaceChild("legs_short_connector_right_front", CubeListBuilder.create().texOffs(16, 39).addBox(-5.4693F, -5.8436F, -5.4693F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition legs_short_connector_right_back = legs_short_connectors.addOrReplaceChild("legs_short_connector_right_back", CubeListBuilder.create().texOffs(0, 42).addBox(-5.4693F, -5.8436F, 3.7374F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition legs_short_connector_left_front = legs_short_connectors.addOrReplaceChild("legs_short_connector_left_front", CubeListBuilder.create().texOffs(8, 38).addBox(3.648F, -5.8436F, -5.4693F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition legs_short_connector_left_back = legs_short_connectors.addOrReplaceChild("legs_short_connector_left_back", CubeListBuilder.create().texOffs(32, 38).addBox(3.648F, -5.8436F, 3.8268F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }


    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        main.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }

    @Override
    public ModelPart root() {
        return main;
    }

    @Override
    public void setupAnim(TestEntityEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        applyHeadRotation(netHeadYaw, headPitch);

        this.animateWalk(TestEntityAnimations.walking, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.animate(entity.idleAnimationState, TestEntityAnimations.idle, ageInTicks, 1);
    }

    private void applyHeadRotation(float headYaw, float headPitch) {
        headYaw = Mth.clamp(headYaw, -30f, 30f);
        headPitch = Mth.clamp(headPitch, -25f, 45f);
        this.head.yRot = headYaw * ((float) Mth.PI / 180f);
        this.head.xRot = headPitch * ((float) Mth.PI / 180f);
    }
}
