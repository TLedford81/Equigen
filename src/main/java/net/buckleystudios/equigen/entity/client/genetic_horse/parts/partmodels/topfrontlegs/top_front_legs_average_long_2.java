package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.topfrontlegs;// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartFrontTopLegModel;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class top_front_legs_average_long_2 extends MultipartFrontTopLegModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart top_front_legs_average_long_2;
	private final ModelPart chestAnchor;
	private final ModelPart kneeAnchor;

	public top_front_legs_average_long_2(ModelPart root) {
		this.root = root;
		this.top_front_legs_average_long_2 = root.getChild("top_front_legs_average_long_2");
		this.chestAnchor = this.top_front_legs_average_long_2.getChild("chestAnchor");
		this.kneeAnchor = this.top_front_legs_average_long_2.getChild("kneeAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition top_front_legs_average_long_2 = partdefinition.addOrReplaceChild("top_front_legs_average_long_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition top_front_legs_average_long_2_top_front_front = top_front_legs_average_long_2.addOrReplaceChild("top_front_legs_average_long_2_top_front_front", CubeListBuilder.create(), PartPose.offset(-0.1442F, 4.1755F, -0.6303F));

		PartDefinition cube_r1 = top_front_legs_average_long_2_top_front_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(402, 171).addBox(-1.1442F, -2.0F, -2.02F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1442F, 2.6929F, 1.6213F, 1.789F, 0.0F, 0.0F));

		PartDefinition top_front_legs_average_long_2_top_front_middle = top_front_legs_average_long_2.addOrReplaceChild("top_front_legs_average_long_2_top_front_middle", CubeListBuilder.create(), PartPose.offset(-0.1949F, 3.5349F, 0.3026F));

		PartDefinition cube_r2 = top_front_legs_average_long_2_top_front_middle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(429, 172).addBox(-1.1949F, -2.0F, -0.8316F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1949F, 3.6684F, 1.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition top_front_legs_average_long_2_top_front_back = top_front_legs_average_long_2.addOrReplaceChild("top_front_legs_average_long_2_top_front_back", CubeListBuilder.create(), PartPose.offset(0.1868F, 3.6966F, 0.809F));

		PartDefinition cube_r3 = top_front_legs_average_long_2_top_front_back.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(416, 170).mirror().addBox(-0.8132F, -2.0F, -1.84F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1868F, 2.7678F, 0.6442F, 1.4399F, 0.0F, 0.0F));

		PartDefinition chestAnchor = top_front_legs_average_long_2.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.15F, 0.15F));

		PartDefinition kneeAnchor = top_front_legs_average_long_2.addOrReplaceChild("kneeAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.4F, 0.3F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		top_front_legs_average_long_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	@Override
	public ModelPart root() {
		return root;
	}

	@Override
	public String animationRoot() {
		return "top_front_legs_average_long_2";
	}

	@Override
	public Map<String, PartTransform> computeAnchors() {
		return Map.of(
				"chestAnchor", asTransform(this.chestAnchor),
				"kneeAnchor", asTransform(this.kneeAnchor));
	}
}