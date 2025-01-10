package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class HipsModelParts {
    public static PartDefinition Generate(PartDefinition root, String muscleMass, String size, int variation) {
        if (muscleMass.equals("lean") && size.equals("small") && variation == 1) {
            PartDefinition hips_lean_small_1 = root.addOrReplaceChild("hips_lean_small_1", CubeListBuilder.create().texOffs(0, 268).addBox(-3.3352F, -2.8603F, -1.8917F, 7.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                    .texOffs(0, 280).addBox(-3.7989F, -2.3575F, -1.3722F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = hips_lean_small_1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(28, 279).addBox(-4.08F, -5.24F, -4.36F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -1.6375F, 5.681F, 1.1781F, 0.0F, 0.0F));

            PartDefinition cube_r2 = hips_lean_small_1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(26, 268).addBox(-5.08F, -4.24F, -5.36F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -1.1012F, 4.6977F, 1.1781F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && size.equals("small") && variation == 2) {
            PartDefinition hips_lean_small_2 = root.addOrReplaceChild("hips_lean_small_2", CubeListBuilder.create().texOffs(54, 264).addBox(-3.1564F, -3.2346F, -3.0538F, 7.0F, 7.0F, 6.0F, new CubeDeformation(0.0F))
                    .texOffs(55, 277).addBox(-3.6201F, -2.6257F, -2.5342F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(12.6927F, 22.4358F, -10.6222F));

            PartDefinition cube_r1 = hips_lean_small_2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(82, 277).addBox(-4.08F, -5.24F, -4.36F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4098F, -1.9951F, 4.519F, 1.1781F, 0.0F, 0.0F));

            PartDefinition cube_r2 = hips_lean_small_2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(80, 266).addBox(-5.08F, -4.24F, -5.36F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4098F, -1.3694F, 3.5357F, 1.1781F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && size.equals("average") && variation == 1) {
            PartDefinition hips_lean_average_1 = root.addOrReplaceChild("hips_lean_average_1", CubeListBuilder.create().texOffs(104, 271).addBox(-3.4804F, -3.3073F, -3.6236F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
                    .texOffs(106, 285).addBox(-4.2123F, -2.5196F, -2.6236F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(1.2514F, 19.486F, -15.7172F));

            PartDefinition cube_r1 = hips_lean_average_1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(132, 285).addBox(-5.08F, -4.24F, -5.36F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4098F, -2.5314F, 4.6084F, 1.2217F, 0.0F, 0.0F));

            PartDefinition cube_r2 = hips_lean_average_1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(132, 274).addBox(-5.08F, -4.24F, -5.36F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9629F, -1.9057F, 3.8039F, 1.2217F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && size.equals("average") && variation == 2) {
            PartDefinition hips_lean_average_2 = root.addOrReplaceChild("hips_lean_average_2", CubeListBuilder.create().texOffs(158, 274).addBox(-3.3184F, -3.8771F, -3.7856F, 7.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
                    .texOffs(184, 289).addBox(-3.9441F, -2.8939F, -2.713F, 8.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.419F, -1.162F, -0.7898F));

            PartDefinition cube_r1 = hips_lean_average_2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(160, 289).addBox(-4.08F, -4.24F, -7.36F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4098F, -2.9783F, 3.9827F, 1.2217F, 0.0F, 0.0F));

            PartDefinition cube_r2 = hips_lean_average_2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(186, 276).addBox(-5.08F, -4.24F, -7.36F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4098F, -2.5314F, 3.5357F, 1.2217F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && size.equals("large") && variation == 1) {
            PartDefinition hips_lean_large_1 = root.addOrReplaceChild("hips_lean_large_1", CubeListBuilder.create().texOffs(0, 294).addBox(-6.7151F, -26.8492F, 3.8268F, 7.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                    .texOffs(32, 307).addBox(-7.3408F, -25.8659F, 4.7207F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.8603F, 22.5251F, -8.685F));

            PartDefinition cube_r1 = hips_lean_large_1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(8, 310).addBox(-4.08F, -4.24F, -7.36F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -25.9504F, 12.3102F, 1.2217F, 0.0F, 0.0F));

            PartDefinition cube_r2 = hips_lean_large_1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(30, 294).addBox(-5.08F, -4.24F, -7.36F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -25.5035F, 11.8632F, 1.2217F, 0.0F, 0.0F));

        } else if (muscleMass.equals("lean") && size.equals("large") && variation == 2) {
            PartDefinition hips_lean_large_2 = root.addOrReplaceChild("hips_lean_large_2", CubeListBuilder.create().texOffs(64, 295).addBox(-2.7821F, -4.6983F, -4.1431F, 7.0F, 9.0F, 8.0F, new CubeDeformation(0.0F))
                    .texOffs(94, 299).addBox(-3.4078F, -3.8045F, -3.0705F, 8.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-26.905F, -1.162F, -0.7898F));

            PartDefinition cube_r1 = hips_lean_large_2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(93, 312).addBox(-4.08F, -4.24F, -7.36F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9461F, -3.5146F, 4.7871F, 1.2217F, 0.0F, 0.0F));

            PartDefinition cube_r2 = hips_lean_large_2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(65, 312).addBox(-5.08F, -4.24F, -7.36F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9461F, -2.9783F, 4.072F, 1.2217F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && size.equals("small") && variation == 1) {
            PartDefinition hips_average_small_1 = root.addOrReplaceChild("hips_average_small_1", CubeListBuilder.create().texOffs(124, 303).addBox(-3.8883F, -2.8603F, -1.8917F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                    .texOffs(124, 315).addBox(-4.352F, -2.3575F, -1.3722F, 9.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = hips_average_small_1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(153, 314).addBox(-4.08F, -5.24F, -4.36F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -1.6375F, 5.681F, 1.1781F, 0.0F, 0.0F));

            PartDefinition cube_r2 = hips_average_small_1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(152, 303).addBox(-5.08F, -4.24F, -5.36F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2311F, -1.1012F, 4.6977F, 1.1781F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && size.equals("small") && variation == 2) {
            PartDefinition hips_average_small_2 = root.addOrReplaceChild("hips_average_small_2", CubeListBuilder.create().texOffs(174, 309).addBox(-3.5307F, -3.5028F, -3.0538F, 8.0F, 7.0F, 6.0F, new CubeDeformation(0.0F))
                    .texOffs(175, 322).addBox(-4.0838F, -2.6257F, -2.5342F, 9.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(12.6927F, 22.4358F, -10.6222F));

            PartDefinition cube_r1 = hips_average_small_2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(198, 317).addBox(-4.08F, -5.24F, -4.36F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4098F, -1.9951F, 4.519F, 1.1781F, 0.0F, 0.0F));

            PartDefinition cube_r2 = hips_average_small_2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(196, 304).addBox(-5.08F, -4.24F, -5.36F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4098F, -1.3694F, 3.5357F, 1.1781F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && size.equals("average") && variation == 1) {
            PartDefinition hips_average_average_1 = root.addOrReplaceChild("hips_average_average_1", CubeListBuilder.create().texOffs(0, 326).addBox(-4.0335F, -3.3073F, -3.6236F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
                    .texOffs(2, 340).addBox(-4.4972F, -2.5196F, -2.6236F, 9.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(1.2514F, 19.486F, -15.7172F));

            PartDefinition cube_r1 = hips_average_average_1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(30, 340).addBox(-5.08F, -4.24F, -5.36F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4098F, -2.5314F, 4.6084F, 1.2217F, 0.0F, 0.0F));

            PartDefinition cube_r2 = hips_average_average_1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(30, 329).addBox(-6.08F, -4.24F, -5.36F, 7.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4992F, -1.9057F, 3.8039F, 1.2217F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && size.equals("average") && variation == 2) {
            PartDefinition hips_average_average_2 = root.addOrReplaceChild("hips_average_average_2", CubeListBuilder.create().texOffs(58, 330).addBox(-3.7821F, -3.8771F, -3.7856F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
                    .texOffs(85, 345).addBox(-4.3184F, -2.8939F, -2.713F, 9.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.419F, -1.162F, -0.7898F));

            PartDefinition cube_r1 = hips_average_average_2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(61, 345).addBox(-4.08F, -4.24F, -7.36F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4098F, -2.9783F, 3.9827F, 1.2217F, 0.0F, 0.0F));

            PartDefinition cube_r2 = hips_average_average_2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(88, 332).addBox(-5.08F, -4.24F, -7.36F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4098F, -2.5314F, 3.5357F, 1.2217F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && size.equals("large") && variation == 1) {
            PartDefinition hips_average_large_1 = root.addOrReplaceChild("hips_average_large_1", CubeListBuilder.create().texOffs(119, 330).addBox(-4.3184F, -4.324F, -4.8582F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                    .texOffs(152, 343).addBox(-4.7654F, -3.3408F, -3.9644F, 9.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = hips_average_large_1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(128, 346).addBox(-4.08F, -4.24F, -7.36F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8735F, -3.4253F, 3.6251F, 1.2217F, 0.0F, 0.0F));

            PartDefinition cube_r2 = hips_average_large_1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(151, 330).addBox(-5.08F, -4.24F, -7.36F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8735F, -2.9783F, 3.1782F, 1.2217F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average") && size.equals("large") && variation == 2) {
            PartDefinition hips_average_large_2 = root.addOrReplaceChild("hips_average_large_2", CubeListBuilder.create().texOffs(0, 354).addBox(-3.3352F, -4.6983F, -4.1431F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.0F))
                    .texOffs(32, 358).addBox(-3.7821F, -3.8045F, -3.0705F, 9.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-26.905F, -1.162F, -0.7898F));

            PartDefinition cube_r1 = hips_average_large_2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(30, 371).addBox(-4.08F, -4.24F, -7.36F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9461F, -3.5146F, 4.7871F, 1.2217F, 0.0F, 0.0F));

            PartDefinition cube_r2 = hips_average_large_2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 371).addBox(-5.08F, -4.24F, -7.36F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9461F, -2.9783F, 4.072F, 1.2217F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && size.equals("small") && variation == 1) {
            PartDefinition hips_muscular_small_1 = root.addOrReplaceChild("hips_muscular_small_1", CubeListBuilder.create().texOffs(64, 360).addBox(-4.4413F, -2.8603F, -1.8917F, 9.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                    .texOffs(65, 372).addBox(-4.905F, -2.3575F, -1.3722F, 10.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = hips_muscular_small_1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(95, 371).addBox(-5.08F, -5.24F, -4.36F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7674F, -1.6375F, 5.681F, 1.1781F, 0.0F, 0.0F));

            PartDefinition cube_r2 = hips_muscular_small_1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(94, 360).addBox(-6.08F, -4.24F, -5.36F, 7.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8568F, -1.1012F, 4.6977F, 1.1781F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && size.equals("small") && variation == 2) {
            PartDefinition hips_muscular_small_2 = root.addOrReplaceChild("hips_muscular_small_2", CubeListBuilder.create().texOffs(122, 363).addBox(-3.9944F, -3.5028F, -3.0538F, 9.0F, 7.0F, 6.0F, new CubeDeformation(0.0F))
                    .texOffs(123, 376).addBox(-4.4581F, -2.6257F, -2.5342F, 10.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(12.6927F, 22.4358F, -10.6222F));

            PartDefinition cube_r1 = hips_muscular_small_2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(148, 371).addBox(-5.08F, -5.24F, -4.36F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9461F, -1.9951F, 4.519F, 1.1781F, 0.0F, 0.0F));

            PartDefinition cube_r2 = hips_muscular_small_2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(146, 358).addBox(-6.08F, -4.24F, -5.36F, 7.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9461F, -1.3694F, 3.5357F, 1.1781F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && size.equals("average") && variation == 1) {
            PartDefinition hips_muscular_average_1 = root.addOrReplaceChild("hips_muscular_average_1", CubeListBuilder.create().texOffs(0, 388).addBox(-4.5866F, -3.3073F, -3.6236F, 9.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
                    .texOffs(2, 402).addBox(-5.0503F, -2.2514F, -2.6236F, 10.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(1.2514F, 19.486F, -15.7172F));

            PartDefinition cube_r1 = hips_muscular_average_1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(32, 402).addBox(-5.08F, -4.24F, -5.36F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4098F, -2.5314F, 4.6084F, 1.2217F, 0.0F, 0.0F));

            PartDefinition cube_r2 = hips_muscular_average_1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(32, 391).addBox(-5.08F, -4.24F, -5.36F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9629F, -1.9057F, 3.8039F, 1.2217F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && size.equals("average") && variation == 2) {
            PartDefinition hips_muscular_average_2 = root.addOrReplaceChild("hips_muscular_average_2", CubeListBuilder.create().texOffs(59, 387).addBox(-4.2458F, -3.8771F, -3.7856F, 9.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
                    .texOffs(88, 402).addBox(-4.7821F, -2.8939F, -2.713F, 10.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = hips_muscular_average_2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(62, 402).addBox(-5.08F, -4.24F, -7.36F, 5.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9461F, -2.9783F, 3.9827F, 1.2217F, 0.0F, 0.0F));

            PartDefinition cube_r2 = hips_muscular_average_2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(91, 389).addBox(-6.08F, -4.24F, -7.36F, 7.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9461F, -2.5314F, 3.5357F, 1.2217F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && size.equals("large") && variation == 1) {
            PartDefinition hips_muscular_large_1 = root.addOrReplaceChild("hips_muscular_large_1", CubeListBuilder.create().texOffs(122, 388).addBox(-4.6034F, -4.324F, -4.8582F, 9.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                    .texOffs(150, 401).addBox(-5.2291F, -3.3408F, -3.9644F, 10.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = hips_muscular_large_1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(124, 404).addBox(-5.08F, -4.24F, -7.36F, 5.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3204F, -3.4253F, 3.6251F, 1.2217F, 0.0F, 0.0F));

            PartDefinition cube_r2 = hips_muscular_large_1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(156, 388).addBox(-6.08F, -4.24F, -7.36F, 7.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4098F, -2.9783F, 3.1782F, 1.2217F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular") && size.equals("large") && variation == 2) {
            PartDefinition hips_muscular_large_2 = root.addOrReplaceChild("hips_muscular_large_2", CubeListBuilder.create().texOffs(0, 415).addBox(-3.7989F, -4.6983F, -4.1431F, 9.0F, 9.0F, 8.0F, new CubeDeformation(0.0F))
                    .texOffs(34, 419).addBox(-4.3352F, -3.8045F, -3.0705F, 10.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-26.905F, -1.162F, -0.7898F));

            PartDefinition cube_r1 = hips_muscular_large_2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(32, 432).addBox(-5.08F, -4.24F, -7.36F, 5.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4825F, -3.5146F, 4.7871F, 1.2217F, 0.0F, 0.0F));

            PartDefinition cube_r2 = hips_muscular_large_2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 432).addBox(-6.08F, -4.24F, -7.36F, 7.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3931F, -2.9783F, 4.072F, 1.2217F, 0.0F, 0.0F));

        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Hips / " + muscleMass + " / " + size + ", Returning Null Value");
            return null;
        }
        return root;
    }
}
