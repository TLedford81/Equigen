package net.buckleystudios.equigen.entity.client.parts;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class ArabianModel {
    public static PartDefinition GeneratePartModel(PartDefinition root){
        PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(3.2179F, 25.162F, 3.4714F));

        PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition chest = torso.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 19).addBox(-6.6425F, -2.9497F, 20.6313F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(24, 0).addBox(-7.0168F, -2.3408F, 21.0782F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -20.2011F, -34.7709F));

        PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(77, 32).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -1.2228F, 26.4281F, 1.5708F, 0.0F, 0.0F));

        PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(52, 69).addBox(-5.0708F, -7.7168F, -4.5652F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9645F, -1.2761F, 27.384F, 1.5708F, 0.0F, 0.0F));

        PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(84, 14).addBox(-4.08F, -7.68F, -3.52F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -0.3754F, 26.4424F, 1.9199F, 0.0F, 0.0F));

        PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(72, 51).addBox(-5.08F, -7.68F, -4.52F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -0.9117F, 26.6569F, 1.9199F, 0.0F, 0.0F));

        PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(58, 56).addBox(-4.08F, -5.24F, -5.52F, 4.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, 0.0536F, 27.1231F, 1.6144F, 0.0F, 0.0F));

        PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(36, 56).addBox(-4.0892F, -4.2676F, -5.4648F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4561F, -0.1856F, 26.0717F, 1.6144F, 0.0F, 0.0F));

        PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(-3.0391F, -3.7899F, 21.5419F));

        PartDefinition cube_r7 = neck.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(30, 84).addBox(-3.1434F, -5.8622F, -2.7188F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0786F, -7.7839F, -0.3685F, 1.5708F, 0.0F, 0.0F));

        PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(36, 69).addBox(-4.08F, -11.0F, -0.92F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9629F, 5.9166F, -0.497F, 0.2618F, 0.0F, 0.0F));

        PartDefinition cube_r9 = neck.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(70, 74).addBox(-5.0784F, -9.0F, -0.9017F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1035F, 3.0639F, -0.8291F, 0.2618F, 0.0F, 0.0F));

        PartDefinition cube_r10 = neck.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 85).addBox(-4.08F, -10.0F, -0.92F, 4.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9629F, -1.2442F, 4.0653F, 0.7854F, 0.0F, 0.0F));

        PartDefinition cube_r11 = neck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(20, 62).addBox(-4.0F, -10.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6983F, 0.4827F, 2.0559F, 0.7854F, 0.0F, 0.0F));

        PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.1788F, -10.7799F, -27.7095F));

        PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(85, 0).addBox(-3.08F, -4.0F, -1.92F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8903F, 2.3026F, 21.9459F, 2.3998F, 0.0F, 0.0F));

        PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(55, 89).addBox(-3.0799F, -3.2418F, -1.8382F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3355F, 6.8808F, 20.7506F, 2.2689F, 0.0F, 0.0F));

        PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(86, 72).addBox(-3.08F, -3.24F, -1.84F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3372F, 5.4918F, 20.1046F, 2.8798F, 0.0F, 0.0F));

        PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(11, 87).addBox(-3.9554F, -0.7109F, -1.1891F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7232F, 6.313F, 20.7887F, 0.7854F, 0.0F, 0.0F));

        PartDefinition muzzle = head.addOrReplaceChild("muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 1.9665F, -4.5587F));

        PartDefinition cube_r16 = muzzle.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(56, 25).addBox(-1.4469F, -0.7862F, -2.7184F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2682F, 6.1676F, 23.7765F, 0.7418F, 0.0F, 0.0F));

        PartDefinition mouth = muzzle.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r17 = mouth.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(55, 37).addBox(-1.9832F, -0.6095F, -2.149F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2682F, 7.5978F, 24.4916F, 0.7854F, 0.0F, 0.0F));

        PartDefinition left_ear = head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9832F, 2.9676F, 22.1676F, 0.2182F, 0.0F, 0.0F));

        PartDefinition cube_r18 = left_ear.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7151F, -0.3575F, -0.4469F, 0.5236F, 0.0F, 0.0F));

        PartDefinition cube_r19 = left_ear.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(21, 19).addBox(-1.0F, -2.0384F, -0.6584F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1788F, -0.5363F, 0.1788F, 0.5236F, 0.0F, 0.0F));

        PartDefinition right_ear = head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-1.6089F, -2.9497F, 0.8045F));

        PartDefinition cube_r20 = right_ear.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(7, 0).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3575F, 5.6492F, 20.7374F, 0.7418F, 0.0F, 0.0F));

        PartDefinition cube_r21 = right_ear.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1788F, 6.6324F, 21.8101F, 0.7854F, 0.0F, 0.0F));

        PartDefinition mane = neck.addOrReplaceChild("mane", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition top_mane = mane.addOrReplaceChild("top_mane", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition fringe = top_mane.addOrReplaceChild("fringe", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r22 = fringe.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(83, 89).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2682F, -8.0447F, -8.3128F, -1.5612F, 0.7089F, -1.5859F));

        PartDefinition top_mane_connector = top_mane.addOrReplaceChild("top_mane_connector", CubeListBuilder.create().texOffs(69, 27).addBox(-1.1061F, -9.9553F, -6.8436F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bottom_mane = top_mane.addOrReplaceChild("bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0615F, 1.7877F));

        PartDefinition bottom_mane_connector = bottom_mane.addOrReplaceChild("bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0615F, -1.7877F));

        PartDefinition cube_r23 = bottom_mane_connector.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(45, 1).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -6.4358F, -1.0726F, -0.7854F, 0.0F, 0.0F));

        PartDefinition bottom_mane_flow = bottom_mane.addOrReplaceChild("bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r24 = bottom_mane_flow.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(17, 22).addBox(-1.0F, -2.0F, -3.0F, 1.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1453F, 0.1788F, -2.8603F, -0.7617F, -0.2143F, -0.2194F));

        PartDefinition top_mane_flow = top_mane.addOrReplaceChild("top_mane_flow", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r25 = top_mane_flow.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -3.0F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1453F, -8.6704F, -3.8436F, -0.0135F, -0.0136F, -0.4802F));

        PartDefinition front_left_leg = chest.addOrReplaceChild("front_left_leg", CubeListBuilder.create(), PartPose.offset(-0.8939F, 2.8067F, 22.5788F));

        PartDefinition top_front_left = front_left_leg.addOrReplaceChild("top_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1788F, -0.0894F));

        PartDefinition cube_r26 = top_front_left.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(79, 80).addBox(-1.08F, -2.0F, -1.84F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.477F, 5.1772F, 2.2454F, 1.4399F, 0.0F, 0.0F));

        PartDefinition cube_r27 = top_front_left.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(72, 17).addBox(-0.99F, -2.0F, -2.02F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0322F, 5.5812F, 1.5149F, 1.789F, 0.0F, 0.0F));

        PartDefinition knee_front_left = top_front_left.addOrReplaceChild("knee_front_left", CubeListBuilder.create().texOffs(77, 27).addBox(-0.9152F, -0.3778F, -0.5782F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.6145F, 0.3575F));

        PartDefinition bottom_front_left = knee_front_left.addOrReplaceChild("bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 1.7877F, 0.0F));

        PartDefinition cube_r28 = bottom_front_left.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(20, 40).addBox(-1.0F, -0.0838F, -4.9974F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.019F, 0.1251F, 1.5708F, 0.0F, 0.0F));

        PartDefinition bottom_2_front_left = bottom_front_left.addOrReplaceChild("bottom_2_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 3.3073F, 0.7151F));

        PartDefinition cube_r29 = bottom_2_front_left.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(36, 46).addBox(-1.0F, -0.736F, -3.0467F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2324F, 0.1251F, 1.1345F, 0.0F, 0.0F));

        PartDefinition hoof_front_left = bottom_2_front_left.addOrReplaceChild("hoof_front_left", CubeListBuilder.create().texOffs(85, 28).addBox(-0.9578F, 0.1095F, -1.4653F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.2346F, -0.7151F));

        PartDefinition front_right_leg = chest.addOrReplaceChild("front_right_leg", CubeListBuilder.create(), PartPose.offset(-5.7385F, 3.343F, 23.2939F));

        PartDefinition top_front_right = front_right_leg.addOrReplaceChild("top_front_right", CubeListBuilder.create(), PartPose.offset(0.5363F, 0.0F, -0.6257F));

        PartDefinition cube_r30 = top_front_right.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(45, 78).addBox(-1.08F, -2.0F, -1.84F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7744F, 4.8197F, 1.7984F, 1.4399F, 0.0F, 0.0F));

        PartDefinition cube_r31 = top_front_right.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(56, 80).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.3274F, 1.3765F, 1.789F, 0.0F, 0.0F));

        PartDefinition knee_front_right = top_front_right.addOrReplaceChild("knee_front_right", CubeListBuilder.create().texOffs(48, 69).addBox(-1.0152F, -1.1049F, -0.8782F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0615F, 0.3575F));

        PartDefinition bottom_front_right = knee_front_right.addOrReplaceChild("bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8581F, 0.0F));

        PartDefinition cube_r32 = bottom_front_right.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(87, 22).addBox(-1.0F, 0.2054F, -4.8551F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7151F, -0.5006F, 1.5708F, 0.0F, 0.0F));

        PartDefinition bottom_2_front_right = bottom_front_right.addOrReplaceChild("bottom_2_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 3.6112F, 0.6257F));

        PartDefinition cube_r33 = bottom_2_front_right.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(46, 14).addBox(-1.0F, -0.0934F, -2.9443F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0536F, -0.7687F, 1.1345F, 0.0F, 0.0F));

        PartDefinition hoof_front_right = bottom_2_front_right.addOrReplaceChild("hoof_front_right", CubeListBuilder.create().texOffs(85, 7).addBox(-1.0152F, 0.0201F, -1.5556F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.1453F, -0.6257F));

        PartDefinition withers = torso.addOrReplaceChild("withers", CubeListBuilder.create(), PartPose.offset(-2.5922F, -26.3687F, -6.1676F));

        PartDefinition cube_r34 = withers.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 34).addBox(-4.08F, -6.88F, -5.52F, 4.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6054F, 2.1166F, -0.261F, 1.1345F, 0.0F, 0.0F));

        PartDefinition cube_r35 = withers.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(30, 13).addBox(-5.08F, -6.88F, -5.52F, 5.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1417F, 2.8496F, -1.2442F, 1.1345F, 0.0F, 0.0F));

        PartDefinition hips = torso.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(35, 34).addBox(-4.2291F, 0.8939F, -6.4358F, 7.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(42, 46).addBox(-4.6927F, 1.3966F, -5.9162F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.324F, -23.5978F, 7.1508F));

        PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(16, 78).addBox(-4.08F, -5.24F, -4.36F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3372F, 2.1166F, 1.137F, 1.1781F, 0.0F, 0.0F));

        PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(56, 14).addBox(-5.08F, -4.24F, -5.36F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3372F, 2.653F, 0.1537F, 1.1781F, 0.0F, 0.0F));

        PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(-1.4302F, 2.7709F, -1.0726F));

        PartDefinition tail_connector = tail.addOrReplaceChild("tail_connector", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0894F, -1.3408F, 0.8045F, 0.7854F, 0.0F, 0.0F));

        PartDefinition cube_r38 = tail_connector.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(53, 15).addBox(-1.0F, -1.2817F, 0.7157F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, 0.7151F, -0.6257F, -0.2182F, 0.0F, 0.0F));

        PartDefinition tail_top = tail_connector.addOrReplaceChild("tail_top", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0726F, 2.6816F, -0.5236F, 0.0F, 0.0F));

        PartDefinition cube_r39 = tail_top.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(82, 59).addBox(-1.2682F, -1.4208F, -0.28F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0894F, 0.0F, 0.1788F, -1.3963F, 0.0F, 0.0F));

        PartDefinition tail_middle = tail_top.addOrReplaceChild("tail_middle", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7151F, 4.9162F, 1.3408F, -0.2182F, 0.0F, 0.0F));

        PartDefinition cube_r40 = tail_middle.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(59, 0).addBox(-2.0F, -3.1616F, 0.2892F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4469F, -0.4469F, -0.8939F, -1.6144F, 0.0F, 0.0F));

        PartDefinition tail_bottom = tail_middle.addOrReplaceChild("tail_bottom", CubeListBuilder.create(), PartPose.offset(0.8939F, 5.8994F, 0.5363F));

        PartDefinition cube_r41 = tail_bottom.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(81, 41).addBox(-1.6257F, -1.0393F, -0.8249F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1788F, 0.1788F, -0.4469F, -1.6144F, 0.0F, 0.0F));

        PartDefinition back_left_leg = hips.addOrReplaceChild("back_left_leg", CubeListBuilder.create(), PartPose.offset(1.6983F, 4.2905F, -0.4469F));

        PartDefinition top_back_left = back_left_leg.addOrReplaceChild("top_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5363F, 0.2682F));

        PartDefinition cube_r42 = top_back_left.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(70, 61).addBox(-1.08F, -2.0F, -1.92F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1194F, 6.9828F, -0.2253F, 1.789F, 0.0F, 0.0F));

        PartDefinition cube_r43 = top_back_left.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(57, 25).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0894F, 7.419F, -0.5363F, 2.0071F, 0.0F, 0.0F));

        PartDefinition knee_back_left = top_back_left.addOrReplaceChild("knee_back_left", CubeListBuilder.create().texOffs(12, 70).addBox(-0.9578F, 0.3106F, -2.2737F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.4916F, 0.2682F));

        PartDefinition bottom_back_left = knee_back_left.addOrReplaceChild("bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8939F, -0.2682F));

        PartDefinition cube_r44 = bottom_back_left.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(41, 87).addBox(-1.0F, -1.1206F, -6.0169F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3575F, -0.3575F, 1.5708F, 0.0F, 0.0F));

        PartDefinition bottom_2_back_left = bottom_back_left.addOrReplaceChild("bottom_2_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 6.4358F, -1.0726F));

        PartDefinition cube_r45 = bottom_2_back_left.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(46, 0).addBox(-1.0F, -1.3114F, -2.9185F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5363F, 0.8045F, 0.9599F, 0.0F, 0.0F));

        PartDefinition hoof_back_left = bottom_2_back_left.addOrReplaceChild("hoof_back_left", CubeListBuilder.create().texOffs(75, 0).addBox(-0.9578F, -0.3902F, -1.2562F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.3408F, -1.162F));

        PartDefinition back_right_leg = hips.addOrReplaceChild("back_right_leg", CubeListBuilder.create(), PartPose.offset(-3.6648F, 3.6648F, 4.2905F));

        PartDefinition top_back_right = back_right_leg.addOrReplaceChild("top_back_right", CubeListBuilder.create(), PartPose.offset(0.6257F, -0.1788F, -4.648F));

        PartDefinition cube_r46 = top_back_right.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(74, 4).addBox(-1.08F, -2.0F, -0.92F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3275F, 8.2342F, 0.1323F, 1.789F, 0.0F, 0.0F));

        PartDefinition cube_r47 = top_back_right.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(42, 21).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1788F, 8.9385F, 0.2682F, 2.0071F, 0.0F, 0.0F));

        PartDefinition knee_back_right = top_back_right.addOrReplaceChild("knee_back_right", CubeListBuilder.create().texOffs(88, 50).addBox(-1.0177F, -0.2257F, -1.2905F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.6536F, -0.1788F));

        PartDefinition bottom_back_right = knee_back_right.addOrReplaceChild("bottom_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.3575F));

        PartDefinition cube_r48 = bottom_back_right.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(69, 87).addBox(-1.0F, -0.1465F, -6.3845F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8939F, -0.8939F, 1.5272F, 0.0F, 0.0F));

        PartDefinition bottom_2_back_right = bottom_back_right.addOrReplaceChild("bottom_2_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 5.5419F, -1.162F));

        PartDefinition cube_r49 = bottom_2_back_right.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(52, 56).addBox(-1.0F, -0.1869F, -2.9404F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7151F, 0.2682F, 0.9599F, 0.0F, 0.0F));

        PartDefinition hoof_back_right = bottom_2_back_right.addOrReplaceChild("hoof_back_right", CubeListBuilder.create().texOffs(68, 51).addBox(-1.0177F, -0.0317F, -0.8995F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.2514F, -1.162F));

        PartDefinition back = torso.addOrReplaceChild("back", CubeListBuilder.create().texOffs(0, 0).addBox(-3.3372F, -5.7065F, -4.7464F, 6.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.6816F, -17.3408F, -3.1285F));

        PartDefinition cube_r50 = back.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 70).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6947F, -4.0974F, 3.6434F, 1.7453F, 0.0F, 0.0F));

        PartDefinition cube_r51 = back.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(63, 37).addBox(-5.0984F, -7.2952F, -5.4096F, 5.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1864F, -4.2475F, 3.5011F, 1.7453F, 0.0F, 0.0F));

        PartDefinition cube_r52 = back.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 54).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6947F, -5.878F, 4.4407F, 1.6581F, 0.0F, 0.0F));

        PartDefinition cube_r53 = back.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(20, 46).addBox(-5.08F, -7.24F, -5.52F, 5.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7841F, -5.1629F, 4.4407F, 1.6581F, 0.0F, 0.0F));

        return root;
    }
}
