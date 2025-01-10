package net.buckleystudios.equigen.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.command.TestCommand;
import net.buckleystudios.equigen.entity.client.parts.ChestModelParts;
import net.buckleystudios.equigen.entity.client.parts.StomachModelParts;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;
import org.joml.Vector3f;

import java.util.HashMap;
import java.util.Map;

public class GeneticHorseModel <T extends GeneticHorseEntity> extends HierarchicalModel<T> {
    public static Map<String, Vector3f> PART_POSITIONS = new HashMap<String, Vector3f>();
    private final ModelPart main;
    public final ModelPart rootChest;
    private final ModelPart rootForeLegLeft;
    private final ModelPart rootTopForeLegLeft;
    private final ModelPart rootForeLegKneeLeft;
    private final ModelPart rootUpperBottomForeLegLeft;
    private final ModelPart rootLowerBottomForeLegLeft;
    private final ModelPart rootForeLegHoofLeft;
    private final ModelPart rootForeLegRight;
    private final ModelPart rootTopForeLegRight;
    private final ModelPart rootForeLegKneeRight;
    private final ModelPart rootUpperBottomForeLegRight;
    private final ModelPart rootLowerBottomForeLegRight;
    private final ModelPart rootForeLegHoofRight;
    private final ModelPart rootNeck;
    private final ModelPart rootHead;
    private final ModelPart rootEars;
    private final ModelPart rootBack;
    private final ModelPart rootStomach;
    private final ModelPart rootWithers;
    private final ModelPart rootHips;
    private final ModelPart rootHindLegLeft;
    private final ModelPart rootTopHindLegLeft;
    private final ModelPart rootHindLegKneeLeft;
    private final ModelPart rootUpperBottomHindLegLeft;
    private final ModelPart rootLowerBottomHindLegLeft;
    private final ModelPart rootHindLegHoofLeft;
    private final ModelPart rootHindLegRight;
    private final ModelPart rootTopHindLegRight;
    private final ModelPart rootHindLegKneeRight;
    private final ModelPart rootUpperBottomHindLegRight;
    private final ModelPart rootLowerBottomHindLegRight;
    private final ModelPart rootHindLegHoofRight;
    private final ModelPart rootTail;

