package net.buckleystudios.equigen.entity.client.parts.necks.swan;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class neck_muscular_swan_short_1 extends HierarchicalModel<GeneticHorseEntity> {
	private final ModelPart neck_muscular_swan_short_1;

	public neck_muscular_swan_short_1(ModelPart root) {
		this.neck_muscular_swan_short_1 = root.getChild("neck_muscular_swan_short_1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_muscular_swan_short_1 = partdefinition.addOrReplaceChild("neck_muscular_swan_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_muscular_swan_short_1_individual = neck_muscular_swan_short_1.addOrReplaceChild("neck_muscular_swan_short_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_short_1_crest = neck_muscular_swan_short_1_individual.addOrReplaceChild("neck_muscular_swan_short_1_crest", CubeListBuilder.create(), PartPose.offset(-0.3575F, -6.7933F, -0.3575F));

		PartDefinition neck_muscular_swan_short_1_crest_upper = neck_muscular_swan_short_1_crest.addOrReplaceChild("neck_muscular_swan_short_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = neck_muscular_swan_short_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(383, 1005).addBox(-5.0892F, -6.0F, -3.8808F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9319F, 0.7876F, 1.0334F, 1.0908F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_short_1_crest_lower = neck_muscular_swan_short_1_crest.addOrReplaceChild("neck_muscular_swan_short_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2768F, 2.8025F, 2.4618F));

		PartDefinition cube_r2 = neck_muscular_swan_short_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(369, 1008).addBox(-5.08F, -12.0F, -0.92F, 5.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 7.4183F, 5.0967F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_short_1_middle_individual = neck_muscular_swan_short_1_individual.addOrReplaceChild("neck_muscular_swan_short_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.039F, -2.1533F, -0.4137F));

		PartDefinition cube_r3 = neck_muscular_swan_short_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(349, 1006).addBox(-6.08F, -9.0F, -0.92F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0745F, 6.9315F, 0.1563F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_muscular_swan_short_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(349, 994).addBox(-5.0F, -10.0F, -2.0F, 6.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0055F, 4.8942F, 3.4242F, 0.5672F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_short_1_lower_individual = neck_muscular_swan_short_1_individual.addOrReplaceChild("neck_muscular_swan_short_1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0083F, -1.2684F, -1.5479F));

		PartDefinition cube_r5 = neck_muscular_swan_short_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(371, 995).addBox(-6.0784F, -9.0F, -0.9017F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0784F, 5.6073F, 0.1181F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_short_1_mane = neck_muscular_swan_short_1.addOrReplaceChild("neck_muscular_swan_short_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0615F, 0.0F));

		PartDefinition neck_muscular_swan_short_1_top_mane = neck_muscular_swan_short_1_mane.addOrReplaceChild("neck_muscular_swan_short_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -0.8402F, -2.1375F));

		PartDefinition neck_muscular_swan_short_1_top_mane_connector = neck_muscular_swan_short_1_top_mane.addOrReplaceChild("neck_muscular_swan_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -1.0726F, 1.6983F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_short_1_top_mane_connector_individual = neck_muscular_swan_short_1_top_mane_connector.addOrReplaceChild("neck_muscular_swan_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

		PartDefinition cube_r6 = neck_muscular_swan_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(722, 997).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_short_1_top_mane_connector2 = neck_muscular_swan_short_1_top_mane_connector.addOrReplaceChild("neck_muscular_swan_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.8045F, -0.8045F));

		PartDefinition neck_muscular_swan_short_1_top_mane_connector2_individual = neck_muscular_swan_short_1_top_mane_connector2.addOrReplaceChild("neck_muscular_swan_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.1269F, -0.5098F));

		PartDefinition cube_r7 = neck_muscular_swan_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(723, 1005).addBox(-2.0F, -2.0F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_short_1_top_mane_flow = neck_muscular_swan_short_1_top_mane_connector2.addOrReplaceChild("neck_muscular_swan_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8603F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_muscular_swan_short_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(707, 999).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4086F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

		PartDefinition neck_muscular_swan_short_1_bottom_mane = neck_muscular_swan_short_1_mane.addOrReplaceChild("neck_muscular_swan_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, 2.2883F, 3.1362F));

		PartDefinition neck_muscular_swan_short_1_bottom_mane_connector = neck_muscular_swan_short_1_bottom_mane.addOrReplaceChild("neck_muscular_swan_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_short_1_bottom_mane_connector_individual = neck_muscular_swan_short_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_swan_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -1.3083F, -0.9874F));

		PartDefinition cube_r9 = neck_muscular_swan_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(735, 1002).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.3667F, -2.3092F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_short_1_bottom_mane_connector2 = neck_muscular_swan_short_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_swan_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.2682F, -1.6983F, -0.3575F));

		PartDefinition neck_muscular_swan_short_1_bottom_mane_connector2_individual = neck_muscular_swan_short_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_swan_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, -0.0024F, -0.2378F));

		PartDefinition cube_r10 = neck_muscular_swan_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(723, 1012).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0702F, -2.7119F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_short_1_bottom_mane_flow = neck_muscular_swan_short_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_swan_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.7709F, -0.1788F, 0.0894F));

		PartDefinition cube_r11 = neck_muscular_swan_short_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(714, 1005).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, 0.7151F, 0.8045F, -0.8937F, -0.1201F, -0.1036F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_muscular_swan_short_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_muscular_swan_short_1;
    }
}