package net.buckleystudios.equigen.entity.genetic_horse.client.texturer.base;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistries.ModelPartRegistry;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.RegistryKeyFactory;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;
import net.minecraft.client.model.geom.EntityModelSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PartList {
    List<Part> partList = new ArrayList<>();
    GeneticHorseEntity entity;
    EntityModelSet modelSet;


    public PartList() {
    }

    public List<Part> getPartList() {
        return partList;
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
        Part part = null;
        switch (modelName) {
            //TODO fix this to work with the different legs
            case "back" -> part = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getBackKey(muscleMass, type, lengthOrSize), modelSet)).getCubeDimensions();
            case "top_back_legs" -> part = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getTopBackLegKey(type, lengthOrSize), modelSet, GeneticValues.LEG.BACK_LEFT)).getCubeDimensions();
            case "bottom_legs" -> part = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getBottomLegKey(type, lengthOrSize), modelSet, GeneticValues.LEG.FRONT_LEFT)).getCubeDimensions();
            case "chest" -> part = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getChestKey(muscleMass, lengthOrSize), modelSet)).getCubeDimensions();
            case "left_ear" -> part = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getLeftEarKey(entity), modelSet)).getCubeDimensions();
            case "right_ear" -> part = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getRightEarKey(entity), modelSet)).getCubeDimensions();
            case "top_front_legs" -> part = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getTopFrontLegKey(type, lengthOrSize), modelSet, GeneticValues.LEG.FRONT_LEFT)).getCubeDimensions();
            case "head" -> part = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getHeadKey(type, muscleMass), modelSet)).getCubeDimensions();
            case "hips" -> part = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getHipKey(muscleMass, lengthOrSize), modelSet)).getCubeDimensions();
            case "hoof" -> part = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getHoofKey(lengthOrSize), modelSet, GeneticValues.LEG.FRONT_LEFT)).getCubeDimensions();
            case "knees" -> part = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getKneeKey(entity), modelSet, GeneticValues.LEG.FRONT_LEFT)).getCubeDimensions();
            case "neck" -> part = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getNeckKey(muscleMass, type, lengthOrSize), modelSet)).getCubeDimensions();
            case "mane" -> part = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getNeckKey(muscleMass, type, lengthOrSize), modelSet)).returnManeCubeDimensions();
            case "stomach" -> part = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getStomachKey(muscleMass, type, lengthOrSize), modelSet)).getCubeDimensions();
            case "tail" -> part = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getTailKey(type, lengthOrSize), modelSet)).getCubeDimensions();
            case "withers" -> part = Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getWitherKey(muscleMass), modelSet)).getCubeDimensions();
            default -> EquigenMod.LOGGER.info("NULL PART");
        }

        int listPlace = -1;
        for (Part existing : partList) {
            listPlace++;
            assert part != null;
            if (existing.modelName.equals(part.modelName)) {
                part = existing;
                partList.remove(listPlace);
                break;
            }
        }

        if (part != null) {
            EquigenMod.LOGGER.info("EDITING {} BLOCK NUM: {} TO X {} AND Y {} WITH A MODIFIED VALUE OF TRUE", part.modelName,blockNum - 1, x + 1, y + 1);
            part.updateBlocks(blockNum - 1, x + 1, y + 1, true);
        } else {
            EquigenMod.LOGGER.info("NULL PART!, MODELNAME = {}, MUSCLEMASS = {}, TYPE = {}, LENGTHORSIZE = {}, BLOCKNUM = {}", modelName, muscleMass, type, lengthOrSize, blockNum);
        }
        partList.add(part);
    }


}