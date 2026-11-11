package net.buckleystudios.equigen.entity.genetic_horse.client.texturer;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.Genetics;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticsHandler;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.util.GeneticsCalculator;
import net.minecraft.world.phys.Vec2;

import java.util.*;

public enum CoatColors {
    //BASE BAY
    STANDARD_BAY(geneticType.BASE_COAT, baseCoat.BAY, null,
            Map.of(Genetics.WARMTH, new Vec2(35, 65),
                    Genetics.DARKNESS, new Vec2(20, 40),
                    Genetics.RICHNESS, new Vec2(60, Genetics.RICHNESS.getDefaultMaxSize())),
            flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR),

    DARK_BAY(geneticType.BASE_COAT, baseCoat.BAY, null,
            Map.of(Genetics.WARMTH, new Vec2(20, 60),
                    Genetics.DARKNESS, new Vec2(10, 30),
                    Genetics.RICHNESS, new Vec2(50, Genetics.RICHNESS.getDefaultMaxSize())),
            flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR),

    MAHOGANY_BAY(geneticType.BASE_COAT, baseCoat.BAY, null,
            Map.of(Genetics.WARMTH, new Vec2(0, 20),
                    Genetics.DARKNESS, new Vec2(5, 15),
                    Genetics.RICHNESS, new Vec2(70, 100)),
            flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR),

    BLOOD_BAY(geneticType.BASE_COAT, baseCoat.BAY,
            Map.of(Genetics.CREAM, valueFlags.HETEROZYGOUS_PLUS),
            Map.of(Genetics.WARMTH, new Vec2(0, 20),
                    Genetics.DARKNESS, new Vec2(20, 40),
                    Genetics.RICHNESS, new Vec2(70, 100)),
            flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR),// CHECK THIS ONE!! HARD TO GET A REALLY RED COLOR WITH THE BAY VALUES

    COPPER_BAY(geneticType.BASE_COAT, baseCoat.BAY, null,
            Map.of(Genetics.WARMTH, new Vec2(10, 25),
                    Genetics.DARKNESS, new Vec2(50, 85),
                    Genetics.RICHNESS, new Vec2(70, 100)),
            flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR),

    WILD_BAY(geneticType.BASE_COAT, baseCoat.BAY, null,
            Map.of(Genetics.WARMTH, new Vec2(35, 65),
                    Genetics.DARKNESS, new Vec2(15, 35),
                    Genetics.RICHNESS, new Vec2(50, Genetics.RICHNESS.getDefaultMaxSize())),
            flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR), // HAVE TO MAKE THIS ONE HAVE LOW BLACK LEG MARKINGS

    GOLDEN_BAY(geneticType.BASE_COAT, baseCoat.BAY, null,
            Map.of(Genetics.WARMTH, new Vec2(60, 90),
                    Genetics.DARKNESS, new Vec2(30, 65),
                    Genetics.RICHNESS, new Vec2(70, 100)),
            flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR),

    SANDY_BAY(geneticType.BASE_COAT, baseCoat.BAY,
            Map.of(Genetics.CREAM, valueFlags.HOMOZYGOUS),
            Map.of(Genetics.WARMTH, new Vec2(70, 100),
                    Genetics.DARKNESS, new Vec2(80, 100),
                    Genetics.RICHNESS, new Vec2(25, 50)),
            flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR),

    CHERRY_BAY(geneticType.BASE_COAT, baseCoat.BAY, null,
            Map.of(Genetics.WARMTH, new Vec2(0, 30),
                    Genetics.DARKNESS, new Vec2(20, 40),
                    Genetics.RICHNESS, new Vec2(40, 70)),
            flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR), //Maybe swap these values w/ blood bay?

