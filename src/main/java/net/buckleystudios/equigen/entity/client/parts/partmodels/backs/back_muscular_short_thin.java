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

public class back_muscular_short_thin extends MultipartBackModel<GeneticHorseEntity> {
	private final ModelPart back_muscular_short_thin;
	private final ModelPart chestAnchor;
	private final ModelPart hipsAnchor;
	private final ModelPart stomachAnchor;
	private final ModelPart withersAnchor;
	private final ModelPart playerAnchor;

	public back_muscular_short_thin(ModelPart root) {
		this.back_muscular_short_thin = root.getChild("back_muscular_short_thin");
		this.chestAnchor = this.back_muscular_short_thin.getChild("chestAnchor");
		this.hipsAnchor = this.back_muscular_short_thin.getChild("hipsAnchor");
		this.stomachAnchor = this.back_muscular_short_thin.getChild("stomachAnchor");
		this.withersAnchor = this.back_muscular_short_thin.getChild("withersAnchor");
		this.playerAnchor = this.back_muscular_short_thin.getChild("playerAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition back_muscular_short_thin = partdefinition.addOrReplaceChild("back_muscular_short_thin", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition back_muscular_short_thin_back_ribs = back_muscular_short_thin.addOrReplaceChild("back_muscular_short_thin_back_ribs", CubeListBuilder.create().texOffs(68, 553).addBox(-4.0F, -3.0F, -5.5F, 8.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0465F, 0.1397F, -0.0179F));

		PartDefinition back_muscular_short_thin_back_top_lower = back_muscular_short_thin.addOrReplaceChild("back_muscular_short_thin_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.6257F));

		PartDefinition back_muscular_short_thin_back_top_lower_individual = back_muscular_short_thin_back_top_lower.addOrReplaceChild("back_muscular_short_thin_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0233F, -0.5855F, 0.6F));

		PartDefinition cube_r1 = back_muscular_short_thin_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(95, 550).addBox(-6.08F, -6.24F, -4.52F, 7.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.164F, 1.5573F, 1.6581F, 0.0F, 0.0F));

		PartDefinition back_muscular_short_thin_back_top_upper = back_muscular_short_thin_back_top_lower.addOrReplaceChild("back_muscular_short_thin_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -0.8025F, 0.6436F));

		PartDefinition cube_r2 = back_muscular_short_thin_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(59, 549).addBox(-4.08F, -6.24F, -5.52F, 4.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

		PartDefinition chestAnchor = back_muscular_short_thin.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.75F, -5.5F));

		PartDefinition hipsAnchor = back_muscular_short_thin.addOrReplaceChild("hipsAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.75F, 5.75F));

		PartDefinition stomachAnchor = back_muscular_short_thin.addOrReplaceChild("stomachAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.25F, 4.4F));

		PartDefinition withersAnchor = back_muscular_short_thin.addOrReplaceChild("withersAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.75F, -5.5F));

		PartDefinition playerAnchor = back_muscular_short_thin.addOrReplaceChild("playerAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.75F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.75F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		back_muscular_short_thin.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	public ModelPart root() {
		return back_muscular_short_thin;
	}

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"chestAnchor",  asTransform(this.chestAnchor),
				"hipsAnchor", asTransform(this.hipsAnchor),
				"stomachAnchor", asTransform(this.stomachAnchor),
				"withersAnchor", asTransform(this.withersAnchor),
				"playerAnchor", asTransform(this.playerAnchor)
		);
	}
	
}