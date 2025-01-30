package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import java.util.ArrayList;
import java.util.List;

public class HeadModelParts {
    private static List<String> allParts = new ArrayList<>();
    public static List<String> getAllParts(){
        return allParts;
    }

    public static PartDefinition Generate(PartDefinition root, String type, String muscleMass) {
        if (type.equals("straight") && muscleMass.equals("lean")) {
            PartDefinition head_straight_lean = root.addOrReplaceChild("head_straight_lean", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition head_straight_lean_forehead = head_straight_lean.addOrReplaceChild("head_straight_lean_forehead", CubeListBuilder.create(), PartPose.offset(-0.3675F, -1.1523F, -1.8773F));

            PartDefinition cube_r1 = head_straight_lean_forehead.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(881, 49).addBox(-2.08F, -4.0F, -1.92F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.08F, -1.5507F, 1.331F, 2.2253F, 0.0F, 0.0F));

            PartDefinition head_straight_lean_nose_bridge = head_straight_lean.addOrReplaceChild("head_straight_lean_nose_bridge", CubeListBuilder.create(), PartPose.offset(-0.348F, 0.0976F, -2.9967F));

            PartDefinition cube_r2 = head_straight_lean_nose_bridge.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(866, 49).addBox(-3.08F, -3.24F, -1.84F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -0.4158F, -0.0166F, 2.2253F, 0.0F, 0.0F));

            PartDefinition head_straight_lean_jaw = head_straight_lean.addOrReplaceChild("head_straight_lean_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 1.9665F, -1.2514F));

            PartDefinition head_straight_lean_jaw_individual = head_straight_lean_jaw.addOrReplaceChild("head_straight_lean_jaw_individual", CubeListBuilder.create(), PartPose.offset(-0.3513F, -0.1932F, -0.5367F));

            PartDefinition cube_r3 = head_straight_lean_jaw_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(865, 42).addBox(-2.9595F, -1.919F, -2.081F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9595F, 0.366F, 0.2194F, 0.3491F, 0.0F, 0.0F));

            PartDefinition head_straight_lean_jaw_branch = head_straight_lean_jaw.addOrReplaceChild("head_straight_lean_jaw_branch", CubeListBuilder.create(), PartPose.offset(-0.414F, -0.114F, -0.8675F));

            PartDefinition cube_r4 = head_straight_lean_jaw_branch.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(881, 40).addBox(-3.0708F, -3.2124F, -1.8584F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5708F, -0.4012F, 0.1124F, 1.8326F, 0.0F, 0.0F));

            PartDefinition head_straight_lean_muzzle = head_straight_lean.addOrReplaceChild("head_straight_lean_muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 2.5028F, -4.5587F));

            PartDefinition head_straight_lean_muzzle_individual = head_straight_lean_muzzle.addOrReplaceChild("head_straight_lean_muzzle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r5 = head_straight_lean_muzzle_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(885, 56).addBox(-1.4469F, -1.7862F, -3.7184F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3733F, -0.8045F, 0.2118F, 0.7418F, 0.0F, 0.0F));

            PartDefinition head_straight_lean_mouth = head_straight_lean_muzzle.addOrReplaceChild("head_straight_lean_mouth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2514F, 0.3575F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r6 = head_straight_lean_mouth.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(883, 36).addBox(-1.9934F, -0.6134F, -3.1175F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1614F, -0.3916F, 0.6048F, 0.7854F, 0.0F, 0.0F));

            PartDefinition head_straight_lean_fringe = head_straight_lean.addOrReplaceChild("head_straight_lean_fringe", CubeListBuilder.create(), PartPose.offset(0.0F, -3.2179F, -1.2514F));

            PartDefinition cube_r7 = head_straight_lean_fringe.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(875, 56).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.163F, 0.3218F, -1.8441F, -1.5333F, 0.6643F, -1.5315F));

        } else if (type.equals("straight") && muscleMass.equals("average")) {
            PartDefinition head_straight_average = root.addOrReplaceChild("head_straight_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition head_straight_average_forehead = head_straight_average.addOrReplaceChild("head_straight_average_forehead", CubeListBuilder.create(), PartPose.offset(0.0F, -1.1523F, -1.8773F));

            PartDefinition cube_r1 = head_straight_average_forehead.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(880, 80).addBox(-3.08F, -4.0F, -1.92F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.517F, -1.5507F, 1.331F, 2.2253F, 0.0F, 0.0F));

            PartDefinition head_straight_average_nose_bridge = head_straight_average.addOrReplaceChild("head_straight_average_nose_bridge", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0976F, -2.9967F));

