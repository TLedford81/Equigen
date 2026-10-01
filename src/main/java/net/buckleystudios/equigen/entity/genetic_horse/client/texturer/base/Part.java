package net.buckleystudios.equigen.entity.genetic_horse.client.texturer.base;

import net.buckleystudios.equigen.EquigenMod;

import java.util.ArrayList;

public class Part {
    public String modelName;
    ArrayList<Block> blocks = new ArrayList<>();

    public void applyBaseUVCoords(String type) {
        //Applies the base TARGET coords for the final texture file to the blocks.
        EquigenMod.LOGGER.info("APPLYING COORDS TO {}", type);
        switch (type) {
            case "back" -> {
                updateBlocks(0, 66, 32);
                updateBlocks(1, 128, 12);
                updateBlocks(2, 140, 48);
            }
            case "top_back_legs_back_left" -> {
                updateBlocks(0, 52, 114);
                updateBlocks(1, 22, 120);
            }
            case "top_back_legs_back_right" -> {
                updateBlocks(0, 116, 114);
                updateBlocks(1, 86, 120);
            }
            case "bottom_legs_front_left" -> {
                updateBlocks(0, 16, 52);
                updateBlocks(1, 0, 42);
            }
            case "bottom_legs_front_right" -> {
                updateBlocks(0, 0, 72);
                updateBlocks(1, 0, 56);
            }
            case "bottom_legs_back_left" -> {
                updateBlocks(0, 0, 100);
                updateBlocks(1, 0, 84);
            }
            case "bottom_legs_back_right" -> {
                updateBlocks(0, 0, 128);
                updateBlocks(1, 0, 112);
            }
            case "chest" -> {
                updateBlocks(0, 60, 284);
                updateBlocks(1, 118, 272);
                updateBlocks(2, 182, 290);
                updateBlocks(3, 222, 272);
                updateBlocks(4, 150, 274);
                updateBlocks(5, 96, 306);
                updateBlocks(6, 200, 302);
                updateBlocks(7, 128, 288);
                updateBlocks(8, 182, 272);
                updateBlocks(9, 96, 284);
                updateBlocks(10, 48, 306);
                updateBlocks(11, 144, 302);
            }
            case "left_ear" -> {
                updateBlocks(0, 240, 294);
                updateBlocks(1, 242, 286);
            }
            case "right_ear" -> {
                updateBlocks(0, 244, 269);
                updateBlocks(1, 246, 260);
            }
            case "top_front_legs_front_left" -> {
                updateBlocks(0, 82, 90);
                updateBlocks(1, 48, 84);
                updateBlocks(2, 22, 90);
            }
            case "top_front_legs_front_right" -> {
                updateBlocks(0, 144, 108);
                updateBlocks(1, 110, 84);
                updateBlocks(2, 76, 66, false);
            }
            case "head" -> {
                updateBlocks(0, 210, 192);
                updateBlocks(1, 182, 208);
                updateBlocks(2, 124, 208);
                updateBlocks(3, 146, 200);
                updateBlocks(4, 220, 206);
                updateBlocks(5, 186, 200);
                updateBlocks(6, 172, 264);
            }
            case "hips" -> {
                updateBlocks(0, 0, 252);
                updateBlocks(1, 0, 196);
                updateBlocks(2, 0, 286);
                updateBlocks(3, 0, 222);
                updateBlocks(4, 0, 150);
                updateBlocks(5, 0, 174);
            }
            case "hoof_front_left" -> {
                updateBlocks(0, 90, 142);
            }
            case "hoof_front_right" -> {
                updateBlocks(0, 108, 148);
            }
            case "hoof_back_left" -> {
                updateBlocks(0, 88, 154);
            }
            case "hoof_back_right" -> {
                updateBlocks(0, 106, 160);
            }
            case "knees_front_left" -> {
                updateBlocks(0, 50, 6);
            }
            case "knees_front_right" -> {
                updateBlocks(0, 68, 6);
            }
            case "knees_back_left" -> {
                updateBlocks(0, 50, 16);
            }
            case "knees_back_right" -> {
                updateBlocks(0, 68, 16);
            }
            case "neck" -> {
                updateBlocks(0, 210, 168);
                updateBlocks(1, 216, 124);
                updateBlocks(2, 210, 50);
                updateBlocks(3, 210, 12);
                updateBlocks(4, 214, 94);
            }
            case "mane" -> {
                updateBlocks(0, 192, 152);
                updateBlocks(1, 186, 116);
                updateBlocks(2, 224, 226);
                updateBlocks(3, 166, 226);
                updateBlocks(4, 174, 78);
                updateBlocks(5, 170, 38);
                updateBlocks(6, 192, 242);
                updateBlocks(7, 134, 242);
            }
            case "stomach" -> {
                updateBlocks(0, 120, 166);
                updateBlocks(1, 168, 166);
                updateBlocks(2, 80, 210);
                updateBlocks(3, 84, 176);
            }
            case "tail" -> {
                updateBlocks(0, 62, 202);
                updateBlocks(1, 52, 254);
                updateBlocks(2, 132, 146);
                updateBlocks(3, 174, 132);
            }
            case "withers" -> {
                updateBlocks(0, 48, 160);
                updateBlocks(1, 38, 136);
            }
        }
    }

    public Part(String modelName, ArrayList<Block> blocks) {
        this.modelName = modelName;
        this.blocks = blocks;
    }

    public void printBlockStats() {
        EquigenMod.LOGGER.info(this.modelName);
        EquigenMod.LOGGER.info("BLOCK STATS");
        EquigenMod.LOGGER.info("-----------");
        for (int i = 0; i < blocks.size(); i++) {
            EquigenMod.LOGGER.info("BLOCK {}", i);
            blocks.get(i).printBlock();
        }
        EquigenMod.LOGGER.info("-----------");
    }
    public void updateBlocks(int index, int x, int y, boolean modified) {
        if (index > blocks.size()) {
            EquigenMod.LOGGER.info("INDEX IS OUT OF RANGE OF BLOCK LIST. Moving on...");
        } else {
            EquigenMod.LOGGER.info("{} :: SETTING BLOCK {} TO {} X AND {} Y AND MODIFIED TO {}", this.modelName, index, x, y, modified);
            blocks.get(index).setXandY(x, y);
            blocks.get(index).setModified(modified);
        }
    }

    public void updateBlocks(int index, int x, int y) {
        updateBlocks(index, x, y, blocks.get(index).isModified());
    }

    public Block getSingleBlock(int index) {
        return blocks.get(index);
    }

    public ArrayList<Block> getBlocks() {
        return blocks;
    }
}

