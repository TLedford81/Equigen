package net.buckleystudios.equigen.entity.client.genetic_horse.texturer.base;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.custom.genetics.util.GeneticPartNameBuilder;

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
                EquigenMod.LOGGER.info("UNMODIFIED PART, CONTINUING");
            } else {
                for (int f = 0; f < modifiedPart.blocks.get(i).faces.size(); f++) {
                    g.drawImage(img,
                            // destination (where it goes on the canvas)
                            targetPart.blocks.get(i).faces.get(f).x,
                            targetPart.blocks.get(i).faces.get(f).y,
                            targetPart.blocks.get(i).faces.get(f).x + targetPart.blocks.get(i).faces.get(f).width,
                            targetPart.blocks.get(i).faces.get(f).y + targetPart.blocks.get(i).faces.get(f).height,

                            // source (what part of the original image to use)
                            modifiedPart.blocks.get(i).faces.get(f).x,
                            modifiedPart.blocks.get(i).faces.get(f).y,
                            modifiedPart.blocks.get(i).faces.get(f).x + modifiedPart.blocks.get(i).faces.get(f).width,
                            modifiedPart.blocks.get(i).faces.get(f).y + modifiedPart.blocks.get(i).faces.get(f).height,
                            null);
                    System.out.println("BLOCK " + i + " | FACE " + f +
                            "     TARGET X = " + targetPart.blocks.get(i).faces.get(f).x
                            + " TARGET Y = " + targetPart.blocks.get(i).faces.get(f).y +
                            " SOURCE X = " +  modifiedPart.blocks.get(i).faces.get(f).x +
                            " SOURCE Y = " + modifiedPart.blocks.get(i).faces.get(f).y);
                }
            }
        }
    }

    public void drawColor (ArrayList<String> pList, int hexCode) {
        Color color = new Color(hexCode);
        PartList Parts = new PartList();


        for (String s : pList) {
            Part p = Parts.returnPart(s);
            GeneticPartNameBuilder builder = new GeneticPartNameBuilder();
            String partType = builder.returnPartType(s);
            p.applyBaseUVCoords(partType);
            if (p.modelName.equals("NULL") || p.blocks == null) {
                EquigenMod.LOGGER.info("NULL PART WHEN DRAWING COLOR! MOVING ON: {}" ,p.modelName);
            } else {
                EquigenMod.LOGGER.info("DRAWING {} !", p.modelName);
                for(int i = 0; i < p.blocks.size(); i++) {
                    for (int f = 0; f < p.blocks.get(i).faces.size(); f++) {
                        Face face = p.blocks.get(i).faces.get(f);

                        EquigenMod.LOGGER.info("DRAWING COLOR!");

                        g.setColor(color);
                        g.fillRect(
                                face.x,
                                face.y,
                                face.width,
                                face.height
                        );
                    }
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
