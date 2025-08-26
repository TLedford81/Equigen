package net.buckleystudios.equigen.entity.client.parts.partmodels.backs;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class Back_3 extends HierarchicalModel<GeneticHorseEntity> {
    private final ModelPart body;
//    private final ModelPart head;

    public Back_3(ModelPart root) {

        this.body = root.getChild("pillager_king");

//        this.head = main.getChild("body").getChild("torso").getChild("chest").getChild("neck").getChild("head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition pillager_king = partdefinition.addOrReplaceChild("pillager_king", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2682F, 24.0F, 7.2696F, 0.0F, 1.5708F, 0.0F));

        PartDefinition torso = pillager_king.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -37.6704F, -11.0F, 11.0F, 13.0F, 21.0F, new CubeDeformation(0.0F))
                .texOffs(50, 20).addBox(-0.1061F, -25.3352F, -7.3575F, 10.0F, 9.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(0, 34).addBox(-0.0168F, -34.4749F, -10.6369F, 11.0F, 10.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition head = torso.addOrReplaceChild("head", CubeListBuilder.create().texOffs(41, 77).addBox(0.5363F, -11.5363F, -4.9877F, 9.0F, 11.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(8.0391F, -4.5698F, -1.5017F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -36.7374F, 0.0F));

        PartDefinition left_pec = torso.addOrReplaceChild("left_pec", CubeListBuilder.create().texOffs(54, 55).addBox(1.4134F, -6.0838F, -2.7933F, 11.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -29.3911F, 4.8268F));

        PartDefinition right_pec = torso.addOrReplaceChild("right_pec", CubeListBuilder.create().texOffs(0, 65).addBox(1.4134F, -9.8749F, -7.9441F, 11.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -25.6F, -4.7374F));

        PartDefinition right_leg = torso.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(1, 85).addBox(-5.8235F, 0.162F, -1.838F, 5.0F, 17.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(89, 77).addBox(-6.9128F, 0.162F, -2.7654F, 7.0F, 10.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(90, 77).addBox(-6.181F, 1.5363F, -3.9274F, 5.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(8.4022F, -17.162F, -4.5587F));

        PartDefinition left_leg = torso.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(91, 78).addBox(-2.3374F, -1.4469F, -0.352F, 5.0F, 17.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(89, 77).addBox(-3.3374F, -1.4469F, -0.352F, 7.0F, 10.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(90, 77).addBox(-2.6056F, -0.0726F, 0.6313F, 5.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(4.8268F, -15.5531F, 0.0F));

        PartDefinition right_arm = torso.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(100, 45).addBox(-3.6782F, -2.9665F, -3.7709F, 6.0F, 18.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(97, 43).addBox(-4.1419F, -1.6257F, -5.1453F, 7.0F, 10.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(98, 43).addBox(-3.1419F, -0.6257F, -6.3966F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(5.6313F, -32.0894F, -12.8715F));

        PartDefinition left_arm = torso.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(100, 45).addBox(-3.4101F, -1.7866F, 0.3408F, 6.0F, 18.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(97, 43).addBox(-3.8737F, -0.4458F, -0.0503F, 7.0F, 10.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(98, 43).addBox(-2.8737F, 0.5542F, 1.1117F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(5.3631F, -33.2693F, 11.6201F));

        return LayerDefinition.create(meshdefinition, 128, 128);

    }


    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        body.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }

    @Override
    public ModelPart root() {
        return body;
    }

    @Override
    public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
//        applyHeadRotation(netHeadYaw, headPitch);
    }

//    private void applyHeadRotation(float headYaw, float headPitch) {
//        headYaw = Mth.clamp(headYaw, -30f, 30f);
//        headPitch = Mth.clamp(headPitch, -25f, 45f);
//        this.head.yRot = headYaw * ((float) Mth.PI / 180f);
//        this.head.xRot = headPitch * ((float) Mth.PI / 180f);
//    }
}
