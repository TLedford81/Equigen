package net.buckleystudios.equigen.entity.client.parts.partmodels.fronttoplegs;// Made with Blockbench 4.12.6
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

public class top_front_legs_thick_short_2 extends MultipartFrontTopLegModel<GeneticHorseEntity> {
	private final ModelPart top_front_legs_thick_short_2;
	private final ModelPart chestAnchor;
	private final ModelPart kneeAnchor;

	public top_front_legs_thick_short_2(ModelPart root) {
		this.top_front_legs_thick_short_2 = root.getChild("top_front_legs_thick_short_2");
		this.chestAnchor = this.top_front_legs_thick_short_2.getChild("chestAnchor");
		this.kneeAnchor = this.top_front_legs_thick_short_2.getChild("kneeAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition top_front_legs_thick_short_2 = partdefinition.addOrReplaceChild("top_front_legs_thick_short_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition top_front_legs_thick_short_2_top_front_front = top_front_legs_thick_short_2.addOrReplaceChild("top_front_legs_thick_short_2_top_front_front", CubeListBuilder.create(), PartPose.offset(-0.2152F, 2.3429F, -1.1228F));

		PartDefinition cube_r1 = top_front_legs_thick_short_2_top_front_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(220, 220).mirror().addBox(-1.2152F, -1.0771F, -5.6637F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2152F, -2.6173F, -0.5013F, 1.789F, 0.0F, 0.0F));

		PartDefinition top_front_legs_thick_short_2_top_front_middle = top_front_legs_thick_short_2.addOrReplaceChild("top_front_legs_thick_short_2_top_front_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top_front_legs_thick_short_2_top_front_back = top_front_legs_thick_short_2.addOrReplaceChild("top_front_legs_thick_short_2_top_front_back", CubeListBuilder.create(), PartPose.offset(-0.058F, 2.0712F, 0.3589F));

		PartDefinition cube_r2 = top_front_legs_thick_short_2_top_front_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(220, 211).mirror().addBox(-1.058F, -2.0808F, -5.7678F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.058F, -2.6683F, 0.9371F, 1.4399F, 0.0F, 0.0F));

		PartDefinition chestAnchor = top_front_legs_thick_short_2.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.25F, -0.25F));

		PartDefinition kneeAnchor = top_front_legs_thick_short_2.addOrReplaceChild("kneeAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.75F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		top_front_legs_thick_short_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	@Override
	public ModelPart root() {
		return top_front_legs_thick_short_2;
	}

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"chestAnchor", asTransform(this.chestAnchor),
				"kneeAnchor", asTransform(this.kneeAnchor));
	}
}