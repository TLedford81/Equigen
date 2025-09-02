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

public class neck_average_swan_average_2 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart neck_average_swan_average_2;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;

	public neck_average_swan_average_2(ModelPart root) {
		this.neck_average_swan_average_2 = root.getChild("neck_average_swan_average_2");
		this.headAnchor = this.neck_average_swan_average_2.getChild("headAnchor");
		this.chestAnchor = this.neck_average_swan_average_2.getChild("chestAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_average_swan_average_2 = partdefinition.addOrReplaceChild("neck_average_swan_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_average_swan_average_2_individual = neck_average_swan_average_2.addOrReplaceChild("neck_average_swan_average_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_average_2_crest = neck_average_swan_average_2_individual.addOrReplaceChild("neck_average_swan_average_2_crest", CubeListBuilder.create(), PartPose.offset(-0.3575F, -9.1173F, -1.3408F));

		PartDefinition neck_average_swan_average_2_crest_upper = neck_average_swan_average_2_crest.addOrReplaceChild("neck_average_swan_average_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1444F, 0.6461F, -0.4822F));

		PartDefinition cube_r1 = neck_average_swan_average_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(549, 975).addBox(-3.0892F, -6.0F, -3.8808F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0892F, 0.1605F, 0.7064F, 1.0908F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_average_2_crest_lower = neck_average_swan_average_2_crest.addOrReplaceChild("neck_average_swan_average_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1511F, 4.0312F, 2.4283F));

		PartDefinition cube_r2 = neck_average_swan_average_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(537, 975).addBox(-4.08F, -12.0F, -0.92F, 4.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 6.1895F, 4.2363F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_average_2_middle_individual = neck_average_swan_average_2_individual.addOrReplaceChild("neck_average_swan_average_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1731F, -3.1203F, -1.6937F));

		PartDefinition cube_r3 = neck_average_swan_average_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(518, 960).addBox(-5.0F, -10.0F, -2.0F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4971F, 3.5373F, 2.8271F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_average_swan_average_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(519, 975).addBox(-5.08F, -9.0F, -0.92F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5829F, 5.5745F, -0.4408F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_average_2_lower_individual = neck_average_swan_average_2_individual.addOrReplaceChild("neck_average_swan_average_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.2068F, -2.128F, -3.1004F));

		PartDefinition cube_r5 = neck_average_swan_average_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(538, 961).addBox(-4.8996F, -9.0F, -0.9017F, 3.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3996F, 4.1429F, -0.2065F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_average_2_mane = neck_average_swan_average_2.addOrReplaceChild("neck_average_swan_average_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.1508F, -0.9832F));

		PartDefinition neck_average_swan_average_2_top_mane = neck_average_swan_average_2_mane.addOrReplaceChild("neck_average_swan_average_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -1.9128F, -3.0314F));

		PartDefinition neck_average_swan_average_2_top_mane_connector = neck_average_swan_average_2_top_mane.addOrReplaceChild("neck_average_swan_average_2_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -2.2346F, 1.6983F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_average_2_top_mane_connector_individual = neck_average_swan_average_2_top_mane_connector.addOrReplaceChild("neck_average_swan_average_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

		PartDefinition cube_r6 = neck_average_swan_average_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(874, 973).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_average_2_top_mane_connector2 = neck_average_swan_average_2_top_mane_connector.addOrReplaceChild("neck_average_swan_average_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.9832F, -0.8045F, -0.8045F));

		PartDefinition neck_average_swan_average_2_top_mane_connector2_individual = neck_average_swan_average_2_top_mane_connector2.addOrReplaceChild("neck_average_swan_average_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.9665F, 0.1269F, -0.5098F));

		PartDefinition cube_r7 = neck_average_swan_average_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(874, 981).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_average_2_top_mane_flow = neck_average_swan_average_2_top_mane_connector2.addOrReplaceChild("neck_average_swan_average_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_average_swan_average_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(860, 975).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4085F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

		PartDefinition neck_average_swan_average_2_bottom_mane = neck_average_swan_average_2_mane.addOrReplaceChild("neck_average_swan_average_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(-1.3463F, 0.0536F, 2.2424F));

		PartDefinition neck_average_swan_average_2_bottom_mane_connector = neck_average_swan_average_2_bottom_mane.addOrReplaceChild("neck_average_swan_average_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3575F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_average_2_bottom_mane_connector_individual = neck_average_swan_average_2_bottom_mane_connector.addOrReplaceChild("neck_average_swan_average_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.4401F, -0.1182F, -0.0743F));

		PartDefinition cube_r9 = neck_average_swan_average_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(884, 972).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5567F, -3.2223F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_average_2_bottom_mane_connector2 = neck_average_swan_average_2_bottom_mane_connector.addOrReplaceChild("neck_average_swan_average_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.3408F, -0.6257F, 0.7151F));

		PartDefinition neck_average_swan_average_2_bottom_mane_connector2_individual = neck_average_swan_average_2_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_average_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.115F, -0.3973F));

		PartDefinition cube_r10 = neck_average_swan_average_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(884, 984).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2603F, -3.6251F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_average_2_bottom_mane_flow = neck_average_swan_average_2_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_average_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.9665F, -0.0894F, -0.2682F));

		PartDefinition cube_r11 = neck_average_swan_average_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(862, 978).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, -0.4469F, 0.0894F, -0.8937F, -0.1201F, -0.1036F));

		PartDefinition headAnchor = neck_average_swan_average_2.addOrReplaceChild("headAnchor", CubeListBuilder.create(), PartPose.offset(-0.25F, -10.3827F, -7.4239F));

		PartDefinition cube_r12 = headAnchor.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_average_swan_average_2.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.25F, -1.5F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_average_swan_average_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_average_swan_average_2;
    }

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"headAnchor", asTransform(headAnchor),
				"chestAnchor", asTransform(chestAnchor));
	}


}