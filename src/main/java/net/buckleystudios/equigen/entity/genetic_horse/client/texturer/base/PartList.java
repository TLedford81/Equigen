package net.buckleystudios.equigen.entity.genetic_horse.client.texturer.base;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.multipart.MultipartModel;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.multipart.MultipartNeckModel;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistries.ModelPartRegistry;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.RegistryKeyFactory;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;
import net.minecraft.client.model.geom.EntityModelSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PartList {
    List<Part> partList = new ArrayList<>();
    List<MultipartModel<GeneticHorseEntity>> partModelList = new ArrayList<>();
    GeneticHorseEntity entity;
    EntityModelSet modelSet;


    public PartList() {
    }

    public List<Part> getPartList() {
        return partList;
    }

    public List<MultipartModel<GeneticHorseEntity>> getPartModelList() {
        return partModelList;
    }

    public PartList(GeneticHorseEntity entity, EntityModelSet modelSet) {
        this.entity = entity;
        this.modelSet = modelSet;
    }

    public static void main(String[] args) {
    }

    public void updatePartList(String modelName, int x, int y, int muscleMass, int type, int lengthOrSize, int blockNum) {
        EquigenMod.LOGGER.info("X = {} Y = {}", x, y);
        EquigenMod.LOGGER.info("PART!, MODELNAME = {}, MUSCLEMASS = {}, TYPE = {}, LENGTHORSIZE = {}, BLOCKNUM = {}", modelName, muscleMass, type, lengthOrSize, blockNum);
        MultipartModel<GeneticHorseEntity> partModel = null;
        Part part = null;
        switch (modelName) {
            //TODO fix this to work with the different legs
            case "back" -> partModel = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getBackKey(muscleMass, type, lengthOrSize), modelSet));
            case "top_back_legs" -> partModel = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getTopBackLegKey(type, lengthOrSize), modelSet, GeneticValues.LEG.BACK_LEFT));
            case "bottom_legs" -> partModel = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getBottomLegKey(type, lengthOrSize), modelSet, GeneticValues.LEG.FRONT_LEFT));
            case "chest" -> partModel = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getChestKey(muscleMass, lengthOrSize), modelSet));
            case "left_ear" -> partModel = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getLeftEarKey(entity), modelSet));
            case "right_ear" -> partModel = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getRightEarKey(entity), modelSet));
            case "top_front_legs" -> partModel = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getTopFrontLegKey(type, lengthOrSize), modelSet, GeneticValues.LEG.FRONT_LEFT));
            case "head" -> partModel = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getHeadKey(type, muscleMass), modelSet));
            case "hips" -> partModel = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getHipKey(muscleMass, lengthOrSize), modelSet));
            case "hoof" -> partModel = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getHoofKey(lengthOrSize), modelSet, GeneticValues.LEG.FRONT_LEFT));
            case "knees" -> partModel = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getKneeKey(entity), modelSet, GeneticValues.LEG.FRONT_LEFT));
            case "neck", "mane" -> partModel = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getNeckKey(muscleMass, type, lengthOrSize), modelSet));
            case "stomach" -> partModel = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getStomachKey(muscleMass, type, lengthOrSize), modelSet));
            case "tail" -> partModel = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getTailKey(type, lengthOrSize), modelSet));
            case "withers" -> partModel = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getWitherKey(muscleMass), modelSet));
            default -> EquigenMod.LOGGER.info("NULL PART");
        }

        if (partModel instanceof MultipartNeckModel<?> && modelName.equals("mane")) {
            part = partModel.returnManeCubeDimensions();
        } else {
            assert partModel != null;
            part = partModel.getCubeDimensions();
        }

        for (int i = 0; i < partList.size(); i++) {
            Part existing = partList.get(i);

            if (existing.modelName.equals(part.modelName)) {
                part = existing;
                partList.remove(i);
                partModelList.remove(i);

                break;
            }
        }

        if (part != null) {
            EquigenMod.LOGGER.info(
                    "EDITING {} BLOCK NUM: {} TO X {} AND Y {} WITH A MODIFIED VALUE OF TRUE",
                    part.modelName,
                    blockNum - 1,
                    x + 1,
                    y + 1
            );

            part.updateBlocks(blockNum - 1, x + 1, y + 1, true);
        } else {
            EquigenMod.LOGGER.info(
                    "NULL PART!, MODELNAME = {}, MUSCLEMASS = {}, TYPE = {}, LENGTHORSIZE = {}, BLOCKNUM = {}",
                    modelName,
                    muscleMass,
                    type,
                    lengthOrSize,
                    blockNum
            );
        }

        partList.add(part);
        partModelList.add(partModel);
    }


}