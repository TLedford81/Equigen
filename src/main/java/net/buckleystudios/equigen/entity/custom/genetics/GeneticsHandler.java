package net.buckleystudios.equigen.entity.custom.genetics;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.custom.genetics.util.GeneticCategories;
import net.buckleystudios.equigen.entity.custom.genetics.util.GeneticsCalculator;
import net.buckleystudios.equigen.entity.custom.genetics.util.Heritable;
import net.buckleystudios.equigen.network.packets.GeneticData;
import net.minecraft.world.entity.LivingEntity;
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

        if (!entity.level().isClientSide() && genetic.isSyncToClient()) {
            syncGeneticsToClient(entity, List.of(genetic));
        }
    }

    public static void syncGeneticsToClient(LivingEntity entity, List<Genetics> geneList){
        for (Genetics gene : geneList){
            PacketDistributor.sendToPlayersTrackingEntity(entity, new GeneticData(entity.getId(), gene.name(), getGeneticFloat(entity, gene)));
        }
    }

    public static void syncGeneticsToClient(LivingEntity entity){
        syncGeneticsToClient(entity, Genetics.getGeneticsToRender());
    }

    public static float getGeneticFloat(LivingEntity entity, Genetics value) {
        if(entity.hasData(value.getDataAttachment())){
            return entity.getData(value.getDataAttachment());
        }
        else return 0;
    }

    public static float getGeneticFloat(LivingEntity entity, String value) {
        return getGeneticFloat(entity, Genetics.valueOf(value));
    }

    public static Map<Genetics, Float> getRenderGenetics(LivingEntity entity){
        Map<Genetics, Float> output = new HashMap<>();
        for(Genetics value : Genetics.getGeneticsToRender()){
            output.put(value, getGeneticFloat(entity, value));
        }
        return output;
    }


    public static void RandomizeHorseGenetics(GeneticHorseEntity entity){
        Random random = new Random();
        Map<String, GeneticBreeds.BreedValues> breedLimits;
        // Float List Order: Min, Max, Average, chanceLow, chanceAverage, chanceHigh
        GeneticsCalculator calculator = new GeneticsCalculator();

        if(GeneticBreeds.contains(entity.getBreed())){
            breedLimits = entity.getBreed().getLimits();
        } else {
            breedLimits = Map.of();
        }
        for(int i = 0; i < Genetics.values().length; i++) {
            Genetics value = Genetics.values()[i];
            EquigenMod.LOGGER.info("HANDLING THE {} GENETIC", value.name());
            if (value.getDefaultMaxSize() != 0) {
                float chanceLow = breedLimits.containsKey(value.name()) ? breedLimits.get(value.name()).getChanceLow() : 0;
                float chanceAverage = breedLimits.containsKey(value.name()) ? breedLimits.get(value.name()).getChanceAverage() : 0;
                float chanceHigh = breedLimits.containsKey(value.name()) ? breedLimits.get(value.name()).getChanceHigh() : 0;
                float average = breedLimits.containsKey(value.name()) ? breedLimits.get(value.name()).getAverage() : 0;
                EquigenMod.LOGGER.info("CHANCE_LOW = {} CHANCE_AVERAGE = {} CHANCE_HIGH = {} AVERAGE = {}", chanceLow, chanceAverage, chanceHigh, average);


                if (value.getCategory() == GeneticCategories.SKILL_GENETICS || value.name().equals("SCALE")) {
                    float randomNum = 0;
                    float min = breedLimits.containsKey(value.name()) ? breedLimits.get(value.name()).getMin() : 0;
                    float max = breedLimits.containsKey(value.name()) ? breedLimits.get(value.name()).getMax() : value.getDefaultMaxSize();
                    float bottomHalf = ((average + min)/2);
                    float topHalf = ((average + max)/2);
                    float chanceLowBottomHalf = chanceLow * 0.25F;
                    float chanceHighTopHalf = chanceHigh * 0.25F;
                    EquigenMod.LOGGER.info("MIN = {} MAX = {} BOTTOMHALF = {} TOPHALF = {} CHANCE_LOW_BOTTOM_HALF = {} CHANCE_HIGH_TOP_HALF = {}", min, max, bottomHalf, topHalf, chanceLowBottomHalf, chanceHighTopHalf);

                    //Code below handles setting the breed genetics when a horse is spawned. It also handles a breed being more likely to have a certain value.
                    if (value.getCategory() == GeneticCategories.SKILL_GENETICS) {
                        if(max != 0){
                            if (chanceAverage <= 0) {
                                randomNum = random.nextFloat(min, max - 2) + 3;
                                randomNum = (float) Math.round(randomNum * 100) / 100;
                            } else {
                                randomNum = calculator.standardInheritance(calculator.percentileGenerator(List.of(chanceLowBottomHalf, chanceLow - chanceLowBottomHalf, chanceAverage, chanceHigh - chanceHighTopHalf, chanceHighTopHalf)),
                                        List.of(calculator.random(min, bottomHalf, 3, value.getDefaultMaxSize()), //LOWEST POSSIBLE VALUE
                                                calculator.random(bottomHalf, average - 0.25F, 3, value.getDefaultMaxSize()), //LOWER AVERAGE
                                                calculator.random(average - 0.25F, average + 0.25F, 3, value.getDefaultMaxSize()), //AVERAGE
                                                calculator.random(average + 0.25F, topHalf, 3, value.getDefaultMaxSize()), //HIGHER AVERAGE
                                                calculator.random(topHalf, max, 3, value.getDefaultMaxSize()) //HIGHEST POSSIBLE VALUE
                                        ));
                                randomNum = (float) Math.round(randomNum * 100) / 100;
                            }
                        }
                        GeneticsHandler.setEntityGenetic(entity, value, randomNum);
                    } else { //SCALE
                        if(max != 0) { //Adjusted for the fact that Scale has a max value of 1.0 while Skills have a max of 10.0
                            if (chanceLow <= 0 || chanceAverage <= 0 || chanceHigh <= 0 || average <= 0) {
                                randomNum = random.nextFloat(min, max);
                                randomNum = (float) Math.round(randomNum * 100) / 100;
                            } else {
                                randomNum = calculator.standardInheritance(calculator.percentileGenerator(List.of(chanceLowBottomHalf, chanceLow - chanceLowBottomHalf, chanceAverage, chanceHigh - chanceHighTopHalf, chanceHighTopHalf)),
                                        List.of(calculator.random(min, bottomHalf, 0.01F, value.getDefaultMaxSize()), //LOWEST POSSIBLE VALUE
                                                calculator.random(bottomHalf, average - 0.05F, 0.01F, value.getDefaultMaxSize()), //LOWER AVERAGE
                                                calculator.random(average - 0.05F, average + 0.05F, 0.01F, value.getDefaultMaxSize()), //AVERAGE
                                                calculator.random(average + 0.05F, topHalf, 0.01F, value.getDefaultMaxSize()), //HIGHER AVERAGE
                                                calculator.random(topHalf, max, 0.01F, value.getDefaultMaxSize()) //HIGHEST POSSIBLE VALUE
                                        ));
                                randomNum = (float) Math.round(randomNum * 100) / 100;
                            }
                        }
                }
                    GeneticsHandler.setEntityGenetic(entity, value, randomNum);
                } else {
                    int min = Math.round(breedLimits.containsKey(value.name()) ? breedLimits.get(value.name()).getMin() : 0);
                    int max = Math.round(breedLimits.containsKey(value.name()) ? breedLimits.get(value.name()).getMax() : value.getDefaultMaxSize());
                    int randomNum = 0;
                    if(max != 0) {
                        if (chanceAverage <= 0) {
                            randomNum = random.nextInt(min, max) + 1;
                        } else {
                            randomNum = (int) calculator.standardInheritance(calculator.percentileGenerator(List.of(chanceLow, chanceAverage, chanceHigh)),
                                    List.of(calculator.random(min, average - 1, 1, value.getDefaultMaxSize()),
                                            average,
                                            calculator.random(average + 1, max, 1, value.getDefaultMaxSize())
                                    ));
                        }
                    }
                    GeneticsHandler.setEntityGenetic(entity, value, randomNum);
//                EquigenMod.LOGGER.info("Genetic " + value.name() + " set to " + randomNum);
                }
            }
        }
    }

    public static GeneticValues.MUSCLE_MASS getMuscleMassValue(GeneticHorseEntity entity) {
        return getGeneticValue(entity, Genetics.MUSCLE_MASS, GeneticValues.MUSCLE_MASS.class);
    }

    public static GeneticValues.BACK_LENGTH getBackLengthValue(GeneticHorseEntity entity) {
        return getGeneticValue(entity, Genetics.BACK_LENGTH, GeneticValues.BACK_LENGTH.class);
    }

    public static GeneticValues.BACK_GIRTH getBackGirthValue(GeneticHorseEntity entity) {
        return getGeneticValue(entity, Genetics.BACK_GIRTH, GeneticValues.BACK_GIRTH.class);
    }

    public static GeneticValues.CHEST_SIZE getChestSizeValue(GeneticHorseEntity entity) {
        return getGeneticValue(entity, Genetics.CHEST_SIZE, GeneticValues.CHEST_SIZE.class);
    }

    public static GeneticValues.NECK_CURVE getNeckCurveValue(GeneticHorseEntity entity) {
        return getGeneticValue(entity, Genetics.NECK_CURVE, GeneticValues.NECK_CURVE.class);
    }

    public static GeneticValues.NECK_LENGTH getNeckLengthValue(GeneticHorseEntity entity) {
        return getGeneticValue(entity, Genetics.NECK_LENGTH, GeneticValues.NECK_LENGTH.class);
    }

    private static <E extends Enum<E>> E getGeneticValue(GeneticHorseEntity entity, Genetics gene, Class<E> valueType){
        return GeneticValues.fromInt(
                valueType,
                (int) GeneticsHandler.getGeneticFloat(entity, gene));
    }

}
