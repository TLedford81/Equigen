package net.buckleystudios.equigen.entity.client.genetic_horse.texturer;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.client.genetic_horse.texturer.base.Canvas;
import net.buckleystudios.equigen.entity.client.genetic_horse.texturer.base.Part;
import net.buckleystudios.equigen.entity.client.genetic_horse.texturer.base.PartList;
import net.buckleystudios.equigen.entity.custom.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.custom.genetics.Genetics;
import net.buckleystudios.equigen.entity.custom.genetics.GeneticsHandler;
import net.buckleystudios.equigen.entity.custom.genetics.util.GeneticPartNameBuilder;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GeneticHorseTexturer {
    GeneticHorseEntity entity;

    public GeneticHorseTexturer(GeneticHorseEntity entity) {
        this.entity = entity;
    }

    public ArrayList<BufferedImage> getLayerList(GeneticHorseEntity entity) throws IOException {
        EquigenMod.LOGGER.info("CALLING GETLAYERLIST");
        ArrayList<BufferedImage> imageLayers = new ArrayList<>();
        //Base Coat is handled in the TextureGeneration code.
        //Modifiers
        //Have modifiers just add numbers to the Hue/Sat/Brightness? Therefore would be handled in base coat generation. If not, then have it be a semi-transparent layer to be placed over the base layer.

        //Black Point (if applicable)

        //Leg Markings

        //Face Markings

        //Patterns

        //Mane Base

        //Tail Base

        //Hooves Base

        //Shading Layer

        //Highlight Layer

        //Eyes
        imageLayers.add(returnImage(Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                "entity", "genetic_horse", "markings", "head_markings", "eyes.png")));
        imageLayers.add(tintTexture(returnImage(Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                "entity", "genetic_horse", "markings", "head_markings", "eyes_pupils.png")), 0x09e6a7

                /*(int) GeneticsHandler.getEntityGenetic(entity, Genetics.LEFT_EYE_COLOR*/)); //TODO Impement Heterochromia

        //Nostrils

        EquigenMod.LOGGER.info("IMAGER LAYERS SIZE = {}", imageLayers.size());

        return imageLayers;
    }

    public void textureGeneration(GeneticHorseEntity entity, Path destination, ArrayList<BufferedImage> referenceLayers) throws IOException {
        Canvas canvas = new Canvas();
        GeneticPartNameBuilder builder = new GeneticPartNameBuilder(entity);
        canvas.initializeCanvas();
        List<String> partsList = entity.getPartsToRender();
        PartList Parts = new PartList();

        // Draw Base Color
//        canvas.drawColor(Parts.createPartList(partsList), getBaseColor(entity));
//        for (String part : partsList) {
////            canvas.drawImage()
//        }
        // For Loop Draw Layers
        int i = 0;
        EquigenMod.LOGGER.info("REFERENCE LAYER SIZE = {}", referenceLayers.size());
        for (BufferedImage l : referenceLayers) {
            EquigenMod.LOGGER.info("Iteration {}: image = {}", i++, l);
            if (l == null) {
                EquigenMod.LOGGER.info("LAYER IS NULL!!!");
            }
            List<Part> referenceParts = findReferenceParts(l);
                for (Part p: referenceParts) {
                    EquigenMod.LOGGER.info("MODEL NAME = {}", p.modelName);
                        p.printBlockStats();
                }

            canvas.updateCanvasImage(l); // updates the image stored in the canvas. Do for each layer
            for (String s : partsList) {
                String partType = builder.returnPartType(s);
                List<Part> relevantReferenceParts = new ArrayList<>(List.of());
                for (Part p : referenceParts) {
                    EquigenMod.LOGGER.info("P = {}, PARTTYPE = {}", p.modelName, partType);
                    if (p.modelName.contains(partType)) {
                        relevantReferenceParts.add(p);
                        EquigenMod.LOGGER.info("THEY MATCH!! ADDING PART");
                    }
                }
                Part bestPart = findBestMatch(relevantReferenceParts, s);
                if (bestPart != null) {
                    Part p2 = Parts.returnPart(s);
                    p2.applyBaseUVCoords(partType);
                    canvas.drawImage(bestPart, p2);
                    EquigenMod.LOGGER.info("DRAWING!!!");

                } else {
                    EquigenMod.LOGGER.info("BEST PART IS EQUAL TO NULL! MOVING ON");
                }
            }
        }
        // Finalize Image
        canvas.finalizeImage(destination);
    }

    public int getBaseColor(GeneticHorseEntity entity) {
        float warmth = GeneticsHandler.getEntityGenetic(entity, Genetics.WARMTH);
        float darkness = GeneticsHandler.getEntityGenetic(entity, Genetics.DARKNESS);
        float richness = GeneticsHandler.getEntityGenetic(entity, Genetics.RICHNESS);

        float blackModifier = GeneticsHandler.getEntityGenetic(entity, Genetics.BLACK_MODIFIER);
        float redModifier = GeneticsHandler.getEntityGenetic(entity, Genetics.RED_MODIFIER);

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
        return Color.HSBtoRGB(hue, saturation, brightness);
    }

    public BufferedImage tintTexture(BufferedImage image, int rgbColor) {
        int width = image.getWidth();
        int height = image.getHeight();

        BufferedImage output = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        int tintR = getR(rgbColor);
        int tintG = getG(rgbColor);
        int tintB = getB(rgbColor);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                int pixel = image.getRGB(x, y);

                boolean isIndicator = getR(pixel) == 200;

                boolean isRightOfIndicator =
                        x > 0 && getR(image.getRGB(x - 1, y)) == 200;

                boolean isBelowIndicator =
                        y > 0 && getR(image.getRGB(x, y - 1)) == 200;

                if (isIndicator || isRightOfIndicator || isBelowIndicator) {
                    output.setRGB(x, y, pixel);
                    continue;
                }

                int alpha = getAlpha(pixel);
                int r = getR(pixel);
                int g = getG(pixel);
                int b = getB(pixel);

                int brightness = (r + g + b) / 3;

                int outR = tintR * brightness / 255;
                int outG = tintG * brightness / 255;
                int outB = tintB * brightness / 255;

                int outPixel =
                        (alpha << 24) |
                                (outR << 16) |
                                (outG << 8) |
                                outB;

                output.setRGB(x, y, outPixel);
            }
        }

        return output;
    }
    public List<Part> findReferenceParts(BufferedImage sourceFile) throws IOException {
        EquigenMod.LOGGER.info(
                "findReferenceParts called on {}",
                Thread.currentThread().getName()
        );
       EquigenMod.LOGGER.info("IMAGE LOCATION = " + sourceFile.toString());
        List<Part> finalPartList = new ArrayList<>(List.of());

        EquigenMod.LOGGER.info(
                "LOADED IMAGE {}x{}",
                sourceFile.getWidth(),
                sourceFile.getHeight()
        );
            for (int x = 0; x < sourceFile.getWidth(); x++) {
                for (int y = 0; y < sourceFile.getHeight(); y++) {
                    int pixel = sourceFile.getRGB(x, y);
                    if (getR(pixel) == 200) {
                            EquigenMod.LOGGER.info("INDICATOR PIXEL FOUND!");

                        String modelName = "";
                        // R 200 Specifies that this is a part
                        switch (getG(pixel)) {
                            case 10 -> modelName = "back";
                            case 20 -> modelName = "top_back_legs";
                            case 30 -> modelName = "bottom_legs";
                            case 40 -> modelName = "chest";
                            case 50 -> modelName = "left_ear";
                            case 60 -> modelName = "top_front_legs";
                            case 70 -> modelName = "head";
                            case 80 -> modelName = "hips";
                            case 90 -> modelName = "hoof";
                            case 100 -> modelName = "knees";
                            case 110 -> modelName = "neck";
                            case 120 -> modelName = "mane";
                            case 130 -> modelName = "stomach";
                            case 140 -> modelName = "tail";
                            case 150 -> modelName = "withers";
                            case 160 -> modelName = "right_ear"; //Yes this isn't next to the left ear in order. I didn't notice this until i had placed indicators for everything
                            default -> modelName = "";
                        }
                            EquigenMod.LOGGER.info("PIXEL INDICATES REFERENCE IS A " + modelName);

                        if (!modelName.isEmpty()) {
                            int rPixel = sourceFile.getRGB(x + 1, y);
                            int bPixel = sourceFile.getRGB(x, y + 1);
                            int muscleMass = decodeMuscleMass(rPixel);
                            int type = decodeType(rPixel); // Neck curve, leg width, etc
                            int lengthOrSize = decodeLengthOrSize(rPixel);
                            int blockNum = decodeAlpha(rPixel);
                            int reusedBlock;

                            switch (getR(bPixel)) {
                                case 10 -> reusedBlock = 1; // Apply this block to ALL of the same TYPE of part.
                                case 20 -> reusedBlock = 2; // Apply this block to ALL of the same TYPE and LENGTH of part.
                                case 30 -> reusedBlock = 3; // Apply this block to ALL different musclemasses of the same LENGTH and TYPE
                                case 40 -> reusedBlock = 4; // Apply this block to both lean and average musclemasses of the same length.
                                case 50 -> reusedBlock = 5; // Apply this block to both lean and muscular musclemasses of the same length.
                                case 60 -> reusedBlock = 6; // Apply this block to both average and muscular musclemasses of the same length.
                                default -> reusedBlock = 0;
                            }
                            //TODO Make a way to indicate one block location is used for multiple different muscle masses.
                                EquigenMod.LOGGER.info("PIXEL INDICATES REFERENCE IS {} muscle_mass, {} type, {} length_or_size, and {} block number.", muscleMass, type, lengthOrSize, blockNum);
                                EquigenMod.LOGGER.info("FOUND!! INDICATOR PIXEL AT {} + {}", x, y);
                                EquigenMod.LOGGER.info("R = {}, G = {}, B = {} ALPHA = {}", getR(rPixel), getG(rPixel), getB(rPixel), getAlpha(rPixel));



                            switch (reusedBlock) {
                                case 1 ->{
                                //Implement only if needed in the future. Right now we dont need a block to be applied to ALL of the same part.
                                }
                                case 2 -> {
                                    for(int m = 1; m <= 3; m++) {
                                        switch (modelName) {
                                            case "neck" -> {
                                                for (int l = 1; l <= 6; l++) { //TODO for future compatability need to change 4 to the max number possible of part. Only need it up to 4 right now.
                                                    updatePartList(finalPartList, modelName, x, y, m, type, l, blockNum); //This part ONLY applies to the different types. Only used for the forelocks on the heads right now. No logic to do different lengths/sizes!
                                                }
                                            }
                                            case "head" -> {
                                                    updatePartList(finalPartList, modelName, x, y, m, type, lengthOrSize, blockNum); //This part ONLY applies to the different types. Only used for the forelocks on the heads right now. No logic to do different lengths/sizes!
                                            }
                                        }
                                    }
                                }
                                case 3 -> {
                                    for(int m = 1; m <= 3; m++) {
                                            updatePartList(finalPartList, modelName, x, y, m, type, lengthOrSize, blockNum);
                                    }
                                }
                                case 4 -> {
                                    updatePartList(finalPartList, modelName, x, y, 1, type, lengthOrSize, blockNum);
                                    updatePartList(finalPartList, modelName, x, y, 2, type, lengthOrSize, blockNum);
                                }
                                case 5 -> {
                                    updatePartList(finalPartList, modelName, x, y, 1, type, lengthOrSize, blockNum);
                                    updatePartList(finalPartList, modelName, x, y, 3, type, lengthOrSize, blockNum);
                                }
                                case 6 -> {
                                    updatePartList(finalPartList, modelName, x, y, 2, type, lengthOrSize, blockNum);
                                    updatePartList(finalPartList, modelName, x, y, 3, type, lengthOrSize, blockNum);
                                }
                                default -> {
                                    updatePartList(finalPartList, modelName, x, y, muscleMass, type, lengthOrSize, blockNum);
                                }
                            }

                        }
                    }
//                    EquigenMod.LOGGER.info("NO INDICATOR PIXEL FOUND, MOVING ON, R = {} G = {}, X = {}, Y = {}", getR(pixel), getG(pixel), x, y);
                }
            }

            if (finalPartList.isEmpty()) {
                EquigenMod.LOGGER.info("FINALPARTLIST IS EMPTY!!");
            }
            return finalPartList;
    }
    private void updatePartList(List<Part> partList, String modelName, int x, int y, int muscleMass, int type, int lengthOrSize, int blockNum) {
        EquigenMod.LOGGER.info("X = {} Y = {}", x, y);
        GeneticPartNameBuilder builder = new GeneticPartNameBuilder(entity);
        String part = builder.PartStringGenerator(modelName, List.of(muscleMass, type, lengthOrSize));
        PartList pList = new PartList(); //TODO Change this to a hash map so it doesn't look through every part.
        Part p = null;
        for (Part existing : partList) {
            if (existing.modelName.equals(part)) {
                p = existing;
                break;
            }
        }

        if (p == null) {
            p = pList.returnPart(part);

            if (p.modelName.equals("NULL")) {
                EquigenMod.LOGGER.warn("Couldn't find part {}", part);
                return;
            }

            partList.add(p);
            EquigenMod.LOGGER.info("NOT ALREADY IN LIST");
        }

        EquigenMod.LOGGER.info(part);
        p.updateBlocks(blockNum - 1, x + 1, y + 1, true);
        EquigenMod.LOGGER.info("EDITED");
    }

    private int decodeMuscleMass(int pixel) {
        return switch (getR(pixel)) {
            case 75 -> 1;
            case 150 -> 2;
            case 225 -> 3;
            default -> 0;
        };
    }

    private int decodeType(int pixel) {
        return switch (getG(pixel)) {
            case 10 -> 1;
            case 20 -> 2;
            case 30 -> 3;
            case 40 -> 4;
            case 50 -> 5;
            default -> 0;
        };
    }

    private int decodeAlpha(int pixel) {
        return switch (getAlpha(pixel)) {
            case 13 -> 1; // In photoshop this scales by 5 percent on the Opacity slider
            case 26 -> 2;
            case 38 -> 3;
            case 51 -> 4;
            case 64 -> 5;
            case 77 -> 6;
            case 89 -> 7;
            case 102 -> 8;
            case 115 -> 9;
            case 128 -> 10;
            case 140 -> 11;
            case 153 -> 12;
            case 166 -> 13;
            case 179 -> 14;
            case 191 -> 15;
            default -> 0;
        };
    }

    private int decodeLengthOrSize (int pixel) {
        return switch (getB(pixel)) {
            case 10 -> 1;
            case 20 -> 2;
            case 30 -> 3;
            case 40 -> 4;
            case 50 -> 5;
            case 60 -> 6;
            case 70 -> 7;
            case 80 -> 8;
            case 90 -> 9;
            default -> 0;
        };
    }
    public Part findBestMatch(List<Part> partReference, String currentPart) { //TODO Make it so that the neck only applies to the same curve
        EquigenMod.LOGGER.info("CURRENT PART = " + currentPart);
        GeneticPartNameBuilder builder = new GeneticPartNameBuilder(entity);
        String currPart = builder.returnPartType(currentPart); //Part name
        EquigenMod.LOGGER.info("PART TYPE = " + currPart);
        List<String> currPartList = builder.PartStringListGenerator(currPart, true);
        currPartList.removeFirst();
        EquigenMod.LOGGER.info("CURRPARTLIST = " + currPartList);

        List<Part> relevantParts = new ArrayList<>(List.of());
        List<Integer> scores = new ArrayList<>(List.of());
        if (partReference.isEmpty()) {
            EquigenMod.LOGGER.info("PART REFERENCE IS EMPTY!!!");
            return null;
        }
        for (Part p : partReference) {
            EquigenMod.LOGGER.info("P = {}, PART = {}", p.modelName, currPart);
            if (p.modelName.contains(currPart)) {
                relevantParts.add(p);
            }
        }
        if (relevantParts.isEmpty()) {
            EquigenMod.LOGGER.info("IS EMPTY!!!");
        }
        for (Part ref : relevantParts) {
            String refModelName = ref.modelName;
            int score = 0;
            if (!refModelName.equals(currentPart)) {
                score += 100;
            }
            EquigenMod.LOGGER.info("REFERENCE_PART = {}, CURR_PART_LIST_FIRST = {}",refModelName, currPartList.getFirst());
            refModelName = refModelName.substring(currPart.length()+1);
            int index = 0;
            for (String part : currPartList) {
                String r = builder.extractWord(refModelName, index);
                EquigenMod.LOGGER.info("REFERENCE_PART = {}, CURRENT_PART = {}", part, refModelName);
                EquigenMod.LOGGER.info("R = {}, PART = {}", r, part);
                if (!r.equals(part)) {
                    score += 80 / (index + 1);
                } else {
                    EquigenMod.LOGGER.info("THEY MATCH!!! NO SCORE ADDED");
                }
                index++;
            }
            EquigenMod.LOGGER.info("SCORE = " + score);
            scores.add(score);
        }
        int currentIndex = 0;
        int referenceIndex = -1;
        int lowestScore = 5000;
        for (int s : scores) { // Find Lowest Score
            EquigenMod.LOGGER.info("LOWEST SCORE = {} S SCORE {}", lowestScore, s);
            if (s < lowestScore) {
                lowestScore = s;
                referenceIndex = currentIndex;
            }
            currentIndex++;
        }

        return relevantParts.get(referenceIndex);
    }


// Code below extracts uses bits to extract the specific color from the RGB code.
    public int getR (int colorCode) {
        return (colorCode >> 16) & 0xFF;
    }
    public int getG (int colorCode) {
        return (colorCode >> 8) & 0xFF;
    }
    public int getB (int colorCode) {
         return colorCode & 0xFF;
    }

    public int getAlpha (int colorCode) {
        return (colorCode >> 24) & 0xFF;
    }

    public List<Part> removePart (List<Part> pList, String remove) {
        int i = 0;
        for(Part p : pList) {
            if (p.modelName.contains(remove)) {
                pList.remove(i);
            }
            i++;
        }
        return pList;
    }

    public BufferedImage returnImage (Path sourceLocation) throws IOException {
        BufferedImage img = ImageIO.read(sourceLocation.toFile());

        EquigenMod.LOGGER.info(
                "LOADED IMAGE {}x{} FROM {}",
                img.getWidth(),
                img.getHeight(),
                sourceLocation.toAbsolutePath()
        );

        return img;
    }
}