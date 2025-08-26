package net.buckleystudios.equigen.entity.client.parts.necks.arched;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class neck_average_arched_long_1 extends HierarchicalModel<GeneticHorseEntity> {
	private final ModelPart neck_average_arched_long_1;


	public neck_average_arched_long_1(ModelPart root) {
		this.neck_average_arched_long_1 = root.getChild("neck_average_arched_long_1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_average_arched_long_1 = partdefinition.addOrReplaceChild("neck_average_arched_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_average_arched_long_1_individual = neck_average_arched_long_1.addOrReplaceChild("neck_average_arched_long_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0245F, -1.5553F, -1.7338F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_long_1_crest = neck_average_arched_long_1_individual.addOrReplaceChild("neck_average_arched_long_1_crest", CubeListBuilder.create(), PartPose.offset(-0.0245F, -5.7743F, -0.9478F));

		PartDefinition neck_average_arched_long_1_crest_upper = neck_average_arched_long_1_crest.addOrReplaceChild("neck_average_arched_long_1_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.0402F, -2.0059F, -2.0315F));

		PartDefinition cube_r1 = neck_average_arched_long_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(585, 619).addBox(-3.1434F, -5.8622F, -2.7188F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1434F, -0.0037F, 2.5214F, 1.5708F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_long_1_crest_lower = neck_average_arched_long_1_crest.addOrReplaceChild("neck_average_arched_long_1_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.0926F, 1.6451F, 2.2412F));

		PartDefinition cube_r2 = neck_average_arched_long_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(615, 609).addBox(-4.08F, -10.0F, -0.92F, 4.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 2.885F, 2.7719F, 0.7854F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_long_1_middle_individual = neck_average_arched_long_1_individual.addOrReplaceChild("neck_average_arched_long_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.0308F, -2.1312F, -0.1863F));

		PartDefinition cube_r3 = neck_average_arched_long_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(597, 607).addBox(-5.0F, -10.0F, -1.0F, 5.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4442F, 2.6139F, 2.2422F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_average_arched_long_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(598, 623).addBox(-5.0784F, -9.0F, -0.9017F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1342F, 5.5526F, -0.0171F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_long_1_lower_individual = neck_average_arched_long_1_individual.addOrReplaceChild("neck_average_arched_long_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0891F, 0.309F, -0.5025F));

		PartDefinition cube_r5 = neck_average_arched_long_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(614, 623).addBox(-5.0792F, -11.0F, -0.9108F, 5.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5792F, 5.573F, 0.6151F, 0.3054F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_long_1_mane = neck_average_arched_long_1.addOrReplaceChild("neck_average_arched_long_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.4022F, -1.2514F));

		PartDefinition neck_average_arched_long_1_top_mane = neck_average_arched_long_1_mane.addOrReplaceChild("neck_average_arched_long_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.5308F, -2.3598F, -2.8526F));

		PartDefinition neck_average_arched_long_1_top_mane_connector = neck_average_arched_long_1_top_mane.addOrReplaceChild("neck_average_arched_long_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -0.8939F, 0.7151F));

		PartDefinition neck_average_arched_long_1_top_mane_connector_individual = neck_average_arched_long_1_top_mane_connector.addOrReplaceChild("neck_average_arched_long_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

		PartDefinition cube_r6 = neck_average_arched_long_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(930, 768).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_long_1_top_mane_connector2 = neck_average_arched_long_1_top_mane_connector.addOrReplaceChild("neck_average_arched_long_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

		PartDefinition neck_average_arched_long_1_top_mane_connector2_individual = neck_average_arched_long_1_top_mane_connector2.addOrReplaceChild("neck_average_arched_long_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.5034F, -0.7469F));

		PartDefinition cube_r7 = neck_average_arched_long_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(930, 777).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_long_1_top_mane_flow = neck_average_arched_long_1_top_mane_connector2.addOrReplaceChild("neck_average_arched_long_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, -0.0894F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_average_arched_long_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(916, 771).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

		PartDefinition neck_average_arched_long_1_bottom_mane = neck_average_arched_long_1_mane.addOrReplaceChild("neck_average_arched_long_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.5308F, 1.5732F, 2.0636F));

		PartDefinition neck_average_arched_long_1_bottom_mane_connector = neck_average_arched_long_1_bottom_mane.addOrReplaceChild("neck_average_arched_long_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

		PartDefinition neck_average_arched_long_1_bottom_mane_connector_individual = neck_average_arched_long_1_bottom_mane_connector.addOrReplaceChild("neck_average_arched_long_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.1182F, -0.0743F));

		PartDefinition cube_r9 = neck_average_arched_long_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(942, 763).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5567F, -3.2223F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_long_1_bottom_mane_connector2 = neck_average_arched_long_1_bottom_mane_connector.addOrReplaceChild("neck_average_arched_long_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));

		PartDefinition neck_average_arched_long_1_bottom_mane_connector2_individual = neck_average_arched_long_1_bottom_mane_connector2.addOrReplaceChild("neck_average_arched_long_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, -0.5107F, -0.4867F));

		PartDefinition cube_r10 = neck_average_arched_long_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(942, 777).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.2603F, -3.6251F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_arched_long_1_bottom_mane_flow = neck_average_arched_long_1_bottom_mane_connector2.addOrReplaceChild("neck_average_arched_long_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.3575F, 0.0F));

		PartDefinition cube_r11 = neck_average_arched_long_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(916, 771).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_average_arched_long_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_average_arched_long_1;
    }
}