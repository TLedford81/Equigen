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

public class head_straight_average extends MultipartHeadModel<GeneticHorseEntity> {
	private final ModelPart head_straight_average;
	private final ModelPart neckAnchor;
	private final ModelPart leftEarAnchor;
	private final ModelPart rightEarAnchor;

	public head_straight_average(ModelPart root) {
		this.head_straight_average = root.getChild("head_straight_average");
		this.neckAnchor = this.head_straight_average.getChild("neckAnchor");
		this.leftEarAnchor = this.head_straight_average.getChild("leftEarAnchor");
		this.rightEarAnchor = this.head_straight_average.getChild("rightEarAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head_straight_average = partdefinition.addOrReplaceChild("head_straight_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head_straight_average_forehead = head_straight_average.addOrReplaceChild("head_straight_average_forehead", CubeListBuilder.create(), PartPose.offset(0.0F, -1.1523F, -1.8773F));

		PartDefinition cube_r1 = head_straight_average_forehead.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(880, 80).addBox(-3.08F, -4.0F, -1.92F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.517F, -1.5507F, 1.331F, 2.2253F, 0.0F, 0.0F));

		PartDefinition head_straight_average_nose_bridge = head_straight_average.addOrReplaceChild("head_straight_average_nose_bridge", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0976F, -2.9967F));

		PartDefinition cube_r2 = head_straight_average_nose_bridge.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(866, 80).addBox(-3.08F, -3.24F, -1.84F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9639F, -0.4158F, -0.0166F, 2.2253F, 0.0F, 0.0F));

		PartDefinition head_straight_average_jaw = head_straight_average.addOrReplaceChild("head_straight_average_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 1.8771F, -2.2346F));

		PartDefinition head_jaw_individual = head_straight_average_jaw.addOrReplaceChild("head_jaw_individual", CubeListBuilder.create(), PartPose.offset(-0.1362F, -0.1038F, 0.4465F));

		PartDefinition cube_r3 = head_jaw_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(864, 73).addBox(-3.9595F, -1.919F, -2.081F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4595F, 0.366F, 0.2194F, 0.3491F, 0.0F, 0.0F));

		PartDefinition head_jaw_branch = head_straight_average_jaw.addOrReplaceChild("head_jaw_branch", CubeListBuilder.create(), PartPose.offset(-0.0928F, -0.0246F, 0.1157F));

		PartDefinition cube_r4 = head_jaw_branch.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(882, 71).addBox(-3.0708F, -3.2124F, -1.8584F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0708F, -0.4012F, 0.1124F, 1.8326F, 0.0F, 0.0F));

		PartDefinition head_straight_average_fringe = head_straight_average.addOrReplaceChild("head_straight_average_fringe", CubeListBuilder.create(), PartPose.offset(0.0F, -3.2179F, -1.2514F));

		PartDefinition cube_r5 = head_straight_average_fringe.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(877, 87).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4312F, 0.3218F, -1.8441F, -1.5333F, 0.6643F, -1.5315F));

		PartDefinition head_straight_average_muzzle = head_straight_average.addOrReplaceChild("head_straight_average_muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 2.324F, -4.648F));

		PartDefinition head_straight_average_muzzle_individual = head_straight_average_muzzle.addOrReplaceChild("head_straight_average_muzzle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r6 = head_straight_average_muzzle_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(885, 87).addBox(-1.4469F, -1.7862F, -3.7184F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1945F, -0.8044F, 0.2117F, 0.7418F, 0.0F, 0.0F));

		PartDefinition head_straight_average_mouth = head_straight_average_muzzle.addOrReplaceChild("head_straight_average_mouth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9832F, 0.0894F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r7 = head_straight_average_mouth.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(883, 67).addBox(-1.9832F, -0.6095F, -3.149F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4312F, -0.28F, 0.6617F, 0.7854F, 0.0F, 0.0F));

		PartDefinition neckAnchor = head_straight_average.addOrReplaceChild("neckAnchor", CubeListBuilder.create(), PartPose.offset(-0.25F, -2.3827F, -1.1739F));

		PartDefinition cube_r8 = neckAnchor.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 0.0F));

		PartDefinition leftEarAnchor = head_straight_average.addOrReplaceChild("leftEarAnchor", CubeListBuilder.create(), PartPose.offset(-1.55F, -3.3477F, -1.5621F));

		PartDefinition cube_r9 = leftEarAnchor.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0977F, 0.2121F, 0.6545F, 0.0F, 0.0F));

		PartDefinition rightEarAnchor = head_straight_average.addOrReplaceChild("rightEarAnchor", CubeListBuilder.create(), PartPose.offset(1.45F, -3.3477F, -1.5621F));

		PartDefinition cube_r10 = rightEarAnchor.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0977F, 0.2121F, 0.6545F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		head_straight_average.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return head_straight_average;
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
		this.root().xRot = getPitch(e, "straight");
	}

}