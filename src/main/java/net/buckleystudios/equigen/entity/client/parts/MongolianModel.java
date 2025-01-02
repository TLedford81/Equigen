package net.buckleystudios.equigen.entity.client.parts;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class MongolianModel {
    public static PartDefinition GeneratePartModel(PartDefinition root){

        PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(3.2179F, 24.0F, 3.4714F));

        PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition chest = torso.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 17).addBox(-7.0F, -3.6112F, -6.4704F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(25, 0).addBox(-7.4637F, -3.0559F, -5.4335F, 9.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -14.838F, -4.0223F));

        PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(78, 37).addBox(-4.08F, -7.68F, -3.52F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -2.5636F, -0.2624F, 1.5708F, 0.0F, 0.0F));

        PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(35, 64).addBox(-5.08F, -7.68F, -4.52F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -1.9379F, 0.6314F, 1.5708F, 0.0F, 0.0F));

        PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(76, 9).addBox(-4.08F, -7.68F, -3.52F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -1.895F, -1.3744F, 1.9199F, 0.0F, 0.0F));

        PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(66, 0).addBox(-5.08F, -7.68F, -4.52F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -2.5207F, -0.9632F, 1.9199F, 0.0F, 0.0F));

        PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(40, 52).addBox(-4.08F, -4.24F, -5.52F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -0.2145F, -1.2657F, 1.6144F, 0.0F, 0.0F));

        PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(22, 37).addBox(-5.08F, -5.24F, -5.52F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -0.8402F, -1.0869F, 1.6144F, 0.0F, 0.0F));

        PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(-3.3966F, -2.5922F, -6.1676F));

        PartDefinition cube_r7 = neck.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(80, 54).addBox(-3.08F, -5.0F, -3.92F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8009F, -4.3084F, -2.3097F, 1.6144F, 0.0F, 0.0F));

        PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 57).addBox(-5.0708F, -11.03F, -0.9292F, 6.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4321F, 6.3973F, 2.5004F, 0.8727F, 0.0F, 0.0F));

        PartDefinition cube_r9 = neck.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(81, 80).addBox(-5.0784F, -5.0F, -0.9017F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.461F, 2.9387F, -1.9375F, 0.9599F, 0.0F, 0.0F));

        PartDefinition cube_r10 = neck.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(14, 85).addBox(-4.08F, -5.0F, -0.92F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3204F, -2.3169F, 1.4731F, 1.1345F, 0.0F, 0.0F));

        PartDefinition cube_r11 = neck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(57, 67).addBox(-4.0F, -7.0F, -1.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7877F, 0.8939F, 2.1453F, 1.1345F, 0.0F, 0.0F));

        PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.3575F, -3.1285F, -6.3464F));

        PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(72, 19).addBox(-4.0984F, -4.0F, -2.8616F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4839F, -1.2885F, -0.2402F, 2.2253F, 0.0F, 0.0F));

        PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(40, 73).addBox(-3.0892F, -3.2876F, -1.8216F, 4.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9681F, 2.5665F, -1.4657F, 2.3562F, 0.0F, 0.0F));

        PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 85).addBox(-3.08F, -2.24F, -1.84F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9797F, 2.4527F, -3.7613F, 2.618F, 0.0F, 0.0F));

        PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(74, 68).addBox(-3.9595F, -0.919F, -3.081F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3391F, 1.603F, -0.976F, 0.7854F, 0.0F, 0.0F));

        PartDefinition muzzle = head.addOrReplaceChild("muzzle", CubeListBuilder.create(), PartPose.offset(-0.1788F, 4.0223F, -2.5922F));

        PartDefinition cube_r16 = muzzle.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(86, 17).addBox(-1.0F, -3.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, 1.6089F, -0.8045F, 0.9599F, 0.0F, 0.0F));

        PartDefinition mouth = muzzle.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8045F, 0.6257F));

        PartDefinition cube_r17 = mouth.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(48, 0).addBox(-1.5363F, -0.7513F, -2.9601F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0894F, 0.1788F, -0.2682F, 1.0036F, 0.0F, 0.0F));

        PartDefinition left_ear = head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(1.3408F, -3.1285F, -0.3575F));

        PartDefinition cube_r18 = left_ear.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(25, 0).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, 1.0905F, -0.3575F, 0.5236F, 0.0F, 0.0F));

        PartDefinition cube_r19 = left_ear.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0737F, 0.1788F, 0.5236F, 0.0F, 0.0F));

        PartDefinition right_ear = head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-1.5196F, -3.0391F, -0.5363F));

        PartDefinition cube_r20 = right_ear.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(7, 6).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4469F, 1.0011F, -0.1788F, 0.5236F, 0.0F, 0.0F));

        PartDefinition cube_r21 = right_ear.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(23, 17).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0894F, 2.2525F, 0.3575F, 0.5236F, 0.0F, 0.0F));

        PartDefinition mane = head.addOrReplaceChild("mane", CubeListBuilder.create(), PartPose.offset(0.0F, -3.2536F, 2.9497F));

        PartDefinition top_mane = mane.addOrReplaceChild("top_mane", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition fringe = top_mane.addOrReplaceChild("fringe", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r22 = fringe.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.0F, -2.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3575F, 1.7877F, -5.5419F, -1.5612F, 0.7089F, -1.5859F));

        PartDefinition top_mane_connector = top_mane.addOrReplaceChild("top_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r23 = top_mane_connector.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(68, 83).addBox(-1.01F, -2.0F, -2.97F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0903F, 1.8871F, -1.2262F, 0.0436F, 0.0F, 0.0F));

        PartDefinition top_mane_connector2 = top_mane_connector.addOrReplaceChild("top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r24 = top_mane_connector2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(80, 27).addBox(-1.0F, -2.0F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8771F, 0.8045F, -1.3408F, 0.0436F, 0.0F, 0.0F));

        PartDefinition top_mane_flow = top_mane_connector2.addOrReplaceChild("top_mane_flow", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r25 = top_mane_flow.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(32, 80).addBox(-1.0F, -2.0F, -3.0F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3966F, 0.4469F, -1.7877F, 0.0229F, -0.0342F, -0.389F));

        PartDefinition bottom_mane = top_mane.addOrReplaceChild("bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0615F, 1.7877F));

        PartDefinition bottom_mane_connector = bottom_mane.addOrReplaceChild("bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0615F, -1.7877F));

        PartDefinition cube_r26 = bottom_mane_connector.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 68).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0894F, 2.7134F, 3.3966F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bottom_mane_connector2 = bottom_mane_connector.addOrReplaceChild("bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r27 = bottom_mane_connector2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(11, 75).addBox(-1.0F, -2.0F, -3.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8771F, 1.9665F, 2.2346F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bottom_mane_flow = bottom_mane_connector2.addOrReplaceChild("bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0615F, 1.7877F));

        PartDefinition cube_r28 = bottom_mane_flow.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(13, 61).addBox(-1.0F, -2.0F, 1.0F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.486F, 6.257F, -3.1285F, -0.4033F, -0.1887F, -0.4842F));

        PartDefinition front_left_leg = chest.addOrReplaceChild("front_left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 3.5218F, -3.933F));

        PartDefinition top_front_left = front_left_leg.addOrReplaceChild("top_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, -0.1788F, -0.2682F));

        PartDefinition cube_r29 = top_front_left.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(21, 77).addBox(-1.08F, -2.0F, -0.84F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.477F, 4.3727F, 1.2621F, 1.4399F, 0.0F, 0.0F));

        PartDefinition cube_r30 = top_front_left.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(48, 79).addBox(-1.01F, -2.0F, -1.98F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0322F, 3.2653F, 0.7555F, 1.789F, 0.0F, 0.0F));

        PartDefinition knee_front_left = top_front_left.addOrReplaceChild("knee_front_left", CubeListBuilder.create().texOffs(10, 77).addBox(-0.9578F, -0.658F, -1.1464F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.4693F, 0.4469F));

        PartDefinition bottom_front_left = knee_front_left.addOrReplaceChild("bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 1.6089F, -0.1788F));

        PartDefinition cube_r31 = bottom_front_left.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(57, 1).addBox(-0.364F, -0.4691F, -2.334F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1207F, -0.1582F, 0.0802F, 1.5708F, 0.0F, 0.0F));

        PartDefinition bottom_2_front_left = bottom_front_left.addOrReplaceChild("bottom_2_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 2.324F, 0.4469F));

        PartDefinition cube_r32 = bottom_2_front_left.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(86, 33).addBox(-0.3575F, -0.7179F, -2.94F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0894F, -0.3933F, 0.0358F, 1.0036F, 0.0F, 0.0F));

        PartDefinition hoof_front_left = bottom_2_front_left.addOrReplaceChild("hoof_front_left", CubeListBuilder.create().texOffs(82, 63).addBox(-1.0F, -0.248F, -1.4838F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.3408F, -1.0726F));

        PartDefinition front_right_leg = chest.addOrReplaceChild("front_right_leg", CubeListBuilder.create(), PartPose.offset(-6.1855F, 3.2536F, -4.1475F));

        PartDefinition top_front_right = front_right_leg.addOrReplaceChild("top_front_right", CubeListBuilder.create(), PartPose.offset(0.8939F, 0.0894F, 0.0F));

        PartDefinition cube_r33 = top_front_right.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(69, 76).addBox(-1.0F, -1.6884F, -4.7242F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6078F, 0.5899F, -0.2324F, 1.789F, 0.0F, 0.0F));

        PartDefinition cube_r34 = top_front_right.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 77).addBox(-1.08F, -2.0F, -0.84F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0122F, 4.3727F, 1.2085F, 1.4399F, 0.0F, 0.0F));

        PartDefinition knee_front_right = top_front_right.addOrReplaceChild("knee_front_right", CubeListBuilder.create().texOffs(66, 19).addBox(-1.0293F, -0.658F, -1.0212F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.6257F, 4.4693F, 0.2682F));

        PartDefinition bottom_front_right = knee_front_right.addOrReplaceChild("bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.2682F, 1.162F, 0.0F));

        PartDefinition cube_r35 = bottom_front_right.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(54, 52).addBox(-0.5575F, -0.4691F, -2.157F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2235F, 0.4657F, 0.0266F, 1.5708F, 0.0F, 0.0F));

        PartDefinition bottom_2_front_right = bottom_front_right.addOrReplaceChild("bottom_2_front_right", CubeListBuilder.create(), PartPose.offset(-0.1788F, 2.5922F, 0.0F));

        PartDefinition cube_r36 = bottom_2_front_right.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(83, 0).addBox(-0.3743F, -0.5672F, -2.8439F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2503F, -0.2145F, 0.2503F, 1.0036F, 0.0F, 0.0F));

        PartDefinition hoof_front_right = bottom_2_front_right.addOrReplaceChild("hoof_front_right", CubeListBuilder.create().texOffs(79, 76).addBox(-1.4291F, -0.248F, -1.448F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.2682F, 1.5196F, -0.8045F));

        PartDefinition withers = torso.addOrReplaceChild("withers", CubeListBuilder.create(), PartPose.offset(0.0F, -18.324F, -7.0615F));

        PartDefinition cube_r37 = withers.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(60, 52).addBox(-4.08F, -0.88F, -3.52F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -1.8878F, -0.5292F, 1.2654F, 0.0F, 0.0F));

        PartDefinition cube_r38 = withers.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(46, 37).addBox(-5.08F, -0.88F, -3.52F, 6.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -1.6197F, -1.6912F, 1.2654F, 0.0F, 0.0F));

        PartDefinition hips = torso.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(24, 25).addBox(-5.7486F, -3.2179F, 1.5028F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(0, 32).addBox(-6.3017F, -2.7877F, 1.9497F, 9.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.2514F, -16.0F, 0.0F));

        PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(66, 27).addBox(-4.08F, -4.24F, -5.36F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2646F, -2.7996F, 9.2711F, 1.3526F, 0.0F, 0.0F));

        PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(48, 5).addBox(-5.08F, -4.24F, -5.36F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2646F, -2.1739F, 8.556F, 1.3526F, 0.0F, 0.0F));

        PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(-1.9665F, -3.8436F, 9.0279F));

        PartDefinition tail_connector = tail.addOrReplaceChild("tail_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.9832F, -0.5363F));

        PartDefinition cube_r41 = tail_connector.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(66, 41).addBox(-0.5531F, 0.0071F, -0.555F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8939F, 0.7151F, -0.2182F, 0.0F, 0.0F));

        PartDefinition tail_top = tail_connector.addOrReplaceChild("tail_top", CubeListBuilder.create(), PartPose.offset(0.4469F, -0.7151F, 2.7709F));

        PartDefinition cube_r42 = tail_top.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(58, 81).addBox(-1.0F, -1.0785F, 0.1082F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, 0.8939F, -0.8045F, -1.3963F, 0.0F, 0.0F));

        PartDefinition tail_middle = tail_top.addOrReplaceChild("tail_middle", CubeListBuilder.create(), PartPose.offset(-0.3575F, 6.0961F, 0.2682F));

        PartDefinition cube_r43 = tail_middle.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(72, 47).addBox(-1.0F, -0.9635F, -0.1495F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6257F, -0.0179F, 0.6257F, -1.6144F, 0.0F, 0.0F));

        PartDefinition tail_bottom = tail_middle.addOrReplaceChild("tail_bottom", CubeListBuilder.create(), PartPose.offset(0.0894F, 5.6134F, 0.0F));

        PartDefinition cube_r44 = tail_bottom.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(84, 45).addBox(-1.0F, -0.8391F, -0.9493F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2682F, 0.5363F, 0.0894F, -1.6144F, 0.0F, 0.0F));

        PartDefinition back_left_leg = hips.addOrReplaceChild("back_left_leg", CubeListBuilder.create(), PartPose.offset(1.8771F, 2.9497F, 5.9888F));

        PartDefinition top_back_left = back_left_leg.addOrReplaceChild("top_back_left", CubeListBuilder.create(), PartPose.offset(-0.6257F, -0.0894F, 0.5363F));

        PartDefinition cube_r45 = top_back_left.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(66, 37).addBox(-1.08F, -2.0F, 0.08F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0594F, 6.2677F, 1.92F, 1.7017F, 0.0F, 0.0F));

        PartDefinition cube_r46 = top_back_left.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(71, 60).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0894F, 4.648F, 1.5374F, 1.9635F, 0.0F, 0.0F));

        PartDefinition knee_back_left = top_back_left.addOrReplaceChild("knee_back_left", CubeListBuilder.create().texOffs(62, 37).addBox(-0.9578F, -0.8693F, -0.8257F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.257F, 0.8045F));

        PartDefinition bottom_back_left = knee_back_left.addOrReplaceChild("bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5196F, 0.1788F));

        PartDefinition cube_r47 = bottom_back_left.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(52, 33).addBox(-0.5363F, -0.5864F, -2.6382F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0894F, -0.3575F, 0.1788F, 1.5272F, 0.0F, 0.0F));

        PartDefinition bottom_2_back_left = bottom_back_left.addOrReplaceChild("bottom_2_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 2.1453F, -0.0894F));

        PartDefinition cube_r48 = bottom_2_back_left.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(40, 37).addBox(-0.5409F, -0.5688F, -3.0197F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0563F, -0.3218F, 0.2451F, 0.9599F, 0.0F, 0.0F));

        PartDefinition hoof_back_left = bottom_2_back_left.addOrReplaceChild("hoof_back_left", CubeListBuilder.create().texOffs(66, 47).addBox(-1.0F, -0.1229F, -1.3408F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.3408F, -0.8939F));

        PartDefinition back_right_leg = hips.addOrReplaceChild("back_right_leg", CubeListBuilder.create(), PartPose.offset(-5.3631F, 2.8425F, 5.8994F));

        PartDefinition top_back_right = back_right_leg.addOrReplaceChild("top_back_right", CubeListBuilder.create(), PartPose.offset(-0.0894F, 0.0F, 0.6257F));

        PartDefinition cube_r49 = top_back_right.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(22, 68).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1788F, 4.6659F, 1.7162F, 1.9635F, 0.0F, 0.0F));

        PartDefinition cube_r50 = top_back_right.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(64, 9).addBox(-1.08F, -2.0F, 0.08F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2381F, 6.2856F, 2.2775F, 1.7017F, 0.0F, 0.0F));

        PartDefinition knee_back_right = top_back_right.addOrReplaceChild("knee_back_right", CubeListBuilder.create().texOffs(62, 0).addBox(-1.0472F, -0.7799F, -1.0044F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1788F, 6.1855F, 1.0726F));

        PartDefinition bottom_back_right = knee_back_right.addOrReplaceChild("bottom_back_right", CubeListBuilder.create(), PartPose.offset(-0.1788F, 1.2514F, 0.0894F));

        PartDefinition cube_r51 = bottom_back_right.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(35, 51).addBox(-0.5363F, -0.5864F, -2.6382F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0894F, 0.0F, 0.1788F, 1.5272F, 0.0F, 0.0F));

        PartDefinition bottom_2_back_right = bottom_back_right.addOrReplaceChild("bottom_2_back_right", CubeListBuilder.create(), PartPose.offset(0.1788F, 2.4134F, -0.0894F));

        PartDefinition cube_r52 = bottom_2_back_right.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 7).addBox(-0.4525F, -0.4529F, -2.7224F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1439F, -0.0554F, -0.0222F, 0.9599F, 0.0F, 0.0F));

        PartDefinition hoof_back_right = bottom_2_back_right.addOrReplaceChild("hoof_back_right", CubeListBuilder.create().texOffs(52, 64).addBox(-1.0894F, -0.1229F, -0.8045F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.4302F, -1.4302F));

        PartDefinition back = torso.addOrReplaceChild("back", CubeListBuilder.create().texOffs(0, 0).addBox(-6.7687F, -18.3587F, -6.7207F, 7.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r53 = back.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(22, 51).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -16.5399F, 2.3026F, 1.789F, 0.0F, 0.0F));

        PartDefinition cube_r54 = back.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 42).addBox(-5.0892F, -6.2676F, -5.4648F, 6.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0091F, -16.9063F, 2.6024F, 1.789F, 0.0F, 0.0F));

        PartDefinition cube_r55 = back.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(52, 19).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -19.554F, 4.4407F, 1.6581F, 0.0F, 0.0F));

        PartDefinition cube_r56 = back.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(30, 11).addBox(-5.08F, -7.24F, -5.52F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -18.8389F, 4.4407F, 1.6581F, 0.0F, 0.0F));

        return root;
    }
}
