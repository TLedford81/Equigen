package net.buckleystudios.equigen.entity.client.parts.necks.ewed;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class neck_muscular_ewed_average_2 extends HierarchicalModel<GeneticHorseEntity> {
	private final ModelPart neck_muscular_ewed_average_2;

	public neck_muscular_ewed_average_2(ModelPart root) {
		this.neck_muscular_ewed_average_2 = root.getChild("neck_muscular_ewed_average_2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_muscular_ewed_average_2 = partdefinition.addOrReplaceChild("neck_muscular_ewed_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_muscular_ewed_average_2_individual = neck_muscular_ewed_average_2.addOrReplaceChild("neck_muscular_ewed_average_2_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, -0.9296F, -0.4392F));

		PartDefinition neck_muscular_ewed_average_2_crest = neck_muscular_ewed_average_2_individual.addOrReplaceChild("neck_muscular_ewed_average_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.7374F, -1.162F));

		PartDefinition neck_muscular_ewed_average_2_crest_upper = neck_muscular_ewed_average_2_crest.addOrReplaceChild("neck_muscular_ewed_average_2_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.1934F, -2.6439F, -1.8366F));

		PartDefinition cube_r1 = neck_muscular_ewed_average_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(529, 777).addBox(-5.0792F, -4.0F, -2.8908F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5792F, 0.4175F, 0.4509F, 0.9599F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_average_2_crest_lower = neck_muscular_ewed_average_2_crest.addOrReplaceChild("neck_muscular_ewed_average_2_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1702F, 0.8631F, 1.2667F));

		PartDefinition cube_r2 = neck_muscular_ewed_average_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(547, 777).addBox(-5.08F, -7.0F, -0.92F, 5.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 2.0938F, 1.3684F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_average_2_middle_individual = neck_muscular_ewed_average_2_individual.addOrReplaceChild("neck_muscular_ewed_average_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.2123F, -2.9059F, -2.0636F));

		PartDefinition cube_r3 = neck_muscular_ewed_average_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(528, 763).addBox(-5.0F, -8.0F, -1.0F, 6.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 3.031F, 0.9016F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_average_2_lower_individual = neck_muscular_ewed_average_2_individual.addOrReplaceChild("neck_muscular_ewed_average_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.2068F, -1.4589F, -3.262F));

		PartDefinition cube_r4 = neck_muscular_ewed_average_2_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(548, 763).addBox(-6.0784F, -8.0F, -0.9017F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 3.182F, -0.2844F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_average_2_mane = neck_muscular_ewed_average_2.addOrReplaceChild("neck_muscular_ewed_average_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -6.9721F, 0.0F));

		PartDefinition neck_muscular_ewed_average_2_top_mane = neck_muscular_ewed_average_2_mane.addOrReplaceChild("neck_muscular_ewed_average_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -2.0022F, -1.5118F));

		PartDefinition neck_muscular_ewed_average_2_top_mane_connector = neck_muscular_ewed_average_2_top_mane.addOrReplaceChild("neck_muscular_ewed_average_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -2.1453F, -1.5196F));

		PartDefinition neck_muscular_ewed_average_2_top_mane_connector_individual = neck_muscular_ewed_average_2_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_average_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.395F, -0.7819F));

		PartDefinition cube_r5 = neck_muscular_ewed_average_2_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(871, 874).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3927F, 0.2456F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_average_2_top_mane_connector2 = neck_muscular_ewed_average_2_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_average_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

		PartDefinition neck_muscular_ewed_average_2_top_mane_connector2_individual = neck_muscular_ewed_average_2_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_average_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.2536F, -0.4057F));

		PartDefinition cube_r6 = neck_muscular_ewed_average_2_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(871, 880).addBox(-2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8023F, -0.0412F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_average_2_top_mane_flow = neck_muscular_ewed_average_2_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_average_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7709F, 0.0F, -0.0894F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r7 = neck_muscular_ewed_average_2_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(859, 874).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4712F, -0.2206F, -0.3514F));

		PartDefinition neck_muscular_ewed_average_2_bottom_mane = neck_muscular_ewed_average_2_mane.addOrReplaceChild("neck_muscular_ewed_average_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 0.4112F, 0.2759F));

		PartDefinition neck_muscular_ewed_average_2_bottom_mane_connector = neck_muscular_ewed_average_2_bottom_mane.addOrReplaceChild("neck_muscular_ewed_average_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

		PartDefinition neck_muscular_ewed_average_2_bottom_mane_connector_individual = neck_muscular_ewed_average_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_average_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.1182F, -0.0743F));

		PartDefinition cube_r8 = neck_muscular_ewed_average_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(883, 869).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5567F, -3.2223F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_average_2_bottom_mane_connector2 = neck_muscular_ewed_average_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_average_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -1.4302F, 0.0894F));

		PartDefinition neck_muscular_ewed_average_2_bottom_mane_connector2_individual = neck_muscular_ewed_average_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_average_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.9195F, 0.2284F));

		PartDefinition cube_r9 = neck_muscular_ewed_average_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(881, 881).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.2603F, -3.6251F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_average_2_bottom_mane_flow = neck_muscular_ewed_average_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_average_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.5028F, 0.3575F, 0.2682F));

		PartDefinition cube_r10 = neck_muscular_ewed_average_2_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(859, 875).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2682F, 0.1788F, -0.8901F, -0.0927F, -0.1377F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_muscular_ewed_average_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_muscular_ewed_average_2;
    }
}