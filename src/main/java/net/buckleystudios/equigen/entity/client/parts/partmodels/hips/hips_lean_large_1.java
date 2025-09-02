package net.buckleystudios.equigen.entity.client.parts.partmodels.hips;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartHipModel;
import net.buckleystudios.equigen.entity.client.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class hips_lean_large_1 extends MultipartHipModel<GeneticHorseEntity> {
	private final ModelPart hips_lean_large_1;
	private final ModelPart backAnchor;
	private final ModelPart tailAnchor;
	private final ModelPart backLeftLegAnchor;
	private final ModelPart backRightLegAnchor;

	public hips_lean_large_1(ModelPart root) {
		this.hips_lean_large_1 = root.getChild("hips_lean_large_1");
		this.backAnchor = this.hips_lean_large_1.getChild("backAnchor");
		this.tailAnchor = this.hips_lean_large_1.getChild("tailAnchor");
		this.backLeftLegAnchor = this.hips_lean_large_1.getChild("backLeftLegAnchor");
		this.backRightLegAnchor = this.hips_lean_large_1.getChild("backRightLegAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hips_lean_large_1 = partdefinition.addOrReplaceChild("hips_lean_large_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips_lean_large_1_left_hip = hips_lean_large_1.addOrReplaceChild("hips_lean_large_1_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_lean_large_1_left_hip_glute_base = hips_lean_large_1_left_hip.addOrReplaceChild("hips_lean_large_1_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.3575F, 0.0F, -0.3575F));

		PartDefinition hips_lean_large_1_left_hip_glute_base_individual = hips_lean_large_1_left_hip_glute_base.addOrReplaceChild("hips_lean_large_1_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(238, 879).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.1453F, 0.2123F, -0.2325F));

		PartDefinition hips_lean_large_1_left_hip_glute_outer = hips_lean_large_1_left_hip_glute_base.addOrReplaceChild("hips_lean_large_1_left_hip_glute_outer", CubeListBuilder.create().texOffs(219, 896).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(1.6089F, 0.1955F, -0.3387F));

		PartDefinition hips_lean_large_1_right_hip = hips_lean_large_1.addOrReplaceChild("hips_lean_large_1_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_lean_large_1_right_hip_glute_base = hips_lean_large_1_right_hip.addOrReplaceChild("hips_lean_large_1_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.3575F, 0.0F, -0.3575F));

		PartDefinition hips_lean_large_1_right_hip_glue_base_individual = hips_lean_large_1_right_hip_glute_base.addOrReplaceChild("hips_lean_large_1_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(214, 880).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8692F, 0.1736F, -0.1854F));

		PartDefinition hips_lean_large_1_right_hip_glue_outer = hips_lean_large_1_right_hip_glute_base.addOrReplaceChild("hips_lean_large_1_right_hip_glue_outer", CubeListBuilder.create().texOffs(239, 895).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.3911F, 0.1955F, -0.3387F));

		PartDefinition hips_lean_large_1_hips_top = hips_lean_large_1.addOrReplaceChild("hips_lean_large_1_hips_top", CubeListBuilder.create(), PartPose.offset(0.3575F, 0.5363F, 0.2682F));

		PartDefinition hips_lean_large_1_hips_top_upper = hips_lean_large_1_hips_top.addOrReplaceChild("hips_lean_large_1_hips_top_upper", CubeListBuilder.create(), PartPose.offset(-0.2959F, -1.034F, 0.371F));

		PartDefinition cube_r1 = hips_lean_large_1_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(215, 908).addBox(-4.08F, -4.24F, -7.36F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.3912F, 3.2541F, 1.2217F, 0.0F, 0.0F));

		PartDefinition hips_lean_large_1_hips_top_lower = hips_lean_large_1_hips_top.addOrReplaceChild("hips_lean_large_1_hips_top_lower", CubeListBuilder.create(), PartPose.offset(-0.2959F, -0.4161F, 0.3939F));

		PartDefinition cube_r2 = hips_lean_large_1_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(239, 907).addBox(-5.08F, -4.24F, -7.36F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.5622F, 2.7842F, 1.2217F, 0.0F, 0.0F));

		PartDefinition backAnchor = hips_lean_large_1.addOrReplaceChild("backAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.5F, 0.25F));

		PartDefinition tailAnchor = hips_lean_large_1.addOrReplaceChild("tailAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.75F, 3.5F));

		PartDefinition backLeftLegAnchor = hips_lean_large_1.addOrReplaceChild("backLeftLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.75F, 4.0F, 1.0F));

		PartDefinition backRightLegAnchor = hips_lean_large_1.addOrReplaceChild("backRightLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.75F, 4.0F, 1.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		hips_lean_large_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return hips_lean_large_1;
    }

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"backAnchor", asTransform(backAnchor),
				"tailAnchor", asTransform(tailAnchor),
				"backLeftLegAnchor", asTransform(backLeftLegAnchor),
				"backRightLegAnchor", asTransform(backRightLegAnchor)
		);
	}

}