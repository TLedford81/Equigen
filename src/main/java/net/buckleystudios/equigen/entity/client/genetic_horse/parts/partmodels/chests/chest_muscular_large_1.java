package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.chests;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartChestModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class chest_muscular_large_1 extends MultipartChestModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart chest_muscular_large_1;
	private final ModelPart neckAnchor;
	private final ModelPart backAnchor;
	private final ModelPart frontLeftLegAnchor;
	private final ModelPart frontRightLegAnchor;

	public chest_muscular_large_1(ModelPart root) {
		this.root = root;
		this.chest_muscular_large_1 = root.getChild("chest_muscular_large_1");
		this.neckAnchor = this.chest_muscular_large_1.getChild("neckAnchor");
		this.backAnchor = this.chest_muscular_large_1.getChild("backAnchor");
		this.frontLeftLegAnchor = this.chest_muscular_large_1.getChild("frontLeftLegAnchor");
		this.frontRightLegAnchor = this.chest_muscular_large_1.getChild("frontRightLegAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition chest_muscular_large_1 = partdefinition.addOrReplaceChild("chest_muscular_large_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -0.2682F));

		PartDefinition chest_muscular_large_1_chest_front = chest_muscular_large_1.addOrReplaceChild("chest_muscular_large_1_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 2.4134F, -4.7374F));

		PartDefinition chest_muscular_large_1_chest_front_upper = chest_muscular_large_1_chest_front.addOrReplaceChild("chest_muscular_large_1_chest_front_upper", CubeListBuilder.create(), PartPose.offset(-0.2065F, -2.4207F, 0.5323F));

		PartDefinition cube_r1 = chest_muscular_large_1_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(228, 805).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4375F, -2.02F, 5.9482F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_muscular_large_1_chest_front_lower = chest_muscular_large_1_chest_front.addOrReplaceChild("chest_muscular_large_1_chest_front_lower", CubeListBuilder.create(), PartPose.offset(-0.1386F, 1.2831F, 1.3269F));

		PartDefinition cube_r2 = chest_muscular_large_1_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(246, 815).addBox(-4.0792F, -7.6432F, -3.4848F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3474F, -3.3253F, 5.0632F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_muscular_large_1_chest_left = chest_muscular_large_1.addOrReplaceChild("chest_muscular_large_1_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_muscular_large_1_chest_left_pectoral = chest_muscular_large_1_chest_left.addOrReplaceChild("chest_muscular_large_1_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.933F));

		PartDefinition chest_muscular_large_1_chest_left_pectoral_top = chest_muscular_large_1_chest_left_pectoral.addOrReplaceChild("chest_muscular_large_1_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.5617F, -1.696F, 0.1952F));

		PartDefinition cube_r3 = chest_muscular_large_1_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(248, 832).addBox(-2.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_muscular_large_1_chest_left_pectoral_middle = chest_muscular_large_1_chest_left_pectoral.addOrReplaceChild("chest_muscular_large_1_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.5932F, -0.1942F, 0.4682F));

		PartDefinition cube_r4 = chest_muscular_large_1_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(241, 797).addBox(-0.5F, -2.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_muscular_large_1_chest_left_pectoral_bottom = chest_muscular_large_1_chest_left_pectoral.addOrReplaceChild("chest_muscular_large_1_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.5617F, 3.7336F, 1.2582F));

		PartDefinition cube_r5 = chest_muscular_large_1_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(257, 795).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_muscular_large_1_chest_left_deltoid = chest_muscular_large_1_chest_left.addOrReplaceChild("chest_muscular_large_1_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_muscular_large_1_chest_left_deltoid_outer = chest_muscular_large_1_chest_left_deltoid.addOrReplaceChild("chest_muscular_large_1_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(257, 832).addBox(-2.5F, -3.5F, -3.0F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6285F, -0.1983F, 0.287F));

		PartDefinition chest_muscular_large_1_chest_left_deltoid_base = chest_muscular_large_1_chest_left_deltoid.addOrReplaceChild("chest_muscular_large_1_chest_left_deltoid_base", CubeListBuilder.create().texOffs(227, 814).addBox(-2.5F, -4.5F, -4.5F, 5.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0754F, -0.0028F, 0.1781F));

		PartDefinition chest_muscular_large_1_chest_right = chest_muscular_large_1.addOrReplaceChild("chest_muscular_large_1_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_muscular_large_1_chest_right_pectoral = chest_muscular_large_1_chest_right.addOrReplaceChild("chest_muscular_large_1_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.3799F));

		PartDefinition chest_muscular_large_1_chest_right_pectoral_top = chest_muscular_large_1_chest_right_pectoral.addOrReplaceChild("chest_muscular_large_1_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-1.4383F, -1.696F, 0.6421F));

		PartDefinition cube_r6 = chest_muscular_large_1_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(258, 813).addBox(-5.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, 1.2305F, -2.9415F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_muscular_large_1_chest_right_pectoral_middle = chest_muscular_large_1_chest_right_pectoral.addOrReplaceChild("chest_muscular_large_1_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-1.4068F, -0.1942F, 0.9152F));

		PartDefinition cube_r7 = chest_muscular_large_1_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(246, 806).addBox(-3.5F, -2.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_muscular_large_1_chest_right_pectoral_bottom = chest_muscular_large_1_chest_right_pectoral.addOrReplaceChild("chest_muscular_large_1_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-1.4383F, 3.7336F, 1.7052F));

		PartDefinition cube_r8 = chest_muscular_large_1_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(262, 804).addBox(-5.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_muscular_large_1_chest_right_deltoid = chest_muscular_large_1_chest_right.addOrReplaceChild("chest_muscular_large_1_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_muscular_large_1_chest_right_deltoid_outer = chest_muscular_large_1_chest_right_deltoid.addOrReplaceChild("chest_muscular_large_1_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(256, 819).addBox(-2.5F, -3.5F, -3.0F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.3715F, -0.1983F, 0.287F));

		PartDefinition chest_muscular_large_1_chest_right_deltoid_base = chest_muscular_large_1_chest_right_deltoid.addOrReplaceChild("chest_muscular_large_1_chest_right_deltoid_base", CubeListBuilder.create().texOffs(229, 832).addBox(-2.5F, -4.5F, -4.5F, 5.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9303F, -0.0478F, 0.2213F));

		PartDefinition neckAnchor = chest_muscular_large_1.addOrReplaceChild("neckAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.5F, -2.7318F));

		PartDefinition backAnchor = chest_muscular_large_1.addOrReplaceChild("backAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.5F, 4.7682F));

		PartDefinition frontLeftLegAnchor = chest_muscular_large_1.addOrReplaceChild("frontLeftLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.75F, 4.25F, -1.7318F));

		PartDefinition frontRightLegAnchor = chest_muscular_large_1.addOrReplaceChild("frontRightLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, 4.25F, -1.7318F));

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
		return "chest_muscular_large_1";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart chest = this.chest_muscular_large_1;

		registerAnchorPath("backAnchor", root, chest, this.backAnchor);
		registerAnchorPath("neckAnchor", root, chest, this.neckAnchor);
		registerAnchorPath("frontLeftLegAnchor", root, chest, this.frontLeftLegAnchor);
		registerAnchorPath("frontRightLegAnchor", root, chest, this.frontRightLegAnchor);
	}

}