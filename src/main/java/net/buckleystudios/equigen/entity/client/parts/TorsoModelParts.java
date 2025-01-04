package net.buckleystudios.equigen.entity.client.parts;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class TorsoModelParts {
    /* CHEST */
    public static PartDefinition GenerateChestAverage(PartDefinition root){
        PartDefinition chest2 = root.addOrReplaceChild("chest2", CubeListBuilder.create().texOffs(0, 20).addBox(-7.0F, -6.648F, -1.8939F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(38, 0).addBox(-8.0894F, -5.8436F, -0.7318F, 10.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0447F, 19.7095F, -0.1115F));

        PartDefinition cube_r1 = chest2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(82, 78).addBox(-5.08F, -4.0F, -0.92F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -2.8789F, -4.2512F, -0.829F, 0.0F, 0.0F));

        PartDefinition cube_r2 = chest2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(89, 40).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -4.1725F, 3.6348F, 1.5708F, 0.0F, 0.0F));

        PartDefinition cube_r3 = chest2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(80, 57).addBox(-5.0708F, -7.7168F, -4.5652F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9645F, -4.4046F, 4.3226F, 1.5708F, 0.0F, 0.0F));

        PartDefinition cube_r4 = chest2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(90, 91).addBox(-4.0792F, -7.6432F, -3.4848F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0091F, -1.7741F, 3.2763F, 1.9199F, 0.0F, 0.0F));

        PartDefinition cube_r5 = chest2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(84, 12).addBox(-5.08F, -7.68F, -4.52F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -2.2525F, 3.8636F, 1.9199F, 0.0F, 0.0F));

        return root;
    }
    /* BACK */
    public static PartDefinition GenerateBackAverageLong(PartDefinition root){
        PartDefinition back = root.addOrReplaceChild("back", CubeListBuilder.create(), PartPose.offset(3.1678F, 19.2626F, -1.545F));

        PartDefinition back_average_long1 = back.addOrReplaceChild("back_average_long1", CubeListBuilder.create().texOffs(0, 0).addBox(-6.7687F, -5.1285F, -4.5754F, 7.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = back_average_long1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 70).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -5.878F, 4.4407F, 1.6581F, 0.0F, 0.0F));

        PartDefinition cube_r2 = back_average_long1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(38, 60).addBox(-5.08F, -7.24F, -5.52F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -5.1629F, 4.4407F, 1.6581F, 0.0F, 0.0F));

        return root;
    }
    /* WITHERS */
    public static PartDefinition GenerateWithersMedium(PartDefinition root){
        PartDefinition withers = root.addOrReplaceChild("withers", CubeListBuilder.create(), PartPose.offset(3.0776F, 20.9609F, -0.4005F));

        PartDefinition withers_medium = withers.addOrReplaceChild("withers_medium", CubeListBuilder.create(), PartPose.offset(0.0F, 23.1508F, 3.8436F));

        PartDefinition cube_r1 = withers_medium.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 37).addBox(-4.0792F, -6.9812F, -5.4648F, 4.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0091F, -27.3661F, -4.1867F, 1.2654F, 0.0F, 0.0F));

        PartDefinition cube_r2 = withers_medium.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(26, 31).addBox(-5.08F, -6.88F, -5.52F, 6.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -26.737F, -4.194F, 1.2654F, 0.0F, 0.0F));

        return root;
    }
    /* STOMACH */
    public static PartDefinition GenerateStomachAverage(PartDefinition root){
        PartDefinition stomach = root.addOrReplaceChild("stomach", CubeListBuilder.create(), PartPose.offset(3.2179F, 19.6201F, -9.7577F));

        PartDefinition stomach_average = stomach.addOrReplaceChild("stomach_average", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = stomach_average.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(70, 16).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1221F, -2.5958F, 15.3456F, 1.789F, 0.0F, 0.0F));

        PartDefinition cube_r2 = stomach_average.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 54).addBox(-5.08F, -7.24F, -5.52F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1221F, -3.0427F, 15.3456F, 1.789F, 0.0F, 0.0F));

        PartDefinition cube_r3 = stomach_average.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 80).addBox(-4.08F, -6.24F, -5.52F, 4.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1221F, -1.019F, 7.451F, 1.6144F, 0.0F, 0.0F));

        PartDefinition cube_r4 = stomach_average.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(62, 60).addBox(-5.0892F, -6.2676F, -5.4648F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1444F, -1.5263F, 7.4723F, 1.6144F, 0.0F, 0.0F));

        return root;
    }
    /* HIPS */
    public static PartDefinition GenerateHipsAverage(PartDefinition root){
        PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(3.0334F, 17.6536F, -1.2759F));

        PartDefinition hips_average = hips.addOrReplaceChild("hips_average", CubeListBuilder.create().texOffs(31, 13).addBox(-7.0F, -2.9832F, -2.5196F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(45, 49).addBox(-8.0F, -2.0F, -1.4469F, 10.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = hips_average.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(74, 0).addBox(-4.08F, -4.24F, -7.36F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -2.442F, 4.0867F, 1.3526F, 0.0F, 0.0F));

        PartDefinition cube_r2 = hips_average.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(50, 28).addBox(-5.08F, -4.24F, -7.36F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9868F, -1.6375F, 3.9973F, 1.3526F, 0.0F, 0.0F));

        return root;
    }
    /* TAIL */
    public static PartDefinition GenerateTailAverageMedium(PartDefinition root){
        PartDefinition tail = root.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(-0.1788F, 6.7486F, -2.5174F));

        PartDefinition tail_average_medium = tail.addOrReplaceChild("tail_average_medium", CubeListBuilder.create(), PartPose.offset(0.081F, 0.1788F, 0.2528F));

        PartDefinition tail_connector = tail_average_medium.addOrReplaceChild("tail_connector", CubeListBuilder.create(), PartPose.offset(-0.1788F, 2.6816F, -1.0726F));

        PartDefinition cube_r1 = tail_connector.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(90, 21).addBox(-1.0F, -1.2817F, 0.7157F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2682F, -2.5922F, 0.0894F, -0.2182F, 0.0F, 0.0F));

        PartDefinition tail_top = tail_connector.addOrReplaceChild("tail_top", CubeListBuilder.create(), PartPose.offset(0.0F, -2.2346F, 3.3966F));

        PartDefinition cube_r2 = tail_top.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(90, 66).addBox(-1.2682F, -1.4208F, -0.28F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0894F, 0.0F, 0.1788F, -1.3963F, 0.0F, 0.0F));

        PartDefinition tail_middle = tail_top.addOrReplaceChild("tail_middle", CubeListBuilder.create(), PartPose.offset(-0.7151F, 4.9162F, 1.3408F));

        PartDefinition cube_r3 = tail_middle.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(84, 27).addBox(-2.0F, -3.1616F, 0.2892F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4469F, -0.4469F, -0.8939F, -1.6144F, 0.0F, 0.0F));

        PartDefinition tail_bottom = tail_middle.addOrReplaceChild("tail_bottom", CubeListBuilder.create(), PartPose.offset(3.7542F, 20.2011F, -15.4637F));

        PartDefinition cube_r4 = tail_bottom.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(51, 76).addBox(-1.6257F, -1.0471F, -0.6463F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6816F, -14.3017F, 15.5531F, -1.6144F, 0.0F, 0.0F));

        return root;
    }
}
