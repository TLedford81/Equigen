package net.buckleystudios.equigen.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.command.TestCommand;
import net.buckleystudios.equigen.entity.client.parts.*;
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
import java.util.List;
import java.util.Map;

public class GeneticHorseModel <T extends GeneticHorseEntity> extends HierarchicalModel<T> {
    public static List<String> ALL_PARTS = List.of("Chest", "Back", "Hips", "Stomach");
    public static Map<String, Vector3f> PART_POSITIONS = new HashMap<String, Vector3f>();

    public final ModelPart main;
    public final ModelPart rootChest;
    public final ModelPart rootForeLegLeft;
    public final ModelPart rootTopForeLegLeft;
    public final ModelPart rootForeLegKneeLeft;
    public final ModelPart rootUpperBottomForeLegLeft;
    public final ModelPart rootLowerBottomForeLegLeft;
    public final ModelPart rootForeLegHoofLeft;
    public final ModelPart rootForeLegRight;
    public final ModelPart rootTopForeLegRight;
    public final ModelPart rootForeLegKneeRight;
    public final ModelPart rootUpperBottomForeLegRight;
    public final ModelPart rootLowerBottomForeLegRight;
    public final ModelPart rootForeLegHoofRight;
    public final ModelPart rootNeck;
    public final ModelPart rootHead;
    public final ModelPart rootLeftEar;
    public final ModelPart rootRightEar;
    public final ModelPart rootBack;
    public final ModelPart rootStomach;
    public final ModelPart rootWithers;
    public final ModelPart rootHips;
    public final ModelPart rootHindLegLeft;
    public final ModelPart rootTopHindLegLeft;
    public final ModelPart rootHindLegKneeLeft;
    public final ModelPart rootUpperBottomHindLegLeft;
    public final ModelPart rootLowerBottomHindLegLeft;
    public final ModelPart rootHindLegHoofLeft;
    public final ModelPart rootHindLegRight;
    public final ModelPart rootTopHindLegRight;
    public final ModelPart rootHindLegKneeRight;
    public final ModelPart rootUpperBottomHindLegRight;
    public final ModelPart rootLowerBottomHindLegRight;
    public final ModelPart rootHindLegHoofRight;
    public final ModelPart rootTail;
    public final ModelPart rootTailConnector;
    public final ModelPart rootTailConnectorRotator;
    public final ModelPart rootTailTop;
    public final ModelPart rootTailMiddle;
    public final ModelPart rootTailBottom;

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
        this.rootLeftEar = rootHead.getChild("rootLeftEar");
        this.rootRightEar = rootHead.getChild("rootRightEar");

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
        this.rootTailConnector = rootTail.getChild("rootTailConnector");
        this.rootTailConnectorRotator = rootTailConnector.getChild("rootTailConnectorRotator");
        this.rootTailTop = rootTailConnector.getChild("rootTailTop");
        this.rootTailMiddle = rootTailTop.getChild("rootTailMiddle");
        this.rootTailBottom = rootTailMiddle.getChild("rootTailBottom");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        //Establish Folder Hierarchy (Roots)
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

