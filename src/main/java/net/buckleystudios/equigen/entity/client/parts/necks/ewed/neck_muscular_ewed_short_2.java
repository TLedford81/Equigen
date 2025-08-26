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

public class neck_muscular_ewed_short_2 extends HierarchicalModel<GeneticHorseEntity> {
	private final ModelPart neck_muscular_ewed_short_2;

	public neck_muscular_ewed_short_2(ModelPart root) {
		this.neck_muscular_ewed_short_2 = root.getChild("neck_muscular_ewed_short_2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_muscular_ewed_short_2 = partdefinition.addOrReplaceChild("neck_muscular_ewed_short_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_muscular_ewed_short_2_individual = neck_muscular_ewed_short_2.addOrReplaceChild("neck_muscular_ewed_short_2_individual", CubeListBuilder.create(), PartPose.offset(-0.0055F, 0.0536F, 0.0077F));

		PartDefinition neck_muscular_ewed_short_2_crest = neck_muscular_ewed_short_2_individual.addOrReplaceChild("neck_muscular_ewed_short_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -5.8101F, -1.5196F));

		PartDefinition neck_muscular_ewed_short_2_crest_upper = neck_muscular_ewed_short_2_crest.addOrReplaceChild("neck_muscular_ewed_short_2_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.064F, -1.6271F, -1.2578F));

		PartDefinition cube_r1 = neck_muscular_ewed_short_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(417, 777).addBox(-4.08F, -4.0F, -2.92F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 0.3935F, 0.4677F, 0.9599F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_short_2_crest_lower = neck_muscular_ewed_short_2_crest.addOrReplaceChild("neck_muscular_ewed_short_2_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.0808F, 1.1166F, 1.0506F));

		PartDefinition cube_r2 = neck_muscular_ewed_short_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(435, 777).addBox(-5.08F, -7.0F, -0.92F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 2.9129F, 1.942F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_short_2_middle_individual = neck_muscular_ewed_short_2_individual.addOrReplaceChild("neck_muscular_ewed_short_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1229F, -3.725F, -2.6372F));

		PartDefinition cube_r3 = neck_muscular_ewed_short_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(414, 765).addBox(-5.0F, -8.0F, -1.0F, 6.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 3.8502F, 1.4752F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_short_2_lower_individual = neck_muscular_ewed_short_2_individual.addOrReplaceChild("neck_muscular_ewed_short_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1174F, -2.4249F, -3.5209F));

		PartDefinition cube_r4 = neck_muscular_ewed_short_2_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(434, 765).addBox(-6.0784F, -8.0F, -0.9017F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5784F, 4.148F, -0.0256F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_short_2_mane = neck_muscular_ewed_short_2.addOrReplaceChild("neck_muscular_ewed_short_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.5978F, 0.0F));

		PartDefinition neck_muscular_ewed_short_2_top_mane = neck_muscular_ewed_short_2_mane.addOrReplaceChild("neck_muscular_ewed_short_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -0.3039F, -0.9755F));

		PartDefinition neck_muscular_ewed_short_2_top_mane_connector = neck_muscular_ewed_short_2_top_mane.addOrReplaceChild("neck_muscular_ewed_short_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -1.8771F, -1.8771F));

		PartDefinition neck_muscular_ewed_short_2_top_mane_connector_individual = neck_muscular_ewed_short_2_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_short_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, -0.0147F, 0.1266F));

		PartDefinition cube_r5 = neck_muscular_ewed_short_2_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(772, 874).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8192F, -0.5736F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_short_2_top_mane_connector2 = neck_muscular_ewed_short_2_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_short_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

		PartDefinition neck_muscular_ewed_short_2_top_mane_connector2_individual = neck_muscular_ewed_short_2_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_short_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.3771F, 0.0227F, -0.391F));

		PartDefinition cube_r6 = neck_muscular_ewed_short_2_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(772, 880).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2287F, -0.8604F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_short_2_top_mane_flow = neck_muscular_ewed_short_2_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_short_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4134F, -0.3575F, 0.0894F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r7 = neck_muscular_ewed_short_2_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(760, 874).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.4276F, -0.2206F, -0.3514F));

		PartDefinition neck_muscular_ewed_short_2_bottom_mane = neck_muscular_ewed_short_2_mane.addOrReplaceChild("neck_muscular_ewed_short_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 2.0201F, 0.8122F));

		PartDefinition neck_muscular_ewed_short_2_bottom_mane_connector = neck_muscular_ewed_short_2_bottom_mane.addOrReplaceChild("neck_muscular_ewed_short_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

		PartDefinition neck_muscular_ewed_short_2_bottom_mane_connector_individual = neck_muscular_ewed_short_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_short_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, -0.0288F, -0.0743F));

		PartDefinition cube_r8 = neck_muscular_ewed_short_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(782, 873).addBox(-2.0F, -2.0F, -0.01F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5567F, -3.2223F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_short_2_bottom_mane_connector2 = neck_muscular_ewed_short_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_short_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.7151F, 0.6257F));

		PartDefinition neck_muscular_ewed_short_2_bottom_mane_connector2_individual = neck_muscular_ewed_short_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_short_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, 0.2938F, -0.3079F));

		PartDefinition cube_r9 = neck_muscular_ewed_short_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(780, 883).addBox(-2.0F, -2.0F, 0.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.2603F, -3.6251F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_short_2_bottom_mane_flow = neck_muscular_ewed_short_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_short_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.5922F, -0.2682F, -0.0894F));

		PartDefinition cube_r10 = neck_muscular_ewed_short_2_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(762, 877).addBox(-0.8139F, -0.0002F, -3.3921F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2682F, 0.0F, -0.8901F, -0.0927F, -0.1377F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_muscular_ewed_short_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_muscular_ewed_short_2;
    }
}