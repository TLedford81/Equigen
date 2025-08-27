package net.buckleystudios.equigen.entity.client.parts.partmodels.backs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartBackModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class back_lean_short_thick extends MultipartBackModel<GeneticHorseEntity> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	private final ModelPart back_lean_short_thick;

	public back_lean_short_thick(ModelPart root) {
		
		this.back_lean_short_thick = root.getChild("back_lean_short_thick");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition back_lean_short_thick = partdefinition.addOrReplaceChild("back_lean_short_thick", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition back_lean_short_thick_back_ribs = back_lean_short_thick.addOrReplaceChild("back_lean_short_thick_back_ribs", CubeListBuilder.create().texOffs(215, 427).addBox(-3.0F, -4.0F, -5.5F, 6.0F, 8.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0297F, -0.0223F, -0.0179F));

		PartDefinition back_lean_short_thick_back_top_lower = back_lean_short_thick.addOrReplaceChild("back_lean_short_thick_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.6257F));

		PartDefinition back_lean_short_thick_back_top_lower_individual = back_lean_short_thick_back_top_lower.addOrReplaceChild("back_lean_short_thick_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0066F, -1.2494F, 0.6436F));

		PartDefinition cube_r1 = back_lean_short_thick_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(238, 423).addBox(-4.08F, -6.24F, -5.52F, 5.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

		PartDefinition back_lean_short_thick_back_top_upper = back_lean_short_thick_back_top_lower.addOrReplaceChild("back_lean_short_thick_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.4664F, 0.6872F));

		PartDefinition cube_r2 = back_lean_short_thick_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(204, 422).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.1602F, 1.4702F, 1.6581F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		back_lean_short_thick.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	public ModelPart root() {
		return back_lean_short_thick;
	}

	@Override
	public void positionParts() {
		super.positionParts(root(), root());
	}
}