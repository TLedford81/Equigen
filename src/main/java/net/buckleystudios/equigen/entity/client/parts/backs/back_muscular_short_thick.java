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

public class back_muscular_short_thick extends HierarchicalModel<GeneticHorseEntity> {
	private final ModelPart back_muscular_short_thick;

	public back_muscular_short_thick(ModelPart root) {
		this.back_muscular_short_thick = root.getChild("back_muscular_short_thick");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition back_muscular_short_thick = partdefinition.addOrReplaceChild("back_muscular_short_thick", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition back_muscular_short_thick_back_ribs = back_muscular_short_thick.addOrReplaceChild("back_muscular_short_thick_back_ribs", CubeListBuilder.create().texOffs(204, 553).addBox(-4.0F, -4.0F, -5.5F, 8.0F, 8.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0429F, -0.0223F, -0.0179F));

		PartDefinition back_muscular_short_thick_back_top_lower = back_muscular_short_thick.addOrReplaceChild("back_muscular_short_thick_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.6257F));

		PartDefinition back_muscular_short_thick_back_top_lower_individual = back_muscular_short_thick_back_top_lower.addOrReplaceChild("back_muscular_short_thick_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(0.066F, -1.2494F, 0.6436F));

		PartDefinition cube_r1 = back_muscular_short_thick_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(231, 549).addBox(-6.08F, -6.24F, -5.52F, 7.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

		PartDefinition back_muscular_short_thick_back_top_upper = back_muscular_short_thick_back_top_lower.addOrReplaceChild("back_muscular_short_thick_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.4664F, 0.6872F));

		PartDefinition cube_r2 = back_muscular_short_thick_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(193, 548).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.1602F, 1.4702F, 1.6581F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		back_muscular_short_thick.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	public ModelPart root() {
		return back_muscular_short_thick;
	}
}