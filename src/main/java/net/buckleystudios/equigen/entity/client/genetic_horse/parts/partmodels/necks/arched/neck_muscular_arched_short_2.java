package net.buckleystudios.equigen.entity.client.genetic_horse.parts.partmodels.necks.arched;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.multipart.MultipartNeckModel;
import net.buckleystudios.equigen.entity.client.genetic_horse.parts.PartTransform;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.Map;

public class neck_muscular_arched_short_2 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart root;
	private final ModelPart neck_muscular_arched_short_2;
	private final ModelPart headAnchor;
	private final ModelPart chestAnchor;
	private final ModelPart withersAnchor;

	public neck_muscular_arched_short_2(ModelPart root) {
		this.root = root;
		this.neck_muscular_arched_short_2 = root.getChild("neck_muscular_arched_short_2");
		this.headAnchor = this.neck_muscular_arched_short_2.getChild("headAnchor");
		this.chestAnchor = this.neck_muscular_arched_short_2.getChild("chestAnchor");
		this.withersAnchor = this.neck_muscular_arched_short_2.getChild("withersAnchor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_muscular_arched_short_2 = partdefinition.addOrReplaceChild("neck_muscular_arched_short_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_muscular_arched_short_2_individual = neck_muscular_arched_short_2.addOrReplaceChild("neck_muscular_arched_short_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2927F, -0.2145F, -0.5718F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_short_2_crest = neck_muscular_arched_short_2_individual.addOrReplaceChild("neck_muscular_arched_short_2_crest", CubeListBuilder.create(), PartPose.offset(-0.2927F, -4.3441F, -1.5735F));

		PartDefinition neck_muscular_arched_short_2_crest_upper = neck_muscular_arched_short_2_crest.addOrReplaceChild("neck_muscular_arched_short_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3536F, -1.6092F, -1.2891F));

		PartDefinition cube_r1 = neck_muscular_arched_short_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(444, 657).addBox(-4.1434F, -5.8622F, -2.7188F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6434F, 0.4432F, 2.3426F, 1.5708F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_short_2_crest_lower = neck_muscular_arched_short_2_crest.addOrReplaceChild("neck_muscular_arched_short_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.3013F, 1.0745F, 1.3012F));

		PartDefinition cube_r2 = neck_muscular_arched_short_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(414, 657).addBox(-5.08F, -10.0F, -0.92F, 5.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 4.2992F, 4.1861F, 0.7854F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_short_2_middle_individual = neck_muscular_arched_short_2_individual.addOrReplaceChild("neck_muscular_arched_short_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.102F, -1.2262F, -1.4871F));

		PartDefinition cube_r3 = neck_muscular_arched_short_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(414, 645).addBox(-6.0F, -10.0F, -1.0F, 6.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1411F, 3.9827F, 3.3916F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_muscular_arched_short_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(428, 657).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9373F, 6.5639F, 0.5066F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_short_2_lower_individual = neck_muscular_arched_short_2_individual.addOrReplaceChild("neck_muscular_arched_short_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.0445F, 0.6665F, -1.5463F));

		PartDefinition cube_r5 = neck_muscular_arched_short_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(434, 646).addBox(-6.08F, -11.0F, -0.92F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.08F, 7.524F, 0.8979F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_short_2_mane = neck_muscular_arched_short_2.addOrReplaceChild("neck_muscular_arched_short_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -5.5419F, -0.8939F));

		PartDefinition neck_muscular_arched_short_2_top_mane = neck_muscular_arched_short_2_mane.addOrReplaceChild("neck_muscular_arched_short_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, -1.1084F, -1.9587F));

		PartDefinition neck_muscular_arched_short_2_top_mane_connector = neck_muscular_arched_short_2_top_mane.addOrReplaceChild("neck_muscular_arched_short_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.4302F, 0.1788F));

		PartDefinition neck_muscular_arched_short_2_top_mane_connector_individual = neck_muscular_arched_short_2_top_mane_connector.addOrReplaceChild("neck_muscular_arched_short_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

		PartDefinition cube_r6 = neck_muscular_arched_short_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(768, 809).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_short_2_top_mane_connector2 = neck_muscular_arched_short_2_top_mane_connector.addOrReplaceChild("neck_muscular_arched_short_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.4469F));

		PartDefinition neck_muscular_arched_short_2_top_mane_connector2_individual = neck_muscular_arched_short_2_top_mane_connector2.addOrReplaceChild("neck_muscular_arched_short_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6452F, 0.5034F, -0.3893F));

		PartDefinition cube_r7 = neck_muscular_arched_short_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(768, 816).addBox(-2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_short_2_top_mane_flow = neck_muscular_arched_short_2_top_mane_connector2.addOrReplaceChild("neck_muscular_arched_short_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8603F, 0.0F, 0.2682F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_muscular_arched_short_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(754, 810).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0256F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

		PartDefinition neck_muscular_arched_short_2_bottom_mane = neck_muscular_arched_short_2_mane.addOrReplaceChild("neck_muscular_arched_short_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, 2.2883F, 2.4211F));

		PartDefinition neck_muscular_arched_short_2_bottom_mane_connector = neck_muscular_arched_short_2_bottom_mane.addOrReplaceChild("neck_muscular_arched_short_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

		PartDefinition neck_muscular_arched_short_2_bottom_mane_connector_individual = neck_muscular_arched_short_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_arched_short_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -1.7049F, -1.2918F));

		PartDefinition cube_r9 = neck_muscular_arched_short_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(779, 810).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.97F, -2.0048F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_short_2_bottom_mane_connector2 = neck_muscular_arched_short_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_arched_short_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -2.4134F, -0.8045F));

		PartDefinition neck_muscular_arched_short_2_bottom_mane_connector2_individual = neck_muscular_arched_short_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_arched_short_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.316F, -0.0952F));

		PartDefinition cube_r10 = neck_muscular_arched_short_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(776, 820).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6736F, -2.4076F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_short_2_bottom_mane_flow = neck_muscular_arched_short_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_arched_short_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.5028F, -0.1788F, 0.0F));

		PartDefinition cube_r11 = neck_muscular_arched_short_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(758, 814).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, 1.4302F, 1.2514F, -0.8937F, -0.1201F, -0.1036F));

		PartDefinition headAnchor = neck_muscular_arched_short_2.addOrReplaceChild("headAnchor", CubeListBuilder.create(), PartPose.offset(0.35F, -6.6327F, -6.1739F));

		PartDefinition cube_r12 = headAnchor.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition chestAnchor = neck_muscular_arched_short_2.addOrReplaceChild("chestAnchor", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1F, -0.75F, -2.5F));

		PartDefinition withersAnchor = neck_muscular_arched_short_2.addOrReplaceChild("withersAnchor", CubeListBuilder.create(), PartPose.offset(0.2F, -0.7346F, 1.7529F));

		PartDefinition cube_r13 = withersAnchor.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6545F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_muscular_arched_short_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return root;
    }

	@Override
	public String animationRoot() {
		return "neck_muscular_arched_short_2";
	}

	@Override
	public Map<String, PartTransform> computeAnchors() {
		return Map.of(
				"headAnchor", asTransform(headAnchor),
				"chestAnchor", asTransform(chestAnchor),
				"withersAnchor", asTransform(withersAnchor));
	}

	@Override
	public void beforeAttached(GeneticHorseEntity entity, float partialTicks, PoseStack pose) {
		super.beforeAttached(entity, partialTicks, pose);
		float rx = getPitch(entity, "arched");
		float ry = getNetYaw(entity, partialTicks);
		pose.mulPose(Axis.XP.rotation(rx));
		pose.mulPose(Axis.YP.rotation(ry));
	}
}