package net.buckleystudios.equigen.entity.genetic_horse.client.texturer.base;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.genetic_horse.GeneticHorseEntity;
import net.buckleystudios.equigen.entity.genetic_horse.client.parts.multipart.MultipartModel;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticValues;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.util.GeneticPartNameBuilder;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Canvas {
    BufferedImage img;
    BufferedImage background;
    BufferedImage canvas;
    Graphics2D g;

    public static void main(String[] args) {

    }

    public Canvas() {
    }

    public BufferedImage getCanvas() {
        return canvas;
    }

    public void setCanvas(BufferedImage canvas) {
        this.canvas = canvas;
    }

    public Graphics2D getG() {
        return g;
    }

    public void setG(Graphics2D g) {
        this.g = g;
    }

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }

    public void initializeCanvas() throws IOException {
//        background = ImageIO.read((Paths.get("..", "..", "src", "main", "resources", "assets", EquigenMod.MODID, "textures",
//                "entity", "genetic_horse", "final_texture.png")).toFile());
        this.canvas =
                new BufferedImage(256,
                        320,
                        BufferedImage.TYPE_4BYTE_ABGR);
        g = canvas.createGraphics();
//        g.drawImage(background, 0, 0, null);

    }

    public void updateCanvasImage(BufferedImage file) throws IOException {
        this.img = file;

        if (img == null) {
            System.out.println("One or more images could not be loaded.");
        }

    }
    public void drawImage(Part modifiedPart, Part targetPart ) {
        if (img == null) {
            throw new IllegalStateException("Source image was not loaded.");
        }
        for(int i = 0; i < modifiedPart.blocks.size(); i++) {
            Block b = modifiedPart.getSingleBlock(i);
            if (!b.isModified()) {
//                EquigenMod.LOGGER.info("UNMODIFIED PART. BLOCK {} X {} Y {}", i, b.x, b.y);
            } else {
                if (b.x == 0 && b.y == 0) {
                    EquigenMod.LOGGER.info("X AND Y COORDS AT 0! MODIFIED PART = {}, TARGET PART = {}", modifiedPart.modelName, targetPart.modelName);
                } else {
                    EquigenMod.LOGGER.info("DRAW IMAGE: X = {} Y = {} MODIFIED PART = {}, TARGET PART = {}", b.x, b.y, modifiedPart.modelName, targetPart.modelName);
                }
                for (int f = 0; f < modifiedPart.blocks.get(i).faces.size(); f++) {
                    int x = targetPart.blocks.get(i).faces.get(f).getX();
                    int y = targetPart.blocks.get(i).faces.get(f).getY();
                    int width = targetPart.blocks.get(i).faces.get(f).getWidth();
                    int height = targetPart.blocks.get(i).faces.get(f).getHeight();

                    int modX =modifiedPart.blocks.get(i).faces.get(f).getX();
                    int modY = modifiedPart.blocks.get(i).faces.get(f).getY();
                    int modWidth = modifiedPart.blocks.get(i).faces.get(f).getWidth();
                    int modHeight = modifiedPart.blocks.get(i).faces.get(f).getHeight();
                    g.drawImage(img,
                            // destination (where it goes on the canvas)
                            x,
                            y,
                            x + width,
                            y + height,

                            // source (what part of the original image to use)
                            modX,
                            modY,
                            modX + modWidth,
                            modY + modHeight,
                            null);
                }
            }
        }
    }

    public void drawColor (ArrayList<MultipartModel<GeneticHorseEntity>> pList, int hexCode) {

        Color color = new Color(hexCode);

        for (MultipartModel<GeneticHorseEntity> m : pList) {
            Part p = m.getCubeDimensions();
            GeneticPartNameBuilder builder = new GeneticPartNameBuilder();
            String partType = builder.returnPartType(p.modelName, null);
            EquigenMod.LOGGER.info("MODEL NAME = {} PART TYPE = {}", p.modelName, partType);
            if (partType.equals("top_front_legs") || partType.equals("top_back_legs") || partType.equals("bottom_legs")
                    || partType.equals("knees") || partType.equals("hoof")) {

                for (GeneticValues.LEG leg : GeneticValues.LEG.values()) {
                    if (partType.equals("top_front_legs")) {
                        if (leg.equals(GeneticValues.LEG.BACK_LEFT) || leg.equals(GeneticValues.LEG.BACK_RIGHT)) {
                            continue;
                        }
                    }
                    if (partType.equals("top_back_legs")) {
                        if (leg.equals(GeneticValues.LEG.FRONT_LEFT) || leg.equals(GeneticValues.LEG.FRONT_RIGHT)) {
                            continue;
                        }
                    }
                        partType = builder.returnPartType(p.modelName, leg); //TODO Find a way to switch this over from the part name builder to the reverse lookup
                        p.applyBaseUVCoords(partType);
                        draw(p, color);
                }
            } else {
                p.applyBaseUVCoords(partType);
                draw(p, color);
            }
            }
        }


    public void draw(Part p, Color color) {
        if (p.modelName.equals("NULL") || p.blocks == null) {
            EquigenMod.LOGGER.info("NULL PART WHEN DRAWING COLOR! MOVING ON: {}" ,p.modelName);
        } else {
            EquigenMod.LOGGER.info("DRAWING {} !", p.modelName);
            for(int i = 0; i < p.blocks.size(); i++) {
                EquigenMod.LOGGER.info("BLOCK COORDS X: {} Y: {}!", p.blocks.get(i).x, p.blocks.get(i).y);
                for (int f = 0; f < p.blocks.get(i).faces.size(); f++) {
                    Face face = p.blocks.get(i).faces.get(f);
                    int x = face.getX();
                    int y = face.getY();
                    int width = face.getWidth();
                    int height = face.getHeight();
                    EquigenMod.LOGGER.info("FACE INFO: X: {} Y: {} WIDTH: {} HEIGHT: {}", x, y, width, height);

                    EquigenMod.LOGGER.info("DRAWING COLOR!");

                    g.setColor(color);
                    g.fillRect(
                            x,
                            y,
                            width,
                            height
                    );
                }
            }
        }
    }

    public void finalizeImage(Path destination) {
        try {
            if (destination.getParent() != null) {
                Files.createDirectories(destination.getParent());
            }

            g.dispose();
            ImageIO.write(canvas, "png", destination.toFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Sucessfully saved image!!");
    }
}
