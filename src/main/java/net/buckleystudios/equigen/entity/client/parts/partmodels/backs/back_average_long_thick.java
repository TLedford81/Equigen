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

public class back_average_long_thick extends MultipartBackModel<GeneticHorseEntity> {
	private final ModelPart back_average_long_thick;
	private final ModelPart chestAnchor;
	private final ModelPart hipsAnchor;
	private final ModelPart stomachAnchor;
	private final ModelPart withersAnchor;
	private final ModelPart playerAnchor;

	public back_average_long_thick(ModelPart root) {
		this.back_average_long_thick = root.getChild("back_average_long_thick");
		this.chestAnchor = this.back_average_long_thick.getChild("chestAnchor");
		this.hipsAnchor = this.back_average_long_thick.getChild("hipsAnchor");
		this.stomachAnchor = this.back_average_long_thick.getChild("stomachAnchor");
		this.withersAnchor = this.back_average_long_thick.getChild("withersAnchor");
		this.playerAnchor = this.back_average_long_thick.getChild("playerAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition back_average_long_thick = partdefinition.addOrReplaceChild("back_average_long_thick", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition back_average_long_thick_back_ribs = back_average_long_thick.addOrReplaceChild("back_average_long_thick_back_ribs", CubeListBuilder.create().texOffs(294, 519).addBox(-3.5F, -4.0F, -6.5F, 7.0F, 8.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0066F, -0.0223F, 0.0547F));

		PartDefinition back_average_long_thick_back_top_lower = back_average_long_thick.addOrReplaceChild("back_average_long_thick_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.1788F));

		PartDefinition back_average_long_thick_back_top_lower_individual = back_average_long_thick_back_top_lower.addOrReplaceChild("back_average_long_thick_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.2059F, 2.0226F));

		PartDefinition cube_r1 = back_average_long_thick_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(321, 516).addBox(-5.08F, -7.24F, -5.52F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.7056F, 2.0118F, 1.6581F, 0.0F, 0.0F));

		PartDefinition back_average_long_thick_back_top_upper = back_average_long_thick_back_top_lower.addOrReplaceChild("back_average_long_thick_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.4229F, 2.0662F));

		PartDefinition cube_r2 = back_average_long_thick_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(285, 515).addBox(-4.08F, -7.24F, -6.52F, 4.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.2037F, 1.9683F, 1.6581F, 0.0F, 0.0F));

		PartDefinition chestAnchor = back_average_long_thick.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.75F, -6.25F));

		PartDefinition hipsAnchor = back_average_long_thick.addOrReplaceChild("hipsAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.75F, 6.5F));

		PartDefinition stomachAnchor = back_average_long_thick.addOrReplaceChild("stomachAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, 5.45F));

		PartDefinition withersAnchor = back_average_long_thick.addOrReplaceChild("withersAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.75F, -6.25F));

		PartDefinition playerAnchor = back_average_long_thick.addOrReplaceChild("playerAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.75F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.65F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		back_average_long_thick.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	public ModelPart root() {
		return back_average_long_thick;
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