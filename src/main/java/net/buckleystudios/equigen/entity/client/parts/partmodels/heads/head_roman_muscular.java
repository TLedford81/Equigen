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

public class head_roman_muscular extends MultipartHeadModel<GeneticHorseEntity> {
	private final ModelPart head_roman_muscular;
	private final ModelPart neckAnchor;
	private final ModelPart leftEarAnchor;
	private final ModelPart rightEarAnchor;

	public head_roman_muscular(ModelPart root) {
		this.head_roman_muscular = root.getChild("head_roman_muscular");
		this.neckAnchor = this.head_roman_muscular.getChild("neckAnchor");
		this.leftEarAnchor = this.head_roman_muscular.getChild("leftEarAnchor");
		this.rightEarAnchor = this.head_roman_muscular.getChild("rightEarAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head_roman_muscular = partdefinition.addOrReplaceChild("head_roman_muscular", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head_roman_muscular_jaw = head_roman_muscular.addOrReplaceChild("head_roman_muscular_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 2.6816F, -0.7151F));

		PartDefinition head_jaw_individual = head_roman_muscular_jaw.addOrReplaceChild("head_jaw_individual", CubeListBuilder.create(), PartPose.offset(0.0F, -0.3084F, 0.1442F));

		PartDefinition cube_r1 = head_jaw_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(951, 109).addBox(-5.9595F, -1.919F, -1.081F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0639F, 1.1962F, -0.8707F, 0.6545F, 0.0F, 0.0F));

		PartDefinition head_jaw_branch = head_roman_muscular_jaw.addOrReplaceChild("head_jaw_branch", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2088F, -0.3814F));

		PartDefinition cube_r2 = head_jaw_branch.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(951, 124).addBox(-2.08F, -3.24F, -1.84F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2017F, -0.4162F, 0.0016F, 2.1817F, 0.0F, 0.0F));

		PartDefinition head_roman_muscular_nose_bridge = head_roman_muscular.addOrReplaceChild("head_roman_muscular_nose_bridge", CubeListBuilder.create(), PartPose.offset(0.105F, 2.8086F, -4.1795F));

		PartDefinition cube_r3 = head_roman_muscular_nose_bridge.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(965, 124).addBox(-3.08F, -3.24F, -1.84F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.08F, -0.8028F, -0.1369F, 2.8798F, 0.0F, 0.0F));

		PartDefinition head_roman_muscular_forehead = head_roman_muscular.addOrReplaceChild("head_roman_muscular_forehead", CubeListBuilder.create(), PartPose.offset(0.0967F, -0.0065F, -2.402F));

		PartDefinition cube_r4 = head_roman_muscular_forehead.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(951, 117).addBox(-4.0524F, -4.0F, -3.0076F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0524F, -2.4136F, 0.6689F, 2.2253F, 0.0F, 0.0F));

		PartDefinition head_roman_muscular_muzzle = head_roman_muscular.addOrReplaceChild("head_roman_muscular_muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 4.648F, -4.5587F));

		PartDefinition head_roman_muscular_muzzle_individual = head_roman_muscular_muzzle.addOrReplaceChild("head_roman_muscular_muzzle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = head_roman_muscular_muzzle_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(969, 117).addBox(-2.4469F, -1.7862F, -3.7184F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9385F, -0.6534F, 0.7428F, 1.0036F, 0.0F, 0.0F));

		PartDefinition head_roman_muscular_mouth = head_roman_muscular_muzzle.addOrReplaceChild("head_roman_muscular_mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.6257F, 1.2514F));

		PartDefinition cube_r6 = head_roman_muscular_mouth.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(970, 110).addBox(-1.9832F, -0.6095F, -3.149F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4916F, 0.0616F, 0.564F, 0.9599F, 0.0F, 0.0F));

		PartDefinition head_roman_muscular_fringe = head_roman_muscular.addOrReplaceChild("head_roman_muscular_fringe", CubeListBuilder.create(), PartPose.offset(0.0F, -2.2346F, -1.5196F));

		PartDefinition cube_r7 = head_roman_muscular_fringe.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(963, 132).addBox(-1.0F, -4.0F, -2.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5628F, 1.5732F, -3.5941F, -1.5615F, 0.6653F, -1.5864F));

		PartDefinition neckAnchor = head_roman_muscular.addOrReplaceChild("neckAnchor", CubeListBuilder.create(), PartPose.offset(0.0F, -0.8283F, -1.4873F));

		PartDefinition cube_r8 = neckAnchor.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition leftEarAnchor = head_roman_muscular.addOrReplaceChild("leftEarAnchor", CubeListBuilder.create(), PartPose.offset(-1.75F, -2.0442F, -2.1495F));

		PartDefinition cube_r9 = leftEarAnchor.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0442F, 0.3995F, 0.6545F, 0.0F, 0.0F));

		PartDefinition rightEarAnchor = head_roman_muscular.addOrReplaceChild("rightEarAnchor", CubeListBuilder.create(), PartPose.offset(1.9F, -2.0442F, -2.1495F));

		PartDefinition cube_r10 = rightEarAnchor.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0442F, 0.3995F, 0.6545F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		head_roman_muscular.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return head_roman_muscular;
    }

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"neckAnchor", asTransform(neckAnchor),
				"leftEarAnchor", asTransform(leftEarAnchor),
				"rightEarAnchor", asTransform(rightEarAnchor));
	}

	@Override
	public void afterAttached(GeneticHorseEntity e, float partialTicks) {
		this.root().yRot = getNetYaw(e, partialTicks);
		this.root().xRot = getPitch(e, "roman");
	}

}