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

public class neck_average_arched_average_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart neck_average_arched_average_1;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;

	public neck_average_arched_average_1(ModelPart root) {
		this.neck_average_arched_average_1 = root.getChild("neck_average_arched_average_1");
		this.headAnchor = this.neck_average_arched_average_1.getChild("headAnchor");
		this.chestAnchor = this.neck_average_arched_average_1.getChild("chestAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_average_arched_average_1 = partdefinition.addOrReplaceChild("neck_average_arched_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_average_arched_average_1_individual = neck_average_arched_average_1.addOrReplaceChild("neck_average_arched_average_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2927F, -1.2872F, -0.3036F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_average_1_crest = neck_average_arched_average_1_individual.addOrReplaceChild("neck_average_arched_average_1_crest", CubeListBuilder.create(), PartPose.offset(-0.2927F, -4.4335F, -1.3053F));

		PartDefinition neck_average_arched_average_1_crest_upper = neck_average_arched_average_1_crest.addOrReplaceChild("neck_average_arched_average_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.2279F, -1.4304F, -1.5572F));

		PartDefinition cube_r1 = neck_average_arched_average_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(500, 619).addBox(-3.1434F, -5.8622F, -2.7188F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1434F, 0.3538F, 2.3426F, 1.5708F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_average_1_crest_lower = neck_average_arched_average_1_crest.addOrReplaceChild("neck_average_arched_average_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1756F, 1.5175F, 1.3866F));

		PartDefinition cube_r2 = neck_average_arched_average_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(472, 619).addBox(-4.08F, -10.0F, -0.92F, 4.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 3.9457F, 3.8325F, 0.7854F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_average_1_middle_individual = neck_average_arched_average_1_individual.addOrReplaceChild("neck_average_arched_average_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1648F, -0.8079F, -1.2457F));

		PartDefinition cube_r3 = neck_average_arched_average_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(484, 619).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0002F, 6.1456F, 0.2651F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_average_arched_average_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(472, 606).addBox(-5.0F, -10.0F, -1.0F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5782F, 3.5644F, 3.1501F, 0.7854F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_average_1_lower_individual = neck_average_arched_average_1_individual.addOrReplaceChild("neck_average_arched_average_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0808F, 1.1864F, -1.2176F));

		PartDefinition cube_r5 = neck_average_arched_average_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(490, 607).addBox(-5.08F, -7.7191F, -1.7991F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 3.6074F, 0.9268F, 0.3054F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_average_1_mane = neck_average_arched_average_1.addOrReplaceChild("neck_average_arched_average_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -6.3464F, -1.0726F));

		PartDefinition neck_average_arched_average_1_top_mane = neck_average_arched_average_1_mane.addOrReplaceChild("neck_average_arched_average_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, -1.8235F, -1.78F));

		PartDefinition neck_average_arched_average_1_top_mane_connector = neck_average_arched_average_1_top_mane.addOrReplaceChild("neck_average_arched_average_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -0.9832F, 0.4469F));

		PartDefinition neck_average_arched_average_1_top_mane_connector_individual = neck_average_arched_average_1_top_mane_connector.addOrReplaceChild("neck_average_arched_average_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

		PartDefinition cube_r6 = neck_average_arched_average_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(819, 770).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_average_1_top_mane_connector2 = neck_average_arched_average_1_top_mane_connector.addOrReplaceChild("neck_average_arched_average_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.4469F));

		PartDefinition neck_average_arched_average_1_top_mane_connector2_individual = neck_average_arched_average_1_top_mane_connector2.addOrReplaceChild("neck_average_arched_average_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.5034F, -0.3893F));

		PartDefinition cube_r7 = neck_average_arched_average_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(819, 777).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_average_1_top_mane_flow = neck_average_arched_average_1_top_mane_connector2.addOrReplaceChild("neck_average_arched_average_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, 0.2682F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_average_arched_average_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(805, 771).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

		PartDefinition neck_average_arched_average_1_bottom_mane = neck_average_arched_average_1_mane.addOrReplaceChild("neck_average_arched_average_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, 2.0201F, 2.8681F));

		PartDefinition neck_average_arched_average_1_bottom_mane_connector = neck_average_arched_average_1_bottom_mane.addOrReplaceChild("neck_average_arched_average_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

		PartDefinition neck_average_arched_average_1_bottom_mane_connector_individual = neck_average_arched_average_1_bottom_mane_connector.addOrReplaceChild("neck_average_arched_average_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -1.3083F, -0.9874F));

		PartDefinition cube_r9 = neck_average_arched_average_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(828, 769).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3667F, -2.3092F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_average_1_bottom_mane_connector2 = neck_average_arched_average_1_bottom_mane_connector.addOrReplaceChild("neck_average_arched_average_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -2.4134F, -0.8045F));

		PartDefinition neck_average_arched_average_1_bottom_mane_connector2_individual = neck_average_arched_average_1_bottom_mane_connector2.addOrReplaceChild("neck_average_arched_average_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.7127F, 0.2091F));

		PartDefinition cube_r10 = neck_average_arched_average_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(828, 780).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0702F, -2.7119F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_average_1_bottom_mane_flow = neck_average_arched_average_1_bottom_mane_connector2.addOrReplaceChild("neck_average_arched_average_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.1788F, 0.0F));

		PartDefinition cube_r11 = neck_average_arched_average_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(808, 774).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, 1.4302F, 1.2514F, -0.8937F, -0.1201F, -0.1036F));

		PartDefinition headAnchor = neck_average_arched_average_1.addOrReplaceChild("headAnchor", CubeListBuilder.create(), PartPose.offset(0.25F, -7.8827F, -5.9239F));

		PartDefinition cube_r12 = headAnchor.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_average_arched_average_1.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1F, -1.25F, -1.75F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_average_arched_average_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_average_arched_average_1;
    }

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"headAnchor", asTransform(headAnchor),
				"chestAnchor", asTransform(chestAnchor));
	}

	@Override
	public void afterAttached(GeneticHorseEntity e, float partialTicks) {
		this.root().xRot = getPitch(e, "arched");
		this.root().yRot = getNetYaw(e, partialTicks);

	}


}