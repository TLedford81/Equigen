package net.buckleystudios.equigen.entity.client.parts.partmodels.necks.ewed;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartNeckModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class neck_muscular_ewed_short_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart neck_muscular_ewed_short_1;

	public neck_muscular_ewed_short_1(ModelPart root) {
		this.neck_muscular_ewed_short_1 = root.getChild("neck_muscular_ewed_short_1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_muscular_ewed_short_1 = partdefinition.addOrReplaceChild("neck_muscular_ewed_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_muscular_ewed_short_1_individual = neck_muscular_ewed_short_1.addOrReplaceChild("neck_muscular_ewed_short_1_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, 0.9475F, 0.991F));

		PartDefinition cube_r1 = neck_muscular_ewed_short_1_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(364, 777).addBox(-4.08F, -4.0F, -2.92F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.516F, -7.0436F, -2.3097F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r2 = neck_muscular_ewed_short_1_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(380, 766).addBox(-6.0784F, -8.0F, -0.9017F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5504F, 1.7231F, -3.5465F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r3 = neck_muscular_ewed_short_1_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(382, 777).addBox(-5.08F, -7.0F, -0.92F, 5.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4992F, -1.7806F, 1.4731F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_muscular_ewed_short_1_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(360, 766).addBox(-5.0F, -8.0F, -1.0F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9665F, 0.1251F, -1.162F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_short_1_mane = neck_muscular_ewed_short_1.addOrReplaceChild("neck_muscular_ewed_short_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.3296F, 0.0F));

		PartDefinition neck_muscular_ewed_short_1_top_mane = neck_muscular_ewed_short_1_mane.addOrReplaceChild("neck_muscular_ewed_short_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -1.2872F, -0.9755F));

		PartDefinition neck_muscular_ewed_short_1_top_mane_connector = neck_muscular_ewed_short_1_top_mane.addOrReplaceChild("neck_muscular_ewed_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.1788F, -1.162F));

		PartDefinition neck_muscular_ewed_short_1_top_mane_connector_individual = neck_muscular_ewed_short_1_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, -0.0147F, 0.1266F));

		PartDefinition cube_r5 = neck_muscular_ewed_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(725, 874).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8192F, -0.5736F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_short_1_top_mane_connector2 = neck_muscular_ewed_short_1_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.4469F, 0.8045F));

		PartDefinition neck_muscular_ewed_short_1_top_mane_connector2_individual = neck_muscular_ewed_short_1_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.4665F, 0.0227F, -0.391F));

		PartDefinition cube_r6 = neck_muscular_ewed_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(725, 880).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2287F, -0.8604F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_short_1_top_mane_flow = neck_muscular_ewed_short_1_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7709F, -0.3575F, 0.0894F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r7 = neck_muscular_ewed_short_1_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(713, 874).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, -0.4463F, -0.7381F, -0.4276F, -0.2206F, -0.3514F));

		PartDefinition neck_muscular_ewed_short_1_bottom_mane = neck_muscular_ewed_short_1_mane.addOrReplaceChild("neck_muscular_ewed_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 1.752F, 0.8122F));

		PartDefinition neck_muscular_ewed_short_1_bottom_mane_connector = neck_muscular_ewed_short_1_bottom_mane.addOrReplaceChild("neck_muscular_ewed_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

		PartDefinition neck_muscular_ewed_short_1_bottom_mane_connector_individual = neck_muscular_ewed_short_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 0.3678F, 0.2301F));

		PartDefinition cube_r8 = neck_muscular_ewed_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(735, 875).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9534F, -3.5267F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_short_1_bottom_mane_connector2 = neck_muscular_ewed_short_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.7151F, 0.6257F));

		PartDefinition neck_muscular_ewed_short_1_bottom_mane_connector2_individual = neck_muscular_ewed_short_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, 0.6905F, -0.0035F));

		PartDefinition cube_r9 = neck_muscular_ewed_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(732, 884).addBox(-2.0F, -2.0F, 1.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6569F, -3.9295F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_short_1_bottom_mane_flow = neck_muscular_ewed_short_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.5922F, 0.3575F, 0.3575F));

		PartDefinition cube_r10 = neck_muscular_ewed_short_1_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(716, 878).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7151F, -0.8939F, -0.4469F, -0.8901F, -0.0927F, -0.1377F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_muscular_ewed_short_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_muscular_ewed_short_1;
    }

	@Override
	public void positionParts() {
		super.positionParts(root(), root());
	}
}