package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.heads;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartHeadModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class head_roman_average extends MultipartHeadModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart head_roman_average;
	private final ModelPart neckAnchor;
	private final ModelPart leftEarAnchor;
	private final ModelPart rightEarAnchor;

	public head_roman_average(ModelPart root) {
		this.root = root;
		this.head_roman_average = root.getChild("head_roman_average");
		this.neckAnchor = this.head_roman_average.getChild("neckAnchor");
		this.leftEarAnchor = this.head_roman_average.getChild("leftEarAnchor");
		this.rightEarAnchor = this.head_roman_average.getChild("rightEarAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head_roman_average = partdefinition.addOrReplaceChild("head_roman_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head_roman_average_jaw = head_roman_average.addOrReplaceChild("head_roman_average_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 2.324F, -0.5363F));

		PartDefinition head_roman_average_jaw_individual = head_roman_average_jaw.addOrReplaceChild("head_roman_average_jaw_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0492F, -0.0346F));

		PartDefinition cube_r1 = head_roman_average_jaw_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(951, 71).addBox(-5.9595F, -1.919F, -1.081F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5108F, 1.1962F, -0.8707F, 0.6545F, 0.0F, 0.0F));

		PartDefinition head_roman_average_jaw_branch = head_roman_average_jaw.addOrReplaceChild("head_roman_average_jaw_branch", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5663F, -0.5602F));

		PartDefinition cube_r2 = head_roman_average_jaw_branch.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(951, 86).addBox(-2.08F, -3.24F, -1.84F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5593F, -0.4162F, 0.0016F, 2.1817F, 0.0F, 0.0F));

		PartDefinition head_roman_average_nose_bridge = head_roman_average.addOrReplaceChild("head_roman_average_nose_bridge", CubeListBuilder.create(), PartPose.offset(0.0F, 2.6298F, -3.9113F));

		PartDefinition cube_r3 = head_roman_average_nose_bridge.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(963, 86).addBox(-3.08F, -3.24F, -1.84F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6319F, -0.8028F, -0.1369F, 2.8798F, 0.0F, 0.0F));

		PartDefinition head_roman_average_forehead = head_roman_average.addOrReplaceChild("head_roman_average_forehead", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0066F, -2.402F));

		PartDefinition cube_r4 = head_roman_average_forehead.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(951, 79).addBox(-4.0524F, -4.0F, -3.0076F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.596F, -2.4136F, 0.6689F, 2.2253F, 0.0F, 0.0F));

		PartDefinition head_roman_average_muzzle = head_roman_average.addOrReplaceChild("head_roman_average_muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 4.648F, -4.5587F));

		PartDefinition head_roman_average_muzzle_individual = head_roman_average_muzzle.addOrReplaceChild("head_roman_average_muzzle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = head_roman_average_muzzle_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(967, 79).addBox(-2.4469F, -1.7862F, -3.7184F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9204F, -0.715F, 0.6964F, 1.0036F, 0.0F, 0.0F));

		PartDefinition head_roman_average_mouth = head_roman_average_muzzle.addOrReplaceChild("head_roman_average_mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.6257F, 1.162F));

		PartDefinition cube_r6 = head_roman_average_mouth.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(966, 72).addBox(-1.9832F, -0.6095F, -3.149F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4735F, 0.0894F, 0.5176F, 0.9599F, 0.0F, 0.0F));

		PartDefinition head_roman_average_fringe = head_roman_average.addOrReplaceChild("head_roman_average_fringe", CubeListBuilder.create(), PartPose.offset(0.0F, -1.8771F, -2.2346F));

		PartDefinition cube_r7 = head_roman_average_fringe.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(963, 94).addBox(-1.0F, -4.0F, -2.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4735F, 1.3944F, -3.0578F, -1.5615F, 0.6653F, -1.5864F));

		PartDefinition neckAnchor = head_roman_average.addOrReplaceChild("neckAnchor", CubeListBuilder.create(), PartPose.offset(0.0F, -0.8283F, -1.4873F));

		PartDefinition cube_r8 = neckAnchor.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition leftEarAnchor = head_roman_average.addOrReplaceChild("leftEarAnchor", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, -2.0442F, -2.1495F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r9 = leftEarAnchor.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0442F, 0.3995F, 0.829F, 0.0F, 0.0F));

		PartDefinition rightEarAnchor = head_roman_average.addOrReplaceChild("rightEarAnchor", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, -2.0442F, -2.1495F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r10 = rightEarAnchor.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0442F, 0.3995F, 0.829F, 0.0F, 0.0F));

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
		return "head_roman_average";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart head = this.head_roman_average;

		registerAnchorPath("neckAnchor", root, head, this.neckAnchor);
		registerAnchorPath("leftEarAnchor", root, head, this.leftEarAnchor);
		registerAnchorPath("rightEarAnchor", root, head, this.rightEarAnchor);
	}

	@Override
	public void afterAttached(GeneticHorseEntity e, float partialTicks) {
		this.root().yRot = getNetYaw(e, partialTicks);
		this.root().xRot = getPitch(e, "roman");
	}
}