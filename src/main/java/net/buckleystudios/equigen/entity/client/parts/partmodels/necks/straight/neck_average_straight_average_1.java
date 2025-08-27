package net.buckleystudios.equigen.entity.client.parts.partmodels.necks.straight;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.client.parts.MultipartNeckModel;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class neck_average_straight_average_1 extends MultipartNeckModel<GeneticHorseEntity> {
	private final ModelPart neck_average_straight_average_1;

	public neck_average_straight_average_1(ModelPart root) {
		this.neck_average_straight_average_1 = root.getChild("neck_average_straight_average_1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_average_straight_average_1 = partdefinition.addOrReplaceChild("neck_average_straight_average_1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_average_straight_average_1_individual = neck_average_straight_average_1.addOrReplaceChild("neck_average_straight_average_1_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2682F, -1.6089F, -0.0894F, -0.5672F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_average_1_crest = neck_average_straight_average_1_individual.addOrReplaceChild("neck_average_straight_average_1_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -4.6302F, -2.9497F));

		PartDefinition neck_average_straight_average_1_crest_upper = neck_average_straight_average_1_crest.addOrReplaceChild("neck_average_straight_average_1_crest_upper", CubeListBuilder.create(), PartPose.offset(0.3103F, -0.2071F, -1.5138F));

		PartDefinition cube_r1 = neck_average_straight_average_1_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(465, 864).addBox(-3.08F, -4.0F, -3.92F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -0.6646F, 0.663F, 1.6144F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_average_1_crest_lower = neck_average_straight_average_1_crest.addOrReplaceChild("neck_average_straight_average_1_crest_lower", CubeListBuilder.create(), PartPose.offset(0.2404F, 0.5596F, 1.7788F));

		PartDefinition cube_r2 = neck_average_straight_average_1_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(497, 864).addBox(-4.08F, -5.0F, -0.92F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, 0.9177F, 1.7788F, 1.1345F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_average_1_middle_individual = neck_average_straight_average_1_individual.addOrReplaceChild("neck_average_straight_average_1_middle_individual", CubeListBuilder.create(), PartPose.offset(0.298F, -0.9778F, -1.6868F));

		PartDefinition cube_r3 = neck_average_straight_average_1_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(487, 852).addBox(-4.0F, -7.0F, -1.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4897F, 1.0357F, 2.9669F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_average_straight_average_1_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(467, 850).addBox(-5.0708F, -11.03F, -0.9292F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5811F, 6.5392F, 3.322F, 0.8727F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_average_1_lower_individual = neck_average_straight_average_1_individual.addOrReplaceChild("neck_average_straight_average_1_lower_individual", CubeListBuilder.create(), PartPose.offset(0.3463F, 0.056F, -3.811F));

		PartDefinition cube_r5 = neck_average_straight_average_1_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(483, 864).addBox(-4.0784F, -5.0F, -0.9017F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5784F, 2.0468F, 1.0083F, 0.9599F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_average_1_mane = neck_average_straight_average_1.addOrReplaceChild("neck_average_straight_average_1_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -8.4022F, 0.0F));

		PartDefinition neck_average_straight_average_1_top_mane = neck_average_straight_average_1_mane.addOrReplaceChild("neck_average_straight_average_1_top_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -1.1084F, -0.3498F));

		PartDefinition neck_average_straight_average_1_top_mane_connector = neck_average_straight_average_1_top_mane.addOrReplaceChild("neck_average_straight_average_1_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8045F, -0.2682F, -2.0559F));

		PartDefinition neck_average_straight_average_1_top_mane_connector_individual = neck_average_straight_average_1_top_mane_connector.addOrReplaceChild("neck_average_straight_average_1_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.162F, 0.1884F, 0.4861F));

		PartDefinition cube_r6 = neck_average_straight_average_1_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(823, 934).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.616F, -0.933F, -0.5236F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_average_1_top_mane_connector2 = neck_average_straight_average_1_top_mane_connector.addOrReplaceChild("neck_average_straight_average_1_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.2514F, -0.4469F, 0.8045F));

		PartDefinition neck_average_straight_average_1_top_mane_connector2_individual = neck_average_straight_average_1_top_mane_connector2.addOrReplaceChild("neck_average_straight_average_1_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.3771F, 0.2024F, -0.0684F));

		PartDefinition cube_r7 = neck_average_straight_average_1_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(822, 941).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.049F, -1.183F, -0.5236F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_average_1_top_mane_flow = neck_average_straight_average_1_top_mane_connector2.addOrReplaceChild("neck_average_straight_average_1_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.324F, -0.3575F, 0.0894F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_average_straight_average_1_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(808, 935).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.3465F, -0.1867F, -0.3551F));

		PartDefinition neck_average_straight_average_1_bottom_mane = neck_average_straight_average_1_mane.addOrReplaceChild("neck_average_straight_average_1_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, 2.1095F, 1.4379F));

		PartDefinition neck_average_straight_average_1_bottom_mane_connector = neck_average_straight_average_1_bottom_mane.addOrReplaceChild("neck_average_straight_average_1_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

		PartDefinition neck_average_straight_average_1_bottom_mane_connector_individual = neck_average_straight_average_1_bottom_mane_connector.addOrReplaceChild("neck_average_straight_average_1_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.2613F, 0.9284F, 0.3847F));

		PartDefinition cube_r9 = neck_average_straight_average_1_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(833, 935).addBox(-2.0F, -2.0F, 0.99F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.514F, -3.6813F, -0.9599F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_average_1_bottom_mane_connector2 = neck_average_straight_average_1_bottom_mane_connector.addOrReplaceChild("neck_average_straight_average_1_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, 0.5363F, 1.2514F));

		PartDefinition neck_average_straight_average_1_bottom_mane_connector2_individual = neck_average_straight_average_1_bottom_mane_connector2.addOrReplaceChild("neck_average_straight_average_1_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.5559F, 0.0175F, -0.462F));

		PartDefinition cube_r10 = neck_average_straight_average_1_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(830, 945).addBox(-2.0F, -2.0F, 1.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.2354F, -4.0966F, -0.9599F, 0.0F, 0.0F));

		PartDefinition neck_average_straight_average_1_bottom_mane_flow = neck_average_straight_average_1_bottom_mane_connector2.addOrReplaceChild("neck_average_straight_average_1_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.2346F, 0.0894F, 0.2682F));

		PartDefinition cube_r11 = neck_average_straight_average_1_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(812, 939).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -1.5196F, -0.8045F, -0.9774F, -0.0927F, -0.1377F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_average_straight_average_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_average_straight_average_1;
    }

	@Override
	public void PositionParts() {
		super.PositionParts(root(), root());
	}
}