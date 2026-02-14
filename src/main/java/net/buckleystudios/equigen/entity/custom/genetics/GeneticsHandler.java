package net.buckleystudios.equigen.entity.custom.genetics;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.custom.genetics.util.GeneticCategories;
import net.buckleystudios.equigen.entity.custom.genetics.util.Heritable;
import net.buckleystudios.equigen.network.packets.GeneticData;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec2;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.network.PacketDistributor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class GeneticsHandler {
    public static boolean setEntityGenetic(LivingEntity entity, Genetics genetic, float value){
        if(entity instanceof Heritable){
            setGenetic(entity, genetic, genetic.getDataAttachment(), value);
            return true;
        }
        return false;
    }

    private static void setGenetic(LivingEntity entity, Genetics genetic, AttachmentType<Float> data, float value){
        float clampedNumber = Math.clamp(value, 0, genetic.getDefaultMaxSize());
        entity.setData(data, clampedNumber);

        if (genetic.is(Genetics.GENDER) || genetic.is(Genetics.BLACK_MODIFIER) || genetic.is(Genetics.FRAME_OVERO)) {
            EquigenMod.LOGGER.info("Setting " + genetic.name() + " to " + clampedNumber);
        }

        if (!entity.level().isClientSide() && genetic.isRenderGene()) {
            syncGeneticsToClient(entity, List.of(genetic));
        }
    }

    public static void syncGeneticsToClient(LivingEntity entity, List<Genetics> geneList){
        for (Genetics gene : geneList){
            PacketDistributor.sendToPlayersTrackingEntity(entity, new GeneticData(entity.getId(), gene.name(), getGenetic(entity, gene)));
        }
    }

    public static void syncGeneticsToClient(LivingEntity entity){
        syncGeneticsToClient(entity, Genetics.getGeneticsToRender());
    }

    public static float getGenetic(LivingEntity entity, Genetics value) {
        if(entity.hasData(value.getDataAttachment())){
            return entity.getData(value.getDataAttachment());
        }
        else return 0;
    }

    public static float getGenetic(LivingEntity entity, String value) {
        return getGenetic(entity, Genetics.valueOf(value));
    }

    public static Map<Genetics, Float> getRenderGenetics(LivingEntity entity){
        Map<Genetics, Float> output = new HashMap<>();
        for(Genetics value : Genetics.getGeneticsToRender()){
            output.put(value, getGenetic(entity, value));
        }
        return output;
    }


    public static void RandomizeHorseGenetics(GeneticHorseEntity entity){
        Random random = new Random();
        Map<String, Vec2> breedLimits;

        if(GeneticBreeds.contains(entity.getBreed())){
            breedLimits = entity.getBreed().getLimits();
        } else {
            breedLimits = Map.of();
        }
        for(int i = 0; i < Genetics.values().length; i++) {
            Genetics value = Genetics.values()[i];
            if (value.getDefaultMaxSize() != 0) {
                if (value.getCategory() == GeneticCategories.SKILL_GENETICS) {
                    float min = breedLimits.containsKey(value.name()) ? breedLimits.get(value.name()).x : 0;
                    float max = breedLimits.containsKey(value.name()) ? breedLimits.get(value.name()).y : value.getDefaultMaxSize();
                    float randomNum = 0;
                    if(max != 0){
                        randomNum = random.nextFloat(min, max - 2) + 3;
                        randomNum = (float) Math.round(randomNum * 100) / 100;
                    }
                    GeneticsHandler.setEntityGenetic(entity, value, randomNum);
                } else if (value.name().equals("SCALE")){
                    float min = breedLimits.containsKey(value.name()) ? breedLimits.get(value.name()).x : 0;
                    float max = breedLimits.containsKey(value.name()) ? breedLimits.get(value.name()).y : value.getDefaultMaxSize();
                    float randomNum = 0;
                    if(max != 0) {
                        randomNum = random.nextFloat(min, max);
                        randomNum = (float) Math.round(randomNum * 100) / 100;
                    }
                    GeneticsHandler.setEntityGenetic(entity, value, randomNum);
                } else {
                    int min = Math.round(breedLimits.containsKey(value.name()) ? breedLimits.get(value.name()).x : 0);
                    int max = Math.round(breedLimits.containsKey(value.name()) ? breedLimits.get(value.name()).y : value.getDefaultMaxSize());
                    int randomNum = 0;
                    if(max != 0){
                        randomNum = random.nextInt(min, max) + 1;
                    }
                    GeneticsHandler.setEntityGenetic(entity, value, randomNum);
//                EquigenMod.LOGGER.info("Genetic " + value.name() + " set to " + randomNum);
                }
            }
        }
    }

}
