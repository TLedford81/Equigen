package net.buckleystudios.equigen.entity.client.parts;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class TurkomanModel {
    public static PartDefinition GeneratePartModel(PartDefinition root){
        PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(3.2179F, 25.162F, 0.7898F));

        PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition chest = torso.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 20).addBox(-7.0F, -6.648F, -1.8939F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(38, 0).addBox(-8.0894F, -5.8436F, -0.7318F, 10.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -20.2011F, -10.5475F));

        PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(89, 40).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -4.1725F, 3.6348F, 1.5708F, 0.0F, 0.0F));

        PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(80, 57).addBox(-5.0708F, -7.7168F, -4.5652F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9645F, -4.4046F, 4.3226F, 1.5708F, 0.0F, 0.0F));

        PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(90, 91).addBox(-4.0792F, -7.6432F, -3.4848F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0091F, -1.7741F, 3.2763F, 1.9199F, 0.0F, 0.0F));

        PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(84, 12).addBox(-5.08F, -7.68F, -4.52F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -2.2525F, 3.8636F, 1.9199F, 0.0F, 0.0F));

        PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 80).addBox(-4.08F, -6.24F, -5.52F, 4.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -1.019F, 4.9555F, 1.6144F, 0.0F, 0.0F));

        PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(62, 60).addBox(-5.0892F, -6.2676F, -5.4648F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0091F, -1.5263F, 4.9767F, 1.6144F, 0.0F, 0.0F));

        PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(-3.0391F, -5.8458F, 0.3575F));

        PartDefinition cube_r7 = neck.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(74, 91).addBox(-3.08F, -6.0F, -2.92F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8903F, -7.0436F, -2.3097F, 0.9599F, 0.0F, 0.0F));

        PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(82, 78).addBox(-5.08F, -4.0F, -0.92F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0523F, 2.9669F, -4.6087F, -0.829F, 0.0F, 0.0F));

        PartDefinition cube_r9 = neck.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(58, 88).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1035F, 1.7231F, -3.5465F, 0.2618F, 0.0F, 0.0F));

        PartDefinition cube_r10 = neck.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9629F, -1.7806F, 1.4731F, 0.6109F, 0.0F, 0.0F));

        PartDefinition cube_r11 = neck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(20, 86).addBox(-4.0F, -8.0F, -1.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4302F, 0.1251F, -1.162F, 0.6109F, 0.0F, 0.0F));

        PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.1788F, -7.0257F, -5.3631F));

        PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 73).addBox(-3.08F, -4.0F, -1.92F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2646F, -3.0606F, -0.4004F, 2.2253F, 0.0F, 0.0F));

        PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(16, 98).addBox(-3.08F, -3.24F, -1.84F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7115F, 1.1334F, -1.8807F, 1.8326F, 0.0F, 0.0F));

        PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(70, 45).addBox(-3.08F, -3.24F, -1.84F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7115F, -0.6758F, -2.8675F, 2.2253F, 0.0F, 0.0F));

        PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(50, 41).addBox(-3.9595F, -1.919F, -2.081F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0709F, 1.7817F, -1.4229F, 0.3491F, 0.0F, 0.0F));

        PartDefinition muzzle = head.addOrReplaceChild("muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 1.9665F, -4.5587F));

        PartDefinition cube_r16 = muzzle.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(26, 0).addBox(-1.4469F, -1.7862F, -3.7184F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, -0.8045F, -0.0894F, 0.7418F, 0.0F, 0.0F));

        PartDefinition mouth = muzzle.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2682F, -0.0873F, 0.0F, 0.0F));

        PartDefinition cube_r17 = mouth.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(26, 6).addBox(-1.9832F, -0.6095F, -3.149F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1788F, 0.8045F, 0.4469F, 0.7854F, 0.0F, 0.0F));

        PartDefinition left_ear = head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(0.9832F, -3.1106F, -0.8939F));

        PartDefinition cube_r18 = left_ear.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(38, 0).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7151F, -0.3575F, -0.4469F, 0.5236F, 0.0F, 0.0F));

        PartDefinition cube_r19 = left_ear.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(24, 20).addBox(-1.0F, -2.0384F, -0.6584F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1788F, -0.5363F, 0.1788F, 0.5236F, 0.0F, 0.0F));

        PartDefinition right_ear = head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-1.6089F, -3.933F, -1.0726F));

        PartDefinition cube_r20 = right_ear.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 37).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3575F, 0.4648F, -0.2682F, 0.5236F, 0.0F, 0.0F));

        PartDefinition cube_r21 = right_ear.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(24, 24).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1788F, 1.448F, 0.2682F, 0.5236F, 0.0F, 0.0F));

        PartDefinition mane = head.addOrReplaceChild("mane", CubeListBuilder.create(), PartPose.offset(0.2682F, 4.9698F, 3.486F));

        PartDefinition top_mane = mane.addOrReplaceChild("top_mane", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition fringe = top_mane.addOrReplaceChild("fringe", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r22 = fringe.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(105, 76).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0894F, -8.2235F, -6.4358F, -1.5623F, 0.5344F, -1.5878F));

        PartDefinition top_mane_connector = top_mane.addOrReplaceChild("top_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r23 = top_mane_connector.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(109, 6).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3575F, -6.9721F, -2.0559F, -0.6109F, 0.0F, 0.0F));

        PartDefinition top_mane_connector2 = top_mane_connector.addOrReplaceChild("top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r24 = top_mane_connector2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(108, 19).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2346F, -6.9721F, -2.0559F, -0.6109F, 0.0F, 0.0F));

        PartDefinition top_mane_flow = top_mane_connector2.addOrReplaceChild("top_mane_flow", CubeListBuilder.create(), PartPose.offset(2.4134F, -7.7765F, 0.0F));

        PartDefinition cube_r25 = top_mane_flow.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(55, 105).addBox(-1.0F, -2.0F, -3.0F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2514F, 0.4469F, -1.8771F, -0.4206F, -0.2392F, -0.6967F));

        PartDefinition bottom_mane = top_mane.addOrReplaceChild("bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0615F, 1.7877F));

        PartDefinition bottom_mane_connector = bottom_mane.addOrReplaceChild("bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0615F, -1.7877F));

        PartDefinition cube_r26 = bottom_mane_connector.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(95, 103).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3575F, -6.7039F, -0.8939F, -0.9163F, 0.0F, 0.0F));

        PartDefinition bottom_mane_connector2 = bottom_mane_connector.addOrReplaceChild("bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r27 = bottom_mane_connector2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(95, 115).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.324F, -6.7039F, -0.8939F, -0.9163F, 0.0F, 0.0F));

        PartDefinition bottom_mane_flow = bottom_mane_connector2.addOrReplaceChild("bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0615F, 1.7877F));

        PartDefinition cube_r28 = bottom_mane_flow.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(69, 104).addBox(-1.0F, -2.0F, 1.0F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7542F, 0.1788F, -2.324F, -0.8478F, -0.3267F, -0.3389F));

        PartDefinition front_left_leg = chest.addOrReplaceChild("front_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 2.8067F, -0.0358F));

        PartDefinition top_front_left = front_left_leg.addOrReplaceChild("top_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1788F, -0.0894F));

        PartDefinition cube_r29 = top_front_left.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(77, 67).addBox(-1.08F, -2.0F, -1.84F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.477F, 5.1772F, 2.4241F, 1.4399F, 0.0F, 0.0F));

        PartDefinition cube_r30 = top_front_left.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(68, 33).addBox(-0.99F, -2.0F, -2.02F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0322F, 5.5812F, 1.9619F, 1.789F, 0.0F, 0.0F));

        PartDefinition knee_front_left = top_front_left.addOrReplaceChild("knee_front_left", CubeListBuilder.create().texOffs(54, 14).addBox(-0.9152F, -0.3778F, -0.3101F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.6145F, 0.3575F));

        PartDefinition bottom_front_left = knee_front_left.addOrReplaceChild("bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 1.7877F, 0.0F));

        PartDefinition cube_r31 = bottom_front_left.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(44, 28).addBox(-1.0F, -1.0838F, -4.9974F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.019F, 0.7508F, 1.5708F, 0.0F, 0.0F));

        PartDefinition bottom_2_front_left = bottom_front_left.addOrReplaceChild("bottom_2_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 3.3073F, 0.7151F));

        PartDefinition cube_r32 = bottom_2_front_left.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(61, 16).addBox(-1.0F, -1.736F, -3.0467F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2324F, 0.7508F, 1.1345F, 0.0F, 0.0F));

        PartDefinition hoof_front_left = bottom_2_front_left.addOrReplaceChild("hoof_front_left", CubeListBuilder.create().texOffs(14, 37).addBox(-0.9578F, 5.6514F, -2.4653F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.3073F, -0.7151F));

        PartDefinition front_right_leg = chest.addOrReplaceChild("front_right_leg", CubeListBuilder.create(), PartPose.offset(-5.7385F, 3.343F, 2.2883F));

        PartDefinition top_front_right = front_right_leg.addOrReplaceChild("top_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.1453F));

        PartDefinition cube_r33 = top_front_right.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(38, 88).addBox(-1.08F, -2.0F, -1.84F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5957F, 4.8197F, 2.156F, 1.4399F, 0.0F, 0.0F));

        PartDefinition cube_r34 = top_front_right.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(75, 45).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.3274F, 1.7341F, 1.789F, 0.0F, 0.0F));

        PartDefinition knee_front_right = top_front_right.addOrReplaceChild("knee_front_right", CubeListBuilder.create().texOffs(0, 24).addBox(-1.0152F, -1.1049F, -0.4313F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0615F, 0.3575F));

        PartDefinition bottom_front_right = knee_front_right.addOrReplaceChild("bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6615F, 0.0F));

        PartDefinition cube_r35 = bottom_front_right.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(97, 52).addBox(-1.01F, -0.8066F, -4.8066F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0252F, 0.8894F, 0.4551F, 1.5708F, 0.0F, 0.0F));

        PartDefinition bottom_2_front_right = bottom_front_right.addOrReplaceChild("bottom_2_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 6.2927F, 0.3575F));

        PartDefinition cube_r36 = bottom_2_front_right.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(89, 49).addBox(-1.0F, -1.0934F, -2.9443F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1084F, 0.4827F, 1.1345F, 0.0F, 0.0F));

        PartDefinition hoof_front_right = bottom_2_front_right.addOrReplaceChild("hoof_front_right", CubeListBuilder.create().texOffs(32, 54).addBox(-1.0152F, 0.0201F, -2.5556F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.9832F, -0.3575F));

        PartDefinition withers = torso.addOrReplaceChild("withers", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r37 = withers.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 37).addBox(-4.0792F, -6.9812F, -5.4648F, 4.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0091F, -27.3661F, -4.1867F, 1.2654F, 0.0F, 0.0F));

        PartDefinition cube_r38 = withers.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(26, 31).addBox(-5.08F, -6.88F, -5.52F, 6.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -26.737F, -4.194F, 1.2654F, 0.0F, 0.0F));

        PartDefinition hips = torso.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(31, 13).addBox(-7.0F, -26.8492F, 4.5419F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(45, 49).addBox(-8.0F, -25.8659F, 5.6145F, 10.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(74, 0).addBox(-4.08F, -4.24F, -7.36F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -26.3079F, 11.1482F, 1.3526F, 0.0F, 0.0F));

        PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(50, 28).addBox(-5.08F, -4.24F, -7.36F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -25.5035F, 11.0588F, 1.3526F, 0.0F, 0.0F));

        PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition tail_connector = tail.addOrReplaceChild("tail_connector", CubeListBuilder.create(), PartPose.offset(-3.0391F, -22.8827F, 10.7263F));

        PartDefinition cube_r41 = tail_connector.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(90, 21).addBox(-1.0F, -1.2817F, 0.7157F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2682F, -2.5922F, 0.0894F, -0.2182F, 0.0F, 0.0F));

        PartDefinition tail_top = tail_connector.addOrReplaceChild("tail_top", CubeListBuilder.create(), PartPose.offset(0.0F, -2.2346F, 3.3966F));

        PartDefinition cube_r42 = tail_top.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(90, 66).addBox(-1.2682F, -1.4208F, -0.28F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0894F, 0.0F, 0.1788F, -1.3963F, 0.0F, 0.0F));

        PartDefinition tail_middle = tail_top.addOrReplaceChild("tail_middle", CubeListBuilder.create(), PartPose.offset(-0.7151F, 4.9162F, 1.3408F));

        PartDefinition cube_r43 = tail_middle.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(84, 27).addBox(-2.0F, -3.1616F, 0.2892F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4469F, -0.4469F, -0.8939F, -1.6144F, 0.0F, 0.0F));

        PartDefinition tail_bottom = tail_middle.addOrReplaceChild("tail_bottom", CubeListBuilder.create(), PartPose.offset(3.7542F, 20.2011F, -15.4637F));

        PartDefinition cube_r44 = tail_bottom.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(51, 76).addBox(-1.6257F, -1.0471F, -0.6463F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6816F, -14.3017F, 15.5531F, -1.6144F, 0.0F, 0.0F));

        PartDefinition back_left_leg = hips.addOrReplaceChild("back_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, -19.3073F, 11.7989F));

        PartDefinition top_back_left = back_left_leg.addOrReplaceChild("top_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5363F, 0.2682F));

        PartDefinition cube_r45 = top_back_left.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(38, 76).addBox(-1.08F, -2.0F, -0.92F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1194F, 6.9828F, -0.3146F, 1.789F, 0.0F, 0.0F));

        PartDefinition cube_r46 = top_back_left.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 60).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0894F, 7.419F, -0.3575F, 1.9635F, 0.0F, 0.0F));

        PartDefinition knee_back_left = top_back_left.addOrReplaceChild("knee_back_left", CubeListBuilder.create().texOffs(0, 20).addBox(-0.9578F, -0.4939F, -2.0055F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.4916F, 0.2682F));

        PartDefinition bottom_back_left = knee_back_left.addOrReplaceChild("bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8939F, -0.2682F));

        PartDefinition cube_r47 = bottom_back_left.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 94).addBox(-1.0F, -1.1206F, -6.0169F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1788F, -0.7151F, 1.5708F, 0.0F, 0.0F));

        PartDefinition bottom_2_back_left = bottom_back_left.addOrReplaceChild("bottom_2_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 6.4358F, -1.0726F));

        PartDefinition cube_r48 = bottom_2_back_left.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(56, 60).addBox(-1.01F, -1.3183F, -2.8893F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0322F, -0.7678F, 0.5633F, 0.9599F, 0.0F, 0.0F));

        PartDefinition hoof_back_left = bottom_2_back_left.addOrReplaceChild("hoof_back_left", CubeListBuilder.create().texOffs(82, 38).addBox(-0.9578F, -3.0717F, -0.9154F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0223F, -2.5028F));

        PartDefinition back_right_leg = hips.addOrReplaceChild("back_right_leg", CubeListBuilder.create(), PartPose.offset(-5.9888F, -19.933F, 9.3855F));

        PartDefinition top_back_right = back_right_leg.addOrReplaceChild("top_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, -0.1788F, 2.5922F));

        PartDefinition cube_r49 = top_back_right.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(60, 76).addBox(-1.08F, -2.0F, -0.92F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3275F, 7.2509F, -0.3146F, 1.789F, 0.0F, 0.0F));

        PartDefinition cube_r50 = top_back_right.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(60, 3).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5363F, 7.6872F, -0.3575F, 1.9635F, 0.0F, 0.0F));

        PartDefinition knee_back_right = top_back_right.addOrReplaceChild("knee_back_right", CubeListBuilder.create().texOffs(61, 21).addBox(-1.0177F, -11.8458F, 1.4805F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.1117F, -3.486F));

        PartDefinition bottom_back_right = knee_back_right.addOrReplaceChild("bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, -10.8156F, 3.6648F));

        PartDefinition cube_r51 = bottom_back_right.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(90, 0).addBox(-1.0F, -1.1465F, -6.3845F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1788F, -0.8939F, 1.5708F, 0.0F, 0.0F));

        PartDefinition bottom_2_back_right = bottom_back_right.addOrReplaceChild("bottom_2_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 6.6145F, -1.162F));

        PartDefinition cube_r52 = bottom_2_back_right.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 60).addBox(-1.01F, -1.195F, -2.911F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0277F, -0.6775F, 0.4748F, 0.9599F, 0.0F, 0.0F));

        PartDefinition hoof_back_right = bottom_2_back_right.addOrReplaceChild("hoof_back_right", CubeListBuilder.create().texOffs(0, 65).addBox(-1.0177F, -2.9815F, -1.0057F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.2011F, -2.5028F));

        PartDefinition back = torso.addOrReplaceChild("back", CubeListBuilder.create().texOffs(0, 0).addBox(-6.7687F, -5.1285F, -4.5754F, 7.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -21.1844F, 0.0F));

        PartDefinition cube_r53 = back.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(70, 16).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -1.6125F, 2.3026F, 1.789F, 0.0F, 0.0F));

        PartDefinition cube_r54 = back.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(14, 54).addBox(-5.08F, -7.24F, -5.52F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -2.0594F, 2.3026F, 1.789F, 0.0F, 0.0F));

        PartDefinition cube_r55 = back.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(18, 70).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -5.878F, 4.4407F, 1.6581F, 0.0F, 0.0F));

        PartDefinition cube_r56 = back.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(38, 60).addBox(-5.08F, -7.24F, -5.52F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -5.1629F, 4.4407F, 1.6581F, 0.0F, 0.0F));

        return root;
    }
}
