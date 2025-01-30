package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

import java.util.ArrayList;
import java.util.List;

public class TailModelParts {
    private static List<String> allParts = new ArrayList<>();
    public static List<String> getAllParts(){
        return allParts;
    }
    public static PartDefinition Generate(PartDefinition partdefinition, String thickness, String length) {
        if (thickness.equals("thin") && length.equals("short")) {
            PartDefinition tail_thin_short = partdefinition.addOrReplaceChild("tail_thin_short", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition tail_thin_short_tail_connector = tail_thin_short.addOrReplaceChild("tail_thin_short_tail_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1788F, -0.0147F));

            PartDefinition tail_thin_short_tail_connector_rotator = tail_thin_short_tail_connector.addOrReplaceChild("tail_thin_short_tail_connector_rotator", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.5922F));

            PartDefinition cube_r1 = tail_thin_short_tail_connector_rotator.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(914, 636).addBox(-0.5531F, 0.0071F, -0.555F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5363F, -1.8771F, -0.2182F, 0.0F, 0.0F));

            PartDefinition tail_thin_short_tail_top = tail_thin_short_tail_connector.addOrReplaceChild("tail_thin_short_tail_top", CubeListBuilder.create(), PartPose.offset(0.4469F, 0.5363F, 2.0559F));

            PartDefinition tail_thin_short_tail_top_individual = tail_thin_short_tail_top.addOrReplaceChild("tail_thin_short_tail_top_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.1788F));

            PartDefinition cube_r2 = tail_thin_short_tail_top_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(903, 643).addBox(-1.0F, -1.0785F, 0.1082F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, -0.3575F, -0.2682F, -1.3963F, 0.0F, 0.0F));

            PartDefinition tail_thin_short_tail_middle = tail_thin_short_tail_top.addOrReplaceChild("tail_thin_short_tail_middle", CubeListBuilder.create(), PartPose.offset(-0.3575F, 4.8447F, 0.9832F));

            PartDefinition tail_thin_short_tail_middle_individual = tail_thin_short_tail_middle.addOrReplaceChild("tail_thin_short_tail_middle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = tail_thin_short_tail_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(903, 635).addBox(-1.0F, -0.9635F, -0.1495F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6257F, -0.0179F, 0.6257F, -1.6144F, 0.0F, 0.0F));

            PartDefinition tail_thin_short_tail_bottom = tail_thin_short_tail_middle.addOrReplaceChild("tail_thin_short_tail_bottom", CubeListBuilder.create(), PartPose.offset(0.0894F, 5.0771F, 0.0F));

            PartDefinition cube_r4 = tail_thin_short_tail_bottom.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(914, 642).addBox(-1.0F, -0.8391F, -0.9493F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2682F, 0.5363F, 0.0894F, -1.6144F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("average")) {
            PartDefinition tail_thin_average = partdefinition.addOrReplaceChild("tail_thin_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition tail_thin_average_tail_connector = tail_thin_average.addOrReplaceChild("tail_thin_average_tail_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1788F, -0.0147F));

            PartDefinition tail_thin_average_tail_connector_rotator = tail_thin_average_tail_connector.addOrReplaceChild("tail_thin_average_tail_connector_rotator", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.5922F));

            PartDefinition cube_r1 = tail_thin_average_tail_connector_rotator.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(954, 639).addBox(-0.5531F, 0.0071F, -0.555F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5363F, -1.8771F, -0.2182F, 0.0F, 0.0F));

            PartDefinition tail_thin_average_tail_top = tail_thin_average_tail_connector.addOrReplaceChild("tail_thin_average_tail_top", CubeListBuilder.create(), PartPose.offset(0.4469F, 0.1788F, 1.9665F));

            PartDefinition tail_thin_average_tail_top_individual = tail_thin_average_tail_top.addOrReplaceChild("tail_thin_average_tail_top_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0894F));

            PartDefinition cube_r2 = tail_thin_average_tail_top_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(943, 646).addBox(-1.0F, -1.0785F, 0.1082F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, 0.0F, -0.0894F, -1.3963F, 0.0F, 0.0F));

            PartDefinition tail_thin_average_tail_middle = tail_thin_average_tail_top.addOrReplaceChild("tail_thin_average_tail_middle", CubeListBuilder.create(), PartPose.offset(-0.3575F, 5.2022F, 1.0726F));

            PartDefinition tail_thin_average_tail_middle_individual = tail_thin_average_tail_middle.addOrReplaceChild("tail_thin_average_tail_middle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = tail_thin_average_tail_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(942, 637).addBox(-1.0F, -0.9635F, -0.1495F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6257F, -0.0179F, 0.6257F, -1.6144F, 0.0F, 0.0F));

            PartDefinition tail_thin_average_tail_bottom = tail_thin_average_tail_middle.addOrReplaceChild("tail_thin_average_tail_bottom", CubeListBuilder.create(), PartPose.offset(0.0894F, 5.6134F, 0.0F));

            PartDefinition cube_r4 = tail_thin_average_tail_bottom.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(954, 643).addBox(-1.0F, -0.8391F, -0.9493F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2682F, 0.5363F, 0.0894F, -1.6144F, 0.0F, 0.0F));

        } else if (thickness.equals("thin") && length.equals("long")) {
            PartDefinition tail_thin_long = partdefinition.addOrReplaceChild("tail_thin_long", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition tail_thin_long_tail_connector = tail_thin_long.addOrReplaceChild("tail_thin_long_tail_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1788F, -0.0147F));

            PartDefinition tail_thin_long_tail_connector_rotator = tail_thin_long_tail_connector.addOrReplaceChild("tail_thin_long_tail_connector_rotator", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.5922F));

            PartDefinition cube_r1 = tail_thin_long_tail_connector_rotator.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(996, 640).addBox(-0.5531F, 0.0071F, -0.555F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5363F, -1.8771F, -0.2182F, 0.0F, 0.0F));

            PartDefinition tail_thin_long_tail_top = tail_thin_long_tail_connector.addOrReplaceChild("tail_thin_long_tail_top", CubeListBuilder.create(), PartPose.offset(0.4469F, 0.8045F, 2.1453F));

            PartDefinition tail_thin_long_tail_top_individual = tail_thin_long_tail_top.addOrReplaceChild("tail_thin_long_tail_top_individual", CubeListBuilder.create(), PartPose.offset(0.0F, -0.3575F, 0.0894F));

            PartDefinition cube_r2 = tail_thin_long_tail_top_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(985, 647).addBox(-1.0F, -1.0785F, 0.1082F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, -0.2682F, -0.2682F, -1.3963F, 0.0F, 0.0F));

