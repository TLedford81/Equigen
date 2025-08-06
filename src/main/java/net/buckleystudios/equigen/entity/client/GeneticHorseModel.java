package net.buckleystudios.equigen.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.command.TestCommand;
import net.buckleystudios.equigen.entity.client.parts.*;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.item.custom.StallWand;
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
    //For Testing Purposes
    static Boolean multipart = false;
    //---------------------------

    public Map<String, Vector3f> PART_POSITIONS = new HashMap<String, Vector3f>();

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
    public final ModelPart rootLeftEar;
    public final ModelPart rootRightEar;
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
        this.rootLeftEar = rootHead.getChild("rootLeftEar");
        this.rootRightEar = rootHead.getChild("rootRightEar");

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
        PartDefinition rootLeftEar = rootHead.addOrReplaceChild("rootLeftEar", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootRightEar = rootHead.addOrReplaceChild("rootRightEar", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rootBack = main.addOrReplaceChild("rootBack", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootStomach = rootBack.addOrReplaceChild("rootStomach", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootWithers = rootBack.addOrReplaceChild("rootWithers", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rootHips = main.addOrReplaceChild("rootHips", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rootHindLegLeft = rootHips.addOrReplaceChild("rootHindLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootTopHindLegLeft = rootHindLegLeft.addOrReplaceChild("rootTopHindLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootHindLegKneeLeft = rootTopHindLegLeft.addOrReplaceChild("rootHindLegKneeLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rootBottomHindLegLeft = rootHindLegKneeLeft.addOrReplaceChild("rootBottomHindLegLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootHindLegHoofLeft = rootBottomHindLegLeft.addOrReplaceChild("rootHindLegHoofLeft", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rootHindLegRight = rootHips.addOrReplaceChild("rootHindLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootTopHindLegRight = rootHindLegRight.addOrReplaceChild("rootTopHindLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootHindLegKneeRight = rootTopHindLegRight.addOrReplaceChild("rootHindLegKneeRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootBottomHindLegRight = rootHindLegKneeRight.addOrReplaceChild("rootBottomHindLegRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition rootHindLegHoofRight = rootBottomHindLegRight.addOrReplaceChild("rootHindLegHoofRight", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rootTail = rootHips.addOrReplaceChild("rootTail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));


        if(multipart){
            rootChest = ChestModelParts.GenerateAll(rootChest);
            rootNeck = NeckModelParts.GenerateAll(rootNeck);
            rootHead = HeadModelParts.GenerateAll(rootHead);

            rootBack = BackModelParts.GenerateAll(rootBack);
            rootStomach = StomachModelParts.GenerateAll(rootStomach);
            rootWithers = WithersModelParts.GenerateAll(rootWithers);
            rootHips = HipsModelParts.GenerateAll(rootHips);
            rootTail = TailModelParts.GenerateAll(rootTail);

            PartDefinition[] EarParts = EarsModelParts.GenerateAll(rootLeftEar, rootRightEar);
            PartDefinition[] ForeLegTopParts = TopForeLegModelParts.GenerateAll(rootTopForeLegLeft, rootTopForeLegRight);
            PartDefinition[] HindLegTopParts = TopHindLegModelParts.GenerateAll(rootTopHindLegLeft, rootTopHindLegRight);
            PartDefinition[] KneeParts = KneeModelParts.GenerateAll(rootForeLegKneeLeft, rootForeLegKneeRight, rootHindLegKneeLeft, rootHindLegKneeRight);
            PartDefinition[] BottomLegParts = BottomLegModelParts.GenerateAll(rootBottomForeLegLeft, rootBottomForeLegRight, rootBottomHindLegLeft, rootBottomHindLegRight);
            PartDefinition[] HoofParts = HoofModelParts.GenerateAll(rootForeLegHoofLeft, rootForeLegHoofRight, rootHindLegHoofLeft, rootHindLegHoofRight);

            rootLeftEar = EarParts[0];
            rootRightEar = EarParts[1];

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
        } else {
            FullModelTesting.Generate(main);
        }

        return LayerDefinition.create(meshdefinition, 1024, 1024);
    }

    @Override
    public void setupAnim(GeneticHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        //SETUP ANIMATION
        this.root().getAllParts().forEach(ModelPart::resetPose);
        applyHeadRotation(netHeadYaw, headPitch);

        this.animateWalk(GeneticHorseAnimations.GetAnimation("walking", entity), limbSwing, limbSwingAmount, 10f, 2.5f);
//        this.animateWalk(GeneticHorseAnimations.GetAnimation("galloping", entity), limbSwing, limbSwingAmount, 2f, 2.5f);
        this.animate(entity.idleAnimationState, GeneticHorseAnimations.GetAnimation("idle", entity), ageInTicks, 1);

        PART_POSITIONS.put(TestCommand.getNewTargetPart(), TestCommand.getNewPartPosition());

        if(StallWand.currentEntity != null){
            if(entity.getStringUUID().equals(StallWand.currentEntity.getStringUUID())){
                MovePart(rootChest,"chest");
                MovePart(rootNeck,"neck");
                MovePart(rootHead,"head");
                MovePart(rootLeftEar,"leftear");
                MovePart(rootRightEar,"rightear");
                MovePart(rootBack,"back");
                MovePart(rootStomach,"stomach");
                MovePart(rootWithers,"withers");
                MovePart(rootHips,"hips");
                MovePart(rootTail,"tail");
                MovePart(rootTopForeLegLeft,"topforelegleft");
                MovePart(rootForeLegKneeLeft,"forelegkneeleft");
                MovePart(rootBottomForeLegLeft,"bottomforelegleft");
                MovePart(rootForeLegHoofLeft,"foreleghoofleft");
                MovePart(rootTopForeLegRight,"topforelegright");
                MovePart(rootForeLegKneeRight,"forelegkneeright");
                MovePart(rootBottomForeLegRight,"bottomforelegright");
                MovePart(rootForeLegHoofRight,"foreleghoofright");
                MovePart(rootTopHindLegLeft,"tophindlegleft");
                MovePart(rootHindLegKneeLeft,"hindlegkneeleft");
                MovePart(rootBottomHindLegLeft,"bottomhindlegleft");
                MovePart(rootHindLegHoofLeft,"hindleghoofleft");
                MovePart(rootTopHindLegRight,"tophindlegright");
                MovePart(rootHindLegKneeRight,"hindlegkneeright");
                MovePart(rootBottomHindLegRight,"bottomhindlegright");
                MovePart(rootHindLegHoofRight,"hindleghoofright");
            }
        }
    }
    public void DebugVisibility(ModelPart root, List<String> allParts, String currentPart){
        try {
            for (String part : allParts) {
                EquigenMod.LOGGER.info(currentPart + " / " + part + " --- " + root.hasChild(part));
                if (part.equals(currentPart)) {
                    root.getChild(part).visible = true;
                    EquigenMod.LOGGER.info("Valid Part: " + part);
                } else if (root.hasChild(part)) {
                    root.getChild(part).visible = false;
                }
            }
        } catch (NoSuchElementException e){
            EquigenMod.LOGGER.error(e.toString());
        }
    }
    public void DebugVisibility(boolean allVisibiltiy, ModelPart root, List<String> allParts, String currentPart){
        try {
            for (String part : allParts) {
                if (part.equals(currentPart) || root.hasChild(part)) {
                    root.getChild(part).visible = allVisibiltiy;
                }
            }
        } catch (NoSuchElementException e){
            EquigenMod.LOGGER.error(e.toString());
        }
    }
    public void HandleVisibility(ModelPart root, List<String> allParts, String currentPart){
        try {
            for (String part : allParts) {
                if (part.equals(currentPart)) {
                    root.getChild(part).visible = true;
                } else if (root.hasChild(part)) {
                    root.getChild(part).visible = false;
                }
            }
        } catch (NoSuchElementException e){
            EquigenMod.LOGGER.error(e.toString());
        }
    }
    public void HandleVisibility(boolean allVisibiltiy, ModelPart root, List<String> allParts, String currentPart){
        try {
            for (String part : allParts) {
                if (part.equals(currentPart) || root.hasChild(part)) {
                    root.getChild(part).visible = allVisibiltiy;
                }
            }
        } catch (NoSuchElementException e){
            EquigenMod.LOGGER.error(e.toString());
        }
    }

    public void MovePart(ModelPart root, String part) {
        Vector3f position = PART_POSITIONS.getOrDefault(part, new Vector3f(0.0f, 0.0f, 0.0f));
        root.setPos(position.x, position.y, position.z);
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
