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

public class hips_muscular_average_2 extends MultipartHipModel<GeneticHorseEntity> {
	private final ModelPart hips_muscular_average_2;

	public hips_muscular_average_2(ModelPart root) {
		this.hips_muscular_average_2 = root.getChild("hips_muscular_average_2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hips_muscular_average_2 = partdefinition.addOrReplaceChild("hips_muscular_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips_muscular_average_2_left_hip = hips_muscular_average_2.addOrReplaceChild("hips_muscular_average_2_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_muscular_average_2_left_hip_glute_base = hips_muscular_average_2_left_hip.addOrReplaceChild("hips_muscular_average_2_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.2682F, 0.0F, -0.2682F));

		PartDefinition hips_muscular_average_2_left_hip_glute_base_individual = hips_muscular_average_2_left_hip_glute_base.addOrReplaceChild("hips_muscular_average_2_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(155, 989).addBox(-2.5F, -4.0F, -3.5F, 5.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(2.2542F, 0.1229F, -0.2856F));

		PartDefinition hips_muscular_average_2_left_hip_glute_outer = hips_muscular_average_2_left_hip_glute_base.addOrReplaceChild("hips_muscular_average_2_left_hip_glute_outer", CubeListBuilder.create().texOffs(184, 1005).addBox(-2.5F, -3.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.7179F, 0.1061F, -0.213F));

		PartDefinition hips_muscular_average_2_right_hip = hips_muscular_average_2.addOrReplaceChild("hips_muscular_average_2_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_muscular_average_2_right_hip_glute_base = hips_muscular_average_2_right_hip.addOrReplaceChild("hips_muscular_average_2_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(-0.2682F, 0.0F, -0.2682F));

		PartDefinition hips_muscular_average_2_right_hip_glue_base_individual = hips_muscular_average_2_right_hip_glute_base.addOrReplaceChild("hips_muscular_average_2_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(160, 974).addBox(-2.5F, -4.0F, -3.5F, 5.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.7534F, 0.0817F, -0.2477F));

		PartDefinition hips_muscular_average_2_right_hip_glue_outer = hips_muscular_average_2_right_hip_glute_base.addOrReplaceChild("hips_muscular_average_2_right_hip_glue_outer", CubeListBuilder.create().texOffs(184, 981).addBox(-2.5F, -3.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.2821F, 0.1061F, -0.213F));

		PartDefinition hips_muscular_average_2_hips_top = hips_muscular_average_2.addOrReplaceChild("hips_muscular_average_2_hips_top", CubeListBuilder.create(), PartPose.offset(-0.2682F, 0.0F, -0.2682F));

		PartDefinition hips_muscular_average_2_hips_top_upper = hips_muscular_average_2_hips_top.addOrReplaceChild("hips_muscular_average_2_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.3661F, -0.5871F, 0.7286F));

		PartDefinition cube_r1 = hips_muscular_average_2_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(158, 1004).addBox(-5.08F, -4.24F, -7.36F, 5.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.3912F, 3.2541F, 1.2217F, 0.0F, 0.0F));

		PartDefinition hips_muscular_average_2_hips_top_lower = hips_muscular_average_2_hips_top.addOrReplaceChild("hips_muscular_average_2_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.3661F, 0.0309F, 0.7515F));

		PartDefinition cube_r2 = hips_muscular_average_2_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(179, 992).addBox(-6.08F, -4.24F, -7.36F, 7.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.5623F, 2.7843F, 1.2217F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		hips_muscular_average_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return hips_muscular_average_2;
    }


}