        PartDefinition rootNeck = rootChest.addOrReplaceChild("rootNeck", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootHead = rootNeck.addOrReplaceChild("rootHead", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootFringe = rootHead.addOrReplaceChild("rootFringe", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootMuzzle = rootHead.addOrReplaceChild("rootMuzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootLeftEar = rootHead.addOrReplaceChild("rootLeftEar", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootRightEar = rootHead.addOrReplaceChild("rootRightEar", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        /* Back */
        PartDefinition rootBack = main.addOrReplaceChild("rootBack", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootStomach = rootBack.addOrReplaceChild("rootStomach", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootWithers = rootBack.addOrReplaceChild("rootWithers", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        /* Hips */
        PartDefinition rootHips = main.addOrReplaceChild("rootHips", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rootTail = rootHips.addOrReplaceChild("rootTail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootTailConnector = rootTail.addOrReplaceChild("rootTailConnector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootTailConnectorRotator = rootTailConnector.addOrReplaceChild("rootTailConnectorRotator", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootTailTop = rootTailConnector.addOrReplaceChild("rootTailTop", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootTailMiddle = rootTailTop.addOrReplaceChild("rootTailMiddle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootTailBottom = rootTailMiddle.addOrReplaceChild("rootTailBottom", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

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
//        PartDefinition[] MPA_BL = BottomLegModelParts.GenerateAll();

//        PartDefinition[] MPA_Head = HeadModelParts.GenerateAll();

//        PartDefinition[] MPA_Ears = EarsModelParts.GenerateAll();

        PartDefinition[] MPA_Tail = TailModelParts.GenerateAll(rootTail, rootTailConnector, rootTailConnectorRotator, rootTailTop, rootTailMiddle, rootTailBottom);
        rootTail = MPA_Tail[0];
        rootTailConnector = MPA_Tail[1];
        rootTailConnectorRotator = MPA_Tail[2];
        rootTailTop = MPA_Tail[3];
        rootTailMiddle = MPA_Tail[4];
        rootTailBottom = MPA_Tail[5];

//        PartDefinition[] MPA_Hoof = HoofModelParts.GenerateAll();

//        PartDefinition[] MPA_Knee = KneeModelParts.GenerateAll();

//        PartDefinition[] MPA_TFL = TopForeLegModelParts.GenerateAll();

//        PartDefinition[] MPA_THL = TopHindLegModelParts.GenerateAll();


        rootBack = BackModelParts.GenerateAll(rootBack);
        rootChest = ChestModelParts.GenerateAll(rootChest);
        rootHips = HipsModelParts.GenerateAll(rootHips);
//       rootNeck = NeckModelParts.GenerateAll(rootNeck);
        rootStomach = StomachModelParts.GenerateAll(rootStomach);
//       rootWithers = WithersModelParts.GenerateAll(rootWithers);

        return LayerDefinition.create(meshdefinition, 1024, 1024);
    }

    @Override
    public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        //HANDLE PART VISIBILITY
        List<ModelPart> rootParts = List.of(
                main, rootChest, rootForeLegLeft, rootTopForeLegLeft, rootForeLegKneeLeft, rootUpperBottomForeLegLeft,
                rootLowerBottomForeLegLeft, rootForeLegHoofLeft, rootForeLegRight, rootTopForeLegRight, rootForeLegKneeRight,
                rootUpperBottomForeLegRight, rootLowerBottomForeLegRight, rootForeLegHoofRight, rootNeck, rootHead,
                rootLeftEar, rootRightEar, rootBack, rootStomach, rootWithers, rootHips, rootHindLegLeft, rootTopHindLegLeft,
                rootHindLegKneeLeft, rootUpperBottomHindLegLeft, rootLowerBottomHindLegLeft, rootHindLegHoofLeft,
                rootHindLegRight, rootTopHindLegRight, rootHindLegKneeRight, rootUpperBottomHindLegRight,
                rootLowerBottomHindLegRight, rootHindLegHoofRight, rootTail, rootTailConnector, rootTailConnectorRotator,
                rootTailTop, rootTailMiddle, rootTailBottom);

        Map<String, String> CURRENT_PARTS = entity.getCurrentParts();

        for(ModelPart part : main.getAllParts().toList()) {
            if(rootParts.contains(part) ||
                    part == rootChest.getChild(CURRENT_PARTS.get("chest")) || rootChest.getChild(CURRENT_PARTS.get("chest")).getAllParts().toList().contains(part) ||
                    part == rootBack.getChild(CURRENT_PARTS.get("back")) || rootBack.getChild(CURRENT_PARTS.get("back")).getAllParts().toList().contains(part) ||
                    part == rootHips.getChild(CURRENT_PARTS.get("hips")) || rootHips.getChild(CURRENT_PARTS.get("hips")).getAllParts().toList().contains(part) ||
                    part == rootStomach.getChild(CURRENT_PARTS.get("stomach")) || rootStomach.getChild(CURRENT_PARTS.get("stomach")).getAllParts().toList().contains(part) ||
                    part == rootTailConnector.getChild(CURRENT_PARTS.get("tail_connector")) || rootTailConnector.getChild(CURRENT_PARTS.get("tail_connector")).getAllParts().toList().contains(part)
            ){
                part.visible = true;
            } else {
                part.visible = false;
            }
        }

        //SETUP ANIMATION
        this.root().getAllParts().forEach(ModelPart::resetPose);
        applyHeadRotation(netHeadYaw, headPitch);

        this.animateWalk(GeneticHorseAnimations.GetAnimation("walking", CURRENT_PARTS), limbSwing, limbSwingAmount, 2f, 2.5f);
        this.animate(entity.idleAnimationState, GeneticHorseAnimations.GetAnimation("idle", CURRENT_PARTS), ageInTicks, 1);

        //TEST COMMAND
        MovePart(TestCommand.getNewTargetPart(), TestCommand.getNewPartPosition());
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
        SetPartPosition(rootLeftEar,"leftear");
        SetPartPosition(rootRightEar,"rightear");
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
        SetPartPosition(rootTailConnector,"tailconnector");
        SetPartPosition(rootTailConnectorRotator,"tailconnectorrotator");
        SetPartPosition(rootTailTop,"tailtop");
        SetPartPosition(rootTailMiddle,"tailmiddle");
        SetPartPosition(rootTailBottom,"tailbottom");
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
