package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.necks.ewed;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartNeckModel;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class neck_lean_ewed_long_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart neck_lean_ewed_long_1;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;
	private final ModelPart withersAnchor;

	public neck_lean_ewed_long_1(ModelPart root) {
		this.neck_lean_ewed_long_1 = root.getChild("neck_lean_ewed_long_1");
		this.headAnchor = this.neck_lean_ewed_long_1.getChild("headAnchor");
		this.chestAnchor = this.neck_lean_ewed_long_1.getChild("chestAnchor");
		this.withersAnchor = this.neck_lean_ewed_long_1.getChild("withersAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_lean_ewed_long_1 = partdefinition.addOrReplaceChild("neck_lean_ewed_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_lean_ewed_long_1_individual = neck_lean_ewed_long_1.addOrReplaceChild("neck_lean_ewed_long_1_individual", CubeListBuilder.create(), PartPose.offset(-0.0056F, -2.0916F, -0.4392F));

		PartDefinition neck_lean_ewed_long_1_crest = neck_lean_ewed_long_1_individual.addOrReplaceChild("neck_lean_ewed_long_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.5587F, -1.2514F));

		PartDefinition neck_lean_ewed_long_1_crest_upper = neck_lean_ewed_long_1_crest.addOrReplaceChild("neck_lean_ewed_long_1_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.1534F, -2.8784F, -1.7941F));

		PartDefinition cube_r1 = neck_lean_ewed_long_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(596, 710).addBox(-3.08F, -4.0F, -2.92F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 0.3935F, 0.4677F, 0.9599F, 0.0F, 0.0F));

		PartDefinition neck_lean_ewed_long_1_crest_lower = neck_lean_ewed_long_1_crest.addOrReplaceChild("neck_lean_ewed_long_1_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1171F, 1.0939F, 1.6429F));

		PartDefinition cube_r2 = neck_lean_ewed_long_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(610, 710).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 1.6842F, 1.0816F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_lean_ewed_long_1_middle_individual = neck_lean_ewed_long_1_individual.addOrReplaceChild("neck_lean_ewed_long_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1955F, -2.4963F, -1.7768F));

		PartDefinition cube_r3 = neck_lean_ewed_long_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(595, 695).addBox(-3.0F, -8.0F, -1.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.6215F, 0.6148F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_lean_ewed_long_1_lower_individual = neck_lean_ewed_long_1_individual.addOrReplaceChild("neck_lean_ewed_long_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.19F, -0.976F, -3.1326F));

		PartDefinition cube_r4 = neck_lean_ewed_long_1_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(611, 695).addBox(-4.0784F, -8.0F, -0.9017F, 3.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 2.6991F, -0.4138F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_lean_ewed_long_1_mane = neck_lean_ewed_long_1.addOrReplaceChild("neck_lean_ewed_long_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.6704F, 0.0F));

		PartDefinition neck_lean_ewed_long1_top_mane = neck_lean_ewed_long_1_mane.addOrReplaceChild("neck_lean_ewed_long1_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -1.7341F, -1.5118F));

		PartDefinition neck_lean_ewed_long1_top_mane_connector = neck_lean_ewed_long1_top_mane.addOrReplaceChild("neck_lean_ewed_long1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.8771F, -1.5196F));

		PartDefinition neck_lean_ewed_long1_top_mane_connector_individual = neck_lean_ewed_long1_top_mane_connector.addOrReplaceChild("neck_lean_ewed_long1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.395F, -0.7819F));

		PartDefinition cube_r5 = neck_lean_ewed_long1_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(930, 842).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3927F, 0.2456F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_lean_ewed_long1_top_mane_connector2 = neck_lean_ewed_long1_top_mane_connector.addOrReplaceChild("neck_lean_ewed_long1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

		PartDefinition neck_lean_ewed_long1_top_mane_connector2_individual = neck_lean_ewed_long1_top_mane_connector2.addOrReplaceChild("neck_lean_ewed_long1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.2536F, -0.4057F));

		PartDefinition cube_r6 = neck_lean_ewed_long1_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(930, 850).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8023F, -0.0412F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_lean_ewed_long1_top_mane_flow = neck_lean_ewed_long1_top_mane_connector2.addOrReplaceChild("neck_lean_ewed_long1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1452F, 0.0F, -0.0894F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r7 = neck_lean_ewed_long1_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(918, 844).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4712F, -0.2206F, -0.3514F));

		PartDefinition neck_lean_ewed_long1_bottom_mane = neck_lean_ewed_long_1_mane.addOrReplaceChild("neck_lean_ewed_long1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 0.9475F, 0.2759F));

		PartDefinition neck_lean_ewed_long1_bottom_mane_connector = neck_lean_ewed_long1_bottom_mane.addOrReplaceChild("neck_lean_ewed_long1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

		PartDefinition neck_lean_ewed_long1_bottom_mane_connector_individual = neck_lean_ewed_long1_bottom_mane_connector.addOrReplaceChild("neck_lean_ewed_long1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.2784F, 0.2301F));

		PartDefinition cube_r8 = neck_lean_ewed_long1_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(941, 837).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9534F, -3.5267F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_lean_ewed_long1_bottom_mane_connector2 = neck_lean_ewed_long1_bottom_mane_connector.addOrReplaceChild("neck_lean_ewed_long1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));

		PartDefinition neck_lean_ewed_long1_bottom_mane_connector2_individual = neck_lean_ewed_long1_bottom_mane_connector2.addOrReplaceChild("neck_lean_ewed_long1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, -0.114F, -0.1823F));

		PartDefinition cube_r9 = neck_lean_ewed_long1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(941, 850).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.657F, -3.9295F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_lean_ewed_long1_bottom_mane_flow = neck_lean_ewed_long1_bottom_mane_connector2.addOrReplaceChild("neck_lean_ewed_long1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.3575F, 0.0894F));

		PartDefinition cube_r10 = neck_lean_ewed_long1_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(917, 844).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));

		PartDefinition headAnchor = neck_lean_ewed_long_1.addOrReplaceChild("headAnchor", CubeListBuilder.create(), PartPose.offset(-0.15F, -11.6327F, -6.4239F));

		PartDefinition cube_r11 = headAnchor.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_lean_ewed_long_1.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1F, -1.75F, -2.5F));

		PartDefinition withersAnchor = neck_lean_ewed_long_1.addOrReplaceChild("withersAnchor", CubeListBuilder.create(), PartPose.offset(-0.2F, -1.8346F, 2.6529F));

		PartDefinition cube_r12 = withersAnchor.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_lean_ewed_long_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_lean_ewed_long_1;
    }

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"headAnchor", asTransform(headAnchor),
				"chestAnchor", asTransform(chestAnchor),
				"withersAnchor", asTransform(withersAnchor));
	}

}