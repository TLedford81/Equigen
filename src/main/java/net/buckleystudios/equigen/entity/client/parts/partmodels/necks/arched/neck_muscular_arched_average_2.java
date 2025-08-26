package net.buckleystudios.equigen.entity.client.parts.partmodels.necks.arched;// Made with Blockbench 4.12.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class neck_muscular_arched_average_2 extends HierarchicalModel<GeneticHorseEntity> {
    private final ModelPart neck_muscular_arched_average_2;

	public neck_muscular_arched_average_2(ModelPart root) {
		this.neck_muscular_arched_average_2 = root.getChild("neck_muscular_arched_average_2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition neck_muscular_arched_average_2 = partdefinition.addOrReplaceChild("neck_muscular_arched_average_2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition neck_muscular_arched_average_2_individual = neck_muscular_arched_average_2.addOrReplaceChild("neck_muscular_arched_average_2_individual", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2927F, -2.0022F, -0.8399F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_average_2_crest = neck_muscular_arched_average_2_individual.addOrReplaceChild("neck_muscular_arched_average_2_crest", CubeListBuilder.create(), PartPose.offset(-0.2927F, -3.3609F, -0.8584F));

		PartDefinition neck_muscular_arched_average_2_crest_upper = neck_muscular_arched_average_2_crest.addOrReplaceChild("neck_muscular_arched_average_2_crest_upper", CubeListBuilder.create(), PartPose.offset(0.1748F, -2.8606F, -2.0935F));

		PartDefinition cube_r1 = neck_muscular_arched_average_2_crest_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(559, 660).addBox(-4.1434F, -5.8622F, -2.7188F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6434F, 0.7114F, 2.432F, 1.5708F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_average_2_crest_lower = neck_muscular_arched_average_2_crest.addOrReplaceChild("neck_muscular_arched_average_2_crest_lower", CubeListBuilder.create(), PartPose.offset(0.1225F, 0.7984F, 1.2933F));

		PartDefinition cube_r2 = neck_muscular_arched_average_2_crest_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(529, 660).addBox(-5.08F, -10.0F, -0.92F, 5.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, 3.5921F, 3.479F, 0.7854F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_average_2_middle_individual = neck_muscular_arched_average_2_individual.addOrReplaceChild("neck_muscular_arched_average_2_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.1914F, -0.3896F, -1.0042F));

		PartDefinition cube_r3 = neck_muscular_arched_average_2_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(543, 660).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0267F, 5.7274F, 0.0236F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck_muscular_arched_average_2_middle_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(530, 646).addBox(-6.0F, -10.0F, -1.0F, 6.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0517F, 3.1462F, 2.9086F, 0.7854F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_average_2_lower_individual = neck_muscular_arched_average_2_individual.addOrReplaceChild("neck_muscular_arched_average_2_lower_individual", CubeListBuilder.create(), PartPose.offset(-0.1339F, 1.6633F, -1.0673F));

		PartDefinition cube_r5 = neck_muscular_arched_average_2_lower_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(550, 647).addBox(-6.08F, -7.7191F, -1.7991F, 6.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.08F, 3.1305F, 0.7764F, 0.3054F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_average_2_mane = neck_muscular_arched_average_2.addOrReplaceChild("neck_muscular_arched_average_2_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -6.8827F, -1.0726F));

		PartDefinition neck_muscular_arched_average_2_top_mane = neck_muscular_arched_average_2_mane.addOrReplaceChild("neck_muscular_arched_average_2_top_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, -1.1978F, -1.1543F));

		PartDefinition neck_muscular_arched_average_2_top_mane_connector = neck_muscular_arched_average_2_top_mane.addOrReplaceChild("neck_muscular_arched_average_2_top_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.7151F, -1.7877F, -0.7151F));

		PartDefinition neck_muscular_arched_average_2_top_mane_connector_individual = neck_muscular_arched_average_2_top_mane_connector.addOrReplaceChild("neck_muscular_arched_average_2_top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0726F, 0.731F, -0.9015F));

		PartDefinition cube_r6 = neck_muscular_arched_average_2_top_mane_connector_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(871, 809).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0567F, 0.3652F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_average_2_top_mane_connector2 = neck_muscular_arched_average_2_top_mane_connector.addOrReplaceChild("neck_muscular_arched_average_2_top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.8045F, -0.3575F, -0.4469F));

		PartDefinition neck_muscular_arched_average_2_top_mane_connector2_individual = neck_muscular_arched_average_2_top_mane_connector2.addOrReplaceChild("neck_muscular_arched_average_2_top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 0.5034F, -0.3893F));

		PartDefinition cube_r7 = neck_muscular_arched_average_2_top_mane_connector2_individual.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(871, 816).addBox(-2.0F, -2.0F, -3.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5524F, 0.2999F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_average_2_top_mane_flow = neck_muscular_arched_average_2_top_mane_connector2.addOrReplaceChild("neck_muscular_arched_average_2_top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7709F, 0.0F, 0.2682F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r8 = neck_muscular_arched_average_2_top_mane_flow.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(857, 810).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8045F, 0.0257F, -1.0516F, 0.0323F, 0.0399F, -0.3352F));

		PartDefinition neck_muscular_arched_average_2_bottom_mane = neck_muscular_arched_average_2_mane.addOrReplaceChild("neck_muscular_arched_average_2_bottom_mane", CubeListBuilder.create(), PartPose.offset(0.7989F, 1.8413F, 2.3318F));

		PartDefinition neck_muscular_arched_average_2_bottom_mane_connector = neck_muscular_arched_average_2_bottom_mane.addOrReplaceChild("neck_muscular_arched_average_2_bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

		PartDefinition neck_muscular_arched_average_2_bottom_mane_connector_individual = neck_muscular_arched_average_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_arched_average_2_bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.6326F, -0.9116F, -0.6831F));

		PartDefinition cube_r9 = neck_muscular_arched_average_2_bottom_mane_connector_individual.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(882, 806).addBox(-2.0F, -2.0F, -2.01F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.7634F, -2.6136F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_average_2_bottom_mane_connector2 = neck_muscular_arched_average_2_bottom_mane_connector.addOrReplaceChild("neck_muscular_arched_average_2_bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.1788F, -2.4134F, -0.8045F));

		PartDefinition neck_muscular_arched_average_2_bottom_mane_connector2_individual = neck_muscular_arched_average_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_arched_average_2_bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(1.6453F, 1.1094F, 0.5135F));

		PartDefinition cube_r10 = neck_muscular_arched_average_2_bottom_mane_connector2_individual.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(881, 818).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4669F, -3.0163F, -0.9163F, 0.0F, 0.0F));

		PartDefinition neck_muscular_arched_average_2_bottom_mane_flow = neck_muscular_arched_average_2_bottom_mane_connector2.addOrReplaceChild("neck_muscular_arched_average_2_bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(2.4134F, -0.1788F, 0.0F));

		PartDefinition cube_r11 = neck_muscular_arched_average_2_bottom_mane_flow.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(859, 812).addBox(-0.8139F, -0.0002F, -5.3921F, 1.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0726F, 1.4302F, 1.2514F, -0.8937F, -0.1201F, -0.1036F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		neck_muscular_arched_average_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

    @Override
    public ModelPart root() {
        return neck_muscular_arched_average_2;
    }
}