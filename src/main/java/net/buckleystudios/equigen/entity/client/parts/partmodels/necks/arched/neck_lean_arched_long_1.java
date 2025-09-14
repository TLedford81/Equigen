package net.buckleystudios.equigen.entity.client.parts.partmodels.necks.arched;// Made with Blockbench 4.12.1
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

public class neck_lean_arched_long_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart neck_lean_arched_long_1;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;
	private final ModelPart withersAnchor;

	public neck_lean_arched_long_1(ModelPart root) {
		this.neck_lean_arched_long_1 = root.getChild("neck_lean_arched_long_1");
		this.headAnchor = this.neck_lean_arched_long_1.getChild("headAnchor");
		this.chestAnchor = this.neck_lean_arched_long_1.getChild("chestAnchor");
		this.withersAnchor = this.neck_lean_arched_long_1.getChild("withersAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_lean_arched_long_1 = partdefinition.addOrReplaceChild("neck_lean_arched_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_lean_arched_long_1_individual = neck_lean_arched_long_1.addOrReplaceChild("neck_lean_arched_long_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0245F, -1.5553F, -1.7338F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_long_1_crest = neck_lean_arched_long_1_individual.addOrReplaceChild("neck_lean_arched_long_1_crest", CubeListBuilder.create(), PartPose.offset(-0.0245F, -5.1486F, -0.4115F));

		PartDefinition neck_lean_arched_long_1_crest_upper = neck_lean_arched_long_1_crest.addOrReplaceChild("neck_lean_arched_long_1_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.0402F, -2.8104F, -2.4784F));

		PartDefinition cube_r1 = neck_lean_arched_long_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(586, 581).addBox(-3.1434F, -5.8622F, -2.7188F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1434F, 0.1751F, 2.5214F, 1.5708F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_long_1_crest_lower = neck_lean_arched_long_1_crest.addOrReplaceChild("neck_lean_arched_long_1_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.0926F, 1.0194F, 1.7049F));

		PartDefinition cube_r2 = neck_lean_arched_long_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(614, 571).addBox(-4.08F, -10.0F, -0.92F, 4.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 2.885F, 2.7718F, 0.7854F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_long_1_middle_individual = neck_lean_arched_long_1_individual.addOrReplaceChild("neck_lean_arched_long_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.0042F, -2.1312F, -0.1863F));

		PartDefinition cube_r3 = neck_lean_arched_long_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(598, 585).addBox(-5.0784F, -9.0F, -0.9017F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1077F, 5.5526F, -0.0171F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_lean_arched_long_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(598, 569).addBox(-4.0F, -10.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9707F, 2.6139F, 2.2422F, 0.7854F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_long_1_lower_individual = neck_lean_arched_long_1_individual.addOrReplaceChild("neck_lean_arched_long_1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = neck_lean_arched_long_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(614, 585).addBox(-4.0792F, -11.0F, -0.9108F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9538F, 5.8819F, 0.1126F, 0.3054F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_long_1_mane = neck_lean_arched_long_1.addOrReplaceChild("neck_lean_arched_long_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.2235F, 0.0F));

		PartDefinition neck_lean_arched_long_1_top_mane = neck_lean_arched_long_1_mane.addOrReplaceChild("neck_lean_arched_long_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.5308F, -2.2704F, -4.0146F));

		PartDefinition neck_lean_arched_long_1_top_mane_connector = neck_lean_arched_long_1_top_mane.addOrReplaceChild("neck_lean_arched_long_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.162F, 0.6257F));

		PartDefinition neck_lean_arched_long_1_top_mane_connector_individual = neck_lean_arched_long_1_top_mane_connector.addOrReplaceChild("neck_lean_arched_long_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

		PartDefinition cube_r6 = neck_lean_arched_long_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(930, 768).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_long_1_top_mane_connector2 = neck_lean_arched_long_1_top_mane_connector.addOrReplaceChild("neck_lean_arched_long_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

		PartDefinition neck_lean_arched_long_1_top_mane_connector2_individual = neck_lean_arched_long_1_top_mane_connector2.addOrReplaceChild("neck_lean_arched_long_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.5034F, -0.7469F));

		PartDefinition cube_r7 = neck_lean_arched_long_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(930, 777).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_long_1_top_mane_flow = neck_lean_arched_long_1_top_mane_connector2.addOrReplaceChild("neck_lean_arched_long_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1452F, 0.0F, -0.0894F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_lean_arched_long_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(916, 771).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

		PartDefinition neck_lean_arched_long_1_bottom_mane = neck_lean_arched_long_1_mane.addOrReplaceChild("neck_lean_arched_long_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.5308F, 1.3944F, 0.8122F));

		PartDefinition neck_lean_arched_long_1_bottom_mane_connector = neck_lean_arched_long_1_bottom_mane.addOrReplaceChild("neck_lean_arched_long_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

		PartDefinition neck_lean_arched_long_1_bottom_mane_connector_individual = neck_lean_arched_long_1_bottom_mane_connector.addOrReplaceChild("neck_lean_arched_long_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.1182F, -0.0743F));

		PartDefinition cube_r9 = neck_lean_arched_long_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(942, 763).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5567F, -3.2223F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_long_1_bottom_mane_connector2 = neck_lean_arched_long_1_bottom_mane_connector.addOrReplaceChild("neck_lean_arched_long_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));

		PartDefinition neck_lean_arched_long_1_bottom_mane_connector2_individual = neck_lean_arched_long_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_arched_long_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1452F, -0.5107F, -0.4867F));

		PartDefinition cube_r10 = neck_lean_arched_long_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(942, 777).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2603F, -3.6251F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_long_1_bottom_mane_flow = neck_lean_arched_long_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_arched_long_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.3575F, 0.0F));

		PartDefinition cube_r11 = neck_lean_arched_long_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(916, 771).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3576F, -0.8937F, -0.1201F, -0.1036F));

		PartDefinition headAnchor = neck_lean_arched_long_1.addOrReplaceChild("headAnchor", CubeListBuilder.create(), PartPose.offset(0.0F, -10.3827F, -6.9239F));

		PartDefinition cube_r12 = headAnchor.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_lean_arched_long_1.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1F, -1.25F, -1.75F));

		PartDefinition withersAnchor = neck_lean_arched_long_1.addOrReplaceChild("withersAnchor", CubeListBuilder.create(), PartPose.offset(-0.1F, -1.2346F, 3.3529F));

		PartDefinition cube_r13 = withersAnchor.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6545F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_lean_arched_long_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_lean_arched_long_1;
    }

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"headAnchor", asTransform(headAnchor),
				"chestAnchor", asTransform(chestAnchor));
	}

}