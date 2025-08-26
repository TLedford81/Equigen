package net.buckleystudios.equigen.entity.client.parts.partmodels.necks.swan;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartNeckModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class neck_lean_swan_long_2 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart neck_lean_swan_long_2;

	public neck_lean_swan_long_2(ModelPart root) {
		this.neck_lean_swan_long_2 = root.getChild("neck_lean_swan_long_2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_lean_swan_long_2 = partdefinition.addOrReplaceChild("neck_lean_swan_long_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_lean_swan_long_2_individual = neck_lean_swan_long_2.addOrReplaceChild("neck_lean_swan_long_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_long_2_crest = neck_lean_swan_long_2_individual.addOrReplaceChild("neck_lean_swan_long_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -10.0112F, -2.5922F));

		PartDefinition neck_lean_swan_long_2_crest_upper = neck_lean_swan_long_2_crest.addOrReplaceChild("neck_lean_swan_long_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1807F, 0.0292F, -0.5486F));

		PartDefinition cube_r1 = neck_lean_swan_long_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(665, 940).addBox(-3.0892F, -6.0F, -3.8808F, 3.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, 0.518F, 0.8852F, 1.0908F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_long_2_crest_lower = neck_lean_swan_long_2_crest.addOrReplaceChild("neck_lean_swan_long_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1147F, 4.5822F, 3.1807F));

		PartDefinition cube_r2 = neck_lean_swan_long_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(650, 924).addBox(-3.08F, -12.0F, -0.92F, 3.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 5.3704F, 3.6627F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_long_2_middle_individual = neck_lean_swan_long_2_individual.addOrReplaceChild("neck_lean_swan_long_2_middle_individual", CubeListBuilder.create(), PartPose.offset(0.1398F, -3.6198F, -2.4883F));

		PartDefinition cube_r3 = neck_lean_swan_long_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(632, 920).addBox(-4.0F, -10.0F, -2.0F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0055F, 2.8748F, 2.5491F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_lean_swan_long_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(660, 925).addBox(-5.08F, -12.0F, -0.92F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0745F, 7.3255F, -0.1825F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_long_2_lower_individual = neck_lean_swan_long_2_individual.addOrReplaceChild("neck_lean_swan_long_2_lower_individual", CubeListBuilder.create(), PartPose.offset(0.2402F, -3.7781F, -4.2812F));

		PartDefinition cube_r5 = neck_lean_swan_long_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(640, 937).addBox(-5.0784F, -9.0F, -0.9017F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 4.631F, -0.0983F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_long_2_mane = neck_lean_swan_long_2.addOrReplaceChild("neck_lean_swan_long_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.7598F, -2.4134F));

		PartDefinition neck_lean_swan_long_2_top_mane = neck_lean_swan_long_2_mane.addOrReplaceChild("neck_lean_swan_long_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -1.4659F, -2.3163F));

		PartDefinition neck_lean_swan_long_2_top_mane_connector = neck_lean_swan_long_2_top_mane.addOrReplaceChild("neck_lean_swan_long_2_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -2.2346F, 1.3408F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_long_2_top_mane_connector_individual = neck_lean_swan_long_2_top_mane_connector.addOrReplaceChild("neck_lean_swan_long_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

		PartDefinition cube_r6 = neck_lean_swan_long_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(985, 969).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_long_2_top_mane_connector2 = neck_lean_swan_long_2_top_mane_connector.addOrReplaceChild("neck_lean_swan_long_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

		PartDefinition neck_lean_swan_long_2_top_mane_connector2_individual = neck_lean_swan_long_2_top_mane_connector2.addOrReplaceChild("neck_lean_swan_long_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, -0.32F, -1.2249F));

		PartDefinition cube_r7 = neck_lean_swan_long_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(985, 977).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_long_2_top_mane_flow = neck_lean_swan_long_2_top_mane_connector2.addOrReplaceChild("neck_lean_swan_long_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8771F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_lean_swan_long_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(969, 971).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4274F, -0.2133F, -0.3647F));

		PartDefinition neck_lean_swan_long_2_bottom_mane = neck_lean_swan_long_2_mane.addOrReplaceChild("neck_lean_swan_long_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 0.5006F, 2.5999F));

		PartDefinition neck_lean_swan_long_2_bottom_mane_connector = neck_lean_swan_long_2_bottom_mane.addOrReplaceChild("neck_lean_swan_long_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_long_2_bottom_mane_connector_individual = neck_lean_swan_long_2_bottom_mane_connector.addOrReplaceChild("neck_lean_swan_long_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.6751F, 0.5345F));

		PartDefinition cube_r9 = neck_lean_swan_long_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(995, 965).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.3501F, -3.8311F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_long_2_bottom_mane_connector2 = neck_lean_swan_long_2_bottom_mane_connector.addOrReplaceChild("neck_lean_swan_long_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));

		PartDefinition neck_lean_swan_long_2_bottom_mane_connector2_individual = neck_lean_swan_long_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_swan_long_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.2827F, 0.1221F));

		PartDefinition cube_r10 = neck_lean_swan_long_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(989, 979).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0536F, -4.2338F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_lean_swan_long_2_bottom_mane_flow = neck_lean_swan_long_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_swan_long_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.5196F, -0.3575F, 0.0894F));

		PartDefinition cube_r11 = neck_lean_swan_long_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(971, 972).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_lean_swan_long_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_lean_swan_long_2;
    }

	@Override
	public void PositionParts() {
		super.PositionParts(root(), root());
	}
}