            PartDefinition tail_thin_long_tail_middle = tail_thin_long_tail_top.addOrReplaceChild("tail_thin_long_tail_middle", CubeListBuilder.create(), PartPose.offset(-0.3575F, 4.5765F, 0.8939F));

            PartDefinition tail_thin_long_tail_middle_individual = tail_thin_long_tail_middle.addOrReplaceChild("tail_thin_long_tail_middle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = tail_thin_long_tail_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(982, 636).addBox(-1.0F, -0.9635F, -0.1495F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6257F, -0.0179F, 0.6257F, -1.6144F, 0.0F, 0.0F));

            PartDefinition tail_thin_long_tail_bottom = tail_thin_long_tail_middle.addOrReplaceChild("tail_thin_long_tail_bottom", CubeListBuilder.create(), PartPose.offset(0.0894F, 8.0268F, -0.1788F));

            PartDefinition cube_r4 = tail_thin_long_tail_bottom.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(998, 644).addBox(-1.0F, -0.8391F, -0.9493F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2682F, 0.5363F, 0.0894F, -1.6144F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("short")) {
            PartDefinition tail_average_short = partdefinition.addOrReplaceChild("tail_average_short", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition tail_average_short_tail_connector = tail_average_short.addOrReplaceChild("tail_average_short_tail_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1788F, -0.0147F));

            PartDefinition tail_average_short_tail_connector_rotator = tail_average_short_tail_connector.addOrReplaceChild("tail_average_short_tail_connector_rotator", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.5922F));

            PartDefinition cube_r1 = tail_average_short_tail_connector_rotator.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(914, 666).addBox(-0.5531F, 0.0071F, -0.555F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, -0.5363F, -1.8771F, -0.2182F, 0.0F, 0.0F));

            PartDefinition tail_average_short_tail_top = tail_average_short_tail_connector.addOrReplaceChild("tail_average_short_tail_top", CubeListBuilder.create(), PartPose.offset(0.4469F, 0.7151F, 2.2346F));

            PartDefinition tail_average_short_tail_top_individual = tail_average_short_tail_top.addOrReplaceChild("tail_average_short_tail_top_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0894F, 0.0F));

            PartDefinition cube_r2 = tail_average_short_tail_top_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(901, 676).addBox(-1.0F, -2.0785F, 0.1082F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9832F, -0.6257F, -0.7151F, -1.3963F, 0.0F, 0.0F));

            PartDefinition tail_average_short_tail_middle = tail_average_short_tail_top.addOrReplaceChild("tail_average_short_tail_middle", CubeListBuilder.create(), PartPose.offset(-0.3575F, 4.6659F, 0.8045F));

            PartDefinition tail_average_short_tail_middle_individual = tail_average_short_tail_middle.addOrReplaceChild("tail_average_short_tail_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.4469F, 0.0F, 0.3575F));

            PartDefinition cube_r3 = tail_average_short_tail_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(901, 666).addBox(-1.0F, 0.0365F, -0.1495F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6257F, -0.0179F, 1.6089F, -1.6144F, 0.0F, 0.0F));

            PartDefinition tail_average_short_tail_bottom = tail_average_short_tail_middle.addOrReplaceChild("tail_average_short_tail_bottom", CubeListBuilder.create(), PartPose.offset(0.0894F, 5.0771F, 0.0F));

            PartDefinition cube_r4 = tail_average_short_tail_bottom.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(914, 674).addBox(-1.0F, -1.8391F, -0.9493F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6257F, 0.5363F, -0.5363F, -1.6144F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("average")) {
            PartDefinition tail_average_average = partdefinition.addOrReplaceChild("tail_average_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition tail_average_average_tail_connector = tail_average_average.addOrReplaceChild("tail_average_average_tail_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1788F, -0.0147F));

            PartDefinition tail_average_average_tail_connector_rotator = tail_average_average_tail_connector.addOrReplaceChild("tail_average_average_tail_connector_rotator", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.5922F));

            PartDefinition cube_r1 = tail_average_average_tail_connector_rotator.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(953, 666).addBox(-1.5531F, 0.0071F, -0.555F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5363F, -0.5363F, -1.8771F, -0.2182F, 0.0F, 0.0F));

