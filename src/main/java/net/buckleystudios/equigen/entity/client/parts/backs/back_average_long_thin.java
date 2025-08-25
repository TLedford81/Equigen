package net.buckleystudios.equigen.entity.client.parts.backs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class back_average_long_thin extends HierarchicalModel<GeneticHorseEntity> {
	private final ModelPart back_average_long_thin;

	public back_average_long_thin(ModelPart root) {
		this.back_average_long_thin = root.getChild("back_average_long_thin");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition back_average_long_thin = partdefinition.addOrReplaceChild("back_average_long_thin", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition back_average_long_thin_back_ribs = back_average_long_thin.addOrReplaceChild("back_average_long_thin_back_ribs", CubeListBuilder.create().texOffs(165, 519).addBox(-3.5F, -3.0F, -6.5F, 7.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0066F, 0.1397F, 0.0547F));

		PartDefinition back_average_long_thin_back_top_lower = back_average_long_thin.addOrReplaceChild("back_average_long_thin_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.1788F));

		PartDefinition back_average_long_thin_back_top_lower_individual = back_average_long_thin_back_top_lower.addOrReplaceChild("back_average_long_thin_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.542F, 1.979F));

		PartDefinition cube_r1 = back_average_long_thin_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(192, 517).addBox(-5.08F, -7.24F, -4.52F, 6.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.2075F, 2.0554F, 1.6581F, 0.0F, 0.0F));

		PartDefinition back_average_long_thin_back_top_upper = back_average_long_thin_back_top_lower.addOrReplaceChild("back_average_long_thin_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.7589F, 2.0226F));

		PartDefinition cube_r2 = back_average_long_thin_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(158, 516).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.7056F, 2.0118F, 1.6581F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		back_average_long_thin.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	public ModelPart root() {
		return back_average_long_thin;
	}
}