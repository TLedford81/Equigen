package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.hips;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartHipModel;
import net.buckleystudios.equigen.entity.client.genetic_horse.texturer.base.Block;
import net.buckleystudios.equigen.entity.client.genetic_horse.texturer.base.Part;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.ArrayList;
import java.util.Arrays;

public class hips_lean_average_2 extends MultipartHipModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart hips_lean_average_2;
	private final ModelPart backAnchor;
	private final ModelPart tailAnchor;
	private final ModelPart backLeftLegAnchor;
	private final ModelPart backRightLegAnchor;

	public hips_lean_average_2(ModelPart root) {
		this.root = root;
		this.hips_lean_average_2 = root.getChild("hips_lean_average_2");
		this.backAnchor = this.hips_lean_average_2.getChild("backAnchor");
		this.tailAnchor = this.hips_lean_average_2.getChild("tailAnchor");
		this.backLeftLegAnchor = this.hips_lean_average_2.getChild("backLeftLegAnchor");
		this.backRightLegAnchor = this.hips_lean_average_2.getChild("backRightLegAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hips_lean_average_2 = partdefinition.addOrReplaceChild("hips_lean_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips_lean_average_2_left_hip = hips_lean_average_2.addOrReplaceChild("hips_lean_average_2_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_lean_average_2_left_hip_glute_base = hips_lean_average_2_left_hip.addOrReplaceChild("hips_lean_average_2_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.0894F, 0.0F, -0.4469F));

		PartDefinition hips_lean_average_2_left_hip_glute_base_individual = hips_lean_average_2_left_hip_glute_base.addOrReplaceChild("hips_lean_average_2_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(0, 119).addBox(-2.0F, -4.0F, -3.5F, 4.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(1.6816F, 0.1229F, -0.1068F));

		PartDefinition hips_lean_average_2_left_hip_glute_outer = hips_lean_average_2_left_hip_glute_base.addOrReplaceChild("hips_lean_average_2_left_hip_glute_outer", CubeListBuilder.create().texOffs(0, 93).addBox(-2.0F, -3.0F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.1453F, 0.1061F, -0.0342F));

		PartDefinition hips_lean_average_2_right_hip = hips_lean_average_2.addOrReplaceChild("hips_lean_average_2_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_lean_average_2_right_hip_glute_base = hips_lean_average_2_right_hip.addOrReplaceChild("hips_lean_average_2_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.0894F, 0.0F, -0.4469F));

		PartDefinition hips_lean_average_2_right_hip_glue_base_individual = hips_lean_average_2_right_hip_glute_base.addOrReplaceChild("hips_lean_average_2_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(0, 136).addBox(-2.0F, -4.0F, -3.5F, 4.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.3252F, 0.0817F, -0.069F));

		PartDefinition hips_lean_average_2_right_hip_glue_outer = hips_lean_average_2_right_hip_glute_base.addOrReplaceChild("hips_lean_average_2_right_hip_glue_outer", CubeListBuilder.create().texOffs(0, 106).addBox(-2.0F, -3.0F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8547F, 0.1061F, -0.0342F));

		PartDefinition hips_lean_average_2_hips_top = hips_lean_average_2.addOrReplaceChild("hips_lean_average_2_hips_top", CubeListBuilder.create(), PartPose.offset(-0.0894F, -0.9832F, 1.4302F));

		PartDefinition hips_lean_average_2_hips_top_upper = hips_lean_average_2_hips_top.addOrReplaceChild("hips_lean_average_2_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.2404F, 0.3962F, -0.9698F));

		PartDefinition cube_r1 = hips_lean_average_2_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 67).addBox(-4.08F, -4.24F, -7.36F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.3912F, 3.2541F, 1.2217F, 0.0F, 0.0F));

		PartDefinition hips_lean_average_2_hips_top_lower = hips_lean_average_2_hips_top.addOrReplaceChild("hips_lean_average_2_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.2404F, 1.0141F, -0.9468F));

		PartDefinition cube_r2 = hips_lean_average_2_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 79).addBox(-5.08F, -4.24F, -7.36F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.5623F, 2.7843F, 1.2217F, 0.0F, 0.0F));

		PartDefinition backAnchor = hips_lean_average_2.addOrReplaceChild("backAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.9F, 0.0F));

		PartDefinition tailAnchor = hips_lean_average_2.addOrReplaceChild("tailAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1F, -2.55F, 3.25F));

		PartDefinition backLeftLegAnchor = hips_lean_average_2.addOrReplaceChild("backLeftLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.75F, 4.1F, 0.75F));

		PartDefinition backRightLegAnchor = hips_lean_average_2.addOrReplaceChild("backRightLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.75F, 4.1F, 0.75F));

		return LayerDefinition.create(meshdefinition, 128, 160);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return root;
    }

	@Override
	public String animationRoot() {
		return "hips_lean_average_2";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart hips = this.hips_lean_average_2;

		registerAnchorPath("backAnchor", root, hips, this.backAnchor);
		registerAnchorPath("tailAnchor", root, hips, this.tailAnchor);
		registerAnchorPath("backLeftLegAnchor", root, hips, this.backLeftLegAnchor);
		registerAnchorPath("backRightLegAnchor", root, hips, this.backRightLegAnchor);

	}
	@Override
	public Part getCubeDimensions() {
		return new Part("hips_lean_average_2", new ArrayList<>(
				Arrays.asList(
						new Block(4, 8, 7),
						new Block(4, 6, 5),
						new Block(4, 8, 7),
						new Block(4, 6, 5),
						new Block(4, 4, 8),
						new Block(6, 5, 8))
		));
	}
}