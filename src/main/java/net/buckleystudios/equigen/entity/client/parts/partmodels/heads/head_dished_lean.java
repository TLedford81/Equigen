package net.buckleystudios.equigen.entity.client.parts.partmodels.heads;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartHeadModel;
import net.buckleystudios.equigen.entity.client.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class head_dished_lean extends MultipartHeadModel<GeneticHorseEntity> {
	private final ModelPart head_dished_lean;
	private final ModelPart neckAnchor;
	private final ModelPart leftEarAnchor;
	private final ModelPart rightEarAnchor;

	public head_dished_lean(ModelPart root) {
		this.head_dished_lean = root.getChild("head_dished_lean");
		this.neckAnchor = this.head_dished_lean.getChild("neckAnchor");
		this.leftEarAnchor = this.head_dished_lean.getChild("leftEarAnchor");
		this.rightEarAnchor = this.head_dished_lean.getChild("rightEarAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head_dished_lean = partdefinition.addOrReplaceChild("head_dished_lean", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head_dished_lean_jaw = head_dished_lean.addOrReplaceChild("head_dished_lean_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5195F, -0.2682F));

		PartDefinition head_dished_lean_jaw_individual = head_dished_lean_jaw.addOrReplaceChild("head_dished_lean_jaw_individual", CubeListBuilder.create(), PartPose.offset(-0.1163F, 0.3088F, -0.1435F));

		PartDefinition cube_r1 = head_dished_lean_jaw_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(989, 47).addBox(-3.9554F, -0.7109F, -1.1891F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9554F, 0.0154F, -1.1314F, 0.7854F, 0.0F, 0.0F));

		PartDefinition head_dished_lean_jaw_branch = head_dished_lean_jaw.addOrReplaceChild("head_dished_lean_jaw_branch", CubeListBuilder.create(), PartPose.offset(-0.1285F, 2.0109F, -1.3424F));

		PartDefinition cube_r2 = head_dished_lean_jaw_branch.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1007, 40).addBox(-3.0799F, -3.2418F, -1.8382F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5799F, -1.1189F, 0.0295F, 2.2689F, 0.0F, 0.0F));

		PartDefinition head_dished_lean_nose_bridge = head_dished_lean.addOrReplaceChild("head_dished_lean_nose_bridge", CubeListBuilder.create(), PartPose.offset(-0.1269F, 1.8254F, -2.0903F));

		PartDefinition cube_r3 = head_dished_lean_nose_bridge.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(991, 39).addBox(-3.08F, -3.24F, -1.84F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -0.8028F, -0.1369F, 2.8798F, 0.0F, 0.0F));

		PartDefinition head_dished_lean_forehead = head_dished_lean.addOrReplaceChild("head_dished_lean_forehead", CubeListBuilder.create(), PartPose.offset(-0.0738F, -0.4084F, -1.4273F));

		PartDefinition cube_r4 = head_dished_lean_forehead.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1005, 47).addBox(-3.08F, -4.0F, -1.92F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.08F, -1.7583F, 1.0415F, 2.3998F, 0.0F, 0.0F));

		PartDefinition head_dished_lean_muzzle = head_dished_lean.addOrReplaceChild("head_dished_lean_muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 4.5587F, -3.2179F));

		PartDefinition head_dished_lean_muzzle_individual = head_dished_lean_muzzle.addOrReplaceChild("head_dished_lean_muzzle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = head_dished_lean_muzzle_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(992, 54).addBox(-1.4469F, -0.7862F, -2.7184F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1522F, -0.7151F, 0.1041F, 0.7418F, 0.0F, 0.0F));

		PartDefinition head_dished_lean_mouth = head_dished_lean_muzzle.addOrReplaceChild("head_dished_lean_mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8045F, 0.6078F));

		PartDefinition cube_r6 = head_dished_lean_mouth.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(1007, 54).addBox(-1.9934F, -0.6134F, -2.1275F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3802F, -0.0885F, 0.1915F, 0.7854F, 0.0F, 0.0F));

		PartDefinition head_dished_lean_fringe = head_dished_lean.addOrReplaceChild("head_dished_lean_fringe", CubeListBuilder.create(), PartPose.offset(0.0F, -2.6816F, -1.3408F));

		PartDefinition cube_r7 = head_dished_lean_fringe.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(1009, 36).addBox(-3.08F, -3.0F, 0.08F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9894F, -0.0215F, 0.4187F, 2.3998F, 0.0F, 0.0F));

		PartDefinition neckAnchor = head_dished_lean.addOrReplaceChild("neckAnchor", CubeListBuilder.create(), PartPose.offset(0.0F, -1.25F, -0.366F));

		PartDefinition cube_r8 = neckAnchor.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.1F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 0.25F, 0.866F, 1.6581F, 0.0F, 0.0F));

		PartDefinition leftEarAnchor = head_dished_lean.addOrReplaceChild("leftEarAnchor", CubeListBuilder.create(), PartPose.offset(-1.0F, -2.5442F, -1.3995F));

		PartDefinition cube_r9 = leftEarAnchor.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0442F, 0.3995F, 0.829F, 0.0F, 0.0F));

		PartDefinition rightEarAnchor = head_dished_lean.addOrReplaceChild("rightEarAnchor", CubeListBuilder.create(), PartPose.offset(1.0F, -2.5442F, -1.3995F));

		PartDefinition cube_r10 = rightEarAnchor.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0442F, 0.3995F, 0.829F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		head_dished_lean.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return head_dished_lean;
    }

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"neckAnchor", asTransform(neckAnchor),
				"leftEarAnchor", asTransform(leftEarAnchor),
				"rightEarAnchor", asTransform(rightEarAnchor));
	}
}