package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartDefinition;

import java.util.ArrayList;
import java.util.List;

public class WithersModelParts{
    private static List<String> allParts = new ArrayList<>();
    public static List<String> getAllParts(){
        return allParts;
    }
    public static PartDefinition Generate(PartDefinition partdefinition, String muscleMass) {
        if (muscleMass.equals("lean")) {
            PartDefinition withers_lean = partdefinition.addOrReplaceChild("withers_lean", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 1.162F));

            PartDefinition withers_lean_upper = withers_lean.addOrReplaceChild("withers_lean_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r1 = withers_lean_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(711, 25).addBox(-4.0792F, -6.9812F, -5.4648F, 4.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.03F, -3.5896F, -1.0729F, 1.2654F, 0.0F, 0.0F));

            PartDefinition withers_lean__lower = withers_lean.addOrReplaceChild("withers_lean__lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition cube_r2 = withers_lean__lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(731, 25).addBox(-4.08F, -6.88F, -5.52F, 5.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.516F, -2.9604F, -1.0801F, 1.2654F, 0.0F, 0.0F));

        } else if (muscleMass.equals("average")) {
            PartDefinition withers_average = partdefinition.addOrReplaceChild("withers_average", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 1.0726F));

            PartDefinition withers_average_upper = withers_average.addOrReplaceChild("withers_average_upper", CubeListBuilder.create(), PartPose.offset(-0.0492F, -0.7822F, -0.3656F));

            PartDefinition cube_r1 = withers_average_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(760, 25).addBox(-4.0792F, -6.9812F, -5.4648F, 4.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0792F, -2.8074F, -0.7073F, 1.2654F, 0.0F, 0.0F));

            PartDefinition withers_average_lower = withers_average.addOrReplaceChild("withers_average_lower", CubeListBuilder.create(), PartPose.offset(-0.0277F, -0.0699F, -0.2929F));

            PartDefinition cube_r2 = withers_average_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(780, 25).addBox(-5.08F, -6.88F, -5.52F, 6.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.08F, -2.8905F, -0.7872F, 1.2654F, 0.0F, 0.0F));

        } else if (muscleMass.equals("muscular")) {
            PartDefinition withers_muscular = partdefinition.addOrReplaceChild("withers_muscular", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 1.162F));

            PartDefinition withers_muscular_upper = withers_muscular.addOrReplaceChild("withers_muscular_upper", CubeListBuilder.create(), PartPose.offset(-0.0129F, -0.7822F, -0.3656F));

            PartDefinition cube_r1 = withers_muscular_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(811, 25).addBox(-5.0792F, -6.9812F, -5.4648F, 5.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5792F, -2.8074F, -0.7073F, 1.2654F, 0.0F, 0.0F));

            PartDefinition withers_muscular_lower = withers_muscular.addOrReplaceChild("withers_muscular_lower", CubeListBuilder.create(), PartPose.offset(0.098F, -0.0699F, -0.2929F));

            PartDefinition cube_r2 = withers_muscular_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(833, 25).addBox(-6.08F, -6.88F, -5.52F, 7.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.58F, -2.8905F, -0.7872F, 1.2654F, 0.0F, 0.0F));

        } else {
            EquigenMod.LOGGER.error("Invalid Part Generated: Withers / " + muscleMass + ", Cancelling Generation...");
        }
        allParts.add("withers_" + muscleMass);
        return partdefinition;
    }

    public static PartDefinition GenerateAll(PartDefinition root) {
        List<String> muscleMass = List.of("lean", "average", "muscular");

        for(String variable1 : muscleMass){
            root = Generate(root, variable1);
        }
        return root;
    }
}
