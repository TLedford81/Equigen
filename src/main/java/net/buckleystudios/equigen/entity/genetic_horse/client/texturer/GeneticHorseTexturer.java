package net.buckleystudios.equigen.entity.genetic_horse.client.texturer;


import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.multipart.MultipartModel;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartKey;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistries.ModelPartRegistry;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.ModelPartRegistryKeys;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.registry.RegistryKeyFactory;
import net.buckleystudios.equigen.entity.genetic_horse.client.texturer.base.Canvas;
import net.buckleystudios.equigen.entity.genetic_horse.client.texturer.base.Part;
import net.buckleystudios.equigen.entity.genetic_horse.client.texturer.base.PartList;
import net.buckleystudios.equigen.entity.genetic_horse.client.texturer.base.TextureCalculator;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.Genetics;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticsHandler;
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
    private List<Part> referenceParts = new ArrayList<>();
    private List<MultipartModel<GeneticHorseEntity>> referenceModels = new ArrayList<>();

    private final TextureCalculator textureCalculator = new TextureCalculator();

    public GeneticHorseTexturer(GeneticHorseEntity entity, EntityModelSet modelSet) {
        this.entity = entity;
        this.modelSet = modelSet;
    }

    public Map<BufferedImage, GeneticValues.LEG> getLayerList(GeneticHorseEntity entity) throws IOException {
        EquigenMod.LOGGER.info("CALLING GETLAYERLIST");
        Map<BufferedImage, GeneticValues.LEG> imageLayers = new LinkedHashMap<>();
        CoatColors.baseCoat coat = CoatColors.findBaseCoat(entity);

        //Base Coat is handled in the TextureGeneration code.
        //Modifiers
        //Have modifiers just add numbers to the Hue/Sat/Brightness? Therefore would be handled in base coat generation. If not, then have it be a semi-transparent layer to be placed over the base layer.

        //Black Point (if applicable)
        EquigenMod.LOGGER.info("BLACK POINT HEIGHT = {}", GeneticsHandler.getGeneticFloat(entity, Genetics.BLACK_POINT_HEIGHT));
        EquigenMod.LOGGER.info("COAT BASE COLOR = " + coat.name());

        if (coat.equals(CoatColors.baseCoat.BAY) && GeneticsHandler.getGeneticFloat(entity, Genetics.BLACK_POINT_HEIGHT) > 0) {
            imageLayers.put(tintTexture(returnImage(Objects.requireNonNull(textureCalculator.getLegWhiteMarking
                    ((int) GeneticsHandler.getGeneticFloat(entity, Genetics.BLACK_POINT_HEIGHT)))), textureCalculator.getBlackPointColor(entity)), GeneticValues.LEG.ALL);
        }

        //Leg Markings
        if (GeneticsHandler.getGeneticFloat(entity, Genetics.FRONT_LEFT_LEG_MARKING) > 0) {
            imageLayers.put(returnImage(Objects.requireNonNull(textureCalculator.getLegWhiteMarking
                    ((int) GeneticsHandler.getGeneticFloat(entity, Genetics.FRONT_LEFT_LEG_MARKING)))), GeneticValues.LEG.FRONT_LEFT);
        }
        if (GeneticsHandler.getGeneticFloat(entity, Genetics.FRONT_RIGHT_LEG_MARKING) > 0) {
            imageLayers.put(returnImage(Objects.requireNonNull(textureCalculator.getLegWhiteMarking
                    ((int) GeneticsHandler.getGeneticFloat(entity, Genetics.FRONT_RIGHT_LEG_MARKING)))), GeneticValues.LEG.FRONT_RIGHT);
        }
        if (GeneticsHandler.getGeneticFloat(entity, Genetics.BACK_LEFT_LEG_MARKING) > 0) {
            imageLayers.put(returnImage(Objects.requireNonNull(textureCalculator.getLegWhiteMarking
                    ((int) GeneticsHandler.getGeneticFloat(entity, Genetics.BACK_LEFT_LEG_MARKING)))), GeneticValues.LEG.BACK_LEFT);
        }
        if (GeneticsHandler.getGeneticFloat(entity, Genetics.BACK_RIGHT_LEG_MARKING) > 0) {
            imageLayers.put(returnImage(Objects.requireNonNull(textureCalculator.getLegWhiteMarking
                    ((int) GeneticsHandler.getGeneticFloat(entity, Genetics.BACK_RIGHT_LEG_MARKING)))), GeneticValues.LEG.BACK_RIGHT);
        }
        //Face Markings
        if (GeneticsHandler.getGeneticFloat(entity, Genetics.FACE_MARKING) > 0) {
            imageLayers.put(returnImage(Objects.requireNonNull(textureCalculator.getFaceMarking(entity))), null);
        }

        //Patterns

        //Mane Base
        imageLayers.put(tintTexture(returnImage(Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                "entity", "genetic_horse", "base", "mane", "mane_14.png")), textureCalculator.getMainAndTailColor(entity)), null);
        //Tail Base
        imageLayers.put(tintTexture(returnImage(Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                "entity", "genetic_horse", "base", "tail.png")), textureCalculator.getMainAndTailColor(entity)), null);
        //Hooves Base

        //Shading Layer

        //Highlight Layer

        //Eyes
        imageLayers.put(returnImage(Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                "entity", "genetic_horse", "markings", "head_markings", "eyes.png")), null);
        imageLayers.put(tintTexture(returnImage(Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                "entity", "genetic_horse", "markings", "head_markings", "eyes_right_pupil.png")), textureCalculator.getEyeColor(entity, false)), null);
        imageLayers.put(tintTexture(returnImage(Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                        "entity", "genetic_horse", "markings", "head_markings", "eyes_left_pupil.png")), textureCalculator.getEyeColor(entity, true)), null);

        //Nostrils
        imageLayers.put(returnImage(Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                "entity", "genetic_horse", "markings", "head_markings", "nostrils.png")), null);

        imageLayers.put(returnImage(Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
                "entity", "genetic_horse", "shading_layer.png")), GeneticValues.LEG.ALL);
        EquigenMod.LOGGER.info("IMAGER LAYERS SIZE = {}", imageLayers.size());

        return imageLayers;
    }

    public void textureGeneration(GeneticHorseEntity entity, Path destination, Map<BufferedImage, GeneticValues.LEG>  referenceLayers) throws IOException {
        Canvas canvas = new Canvas();
        TextureCalculator calculator = new TextureCalculator();
        canvas.initializeCanvas();
        List<MultipartModel<GeneticHorseEntity>> partsList = getRenderedParts(entity);

        // Draw Base Color
        EquigenMod.LOGGER.info("DRAWING BASE COLOR");
        canvas.drawColor((ArrayList<MultipartModel<GeneticHorseEntity>>) partsList, calculator.getBaseColor(entity));

        // For Loop Draw Layers
        int i = 0;
        EquigenMod.LOGGER.info("REFERENCE LAYER SIZE = {}", referenceLayers.size());
        for (Map.Entry<BufferedImage, GeneticValues.LEG> entry : referenceLayers.entrySet()) {
            BufferedImage l = entry.getKey();
            GeneticValues.LEG referenceLeg = entry.getValue();
            EquigenMod.LOGGER.info("Iteration {}: image width = {}", i++, l.getWidth());
            if (l == null) {
                EquigenMod.LOGGER.info("LAYER IS NULL!!!");
            } else {
                updateReferenceParts(l);
            }

            canvas.updateCanvasImage(l); // updates the image stored in the canvas. Do for each layer
            for (MultipartModel<GeneticHorseEntity> p : partsList) {
                ModelPartKey key = ModelPartRegistry.getKeyFromModel(p);
                String partType = key.getPartName(referenceLeg);
                    EquigenMod.LOGGER.info("PART TYPE = {}", partType);
                    if (partType.contains("legs") || partType.contains("knees") || partType.contains("hoof")) {
                        if (referenceLeg == GeneticValues.LEG.ALL) {
                            for (GeneticValues.LEG leg : GeneticValues.LEG.values()) {
                                if (leg.equals(GeneticValues.LEG.ALL)) {
                                    break;
                                } else {
                                    applyImage(canvas, leg, p);
                                }
                            }
                        } else {
                            applyImage(canvas, referenceLeg, p);
                        }
                    } else {
                    applyImage(canvas, null, p);
                }
            }
        }
        // Finalize Image
        canvas.finalizeImage(destination);
    }

    public void applyImage(Canvas canvas, GeneticValues.LEG referenceLeg,
                           MultipartModel<GeneticHorseEntity> p) {

        GeneticValues.LEG modelLeg = p.getLeg();

        ModelPartKey key = ModelPartRegistry.getKeyFromModel(p);
        String partType = key.getPartName(referenceLeg);

        if (modelLeg != referenceLeg) {
            return;
        }

        // Apply regular neck/body texture
        Part bestPart = findBestMatch(p, referenceLeg, false);

        if (bestPart != null) {

            Part cubeDimensions = p.getCubeDimensions();

            cubeDimensions.applyBaseUVCoords(partType);

            canvas.drawImage(bestPart, cubeDimensions);
        }

        // Apply mane separately
        if (partType.equals("neck")) {
            applyManeImage(canvas, p, referenceLeg);
        }
    }

    private void applyManeImage(Canvas canvas, MultipartModel<GeneticHorseEntity> p, GeneticValues.LEG referenceLeg) {

    Part maneBestPart = findBestMatch(p, referenceLeg, true);

    if (maneBestPart == null) {
        EquigenMod.LOGGER.warn("NO MANE REFERENCE PART FOUND");
        return;
    }

    Part maneDimensions = p.returnManeCubeDimensions();
    EquigenMod.LOGGER.info("MANE PART NAME = {}", maneDimensions.modelName);

    if (maneDimensions == null) {
        EquigenMod.LOGGER.error("MANE DIMENSIONS ARE NULL");
        return;
    }

    EquigenMod.LOGGER.info(
            "MANE SOURCE = {}, TARGET = {}",
            maneBestPart.modelName,
            maneDimensions.modelName
    );

    maneDimensions.applyBaseUVCoords("mane");

    canvas.drawImage(maneBestPart, maneDimensions);
}

    public BufferedImage tintTexture(BufferedImage image, int rgbColor) {
        int width = image.getWidth();
        int height = image.getHeight();

        BufferedImage output = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        int tintR = textureCalculator.getR(rgbColor);
        int tintG = textureCalculator.getG(rgbColor);
        int tintB = textureCalculator.getB(rgbColor);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                int pixel = image.getRGB(x, y);

                boolean isIndicator = textureCalculator.getR(pixel) == 200;

                boolean isRightOfIndicator =
                        x > 0 && textureCalculator.getR(image.getRGB(x - 1, y)) == 200;

                boolean isBelowIndicator =
                        y > 0 && textureCalculator.getR(image.getRGB(x, y - 1)) == 200;

                if (isIndicator || isRightOfIndicator || isBelowIndicator) {
                    output.setRGB(x, y, pixel);
                    continue;
                }

                int alpha = textureCalculator.getAlpha(pixel);
                int r = textureCalculator.getR(pixel);
                int g = textureCalculator.getG(pixel);
                int b = textureCalculator.getB(pixel);

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
    public void updateReferenceParts(BufferedImage sourceFile) {
        PartList pList = new PartList(entity, modelSet);
        referenceParts.clear();
        referenceModels.clear();

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
                    if (textureCalculator.getR(pixel) == 200) {
//                        EquigenMod.LOGGER.info("FOUND!! INDICATOR PIXEL AT {} + {}", x, y);

                        String modelName = "";
                        // R 200 Specifies that this is a part
                        switch (textureCalculator.getG(pixel)) {
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
//                            EquigenMod.LOGGER.info("PIXEL INDICATES REFERENCE IS A " + modelName);

                        if (!modelName.isEmpty()) {
                            int rPixel = sourceFile.getRGB(x + 1, y);
                            int bPixel = sourceFile.getRGB(x, y + 1);
                            int muscleMass = decodeMuscleMass(rPixel);
                            int type = decodeType(rPixel); // Neck curve, leg width, etc
                            int lengthOrSize = decodeLengthOrSize(rPixel);
                            int blockNum = decodeAlpha(rPixel);
                            int reusedBlock;

                            switch (textureCalculator.getR(bPixel)) {
                                case 10 -> reusedBlock = 1; // Apply this block to ALL of the same TYPE of part.
                                case 20 -> reusedBlock = 2; // Apply this block to ALL of the same TYPE and LENGTH of part.
                                case 30 -> reusedBlock = 3; // Apply this block to ALL different musclemasses of the same LENGTH and TYPE
                                case 40 -> reusedBlock = 4; // Apply this block to both lean and average musclemasses of the same length.
                                case 50 -> reusedBlock = 5; // Apply this block to both lean and muscular musclemasses of the same length.
                                case 60 -> reusedBlock = 6; // Apply this block to both average and muscular musclemasses of the same length.
                                default -> reusedBlock = 0;
                            }
                            //TODO Make a way to indicate one block location is used for multiple different muscle masses.
//                                EquigenMod.LOGGER.info("PIXEL INDICATES REFERENCE IS {} muscle_mass, {} type, {} length_or_size, and {} block number.", muscleMass, type, lengthOrSize, blockNum);
//                                EquigenMod.LOGGER.info("R = {}, G = {}, B = {} ALPHA = {}", getR(rPixel), getG(rPixel), getB(rPixel), getAlpha(rPixel));



                            switch (reusedBlock) {
                                case 1 ->{
                                //Implement only if needed in the future. Right now we dont need a block to be applied to ALL of the same part.
                                }
                                case 2 -> {
                                    for(int m = 1; m <= 3; m++) {
                                        switch (modelName) {
                                            case "neck", "mane" -> {
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
            referenceParts = pList.getPartList();
            referenceModels = pList.getPartModelList();
    }
    public List<MultipartModel<GeneticHorseEntity>> getRenderedParts(GeneticHorseEntity entity) {
        List<MultipartModel<GeneticHorseEntity>> partList = new ArrayList<>(List.of());
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getBackKey(entity), modelSet)));

        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getTopBackLegKey(entity), modelSet, GeneticValues.LEG.BACK_LEFT)));
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getTopBackLegKey(entity), modelSet, GeneticValues.LEG.BACK_RIGHT)));

        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getBottomLegKey(entity), modelSet, GeneticValues.LEG.FRONT_LEFT)));
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getBottomLegKey(entity), modelSet, GeneticValues.LEG.FRONT_RIGHT)));
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getBottomLegKey(entity), modelSet, GeneticValues.LEG.BACK_LEFT)));
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getBottomLegKey(entity), modelSet, GeneticValues.LEG.BACK_RIGHT)));

        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getChestKey(entity), modelSet)));
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getLeftEarKey(entity), modelSet)));
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getRightEarKey(entity), modelSet)));

        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getTopFrontLegKey(entity), modelSet, GeneticValues.LEG.FRONT_LEFT)));
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getTopFrontLegKey(entity), modelSet, GeneticValues.LEG.FRONT_RIGHT)));

        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getHeadKey(entity), modelSet)));
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getHipKey(entity), modelSet)));
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getHoofKey(entity), modelSet, GeneticValues.LEG.FRONT_LEFT)));
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getHoofKey(entity), modelSet, GeneticValues.LEG.FRONT_RIGHT)));
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getHoofKey(entity), modelSet, GeneticValues.LEG.BACK_LEFT)));
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getHoofKey(entity), modelSet, GeneticValues.LEG.BACK_RIGHT)));

        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getKneeKey(entity), modelSet, GeneticValues.LEG.FRONT_LEFT)));
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getKneeKey(entity), modelSet, GeneticValues.LEG.FRONT_RIGHT)));
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getKneeKey(entity), modelSet, GeneticValues.LEG.BACK_LEFT)));
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getKneeKey(entity), modelSet, GeneticValues.LEG.BACK_RIGHT)));

        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getNeckKey(entity), modelSet)));
        // Mane is not in here since this method is only used to draw base color, and we dont want the mane drawn with that.
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getStomachKey(entity), modelSet)));
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getTailKey(entity), modelSet)));
        partList.add(Objects.requireNonNull(ModelPartRegistry.getModel(RegistryKeyFactory.getWitherKey(entity), modelSet)));
        return partList;
    }

    private int decodeMuscleMass(int pixel) {
        return switch (textureCalculator.getR(pixel)) {
            case 75 -> 1;
            case 150 -> 2;
            case 225 -> 3;
            default -> 0;
        };
    }

    private int decodeType(int pixel) {
        return switch (textureCalculator.getG(pixel)) {
            case 10 -> 1;
            case 20 -> 2;
            case 30 -> 3;
            case 40 -> 4;
            case 50 -> 5;
            default -> 0;
        };
    }

    private int decodeAlpha(int pixel) {
        EquigenMod.LOGGER.info("LOGGING ALPHA {}", textureCalculator.getAlpha(pixel));
        return switch (textureCalculator.getAlpha(pixel)) {
            case 13 -> 1; // In photoshop this scales by 5 percent on the Opacity slider
            case 25, 26 -> 2;
            case 38, 39, 40, 37, 36 -> 3;
            case 51, 52, 50, 49 -> 4;
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
        return switch (textureCalculator.getB(pixel)) {
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
    public Part findBestMatch( MultipartModel<GeneticHorseEntity> currentPart, GeneticValues.LEG leg, boolean isMane) { //TODO Make it so that the neck only applies to the same curve
        ModelPartKey key = ModelPartRegistry.getKeyFromModel(currentPart);
        EquigenMod.LOGGER.info("referenceModels size = {}", referenceModels.size());
        EquigenMod.LOGGER.info("referenceParts size = {}", referenceParts.size());

        String currPart = key.getPartName(leg); //Part name
        EquigenMod.LOGGER.info("FIND BEST MATCH, HANDLING THE {}. IS MANE = {}", currPart, isMane);

        //TODO make this link to the registry instead of PartNameBuilder
        if (referenceModels.isEmpty() || referenceParts.isEmpty()) {
            return null;
        }

        List<MultipartModel<GeneticHorseEntity>> relevantModels = new ArrayList<>(List.of());
        List<Part> relevantParts = new ArrayList<>(List.of());
        List<Integer> scores = new ArrayList<>(List.of());


        if (isMane) {
            currPart = "mane";
        }
        int index = 0;
        for (MultipartModel<GeneticHorseEntity> p : referenceModels) {
            ModelPartKey refKey = ModelPartRegistry.getKeyFromModel(p);

            String refPart = refKey.getPartName(leg);

            if (isMane && refPart.equals("neck")) {
                refPart = "mane";
            }
            Part referencePart = referenceParts.get(index);

            if (isMane) {
                // Only include mane texture parts
                if (refPart.equals("mane") &&
                        referencePart.modelName.startsWith("mane_")) {

                    relevantModels.add(p);
                    relevantParts.add(referencePart);
                    EquigenMod.LOGGER.info("MATCHES!! ADDING TO RELEVANT PARTS");
                }
            } else {
                // Only include regular neck texture parts
                if (refPart.equals(currPart) &&
                        !referencePart.modelName.startsWith("mane_")) {

                    relevantModels.add(p);
                    relevantParts.add(referencePart);
                }
            }

                index++;
        }
        if (isMane) {
            for (Part p : relevantParts) {
                EquigenMod.LOGGER.info(p.modelName);
            }
            EquigenMod.LOGGER.info("==========================");
            for (MultipartModel<GeneticHorseEntity> m : relevantModels) {
                EquigenMod.LOGGER.info(m.returnManeCubeDimensions().modelName);
            }
        }
        if (relevantParts.isEmpty() || relevantModels.isEmpty()) {
            EquigenMod.LOGGER.info("IS EMPTY!!!");
            return null;
        }
        for (MultipartModel<GeneticHorseEntity> ref : relevantModels) {
            String refModelName = ref.getCubeDimensions().modelName;
            String currModelName = currentPart.getCubeDimensions().modelName;
            if (isMane) {
                refModelName = refModelName.replace("neck", "mane");
                currModelName = currModelName.replace("neck", "mane");
            }
            List<Object> currRefPartGenetics = ModelPartRegistryKeys.getRecordComponents(ModelPartRegistry.getKeyFromModel(ref));
            List<Object> currPartGenetics = ModelPartRegistryKeys.getRecordComponents(ModelPartRegistry.getKeyFromModel(currentPart));
            int score = 0;
            EquigenMod.LOGGER.info("REF MODEL NAME = {}, CURRENT PART NAME = {}", refModelName, currModelName);
            if (!currModelName.endsWith(returnPartName(refModelName, currPart))) {
                score += 100;
                EquigenMod.LOGGER.info("CURR MODEL {} NAME DOESNT END WITH CURRENT PART NAME {}, SCORE IS NOW {}", currModelName, returnPartName(refModelName, currPart), score);
            } else {
                EquigenMod.LOGGER.info("CURR MODEL {} NAME DOES END IN CURRENT PART NAME {}!!!!", currModelName, returnPartName(refModelName, currPart));
            }
            int index2 = 0;
            for (Object part : currPartGenetics) {
                Object refPart = currRefPartGenetics.get(index2);
                EquigenMod.LOGGER.info("PART!! = {}, REF PART = {}" + part, refPart);
                if (!part.equals(refPart)) {
                    score += 80 / (index2 + 1);
                    EquigenMod.LOGGER.info("THEY DONT MATCH!! SCORE IS NOW {}", score);
                } else {
                    EquigenMod.LOGGER.info("THEY MATCH!!! NO SCORE ADDED");
                }
                index2++;
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
                EquigenMod.LOGGER.info("SCORE LOWERED, NEW LOWEST IS {}, which coordinates with the {}", lowestScore, relevantParts.get(referenceIndex).modelName);
            }
            currentIndex++;
        }
        if (isMane) {
            String currModelName = currentPart.getCubeDimensions().modelName;
            currModelName = currModelName.replace("neck", "mane");

            EquigenMod.LOGGER.info("MANE: FIND BEST MATCH RETURNED THE {}, CURRENT PART IS {}!!", relevantParts.get(referenceIndex).modelName, currModelName);
        }
        return relevantParts.get(referenceIndex);
    }

    public String returnPartName(String modelName, String partType) { //USE THIS ONLY FOR MANES, USED TO MATCH THE MANE NAMES.
        if (partType.equals("mane")) {
            modelName = modelName.replace("mane_", "");
            if (modelName.contains("lean_")) {
                modelName = modelName.replace("lean_", "");
            } else if (modelName.startsWith("average_")){
                modelName = modelName.substring(9);
            } else if (modelName.contains("muscular_")){
                modelName = modelName.replace("muscular_", "");
            }
        }
        return modelName;
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