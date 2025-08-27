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

public class neck_lean_arched_short_2 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart neck_lean_arched_short_2;

	public neck_lean_arched_short_2(ModelPart root) {
		this.neck_lean_arched_short_2 = root.getChild("neck_lean_arched_short_2");
    }

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_lean_arched_short_2 = partdefinition.addOrReplaceChild("neck_lean_arched_short_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_lean_arched_short_2_individual = neck_lean_arched_short_2.addOrReplaceChild("neck_lean_arched_short_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2927F, -0.2145F, -0.5718F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_2_crest = neck_lean_arched_short_2_individual.addOrReplaceChild("neck_lean_arched_short_2_crest", CubeListBuilder.create(), PartPose.offset(-0.2927F, -4.076F, -1.7523F));

		PartDefinition neck_lean_arched_short_2_crest_upper = neck_lean_arched_short_2_crest.addOrReplaceChild("neck_lean_arched_short_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.2279F, -1.6092F, -1.3784F));

		PartDefinition cube_r1 = neck_lean_arched_short_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(445, 583).addBox(-3.1434F, -5.8622F, -2.7188F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1434F, 0.1751F, 2.6108F, 1.5708F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_2_crest_lower = neck_lean_arched_short_2_crest.addOrReplaceChild("neck_lean_arched_short_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1756F, 0.8064F, 1.48F));

		PartDefinition cube_r2 = neck_lean_arched_short_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(417, 583).addBox(-4.08F, -10.0F, -0.92F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 4.2992F, 4.1861F, 0.7854F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_2_middle_individual = neck_lean_arched_short_2_individual.addOrReplaceChild("neck_lean_arched_short_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.2724F, -1.2262F, -1.4871F));

		PartDefinition cube_r3 = neck_lean_arched_short_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(429, 583).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1077F, 6.5639F, 0.5066F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_lean_arched_short_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(418, 571).addBox(-4.0F, -10.0F, -1.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9707F, 3.9827F, 3.3916F, 0.7854F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_2_lower_individual = neck_lean_arched_short_2_individual.addOrReplaceChild("neck_lean_arched_short_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.2065F, 0.6665F, -1.5464F));

		PartDefinition cube_r5 = neck_lean_arched_short_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(434, 572).addBox(-4.08F, -11.0F, -0.92F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 7.524F, 0.8979F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_2_mane = neck_lean_arched_short_2.addOrReplaceChild("neck_lean_arched_short_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -4.8268F, 0.0F));

		PartDefinition neck_lean_arched_short_2_top_mane = neck_lean_arched_short_2_mane.addOrReplaceChild("neck_lean_arched_short_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, -2.9855F, -0.0817F));

		PartDefinition neck_lean_arched_short_2_top_mane_connector = neck_lean_arched_short_2_top_mane.addOrReplaceChild("neck_lean_arched_short_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -0.2682F, -2.5922F));

		PartDefinition neck_lean_arched_short_2_top_mane_connector_individual = neck_lean_arched_short_2_top_mane_connector.addOrReplaceChild("neck_lean_arched_short_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

		PartDefinition cube_r6 = neck_lean_arched_short_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(767, 770).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_2_top_mane_connector2 = neck_lean_arched_short_2_top_mane_connector.addOrReplaceChild("neck_lean_arched_short_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.4469F));

		PartDefinition neck_lean_arched_short_2_top_mane_connector2_individual = neck_lean_arched_short_2_top_mane_connector2.addOrReplaceChild("neck_lean_arched_short_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.5034F, -0.3893F));

		PartDefinition cube_r7 = neck_lean_arched_short_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(767, 777).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_2_top_mane_flow = neck_lean_arched_short_2_top_mane_connector2.addOrReplaceChild("neck_lean_arched_short_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, 0.2682F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_lean_arched_short_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(753, 771).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

		PartDefinition neck_lean_arched_short_2_bottom_mane = neck_lean_arched_short_2_mane.addOrReplaceChild("neck_lean_arched_short_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, 1.5732F, 1.5273F));

		PartDefinition neck_lean_arched_short_2_bottom_mane_connector = neck_lean_arched_short_2_bottom_mane.addOrReplaceChild("neck_lean_arched_short_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

		PartDefinition neck_lean_arched_short_2_bottom_mane_connector_individual = neck_lean_arched_short_2_bottom_mane_connector.addOrReplaceChild("neck_lean_arched_short_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -1.7049F, -1.2918F));

		PartDefinition cube_r9 = neck_lean_arched_short_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(776, 771).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.97F, -2.0048F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_2_bottom_mane_connector2 = neck_lean_arched_short_2_bottom_mane_connector.addOrReplaceChild("neck_lean_arched_short_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -2.4134F, -0.8045F));

		PartDefinition neck_lean_arched_short_2_bottom_mane_connector2_individual = neck_lean_arched_short_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_arched_short_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.316F, -0.0952F));

		PartDefinition cube_r10 = neck_lean_arched_short_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(775, 781).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6736F, -2.4076F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_short_2_bottom_mane_flow = neck_lean_arched_short_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_arched_short_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.1788F, 0.0F));

		PartDefinition cube_r11 = neck_lean_arched_short_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(757, 775).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, 1.4302F, 1.2514F, -0.8937F, -0.1201F, -0.1036F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_lean_arched_short_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_lean_arched_short_2;
    }

	@Override
	public void PositionParts() {
		super.PositionParts(root(), root());
	}
}