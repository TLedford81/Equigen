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

public class hips_average_average_2 extends MultipartHipModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart hips_average_average_2;
	private final ModelPart backAnchor;
	private final ModelPart tailAnchor;
	private final ModelPart backLeftLegAnchor;
	private final ModelPart backRightLegAnchor;

	public hips_average_average_2(ModelPart root) {
		this.root = root;
		this.hips_average_average_2 = root.getChild("hips_average_average_2");
		this.backAnchor = this.hips_average_average_2.getChild("backAnchor");
		this.tailAnchor = this.hips_average_average_2.getChild("tailAnchor");
		this.backLeftLegAnchor = this.hips_average_average_2.getChild("backLeftLegAnchor");
		this.backRightLegAnchor = this.hips_average_average_2.getChild("backRightLegAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hips_average_average_2 = partdefinition.addOrReplaceChild("hips_average_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips_average_average_2_left_hip = hips_average_average_2.addOrReplaceChild("hips_average_average_2_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_average_average_2_left_hip_glute_base = hips_average_average_2_left_hip.addOrReplaceChild("hips_average_average_2_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.1788F, 0.0F, -0.2682F));

		PartDefinition hips_average_average_2_left_hip_glute_base_individual = hips_average_average_2_left_hip_glute_base.addOrReplaceChild("hips_average_average_2_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(160, 955).addBox(-2.4312F, -3.6357F, -3.6839F, 4.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6491F, -0.2413F, -0.1017F));

		PartDefinition hips_average_average_2_left_hip_glute_outer = hips_average_average_2_left_hip_glute_base.addOrReplaceChild("hips_average_average_2_left_hip_glute_outer", CubeListBuilder.create().texOffs(182, 956).addBox(-3.4832F, -2.5894F, -2.6425F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(3.1648F, -0.3045F, -0.0705F));

		PartDefinition hips_average_average_2_right_hip = hips_average_average_2.addOrReplaceChild("hips_average_average_2_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_average_average_2_right_hip_glute_base = hips_average_average_2_right_hip.addOrReplaceChild("hips_average_average_2_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.1788F, 0.0F, -0.2682F));

		PartDefinition hips_average_average_2_right_hip_glue_base_individual = hips_average_average_2_right_hip_glute_base.addOrReplaceChild("hips_average_average_2_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(159, 940).addBox(-2.4832F, -3.6788F, -3.6425F, 4.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.2989F, -0.1983F, -0.1431F));

		PartDefinition hips_average_average_2_right_hip_glue_outer = hips_average_average_2_right_hip_glute_base.addOrReplaceChild("hips_average_average_2_right_hip_glue_outer", CubeListBuilder.create().texOffs(181, 945).addBox(-2.5084F, -2.6235F, -2.616F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8352F, -0.3045F, -0.0705F));

		PartDefinition hips_average_average_2_hips_top = hips_average_average_2.addOrReplaceChild("hips_average_average_2_hips_top", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9832F, 0.0F));

		PartDefinition hips_average_average_2_hips_top_upper = hips_average_average_2_hips_top.addOrReplaceChild("hips_average_average_2_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.7237F, -0.1402F, 1.2649F));

		PartDefinition cube_r1 = hips_average_average_2_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(177, 933).addBox(-4.08F, -4.24F, -7.36F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5074F, -1.8549F, 2.4496F, 1.2217F, 0.0F, 0.0F));

		PartDefinition hips_average_average_2_hips_top_lower = hips_average_average_2_hips_top.addOrReplaceChild("hips_average_average_2_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.6343F, 0.5672F, 1.0196F));

		PartDefinition cube_r2 = hips_average_average_2_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(157, 927).addBox(-5.08F, -4.24F, -7.36F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5968F, -2.1153F, 2.2479F, 1.2217F, 0.0F, 0.0F));

		PartDefinition backAnchor = hips_average_average_2.addOrReplaceChild("backAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.5F, 0.0F));

		PartDefinition tailAnchor = hips_average_average_2.addOrReplaceChild("tailAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.15F, -2.5F, 3.25F));

		PartDefinition backLeftLegAnchor = hips_average_average_2.addOrReplaceChild("backLeftLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.25F, 4.0F, 0.75F));

		PartDefinition backRightLegAnchor = hips_average_average_2.addOrReplaceChild("backRightLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.25F, 4.0F, 0.75F));

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
		return "hips_average_average_2";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart hips = this.hips_average_average_2;

		registerAnchorPath("backAnchor", root, hips, this.backAnchor);
		registerAnchorPath("tailAnchor", root, hips, this.tailAnchor);
		registerAnchorPath("backLeftLegAnchor", root, hips, this.backLeftLegAnchor);
		registerAnchorPath("backRightLegAnchor", root, hips, this.backRightLegAnchor);

	}

}