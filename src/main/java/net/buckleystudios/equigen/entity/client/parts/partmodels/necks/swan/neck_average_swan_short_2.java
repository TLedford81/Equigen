package net.buckleystudios.equigen.entity.client.parts.partmodels.necks.swan;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class neck_average_swan_short_2 extends HierarchicalModel<GeneticHorseEntity> {
	private final ModelPart neck_average_swan_short_2;

	public neck_average_swan_short_2(ModelPart root) {
		this.neck_average_swan_short_2 = root.getChild("neck_average_swan_short_2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_average_swan_short_2 = partdefinition.addOrReplaceChild("neck_average_swan_short_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_average_swan_short_2_individual = neck_average_swan_short_2.addOrReplaceChild("neck_average_swan_short_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_short_2_crest = neck_average_swan_short_2_individual.addOrReplaceChild("neck_average_swan_short_2_crest", CubeListBuilder.create(), PartPose.offset(-0.3575F, -7.2402F, -0.8939F));

		PartDefinition neck_average_swan_short_2_crest_upper = neck_average_swan_short_2_crest.addOrReplaceChild("neck_average_swan_short_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1444F, 0.5225F, 0.2461F));

		PartDefinition cube_r1 = neck_average_swan_short_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(438, 980).addBox(-3.0892F, -6.0F, -3.8808F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0892F, 0.1605F, 0.6171F, 1.0908F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_short_2_crest_lower = neck_average_swan_short_2_crest.addOrReplaceChild("neck_average_swan_short_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1511F, 3.1227F, 2.5698F));

		PartDefinition cube_r2 = neck_average_swan_short_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(426, 980).addBox(-4.08F, -12.0F, -0.92F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 7.0087F, 4.8099F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_short_2_middle_individual = neck_average_swan_short_2_individual.addOrReplaceChild("neck_average_swan_short_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1815F, -2.2372F, -0.9297F));

		PartDefinition cube_r3 = neck_average_swan_short_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(408, 967).addBox(-5.0F, -10.0F, -2.0F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5055F, 4.4419F, 3.2252F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_average_swan_short_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(408, 980).addBox(-6.08F, -9.0F, -0.92F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5745F, 6.4792F, -0.0428F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_short_2_lower_individual = neck_average_swan_short_2_individual.addOrReplaceChild("neck_average_swan_short_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1174F, -1.3166F, -2.1548F));

		PartDefinition cube_r5 = neck_average_swan_short_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(428, 968).addBox(-5.0784F, -9.0F, -0.9017F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 5.1192F, 0.0099F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_short_2_mane = neck_average_swan_short_2.addOrReplaceChild("neck_average_swan_short_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.1508F, 0.0F));

		PartDefinition neck_average_swan_short_2_top_mane = neck_average_swan_short_2_mane.addOrReplaceChild("neck_average_swan_short_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -0.9296F, -2.4951F));

		PartDefinition neck_average_swan_short_2_top_mane_connector = neck_average_swan_short_2_top_mane.addOrReplaceChild("neck_average_swan_short_2_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -1.4302F, 1.3408F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_short_2_top_mane_connector_individual = neck_average_swan_short_2_top_mane_connector.addOrReplaceChild("neck_average_swan_short_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

		PartDefinition cube_r6 = neck_average_swan_short_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(772, 973).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_short_2_top_mane_connector2 = neck_average_swan_short_2_top_mane_connector.addOrReplaceChild("neck_average_swan_short_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.8045F, -0.8045F));

		PartDefinition neck_average_swan_short_2_top_mane_connector2_individual = neck_average_swan_short_2_top_mane_connector2.addOrReplaceChild("neck_average_swan_short_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.1269F, -0.5098F));

		PartDefinition cube_r7 = neck_average_swan_short_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(772, 981).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_short_2_top_mane_flow = neck_average_swan_short_2_top_mane_connector2.addOrReplaceChild("neck_average_swan_short_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8771F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_average_swan_short_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(756, 975).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4086F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

		PartDefinition neck_average_swan_short_2_bottom_mane = neck_average_swan_short_2_mane.addOrReplaceChild("neck_average_swan_short_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, 1.8413F, 2.4211F));

		PartDefinition neck_average_swan_short_2_bottom_mane_connector = neck_average_swan_short_2_bottom_mane.addOrReplaceChild("neck_average_swan_short_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_short_2_bottom_mane_connector_individual = neck_average_swan_short_2_bottom_mane_connector.addOrReplaceChild("neck_average_swan_short_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.9116F, -0.6831F));

		PartDefinition cube_r9 = neck_average_swan_short_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(782, 976).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7634F, -2.6136F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_short_2_bottom_mane_connector2 = neck_average_swan_short_2_bottom_mane_connector.addOrReplaceChild("neck_average_swan_short_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.2682F, -1.162F, 0.3575F));

		PartDefinition neck_average_swan_short_2_bottom_mane_connector2_individual = neck_average_swan_short_2_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_short_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, -0.142F, -0.6485F));

		PartDefinition cube_r10 = neck_average_swan_short_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(780, 986).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.4669F, -3.0163F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_swan_short_2_bottom_mane_flow = neck_average_swan_short_2_bottom_mane_connector2.addOrReplaceChild("neck_average_swan_short_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.9665F, -0.1788F, -0.2682F));

		PartDefinition cube_r11 = neck_average_swan_short_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(762, 980).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, 0.1788F, 0.4469F, -0.8937F, -0.1201F, -0.1036F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_average_swan_short_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_average_swan_short_2;
    }
}