package net.buckleystudios.equigen.entity.custom.genetics;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneticsCalculator {
    public String reroll = "";
    GeneticHorseEntity entity;

    public GeneticsCalculator(GeneticHorseEntity entity) {
        this.entity = entity;
    }

    public float standardInheritance(int percentileResult, List<Float> arrs) {
        float geneticValue;
        for (int i = 0 ; i < arrs.size(); i++) {
            if (percentileResult == i) {
                geneticValue = arrs.get(i);
                EquigenMod.LOGGER.info("Percentile Result = " + percentileResult + ", setting genetic to " + geneticValue);
                return geneticValue;
            } else {
                EquigenMod.LOGGER.info(percentileResult + " DOESNT EQUAL " + i + ", MOVING ON");
            }

        }
        EquigenMod.LOGGER.info("Something went wrong");
        return -1;
    }
    public float punnettInheritance(float gen1, float gen2) {
        Random random = new Random();
        List<Integer> mGenotypes = getAlleles(gen1);
        List<Integer> dGenotypes = getAlleles(gen2);

        EquigenMod.LOGGER.info("Mother's Genetic = " + gen1 + " Father's Genetic = " + gen2);

        List<Integer> possibleChildren = new ArrayList<>();
        int counter = 0;
        for (int m1 : mGenotypes) {
            for (int d1 : dGenotypes) {
                possibleChildren.add(getGenotypeFromAlleles(m1, d1));
                EquigenMod.LOGGER.info("Possible child added = " + possibleChildren.get(counter));
                counter++;
            }
        }
        int percentileResult = random.nextInt(0, 4);
        EquigenMod.LOGGER.info("Punnet Square Percentile Result = " + percentileResult + ". Setting genetic to " + possibleChildren.get(percentileResult));
        return (float) possibleChildren.get(percentileResult);
    }


    int rolls = 0;

    public float ladderInheritance(String geneticType, GeneticValues value, int percentileResult, float gen1, float gen2, float gen3, float gen4, float gen5, float gen6, float gen7) {
        //This is an inheritance method where the genetic cannot be repeated, and will therefore be rerolled if it matches other genetics.
        char variation = 0;
        int variationNum = -1;
        String type = "";
        EquigenMod.LOGGER.info("Percentile Result (Ladder) = " + percentileResult);
        if (geneticType.equals("PATTERN")) {
            variation = value.name().charAt(value.name().length() - 1);
            variationNum = Character.getNumericValue(variation);
            type = value.name().replace(variation, ' ');
        } else if (geneticType.equals("PERSONALITY") || geneticType.equals("TRAIT")) {
            variation = value.name().charAt(0);
            switch (variation) {
                case 'M' -> {
                    variationNum = 0;
                    type = value.name().replace("MAIN", " ");
                }
                case 'F' -> {
                    variationNum = 1;
                    type = value.name().replace("FIRST", " ");
                }
                case 'S' -> {
                    variationNum = 2;
                    type = value.name().replace("SECOND", " ");
                }
                case 'T' -> {
                    variationNum = 3;
                    type = value.name().replace("THIRD", " ");
                }
            }

        }
        float genetic;

        if (rolls == 2) {
            genetic = standardInheritance(percentileResult, List.of(gen1, gen2, gen3, gen4, gen5, gen6, gen7));
            rolls = 0;
        } else {
            genetic = entity.getGenetic(type.replace(' ', '1'));
        }
        // Set it so that after a certain number of rolls it sets the genetic to 0, except for in the case of Variation 3, so that people cant get horses with the same pattern variations and breed them to get better chance of randoms.


        if (variationNum >= 2) {
            EquigenMod.LOGGER.info("Variation = " + variation + ". Variation Num = " + variationNum);
            float var1 = 0.0F;
            if (geneticType.equals("PATTERN")) {
                var1 = entity.getGenetic(type.replace(' ', '1'));
            } else {
                var1 = entity.getGenetic(type.replace(" ", "FIRST"));
            }
            float var2 = genetic;

            if (var1 == var2) {
                reroll = value.name();
                rolls++;
                EquigenMod.LOGGER.info(value.name() + " is equal to variation 1, rerolling.");
            }
            if (variationNum == 3) {
                if (geneticType.equals("PATTERN")) {
                    var2 = entity.getGenetic(type.replace(' ', '2'));
                } else {
                    var2 = entity.getGenetic(type.replace(" ", "SECOND"));
                }

                if (var1 == genetic || var2 == genetic) {
                    reroll = value.name();
                    rolls++;
                    EquigenMod.LOGGER.info(value.name() + " is equal to the other variations, rerolling.");
                }
            }
        }
        return genetic;
    }

    public float ladderInheritance(String geneticType, GeneticValues value, int percentileResult, float gen1, float gen2, float gen3, float gen4, float gen5, float gen6) {
        return ladderInheritance(geneticType, value, percentileResult, gen1, gen2, gen3, gen4, gen5, gen6, 0.0F);
    }

    public float ladderInheritance(String geneticType, GeneticValues value, int percentileResult, float gen1, float gen2, float gen3, float gen4, float gen5) {
        return ladderInheritance(geneticType, value, percentileResult, gen1, gen2, gen3, gen4, gen5, 0.0F);
    }

    public float ladderInheritance(String geneticType, GeneticValues value, int percentileResult, float gen1, float gen2, float gen3, float gen4) {
        return ladderInheritance(geneticType, value, percentileResult, gen1, gen2, gen3, gen4, 0.0F);
    }

    public float ladderInheritance(String geneticType, GeneticValues value, int percentileResult, float gen1, float gen2, float gen3) {
        return ladderInheritance(geneticType, value, percentileResult, gen1, gen2, gen3, 0.0F);
    }

    //Splits up the genetic code into Alleles
    public List<Integer> getAlleles(float genetic) {
        List<Integer> genotypes = new ArrayList<>();
        switch ((int) genetic) {
            case 0:
                genotypes.add(0);
                genotypes.add(0);
                break;
            case 1:
                genotypes.add(0);
                genotypes.add(1);
                break;
            case 2:
                genotypes.add(1);
                genotypes.add(1);
                break;
            default:
                EquigenMod.LOGGER.error("Invalid genotype " + genetic);
        }
        return genotypes;
    }

    //Gets the genetic code from alleles. Ex: aa = 0, aA = 1, and AA = 2
    private int getGenotypeFromAlleles(int a1, int a2) {
        int sum = a1 + a2;
        if (sum == 0) {
            return 1;
        } else if (sum == 1) {
            return 2;
        } else {
            return 3;
        }
    }
    Random RNG = new Random();
    public int percentileGenerator(List<Integer> arrs) {
        List<Integer> maxArrs = new ArrayList<>();
        int cumulativeArrs = 0;

        for (int r : arrs) {
            cumulativeArrs += r;
            maxArrs.add(cumulativeArrs);
        }
        if (cumulativeArrs != 100) {
            EquigenMod.LOGGER.error("Percentile Generator: The percentage chances of the selected genetics don't add up to 100");
        }
        int GeneratedNumber = RNG.nextInt(100) + 1;
        EquigenMod.LOGGER.info("Random Generated Number = " + GeneratedNumber);
        for (int i = 0; i < maxArrs.size(); i++) {
            EquigenMod.LOGGER.info("i = " + i);
            if (GeneratedNumber <= maxArrs.get(i)) {
                EquigenMod.LOGGER.info("Percentile Result " + i + " Selected!");
                return i;
            }
        }
        EquigenMod.LOGGER.error("Percentile Generator: Somehow, The Random number between 1-100 isn't actually between 1-100");
        return 0;

    }

    public float random(float minValue, float maxValue, float valueMin, float valueCap, float variation, int roundTo) {
        //Variation = percentage variation (in form of decimal) above and below the minValue and maxValue that the number can be. For example,
        //if maxValue is 0.5 and variation is 0.10, then the actual max is 0.55.

        //roundTo is the amount of decimal places that you want it to be rounded to. If you want it to be 2 decimal places you would put 100.
        if (variation > 1.0f) {
            EquigenMod.LOGGER.error("ERROR! Random number varation is greater than 1.0 Variation is " + variation);
            return -1;
        }
        float newMin = findMin(minValue, maxValue, valueMin, variation);
        float newMax = findMax(minValue, maxValue, valueCap, variation);
        maxValue = maxValue + 0.01f;

        if (newMin == newMax) {
            EquigenMod.LOGGER.info("MINVALUE = MAXVALUE");
            return newMin;
        }

        EquigenMod.LOGGER.info("New Min = " + newMin + ". New Max = " + newMax);

        if (minValue > maxValue) {
            EquigenMod.LOGGER.error("ERROR! Random number newMin (" + newMin + ") is larger than  (" + newMax + ")");
            return -1;
        }
        int rounded = (int)((RNG.nextFloat((newMax - newMin) + 0.01F) + newMin) * roundTo);
        EquigenMod.LOGGER.info("Rounded random = " + rounded);

        return ((float) rounded / roundTo);
    }

    public float random (float minValue, float maxValue, float valueMin, float valueCap, float variation) {
        return random(minValue, maxValue, valueMin, valueCap, variation, 100);
    }
    public float random (float minValue, float maxValue, float valueMin, float valueCap, int roundTo) {
        return random(minValue, maxValue, valueMin, valueCap, 0.00f, roundTo);
    }
    public float random (float minValue, float maxValue, float valueMin, float valueCap) {
        return random(minValue, maxValue, valueMin, valueCap, 0.00f, 100);
    }

    public float findMin (float minValue, float maxValue, float valueMin, float variation) {
        float averagedNum = (minValue + maxValue) / 2.0f;
        float difference = ((averagedNum * (1 + variation)) - (averagedNum));
        float newMin = (minValue - difference);
        if (newMin < valueMin) {
            EquigenMod.LOGGER.info("NEWMIN (" + newMin + ") WAS LESS THAN " + valueMin);
            newMin = valueMin;
        }
        return newMin;
    }
    public float findMax (float minValue, float maxValue, float valueCap, float variation) {
        float averagedNum = (minValue + maxValue) / 2.0f;
        float difference = ((averagedNum * (1 + variation)) - (averagedNum));
        float newMax = (maxValue + difference);
        if (newMax > valueCap) {
            newMax = valueCap;
            EquigenMod.LOGGER.info("NEWMAX WAS GREATER THAN " + valueCap);

        }
        return newMax;
    }

}
