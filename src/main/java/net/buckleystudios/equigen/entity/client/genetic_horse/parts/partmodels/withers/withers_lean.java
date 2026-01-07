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

public class withers_lean extends MultipartWithersModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart withers_lean;
	private final ModelPart neckAnchor;

	public withers_lean(ModelPart root) {
		this.root = root;
		this.withers_lean = root.getChild("withers_lean");
		this.neckAnchor = this.withers_lean.getChild("neckAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition withers_lean = partdefinition.addOrReplaceChild("withers_lean", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 1.162F));

		PartDefinition withers_lean_upper = withers_lean.addOrReplaceChild("withers_lean_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = withers_lean_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(712, 26).addBox(-4.0792F, -6.9812F, -4.4648F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.03F, -3.5896F, -1.0729F, 1.2654F, 0.0F, 0.0F));

		PartDefinition withers_lean__lower = withers_lean.addOrReplaceChild("withers_lean__lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = withers_lean__lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(732, 26).addBox(-4.08F, -6.88F, -4.52F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.516F, -2.9604F, -1.0801F, 1.2654F, 0.0F, 0.0F));

		PartDefinition neckAnchor = withers_lean.addOrReplaceChild("neckAnchor", CubeListBuilder.create(), PartPose.offset(-0.1F, -5.05F, -7.412F));

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
		return "withers_lean";
	}

	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart withers = this.withers_lean;

		registerAnchorPath("neckAnchor", root, withers, this.neckAnchor);
	}
}