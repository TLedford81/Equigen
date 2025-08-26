package net.buckleystudios.equigen.entity.client.parts.partmodels.necks.ewed;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class neck_average_ewed_long_2 extends HierarchicalModel<GeneticHorseEntity> {
	private final ModelPart neck_average_ewed_long_2;

	public neck_average_ewed_long_2(ModelPart root) {
		this.neck_average_ewed_long_2 = root.getChild("neck_average_ewed_long_2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_average_ewed_long_2 = partdefinition.addOrReplaceChild("neck_average_ewed_long_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_average_ewed_long_2_individual = neck_average_ewed_long_2.addOrReplaceChild("neck_average_ewed_long_2_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, -2.8067F, -1.0649F));

		PartDefinition neck_average_ewed_long_2_crest = neck_average_ewed_long_2_individual.addOrReplaceChild("neck_average_ewed_long_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.2905F, 0.0F));

		PartDefinition neck_average_ewed_long_2_crest_upper = neck_average_ewed_long_2_crest.addOrReplaceChild("neck_average_ewed_long_2_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.1359F, -3.072F, -2.903F));

		PartDefinition cube_r1 = neck_average_ewed_long_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(645, 744).addBox(-4.0792F, -4.0F, -2.8908F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, 0.4175F, 0.3615F, 0.9599F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_long_2_crest_lower = neck_average_ewed_long_2_crest.addOrReplaceChild("neck_average_ewed_long_2_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1171F, 1.2353F, 0.6782F));

		PartDefinition cube_r2 = neck_average_ewed_long_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(661, 744).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 1.2746F, 0.7948F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_long_2_middle_individual = neck_average_ewed_long_2_individual.addOrReplaceChild("neck_average_ewed_long_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1592F, -2.0867F, -1.49F));

		PartDefinition cube_r3 = neck_average_ewed_long_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(643, 728).addBox(-4.0F, -8.0F, -1.0F, 5.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 2.2119F, 0.328F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_long_2_lower_individual = neck_average_ewed_long_2_individual.addOrReplaceChild("neck_average_ewed_long_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0643F, -0.493F, -3.0032F));

		PartDefinition cube_r4 = neck_average_ewed_long_2_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(661, 728).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 2.2161F, -0.5432F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_long_2_mane = neck_average_ewed_long_2.addOrReplaceChild("neck_average_ewed_long_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.4916F, -1.0726F));

		PartDefinition neck_average_ewed_long_2_top_mane = neck_average_ewed_long_2_mane.addOrReplaceChild("neck_average_ewed_long_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -2.8961F, -1.0649F));

		PartDefinition neck_average_ewed_long_2_top_mane_connector = neck_average_ewed_long_2_top_mane.addOrReplaceChild("neck_average_ewed_long_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.6089F, -1.5196F));

		PartDefinition neck_average_ewed_long_2_top_mane_connector_individual = neck_average_ewed_long_2_top_mane_connector.addOrReplaceChild("neck_average_ewed_long_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.395F, -0.7819F));

		PartDefinition cube_r5 = neck_average_ewed_long_2_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(993, 841).mirror().addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 1.3927F, 0.2456F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_long_2_top_mane_connector2 = neck_average_ewed_long_2_top_mane_connector.addOrReplaceChild("neck_average_ewed_long_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

		PartDefinition neck_average_ewed_long_2_top_mane_connector2_individual = neck_average_ewed_long_2_top_mane_connector2.addOrReplaceChild("neck_average_ewed_long_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.2536F, -0.4057F));

		PartDefinition cube_r6 = neck_average_ewed_long_2_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(990, 849).mirror().addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 1.8023F, -0.0412F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_long_2_top_mane_flow = neck_average_ewed_long_2_top_mane_connector2.addOrReplaceChild("neck_average_ewed_long_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1453F, 0.0F, -0.0894F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r7 = neck_average_ewed_long_2_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(978, 843).mirror().addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4712F, -0.2206F, -0.3514F));

		PartDefinition neck_average_ewed_long_2_bottom_mane = neck_average_ewed_long_2_mane.addOrReplaceChild("neck_average_ewed_long_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 0.0536F, 0.7228F));

		PartDefinition neck_average_ewed_long_2_bottom_mane_connector = neck_average_ewed_long_2_bottom_mane.addOrReplaceChild("neck_average_ewed_long_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

		PartDefinition neck_average_ewed_long_2_bottom_mane_connector_individual = neck_average_ewed_long_2_bottom_mane_connector.addOrReplaceChild("neck_average_ewed_long_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.6751F, 0.5345F));

		PartDefinition cube_r8 = neck_average_ewed_long_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(993, 835).mirror().addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -3.3501F, -3.8311F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_long_2_bottom_mane_connector2 = neck_average_ewed_long_2_bottom_mane_connector.addOrReplaceChild("neck_average_ewed_long_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));

		PartDefinition neck_average_ewed_long_2_bottom_mane_connector2_individual = neck_average_ewed_long_2_bottom_mane_connector2.addOrReplaceChild("neck_average_ewed_long_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.2827F, 0.1221F));

		PartDefinition cube_r9 = neck_average_ewed_long_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(993, 849).mirror().addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -3.0536F, -4.2338F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_long_2_bottom_mane_flow = neck_average_ewed_long_2_bottom_mane_connector2.addOrReplaceChild("neck_average_ewed_long_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.3575F, 0.0894F));

		PartDefinition cube_r10 = neck_average_ewed_long_2_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(976, 842).mirror().addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_average_ewed_long_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_average_ewed_long_2;
    }
}