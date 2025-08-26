package net.buckleystudios.equigen.entity.client.parts.partmodels.necks.arched;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartNeckModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class neck_muscular_arched_short_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart neck_muscular_arched_short_1;

	public neck_muscular_arched_short_1(ModelPart root) {
		this.neck_muscular_arched_short_1 = root.getChild("neck_muscular_arched_short_1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_muscular_arched_short_1 = partdefinition.addOrReplaceChild("neck_muscular_arched_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_muscular_arched_short_1_individual = neck_muscular_arched_short_1.addOrReplaceChild("neck_muscular_arched_short_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2927F, 2.6458F, -0.5718F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_short_1_crest = neck_muscular_arched_short_1_individual.addOrReplaceChild("neck_muscular_arched_short_1_crest", CubeListBuilder.create(), PartPose.offset(-0.2927F, -6.3106F, -2.0204F));

		PartDefinition neck_muscular_arched_short_1_crest_upper = neck_muscular_arched_short_1_crest.addOrReplaceChild("neck_muscular_arched_short_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.2642F, -1.559F, -0.9589F));

		PartDefinition cube_r1 = neck_muscular_arched_short_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(393, 655).addBox(-4.1434F, -5.8622F, -2.7188F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6434F, 0.0857F, 2.6108F, 1.5708F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_short_1_crest_lower = neck_muscular_arched_short_1_crest.addOrReplaceChild("neck_muscular_arched_short_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2119F, 0.4136F, 1.546F));

		PartDefinition cube_r2 = neck_muscular_arched_short_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(363, 655).addBox(-5.08F, -10.0F, -0.92F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 4.6528F, 4.5396F, 0.7854F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_short_1_middle_individual = neck_muscular_arched_short_1_individual.addOrReplaceChild("neck_muscular_arched_short_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1467F, -3.9183F, -1.5772F));

		PartDefinition cube_r3 = neck_muscular_arched_short_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(377, 655).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.982F, 6.9822F, 0.7481F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_muscular_arched_short_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(363, 644).addBox(-6.0F, -10.0F, -1.0F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0964F, 4.401F, 3.6331F, 0.7854F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_short_1_lower_individual = neck_muscular_arched_short_1_individual.addOrReplaceChild("neck_muscular_arched_short_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0445F, -2.0903F, -1.5243F));

		PartDefinition cube_r5 = neck_muscular_arched_short_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(383, 645).addBox(-6.08F, -11.0F, -0.92F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.08F, 8.0069F, 1.0274F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_short_1_mane = neck_muscular_arched_short_1.addOrReplaceChild("neck_muscular_arched_short_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -5.2737F, 0.0F));

		PartDefinition neck_muscular_arched_short_1_top_mane = neck_muscular_arched_short_1_mane.addOrReplaceChild("neck_muscular_arched_short_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, -0.3933F, -1.3331F));

		PartDefinition neck_muscular_arched_short_1_top_mane_connector = neck_muscular_arched_short_1_top_mane.addOrReplaceChild("neck_muscular_arched_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.7877F, -0.8939F));

		PartDefinition neck_muscular_arched_short_1_top_mane_connector_individual = neck_muscular_arched_short_1_top_mane_connector.addOrReplaceChild("neck_muscular_arched_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

		PartDefinition cube_r6 = neck_muscular_arched_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(723, 808).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_short_1_top_mane_connector2 = neck_muscular_arched_short_1_top_mane_connector.addOrReplaceChild("neck_muscular_arched_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.4469F));

		PartDefinition neck_muscular_arched_short_1_top_mane_connector2_individual = neck_muscular_arched_short_1_top_mane_connector2.addOrReplaceChild("neck_muscular_arched_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.5034F, -0.3893F));

		PartDefinition cube_r7 = neck_muscular_arched_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(723, 815).addBox(-2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_short_1_top_mane_flow = neck_muscular_arched_short_1_top_mane_connector2.addOrReplaceChild("neck_muscular_arched_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7709F, 0.0F, 0.2682F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_muscular_arched_short_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(709, 809).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

		PartDefinition neck_muscular_arched_short_1_bottom_mane = neck_muscular_arched_short_1_mane.addOrReplaceChild("neck_muscular_arched_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, 2.6458F, 1.9742F));

		PartDefinition neck_muscular_arched_short_1_bottom_mane_connector = neck_muscular_arched_short_1_bottom_mane.addOrReplaceChild("neck_muscular_arched_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

		PartDefinition neck_muscular_arched_short_1_bottom_mane_connector_individual = neck_muscular_arched_short_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_arched_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -2.1016F, -1.5962F));

		PartDefinition cube_r9 = neck_muscular_arched_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(734, 811).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5733F, -1.7004F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_short_1_bottom_mane_connector2 = neck_muscular_arched_short_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_arched_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -2.4134F, -0.8045F));

		PartDefinition neck_muscular_arched_short_1_bottom_mane_connector2_individual = neck_muscular_arched_short_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_arched_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, -0.0807F, -0.3996F));

		PartDefinition cube_r10 = neck_muscular_arched_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(732, 820).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2769F, -2.1032F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_short_1_bottom_mane_flow = neck_muscular_arched_short_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_arched_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.4134F, -0.1788F, 0.0F));

		PartDefinition cube_r11 = neck_muscular_arched_short_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(714, 814).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, 1.4302F, 1.2514F, -0.8937F, -0.1201F, -0.1036F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_muscular_arched_short_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_muscular_arched_short_1;
    }

	@Override
	public void PositionParts() {
		super.PositionParts(root(), root());
	}
}