package net.buckleystudios.equigen.entity.client.parts.partmodels.necks.straight;// Made with Blockbench 4.12.1
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

public class neck_average_straight_short_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart neck_average_straight_short_1;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;

	public neck_average_straight_short_1(ModelPart root) {
		this.neck_average_straight_short_1 = root.getChild("neck_average_straight_short_1");
		this.headAnchor = this.neck_average_straight_short_1.getChild("headAnchor");
		this.chestAnchor = this.neck_average_straight_short_1.getChild("chestAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_average_straight_short_1 = partdefinition.addOrReplaceChild("neck_average_straight_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_average_straight_short_1_individual = neck_average_straight_short_1.addOrReplaceChild("neck_average_straight_short_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, 0.8939F, 0.0894F, -0.5672F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_short_1_crest = neck_average_straight_short_1_individual.addOrReplaceChild("neck_average_straight_short_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -3.8436F, -3.5754F));

		PartDefinition neck_average_straight_short_1_crest_upper = neck_average_straight_short_1_crest.addOrReplaceChild("neck_average_straight_short_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3997F, -0.7255F, -0.7987F));

		PartDefinition cube_r1 = neck_average_straight_short_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(360, 865).addBox(-3.08F, -4.0F, -3.92F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -0.9328F, 0.5736F, 1.6144F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_short_1_crest_lower = neck_average_straight_short_1_crest.addOrReplaceChild("neck_average_straight_short_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.3298F, -0.4383F, 1.9514F));

		PartDefinition cube_r2 = neck_average_straight_short_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(378, 865).addBox(-4.08F, -5.0F, -0.92F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 1.129F, 2.232F, 1.1345F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_short_1_middle_individual = neck_average_straight_short_1_individual.addOrReplaceChild("neck_average_straight_short_1_middle_individual", CubeListBuilder.create(), PartPose.offset(0.3874F, -1.319F, -2.6837F));

		PartDefinition cube_r3 = neck_average_straight_short_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(360, 854).addBox(-5.0708F, -11.03F, -0.9292F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5811F, 6.8804F, 4.3189F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_average_straight_short_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(378, 855).addBox(-4.0F, -7.0F, -1.0F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4897F, 1.3769F, 3.9638F, 1.1345F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_short_1_lower_individual = neck_average_straight_short_1_individual.addOrReplaceChild("neck_average_straight_short_1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3826F, -0.2308F, -4.2206F));

		PartDefinition cube_r5 = neck_average_straight_short_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(374, 846).addBox(-5.0784F, -5.0F, -0.9017F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 2.3336F, 1.4179F, 0.9599F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_short_1_mane = neck_average_straight_short_1.addOrReplaceChild("neck_average_straight_short_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -5.7207F, 0.0F));

		PartDefinition neck_average_straight_short_1_top_mane = neck_average_straight_short_1_mane.addOrReplaceChild("neck_average_straight_short_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.6201F, -0.5721F, -0.171F));

		PartDefinition neck_average_straight_short_1_top_mane_connector = neck_average_straight_short_1_top_mane.addOrReplaceChild("neck_average_straight_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.9832F, -2.0559F));

		PartDefinition neck_average_straight_short_1_top_mane_connector_individual = neck_average_straight_short_1_top_mane_connector.addOrReplaceChild("neck_average_straight_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

		PartDefinition cube_r6 = neck_average_straight_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(722, 933).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_short_1_top_mane_connector2 = neck_average_straight_short_1_top_mane_connector.addOrReplaceChild("neck_average_straight_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

		PartDefinition neck_average_straight_short_1_top_mane_connector2_individual = neck_average_straight_short_1_top_mane_connector2.addOrReplaceChild("neck_average_straight_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.3771F, 0.2024F, -0.0684F));

		PartDefinition cube_r7 = neck_average_straight_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(724, 940).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_short_1_top_mane_flow = neck_average_straight_short_1_top_mane_connector2.addOrReplaceChild("neck_average_straight_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5028F, -0.3575F, 0.0894F, -0.1326F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_average_straight_short_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(710, 934).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

		PartDefinition neck_average_straight_short_1_bottom_mane = neck_average_straight_short_1_mane.addOrReplaceChild("neck_average_straight_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6201F, 1.9307F, 1.6167F));

		PartDefinition neck_average_straight_short_1_bottom_mane_connector = neck_average_straight_short_1_bottom_mane.addOrReplaceChild("neck_average_straight_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

		PartDefinition neck_average_straight_short_1_bottom_mane_connector_individual = neck_average_straight_short_1_bottom_mane_connector.addOrReplaceChild("neck_average_straight_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 0.1093F, -0.1889F));

		PartDefinition cube_r9 = neck_average_straight_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(736, 940).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6948F, -3.1077F, -0.9599F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_short_1_bottom_mane_connector2 = neck_average_straight_short_1_bottom_mane_connector.addOrReplaceChild("neck_average_straight_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.7151F, 0.6257F));

		PartDefinition neck_average_straight_short_1_bottom_mane_connector2_individual = neck_average_straight_short_1_bottom_mane_connector2.addOrReplaceChild("neck_average_straight_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, 0.4498F, -0.4099F));

		PartDefinition cube_r10 = neck_average_straight_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(724, 947).addBox(-2.0F, -2.0F, 1.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.4163F, -3.523F, -0.9599F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_short_1_bottom_mane_flow = neck_average_straight_short_1_bottom_mane_connector2.addOrReplaceChild("neck_average_straight_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.5922F, 0.1788F, -0.0894F));

		PartDefinition cube_r11 = neck_average_straight_short_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(716, 940).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2681F, 0.0F, -0.9774F, -0.0927F, -0.1377F));

		PartDefinition headAnchor = neck_average_straight_short_1.addOrReplaceChild("headAnchor", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0F, -4.116F));

		PartDefinition cube_r12 = headAnchor.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_average_straight_short_1.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.75F, -2.25F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_average_straight_short_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_average_straight_short_1;
    }

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"headAnchor", asTransform(headAnchor),
				"chestAnchor", asTransform(chestAnchor));
	}

}