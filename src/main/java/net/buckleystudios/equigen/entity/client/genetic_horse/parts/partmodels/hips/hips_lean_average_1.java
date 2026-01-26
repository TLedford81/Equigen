package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.hips;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartHipModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class hips_lean_average_1 extends MultipartHipModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart hips_lean_average_1;
	private final ModelPart backAnchor;
	private final ModelPart tailAnchor;
	private final ModelPart backLeftLegAnchor;
	private final ModelPart backRightLegAnchor;

	public hips_lean_average_1(ModelPart root) {
		this.root = root;
		this.hips_lean_average_1 = root.getChild("hips_lean_average_1");
		this.backAnchor = this.hips_lean_average_1.getChild("backAnchor");
		this.tailAnchor = this.hips_lean_average_1.getChild("tailAnchor");
		this.backLeftLegAnchor = this.hips_lean_average_1.getChild("backLeftLegAnchor");
		this.backRightLegAnchor = this.hips_lean_average_1.getChild("backRightLegAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hips_lean_average_1 = partdefinition.addOrReplaceChild("hips_lean_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips_lean_average_1_left_hip = hips_lean_average_1.addOrReplaceChild("hips_lean_average_1_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_lean_average_1_left_hip_glute_base = hips_lean_average_1_left_hip.addOrReplaceChild("hips_lean_average_1_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -1.0726F));

		PartDefinition hips_lean_average_1_left_hip_glute_base_individual = hips_lean_average_1_left_hip_glute_base.addOrReplaceChild("hips_lean_average_1_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(100, 910).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5195F, 0.1927F, 0.1446F));

		PartDefinition hips_lean_average_1_left_hip_glute_outer = hips_lean_average_1_left_hip_glute_base.addOrReplaceChild("hips_lean_average_1_left_hip_glute_outer", CubeListBuilder.create().texOffs(122, 914).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9665F, -0.0196F, 0.1446F));

		PartDefinition hips_lean_average_1_right_hip = hips_lean_average_1.addOrReplaceChild("hips_lean_average_1_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_lean_average_1_right_hip_glute_base = hips_lean_average_1_right_hip.addOrReplaceChild("hips_lean_average_1_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -1.0726F));

		PartDefinition hips_lean_average_1_right_hip_glue_base_individual = hips_lean_average_1_right_hip_glute_base.addOrReplaceChild("hips_lean_average_1_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(100, 896).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.4856F, 0.1558F, 0.1808F));

		PartDefinition hips_lean_average_1_right_hip_glue_outer = hips_lean_average_1_right_hip_glute_base.addOrReplaceChild("hips_lean_average_1_right_hip_glue_outer", CubeListBuilder.create().texOffs(122, 904).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0335F, -0.0196F, 0.1446F));

		PartDefinition hips_lean_average_1_hips_top = hips_lean_average_1.addOrReplaceChild("hips_lean_average_1_hips_top", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9832F, 0.8939F));

		PartDefinition hips_lean_average_1_hips_top_upper = hips_lean_average_1_hips_top.addOrReplaceChild("hips_lean_average_1_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.0086F, -0.0966F, -0.002F));

		PartDefinition cube_r1 = hips_lean_average_1_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(122, 894).addBox(-5.08F, -4.24F, -5.36F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -1.4516F, 2.9121F, 1.2217F, 0.0F, 0.0F));

		PartDefinition hips_lean_average_1_hips_top_lower = hips_lean_average_1_hips_top.addOrReplaceChild("hips_lean_average_1_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.0617F, 0.7001F, -0.3367F));

		PartDefinition cube_r2 = hips_lean_average_1_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(99, 885).addBox(-5.08F, -4.24F, -5.36F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -1.6226F, 2.4422F, 1.2217F, 0.0F, 0.0F));

		PartDefinition backAnchor = hips_lean_average_1.addOrReplaceChild("backAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.5F, 0.0F));

		PartDefinition tailAnchor = hips_lean_average_1.addOrReplaceChild("tailAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1F, -2.1F, 3.0F));

		PartDefinition backLeftLegAnchor = hips_lean_average_1.addOrReplaceChild("backLeftLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.75F, 3.5F, 0.25F));

		PartDefinition backRightLegAnchor = hips_lean_average_1.addOrReplaceChild("backRightLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.75F, 3.5F, 0.25F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
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
		return "hips_lean_average_1";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart hips = this.hips_lean_average_1;

		registerAnchorPath("backAnchor", root, hips, this.backAnchor);
		registerAnchorPath("tailAnchor", root, hips, this.tailAnchor);
		registerAnchorPath("backLeftLegAnchor", root, hips, this.backLeftLegAnchor);
		registerAnchorPath("backRightLegAnchor", root, hips, this.backRightLegAnchor);

	}

}