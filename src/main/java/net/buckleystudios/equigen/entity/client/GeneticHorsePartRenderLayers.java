//package net.buckleystudios.equigen.entity.client;
//
//import com.mojang.blaze3d.vertex.PoseStack;
//import net.buckleystudios.equigen.EquigenMod;
//import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
//import net.minecraft.client.model.EntityModel;
//import net.minecraft.client.model.geom.EntityModelSet;
//import net.minecraft.client.model.geom.ModelLayerLocation;
//import net.minecraft.client.model.geom.ModelPart;
//import net.minecraft.client.renderer.MultiBufferSource;
//import net.minecraft.client.renderer.RenderType;
//import net.minecraft.client.renderer.entity.RenderLayerParent;
//import net.minecraft.client.renderer.entity.layers.RenderLayer;
//import net.minecraft.client.renderer.texture.OverlayTexture;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.entity.Entity;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class GeneticHorsePartRenderLayers  extends RenderLayer {
//
//    private final EntityModelSet modelSet;
//    private final Map<String, EntityModel<?>> cachedModels = new HashMap<>();
//
//    public GeneticHorsePartRenderLayers(RenderLayerParent renderer, EntityModelSet set) {
//        super(renderer);
//        this.modelSet = set;
//    }
//
//    private EntityModel<?> getModelForPart(String partId) {
//        return cachedModels.computeIfAbsent(partId, id -> {
//            // Convert the string -> ModelLayerLocation
//            ModelLayerLocation loc = new ModelLayerLocation(
//                    ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "genetic_horse"),
//                    id
//            );
//            return switch (id){
//                case "back_1" -> new TestEntityModel(modelSet.bakeLayer(loc));
//                case "back_2" -> new PillagerKingModel(modelSet.bakeLayer(loc));
//                case "chest_1" -> new EgretModel(modelSet.bakeLayer(loc));
//                case "chest_2" -> new GeneticHorseModel<>(modelSet.bakeLayer(loc));
//                default -> null;
//            };
//        });
//    }
//    @Override
//    public void render(PoseStack poseStack, MultiBufferSource bufferSource, int packedLight, Entity livingEntity, float limbSwing, float limbSwingAmount, float partialTick, float ageInTicks, float netHeadYaw, float headPitch) {
//        GeneticHorseEntity horse = (GeneticHorseEntity) livingEntity;
//        if (horse.getGenetic("GENDER") != 0) {
//
//            String selectedPart = switch ((int) horse.getGenetic("GENDER")){
//                case 1 -> "back_1";
//                case 2 -> "back_2";
//                default -> throw new IllegalStateException("Unexpected value: " + (int) horse.getGenetic("GENDER"));
//            };
//
//            EntityModel<?> partModel = getModelForPart(selectedPart);
//            partModel.renderToBuffer(poseStack,
//                    bufferSource.getBuffer(RenderType.entityCutout(getTextureLocation(selectedPart))),
//                    packedLight, OverlayTexture.NO_OVERLAY);
//        }
//    }
//}
