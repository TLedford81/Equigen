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

public class hips_muscular_small_1 extends MultipartHipModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart hips_muscular_small_1;
	private final ModelPart backAnchor;
	private final ModelPart tailAnchor;
	private final ModelPart backLeftLegAnchor;
	private final ModelPart backRightLegAnchor;

	public hips_muscular_small_1(ModelPart root) {
		this.root = root;
		this.hips_muscular_small_1 = root.getChild("hips_muscular_small_1");
		this.backAnchor = this.hips_muscular_small_1.getChild("backAnchor");
		this.tailAnchor = this.hips_muscular_small_1.getChild("tailAnchor");
		this.backLeftLegAnchor = this.hips_muscular_small_1.getChild("backLeftLegAnchor");
		this.backRightLegAnchor = this.hips_muscular_small_1.getChild("backRightLegAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hips_muscular_small_1 = partdefinition.addOrReplaceChild("hips_muscular_small_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -1.7877F));

		PartDefinition hips_muscular_small_1_left_hip = hips_muscular_small_1.addOrReplaceChild("hips_muscular_small_1_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_muscular_small_1_left_hip_glute_base = hips_muscular_small_1_left_hip.addOrReplaceChild("hips_muscular_small_1_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_muscular_small_1_left_hip_glute_base_individual = hips_muscular_small_1_left_hip_glute_base.addOrReplaceChild("hips_muscular_small_1_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(0, 1005).addBox(-3.0904F, -2.619F, -1.79F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6491F, -0.2413F, -0.1017F));

		PartDefinition hips_muscular_small_1_left_hip_glute_outer = hips_muscular_small_1_left_hip_glute_base.addOrReplaceChild("hips_muscular_small_1_left_hip_glute_outer", CubeListBuilder.create().texOffs(22, 1007).addBox(-3.0698F, -2.0531F, -1.3017F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(3.1648F, -0.3045F, -0.0705F));

		PartDefinition hips_muscular_small_1_right_hip = hips_muscular_small_1.addOrReplaceChild("hips_muscular_small_1_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_muscular_small_1_right_hip_glute_base = hips_muscular_small_1_right_hip.addOrReplaceChild("hips_muscular_small_1_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_muscular_small_1_right_hip_glue_base_individual = hips_muscular_small_1_right_hip_glute_base.addOrReplaceChild("hips_muscular_small_1_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(0, 993).addBox(-3.1481F, -2.6934F, -1.7297F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.2989F, -0.1983F, -0.1432F));

		PartDefinition hips_muscular_small_1_right_hip_glue_outer = hips_muscular_small_1_right_hip_glute_base.addOrReplaceChild("hips_muscular_small_1_right_hip_glue_outer", CubeListBuilder.create().texOffs(22, 997).addBox(-3.0698F, -2.0531F, -1.3017F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8352F, -0.3045F, -0.0705F));

		PartDefinition hips_muscular_small_1_hips_top = hips_muscular_small_1.addOrReplaceChild("hips_muscular_small_1_hips_top", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9832F, 1.6983F));

		PartDefinition hips_muscular_small_1_hips_top_upper = hips_muscular_small_1_hips_top.addOrReplaceChild("hips_muscular_small_1_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.9025F, -0.1402F, -0.1653F));

		PartDefinition cube_r1 = hips_muscular_small_1_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(26, 987).addBox(-5.08F, -5.24F, -4.36F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8649F, -0.5141F, 4.148F, 1.1781F, 0.0F, 0.0F));

		PartDefinition hips_muscular_small_1_hips_top_lower = hips_muscular_small_1_hips_top.addOrReplaceChild("hips_muscular_small_1_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.8131F, 0.5672F, -0.4105F));

		PartDefinition cube_r2 = hips_muscular_small_1_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 982).addBox(-6.08F, -4.24F, -5.36F, 7.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0437F, -0.6852F, 3.4099F, 1.1781F, 0.0F, 0.0F));

		PartDefinition backAnchor = hips_muscular_small_1.addOrReplaceChild("backAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.5F, 1.2877F));

		PartDefinition tailAnchor = hips_muscular_small_1.addOrReplaceChild("tailAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1F, -1.25F, 4.6377F));

		PartDefinition backLeftLegAnchor = hips_muscular_small_1.addOrReplaceChild("backLeftLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.75F, 2.75F, 2.2877F));

		PartDefinition backRightLegAnchor = hips_muscular_small_1.addOrReplaceChild("backRightLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, 2.75F, 2.2877F));

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
		return "hips_muscular_small_1";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart hips = this.hips_muscular_small_1;

		registerAnchorPath("backAnchor", root, hips, this.backAnchor);
		registerAnchorPath("tailAnchor", root, hips, this.tailAnchor);
		registerAnchorPath("backLeftLegAnchor", root, hips, this.backLeftLegAnchor);
		registerAnchorPath("backRightLegAnchor", root, hips, this.backRightLegAnchor);

	}

}