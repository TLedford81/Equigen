package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.necks.straight;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartNeckModel;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class neck_muscular_straight_long_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart neck_muscular_straight_long_1;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;
	private final ModelPart withersAnchor;

	public neck_muscular_straight_long_1(ModelPart root) {
		this.root = root;
		this.neck_muscular_straight_long_1 = root.getChild("neck_muscular_straight_long_1");
		this.headAnchor = this.neck_muscular_straight_long_1.getChild("headAnchor");
		this.chestAnchor = this.neck_muscular_straight_long_1.getChild("chestAnchor");
		this.withersAnchor = this.neck_muscular_straight_long_1.getChild("withersAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_muscular_straight_long_1 = partdefinition.addOrReplaceChild("neck_muscular_straight_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_muscular_straight_long_1_individual = neck_muscular_straight_long_1.addOrReplaceChild("neck_muscular_straight_long_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, -2.6816F, -1.0726F, -0.5672F, 0.0F, 0.0F));

		PartDefinition neck_muscular_straight_long_1_crest = neck_muscular_straight_long_1_individual.addOrReplaceChild("neck_muscular_straight_long_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -3.5754F, -3.2179F));

		PartDefinition neck_muscular_straight_long_1_crest_upper = neck_muscular_straight_long_1_crest.addOrReplaceChild("neck_muscular_straight_long_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3634F, -1.0831F, -0.7094F));

		PartDefinition cube_r1 = neck_muscular_straight_long_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(578, 893).addBox(-3.08F, -4.0F, -3.92F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.08F, -0.8434F, 0.1266F, 1.6144F, 0.0F, 0.0F));

		PartDefinition neck_muscular_straight_long_1_crest_lower = neck_muscular_straight_long_1_crest.addOrReplaceChild("neck_muscular_straight_long_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2404F, -0.0725F, 2.9533F));

		PartDefinition cube_r2 = neck_muscular_straight_long_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(614, 893).addBox(-4.08F, -5.0F, -0.92F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 0.4951F, 0.8725F, 1.1345F, 0.0F, 0.0F));

		PartDefinition neck_muscular_straight_long_1_middle_individual = neck_muscular_straight_long_1_individual.addOrReplaceChild("neck_muscular_straight_long_1_middle_individual", CubeListBuilder.create(), PartPose.offset(0.3511F, -0.6239F, -0.7612F));

		PartDefinition cube_r3 = neck_muscular_straight_long_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(602, 879).addBox(-4.0F, -7.0F, -1.0F, 6.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9897F, 0.6818F, 2.0413F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_muscular_straight_long_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(580, 877).addBox(-5.0708F, -11.03F, -0.9292F, 6.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0811F, 5.8277F, 2.5752F, 0.8727F, 0.0F, 0.0F));

		PartDefinition neck_muscular_straight_long_1_lower_individual = neck_muscular_straight_long_1_individual.addOrReplaceChild("neck_muscular_straight_long_1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3826F, 0.3427F, -2.7758F));

		PartDefinition cube_r5 = neck_muscular_straight_long_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(598, 893).addBox(-5.0784F, -5.0F, -0.9017F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 1.7601F, 0.5988F, 0.9599F, 0.0F, 0.0F));

		PartDefinition neck_muscular_straight_long_1_mane = neck_muscular_straight_long_1.addOrReplaceChild("neck_muscular_straight_long_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.581F, 0.0F));

		PartDefinition neck_muscular_straight_long_1_top_mane = neck_muscular_straight_long_1_mane.addOrReplaceChild("neck_muscular_straight_long_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.6201F, -2.6279F, -1.3331F));

		PartDefinition neck_muscular_straight_long_1_top_mane_connector = neck_muscular_straight_long_1_top_mane.addOrReplaceChild("neck_muscular_straight_long_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, 0.3575F, -2.0559F));

		PartDefinition neck_muscular_straight_long_1_top_mane_connector_individual = neck_muscular_straight_long_1_top_mane_connector.addOrReplaceChild("neck_muscular_straight_long_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

		PartDefinition cube_r6 = neck_muscular_straight_long_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(930, 934).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

		PartDefinition neck_muscular_straight_long_1_top_mane_connector2 = neck_muscular_straight_long_1_top_mane_connector.addOrReplaceChild("neck_muscular_straight_long_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

		PartDefinition neck_muscular_straight_long_1_top_mane_connector2_individual = neck_muscular_straight_long_1_top_mane_connector2.addOrReplaceChild("neck_muscular_straight_long_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.3771F, 0.2024F, -0.0684F));

		PartDefinition cube_r7 = neck_muscular_straight_long_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(930, 941).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

		PartDefinition neck_muscular_straight_long_1_top_mane_flow = neck_muscular_straight_long_1_top_mane_connector2.addOrReplaceChild("neck_muscular_straight_long_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5028F, -0.3575F, 0.0894F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_muscular_straight_long_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(916, 935).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

		PartDefinition neck_muscular_straight_long_1_bottom_mane = neck_muscular_straight_long_1_mane.addOrReplaceChild("neck_muscular_straight_long_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6201F, 1.2156F, 0.4547F));

		PartDefinition neck_muscular_straight_long_1_bottom_mane_connector = neck_muscular_straight_long_1_bottom_mane.addOrReplaceChild("neck_muscular_straight_long_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

		PartDefinition neck_muscular_straight_long_1_bottom_mane_connector_individual = neck_muscular_straight_long_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_straight_long_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 1.7476F, 0.9583F));

		PartDefinition cube_r9 = neck_muscular_straight_long_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(941, 931).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.3331F, -4.2549F, -0.9599F, 0.0F, 0.0F));

		PartDefinition neck_muscular_straight_long_1_bottom_mane_connector2 = neck_muscular_straight_long_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_straight_long_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, 1.4302F, 1.8771F));

		PartDefinition neck_muscular_straight_long_1_bottom_mane_connector2_individual = neck_muscular_straight_long_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_straight_long_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.7151F, -1.5195F, -0.6257F));

		PartDefinition cube_r10 = neck_muscular_straight_long_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(940, 943).addBox(-1.5F, -0.5F, -5.0F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8408F, 1.4624F, 0.1115F, -0.9599F, 0.0F, 0.0F));

		PartDefinition neck_muscular_straight_long_1_bottom_mane_flow = neck_muscular_straight_long_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_straight_long_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.324F, 0.2682F, 0.6257F));

		PartDefinition cube_r11 = neck_muscular_straight_long_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(918, 937).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -2.6816F, -1.8771F, -0.9753F, -0.1144F, -0.1002F));

		PartDefinition headAnchor = neck_muscular_straight_long_1.addOrReplaceChild("headAnchor", CubeListBuilder.create(), PartPose.offset(0.0F, -10.5F, -5.116F));

		PartDefinition cube_r12 = headAnchor.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_muscular_straight_long_1.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.1F, -1.0F, -1.75F));

		PartDefinition withersAnchor = neck_muscular_straight_long_1.addOrReplaceChild("withersAnchor", CubeListBuilder.create(), PartPose.offset(0.1F, -0.8346F, 3.0529F));

		PartDefinition cube_r13 = withersAnchor.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5672F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_muscular_straight_long_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return root;
    }

	@Override
	public String animationRoot() {
		return "neck_muscular_straight_long_1";
	}

	@Override
	public Map<String, PartTransform> computeAnchors() {
		return Map.of(
				"headAnchor", asTransform(headAnchor),
				"chestAnchor", asTransform(chestAnchor),
				"withersAnchor", asTransform(withersAnchor));
	}

}