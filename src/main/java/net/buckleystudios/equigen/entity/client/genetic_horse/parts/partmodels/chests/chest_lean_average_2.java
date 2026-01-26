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

public class chest_lean_average_2 extends MultipartChestModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart chest_lean_average_2;
	private final ModelPart neckAnchor;
	private final ModelPart backAnchor;
	private final ModelPart frontLeftLegAnchor;
	private final ModelPart frontRightLegAnchor;

	public chest_lean_average_2(ModelPart root) {
		this.root = root;
		this.chest_lean_average_2 = root.getChild("chest_lean_average_2");
		this.neckAnchor = this.chest_lean_average_2.getChild("neckAnchor");
		this.backAnchor = this.chest_lean_average_2.getChild("backAnchor");
		this.frontLeftLegAnchor = this.chest_lean_average_2.getChild("frontLeftLegAnchor");
		this.frontRightLegAnchor = this.chest_lean_average_2.getChild("frontRightLegAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition chest_lean_average_2 = partdefinition.addOrReplaceChild("chest_lean_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest_lean_average_2_chest_front = chest_lean_average_2.addOrReplaceChild("chest_lean_average_2_chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 1.2514F, -3.3967F));

		PartDefinition chest_lean_average_2_chest_front_upper = chest_lean_average_2_chest_front.addOrReplaceChild("chest_lean_average_2_chest_front_upper", CubeListBuilder.create(), PartPose.offset(0.1148F, -1.4374F, -0.004F));

		PartDefinition cube_r1 = chest_lean_average_2_chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(192, 684).addBox(-3.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -2.02F, 5.68F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_lean_average_2_chest_front_lower = chest_lean_average_2_chest_front.addOrReplaceChild("chest_lean_average_2_chest_front_lower", CubeListBuilder.create(), PartPose.offset(0.0254F, 2.1911F, 0.4258F));

		PartDefinition cube_r2 = chest_lean_average_2_chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(192, 668).addBox(-3.08F, -7.68F, -3.52F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -3.371F, 4.8176F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_lean_average_2_chest_left = chest_lean_average_2.addOrReplaceChild("chest_lean_average_2_chest_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_lean_average_2_chest_left_pectoral = chest_lean_average_2_chest_left.addOrReplaceChild("chest_lean_average_2_chest_left_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.5922F));

		PartDefinition chest_lean_average_2_chest_left_pectoral_top = chest_lean_average_2_chest_left_pectoral.addOrReplaceChild("chest_lean_average_2_chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(1.0254F, -1.8945F, -0.4416F));

		PartDefinition cube_r3 = chest_lean_average_2_chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(199, 657).addBox(-2.08F, -3.0F, -0.92F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, 0.8927F, -2.5728F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_lean_average_2_chest_left_pectoral_middle = chest_lean_average_2_chest_left_pectoral.addOrReplaceChild("chest_lean_average_2_chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(1.0736F, -0.4791F, -0.1575F));

		PartDefinition cube_r4 = chest_lean_average_2_chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(188, 659).addBox(-1.0708F, -7.7168F, -3.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4292F, -1.0652F, 5.7168F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_lean_average_2_chest_left_pectoral_bottom = chest_lean_average_2_chest_left_pectoral.addOrReplaceChild("chest_lean_average_2_chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(1.1147F, 3.1973F, 0.1856F));

		PartDefinition cube_r5 = chest_lean_average_2_chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(176, 684).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -3.8409F, 4.6466F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_lean_average_2_chest_left_deltoid = chest_lean_average_2_chest_left.addOrReplaceChild("chest_lean_average_2_chest_left_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_lean_average_2_chest_left_deltoid_outer = chest_lean_average_2_chest_left_deltoid.addOrReplaceChild("chest_lean_average_2_chest_left_deltoid_outer", CubeListBuilder.create().texOffs(201, 693).addBox(-2.0F, -3.0F, -3.5F, 4.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(2.1452F, -0.0559F, -0.0007F));

		PartDefinition chest_lean_average_2_chest_left_deltoid_base = chest_lean_average_2_chest_left_deltoid.addOrReplaceChild("chest_lean_average_2_chest_left_deltoid_base", CubeListBuilder.create().texOffs(176, 668).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.6089F, 0.0503F, -0.037F));

		PartDefinition chest_lean_average_2_chest_right = chest_lean_average_2.addOrReplaceChild("chest_lean_average_2_chest_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_lean_average_2_chest_right_pectoral = chest_lean_average_2_chest_right.addOrReplaceChild("chest_lean_average_2_chest_right_pectoral", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.4313F));

		PartDefinition chest_lean_average_2_chest_right_pectoral_top = chest_lean_average_2_chest_right_pectoral.addOrReplaceChild("chest_lean_average_2_chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(-0.9467F, -1.8642F, -0.555F));

		PartDefinition cube_r6 = chest_lean_average_2_chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(194, 693).addBox(-2.0892F, -2.98F, -0.9108F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5892F, 0.8724F, -2.5643F, -0.829F, 0.0F, 0.0F));

		PartDefinition chest_lean_average_2_chest_right_pectoral_middle = chest_lean_average_2_chest_right_pectoral.addOrReplaceChild("chest_lean_average_2_chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(-0.9321F, -0.4993F, -0.3109F));

		PartDefinition cube_r7 = chest_lean_average_2_chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(204, 662).addBox(-3.0701F, -7.6796F, -3.5295F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5701F, -1.0295F, 5.6796F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_lean_average_2_chest_right_pectoral_bottom = chest_lean_average_2_chest_right_pectoral.addOrReplaceChild("chest_lean_average_2_chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(-0.8914F, 3.1486F, 0.0214F));

		PartDefinition cube_r8 = chest_lean_average_2_chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(208, 684).addBox(-4.0692F, -7.6432F, -4.4748F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5692F, -3.7858F, 4.6274F, 1.9199F, 0.0F, 0.0F));

		PartDefinition chest_lean_average_2_chest_right_deltoid = chest_lean_average_2_chest_right.addOrReplaceChild("chest_lean_average_2_chest_right_deltoid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest_lean_average_2_chest_right_deltoid_outer = chest_lean_average_2_chest_right_deltoid.addOrReplaceChild("chest_lean_average_2_chest_right_deltoid_outer", CubeListBuilder.create().texOffs(200, 671).addBox(-2.0F, -3.0F, -3.5F, 4.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.8547F, -0.0559F, -0.0007F));

		PartDefinition chest_lean_average_2_chest_right_deltoid_base = chest_lean_average_2_chest_right_deltoid.addOrReplaceChild("chest_lean_average_2_chest_right_deltoid_base", CubeListBuilder.create().texOffs(177, 693).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.3971F, 0.0098F, 0.0034F));

		PartDefinition neckAnchor = chest_lean_average_2.addOrReplaceChild("neckAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, -2.75F));

		PartDefinition backAnchor = chest_lean_average_2.addOrReplaceChild("backAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 4.0F));

		PartDefinition frontLeftLegAnchor = chest_lean_average_2.addOrReplaceChild("frontLeftLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.25F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 4.0F, -3.0F));

		PartDefinition frontRightLegAnchor = chest_lean_average_2.addOrReplaceChild("frontRightLegAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.25F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.75F, 4.0F, -3.0F));

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
		return "chest_lean_average_2";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart chest = this.chest_lean_average_2;

		registerAnchorPath("backAnchor", root, chest, this.backAnchor);
		registerAnchorPath("neckAnchor", root, chest, this.neckAnchor);
		registerAnchorPath("frontLeftLegAnchor", root, chest, this.frontLeftLegAnchor);
		registerAnchorPath("frontRightLegAnchor", root, chest, this.frontRightLegAnchor);
	}

}