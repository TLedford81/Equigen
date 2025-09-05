package net.buckleystudios.equigen.entity.client.parts.partmodels.backs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartBackModel;
import net.buckleystudios.equigen.entity.client.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class back_muscular_average_thin extends MultipartBackModel<GeneticHorseEntity> {
	private final ModelPart back_muscular_average_thin;
	private final ModelPart chestAnchor;
	private final ModelPart hipsAnchor;
	private final ModelPart stomachAnchor;
	private final ModelPart withersAnchor;

	public back_muscular_average_thin(ModelPart root) {
		this.back_muscular_average_thin = root.getChild("back_muscular_average_thin");
		this.chestAnchor = this.back_muscular_average_thin.getChild("chestAnchor");
		this.hipsAnchor = this.back_muscular_average_thin.getChild("hipsAnchor");
		this.stomachAnchor = this.back_muscular_average_thin.getChild("stomachAnchor");
		this.withersAnchor = this.back_muscular_average_thin.getChild("withersAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition back_muscular_average_thin = partdefinition.addOrReplaceChild("back_muscular_average_thin", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition back_muscular_average_thin_back_ribs = back_muscular_average_thin.addOrReplaceChild("back_muscular_average_thin_back_ribs", CubeListBuilder.create().texOffs(268, 554).addBox(-4.0F, -3.0F, -6.0F, 8.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0465F, 0.1397F, 0.0184F));

		PartDefinition back_muscular_average_thin_back_top_lower = back_muscular_average_thin.addOrReplaceChild("back_muscular_average_thin_back_top_lower", CubeListBuilder.create(), PartPose.offset(-0.1788F, 0.0F, -0.0894F));

		PartDefinition back_muscular_average_thin_back_top_lower_individual = back_muscular_average_thin_back_top_lower.addOrReplaceChild("back_muscular_average_thin_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(0.1554F, -0.5855F, 1.8515F));

		PartDefinition cube_r1 = back_muscular_average_thin_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(296, 552).addBox(-6.08F, -6.24F, -4.52F, 7.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.164F, 1.5573F, 1.6581F, 0.0F, 0.0F));

		PartDefinition back_muscular_average_thin_back_top_upper = back_muscular_average_thin_back_top_lower.addOrReplaceChild("back_muscular_average_thin_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.8025F, 1.895F));

		PartDefinition cube_r2 = back_muscular_average_thin_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(260, 551).addBox(-4.08F, -6.24F, -5.52F, 4.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

		PartDefinition chestAnchor = back_muscular_average_thin.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.75F, -5.75F));

		PartDefinition hipsAnchor = back_muscular_average_thin.addOrReplaceChild("hipsAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.75F, 6.0F));

		PartDefinition stomachAnchor = back_muscular_average_thin.addOrReplaceChild("stomachAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.25F, 4.9F));

		PartDefinition withersAnchor = back_muscular_average_thin.addOrReplaceChild("withersAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.75F, -5.75F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		back_muscular_average_thin.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	public ModelPart root() {
		return back_muscular_average_thin;
	}

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"chestAnchor",  asTransform(this.chestAnchor),
				"hipsAnchor", asTransform(this.hipsAnchor),
				"stomachAnchor", asTransform(this.stomachAnchor),
				"withersAnchor", asTransform(this.withersAnchor)
		);
	}

}