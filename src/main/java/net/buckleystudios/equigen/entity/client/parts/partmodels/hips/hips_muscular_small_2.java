package net.buckleystudios.equigen.entity.client.parts.partmodels.hips;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartHipModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class hips_muscular_small_2 extends MultipartHipModel<GeneticHorseEntity> {
	private final ModelPart hips_muscular_small_2;

	public hips_muscular_small_2(ModelPart root) {
		this.hips_muscular_small_2 = root.getChild("hips_muscular_small_2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hips_muscular_small_2 = partdefinition.addOrReplaceChild("hips_muscular_small_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips_muscular_small_2_left_hip = hips_muscular_small_2.addOrReplaceChild("hips_muscular_small_2_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_muscular_small_2_left_hip_glute_base = hips_muscular_small_2_left_hip.addOrReplaceChild("hips_muscular_small_2_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.5363F, 0.0F, -0.6257F));

		PartDefinition hips_muscular_small_2_left_hip_glute_base_individual = hips_muscular_small_2_left_hip_glute_base.addOrReplaceChild("hips_muscular_small_2_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(73, 992).addBox(-2.5F, -3.5F, -3.0F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5056F, -0.0028F, -0.0538F));

		PartDefinition hips_muscular_small_2_left_hip_glute_outer = hips_muscular_small_2_left_hip_glute_base.addOrReplaceChild("hips_muscular_small_2_left_hip_glute_outer", CubeListBuilder.create().texOffs(50, 982).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0419F, -0.1257F, -0.0342F));

		PartDefinition hips_muscular_small_2_right_hip = hips_muscular_small_2.addOrReplaceChild("hips_muscular_small_2_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_muscular_small_2_right_hip_glute_base = hips_muscular_small_2_right_hip.addOrReplaceChild("hips_muscular_small_2_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.5363F, 0.0F, -0.6257F));

		PartDefinition hips_muscular_small_2_right_hip_glue_base_individual = hips_muscular_small_2_right_hip_glute_base.addOrReplaceChild("hips_muscular_small_2_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(51, 992).addBox(-2.5F, -3.5F, -3.0F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5045F, -0.0378F, -0.0232F));

		PartDefinition hips_muscular_small_2_right_hip_glue_outer = hips_muscular_small_2_right_hip_glute_base.addOrReplaceChild("hips_muscular_small_2_right_hip_glue_outer", CubeListBuilder.create().texOffs(53, 1005).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9581F, -0.1257F, -0.0342F));

		PartDefinition hips_muscular_small_2_hips_top = hips_muscular_small_2.addOrReplaceChild("hips_muscular_small_2_hips_top", CubeListBuilder.create(), PartPose.offset(-0.5363F, -0.9832F, 1.0726F));

		PartDefinition hips_muscular_small_2_hips_top_upper = hips_muscular_small_2_hips_top.addOrReplaceChild("hips_muscular_small_2_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.3661F, -0.342F, -0.4226F));

		PartDefinition cube_r1 = hips_muscular_small_2_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(73, 1005).addBox(-5.08F, -5.24F, -4.36F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -0.6699F, 3.2432F, 1.1781F, 0.0F, 0.0F));

		PartDefinition hips_muscular_small_2_hips_top_lower = hips_muscular_small_2_hips_top.addOrReplaceChild("hips_muscular_small_2_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.3661F, 1.1283F, -0.6733F));

		PartDefinition cube_r2 = hips_muscular_small_2_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(70, 981).addBox(-6.08F, -4.24F, -5.36F, 7.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -1.5145F, 2.5107F, 1.1781F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		hips_muscular_small_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return hips_muscular_small_2;
    }

    @Override
    public void positionParts() {
        super.positionParts(root(), root());
    }
}