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

public class back_lean_short_thin extends MultipartBackModel<GeneticHorseEntity> {
	private final ModelPart back_lean_short_thin;

	public back_lean_short_thin(ModelPart root) {
		
		this.back_lean_short_thin = root.getChild("back_lean_short_thin");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition back_lean_short_thin = partdefinition.addOrReplaceChild("back_lean_short_thin", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition back_lean_short_thin_back_ribs = back_lean_short_thin.addOrReplaceChild("back_lean_short_thin_back_ribs", CubeListBuilder.create().texOffs(86, 427).addBox(-3.0F, -3.0F, -5.5F, 6.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0297F, 0.1397F, -0.0179F));

		PartDefinition back_lean_short_thin_back_top_lower = back_lean_short_thin.addOrReplaceChild("back_lean_short_thin_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.6257F));

		PartDefinition back_lean_short_thin_back_top_lower_individual = back_lean_short_thin_back_top_lower.addOrReplaceChild("back_lean_short_thin_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0066F, -0.5855F, 0.6001F));

		PartDefinition cube_r1 = back_lean_short_thin_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(109, 424).addBox(-4.08F, -6.24F, -4.52F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -2.164F, 1.5573F, 1.6581F, 0.0F, 0.0F));

		PartDefinition back_lean_short_thin_back_top_upper = back_lean_short_thin_back_top_lower.addOrReplaceChild("back_lean_short_thin_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.8025F, 0.6436F));

		PartDefinition cube_r2 = back_lean_short_thin_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(77, 423).addBox(-4.08F, -6.24F, -5.52F, 4.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		back_lean_short_thin.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	public ModelPart root() {
		return back_lean_short_thin;
	}



}