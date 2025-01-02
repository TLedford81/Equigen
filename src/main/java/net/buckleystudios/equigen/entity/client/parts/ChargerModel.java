package net.buckleystudios.equigen.entity.client.parts;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class ChargerModel {
    public static PartDefinition GeneratePartModel(PartDefinition root){

        PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(3.2179F, 25.162F, 3.4714F));

        PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition chest = torso.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 18).addBox(-7.6257F, -5.9162F, 16.8939F, 9.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(30, 0).addBox(-8.0894F, -4.6648F, 18.0559F, 10.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -20.2011F, -31.1061F));

        PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(86, 10).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -4.1725F, 23.2102F, 1.5708F, 0.0F, 0.0F));

        PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(80, 57).addBox(-5.0708F, -7.7168F, -4.5652F, 7.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5008F, -4.4046F, 23.898F, 1.5708F, 0.0F, 0.0F));

        PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(71, 94).addBox(-4.08F, -7.68F, -3.52F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -1.895F, 22.7776F, 1.9199F, 0.0F, 0.0F));

        PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(82, 41).addBox(-5.08F, -7.68F, -4.52F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -2.6101F, 23.1709F, 1.9199F, 0.0F, 0.0F));

        PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 67).addBox(-4.08F, -8.24F, -5.52F, 5.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3444F, -1.019F, 27.0337F, 1.5708F, 0.0F, 0.0F));

        PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 35).addBox(-5.0892F, -7.2676F, -5.4648F, 8.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.903F, -1.6157F, 25.9823F, 1.5708F, 0.0F, 0.0F));

        PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0391F, -5.5777F, 25.6894F, 0.0873F, 0.0F, 0.0F));

        PartDefinition cube_r7 = neck.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(83, 23).addBox(-4.0892F, -7.0F, -3.8808F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5017F, -8.6747F, -7.0475F, 1.0908F, 0.0F, 0.0F));

        PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(64, 81).addBox(-5.08F, -9.0F, -0.92F, 6.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0523F, 4.5758F, -7.4154F, 0.2618F, 0.0F, 0.0F));

        PartDefinition cube_r9 = neck.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(84, 85).addBox(-5.0784F, -9.0F, -0.9017F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1035F, 1.7231F, -9.1241F, 0.2618F, 0.0F, 0.0F));

        PartDefinition cube_r10 = neck.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(47, 86).addBox(-5.08F, -12.0F, -0.92F, 5.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.678F, 0.8116F, -0.4934F, 0.6109F, 0.0F, 0.0F));

        PartDefinition cube_r11 = neck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(26, 57).addBox(-4.0F, -10.0F, -2.0F, 6.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9832F, 0.1251F, -4.6838F, 0.5672F, 0.0F, 0.0F));

        PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.1788F, -9.7527F, -11.4764F));

        PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(87, 68).addBox(-4.0524F, -4.0F, -3.0076F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6756F, -2.911F, -1.1788F, 2.2253F, 0.0F, 0.0F));

        PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(97, 95).addBox(-3.08F, -3.24F, -1.84F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8009F, 1.6258F, -1.792F, 2.0508F, 0.0F, 0.0F));

        PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(13, 98).addBox(-3.08F, -3.24F, -1.84F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7115F, 1.3362F, -3.9408F, 2.6616F, 0.0F, 0.0F));

        PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(54, 44).addBox(-4.9595F, -1.919F, -1.081F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2329F, 2.8998F, -2.4069F, 0.6545F, 0.0F, 0.0F));

        PartDefinition muzzle = head.addOrReplaceChild("muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 3.4421F, -23.956F));

        PartDefinition cube_r16 = muzzle.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(63, 10).addBox(-2.4469F, -1.7862F, -3.7184F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1788F, -0.9832F, 20.0223F, 1.0036F, 0.0F, 0.0F));

        PartDefinition mouth = muzzle.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r17 = mouth.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 0).addBox(-1.9832F, -0.6095F, -3.149F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2682F, 0.3575F, 21.0056F, 0.9599F, 0.0F, 0.0F));

        PartDefinition left_ear = head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(0.9832F, -2.6182F, -1.5203F));

        PartDefinition cube_r18 = left_ear.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(22, 34).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7151F, -0.3575F, -0.4469F, 0.5236F, 0.0F, 0.0F));

        PartDefinition cube_r19 = left_ear.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(30, 0).addBox(-1.0F, -2.0384F, -0.6584F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1788F, -0.5363F, 0.1788F, 0.5236F, 0.0F, 0.0F));

        PartDefinition right_ear = head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-1.6089F, -3.3512F, -1.5203F));

        PartDefinition cube_r20 = right_ear.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3575F, 0.4648F, -0.2682F, 0.5236F, 0.0F, 0.0F));

        PartDefinition cube_r21 = right_ear.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(26, 18).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1788F, 1.448F, 0.2682F, 0.5236F, 0.0F, 0.0F));

        PartDefinition mane = neck.addOrReplaceChild("mane", CubeListBuilder.create(), PartPose.offset(0.0F, -0.1788F, -28.1922F));

        PartDefinition top_mane = mane.addOrReplaceChild("top_mane", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition fringe = top_mane.addOrReplaceChild("fringe", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r22 = fringe.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, -4.0F, -2.0F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2682F, -10.8156F, 12.8715F, -1.5623F, 0.5344F, -1.5878F));

        PartDefinition top_mane_connector = top_mane.addOrReplaceChild("top_mane_connector", CubeListBuilder.create().texOffs(58, 22).addBox(-1.3017F, -4.0894F, -2.5698F, 3.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.3128F, 17.0726F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bottom_mane = top_mane.addOrReplaceChild("bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0615F, 1.7877F));

        PartDefinition bottom_mane_connector = bottom_mane.addOrReplaceChild("bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0615F, -1.7877F));

        PartDefinition cube_r23 = bottom_mane_connector.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(35, 35).addBox(-3.0F, -3.0F, -5.0F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6983F, -4.9162F, 22.257F, -0.9599F, 0.0F, 0.0F));

        PartDefinition bottom_mane_flow = bottom_mane.addOrReplaceChild("bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r24 = bottom_mane_flow.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(26, 105).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9497F, -2.0559F, 20.648F, -0.7607F, -0.6981F, -0.5929F));

        PartDefinition top_mane_flow = top_mane.addOrReplaceChild("top_mane_flow", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r25 = top_mane_flow.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(4, 112).addBox(-1.0F, -2.0F, -3.0F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1285F, -11.0838F, 18.5922F, -0.4008F, -0.237F, -0.5587F));

        PartDefinition front_left_leg = chest.addOrReplaceChild("front_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 2.8067F, 19.0034F));

        PartDefinition top_front_left = front_left_leg.addOrReplaceChild("top_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1788F, -0.9832F));

        PartDefinition cube_r26 = top_front_left.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(26, 18).addBox(-1.08F, -2.0F, -0.84F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.477F, 5.1772F, 2.0666F, 1.4399F, 0.0F, 0.0F));

        PartDefinition cube_r27 = top_front_left.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(27, 77).addBox(-0.99F, -2.0F, -1.02F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0322F, 5.5812F, 1.6937F, 1.789F, 0.0F, 0.0F));

        PartDefinition knee_front_left = top_front_left.addOrReplaceChild("knee_front_left", CubeListBuilder.create().texOffs(0, 22).addBox(-0.9152F, -1.0929F, -0.3101F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.6145F, 0.3575F));

        PartDefinition bottom_front_left = knee_front_left.addOrReplaceChild("bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 1.7877F, 0.0F));

        PartDefinition cube_r28 = bottom_front_left.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(55, 94).addBox(-1.0F, -1.0838F, -4.9974F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.019F, 0.7508F, 1.5708F, 0.0F, 0.0F));

        PartDefinition bottom_2_front_left = bottom_front_left.addOrReplaceChild("bottom_2_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 3.3073F, 0.7151F));

        PartDefinition cube_r29 = bottom_2_front_left.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 4).addBox(-1.0F, -1.736F, -3.0467F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2324F, 0.7508F, 1.1345F, 0.0F, 0.0F));

        PartDefinition hoof_front_left = bottom_2_front_left.addOrReplaceChild("hoof_front_left", CubeListBuilder.create().texOffs(26, 75).addBox(-0.9578F, 5.6514F, -2.4653F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.3073F, -0.7151F));

        PartDefinition front_right_leg = chest.addOrReplaceChild("front_right_leg", CubeListBuilder.create(), PartPose.offset(-5.7385F, 3.343F, 1.4838F));

        PartDefinition top_front_right = front_right_leg.addOrReplaceChild("top_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 16.6257F));

        PartDefinition cube_r30 = top_front_right.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(92, 0).addBox(-1.08F, -2.0F, -0.84F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7744F, 4.8197F, 1.9772F, 1.4399F, 0.0F, 0.0F));

        PartDefinition cube_r31 = top_front_right.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 83).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.3274F, 1.8235F, 1.789F, 0.0F, 0.0F));

        PartDefinition knee_front_right = top_front_right.addOrReplaceChild("knee_front_right", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0152F, -1.9987F, -0.3419F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0615F, 0.3575F));

        PartDefinition bottom_front_right = knee_front_right.addOrReplaceChild("bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6615F, 0.0F));

        PartDefinition cube_r32 = bottom_front_right.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 93).addBox(-1.0F, -0.7946F, -4.8551F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8045F, 0.4827F, 1.5708F, 0.0F, 0.0F));

        PartDefinition bottom_2_front_right = bottom_front_right.addOrReplaceChild("bottom_2_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 6.2927F, 0.3575F));

        PartDefinition cube_r33 = bottom_2_front_right.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -1.0934F, -2.9443F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1084F, 0.4827F, 1.1345F, 0.0F, 0.0F));

        PartDefinition hoof_front_right = bottom_2_front_right.addOrReplaceChild("hoof_front_right", CubeListBuilder.create().texOffs(16, 67).addBox(-1.0152F, 13.6961F, -2.5556F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -12.6927F, -0.3575F));

        PartDefinition withers = torso.addOrReplaceChild("withers", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -19.2F));

        PartDefinition cube_r34 = withers.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(48, 51).addBox(-5.08F, -2.88F, -5.52F, 5.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2717F, -26.4688F, 13.7725F, 1.3526F, 0.0F, 0.0F));

        PartDefinition cube_r35 = withers.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 51).addBox(-6.08F, 0.12F, -5.52F, 7.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4505F, -26.2007F, 11.1803F, 1.3526F, 0.0F, 0.0F));

        PartDefinition hips = torso.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(27, 27).addBox(-7.5363F, -25.1173F, -10.4022F, 9.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(62, 0).addBox(-8.0F, -24.3296F, -9.4022F, 10.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 12.2458F));

        PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(80, 75).addBox(-5.08F, -4.24F, -5.36F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1823F, -24.0733F, -2.9747F, 1.2217F, 0.0F, 0.0F));

        PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(63, 30).addBox(-6.08F, -4.24F, -5.36F, 7.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3611F, -23.7158F, -3.6898F, 1.2217F, 0.0F, 0.0F));

        PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 1.162F, -14.5698F));

        PartDefinition tail_connector = tail.addOrReplaceChild("tail_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0391F, -22.8827F, 10.7263F, 0.2182F, 0.0F, 0.0F));

        PartDefinition cube_r38 = tail_connector.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(98, 34).addBox(-1.0F, -1.2817F, 0.7157F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2682F, -2.5922F, 0.0894F, -0.2182F, 0.0F, 0.0F));

        PartDefinition tail_top = tail_connector.addOrReplaceChild("tail_top", CubeListBuilder.create(), PartPose.offset(0.0F, -2.2346F, 3.3966F));

        PartDefinition cube_r39 = tail_top.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(26, 90).addBox(-1.2682F, -1.4208F, -0.28F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0894F, 0.0F, 0.1788F, -1.3963F, 0.0F, 0.0F));

        PartDefinition tail_middle = tail_top.addOrReplaceChild("tail_middle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, 4.9162F, 1.3408F, -0.2182F, 0.0F, 0.0F));

        PartDefinition cube_r40 = tail_middle.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(64, 44).addBox(-2.0F, -3.1616F, 0.2892F, 5.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4469F, -0.4469F, -0.8939F, -1.6144F, 0.0F, 0.0F));

        PartDefinition tail_bottom = tail_middle.addOrReplaceChild("tail_bottom", CubeListBuilder.create(), PartPose.offset(3.7542F, 20.2011F, -15.4637F));

        PartDefinition cube_r41 = tail_bottom.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(14, 87).addBox(-1.6257F, -1.0471F, -0.6463F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6816F, -11.8883F, 15.5531F, -1.6144F, 0.0F, 0.0F));

        PartDefinition back_left_leg = hips.addOrReplaceChild("back_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, -19.3073F, -4.5587F));

        PartDefinition top_back_left = back_left_leg.addOrReplaceChild("top_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5363F, 0.8939F));

        PartDefinition cube_r42 = top_back_left.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(72, 10).addBox(-1.08F, -2.0F, -1.92F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1194F, 6.9828F, 0.2217F, 1.7453F, 0.0F, 0.0F));

        PartDefinition cube_r43 = top_back_left.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(48, 30).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0894F, 7.419F, 0.6257F, 1.9199F, 0.0F, 0.0F));

        PartDefinition knee_back_left = top_back_left.addOrReplaceChild("knee_back_left", CubeListBuilder.create().texOffs(72, 16).addBox(-0.9578F, 0.3106F, -1.7374F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.4916F, 0.2682F));

        PartDefinition bottom_back_left = knee_back_left.addOrReplaceChild("bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8939F, -0.2682F));

        PartDefinition cube_r44 = bottom_back_left.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(89, 34).addBox(-1.0F, -1.1206F, -6.0169F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1788F, -0.2682F, 1.5272F, 0.0F, 0.0F));

        PartDefinition bottom_2_back_left = bottom_back_left.addOrReplaceChild("bottom_2_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 6.4358F, -1.0726F));

        PartDefinition cube_r45 = bottom_2_back_left.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(98, 19).addBox(-1.0F, -1.3114F, -2.9185F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8045F, 0.7151F, 0.9599F, 0.0F, 0.0F));

        PartDefinition hoof_back_left = bottom_2_back_left.addOrReplaceChild("hoof_back_left", CubeListBuilder.create().texOffs(70, 57).addBox(-0.9578F, -3.0717F, -0.9154F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0223F, -2.5028F));

        PartDefinition back_right_leg = hips.addOrReplaceChild("back_right_leg", CubeListBuilder.create(), PartPose.offset(-5.9888F, -19.933F, -4.1117F));

        PartDefinition top_back_right = back_right_leg.addOrReplaceChild("top_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, -0.1788F, 0.0894F));

        PartDefinition cube_r46 = top_back_right.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(12, 73).addBox(-1.08F, -2.0F, -1.92F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3275F, 7.2509F, 0.3111F, 1.7017F, 0.0F, 0.0F));

        PartDefinition cube_r47 = top_back_right.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(57, 16).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5363F, 7.6872F, 0.7151F, 1.8762F, 0.0F, 0.0F));

        PartDefinition knee_back_right = top_back_right.addOrReplaceChild("knee_back_right", CubeListBuilder.create().texOffs(20, 51).addBox(-1.0177F, -10.7732F, 1.838F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.1117F, -3.486F));

        PartDefinition bottom_back_right = knee_back_right.addOrReplaceChild("bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, -10.8156F, 3.6648F));

        PartDefinition cube_r48 = bottom_back_right.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(90, 50).addBox(-1.0F, -1.1465F, -6.3845F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1788F, -0.5363F, 1.5272F, 0.0F, 0.0F));

        PartDefinition bottom_2_back_right = bottom_back_right.addOrReplaceChild("bottom_2_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 6.6145F, -1.162F));

        PartDefinition cube_r49 = bottom_2_back_right.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(87, 0).addBox(-1.0F, -1.1869F, -2.9404F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7151F, 0.6257F, 0.9599F, 0.0F, 0.0F));

        PartDefinition hoof_back_right = bottom_2_back_right.addOrReplaceChild("hoof_back_right", CubeListBuilder.create().texOffs(96, 75).addBox(-1.0177F, -2.9815F, -1.0057F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.2011F, -2.5028F));

        PartDefinition back = torso.addOrReplaceChild("back", CubeListBuilder.create().texOffs(0, 0).addBox(-7.5732F, -3.1285F, -30.1397F, 9.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -21.1844F, 22.257F));

        PartDefinition cube_r50 = back.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(64, 64).addBox(-4.08F, -7.24F, -5.52F, 5.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4337F, -1.4337F, -18.7924F, 1.789F, 0.0F, 0.0F));

        PartDefinition cube_r51 = back.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(42, 12).addBox(-5.08F, -7.24F, -5.52F, 8.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8807F, -2.0594F, -18.703F, 1.789F, 0.0F, 0.0F));

        PartDefinition cube_r52 = back.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(42, 70).addBox(-5.08F, -7.24F, -5.52F, 5.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3611F, -4.5372F, -19.9616F, 1.6581F, 0.0F, 0.0F));

        PartDefinition cube_r53 = back.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(28, 41).addBox(-5.08F, -7.24F, -5.52F, 7.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4337F, -3.8221F, -20.2297F, 1.6581F, 0.0F, 0.0F));

        return root;
    }
}