            PartDefinition tail_average_average_tail_top = tail_average_average_tail_connector.addOrReplaceChild("tail_average_average_tail_top", CubeListBuilder.create(), PartPose.offset(0.4469F, 0.5363F, 2.2346F));

            PartDefinition tail_average_average_tail_top_individual = tail_average_average_tail_top.addOrReplaceChild("tail_average_average_tail_top_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.0894F));

            PartDefinition cube_r2 = tail_average_average_tail_top_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(940, 675).addBox(-1.0F, -2.0785F, 0.1082F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9832F, -0.3575F, -0.1788F, -1.3963F, 0.0F, 0.0F));

            PartDefinition tail_average_average_tail_middle = tail_average_average_tail_top.addOrReplaceChild("tail_average_average_tail_middle", CubeListBuilder.create(), PartPose.offset(-0.3575F, 4.8447F, 0.8045F));

            PartDefinition tail_average_average_tail_middle_individual = tail_average_average_tail_middle.addOrReplaceChild("tail_average_average_tail_middle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.6257F));

            PartDefinition cube_r3 = tail_average_average_tail_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(939, 665).addBox(-1.0F, -1.9635F, -0.1495F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.162F, -0.0179F, -0.0894F, -1.6144F, 0.0F, 0.0F));

            PartDefinition tail_average_average_tail_bottom = tail_average_average_tail_middle.addOrReplaceChild("tail_average_average_tail_bottom", CubeListBuilder.create(), PartPose.offset(0.0894F, 6.1497F, 0.0F));

