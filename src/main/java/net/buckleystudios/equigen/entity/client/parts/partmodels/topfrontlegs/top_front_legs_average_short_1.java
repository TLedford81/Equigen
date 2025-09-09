package net.buckleystudios.equigen.entity.client.parts.partmodels.topfrontlegs;// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartFrontTopLegModel;
import net.buckleystudios.equigen.entity.client.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class top_front_legs_average_short_1 extends MultipartFrontTopLegModel<GeneticHorseEntity> {
	private final ModelPart top_front_legs_average_short_1;
	private final ModelPart chestAnchor;
	private final ModelPart kneeAnchor;

	public top_front_legs_average_short_1(ModelPart root) {
		this.top_front_legs_average_short_1 = root.getChild("top_front_legs_average_short_1");
		this.chestAnchor = this.top_front_legs_average_short_1.getChild("chestAnchor");
		this.kneeAnchor = this.top_front_legs_average_short_1.getChild("kneeAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition top_front_legs_average_short_1 = partdefinition.addOrReplaceChild("top_front_legs_average_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition top_front_legs_average_short_1_top_front_front = top_front_legs_average_short_1.addOrReplaceChild("top_front_legs_average_short_1_top_front_front", CubeListBuilder.create(), PartPose.offset(0.2152F, 2.2947F, -0.3889F));

		PartDefinition cube_r1 = top_front_legs_average_short_1_top_front_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(193, 180).addBox(-0.7848F, -1.0771F, -5.6637F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2152F, -3.1054F, -0.6095F, 1.789F, 0.0F, 0.0F));

		PartDefinition top_front_legs_average_short_1_top_front_middle = top_front_legs_average_short_1.addOrReplaceChild("top_front_legs_average_short_1_top_front_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_front_legs_average_short_1_top_front_back = top_front_legs_average_short_1.addOrReplaceChild("top_front_legs_average_short_1_top_front_back", CubeListBuilder.create(), PartPose.offset(0.058F, 1.9171F, 0.4318F));

		PartDefinition cube_r2 = top_front_legs_average_short_1_top_front_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(193, 173).addBox(-0.942F, -1.0808F, -5.7678F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.058F, -3.2293F, 0.5066F, 1.4399F, 0.0F, 0.0F));

		PartDefinition chestAnchor = top_front_legs_average_short_1.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.45F, -0.05F));

		PartDefinition kneeAnchor = top_front_legs_average_short_1.addOrReplaceChild("kneeAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.65F, 0.1F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		top_front_legs_average_short_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	@Override
	public ModelPart root() {
		return top_front_legs_average_short_1;
	}

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"chestAnchor", asTransform(this.chestAnchor),
				"kneeAnchor", asTransform(this.kneeAnchor));
	}

}