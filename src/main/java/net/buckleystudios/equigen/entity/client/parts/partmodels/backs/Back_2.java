package net.buckleystudios.equigen.entity.client.parts.partmodels.backs;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class Back_2 extends HierarchicalModel<GeneticHorseEntity> {
    private final ModelPart body;
//    private final ModelPart head;

    public Back_2(ModelPart root) {

        this.body = root.getChild("body");

//        this.head = main.getChild("body").getChild("torso").getChild("chest").getChild("neck").getChild("head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0825F, 18.1899F, 0.3894F));

        PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 5).addBox(-1.4637F, -0.7654F, -0.7318F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-1.4492F, -1.526F, -1.5392F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0894F, -0.2682F, 0.1788F));

        PartDefinition tail = torso.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0894F, 0.0F, 1.2514F));

        PartDefinition cube_r1 = tail.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 21).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 18).addBox(-1.5363F, -3.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, 4.1117F, 0.9832F, 0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r2 = tail.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(10, 4).addBox(-0.99F, -3.01F, -1.01F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9184F, 0.5667F, 0.48F, 0.0F, 0.0F));

        PartDefinition neck = torso.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(0.0894F, 0.0F, -1.2514F));

        PartDefinition cube_r3 = neck.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(18, 18).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3575F, 0.5363F, 0.2182F, 0.0F, 0.0F));

        PartDefinition cube_r4 = neck.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 19).addBox(-1.01F, -1.0F, -0.99F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7975F, 0.0885F, -0.2182F, 0.0F, 0.0F));

        PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7709F, 0.0F, -0.0436F, 0.0F, 0.0F));

        PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(8, 10).addBox(-0.999F, -1.0F, -1.001F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0981F, -0.4548F, -0.1309F, 0.0F, 0.0F));

        PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(20, 13).addBox(-0.01F, -1.0F, -0.99F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7964F, 0.0728F, -0.8932F, -0.3491F, 0.0F, 0.0F));

        PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(12, 21).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1788F, 0.0733F, -0.9012F, -0.3491F, 0.0F, 0.0F));

        PartDefinition beak = head.addOrReplaceChild("beak", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2317F, -1.2588F, 0.0873F, 0.0F, 0.0F));

        PartDefinition upper_beak = beak.addOrReplaceChild("upper_beak", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.1788F));

        PartDefinition cube_r8 = upper_beak.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 10).addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5363F, 0.4112F, -0.8045F, 0.1309F, 0.0F, 0.0F));

        PartDefinition lower_beak = beak.addOrReplaceChild("lower_beak", CubeListBuilder.create(), PartPose.offset(0.0F, 0.4469F, -0.1788F));

        PartDefinition cube_r9 = lower_beak.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(10, 0).addBox(-0.01F, -1.0F, -1.98F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5309F, 0.323F, -0.4282F, 0.0436F, 0.0F, 0.0F));

        PartDefinition left_wing = torso.addOrReplaceChild("left_wing", CubeListBuilder.create().texOffs(8, 13).addBox(-0.066F, 0.014F, -0.9993F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(18, 3).addBox(-0.0894F, 0.5028F, -0.6425F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5196F, -1.162F, -0.1788F, 0.0F, 0.0F, -0.1745F));

        PartDefinition cube_r10 = left_wing.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(10, 8).addBox(-0.01F, 0.98F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 14).addBox(-0.01F, -2.01F, -0.99F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1028F, 4.143F, 0.6972F, 0.4363F, 0.0F, 0.0F));

        PartDefinition right_wing = torso.addOrReplaceChild("right_wing", CubeListBuilder.create().texOffs(14, 13).addBox(-0.8186F, -0.0217F, -0.9099F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(6, 18).addBox(-0.8045F, 0.467F, -0.5531F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5196F, -1.1263F, -0.2682F, 0.0F, 0.0F, 0.1745F));

        PartDefinition cube_r11 = right_wing.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(20, 16).addBox(-0.01F, 0.98F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 8).addBox(-0.01F, -2.01F, -0.99F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7803F, 4.1073F, 0.7866F, 0.4363F, 0.0F, 0.0F));

        PartDefinition legs = body.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition left_leg = legs.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.9832F, 2.1453F, 0.6257F));

        PartDefinition left_leg_top = left_leg.addOrReplaceChild("left_leg_top", CubeListBuilder.create().texOffs(0, 22).addBox(-0.6425F, -0.1564F, -0.5363F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0894F, -0.1788F, -0.0894F));

        PartDefinition left_leg_bottom = left_leg_top.addOrReplaceChild("left_leg_bottom", CubeListBuilder.create().texOffs(8, 23).addBox(-0.5531F, -0.1229F, -0.3397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0894F, 1.9665F, -0.1966F));

        PartDefinition left_foot = left_leg_bottom.addOrReplaceChild("left_foot", CubeListBuilder.create().texOffs(22, 21).addBox(-0.4637F, -0.0168F, -0.8939F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0894F, 0.8939F, 0.0179F));

        PartDefinition right_leg = legs.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-0.8045F, 1.9665F, 0.6257F));

        PartDefinition right_leg_top = right_leg.addOrReplaceChild("right_leg_top", CubeListBuilder.create().texOffs(22, 8).addBox(-0.5531F, -0.1564F, -0.6257F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition right_leg_bottom = right_leg_top.addOrReplaceChild("right_leg_bottom", CubeListBuilder.create().texOffs(4, 23).addBox(-0.5531F, -0.0335F, -0.6257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.8771F, 0.0F));

        PartDefinition right_foot = right_leg_bottom.addOrReplaceChild("right_foot", CubeListBuilder.create().texOffs(22, 11).addBox(-0.5531F, 0.162F, -0.8045F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0894F, 0.8045F, -0.3575F));

        return LayerDefinition.create(meshdefinition, 32, 32);
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
