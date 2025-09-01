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

public class back_average_average_thick extends MultipartBackModel<GeneticHorseEntity> {
	private final ModelPart back_average_average_thick;
	private final ModelPart chestAnchor;
	private final ModelPart hipsAnchor;
	private final ModelPart stomachAnchor;
	private final ModelPart withersAnchor;

	public back_average_average_thick(ModelPart root) {
		this.back_average_average_thick = root.getChild("back_average_average_thick");
		this.chestAnchor = this.back_average_average_thick.getChild("chestAnchor");
		this.hipsAnchor = this.back_average_average_thick.getChild("hipsAnchor");
		this.stomachAnchor = this.back_average_average_thick.getChild("stomachAnchor");
		this.withersAnchor = this.back_average_average_thick.getChild("withersAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition back_average_average_thick = partdefinition.addOrReplaceChild("back_average_average_thick", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition back_average_average_thick_back_ribs = back_average_average_thick.addOrReplaceChild("back_average_average_thick_back_ribs", CubeListBuilder.create().texOffs(101, 518).addBox(-3.5F, -4.0F, -6.0F, 7.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0066F, -0.0223F, -0.071F));

		PartDefinition back_average_average_thick_back_top_lower = back_average_average_thick.addOrReplaceChild("back_average_average_thick_back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0894F));

		PartDefinition back_average_average_thick_back_top_lower_individual = back_average_average_thick_back_top_lower.addOrReplaceChild("back_average_average_thick_back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.2494F, 1.6269F));

		PartDefinition cube_r1 = back_average_average_thick_back_top_lower_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(127, 515).addBox(-5.08F, -6.24F, -5.52F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.6621F, 1.5137F, 1.6581F, 0.0F, 0.0F));

		PartDefinition back_average_average_thick_back_top_upper = back_average_average_thick_back_top_lower.addOrReplaceChild("back_average_average_thick_back_top_upper", CubeListBuilder.create(), PartPose.offset(0.0297F, -1.4664F, 1.6704F));

		PartDefinition cube_r2 = back_average_average_thick_back_top_upper.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(91, 514).addBox(-4.08F, -6.24F, -6.52F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.1602F, 1.4702F, 1.6581F, 0.0F, 0.0F));

		PartDefinition chestAnchor = back_average_average_thick.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.75F, -6.0F));

		PartDefinition hipsAnchor = back_average_average_thick.addOrReplaceChild("hipsAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.75F, 6.0F));

		PartDefinition stomachAnchor = back_average_average_thick.addOrReplaceChild("stomachAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition withersAnchor = back_average_average_thick.addOrReplaceChild("withersAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.75F, -6.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		back_average_average_thick.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	public ModelPart root() {
		return back_average_average_thick;
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