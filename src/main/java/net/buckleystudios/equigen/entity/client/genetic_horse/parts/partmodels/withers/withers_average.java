package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.withers;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartWithersModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class withers_average extends MultipartWithersModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart withers_average;
	private final ModelPart neckAnchor;

	public withers_average(ModelPart root) {
		this.root = root;
		this.withers_average = root.getChild("withers_average");
		this.neckAnchor = this.withers_average.getChild("neckAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition withers_average = partdefinition.addOrReplaceChild("withers_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 1.0726F));

		PartDefinition withers_average_upper = withers_average.addOrReplaceChild("withers_average_upper", CubeListBuilder.create(), PartPose.offset(-0.0492F, -0.7822F, -0.3656F));

		PartDefinition cube_r1 = withers_average_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(761, 26).addBox(-4.0792F, -6.9812F, -4.4648F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, -2.8074F, -0.7073F, 1.2654F, 0.0F, 0.0F));

		PartDefinition withers_average_lower = withers_average.addOrReplaceChild("withers_average_lower", CubeListBuilder.create(), PartPose.offset(-0.0277F, -0.0699F, -0.2929F));

		PartDefinition cube_r2 = withers_average_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(781, 26).addBox(-5.08F, -6.88F, -4.52F, 6.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.8905F, -0.7872F, 1.2654F, 0.0F, 0.0F));

		PartDefinition neckAnchor = withers_average.addOrReplaceChild("neckAnchor", CubeListBuilder.create(), PartPose.offset(0.0F, -5.05F, -7.3226F));

		PartDefinition cube_r3 = neckAnchor.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

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
		return "withers_average";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart withers = this.withers_average;

		registerAnchorPath("neckAnchor", root, withers, this.neckAnchor);
	}
}