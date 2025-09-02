package net.buckleystudios.equigen.entity.client.parts.partmodels.necks.ewed;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartNeckModel;
import net.buckleystudios.equigen.entity.client.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class neck_muscular_ewed_long_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart neck_muscular_ewed_long_1;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;

	public neck_muscular_ewed_long_1(ModelPart root) {
		this.neck_muscular_ewed_long_1 = root.getChild("neck_muscular_ewed_long_1");
		this.headAnchor = this.neck_muscular_ewed_long_1.getChild("headAnchor");
		this.chestAnchor = this.neck_muscular_ewed_long_1.getChild("chestAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_muscular_ewed_long_1 = partdefinition.addOrReplaceChild("neck_muscular_ewed_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_muscular_ewed_long_1_individual = neck_muscular_ewed_long_1.addOrReplaceChild("neck_muscular_ewed_long_1_individual", CubeListBuilder.create(), PartPose.offset(-0.0056F, -2.0916F, -0.4392F));

		PartDefinition neck_muscular_ewed_long_1_crest = neck_muscular_ewed_long_1_individual.addOrReplaceChild("neck_muscular_ewed_long_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -5.095F, -0.3575F));

		PartDefinition neck_muscular_ewed_long_1_crest_upper = neck_muscular_ewed_long_1_crest.addOrReplaceChild("neck_muscular_ewed_long_1_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.0995F, -2.2747F, -2.3729F));

		PartDefinition cube_r1 = neck_muscular_ewed_long_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(589, 777).addBox(-5.0792F, -4.0F, -2.8908F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5792F, 0.4175F, 0.1828F, 0.9599F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_long_1_crest_lower = neck_muscular_ewed_long_1_crest.addOrReplaceChild("neck_muscular_ewed_long_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.0086F, 1.6302F, 0.749F));

		PartDefinition cube_r2 = neck_muscular_ewed_long_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(607, 777).addBox(-5.08F, -7.0F, -0.92F, 5.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 1.6842F, 1.0816F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_long_1_middle_individual = neck_muscular_ewed_long_1_individual.addOrReplaceChild("neck_muscular_ewed_long_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1229F, -2.4963F, -1.7768F));

		PartDefinition cube_r3 = neck_muscular_ewed_long_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(588, 762).addBox(-5.0F, -8.0F, -1.0F, 6.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 2.6215F, 0.6148F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_long_1_lower_individual = neck_muscular_ewed_long_1_individual.addOrReplaceChild("neck_muscular_ewed_long_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1174F, -0.976F, -3.1326F));

		PartDefinition cube_r4 = neck_muscular_ewed_long_1_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(608, 762).addBox(-6.0784F, -8.0F, -0.9017F, 5.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 2.6991F, -0.4138F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_long_1_mane = neck_muscular_ewed_long_1.addOrReplaceChild("neck_muscular_ewed_long_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.4022F, 0.0F));

		PartDefinition neck_muscular_ewed_long_1_top_mane = neck_muscular_ewed_long_1_mane.addOrReplaceChild("neck_muscular_ewed_long_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -2.3598F, -1.5118F));

		PartDefinition neck_muscular_ewed_long_1_top_mane_connector = neck_muscular_ewed_long_1_top_mane.addOrReplaceChild("neck_muscular_ewed_long_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.5196F, -1.5196F));

		PartDefinition neck_muscular_ewed_long_1_top_mane_connector_individual = neck_muscular_ewed_long_1_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_long_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.395F, -0.7819F));

		PartDefinition cube_r5 = neck_muscular_ewed_long_1_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(929, 874).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3927F, 0.2456F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_long_1_top_mane_connector2 = neck_muscular_ewed_long_1_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_long_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

		PartDefinition neck_muscular_ewed_long_1_top_mane_connector2_individual = neck_muscular_ewed_long_1_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_long_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6452F, 0.2536F, -0.4057F));

		PartDefinition cube_r6 = neck_muscular_ewed_long_1_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(929, 880).addBox(-2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8023F, -0.0412F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_long_1_top_mane_flow = neck_muscular_ewed_long_1_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_long_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8603F, 0.0F, -0.0894F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r7 = neck_muscular_ewed_long_1_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(917, 874).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4712F, -0.2206F, -0.3514F));

		PartDefinition neck_muscular_ewed_long_1_bottom_mane = neck_muscular_ewed_long_1_mane.addOrReplaceChild("neck_muscular_ewed_long_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 0.6793F, 0.2759F));

		PartDefinition neck_muscular_ewed_long_1_bottom_mane_connector = neck_muscular_ewed_long_1_bottom_mane.addOrReplaceChild("neck_muscular_ewed_long_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

		PartDefinition neck_muscular_ewed_long_1_bottom_mane_connector_individual = neck_muscular_ewed_long_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_long_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.2784F, 0.2301F));

		PartDefinition cube_r8 = neck_muscular_ewed_long_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(941, 867).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9534F, -3.5267F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_long_1_bottom_mane_connector2 = neck_muscular_ewed_long_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_long_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));

		PartDefinition neck_muscular_ewed_long_1_bottom_mane_connector2_individual = neck_muscular_ewed_long_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_long_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, -0.114F, -0.1823F));

		PartDefinition cube_r9 = neck_muscular_ewed_long_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(940, 880).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.657F, -3.9295F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_long_1_bottom_mane_flow = neck_muscular_ewed_long_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_long_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.324F, -0.3575F, 0.0894F));

		PartDefinition cube_r10 = neck_muscular_ewed_long_1_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(916, 874).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));

		PartDefinition headAnchor = neck_muscular_ewed_long_1.addOrReplaceChild("headAnchor", CubeListBuilder.create(), PartPose.offset(-0.15F, -11.6327F, -6.4239F));

		PartDefinition cube_r11 = headAnchor.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_muscular_ewed_long_1.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1F, -2.0F, -2.5F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_muscular_ewed_long_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_muscular_ewed_long_1;
    }

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"headAnchor", asTransform(headAnchor),
				"chestAnchor", asTransform(chestAnchor));
	}

}