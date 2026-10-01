package net.buckleystudios.equigen.entity.genetic_horse.client.texturer.base;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.Genetics;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticsHandler;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.util.GeneticCategories;

import java.awt.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TextureCalculator {

    public int getBaseColor(GeneticHorseEntity entity) {
        float warmth = GeneticsHandler.getGeneticFloat(entity, Genetics.WARMTH);
        float darkness = GeneticsHandler.getGeneticFloat(entity, Genetics.DARKNESS);
        float richness = GeneticsHandler.getGeneticFloat(entity, Genetics.RICHNESS);
        EquigenMod.LOGGER.info("WARMTH = {}, DARKNESS = {}, RICHNESS = {}", warmth, darkness, richness);


        float blackModifier = GeneticsHandler.getGeneticFloat(entity, Genetics.BLACK_MODIFIER);
        float redModifier = GeneticsHandler.getGeneticFloat(entity, Genetics.RED_MODIFIER);

        float hue;
        float saturation;
        float brightness;

        if (blackModifier == 1.0f) {
            //Chestnut e/e _/_
            hue = 15 + (warmth * 0.1F);
            saturation = 55 + (richness * 0.35F);
            brightness = 45 + (darkness * 0.40F);
        } else if (redModifier == 1.0f && blackModifier >= 2.0f) {
            //Black E/_ a/a
            hue = 18 + (warmth * 0.12F);
            saturation = 2 + (richness * 0.12F);
            brightness = 20 + (darkness * 0.15F);
        } else {
            //Bay E/_ A_
            hue = 24 + (warmth * 0.1F);
            saturation = 40 + (richness * 0.35F);
            brightness = 60 + (darkness * 0.35F);
        }

        hue /= 360f;
        saturation /= 100f;
        brightness /= 100f;

        EquigenMod.LOGGER.info("HUE = {}, SATURATION = {}, BRIGHTNESS = {}", hue, saturation, brightness);

        return Color.HSBtoRGB(hue, saturation, brightness);
    }


    private int applyModifiers(GeneticHorseEntity entity, int RGB, String baseColor) {
        java.util.List<Genetics> genetics = Genetics.getTextureGenetics();
        java.util.List<Genetics> presentModifiers = new ArrayList<>(List.of());
        for (Genetics g : genetics) {
            if (g.getCategory().equals(GeneticCategories.COAT_MODIFIERS)) {
                float gene = GeneticsHandler.getGeneticFloat(entity, g.name());
                if (gene >= 2.0F) { // E/e or above
                    presentModifiers.add(g);
                    EquigenMod.LOGGER.info("ADDING {} GENETIC TO PRESENT MODIFIERS WITH A VALUE OF {}", g.name(), gene);
                }
            }
        }
        float hue;
        float saturation;
        float brightness;
        return 0;
    }

    public int getEyeColor(GeneticHorseEntity entity, boolean secondaryEyeColor) {
        float gHue = GeneticsHandler.getGeneticFloat(entity, Genetics.EYE_HUE);
        float gSaturation = GeneticsHandler.getGeneticFloat(entity, Genetics.EYE_SATURATION);
        float gBrightness = GeneticsHandler.getGeneticFloat(entity, Genetics.EYE_BRIGHTNESS);
        float heterochromia = GeneticsHandler.getGeneticFloat(entity, Genetics.HETEROCHROMIA);

        float hue;
        float saturation;
        float brightness;
        float bb;
        float aa;

        if (secondaryEyeColor && heterochromia == 3.0F) {
            //Reverses the Genetics
            bb = GeneticsHandler.getGeneticFloat(entity, Genetics.EYE_BASE_COLOR_2);
            aa = GeneticsHandler.getGeneticFloat(entity, Genetics.EYE_BASE_COLOR);
        } else {
            bb = GeneticsHandler.getGeneticFloat(entity, Genetics.EYE_BASE_COLOR); //Brown/Blue Gene b/b
            aa = GeneticsHandler.getGeneticFloat(entity, Genetics.EYE_BASE_COLOR_2); //Amber/Hazel Gene a/a
        }

        // B = brown b = blue
        // A = amber a = hazel

        // bb 1 aa 1 - BLUE
        // bb 1 Aa 2 - PALE BLUE
        // bb 1 AA 3 - GRAY

        //Bb 2 aa 1 - GREEN
        //Bb 2 Aa 2 - HAZEL
        //Bb 2 AA 3 - AMBER

        //BB 3 aa 1 - DARK BROWN
        //BB 3 aA 2 - BROWN
        //BB 3 AA 3 - WARM BROWN


        if (bb == 1.0f && aa == 1.0f) {
            // Blue - b/b
            // hue 190-225 S 40-80 B 45-85
            hue = 190 + (gHue * 0.35F);
            saturation = 40 + (gSaturation * 0.4F);
            brightness = 45 + (gBrightness * 0.4F);

            EquigenMod.LOGGER.info("EYES - BLUE: H = {} S = {} B = {}", hue, saturation, brightness);

        } else if (bb == 1.0f && aa == 2.0f) {
            // Pale blue - b/b A/a
            // hue 200-230 S 15-45 B 65-90
            hue = 200 + (gHue * 0.3F);
            saturation = 15 + (gSaturation * 0.3F);
            brightness = 65 + (gBrightness * 0.25F);

            EquigenMod.LOGGER.info("EYES - PALE BLUE: H = {} S = {} B = {}", hue, saturation, brightness);

        } else if (bb == 1.0f && aa == 3.0f) {
            // Gray - b/b A/A
            // hue 190-230 S 0-15 B 35-75
            hue = 190 + (gHue * 0.4F);
            saturation = 0 + (gSaturation * 0.15F);
            brightness = 35 + (gBrightness * 0.4F);

            EquigenMod.LOGGER.info("EYES - GRAY: H = {} S = {} B = {}", hue, saturation, brightness);

        } else if (bb == 2.0F && aa == 1.0F) {
            // Green - b/b A/a
            // hue 70–90 S 25-65 B 30-65
            hue = 70 + (gHue * 0.2F);
            saturation = 25 + (gSaturation * 0.4F);
            brightness = 30 + (gBrightness * 0.35F);
            EquigenMod.LOGGER.info("EYES - GREEN: H = {} S = {} B = {}", hue, saturation, brightness);

        } else if (bb == 2.0F && aa == 2.0F) {
            // Hazel - B/b A/A
            // hue 50-70 S 30-70 B 35-70
            hue = 50 + (gHue * 0.2F);
            saturation = 30 + (gSaturation * 0.4F);
            brightness = 35 + (gBrightness * 0.4F);
            EquigenMod.LOGGER.info("EYES - HAZEL: H = {} S = {} B = {}", hue, saturation, brightness);

        } else if (bb == 2.0F && aa == 3.0F) {
            // Amber - b/b A/A
            // hue 30-50 S 50-90 B 45-80
            hue = 30 + (gHue * 0.2F);
            saturation = 50 + (gSaturation * 0.4F);
            brightness = 45 + (gBrightness * 0.35F);
            EquigenMod.LOGGER.info("EYES - AMBER: H = {} S = {} B = {}", hue, saturation, brightness);

        } else if (bb == 3.0F && aa == 1.0F) {
            // DARK BROWN - B/B a/a
            // hue 15-30 S 45-80 B 15-40
            hue = 15 + (gHue * 0.15F);
            saturation = 45 + (gSaturation * 0.35F);
            brightness = 15 + (gBrightness * 0.25F);
            EquigenMod.LOGGER.info("EYES - DARK BROWN: H = {} S = {} B = {}", hue, saturation, brightness);
        } else if (bb == 3.0F && aa == 2.0F){
            // Brown - B/B or B/b
            // hue 15-30 S 40-80 B 30-55
            hue = 15 + (gHue * 0.15F);
            saturation = 40 + (gSaturation * 0.4F);
            brightness = 30 + (gBrightness * 0.25F);
            EquigenMod.LOGGER.info("EYES - BROWN: H = {} S = {} B = {}", hue, saturation, brightness);
        } else {
            // Warm Brown - B/A
            // hue 20-40 S 45-85 B 35-65
            hue = 20 + (gHue * 0.2F);
            saturation = 45 + (gSaturation * 0.4F);
            brightness = 35 + (gBrightness * 0.3F);
            EquigenMod.LOGGER.info("EYES - WARM BROWN: H = {} S = {} B = {}", hue, saturation, brightness);
        }

        hue /= 360f;
        saturation /= 100f;
        brightness /= 100f;

        return Color.HSBtoRGB(hue, saturation, brightness);
    }

    public Path getFaceMarking(GeneticHorseEntity entity) {
        int gene = (int) GeneticsHandler.getGeneticFloat(entity, Genetics.EYE_BASE_COLOR);
        return switch (gene) {
            case 1 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "head_markings", "blaze.png"); //blaze
            case 2 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "head_markings", "faint_star.png"); //faint_star
            case 3 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "head_markings", "interrupted_stripe.png"); //interrupted_stripe
            case 4 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "head_markings", "stripe_and_snip.png"); //stripe_and_snip
            case 5 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "head_markings", "stripe.png"); //stripe
            case 6 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "head_markings", "irregular_blaze.png"); //irregular_blaze
            case 7 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "head_markings", "bald_face.png"); //bald_face
            case 8 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "head_markings", "star.png"); //star
            case 9 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "head_markings", "star_and_strip.png"); //star_and_strip
            case 10 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "head_markings", "irregular_star.png"); //irregular_star
            case 11 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "head_markings", "snip.png"); //snip
            case 12 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "head_markings", "lip_marking.png"); //lip_marking
            default -> null;
        };

    }


    public Path getLegWhiteMarking(int gene) {
        return switch (gene) {
            case 1 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "leg_markings", "pastern", "small_pastern.png"); //small_pastern
            case 2 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "leg_markings", "pastern", "partial_pastern.png"); //partial_pastern
            case 3 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "leg_markings", "pastern", "pastern.png"); //pastern
            case 4 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "leg_markings", "socks", "sock_1.png"); //sock_1
            case 5 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "leg_markings", "socks", "sock_2.png"); //sock_2
            case 6 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "leg_markings", "socks", "sock_3.png"); //sock_3
            case 7 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "leg_markings", "socks", "sock_4.png"); //sock_4
            case 8 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "leg_markings", "socks", "sock_5.png"); //sock_5
            case 9 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "leg_markings", "socks", "sock_6.png"); //sock_6
            case 10 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "leg_markings", "socks", "sock_7.png"); //sock_7
            case 11 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "leg_markings", "socks", "sock_8.png"); //sock_8
            case 12 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "leg_markings", "stockings", "stocking_1.png"); //stocking_1
            case 13 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "leg_markings", "stockings", "stocking_2.png"); //stocking_2
            case 14 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "leg_markings", "stockings", "stocking_3.png"); //stocking_3
            case 15 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "leg_markings", "stockings", "stocking_4.png"); //stocking_4
            case 16 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "leg_markings", "stockings", "stocking_5.png"); //stocking_5
            case 17 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "leg_markings", "stockings", "stocking_6.png"); //stocking_6
            case 18 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "leg_markings", "stockings", "stocking_7.png"); //stocking_7
            case 19 -> Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                    "entity", "genetic_horse", "markings", "leg_markings", "stockings", "stocking_8.png"); //stocking_8
            default -> null;
        };

    }

    public int getTailColor(GeneticHorseEntity entity) {
        return getBaseColor(entity);
    }

}
