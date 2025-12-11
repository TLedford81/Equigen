package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.necks.straight;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartNeckModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class neck_lean_straight_long_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart neck_lean_straight_long_1;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;
	private final ModelPart withersAnchor;

	public neck_lean_straight_long_1(ModelPart root) {
		this.root = root;
		this.neck_lean_straight_long_1 = root.getChild("neck_lean_straight_long_1");
		this.headAnchor = this.neck_lean_straight_long_1.getChild("headAnchor");
		this.chestAnchor = this.neck_lean_straight_long_1.getChild("chestAnchor");
		this.withersAnchor = this.neck_lean_straight_long_1.getChild("withersAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_lean_straight_long_1 = partdefinition.addOrReplaceChild("neck_lean_straight_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_lean_straight_long_1_individual = neck_lean_straight_long_1.addOrReplaceChild("neck_lean_straight_long_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, -2.6816F, -1.0726F, -0.5672F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_long_1_crest = neck_lean_straight_long_1_individual.addOrReplaceChild("neck_lean_straight_long_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -3.933F, -1.4302F));

		PartDefinition neck_lean_straight_long_1_crest_upper = neck_lean_straight_long_1_crest.addOrReplaceChild("neck_lean_straight_long_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3634F, -0.1892F, -2.5864F));

		PartDefinition cube_r1 = neck_lean_straight_long_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(583, 828).addBox(-2.08F, -4.0F, -3.92F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.08F, -1.3797F, 0.216F, 1.6144F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_long_1_crest_lower = neck_lean_straight_long_1_crest.addOrReplaceChild("neck_lean_straight_long_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2935F, 0.285F, 1.1656F));

		PartDefinition cube_r2 = neck_lean_straight_long_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(613, 828).addBox(-3.08F, -5.0F, -0.92F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 0.4951F, 0.8725F, 1.1345F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_long_1_middle_individual = neck_lean_straight_long_1_individual.addOrReplaceChild("neck_lean_straight_long_1_middle_individual", CubeListBuilder.create(), PartPose.offset(0.3511F, -0.6239F, -0.7612F));

		PartDefinition cube_r3 = neck_lean_straight_long_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(585, 812).addBox(-4.0708F, -11.03F, -0.9292F, 4.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0811F, 5.8277F, 2.5752F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_lean_straight_long_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(603, 814).addBox(-3.0F, -7.0F, -1.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9897F, 0.6818F, 2.0413F, 1.1345F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_long_1_lower_individual = neck_lean_straight_long_1_individual.addOrReplaceChild("neck_lean_straight_long_1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3463F, 0.3427F, -2.7758F));

		PartDefinition cube_r5 = neck_lean_straight_long_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(599, 828).addBox(-4.0784F, -5.0F, -0.9017F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 1.7601F, 0.5988F, 0.9599F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_long_1_mane = neck_lean_straight_long_1.addOrReplaceChild("neck_lean_straight_long_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.6704F, 0.0F));

		PartDefinition neck_lean_straight_long_1_top_mane = neck_lean_straight_long_1_mane.addOrReplaceChild("neck_lean_straight_long_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.6201F, -1.019F, -1.3331F));

		PartDefinition neck_lean_straight_long_1_top_mane_connector = neck_lean_straight_long_1_top_mane.addOrReplaceChild("neck_lean_straight_long_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -1.162F, -2.0559F));

		PartDefinition neck_lean_straight_long_1_top_mane_connector_individual = neck_lean_straight_long_1_top_mane_connector.addOrReplaceChild("neck_lean_straight_long_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

		PartDefinition cube_r6 = neck_lean_straight_long_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(932, 907).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_long_1_top_mane_connector2 = neck_lean_straight_long_1_top_mane_connector.addOrReplaceChild("neck_lean_straight_long_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

		PartDefinition neck_lean_straight_long_1_top_mane_connector2_individual = neck_lean_straight_long_1_top_mane_connector2.addOrReplaceChild("neck_lean_straight_long_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.8771F, 0.2024F, -0.0684F));

		PartDefinition cube_r7 = neck_lean_straight_long_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(932, 914).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_long_1_top_mane_flow = neck_lean_straight_long_1_top_mane_connector2.addOrReplaceChild("neck_lean_straight_long_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, -0.3575F, 0.0894F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_lean_straight_long_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(918, 908).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

		PartDefinition neck_lean_straight_long_1_bottom_mane = neck_lean_straight_long_1_mane.addOrReplaceChild("neck_lean_straight_long_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6201F, 1.305F, 0.4547F));

		PartDefinition neck_lean_straight_long_1_bottom_mane_connector = neck_lean_straight_long_1_bottom_mane.addOrReplaceChild("neck_lean_straight_long_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

		PartDefinition neck_lean_straight_long_1_bottom_mane_connector_individual = neck_lean_straight_long_1_bottom_mane_connector.addOrReplaceChild("neck_lean_straight_long_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 1.7476F, 0.9583F));

		PartDefinition cube_r9 = neck_lean_straight_long_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(941, 904).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.3331F, -4.2549F, -0.9599F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_long_1_bottom_mane_connector2 = neck_lean_straight_long_1_bottom_mane_connector.addOrReplaceChild("neck_lean_straight_long_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, 1.4302F, 1.8771F));

		PartDefinition neck_lean_straight_long_1_bottom_mane_connector2_individual = neck_lean_straight_long_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_straight_long_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.0559F, -0.0572F, -0.5142F));

		PartDefinition cube_r10 = neck_lean_straight_long_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(942, 916).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.0545F, -4.6702F, -0.9599F, 0.0F, 0.0F));

		PartDefinition neck_lean_straight_long_1_bottom_mane_flow = neck_lean_straight_long_1_bottom_mane_connector2.addOrReplaceChild("neck_lean_straight_long_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.6983F, 0.4469F, 0.5363F));

		PartDefinition cube_r11 = neck_lean_straight_long_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(920, 910).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -2.6816F, -1.8771F, -0.9753F, -0.1144F, -0.1002F));

		PartDefinition headAnchor = neck_lean_straight_long_1.addOrReplaceChild("headAnchor", CubeListBuilder.create(), PartPose.offset(0.1F, -10.5F, -5.116F));

		PartDefinition cube_r12 = headAnchor.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_lean_straight_long_1.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, -1.75F));

		PartDefinition withersAnchor = neck_lean_straight_long_1.addOrReplaceChild("withersAnchor", CubeListBuilder.create(), PartPose.offset(0.1F, -0.8346F, 3.0529F));

		PartDefinition cube_r13 = withersAnchor.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5672F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return root;
    }

	@Override
	public String animationRoot() {
		return "neck_lean_straight_long_1";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart neck = this.neck_lean_straight_long_1;

		registerAnchorPath("headAnchor", root, neck, this.headAnchor);
		registerAnchorPath("chestAnchor", root, neck, this.chestAnchor);
		registerAnchorPath("withersAnchor", root, neck, this.withersAnchor);
	}

}