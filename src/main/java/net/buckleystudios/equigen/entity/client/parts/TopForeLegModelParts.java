package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

import java.util.ArrayList;
import java.util.List;

public class TopForeLegModelParts {
    private static List<String> allParts = new ArrayList<>();
    public static List<String> getAllParts(){
        return allParts;
    }
    public static PartDefinition[] Generate(PartDefinition leftRoot, PartDefinition rightRoot, String thickness, String length, int variation) {
        if (thickness.equals("average") && length.equals("short") && variation == 1) {

            PartDefinition top_front_legs_average_short_1_top_front_right_individual = rightRoot.addOrReplaceChild("top_front_legs_average_short_1_top_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_short_1_top_front_right_front = top_front_legs_average_short_1_top_front_right_individual.addOrReplaceChild("top_front_legs_average_short_1_top_front_right_front", CubeListBuilder.create(), PartPose.offset(0.2152F, 2.2947F, -0.3889F));

            PartDefinition cube_r1 = top_front_legs_average_short_1_top_front_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(193, 180).addBox(-0.7848F, -1.0771F, -5.6637F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2152F, -3.1054F, -0.6095F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_short_1_top_front_right_middle = top_front_legs_average_short_1_top_front_right_individual.addOrReplaceChild("top_front_legs_average_short_1_top_front_right_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_short_1_top_front_right_back = top_front_legs_average_short_1_top_front_right_individual.addOrReplaceChild("top_front_legs_average_short_1_top_front_right_back", CubeListBuilder.create(), PartPose.offset(0.058F, 1.9171F, 0.4318F));

            PartDefinition cube_r2 = top_front_legs_average_short_1_top_front_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(193, 173).addBox(-0.942F, -1.0808F, -5.7678F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.058F, -3.2293F, 0.5066F, 1.4399F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_short_1_top_front_left_individual = leftRoot.addOrReplaceChild("top_front_legs_average_short_1_top_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_short_1_top_front_left_front = top_front_legs_average_short_1_top_front_left_individual.addOrReplaceChild("top_front_legs_average_short_1_top_front_left_front", CubeListBuilder.create(), PartPose.offset(-0.2152F, 2.2947F, -0.3889F));

            PartDefinition cube_r3 = top_front_legs_average_short_1_top_front_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(179, 173).mirror().addBox(-1.2152F, -1.0771F, -5.6637F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2152F, -3.1054F, -0.6095F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_short_1_top_front_left_middle = top_front_legs_average_short_1_top_front_left_individual.addOrReplaceChild("top_front_legs_average_short_1_top_front_left_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_short_1_top_front_left_back = top_front_legs_average_short_1_top_front_left_individual.addOrReplaceChild("top_front_legs_average_short_1_top_front_left_back", CubeListBuilder.create(), PartPose.offset(-0.058F, 1.9171F, 0.4318F));

            PartDefinition cube_r4 = top_front_legs_average_short_1_top_front_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(179, 180).mirror().addBox(-1.058F, -1.0808F, -5.7678F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.058F, -3.2293F, 0.5066F, 1.4399F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("short") && variation == 2) {

            PartDefinition top_front_legs_average_short_2_top_front_right_individual = rightRoot.addOrReplaceChild("top_front_legs_average_short_2_top_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_short_2_top_front_right_front = top_front_legs_average_short_2_top_front_right_individual.addOrReplaceChild("top_front_legs_average_short_2_top_front_right_front", CubeListBuilder.create(), PartPose.offset(-0.2152F, 2.4322F, -0.4971F));

            PartDefinition cube_r1 = top_front_legs_average_short_2_top_front_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(220, 184).mirror().addBox(-0.99F, -1.0771F, -5.6637F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.01F, -2.6173F, -0.5013F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_short_2_top_front_right_middle = top_front_legs_average_short_2_top_front_right_individual.addOrReplaceChild("top_front_legs_average_short_2_top_front_right_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_short_2_top_front_right_back = top_front_legs_average_short_2_top_front_right_individual.addOrReplaceChild("top_front_legs_average_short_2_top_front_right_back", CubeListBuilder.create(), PartPose.offset(-0.058F, 2.0471F, 0.4971F));

            PartDefinition cube_r2 = top_front_legs_average_short_2_top_front_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(220, 176).mirror().addBox(-1.058F, -1.0808F, -5.7678F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.058F, -2.7335F, 0.4414F, 1.4399F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_short_2_top_front_left_individual = leftRoot.addOrReplaceChild("top_front_legs_average_short_2_top_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_short_2_top_front_left_front = top_front_legs_average_short_2_top_front_left_individual.addOrReplaceChild("top_front_legs_average_short_2_top_front_left_front", CubeListBuilder.create(), PartPose.offset(0.2152F, 2.4322F, -0.4971F));

            PartDefinition cube_r3 = top_front_legs_average_short_2_top_front_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(204, 184).addBox(-0.7848F, -1.0771F, -5.6637F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2152F, -2.6173F, -0.5013F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_short_2_top_front_left_middle = top_front_legs_average_short_2_top_front_left_individual.addOrReplaceChild("top_front_legs_average_short_2_top_front_left_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_short_2_top_front_left_back = top_front_legs_average_short_2_top_front_left_individual.addOrReplaceChild("top_front_legs_average_short_2_top_front_left_back", CubeListBuilder.create(), PartPose.offset(0.058F, 2.0471F, 0.4971F));

            PartDefinition cube_r4 = top_front_legs_average_short_2_top_front_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(204, 176).addBox(-0.942F, -1.0808F, -5.7678F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.058F, -2.7335F, 0.4414F, 1.4399F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("short") && variation == 3) {

            PartDefinition top_front_legs_average_short_3_top_front_right_individual = rightRoot.addOrReplaceChild("top_front_legs_average_short_3_top_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_short_3_top_front_right_front = top_front_legs_average_short_3_top_front_right_individual.addOrReplaceChild("top_front_legs_average_short_3_top_front_right_front", CubeListBuilder.create(), PartPose.offset(0.5835F, 2.6008F, -0.279F));

            PartDefinition cube_r1 = top_front_legs_average_short_3_top_front_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(250, 171).mirror().addBox(-0.4165F, -2.0F, -2.02F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5835F, 1.2285F, 1.2966F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_short_3_top_front_right_middle = top_front_legs_average_short_3_top_front_right_individual.addOrReplaceChild("top_front_legs_average_short_3_top_front_right_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_short_3_top_front_right_back = top_front_legs_average_short_3_top_front_right_individual.addOrReplaceChild("top_front_legs_average_short_3_top_front_right_back", CubeListBuilder.create(), PartPose.offset(0.9145F, 2.1446F, 0.6398F));

            PartDefinition cube_r2 = top_front_legs_average_short_3_top_front_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(251, 180).mirror().addBox(-0.0855F, -2.0F, -1.84F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9145F, 1.2806F, 0.84F, 1.4399F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_short_3_top_front_left_individual = leftRoot.addOrReplaceChild("top_front_legs_average_short_3_top_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_short_3_top_front_left_front = top_front_legs_average_short_3_top_front_left_individual.addOrReplaceChild("top_front_legs_average_short_3_top_front_left_front", CubeListBuilder.create(), PartPose.offset(-0.5835F, 2.6008F, -0.279F));

            PartDefinition cube_r3 = top_front_legs_average_short_3_top_front_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(232, 171).addBox(-1.5835F, -2.0F, -2.02F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5835F, 1.2285F, 1.2966F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_short_3_top_front_left_middle = top_front_legs_average_short_3_top_front_left_individual.addOrReplaceChild("top_front_legs_average_short_3_top_front_left_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_short_3_top_front_left_back = top_front_legs_average_short_3_top_front_left_individual.addOrReplaceChild("top_front_legs_average_short_3_top_front_left_back", CubeListBuilder.create(), PartPose.offset(-0.9145F, 2.1446F, 0.6398F));

            PartDefinition cube_r4 = top_front_legs_average_short_3_top_front_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(233, 180).addBox(-1.9145F, -2.0F, -1.84F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9145F, 1.2806F, 0.84F, 1.4399F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("average") && variation == 1) {

            PartDefinition top_front_legs_average_average_1_top_front_right_individual = rightRoot.addOrReplaceChild("top_front_legs_average_average_1_top_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_average_1_top_front_right_front = top_front_legs_average_average_1_top_front_right_individual.addOrReplaceChild("top_front_legs_average_average_1_top_front_right_front", CubeListBuilder.create(), PartPose.offset(-0.1889F, 2.6971F, -0.6776F));

            PartDefinition cube_r1 = top_front_legs_average_average_1_top_front_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(281, 175).mirror().addBox(-1.1889F, -2.0F, -1.02F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1889F, 2.2048F, 1.5131F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_average_1_top_front_right_middle = top_front_legs_average_average_1_top_front_right_individual.addOrReplaceChild("top_front_legs_average_average_1_top_front_right_middle", CubeListBuilder.create(), PartPose.offset(0.1949F, 2.0153F, -0.108F));

            PartDefinition cube_r2 = top_front_legs_average_average_1_top_front_right_middle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(274, 184).mirror().addBox(-0.8051F, 0.0559F, -0.5299F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1949F, 1.9701F, -0.5559F, 1.5708F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_average_1_top_front_right_back = top_front_legs_average_average_1_top_front_right_individual.addOrReplaceChild("top_front_legs_average_average_1_top_front_right_back", CubeListBuilder.create(), PartPose.offset(0.2315F, 2.494F, 0.5882F));

            PartDefinition cube_r3 = top_front_legs_average_average_1_top_front_right_back.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(282, 184).mirror().addBox(-0.7685F, -1.6455F, -0.7933F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2315F, 2.272F, 0.352F, 1.4399F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_average_1_top_front_left_individual = leftRoot.addOrReplaceChild("top_front_legs_average_average_1_top_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_average_1_top_front_left_front = top_front_legs_average_average_1_top_front_left_individual.addOrReplaceChild("top_front_legs_average_average_1_top_front_left_front", CubeListBuilder.create(), PartPose.offset(0.1889F, 2.6971F, -0.6776F));

            PartDefinition cube_r4 = top_front_legs_average_average_1_top_front_left_front.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(263, 175).addBox(-0.8111F, -2.0F, -1.02F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1889F, 2.2048F, 1.5131F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_average_1_top_front_left_middle = top_front_legs_average_average_1_top_front_left_individual.addOrReplaceChild("top_front_legs_average_average_1_top_front_left_middle", CubeListBuilder.create(), PartPose.offset(-0.1949F, 2.0153F, -0.108F));

            PartDefinition cube_r5 = top_front_legs_average_average_1_top_front_left_middle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(274, 176).addBox(-1.1949F, 0.0559F, -0.5299F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1949F, 1.9701F, -0.5559F, 1.5708F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_average_1_top_front_left_back = top_front_legs_average_average_1_top_front_left_individual.addOrReplaceChild("top_front_legs_average_average_1_top_front_left_back", CubeListBuilder.create(), PartPose.offset(-0.2315F, 2.494F, 0.5882F));

            PartDefinition cube_r6 = top_front_legs_average_average_1_top_front_left_back.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(264, 184).addBox(-1.2315F, -1.6455F, -0.7933F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2315F, 2.272F, 0.352F, 1.4399F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("average") && variation == 2) {

            PartDefinition top_front_legs_average_average_2_top_front_right_individual = rightRoot.addOrReplaceChild("top_front_legs_average_average_2_top_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_average_2_top_front_right_front = top_front_legs_average_average_2_top_front_right_individual.addOrReplaceChild("top_front_legs_average_average_2_top_front_right_front", CubeListBuilder.create(), PartPose.offset(-0.1889F, 3.1853F, -0.5909F));

            PartDefinition cube_r1 = top_front_legs_average_average_2_top_front_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(314, 169).mirror().addBox(-1.1889F, -2.0F, -2.02F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1889F, 1.7166F, 1.4048F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_average_2_top_front_right_middle = top_front_legs_average_average_2_top_front_right_individual.addOrReplaceChild("top_front_legs_average_average_2_top_front_right_middle", CubeListBuilder.create(), PartPose.offset(0.1949F, 2.141F, -0.108F));

            PartDefinition cube_r2 = top_front_legs_average_average_2_top_front_right_middle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(306, 179).mirror().addBox(-0.8051F, -2.0F, 1.1684F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1949F, 4.1684F, 1.5F, 1.5708F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_average_2_top_front_right_back = top_front_legs_average_average_2_top_front_right_individual.addOrReplaceChild("top_front_legs_average_average_2_top_front_right_back", CubeListBuilder.create(), PartPose.offset(0.2315F, 2.7216F, 0.7696F));

            PartDefinition cube_r3 = top_front_legs_average_average_2_top_front_right_back.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(315, 179).mirror().addBox(-0.7685F, -2.0F, -1.84F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2315F, 1.7763F, 0.7748F, 1.4399F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_average_2_top_front_left_individual = leftRoot.addOrReplaceChild("top_front_legs_average_average_2_top_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_average_2_top_front_left_front = top_front_legs_average_average_2_top_front_left_individual.addOrReplaceChild("top_front_legs_average_average_2_top_front_left_front", CubeListBuilder.create(), PartPose.offset(0.1889F, 3.1853F, -0.5909F));

            PartDefinition cube_r4 = top_front_legs_average_average_2_top_front_left_front.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(294, 169).addBox(-0.8111F, -2.0F, -2.02F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1889F, 1.7166F, 1.4048F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_average_2_top_front_left_middle = top_front_legs_average_average_2_top_front_left_individual.addOrReplaceChild("top_front_legs_average_average_2_top_front_left_middle", CubeListBuilder.create(), PartPose.offset(-0.1949F, 2.141F, -0.108F));

            PartDefinition cube_r5 = top_front_legs_average_average_2_top_front_left_middle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(306, 170).addBox(-1.1949F, -2.0F, 1.1684F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1949F, 4.1684F, 1.5F, 1.5708F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_average_2_top_front_left_back = top_front_legs_average_average_2_top_front_left_individual.addOrReplaceChild("top_front_legs_average_average_2_top_front_left_back", CubeListBuilder.create(), PartPose.offset(-0.2315F, 2.7216F, 0.7696F));

            PartDefinition cube_r6 = top_front_legs_average_average_2_top_front_left_back.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(295, 179).addBox(-1.2315F, -2.0F, -1.84F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2315F, 1.7763F, 0.7748F, 1.4399F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("average") && variation == 3) {

            PartDefinition top_front_legs_average_average_3_top_front_right_individual = rightRoot.addOrReplaceChild("top_front_legs_average_average_3_top_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_average_3_top_front_right_front = top_front_legs_average_average_3_top_front_right_individual.addOrReplaceChild("top_front_legs_average_average_3_top_front_right_front", CubeListBuilder.create(), PartPose.offset(-0.1442F, 2.931F, -0.5597F));

            PartDefinition cube_r1 = top_front_legs_average_average_3_top_front_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(328, 184).mirror().addBox(-1.1442F, -2.0F, -0.02F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1442F, 3.6692F, 1.8377F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_average_3_top_front_right_middle = top_front_legs_average_average_3_top_front_right_individual.addOrReplaceChild("top_front_legs_average_average_3_top_front_right_middle", CubeListBuilder.create(), PartPose.offset(0.1949F, 2.1941F, 0.3026F));

            PartDefinition cube_r2 = top_front_legs_average_average_3_top_front_right_middle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(340, 183).mirror().addBox(-0.8051F, -2.0F, 0.1684F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1949F, 3.6684F, 1.0F, 1.5708F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_average_3_top_front_right_back = top_front_legs_average_average_3_top_front_right_individual.addOrReplaceChild("top_front_legs_average_average_3_top_front_right_back", CubeListBuilder.create(), PartPose.offset(0.1868F, 2.7133F, 0.7385F));

            PartDefinition cube_r3 = top_front_legs_average_average_3_top_front_right_back.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(351, 185).mirror().addBox(-0.8132F, -2.0F, -0.84F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1868F, 2.7678F, 0.6442F, 1.4399F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_average_3_top_front_left_individual = leftRoot.addOrReplaceChild("top_front_legs_average_average_3_top_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_average_3_top_front_left_front = top_front_legs_average_average_3_top_front_left_individual.addOrReplaceChild("top_front_legs_average_average_3_top_front_left_front", CubeListBuilder.create(), PartPose.offset(0.1442F, 2.931F, -0.5597F));

            PartDefinition cube_r4 = top_front_legs_average_average_3_top_front_left_front.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(328, 173).addBox(-0.8558F, -2.0F, -0.02F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1442F, 3.6692F, 1.8377F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_average_3_top_front_left_middle = top_front_legs_average_average_3_top_front_left_individual.addOrReplaceChild("top_front_legs_average_average_3_top_front_left_middle", CubeListBuilder.create(), PartPose.offset(-0.1949F, 2.1941F, 0.3026F));

            PartDefinition cube_r5 = top_front_legs_average_average_3_top_front_left_middle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(340, 172).addBox(-1.1949F, -2.0F, 0.1684F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1949F, 3.6684F, 1.0F, 1.5708F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_average_3_top_front_left_back = top_front_legs_average_average_3_top_front_left_individual.addOrReplaceChild("top_front_legs_average_average_3_top_front_left_back", CubeListBuilder.create(), PartPose.offset(-0.1868F, 2.7133F, 0.7385F));

            PartDefinition cube_r6 = top_front_legs_average_average_3_top_front_left_back.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(351, 174).addBox(-1.1868F, -2.0F, -0.84F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1868F, 2.7678F, 0.6442F, 1.4399F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("long") && variation == 1) {

            PartDefinition top_front_legs_average_long_1_top_front_right_individual = rightRoot.addOrReplaceChild("top_front_legs_average_long_1_top_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_long_1_top_front_right_front = top_front_legs_average_long_1_top_front_right_individual.addOrReplaceChild("top_front_legs_average_long_1_top_front_right_front", CubeListBuilder.create(), PartPose.offset(-0.1442F, 3.6943F, -0.4677F));

            PartDefinition cube_r1 = top_front_legs_average_long_1_top_front_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(386, 178).mirror().addBox(-1.1442F, -2.0F, -0.02F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1442F, 4.1574F, 1.9459F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_long_1_top_front_right_middle = top_front_legs_average_long_1_top_front_right_individual.addOrReplaceChild("top_front_legs_average_long_1_top_front_right_middle", CubeListBuilder.create(), PartPose.offset(0.1949F, 3.6773F, 0.4813F));

            PartDefinition cube_r2 = top_front_legs_average_long_1_top_front_right_middle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(387, 168).mirror().addBox(-0.8051F, -2.0F, -0.8316F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1949F, 3.1684F, 1.0F, 1.5708F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_long_1_top_front_right_back = top_front_legs_average_long_1_top_front_right_individual.addOrReplaceChild("top_front_legs_average_long_1_top_front_right_back", CubeListBuilder.create(), PartPose.offset(0.1868F, 3.6478F, 1.004F));

            PartDefinition cube_r3 = top_front_legs_average_long_1_top_front_right_back.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(387, 168).mirror().addBox(-0.8132F, -2.0F, -0.84F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1868F, 3.2635F, 0.579F, 1.4399F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_long_1_top_front_left_individual = leftRoot.addOrReplaceChild("top_front_legs_average_long_1_top_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_long_1_top_front_left_front = top_front_legs_average_long_1_top_front_left_individual.addOrReplaceChild("top_front_legs_average_long_1_top_front_left_front", CubeListBuilder.create(), PartPose.offset(0.1442F, 3.6943F, -0.4677F));

            PartDefinition cube_r4 = top_front_legs_average_long_1_top_front_left_front.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(364, 178).addBox(-0.8558F, -2.0F, -0.02F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1442F, 4.1574F, 1.9459F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_long_1_top_front_left_middle = top_front_legs_average_long_1_top_front_left_individual.addOrReplaceChild("top_front_legs_average_long_1_top_front_left_middle", CubeListBuilder.create(), PartPose.offset(-0.1949F, 3.7667F, 0.4813F));

            PartDefinition cube_r5 = top_front_legs_average_long_1_top_front_left_middle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(365, 168).addBox(-1.1949F, -2.0F, -0.8316F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1949F, 3.1684F, 1.0F, 1.5708F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_long_1_top_front_left_back = top_front_legs_average_long_1_top_front_left_individual.addOrReplaceChild("top_front_legs_average_long_1_top_front_left_back", CubeListBuilder.create(), PartPose.offset(-0.1868F, 3.6478F, 1.004F));

            PartDefinition cube_r6 = top_front_legs_average_long_1_top_front_left_back.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(365, 168).addBox(-1.1868F, -2.0F, -0.84F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1868F, 3.2635F, 0.579F, 1.4399F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("long") && variation == 2) {

            PartDefinition top_front_legs_average_long_2_top_front_right_individual = rightRoot.addOrReplaceChild("top_front_legs_average_long_2_top_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_long_2_top_front_right_front = top_front_legs_average_long_2_top_front_right_individual.addOrReplaceChild("top_front_legs_average_long_2_top_front_right_front", CubeListBuilder.create(), PartPose.offset(-0.1442F, 4.1755F, -0.6303F));

            PartDefinition cube_r1 = top_front_legs_average_long_2_top_front_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(402, 171).addBox(-1.1442F, -2.0F, -2.02F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1442F, 2.6929F, 1.6213F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_long_2_top_front_right_middle = top_front_legs_average_long_2_top_front_right_individual.addOrReplaceChild("top_front_legs_average_long_2_top_front_right_middle", CubeListBuilder.create(), PartPose.offset(-0.1949F, 3.5349F, 0.3026F));

            PartDefinition cube_r2 = top_front_legs_average_long_2_top_front_right_middle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(429, 172).addBox(-1.1949F, -2.0F, -0.8316F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1949F, 3.6684F, 1.0F, 1.5708F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_long_2_top_front_right_back = top_front_legs_average_long_2_top_front_right_individual.addOrReplaceChild("top_front_legs_average_long_2_top_front_right_back", CubeListBuilder.create(), PartPose.offset(0.1868F, 3.6966F, 0.809F));

            PartDefinition cube_r3 = top_front_legs_average_long_2_top_front_right_back.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(416, 170).mirror().addBox(-0.8132F, -2.0F, -1.84F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1868F, 2.7678F, 0.6442F, 1.4399F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_long_2_top_front_left_individual = leftRoot.addOrReplaceChild("top_front_legs_average_long_2_top_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_long_2_top_front_left_front = top_front_legs_average_long_2_top_front_left_individual.addOrReplaceChild("top_front_legs_average_long_2_top_front_left_front", CubeListBuilder.create(), PartPose.offset(0.1442F, 4.1755F, -0.6303F));

            PartDefinition cube_r4 = top_front_legs_average_long_2_top_front_left_front.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(403, 184).addBox(-0.8558F, -2.0F, -2.02F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1442F, 2.6929F, 1.6213F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_long_2_top_front_left_middle = top_front_legs_average_long_2_top_front_left_individual.addOrReplaceChild("top_front_legs_average_long_2_top_front_left_middle", CubeListBuilder.create(), PartPose.offset(0.1949F, 3.5349F, 0.3026F));

            PartDefinition cube_r5 = top_front_legs_average_long_2_top_front_left_middle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(430, 185).mirror().addBox(-0.8051F, -2.0F, -0.8316F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1949F, 3.6684F, 1.0F, 1.5708F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_long_2_top_front_left_back = top_front_legs_average_long_2_top_front_left_individual.addOrReplaceChild("top_front_legs_average_long_2_top_front_left_back", CubeListBuilder.create(), PartPose.offset(-0.1868F, 3.6966F, 0.809F));

            PartDefinition cube_r6 = top_front_legs_average_long_2_top_front_left_back.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(417, 183).addBox(-1.1868F, -2.0F, -1.84F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1868F, 2.7678F, 0.6442F, 1.4399F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("long") && variation == 3) {

            PartDefinition top_front_legs_average_long_3_top_front_right_individual = rightRoot.addOrReplaceChild("top_front_legs_average_long_3_top_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_long_3_top_front_right_front = top_front_legs_average_long_3_top_front_right_individual.addOrReplaceChild("top_front_legs_average_long_3_top_front_right_front", CubeListBuilder.create(), PartPose.offset(-0.1655F, 3.8179F, -0.5409F));

            PartDefinition cube_r1 = top_front_legs_average_long_3_top_front_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(444, 164).mirror().addBox(-1.1655F, -2.0F, -2.02F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1655F, 2.6929F, 1.6213F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_long_3_top_front_right_middle = top_front_legs_average_long_3_top_front_right_individual.addOrReplaceChild("top_front_legs_average_long_3_top_front_right_middle", CubeListBuilder.create(), PartPose.offset(-0.1949F, 3.7137F, 0.4813F));

            PartDefinition cube_r2 = top_front_legs_average_long_3_top_front_right_middle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(471, 165).addBox(-1.1949F, -2.0F, -0.8316F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1949F, 3.6684F, 1.0F, 1.5708F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_long_3_top_front_right_back = top_front_legs_average_long_3_top_front_right_individual.addOrReplaceChild("top_front_legs_average_long_3_top_front_right_back", CubeListBuilder.create(), PartPose.offset(0.1655F, 3.786F, 1.0772F));

            PartDefinition cube_r3 = top_front_legs_average_long_3_top_front_right_back.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(458, 163).mirror().addBox(-0.8345F, -2.0F, -1.84F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1655F, 2.7678F, 0.6442F, 1.4399F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_long_3_top_front_left_individual = leftRoot.addOrReplaceChild("top_front_legs_average_long_3_top_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_long_3_top_front_left_front = top_front_legs_average_long_3_top_front_left_individual.addOrReplaceChild("top_front_legs_average_long_3_top_front_left_front", CubeListBuilder.create(), PartPose.offset(0.1442F, 3.8179F, -0.5409F));

            PartDefinition cube_r4 = top_front_legs_average_long_3_top_front_left_front.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(445, 177).addBox(-0.8558F, -2.0F, -2.02F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1442F, 2.6929F, 1.6213F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_long_3_top_front_left_middle = top_front_legs_average_long_3_top_front_left_individual.addOrReplaceChild("top_front_legs_average_long_3_top_front_left_middle", CubeListBuilder.create(), PartPose.offset(0.1949F, 3.7137F, 0.4813F));

            PartDefinition cube_r5 = top_front_legs_average_long_3_top_front_left_middle.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(472, 178).mirror().addBox(-0.8051F, -2.0F, -0.8316F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1949F, 3.6684F, 1.0F, 1.5708F, 0.0F, 0.0F));

            PartDefinition top_front_legs_average_long_3_top_front_left_back = top_front_legs_average_long_3_top_front_left_individual.addOrReplaceChild("top_front_legs_average_long_3_top_front_left_back", CubeListBuilder.create(), PartPose.offset(-0.1868F, 3.786F, 1.0772F));

            PartDefinition cube_r6 = top_front_legs_average_long_3_top_front_left_back.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(459, 176).addBox(-1.1868F, -2.0F, -1.84F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1868F, 2.7678F, 0.6442F, 1.4399F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("short") && variation == 1) {

            PartDefinition top_front_legs_thick_short_1_top_front_right_individual = rightRoot.addOrReplaceChild("top_front_legs_thick_short_1_top_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_short_1_top_front_right_front = top_front_legs_thick_short_1_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_short_1_top_front_right_front", CubeListBuilder.create(), PartPose.offset(-0.2152F, 1.9371F, -0.7464F));

            PartDefinition cube_r1 = top_front_legs_thick_short_1_top_front_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(193, 216).mirror().addBox(-1.2152F, -1.0771F, -5.6637F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2152F, -3.1054F, -0.6095F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_short_1_top_front_right_middle = top_front_legs_thick_short_1_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_short_1_top_front_right_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_short_1_top_front_right_back = top_front_legs_thick_short_1_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_short_1_top_front_right_back", CubeListBuilder.create(), PartPose.offset(-0.058F, 1.9412F, 0.5618F));

            PartDefinition cube_r2 = top_front_legs_thick_short_1_top_front_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(193, 208).mirror().addBox(-1.058F, -2.0808F, -5.7678F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.058F, -3.164F, 1.0023F, 1.4399F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_short_1_top_front_left_individual = leftRoot.addOrReplaceChild("top_front_legs_thick_short_1_top_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_short_1_top_front_left_front = top_front_legs_thick_short_1_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_short_1_top_front_left_front", CubeListBuilder.create(), PartPose.offset(0.2152F, 1.9371F, -0.7464F));

            PartDefinition cube_r3 = top_front_legs_thick_short_1_top_front_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(179, 216).addBox(-0.7848F, -1.0771F, -5.6637F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2152F, -3.1054F, -0.6095F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_short_1_top_front_left_middle = top_front_legs_thick_short_1_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_short_1_top_front_left_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_short_1_top_front_left_back = top_front_legs_thick_short_1_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_short_1_top_front_left_back", CubeListBuilder.create(), PartPose.offset(0.058F, 1.9412F, 0.5618F));

            PartDefinition cube_r4 = top_front_legs_thick_short_1_top_front_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(179, 208).addBox(-0.942F, -2.0808F, -5.7678F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.058F, -3.164F, 1.0023F, 1.4399F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("short") && variation == 2) {
            PartDefinition top_front_legs_thick_short_2_top_front_right_individual = rightRoot.addOrReplaceChild("top_front_legs_thick_short_2_top_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_short_2_top_front_right_front = top_front_legs_thick_short_2_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_short_2_top_front_right_front", CubeListBuilder.create(), PartPose.offset(-0.2152F, 2.3429F, -1.1228F));

            PartDefinition cube_r1 = top_front_legs_thick_short_2_top_front_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(220, 220).mirror().addBox(-1.2152F, -1.0771F, -5.6637F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2152F, -2.6173F, -0.5013F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_short_2_top_front_right_middle = top_front_legs_thick_short_2_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_short_2_top_front_right_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_short_2_top_front_right_back = top_front_legs_thick_short_2_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_short_2_top_front_right_back", CubeListBuilder.create(), PartPose.offset(-0.058F, 2.0712F, 0.3589F));

            PartDefinition cube_r2 = top_front_legs_thick_short_2_top_front_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(220, 211).mirror().addBox(-1.058F, -2.0808F, -5.7678F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.058F, -2.6683F, 0.9371F, 1.4399F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_short_2_top_front_left_individual = leftRoot.addOrReplaceChild("top_front_legs_thick_short_2_top_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_short_2_top_front_left_front = top_front_legs_thick_short_2_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_short_2_top_front_left_front", CubeListBuilder.create(), PartPose.offset(0.2152F, 2.3429F, -1.2122F));

            PartDefinition cube_r3 = top_front_legs_thick_short_2_top_front_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(204, 220).addBox(-0.7848F, -1.0771F, -5.6637F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2152F, -2.6173F, -0.5013F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_short_2_top_front_left_middle = top_front_legs_thick_short_2_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_short_2_top_front_left_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_short_2_top_front_left_back = top_front_legs_thick_short_2_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_short_2_top_front_left_back", CubeListBuilder.create(), PartPose.offset(0.058F, 2.0712F, 0.3589F));

            PartDefinition cube_r4 = top_front_legs_thick_short_2_top_front_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(204, 211).addBox(-0.942F, -2.0808F, -5.7678F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.058F, -2.6683F, 0.9371F, 1.4399F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("short") && variation == 3) {
            PartDefinition top_front_legs_thick_short_3_top_front_right_individual = rightRoot.addOrReplaceChild("top_front_legs_thick_short_3_top_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_short_3_top_front_right_front = top_front_legs_thick_short_3_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_short_3_top_front_right_front", CubeListBuilder.create(), PartPose.offset(0.5835F, 2.422F, -0.5472F));

            PartDefinition cube_r1 = top_front_legs_thick_short_3_top_front_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(250, 206).addBox(-0.4165F, -2.0F, -2.02F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5835F, 1.2285F, 1.2966F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_short_3_top_front_right_middle = top_front_legs_thick_short_3_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_short_3_top_front_right_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_short_3_top_front_right_back = top_front_legs_thick_short_3_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_short_3_top_front_right_back", CubeListBuilder.create(), PartPose.offset(0.9145F, 2.3475F, 0.6804F));

            PartDefinition cube_r2 = top_front_legs_thick_short_3_top_front_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(251, 215).addBox(-0.0855F, -3.0F, -1.84F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9145F, 1.3459F, 1.3358F, 1.4399F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_short_3_top_front_left_individual = leftRoot.addOrReplaceChild("top_front_legs_thick_short_3_top_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_short_3_top_front_left_front = top_front_legs_thick_short_3_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_short_3_top_front_left_front", CubeListBuilder.create(), PartPose.offset(-0.5835F, 2.422F, -0.5472F));

            PartDefinition cube_r3 = top_front_legs_thick_short_3_top_front_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(232, 206).addBox(-1.5835F, -2.0F, -2.02F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5835F, 1.2285F, 1.2966F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_short_3_top_front_left_middle = top_front_legs_thick_short_3_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_short_3_top_front_left_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_short_3_top_front_left_back = top_front_legs_thick_short_3_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_short_3_top_front_left_back", CubeListBuilder.create(), PartPose.offset(-0.9145F, 2.3475F, 0.6804F));

            PartDefinition cube_r4 = top_front_legs_thick_short_3_top_front_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(233, 215).addBox(-1.9145F, -3.0F, -1.84F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9145F, 1.3459F, 1.3358F, 1.4399F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("average") && variation == 1) {
            PartDefinition top_front_legs_thick_average_1_top_front_right_individual = rightRoot.addOrReplaceChild("top_front_legs_thick_average_1_top_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_average_1_top_front_right_front = top_front_legs_thick_average_1_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_average_1_top_front_right_front", CubeListBuilder.create(), PartPose.offset(-0.1889F, 2.6971F, -0.8564F));

            PartDefinition cube_r1 = top_front_legs_thick_average_1_top_front_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(282, 210).mirror().addBox(-1.1889F, -2.0F, -1.02F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1889F, 2.2048F, 1.5131F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_average_1_top_front_right_middle = top_front_legs_thick_average_1_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_average_1_top_front_right_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_average_1_top_front_right_back = top_front_legs_thick_average_1_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_average_1_top_front_right_back", CubeListBuilder.create(), PartPose.offset(0.2315F, 2.5115F, 0.3389F));

            PartDefinition cube_r2 = top_front_legs_thick_average_1_top_front_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(283, 219).mirror().addBox(-0.7685F, -2.6455F, -0.7933F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2315F, 2.2545F, 1.0482F, 1.5272F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_average_1_top_front_left_individual = leftRoot.addOrReplaceChild("top_front_legs_thick_average_1_top_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_average_1_top_front_left_front = top_front_legs_thick_average_1_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_average_1_top_front_left_front", CubeListBuilder.create(), PartPose.offset(0.1889F, 2.6971F, -0.8564F));

            PartDefinition cube_r3 = top_front_legs_thick_average_1_top_front_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(264, 210).addBox(-0.8111F, -2.0F, -1.02F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1889F, 2.2048F, 1.5131F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_average_1_top_front_left_middle = top_front_legs_thick_average_1_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_average_1_top_front_left_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_average_1_top_front_left_back = top_front_legs_thick_average_1_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_average_1_top_front_left_back", CubeListBuilder.create(), PartPose.offset(-0.2315F, 2.5115F, 0.3389F));

            PartDefinition cube_r4 = top_front_legs_thick_average_1_top_front_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(265, 219).addBox(-1.2315F, -2.6455F, -0.7933F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2315F, 2.2545F, 1.0482F, 1.5272F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("average") && variation == 2) {
            PartDefinition top_front_legs_thick_average_2_top_front_right_individual = rightRoot.addOrReplaceChild("top_front_legs_thick_average_2_top_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_average_2_top_front_right_front = top_front_legs_thick_average_2_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_average_2_top_front_right_front", CubeListBuilder.create(), PartPose.offset(-0.1889F, 3.1853F, -0.859F));

            PartDefinition cube_r1 = top_front_legs_thick_average_2_top_front_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(316, 204).mirror().addBox(-1.1889F, -2.0F, -2.02F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1889F, 1.7166F, 1.4048F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_average_2_top_front_right_middle = top_front_legs_thick_average_2_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_average_2_top_front_right_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_average_2_top_front_right_back = top_front_legs_thick_average_2_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_average_2_top_front_right_back", CubeListBuilder.create(), PartPose.offset(0.2315F, 2.774F, 0.3864F));

            PartDefinition cube_r2 = top_front_legs_thick_average_2_top_front_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(317, 214).mirror().addBox(-0.7685F, -3.0F, -1.84F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2315F, 1.7238F, 1.4262F, 1.5272F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_average_2_top_front_left_individual = leftRoot.addOrReplaceChild("top_front_legs_thick_average_2_top_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_average_2_top_front_left_front = top_front_legs_thick_average_2_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_average_2_top_front_left_front", CubeListBuilder.create(), PartPose.offset(0.1889F, 3.1853F, -0.859F));

            PartDefinition cube_r3 = top_front_legs_thick_average_2_top_front_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(296, 204).addBox(-0.8111F, -2.0F, -2.02F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1889F, 1.7166F, 1.4048F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_average_2_top_front_left_middle = top_front_legs_thick_average_2_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_average_2_top_front_left_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_average_2_top_front_left_back = top_front_legs_thick_average_2_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_average_2_top_front_left_back", CubeListBuilder.create(), PartPose.offset(-0.2315F, 2.774F, 0.3864F));

            PartDefinition cube_r4 = top_front_legs_thick_average_2_top_front_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(297, 214).addBox(-1.2315F, -3.0F, -1.84F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2315F, 1.7238F, 1.4262F, 1.5272F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("average") && variation == 3) {
            PartDefinition top_front_legs_thick_average_3_top_front_right_individual = rightRoot.addOrReplaceChild("top_front_legs_thick_average_3_top_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_average_3_top_front_right_front = top_front_legs_thick_average_3_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_average_3_top_front_right_front", CubeListBuilder.create(), PartPose.offset(-0.1442F, 3.0909F, -0.161F));

            PartDefinition cube_r1 = top_front_legs_thick_average_3_top_front_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(351, 219).mirror().addBox(-1.1442F, -2.0F, -0.02F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1442F, 3.7774F, 1.3496F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_average_3_top_front_right_middle = top_front_legs_thick_average_3_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_average_3_top_front_right_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_average_3_top_front_right_back = top_front_legs_thick_average_3_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_average_3_top_front_right_back", CubeListBuilder.create(), PartPose.offset(0.1868F, 2.9162F, 0.9579F));

            PartDefinition cube_r2 = top_front_legs_thick_average_3_top_front_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(352, 209).mirror().addBox(-0.8132F, -3.0F, -0.84F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1868F, 2.833F, 1.14F, 1.4399F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_average_3_top_front_left_individual = leftRoot.addOrReplaceChild("top_front_legs_thick_average_3_top_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_average_3_top_front_left_front = top_front_legs_thick_average_3_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_average_3_top_front_left_front", CubeListBuilder.create(), PartPose.offset(0.1442F, 3.0909F, -0.161F));

            PartDefinition cube_r3 = top_front_legs_thick_average_3_top_front_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(331, 219).addBox(-0.8558F, -2.0F, -0.02F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1442F, 3.7774F, 1.3496F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_average_3_top_front_left_middle = top_front_legs_thick_average_3_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_average_3_top_front_left_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_average_3_top_front_left_back = top_front_legs_thick_average_3_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_average_3_top_front_left_back", CubeListBuilder.create(), PartPose.offset(-0.1868F, 2.9162F, 0.9579F));

            PartDefinition cube_r4 = top_front_legs_thick_average_3_top_front_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(332, 209).addBox(-1.1868F, -3.0F, -0.84F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1868F, 2.833F, 1.14F, 1.4399F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("long") && variation == 1) {
            PartDefinition top_front_legs_thick_long_1_top_front_right_individual = rightRoot.addOrReplaceChild("top_front_legs_thick_long_1_top_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_long_1_top_front_right_front = top_front_legs_thick_long_1_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_long_1_top_front_right_front", CubeListBuilder.create(), PartPose.offset(-0.1442F, 3.3179F, -0.5159F));

            PartDefinition cube_r1 = top_front_legs_thick_long_1_top_front_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(387, 213).mirror().addBox(-1.1442F, -2.0F, -0.02F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1442F, 4.2656F, 1.4578F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_long_1_top_front_right_middle = top_front_legs_thick_long_1_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_long_1_top_front_right_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_long_1_top_front_right_back = top_front_legs_thick_long_1_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_long_1_top_front_right_back", CubeListBuilder.create(), PartPose.offset(0.1868F, 3.3644F, 0.7216F));

            PartDefinition cube_r2 = top_front_legs_thick_long_1_top_front_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(388, 202).mirror().addBox(-0.8132F, -3.0F, -0.84F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1868F, 3.2787F, 1.2189F, 1.4835F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_long_1_top_front_left_individual = leftRoot.addOrReplaceChild("top_front_legs_thick_long_1_top_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_long_1_top_front_left_front = top_front_legs_thick_long_1_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_long_1_top_front_left_front", CubeListBuilder.create(), PartPose.offset(0.1442F, 3.3179F, -0.5159F));

            PartDefinition cube_r3 = top_front_legs_thick_long_1_top_front_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(365, 213).addBox(-0.8558F, -2.0F, -0.02F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1442F, 4.2656F, 1.4578F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_long_1_top_front_left_middle = top_front_legs_thick_long_1_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_long_1_top_front_left_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_long_1_top_front_left_back = top_front_legs_thick_long_1_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_long_1_top_front_left_back", CubeListBuilder.create(), PartPose.offset(-0.1868F, 3.3644F, 0.7216F));

            PartDefinition cube_r4 = top_front_legs_thick_long_1_top_front_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(366, 202).addBox(-1.1868F, -3.0F, -0.84F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1868F, 3.2787F, 1.2189F, 1.4835F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("long") && variation == 2) {
            PartDefinition top_front_legs_thick_long_2_top_front_right_individual = rightRoot.addOrReplaceChild("top_front_legs_thick_long_2_top_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_long_2_top_front_right_front = top_front_legs_thick_long_2_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_long_2_top_front_right_front", CubeListBuilder.create(), PartPose.offset(-0.1442F, 4.5142F, -0.4997F));

            PartDefinition cube_r1 = top_front_legs_thick_long_2_top_front_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(426, 205).mirror().addBox(-1.1442F, -2.0F, -2.02F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1442F, 2.8011F, 1.1331F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_long_2_top_front_right_middle = top_front_legs_thick_long_2_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_long_2_top_front_right_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_long_2_top_front_right_back = top_front_legs_thick_long_2_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_long_2_top_front_right_back", CubeListBuilder.create(), PartPose.offset(0.1868F, 4.1307F, 0.9059F));

            PartDefinition cube_r2 = top_front_legs_thick_long_2_top_front_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(427, 218).mirror().addBox(-0.8132F, -3.0F, -1.84F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1868F, 2.7806F, 1.2625F, 1.4835F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_long_2_top_front_left_individual = leftRoot.addOrReplaceChild("top_front_legs_thick_long_2_top_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_long_2_top_front_left_front = top_front_legs_thick_long_2_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_long_2_top_front_left_front", CubeListBuilder.create(), PartPose.offset(0.1442F, 4.5142F, -0.4997F));

            PartDefinition cube_r3 = top_front_legs_thick_long_2_top_front_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(402, 205).addBox(-0.8558F, -2.0F, -2.02F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1442F, 2.8011F, 1.1331F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_long_2_top_front_left_middle = top_front_legs_thick_long_2_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_long_2_top_front_left_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_long_2_top_front_left_back = top_front_legs_thick_long_2_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_long_2_top_front_left_back", CubeListBuilder.create(), PartPose.offset(-0.1868F, 4.1307F, 0.9059F));

            PartDefinition cube_r4 = top_front_legs_thick_long_2_top_front_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(403, 218).addBox(-1.1868F, -3.0F, -1.84F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1868F, 2.7806F, 1.2625F, 1.4835F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("long") && variation == 3) {
            PartDefinition top_front_legs_thick_long_3_top_front_right_individual = rightRoot.addOrReplaceChild("top_front_legs_thick_long_3_top_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_long_3_top_front_right_front = top_front_legs_thick_long_3_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_long_3_top_front_right_front", CubeListBuilder.create(), PartPose.offset(-0.1442F, 3.7097F, -0.7678F));

            PartDefinition cube_r1 = top_front_legs_thick_long_3_top_front_right_front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(467, 200).mirror().addBox(-1.1442F, -2.0F, -2.02F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1442F, 2.8011F, 1.1331F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_long_3_top_front_right_middle = top_front_legs_thick_long_3_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_long_3_top_front_right_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_long_3_top_front_right_back = top_front_legs_thick_long_3_top_front_right_individual.addOrReplaceChild("top_front_legs_thick_long_3_top_front_right_back", CubeListBuilder.create(), PartPose.offset(0.1868F, 3.7731F, 0.7271F));

            PartDefinition cube_r2 = top_front_legs_thick_long_3_top_front_right_back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(468, 213).mirror().addBox(-0.8132F, -3.0F, -1.84F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1868F, 2.7806F, 1.2625F, 1.4835F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_long_3_top_front_left_individual = leftRoot.addOrReplaceChild("top_front_legs_thick_long_3_top_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_long_3_top_front_left_front = top_front_legs_thick_long_3_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_long_3_top_front_left_front", CubeListBuilder.create(), PartPose.offset(0.1442F, 3.7097F, -0.7678F));

            PartDefinition cube_r3 = top_front_legs_thick_long_3_top_front_left_front.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(443, 200).addBox(-0.8558F, -2.0F, -2.02F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1442F, 2.8011F, 1.1331F, 1.789F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_long_3_top_front_left_middle = top_front_legs_thick_long_3_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_long_3_top_front_left_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition top_front_legs_thick_long_3_top_front_left_back = top_front_legs_thick_long_3_top_front_left_individual.addOrReplaceChild("top_front_legs_thick_long_3_top_front_left_back", CubeListBuilder.create(), PartPose.offset(-0.1868F, 3.7731F, 0.7271F));

            PartDefinition cube_r4 = top_front_legs_thick_long_3_top_front_left_back.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(444, 213).addBox(-1.1868F, -3.0F, -1.84F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1868F, 2.7806F, 1.2625F, 1.4835F, 0.0F, 0.0F));

        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Top Forelegs / " + thickness + " / " + length + " / Variation " + variation + ", Cancelling Generation...");
        }

        allParts.add("top_front_legs_" + thickness + "_" + length + "_" + variation + "_top_front_right_individual");
        allParts.add("top_front_legs_" + thickness + "_" + length + "_" + variation + "_top_front_left_individual");

        return new PartDefinition[]{leftRoot, rightRoot};
    }

    public static PartDefinition[] GenerateAll(PartDefinition leftRoot, PartDefinition rightRoot) {
        List<String> thickness = List.of("average", "thick");
        List<String> length = List.of("short", "average", "long");

        PartDefinition[] roots;
        for(String variable1 : thickness){
            for(String variable2 : length){
                roots = Generate(leftRoot, rightRoot, variable1, variable2, 1);
                leftRoot = roots[0];
                rightRoot = roots[0];

                roots = Generate(leftRoot, rightRoot, variable1, variable2, 2);
                leftRoot = roots[0];
                rightRoot = roots[0];

                roots = Generate(leftRoot, rightRoot, variable1, variable2, 3);
                leftRoot = roots[0];
                rightRoot = roots[0];
            }
        }
        return new PartDefinition[]{leftRoot, rightRoot};
    }
}