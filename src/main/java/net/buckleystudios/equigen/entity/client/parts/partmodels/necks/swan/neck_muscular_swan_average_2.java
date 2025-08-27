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

public class neck_muscular_swan_average_2 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart neck_muscular_swan_average_2;

	public neck_muscular_swan_average_2(ModelPart root) {
		this.neck_muscular_swan_average_2 = root.getChild("neck_muscular_swan_average_2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_muscular_swan_average_2 = partdefinition.addOrReplaceChild("neck_muscular_swan_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_2_individual = neck_muscular_swan_average_2.addOrReplaceChild("neck_muscular_swan_average_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3575F, 0.8939F, 0.9832F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_2_crest = neck_muscular_swan_average_2_individual.addOrReplaceChild("neck_muscular_swan_average_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -11.0838F, -3.0391F));

		PartDefinition neck_muscular_swan_average_2_crest_upper = neck_muscular_swan_average_2_crest.addOrReplaceChild("neck_muscular_swan_average_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1974F, 1.6293F, -2.4487F));

		PartDefinition cube_r1 = neck_muscular_swan_average_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(553, 1006).addBox(-3.0892F, -6.0F, -3.8808F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5892F, 0.1605F, 3.2986F, 1.0908F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_2_crest_lower = neck_muscular_swan_average_2_crest.addOrReplaceChild("neck_muscular_swan_average_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2768F, 5.1039F, 3.1434F));

		PartDefinition cube_r2 = neck_muscular_swan_average_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(539, 1006).addBox(-5.08F, -12.0F, -0.92F, 5.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 6.1895F, 4.2363F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_2_middle_individual = neck_muscular_swan_average_2_individual.addOrReplaceChild("neck_muscular_swan_average_2_middle_individual", CubeListBuilder.create(), PartPose.offset(0.1482F, -4.0141F, -2.6769F));

		PartDefinition cube_r3 = neck_muscular_swan_average_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(519, 1006).addBox(-5.08F, -9.0F, -0.92F, 6.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0829F, 5.5745F, -0.4408F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_muscular_swan_average_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(518, 991).addBox(-5.0F, -10.0F, -2.0F, 6.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9971F, 3.5373F, 2.8271F, 0.5672F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_2_lower_individual = neck_muscular_swan_average_2_individual.addOrReplaceChild("neck_muscular_swan_average_2_lower_individual", CubeListBuilder.create(), PartPose.offset(0.1145F, -3.0218F, -4.0836F));

		PartDefinition cube_r5 = neck_muscular_swan_average_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(540, 992).addBox(-4.8996F, -9.0F, -0.9017F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8996F, 4.1429F, -0.2065F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_2_mane = neck_muscular_swan_average_2.addOrReplaceChild("neck_muscular_swan_average_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_2_top_mane = neck_muscular_swan_average_2_mane.addOrReplaceChild("neck_muscular_swan_average_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -2.8961F, -0.5286F));

		PartDefinition neck_muscular_swan_average_2_top_mane_connector = neck_muscular_swan_average_2_top_mane.addOrReplaceChild("neck_muscular_swan_average_2_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -8.4022F, -1.7877F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_2_top_mane_connector_individual = neck_muscular_swan_average_2_top_mane_connector.addOrReplaceChild("neck_muscular_swan_average_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

		PartDefinition cube_r6 = neck_muscular_swan_average_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(873, 998).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_2_top_mane_connector2 = neck_muscular_swan_average_2_top_mane_connector.addOrReplaceChild("neck_muscular_swan_average_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.9832F, -0.8045F, -0.8045F));

		PartDefinition neck_muscular_swan_average_2_top_mane_connector2_individual = neck_muscular_swan_average_2_top_mane_connector2.addOrReplaceChild("neck_muscular_swan_average_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.4665F, 0.1269F, -0.5098F));

		PartDefinition cube_r7 = neck_muscular_swan_average_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(873, 1006).addBox(-2.0F, -2.0F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_2_top_mane_flow = neck_muscular_swan_average_2_top_mane_connector2.addOrReplaceChild("neck_muscular_swan_average_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5922F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_muscular_swan_average_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(857, 1000).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4086F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

		PartDefinition neck_muscular_swan_average_2_bottom_mane = neck_muscular_swan_average_2_mane.addOrReplaceChild("neck_muscular_swan_average_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -7.0972F, 1.2591F));

		PartDefinition neck_muscular_swan_average_2_bottom_mane_connector = neck_muscular_swan_average_2_bottom_mane.addOrReplaceChild("neck_muscular_swan_average_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_2_bottom_mane_connector_individual = neck_muscular_swan_average_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_swan_average_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.1182F, -0.0743F));

		PartDefinition cube_r9 = neck_muscular_swan_average_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(885, 997).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5567F, -3.2223F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_2_bottom_mane_connector2 = neck_muscular_swan_average_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_swan_average_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.2682F, -0.6257F, 0.7151F));

		PartDefinition neck_muscular_swan_average_2_bottom_mane_connector2_individual = neck_muscular_swan_average_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_swan_average_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, 0.115F, -0.3973F));

		PartDefinition cube_r10 = neck_muscular_swan_average_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(883, 1009).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.2603F, -3.6251F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_2_bottom_mane_flow = neck_muscular_swan_average_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_swan_average_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.6816F, -0.0894F, -0.2682F));

		PartDefinition cube_r11 = neck_muscular_swan_average_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(861, 1003).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, -0.4469F, 0.0894F, -0.8937F, -0.1201F, -0.1036F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_muscular_swan_average_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_muscular_swan_average_2;
    }

	@Override
	public void PositionParts() {
		super.PositionParts(root(), root());
	}
}