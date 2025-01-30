package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

import java.util.ArrayList;
import java.util.List;

public class EarsModelParts {
    private static List<String> allParts = new ArrayList<>();
    public static List<String> getAllParts(){
        return allParts;
    }
    public static PartDefinition Generate(PartDefinition partdefinition) {
        if (true) {
            PartDefinition ears = partdefinition.addOrReplaceChild("ears", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition right_ear = ears.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition right_ear_outer = right_ear.addOrReplaceChild("right_ear_outer", CubeListBuilder.create(), PartPose.offset(-0.0182F, -0.8697F, -0.5363F));

            PartDefinition cube_r1 = right_ear_outer.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 148).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.549F, 0.317F, 0.5236F, 0.0F, 0.0F));

            PartDefinition right_ear_inner = right_ear.addOrReplaceChild("right_ear_inner", CubeListBuilder.create(), PartPose.offset(0.0182F, -1.8529F, -1.0726F));

            PartDefinition cube_r2 = right_ear_inner.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 148).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.549F, 0.317F, 0.5236F, 0.0F, 0.0F));

            PartDefinition left_ear = ears.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition left_ear_outer = left_ear.addOrReplaceChild("left_ear_outer", CubeListBuilder.create(), PartPose.offset(-0.0182F, -0.8697F, -0.5363F));

            PartDefinition cube_r3 = left_ear_outer.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 144).addBox(-1.0F, -2.0384F, -0.6584F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.387F, 0.4064F, 0.5236F, 0.0F, 0.0F));

            PartDefinition left_ear_inner = left_ear.addOrReplaceChild("left_ear_inner", CubeListBuilder.create(), PartPose.offset(0.0182F, -1.8529F, -1.0726F));

            PartDefinition cube_r4 = left_ear_inner.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(22, 148).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.549F, 0.317F, 0.5236F, 0.0F, 0.0F));

        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Ears, Cancelling Generation...");
        }
        allParts.add("ears");
        return partdefinition;
    }

    public static PartDefinition GenerateAll(PartDefinition root) {

        root = Generate(root);

        return root;
    }
}
