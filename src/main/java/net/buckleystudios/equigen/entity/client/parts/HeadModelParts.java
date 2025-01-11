package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class HeadModelParts {
    public static PartDefinition[] Generate(PartDefinition headRoot, PartDefinition muzzleRoot, PartDefinition fringeRoot, String type, String muscleMass) {
        /* Straight Head */
        if (type.equals("straight") && muscleMass.equals("lean")) {

            PartDefinition head_straight_lean = headRoot.addOrReplaceChild("head_straight_lean", CubeListBuilder.create(), PartPose.offset(-0.0158F, 0.3575F, -0.1458F));

            PartDefinition cube_r1 = head_straight_lean.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(662, 131).addBox(-2.08F, -4.0F, -1.92F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2717F, -3.0606F, -0.4004F, 2.2253F, 0.0F, 0.0F));

            PartDefinition cube_r2 = head_straight_lean.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(662, 122).addBox(-3.0708F, -3.2124F, -1.8584F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1725F, 1.0938F, -1.8607F, 1.8326F, 0.0F, 0.0F));

            PartDefinition cube_r3 = head_straight_lean.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(647, 131).addBox(-3.08F, -3.24F, -1.84F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2478F, -0.6758F, -2.8675F, 2.2253F, 0.0F, 0.0F));

            PartDefinition cube_r4 = head_straight_lean.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(646, 124).addBox(-2.9595F, -1.919F, -2.081F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.624F, 1.7817F, -1.4229F, 0.3491F, 0.0F, 0.0F));

            PartDefinition fringe = fringeRoot.addOrReplaceChild("fringe", CubeListBuilder.create(), PartPose.offset(0.2524F, -3.2536F, -1.2184F));

            PartDefinition fringe_straight_lean = fringe.addOrReplaceChild("fringe_straight_lean", CubeListBuilder.create(), PartPose.offset(0.0F, 8.581F, 4.5587F));

            PartDefinition cube_r5 = fringe_straight_lean.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(656, 138).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0894F, -8.2235F, -6.4358F, -1.5333F, 0.6643F, -1.5315F));

            PartDefinition muzzle = muzzleRoot.addOrReplaceChild("muzzle", CubeListBuilder.create(), PartPose.offset(-0.0158F, 2.324F, -4.7045F));

            PartDefinition muzzle_straight_lean = muzzle.addOrReplaceChild("muzzle_straight_lean", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r6 = muzzle_straight_lean.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(666, 138).addBox(-1.4469F, -1.7862F, -3.7184F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3575F, -0.8045F, 0.1788F, 0.7418F, 0.0F, 0.0F));

            PartDefinition mouth = muzzle.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0726F, 0.1788F, -0.0873F, 0.0F, 0.0F));

            PartDefinition mouth_straight_lean = mouth.addOrReplaceChild("mouth_straight_lean", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0763F, -0.0044F));

            PartDefinition cube_r7 = mouth_straight_lean.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(664, 118).addBox(-1.9934F, -0.6134F, -3.1175F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1771F, 0.6847F, 0.5763F, 0.7854F, 0.0F, 0.0F));

        } else if (type.equals("straight") && muscleMass.equals("average")) {

            PartDefinition head_straight_average = headRoot.addOrReplaceChild("head_straight_average", CubeListBuilder.create(), PartPose.offset(-0.0158F, 0.3575F, -0.1458F));

            PartDefinition cube_r1 = head_straight_average.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(661, 160).addBox(-3.08F, -4.0F, -1.92F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2646F, -3.0606F, -0.4004F, 2.2253F, 0.0F, 0.0F));

            PartDefinition cube_r2 = head_straight_average.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(663, 151).addBox(-3.0708F, -3.2124F, -1.8584F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7256F, 1.0938F, -1.8607F, 1.8326F, 0.0F, 0.0F));

            PartDefinition cube_r3 = head_straight_average.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(647, 160).addBox(-3.08F, -3.24F, -1.84F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7115F, -0.6758F, -2.8675F, 2.2253F, 0.0F, 0.0F));

            PartDefinition cube_r4 = head_straight_average.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(645, 153).addBox(-3.9595F, -1.919F, -2.081F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0709F, 1.7817F, -1.4229F, 0.3491F, 0.0F, 0.0F));

            PartDefinition fringe = fringeRoot.addOrReplaceChild("fringe", CubeListBuilder.create(), PartPose.offset(0.2524F, -3.2536F, -1.2184F));

            PartDefinition fringe_straight_average = fringe.addOrReplaceChild("fringe_straight_average", CubeListBuilder.create(), PartPose.offset(0.0F, 8.581F, 4.5587F));

            PartDefinition cube_r5 = fringe_straight_average.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(658, 167).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0894F, -8.2235F, -6.4358F, -1.5333F, 0.6643F, -1.5315F));

            PartDefinition muzzle = muzzleRoot.addOrReplaceChild("muzzle", CubeListBuilder.create(), PartPose.offset(-0.0158F, 2.324F, -4.7045F));

            PartDefinition muzzle_straight_average = muzzle.addOrReplaceChild("muzzle_straight_average", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r6 = muzzle_straight_average.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(666, 167).addBox(-1.4469F, -1.7862F, -3.7184F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, -0.8045F, 0.1788F, 0.7418F, 0.0F, 0.0F));

            PartDefinition mouth = muzzle.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0726F, 0.1788F, -0.0873F, 0.0F, 0.0F));

            PartDefinition mouth_straight_average = mouth.addOrReplaceChild("mouth_straight_average", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0763F, -0.0044F));

            PartDefinition cube_r7 = mouth_straight_average.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(664, 147).addBox(-1.9832F, -0.6095F, -3.149F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1788F, 0.7151F, 0.5363F, 0.7854F, 0.0F, 0.0F));


        } else if (type.equals("straight") && muscleMass.equals("muscular")) {

            PartDefinition head_straight_muscular = headRoot.addOrReplaceChild("head_straight_muscular", CubeListBuilder.create(), PartPose.offset(-0.0158F, 0.3575F, -0.1458F));

            PartDefinition cube_r1 = head_straight_muscular.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(662, 191).addBox(-3.08F, -4.0F, -1.92F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2717F, -3.0606F, -0.4004F, 2.2253F, 0.0F, 0.0F));

            PartDefinition cube_r2 = head_straight_muscular.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(666, 182).addBox(-3.0708F, -3.2124F, -1.8584F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7256F, 1.0938F, -1.8607F, 1.8326F, 0.0F, 0.0F));

            PartDefinition cube_r3 = head_straight_muscular.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(648, 191).addBox(-3.08F, -3.24F, -1.84F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7115F, -0.6758F, -2.8675F, 2.2253F, 0.0F, 0.0F));

            PartDefinition cube_r4 = head_straight_muscular.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(646, 184).addBox(-3.9595F, -1.919F, -2.081F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.624F, 1.7817F, -1.4229F, 0.3491F, 0.0F, 0.0F));

            PartDefinition fringe = fringeRoot.addOrReplaceChild("fringe", CubeListBuilder.create(), PartPose.offset(0.2524F, -3.2536F, -1.2184F));

            PartDefinition fringe_straight_muscular = fringe.addOrReplaceChild("fringe_straight_muscular", CubeListBuilder.create(), PartPose.offset(0.0F, 8.581F, 4.5587F));

            PartDefinition cube_r5 = fringe_straight_muscular.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(659, 198).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0894F, -8.2235F, -6.4358F, -1.5333F, 0.6643F, -1.5315F));

            PartDefinition muzzle = muzzleRoot.addOrReplaceChild("muzzle", CubeListBuilder.create(), PartPose.offset(-0.0158F, 2.324F, -4.7045F));

            PartDefinition muzzle_straight_muscular = muzzle.addOrReplaceChild("muzzle_straight_muscular", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r6 = muzzle_straight_muscular.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(667, 198).addBox(-1.4469F, -1.7862F, -3.7184F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, -0.8045F, 0.1788F, 0.7418F, 0.0F, 0.0F));

            PartDefinition mouth = muzzle.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0726F, 0.1788F, -0.0873F, 0.0F, 0.0F));

            PartDefinition mouth_straight_muscular = mouth.addOrReplaceChild("mouth_straight_muscular", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0763F, -0.0044F));

            PartDefinition cube_r7 = mouth_straight_muscular.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(665, 178).addBox(-1.9832F, -0.6095F, -3.149F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1788F, 0.7151F, 0.5363F, 0.7854F, 0.0F, 0.0F));

            /* Stocky Head */
        } else if (type.equals("stocky") && muscleMass.equals("lean")) {

            PartDefinition head_stocky_lean = headRoot.addOrReplaceChild("head_stocky_lean", CubeListBuilder.create(), PartPose.offset(-0.5869F, -0.3575F, 0.0524F));

            PartDefinition cube_r1 = head_stocky_lean.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(702, 136).addBox(-4.0984F, -4.0F, -2.8616F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9308F, -1.2885F, -0.2402F, 2.2253F, 0.0F, 0.0F));

            PartDefinition cube_r2 = head_stocky_lean.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(690, 127).addBox(-2.0892F, -3.2876F, -1.8216F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4318F, 2.5665F, -1.4657F, 2.3562F, 0.0F, 0.0F));

            PartDefinition cube_r3 = head_stocky_lean.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(690, 137).addBox(-2.08F, -2.24F, -1.84F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4434F, 2.4527F, -3.7613F, 2.618F, 0.0F, 0.0F));

            PartDefinition cube_r4 = head_stocky_lean.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(702, 128).addBox(-3.9595F, -0.919F, -3.081F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.786F, 1.603F, -0.976F, 0.7854F, 0.0F, 0.0F));

            PartDefinition muzzle = muzzleRoot.addOrReplaceChild("muzzle", CubeListBuilder.create(), PartPose.offset(-0.7657F, 4.2011F, -3.9699F));

            PartDefinition muzzle_stocky_lean = muzzle.addOrReplaceChild("muzzle_stocky_lean", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5363F, 1.4302F));

            PartDefinition cube_r5 = muzzle_stocky_lean.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(708, 122).addBox(-1.0F, -3.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, 1.6089F, -0.8045F, 0.9599F, 0.0F, 0.0F));

            PartDefinition mouth = muzzle.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 1.162F));

            PartDefinition mouth_stocky_lean = mouth.addOrReplaceChild("mouth_stocky_lean", CubeListBuilder.create(), PartPose.offset(0.0F, -0.4469F, 0.8939F));

            PartDefinition cube_r6 = mouth_stocky_lean.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(690, 123).addBox(-1.5363F, -0.7513F, -2.9601F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0894F, 0.1788F, -0.2682F, 1.0036F, 0.0F, 0.0F));

            PartDefinition fringe = fringeRoot.addOrReplaceChild("fringe", CubeListBuilder.create(), PartPose.offset(-0.5869F, -2.4492F, -1.199F));

            PartDefinition fringe_stocky_lean = fringe.addOrReplaceChild("fringe_stocky_lean", CubeListBuilder.create(), PartPose.offset(0.0F, -1.162F, 4.2011F));

            PartDefinition cube_r7 = fringe_stocky_lean.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(700, 120).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3575F, 1.7877F, -5.5419F, -1.5612F, 0.7089F, -1.5859F));

        } else if (type.equals("stocky") && muscleMass.equals("average")) {

            PartDefinition head_stocky_average = headRoot.addOrReplaceChild("head_stocky_average", CubeListBuilder.create(), PartPose.offset(-0.5869F, -0.3575F, 0.0524F));

            PartDefinition cube_r1 = head_stocky_average.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(702, 165).addBox(-4.0984F, -4.0F, -2.8616F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4839F, -1.2885F, -0.2402F, 2.2253F, 0.0F, 0.0F));

            PartDefinition cube_r2 = head_stocky_average.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(688, 156).addBox(-3.0892F, -3.2876F, -1.8216F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9681F, 2.5665F, -1.4657F, 2.3562F, 0.0F, 0.0F));

            PartDefinition cube_r3 = head_stocky_average.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(688, 166).addBox(-3.08F, -2.24F, -1.84F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9797F, 2.4527F, -3.7613F, 2.618F, 0.0F, 0.0F));

            PartDefinition cube_r4 = head_stocky_average.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(702, 157).addBox(-3.9595F, -0.919F, -3.081F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3391F, 1.603F, -0.976F, 0.7854F, 0.0F, 0.0F));

            PartDefinition muzzle = muzzleRoot.addOrReplaceChild("muzzle", CubeListBuilder.create(), PartPose.offset(-0.7657F, 4.2011F, -3.9699F));

            PartDefinition muzzle_stocky_average = muzzle.addOrReplaceChild("muzzle_stocky_average", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5363F, 1.4302F));

            PartDefinition cube_r5 = muzzle_stocky_average.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(707, 151).addBox(-1.0F, -3.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, 1.6089F, -0.8045F, 0.9599F, 0.0F, 0.0F));

            PartDefinition mouth = muzzle.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 1.162F));

            PartDefinition mouth_stocky_average = mouth.addOrReplaceChild("mouth_stocky_average", CubeListBuilder.create(), PartPose.offset(0.0F, -0.4469F, 0.8939F));

            PartDefinition cube_r6 = mouth_stocky_average.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(689, 152).addBox(-1.5363F, -0.7513F, -2.9601F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0894F, 0.1788F, -0.2682F, 1.0036F, 0.0F, 0.0F));

            PartDefinition fringe = fringeRoot.addOrReplaceChild("fringe", CubeListBuilder.create(), PartPose.offset(-0.5869F, -2.4492F, -1.199F));

            PartDefinition fringe_stocky_average = fringe.addOrReplaceChild("fringe_stocky_average", CubeListBuilder.create(), PartPose.offset(0.0F, -1.162F, 4.2011F));

            PartDefinition cube_r7 = fringe_stocky_average.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(699, 149).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3575F, 1.7877F, -5.5419F, -1.5612F, 0.7089F, -1.5859F));

        } else if (type.equals("stocky") && muscleMass.equals("muscular")) {

            PartDefinition head_stocky_muscular = headRoot.addOrReplaceChild("head_stocky_muscular", CubeListBuilder.create(), PartPose.offset(-0.5869F, -0.3575F, 0.0524F));

            PartDefinition cube_r1 = head_stocky_muscular.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(702, 194).addBox(-4.0984F, -4.0F, -2.8616F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9476F, -1.2885F, -0.2402F, 2.2253F, 0.0F, 0.0F));

            PartDefinition cube_r2 = head_stocky_muscular.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(688, 185).addBox(-3.0892F, -3.2876F, -1.8216F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9681F, 2.5665F, -1.4657F, 2.3562F, 0.0F, 0.0F));

            PartDefinition cube_r3 = head_stocky_muscular.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(688, 195).addBox(-3.08F, -2.24F, -1.84F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9797F, 2.4527F, -3.7613F, 2.618F, 0.0F, 0.0F));

            PartDefinition cube_r4 = head_stocky_muscular.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(702, 186).addBox(-4.9595F, -0.919F, -3.081F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.786F, 1.603F, -0.976F, 0.7854F, 0.0F, 0.0F));

            PartDefinition muzzle = muzzleRoot.addOrReplaceChild("muzzle", CubeListBuilder.create(), PartPose.offset(-0.7657F, 4.2011F, -3.9699F));

            PartDefinition muzzle_stocky_muscular = muzzle.addOrReplaceChild("muzzle_stocky_muscular", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5363F, 1.4302F));

            PartDefinition cube_r5 = muzzle_stocky_muscular.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(707, 180).addBox(-1.0F, -3.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, 1.6089F, -0.8045F, 0.9599F, 0.0F, 0.0F));

            PartDefinition mouth = muzzle.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 1.162F));

            PartDefinition mouth_stocky_muscular = mouth.addOrReplaceChild("mouth_stocky_muscular", CubeListBuilder.create(), PartPose.offset(0.0F, -0.4469F, 0.8939F));

            PartDefinition cube_r6 = mouth_stocky_muscular.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(689, 181).addBox(-1.5363F, -0.7513F, -2.9601F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0894F, 0.1788F, -0.2682F, 1.0036F, 0.0F, 0.0F));

            PartDefinition fringe = fringeRoot.addOrReplaceChild("fringe", CubeListBuilder.create(), PartPose.offset(-0.5869F, -2.4492F, -1.199F));

            PartDefinition fringe_stocky_muscular = fringe.addOrReplaceChild("fringe_stocky_muscular", CubeListBuilder.create(), PartPose.offset(0.0F, -1.162F, 4.2011F));

            PartDefinition cube_r7 = fringe_stocky_muscular.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(699, 178).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3575F, 1.7877F, -5.5419F, -1.5612F, 0.7089F, -1.5859F));


            /* Dished Head */
        } else if (type.equals("dished") && muscleMass.equals("lean")) {

            PartDefinition head_dished_lean = headRoot.addOrReplaceChild("head_dished_lean", CubeListBuilder.create(), PartPose.offset(0.3841F, 7.8205F, -1.3588F));

            PartDefinition cube_r1 = head_dished_lean.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(622, 131).addBox(-3.08F, -4.0F, -1.92F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6221F, -9.9872F, 0.973F, 2.3998F, 0.0F, 0.0F));

            PartDefinition cube_r2 = head_dished_lean.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(624, 124).addBox(-3.0799F, -3.2418F, -1.8382F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0674F, -5.4089F, -0.2224F, 2.2689F, 0.0F, 0.0F));

            PartDefinition cube_r3 = head_dished_lean.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(608, 123).addBox(-3.08F, -3.24F, -1.84F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0691F, -6.7979F, -0.8684F, 2.8798F, 0.0F, 0.0F));

            PartDefinition cube_r4 = head_dished_lean.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(606, 131).addBox(-3.9554F, -0.7109F, -1.1891F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4551F, -5.9768F, -0.1843F, 0.7854F, 0.0F, 0.0F));

            PartDefinition muzzle = muzzleRoot.addOrReplaceChild("muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 4.3799F, -3.2F));

            PartDefinition muzzle_head_dished_lean = muzzle.addOrReplaceChild("muzzle_head_dished_lean", CubeListBuilder.create(), PartPose.offset(0.3841F, 3.4406F, 1.8412F));

            PartDefinition cube_r5 = muzzle_head_dished_lean.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(609, 138).addBox(-1.4469F, -0.7862F, -2.7184F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5363F, -4.1557F, -1.7551F, 0.7418F, 0.0F, 0.0F));

            PartDefinition mouth = muzzle.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8045F, 0.6078F));

            PartDefinition mouth_head_dished_lean = mouth.addOrReplaceChild("mouth_head_dished_lean", CubeListBuilder.create(), PartPose.offset(0.2033F, 6.3714F, -22.6724F));

            PartDefinition cube_r6 = mouth_head_dished_lean.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(624, 138).addBox(-1.9934F, -0.6134F, -2.1275F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.177F, -6.4599F, 22.8639F, 0.7854F, 0.0F, 0.0F));

            PartDefinition fringe = fringeRoot.addOrReplaceChild("fringe", CubeListBuilder.create(), PartPose.offset(0.2053F, -2.6816F, -1.5382F));

            PartDefinition fringe_head_dished_lean = fringe.addOrReplaceChild("fringe_head_dished_lean", CubeListBuilder.create(), PartPose.offset(0.0F, 20.076F, -19.2179F));

            PartDefinition cube_r7 = fringe_head_dished_lean.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(626, 120).addBox(-3.08F, -3.0F, 0.08F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7841F, -20.0974F, 19.6552F, 2.3998F, 0.0F, 0.0F));


        } else if (type.equals("dished") && muscleMass.equals("average")) {

            PartDefinition head_dished_average = headRoot.addOrReplaceChild("head_dished_average", CubeListBuilder.create(), PartPose.offset(0.3841F, 7.8205F, -1.3588F));

            PartDefinition cube_r1 = head_dished_average.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(622, 160).addBox(-3.08F, -4.0F, -1.92F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0858F, -9.9872F, 0.973F, 2.3998F, 0.0F, 0.0F));

            PartDefinition cube_r2 = head_dished_average.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(624, 153).addBox(-3.0799F, -3.2418F, -1.8382F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.531F, -5.4089F, -0.2224F, 2.2689F, 0.0F, 0.0F));

            PartDefinition cube_r3 = head_dished_average.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(608, 152).addBox(-3.08F, -3.24F, -1.84F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5327F, -6.7979F, -0.8684F, 2.8798F, 0.0F, 0.0F));

            PartDefinition cube_r4 = head_dished_average.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(604, 160).addBox(-3.9554F, -0.7109F, -1.1891F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0082F, -5.9768F, -0.1843F, 0.7854F, 0.0F, 0.0F));

            PartDefinition muzzle = muzzleRoot.addOrReplaceChild("muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 4.3799F, -3.2F));

            PartDefinition muzzle_head_dished_average = muzzle.addOrReplaceChild("muzzle_head_dished_average", CubeListBuilder.create(), PartPose.offset(0.3841F, 3.4406F, 1.8412F));

            PartDefinition cube_r5 = muzzle_head_dished_average.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(609, 167).addBox(-1.4469F, -0.7862F, -2.7184F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5363F, -4.1557F, -1.7551F, 0.7418F, 0.0F, 0.0F));

            PartDefinition mouth = muzzle.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8045F, 0.6078F));

            PartDefinition mouth_head_dished_average = mouth.addOrReplaceChild("mouth_head_dished_average", CubeListBuilder.create(), PartPose.offset(0.2033F, 6.3714F, -22.6724F));

            PartDefinition cube_r6 = mouth_head_dished_average.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(624, 167).addBox(-1.9934F, -0.6134F, -2.1275F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.177F, -6.4599F, 22.8639F, 0.7854F, 0.0F, 0.0F));

            PartDefinition fringe = fringeRoot.addOrReplaceChild("fringe", CubeListBuilder.create(), PartPose.offset(0.2053F, -2.6816F, -1.5382F));

            PartDefinition fringe_head_dished_average = fringe.addOrReplaceChild("fringe_head_dished_average", CubeListBuilder.create(), PartPose.offset(0.0F, 20.076F, -19.2179F));

            PartDefinition cube_r7 = fringe_head_dished_average.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(626, 149).addBox(-3.08F, -3.0F, 0.08F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2478F, -20.0974F, 19.6552F, 2.3998F, 0.0F, 0.0F));


        } else if (type.equals("dished") && muscleMass.equals("muscular")) {

            PartDefinition head_dished_muscular = headRoot.addOrReplaceChild("head_dished_muscular", CubeListBuilder.create(), PartPose.offset(0.3841F, 7.8205F, -1.3588F));

            PartDefinition cube_r1 = head_dished_muscular.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(625, 189).addBox(-3.08F, -4.0F, -1.92F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4505F, -9.9872F, 0.973F, 2.3998F, 0.0F, 0.0F));

            PartDefinition cube_r2 = head_dished_muscular.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(625, 182).addBox(-3.0799F, -3.2418F, -1.8382F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.531F, -5.4089F, -0.2224F, 2.2689F, 0.0F, 0.0F));

            PartDefinition cube_r3 = head_dished_muscular.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(609, 181).addBox(-3.08F, -3.24F, -1.84F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5327F, -6.7979F, -0.8684F, 2.8798F, 0.0F, 0.0F));

            PartDefinition cube_r4 = head_dished_muscular.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(605, 189).addBox(-3.9554F, -0.7109F, -1.1891F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3825F, -5.9768F, -0.1843F, 0.7854F, 0.0F, 0.0F));

            PartDefinition muzzle = muzzleRoot.addOrReplaceChild("muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 4.3799F, -3.2F));

            PartDefinition muzzle_head_dished_muscular = muzzle.addOrReplaceChild("muzzle_head_dished_muscular", CubeListBuilder.create(), PartPose.offset(0.3841F, 3.4406F, 1.8412F));

            PartDefinition cube_r5 = muzzle_head_dished_muscular.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(610, 196).addBox(-1.4469F, -0.7862F, -2.7184F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5363F, -4.1557F, -1.7551F, 0.7418F, 0.0F, 0.0F));

            PartDefinition mouth = muzzle.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8045F, 0.6078F));

            PartDefinition mouth_head_dished_muscular = mouth.addOrReplaceChild("mouth_head_dished_muscular", CubeListBuilder.create(), PartPose.offset(0.2033F, 6.3714F, -22.6724F));

            PartDefinition cube_r6 = mouth_head_dished_muscular.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(625, 196).addBox(-1.9934F, -0.6134F, -2.1275F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.177F, -6.4599F, 22.8639F, 0.7854F, 0.0F, 0.0F));

            PartDefinition fringe = fringeRoot.addOrReplaceChild("fringe", CubeListBuilder.create(), PartPose.offset(0.2053F, -2.6816F, -1.5382F));

            PartDefinition fringe_head_dished_muscular = fringe.addOrReplaceChild("fringe_head_dished_muscular", CubeListBuilder.create(), PartPose.offset(0.0F, 20.076F, -19.2179F));

            PartDefinition cube_r7 = fringe_head_dished_muscular.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(627, 178).addBox(-3.08F, -3.0F, 0.08F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2478F, -20.0974F, 19.6552F, 2.3998F, 0.0F, 0.0F));


            /* Swan Head */
        } else if (type.equals("roman") && muscleMass.equals("lean")) {

            PartDefinition head_roman_lean = headRoot.addOrReplaceChild("head_roman_lean", CubeListBuilder.create(), PartPose.offset(0.5628F, 1.1166F, 0.9653F));

            PartDefinition cube_r1 = head_roman_lean.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(571, 123).addBox(-4.0524F, -4.0F, -3.0076F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7483F, -3.5367F, -2.6983F, 2.2253F, 0.0F, 0.0F));

            PartDefinition cube_r2 = head_roman_lean.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(571, 130).addBox(-2.08F, -3.24F, -1.84F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1752F, 1.3576F, -2.0602F, 2.1817F, 0.0F, 0.0F));

            PartDefinition cube_r3 = head_roman_lean.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(583, 130).addBox(-3.08F, -3.24F, -1.84F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2478F, 0.8893F, -5.1028F, 2.9234F, 0.0F, 0.0F));

            PartDefinition cube_r4 = head_roman_lean.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(571, 115).addBox(-5.9595F, -1.919F, -1.081F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6631F, 2.4529F, -2.4069F, 0.6545F, 0.0F, 0.0F));

            PartDefinition muzzle = muzzleRoot.addOrReplaceChild("muzzle", CubeListBuilder.create(), PartPose.offset(0.5628F, 4.648F, -3.8623F));

            PartDefinition muzzle_roman_lean = muzzle.addOrReplaceChild("muzzle_roman_lean", CubeListBuilder.create(), PartPose.offset(0.0F, -3.5315F, 4.8275F));

            PartDefinition cube_r5 = muzzle_roman_lean.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(585, 124).addBox(-2.4469F, -1.7862F, -3.7184F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, 2.8164F, -4.1124F, 1.0036F, 0.0F, 0.0F));

            PartDefinition mouth = muzzle.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offset(-0.1788F, 0.5363F, 1.162F));

            PartDefinition mouth_roman_lean = mouth.addOrReplaceChild("mouth_roman_lean", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2682F, -20.4693F));

            PartDefinition cube_r6 = mouth_roman_lean.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(588, 120).addBox(-1.9832F, -0.6095F, -3.149F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2682F, 0.3575F, 21.0056F, 0.9599F, 0.0F, 0.0F));

            PartDefinition fringe = fringeRoot.addOrReplaceChild("fringe", CubeListBuilder.create(), PartPose.offset(0.3841F, -2.0916F, -2.0746F));

            PartDefinition fringe_roman_lean = fringe.addOrReplaceChild("fringe_roman_lean", CubeListBuilder.create(), PartPose.offset(0.0F, 12.7821F, -16.3575F));

            PartDefinition cube_r7 = fringe_roman_lean.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(584, 138).addBox(-1.0F, -4.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -11.352F, 13.3184F, -1.5615F, 0.6653F, -1.5864F));

        } else if (type.equals("roman") && muscleMass.equals("average")) {

            PartDefinition head_roman_average = headRoot.addOrReplaceChild("head_roman_average", CubeListBuilder.create(), PartPose.offset(0.5628F, 1.1166F, 0.9653F));

            PartDefinition cube_r1 = head_roman_average.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(567, 153).addBox(-4.0524F, -4.0F, -3.0076F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.212F, -3.5367F, -2.6983F, 2.2253F, 0.0F, 0.0F));

            PartDefinition cube_r2 = head_roman_average.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(567, 160).addBox(-2.08F, -3.24F, -1.84F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1752F, 1.3576F, -2.0602F, 2.1817F, 0.0F, 0.0F));

            PartDefinition cube_r3 = head_roman_average.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(579, 160).addBox(-3.08F, -3.24F, -1.84F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2478F, 0.8893F, -5.1028F, 2.9234F, 0.0F, 0.0F));

            PartDefinition cube_r4 = head_roman_average.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(567, 145).addBox(-5.9595F, -1.919F, -1.081F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1268F, 2.4529F, -2.4069F, 0.6545F, 0.0F, 0.0F));

            PartDefinition muzzle = muzzleRoot.addOrReplaceChild("muzzle", CubeListBuilder.create(), PartPose.offset(0.5628F, 4.648F, -3.8623F));

            PartDefinition muzzle_roman_average = muzzle.addOrReplaceChild("muzzle_roman_average", CubeListBuilder.create(), PartPose.offset(0.0F, -3.5315F, 4.8275F));

            PartDefinition cube_r5 = muzzle_roman_average.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(583, 153).addBox(-2.4469F, -1.7862F, -3.7184F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, 2.8164F, -4.1124F, 1.0036F, 0.0F, 0.0F));

            PartDefinition mouth = muzzle.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offset(-0.1788F, 0.5363F, 1.162F));

            PartDefinition mouth_roman_average = mouth.addOrReplaceChild("mouth_roman_average", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2682F, -20.4693F));

            PartDefinition cube_r6 = mouth_roman_average.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(587, 145).addBox(-1.9832F, -0.6095F, -3.149F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2682F, 0.3575F, 21.0056F, 0.9599F, 0.0F, 0.0F));

            PartDefinition fringe = fringeRoot.addOrReplaceChild("fringe", CubeListBuilder.create(), PartPose.offset(0.3841F, -2.0916F, -2.0746F));

            PartDefinition fringe_roman_average = fringe.addOrReplaceChild("fringe_roman_average", CubeListBuilder.create(), PartPose.offset(0.0F, 12.7821F, -16.3575F));

            PartDefinition cube_r7 = fringe_roman_average.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(579, 168).addBox(-1.0F, -4.0F, -2.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2682F, -11.352F, 13.3184F, -1.5615F, 0.6653F, -1.5864F));

        } else if (type.equals("roman") && muscleMass.equals("muscular")) {

            PartDefinition head_dished_muscular = headRoot.addOrReplaceChild("head_dished_muscular", CubeListBuilder.create(), PartPose.offset(0.3841F, 7.8205F, -1.3588F));

            PartDefinition cube_r1 = head_dished_muscular.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(625, 189).addBox(-3.08F, -4.0F, -1.92F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4505F, -9.9872F, 0.973F, 2.3998F, 0.0F, 0.0F));

            PartDefinition cube_r2 = head_dished_muscular.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(625, 182).addBox(-3.0799F, -3.2418F, -1.8382F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.531F, -5.4089F, -0.2224F, 2.2689F, 0.0F, 0.0F));

            PartDefinition cube_r3 = head_dished_muscular.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(609, 181).addBox(-3.08F, -3.24F, -1.84F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5327F, -6.7979F, -0.8684F, 2.8798F, 0.0F, 0.0F));

            PartDefinition cube_r4 = head_dished_muscular.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(605, 189).addBox(-3.9554F, -0.7109F, -1.1891F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3825F, -5.9768F, -0.1843F, 0.7854F, 0.0F, 0.0F));

            PartDefinition muzzle = muzzleRoot.addOrReplaceChild("muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 4.3799F, -3.2F));

            PartDefinition muzzle_head_dished_muscular = muzzle.addOrReplaceChild("muzzle_head_dished_muscular", CubeListBuilder.create(), PartPose.offset(0.3841F, 3.4406F, 1.8412F));

            PartDefinition cube_r5 = muzzle_head_dished_muscular.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(610, 196).addBox(-1.4469F, -0.7862F, -2.7184F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5363F, -4.1557F, -1.7551F, 0.7418F, 0.0F, 0.0F));

            PartDefinition mouth = muzzle.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8045F, 0.6078F));

            PartDefinition mouth_head_dished_muscular = mouth.addOrReplaceChild("mouth_head_dished_muscular", CubeListBuilder.create(), PartPose.offset(0.2033F, 6.3714F, -22.6724F));

            PartDefinition cube_r6 = mouth_head_dished_muscular.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(625, 196).addBox(-1.9934F, -0.6134F, -2.1275F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.177F, -6.4599F, 22.8639F, 0.7854F, 0.0F, 0.0F));

            PartDefinition fringe = fringeRoot.addOrReplaceChild("fringe", CubeListBuilder.create(), PartPose.offset(0.2053F, -2.6816F, -1.5382F));

            PartDefinition fringe_head_dished_muscular = fringe.addOrReplaceChild("fringe_head_dished_muscular", CubeListBuilder.create(), PartPose.offset(0.0F, 20.076F, -19.2179F));

            PartDefinition cube_r7 = fringe_head_dished_muscular.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(627, 178).addBox(-3.08F, -3.0F, 0.08F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2478F, -20.0974F, 19.6552F, 2.3998F, 0.0F, 0.0F));

        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Head / " + type + " + " + muscleMass + ", Returning Null Value");
            return null;
        }
        return new PartDefinition[]{headRoot, muzzleRoot, fringeRoot};
    }
}
