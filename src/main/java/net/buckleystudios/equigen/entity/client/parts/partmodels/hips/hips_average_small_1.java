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

public class hips_average_small_1 extends MultipartHipModel<GeneticHorseEntity> {
	private final ModelPart hips_average_small_1;

	public hips_average_small_1(ModelPart root) {
		this.hips_average_small_1 = root.getChild("hips_average_small_1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hips_average_small_1 = partdefinition.addOrReplaceChild("hips_average_small_1", CubeListBuilder.create(), PartPose.offset(-0.0894F, 24.0F, -0.6257F));

		PartDefinition hips_average_small_1_left_hip = hips_average_small_1.addOrReplaceChild("hips_average_small_1_left_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_average_small_1_left_hip_glute_base = hips_average_small_1_left_hip.addOrReplaceChild("hips_average_small_1_left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_average_small_1_left_hip_glute_base_individual = hips_average_small_1_left_hip_glute_base.addOrReplaceChild("hips_average_small_1_left_hip_glute_base_individual", CubeListBuilder.create().texOffs(20, 934).addBox(-2.5374F, -2.619F, -1.79F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6491F, -0.2413F, -1.2637F));

		PartDefinition hips_average_small_1_left_hip_glute_outer = hips_average_small_1_left_hip_glute_base.addOrReplaceChild("hips_average_small_1_left_hip_glute_outer", CubeListBuilder.create().texOffs(0, 957).addBox(-3.5168F, -2.0531F, -1.3017F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(3.1648F, -0.3045F, -1.2325F));

		PartDefinition hips_average_small_1_right_hip = hips_average_small_1.addOrReplaceChild("hips_average_small_1_right_hip", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_average_small_1_right_hip_glute_base = hips_average_small_1_right_hip.addOrReplaceChild("hips_average_small_1_right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips_average_small_1_right_hip_glue_base_individual = hips_average_small_1_right_hip_glute_base.addOrReplaceChild("hips_average_small_1_right_hip_glue_base_individual", CubeListBuilder.create().texOffs(0, 935).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8883F, 0.1397F, -0.0538F));

		PartDefinition hips_average_small_1_right_hip_glue_outer = hips_average_small_1_right_hip_glute_base.addOrReplaceChild("hips_average_small_1_right_hip_glue_outer", CubeListBuilder.create().texOffs(0, 947).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8768F, 0.113F, -0.0212F));

		PartDefinition hips_average_small_1_hips_top = hips_average_small_1.addOrReplaceChild("hips_average_small_1_hips_top", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9832F, 0.5363F));

		PartDefinition hips_average_small_1_hips_top_upper = hips_average_small_1_hips_top.addOrReplaceChild("hips_average_small_1_hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.1511F, 0.0156F, 0.7394F));

		PartDefinition cube_r1 = hips_average_small_1_hips_top_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 946).addBox(-4.08F, -5.24F, -4.36F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -0.6699F, 3.2432F, 1.1781F, 0.0F, 0.0F));

		PartDefinition hips_average_small_1_hips_top_lower = hips_average_small_1_hips_top.addOrReplaceChild("hips_average_small_1_hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.1511F, 1.3965F, 0.4887F));

		PartDefinition cube_r2 = hips_average_small_1_hips_top_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(20, 956).addBox(-5.08F, -4.24F, -5.36F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -1.5145F, 2.5107F, 1.1781F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		hips_average_small_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return hips_average_small_1;
    }


}