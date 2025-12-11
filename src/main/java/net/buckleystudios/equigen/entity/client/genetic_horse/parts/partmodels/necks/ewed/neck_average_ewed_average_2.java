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

public class neck_average_ewed_average_2 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart neck_average_ewed_average_2;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;
	private final ModelPart withersAnchor;

	public neck_average_ewed_average_2(ModelPart root) {
		this.root = root;
		this.neck_average_ewed_average_2 = root.getChild("neck_average_ewed_average_2");
		this.headAnchor = this.neck_average_ewed_average_2.getChild("headAnchor");
		this.chestAnchor = this.neck_average_ewed_average_2.getChild("chestAnchor");
		this.withersAnchor = this.neck_average_ewed_average_2.getChild("withersAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_average_ewed_average_2 = partdefinition.addOrReplaceChild("neck_average_ewed_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_average_ewed_average_2_individual = neck_average_ewed_average_2.addOrReplaceChild("neck_average_ewed_average_2_individual", CubeListBuilder.create(), PartPose.offset(-0.0056F, -0.9296F, -0.4392F));

		PartDefinition neck_average_ewed_average_2_crest = neck_average_ewed_average_2_individual.addOrReplaceChild("neck_average_ewed_average_2_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.1117F, -0.9832F));

		PartDefinition neck_average_ewed_average_2_crest_upper = neck_average_ewed_average_2_crest.addOrReplaceChild("neck_average_ewed_average_2_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.2065F, -3.3254F, -1.9729F));

		PartDefinition cube_r1 = neck_average_ewed_average_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(533, 744).addBox(-4.08F, -4.0F, -2.92F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 0.3935F, 0.3783F, 0.9599F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_average_2_crest_lower = neck_average_ewed_average_2_crest.addOrReplaceChild("neck_average_ewed_average_2_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1171F, 0.2374F, 1.0879F));

		PartDefinition cube_r2 = neck_average_ewed_average_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(549, 744).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 2.0938F, 1.3684F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_average_2_middle_individual = neck_average_ewed_average_2_individual.addOrReplaceChild("neck_average_ewed_average_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1592F, -2.9059F, -2.0636F));

		PartDefinition cube_r3 = neck_average_ewed_average_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(532, 730).addBox(-4.0F, -8.0F, -1.0F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 3.031F, 0.9016F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_average_2_lower_individual = neck_average_ewed_average_2_individual.addOrReplaceChild("neck_average_ewed_average_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1537F, -1.4589F, -3.262F));

		PartDefinition cube_r4 = neck_average_ewed_average_2_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(550, 730).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 3.182F, -0.2844F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_average_2_mane = neck_average_ewed_average_2.addOrReplaceChild("neck_average_ewed_average_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.419F, -1.0726F));

		PartDefinition neck_average_ewed_average_2_top_mane = neck_average_ewed_average_2_mane.addOrReplaceChild("neck_average_ewed_average_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -1.9128F, -1.6906F));

		PartDefinition neck_average_ewed_average_2_top_mane_connector = neck_average_ewed_average_2_top_mane.addOrReplaceChild("neck_average_ewed_average_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.7877F, -0.2682F));

		PartDefinition neck_average_ewed_average_2_top_mane_connector_individual = neck_average_ewed_average_2_top_mane_connector.addOrReplaceChild("neck_average_ewed_average_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.395F, -0.7819F));

		PartDefinition cube_r5 = neck_average_ewed_average_2_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(871, 844).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.3927F, 0.2456F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_average_2_top_mane_connector2 = neck_average_ewed_average_2_top_mane_connector.addOrReplaceChild("neck_average_ewed_average_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

		PartDefinition neck_average_ewed_average_2_top_mane_connector2_individual = neck_average_ewed_average_2_top_mane_connector2.addOrReplaceChild("neck_average_ewed_average_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.1453F, 0.2536F, -0.4057F));

		PartDefinition cube_r6 = neck_average_ewed_average_2_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(871, 850).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8023F, -0.0412F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_average_2_top_mane_flow = neck_average_ewed_average_2_top_mane_connector2.addOrReplaceChild("neck_average_ewed_average_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1452F, 0.0F, -0.0894F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r7 = neck_average_ewed_average_2_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(859, 844).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, 0.1998F, -0.4712F, -0.2206F, -0.3514F));

		PartDefinition neck_average_ewed_average_2_bottom_mane = neck_average_ewed_average_2_mane.addOrReplaceChild("neck_average_ewed_average_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 0.8581F, 1.3485F));

		PartDefinition neck_average_ewed_average_2_bottom_mane_connector = neck_average_ewed_average_2_bottom_mane.addOrReplaceChild("neck_average_ewed_average_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

		PartDefinition neck_average_ewed_average_2_bottom_mane_connector_individual = neck_average_ewed_average_2_bottom_mane_connector.addOrReplaceChild("neck_average_ewed_average_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.1182F, -0.0743F));

		PartDefinition cube_r8 = neck_average_ewed_average_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(883, 839).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5567F, -3.2223F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_average_2_bottom_mane_connector2 = neck_average_ewed_average_2_bottom_mane_connector.addOrReplaceChild("neck_average_ewed_average_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -1.4302F, 0.0894F));

		PartDefinition neck_average_ewed_average_2_bottom_mane_connector2_individual = neck_average_ewed_average_2_bottom_mane_connector2.addOrReplaceChild("neck_average_ewed_average_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(-0.1788F, 5.3631F, -2.5028F));

		PartDefinition cube_r9 = neck_average_ewed_average_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(881, 851).addBox(-1.0F, -0.5F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.324F, -4.4436F, 2.7312F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_average_ewed_average_2_bottom_mane_flow = neck_average_ewed_average_2_bottom_mane_connector2.addOrReplaceChild("neck_average_ewed_average_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.7877F, 0.3575F, 0.2682F));

		PartDefinition cube_r10 = neck_average_ewed_average_2_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(859, 845).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.2681F, 0.1788F, -0.8901F, -0.0927F, -0.1377F));

		PartDefinition headAnchor = neck_average_ewed_average_2.addOrReplaceChild("headAnchor", CubeListBuilder.create(), PartPose.offset(-0.25F, -10.3827F, -6.4239F));

		PartDefinition cube_r11 = headAnchor.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_average_ewed_average_2.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.75F, -2.5F));

		PartDefinition withersAnchor = neck_average_ewed_average_2.addOrReplaceChild("withersAnchor", CubeListBuilder.create(), PartPose.offset(-0.1F, -1.5346F, 1.9529F));

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
		return "neck_average_ewed_average_2";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart neck = this.neck_average_ewed_average_2;

		registerAnchorPath("headAnchor", root, neck, this.headAnchor);
		registerAnchorPath("chestAnchor", root, neck, this.chestAnchor);
		registerAnchorPath("withersAnchor", root, neck, this.withersAnchor);
	}

}