    BROWN(geneticType.BASE_COAT, baseCoat.BAY, null,
            Map.of(Genetics.WARMTH, new Vec2(80, 100),
                    Genetics.DARKNESS, new Vec2(20, 40),
                    Genetics.RICHNESS, new Vec2(80, 100)),
            flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR),

//    SEAL_BROWN(geneticType.BASE_COAT, baseCoat.BAY,
//            Map.of(Genetics.CREAM, valueFlags.ANY),
//            Map.of(Genetics.WARMTH, new Vec2(0, 0),
//                    Genetics.DARKNESS, new Vec2(0, 0),
//                    Genetics.RICHNESS, new Vec2(0, 0)),
//            flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR), // NEED TO ADD THIS ONE, SPECIAL LAYERS FOR SEAL BROWN

//    BASE CHESTNUT
    STANDARD_CHESTNUT(geneticType.BASE_COAT, baseCoat.CHESTNUT,
        null,
        Map.of(Genetics.WARMTH, new Vec2(40, 60),
                Genetics.DARKNESS, new Vec2(40, 60),
                Genetics.RICHNESS, new Vec2(80, 100)),
        flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR),
//    FLAXEN_CHESTNUT(geneticType.BASE_COAT, baseCoat.CHESTNUT,
//            null,
//            Map.of(Genetics.WARMTH, new Vec2(0, 0),
//                    Genetics.DARKNESS, new Vec2(0, 0),
//                    Genetics.RICHNESS, new Vec2(0, 0)),
//            flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR),  TO IMPLEMENT LATER!! Needs special mane. Genetic component?
    SORREL(geneticType.BASE_COAT, baseCoat.CHESTNUT,
            null,
            Map.of(Genetics.WARMTH, new Vec2(0, 30),
                    Genetics.DARKNESS, new Vec2(40, 60),
                    Genetics.RICHNESS, new Vec2(75, 100)),
            flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR),
    DARK_CHESTNUT(geneticType.BASE_COAT, baseCoat.CHESTNUT,
            null,
            Map.of(Genetics.WARMTH, new Vec2(40, 60),
                    Genetics.DARKNESS, new Vec2(10, 40),
                    Genetics.RICHNESS, new Vec2(80, 100)),
            flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR),
    LIVER_CHESTNUT(geneticType.BASE_COAT, baseCoat.CHESTNUT,
            null,
            Map.of(Genetics.WARMTH, new Vec2(0, 10),
                    Genetics.DARKNESS, new Vec2(0, 10),
                    Genetics.RICHNESS, new Vec2(60, 100)),
            flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR),
    LIGHT_CHESTNUT(geneticType.BASE_COAT, baseCoat.CHESTNUT,
            null,
            Map.of(Genetics.WARMTH, new Vec2(40, 80),
                    Genetics.DARKNESS, new Vec2(60, 80),
                    Genetics.RICHNESS, new Vec2(60, 80)),
            flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR),
    RED_CHESTNUT(geneticType.BASE_COAT, baseCoat.CHESTNUT,
            null,
            Map.of(Genetics.WARMTH, new Vec2(0, 10),
                    Genetics.DARKNESS, new Vec2(40, 60),
                    Genetics.RICHNESS, new Vec2(60, 90)),
            flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR),

     //BASE BLACK
    STANDARD_BLACK(geneticType.BASE_COAT, baseCoat.BLACK,
             null,
             Map.of(Genetics.WARMTH, new Vec2(0, 100),
                     Genetics.DARKNESS, new Vec2(25, 50),
                     Genetics.RICHNESS, new Vec2(0, 100)),
             flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR),
    JET_BLACK(geneticType.BASE_COAT, baseCoat.BLACK,
            null,
            Map.of(Genetics.WARMTH, new Vec2(0, 100),
                    Genetics.DARKNESS, new Vec2(0, 25),
                    Genetics.RICHNESS, new Vec2(50, 100)),
            flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR),
    FADED_BLACK(geneticType.BASE_COAT, baseCoat.BLACK,
            null,
            Map.of(Genetics.WARMTH, new Vec2(0, 100),
                    Genetics.DARKNESS, new Vec2(50, 100),
                    Genetics.RICHNESS, new Vec2(50, 100)),
            flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR),

      //CREAM_MODIFIERS
    BUCKSKIN(geneticType.BASE_COAT, baseCoat.BAY,
              Map.of(Genetics.CREAM, valueFlags.HETEROZYGOUS),
              Map.of(Genetics.WARMTH, new Vec2(0, 0),
                      Genetics.DARKNESS, new Vec2(0, 0),
                      Genetics.RICHNESS, new Vec2(0, 0)),
              flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR),
    PALOMINO(geneticType.BASE_COAT, baseCoat.CHESTNUT,
            Map.of(Genetics.CREAM, valueFlags.HETEROZYGOUS),
            Map.of(Genetics.WARMTH, new Vec2(0, 0),
                    Genetics.DARKNESS, new Vec2(0, 0),
                    Genetics.RICHNESS, new Vec2(0, 0)),
            flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR),
    SMOKY_BLACK(geneticType.BASE_COAT, baseCoat.BLACK,
            Map.of(Genetics.CREAM, valueFlags.HETEROZYGOUS),
            Map.of(Genetics.WARMTH, new Vec2(0, 0),
                    Genetics.DARKNESS, new Vec2(0, 0),
                    Genetics.RICHNESS, new Vec2(0, 0)),
            flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR),

    CREMELLO(geneticType.BASE_COAT, baseCoat.CHESTNUT,
            Map.of(Genetics.CREAM, valueFlags.HOMOZYGOUS),
            Map.of(Genetics.WARMTH, new Vec2(0, 0),
                    Genetics.DARKNESS, new Vec2(0, 0),
                    Genetics.RICHNESS, new Vec2(0, 0)),
            flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR),
    PERLINO(geneticType.BASE_COAT, baseCoat.BAY,
            Map.of(Genetics.CREAM, valueFlags.HOMOZYGOUS),
            Map.of(Genetics.WARMTH, new Vec2(0, 0),
                    Genetics.DARKNESS, new Vec2(0, 0),
                    Genetics.RICHNESS, new Vec2(0, 0)),
            flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR),
    SMOKY_CREAM(geneticType.BASE_COAT, baseCoat.CHESTNUT,
            Map.of(Genetics.CREAM, valueFlags.HOMOZYGOUS),
            Map.of(Genetics.WARMTH, new Vec2(0, 0),
                    Genetics.DARKNESS, new Vec2(0, 0),
                    Genetics.RICHNESS, new Vec2(0, 0)),
            flags.ALLOWS_MARKINGS, flags.ALLOWS_ANY_EYE_COLOR),

