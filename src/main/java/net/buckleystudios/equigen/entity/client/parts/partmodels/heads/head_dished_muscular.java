package net.buckleystudios.equigen.entity.client.parts.partmodels.heads;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartHeadModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class head_dished_muscular extends MultipartHeadModel<GeneticHorseEntity> {
	private final ModelPart head_dished_muscular;

	public head_dished_muscular(ModelPart root) {
		this.head_dished_muscular = root.getChild("head_dished_muscular");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head_dished_muscular = partdefinition.addOrReplaceChild("head_dished_muscular", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head_dished_muscular_jaw = head_dished_muscular.addOrReplaceChild("head_dished_muscular_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 1.9665F, -0.1788F));

		PartDefinition head_dished_muscular_jaw_individual = head_dished_muscular_jaw.addOrReplaceChild("head_dished_muscular_jaw_individual", CubeListBuilder.create(), PartPose.offset(-0.0995F, -0.1382F, -0.2329F));

		PartDefinition cube_r1 = head_dished_muscular_jaw_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(984, 118).addBox(-3.9554F, -0.7109F, -1.1891F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9554F, 0.0154F, -1.1314F, 0.7854F, 0.0F, 0.0F));

		PartDefinition head_dished_muscular_jaw_branch = head_dished_muscular_jaw.addOrReplaceChild("head_dished_muscular_jaw_branch", CubeListBuilder.create(), PartPose.offset(-0.0754F, 1.5639F, -1.4318F));

		PartDefinition cube_r2 = head_dished_muscular_jaw_branch.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1004, 111).addBox(-3.0799F, -3.2418F, -1.8382F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0799F, -1.1189F, 0.0295F, 2.2689F, 0.0F, 0.0F));

		PartDefinition head_dished_muscular_nose_bridge = head_dished_muscular.addOrReplaceChild("head_dished_muscular_nose_bridge", CubeListBuilder.create(), PartPose.offset(-0.0738F, 1.8254F, -2.0902F));

		PartDefinition cube_r3 = head_dished_muscular_nose_bridge.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(988, 110).addBox(-3.08F, -3.24F, -1.84F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.08F, -0.8028F, -0.1369F, 2.8798F, 0.0F, 0.0F));

		PartDefinition head_dished_muscular_forehead = head_dished_muscular.addOrReplaceChild("head_dished_muscular_forehead", CubeListBuilder.create(), PartPose.offset(-0.057F, -0.4084F, -1.4273F));

		PartDefinition cube_r4 = head_dished_muscular_forehead.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1004, 118).addBox(-3.08F, -4.0F, -1.92F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.08F, -1.7583F, 1.0415F, 2.3998F, 0.0F, 0.0F));

		PartDefinition head_dished_muscular_muzzle = head_dished_muscular.addOrReplaceChild("head_dished_muscular_muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 4.4693F, -3.1821F));

		PartDefinition head_dished_muscular_muzzle_individual = head_dished_muscular_muzzle.addOrReplaceChild("head_dished_muscular_muzzle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = head_dished_muscular_muzzle_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(989, 125).addBox(-1.4469F, -0.7862F, -2.7184F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0628F, -0.7151F, 0.104F, 0.7418F, 0.0F, 0.0F));

		PartDefinition head_dished_muscular_mouth = head_dished_muscular_muzzle.addOrReplaceChild("head_dished_muscular_mouth", CubeListBuilder.create(), PartPose.offset(0.0894F, 0.8045F, 0.5363F));

		PartDefinition cube_r6 = head_dished_muscular_mouth.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(1004, 125).addBox(-1.9934F, -0.6134F, -2.1275F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3802F, -0.0885F, 0.1915F, 0.7854F, 0.0F, 0.0F));

		PartDefinition head_dished_muscular_fringe = head_dished_muscular.addOrReplaceChild("head_dished_muscular_fringe", CubeListBuilder.create(), PartPose.offset(0.0F, -2.6816F, -1.2514F));

		PartDefinition cube_r7 = head_dished_muscular_fringe.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(1006, 107).addBox(-3.08F, -3.0F, 0.08F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5425F, -0.0215F, 0.4187F, 2.3998F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		head_dished_muscular.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return head_dished_muscular;
    }


}