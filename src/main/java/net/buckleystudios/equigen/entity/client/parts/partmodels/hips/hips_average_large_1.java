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

public class hips_average_large_1 extends MultipartHipModel<GeneticHorseEntity> {
	private final ModelPart hips_average_large_1;

	public hips_average_large_1(ModelPart root) {
		this.hips_average_large_1 = root.getChild("hips_average_large_1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hips_average_large_1 = partdefinition.addOrReplaceChild("hips_average_large_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips_average_large_1_left_hip = hips_average_large_1.addOrReplaceChild("hips_average_large_1_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_average_large_1_left_hip_glute_base = hips_average_large_1_left_hip.addOrReplaceChild("hips_average_large_1_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.3575F, 0.0F, 0.2682F));

		PartDefinition hips_average_large_1_left_hip_glute_base_individual = hips_average_large_1_left_hip_glute_base.addOrReplaceChild("hips_average_large_1_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(217, 938).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.6816F, -0.324F, -0.8582F));

		PartDefinition hips_average_large_1_left_hip_glute_outer = hips_average_large_1_left_hip_glute_base.addOrReplaceChild("hips_average_large_1_left_hip_glute_outer", CubeListBuilder.create().texOffs(240, 955).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(1.7346F, -0.3408F, -0.9644F));

		PartDefinition hips_muscular_large_2_right_hip = hips_average_large_1.addOrReplaceChild("hips_muscular_large_2_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_average_large_1_right_hip_glute_base = hips_muscular_large_2_right_hip.addOrReplaceChild("hips_average_large_1_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.3575F, 0.0F, 0.2682F));

		PartDefinition hips_average_large_1_right_hip_glue_base_individual = hips_average_large_1_right_hip_glute_base.addOrReplaceChild("hips_average_large_1_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(224, 922).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.3184F, -0.324F, -0.8582F));

		PartDefinition hips_average_large_1_right_hip_glue_outer = hips_average_large_1_right_hip_glute_base.addOrReplaceChild("hips_average_large_1_right_hip_glue_outer", CubeListBuilder.create().texOffs(241, 943).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.2861F, -0.3704F, -0.9254F));

		PartDefinition hips_average_large_1_hips_top = hips_average_large_1.addOrReplaceChild("hips_average_large_1_hips_top", CubeListBuilder.create(), PartPose.offset(0.3575F, -1.6089F, 1.6983F));

		PartDefinition hips_average_large_1_hips_top_upper = hips_average_large_1_hips_top.addOrReplaceChild("hips_average_large_1_hips_top_upper", CubeListBuilder.create(), PartPose.offset(-0.2065F, 0.5749F, -1.0591F));

		PartDefinition cube_r1 = hips_average_large_1_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(216, 954).addBox(-4.08F, -4.24F, -7.36F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.3912F, 3.2541F, 1.2217F, 0.0F, 0.0F));

		PartDefinition hips_average_large_1_hips_top_lower = hips_average_large_1_hips_top.addOrReplaceChild("hips_average_large_1_hips_top_lower", CubeListBuilder.create(), PartPose.offset(-0.2065F, 1.1929F, -1.0362F));

		PartDefinition cube_r2 = hips_average_large_1_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(240, 930).addBox(-5.08F, -4.24F, -7.36F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.5623F, 2.7843F, 1.2217F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		hips_average_large_1.render(poseStack, vertexConsumer, packedLight, packedOverlay,color);
	}

    @Override
    public ModelPart root() {
        return hips_average_large_1;
    }

    @Override
    public void positionParts() {
        super.positionParts(root(), root());
    }
}