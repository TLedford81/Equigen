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

public class hips_muscular_large_2 extends MultipartHipModel<GeneticHorseEntity> {
	private final ModelPart hips_muscular_large_2;
	private final ModelPart backAnchor;
	private final ModelPart tailAnchor;
	private final ModelPart backLeftLegAnchor;
	private final ModelPart backRightLegAnchor;

	public hips_muscular_large_2(ModelPart root) {
		this.hips_muscular_large_2 = root.getChild("hips_muscular_large_2");
		this.backAnchor = this.hips_muscular_large_2.getChild("backAnchor");
		this.tailAnchor = this.hips_muscular_large_2.getChild("tailAnchor");
		this.backLeftLegAnchor = this.hips_muscular_large_2.getChild("backLeftLegAnchor");
		this.backRightLegAnchor = this.hips_muscular_large_2.getChild("backRightLegAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hips_muscular_large_2 = partdefinition.addOrReplaceChild("hips_muscular_large_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -0.4469F));

		PartDefinition hips_muscular_large_2_left_hip = hips_muscular_large_2.addOrReplaceChild("hips_muscular_large_2_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_muscular_large_2_left_hip_glute_base = hips_muscular_large_2_left_hip.addOrReplaceChild("hips_muscular_large_2_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.6257F, 0.0F, 0.0F));

		PartDefinition hips_muscular_large_2_left_hip_glute_base_individual = hips_muscular_large_2_left_hip_glute_base.addOrReplaceChild("hips_muscular_large_2_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(272, 1004).addBox(-2.5F, -4.5F, -4.0F, 5.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6491F, -0.2413F, -0.1017F));

		PartDefinition hips_muscular_large_2_left_hip_glute_outer = hips_muscular_large_2_left_hip_glute_base.addOrReplaceChild("hips_muscular_large_2_left_hip_glute_outer", CubeListBuilder.create().texOffs(298, 1008).addBox(-2.5F, -3.5F, -3.0F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(3.1648F, -0.3045F, -0.0705F));

		PartDefinition hips_muscular_large_2_right_hip = hips_muscular_large_2.addOrReplaceChild("hips_muscular_large_2_right_hip", CubeListBuilder.create(), PartPose.offset(-0.6257F, 0.0F, 0.0F));

		PartDefinition hips_muscular_large_2_right_hip_glute_base = hips_muscular_large_2_right_hip.addOrReplaceChild("hips_muscular_large_2_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_muscular_large_2_right_hip_glue_base_individual = hips_muscular_large_2_right_hip_glute_base.addOrReplaceChild("hips_muscular_large_2_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(272, 987).addBox(-2.5F, -4.5F, -4.0F, 5.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.2989F, -0.1983F, -0.1431F));

		PartDefinition hips_muscular_large_2_right_hip_glue_outer = hips_muscular_large_2_right_hip_glute_base.addOrReplaceChild("hips_muscular_large_2_right_hip_glue_outer", CubeListBuilder.create().texOffs(298, 995).addBox(-2.5F, -3.5F, -3.0F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8352F, -0.3045F, -0.0705F));

		PartDefinition hips_muscular_large_2_hips_top = hips_muscular_large_2.addOrReplaceChild("hips_muscular_large_2_hips_top", CubeListBuilder.create(), PartPose.offset(-0.6257F, -1.4302F, 1.3408F));

		PartDefinition hips_muscular_large_2_hips_top_upper = hips_muscular_large_2_hips_top.addOrReplaceChild("hips_muscular_large_2_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.9025F, -0.1401F, -0.1653F));

		PartDefinition cube_r1 = hips_muscular_large_2_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(293, 983).addBox(-5.08F, -4.24F, -7.36F, 5.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.3912F, 3.2541F, 1.2217F, 0.0F, 0.0F));

		PartDefinition hips_muscular_large_2_hips_top_lower = hips_muscular_large_2_hips_top.addOrReplaceChild("hips_muscular_large_2_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.8131F, 0.5672F, -0.4105F));

		PartDefinition cube_r2 = hips_muscular_large_2_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(271, 974).addBox(-6.08F, -4.24F, -7.36F, 7.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.5623F, 2.7843F, 1.2217F, 0.0F, 0.0F));

		PartDefinition backAnchor = hips_muscular_large_2.addOrReplaceChild("backAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.5F, 0.4469F));

		PartDefinition tailAnchor = hips_muscular_large_2.addOrReplaceChild("tailAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.75F, 3.6969F));

		PartDefinition backLeftLegAnchor = hips_muscular_large_2.addOrReplaceChild("backLeftLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.75F, 4.0F, 1.4469F));

		PartDefinition backRightLegAnchor = hips_muscular_large_2.addOrReplaceChild("backRightLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.75F, 4.0F, 1.4469F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		hips_muscular_large_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return hips_muscular_large_2;
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