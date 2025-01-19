package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

import java.util.List;

public class TopForeLegModelParts {
    public static PartDefinition[] Generate(PartDefinition leftLegRoot, PartDefinition rightLegRoot, String thickness, String length, int variation) {
        if (thickness.equals("average") && length.equals("short") && variation == 1) {
            PartDefinition top_front_right_leg = rightLegRoot.addOrReplaceChild("top_front_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_average_short1 = top_front_right_leg.addOrReplaceChild("top_front_right_average_short1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_average_short1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(216, 0).addBox(-0.942F, -1.0808F, -5.7678F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2585F, 0.994F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_average_short1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(216, 7).addBox(-0.7848F, -1.0771F, -5.6637F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7571F, -0.9429F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_left_leg = leftLegRoot.addOrReplaceChild("top_front_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_average_short1 = top_front_left_leg.addOrReplaceChild("top_front_left_average_short1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_average_short1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(202, 7).mirror().addBox(-1.058F, -1.0808F, -5.7678F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.2585F, 0.994F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_average_short1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(202, 0).mirror().addBox(-1.2152F, -1.0771F, -5.6637F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7571F, -0.9429F, 1.789F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("short") && variation == 2) {
            PartDefinition top_front_right_leg = rightLegRoot.addOrReplaceChild("top_front_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_average_short2 = top_front_right_leg.addOrReplaceChild("top_front_right_average_short2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_average_short2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(248, 0).mirror().addBox(-1.058F, -1.0808F, -5.7678F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6328F, 0.994F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_average_short2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(248, 8).mirror().addBox(-0.99F, -1.0771F, -5.6637F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2252F, -0.1314F, -0.9429F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_left_leg = leftLegRoot.addOrReplaceChild("top_front_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_average_short2 = top_front_left_leg.addOrReplaceChild("top_front_left_average_short2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_average_short2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(232, 0).addBox(-0.942F, -1.0808F, -5.7678F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6328F, 0.994F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_average_short2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(232, 8).addBox(-0.7848F, -1.0771F, -5.6637F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1314F, -0.9429F, 1.789F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("short") && variation == 3) {
            PartDefinition top_front_right_leg = rightLegRoot.addOrReplaceChild("top_front_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_average_short3 = top_front_right_leg.addOrReplaceChild("top_front_right_average_short3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_average_short3.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(286, 9).mirror().addBox(-0.0855F, -2.0F, -1.84F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.4789F, 1.446F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_average_short3.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(285, 0).mirror().addBox(-0.4165F, -2.0F, -2.02F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.8829F, 0.9837F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_left_leg = leftLegRoot.addOrReplaceChild("top_front_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_average_short3 = top_front_left_leg.addOrReplaceChild("top_front_left_average_short3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_average_short3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(268, 9).addBox(-1.9145F, -2.0F, -1.84F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.4789F, 1.446F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_average_short3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(267, 0).addBox(-1.5835F, -2.0F, -2.02F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.8829F, 0.9837F, 1.789F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("average") && variation == 1) {
            PartDefinition top_front_right_leg = rightLegRoot.addOrReplaceChild("top_front_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_average_average1 = top_front_right_leg.addOrReplaceChild("top_front_right_average_average1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_average_average1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(335, 0).mirror().addBox(-0.8051F, 0.0559F, -0.5299F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.039F, -0.6944F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_average_average1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(325, 9).mirror().addBox(-0.7685F, -1.6455F, -0.7933F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.8197F, 0.9097F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_right_average_average1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(324, 0).mirror().addBox(-1.1889F, -2.0F, -1.02F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.9555F, 0.8049F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_left_leg = leftLegRoot.addOrReplaceChild("top_front_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, -7.1151F, 0.0F));

            PartDefinition top_front_left_average_average1 = top_front_left_leg.addOrReplaceChild("top_front_left_average_average1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_average_average1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(317, 1).addBox(-1.1949F, 0.0559F, -0.5299F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.039F, -0.6944F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r5 = top_front_left_average_average1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(307, 9).addBox(-1.2315F, -1.6455F, -0.7933F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8197F, 0.9097F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r6 = top_front_left_average_average1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(306, 0).addBox(-0.8111F, -2.0F, -1.02F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.9555F, 0.8049F, 1.789F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("average") && variation == 2) {
            PartDefinition top_front_right_leg = rightLegRoot.addOrReplaceChild("top_front_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_average_average2 = top_front_right_leg.addOrReplaceChild("top_front_right_average_average2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_average_average2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(356, 10).mirror().addBox(-0.8051F, -2.0F, 1.1684F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.3631F, 1.3863F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_average_average2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(365, 10).mirror().addBox(-0.7685F, -2.0F, -1.84F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.5515F, 1.5387F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_right_average_average2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(364, 0).mirror().addBox(-1.1889F, -2.0F, -2.02F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.9555F, 0.8083F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_left_leg = leftLegRoot.addOrReplaceChild("top_front_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_average_average2 = top_front_left_leg.addOrReplaceChild("top_front_left_average_average2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_average_average2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(356, 0).addBox(-1.1949F, -2.0F, 1.1684F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.3631F, 1.3863F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r5 = top_front_left_average_average2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(345, 10).addBox(-1.2315F, -2.0F, -1.84F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5515F, 1.5387F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r6 = top_front_left_average_average2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(344, 0).addBox(-0.8111F, -2.0F, -2.02F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.9555F, 0.8083F, 1.789F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("average") && variation == 3) {
            PartDefinition top_front_right_leg = rightLegRoot.addOrReplaceChild("top_front_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_average_average3 = top_front_right_leg.addOrReplaceChild("top_front_right_average_average3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_average_average3.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(418, 8).mirror().addBox(-0.8051F, -2.0F, 0.1684F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.9161F, 1.3047F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_average_average3.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(407, 0).mirror().addBox(-0.8132F, -2.0F, -0.84F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.5347F, 1.3848F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_right_average_average3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(406, 9).mirror().addBox(-1.1442F, -2.0F, -0.02F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.6539F, 1.2801F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_left_leg = leftLegRoot.addOrReplaceChild("top_front_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_average_average3 = top_front_left_leg.addOrReplaceChild("top_front_left_average_average3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_average_average3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(396, 8).addBox(-1.1949F, -2.0F, 0.1684F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.9161F, 1.3047F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r5 = top_front_left_average_average3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(385, 0).addBox(-1.1868F, -2.0F, -0.84F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5347F, 1.3848F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r6 = top_front_left_average_average3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(384, 9).addBox(-0.8558F, -2.0F, -0.02F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.6539F, 1.2801F, 1.789F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("long") && variation == 1) {
            PartDefinition top_front_right_leg = rightLegRoot.addOrReplaceChild("top_front_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_average_long = top_front_right_leg.addOrReplaceChild("top_front_right_average_long", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_average_long.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(455, 0).mirror().addBox(-0.8051F, -2.0F, -0.8316F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.8994F, 1.3803F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_average_long.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(455, 0).mirror().addBox(-0.8132F, -2.0F, -0.84F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.9649F, 1.482F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_right_average_long.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(454, 10).mirror().addBox(-1.1442F, -2.0F, -0.02F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.9053F, 1.3772F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_left_leg = leftLegRoot.addOrReplaceChild("top_front_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_average_long1 = top_front_left_leg.addOrReplaceChild("top_front_left_average_long1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_average_long1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(433, 0).addBox(-1.1949F, -2.0F, -0.8316F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.9887F, 1.3803F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r5 = top_front_left_average_long1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(433, 0).addBox(-1.1868F, -2.0F, -0.84F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.9649F, 1.482F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r6 = top_front_left_average_long1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(432, 10).addBox(-0.8558F, -2.0F, -0.02F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.9052F, 1.3772F, 1.789F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("long") && variation == 2) {
            PartDefinition top_front_right_leg = rightLegRoot.addOrReplaceChild("top_front_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_average_long2 = top_front_right_leg.addOrReplaceChild("top_front_right_average_long2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_average_long2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(447, 26).addBox(-1.1949F, -2.0F, -0.8316F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.2569F, 1.3175F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_average_long2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(434, 24).mirror().addBox(-0.8132F, -2.0F, -1.84F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.518F, 1.4682F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_right_average_long2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(420, 25).mirror().addBox(-1.1442F, -2.0F, -2.02F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.922F, 1.006F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_left_leg = leftLegRoot.addOrReplaceChild("top_front_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_average_long2 = top_front_left_leg.addOrReplaceChild("top_front_left_average_long2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_average_long2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(490, 23).mirror().addBox(-0.8051F, -2.0F, -0.8316F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.2569F, 1.3175F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r5 = top_front_left_average_long2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(477, 21).addBox(-1.1868F, -2.0F, -1.84F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.518F, 1.4682F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r6 = top_front_left_average_long2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(463, 22).addBox(-0.8558F, -2.0F, -2.02F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.922F, 1.006F, 1.789F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("long") && variation == 3) {
            PartDefinition top_front_right_leg = rightLegRoot.addOrReplaceChild("top_front_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_average_long3 = top_front_right_leg.addOrReplaceChild("top_front_right_average_long3", CubeListBuilder.create(), PartPose.offset(0.0031F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_average_long3.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(490, 37).addBox(-1.1949F, -2.0F, -0.8316F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0031F, 7.4357F, 1.4335F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_average_long3.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(477, 35).mirror().addBox(-0.8345F, -2.0F, -1.84F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0031F, 6.6074F, 1.6736F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_right_average_long3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(463, 36).mirror().addBox(-1.1655F, -2.0F, -2.02F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0031F, 6.5645F, 1.0325F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_left_leg = leftLegRoot.addOrReplaceChild("top_front_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_average_long3 = top_front_left_leg.addOrReplaceChild("top_front_left_average_long3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_average_long3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(448, 40).mirror().addBox(-0.8051F, -2.0F, -0.8316F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.4357F, 1.4335F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r5 = top_front_left_average_long3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(435, 38).addBox(-1.1868F, -2.0F, -1.84F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.6074F, 1.6736F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r6 = top_front_left_average_long3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(421, 39).addBox(-0.8558F, -2.0F, -2.02F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5645F, 1.0325F, 1.789F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("short") && variation == 1) {
            PartDefinition top_front_right_leg = rightLegRoot.addOrReplaceChild("top_front_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_thick_short1 = top_front_right_leg.addOrReplaceChild("top_front_right_thick_short1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_thick_short1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(209, 19).mirror().addBox(-1.058F, -2.0808F, -5.7678F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.2585F, 1.5303F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_thick_short1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(209, 27).mirror().addBox(-1.2152F, -1.0771F, -5.6637F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.204F, -1.3898F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_left_leg = leftLegRoot.addOrReplaceChild("top_front_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_thick_short1 = top_front_left_leg.addOrReplaceChild("top_front_left_thick_short1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_thick_short1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(195, 19).addBox(-0.942F, -2.0808F, -5.7678F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2585F, 1.5303F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_thick_short1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(195, 27).addBox(-0.7848F, -1.0771F, -5.6637F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.204F, -1.3898F, 1.789F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("short") && variation == 2) {
            PartDefinition top_front_right_leg = rightLegRoot.addOrReplaceChild("top_front_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_thick_short2 = top_front_right_leg.addOrReplaceChild("top_front_right_thick_short2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_thick_short2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(242, 19).mirror().addBox(-1.058F, -2.0808F, -5.7678F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6328F, 1.3515F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_thick_short2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(242, 28).mirror().addBox(-1.2152F, -1.0771F, -5.6637F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3102F, -1.5686F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_left_leg = leftLegRoot.addOrReplaceChild("top_front_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_thick_short2 = top_front_left_leg.addOrReplaceChild("top_front_left_thick_short2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_thick_short2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(226, 19).addBox(-0.942F, -2.0808F, -5.7678F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6328F, 1.3515F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_thick_short2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(226, 28).addBox(-0.7848F, -1.0771F, -5.6637F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3102F, -1.658F, 1.789F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("short") && variation == 3) {
            PartDefinition top_front_right_leg = rightLegRoot.addOrReplaceChild("top_front_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_thick_short3 = top_front_right_leg.addOrReplaceChild("top_front_right_thick_short3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_thick_short3.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(279, 28).mirror().addBox(-0.0855F, -3.0F, -1.84F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.6577F, 1.9823F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_thick_short3.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(278, 19).mirror().addBox(-0.4165F, -2.0F, -2.02F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.6148F, 0.7156F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_left_leg = leftLegRoot.addOrReplaceChild("top_front_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_thick_short3 = top_front_left_leg.addOrReplaceChild("top_front_left_thick_short3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_thick_short3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(261, 28).addBox(-1.9145F, -3.0F, -1.84F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6577F, 1.9823F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_thick_short3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(260, 19).addBox(-1.5835F, -2.0F, -2.02F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6147F, 0.7156F, 1.789F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("average") && variation == 1) {
            PartDefinition top_front_right_leg = rightLegRoot.addOrReplaceChild("top_front_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_thick_average1 = top_front_right_leg.addOrReplaceChild("top_front_right_thick_average1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_thick_average1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(317, 30).mirror().addBox(-0.7685F, -2.6455F, -0.7933F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.8197F, 1.3566F, 1.5272F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_thick_average1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(316, 21).mirror().addBox(-1.1889F, -2.0F, -1.02F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.9555F, 0.6262F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_left_leg = leftLegRoot.addOrReplaceChild("top_front_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_thick_average1 = top_front_left_leg.addOrReplaceChild("top_front_left_thick_average1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_thick_average1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(299, 30).addBox(-1.2315F, -2.6455F, -0.7933F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8197F, 1.3566F, 1.5272F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_thick_average1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(298, 21).addBox(-0.8111F, -2.0F, -1.02F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.9555F, 0.6262F, 1.789F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("average") && variation == 2) {
            PartDefinition top_front_right_leg = rightLegRoot.addOrReplaceChild("top_front_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_thick_average2 = top_front_right_leg.addOrReplaceChild("top_front_right_thick_average2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_thick_average2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(347, 30).mirror().addBox(-0.7685F, -3.0F, -1.84F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.5515F, 1.8069F, 1.5272F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_thick_average2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(346, 20).mirror().addBox(-1.1889F, -2.0F, -2.02F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.9555F, 0.5402F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_left_leg = leftLegRoot.addOrReplaceChild("top_front_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_thick_average2 = top_front_left_leg.addOrReplaceChild("top_front_left_thick_average2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_thick_average2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(332, 34).addBox(-1.2315F, -3.0F, -1.84F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.5515F, 1.8069F, 1.5272F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_thick_average2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(331, 24).addBox(-0.8111F, -2.0F, -2.02F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.9555F, 0.5402F, 1.789F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("average") && variation == 3) {
            PartDefinition top_front_right_leg = rightLegRoot.addOrReplaceChild("top_front_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_thick_average3 = top_front_right_leg.addOrReplaceChild("top_front_right_thick_average3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_thick_average3.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(374, 20).mirror().addBox(-0.8132F, -3.0F, -0.84F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.8029F, 2.0105F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_thick_average3.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(373, 30).mirror().addBox(-1.1442F, -2.0F, -0.02F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.922F, 1.1013F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_left_leg = leftLegRoot.addOrReplaceChild("top_front_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_thick_average3 = top_front_left_leg.addOrReplaceChild("top_front_left_thick_average3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_thick_average3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(362, 25).addBox(-1.1868F, -3.0F, -0.84F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.8029F, 2.0105F, 1.4399F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_thick_average3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(361, 35).addBox(-0.8558F, -2.0F, -0.02F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.922F, 1.1013F, 1.789F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("long") && variation == 1) {
            PartDefinition top_front_right_leg = rightLegRoot.addOrReplaceChild("top_front_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_thick_long1 = top_front_right_leg.addOrReplaceChild("top_front_right_thick_long1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_thick_long1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(401, 20).mirror().addBox(-0.8132F, -3.0F, -0.84F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.6968F, 2.0183F, 1.4835F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_thick_long1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(400, 31).mirror().addBox(-1.1442F, -2.0F, -0.02F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.6371F, 1.0197F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_left_leg = leftLegRoot.addOrReplaceChild("top_front_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_thick_long1 = top_front_left_leg.addOrReplaceChild("top_front_left_thick_long1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_thick_long1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(386, 24).addBox(-1.1868F, -3.0F, -0.84F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.6968F, 2.0183F, 1.4835F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_thick_long1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(385, 35).addBox(-0.8558F, -2.0F, -0.02F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.6371F, 1.0197F, 1.789F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("long") && variation == 2) {
            PartDefinition top_front_right_leg = rightLegRoot.addOrReplaceChild("top_front_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_thick_long2 = top_front_right_leg.addOrReplaceChild("top_front_right_thick_long2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_thick_long2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(231, 52).mirror().addBox(-0.8132F, -3.0F, -1.84F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.8755F, 2.1833F, 1.4835F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_thick_long2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(230, 39).mirror().addBox(-1.1442F, -2.0F, -2.02F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 7.2795F, 0.6484F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_left_leg = leftLegRoot.addOrReplaceChild("top_front_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_thick_long2 = top_front_left_leg.addOrReplaceChild("top_front_left_thick_long2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_thick_long2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(207, 52).addBox(-1.1868F, -3.0F, -1.84F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8755F, 2.1833F, 1.4835F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_thick_long2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(206, 39).addBox(-0.8558F, -2.0F, -2.02F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.2796F, 0.6484F, 1.789F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("long") && variation == 3) {
            PartDefinition top_front_right_leg = rightLegRoot.addOrReplaceChild("top_front_right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_right_thick_long3 = top_front_right_leg.addOrReplaceChild("top_front_right_thick_long3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = top_front_right_thick_long3.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(281, 52).mirror().addBox(-0.8132F, -3.0F, -1.84F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.6074F, 2.0311F, 1.4835F, 0.0F, 0.0F));

            PartDefinition cube_r2 = top_front_right_thick_long3.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(280, 39).mirror().addBox(-1.1442F, -2.0F, -2.02F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.5645F, 0.4068F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_left_leg = leftLegRoot.addOrReplaceChild("top_front_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_left_thick_long3 = top_front_left_leg.addOrReplaceChild("top_front_left_thick_long3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = top_front_left_thick_long3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(257, 52).addBox(-1.1868F, -3.0F, -1.84F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.6074F, 2.0311F, 1.4835F, 0.0F, 0.0F));

            PartDefinition cube_r4 = top_front_left_thick_long3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(256, 39).addBox(-0.8558F, -2.0F, -2.02F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5645F, 0.4068F, 1.789F, 0.0F, 0.0F));

        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Top Forelegs / " + thickness + " / " + length + " / Variation " + variation + ", Cancelling Generation...");
        }
        return new PartDefinition[]{leftLegRoot, rightLegRoot};
    }

    public static PartDefinition[] GenerateAll(PartDefinition rootTopForeLegLeft, PartDefinition rootTopForeLegRight) {
        List<String> thickness = List.of("thin", "average", "thick");
        List<String> length = List.of("short", "average", "long");
        PartDefinition[] roots;

        for(String variable1 : thickness){
            for(String variable2 : length){
                roots = Generate(rootTopForeLegLeft, rootTopForeLegRight, variable1, variable2, 1);
                rootTopForeLegLeft = roots[0];
                rootTopForeLegRight = roots[1];

                roots = Generate(rootTopForeLegLeft, rootTopForeLegRight, variable1, variable2, 2);
                rootTopForeLegLeft = roots[0];
                rootTopForeLegRight = roots[1];
            }
        }
        return new PartDefinition[]{rootTopForeLegLeft, rootTopForeLegRight};
    }
}