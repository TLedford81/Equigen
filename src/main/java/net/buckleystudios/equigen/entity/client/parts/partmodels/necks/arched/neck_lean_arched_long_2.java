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

public class neck_lean_arched_long_2 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart neck_lean_arched_long_2;

	public neck_lean_arched_long_2(ModelPart root) {
		this.neck_lean_arched_long_2 = root.getChild("neck_lean_arched_long_2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_lean_arched_long_2 = partdefinition.addOrReplaceChild("neck_lean_arched_long_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_lean_arched_long_2_individual = neck_lean_arched_long_2.addOrReplaceChild("neck_lean_arched_long_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0245F, 0.0536F, 0.1433F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_long_2_crest = neck_lean_arched_long_2_individual.addOrReplaceChild("neck_lean_arched_long_2_crest", CubeListBuilder.create(), PartPose.offset(-0.0245F, -0.0536F, -0.1433F));

		PartDefinition neck_lean_arched_long_2_crest_upper = neck_lean_arched_long_2_crest.addOrReplaceChild("neck_lean_arched_long_2_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.0402F, -9.9154F, -5.7723F));

		PartDefinition cube_r1 = neck_lean_arched_long_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(638, 582).addBox(-3.1434F, -5.8622F, -2.7188F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1434F, 0.4432F, 2.3426F, 1.5708F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_long_2_crest_lower = neck_lean_arched_long_2_crest.addOrReplaceChild("neck_lean_arched_long_2_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.0926F, -5.4639F, -1.4142F));

		PartDefinition cube_r2 = neck_lean_arched_long_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(666, 571).addBox(-4.08F, -10.0F, -0.92F, 4.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 2.5314F, 2.4183F, 0.7854F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_long_2_middle_individual = neck_lean_arched_long_2_individual.addOrReplaceChild("neck_lean_arched_long_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.0042F, -3.2313F, -2.8365F));

		PartDefinition cube_r3 = neck_lean_arched_long_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(650, 569).addBox(-4.0F, -10.0F, -1.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9707F, 1.9721F, 1.6879F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_lean_arched_long_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(650, 586).addBox(-5.0784F, -9.0F, -0.9017F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1077F, 5.3578F, 0.0543F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_long_2_lower_individual = neck_lean_arched_long_2_individual.addOrReplaceChild("neck_lean_arched_long_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1254F, -0.9561F, -3.5567F));

		PartDefinition cube_r5 = neck_lean_arched_long_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(666, 586).addBox(-4.0792F, -11.0F, -0.9108F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, 5.0961F, 0.4647F, 0.3054F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_long_2_mane = neck_lean_arched_long_2.addOrReplaceChild("neck_lean_arched_long_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -6.6145F, 0.0F));

		PartDefinition neck_lean_arched_long_2_top_mane = neck_lean_arched_long_2_mane.addOrReplaceChild("neck_lean_arched_long_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.5308F, -4.505F, -3.7465F));

		PartDefinition neck_lean_arched_long_2_top_mane_connector = neck_lean_arched_long_2_top_mane.addOrReplaceChild("neck_lean_arched_long_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.0726F, -0.7151F));

		PartDefinition neck_lean_arched_long_2_top_mane_connector_individual = neck_lean_arched_long_2_top_mane_connector.addOrReplaceChild("neck_lean_arched_long_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

		PartDefinition cube_r6 = neck_lean_arched_long_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(976, 770).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_long_2_top_mane_connector2 = neck_lean_arched_long_2_top_mane_connector.addOrReplaceChild("neck_lean_arched_long_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

		PartDefinition neck_lean_arched_long_2_top_mane_connector2_individual = neck_lean_arched_long_2_top_mane_connector2.addOrReplaceChild("neck_lean_arched_long_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.5034F, -0.7469F));

		PartDefinition cube_r7 = neck_lean_arched_long_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(976, 777).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_long_2_top_mane_flow = neck_lean_arched_long_2_top_mane_connector2.addOrReplaceChild("neck_lean_arched_long_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, -0.0894F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_lean_arched_long_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(993, 763).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

		PartDefinition neck_lean_arched_long_2_bottom_mane = neck_lean_arched_long_2_mane.addOrReplaceChild("neck_lean_arched_long_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.5308F, -0.7508F, -0.2604F));

		PartDefinition neck_lean_arched_long_2_bottom_mane_connector = neck_lean_arched_long_2_bottom_mane.addOrReplaceChild("neck_lean_arched_long_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

		PartDefinition neck_lean_arched_long_2_bottom_mane_connector_individual = neck_lean_arched_long_2_bottom_mane_connector.addOrReplaceChild("neck_lean_arched_long_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.2784F, 0.2301F));

		PartDefinition cube_r9 = neck_lean_arched_long_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(992, 762).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9534F, -3.5267F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_long_2_bottom_mane_connector2 = neck_lean_arched_long_2_bottom_mane_connector.addOrReplaceChild("neck_lean_arched_long_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.3575F, 0.0F, 0.8045F));

		PartDefinition neck_lean_arched_long_2_bottom_mane_connector2_individual = neck_lean_arched_long_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_arched_long_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.9665F, -0.114F, -0.1823F));

		PartDefinition cube_r10 = neck_lean_arched_long_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(992, 777).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6569F, -3.9295F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_lean_arched_long_2_bottom_mane_flow = neck_lean_arched_long_2_bottom_mane_connector2.addOrReplaceChild("neck_lean_arched_long_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.6089F, -0.3575F, 0.0F));

		PartDefinition cube_r11 = neck_lean_arched_long_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(977, 770).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_lean_arched_long_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_lean_arched_long_2;
    }


}