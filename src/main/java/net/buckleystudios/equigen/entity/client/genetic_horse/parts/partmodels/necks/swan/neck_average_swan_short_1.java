package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.necks.swan;// Made with Blockbench 4.12.1
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

public class neck_average_swan_short_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart neck_average_swan_short_1;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;
	private final ModelPart withersAnchor;

	public neck_average_swan_short_1(ModelPart root) {
		this.neck_average_swan_short_1 = root.getChild("neck_average_swan_short_1");
		this.headAnchor = this.neck_average_swan_short_1.getChild("headAnchor");
		this.chestAnchor = this.neck_average_swan_short_1.getChild("chestAnchor");
		this.withersAnchor = this.neck_average_swan_short_1.getChild("withersAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_average_swan_short_1 = partdefinition.addOrReplaceChild("neck_average_swan_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_average_swan_short_1_individual = neck_average_swan_short_1.addOrReplaceChild("neck_average_swan_short_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_short_1_crest = neck_average_swan_short_1_individual.addOrReplaceChild("neck_average_swan_short_1_crest", CubeListBuilder.create(), PartPose.offset(-0.3575F, -6.7933F, -0.3575F));

		PartDefinition neck_average_swan_short_1_crest_upper = neck_average_swan_short_1_crest.addOrReplaceChild("neck_average_swan_short_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3064F, 0.2696F, -0.0306F));

		PartDefinition cube_r1 = neck_average_swan_short_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(380, 981).addBox(-4.0892F, -6.0F, -3.8808F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0892F, 0.518F, 1.064F, 1.0908F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_short_1_crest_lower = neck_average_swan_short_1_crest.addOrReplaceChild("neck_average_swan_short_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.3298F, 2.8025F, 2.4618F));

		PartDefinition cube_r2 = neck_average_swan_short_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(368, 984).addBox(-4.08F, -12.0F, -0.92F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 7.4183F, 5.0967F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_short_1_middle_individual = neck_average_swan_short_1_individual.addOrReplaceChild("neck_average_swan_short_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1731F, -2.1532F, -0.4137F));

		PartDefinition cube_r3 = neck_average_swan_short_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(350, 982).addBox(-5.08F, -9.0F, -0.92F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5829F, 6.9315F, 0.1563F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_average_swan_short_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(349, 970).addBox(-5.0F, -10.0F, -2.0F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4971F, 4.8942F, 3.4242F, 0.5672F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_short_1_lower_individual = neck_average_swan_short_1_individual.addOrReplaceChild("neck_average_swan_short_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1174F, -1.2684F, -1.5479F));

		PartDefinition cube_r5 = neck_average_swan_short_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(369, 971).addBox(-5.0784F, -9.0F, -0.9017F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 5.6074F, 0.1181F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_short_1_mane = neck_average_swan_short_1.addOrReplaceChild("neck_average_swan_short_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -5.9888F, 0.0F));

		PartDefinition neck_average_swan_short_1_top_mane = neck_average_swan_short_1_mane.addOrReplaceChild("neck_average_swan_short_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -1.6447F, -1.6906F));

		PartDefinition neck_average_swan_short_1_top_mane_connector = neck_average_swan_short_1_top_mane.addOrReplaceChild("neck_average_swan_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -1.3408F, 1.2514F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_short_1_top_mane_connector_individual = neck_average_swan_short_1_top_mane_connector.addOrReplaceChild("neck_average_swan_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

		PartDefinition cube_r6 = neck_average_swan_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(723, 972).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_short_1_top_mane_connector2 = neck_average_swan_short_1_top_mane_connector.addOrReplaceChild("neck_average_swan_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.8045F, -0.8045F));

		PartDefinition neck_average_swan_short_1_top_mane_connector2_individual = neck_average_swan_short_1_top_mane_connector2.addOrReplaceChild("neck_average_swan_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.1269F, -0.5098F));

		PartDefinition cube_r7 = neck_average_swan_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(724, 980).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_short_1_top_mane_flow = neck_average_swan_short_1_top_mane_connector2.addOrReplaceChild("neck_average_swan_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8771F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_average_swan_short_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(709, 974).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4085F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

		PartDefinition neck_average_swan_short_1_bottom_mane = neck_average_swan_short_1_mane.addOrReplaceChild("neck_average_swan_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, 1.2157F, 3.1362F));

		PartDefinition neck_average_swan_short_1_bottom_mane_connector = neck_average_swan_short_1_bottom_mane.addOrReplaceChild("neck_average_swan_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_short_1_bottom_mane_connector_individual = neck_average_swan_short_1_bottom_mane_connector.addOrReplaceChild("neck_average_swan_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -1.3083F, -0.9874F));

		PartDefinition cube_r9 = neck_average_swan_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(734, 977).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3667F, -2.3092F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_short_1_bottom_mane_connector2 = neck_average_swan_short_1_bottom_mane_connector.addOrReplaceChild("neck_average_swan_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.2682F, -1.6983F, -0.3575F));

		PartDefinition neck_average_swan_short_1_bottom_mane_connector2_individual = neck_average_swan_short_1_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, -0.0024F, -0.2378F));

		PartDefinition cube_r10 = neck_average_swan_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(724, 987).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0702F, -2.7119F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_short_1_bottom_mane_flow = neck_average_swan_short_1_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.9665F, -0.1788F, 0.0894F));

		PartDefinition cube_r11 = neck_average_swan_short_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(715, 980).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, 0.7151F, 0.8045F, -0.8937F, -0.1201F, -0.1036F));

		PartDefinition headAnchor = neck_average_swan_short_1.addOrReplaceChild("headAnchor", CubeListBuilder.create(), PartPose.offset(0.0F, -8.6327F, -5.1739F));

		PartDefinition cube_r12 = headAnchor.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_average_swan_short_1.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.25F, -0.5F));

		PartDefinition withersAnchor = neck_average_swan_short_1.addOrReplaceChild("withersAnchor", CubeListBuilder.create(), PartPose.offset(-0.1F, -2.1346F, 3.3529F));

		PartDefinition cube_r13 = withersAnchor.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6981F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_average_swan_short_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_average_swan_short_1;
    }

	@Override
	public Map<String, PartTransform> anchors() {
		return Map.of(
				"headAnchor", asTransform(headAnchor),
				"chestAnchor", asTransform(chestAnchor),
				"withersAnchor", asTransform(withersAnchor));
	}


}