            PartDefinition cube_r4 = tail_average_average_tail_bottom.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(953, 672).addBox(-2.0F, -1.8391F, -1.9493F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1788F, 1.4302F, -0.2682F, -1.6144F, 0.0F, 0.0F));

        } else if (thickness.equals("average") && length.equals("long")) {
            PartDefinition tail_average_long = partdefinition.addOrReplaceChild("tail_average_long", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition tail_average_long_tail_connector = tail_average_long.addOrReplaceChild("tail_average_long_tail_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1788F, -0.0147F));

            PartDefinition tail_average_long_tail_connector_rotator = tail_average_long_tail_connector.addOrReplaceChild("tail_average_long_tail_connector_rotator", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.5922F));

            PartDefinition tail_average_long_tail_connector_indiviudal = tail_average_long_tail_connector_rotator.addOrReplaceChild("tail_average_long_tail_connector_indiviudal", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.5922F));

            PartDefinition cube_r1 = tail_average_long_tail_connector_indiviudal.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(997, 668).addBox(-0.5531F, 0.0071F, -0.555F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, -0.5363F, 0.7151F, -0.2182F, 0.0F, 0.0F));

            PartDefinition tail_average_long_tail_top = tail_average_long_tail_connector.addOrReplaceChild("tail_average_long_tail_top", CubeListBuilder.create(), PartPose.offset(0.4469F, 0.9832F, 2.324F));

            PartDefinition tail_average_long_tail_top_individual = tail_average_long_tail_top.addOrReplaceChild("tail_average_long_tail_top_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.1788F));

            PartDefinition cube_r2 = tail_average_long_tail_top_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(984, 677).addBox(-1.0F, -2.0785F, 0.1082F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9832F, -0.8045F, -0.9832F, -1.3963F, 0.0F, 0.0F));

            PartDefinition tail_average_long_tail_middle = tail_average_long_tail_top.addOrReplaceChild("tail_average_long_tail_middle", CubeListBuilder.create(), PartPose.offset(-0.3575F, 4.3978F, 0.7151F));

            PartDefinition tail_average_long_tail_middle_individual = tail_average_long_tail_middle.addOrReplaceChild("tail_average_long_tail_middle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = tail_average_long_tail_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(981, 665).addBox(-1.0F, -0.9635F, -0.1495F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0726F, -0.0179F, 0.9832F, -1.6144F, 0.0F, 0.0F));

            PartDefinition tail_average_long_tail_bottom = tail_average_long_tail_middle.addOrReplaceChild("tail_average_long_tail_bottom", CubeListBuilder.create(), PartPose.offset(0.0894F, 8.0268F, -0.1788F));

            PartDefinition cube_r4 = tail_average_long_tail_bottom.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(999, 673).addBox(-1.0F, -1.8391F, -0.9493F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7151F, 0.5363F, -0.5363F, -1.6144F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("short")) {
            PartDefinition tail_thick_short = partdefinition.addOrReplaceChild("tail_thick_short", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition tail_thick_short_tail_connector = tail_thick_short.addOrReplaceChild("tail_thick_short_tail_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1788F, -0.0147F));

            PartDefinition tail_thick_short_tail_connector_rotator = tail_thick_short_tail_connector.addOrReplaceChild("tail_thick_short_tail_connector_rotator", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.5922F));

            PartDefinition cube_r1 = tail_thick_short_tail_connector_rotator.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(913, 697).addBox(-0.5531F, 0.0071F, -0.555F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, -0.5363F, -1.8771F, -0.2182F, 0.0F, 0.0F));

            PartDefinition tail_thick_short_tail_top = tail_thick_short_tail_connector.addOrReplaceChild("tail_thick_short_tail_top", CubeListBuilder.create(), PartPose.offset(0.4469F, 0.2682F, 1.9665F));

            PartDefinition tail_thick_short_tail_top_individual = tail_thick_short_tail_top.addOrReplaceChild("tail_thick_short_tail_top_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2682F, 0.2682F));

            PartDefinition cube_r2 = tail_thick_short_tail_top_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(898, 707).addBox(-1.0F, -2.0785F, 0.1082F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9832F, -0.3575F, -0.7151F, -1.3963F, 0.0F, 0.0F));

            PartDefinition tail_thick_short_tail_middle = tail_thick_short_tail_top.addOrReplaceChild("tail_thick_short_tail_middle", CubeListBuilder.create(), PartPose.offset(-0.3575F, 5.1128F, 1.0726F));

            PartDefinition tail_thick_short_tail_middle_individual = tail_thick_short_tail_middle.addOrReplaceChild("tail_thick_short_tail_middle_individual", CubeListBuilder.create(), PartPose.offset(-0.4469F, 0.0F, 0.3575F));

            PartDefinition cube_r3 = tail_thick_short_tail_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(898, 697).addBox(-1.0F, -0.9635F, -0.1495F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.162F, -0.0179F, 0.9832F, -1.6144F, 0.0F, 0.0F));

            PartDefinition tail_thick_short_tail_bottom = tail_thick_short_tail_middle.addOrReplaceChild("tail_thick_short_tail_bottom", CubeListBuilder.create(), PartPose.offset(0.0894F, 5.0771F, 0.0F));

            PartDefinition cube_r4 = tail_thick_short_tail_bottom.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(913, 705).addBox(-1.0F, -1.8391F, -0.9493F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6257F, 0.5363F, -0.5363F, -1.6144F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("average")) {
            PartDefinition tail_thick_long = partdefinition.addOrReplaceChild("tail_thick_long", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition tail_thick_long_tail_connector = tail_thick_long.addOrReplaceChild("tail_thick_long_tail_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1788F, -0.0147F));

            PartDefinition tail_thick_long_tail_connector_rotator = tail_thick_long_tail_connector.addOrReplaceChild("tail_thick_long_tail_connector_rotator", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.5922F));

            PartDefinition cube_r1 = tail_thick_long_tail_connector_rotator.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(654, 72).addBox(-0.5531F, 0.0071F, -0.555F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4469F, -0.5363F, -1.8771F, -0.2182F, 0.0F, 0.0F));

            PartDefinition tail_thick_long_tail_top = tail_thick_long_tail_connector.addOrReplaceChild("tail_thick_long_tail_top", CubeListBuilder.create(), PartPose.offset(0.4469F, 0.3575F, 2.2346F));

            PartDefinition tail_thick_long_tail_top_individual = tail_thick_long_tail_top.addOrReplaceChild("tail_thick_long_tail_top_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2682F, 0.1788F));

            PartDefinition cube_r2 = tail_thick_long_tail_top_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(639, 82).addBox(-1.0F, -2.0785F, 0.1082F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9832F, -0.4469F, -0.8939F, -1.3963F, 0.0F, 0.0F));

            PartDefinition tail_thick_long_tail_middle = tail_thick_long_tail_top.addOrReplaceChild("tail_thick_long_tail_middle", CubeListBuilder.create(), PartPose.offset(-0.3575F, 5.0235F, 0.8045F));

            PartDefinition tail_thick_long_tail_middle_individual = tail_thick_long_tail_middle.addOrReplaceChild("tail_thick_long_tail_middle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = tail_thick_long_tail_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(636, 69).addBox(-1.0F, -0.9635F, -0.1495F, 5.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6089F, -0.0179F, 1.3408F, -1.6144F, 0.0F, 0.0F));

            PartDefinition tail_thick_long_tail_bottom = tail_thick_long_tail_middle.addOrReplaceChild("tail_thick_long_tail_bottom", CubeListBuilder.create(), PartPose.offset(0.0894F, 8.0268F, -0.1788F));

            PartDefinition cube_r4 = tail_thick_long_tail_bottom.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(656, 77).addBox(-1.0F, -1.8391F, -0.9493F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7151F, 0.5363F, -0.5363F, -1.6144F, 0.0F, 0.0F));

        } else if (thickness.equals("thick") && length.equals("long")) {
            PartDefinition tail_thick_average = partdefinition.addOrReplaceChild("tail_thick_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition tail_thick_average_tail_connector = tail_thick_average.addOrReplaceChild("tail_thick_average_tail_connector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1788F, -0.0147F));

            PartDefinition tail_thick_average_tail_connector_rotator = tail_thick_average_tail_connector.addOrReplaceChild("tail_thick_average_tail_connector_rotator", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.5922F));

            PartDefinition cube_r1 = tail_thick_average_tail_connector_rotator.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(955, 698).addBox(-0.5531F, 0.0071F, -0.555F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3575F, -0.5363F, -1.8771F, -0.2182F, 0.0F, 0.0F));

            PartDefinition tail_thick_average_tail_top = tail_thick_average_tail_connector.addOrReplaceChild("tail_thick_average_tail_top", CubeListBuilder.create(), PartPose.offset(0.4469F, 0.3575F, 2.0559F));

            PartDefinition tail_thick_average_tail_top_individual = tail_thick_average_tail_top.addOrReplaceChild("tail_thick_average_tail_top_individual", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0894F, 0.1788F));

            PartDefinition cube_r2 = tail_thick_average_tail_top_individual.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(940, 708).addBox(-1.0F, -2.0785F, 0.1082F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8939F, -0.0894F, -0.7151F, -1.3963F, 0.0F, 0.0F));

            PartDefinition tail_thick_average_tail_middle = tail_thick_average_tail_top.addOrReplaceChild("tail_thick_average_tail_middle", CubeListBuilder.create(), PartPose.offset(-0.3575F, 5.0235F, 0.9832F));

            PartDefinition tail_thick_average_tail_middle_individual = tail_thick_average_tail_middle.addOrReplaceChild("tail_thick_average_tail_middle_individual", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r3 = tail_thick_average_tail_middle_individual.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(939, 697).addBox(-1.0F, -1.9635F, -0.1495F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5196F, -0.0179F, 0.5363F, -1.6144F, 0.0F, 0.0F));

            PartDefinition tail_thick_average_tail_bottom = tail_thick_average_tail_middle.addOrReplaceChild("tail_thick_average_tail_bottom", CubeListBuilder.create(), PartPose.offset(0.0894F, 5.6134F, 0.0F));

            PartDefinition cube_r4 = tail_thick_average_tail_bottom.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(955, 704).addBox(-1.0F, -1.8391F, -0.9493F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7151F, 0.5363F, -0.6257F, -1.6144F, 0.0F, 0.0F));

        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Tail / " + thickness + " / " + length + ", Cancelling Generation...");
        }
        allParts.add("tail_" + thickness + "_" + length);
        return partdefinition;
    }
    public static PartDefinition GenerateAll(PartDefinition root) {
        List<String> TAIL_THICKNESS = List.of("thin", "average", "thick");
        List<String> TAIL_LENGTH = List.of("short", "average", "long");

        for (String variable1 : TAIL_THICKNESS) {
            for (String variable2 : TAIL_LENGTH) {
                root = Generate(root, variable1, variable2);
            }
        }
        return root;
    }
}
