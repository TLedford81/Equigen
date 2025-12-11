package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.stomachs;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartStomachModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class stomach_lean_average_low extends MultipartStomachModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart stomach_lean_average_low;
	private final ModelPart backAnchor;

	public stomach_lean_average_low(ModelPart root) {
		this.root = root;
		this.stomach_lean_average_low = root.getChild("stomach_lean_average_low");
		this.backAnchor = this.stomach_lean_average_low.getChild("backAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition stomach_lean_average_low = partdefinition.addOrReplaceChild("stomach_lean_average_low", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.2682F));

		PartDefinition stomach_lean_average_low_stomach_front_upper = stomach_lean_average_low.addOrReplaceChild("stomach_lean_average_low_stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0223F));

		PartDefinition stomach_lean_average_low_stomach_front_upper_individual = stomach_lean_average_low_stomach_front_upper.addOrReplaceChild("stomach_lean_average_low_stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0241F, -0.8856F, -0.7757F));

		PartDefinition cube_r1 = stomach_lean_average_low_stomach_front_upper_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(537, 320).addBox(-4.0892F, -4.2676F, -5.4648F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5892F, -2.9648F, 0.7676F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_lean_average_low_stomach_front_lower = stomach_lean_average_low_stomach_front_upper.addOrReplaceChild("stomach_lean_average_low_stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.0026F, -0.5018F, -0.6966F));

		PartDefinition cube_r2 = stomach_lean_average_low_stomach_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(557, 320).addBox(-4.08F, -5.24F, -5.52F, 4.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.02F, 1.74F, 1.5708F, 0.0F, 0.0F));

		PartDefinition stomach_lean_average_low_stomach_back_upper = stomach_lean_average_low.addOrReplaceChild("stomach_lean_average_low_stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.4469F));

		PartDefinition stomach_lean_average_low_stomach_back_upper_individual = stomach_lean_average_low_stomach_back_upper.addOrReplaceChild("stomach_lean_average_low_stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(-0.0241F, -1.5561F, 4.9397F));

		PartDefinition cube_r3 = stomach_lean_average_low_stomach_back_upper_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(554, 303).addBox(-5.0984F, -7.2952F, -5.4096F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5984F, -3.4959F, 0.191F, 1.7453F, 0.0F, 0.0F));

		PartDefinition stomach_lean_average_low_stomach_back_lower = stomach_lean_average_low_stomach_back_upper.addOrReplaceChild("stomach_lean_average_low_stomach_back_lower", CubeListBuilder.create(), PartPose.offset(0.0026F, -1.1281F, 5.2449F));

		PartDefinition cube_r4 = stomach_lean_average_low_stomach_back_lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(538, 303).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -3.595F, 0.1175F, 1.7453F, 0.0F, 0.0F));

		PartDefinition backAnchor = stomach_lean_average_low.addOrReplaceChild("backAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 9.7318F));

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
		return "stomach_lean_average_low";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart stomach = this.stomach_lean_average_low;

		registerAnchorPath("backAnchor", root, stomach, this.backAnchor);
	}

}