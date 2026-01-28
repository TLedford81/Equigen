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

public class neck_muscular_arched_long_2 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart neck_muscular_arched_long_2;
	private final ModelPart neck_muscular_arched_long_2_individual;
	private final ModelPart neck_muscular_arched_long_2_crest;
	private final ModelPart neck_muscular_arched_long_2_crest_upper;
	private final ModelPart neck_muscular_arched_long_2_crest_lower;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;
	private final ModelPart withersAnchor;

	public neck_muscular_arched_long_2(ModelPart root) {
		this.root = root;
		this.neck_muscular_arched_long_2 = root.getChild("neck_muscular_arched_long_2");
		this.neck_muscular_arched_long_2_individual = neck_muscular_arched_long_2.getChild("neck_muscular_arched_long_2_individual");
		this.neck_muscular_arched_long_2_crest = neck_muscular_arched_long_2_individual.getChild("neck_muscular_arched_long_2_crest");
		this.neck_muscular_arched_long_2_crest_upper = neck_muscular_arched_long_2_crest.getChild("neck_muscular_arched_long_2_crest_upper");
		this.neck_muscular_arched_long_2_crest_lower = neck_muscular_arched_long_2_crest.getChild("neck_muscular_arched_long_2_crest_lower");
		this.headAnchor = this.neck_muscular_arched_long_2_crest_upper.getChild("headAnchor");
		this.chestAnchor = this.neck_muscular_arched_long_2.getChild("chestAnchor");
		this.withersAnchor = this.neck_muscular_arched_long_2_crest_lower.getChild("withersAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_muscular_arched_long_2 = partdefinition.addOrReplaceChild("neck_muscular_arched_long_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_muscular_arched_long_2_individual = neck_muscular_arched_long_2.addOrReplaceChild("neck_muscular_arched_long_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0245F, 0.0536F, 0.1433F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_long_2_crest = neck_muscular_arched_long_2_individual.addOrReplaceChild("neck_muscular_arched_long_2_crest", CubeListBuilder.create(), PartPose.offset(-0.0245F, -7.6514F, -3.8975F));

		PartDefinition neck_muscular_arched_long_2_crest_upper = neck_muscular_arched_long_2_crest.addOrReplaceChild("neck_muscular_arched_long_2_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.1827F, -3.2115F, -2.3756F));

		PartDefinition cube_r1 = neck_muscular_arched_long_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(672, 667).addBox(-4.1434F, -5.8622F, -2.7188F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6434F, 1.3371F, 2.7002F, 1.5708F, 0.0F, 0.0F));

		PartDefinition headAnchor = neck_muscular_arched_long_2_crest_upper.addOrReplaceChild("headAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0827F, 1.0766F, -3.294F));

		PartDefinition neck_muscular_arched_long_2_crest_lower = neck_muscular_arched_long_2_crest.addOrReplaceChild("neck_muscular_arched_long_2_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.1456F, 2.1338F, 2.34F));

		PartDefinition cube_r2 = neck_muscular_arched_long_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(642, 667).addBox(-5.08F, -10.0F, -0.92F, 5.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 2.5314F, 2.4183F, 0.7854F, 0.0F, 0.0F));

		PartDefinition withersAnchor = neck_muscular_arched_long_2_crest_lower.addOrReplaceChild("withersAnchor", CubeListBuilder.create(), PartPose.offset(0.0456F, 4.6293F, 4.4671F));

		PartDefinition cube_r3 = withersAnchor.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_long_2_middle_individual = neck_muscular_arched_long_2_individual.addOrReplaceChild("neck_muscular_arched_long_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.0126F, -2.7397F, -2.8365F));

		PartDefinition cube_r4 = neck_muscular_arched_long_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(656, 667).addBox(-5.0784F, -9.0F, -0.9017F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1161F, 5.8494F, 0.0543F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r5 = neck_muscular_arched_long_2_middle_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(642, 650).addBox(-6.0F, -10.0F, -1.0F, 6.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9623F, 1.4805F, 1.6879F, 0.7854F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_long_2_lower_individual = neck_muscular_arched_long_2_individual.addOrReplaceChild("neck_muscular_arched_long_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0528F, -0.9561F, -3.5567F));

		PartDefinition cube_r6 = neck_muscular_arched_long_2_lower_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(662, 651).addBox(-6.0792F, -11.0F, -0.9108F, 6.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0792F, 5.0961F, 0.4647F, 0.3054F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_long_2_mane = neck_muscular_arched_long_2.addOrReplaceChild("neck_muscular_arched_long_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.8492F, -1.7877F));

		PartDefinition neck_muscular_arched_long_2_top_mane = neck_muscular_arched_long_2_mane.addOrReplaceChild("neck_muscular_arched_long_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.5308F, -1.2872F, -1.8694F));

		PartDefinition neck_muscular_arched_long_2_top_mane_connector = neck_muscular_arched_long_2_top_mane.addOrReplaceChild("neck_muscular_arched_long_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -2.0559F, -0.8045F));

		PartDefinition neck_muscular_arched_long_2_top_mane_connector_individual = neck_muscular_arched_long_2_top_mane_connector.addOrReplaceChild("neck_muscular_arched_long_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

		PartDefinition cube_r7 = neck_muscular_arched_long_2_top_mane_connector_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(976, 813).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_long_2_top_mane_connector2 = neck_muscular_arched_long_2_top_mane_connector.addOrReplaceChild("neck_muscular_arched_long_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.0894F));

		PartDefinition neck_muscular_arched_long_2_top_mane_connector2_individual = neck_muscular_arched_long_2_top_mane_connector2.addOrReplaceChild("neck_muscular_arched_long_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.5034F, -0.7469F));

		PartDefinition cube_r8 = neck_muscular_arched_long_2_top_mane_connector2_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(974, 807).addBox(-2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_long_2_top_mane_flow = neck_muscular_arched_long_2_top_mane_connector2.addOrReplaceChild("neck_muscular_arched_long_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.771F, 0.0F, -0.0894F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck_muscular_arched_long_2_top_mane_flow.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(993, 800).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

		PartDefinition neck_muscular_arched_long_2_bottom_mane = neck_muscular_arched_long_2_mane.addOrReplaceChild("neck_muscular_arched_long_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.5308F, 1.4838F, 1.5273F));

		PartDefinition neck_muscular_arched_long_2_bottom_mane_connector = neck_muscular_arched_long_2_bottom_mane.addOrReplaceChild("neck_muscular_arched_long_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

		PartDefinition neck_muscular_arched_long_2_bottom_mane_connector_individual = neck_muscular_arched_long_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_arched_long_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, 0.2785F, 0.2301F));

		PartDefinition cube_r10 = neck_muscular_arched_long_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(992, 799).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9534F, -3.5267F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_long_2_bottom_mane_connector2 = neck_muscular_arched_long_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_arched_long_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.3575F, 0.0F, 0.8045F));

		PartDefinition neck_muscular_arched_long_2_bottom_mane_connector2_individual = neck_muscular_arched_long_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_arched_long_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.4665F, -0.114F, -0.1823F));

		PartDefinition cube_r11 = neck_muscular_arched_long_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(992, 814).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6569F, -3.9295F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_long_2_bottom_mane_flow = neck_muscular_arched_long_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_arched_long_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.2346F, -0.3575F, 0.0F));

		PartDefinition cube_r12 = neck_muscular_arched_long_2_bottom_mane_flow.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(977, 807).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, -0.8045F, -0.3575F, -0.8937F, -0.1201F, -0.1036F));

		PartDefinition chestAnchor = neck_muscular_arched_long_2.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1F, -1.25F, -1.75F));

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
		return "neck_muscular_arched_long_2";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart neck = this.neck_muscular_arched_long_2;
		ModelPart individual = neck_muscular_arched_long_2_individual;
		ModelPart crest = neck_muscular_arched_long_2_crest;
		ModelPart crest_upper = neck_muscular_arched_long_2_crest_upper;
		ModelPart crest_lower = neck_muscular_arched_long_2_crest_lower;


		registerAnchorPath("headAnchor", root, neck, individual, crest, crest_upper, this.headAnchor);
		registerAnchorPath("chestAnchor", root, neck, this.chestAnchor);
		registerAnchorPath("withersAnchor", root, neck, individual, crest, crest_lower, this.withersAnchor);
	}

}