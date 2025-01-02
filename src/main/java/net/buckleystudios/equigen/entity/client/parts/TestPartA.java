package net.buckleystudios.equigen.entity.client.parts;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class TestPartA {
    public static PartDefinition GeneratePartModel(PartDefinition root) {

        PartDefinition main = root.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition smeg = main.addOrReplaceChild("smeg", CubeListBuilder.create().texOffs(34, 0).addBox(-4.933F, -6.0F, 0.2179F, 7.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition booty = main.addOrReplaceChild("booty", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -13.0F, -3.0F, 7.0F, 13.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        return root;
    }
}