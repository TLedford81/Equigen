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
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class GeneticHorseTexturer {
    GeneticHorseEntity entity;

    public GeneticHorseTexturer(GeneticHorseEntity entity) {
        this.entity = entity;
    }

    public ArrayList<String> getLayerList(GeneticHorseEntity entity) {
        ArrayList<String> imageLayers = new ArrayList<>();
        //Base Coat
        float blackModifier = GeneticsHandler.getEntityGenetic(entity, Genetics.BLACK_MODIFIER);
        float redModifier = GeneticsHandler.getEntityGenetic(entity, Genetics.RED_MODIFIER);
        if (blackModifier == 1.0f) {
            imageLayers.add("base_coat_chestnut"); //Chestnut e/e _/_
        } else if (redModifier == 1.0f && blackModifier >= 2.0f) {
            imageLayers.add("base_coat_chestnut"); //Black E/_ a/a
        } else {
            imageLayers.add("base_coat_chestnut"); //Bay E/_ A_
        }
        //TODO Need to have it make the
        //Black Point (if applicable)

        //Modifiers

        //Leg Markings

        //Face Markings

        //Patterns

        //Mane Base

        //Tail Base

        //Hooves Base

        //Shading Layer

        //Highlight Layer

        return null;
    }

    public void textureGeneration(GeneticHorseEntity entity, Path destination, ArrayList<Path> referenceLayers) throws IOException {
        Canvas canvas = new Canvas();
        GeneticPartNameBuilder builder = new GeneticPartNameBuilder(entity);
        canvas.initializeCanvas();
        List<String> partsList = entity.getPartsToRender();
        PartList Parts = new PartList();

        // Draw Base Color
//        for (String part : partsList) {
////            canvas.drawImage()
//        }
        // For Loop Draw Layers
        for (Path l : referenceLayers) {
            List<Part> referenceParts = findReferenceParts(l);
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
                    canvas.drawImage(bestPart, Parts.returnPart(s));
                    EquigenMod.LOGGER.info("DRAWING!!!");

                } else {
                    EquigenMod.LOGGER.info("BEST PART IS EQUAL TO NULL! MOVING ON");
                }
            }
        }
        // Finalize Image
        canvas.finalizeImage(destination);
    }

    public BufferedImage tintTexture(BufferedImage image, int rgbColor) {
        int width = image.getWidth();
        int height = image.getHeight();

        BufferedImage output = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        int tintR = getR(rgbColor);
        int tintG = getG(rgbColor);
        int tintB = getB(rgbColor);

        for (int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                int pixel = image.getRGB(x, y);

                int alpha = getAlpha(pixel);
                int r = getR(pixel);
                int g = getG(pixel);
                int b = getB(pixel);

                int brightness = (r + g + b) / 3;

                int outR = tintR * brightness / 255;
                int outG = tintG * brightness / 255;
                int outB = tintB * brightness / 255;

                //Uses bits to rearrange the RGB into the color code
                int outPixel = (alpha << 24) | (outR << 16) | (outG << 8) | outB;

                output.setRGB(x, y, outPixel);
            }
        }
        return null;
    }
    public List<Part> findReferenceParts(Path sourceFile) throws IOException {
        BufferedImage img = ImageIO.read(sourceFile.toFile());
        List<Part> finalPartList = new ArrayList<>(List.of());

        EquigenMod.LOGGER.info(
                "LOADED IMAGE {}x{} FROM {}",
                img.getWidth(),
                img.getHeight(),
                sourceFile.toAbsolutePath()
        );
         // Use image here

            for (int x = 0; x < img.getWidth(); x++) {
                for (int y = 0; y < img.getHeight(); y++) {
                    int pixel = img.getRGB(x, y);
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
                            default -> modelName = "";
                        }
                        EquigenMod.LOGGER.info("PIXEL INDICATES REFERENCE IS A " + modelName);
                        if (!modelName.isEmpty()) {
                            int rPixel = img.getRGB(x + 1, y);
                            int bPixel = img.getRGB(x, y + 1);
                            int muscleMass;
                            int type; // Neck curve, leg width, etc
                            int lengthOrSize;
                            int blockNum;
                            switch (getR(rPixel)) {
                                case 75 -> muscleMass = 1;
                                case 150 -> muscleMass = 2;
                                case 225 -> muscleMass = 3;
                                default -> muscleMass = 0;
                            }
                            switch (getG(rPixel)) {
                                case 10 -> type = 1;
                                case 20 -> type = 2;
                                case 30 -> type = 3;
                                case 40 -> type = 4;
                                case 50 -> type = 5;
                                default -> type = 0;
                            }
                            switch (getB(rPixel)) {
                                case 10 -> lengthOrSize = 1;
                                case 20 -> lengthOrSize = 2;
                                case 30 -> lengthOrSize = 3;
                                case 40 -> lengthOrSize = 4;
                                case 50 -> lengthOrSize = 5;
                                case 60 -> lengthOrSize = 6;
                                case 70 -> lengthOrSize = 7;
                                case 80 -> lengthOrSize = 8;
                                case 90 -> lengthOrSize = 9;
                                default -> lengthOrSize = 0;
                            }
                            switch (getAlpha(rPixel)) {
                                case 13 -> blockNum = 1; // In photoshop this scales by 5 percent on the Opacity slider
                                case 26 -> blockNum = 2;
                                case 38 -> blockNum = 3;
                                case 51 -> blockNum = 4;
                                case 64 -> blockNum = 5;
                                case 77 -> blockNum = 6;
                                case 89 -> blockNum = 7;
                                case 102 -> blockNum = 8;
                                case 115 -> blockNum = 9;
                                case 128 -> blockNum = 10;
                                case 140 -> blockNum = 11;
                                case 153 -> blockNum = 12;
                                case 166 -> blockNum = 13;
                                case 179 -> blockNum = 14;
                                case 191 -> blockNum = 15;
                                default -> blockNum = 0;
                            }

                            GeneticPartNameBuilder builder = new GeneticPartNameBuilder(entity);
                            EquigenMod.LOGGER.info("FOUND!! INDICATOR PIXEL AT {} + {}", x, y);
                            EquigenMod.LOGGER.info("R = {}, G = {}, B = {} ALPHA = {}", getR(rPixel), getG(rPixel), getB(rPixel), getAlpha(rPixel));
                            String part = builder.PartStringGenerator(modelName, List.of(muscleMass, type, lengthOrSize));
                            PartList pList = new PartList();
                            Part p = null;
                            boolean alreadyInList = false;
                            for (Part p1 : finalPartList) {
                                if (p1.modelName.equals(part)) {
                                    alreadyInList = true;
                                    p = p1;
                                    EquigenMod.LOGGER.info("ALREADY IN LIST!");
                                    break;
                                }
                            }
                            if (!alreadyInList) {
                                p = pList.returnPart(part);
                                finalPartList.add(p);
                                EquigenMod.LOGGER.info("NOT ALREADY IN LIST");
                            }
                            if (p == null) {
                                EquigenMod.LOGGER.warn("Part was null for part name: {}", part);
                                continue;
                            }
                            EquigenMod.LOGGER.info(part);
                            p.printBlockStats();
                            p.updateBlocks(blockNum - 1, x + 1, y + 1, true);  //TODO there might be a bug here with duplicate block nums for the same part. Unsure
                            EquigenMod.LOGGER.info("EDITED");
                            p.printBlockStats();
                        }
                    }
                    EquigenMod.LOGGER.info("NO INDICATOR PIXEL FOUND, MOVING ON, R = {} G = {}", getR(pixel), getG(pixel));
                }
            }

            if (finalPartList.isEmpty()) {
                EquigenMod.LOGGER.info("FINALPARTLIST IS EMPTY!!");
            }
            return finalPartList;
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
}