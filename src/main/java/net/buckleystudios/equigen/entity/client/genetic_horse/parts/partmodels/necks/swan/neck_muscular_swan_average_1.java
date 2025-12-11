package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.necks.swan;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartNeckModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;


public class neck_muscular_swan_average_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart neck_muscular_swan_average_1;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;
	private final ModelPart withersAnchor;

	public neck_muscular_swan_average_1(ModelPart root) {
		this.root = root;
		this.neck_muscular_swan_average_1 = root.getChild("neck_muscular_swan_average_1");
		this.headAnchor = this.neck_muscular_swan_average_1.getChild("headAnchor");
		this.chestAnchor = this.neck_muscular_swan_average_1.getChild("chestAnchor");
		this.withersAnchor = this.neck_muscular_swan_average_1.getChild("withersAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_muscular_swan_average_1 = partdefinition.addOrReplaceChild("neck_muscular_swan_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_1_individual = neck_muscular_swan_average_1.addOrReplaceChild("neck_muscular_swan_average_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3575F, 1.8771F, 1.4302F, 0.0873F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_1_crest = neck_muscular_swan_average_1_individual.addOrReplaceChild("neck_muscular_swan_average_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -9.743F, -2.771F));

		PartDefinition neck_muscular_swan_average_1_crest_upper = neck_muscular_swan_average_1_crest.addOrReplaceChild("neck_muscular_swan_average_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.0913F, 0.321F, -2.6871F));

		PartDefinition cube_r1 = neck_muscular_swan_average_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(495, 1006).addBox(-4.0892F, -6.0F, -3.8808F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, 0.1605F, 3.2986F, 1.0908F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_1_crest_lower = neck_muscular_swan_average_1_crest.addOrReplaceChild("neck_muscular_swan_average_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.098F, 3.3535F, 2.5884F));

		PartDefinition cube_r2 = neck_muscular_swan_average_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(481, 1006).addBox(-5.08F, -12.0F, -0.92F, 5.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 6.5991F, 4.5231F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_1_middle_individual = neck_muscular_swan_average_1_individual.addOrReplaceChild("neck_muscular_swan_average_1_middle_individual", CubeListBuilder.create(), PartPose.offset(0.1565F, -4.4665F, -2.876F));

		PartDefinition cube_r3 = neck_muscular_swan_average_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(461, 1006).addBox(-5.08F, -9.0F, -0.92F, 6.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0745F, 6.0269F, -0.2418F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_muscular_swan_average_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(461, 992).addBox(-4.0F, -10.0F, -2.0F, 6.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0055F, 3.9896F, 3.0261F, 0.5672F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_1_lower_individual = neck_muscular_swan_average_1_individual.addOrReplaceChild("neck_muscular_swan_average_1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.1145F, -3.51F, -4.1918F));

		PartDefinition cube_r5 = neck_muscular_swan_average_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(483, 993).addBox(-5.0784F, -9.0F, -0.9017F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0784F, 4.6311F, -0.0983F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_1_mane = neck_muscular_swan_average_1.addOrReplaceChild("neck_muscular_swan_average_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -6.7933F, 0.0F));

		PartDefinition neck_muscular_swan_average_1_top_mane = neck_muscular_swan_average_1_mane.addOrReplaceChild("neck_muscular_swan_average_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, -2.4492F, -3.2102F));

		PartDefinition neck_muscular_swan_average_1_top_mane_connector = neck_muscular_swan_average_1_top_mane.addOrReplaceChild("neck_muscular_swan_average_1_top_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, -1.0726F, 1.3408F, 0.2182F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_1_top_mane_connector_individual = neck_muscular_swan_average_1_top_mane_connector.addOrReplaceChild("neck_muscular_swan_average_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, -0.1786F, -1.601F));

		PartDefinition cube_r6 = neck_muscular_swan_average_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(821, 998).addBox(-2.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.9663F, 1.0647F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_1_top_mane_connector2 = neck_muscular_swan_average_1_top_mane_connector.addOrReplaceChild("neck_muscular_swan_average_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.8045F, -0.8045F));

		PartDefinition neck_muscular_swan_average_1_top_mane_connector2_individual = neck_muscular_swan_average_1_top_mane_connector2.addOrReplaceChild("neck_muscular_swan_average_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.1269F, -0.5098F));

		PartDefinition cube_r7 = neck_muscular_swan_average_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(821, 1006).addBox(-2.0F, -2.0F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.3759F, 0.7779F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_1_top_mane_flow = neck_muscular_swan_average_1_top_mane_connector2.addOrReplaceChild("neck_muscular_swan_average_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9497F, 0.0F, -0.0894F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_muscular_swan_average_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(805, 1000).addBox(-1.0707F, -0.1476F, -4.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.4085F, 0.9511F, -0.4274F, -0.2133F, -0.3647F));

		PartDefinition neck_muscular_swan_average_1_bottom_mane = neck_muscular_swan_average_1_mane.addOrReplaceChild("neck_muscular_swan_average_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0838F, 0.6793F, 1.7061F));

		PartDefinition neck_muscular_swan_average_1_bottom_mane_connector = neck_muscular_swan_average_1_bottom_mane.addOrReplaceChild("neck_muscular_swan_average_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 0.4469F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_1_bottom_mane_connector_individual = neck_muscular_swan_average_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_swan_average_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.5149F, -0.3787F));

		PartDefinition cube_r9 = neck_muscular_swan_average_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(833, 999).addBox(-2.0F, -2.0F, -1.01F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.16F, -2.9179F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_1_bottom_mane_connector2 = neck_muscular_swan_average_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_swan_average_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.2682F, -1.0726F, 0.3575F));

		PartDefinition neck_muscular_swan_average_1_bottom_mane_connector2_individual = neck_muscular_swan_average_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_swan_average_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, 0.1653F, -0.3441F));

		PartDefinition cube_r10 = neck_muscular_swan_average_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(830, 1010).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8636F, -3.3207F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_swan_average_1_bottom_mane_flow = neck_muscular_swan_average_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_swan_average_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.771F, 0.0894F, -0.0894F));

		PartDefinition cube_r11 = neck_muscular_swan_average_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(810, 1004).addBox(-0.8139F, -0.0002F, -4.3921F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, -0.1788F, 0.2682F, -0.8937F, -0.1201F, -0.1036F));

		PartDefinition headAnchor = neck_muscular_swan_average_1.addOrReplaceChild("headAnchor", CubeListBuilder.create(), PartPose.offset(-0.2F, -9.4827F, -7.0239F));

		PartDefinition cube_r12 = headAnchor.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_muscular_swan_average_1.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.2F, -2.25F, -2.25F));

		PartDefinition withersAnchor = neck_muscular_swan_average_1.addOrReplaceChild("withersAnchor", CubeListBuilder.create(), PartPose.offset(-0.2F, -1.8346F, 2.9529F));

		PartDefinition cube_r13 = withersAnchor.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6981F, 0.0F, 0.0F));

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
		return "neck_muscular_swan_average_1";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart neck = this.neck_muscular_swan_average_1;

		registerAnchorPath("headAnchor", root, neck, this.headAnchor);
		registerAnchorPath("chestAnchor", root, neck, this.chestAnchor);
		registerAnchorPath("withersAnchor", root, neck, this.withersAnchor);
	}

}