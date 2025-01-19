package net.buckleystudios.equigen.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.EquigenMod;
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
import java.util.NoSuchElementException;

public class GeneticHorseModel <T extends GeneticHorseEntity> extends HierarchicalModel<T> {
    public static List<String> ALL_PARTS = List.of("Chest", "Back", "Hips", "Stomach");
    public static Map<String, Vector3f> PART_POSITIONS = new HashMap<String, Vector3f>();

    public final ModelPart main;
    public final ModelPart rootChest;

    public final ModelPart rootForeLegLeft;
    public final ModelPart rootTopForeLegLeft;
    public final ModelPart rootForeLegKneeLeft;
    public final ModelPart rootBottomForeLegLeft;
    public final ModelPart rootForeLegHoofLeft;

    public final ModelPart rootForeLegRight;
    public final ModelPart rootTopForeLegRight;
    public final ModelPart rootForeLegKneeRight;
    public final ModelPart rootBottomForeLegRight;
    public final ModelPart rootForeLegHoofRight;

    public final ModelPart rootNeck;
    public final ModelPart rootHead;
    public final ModelPart rootEars;
    public final ModelPart rootBack;
    public final ModelPart rootStomach;
    public final ModelPart rootWithers;
    public final ModelPart rootHips;

    public final ModelPart rootHindLegLeft;
    public final ModelPart rootTopHindLegLeft;
    public final ModelPart rootHindLegKneeLeft;
    public final ModelPart rootBottomHindLegLeft;
    public final ModelPart rootHindLegHoofLeft;

    public final ModelPart rootHindLegRight;
    public final ModelPart rootTopHindLegRight;
    public final ModelPart rootHindLegKneeRight;
    public final ModelPart rootBottomHindLegRight;
    public final ModelPart rootHindLegHoofRight;

    public final ModelPart rootTail;

