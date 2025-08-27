package net.buckleystudios.equigen.entity.client.parts.partmodels.necks.straight;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartNeckModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class neck_lean_straight_short_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart neck_lean_straight_short_1;

	public neck_lean_straight_short_1(ModelPart root) {
		this.neck_lean_straight_short_1 = root.getChild("neck_lean_straight_short_1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_lean_straight_short_1 = partdefinition.addOrReplaceChild("neck_lean_straight_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_lean_straight_short_1_individual = neck_lean_straight_short_1.addOrReplaceChild("neck_lean_straight_short_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, 0.8939F, 0.0894F, -0.5672F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_short_1_crest = neck_lean_straight_short_1_individual.addOrReplaceChild("neck_lean_straight_short_1_crest", CubeListBuilder.create(), PartPose.offset(0.2682F, -4.5587F, -2.9497F));

		PartDefinition neck_lean_straight_short_1_crest_upper = neck_lean_straight_short_1_crest.addOrReplaceChild("neck_lean_straight_short_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.0952F, -0.1892F, -1.6032F));

		PartDefinition cube_r1 = neck_lean_straight_short_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(361, 836).addBox(-2.08F, -4.0F, -3.92F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.08F, -0.754F, 0.7523F, 1.6144F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_short_1_crest_lower = neck_lean_straight_short_1_crest.addOrReplaceChild("neck_lean_straight_short_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.0254F, 0.2768F, 1.3257F));

		PartDefinition cube_r2 = neck_lean_straight_short_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(377, 836).addBox(-3.08F, -5.0F, -0.92F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 1.1291F, 2.232F, 1.1345F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_short_1_middle_individual = neck_lean_straight_short_1_individual.addOrReplaceChild("neck_lean_straight_short_1_middle_individual", CubeListBuilder.create(), PartPose.offset(0.3511F, -1.319F, -2.6837F));

		PartDefinition cube_r3 = neck_lean_straight_short_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(361, 825).addBox(-4.0708F, -11.03F, -0.9292F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0811F, 6.8804F, 4.3189F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_lean_straight_short_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(377, 826).addBox(-3.0F, -7.0F, -1.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9897F, 1.3769F, 3.9638F, 1.1345F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_short_1_lower_individual = neck_lean_straight_short_1_individual.addOrReplaceChild("neck_lean_straight_short_1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3463F, -0.2308F, -4.2206F));

		PartDefinition cube_r5 = neck_lean_straight_short_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(373, 817).addBox(-4.0784F, -5.0F, -0.9017F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 2.3336F, 1.4179F, 0.9599F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_short_1_mane = neck_lean_straight_short_1.addOrReplaceChild("neck_lean_straight_short_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -5.7207F, 0.0F));

		PartDefinition neck_lean_straight_short_1_top_mane = neck_lean_straight_short_1_mane.addOrReplaceChild("neck_lean_straight_short_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -0.5721F, -0.171F));

		PartDefinition neck_lean_straight_short_1_top_mane_connector = neck_lean_straight_short_1_top_mane.addOrReplaceChild("neck_lean_straight_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.9832F, -2.0559F));

		PartDefinition neck_lean_straight_short_1_top_mane_connector_individual = neck_lean_straight_short_1_top_mane_connector.addOrReplaceChild("neck_lean_straight_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

		PartDefinition cube_r6 = neck_lean_straight_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(724, 910).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_short_1_top_mane_connector2 = neck_lean_straight_short_1_top_mane_connector.addOrReplaceChild("neck_lean_straight_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

		PartDefinition neck_lean_straight_short_1_top_mane_connector2_individual = neck_lean_straight_short_1_top_mane_connector2.addOrReplaceChild("neck_lean_straight_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.8771F, 0.2024F, -0.0684F));

		PartDefinition cube_r7 = neck_lean_straight_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(726, 917).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_short_1_top_mane_flow = neck_lean_straight_short_1_top_mane_connector2.addOrReplaceChild("neck_lean_straight_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, -0.3575F, 0.0894F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_lean_straight_short_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(712, 911).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

		PartDefinition neck_lean_straight_short_1_bottom_mane = neck_lean_straight_short_1_mane.addOrReplaceChild("neck_lean_straight_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, 1.9307F, 1.6167F));

		PartDefinition neck_lean_straight_short_1_bottom_mane_connector = neck_lean_straight_short_1_bottom_mane.addOrReplaceChild("neck_lean_straight_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

		PartDefinition neck_lean_straight_short_1_bottom_mane_connector_individual = neck_lean_straight_short_1_bottom_mane_connector.addOrReplaceChild("neck_lean_straight_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 0.1093F, -0.1889F));

		PartDefinition cube_r9 = neck_lean_straight_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(735, 914).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6948F, -3.1077F, -0.9599F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_short_1_bottom_mane_connector2 = neck_lean_straight_short_1_bottom_mane_connector.addOrReplaceChild("neck_lean_straight_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.7151F, 0.6257F));

		PartDefinition neck_lean_straight_short_1_bottom_mane_connector2_individual = neck_lean_straight_short_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_straight_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.4498F, -0.4099F));

		PartDefinition cube_r10 = neck_lean_straight_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(732, 923).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.4162F, -3.523F, -0.9599F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_short_1_bottom_mane_flow = neck_lean_straight_short_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_straight_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.6983F, 0.1788F, -0.0894F));

		PartDefinition cube_r11 = neck_lean_straight_short_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(718, 917).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2682F, 0.0F, -0.9774F, -0.0927F, -0.1377F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_lean_straight_short_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_lean_straight_short_1;
    }

	@Override
	public void positionParts() {
		super.positionParts(root(), root());
	}
}