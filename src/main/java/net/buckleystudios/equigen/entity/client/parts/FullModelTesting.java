package net.buckleystudios.equigen.entity.client.parts;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class FullModelTesting {
    public static PartDefinition Generate(PartDefinition root) {
        PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(3.2179F, 25.162F, 3.4714F));

        PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition body_front = torso.addOrReplaceChild("body_front", CubeListBuilder.create(), PartPose.offset(-3.2179F, -24.3128F, -10.4581F));

        PartDefinition chest = body_front.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0894F, 0.0894F));

        PartDefinition chest_front = chest.addOrReplaceChild("chest_front", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0726F, -3.8436F));

        PartDefinition chest_front_upper = chest_front.addOrReplaceChild("chest_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = chest_front_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 96).addBox(-4.08F, -7.68F, -4.52F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3204F, -3.6361F, 5.3331F, 1.5708F, 0.0F, 0.0F));

        PartDefinition chest_front_lower = chest_front.addOrReplaceChild("chest_front_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r2 = chest_front_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 107).addBox(-4.0792F, -7.6432F, -3.4848F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2981F, -1.2377F, 4.9746F, 1.9199F, 0.0F, 0.0F));

        PartDefinition chest_left = chest.addOrReplaceChild("chest_left", CubeListBuilder.create(), PartPose.offset(2.8604F, -0.5363F, 0.2682F));

        PartDefinition chest_left_pectoral_top = chest_left.addOrReplaceChild("chest_left_pectoral_top", CubeListBuilder.create(), PartPose.offset(0.0F, -2.5028F, -4.1117F));

        PartDefinition cube_r3 = chest_left_pectoral_top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(108, 71).addBox(-2.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.54F, 1.7691F, -2.5528F, -0.829F, 0.0F, 0.0F));

        PartDefinition chest_left_pectoral_middle = chest_left.addOrReplaceChild("chest_left_pectoral_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.2011F));

        PartDefinition cube_r4 = chest_left_pectoral_middle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(100, 20).addBox(-2.0708F, -7.7168F, -4.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5176F, -2.2594F, 6.1103F, 1.5708F, 0.0F, 0.0F));

        PartDefinition chest_left_pectoral_bottom = chest_left.addOrReplaceChild("chest_left_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(0.0F, 3.3073F, -2.2346F));

        PartDefinition cube_r5 = chest_left_pectoral_bottom.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(98, 37).addBox(-2.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.54F, -3.4145F, 3.6848F, 1.9199F, 0.0F, 0.0F));

        PartDefinition chest_left_deltoid_outer = chest_left.addOrReplaceChild("chest_left_deltoid_outer", CubeListBuilder.create().texOffs(76, 37).mirror().addBox(-2.6425F, -3.6983F, -3.1452F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition chest_left_deltoid_base = chest_left.addOrReplaceChild("chest_left_deltoid_base", CubeListBuilder.create().texOffs(38, 0).addBox(-2.5531F, -4.5028F, -4.3072F, 4.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition chest_right = chest.addOrReplaceChild("chest_right", CubeListBuilder.create(), PartPose.offset(-2.0559F, -0.0894F, -0.0894F));

        PartDefinition chest_right_pectoral_top = chest_right.addOrReplaceChild("chest_right_pectoral_top", CubeListBuilder.create(), PartPose.offset(0.0F, -2.8603F, -3.8436F));

        PartDefinition cube_r6 = chest_right_pectoral_top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(76, 109).addBox(-5.08F, -4.0F, -0.92F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3763F, 1.6797F, -2.4635F, -0.829F, 0.0F, 0.0F));

        PartDefinition chest_right_pectoral_middle = chest_right.addOrReplaceChild("chest_right_pectoral_middle", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2682F, -3.6648F));

        PartDefinition cube_r7 = chest_right_pectoral_middle.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(82, 100).addBox(-5.0708F, -7.7168F, -4.5652F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3987F, -2.4381F, 5.9315F, 1.5708F, 0.0F, 0.0F));

        PartDefinition chest_right_pectoral_bottom = chest_right.addOrReplaceChild("chest_right_pectoral_bottom", CubeListBuilder.create(), PartPose.offset(0.0F, 3.3073F, -2.2346F));

        PartDefinition cube_r8 = chest_right_pectoral_bottom.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(98, 46).addBox(-5.08F, -7.68F, -4.52F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3763F, -3.8615F, 4.0423F, 1.9199F, 0.0F, 0.0F));

        PartDefinition chest_right_deltoid_outer = chest_right.addOrReplaceChild("chest_right_deltoid_outer", CubeListBuilder.create().texOffs(76, 37).addBox(-2.7262F, -4.1453F, -2.7877F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition chest_right_deltoid_base = chest_right.addOrReplaceChild("chest_right_deltoid_base", CubeListBuilder.create().texOffs(0, 43).addBox(-1.6368F, -4.9498F, -3.9497F, 4.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition neck = body_front.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(0.1788F, -5.2201F, -2.7709F));

        PartDefinition neck_individual = neck.addOrReplaceChild("neck_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.3575F, 0.5363F));

        PartDefinition neck_crest = neck_individual.addOrReplaceChild("neck_crest", CubeListBuilder.create(), PartPose.offset(0.0F, -3.3788F, -0.8939F));

        PartDefinition neck_crest_upper = neck_crest.addOrReplaceChild("neck_crest_upper", CubeListBuilder.create(), PartPose.offset(0.0F, -3.4145F, -1.4302F));

        PartDefinition cube_r9 = neck_crest_upper.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(32, 107).addBox(-3.08F, -4.0F, -2.92F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8847F, 0.6436F, 0.6624F, 0.9599F, 0.0F, 0.0F));

        PartDefinition neck_crest_lower = neck_crest.addOrReplaceChild("neck_crest_lower", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0011F, -0.1788F));

        PartDefinition cube_r10 = neck_crest_lower.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(98, 108).addBox(-4.08F, -7.0F, -0.92F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9574F, 3.4932F, 3.1938F, 0.6109F, 0.0F, 0.0F));

        PartDefinition bone = neck_crest_lower.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 9.5642F, 0.5363F));

        PartDefinition neck_middle_individual = neck_individual.addOrReplaceChild("neck_middle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0726F, -0.6257F));

        PartDefinition cube_r11 = neck_middle_individual.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(90, 61).addBox(-4.0F, -8.0F, -1.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4246F, 2.0916F, 0.1118F, 0.6109F, 0.0F, 0.0F));

        PartDefinition neck_lower_individual = neck_individual.addOrReplaceChild("neck_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.4469F, -2.2346F));

        PartDefinition cube_r12 = neck_lower_individual.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(44, 95).addBox(-5.0784F, -8.0F, -0.9017F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0979F, 2.17F, -0.6637F, 0.2618F, 0.0F, 0.0F));

        PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1788F, -6.3106F, -2.5028F, -0.1309F, 0.0F, 0.0F));

        PartDefinition head_jaw = head.addOrReplaceChild("head_jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 1.6946F, -1.3293F));

        PartDefinition head_jaw_individual = head_jaw.addOrReplaceChild("head_jaw_individual", CubeListBuilder.create(), PartPose.offset(0.0F, -0.1788F, 0.0F));

        PartDefinition cube_r13 = head_jaw_individual.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(100, 29).addBox(-3.9595F, -1.919F, -2.081F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5021F, 0.6197F, -0.0345F, 0.3491F, 0.0F, 0.0F));

        PartDefinition head_jaw_branch = head_jaw.addOrReplaceChild("head_jaw_branch", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5363F, 0.0F));

        PartDefinition cube_r14 = head_jaw_branch.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(108, 62).addBox(-3.0708F, -3.2124F, -1.8584F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1568F, 0.2893F, -0.4723F, 1.8326F, 0.0F, 0.0F));

        PartDefinition head_nose_bridge = head.addOrReplaceChild("head_nose_bridge", CubeListBuilder.create(), PartPose.offset(0.0F, 0.175F, -2.2232F));

        PartDefinition cube_r15 = head_nose_bridge.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(108, 89).addBox(-3.08F, -3.24F, -1.84F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1427F, -0.497F, -0.5852F, 2.2253F, 0.0F, 0.0F));

        PartDefinition head_forehead = head.addOrReplaceChild("head_forehead", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6295F, 0.7266F));

        PartDefinition cube_r16 = head_forehead.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(108, 55).addBox(-3.08F, -4.0F, -1.92F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6957F, -2.0773F, -1.0679F, 2.2253F, 0.0F, 0.0F));

        PartDefinition muzzle = head.addOrReplaceChild("muzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 2.3203F, -4.4431F));

        PartDefinition muzzle_individual = muzzle.addOrReplaceChild("muzzle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.0894F));

        PartDefinition cube_r17 = muzzle_individual.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(110, 77).addBox(-1.4469F, -1.7862F, -3.7184F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0158F, -0.8045F, 0.3011F, 0.7418F, 0.0F, 0.0F));

        PartDefinition mouth = muzzle.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0726F, 0.6257F, -0.0873F, 0.0F, 0.0F));

        PartDefinition cube_r18 = mouth.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(110, 83).addBox(-1.9934F, -0.6134F, -3.1175F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5153F, -0.0956F, 0.3686F, 0.7854F, 0.0F, 0.0F));

        PartDefinition fringe = head.addOrReplaceChild("fringe", CubeListBuilder.create(), PartPose.offset(0.1788F, -3.2216F, -1.0465F));

        PartDefinition cube_r19 = fringe.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(44, 31).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4312F, 0.3218F, -1.8441F, -1.5333F, 0.6643F, -1.5315F));

        PartDefinition ears = head.addOrReplaceChild("ears", CubeListBuilder.create(), PartPose.offset(0.0F, -2.6675F, -0.8677F));

        PartDefinition right_ear = ears.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-1.7877F, 0.0F, 0.0F));

        PartDefinition right_ear_outer = right_ear.addOrReplaceChild("right_ear_outer", CubeListBuilder.create(), PartPose.offset(0.2682F, 0.0F, 0.0F));

        PartDefinition cube_r20 = right_ear_outer.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(62, 80).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0182F, 0.6793F, -0.2193F, 0.5236F, 0.0F, 0.0F));

        PartDefinition right_ear_inner = right_ear.addOrReplaceChild("right_ear_inner", CubeListBuilder.create(), PartPose.offset(0.2682F, 0.0F, 0.0F));

        PartDefinition cube_r21 = right_ear_inner.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(44, 71).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5182F, -0.3039F, -0.7556F, 0.5236F, 0.0F, 0.0F));

        PartDefinition left_ear = ears.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(1.8771F, 0.0F, 0.0F));

        PartDefinition left_ear_outer = left_ear.addOrReplaceChild("left_ear_outer", CubeListBuilder.create(), PartPose.offset(-0.0894F, 0.0F, 0.0F));

        PartDefinition cube_r22 = left_ear_outer.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(70, 25).addBox(-1.0F, -2.0384F, -0.6584F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0182F, -0.4827F, -0.1299F, 0.5236F, 0.0F, 0.0F));

        PartDefinition left_ear_inner = left_ear.addOrReplaceChild("left_ear_inner", CubeListBuilder.create(), PartPose.offset(-0.0894F, 0.0F, 0.0F));

        PartDefinition cube_r23 = left_ear_inner.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(48, 56).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5182F, -0.3039F, -0.7556F, 0.5236F, 0.0F, 0.0F));

        PartDefinition mane = neck.addOrReplaceChild("mane", CubeListBuilder.create(), PartPose.offset(-0.1788F, -5.8994F, 1.8771F));

        PartDefinition top_mane = mane.addOrReplaceChild("top_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, -2.4134F, -3.3743F));

        PartDefinition top_mane_connector = top_mane.addOrReplaceChild("top_mane_connector", CubeListBuilder.create(), PartPose.offset(0.1788F, -0.7151F, -0.1788F));

        PartDefinition top_mane_connector_individual = top_mane_connector.addOrReplaceChild("top_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(-0.9832F, 0.4469F, 0.0F));

        PartDefinition cube_r24 = top_mane_connector_individual.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(58, 110).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.162F, 0.8045F, -0.4469F, -0.6109F, 0.0F, 0.0F));

        PartDefinition top_mane_connector2 = top_mane_connector.addOrReplaceChild("top_mane_connector2", CubeListBuilder.create(), PartPose.offset(0.2682F, 0.0F, 0.8045F));

        PartDefinition top_mane_connector2_individual = top_mane_connector2.addOrReplaceChild("top_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r25 = top_mane_connector2_individual.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(90, 73).addBox(-2.0F, -2.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8771F, 1.2514F, -1.2514F, -0.6109F, 0.0F, 0.0F));

        PartDefinition top_mane_flow = top_mane_connector2.addOrReplaceChild("top_mane_flow", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6983F, -0.3575F, 0.0894F, -0.0873F, 0.0F, 0.0F));

        PartDefinition cube_r26 = top_mane_flow.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(48, 107).addBox(-1.0707F, -0.1476F, -1.1526F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8939F, -0.4463F, -0.7381F, -0.4276F, -0.2206F, -0.3514F));

        PartDefinition bottom_mane = mane.addOrReplaceChild("bottom_mane", CubeListBuilder.create(), PartPose.offset(0.6202F, 1.5196F, 0.1118F));

        PartDefinition bottom_mane_connector = bottom_mane.addOrReplaceChild("bottom_mane_connector", CubeListBuilder.create(), PartPose.offset(-0.8939F, 0.0F, 0.4469F));

        PartDefinition bottom_mane_connector_individual = bottom_mane_connector.addOrReplaceChild("bottom_mane_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r27 = bottom_mane_connector_individual.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(62, 92).addBox(-2.0F, -2.0F, -0.01F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2613F, -2.5856F, -3.2966F, -0.9163F, 0.0F, 0.0F));

        PartDefinition bottom_mane_connector2 = bottom_mane_connector.addOrReplaceChild("bottom_mane_connector2", CubeListBuilder.create(), PartPose.offset(1.162F, -0.7151F, 0.6257F));

        PartDefinition bottom_mane_connector2_individual = bottom_mane_connector2.addOrReplaceChild("bottom_mane_connector2_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r28 = bottom_mane_connector2_individual.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(94, 11).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0559F, -1.9665F, -3.933F, -0.9163F, 0.0F, 0.0F));

        PartDefinition bottom_mane_flow = bottom_mane_connector2.addOrReplaceChild("bottom_mane_flow", CubeListBuilder.create(), PartPose.offset(1.6983F, -0.2682F, -0.0894F));

        PartDefinition cube_r29 = bottom_mane_flow.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(44, 80).addBox(0.0677F, 0.1408F, -3.3483F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2682F, 0.0F, -0.8901F, -0.0927F, -0.1377F));

        PartDefinition front_left_leg = body_front.addOrReplaceChild("front_left_leg", CubeListBuilder.create(), PartPose.offset(2.7709F, 5.3631F, -1.9518F));

        PartDefinition top_front_left = front_left_leg.addOrReplaceChild("top_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6793F, 0.8434F));

        PartDefinition top_front_left_individual = top_front_left.addOrReplaceChild("top_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.4469F, 0.0F));

        PartDefinition top_front_left_front = top_front_left_individual.addOrReplaceChild("top_front_left_front", CubeListBuilder.create(), PartPose.offset(0.0F, 6.1676F, 0.2682F));

        PartDefinition cube_r30 = top_front_left_front.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(70, 13).addBox(-1.1442F, -2.0F, -2.02F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4863F, 0.952F, 1.789F, 0.0F, 0.0F));

        PartDefinition top_front_left_middle = top_front_left_individual.addOrReplaceChild("top_front_left_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 4.5587F, 0.1788F));

        PartDefinition cube_r31 = top_front_left_middle.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(88, 78).addBox(-1.1949F, -2.0F, -0.8316F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3575F, 2.4301F, 1.353F, 1.5708F, 0.0F, 0.0F));

        PartDefinition top_front_left_back = top_front_left_individual.addOrReplaceChild("top_front_left_back", CubeListBuilder.create(), PartPose.offset(0.0F, 6.1676F, 0.7508F));

        PartDefinition cube_r32 = top_front_left_back.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(76, 50).addBox(-0.8132F, -2.0F, -1.84F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0822F, 0.9316F, 1.4399F, 0.0F, 0.0F));

        PartDefinition knee_front_left = top_front_left.addOrReplaceChild("knee_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 8.2235F, 0.0F));

        PartDefinition knee_front_left_individual = knee_front_left.addOrReplaceChild("knee_front_left_individual", CubeListBuilder.create().texOffs(36, 98).addBox(-1.0F, -0.9464F, -0.8602F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.4469F));

        PartDefinition bottom_front_left = knee_front_left.addOrReplaceChild("bottom_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 1.2514F, -0.0894F));

        PartDefinition bottom_front_left_individual = bottom_front_left.addOrReplaceChild("bottom_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0894F, 0.5363F));

        PartDefinition cube_r33 = bottom_front_left_individual.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(98, 100).addBox(-1.0F, -0.9944F, -5.8912F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3933F, 0.1342F, 1.5708F, 0.0F, 0.0F));

        PartDefinition bottom_2_front_left = bottom_front_left.addOrReplaceChild("bottom_2_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 5.2737F, 0.1788F));

        PartDefinition bottom_2_front_left_individual = bottom_2_front_left.addOrReplaceChild("bottom_2_front_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2682F, -0.1788F));

        PartDefinition cube_r34 = bottom_2_front_left_individual.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(110, 108).addBox(-1.01F, -1.0168F, -2.6796F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0965F, 0.6607F, 1.1345F, 0.0F, 0.0F));

        PartDefinition hoof_front_left = bottom_2_front_left.addOrReplaceChild("hoof_front_left", CubeListBuilder.create().texOffs(0, 113).addBox(-1.0F, -0.248F, -1.8965F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0559F, -0.4469F));

        PartDefinition front_right_leg = body_front.addOrReplaceChild("front_right_leg", CubeListBuilder.create(), PartPose.offset(-1.895F, 4.505F, -0.9296F));

        PartDefinition top_front_right = front_right_leg.addOrReplaceChild("top_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1788F, 0.0894F));

        PartDefinition top_front_right_individual = top_front_right.addOrReplaceChild("top_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1788F, 0.0F));

        PartDefinition top_front_right_front = top_front_right_individual.addOrReplaceChild("top_front_right_front", CubeListBuilder.create(), PartPose.offset(0.0F, 5.1844F, -0.8045F));

        PartDefinition cube_r35 = top_front_right_front.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 73).addBox(-0.8558F, -2.0F, -2.02F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1609F, 1.7377F, 1.6671F, 1.789F, 0.0F, 0.0F));

        PartDefinition top_front_right_middle = top_front_right_individual.addOrReplaceChild("top_front_right_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 2.1453F, 0.0894F));

        PartDefinition cube_r36 = top_front_right_middle.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(86, 0).addBox(-0.8051F, -2.0F, -0.8316F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0715F, 5.1117F, 1.353F, 1.5708F, 0.0F, 0.0F));

        PartDefinition top_front_right_back = top_front_right_individual.addOrReplaceChild("top_front_right_back", CubeListBuilder.create(), PartPose.offset(0.0F, 5.8994F, 0.7151F));

        PartDefinition cube_r37 = top_front_right_back.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 85).addBox(-1.1868F, -2.0F, -1.84F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1609F, 0.6185F, 0.878F, 1.4399F, 0.0F, 0.0F));

        PartDefinition knee_front_right = top_front_right.addOrReplaceChild("knee_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 7.9553F, -0.1788F));

        PartDefinition knee_front_right_individual = knee_front_right.addOrReplaceChild("knee_front_right_individual", CubeListBuilder.create().texOffs(36, 102).addBox(-1.2503F, -0.3207F, -0.5027F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.4469F, -0.0894F));

        PartDefinition bottom_front_right = knee_front_right.addOrReplaceChild("bottom_front_right", CubeListBuilder.create(), PartPose.offset(0.1788F, 1.4838F, -0.0894F));

        PartDefinition bottom_front_right_individual = bottom_front_right.addOrReplaceChild("bottom_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0894F, -0.0894F));

        PartDefinition cube_r38 = bottom_front_right_individual.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(108, 0).addBox(-1.0F, -0.9944F, -5.8912F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2503F, -0.2682F, 0.5739F, 1.5708F, 0.0F, 0.0F));

        PartDefinition bottom_2_front_right = bottom_front_right.addOrReplaceChild("bottom_2_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 5.3989F, -0.1788F));

        PartDefinition bottom_2_front_right_individual = bottom_2_front_right.addOrReplaceChild("bottom_2_front_right_individual", CubeListBuilder.create(), PartPose.offset(0.0894F, 0.0894F, 0.0F));

        PartDefinition cube_r39 = bottom_2_front_right_individual.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(114, 41).addBox(-1.01F, -1.0168F, -2.6796F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2503F, -0.0965F, 0.6607F, 1.1345F, 0.0F, 0.0F));

        PartDefinition hoof_front_right = bottom_2_front_right.addOrReplaceChild("hoof_front_right", CubeListBuilder.create().texOffs(114, 36).addBox(-1.2503F, -0.5162F, -2.0753F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.1453F, -0.0894F));

        PartDefinition body_middle = torso.addOrReplaceChild("body_middle", CubeListBuilder.create(), PartPose.offset(-2.6816F, -24.7598F, -3.1285F));

        PartDefinition withers = body_middle.addOrReplaceChild("withers", CubeListBuilder.create(), PartPose.offset(-0.5363F, -3.3073F, -4.8268F));

        PartDefinition withers_lower = withers.addOrReplaceChild("withers_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0894F, -0.1788F));

        PartDefinition cube_r40 = withers_lower.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 20).addBox(-5.08F, -6.88F, -5.52F, 6.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3204F, -1.1727F, 1.9736F, 1.2654F, 0.0F, 0.0F));

        PartDefinition withers_upper = withers.addOrReplaceChild("withers_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.7151F));

        PartDefinition cube_r41 = withers_upper.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(24, 20).addBox(-4.0792F, -6.9812F, -5.4648F, 4.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2981F, -1.7125F, 1.087F, 1.2654F, 0.0F, 0.0F));

        PartDefinition stomach = body_middle.addOrReplaceChild("stomach", CubeListBuilder.create(), PartPose.offset(-0.5363F, 3.0391F, -4.2905F));

        PartDefinition stomach_front_upper = stomach.addOrReplaceChild("stomach_front_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 1.4302F, -2.4134F));

        PartDefinition stomach_front_upper_individual = stomach_front_upper.addOrReplaceChild("stomach_front_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0F, -0.3575F, -0.2682F));

        PartDefinition cube_r42 = stomach_front_upper_individual.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(24, 56).addBox(-5.0892F, -6.2676F, -5.4648F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2981F, -3.4928F, 2.5633F, 1.6144F, 0.0F, 0.0F));

        PartDefinition stomach_front_lower = stomach_front_upper.addOrReplaceChild("stomach_front_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8045F, 0.2682F));

        PartDefinition cube_r43 = stomach_front_lower.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(68, 78).addBox(-4.08F, -6.24F, -5.52F, 4.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3204F, -4.1475F, 2.0058F, 1.6144F, 0.0F, 0.0F));

        PartDefinition stomach_back_upper = stomach.addOrReplaceChild("stomach_back_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 1.7877F, 2.8603F));

        PartDefinition stomach_back_upper_individual = stomach_back_upper.addOrReplaceChild("stomach_back_upper_individual", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9832F, 0.2682F));

        PartDefinition cube_r44 = stomach_back_upper_individual.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(52, 47).addBox(-5.08F, -7.24F, -5.52F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3204F, -4.741F, 4.6266F, 1.789F, 0.0F, 0.0F));

        PartDefinition stomach_back_lower = stomach_back_upper.addOrReplaceChild("stomach_back_lower", CubeListBuilder.create(), PartPose.offset(0.0F, -0.3575F, -0.6257F));

        PartDefinition cube_r45 = stomach_back_lower.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(48, 63).addBox(-4.08F, -7.24F, -5.52F, 4.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3204F, -4.9198F, 5.5204F, 1.789F, 0.0F, 0.0F));

        PartDefinition back = body_middle.addOrReplaceChild("back", CubeListBuilder.create(), PartPose.offset(-0.5363F, 1.2514F, 0.0F));

        PartDefinition back_ribs = back.addOrReplaceChild("back_ribs", CubeListBuilder.create().texOffs(0, 0).addBox(-3.4615F, -5.0391F, -4.5901F, 7.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.1788F, 1.1767F));

        PartDefinition back_top_lower = back.addOrReplaceChild("back_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, -5.095F, 0.0F));

        PartDefinition back_top_lower_individual = back_top_lower.addOrReplaceChild("back_top_lower_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1788F, 0.0F));

        PartDefinition cube_r46 = back_top_lower_individual.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(52, 31).addBox(-5.08F, -7.24F, -5.52F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3204F, -0.3361F, 5.6027F, 1.6581F, 0.0F, 0.0F));

        PartDefinition back_top_upper = back_top_lower.addOrReplaceChild("back_top_upper", CubeListBuilder.create(), PartPose.offset(0.5363F, 11.9777F, 0.0F));

        PartDefinition cube_r47 = back_top_upper.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(24, 71).addBox(-1.7596F, -1.7147F, -4.9267F, 4.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5363F, -11.7774F, 0.1502F, 1.6581F, 0.0F, 0.0F));

        PartDefinition body_back = torso.addOrReplaceChild("body_back", CubeListBuilder.create(), PartPose.offset(-3.2179F, -23.5978F, 7.1508F));

        PartDefinition hips = body_back.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0726F, -0.7151F));

        PartDefinition left_hip = hips.addOrReplaceChild("left_hip", CubeListBuilder.create(), PartPose.offset(2.4134F, 0.0894F, 0.7151F));

        PartDefinition left_hip_glute_base = left_hip.addOrReplaceChild("left_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, -0.1788F, -0.9832F));

        PartDefinition left_hip_glute_base_individual = left_hip_glute_base.addOrReplaceChild("left_hip_glute_base_individual", CubeListBuilder.create().texOffs(68, 63).addBox(-2.1061F, -4.2346F, -3.7709F, 4.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0894F, 0.1788F));

        PartDefinition left_hip_glute_outer = left_hip_glute_base.addOrReplaceChild("left_hip_glute_outer", CubeListBuilder.create().texOffs(88, 89).mirror().addBox(-2.1061F, -3.3408F, -2.8771F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.3575F));

        PartDefinition right_hip = hips.addOrReplaceChild("right_hip", CubeListBuilder.create(), PartPose.offset(-2.1453F, -0.0894F, 0.0F));

        PartDefinition right_hip_glute_base = right_hip.addOrReplaceChild("right_hip_glute_base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0894F, 0.1788F));

        PartDefinition right_hip_glute_base_individual = right_hip_glute_base.addOrReplaceChild("right_hip_glute_base_individual", CubeListBuilder.create().texOffs(68, 63).addBox(-1.5474F, -4.324F, -3.8603F, 4.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.0894F, -0.1788F));

        PartDefinition right_hip_glute_outer = right_hip_glute_base.addOrReplaceChild("right_hip_glute_outer", CubeListBuilder.create().texOffs(88, 89).addBox(-2.5474F, -3.4302F, -2.7877F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -0.1788F));

        PartDefinition hips_top = hips.addOrReplaceChild("hips_top", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0391F, 0.7151F));

        PartDefinition hips_top_upper = hips_top.addOrReplaceChild("hips_top_upper", CubeListBuilder.create(), PartPose.offset(0.0F, -0.4469F, 0.0F));

        PartDefinition cube_r48 = hips_top_upper.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(76, 25).addBox(-4.08F, -4.24F, -7.36F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3204F, -0.3861F, 2.0308F, 1.3526F, 0.0F, 0.0F));

        PartDefinition hips_top_lower = hips_top.addOrReplaceChild("hips_top_lower", CubeListBuilder.create(), PartPose.offset(0.0F, 1.2514F, 0.0F));

        PartDefinition cube_r49 = hips_top_lower.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(24, 43).addBox(-5.08F, -4.24F, -7.36F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3204F, -1.28F, 1.9415F, 1.3526F, 0.0F, 0.0F));

        PartDefinition tail = body_back.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, -4.2011F, 2.324F));

        PartDefinition tail_connector = tail.addOrReplaceChild("tail_connector", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0894F, -0.2682F));

        PartDefinition tail_connector_individual = tail_connector.addOrReplaceChild("tail_connector_individual", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0894F, 0.0F));

        PartDefinition cube_r50 = tail_connector_individual.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(114, 46).addBox(-1.0F, -1.2817F, 0.7157F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4469F, 0.2682F, -0.3575F, -0.2182F, 0.0F, 0.0F));

        PartDefinition tail_top = tail_connector.addOrReplaceChild("tail_top", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5363F, 2.9497F));

        PartDefinition tail_top_individual = tail_top.addOrReplaceChild("tail_top_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r51 = tail_top_individual.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(18, 98).addBox(-1.2682F, -1.4208F, -0.28F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2682F, 0.0F, 0.1788F, -1.3963F, 0.0F, 0.0F));

        PartDefinition tail_middle = tail_top.addOrReplaceChild("tail_middle", CubeListBuilder.create(), PartPose.offset(0.0F, 4.9162F, 0.8939F));

        PartDefinition tail_middle_individual = tail_middle.addOrReplaceChild("tail_middle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.4469F));

        PartDefinition cube_r52 = tail_middle_individual.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(22, 87).addBox(-2.0F, -3.1616F, 0.2892F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0894F, -0.4469F, -0.8939F, -1.6144F, 0.0F, 0.0F));

        PartDefinition tail_bottom = tail_middle.addOrReplaceChild("tail_bottom", CubeListBuilder.create(), PartPose.offset(0.0F, 5.3631F, 0.0F));

        PartDefinition cube_r53 = tail_bottom.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(18, 98).addBox(-1.6257F, -1.0471F, -0.6463F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, 0.5363F, 0.5363F, -1.6144F, 0.0F, 0.0F));

        PartDefinition back_left_leg = body_back.addOrReplaceChild("back_left_leg", CubeListBuilder.create(), PartPose.offset(2.9497F, 3.0391F, -0.1788F));

        PartDefinition top_back_left = back_left_leg.addOrReplaceChild("top_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1788F, 0.4469F));

        PartDefinition top_back_left_individual = top_back_left.addOrReplaceChild("top_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0894F, -0.0894F));

        PartDefinition top_back_left_front = top_back_left_individual.addOrReplaceChild("top_back_left_front", CubeListBuilder.create(), PartPose.offset(0.0F, 6.0782F, 0.8939F));

        PartDefinition cube_r54 = top_back_left_front.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 60).addBox(-0.8556F, -3.0F, -1.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2682F, 1.0726F, 1.5809F, 1.8762F, 0.0F, 0.0F));

        PartDefinition top_back_left_back = top_back_left_individual.addOrReplaceChild("top_back_left_back", CubeListBuilder.create(), PartPose.offset(0.0F, 5.8994F, 2.2346F));

        PartDefinition cube_r55 = top_back_left_back.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(43, 17).addBox(-2.1444F, -1.0F, -2.92F, 3.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2682F, 0.2789F, -0.879F, 1.7453F, 0.0F, 0.0F));

        PartDefinition knee_back_left = top_back_left.addOrReplaceChild("knee_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 9.0279F, 1.9665F));

        PartDefinition knee_back_left_individual = knee_back_left.addOrReplaceChild("knee_back_left_individual", CubeListBuilder.create().texOffs(44, 37).addBox(-1.0894F, -0.8212F, -0.9853F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.3575F, -0.1788F));

        PartDefinition bottom_back_left = knee_back_left.addOrReplaceChild("bottom_back_left", CubeListBuilder.create(), PartPose.offset(0.0894F, 1.0726F, -0.6257F));

        PartDefinition bottom_back_left_individual = bottom_back_left.addOrReplaceChild("bottom_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0894F, 0.1788F));

        PartDefinition cube_r56 = bottom_back_left_individual.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 105).addBox(-1.0F, -0.9944F, -5.8912F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0894F, -0.4469F, 0.27F, 1.5708F, 0.0F, 0.0F));

        PartDefinition bottom_2_back_left = bottom_back_left.addOrReplaceChild("bottom_2_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 5.3631F, 0.0894F));

        PartDefinition bottom_2_back_left_individual = bottom_2_back_left.addOrReplaceChild("bottom_2_back_left_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.3575F, 0.0F));

        PartDefinition cube_r57 = bottom_2_back_left_individual.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(114, 8).addBox(-1.01F, -1.0168F, -2.6796F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0894F, -0.3289F, 0.3568F, 1.1345F, 0.0F, 0.0F));

        PartDefinition hoof_back_left = bottom_2_back_left.addOrReplaceChild("hoof_back_left", CubeListBuilder.create().texOffs(114, 13).addBox(-1.0894F, -0.3911F, -1.4853F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0559F, -0.9832F));

        PartDefinition back_right_leg = body_back.addOrReplaceChild("back_right_leg", CubeListBuilder.create(), PartPose.offset(-2.5922F, 3.8436F, 0.0F));

        PartDefinition top_back_right = back_right_leg.addOrReplaceChild("top_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, -0.8045F, -0.1788F));

        PartDefinition top_back_right_individual = top_back_right.addOrReplaceChild("top_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.3575F, 0.2682F));

        PartDefinition top_back_right_front = top_back_right_individual.addOrReplaceChild("top_back_right_front", CubeListBuilder.create(), PartPose.offset(0.0F, 5.7207F, 0.5363F));

        PartDefinition cube_r58 = top_back_right_front.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(62, 0).addBox(-1.1444F, -3.0F, -1.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0894F, 1.3408F, 2.0279F, 1.8762F, 0.0F, 0.0F));

        PartDefinition top_back_right_back = top_back_right_individual.addOrReplaceChild("top_back_right_back", CubeListBuilder.create(), PartPose.offset(0.0F, 5.5419F, 2.324F));

        PartDefinition cube_r59 = top_back_right_back.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(44, 17).addBox(-0.8556F, -1.0F, -2.92F, 3.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0894F, 0.547F, -0.879F, 1.7453F, 0.0F, 0.0F));

        PartDefinition knee_back_right = top_back_right.addOrReplaceChild("knee_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 9.5642F, 2.1453F));

        PartDefinition knee_back_right_individual = knee_back_right.addOrReplaceChild("knee_back_right_individual", CubeListBuilder.create().texOffs(62, 13).addBox(-0.9106F, -1.4469F, -0.8066F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bottom_back_right = knee_back_right.addOrReplaceChild("bottom_back_right", CubeListBuilder.create(), PartPose.offset(-0.0894F, 1.0726F, -0.1788F));

        PartDefinition bottom_back_right_individual = bottom_back_right.addOrReplaceChild("bottom_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0894F, -0.2682F));

        PartDefinition cube_r60 = bottom_back_right_individual.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(60, 102).addBox(-1.0F, -0.9944F, -5.8912F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0894F, -0.7151F, 0.6275F, 1.5708F, 0.0F, 0.0F));

        PartDefinition bottom_2_back_right = bottom_back_right.addOrReplaceChild("bottom_2_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 5.3631F, -0.0894F));

        PartDefinition bottom_2_back_right_individual = bottom_2_back_right.addOrReplaceChild("bottom_2_back_right_individual", CubeListBuilder.create(), PartPose.offset(0.0894F, 0.0F, -0.1788F));

        PartDefinition cube_r61 = bottom_2_back_right_individual.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(98, 55).addBox(-1.01F, -1.0168F, -2.6796F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0894F, -0.2396F, 0.6249F, 1.1345F, 0.0F, 0.0F));

        PartDefinition hoof_back_right = bottom_2_back_right.addOrReplaceChild("hoof_back_right", CubeListBuilder.create().texOffs(110, 113).addBox(-0.9106F, -0.3017F, -1.396F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.6983F, -0.9832F));

        return root;
    }
}