    public GeneticHorseModel(ModelPart root) {
        this.main = root.getChild("main");

        this.rootChest = main.getChild("rootChest");

        this.rootForeLegLeft = rootChest.getChild("rootForeLegLeft");
        this.rootTopForeLegLeft = rootForeLegLeft.getChild("rootTopForeLegLeft");
        this.rootForeLegKneeLeft = rootTopForeLegLeft.getChild("rootForeLegKneeLeft");
        this.rootBottomForeLegLeft = rootForeLegKneeLeft.getChild("rootBottomForeLegLeft");
        this.rootForeLegHoofLeft = rootBottomForeLegLeft.getChild("rootForeLegHoofLeft");

        this.rootForeLegRight = rootChest.getChild("rootForeLegRight");
        this.rootTopForeLegRight = rootForeLegRight.getChild("rootTopForeLegRight");
        this.rootForeLegKneeRight = rootTopForeLegRight.getChild("rootForeLegKneeRight");
        this.rootBottomForeLegRight = rootForeLegKneeRight.getChild("rootBottomForeLegRight");
        this.rootForeLegHoofRight = rootBottomForeLegRight.getChild("rootForeLegHoofRight");

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
        this.rootBottomHindLegLeft = rootHindLegKneeLeft.getChild("rootBottomHindLegLeft");
        this.rootHindLegHoofLeft = rootBottomHindLegLeft.getChild("rootHindLegHoofLeft");

        this.rootHindLegRight = rootHips.getChild("rootHindLegRight");
        this.rootTopHindLegRight = rootHindLegRight.getChild("rootTopHindLegRight");
        this.rootHindLegKneeRight = rootTopHindLegRight.getChild("rootHindLegKneeRight");
        this.rootBottomHindLegRight = rootHindLegKneeRight.getChild("rootBottomHindLegRight");
        this.rootHindLegHoofRight = rootBottomHindLegRight.getChild("rootHindLegHoofRight");

        this.rootTail = rootHips.getChild("rootTail");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        //Establish Folder Hierarchy (Roots)
        PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rootChest = main.addOrReplaceChild("rootChest", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rootForeLegLeft = rootChest.addOrReplaceChild("rootForeLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootTopForeLegLeft = rootForeLegLeft.addOrReplaceChild("rootTopForeLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootForeLegKneeLeft = rootTopForeLegLeft.addOrReplaceChild("rootForeLegKneeLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootBottomForeLegLeft = rootForeLegKneeLeft.addOrReplaceChild("rootBottomForeLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootForeLegHoofLeft = rootBottomForeLegLeft.addOrReplaceChild("rootForeLegHoofLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rootForeLegRight = rootChest.addOrReplaceChild("rootForeLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootTopForeLegRight = rootForeLegRight.addOrReplaceChild("rootTopForeLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootForeLegKneeRight = rootTopForeLegRight.addOrReplaceChild("rootForeLegKneeRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootBottomForeLegRight = rootForeLegKneeRight.addOrReplaceChild("rootBottomForeLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootForeLegHoofRight = rootBottomForeLegRight.addOrReplaceChild("rootForeLegHoofRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rootNeck = rootChest.addOrReplaceChild("rootNeck", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootHead = rootNeck.addOrReplaceChild("rootHead", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootEars = rootHead.addOrReplaceChild("rootEars", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rootBack = main.addOrReplaceChild("rootBack", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootStomach = rootBack.addOrReplaceChild("rootStomach", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootWithers = rootBack.addOrReplaceChild("rootWithers", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rootHips = main.addOrReplaceChild("rootHips", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rootHindLegLeft = rootHips.addOrReplaceChild("rootHindLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootTopHindLegLeft = rootHindLegLeft.addOrReplaceChild("rootTopHindLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootHindLegKneeLeft = rootTopHindLegLeft.addOrReplaceChild("rootHindLegKneeLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));;
        PartDefinition rootBottomHindLegLeft = rootHindLegKneeLeft.addOrReplaceChild("rootBottomHindLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootHindLegHoofLeft = rootBottomHindLegLeft.addOrReplaceChild("rootHindLegHoofLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rootHindLegRight = rootHips.addOrReplaceChild("rootHindLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootTopHindLegRight = rootHindLegRight.addOrReplaceChild("rootTopHindLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootHindLegKneeRight = rootTopHindLegRight.addOrReplaceChild("rootHindLegKneeRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootBottomHindLegRight = rootHindLegKneeRight.addOrReplaceChild("rootBottomHindLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootHindLegHoofRight = rootBottomHindLegRight.addOrReplaceChild("rootHindLegHoofRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rootTail = rootHips.addOrReplaceChild("rootTail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        /* Chest */
//        PartDefinition rootChest = main.addOrReplaceChild("rootChest", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//        PartDefinition rootForeLegLeft = rootChest.addOrReplaceChild("rootForeLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootTopForeLegLeft = rootForeLegLeft.addOrReplaceChild("rootTopForeLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootForeLegKneeLeft = rootTopForeLegLeft.addOrReplaceChild("rootForeLegKneeLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootUpperBottomForeLegLeft = rootForeLegKneeLeft.addOrReplaceChild("rootUpperBottomForeLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootLowerBottomForeLegLeft = rootUpperBottomForeLegLeft.addOrReplaceChild("rootLowerBottomForeLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootForeLegHoofLeft = rootLowerBottomForeLegLeft.addOrReplaceChild("rootForeLegHoofLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//        PartDefinition rootForeLegRight = rootChest.addOrReplaceChild("rootForeLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootTopForeLegRight = rootForeLegRight.addOrReplaceChild("rootTopForeLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootForeLegKneeRight = rootTopForeLegRight.addOrReplaceChild("rootForeLegKneeRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootUpperBottomForeLegRight = rootForeLegKneeRight.addOrReplaceChild("rootUpperBottomForeLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootLowerBottomForeLegRight = rootUpperBottomForeLegRight.addOrReplaceChild("rootLowerBottomForeLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootForeLegHoofRight = rootLowerBottomForeLegRight.addOrReplaceChild("rootForeLegHoofRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//        PartDefinition rootNeck = rootChest.addOrReplaceChild("rootNeck", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootHead = rootNeck.addOrReplaceChild("rootHead", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootFringe = rootHead.addOrReplaceChild("rootFringe", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootMuzzle = rootHead.addOrReplaceChild("rootMuzzle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootLeftEar = rootHead.addOrReplaceChild("rootLeftEar", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootRightEar = rootHead.addOrReplaceChild("rootRightEar", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//        /* Back */
//        PartDefinition rootBack = main.addOrReplaceChild("rootBack", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootStomach = rootBack.addOrReplaceChild("rootStomach", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootWithers = rootBack.addOrReplaceChild("rootWithers", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//        /* Hips */
//        PartDefinition rootHips = main.addOrReplaceChild("rootHips", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//        PartDefinition rootTail = rootHips.addOrReplaceChild("rootTail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootTailConnector = rootTail.addOrReplaceChild("rootTailConnector", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootTailConnectorRotator = rootTailConnector.addOrReplaceChild("rootTailConnectorRotator", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootTailTop = rootTailConnector.addOrReplaceChild("rootTailTop", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootTailMiddle = rootTailTop.addOrReplaceChild("rootTailMiddle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootTailBottom = rootTailMiddle.addOrReplaceChild("rootTailBottom", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//        PartDefinition rootHindLegLeft = rootHips.addOrReplaceChild("rootHindLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootTopHindLegLeft = rootHindLegLeft.addOrReplaceChild("rootTopHindLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootHindLegKneeLeft = rootTopHindLegLeft.addOrReplaceChild("rootHindLegKneeLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootUpperBottomHindLegLeft = rootHindLegKneeLeft.addOrReplaceChild("rootUpperBottomHindLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootLowerBottomHindLegLeft = rootUpperBottomHindLegLeft.addOrReplaceChild("rootLowerBottomHindLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootHindLegHoofLeft = rootLowerBottomHindLegLeft.addOrReplaceChild("rootHindLegHoofLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//
//        PartDefinition rootHindLegRight = rootHips.addOrReplaceChild("rootHindLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootTopHindLegRight = rootHindLegRight.addOrReplaceChild("rootTopHindLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootHindLegKneeRight = rootTopHindLegRight.addOrReplaceChild("rootHindLegKneeRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootUpperBottomHindLegRight = rootHindLegKneeRight.addOrReplaceChild("rootUpperBottomHindLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootLowerBottomHindLegRight = rootUpperBottomHindLegRight.addOrReplaceChild("rootLowerBottomHindLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
//        PartDefinition rootHindLegHoofRight = rootLowerBottomHindLegRight.addOrReplaceChild("rootHindLegHoofRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        //Generate Parts

//        rootBack = BackModelParts.GenerateAll(rootBack);
//        rootChest = ChestModelParts.GenerateAll(rootChest);
//        rootHips = HipsModelParts.GenerateAll(rootHips);
//       rootNeck = NeckModelParts.GenerateAll(rootNeck);
//        rootStomach = StomachModelParts.GenerateAll(rootStomach);
//       rootWithers = WithersModelParts.GenerateAll(rootWithers);

        rootChest = ChestModelParts.GenerateAll(rootChest);
        rootNeck = NeckModelParts.GenerateAll(rootNeck);
        rootHead = HeadModelParts.GenerateAll(rootHead);
        rootEars = EarsModelParts.GenerateAll(rootEars);
        rootBack = BackModelParts.GenerateAll(rootBack);
        rootStomach = StomachModelParts.GenerateAll(rootStomach);
        rootWithers = WithersModelParts.GenerateAll(rootWithers);
        rootHips = HipsModelParts.GenerateAll(rootHips);
        rootTail = TailModelParts.GenerateAll(rootTail);


        PartDefinition[] ForeLegTopParts = TopForeLegModelParts.GenerateAll(rootTopForeLegLeft, rootTopForeLegRight);
        PartDefinition[] HindLegTopParts = TopHindLegModelParts.GenerateAll(rootTopHindLegLeft, rootTopHindLegRight);
        PartDefinition[] KneeParts = KneeModelParts.GenerateAll(rootForeLegKneeLeft, rootForeLegKneeRight, rootHindLegKneeLeft, rootHindLegKneeRight);
        PartDefinition[] BottomLegParts = BottomLegModelParts.GenerateAll(rootBottomForeLegLeft, rootBottomForeLegRight, rootBottomHindLegLeft, rootBottomHindLegRight);
        PartDefinition[] HoofParts = HoofModelParts.GenerateAll(rootForeLegHoofLeft, rootForeLegHoofRight, rootHindLegHoofLeft, rootHindLegHoofRight);

        rootTopForeLegLeft = ForeLegTopParts[0];
        rootForeLegKneeLeft = KneeParts[0];
        rootBottomForeLegLeft = BottomLegParts[0];
        rootForeLegHoofLeft = HoofParts[0];

        rootTopForeLegRight = ForeLegTopParts[1];
        rootForeLegKneeRight = KneeParts[1];
        rootBottomForeLegRight = BottomLegParts[1];
        rootForeLegHoofRight = HoofParts[1];

        rootTopHindLegLeft = HindLegTopParts[0];
        rootHindLegKneeLeft = KneeParts[2];
        rootBottomHindLegLeft = BottomLegParts[2];
        rootHindLegHoofLeft = HoofParts[2];

        rootTopHindLegRight = HindLegTopParts[1];
        rootHindLegKneeRight = KneeParts[3];
        rootBottomHindLegRight = BottomLegParts[3];
        rootHindLegHoofRight = HoofParts[3];

        return LayerDefinition.create(meshdefinition, 1024, 1024);
    }

    @Override
    public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        //HANDLE PART VISIBILITY
        List<ModelPart> rootParts = List.of(
        main, rootChest, rootForeLegLeft, rootTopForeLegLeft, rootForeLegKneeLeft, rootBottomForeLegLeft,
                rootForeLegHoofLeft, rootForeLegRight, rootTopForeLegRight, rootForeLegKneeRight, rootBottomForeLegRight,
                rootForeLegHoofRight, rootNeck, rootHead, rootEars, rootBack, rootStomach, rootWithers,
                rootHips, rootHindLegLeft, rootTopHindLegLeft, rootHindLegKneeLeft, rootBottomHindLegLeft,
                rootHindLegHoofLeft, rootHindLegRight, rootTopHindLegRight, rootHindLegKneeRight, rootBottomHindLegRight,
                rootHindLegHoofRight, rootTail
        );


        Map<String, String> CURRENT_PARTS = entity.getCurrentParts();

        for(ModelPart part : main.getAllParts().toList()) {
            part.visible = rootParts.contains(part) ||
                    partVisibilityFlags(rootChest, part, "Chest", CURRENT_PARTS) ||
                    partVisibilityFlags(rootTopForeLegLeft, part, "Top_Fore_Leg_Left", CURRENT_PARTS) ||
                    partVisibilityFlags(rootForeLegKneeLeft, part, "Fore_Leg_Knee_Left", CURRENT_PARTS) ||
                    partVisibilityFlags(rootBottomForeLegLeft, part, "Bottom_Fore_Leg_Left", CURRENT_PARTS) ||
                    partVisibilityFlags(rootForeLegHoofLeft, part, "Fore_Leg_Hoof_Left", CURRENT_PARTS) ||
                    partVisibilityFlags(rootTopForeLegRight, part, "Top_Fore_Leg_Right", CURRENT_PARTS) ||
                    partVisibilityFlags(rootForeLegKneeRight, part, "Fore_Leg_Knee_Right", CURRENT_PARTS) ||
                    partVisibilityFlags(rootBottomForeLegRight, part, "Bottom_Fore_Leg_Right", CURRENT_PARTS) ||
                    partVisibilityFlags(rootForeLegHoofRight, part, "Fore_Leg_Hoof_Right", CURRENT_PARTS) ||
                    partVisibilityFlags(rootNeck, part, "Neck", CURRENT_PARTS) ||
                    partVisibilityFlags(rootEars, part, "Ears", CURRENT_PARTS) ||
                    partVisibilityFlags(rootBack, part, "Back", CURRENT_PARTS) ||
                    partVisibilityFlags(rootStomach, part, "Stomach", CURRENT_PARTS) ||
                    partVisibilityFlags(rootWithers, part, "Withers", CURRENT_PARTS) ||
                    partVisibilityFlags(rootHips, part, "Hips", CURRENT_PARTS) ||
                    partVisibilityFlags(rootTopHindLegLeft, part, "Top_Hind_Leg_Left", CURRENT_PARTS) ||
                    partVisibilityFlags(rootHindLegKneeLeft, part, "Hind_Leg_Knee_Left", CURRENT_PARTS) ||
                    partVisibilityFlags(rootBottomHindLegLeft, part, "Bottom_Hind_Leg_Left", CURRENT_PARTS) ||
                    partVisibilityFlags(rootHindLegHoofLeft, part, "Hind_Leg_Hoof_Left", CURRENT_PARTS) ||
                    partVisibilityFlags(rootTopHindLegRight, part, "Top_Hind_Leg_Right", CURRENT_PARTS) ||
                    partVisibilityFlags(rootHindLegKneeRight, part, "Hind_Leg_Knee_Right", CURRENT_PARTS) ||
                    partVisibilityFlags(rootBottomHindLegRight, part, "Bottom_Hind_Leg_Right", CURRENT_PARTS) ||
                    partVisibilityFlags(rootHindLegHoofRight, part, "Hind_Leg_Hoof_Right", CURRENT_PARTS) ||
                    partVisibilityFlags(rootTail, part, "Tail", CURRENT_PARTS);
        }

        //SETUP ANIMATION
        this.root().getAllParts().forEach(ModelPart::resetPose);
        applyHeadRotation(netHeadYaw, headPitch);

        this.animateWalk(GeneticHorseAnimations.GetAnimation("walking", CURRENT_PARTS), limbSwing, limbSwingAmount, 2f, 2.5f);
        this.animate(entity.idleAnimationState, GeneticHorseAnimations.GetAnimation("idle", CURRENT_PARTS), ageInTicks, 1);

        //TEST COMMAND
        MovePart(TestCommand.getNewTargetPart(), TestCommand.getNewPartPosition());
    }

    public Boolean partVisibilityFlags(ModelPart root, ModelPart part, String partString, Map<String, String> CURRENT_PARTS) {
        try {
            String partLower = CURRENT_PARTS.get(partString).toLowerCase();
            return part == root.getChild(partLower) ||
                    root.getChild(partLower).getAllParts().toList().contains(part);
        } catch (NoSuchElementException e){
//            EquigenMod.LOGGER.error(e.toString());
            return false;
        }
        catch (NullPointerException e){
            EquigenMod.LOGGER.error("Part Visibility Flag - No Such Element in CURRENT_PARTS:" + partString + " / " + CURRENT_PARTS.get(partString));
        return false;
        }
    }


    public void MovePart(String part, Vector3f newPos) {
        if (!part.isEmpty()) {
            PART_POSITIONS.put(part, newPos);
        }

        SetPartPosition(main,"main");
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
