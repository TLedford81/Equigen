package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.necks.arched;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartNeckModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class neck_muscular_arched_long_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart neck_muscular_arched_long_1;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;
	private final ModelPart withersAnchor;

	public neck_muscular_arched_long_1(ModelPart root) {
		this.root = root;
		this.neck_muscular_arched_long_1 = root.getChild("neck_muscular_arched_long_1");
		this.headAnchor = this.neck_muscular_arched_long_1.getChild("headAnchor");
		this.chestAnchor = this.neck_muscular_arched_long_1.getChild("chestAnchor");
		this.withersAnchor = this.neck_muscular_arched_long_1.getChild("withersAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_muscular_arched_long_1 = partdefinition.addOrReplaceChild("neck_muscular_arched_long_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_muscular_arched_long_1_individual = neck_muscular_arched_long_1.addOrReplaceChild("neck_muscular_arched_long_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0245F, -1.5553F, -1.7338F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_long_1_crest = neck_muscular_arched_long_1_individual.addOrReplaceChild("neck_muscular_arched_long_1_crest", CubeListBuilder.create(), PartPose.offset(-0.0245F, -4.4335F, 0.2142F));

		PartDefinition neck_muscular_arched_long_1_crest_upper = neck_muscular_arched_long_1_crest.addOrReplaceChild("neck_muscular_arched_long_1_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.0933F, -3.883F, -3.1935F));

		PartDefinition cube_r1 = neck_muscular_arched_long_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(614, 662).addBox(-4.1434F, -5.8622F, -2.7188F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6434F, 0.5326F, 2.5214F, 1.5708F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_long_1_crest_lower = neck_muscular_arched_long_1_crest.addOrReplaceChild("neck_muscular_arched_long_1_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.0563F, 0.3043F, 1.0792F));

		PartDefinition cube_r2 = neck_muscular_arched_long_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(584, 662).addBox(-5.08F, -10.0F, -0.92F, 5.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 2.885F, 2.7718F, 0.7854F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_long_1_middle_individual = neck_muscular_arched_long_1_individual.addOrReplaceChild("neck_muscular_arched_long_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.0126F, -1.7289F, -0.1863F));

		PartDefinition cube_r3 = neck_muscular_arched_long_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(586, 646).addBox(-6.0F, -10.0F, -1.0F, 6.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9623F, 2.2116F, 2.2422F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_muscular_arched_long_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(598, 662).addBox(-5.0784F, -9.0F, -0.9017F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1161F, 5.9548F, -0.0171F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_long_1_lower_individual = neck_muscular_arched_long_1_individual.addOrReplaceChild("neck_muscular_arched_long_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0528F, 0.309F, -0.5025F));

		PartDefinition cube_r5 = neck_muscular_arched_long_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(606, 647).addBox(-6.0792F, -11.0F, -0.9108F, 6.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0792F, 5.573F, 0.6151F, 0.3054F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_long_1_mane = neck_muscular_arched_long_1.addOrReplaceChild("neck_muscular_arched_long_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.1341F, -1.3408F));

		PartDefinition neck_muscular_arched_long_1_top_mane = neck_muscular_arched_long_1_mane.addOrReplaceChild("neck_muscular_arched_long_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.5308F, -1.9128F, 0.544F));

		PartDefinition neck_muscular_arched_long_1_top_mane_connector = neck_muscular_arched_long_1_top_mane.addOrReplaceChild("neck_muscular_arched_long_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.6089F, -2.5922F));

		PartDefinition neck_muscular_arched_long_1_top_mane_connector_individual = neck_muscular_arched_long_1_top_mane_connector.addOrReplaceChild("neck_muscular_arched_long_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

		PartDefinition cube_r6 = neck_muscular_arched_long_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(920, 807).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_long_1_top_mane_connector2 = neck_muscular_arched_long_1_top_mane_connector.addOrReplaceChild("neck_muscular_arched_long_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

		PartDefinition neck_muscular_arched_long_1_top_mane_connector2_individual = neck_muscular_arched_long_1_top_mane_connector2.addOrReplaceChild("neck_muscular_arched_long_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.5034F, -0.7469F));

		PartDefinition cube_r7 = neck_muscular_arched_long_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(918, 814).addBox(-2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_long_1_top_mane_flow = neck_muscular_arched_long_1_top_mane_connector2.addOrReplaceChild("neck_muscular_arched_long_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8603F, 0.0F, -0.0894F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_muscular_arched_long_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(936, 801).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

		PartDefinition neck_muscular_arched_long_1_bottom_mane = neck_muscular_arched_long_1_mane.addOrReplaceChild("neck_muscular_arched_long_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.5308F, 1.305F, 2.153F));

		PartDefinition neck_muscular_arched_long_1_bottom_mane_connector = neck_muscular_arched_long_1_bottom_mane.addOrReplaceChild("neck_muscular_arched_long_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

		PartDefinition neck_muscular_arched_long_1_bottom_mane_connector_individual = neck_muscular_arched_long_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_arched_long_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.1182F, -0.0743F));

		PartDefinition cube_r9 = neck_muscular_arched_long_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(936, 801).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5567F, -3.2223F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_long_1_bottom_mane_connector2 = neck_muscular_arched_long_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_arched_long_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, 0.8045F));

		PartDefinition neck_muscular_arched_long_1_bottom_mane_connector2_individual = neck_muscular_arched_long_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_arched_long_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6452F, -0.5107F, -0.4867F));

		PartDefinition cube_r10 = neck_muscular_arched_long_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(936, 815).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.2603F, -3.6251F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_long_1_bottom_mane_flow = neck_muscular_arched_long_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_arched_long_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.4134F, -0.3575F, 0.0F));

		PartDefinition cube_r11 = neck_muscular_arched_long_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(922, 808).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3576F, -0.8937F, -0.1201F, -0.1036F));

		PartDefinition headAnchor = neck_muscular_arched_long_1.addOrReplaceChild("headAnchor", CubeListBuilder.create(), PartPose.offset(0.0F, -10.3827F, -6.9239F));

		PartDefinition cube_r12 = headAnchor.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_muscular_arched_long_1.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1F, -1.25F, -1.75F));

		PartDefinition withersAnchor = neck_muscular_arched_long_1.addOrReplaceChild("withersAnchor", CubeListBuilder.create(), PartPose.offset(-0.1F, -1.2346F, 3.3529F));

		PartDefinition cube_r13 = withersAnchor.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6545F, 0.0F, 0.0F));

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
		return "neck_muscular_arched_long_1";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart neck = this.neck_muscular_arched_long_1;

		registerAnchorPath("headAnchor", root, neck, this.headAnchor);
		registerAnchorPath("chestAnchor", root, neck, this.chestAnchor);
		registerAnchorPath("withersAnchor", root, neck, this.withersAnchor);
	}

}