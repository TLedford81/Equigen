package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.hips;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartHipModel;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class hips_lean_small_1 extends MultipartHipModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart hips_lean_small_1;
	private final ModelPart backAnchor;
	private final ModelPart tailAnchor;
	private final ModelPart backLeftLegAnchor;
	private final ModelPart backRightLegAnchor;

	public hips_lean_small_1(ModelPart root) {
		this.root = root;
		this.hips_lean_small_1 = root.getChild("hips_lean_small_1");
		this.backAnchor = this.hips_lean_small_1.getChild("backAnchor");
		this.tailAnchor = this.hips_lean_small_1.getChild("tailAnchor");
		this.backLeftLegAnchor = this.hips_lean_small_1.getChild("backLeftLegAnchor");
		this.backRightLegAnchor = this.hips_lean_small_1.getChild("backRightLegAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hips_lean_small_1 = partdefinition.addOrReplaceChild("hips_lean_small_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips_lean_small_1_left_hip = hips_lean_small_1.addOrReplaceChild("hips_lean_small_1_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_lean_small_1_left_hip_glute_base = hips_lean_small_1_left_hip.addOrReplaceChild("hips_lean_small_1_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.0894F, 0.0F, -0.8939F));

		PartDefinition hips_lean_small_1_left_hip_glute_base_individual = hips_lean_small_1_left_hip_glute_base.addOrReplaceChild("hips_lean_small_1_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(0, 909).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(1.6648F, -0.0391F, 0.2144F));

		PartDefinition hips_lean_small_1_left_hip_glute_outer = hips_lean_small_1_left_hip_glute_base.addOrReplaceChild("hips_lean_small_1_left_hip_glute_outer", CubeListBuilder.create().texOffs(20, 911).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.1117F, -0.0363F, 0.2339F));

		PartDefinition hips_lean_small_1_right_hip = hips_lean_small_1.addOrReplaceChild("hips_lean_small_1_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_lean_small_1_right_hip_glute_base = hips_lean_small_1_right_hip.addOrReplaceChild("hips_lean_small_1_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.0894F, 0.0F, -0.8939F));

		PartDefinition hips_lean_small_1_right_hip_glue_base_individual = hips_lean_small_1_right_hip_glute_base.addOrReplaceChild("hips_lean_small_1_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(0, 897).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.3418F, -0.0705F, 0.2333F));

		PartDefinition hips_lean_small_1_right_hip_glue_outer = hips_lean_small_1_right_hip_glute_base.addOrReplaceChild("hips_lean_small_1_right_hip_glue_outer", CubeListBuilder.create().texOffs(20, 901).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8883F, -0.0363F, 0.2339F));

		PartDefinition hips_lean_small_1_hips_top = hips_lean_small_1.addOrReplaceChild("hips_lean_small_1_hips_top", CubeListBuilder.create(), PartPose.offset(-0.0894F, -1.162F, -0.0894F));

		PartDefinition hips_lean_small_1_hips_top_upper = hips_lean_small_1_hips_top.addOrReplaceChild("hips_lean_small_1_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.1511F, 0.0156F, 0.7394F));

		PartDefinition cube_r1 = hips_lean_small_1_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(24, 891).addBox(-4.08F, -5.24F, -4.36F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -0.6699F, 3.2432F, 1.1781F, 0.0F, 0.0F));

		PartDefinition hips_lean_small_1_hips_top_lower = hips_lean_small_1_hips_top.addOrReplaceChild("hips_lean_small_1_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.1511F, 1.3965F, 0.4887F));

		PartDefinition cube_r2 = hips_lean_small_1_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 886).addBox(-5.08F, -4.24F, -5.36F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -1.5145F, 2.5107F, 1.1781F, 0.0F, 0.0F));

		PartDefinition backAnchor = hips_lean_small_1.addOrReplaceChild("backAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.75F, -0.5F));

		PartDefinition tailAnchor = hips_lean_small_1.addOrReplaceChild("tailAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.5F, 2.75F));

		PartDefinition backLeftLegAnchor = hips_lean_small_1.addOrReplaceChild("backLeftLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.75F, 2.75F, 0.5F));

		PartDefinition backRightLegAnchor = hips_lean_small_1.addOrReplaceChild("backRightLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.75F, 2.75F, 0.5F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		hips_lean_small_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return root;
    }

	@Override
	public String animationRoot() {
		return "hips_lean_small_1";
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