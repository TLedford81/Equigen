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

public class neck_muscular_ewed_average_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart neck_muscular_ewed_average_1;

	public neck_muscular_ewed_average_1(ModelPart root) {
		this.neck_muscular_ewed_average_1 = root.getChild("neck_muscular_ewed_average_1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_muscular_ewed_average_1 = partdefinition.addOrReplaceChild("neck_muscular_ewed_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_muscular_ewed_average_1_individual = neck_muscular_ewed_average_1.addOrReplaceChild("neck_muscular_ewed_average_1_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, -0.5721F, 0.0971F));

		PartDefinition neck_muscular_ewed_average_1_crest = neck_muscular_ewed_average_1_individual.addOrReplaceChild("neck_muscular_ewed_average_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.7374F, -1.0726F));

		PartDefinition neck_muscular_ewed_average_1_crest_upper = neck_muscular_ewed_average_1_crest.addOrReplaceChild("neck_muscular_ewed_average_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.0086F, -2.6997F, -1.8835F));

		PartDefinition cube_r1 = neck_muscular_ewed_average_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(474, 777).addBox(-5.08F, -4.0F, -2.92F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 0.3935F, 0.3783F, 0.9599F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_average_1_crest_lower = neck_muscular_ewed_average_1_crest.addOrReplaceChild("neck_muscular_ewed_average_1_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.0808F, 0.4535F, 0.8905F));

		PartDefinition cube_r2 = neck_muscular_ewed_average_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(492, 777).addBox(-5.08F, -7.0F, -0.92F, 5.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 2.5033F, 1.6552F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_average_1_middle_individual = neck_muscular_ewed_average_1_individual.addOrReplaceChild("neck_muscular_ewed_average_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.0335F, -3.3155F, -2.3504F));

		PartDefinition cube_r3 = neck_muscular_ewed_average_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(473, 764).addBox(-5.0F, -8.0F, -1.0F, 6.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 3.4406F, 1.1884F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_average_1_lower_individual = neck_muscular_ewed_average_1_individual.addOrReplaceChild("neck_muscular_ewed_average_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.028F, -1.9419F, -3.3914F));

		PartDefinition cube_r4 = neck_muscular_ewed_average_1_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(493, 764).addBox(-6.0784F, -8.0F, -0.9017F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 3.665F, -0.155F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_average_1_mane = neck_muscular_ewed_average_1.addOrReplaceChild("neck_muscular_ewed_average_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.6872F, 0.0F));

		PartDefinition neck_muscular_ewed_average_1_top_mane = neck_muscular_ewed_average_1_mane.addOrReplaceChild("neck_muscular_ewed_average_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -1.1978F, -0.9755F));

		PartDefinition neck_muscular_ewed_average_1_top_mane_connector = neck_muscular_ewed_average_1_top_mane.addOrReplaceChild("neck_muscular_ewed_average_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.8771F, -1.5196F));

		PartDefinition neck_muscular_ewed_average_1_top_mane_connector_individual = neck_muscular_ewed_average_1_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_average_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.395F, -0.7819F));

		PartDefinition cube_r5 = neck_muscular_ewed_average_1_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(820, 874).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3927F, 0.2456F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_average_1_top_mane_connector2 = neck_muscular_ewed_average_1_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_average_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

		PartDefinition neck_muscular_ewed_average_1_top_mane_connector2_individual = neck_muscular_ewed_average_1_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_average_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.2536F, -0.4057F));

		PartDefinition cube_r6 = neck_muscular_ewed_average_1_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(820, 880).addBox(-2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8023F, -0.0412F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_average_1_top_mane_flow = neck_muscular_ewed_average_1_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_average_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5922F, 0.0F, -0.0894F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r7 = neck_muscular_ewed_average_1_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(808, 874).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4712F, -0.2206F, -0.3514F));

		PartDefinition neck_muscular_ewed_average_1_bottom_mane = neck_muscular_ewed_average_1_mane.addOrReplaceChild("neck_muscular_ewed_average_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 1.4838F, 0.8122F));

		PartDefinition neck_muscular_ewed_average_1_bottom_mane_connector = neck_muscular_ewed_average_1_bottom_mane.addOrReplaceChild("neck_muscular_ewed_average_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

		PartDefinition neck_muscular_ewed_average_1_bottom_mane_connector_individual = neck_muscular_ewed_average_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_average_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.5149F, -0.3787F));

		PartDefinition cube_r8 = neck_muscular_ewed_average_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(830, 871).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.16F, -2.9179F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_average_1_bottom_mane_connector2 = neck_muscular_ewed_average_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_average_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -1.4302F, 0.0894F));

		PartDefinition neck_muscular_ewed_average_1_bottom_mane_connector2_individual = neck_muscular_ewed_average_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_average_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.5228F, -0.076F));

		PartDefinition cube_r9 = neck_muscular_ewed_average_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(829, 882).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8636F, -3.3207F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_average_1_bottom_mane_flow = neck_muscular_ewed_average_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_average_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.4134F, 0.3575F, 0.2682F));

		PartDefinition cube_r10 = neck_muscular_ewed_average_1_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(809, 876).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2682F, 0.1788F, -0.8901F, -0.0927F, -0.1377F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_muscular_ewed_average_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_muscular_ewed_average_1;
    }

	@Override
	public void positionParts() {
		super.positionParts(root(), root());
	}
}