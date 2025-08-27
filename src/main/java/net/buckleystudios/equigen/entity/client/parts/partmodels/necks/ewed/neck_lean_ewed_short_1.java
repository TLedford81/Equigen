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

public class neck_lean_ewed_short_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart neck_lean_ewed_short_1;


	public neck_lean_ewed_short_1(ModelPart root) {
		this.neck_lean_ewed_short_1 = root.getChild("neck_lean_ewed_short_1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_lean_ewed_short_1 = partdefinition.addOrReplaceChild("neck_lean_ewed_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_lean_ewed_short_1_individual = neck_lean_ewed_short_1.addOrReplaceChild("neck_lean_ewed_short_1_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, 1.2156F, 0.9016F));

		PartDefinition neck_lean_ewed_short_1_crest = neck_lean_ewed_short_1_individual.addOrReplaceChild("neck_lean_ewed_short_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -6.5251F, -2.6816F));

		PartDefinition neck_lean_ewed_short_1_crest_upper = neck_lean_ewed_short_1_crest.addOrReplaceChild("neck_lean_ewed_short_1_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.1534F, -0.912F, -0.0958F));

		PartDefinition cube_r1 = neck_lean_ewed_short_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(365, 707).addBox(-3.08F, -4.0F, -2.92F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 0.3935F, 0.4677F, 0.9599F, 0.0F, 0.0F));

		PartDefinition neck_lean_ewed_short_1_crest_lower = neck_lean_ewed_short_1_crest.addOrReplaceChild("neck_lean_ewed_short_1_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1171F, 1.4221F, 1.9259F));

		PartDefinition cube_r2 = neck_lean_ewed_short_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(379, 707).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 3.3225F, 2.2288F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_lean_ewed_short_1_middle_individual = neck_lean_ewed_short_1_individual.addOrReplaceChild("neck_lean_ewed_short_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1955F, -4.1346F, -2.924F));

		PartDefinition cube_r3 = neck_lean_ewed_short_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(364, 696).addBox(-3.0F, -8.0F, -1.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.2598F, 1.7619F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_lean_ewed_short_1_lower_individual = neck_lean_ewed_short_1_individual.addOrReplaceChild("neck_lean_ewed_short_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.19F, -2.9078F, -3.6503F));

		PartDefinition cube_r4 = neck_lean_ewed_short_1_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(380, 696).addBox(-4.0784F, -8.0F, -0.9017F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 4.6309F, 0.1038F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_lean_ewed_short_1_mane = neck_lean_ewed_short_1.addOrReplaceChild("neck_lean_ewed_short_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -5.9888F, 0.0F));

		PartDefinition neck_lean_ewed_short_1_top_mane = neck_lean_ewed_short_1_mane.addOrReplaceChild("neck_lean_ewed_short_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -1.5553F, -1.0649F));

		PartDefinition neck_lean_ewed_short_1_top_mane_connector = neck_lean_ewed_short_1_top_mane.addOrReplaceChild("neck_lean_ewed_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -1.2514F, -1.0726F));

		PartDefinition neck_lean_ewed_short_1_top_mane_connector_individual = neck_lean_ewed_short_1_top_mane_connector.addOrReplaceChild("neck_lean_ewed_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.0747F, 0.1266F));

		PartDefinition cube_r5 = neck_lean_ewed_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(725, 844).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8192F, -0.5736F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_lean_ewed_short_1_top_mane_connector2 = neck_lean_ewed_short_1_top_mane_connector.addOrReplaceChild("neck_lean_ewed_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.4469F, 0.8045F));

		PartDefinition neck_lean_ewed_short_1_top_mane_connector2_individual = neck_lean_ewed_short_1_top_mane_connector2.addOrReplaceChild("neck_lean_ewed_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.9665F, 0.1121F, -0.391F));

		PartDefinition cube_r6 = neck_lean_ewed_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(725, 850).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2287F, -0.8604F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_lean_ewed_short_1_top_mane_flow = neck_lean_ewed_short_1_top_mane_connector2.addOrReplaceChild("neck_lean_ewed_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, -0.3575F, 0.0894F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r7 = neck_lean_ewed_short_1_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(713, 844).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9832F, -0.3569F, -0.7381F, -0.4276F, -0.2206F, -0.3514F));

		PartDefinition neck_lean_ewed_short_1_bottom_mane = neck_lean_ewed_short_1_mane.addOrReplaceChild("neck_lean_ewed_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 0.4112F, 0.7228F));

		PartDefinition neck_lean_ewed_short_1_bottom_mane_connector = neck_lean_ewed_short_1_bottom_mane.addOrReplaceChild("neck_lean_ewed_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

		PartDefinition neck_lean_ewed_short_1_bottom_mane_connector_individual = neck_lean_ewed_short_1_bottom_mane_connector.addOrReplaceChild("neck_lean_ewed_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 0.5466F, 0.2301F));

		PartDefinition cube_r8 = neck_lean_ewed_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(733, 845).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9534F, -3.5267F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_lean_ewed_short_1_bottom_mane_connector2 = neck_lean_ewed_short_1_bottom_mane_connector.addOrReplaceChild("neck_lean_ewed_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, 0.0F, 0.9832F));

		PartDefinition neck_lean_ewed_short_1_bottom_mane_connector2_individual = neck_lean_ewed_short_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_ewed_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, 0.1542F, -0.361F));

		PartDefinition cube_r9 = neck_lean_ewed_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(732, 854).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.6569F, -3.9295F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_lean_ewed_short_1_bottom_mane_flow = neck_lean_ewed_short_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_ewed_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.6983F, 0.0894F, 0.0F));

		PartDefinition cube_r10 = neck_lean_ewed_short_1_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(716, 848).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.8939F, -0.4469F, -0.8901F, -0.0927F, -0.1377F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_lean_ewed_short_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_lean_ewed_short_1;
    }

	@Override
	public void PositionParts() {
		super.PositionParts(root(), root());
	}
}