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

public class top_front_legs_thick_long_1 extends MultipartFrontTopLegModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart top_front_legs_thick_long_1;
	private final ModelPart chestAnchor;
	private final ModelPart kneeAnchor;

	public top_front_legs_thick_long_1(ModelPart root) {
		this.root = root;
		this.top_front_legs_thick_long_1 = root.getChild("top_front_legs_thick_long_1");
		this.chestAnchor = this.top_front_legs_thick_long_1.getChild("chestAnchor");
		this.kneeAnchor = this.top_front_legs_thick_long_1.getChild("kneeAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition top_front_legs_thick_long_1 = partdefinition.addOrReplaceChild("top_front_legs_thick_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition top_front_legs_thick_long_1_top_front_front = top_front_legs_thick_long_1.addOrReplaceChild("top_front_legs_thick_long_1_top_front_front", CubeListBuilder.create(), PartPose.offset(-0.1442F, 3.3179F, -0.5159F));

		PartDefinition cube_r1 = top_front_legs_thick_long_1_top_front_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(387, 213).mirror().addBox(-1.1442F, -2.0F, -0.02F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1442F, 4.2656F, 1.4578F, 1.789F, 0.0F, 0.0F));

		PartDefinition top_front_legs_thick_long_1_top_front_middle = top_front_legs_thick_long_1.addOrReplaceChild("top_front_legs_thick_long_1_top_front_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_front_legs_thick_long_1_top_front_back = top_front_legs_thick_long_1.addOrReplaceChild("top_front_legs_thick_long_1_top_front_back", CubeListBuilder.create(), PartPose.offset(0.1868F, 3.3644F, 0.7216F));

		PartDefinition cube_r2 = top_front_legs_thick_long_1_top_front_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(388, 202).mirror().addBox(-0.8132F, -3.0F, -0.84F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1868F, 3.2787F, 1.2189F, 1.4835F, 0.0F, 0.0F));

		PartDefinition chestAnchor = top_front_legs_thick_long_1.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.35F, 0.15F));

		PartDefinition kneeAnchor = top_front_legs_thick_long_1.addOrReplaceChild("kneeAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.3F, 0.5F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		top_front_legs_thick_long_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	@Override
	public ModelPart root() {
		return root;
	}

	@Override
	public String animationRoot() {
		return "top_front_legs_thick_long_1";
	}

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"chestAnchor", asTransform(this.chestAnchor),
				"kneeAnchor", asTransform(this.kneeAnchor));
	}
}