    public GeneticHorseModel(ModelPart root) {
        this.main = root.getChild("main");

        this.rootChest = main.getChild("rootChest");

        this.rootForeLegLeft = rootChest.getChild("rootForeLegLeft");
        this.rootTopForeLegLeft = rootForeLegLeft.getChild("rootTopForeLegLeft");
        this.rootForeLegKneeLeft = rootTopForeLegLeft.getChild("rootForeLegKneeLeft");
        this.rootUpperBottomForeLegLeft = rootForeLegKneeLeft.getChild("rootUpperBottomForeLegLeft");
        this.rootLowerBottomForeLegLeft = rootUpperBottomForeLegLeft.getChild("rootLowerBottomForeLegLeft");
        this.rootForeLegHoofLeft = rootLowerBottomForeLegLeft.getChild("rootForeLegHoofLeft");

        this.rootForeLegRight = rootChest.getChild("rootForeLegRight");
        this.rootTopForeLegRight = rootForeLegRight.getChild("rootTopForeLegRight");
        this.rootForeLegKneeRight = rootTopForeLegRight.getChild("rootForeLegKneeRight");
        this.rootUpperBottomForeLegRight = rootForeLegKneeRight.getChild("rootUpperBottomForeLegRight");
        this.rootLowerBottomForeLegRight = rootUpperBottomForeLegRight.getChild("rootLowerBottomForeLegRight");
        this.rootForeLegHoofRight = rootLowerBottomForeLegRight.getChild("rootForeLegHoofRight");

        this.rootNeck = rootChest.getChild("rootNeck");
        this.rootHead = rootNeck.getChild("rootHead");
        this.rootEars = rootHead.getChild("rootEars");

        this.rootBack = main.getChild("rootBack");
        this.rootStomach = rootBack.getChild("rootStomach");
        this.rootWithers = rootBack.getChild("rootWithers");

        this.rootHips = main.getChild("rootHips");

        this.rootHindLegLeft = rootHips.getChild("rootHindLegLeft");
        this.rootTopHindLegLeft = rootHindLegLeft.getChild("rootTopHindLegLeft");
        this.rootHindLegKneeLeft = rootTopHindLegLeft.getChild("rootHindLegKneeLeft");
        this.rootUpperBottomHindLegLeft = rootHindLegKneeLeft.getChild("rootUpperBottomHindLegLeft");
        this.rootLowerBottomHindLegLeft = rootUpperBottomHindLegLeft.getChild("rootLowerBottomHindLegLeft");
        this.rootHindLegHoofLeft = rootLowerBottomHindLegLeft.getChild("rootHindLegHoofLeft");

        this.rootHindLegRight = rootHips.getChild("rootHindLegRight");
        this.rootTopHindLegRight = rootHindLegRight.getChild("rootTopHindLegRight");
        this.rootHindLegKneeRight = rootTopHindLegRight.getChild("rootHindLegKneeRight");
        this.rootUpperBottomHindLegRight = rootHindLegKneeRight.getChild("rootUpperBottomHindLegRight");
        this.rootLowerBottomHindLegRight = rootUpperBottomHindLegRight.getChild("rootLowerBottomHindLegRight");
        this.rootHindLegHoofRight = rootLowerBottomHindLegRight.getChild("rootHindLegHoofRight");

        this.rootTail = rootHips.getChild("rootTail");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        //Establish Roots
        PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        /* Chest */
        PartDefinition rootChest = main.addOrReplaceChild("rootChest", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rootForeLegLeft = rootChest.addOrReplaceChild("rootForeLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootTopForeLegLeft = rootForeLegLeft.addOrReplaceChild("rootTopForeLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootForeLegKneeLeft = rootTopForeLegLeft.addOrReplaceChild("rootForeLegKneeLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootUpperBottomForeLegLeft = rootForeLegKneeLeft.addOrReplaceChild("rootUpperBottomForeLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootLowerBottomForeLegLeft = rootUpperBottomForeLegLeft.addOrReplaceChild("rootLowerBottomForeLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootForeLegHoofLeft = rootLowerBottomForeLegLeft.addOrReplaceChild("rootForeLegHoofLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rootForeLegRight = rootChest.addOrReplaceChild("rootForeLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootTopForeLegRight = rootForeLegRight.addOrReplaceChild("rootTopForeLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootForeLegKneeRight = rootTopForeLegRight.addOrReplaceChild("rootForeLegKneeRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootUpperBottomForeLegRight = rootForeLegKneeRight.addOrReplaceChild("rootUpperBottomForeLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootLowerBottomForeLegRight = rootUpperBottomForeLegRight.addOrReplaceChild("rootLowerBottomForeLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootForeLegHoofRight = rootLowerBottomForeLegRight.addOrReplaceChild("rootForeLegHoofRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rootNeck = rootChest.addOrReplaceChild("rootNeck", CubeListBuilder.create(), PartPose.offset(-1.7933F, 23.1598F, 1.7061F));
        PartDefinition rootHead = rootNeck.addOrReplaceChild("rootHead", CubeListBuilder.create(), PartPose.offset(0.6993F, 18.905F, 3.8765F));
        PartDefinition rootEars = rootHead.addOrReplaceChild("rootEars", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        /* Back */
        PartDefinition rootBack = main.addOrReplaceChild("rootBack", CubeListBuilder.create(), PartPose.offset(-0.9258F, 24.0F, 0.0F));
        PartDefinition rootStomach = rootBack.addOrReplaceChild("rootStomach", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootWithers = rootBack.addOrReplaceChild("rootWithers", CubeListBuilder.create(), PartPose.offset(3.0776F, 20.9609F, -0.4005F));

        /* Hips */
        PartDefinition rootHips = main.addOrReplaceChild("rootHips", CubeListBuilder.create(), PartPose.offset(3.0334F, 17.6536F, -1.2759F));

        PartDefinition rootTail = rootHips.addOrReplaceChild("rootTail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rootHindLegLeft = rootHips.addOrReplaceChild("rootHindLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootTopHindLegLeft = rootHindLegLeft.addOrReplaceChild("rootTopHindLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootHindLegKneeLeft = rootTopHindLegLeft.addOrReplaceChild("rootHindLegKneeLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootUpperBottomHindLegLeft = rootHindLegKneeLeft.addOrReplaceChild("rootUpperBottomHindLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootLowerBottomHindLegLeft = rootUpperBottomHindLegLeft.addOrReplaceChild("rootLowerBottomHindLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootHindLegHoofLeft = rootLowerBottomHindLegLeft.addOrReplaceChild("rootHindLegHoofLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rootHindLegRight = rootHips.addOrReplaceChild("rootHindLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootTopHindLegRight = rootHindLegRight.addOrReplaceChild("rootTopHindLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootHindLegKneeRight = rootTopHindLegRight.addOrReplaceChild("rootHindLegKneeRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootUpperBottomHindLegRight = rootHindLegKneeRight.addOrReplaceChild("rootUpperBottomHindLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootLowerBottomHindLegRight = rootUpperBottomHindLegRight.addOrReplaceChild("rootLowerBottomHindLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootHindLegHoofRight = rootLowerBottomHindLegRight.addOrReplaceChild("rootHindLegHoofRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        //Generate Parts
//        PartDefinition[] tflParts_AverageShortA = TopForeLegModelParts.Generate(rootTopHindLegLeft, rootTopHindLegRight, "average", "short", 1);
//        rootTopHindLegLeft = tflParts_AverageShortA[0];
//        rootTopHindLegRight = tflParts_AverageShortA[1];
//
//        PartDefinition[] tfrParts_AverageShortA = TopHindLegModelParts.Generate(rootTopForeLegLeft, rootTopForeLegRight, "average", "short", 1);
//        rootTopForeLegLeft = tfrParts_AverageShortA[0];
//        rootTopForeLegRight = tfrParts_AverageShortA[1];
//
        rootChest = ChestModelParts.Generate(rootChest, "lean", "small", 1);
        rootStomach = StomachModelParts.Generate(rootStomach, "lean", "short", "medium");
//        rootHips = HipsModelParts.Generate(rootHips, "lean", "small", 1);
//
//        PartDefinition[] hoofParts_Average = HoofModelParts.Generate(rootForeLegHoofLeft, rootForeLegHoofRight, rootHindLegHoofLeft, rootHindLegHoofRight, "average");
//        rootForeLegHoofLeft = hoofParts_Average[0];
//        rootForeLegHoofRight = hoofParts_Average[1];
//        rootHindLegHoofLeft = hoofParts_Average[2];
//        rootHindLegHoofRight = hoofParts_Average[3];
//
//        PartDefinition[] knees_all = KneeModelParts.Generate(rootForeLegKneeLeft, rootForeLegKneeRight, rootHindLegKneeLeft, rootHindLegKneeRight);
//        rootForeLegKneeLeft = knees_all[0];
//        rootForeLegKneeRight = knees_all[1];
//        rootHindLegKneeLeft = knees_all[2];
//        rootHindLegKneeRight = knees_all[3];
//
//        rootStomach = StomachModelParts.Generate(rootStomach, "lean", "short", "low");
//        rootWithers = WithersModelParts.Generate(rootWithers, "lean");
//
//        PartDefinition[] blParts_ThinShortA = BottomLegModelParts.Generate(
//                rootUpperBottomForeLegLeft, rootUpperBottomHindLegLeft, rootUpperBottomForeLegRight, rootUpperBottomHindLegRight,
//                rootLowerBottomForeLegLeft, rootLowerBottomHindLegLeft, rootLowerBottomForeLegRight, rootLowerBottomHindLegRight,
//                "thin", "short", 1);
//        rootUpperBottomForeLegLeft = blParts_ThinShortA[0];
//        rootUpperBottomHindLegLeft = blParts_ThinShortA[1];
//        rootUpperBottomForeLegRight = blParts_ThinShortA[2];
//        rootUpperBottomHindLegRight = blParts_ThinShortA[3];
//        rootLowerBottomForeLegLeft = blParts_ThinShortA[4];
//        rootLowerBottomHindLegLeft = blParts_ThinShortA[5];
//        rootLowerBottomForeLegRight = blParts_ThinShortA[6];
//        rootLowerBottomHindLegRight = blParts_ThinShortA[7];
//
//        rootNeck = NeckModelParts.Generate(rootNeck, "average", "ewed", "short", 1);

        return LayerDefinition.create(meshdefinition, 1024, 1024);
    }



    @Override
    public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        applyHeadRotation(netHeadYaw, headPitch);
        this.animateWalk(GeneticHorseAnimations.walking, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.animate(entity.idleAnimationState, GeneticHorseAnimations.idle, ageInTicks, 1);

        MovePart(TestCommand.getNewTargetPart(), TestCommand.getNewPartPosition());

        rootChest.getChild("chest_lean_small_1").visible = entity.isGeneticActive("CHEST_SIZE", 1);
        rootStomach.getChild("stomach_lean_short_medium").visible = entity.isGeneticActive(
                "STOMACH_CURVE", 2);
    }

    public void MovePart(String part, Vector3f newPos) {
        if (!part.isEmpty()) {
            PART_POSITIONS.put(part, newPos);
        }

        SetPartPosition(rootChest,"chest");
        SetPartPosition(rootForeLegLeft,"forelegleft");
        SetPartPosition(rootTopForeLegLeft,"topforelegleft");
        SetPartPosition(rootForeLegKneeLeft,"forelegkneeleft");
        SetPartPosition(rootUpperBottomForeLegLeft,"upperbottomforelegleft");
        SetPartPosition(rootLowerBottomForeLegLeft,"lowerbottomforelegleft");
        SetPartPosition(rootForeLegHoofLeft,"foreleghoofleft");
        SetPartPosition(rootForeLegRight,"forelegright");
        SetPartPosition(rootTopForeLegRight,"topforelegright");
        SetPartPosition(rootForeLegKneeRight,"forelegkneeright");
        SetPartPosition(rootUpperBottomForeLegRight,"upperbottomforelegright");
        SetPartPosition(rootLowerBottomForeLegRight,"lowerbottomforelegright");
        SetPartPosition(rootForeLegHoofRight,"foreleghoofright");
        SetPartPosition(rootNeck,"neck");
        SetPartPosition(rootHead,"head");
        SetPartPosition(rootEars,"ears");
        SetPartPosition(rootBack,"back");
        SetPartPosition(rootStomach,"stomach");
        SetPartPosition(rootWithers,"withers");
        SetPartPosition(rootHips,"hips");
        SetPartPosition(rootHindLegLeft,"hindlegleft");
        SetPartPosition(rootTopHindLegLeft,"tophindlegleft");
        SetPartPosition(rootHindLegKneeLeft,"hindlegkneeleft");
        SetPartPosition(rootUpperBottomHindLegLeft,"upperbottomhindlegleft");
        SetPartPosition(rootLowerBottomHindLegLeft,"lowerbottomhindlegleft");
        SetPartPosition(rootHindLegHoofLeft,"hindleghoofleft");
        SetPartPosition(rootHindLegRight,"hindlegright");
        SetPartPosition(rootTopHindLegRight,"tophindlegright");
        SetPartPosition(rootHindLegKneeRight,"hindlegkneeright");
        SetPartPosition(rootUpperBottomHindLegRight,"upperbottomhindlegright");
        SetPartPosition(rootLowerBottomHindLegRight,"lowerbottomhindlegright");
        SetPartPosition(rootHindLegHoofRight,"hindleghoofright");
        SetPartPosition(rootTail,"tail");
    }

    public void SetPartPosition(ModelPart root, String part){
        PART_POSITIONS.putIfAbsent(part, new Vector3f(0, 0, 0));
        Vector3f newPos = PART_POSITIONS.get(part);
        root.setPos(newPos.x, newPos.y, newPos.z);
    }
    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        main.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);

    }

    @Override
    public ModelPart root() {
        return main;
    }

    private void applyHeadRotation(float headYaw, float headPitch) {
        headYaw = Mth.clamp(headYaw, -30f, 30f);
        headPitch = Mth.clamp(headPitch, -25f, 45f);
        this.rootHead.yRot = headYaw * ((float) Mth.PI / 180f);
        this.rootHead.xRot = headPitch * ((float) Mth.PI / 180f);
    }
}
