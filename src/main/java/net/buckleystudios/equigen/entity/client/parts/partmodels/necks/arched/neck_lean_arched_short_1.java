package net.buckleystudios.equigen.entity.client.parts.partmodels.necks.arched;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.buckleystudios.equigen.entity.client.parts.MultipartNeckModel;
import net.buckleystudios.equigen.entity.client.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class neck_lean_arched_short_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart neck_lean_arched_short_1;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;
	private final ModelPart withersAnchor;

	public neck_lean_arched_short_1(ModelPart root) {
		this.neck_lean_arched_short_1 = root.getChild("neck_lean_arched_short_1");
		this.headAnchor = this.neck_lean_arched_short_1.getChild("headAnchor");
		this.chestAnchor = this.neck_lean_arched_short_1.getChild("chestAnchor");
		this.withersAnchor = this.neck_lean_arched_short_1.getChild("withersAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_lean_arched_short_1 = partdefinition.addOrReplaceChild("neck_lean_arched_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_lean_arched_short_1_individual = neck_lean_arched_short_1.addOrReplaceChild("neck_lean_arched_short_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2927F, 2.6458F, -0.5718F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_1_crest = neck_lean_arched_short_1_individual.addOrReplaceChild("neck_lean_arched_short_1_crest", CubeListBuilder.create(), PartPose.offset(-0.2927F, -6.8469F, -0.2327F));

		PartDefinition neck_lean_arched_short_1_crest_upper = neck_lean_arched_short_1_crest.addOrReplaceChild("neck_lean_arched_short_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.2279F, -1.3802F, -1.4952F));

		PartDefinition cube_r1 = neck_lean_arched_short_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(392, 583).addBox(-3.1434F, -5.8622F, -2.7188F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1434F, 0.2644F, 2.3426F, 1.5708F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_1_crest_lower = neck_lean_arched_short_1_crest.addOrReplaceChild("neck_lean_arched_short_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1756F, 0.7513F, 0.8261F));

		PartDefinition cube_r2 = neck_lean_arched_short_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(364, 583).addBox(-4.08F, -10.0F, -0.92F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 4.6528F, 4.5396F, 0.7854F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_1_middle_individual = neck_lean_arched_short_1_individual.addOrReplaceChild("neck_lean_arched_short_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.2724F, -4.1169F, -0.5094F));

		PartDefinition cube_r3 = neck_lean_arched_short_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(376, 583).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1077F, 6.9822F, 0.7481F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_lean_arched_short_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(365, 572).addBox(-4.0F, -10.0F, -1.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9707F, 4.401F, 3.6331F, 0.7854F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_1_lower_individual = neck_lean_arched_short_1_individual.addOrReplaceChild("neck_lean_arched_short_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.2065F, -2.289F, -0.4565F));

		PartDefinition cube_r5 = neck_lean_arched_short_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(381, 573).addBox(-4.08F, -11.0F, -0.92F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 8.0069F, 1.0273F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_1_mane = neck_lean_arched_short_1.addOrReplaceChild("neck_lean_arched_short_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -5.5419F, 0.8045F));

		PartDefinition neck_lean_arched_short_1_top_mane = neck_lean_arched_short_1_mane.addOrReplaceChild("neck_lean_arched_short_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, -1.019F, -1.6906F));

		PartDefinition neck_lean_arched_short_1_top_mane_connector = neck_lean_arched_short_1_top_mane.addOrReplaceChild("neck_lean_arched_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -0.8939F, -0.5363F));

		PartDefinition neck_lean_arched_short_1_top_mane_connector_individual = neck_lean_arched_short_1_top_mane_connector.addOrReplaceChild("neck_lean_arched_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

		PartDefinition cube_r6 = neck_lean_arched_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(723, 769).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_1_top_mane_connector2 = neck_lean_arched_short_1_top_mane_connector.addOrReplaceChild("neck_lean_arched_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.4469F));

		PartDefinition neck_lean_arched_short_1_top_mane_connector2_individual = neck_lean_arched_short_1_top_mane_connector2.addOrReplaceChild("neck_lean_arched_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1452F, 0.5034F, -0.3893F));

		PartDefinition cube_r7 = neck_lean_arched_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(723, 776).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_1_top_mane_flow = neck_lean_arched_short_1_top_mane_connector2.addOrReplaceChild("neck_lean_arched_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1452F, 0.0F, 0.2681F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_lean_arched_short_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(709, 770).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0256F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

		PartDefinition neck_lean_arched_short_1_bottom_mane = neck_lean_arched_short_1_mane.addOrReplaceChild("neck_lean_arched_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, 2.914F, 1.9742F));

		PartDefinition neck_lean_arched_short_1_bottom_mane_connector = neck_lean_arched_short_1_bottom_mane.addOrReplaceChild("neck_lean_arched_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

		PartDefinition neck_lean_arched_short_1_bottom_mane_connector_individual = neck_lean_arched_short_1_bottom_mane_connector.addOrReplaceChild("neck_lean_arched_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -2.1016F, -1.5962F));

		PartDefinition cube_r9 = neck_lean_arched_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(732, 772).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5733F, -1.7004F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_1_bottom_mane_connector2 = neck_lean_arched_short_1_bottom_mane_connector.addOrReplaceChild("neck_lean_arched_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -2.4134F, -0.8045F));

		PartDefinition neck_lean_arched_short_1_bottom_mane_connector2_individual = neck_lean_arched_short_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_arched_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, -0.0806F, -0.3996F));

		PartDefinition cube_r10 = neck_lean_arched_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(730, 781).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.2769F, -2.1032F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_1_bottom_mane_flow = neck_lean_arched_short_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_arched_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.1788F, 0.0F));

		PartDefinition cube_r11 = neck_lean_arched_short_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(714, 775).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, 1.4302F, 1.2514F, -0.8937F, -0.1201F, -0.1036F));

		PartDefinition headAnchor = neck_lean_arched_short_1.addOrReplaceChild("headAnchor", CubeListBuilder.create(), PartPose.offset(0.25F, -6.1327F, -4.6739F));

		PartDefinition cube_r12 = headAnchor.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_lean_arched_short_1.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1F, -1.0F, -1.0F));

		PartDefinition withersAnchor = neck_lean_arched_short_1.addOrReplaceChild("withersAnchor", CubeListBuilder.create(), PartPose.offset(0.2F, -0.8346F, 2.6529F));

		PartDefinition cube_r13 = withersAnchor.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6545F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_lean_arched_short_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_lean_arched_short_1;
    }

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"headAnchor", asTransform(headAnchor),
				"chestAnchor", asTransform(chestAnchor),
				"withersAnchor", asTransform(withersAnchor));
	}

	@Override
	public void beforeAttached(GeneticHorseEntity entity, float partialTicks, PoseStack pose) {
		super.beforeAttached(entity, partialTicks, pose);
		float rx = getPitch(entity, "arched");
		float ry = getNetYaw(entity, partialTicks);
		pose.mulPose(Axis.XP.rotation(rx));
		pose.mulPose(Axis.YP.rotation(ry));
	}
}