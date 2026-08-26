package net.buckleystudios.equigen.entity.genetic_horse.client.texturer;


import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistries.ModelPartRegistry;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.RegistryKeyFactory;
import net.buckleystudios.equigen.entity.genetic_horse.client.texturer.base.Canvas;
import net.buckleystudios.equigen.entity.genetic_horse.client.texturer.base.Part;
import net.buckleystudios.equigen.entity.genetic_horse.client.texturer.base.PartList;
import net.buckleystudios.equigen.entity.genetic_horse.client.texturer.base.TextureCalculator;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.Genetics;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticsHandler;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.util.GeneticPartNameBuilder;
import net.minecraft.client.model.geom.EntityModelSet;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class GeneticHorseTexturer {
    GeneticHorseEntity entity;
    private final EntityModelSet modelSet;

    public GeneticHorseTexturer(GeneticHorseEntity entity, EntityModelSet modelSet) {
        this.entity = entity;
        this.modelSet = modelSet;
    }

    public Map<BufferedImage, GeneticValues.LEG> getLayerList(GeneticHorseEntity entity) throws IOException {
        EquigenMod.LOGGER.info("CALLING GETLAYERLIST");
        TextureCalculator calculator = new TextureCalculator();
        Map<BufferedImage, GeneticValues.LEG> imageLayers = new HashMap<>();
        //Base Coat is handled in the TextureGeneration code.
        //Modifiers
        //Have modifiers just add numbers to the Hue/Sat/Brightness? Therefore would be handled in base coat generation. If not, then have it be a semi-transparent layer to be placed over the base layer.

        //Black Point (if applicable)

        //Leg Markings
        if (GeneticsHandler.getGeneticFloat(entity, Genetics.FRONT_LEFT_LEG_MARKING) > 0) {
            imageLayers.put(returnImage(Objects.requireNonNull(calculator.getLegWhiteMarking
                    ((int) GeneticsHandler.getGeneticFloat(entity, Genetics.FRONT_LEFT_LEG_MARKING)))), GeneticValues.LEG.FRONT_LEFT);
        }
        if (GeneticsHandler.getGeneticFloat(entity, Genetics.FRONT_RIGHT_LEG_MARKING) > 0) {
            imageLayers.put(returnImage(Objects.requireNonNull(calculator.getLegWhiteMarking
                    ((int) GeneticsHandler.getGeneticFloat(entity, Genetics.FRONT_RIGHT_LEG_MARKING)))), GeneticValues.LEG.FRONT_RIGHT);
        }
        if (GeneticsHandler.getGeneticFloat(entity, Genetics.BACK_LEFT_LEG_MARKING) > 0) {
            imageLayers.put(returnImage(Objects.requireNonNull(calculator.getLegWhiteMarking
                    ((int) GeneticsHandler.getGeneticFloat(entity, Genetics.BACK_LEFT_LEG_MARKING)))), GeneticValues.LEG.BACK_LEFT);
        }
        if (GeneticsHandler.getGeneticFloat(entity, Genetics.BACK_RIGHT_LEG_MARKING) > 0) {
            imageLayers.put(returnImage(Objects.requireNonNull(calculator.getLegWhiteMarking
                    ((int) GeneticsHandler.getGeneticFloat(entity, Genetics.BACK_RIGHT_LEG_MARKING)))), GeneticValues.LEG.BACK_RIGHT);
        }
        //Face Markings
        if (GeneticsHandler.getGeneticFloat(entity, Genetics.FACE_MARKING) > 0) {
            imageLayers.put(returnImage(Objects.requireNonNull(calculator.getFaceMarking(entity))), null);
        }

        //Patterns

        //Mane Base

        //Tail Base
        imageLayers.put(tintTexture(returnImage(Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                "entity", "genetic_horse", "base", "tail.png")), calculator.getTailColor(entity)), null);
        //Hooves Base

        //Shading Layer

        //Highlight Layer

        //Eyes
        imageLayers.put(returnImage(Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                "entity", "genetic_horse", "markings", "head_markings", "eyes.png")), null);
        imageLayers.put(tintTexture(returnImage(Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                "entity", "genetic_horse", "markings", "head_markings", "eyes_right_pupil.png")), calculator.getEyeColor(entity, false)), null);
        imageLayers.put(tintTexture(returnImage(Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                        "entity", "genetic_horse", "markings", "head_markings", "eyes_left_pupil.png")), calculator.getEyeColor(entity, true)), null);

        //Nostrils

        EquigenMod.LOGGER.info("IMAGER LAYERS SIZE = {}", imageLayers.size());

        return imageLayers;
    }

    public void textureGeneration(GeneticHorseEntity entity, Path destination, Map<BufferedImage, GeneticValues.LEG>  referenceLayers) throws IOException {
        Canvas canvas = new Canvas();
        TextureCalculator calculator = new TextureCalculator();
        GeneticPartNameBuilder builder = new GeneticPartNameBuilder(entity);
        canvas.initializeCanvas();
        List<Part> partsList = getRenderedParts(entity);

        // Draw Base Color
        EquigenMod.LOGGER.info("DRAWING BASE COLOR");
        canvas.drawColor((ArrayList<Part>) partsList, calculator.getBaseColor(entity));

        // For Loop Draw Layers
        int i = 0;
        EquigenMod.LOGGER.info("REFERENCE LAYER SIZE = {}", referenceLayers.size());
        for (Map.Entry<BufferedImage, GeneticValues.LEG> entry : referenceLayers.entrySet()) {
            BufferedImage l = entry.getKey();
            GeneticValues.LEG leg = entry.getValue();
            EquigenMod.LOGGER.info("Iteration {}: image = {}", i++, l);
            List<Part> referenceParts = List.of();
            if (l == null) {
                EquigenMod.LOGGER.info("LAYER IS NULL!!!");
            } else {
                referenceParts = findReferenceParts(l);
                for (Part p: referenceParts) {
                    EquigenMod.LOGGER.info("REFERENCE PARTS: MODEL NAME = {}", p.modelName);
                    p.printBlockStats();
                }
            }

            canvas.updateCanvasImage(l); // updates the image stored in the canvas. Do for each layer
            for (Part p2 : partsList) {
                String partType = builder.returnPartType(p2.modelName, leg);
                List<Part> relevantReferenceParts = new ArrayList<>(List.of());
                for (Part p : referenceParts) {
                    if (p.modelName.contains(builder.returnPartTypeNoLegs(p2.modelName))) {
                        relevantReferenceParts.add(p);
                        EquigenMod.LOGGER.info("THEY MATCH!! ADDING PART");
                        EquigenMod.LOGGER.info("P = {}, PARTTYPE = {}", p.modelName, partType);
                    } else {
//                        EquigenMod.LOGGER.info("THEY DONT MATCH!! MOVING ON!");
                    }
                }
                Part bestPart = findBestMatch(relevantReferenceParts, p2);
                if (bestPart != null) {
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
    public List<Part> findReferenceParts(BufferedImage sourceFile) {
        PartList pList = new PartList(entity, modelSet);
        EquigenMod.LOGGER.info(
                "findReferenceParts called on {}",
                Thread.currentThread().getName()
        );
       EquigenMod.LOGGER.info("IMAGE LOCATION = " + sourceFile.toString());

        EquigenMod.LOGGER.info(
                "LOADED IMAGE {}x{}",
                sourceFile.getWidth(),
                sourceFile.getHeight()
        );
            for (int x = 0; x < sourceFile.getWidth(); x++) {
                for (int y = 0; y < sourceFile.getHeight(); y++) {
                    int pixel = sourceFile.getRGB(x, y);
                    if (getR(pixel) == 200) {
                        EquigenMod.LOGGER.info("FOUND!! INDICATOR PIXEL AT {} + {}", x, y);

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
                            EquigenMod.LOGGER.info(
                                    "PIXEL = {}, A = {}, R = {}, G = {}, B = {}",
                                    rPixel,
                                    (rPixel >> 24) & 0xFF,
                                    (rPixel >> 16) & 0xFF,
                                    (rPixel >> 8) & 0xFF,
                                    rPixel & 0xFF
                            );
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
                                                    pList.updatePartList(modelName, x, y, m, type, l, blockNum); //This part ONLY applies to the different types. Only used for the forelocks on the heads right now. No logic to do different lengths/sizes!
                                                }
                                            }
                                            case "head" -> {
                                                pList.updatePartList(modelName, x, y, m, type, lengthOrSize, blockNum); //This part ONLY applies to the different types. Only used for the forelocks on the heads right now. No logic to do different lengths/sizes!
                                            }
                                        }
                                    }
                                }
                                case 3 -> {
                                    for(int m = 1; m <= 3; m++) {
                                        pList.updatePartList(modelName, x, y, m, type, lengthOrSize, blockNum);
                                    }
                                }
                                case 4 -> {
                                    pList.updatePartList(modelName, x, y, 1, type, lengthOrSize, blockNum);
                                    pList.updatePartList(modelName, x, y, 2, type, lengthOrSize, blockNum);
                                }
                                case 5 -> {
                                    pList.updatePartList(modelName, x, y, 1, type, lengthOrSize, blockNum);
                                    pList.updatePartList(modelName, x, y, 3, type, lengthOrSize, blockNum);
                                }
                                case 6 -> {
                                    pList.updatePartList(modelName, x, y, 2, type, lengthOrSize, blockNum);
                                    pList.updatePartList(modelName, x, y, 3, type, lengthOrSize, blockNum);
                                }
                                default -> {
                                    pList.updatePartList(modelName, x, y, muscleMass, type, lengthOrSize, blockNum);
                                }
                            }

                        }
                    }
