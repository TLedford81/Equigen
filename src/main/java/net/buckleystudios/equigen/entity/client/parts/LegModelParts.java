package net.buckleystudios.equigen.entity.client.parts;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class LegModelParts {
    /* Top Front Legs */
    public static PartDefinition GenerateTopFrontLegLongThick(PartDefinition root){
        PartDefinition top_front_legs = root.addOrReplaceChild("top_front_legs", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition top_front_right_thick_long2 = top_front_legs.addOrReplaceChild("top_front_right_thick_long2", CubeListBuilder.create(), PartPose.offset(0.2158F, -9.4391F, -0.1043F));

        PartDefinition cube_r1 = top_front_right_thick_long2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(77, 67).mirror().addBox(-0.92F, -3.0F, -1.84F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.109F, 6.518F, 1.8258F, 1.4399F, 0.0F, 0.0F));

        PartDefinition cube_r2 = top_front_right_thick_long2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(68, 33).mirror().addBox(-1.01F, -2.0F, -2.02F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 6.922F, 1.006F, 1.789F, 0.0F, 0.0F));

        PartDefinition knee_front_right_thick_long2 = top_front_right_thick_long2.addOrReplaceChild("knee_front_right_thick_long2", CubeListBuilder.create().texOffs(54, 14).mirror().addBox(-0.9557F, -1.0929F, -1.0872F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.4469F, 8.6704F, 0.1788F));

        PartDefinition top_front_left_thick_long2 = top_front_legs.addOrReplaceChild("top_front_left_thick_long2", CubeListBuilder.create(), PartPose.offset(-0.2158F, -9.4391F, -0.1043F));

        PartDefinition cube_r3 = top_front_left_thick_long2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(77, 67).addBox(-1.08F, -3.0F, -1.84F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.109F, 6.518F, 1.8258F, 1.4399F, 0.0F, 0.0F));

        PartDefinition cube_r4 = top_front_left_thick_long2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(68, 33).addBox(-0.99F, -2.0F, -2.02F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.35F, 6.922F, 1.006F, 1.789F, 0.0F, 0.0F));

        PartDefinition knee_front_left_thick_long2 = top_front_left_thick_long2.addOrReplaceChild("knee_front_left_thick_long2", CubeListBuilder.create().texOffs(54, 14).addBox(-1.0443F, -1.0929F, -1.0872F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.4469F, 8.6704F, 0.1788F));

        return root;
    }

    /* Top Back Legs */
    public static PartDefinition GenerateTopBackLegLongAverage(PartDefinition root){
        PartDefinition top_front_legs = root.addOrReplaceChild("top_front_legs", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition top_front_right_average_long2 = top_front_legs.addOrReplaceChild("top_front_right_average_long2", CubeListBuilder.create(), PartPose.offset(-0.0206F, -11.0838F, -0.8061F));

        PartDefinition cube_r1 = top_front_right_average_long2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(71, 9).mirror().addBox(-0.92F, -1.0F, -2.92F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0851F, 6.8934F, 1.3426F, 1.7453F, 0.0F, 0.0F));

        PartDefinition cube_r2 = top_front_right_average_long2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(48, 30).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1238F, 7.8659F, 3.1768F, 1.8762F, 0.0F, 0.0F));

        PartDefinition knee_back_right_average_long2 = top_front_right_average_long2.addOrReplaceChild("knee_back_right_average_long2", CubeListBuilder.create().texOffs(72, 16).mirror().addBox(-1.0765F, -1.0302F, -1.0634F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 10.1899F, 1.6089F));

        PartDefinition top_front_left_average_long2 = top_front_legs.addOrReplaceChild("top_front_left_average_long2", CubeListBuilder.create(), PartPose.offset(0.0206F, -11.0838F, -0.8061F));

        PartDefinition cube_r3 = top_front_left_average_long2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(71, 9).addBox(-1.08F, -1.0F, -2.92F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0851F, 6.8934F, 1.3426F, 1.7453F, 0.0F, 0.0F));

        PartDefinition cube_r4 = top_front_left_average_long2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(48, 30).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1238F, 7.8659F, 3.1768F, 1.8762F, 0.0F, 0.0F));

        PartDefinition knee_back_left_average_long2 = top_front_left_average_long2.addOrReplaceChild("knee_back_left_average_long2", CubeListBuilder.create().texOffs(72, 16).addBox(-0.9235F, -1.0302F, -1.0634F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 10.1899F, 1.6089F));

        return root;
    }

    /* Bottom Legs */
    public static PartDefinition GenerateBottomLegLongThin(PartDefinition root){
        PartDefinition bottom_legs = root.addOrReplaceChild("bottom_legs", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition bottom_front_left_thin_long2 = bottom_legs.addOrReplaceChild("bottom_front_left_thin_long2", CubeListBuilder.create(), PartPose.offset(0.0021F, -8.2235F, 0.3384F));

        PartDefinition cube_r1 = bottom_front_left_thin_long2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(56, 94).addBox(-0.5363F, -0.5307F, -5.8912F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0342F, -0.0894F, -0.0234F, 1.5708F, 0.0F, 0.0F));

        PartDefinition bottom_2_front_left_thin_long2 = bottom_front_left_thin_long2.addOrReplaceChild("bottom_2_front_left_thin_long2", CubeListBuilder.create(), PartPose.offset(0.0F, 5.4525F, -0.1788F));

        PartDefinition cube_r2 = bottom_2_front_left_thin_long2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 4).addBox(-0.6294F, -0.498F, -2.904F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1223F, -0.0608F, 0.1523F, 1.1345F, 0.0F, 0.0F));

        PartDefinition bottom_front_right_thin_long2 = bottom_legs.addOrReplaceChild("bottom_front_right_thin_long2", CubeListBuilder.create(), PartPose.offset(0.0021F, -8.2235F, 0.3384F));

        PartDefinition cube_r3 = bottom_front_right_thin_long2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(56, 94).addBox(-0.5363F, -0.5307F, -5.8912F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0342F, -0.0894F, -0.0234F, 1.5708F, 0.0F, 0.0F));

        PartDefinition bottom_2_front_right_thin_long3 = bottom_front_right_thin_long2.addOrReplaceChild("bottom_2_front_right_thin_long3", CubeListBuilder.create(), PartPose.offset(0.0F, 5.4525F, -0.1788F));

        PartDefinition cube_r4 = bottom_2_front_right_thin_long3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 4).addBox(-0.6294F, -0.498F, -2.904F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1223F, -0.0608F, 0.1523F, 1.1345F, 0.0F, 0.0F));

        PartDefinition bottom_back_left_thin_long2 = bottom_legs.addOrReplaceChild("bottom_back_left_thin_long2", CubeListBuilder.create(), PartPose.offset(0.0021F, -8.2235F, 0.3384F));

        PartDefinition cube_r5 = bottom_back_left_thin_long2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(56, 94).addBox(-0.5363F, -0.5307F, -5.8912F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0342F, -0.0894F, -0.0234F, 1.5708F, 0.0F, 0.0F));

        PartDefinition bottom_2_back_left_thin_long4 = bottom_back_left_thin_long2.addOrReplaceChild("bottom_2_back_left_thin_long4", CubeListBuilder.create(), PartPose.offset(0.0F, 5.4525F, -0.1788F));

        PartDefinition cube_r6 = bottom_2_back_left_thin_long4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(1, 4).addBox(-0.6294F, -0.498F, -2.904F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1223F, -0.0608F, 0.1523F, 1.1345F, 0.0F, 0.0F));

        PartDefinition bottom_back_right_thin_long2 = bottom_legs.addOrReplaceChild("bottom_back_right_thin_long2", CubeListBuilder.create(), PartPose.offset(0.0021F, -8.2235F, 0.3384F));

        PartDefinition cube_r7 = bottom_back_right_thin_long2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(56, 94).addBox(-0.5363F, -0.5307F, -5.8912F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0342F, -0.0894F, -0.0234F, 1.5708F, 0.0F, 0.0F));

        PartDefinition bottom_2_back_right_thin_long5 = bottom_back_right_thin_long2.addOrReplaceChild("bottom_2_back_right_thin_long5", CubeListBuilder.create(), PartPose.offset(0.0F, 5.4525F, -0.1788F));

        PartDefinition cube_r8 = bottom_2_back_right_thin_long5.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(1, 4).addBox(-0.6294F, -0.498F, -2.904F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1223F, -0.0608F, 0.1523F, 1.1345F, 0.0F, 0.0F));

        return root;
    }

    /* Hooves */
    public static PartDefinition GenerateHoofLarge(PartDefinition root){
        PartDefinition hoof = root.addOrReplaceChild("hoof", CubeListBuilder.create(), PartPose.offset(-0.0894F, 22.9274F, -0.0379F));

        PartDefinition hoof_front_left = hoof.addOrReplaceChild("hoof_front_left", CubeListBuilder.create().texOffs(26, 75).addBox(-0.9106F, -0.9274F, -1.4621F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5754F, 0.0F, 3.1285F));

        PartDefinition hoof_back_right = hoof.addOrReplaceChild("hoof_back_right", CubeListBuilder.create().texOffs(26, 75).addBox(-0.9106F, -0.9274F, -1.4621F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(4.3799F, 0.0F, -4.4693F));

        PartDefinition hoof_back_left = hoof.addOrReplaceChild("hoof_back_left", CubeListBuilder.create().texOffs(26, 75).addBox(-0.9106F, -0.9274F, -1.4621F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.3073F, 0.0F, -4.5587F));

        PartDefinition hoof_front_right = hoof.addOrReplaceChild("hoof_front_right", CubeListBuilder.create().texOffs(26, 75).addBox(3.3799F, -0.9274F, 1.6664F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        return root;
    }

}