            PartDefinition cube_r2 = head_straight_average_nose_bridge.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(866, 80).addBox(-3.08F, -3.24F, -1.84F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9639F, -0.4158F, -0.0166F, 2.2253F, 0.0F, 0.0F));

            PartDefinition head_straight_average_jaw = head_straight_average.addOrReplaceChild("head_straight_average_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 1.8771F, -2.2346F));

            PartDefinition head_jaw_individual = head_straight_average_jaw.addOrReplaceChild("head_jaw_individual", CubeListBuilder.create(), PartPose.offset(-0.1362F, -0.1038F, 0.4465F));

            PartDefinition cube_r3 = head_jaw_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(864, 73).addBox(-3.9595F, -1.919F, -2.081F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4595F, 0.366F, 0.2194F, 0.3491F, 0.0F, 0.0F));

            PartDefinition head_jaw_branch = head_straight_average_jaw.addOrReplaceChild("head_jaw_branch", CubeListBuilder.create(), PartPose.offset(-0.0928F, -0.0246F, 0.1157F));

            PartDefinition cube_r4 = head_jaw_branch.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(882, 71).addBox(-3.0708F, -3.2124F, -1.8584F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0708F, -0.4012F, 0.1124F, 1.8326F, 0.0F, 0.0F));

            PartDefinition head_straight_average_fringe = head_straight_average.addOrReplaceChild("head_straight_average_fringe", CubeListBuilder.create(), PartPose.offset(0.0F, -3.2179F, -1.2514F));

            PartDefinition cube_r5 = head_straight_average_fringe.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(877, 87).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4312F, 0.3218F, -1.8441F, -1.5333F, 0.6643F, -1.5315F));

            PartDefinition head_straight_average_muzzle = head_straight_average.addOrReplaceChild("head_straight_average_muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 2.324F, -4.648F));

            PartDefinition head_straight_average_muzzle_individual = head_straight_average_muzzle.addOrReplaceChild("head_straight_average_muzzle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r6 = head_straight_average_muzzle_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(885, 87).addBox(-1.4469F, -1.7862F, -3.7184F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1945F, -0.8044F, 0.2117F, 0.7418F, 0.0F, 0.0F));

            PartDefinition head_straight_average_mouth = head_straight_average_muzzle.addOrReplaceChild("head_straight_average_mouth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9832F, 0.0894F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r7 = head_straight_average_mouth.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(883, 67).addBox(-1.9832F, -0.6095F, -3.149F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4312F, -0.28F, 0.6617F, 0.7854F, 0.0F, 0.0F));

        } else if (type.equals("straight") && muscleMass.equals("muscular")) {
            PartDefinition head_straight_muscular = root.addOrReplaceChild("head_straight_muscular", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition head_straight_muscular_jaw = head_straight_muscular.addOrReplaceChild("head_straight_muscular_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 0.9832F, -1.8771F));

            PartDefinition head_jaw_individual = head_straight_muscular_jaw.addOrReplaceChild("head_jaw_individual", CubeListBuilder.create(), PartPose.offset(-0.3513F, 0.79F, 0.089F));

            PartDefinition cube_r1 = head_jaw_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(862, 105).addBox(-3.9595F, -1.919F, -2.081F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9595F, 0.366F, 0.2194F, 0.3491F, 0.0F, 0.0F));

            PartDefinition head_jaw_branch = head_straight_muscular_jaw.addOrReplaceChild("head_jaw_branch", CubeListBuilder.create(), PartPose.offset(-0.361F, 0.8693F, -0.2418F));

            PartDefinition cube_r2 = head_jaw_branch.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(882, 103).addBox(-3.0708F, -3.2124F, -1.8584F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0708F, -0.4012F, 0.1124F, 1.8326F, 0.0F, 0.0F));

            PartDefinition head_straight_muscular_nose_bridge = head_straight_muscular.addOrReplaceChild("head_straight_muscular_nose_bridge", CubeListBuilder.create(), PartPose.offset(-0.3843F, 0.0976F, -2.9967F));

            PartDefinition cube_r3 = head_straight_muscular_nose_bridge.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(864, 112).addBox(-3.08F, -3.24F, -1.84F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.08F, -0.4158F, -0.0166F, 2.2253F, 0.0F, 0.0F));

            PartDefinition head_straight_muscular_forehead = head_straight_muscular.addOrReplaceChild("head_straight_muscular_forehead", CubeListBuilder.create(), PartPose.offset(-0.3675F, -1.1523F, -1.8773F));

            PartDefinition cube_r4 = head_straight_muscular_forehead.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(878, 112).addBox(-3.08F, -4.0F, -1.92F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.08F, -1.5507F, 1.331F, 2.2253F, 0.0F, 0.0F));

            PartDefinition head_straight_muscular_fringe = head_straight_muscular.addOrReplaceChild("head_straight_muscular_fringe", CubeListBuilder.create(), PartPose.offset(0.2524F, -3.1285F, -1.4302F));

            PartDefinition cube_r5 = head_straight_muscular_fringe.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(875, 119).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0894F, 0.3218F, -1.8441F, -1.5333F, 0.6643F, -1.5315F));

            PartDefinition head_straight_muscular_muzzle = head_straight_muscular.addOrReplaceChild("head_straight_muscular_muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 2.5028F, -4.5587F));

            PartDefinition head_straight_muscular_muzzle_individual = head_straight_muscular_muzzle.addOrReplaceChild("head_straight_muscular_muzzle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r6 = head_straight_muscular_muzzle_individual.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(883, 119).addBox(-1.4469F, -1.7862F, -3.7184F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4627F, -0.8045F, 0.2118F, 0.7418F, 0.0F, 0.0F));

            PartDefinition head_straight_muscular_mouth = head_straight_muscular_muzzle.addOrReplaceChild("head_straight_muscular_mouth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0726F, 0.2682F, -0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r7 = head_straight_muscular_mouth.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(881, 99).addBox(-1.9832F, -0.6095F, -3.149F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.163F, -0.3613F, 0.5648F, 0.7854F, 0.0F, 0.0F));

        } else if (type.equals("stocky") && muscleMass.equals("lean")) {
            PartDefinition head_stocky_lean = root.addOrReplaceChild("head_stocky_lean", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition head_stocky_lean_jaw = head_stocky_lean.addOrReplaceChild("head_stocky_lean_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 1.6089F, -1.3408F));

            PartDefinition head_stocky_lean_jaw_individual = head_stocky_lean_jaw.addOrReplaceChild("head_stocky_lean_jaw_individual", CubeListBuilder.create(), PartPose.offset(-0.0453F, 0.4582F, 0.4172F));

            PartDefinition cube_r1 = head_stocky_lean_jaw_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(920, 43).addBox(-3.9595F, -0.919F, -3.081F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9595F, -0.8217F, 0.0F, 0.7854F, 0.0F, 0.0F));

            PartDefinition head_stocky_lean_jaw_branch = head_stocky_lean_jaw.addOrReplaceChild("head_stocky_lean_jaw_branch", CubeListBuilder.create(), PartPose.offset(-0.0292F, 0.6773F, 0.3051F));

            PartDefinition cube_r2 = head_stocky_lean_jaw_branch.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(908, 42).addBox(-2.0892F, -3.2876F, -1.8216F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5892F, -0.0772F, -0.3776F, 2.3562F, 0.0F, 0.0F));

            PartDefinition head_stocky_lean_nose_bridge = head_stocky_lean.addOrReplaceChild("head_stocky_lean_nose_bridge", CubeListBuilder.create(), PartPose.offset(-0.0085F, 2.473F, -3.5345F));

            PartDefinition cube_r3 = head_stocky_lean_nose_bridge.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(908, 52).addBox(-2.08F, -2.24F, -1.84F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -0.3778F, -0.1744F, 2.618F, 0.0F, 0.0F));

            PartDefinition head_stocky_lean_forehead = head_stocky_lean.addOrReplaceChild("head_stocky_lean_forehead", CubeListBuilder.create(), PartPose.offset(-0.0394F, 0.255F, -1.25F));

            PartDefinition cube_r4 = head_stocky_lean_forehead.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(920, 51).addBox(-4.0984F, -4.0F, -2.8616F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0984F, -1.9011F, 1.0622F, 2.2253F, 0.0F, 0.0F));

            PartDefinition head_stocky_lean_muzzle = head_stocky_lean.addOrReplaceChild("head_stocky_lean_muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 4.8268F, -4.2905F));

            PartDefinition head_stocky_lean_muzzle_individual = head_stocky_lean_muzzle.addOrReplaceChild("head_stocky_lean_muzzle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r5 = head_stocky_lean_muzzle_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(926, 37).addBox(-1.0F, -3.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4975F, 1.0726F, 0.5887F, 0.9599F, 0.0F, 0.0F));

            PartDefinition head_stocky_lean_mouth = head_stocky_lean_muzzle.addOrReplaceChild("head_stocky_lean_mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.8939F));

            PartDefinition cube_r6 = head_stocky_lean_mouth.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(908, 38).addBox(-1.5363F, -0.7513F, -2.9601F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0388F, -0.2682F, 0.5887F, 1.0036F, 0.0F, 0.0F));

            PartDefinition head_stocky_lean_fringe = head_stocky_lean.addOrReplaceChild("head_stocky_lean_fringe", CubeListBuilder.create(), PartPose.offset(0.0F, -2.324F, -1.6089F));

            PartDefinition cube_r7 = head_stocky_lean_fringe.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(918, 35).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4857F, 0.5899F, -1.3777F, -1.5612F, 0.7089F, -1.5859F));

        } else if (type.equals("stocky") && muscleMass.equals("average")) {
            PartDefinition head_stocky_average = root.addOrReplaceChild("head_stocky_average", CubeListBuilder.create(), PartPose.offset(0.7151F, 24.0F, 0.0F));

            PartDefinition head_stocky_average_forehead = head_stocky_average.addOrReplaceChild("head_stocky_average_forehead", CubeListBuilder.create(), PartPose.offset(-0.7014F, 0.255F, -1.25F));

            PartDefinition cube_r1 = head_stocky_average_forehead.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(921, 84).addBox(-4.0984F, -4.0F, -2.8616F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5984F, -1.9011F, 1.0622F, 2.2253F, 0.0F, 0.0F));

            PartDefinition head_stocky_average_nose_bridge = head_stocky_average.addOrReplaceChild("head_stocky_average_nose_bridge", CubeListBuilder.create(), PartPose.offset(-0.6872F, 2.473F, -3.5345F));

            PartDefinition cube_r2 = head_stocky_average_nose_bridge.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(907, 85).addBox(-3.08F, -2.24F, -1.84F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.08F, -0.3778F, -0.1744F, 2.618F, 0.0F, 0.0F));

            PartDefinition head_stocky_average_jaw = head_stocky_average.addOrReplaceChild("head_stocky_average_jaw", CubeListBuilder.create(), PartPose.offset(-0.7151F, 2.1453F, -0.8939F));

            PartDefinition head_stocky_average_jaw_individual = head_stocky_average_jaw.addOrReplaceChild("head_stocky_average_jaw_individual", CubeListBuilder.create(), PartPose.offset(0.0077F, -0.0782F, -0.0297F));

            PartDefinition cube_r3 = head_stocky_average_jaw_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(921, 76).addBox(-3.9595F, -0.919F, -3.081F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4595F, -0.8217F, 0.0F, 0.7854F, 0.0F, 0.0F));

            PartDefinition head_stocky_average_jaw_branch = head_stocky_average_jaw.addOrReplaceChild("head_stocky_average_jaw_branch", CubeListBuilder.create(), PartPose.offset(0.0071F, 0.141F, -0.1419F));

            PartDefinition cube_r4 = head_stocky_average_jaw_branch.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(907, 75).addBox(-3.0892F, -3.2876F, -1.8216F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0892F, -0.0772F, -0.3776F, 2.3562F, 0.0F, 0.0F));

            PartDefinition head_stocky_average_muzzle = head_stocky_average.addOrReplaceChild("head_stocky_average_muzzle", CubeListBuilder.create(), PartPose.offset(-0.7151F, 4.7374F, -4.2905F));

            PartDefinition head_stocky_average_muzzle_individual = head_stocky_average_muzzle.addOrReplaceChild("head_stocky_average_muzzle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r5 = head_stocky_average_muzzle_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(926, 70).addBox(-1.0F, -3.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4975F, 1.0727F, 0.5887F, 0.9599F, 0.0F, 0.0F));

            PartDefinition head_stocky_average_mouth = head_stocky_average_muzzle.addOrReplaceChild("head_stocky_average_mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.6257F, 0.7151F));

            PartDefinition cube_r6 = head_stocky_average_mouth.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(908, 71).addBox(-1.5509F, -0.7538F, -2.9305F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0384F, 0.0027F, 0.9404F, 1.0036F, 0.0F, 0.0F));

            PartDefinition head_stocky_average_fringe = head_stocky_average.addOrReplaceChild("head_stocky_average_fringe", CubeListBuilder.create(), PartPose.offset(-0.7151F, -2.4134F, -1.5196F));

            PartDefinition cube_r7 = head_stocky_average_fringe.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(918, 68).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4857F, 0.5899F, -1.3777F, -1.5612F, 0.7089F, -1.5859F));

        } else if (type.equals("stocky") && muscleMass.equals("muscular")) {
            PartDefinition head_stocky_muscular = root.addOrReplaceChild("head_stocky_muscular", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition head_stocky_muscular_jaw = head_stocky_muscular.addOrReplaceChild("head_stocky_muscular_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 1.3408F, -1.0726F));

            PartDefinition head_stocky_muscular_jaw_individual = head_stocky_muscular_jaw.addOrReplaceChild("head_stocky_muscular_jaw_individual", CubeListBuilder.create(), PartPose.offset(-0.0453F, 0.7263F, 0.1491F));

            PartDefinition cube_r1 = head_stocky_muscular_jaw_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(922, 108).addBox(-4.9595F, -0.919F, -3.081F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9595F, -0.8217F, 0.0F, 0.7854F, 0.0F, 0.0F));

            PartDefinition head_stocky_muscular_jaw_branch = head_stocky_muscular_jaw.addOrReplaceChild("head_stocky_muscular_jaw_branch", CubeListBuilder.create(), PartPose.offset(0.0071F, 0.9454F, 0.0369F));

            PartDefinition cube_r2 = head_stocky_muscular_jaw_branch.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(908, 107).addBox(-3.0892F, -3.2876F, -1.8216F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0892F, -0.0772F, -0.3776F, 2.3562F, 0.0F, 0.0F));

            PartDefinition head_stocky_muscular_nose_bridge = head_stocky_muscular.addOrReplaceChild("head_stocky_muscular_nose_bridge", CubeListBuilder.create(), PartPose.offset(0.0279F, 2.473F, -3.5345F));

            PartDefinition cube_r3 = head_stocky_muscular_nose_bridge.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(908, 117).addBox(-3.08F, -2.24F, -1.84F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.08F, -0.3778F, -0.1744F, 2.618F, 0.0F, 0.0F));

            PartDefinition head_stocky_muscular_forehead = head_stocky_muscular.addOrReplaceChild("head_stocky_muscular_forehead", CubeListBuilder.create(), PartPose.offset(-0.0227F, 0.255F, -1.25F));

            PartDefinition cube_r4 = head_stocky_muscular_forehead.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(922, 116).addBox(-4.0984F, -4.0F, -2.8616F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0984F, -1.9011F, 1.0622F, 2.2253F, 0.0F, 0.0F));

            PartDefinition head_stocky_muscular_muzzle = head_stocky_muscular.addOrReplaceChild("head_stocky_muscular_muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 4.5408F, -4.1117F));

            PartDefinition head_stocky_muscular_muzzle_individual = head_stocky_muscular_muzzle.addOrReplaceChild("head_stocky_muscular_muzzle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r5 = head_stocky_muscular_muzzle_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(927, 102).addBox(-1.0F, -3.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4975F, 1.0726F, 0.5887F, 0.9599F, 0.0F, 0.0F));

            PartDefinition head_stocky_muscular_mouth = head_stocky_muscular_muzzle.addOrReplaceChild("head_stocky_muscular_mouth", CubeListBuilder.create(), PartPose.offset(-0.0506F, 0.8939F, 1.0357F));

            PartDefinition cube_r6 = head_stocky_muscular_mouth.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(909, 103).addBox(-1.5363F, -0.7513F, -2.9601F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0894F, -0.2682F, 0.6257F, 1.0036F, 0.0F, 0.0F));

            PartDefinition head_stocky_muscular_fringe = head_stocky_muscular.addOrReplaceChild("head_stocky_muscular_fringe", CubeListBuilder.create(), PartPose.offset(0.0F, -2.4134F, -1.6089F));

            PartDefinition cube_r7 = head_stocky_muscular_fringe.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(919, 100).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4857F, 0.5899F, -1.3777F, -1.5612F, 0.7089F, -1.5859F));

        } else if (type.equals("dished") && muscleMass.equals("lean")) {
            PartDefinition head_dished_lean = root.addOrReplaceChild("head_dished_lean", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition head_dished_lean_jaw = head_dished_lean.addOrReplaceChild("head_dished_lean_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5196F, -0.2682F));

            PartDefinition head_dished_lean_jaw_individual = head_dished_lean_jaw.addOrReplaceChild("head_dished_lean_jaw_individual", CubeListBuilder.create(), PartPose.offset(-0.1163F, 0.3088F, -0.1435F));

            PartDefinition cube_r1 = head_dished_lean_jaw_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(989, 47).addBox(-3.9554F, -0.7109F, -1.1891F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9554F, 0.0154F, -1.1314F, 0.7854F, 0.0F, 0.0F));

            PartDefinition head_dished_lean_jaw_branch = head_dished_lean_jaw.addOrReplaceChild("head_dished_lean_jaw_branch", CubeListBuilder.create(), PartPose.offset(-0.1285F, 2.0109F, -1.3424F));

            PartDefinition cube_r2 = head_dished_lean_jaw_branch.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1007, 40).addBox(-3.0799F, -3.2418F, -1.8382F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5799F, -1.1189F, 0.0295F, 2.2689F, 0.0F, 0.0F));

            PartDefinition head_dished_lean_nose_bridge = head_dished_lean.addOrReplaceChild("head_dished_lean_nose_bridge", CubeListBuilder.create(), PartPose.offset(-0.1269F, 1.8254F, -2.0902F));

            PartDefinition cube_r3 = head_dished_lean_nose_bridge.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(991, 39).addBox(-3.08F, -3.24F, -1.84F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.58F, -0.8028F, -0.1369F, 2.8798F, 0.0F, 0.0F));

            PartDefinition head_dished_lean_forehead = head_dished_lean.addOrReplaceChild("head_dished_lean_forehead", CubeListBuilder.create(), PartPose.offset(-0.0738F, -0.4084F, -1.4273F));

            PartDefinition cube_r4 = head_dished_lean_forehead.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1005, 47).addBox(-3.08F, -4.0F, -1.92F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.08F, -1.7583F, 1.0415F, 2.3998F, 0.0F, 0.0F));

            PartDefinition head_dished_lean_muzzle = head_dished_lean.addOrReplaceChild("head_dished_lean_muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 4.5587F, -3.2179F));

            PartDefinition head_dished_lean_muzzle_individual = head_dished_lean_muzzle.addOrReplaceChild("head_dished_lean_muzzle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r5 = head_dished_lean_muzzle_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(992, 54).addBox(-1.4469F, -0.7862F, -2.7184F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1522F, -0.7151F, 0.1041F, 0.7418F, 0.0F, 0.0F));

            PartDefinition head_dished_lean_mouth = head_dished_lean_muzzle.addOrReplaceChild("head_dished_lean_mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8045F, 0.6078F));

            PartDefinition cube_r6 = head_dished_lean_mouth.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(1007, 54).addBox(-1.9934F, -0.6134F, -2.1275F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3802F, -0.0885F, 0.1915F, 0.7854F, 0.0F, 0.0F));

            PartDefinition head_dished_lean_fringe = head_dished_lean.addOrReplaceChild("head_dished_lean_fringe", CubeListBuilder.create(), PartPose.offset(0.0F, -2.6816F, -1.3408F));

            PartDefinition cube_r7 = head_dished_lean_fringe.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(1009, 36).addBox(-3.08F, -3.0F, 0.08F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9894F, -0.0215F, 0.4187F, 2.3998F, 0.0F, 0.0F));

        } else if (type.equals("dished") && muscleMass.equals("average")) {
            PartDefinition head_dished_average = root.addOrReplaceChild("head_dished_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition head_dished_average_jaw = head_dished_average.addOrReplaceChild("head_dished_average_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 1.8771F, 0.0F));

            PartDefinition head_dished_average_jaw_individual = head_dished_average_jaw.addOrReplaceChild("head_dished_average_jaw_individual", CubeListBuilder.create(), PartPose.offset(0.0262F, -0.0488F, -0.4117F));

            PartDefinition cube_r1 = head_dished_average_jaw_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(986, 82).addBox(-3.9554F, -0.7109F, -1.1891F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4554F, 0.0154F, -1.1314F, 0.7854F, 0.0F, 0.0F));

            PartDefinition head_dished_average_jaw_branch = head_dished_average_jaw.addOrReplaceChild("head_dished_average_jaw_branch", CubeListBuilder.create(), PartPose.offset(-0.0754F, 1.6533F, -1.6106F));

            PartDefinition cube_r2 = head_dished_average_jaw_branch.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1006, 75).addBox(-3.0799F, -3.2418F, -1.8382F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0799F, -1.1189F, 0.0295F, 2.2689F, 0.0F, 0.0F));

            PartDefinition head_dished_average_nose_bridge = head_dished_average.addOrReplaceChild("head_dished_average_nose_bridge", CubeListBuilder.create(), PartPose.offset(-0.0738F, 1.8254F, -2.0902F));

            PartDefinition cube_r3 = head_dished_average_nose_bridge.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(990, 74).addBox(-3.08F, -3.24F, -1.84F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.08F, -0.8028F, -0.1369F, 2.8798F, 0.0F, 0.0F));

            PartDefinition head_dished_average_forehead = head_dished_average.addOrReplaceChild("head_dished_average_forehead", CubeListBuilder.create(), PartPose.offset(-0.0207F, -0.4084F, -1.4273F));

            PartDefinition cube_r4 = head_dished_average_forehead.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1004, 82).addBox(-3.08F, -4.0F, -1.92F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.58F, -1.7583F, 1.0415F, 2.3998F, 0.0F, 0.0F));

            PartDefinition head_dished_average_muzzle = head_dished_average.addOrReplaceChild("head_dished_average_muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 4.5229F, -3.1285F));

            PartDefinition head_dished_average_muzzle_individual = head_dished_average_muzzle.addOrReplaceChild("head_dished_average_muzzle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r5 = head_dished_average_muzzle_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(991, 89).addBox(-1.4469F, -0.7862F, -2.7184F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0628F, -0.7151F, 0.104F, 0.7418F, 0.0F, 0.0F));

            PartDefinition head_dished_average_mouth = head_dished_average_muzzle.addOrReplaceChild("head_dished_average_mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.7151F, 0.4469F));

            PartDefinition cube_r6 = head_dished_average_mouth.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(1006, 89).addBox(-1.9934F, -0.6134F, -2.1275F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4696F, -0.0885F, 0.1915F, 0.7854F, 0.0F, 0.0F));

            PartDefinition head_dished_average_fringe = head_dished_average.addOrReplaceChild("head_dished_average_fringe", CubeListBuilder.create(), PartPose.offset(0.0F, -2.6816F, -1.5196F));

            PartDefinition cube_r7 = head_dished_average_fringe.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(1008, 71).addBox(-3.08F, -3.0F, 0.08F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5425F, -0.0215F, 0.4187F, 2.3998F, 0.0F, 0.0F));

        } else if (type.equals("dished") && muscleMass.equals("muscular")) {
            PartDefinition head_dished_muscular = root.addOrReplaceChild("head_dished_muscular", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition head_dished_muscular_jaw = head_dished_muscular.addOrReplaceChild("head_dished_muscular_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 1.9665F, -0.1788F));

            PartDefinition head_dished_muscular_jaw_individual = head_dished_muscular_jaw.addOrReplaceChild("head_dished_muscular_jaw_individual", CubeListBuilder.create(), PartPose.offset(-0.0995F, -0.1382F, -0.2329F));

            PartDefinition cube_r1 = head_dished_muscular_jaw_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(984, 118).addBox(-3.9554F, -0.7109F, -1.1891F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9554F, 0.0154F, -1.1314F, 0.7854F, 0.0F, 0.0F));

            PartDefinition head_dished_muscular_jaw_branch = head_dished_muscular_jaw.addOrReplaceChild("head_dished_muscular_jaw_branch", CubeListBuilder.create(), PartPose.offset(-0.0754F, 1.5639F, -1.4318F));

            PartDefinition cube_r2 = head_dished_muscular_jaw_branch.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1004, 111).addBox(-3.0799F, -3.2418F, -1.8382F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0799F, -1.1189F, 0.0295F, 2.2689F, 0.0F, 0.0F));

            PartDefinition head_dished_muscular_nose_bridge = head_dished_muscular.addOrReplaceChild("head_dished_muscular_nose_bridge", CubeListBuilder.create(), PartPose.offset(-0.0738F, 1.8254F, -2.0902F));

            PartDefinition cube_r3 = head_dished_muscular_nose_bridge.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(988, 110).addBox(-3.08F, -3.24F, -1.84F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.08F, -0.8028F, -0.1369F, 2.8798F, 0.0F, 0.0F));

            PartDefinition head_dished_muscular_forehead = head_dished_muscular.addOrReplaceChild("head_dished_muscular_forehead", CubeListBuilder.create(), PartPose.offset(-0.057F, -0.4084F, -1.4273F));

            PartDefinition cube_r4 = head_dished_muscular_forehead.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1004, 118).addBox(-3.08F, -4.0F, -1.92F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.08F, -1.7583F, 1.0415F, 2.3998F, 0.0F, 0.0F));

            PartDefinition head_dished_muscular_muzzle = head_dished_muscular.addOrReplaceChild("head_dished_muscular_muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 4.4693F, -3.1821F));

            PartDefinition head_dished_muscular_muzzle_individual = head_dished_muscular_muzzle.addOrReplaceChild("head_dished_muscular_muzzle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r5 = head_dished_muscular_muzzle_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(989, 125).addBox(-1.4469F, -0.7862F, -2.7184F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0628F, -0.7151F, 0.104F, 0.7418F, 0.0F, 0.0F));

            PartDefinition head_dished_muscular_mouth = head_dished_muscular_muzzle.addOrReplaceChild("head_dished_muscular_mouth", CubeListBuilder.create(), PartPose.offset(0.0894F, 0.8045F, 0.5363F));

            PartDefinition cube_r6 = head_dished_muscular_mouth.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(1004, 125).addBox(-1.9934F, -0.6134F, -2.1275F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3802F, -0.0885F, 0.1915F, 0.7854F, 0.0F, 0.0F));

            PartDefinition head_dished_muscular_fringe = head_dished_muscular.addOrReplaceChild("head_dished_muscular_fringe", CubeListBuilder.create(), PartPose.offset(0.0F, -2.6816F, -1.2514F));

            PartDefinition cube_r7 = head_dished_muscular_fringe.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(1006, 107).addBox(-3.08F, -3.0F, 0.08F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5425F, -0.0215F, 0.4187F, 2.3998F, 0.0F, 0.0F));

        } else if (type.equals("roman") && muscleMass.equals("lean")) {
            PartDefinition head_roman_lean = root.addOrReplaceChild("head_roman_lean", CubeListBuilder.create(), PartPose.offset(-0.1788F, 24.0F, 0.0F));

            PartDefinition head_roman_lean_muzzle = head_roman_lean.addOrReplaceChild("head_roman_lean_muzzle", CubeListBuilder.create(), PartPose.offset(0.3575F, 4.648F, -4.2905F));

            PartDefinition head_roman_lean_muzzle_individual = head_roman_lean_muzzle.addOrReplaceChild("head_roman_lean_muzzle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = head_roman_lean_muzzle_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(965, 45).addBox(-2.4469F, -1.7862F, -3.7184F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9204F, -0.7151F, 0.6964F, 1.0036F, 0.0F, 0.0F));

            PartDefinition head_roman_lean_mouth = head_roman_lean_muzzle.addOrReplaceChild("head_roman_lean_mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.4469F, 1.0726F));

            PartDefinition cube_r2 = head_roman_lean_mouth.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(968, 41).addBox(-1.9832F, -0.6095F, -3.149F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4735F, 0.0894F, 0.5176F, 0.9599F, 0.0F, 0.0F));

            PartDefinition head_roman_lean_fringe = head_roman_lean.addOrReplaceChild("head_roman_lean_fringe", CubeListBuilder.create(), PartPose.offset(0.1788F, -1.9665F, -2.0559F));

            PartDefinition cube_r3 = head_roman_lean_fringe.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(964, 59).addBox(-1.0F, -4.0F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0992F, 1.3944F, -3.0578F, -1.5615F, 0.6653F, -1.5864F));

            PartDefinition head_roman_lean_jaw = head_roman_lean.addOrReplaceChild("head_roman_lean_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 2.2346F, -0.7151F));

            PartDefinition head_roman_lean_jaw_individual = head_roman_lean_jaw.addOrReplaceChild("head_roman_lean_jaw_individual", CubeListBuilder.create(), PartPose.offset(0.1788F, -0.1788F, -0.0894F));

            PartDefinition cube_r4 = head_roman_lean_jaw_individual.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(951, 36).addBox(-5.9595F, -1.919F, -1.081F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0472F, 1.5136F, -0.6371F, 0.6545F, 0.0F, 0.0F));

            PartDefinition head_roman_lean_jaw_branch = head_roman_lean_jaw.addOrReplaceChild("head_roman_lean_jaw_branch", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.3575F, -0.1788F));

            PartDefinition cube_r5 = head_roman_lean_jaw_branch.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(951, 51).addBox(-2.08F, -3.24F, -1.84F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5593F, -0.118F, -0.201F, 2.1817F, 0.0F, 0.0F));

            PartDefinition head_roman_lean_nose_bridge = head_roman_lean.addOrReplaceChild("head_roman_lean_nose_bridge", CubeListBuilder.create(), PartPose.offset(0.1788F, 2.4134F, -4.4693F));

            PartDefinition cube_r6 = head_roman_lean_nose_bridge.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(963, 51).addBox(-3.08F, -3.24F, -1.84F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6319F, -0.4076F, 0.2423F, 2.9234F, 0.0F, 0.0F));

            PartDefinition head_roman_lean_forehead = head_roman_lean.addOrReplaceChild("head_roman_lean_forehead", CubeListBuilder.create(), PartPose.offset(0.1788F, 0.0F, -2.6816F));

            PartDefinition cube_r7 = head_roman_lean_forehead.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(951, 44).addBox(-4.0524F, -4.0F, -3.0076F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1324F, -2.4201F, 0.9485F, 2.2253F, 0.0F, 0.0F));

        } else if (type.equals("roman") && muscleMass.equals("average")) {
            PartDefinition head_roman_average = root.addOrReplaceChild("head_roman_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition head_roman_average_jaw = head_roman_average.addOrReplaceChild("head_roman_average_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 2.324F, -0.5363F));

            PartDefinition head_roman_average_jaw_individual = head_roman_average_jaw.addOrReplaceChild("head_roman_average_jaw_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0492F, -0.0346F));

            PartDefinition cube_r1 = head_roman_average_jaw_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(951, 71).addBox(-5.9595F, -1.919F, -1.081F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5108F, 1.1962F, -0.8707F, 0.6545F, 0.0F, 0.0F));

            PartDefinition head_roman_average_jaw_branch = head_roman_average_jaw.addOrReplaceChild("head_roman_average_jaw_branch", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5663F, -0.5602F));

            PartDefinition cube_r2 = head_roman_average_jaw_branch.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(951, 86).addBox(-2.08F, -3.24F, -1.84F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5593F, -0.4162F, 0.0016F, 2.1817F, 0.0F, 0.0F));

            PartDefinition head_roman_average_nose_bridge = head_roman_average.addOrReplaceChild("head_roman_average_nose_bridge", CubeListBuilder.create(), PartPose.offset(0.0F, 2.6298F, -3.9113F));

            PartDefinition cube_r3 = head_roman_average_nose_bridge.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(963, 86).addBox(-3.08F, -3.24F, -1.84F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6319F, -0.8028F, -0.1369F, 2.8798F, 0.0F, 0.0F));

            PartDefinition head_roman_average_forehead = head_roman_average.addOrReplaceChild("head_roman_average_forehead", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0065F, -2.402F));

            PartDefinition cube_r4 = head_roman_average_forehead.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(951, 79).addBox(-4.0524F, -4.0F, -3.0076F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.596F, -2.4136F, 0.6689F, 2.2253F, 0.0F, 0.0F));

            PartDefinition head_roman_average_muzzle = head_roman_average.addOrReplaceChild("head_roman_average_muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 4.648F, -4.5587F));

            PartDefinition head_roman_average_muzzle_individual = head_roman_average_muzzle.addOrReplaceChild("head_roman_average_muzzle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r5 = head_roman_average_muzzle_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(967, 79).addBox(-2.4469F, -1.7862F, -3.7184F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9204F, -0.715F, 0.6964F, 1.0036F, 0.0F, 0.0F));

            PartDefinition head_roman_average_mouth = head_roman_average_muzzle.addOrReplaceChild("head_roman_average_mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.6257F, 1.162F));

            PartDefinition cube_r6 = head_roman_average_mouth.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(966, 72).addBox(-1.9832F, -0.6095F, -3.149F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4735F, 0.0894F, 0.5176F, 0.9599F, 0.0F, 0.0F));

            PartDefinition head_roman_average_fringe = head_roman_average.addOrReplaceChild("head_roman_average_fringe", CubeListBuilder.create(), PartPose.offset(0.0F, -1.8771F, -2.2346F));

            PartDefinition cube_r7 = head_roman_average_fringe.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(963, 94).addBox(-1.0F, -4.0F, -2.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4735F, 1.3944F, -3.0578F, -1.5615F, 0.6653F, -1.5864F));

        } else if (type.equals("roman") && muscleMass.equals("muscular")) {
            PartDefinition head_roman_muscular = root.addOrReplaceChild("head_roman_muscular", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition head_roman_muscular_jaw = head_roman_muscular.addOrReplaceChild("head_roman_muscular_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 2.6816F, -0.7151F));

            PartDefinition head_jaw_individual = head_roman_muscular_jaw.addOrReplaceChild("head_jaw_individual", CubeListBuilder.create(), PartPose.offset(0.0F, -0.3084F, 0.1442F));

            PartDefinition cube_r1 = head_jaw_individual.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(951, 109).addBox(-5.9595F, -1.919F, -1.081F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0639F, 1.1962F, -0.8707F, 0.6545F, 0.0F, 0.0F));

            PartDefinition head_jaw_branch = head_roman_muscular_jaw.addOrReplaceChild("head_jaw_branch", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2088F, -0.3814F));

            PartDefinition cube_r2 = head_jaw_branch.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(951, 124).addBox(-2.08F, -3.24F, -1.84F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2017F, -0.4162F, 0.0016F, 2.1817F, 0.0F, 0.0F));

            PartDefinition head_roman_muscular_nose_bridge = head_roman_muscular.addOrReplaceChild("head_roman_muscular_nose_bridge", CubeListBuilder.create(), PartPose.offset(0.105F, 2.8086F, -4.1795F));

            PartDefinition cube_r3 = head_roman_muscular_nose_bridge.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(965, 124).addBox(-3.08F, -3.24F, -1.84F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.08F, -0.8028F, -0.1369F, 2.8798F, 0.0F, 0.0F));

            PartDefinition head_roman_muscular_forehead = head_roman_muscular.addOrReplaceChild("head_roman_muscular_forehead", CubeListBuilder.create(), PartPose.offset(0.0967F, -0.0065F, -2.402F));

            PartDefinition cube_r4 = head_roman_muscular_forehead.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(951, 117).addBox(-4.0524F, -4.0F, -3.0076F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0524F, -2.4136F, 0.6689F, 2.2253F, 0.0F, 0.0F));

            PartDefinition head_roman_muscular_muzzle = head_roman_muscular.addOrReplaceChild("head_roman_muscular_muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 4.648F, -4.5587F));

            PartDefinition head_roman_muscular_muzzle_individual = head_roman_muscular_muzzle.addOrReplaceChild("head_roman_muscular_muzzle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r5 = head_roman_muscular_muzzle_individual.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(969, 117).addBox(-2.4469F, -1.7862F, -3.7184F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9385F, -0.6534F, 0.7428F, 1.0036F, 0.0F, 0.0F));

            PartDefinition head_roman_muscular_mouth = head_roman_muscular_muzzle.addOrReplaceChild("head_roman_muscular_mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.6257F, 1.2514F));

            PartDefinition cube_r6 = head_roman_muscular_mouth.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(970, 110).addBox(-1.9832F, -0.6095F, -3.149F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4916F, 0.0616F, 0.564F, 0.9599F, 0.0F, 0.0F));

            PartDefinition head_roman_muscular_fringe = head_roman_muscular.addOrReplaceChild("head_roman_muscular_fringe", CubeListBuilder.create(), PartPose.offset(0.0F, -2.2346F, -1.5196F));

            PartDefinition cube_r7 = head_roman_muscular_fringe.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(963, 132).addBox(-1.0F, -4.0F, -2.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5628F, 1.5732F, -3.5941F, -1.5615F, 0.6653F, -1.5864F));
        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Head / " + type + " + " + muscleMass + ", Cancelling Generation...");
        }
        EquigenMod.LOGGER.info("Generated Head: Head / " + type + " / " + muscleMass);
        allParts.add("head_" + type + "_" + muscleMass);
        return root;
    }

    public static PartDefinition GenerateAll(PartDefinition root) {
        List<String> type = List.of("straight", "stocky", "dished", "roman");
        List<String> muscleMass = List.of("lean", "average", "muscular");

        for(String variable1 : type){
            for(String variable2 : muscleMass){
                root = Generate(root, variable1, variable2);
            }
        }
        return root;
    }
}
