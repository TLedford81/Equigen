package net.buckleystudios.equigen.entity.client.parts.partmodels.necks.swan;// Made with Blockbench 4.12.1
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

public class neck_average_swan_long_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart neck_average_swan_long_1;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;

	public neck_average_swan_long_1(ModelPart root) {
		this.neck_average_swan_long_1 = root.getChild("neck_average_swan_long_1");
		this.headAnchor = this.neck_average_swan_long_1.getChild("headAnchor");
		this.chestAnchor = this.neck_average_swan_long_1.getChild("chestAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_average_swan_long_1 = partdefinition.addOrReplaceChild("neck_average_swan_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_average_swan_long_1_individual = neck_average_swan_long_1.addOrReplaceChild("neck_average_swan_long_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_long_1_crest = neck_average_swan_long_1_individual.addOrReplaceChild("neck_average_swan_long_1_crest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3575F, -9.6536F, -3.0391F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_long_1_crest_upper = neck_average_swan_long_1_crest.addOrReplaceChild("neck_average_swan_long_1_crest_upper", CubeListBuilder.create(), PartPose.offsetAndRotation(0.217F, 0.2351F, -0.2113F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r1 = neck_average_swan_long_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(607, 970).addBox(-4.0892F, -6.0F, -3.8808F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0892F, -0.0165F, 1.2194F, 1.0908F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_long_1_crest_lower = neck_average_swan_long_1_crest.addOrReplaceChild("neck_average_swan_long_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2405F, 4.208F, 3.3233F));

		PartDefinition cube_r2 = neck_average_swan_long_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(595, 971).addBox(-4.08F, -12.0F, -0.92F, 4.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 6.1022F, 3.4307F, 0.5236F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_long_1_middle_individual = neck_average_swan_long_1_individual.addOrReplaceChild("neck_average_swan_long_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1647F, -3.383F, -2.2097F));

		PartDefinition cube_r3 = neck_average_swan_long_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(577, 955).addBox(-4.0F, -10.0F, -2.0F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5055F, 3.0849F, 2.6281F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_average_swan_long_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(577, 971).addBox(-5.08F, -9.0F, -0.92F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5745F, 5.1222F, -0.6399F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_long_1_lower_individual = neck_average_swan_long_1_individual.addOrReplaceChild("neck_average_swan_long_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1174F, -2.3549F, -3.7072F));

		PartDefinition cube_r5 = neck_average_swan_long_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(597, 956).addBox(-5.0784F, -9.0F, -0.9017F, 3.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 3.6547F, -0.3147F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_long_1_mane = neck_average_swan_long_1.addOrReplaceChild("neck_average_swan_long_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.6871F, -1.8771F));

		PartDefinition neck_average_swan_long_1_top_mane = neck_average_swan_long_1_mane.addOrReplaceChild("neck_average_swan_long_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -4.0581F, -2.4951F));

		PartDefinition neck_average_swan_long_1_top_mane_connector = neck_average_swan_long_1_top_mane.addOrReplaceChild("neck_average_swan_long_1_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -0.2682F, 1.3408F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_long_1_top_mane_connector_individual = neck_average_swan_long_1_top_mane_connector.addOrReplaceChild("neck_average_swan_long_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

		PartDefinition cube_r6 = neck_average_swan_long_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(931, 970).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_long_1_top_mane_connector2 = neck_average_swan_long_1_top_mane_connector.addOrReplaceChild("neck_average_swan_long_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.9832F, -0.8045F, -0.8045F));

		PartDefinition neck_average_swan_long_1_top_mane_connector2_individual = neck_average_swan_long_1_top_mane_connector2.addOrReplaceChild("neck_average_swan_long_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.9665F, 0.1269F, -0.5098F));

		PartDefinition cube_r7 = neck_average_swan_long_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(931, 978).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_long_1_top_mane_flow = neck_average_swan_long_1_top_mane_connector2.addOrReplaceChild("neck_average_swan_long_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_average_swan_long_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(915, 972).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4086F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

		PartDefinition neck_average_swan_long_1_bottom_mane = neck_average_swan_long_1_mane.addOrReplaceChild("neck_average_swan_long_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -0.1251F, 2.4211F));

		PartDefinition neck_average_swan_long_1_bottom_mane_connector = neck_average_swan_long_1_bottom_mane.addOrReplaceChild("neck_average_swan_long_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_long_1_bottom_mane_connector_individual = neck_average_swan_long_1_bottom_mane_connector.addOrReplaceChild("neck_average_swan_long_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.2784F, 0.2301F));

		PartDefinition cube_r9 = neck_average_swan_long_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(941, 967).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9534F, -3.5267F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_long_1_bottom_mane_connector2 = neck_average_swan_long_1_bottom_mane_connector.addOrReplaceChild("neck_average_swan_long_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.2682F, -0.4469F, 0.8045F));

		PartDefinition neck_average_swan_long_1_bottom_mane_connector2_individual = neck_average_swan_long_1_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_long_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.3329F, -0.1823F));

		PartDefinition cube_r10 = neck_average_swan_long_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(942, 980).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6569F, -3.9295F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_long_1_bottom_mane_flow = neck_average_swan_long_1_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_long_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.9665F, -0.0894F, -0.1788F));

		PartDefinition cube_r11 = neck_average_swan_long_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(918, 974).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, -0.6257F, -0.0894F, -0.8937F, -0.1201F, -0.1036F));

		PartDefinition headAnchor = neck_average_swan_long_1.addOrReplaceChild("headAnchor", CubeListBuilder.create(), PartPose.offset(-0.25F, -11.3827F, -8.1739F));

		PartDefinition cube_r12 = headAnchor.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_average_swan_long_1.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.75F, -1.5F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_average_swan_long_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_average_swan_long_1;
    }

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"headAnchor", asTransform(headAnchor),
				"chestAnchor", asTransform(chestAnchor));
	}


}