//                    EquigenMod.LOGGER.info("NO INDICATOR PIXEL FOUND, MOVING ON, R = {} G = {}, X = {}, Y = {}", getR(pixel), getG(pixel), x, y);
                }
            }

            if (pList.getPartList().isEmpty()) {
                EquigenMod.LOGGER.info("FINALPARTLIST IS EMPTY!!");
            }
            return pList.getPartList();
    }
    public List<Part> getRenderedParts(GeneticHorseEntity entity) {
        List<Part> partList = new ArrayList<>(List.of());
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getBackKey(entity), modelSet)).getCubeDimensions());

        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getTopBackLegKey(entity), modelSet, GeneticValues.LEG.BACK_LEFT)).getCubeDimensions());
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getTopBackLegKey(entity), modelSet, GeneticValues.LEG.BACK_RIGHT)).getCubeDimensions());

        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getBottomLegKey(entity), modelSet, GeneticValues.LEG.FRONT_LEFT)).getCubeDimensions());
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getBottomLegKey(entity), modelSet, GeneticValues.LEG.FRONT_RIGHT)).getCubeDimensions());
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getBottomLegKey(entity), modelSet, GeneticValues.LEG.BACK_LEFT)).getCubeDimensions());
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getBottomLegKey(entity), modelSet, GeneticValues.LEG.BACK_RIGHT)).getCubeDimensions());

        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getChestKey(entity), modelSet)).getCubeDimensions());
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getLeftEarKey(entity), modelSet)).getCubeDimensions());
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getRightEarKey(entity), modelSet)).getCubeDimensions());

        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getTopFrontLegKey(entity), modelSet, GeneticValues.LEG.FRONT_LEFT)).getCubeDimensions());
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getTopFrontLegKey(entity), modelSet, GeneticValues.LEG.FRONT_RIGHT)).getCubeDimensions());

        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getHeadKey(entity), modelSet)).getCubeDimensions());
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getHipKey(entity), modelSet)).getCubeDimensions());
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getHoofKey(entity), modelSet, GeneticValues.LEG.FRONT_LEFT)).getCubeDimensions());
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getHoofKey(entity), modelSet, GeneticValues.LEG.FRONT_RIGHT)).getCubeDimensions());
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getHoofKey(entity), modelSet, GeneticValues.LEG.BACK_LEFT)).getCubeDimensions());
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getHoofKey(entity), modelSet, GeneticValues.LEG.BACK_RIGHT)).getCubeDimensions());

        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getKneeKey(entity), modelSet, GeneticValues.LEG.FRONT_LEFT)).getCubeDimensions());
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getKneeKey(entity), modelSet, GeneticValues.LEG.FRONT_RIGHT)).getCubeDimensions());
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getKneeKey(entity), modelSet, GeneticValues.LEG.BACK_LEFT)).getCubeDimensions());
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getKneeKey(entity), modelSet, GeneticValues.LEG.BACK_RIGHT)).getCubeDimensions());

        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getNeckKey(entity), modelSet)).getCubeDimensions());
        // Mane is not in here since this method is only used to draw base color, and we dont want the mane drawn with that.
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getStomachKey(entity), modelSet)).getCubeDimensions());
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getTailKey(entity), modelSet)).getCubeDimensions());
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getWitherKey(entity), modelSet)).getCubeDimensions());
        return partList;
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
        EquigenMod.LOGGER.info("LOGGING ALPHA {}", getAlpha(pixel));
        return switch (getAlpha(pixel)) {
            case 13 -> 1; // In photoshop this scales by 5 percent on the Opacity slider
            case 25, 26 -> 2;
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
    public Part findBestMatch(List<Part> partReference, Part currentPart) { //TODO Make it so that the neck only applies to the same curve
        EquigenMod.LOGGER.info("CURRENT PART = " + currentPart);
        GeneticPartNameBuilder builder = new GeneticPartNameBuilder(entity);
        String currPart = builder.returnPartType(currentPart.modelName, null); //Part name
        EquigenMod.LOGGER.info("PART TYPE = " + currPart);
        for (Part p : partReference) {
            EquigenMod.LOGGER.info("PART REFERENCE: {}", p.modelName);
        }
        List<String> currPartList = builder.PartStringListGenerator(currPart, true);
        //TODO make this link to the registry instead of PartNameBuilder
        if (partReference.isEmpty()) {
            EquigenMod.LOGGER.info("PART REFERENCE IS EMPTY!!!");
            return null;
        }
        if (currPartList.getFirst().equals("knees") || currPartList.getFirst().equals("left_ear") || currPartList.getFirst().equals("right_ear")) {
            EquigenMod.LOGGER.info("SINGLE MODEL NAME!!");
            return partReference.getFirst();
        }
        currPartList.removeFirst();
        EquigenMod.LOGGER.info("CURRPARTLIST = " + currPartList);

        List<Part> relevantParts = new ArrayList<>(List.of());
        List<Integer> scores = new ArrayList<>(List.of());

        for (Part p : partReference) {
            EquigenMod.LOGGER.info("P = {}, PART = {}", p.modelName, currPart);
            if (p.modelName.contains(currPart)) {
                relevantParts.add(p);
            }
        }
        if (relevantParts.isEmpty()) {
            EquigenMod.LOGGER.info("IS EMPTY!!!");
            return null;
        }
        for (Part ref : relevantParts) {
            String refModelName = ref.modelName;
            int score = 0;
            if (!refModelName.equals(currentPart.modelName)) {
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