package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.necks.ewed;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartNeckModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class neck_average_ewed_long_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart neck_average_ewed_long_1;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;
	private final ModelPart withersAnchor;

	public neck_average_ewed_long_1(ModelPart root) {
		this.root = root;
		this.neck_average_ewed_long_1 = root.getChild("neck_average_ewed_long_1");
		this.headAnchor = this.neck_average_ewed_long_1.getChild("headAnchor");
		this.chestAnchor = this.neck_average_ewed_long_1.getChild("chestAnchor");
		this.withersAnchor = this.neck_average_ewed_long_1.getChild("withersAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_average_ewed_long_1 = partdefinition.addOrReplaceChild("neck_average_ewed_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_average_ewed_long_1_individual = neck_average_ewed_long_1.addOrReplaceChild("neck_average_ewed_long_1_individual", CubeListBuilder.create(), PartPose.offset(-0.0056F, -1.1084F, -0.4392F));

		PartDefinition neck_average_ewed_long_1_crest = neck_average_ewed_long_1_individual.addOrReplaceChild("neck_average_ewed_long_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -5.7207F, -1.162F));

		PartDefinition neck_average_ewed_long_1_crest_upper = neck_average_ewed_long_1_crest.addOrReplaceChild("neck_average_ewed_long_1_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.1359F, -2.6322F, -1.4791F));

		PartDefinition cube_r1 = neck_average_ewed_long_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(593, 743).addBox(-4.0792F, -4.0F, -2.8908F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, 0.4175F, 0.0934F, 0.9599F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_long_1_crest_lower = neck_average_ewed_long_1_crest.addOrReplaceChild("neck_average_ewed_long_1_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1171F, 1.2727F, 1.5535F));

		PartDefinition cube_r2 = neck_average_ewed_long_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(609, 743).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 1.6842F, 1.0816F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_long_1_middle_individual = neck_average_ewed_long_1_individual.addOrReplaceChild("neck_average_ewed_long_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1592F, -3.4796F, -1.7768F));

		PartDefinition cube_r3 = neck_average_ewed_long_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(592, 728).addBox(-4.0F, -8.0F, -1.0F, 5.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 2.6215F, 0.6148F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_long_1_lower_individual = neck_average_ewed_long_1_individual.addOrReplaceChild("neck_average_ewed_long_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1537F, -1.9592F, -3.1326F));

		PartDefinition cube_r4 = neck_average_ewed_long_1_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(610, 728).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 2.6991F, -0.4138F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_long_1_mane = neck_average_ewed_long_1.addOrReplaceChild("neck_average_ewed_long_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.8659F, 0.0F));

		PartDefinition neck_average_ewed_long_1_top_mane = neck_average_ewed_long_1_mane.addOrReplaceChild("neck_average_ewed_long_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -2.3598F, -1.5118F));

		PartDefinition neck_average_ewed_long_1_top_mane_connector = neck_average_ewed_long_1_top_mane.addOrReplaceChild("neck_average_ewed_long_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -2.0559F, -1.5196F));

		PartDefinition neck_average_ewed_long_1_top_mane_connector_individual = neck_average_ewed_long_1_top_mane_connector.addOrReplaceChild("neck_average_ewed_long_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.395F, -0.7819F));

		PartDefinition cube_r5 = neck_average_ewed_long_1_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(930, 842).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3927F, 0.2456F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_long_1_top_mane_connector2 = neck_average_ewed_long_1_top_mane_connector.addOrReplaceChild("neck_average_ewed_long_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

		PartDefinition neck_average_ewed_long_1_top_mane_connector2_individual = neck_average_ewed_long_1_top_mane_connector2.addOrReplaceChild("neck_average_ewed_long_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.2536F, -0.4057F));

		PartDefinition cube_r6 = neck_average_ewed_long_1_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(930, 850).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8023F, -0.0412F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_long_1_top_mane_flow = neck_average_ewed_long_1_top_mane_connector2.addOrReplaceChild("neck_average_ewed_long_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1452F, 0.0F, -0.0894F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r7 = neck_average_ewed_long_1_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(918, 844).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4712F, -0.2206F, -0.3514F));

		PartDefinition neck_average_ewed_long_1_bottom_mane = neck_average_ewed_long_1_mane.addOrReplaceChild("neck_average_ewed_long_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 0.143F, 0.2759F));

		PartDefinition neck_average_ewed_long_1_bottom_mane_connector = neck_average_ewed_long_1_bottom_mane.addOrReplaceChild("neck_average_ewed_long_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

		PartDefinition neck_average_ewed_long_1_bottom_mane_connector_individual = neck_average_ewed_long_1_bottom_mane_connector.addOrReplaceChild("neck_average_ewed_long_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.2784F, 0.2301F));

		PartDefinition cube_r8 = neck_average_ewed_long_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(941, 837).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9534F, -3.5267F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_long_1_bottom_mane_connector2 = neck_average_ewed_long_1_bottom_mane_connector.addOrReplaceChild("neck_average_ewed_long_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));

		PartDefinition neck_average_ewed_long_1_bottom_mane_connector2_individual = neck_average_ewed_long_1_bottom_mane_connector2.addOrReplaceChild("neck_average_ewed_long_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, -0.114F, -0.1823F));

		PartDefinition cube_r9 = neck_average_ewed_long_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(941, 850).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.657F, -3.9295F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_long_1_bottom_mane_flow = neck_average_ewed_long_1_bottom_mane_connector2.addOrReplaceChild("neck_average_ewed_long_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, -0.3575F, 0.0894F));

		PartDefinition cube_r10 = neck_average_ewed_long_1_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(917, 844).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));

		PartDefinition headAnchor = neck_average_ewed_long_1.addOrReplaceChild("headAnchor", CubeListBuilder.create(), PartPose.offset(-0.25F, -11.6327F, -6.4239F));

		PartDefinition cube_r11 = headAnchor.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_average_ewed_long_1.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.75F, -2.5F));

		PartDefinition withersAnchor = neck_average_ewed_long_1.addOrReplaceChild("withersAnchor", CubeListBuilder.create(), PartPose.offset(-0.1F, -1.8346F, 2.6529F));

		PartDefinition cube_r12 = withersAnchor.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

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
		return "neck_average_ewed_long_1";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart neck = this.neck_average_ewed_long_1;

		registerAnchorPath("headAnchor", root, neck, this.headAnchor);
		registerAnchorPath("chestAnchor", root, neck, this.chestAnchor);
		registerAnchorPath("withersAnchor", root, neck, this.withersAnchor);
	}

}