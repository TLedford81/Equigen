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

public class neck_muscular_ewed_short_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart neck_muscular_ewed_short_1;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;
	private final ModelPart withersAnchor;

	public neck_muscular_ewed_short_1(ModelPart root) {
		this.root = root;
		this.neck_muscular_ewed_short_1 = root.getChild("neck_muscular_ewed_short_1");
		this.headAnchor = this.neck_muscular_ewed_short_1.getChild("headAnchor");
		this.chestAnchor = this.neck_muscular_ewed_short_1.getChild("chestAnchor");
		this.withersAnchor = this.neck_muscular_ewed_short_1.getChild("withersAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_muscular_ewed_short_1 = partdefinition.addOrReplaceChild("neck_muscular_ewed_short_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_muscular_ewed_short_1_individual = neck_muscular_ewed_short_1.addOrReplaceChild("neck_muscular_ewed_short_1_individual", CubeListBuilder.create(), PartPose.offset(-0.0056F, 0.9475F, 0.991F));

		PartDefinition neck_muscular_ewed_short_1_crest = neck_muscular_ewed_short_1_individual.addOrReplaceChild("neck_muscular_ewed_short_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -6.257F, -2.8603F));

		PartDefinition neck_muscular_ewed_short_1_crest_upper = neck_muscular_ewed_short_1_crest.addOrReplaceChild("neck_muscular_ewed_short_1_crest_upper", CubeListBuilder.create(), PartPose.offset(-0.064F, -1.1801F, -1.6154F));

		PartDefinition cube_r1 = neck_muscular_ewed_short_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(364, 777).addBox(-4.08F, -4.0F, -2.92F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, 0.3935F, 2.166F, 0.9599F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_short_1_crest_lower = neck_muscular_ewed_short_1_crest.addOrReplaceChild("neck_muscular_ewed_short_1_crest_lower", CubeListBuilder.create(), PartPose.offset(-0.0808F, 1.1539F, 2.1046F));

		PartDefinition cube_r2 = neck_muscular_ewed_short_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(382, 777).addBox(-5.08F, -7.0F, -0.92F, 5.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 3.3225F, 2.2288F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_short_1_middle_individual = neck_muscular_ewed_short_1_individual.addOrReplaceChild("neck_muscular_ewed_short_1_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1955F, -4.6189F, -3.6204F));

		PartDefinition cube_r3 = neck_muscular_ewed_short_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(360, 766).addBox(-5.0F, -8.0F, -1.0F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.162F, 4.744F, 2.4584F, 0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_short_1_lower_individual = neck_muscular_ewed_short_1_individual.addOrReplaceChild("neck_muscular_ewed_short_1_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.19F, -3.3187F, -4.5041F));

		PartDefinition cube_r4 = neck_muscular_ewed_short_1_lower_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(380, 766).addBox(-6.0784F, -8.0F, -0.9017F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7404F, 5.0418F, 0.9576F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_short_1_mane = neck_muscular_ewed_short_1.addOrReplaceChild("neck_muscular_ewed_short_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.3296F, 0.0F));

		PartDefinition neck_muscular_ewed_short_1_top_mane = neck_muscular_ewed_short_1_mane.addOrReplaceChild("neck_muscular_ewed_short_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, -1.2871F, -0.9755F));

		PartDefinition neck_muscular_ewed_short_1_top_mane_connector = neck_muscular_ewed_short_1_top_mane.addOrReplaceChild("neck_muscular_ewed_short_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.1788F, -1.162F));

		PartDefinition neck_muscular_ewed_short_1_top_mane_connector_individual = neck_muscular_ewed_short_1_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_short_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, -0.0147F, 0.1266F));

		PartDefinition cube_r5 = neck_muscular_ewed_short_1_top_mane_connector_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(725, 874).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8191F, -0.5736F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_short_1_top_mane_connector2 = neck_muscular_ewed_short_1_top_mane_connector.addOrReplaceChild("neck_muscular_ewed_short_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.4469F, 0.8045F));

		PartDefinition neck_muscular_ewed_short_1_top_mane_connector2_individual = neck_muscular_ewed_short_1_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_short_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.4665F, 0.0227F, -0.391F));

		PartDefinition cube_r6 = neck_muscular_ewed_short_1_top_mane_connector2_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(725, 880).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2287F, -0.8604F, -0.6109F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_short_1_top_mane_flow = neck_muscular_ewed_short_1_top_mane_connector2.addOrReplaceChild("neck_muscular_ewed_short_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.771F, -0.3575F, 0.0894F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r7 = neck_muscular_ewed_short_1_top_mane_flow.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(713, 874).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, -0.4463F, -0.7381F, -0.4276F, -0.2206F, -0.3514F));

		PartDefinition neck_muscular_ewed_short_1_bottom_mane = neck_muscular_ewed_short_1_mane.addOrReplaceChild("neck_muscular_ewed_short_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.4414F, 1.752F, 0.8122F));

		PartDefinition neck_muscular_ewed_short_1_bottom_mane_connector = neck_muscular_ewed_short_1_bottom_mane.addOrReplaceChild("neck_muscular_ewed_short_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

		PartDefinition neck_muscular_ewed_short_1_bottom_mane_connector_individual = neck_muscular_ewed_short_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_short_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 0.3678F, 0.2301F));

		PartDefinition cube_r8 = neck_muscular_ewed_short_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(735, 875).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.9534F, -3.5267F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_short_1_bottom_mane_connector2 = neck_muscular_ewed_short_1_bottom_mane_connector.addOrReplaceChild("neck_muscular_ewed_short_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.7151F, 0.6257F));

		PartDefinition neck_muscular_ewed_short_1_bottom_mane_connector2_individual = neck_muscular_ewed_short_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_short_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, 0.6905F, -0.0035F));

		PartDefinition cube_r9 = neck_muscular_ewed_short_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(732, 884).addBox(-2.0F, -2.0F, 1.0F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6569F, -3.9295F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_ewed_short_1_bottom_mane_flow = neck_muscular_ewed_short_1_bottom_mane_connector2.addOrReplaceChild("neck_muscular_ewed_short_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.5922F, 0.3575F, 0.3575F));

		PartDefinition cube_r10 = neck_muscular_ewed_short_1_bottom_mane_flow.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(716, 878).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7151F, -0.8938F, -0.4469F, -0.8901F, -0.0927F, -0.1377F));

		PartDefinition headAnchor = neck_muscular_ewed_short_1.addOrReplaceChild("headAnchor", CubeListBuilder.create(), PartPose.offset(-0.15F, -8.3827F, -4.6739F));

		PartDefinition cube_r11 = headAnchor.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_muscular_ewed_short_1.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1F, -2.25F, -2.5F));

		PartDefinition withersAnchor = neck_muscular_ewed_short_1.addOrReplaceChild("withersAnchor", CubeListBuilder.create(), PartPose.offset(-0.1F, -1.9346F, 1.5529F));

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
		return "neck_muscular_ewed_short_1";
	}

	@Override
	protected void defineAnchorPaths() {
		ModelPart root = this.root();
		ModelPart neck = this.neck_muscular_ewed_short_1;

		registerAnchorPath("headAnchor", root, neck, this.headAnchor);
		registerAnchorPath("chestAnchor", root, neck, this.chestAnchor);
		registerAnchorPath("withersAnchor", root, neck, this.withersAnchor);
	}

}