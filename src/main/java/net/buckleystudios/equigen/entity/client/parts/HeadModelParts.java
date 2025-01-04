package net.buckleystudios.equigen.entity.client.parts;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class HeadModelParts {

    /* NECK */
    public static PartDefinition GenerateNeckEwedShort(PartDefinition root){
        PartDefinition neck = root.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(-1.7933F, 23.1598F, 1.7061F));

        PartDefinition neck_ewed_short2 = neck.addOrReplaceChild("neck_ewed_short2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = neck_ewed_short2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(74, 91).addBox(-3.08F, -4.0F, -2.92F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8903F, -7.0436F, -2.3097F, 0.9599F, 0.0F, 0.0F));

        PartDefinition cube_r2 = neck_ewed_short2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(58, 88).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1035F, 1.7231F, -3.5465F, 0.2618F, 0.0F, 0.0F));

        PartDefinition cube_r3 = neck_ewed_short2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9629F, -1.7806F, 1.4731F, 0.6109F, 0.0F, 0.0F));

        PartDefinition cube_r4 = neck_ewed_short2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(20, 86).addBox(-4.0F, -8.0F, -1.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4302F, 0.1251F, -1.162F, 0.6109F, 0.0F, 0.0F));

        PartDefinition top_mane = neck_ewed_short2.addOrReplaceChild("top_mane", CubeListBuilder.create(), PartPose.offset(0.4469F, -2.0559F, -1.8771F));

        PartDefinition top_mane_connector = top_mane.addOrReplaceChild("top_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r5 = top_mane_connector.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(109, 6).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3575F, -6.9721F, -2.0559F, -0.6109F, 0.0F, 0.0F));

        PartDefinition top_mane_connector2 = top_mane_connector.addOrReplaceChild("top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r6 = top_mane_connector2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(108, 19).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2346F, -6.9721F, -2.0559F, -0.6109F, 0.0F, 0.0F));

        PartDefinition top_mane_flow2 = top_mane_connector2.addOrReplaceChild("top_mane_flow2", CubeListBuilder.create(), PartPose.offset(2.4134F, -7.7765F, 0.0F));

        PartDefinition cube_r7 = top_mane_flow2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(55, 105).addBox(-1.0707F, -0.1476F, -2.1526F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.162F, -1.8771F, -0.4692F, -0.1069F, -0.417F));

        PartDefinition bottom_mane = top_mane.addOrReplaceChild("bottom_mane", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0615F, 1.7877F));

        PartDefinition bottom_mane_connector = bottom_mane.addOrReplaceChild("bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0615F, -1.7877F));

        PartDefinition cube_r8 = bottom_mane_connector.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(95, 103).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3575F, -6.7039F, -0.8939F, -0.9163F, 0.0F, 0.0F));

        PartDefinition bottom_mane_connector2 = bottom_mane_connector.addOrReplaceChild("bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r9 = bottom_mane_connector2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(95, 115).addBox(-2.0F, -2.0F, 1.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.324F, -6.7039F, -0.8939F, -0.9163F, 0.0F, 0.0F));

        PartDefinition bottom_mane_flow2 = bottom_mane_connector2.addOrReplaceChild("bottom_mane_flow2", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0615F, 1.7877F));

        PartDefinition cube_r10 = bottom_mane_flow2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(69, 104).addBox(-0.8139F, -0.0002F, -2.3921F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8603F, 1.7877F, 1.162F, -0.8901F, -0.0927F, -0.1377F));

        return root;
    }

    /* HEAD */
    public static PartDefinition GenerateHeadStraight(PartDefinition root) {
        PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.6993F, 18.905F, 3.8765F));

        PartDefinition straight_head = head.addOrReplaceChild("straight_head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0873F, 0.0F));

        PartDefinition cube_r1 = straight_head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 73).addBox(-3.08F, -4.0F, -1.92F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2646F, -3.0606F, -0.4004F, 2.2253F, 0.0F, 0.0F));

        PartDefinition cube_r2 = straight_head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 98).addBox(-3.0708F, -3.2124F, -1.8584F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7256F, 1.0938F, -1.8607F, 1.8326F, 0.0F, 0.0F));

        PartDefinition cube_r3 = straight_head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(70, 45).addBox(-3.08F, -3.24F, -1.84F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7115F, -0.6758F, -2.8675F, 2.2253F, 0.0F, 0.0F));

        PartDefinition cube_r4 = straight_head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(50, 41).addBox(-3.9595F, -1.919F, -2.081F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0709F, 1.7817F, -1.4229F, 0.3491F, 0.0F, 0.0F));

        PartDefinition fringe = straight_head.addOrReplaceChild("fringe", CubeListBuilder.create(), PartPose.offset(0.2682F, 4.9698F, 3.486F));

        PartDefinition cube_r5 = fringe.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(105, 76).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0894F, -8.2235F, -6.4358F, -1.5333F, 0.6643F, -1.5315F));

        PartDefinition muzzle = straight_head.addOrReplaceChild("muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 1.9665F, -4.5587F));

        PartDefinition cube_r6 = muzzle.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(26, 0).addBox(-1.4469F, -1.7862F, -3.7184F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, -0.8045F, 0.1788F, 0.7418F, 0.0F, 0.0F));

        PartDefinition mouth = muzzle.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2682F, -0.0873F, 0.0F, 0.0F));

        PartDefinition cube_r7 = mouth.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(26, 6).addBox(-1.9832F, -0.6095F, -3.149F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1788F, 0.7151F, 0.5363F, 0.7854F, 0.0F, 0.0F));

        return root;
    }

    /* EARS */
    public static PartDefinition GenerateEarsAverage(PartDefinition root) {
        PartDefinition ears = root.addOrReplaceChild("ears", CubeListBuilder.create(), PartPose.offset(-0.0628F, 24.2682F, 1.5371F));

        PartDefinition right_ear = ears.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-1.5196F, -0.6257F, 0.0747F));

        PartDefinition cube_r1 = right_ear.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(7, 0).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6257F, -0.5184F, -1.0726F, 0.7418F, 0.0F, 0.0F));

        PartDefinition cube_r2 = right_ear.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0894F, 0.4648F, 0.0F, 0.7854F, 0.0F, 0.0F));

        PartDefinition fringe = right_ear.addOrReplaceChild("fringe", CubeListBuilder.create(), PartPose.offset(1.6983F, 7.562F, 5.095F));

        PartDefinition cube_r3 = fringe.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(83, 89).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2682F, -8.0447F, -8.3128F, -1.5612F, 0.7089F, -1.5859F));

        PartDefinition left_ear = ears.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6089F, -0.876F, -0.3722F, 0.2182F, 0.0F, 0.0F));

        PartDefinition cube_r4 = left_ear.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4469F, -0.3575F, -0.4469F, 0.5236F, 0.0F, 0.0F));

        PartDefinition cube_r5 = left_ear.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(21, 19).addBox(-1.0F, -2.0384F, -0.6584F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0894F, -0.5363F, 0.1788F, 0.5236F, 0.0F, 0.0F));

        return root;
    }
}
