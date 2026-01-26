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

public class hips_lean_small_2 extends MultipartHipModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart hips_lean_small_2;
	private final ModelPart backAnchor;
	private final ModelPart tailAnchor;
	private final ModelPart backLeftLegAnchor;
	private final ModelPart backRightLegAnchor;

	public hips_lean_small_2(ModelPart root) {
		this.root = root;
		this.hips_lean_small_2 = root.getChild("hips_lean_small_2");
		this.backAnchor = this.hips_lean_small_2.getChild("backAnchor");
		this.tailAnchor = this.hips_lean_small_2.getChild("tailAnchor");
		this.backLeftLegAnchor = this.hips_lean_small_2.getChild("backLeftLegAnchor");
		this.backRightLegAnchor = this.hips_lean_small_2.getChild("backRightLegAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hips_lean_small_2 = partdefinition.addOrReplaceChild("hips_lean_small_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips_lean_small_2_left_hip = hips_lean_small_2.addOrReplaceChild("hips_lean_small_2_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_lean_small_2_left_hip_glute_base = hips_lean_small_2_left_hip.addOrReplaceChild("hips_lean_small_2_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.3575F, 0.0F, -0.6257F));

		PartDefinition hips_lean_small_2_left_hip_glute_base_individual = hips_lean_small_2_left_hip_glute_base.addOrReplaceChild("hips_lean_small_2_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(50, 909).addBox(-2.0F, -3.5F, -3.0F, 4.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(1.8436F, 0.2654F, -0.0538F));

		PartDefinition hips_lean_small_2_left_hip_glute_outer = hips_lean_small_2_left_hip_glute_base.addOrReplaceChild("hips_lean_small_2_left_hip_glute_outer", CubeListBuilder.create().texOffs(70, 911).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.3799F, -0.1257F, -0.0342F));

		PartDefinition hips_lean_small_2_right_hip = hips_lean_small_2.addOrReplaceChild("hips_lean_small_2_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_lean_small_2_right_hip_glute_base = hips_lean_small_2_right_hip.addOrReplaceChild("hips_lean_small_2_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.3575F, 0.0F, -0.6257F));

		PartDefinition hips_lean_small_2_right_hip_glue_base_individual = hips_lean_small_2_right_hip_glute_base.addOrReplaceChild("hips_lean_small_2_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(50, 896).addBox(-2.0F, -3.5F, -3.0F, 4.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.1649F, 0.2277F, -0.0232F));

		PartDefinition hips_lean_small_2_right_hip_glue_outer = hips_lean_small_2_right_hip_glute_base.addOrReplaceChild("hips_lean_small_2_right_hip_glue_outer", CubeListBuilder.create().texOffs(70, 901).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.6201F, 0.1425F, -0.0342F));

		PartDefinition hips_lean_small_2_hips_top = hips_lean_small_2.addOrReplaceChild("hips_lean_small_2_hips_top", CubeListBuilder.create(), PartPose.offset(-0.3575F, -0.9832F, 1.0726F));

		PartDefinition hips_lean_small_2_hips_top_upper = hips_lean_small_2_hips_top.addOrReplaceChild("hips_lean_small_2_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.4192F, -0.342F, -0.4226F));

		PartDefinition cube_r1 = hips_lean_small_2_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(66, 891).addBox(-4.1694F, -5.24F, -4.36F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1694F, -0.6699F, 3.2432F, 1.1781F, 0.0F, 0.0F));

		PartDefinition hips_lean_small_2_hips_top_lower = hips_lean_small_2_hips_top.addOrReplaceChild("hips_lean_small_2_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.4192F, 1.1283F, -0.6733F));

		PartDefinition cube_r2 = hips_lean_small_2_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(47, 885).addBox(-5.1694F, -4.9089F, -6.3143F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1694F, -2.1402F, 3.4939F, 1.1781F, 0.0F, 0.0F));

		PartDefinition backAnchor = hips_lean_small_2.addOrReplaceChild("backAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.25F, -0.5F));

		PartDefinition tailAnchor = hips_lean_small_2.addOrReplaceChild("tailAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.65F, 2.75F));

		PartDefinition backLeftLegAnchor = hips_lean_small_2.addOrReplaceChild("backLeftLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.75F, 3.75F, 0.5F));

		PartDefinition backRightLegAnchor = hips_lean_small_2.addOrReplaceChild("backRightLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.75F, 3.75F, 0.5F));

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
		return "hips_lean_small_2";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart hips = this.hips_lean_small_2;

		registerAnchorPath("backAnchor", root, hips, this.backAnchor);
		registerAnchorPath("tailAnchor", root, hips, this.tailAnchor);
		registerAnchorPath("backLeftLegAnchor", root, hips, this.backLeftLegAnchor);
		registerAnchorPath("backRightLegAnchor", root, hips, this.backRightLegAnchor);

	}

}