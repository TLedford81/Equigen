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

public class neck_average_swan_average_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart neck_average_swan_average_1;

	public neck_average_swan_average_1(ModelPart root) {
		this.neck_average_swan_average_1 = root.getChild("neck_average_swan_average_1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_average_swan_average_1 = partdefinition.addOrReplaceChild("neck_average_swan_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_average_swan_average_1_individual = neck_average_swan_average_1.addOrReplaceChild("neck_average_swan_average_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_average_1_crest = neck_average_swan_average_1_individual.addOrReplaceChild("neck_average_swan_average_1_crest", CubeListBuilder.create(), PartPose.offset(-0.3575F, -7.7765F, -1.3408F));

		PartDefinition neck_average_swan_average_1_crest_upper = neck_average_swan_average_1_crest.addOrReplaceChild("neck_average_swan_average_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1276F, 0.3211F, -0.0949F));

		PartDefinition cube_r1 = neck_average_swan_average_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(494, 978).addBox(-4.0892F, -6.0F, -3.8808F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0892F, 0.1605F, 0.7064F, 1.0908F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_average_1_crest_lower = neck_average_swan_average_1_crest.addOrReplaceChild("neck_average_swan_average_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.0617F, 3.2641F, 2.5885F));

		PartDefinition cube_r2 = neck_average_swan_average_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(482, 978).addBox(-4.08F, -12.0F, -0.92F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 6.5991F, 4.5231F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_average_1_middle_individual = neck_average_swan_average_1_individual.addOrReplaceChild("neck_average_swan_average_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1647F, -2.5894F, -1.4458F));

		PartDefinition cube_r3 = neck_average_swan_average_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(464, 978).addBox(-5.08F, -9.0F, -0.92F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5745F, 6.0269F, -0.2418F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_average_swan_average_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(464, 964).addBox(-4.0F, -10.0F, -2.0F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5055F, 3.9896F, 3.0261F, 0.5672F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_average_1_lower_individual = neck_average_swan_average_1_individual.addOrReplaceChild("neck_average_swan_average_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1174F, -1.6329F, -2.7617F));

		PartDefinition cube_r5 = neck_average_swan_average_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(484, 965).addBox(-5.0784F, -9.0F, -0.9017F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 4.631F, -0.0983F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_average_1_mane = neck_average_swan_average_1.addOrReplaceChild("neck_average_swan_average_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.6704F, -1.6983F));

		PartDefinition neck_average_swan_average_1_top_mane = neck_average_swan_average_1_mane.addOrReplaceChild("neck_average_swan_average_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -0.9296F, -2.3163F));

		PartDefinition neck_average_swan_average_1_top_mane_connector = neck_average_swan_average_1_top_mane.addOrReplaceChild("neck_average_swan_average_1_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -0.7151F, 2.1453F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_average_1_top_mane_connector_individual = neck_average_swan_average_1_top_mane_connector.addOrReplaceChild("neck_average_swan_average_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

		PartDefinition cube_r6 = neck_average_swan_average_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(822, 974).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_average_1_top_mane_connector2 = neck_average_swan_average_1_top_mane_connector.addOrReplaceChild("neck_average_swan_average_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.8045F, -0.8045F));

		PartDefinition neck_average_swan_average_1_top_mane_connector2_individual = neck_average_swan_average_1_top_mane_connector2.addOrReplaceChild("neck_average_swan_average_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.1269F, -0.5098F));

		PartDefinition cube_r7 = neck_average_swan_average_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(822, 982).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_average_1_top_mane_flow = neck_average_swan_average_1_top_mane_connector2.addOrReplaceChild("neck_average_swan_average_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8771F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_average_swan_average_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(806, 976).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4086F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

		PartDefinition neck_average_swan_average_1_bottom_mane = neck_average_swan_average_1_mane.addOrReplaceChild("neck_average_swan_average_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, 2.5564F, 3.4044F));

		PartDefinition neck_average_swan_average_1_bottom_mane_connector = neck_average_swan_average_1_bottom_mane.addOrReplaceChild("neck_average_swan_average_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9832F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_average_1_bottom_mane_connector_individual = neck_average_swan_average_1_bottom_mane_connector.addOrReplaceChild("neck_average_swan_average_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.3507F, -0.5149F, -0.3787F));

		PartDefinition cube_r9 = neck_average_swan_average_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(832, 975).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.16F, -2.9179F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_average_1_bottom_mane_connector2 = neck_average_swan_average_1_bottom_mane_connector.addOrReplaceChild("neck_average_swan_average_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -1.0726F, 0.3575F));

		PartDefinition neck_average_swan_average_1_bottom_mane_connector2_individual = neck_average_swan_average_1_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_average_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.1653F, -0.3441F));

		PartDefinition cube_r10 = neck_average_swan_average_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(831, 986).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.8636F, -3.3207F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_average_1_bottom_mane_flow = neck_average_swan_average_1_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_average_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.9665F, 0.0894F, -0.0894F));

		PartDefinition cube_r11 = neck_average_swan_average_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(811, 980).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, -0.1788F, 0.2682F, -0.8937F, -0.1201F, -0.1036F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_average_swan_average_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_average_swan_average_1;
    }

	@Override
	public void positionParts() {
		super.positionParts(root(), root());
	}
}