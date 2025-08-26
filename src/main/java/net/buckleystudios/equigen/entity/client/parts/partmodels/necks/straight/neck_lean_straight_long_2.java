package net.buckleystudios.equigen.entity.client.parts.partmodels.necks.straight;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class neck_lean_straight_long_2 extends HierarchicalModel<GeneticHorseEntity> {
	private final ModelPart neck_lean_straight_long_2;

	public neck_lean_straight_long_2(ModelPart root) {
		this.neck_lean_straight_long_2 = root.getChild("neck_lean_straight_long_2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_lean_straight_long_2 = partdefinition.addOrReplaceChild("neck_lean_straight_long_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_lean_straight_long_2_individual = neck_lean_straight_long_2.addOrReplaceChild("neck_lean_straight_long_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, -3.5754F, -1.8771F, -0.5672F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_long_2_crest = neck_lean_straight_long_2_individual.addOrReplaceChild("neck_lean_straight_long_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -3.933F, -2.8603F));

		PartDefinition neck_lean_straight_long_2_crest_upper = neck_lean_straight_long_2_crest.addOrReplaceChild("neck_lean_straight_long_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3634F, -0.8149F, -1.5138F));

		PartDefinition cube_r1 = neck_lean_straight_long_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(637, 831).addBox(-2.08F, -4.0F, -3.92F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.08F, -0.754F, 0.5736F, 1.6144F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_long_2_crest_lower = neck_lean_straight_long_2_crest.addOrReplaceChild("neck_lean_straight_long_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2935F, 0.4963F, 3.0489F));

		PartDefinition cube_r2 = neck_lean_straight_long_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(667, 831).addBox(-3.08F, -5.0F, -0.92F, 3.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 0.2838F, 0.4193F, 1.1345F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_long_2_middle_individual = neck_lean_straight_long_2_individual.addOrReplaceChild("neck_lean_straight_long_2_middle_individual", CubeListBuilder.create(), PartPose.offset(0.3511F, -0.3575F, -0.3432F));

		PartDefinition cube_r3 = neck_lean_straight_long_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(657, 816).addBox(-3.0F, -7.0F, -1.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9897F, 0.4154F, 1.6232F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_lean_straight_long_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(639, 814).addBox(-4.0708F, -11.03F, -0.9292F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0811F, 5.5613F, 2.1571F, 0.8727F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_long_2_lower_individual = neck_lean_straight_long_2_individual.addOrReplaceChild("neck_lean_straight_long_2_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3463F, 0.3427F, -2.7757F));

		PartDefinition cube_r5 = neck_lean_straight_long_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(653, 831).addBox(-4.0784F, -5.0F, -0.9017F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 1.76F, 0.5988F, 0.9599F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_long_2_mane = neck_lean_straight_long_2.addOrReplaceChild("neck_lean_straight_long_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.1341F, 0.0F));

		PartDefinition neck_lean_straight_long_2_top_mane = neck_lean_straight_long_2_mane.addOrReplaceChild("neck_lean_straight_long_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -3.0749F, -3.1208F));

		PartDefinition neck_lean_straight_long_2_top_mane_connector = neck_lean_straight_long_2_top_mane.addOrReplaceChild("neck_lean_straight_long_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.5363F, -1.0726F));

		PartDefinition neck_lean_straight_long_2_top_mane_connector_individual = neck_lean_straight_long_2_top_mane_connector.addOrReplaceChild("neck_lean_straight_long_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

		PartDefinition cube_r6 = neck_lean_straight_long_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(988, 906).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_long_2_top_mane_connector2 = neck_lean_straight_long_2_top_mane_connector.addOrReplaceChild("neck_lean_straight_long_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

		PartDefinition neck_lean_straight_long_2_top_mane_connector2_individual = neck_lean_straight_long_2_top_mane_connector2.addOrReplaceChild("neck_lean_straight_long_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.8771F, 0.2024F, -0.0684F));

		PartDefinition cube_r7 = neck_lean_straight_long_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(988, 913).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_long_2_top_mane_flow = neck_lean_straight_long_2_top_mane_connector2.addOrReplaceChild("neck_lean_straight_long_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, -0.3575F, 0.0894F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_lean_straight_long_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(974, 907).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

		PartDefinition neck_lean_straight_long_2_bottom_mane = neck_lean_straight_long_2_mane.addOrReplaceChild("neck_lean_straight_long_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -0.1251F, -0.3498F));

		PartDefinition neck_lean_straight_long_2_bottom_mane_connector = neck_lean_straight_long_2_bottom_mane.addOrReplaceChild("neck_lean_straight_long_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

		PartDefinition neck_lean_straight_long_2_bottom_mane_connector_individual = neck_lean_straight_long_2_bottom_mane_connector.addOrReplaceChild("neck_lean_straight_long_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 2.1572F, 1.245F));

		PartDefinition cube_r9 = neck_lean_straight_long_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(997, 902).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.7427F, -4.5417F, -0.9599F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_long_2_bottom_mane_connector2 = neck_lean_straight_long_2_bottom_mane_connector.addOrReplaceChild("neck_lean_straight_long_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, 1.4302F, 1.8771F));

		PartDefinition neck_lean_straight_long_2_bottom_mane_connector2_individual = neck_lean_straight_long_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_straight_long_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.3524F, -0.2274F));

		PartDefinition cube_r10 = neck_lean_straight_long_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(991, 915).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.4641F, -4.957F, -0.9599F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_long_2_bottom_mane_flow = neck_lean_straight_long_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_straight_long_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.6983F, 0.4469F, 0.5363F));

		PartDefinition cube_r11 = neck_lean_straight_long_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(975, 908).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -2.6816F, -1.8771F, -0.9753F, -0.1144F, -0.1002F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_lean_straight_long_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_lean_straight_long_2;
    }
}