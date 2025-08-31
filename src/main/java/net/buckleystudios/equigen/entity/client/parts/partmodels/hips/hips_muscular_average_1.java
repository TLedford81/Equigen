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

public class hips_muscular_average_1 extends MultipartHipModel<GeneticHorseEntity> {
	private final ModelPart hips_muscular_average_1;

	public hips_muscular_average_1(ModelPart root) {
		this.hips_muscular_average_1 = root.getChild("hips_muscular_average_1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hips_muscular_average_1 = partdefinition.addOrReplaceChild("hips_muscular_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips_muscular_average_1_left_hip = hips_muscular_average_1.addOrReplaceChild("hips_muscular_average_1_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_muscular_average_1_left_hip_glute_base = hips_muscular_average_1_left_hip.addOrReplaceChild("hips_muscular_average_1_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.3575F, 0.0F, -0.8045F));

		PartDefinition hips_muscular_average_1_left_hip_glute_base_individual = hips_muscular_average_1_left_hip_glute_base.addOrReplaceChild("hips_muscular_average_1_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(107, 977).addBox(-2.5F, -3.5F, -3.5F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9134F, 0.1927F, -0.1236F));

		PartDefinition hips_muscular_average_1_left_hip_glute_outer = hips_muscular_average_1_left_hip_glute_base.addOrReplaceChild("hips_muscular_average_1_left_hip_glute_outer", CubeListBuilder.create().texOffs(127, 1006).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.4497F, 0.2486F, -0.1236F));

		PartDefinition hips_muscular_average_1_right_hip = hips_muscular_average_1.addOrReplaceChild("hips_muscular_average_1_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_muscular_average_1_right_hip_glute_base = hips_muscular_average_1_right_hip.addOrReplaceChild("hips_muscular_average_1_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.3575F, 0.0F, -0.8045F));

		PartDefinition hips_muscular_average_1_right_hip_glue_base_individual = hips_muscular_average_1_right_hip_glute_base.addOrReplaceChild("hips_muscular_average_1_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(101, 991).addBox(-2.5F, -3.5F, -3.5F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0907F, 0.1558F, -0.0874F));

		PartDefinition hips_muscular_average_1_right_hip_glue_outer = hips_muscular_average_1_right_hip_glute_base.addOrReplaceChild("hips_muscular_average_1_right_hip_glue_outer", CubeListBuilder.create().texOffs(109, 1005).addBox(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0503F, 0.2486F, -0.1236F));

		PartDefinition hips_muscular_average_1_hips_top = hips_muscular_average_1.addOrReplaceChild("hips_muscular_average_1_hips_top", CubeListBuilder.create(), PartPose.offset(0.3575F, 0.0F, -0.8045F));

		PartDefinition hips_muscular_average_1_hips_top_upper = hips_muscular_average_1_hips_top.addOrReplaceChild("hips_muscular_average_1_hips_top_upper", CubeListBuilder.create(), PartPose.offset(-0.1702F, -1.0798F, 1.6963F));

		PartDefinition cube_r1 = hips_muscular_average_1_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(125, 996).addBox(-5.08F, -4.24F, -5.36F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -1.4515F, 2.9121F, 1.2217F, 0.0F, 0.0F));

		PartDefinition hips_muscular_average_1_hips_top_lower = hips_muscular_average_1_hips_top.addOrReplaceChild("hips_muscular_average_1_hips_top_lower", CubeListBuilder.create(), PartPose.offset(-0.1171F, -0.2831F, 1.3617F));

		PartDefinition cube_r2 = hips_muscular_average_1_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(125, 985).addBox(-5.08F, -4.24F, -5.36F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -1.6226F, 2.4422F, 1.2217F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		hips_muscular_average_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return hips_muscular_average_1;
    }


}