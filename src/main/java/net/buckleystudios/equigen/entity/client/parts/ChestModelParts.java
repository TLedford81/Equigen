package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

import java.util.List;

public class ChestModelParts {
    public static PartDefinition Generate(PartDefinition root, String muscleMass, String size, int variation) {
        if (muscleMass.equals("lean") && size.equals("small") && variation == 1) {
            PartDefinition chest_lean_small_1 = root.addOrReplaceChild("chest_lean_small_1", CubeListBuilder.create().texOffs(15, 76).addBox(-3.5378F, -3.5754F, -3.4173F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
                    .texOffs(15, 64).addBox(-3.9121F, -2.9665F, -2.9704F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = chest_lean_small_1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(43, 67).addBox(-4.08F, -4.0F, -0.92F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5815F, -0.1974F, -5.2383F, -0.829F, 0.0F, 0.0F));

            PartDefinition cube_r2 = chest_lean_small_1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(43, 81).addBox(-3.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4921F, -1.8485F, 2.9158F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r3 = chest_lean_small_1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 74).addBox(-4.0708F, -7.7168F, -4.5652F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6038F, -1.9018F, 3.3354F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = chest_lean_small_1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(9, 62).addBox(-3.0792F, -7.6432F, -3.4848F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4957F, -0.807F, 2.4423F, 1.9199F, 0.0F, 0.0F));

            PartDefinition cube_r5 = chest_lean_small_1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(42, 73).addBox(-4.08F, -7.68F, -4.52F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5815F, -1.5374F, 2.6083F, 1.9199F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && size.equals("small") && variation == 2) {
            PartDefinition Chest_lean_small_2 = root.addOrReplaceChild("chest_lean_small_2", CubeListBuilder.create().texOffs(61, 80).addBox(-3.676F, -3.6112F, -3.7141F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
                    .texOffs(89, 84).addBox(-4.0503F, -2.5922F, -2.6772F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = Chest_lean_small_2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(66, 74).addBox(-4.08F, -4.0F, -0.92F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4266F, -0.1974F, -5.6066F, -0.829F, 0.0F, 0.0F));

            PartDefinition cube_r2 = Chest_lean_small_2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(94, 94).addBox(-3.08F, -7.68F, -3.52F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.516F, -1.2228F, 2.6726F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r3 = Chest_lean_small_2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(66, 94).addBox(-4.08F, -7.68F, -2.52F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4266F, -1.9379F, 2.9408F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = Chest_lean_small_2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(82, 94).addBox(-3.0792F, -7.6432F, -4.4848F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4239F, -1.6937F, 1.7945F, 1.9199F, 0.0F, 0.0F));

            PartDefinition cube_r5 = Chest_lean_small_2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(92, 75).addBox(-4.0892F, -7.6432F, -5.4748F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5133F, -2.5813F, 2.1988F, 1.9199F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && size.equals("average") && variation == 1) {
            PartDefinition chest_lean_average_1 = root.addOrReplaceChild("chest_lean_average_1", CubeListBuilder.create().texOffs(109, 87).addBox(-3.4804F, -4.3073F, -3.9476F, 7.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                    .texOffs(139, 91).addBox(-3.9441F, -3.0559F, -2.7856F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = chest_lean_average_1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(133, 103).addBox(-3.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6054F, -2.5636F, 2.3687F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r2 = chest_lean_average_1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(141, 81).addBox(-3.0708F, -7.7168F, -4.5652F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.555F, -2.7957F, 3.0565F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r3 = chest_lean_average_1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(149, 104).addBox(-3.08F, -7.68F, -3.52F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.516F, -0.286F, 1.9361F, 1.9199F, 0.0F, 0.0F));

            PartDefinition cube_r4 = chest_lean_average_1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(113, 103).addBox(-4.08F, -7.68F, -4.52F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6054F, -1.0011F, 2.3294F, 1.9199F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && size.equals("average") && variation == 2) {
            PartDefinition chest_lean_average_2 = root.addOrReplaceChild("chest_lean_average_2", CubeListBuilder.create().texOffs(1, 98).addBox(-3.3911F, -3.9497F, -4.037F, 7.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                    .texOffs(31, 101).addBox(-3.8547F, -3.0559F, -3.5007F, 8.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = chest_lean_average_2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 114).addBox(-3.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6947F, -2.206F, 2.2793F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r2 = chest_lean_average_2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(34, 91).addBox(-3.0708F, -7.7168F, -4.5652F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6444F, -2.4381F, 2.9672F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r3 = chest_lean_average_2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(23, 98).addBox(-3.08F, -7.68F, -3.52F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6054F, 0.0715F, 1.8467F, 1.9199F, 0.0F, 0.0F));

            PartDefinition cube_r4 = chest_lean_average_2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 114).addBox(-4.08F, -7.68F, -4.52F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6947F, -0.6436F, 2.24F, 1.9199F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && size.equals("large") && variation == 1) {
            PartDefinition chest_lean_large_1 = root.addOrReplaceChild("chest_lean_large_1", CubeListBuilder.create().texOffs(56, 108).addBox(-3.4972F, -4.5028F, -4.3219F, 7.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
                    .texOffs(88, 113).addBox(-3.9441F, -3.6983F, -2.8917F, 8.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = chest_lean_large_1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(93, 107).addBox(-4.08F, -4.0F, -0.92F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.516F, -0.4655F, -6.6792F, -0.829F, 0.0F, 0.0F));

            PartDefinition cube_r2 = chest_lean_large_1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(57, 126).addBox(-3.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6054F, -2.0273F, 1.743F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r3 = chest_lean_large_1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(73, 126).addBox(-2.5F, -2.0F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0325F, -0.1942F, -3.4647F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = chest_lean_large_1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(79, 109).addBox(-3.0792F, -7.6432F, -3.4848F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5831F, 0.3711F, 1.6527F, 1.9199F, 0.0F, 0.0F));

            PartDefinition cube_r5 = chest_lean_large_1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(93, 126).addBox(-4.08F, -7.68F, -4.52F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.516F, -0.1073F, 1.9718F, 1.9199F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && size.equals("large") && variation == 2) {
            PartDefinition chest_lean_large_2 = root.addOrReplaceChild("chest_lean_large_2", CubeListBuilder.create().texOffs(119, 116).addBox(-3.676F, -4.5028F, -4.5901F, 7.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
                    .texOffs(151, 120).addBox(-4.1229F, -3.6983F, -3.4281F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = chest_lean_large_2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(157, 114).addBox(-4.08F, -4.0F, -0.92F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3372F, -0.4655F, -6.9474F, -0.829F, 0.0F, 0.0F));

            PartDefinition cube_r2 = chest_lean_large_2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(139, 134).addBox(-3.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4266F, -2.0273F, 1.4749F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r3 = chest_lean_large_2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(119, 134).addBox(-2.5F, -2.0F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2113F, -0.1942F, -3.7329F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = chest_lean_large_2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(142, 117).addBox(-3.0792F, -7.6432F, -3.4848F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4043F, 0.3711F, 1.3845F, 1.9199F, 0.0F, 0.0F));

            PartDefinition cube_r5 = chest_lean_large_2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(155, 134).addBox(-4.08F, -7.68F, -4.52F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3372F, -0.1073F, 1.7037F, 1.9199F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && size.equals("small") && variation == 1) {
            PartDefinition chest_average_small_1 = root.addOrReplaceChild("chest_average_small_1", CubeListBuilder.create().texOffs(15, 148).addBox(-3.8227F, -3.5754F, -3.4173F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
                    .texOffs(15, 134).addBox(-4.2864F, -2.9665F, -2.9704F, 9.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = chest_average_small_1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(45, 137).addBox(-5.08F, -4.0F, -0.92F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1178F, -0.1974F, -5.2383F, -0.829F, 0.0F, 0.0F));

            PartDefinition cube_r2 = chest_average_small_1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(45, 151).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0284F, -1.8485F, 2.9158F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r3 = chest_average_small_1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 146).addBox(-5.0708F, -7.7168F, -4.5652F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1401F, -1.9018F, 3.3354F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = chest_average_small_1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(7, 133).addBox(-4.0792F, -7.6432F, -3.4848F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.032F, -0.807F, 2.4423F, 1.9199F, 0.0F, 0.0F));

            PartDefinition cube_r5 = chest_average_small_1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(42, 143).addBox(-5.08F, -7.68F, -4.52F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1178F, -1.5374F, 2.6083F, 1.9199F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && size.equals("small") && variation == 2) {
            PartDefinition Chest_average_small_2 = root.addOrReplaceChild("chest_average_small_2", CubeListBuilder.create().texOffs(63, 144).addBox(-4.1397F, -3.6112F, -3.7141F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
                    .texOffs(93, 148).addBox(-4.6034F, -2.5922F, -2.6772F, 9.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = Chest_average_small_2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(68, 138).addBox(-5.08F, -4.0F, -0.92F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9629F, -0.1974F, -5.6066F, -0.829F, 0.0F, 0.0F));

            PartDefinition cube_r2 = Chest_average_small_2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(100, 158).addBox(-4.08F, -7.68F, -3.52F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0523F, -1.2228F, 2.6726F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r3 = Chest_average_small_2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(68, 158).addBox(-5.08F, -7.68F, -2.52F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9629F, -1.9379F, 2.9408F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = Chest_average_small_2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(86, 158).addBox(-4.0792F, -7.6432F, -4.4848F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0496F, -1.6937F, 1.7945F, 1.9199F, 0.0F, 0.0F));

            PartDefinition cube_r5 = Chest_average_small_2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(94, 139).addBox(-5.0892F, -7.6432F, -5.4748F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9603F, -2.5813F, 2.1988F, 1.9199F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && size.equals("average") && variation == 1) {
            PartDefinition chest_average_average_1 = root.addOrReplaceChild("chest_average_average_1", CubeListBuilder.create().texOffs(120, 151).addBox(-4.0335F, -4.3073F, -3.9476F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                    .texOffs(152, 155).addBox(-4.5866F, -3.0559F, -2.7856F, 9.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = chest_average_average_1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(147, 167).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3204F, -2.5636F, 2.3687F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r2 = chest_average_average_1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(153, 145).addBox(-4.0708F, -7.7168F, -4.5652F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1807F, -2.7957F, 3.0565F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r3 = chest_average_average_1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(165, 167).addBox(-4.08F, -7.68F, -3.52F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3204F, -0.286F, 1.9361F, 1.9199F, 0.0F, 0.0F));

            PartDefinition cube_r4 = chest_average_average_1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(125, 167).addBox(-5.08F, -7.68F, -4.52F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -1.0011F, 2.3294F, 1.9199F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && size.equals("average") && variation == 2) {
            PartDefinition chest_average_average_2 = root.addOrReplaceChild("chest_average_average_2", CubeListBuilder.create().texOffs(0, 171).addBox(-3.9441F, -3.9497F, -4.037F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                    .texOffs(33, 174).addBox(-4.4078F, -3.0559F, -3.5007F, 9.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = chest_average_average_2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(22, 187).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4992F, -2.206F, 2.2793F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r2 = chest_average_average_2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 164).addBox(-4.0708F, -7.7168F, -4.5652F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3595F, -2.4381F, 2.9672F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r3 = chest_average_average_2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(24, 171).addBox(-4.08F, -7.68F, -3.52F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4992F, 0.0715F, 1.8467F, 1.9199F, 0.0F, 0.0F));

            PartDefinition cube_r4 = chest_average_average_2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 187).addBox(-5.08F, -7.68F, -4.52F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4098F, -0.6436F, 2.24F, 1.9199F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && size.equals("large") && variation == 1) {
            PartDefinition chest_average_large_1 = root.addOrReplaceChild("chest_average_large_1", CubeListBuilder.create().texOffs(67, 174).addBox(-4.0503F, -4.5028F, -4.3219F, 8.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
                    .texOffs(102, 179).addBox(-4.4972F, -3.6983F, -2.8917F, 9.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = chest_average_large_1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(105, 173).addBox(-5.08F, -4.0F, -0.92F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1417F, -0.4655F, -6.6792F, -0.829F, 0.0F, 0.0F));

            PartDefinition cube_r2 = chest_average_large_1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(69, 192).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -2.0273F, 1.743F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r3 = chest_average_large_1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(87, 192).addBox(-3.5F, -2.0F, -2.5F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5932F, -0.1942F, -3.4647F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = chest_average_large_1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(92, 175).addBox(-4.0792F, -7.6432F, -3.4848F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2088F, 0.3711F, 1.6527F, 1.9199F, 0.0F, 0.0F));

            PartDefinition cube_r5 = chest_average_large_1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(109, 192).addBox(-5.08F, -7.68F, -4.52F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1417F, -0.1073F, 1.9718F, 1.9199F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && size.equals("large") && variation == 2) {
            PartDefinition chest_average_large_2 = root.addOrReplaceChild("chest_average_large_2", CubeListBuilder.create().texOffs(134, 179).addBox(-4.1397F, -4.5028F, -4.5901F, 8.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
                    .texOffs(168, 183).addBox(-4.5866F, -3.6983F, -3.4281F, 9.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = chest_average_large_2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(173, 177).addBox(-5.08F, -4.0F, -0.92F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8735F, -0.4655F, -6.9474F, -0.829F, 0.0F, 0.0F));

            PartDefinition cube_r2 = chest_average_large_2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(156, 197).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8735F, -2.0273F, 1.4749F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r3 = chest_average_large_2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(134, 197).addBox(-3.5F, -2.0F, -2.5F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.325F, -0.1942F, -3.7329F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = chest_average_large_2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(159, 180).addBox(-4.0792F, -7.6432F, -3.4848F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9406F, 0.3711F, 1.3845F, 1.9199F, 0.0F, 0.0F));

            PartDefinition cube_r5 = chest_average_large_2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(174, 197).addBox(-5.08F, -7.68F, -4.52F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8735F, -0.1073F, 1.7037F, 1.9199F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && size.equals("small") && variation == 1) {
            PartDefinition chest_muscular_small_1 = root.addOrReplaceChild("chest_muscular_small_1", CubeListBuilder.create().texOffs(15, 214).addBox(-4.3758F, -3.5754F, -3.4173F, 9.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
                    .texOffs(15, 200).addBox(-4.8395F, -2.9665F, -2.9704F, 10.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = chest_muscular_small_1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(47, 203).addBox(-5.08F, -4.0F, -0.92F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1178F, -0.1974F, -5.2383F, -0.829F, 0.0F, 0.0F));

            PartDefinition cube_r2 = chest_muscular_small_1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(47, 217).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0284F, -1.8485F, 2.9158F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r3 = chest_muscular_small_1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 212).addBox(-5.0708F, -7.7168F, -4.5652F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1401F, -1.9018F, 3.3354F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = chest_muscular_small_1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(7, 199).addBox(-4.0792F, -7.6432F, -3.4848F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.032F, -0.807F, 2.4423F, 1.9199F, 0.0F, 0.0F));

            PartDefinition cube_r5 = chest_muscular_small_1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(43, 209).addBox(-5.08F, -7.68F, -4.52F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1178F, -1.5374F, 2.6083F, 1.9199F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && size.equals("small") && variation == 2) {
            PartDefinition chest_muscular_small_2 = root.addOrReplaceChild("chest_muscular_small_2", CubeListBuilder.create().texOffs(68, 209).addBox(-4.6034F, -3.6112F, -3.7141F, 9.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
                    .texOffs(100, 213).addBox(-5.1564F, -2.5922F, -2.6772F, 10.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = chest_muscular_small_2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(74, 203).addBox(-5.08F, -4.0F, -0.92F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9629F, -0.1974F, -5.6066F, -0.829F, 0.0F, 0.0F));

            PartDefinition cube_r2 = chest_muscular_small_2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(106, 223).addBox(-4.08F, -7.68F, -3.52F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0523F, -1.2228F, 2.6726F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r3 = chest_muscular_small_2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(74, 223).addBox(-5.08F, -7.68F, -2.52F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9629F, -1.9379F, 2.9408F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = chest_muscular_small_2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(92, 223).addBox(-4.0792F, -7.6432F, -4.4848F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0496F, -1.6937F, 1.7945F, 1.9199F, 0.0F, 0.0F));

            PartDefinition cube_r5 = chest_muscular_small_2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(100, 204).addBox(-5.0892F, -7.6432F, -5.4748F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9603F, -2.5813F, 2.1988F, 1.9199F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && size.equals("average") && variation == 1) {
            PartDefinition chest_muscular_average_1 = root.addOrReplaceChild("chest_muscular_average_1", CubeListBuilder.create().texOffs(132, 216).addBox(-4.3184F, -4.3073F, -3.9476F, 9.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                    .texOffs(166, 220).addBox(-4.8715F, -3.0559F, -2.7856F, 10.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = chest_muscular_average_1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(160, 232).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3204F, -2.5636F, 2.3687F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r2 = chest_muscular_average_1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(166, 210).addBox(-4.0708F, -7.7168F, -4.5652F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1807F, -2.7957F, 3.0565F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r3 = chest_muscular_average_1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(178, 232).addBox(-4.08F, -7.68F, -3.52F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3204F, -0.286F, 1.9361F, 1.9199F, 0.0F, 0.0F));

            PartDefinition cube_r4 = chest_muscular_average_1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(138, 232).addBox(-5.08F, -7.68F, -4.52F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -1.0011F, 2.3294F, 1.9199F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && size.equals("average") && variation == 2) {
            PartDefinition chest_muscular_average_2 = root.addOrReplaceChild("chest_muscular_average_2", CubeListBuilder.create().texOffs(0, 238).addBox(-4.5741F, -3.9497F, -4.037F, 9.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                    .texOffs(35, 241).addBox(-5.0378F, -3.0559F, -3.5007F, 10.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = chest_muscular_average_2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(23, 254).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1541F, -2.206F, 2.2793F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r2 = chest_muscular_average_2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(38, 231).addBox(-4.0708F, -7.7168F, -4.5652F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0144F, -2.4381F, 2.9672F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r3 = chest_muscular_average_2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(26, 238).addBox(-4.08F, -7.68F, -3.52F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1541F, 0.0715F, 1.8467F, 1.9199F, 0.0F, 0.0F));

            PartDefinition cube_r4 = chest_muscular_average_2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 254).addBox(-5.08F, -7.68F, -4.52F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0647F, -0.6436F, 2.24F, 1.9199F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && size.equals("large") && variation == 1) {
            PartDefinition chest_muscular_large_1 = root.addOrReplaceChild("chest_muscular_large_1", CubeListBuilder.create().texOffs(70, 234).addBox(-4.4246F, -4.5028F, -4.3219F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
                    .texOffs(107, 239).addBox(-4.9609F, -3.6983F, -2.8917F, 10.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = chest_muscular_large_1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(109, 233).addBox(-5.08F, -4.0F, -0.92F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1417F, -0.4655F, -6.6792F, -0.829F, 0.0F, 0.0F));

            PartDefinition cube_r2 = chest_muscular_large_1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(73, 252).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -2.0273F, 1.743F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r3 = chest_muscular_large_1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(91, 252).addBox(-3.5F, -2.0F, -2.5F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5932F, -0.1942F, -3.4647F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = chest_muscular_large_1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(97, 235).addBox(-4.0792F, -7.6432F, -3.4848F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2088F, 0.3711F, 1.6527F, 1.9199F, 0.0F, 0.0F));

            PartDefinition cube_r5 = chest_muscular_large_1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(113, 252).addBox(-5.08F, -7.68F, -4.52F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1417F, -0.1073F, 1.9718F, 1.9199F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && size.equals("large") && variation == 2) {
            PartDefinition chest_muscular_large_2 = root.addOrReplaceChild("chest_muscular_large_2", CubeListBuilder.create().texOffs(138, 244).addBox(-4.6927F, -4.5028F, -4.5901F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
                    .texOffs(174, 248).addBox(-5.2291F, -3.6983F, -3.4281F, 10.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = chest_muscular_large_2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(178, 242).addBox(-5.08F, -4.0F, -0.92F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8735F, -0.4655F, -6.9474F, -0.829F, 0.0F, 0.0F));

            PartDefinition cube_r2 = chest_muscular_large_2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(161, 262).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8735F, -2.0273F, 1.4749F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r3 = chest_muscular_large_2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(139, 262).addBox(-3.5F, -2.0F, -2.5F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.325F, -0.1942F, -3.7329F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r4 = chest_muscular_large_2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(165, 245).addBox(-4.0792F, -7.6432F, -3.4848F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9406F, 0.3711F, 1.3845F, 1.9199F, 0.0F, 0.0F));

            PartDefinition cube_r5 = chest_muscular_large_2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(179, 262).addBox(-5.08F, -7.68F, -4.52F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8735F, -0.1073F, 1.7037F, 1.9199F, 0.0F, 0.0F));
        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Chest / " + muscleMass + " / " + size + " / Variation " + variation + ", Cancelling Generation...");
        }
        return root;
    }

    public static PartDefinition GenerateAll(PartDefinition root){
        List<String> muscleMass = List.of("lean", "average", "muscular");
        List<String> size = List.of("small", "average", "large");

        for(String variable1 : muscleMass){
            for(String variable2 : size){
                root = Generate(root, variable1, variable2, 1);
                root = Generate(root, variable1, variable2, 2);
            }
        }
        return root;
    }
}