    //DUN MODIFIERS
//
//
//
//    BUCKSKIN_PEARL(), //CR/prl
//    PALOMINO_PEARL(),
//    SMOKY_BLACK_PEARL(),
//
//
    STANDARD_DUN(geneticType.BASE_COAT, baseCoat.BAY,
            Map.of(Genetics.DUN, valueFlags.HETEROZYGOUS_PLUS),
            Map.of(Genetics.WARMTH, new Vec2(10, 35),
                    Genetics.DARKNESS, new Vec2(15, 30),
                    Genetics.RICHNESS, new Vec2(30, Genetics.RICHNESS.getDefaultMaxSize())),
            flags.BLACK_POINT);

    private final geneticType type;
    private final baseCoat coat;
    private final Map<Genetics, valueFlags> relatedGenetics;
    private final Map<Genetics, Vec2> variationGenetics; // x num is lowest variation, y is highest
    private final EnumSet<flags> flagList;

    CoatColors(geneticType type, baseCoat baseCoat, Map<Genetics, valueFlags> relatedGenetics, Map<Genetics, Vec2> variationGenetics, flags... flags) {
        this.type = type;
        this.coat = baseCoat;
        this.relatedGenetics = relatedGenetics;
        this.variationGenetics = variationGenetics;

        this.flagList = flags.length == 0 ? EnumSet.noneOf(flags.class) : EnumSet.copyOf(List.of(flags));
    }
        public enum geneticType {
        BASE_COAT, //Base coat colors (bay, chestnut, and black) and their variations.
        MODIFIER, //Coat addon, such as Roan.
        PATTERN,
        MARKING
    }
    public enum baseCoat{
        BAY,
        CHESTNUT,
        BLACK
    }
    public enum valueFlags{
        NOT_PRESENT, // e/e
        HETEROZYGOUS,  // E/e
        HOMOZYGOUS,  // E/E
        HETEROZYGOUS_PLUS, // E/e or E/E
        ANY // e/e E/e or E/E
    }
    public enum flags{
        MODIFIES_MANE,
        MODIFIES_TAIL,
        BLACK_POINT,
        ADDITIONAL_BODY_LAYER,
        POSSIBLE_PATTERN,
        ALLOWS_MARKINGS,
        ALLOWS_ANY_EYE_COLOR
    }

    public EnumSet<flags> getFlagList() {
        return flagList;
    }

    public Map<Genetics, valueFlags> getRelatedGenetics() {
        return relatedGenetics;
    }

    public Map<Genetics, Vec2> getVariationGenetics() {
        return variationGenetics;
    }

    public baseCoat getBaseCoat() {
        return coat;
    }

    public static baseCoat findBaseCoat(GeneticHorseEntity entity) {
        float agouti = GeneticsHandler.getGeneticFloat(entity, Genetics.AGOUTI);
        float extension = GeneticsHandler.getGeneticFloat(entity, Genetics.EXTENSION);
        EquigenMod.LOGGER.info("AGOUTI = {}, EXTENSION = {}", agouti, extension);

        if (extension == 1.0f) {
            //Chestnut e/e _/_
            return baseCoat.CHESTNUT;
        } else if (agouti == 1.0f && extension >= 2.0f) {
            //Black E/_ a/a
            return baseCoat.BLACK;
        } else {
            //Bay E/_ A_
            return baseCoat.BAY;
        }
    }

    public static Map<CoatColors, Integer> returnCoats(Map<CoatColors, Integer> r, baseCoat base) {
        Map<CoatColors, Integer> coats = new HashMap<>();
        EquigenMod.LOGGER.info("COAT = {}", base);
        for (Map.Entry<CoatColors, Integer> entry : r.entrySet()) {
            if (entry.getKey().coat.equals(base)) {
                coats.put(entry.getKey(), entry.getValue());
            } else {
                EquigenMod.LOGGER.info("{} DOESN'T MATCH {}, MOVING ON", base, entry.getKey().coat);
            }
        }
        return coats;
    }
    public static CoatColors randomizeBreedCoatColor(Map<CoatColors, Integer> r) {
        List<CoatColors> coats = new ArrayList<>(List.of());
        List<Float> percentages = new ArrayList<>(List.of());
        GeneticsCalculator calculator = new GeneticsCalculator();

        for (Map.Entry<CoatColors, Integer> entry : r.entrySet()) {
            coats.add(entry.getKey());
            percentages.add(Float.valueOf(entry.getValue()));
            EquigenMod.LOGGER.info("COAT GENERATOR: ADDING {} WITH A {} PERCENT CHANCE!", entry.getKey(), entry.getValue());
        }
        float percentileResult = calculator.percentileGenerator(percentages);

        for (int i = 0 ; i < r.size(); i++) {
            if (percentileResult == i) {
                return coats.get(i);
            } else {
                EquigenMod.LOGGER.info(percentileResult + " DOESNT EQUAL " + i + ", MOVING ON");
            }
        }
        return null;
    }
    }
