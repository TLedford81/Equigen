package net.buckleystudios.equigen.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.buckleystudios.equigen.command.TestCommand;
import net.buckleystudios.equigen.entity.client.parts.*;
import net.buckleystudios.equigen.entity.custom.TestEntityEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class TestEntityModel extends HierarchicalModel<TestEntityEntity> {
    private final ModelPart main;
    private final ModelPart arabian;
    private final ModelPart charger;
    private final ModelPart mongolian;
    private final ModelPart turkoman;
    private final ModelPart part_a;
    private final ModelPart part_b;
    private final ModelPart smeg;
//    private final ModelPart head;

    public TestEntityModel(ModelPart root) {
        this.main = root.getChild("main");
        this.arabian = main.getChild("arabian");
        this.charger = main.getChild("charger");
        this.mongolian = main.getChild("mongolian");
        this.turkoman = main.getChild("turkoman");
        this.part_a = main.getChild("part_a");
        this.part_b = main.getChild("part_b");
        this.smeg = part_a.getChild("main").getChild("smeg");

//        this.head = main.getChild("body").getChild("torso").getChild("chest").getChild("neck").getChild("head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition arabian = main.addOrReplaceChild("arabian", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition charger = main.addOrReplaceChild("charger", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition mongolian = main.addOrReplaceChild("mongolian", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition turkoman = main.addOrReplaceChild("turkoman", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition part_a = main.addOrReplaceChild("part_a", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition part_b = main.addOrReplaceChild("part_b", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        ArabianModel.GeneratePartModel(arabian);
        ChargerModel.GeneratePartModel(charger);
        MongolianModel.GeneratePartModel(mongolian);
        TurkomanModel.GeneratePartModel(turkoman);
        TestPartA.GeneratePartModel(part_a);
        TestPartB.GeneratePartModel(part_b);

        return LayerDefinition.create(meshdefinition, 64, 64);
    }


    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        main.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }

    @Override
    public ModelPart root() {
        return main;
    }

    @Override
    public void setupAnim(TestEntityEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
//        applyHeadRotation(netHeadYaw, headPitch);

        this.animateWalk(TestEntityAnimations.walking, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.animate(entity.idleAnimationState, TestEntityAnimations.idle, ageInTicks, 1);

        arabian.visible = entity.hasTier1Chest();
        charger.visible = entity.hasTier2Chest();
        mongolian.visible = entity.hasTier3Chest();
        turkoman.visible = false;

        part_a.visible = TestCommand.isTesting();
        part_b.visible = TestCommand.isTesting();
        smeg.visible = TestCommand.isTesting();
        smeg.xScale = (float) TestCommand.getSmegSize().x();
        smeg.yScale = (float) TestCommand.getSmegSize().y();
        smeg.zScale = (float) TestCommand.getSmegSize().z();
    }

//    private void applyHeadRotation(float headYaw, float headPitch) {
//        headYaw = Mth.clamp(headYaw, -30f, 30f);
//        headPitch = Mth.clamp(headPitch, -25f, 45f);
//        this.head.yRot = headYaw * ((float) Mth.PI / 180f);
//        this.head.xRot = headPitch * ((float) Mth.PI / 180f);
//    }
}
