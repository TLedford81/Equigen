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

public class neck_lean_swan_long_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart neck_lean_swan_long_1;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;

	public neck_lean_swan_long_1(ModelPart root) {
		this.neck_lean_swan_long_1 = root.getChild("neck_lean_swan_long_1");
		this.headAnchor = this.neck_lean_swan_long_1.getChild("headAnchor");
		this.chestAnchor = this.neck_lean_swan_long_1.getChild("chestAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_lean_swan_long_1 = partdefinition.addOrReplaceChild("neck_lean_swan_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_lean_swan_long_1_individual = neck_lean_swan_long_1.addOrReplaceChild("neck_lean_swan_long_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_long_1_crest = neck_lean_swan_long_1_individual.addOrReplaceChild("neck_lean_swan_long_1_crest", CubeListBuilder.create(), PartPose.offset(-0.3575F, -9.6536F, -3.0391F));

		PartDefinition neck_lean_swan_long_1_crest_upper = neck_lean_swan_long_1_crest.addOrReplaceChild("neck_lean_swan_long_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1807F, 0.4673F, 0.7692F));

		PartDefinition cube_r1 = neck_lean_swan_long_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(605, 939).addBox(-3.0892F, -6.0F, -3.8808F, 3.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, 0.1605F, 0.3489F, 1.0908F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_long_1_crest_lower = neck_lean_swan_long_1_crest.addOrReplaceChild("neck_lean_swan_long_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1147F, 4.2621F, 3.6983F));

		PartDefinition cube_r2 = neck_lean_swan_long_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(595, 939).addBox(-3.08F, -12.0F, -0.92F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 5.78F, 3.9495F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_long_1_middle_individual = neck_lean_swan_long_1_individual.addOrReplaceChild("neck_lean_swan_long_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.2178F, -3.383F, -2.2097F));

		PartDefinition cube_r3 = neck_lean_swan_long_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(579, 923).addBox(-4.0F, -10.0F, -2.0F, 4.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0055F, 3.0849F, 2.6281F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_lean_swan_long_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(579, 939).addBox(-5.08F, -9.0F, -0.92F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0745F, 5.1222F, -0.6399F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_long_1_lower_individual = neck_lean_swan_long_1_individual.addOrReplaceChild("neck_lean_swan_long_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1174F, -2.3549F, -3.7072F));

		PartDefinition cube_r5 = neck_lean_swan_long_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(597, 924).addBox(-5.0784F, -9.0F, -0.9017F, 3.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 3.6548F, -0.3147F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_long_1_mane = neck_lean_swan_long_1.addOrReplaceChild("neck_lean_swan_long_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_long_1_top_mane = neck_lean_swan_long_1_mane.addOrReplaceChild("neck_lean_swan_long_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -3.6112F, -1.2437F));

		PartDefinition neck_lean_swan_long_1_top_mane_connector = neck_lean_swan_long_1_top_mane.addOrReplaceChild("neck_lean_swan_long_1_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -8.4022F, -1.7877F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_long_1_top_mane_connector_individual = neck_lean_swan_long_1_top_mane_connector.addOrReplaceChild("neck_lean_swan_long_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.7151F, 8.7598F, 1.5196F));

		PartDefinition cube_r6 = neck_lean_swan_long_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(931, 970).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3575F, -6.9721F, -2.0559F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_long_1_top_mane_connector2 = neck_lean_swan_long_1_top_mane_connector.addOrReplaceChild("neck_lean_swan_long_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.9832F, -0.8045F, -0.8045F));

		PartDefinition neck_lean_swan_long_1_top_mane_connector2_individual = neck_lean_swan_long_1_top_mane_connector2.addOrReplaceChild("neck_lean_swan_long_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(-0.2682F, 9.5642F, 2.324F));

		PartDefinition cube_r7 = neck_lean_swan_long_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(931, 978).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2346F, -7.0615F, -2.0559F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_long_1_top_mane_flow = neck_lean_swan_long_1_top_mane_connector2.addOrReplaceChild("neck_lean_swan_long_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_lean_swan_long_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(915, 972).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4086F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

		PartDefinition neck_lean_swan_long_1_bottom_mane = neck_lean_swan_long_1_mane.addOrReplaceChild("neck_lean_swan_long_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -7.8123F, 0.544F));

		PartDefinition neck_lean_swan_long_1_bottom_mane_connector = neck_lean_swan_long_1_bottom_mane.addOrReplaceChild("neck_lean_swan_long_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_long_1_bottom_mane_connector_individual = neck_lean_swan_long_1_bottom_mane_connector.addOrReplaceChild("neck_lean_swan_long_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 3.933F, -2.4134F));

		PartDefinition cube_r9 = neck_lean_swan_long_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(941, 967).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3674F, -6.6079F, -0.8832F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_long_1_bottom_mane_connector2 = neck_lean_swan_long_1_bottom_mane_connector.addOrReplaceChild("neck_lean_swan_long_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.2682F, -0.4469F, 0.8045F));

		PartDefinition neck_lean_swan_long_1_bottom_mane_connector2_individual = neck_lean_swan_long_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_swan_long_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(-0.2682F, 4.3799F, -3.2179F));

		PartDefinition cube_r10 = neck_lean_swan_long_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(942, 980).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.324F, -6.7039F, -0.8939F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_long_1_bottom_mane_flow = neck_lean_swan_long_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_swan_long_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.9665F, -0.0894F, -0.1788F));

		PartDefinition cube_r11 = neck_lean_swan_long_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(918, 974).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, -0.6257F, -0.0894F, -0.8937F, -0.1201F, -0.1036F));

		PartDefinition headAnchor = neck_lean_swan_long_1.addOrReplaceChild("headAnchor", CubeListBuilder.create(), PartPose.offset(-0.15F, -11.1827F, -8.1739F));

		PartDefinition cube_r12 = headAnchor.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_lean_swan_long_1.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.1F, -2.75F, -1.5F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_lean_swan_long_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_lean_swan_long_1;
    }


	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"headAnchor", asTransform(headAnchor),
				"chestAnchor", asTransform(chestAnchor));
	}

}