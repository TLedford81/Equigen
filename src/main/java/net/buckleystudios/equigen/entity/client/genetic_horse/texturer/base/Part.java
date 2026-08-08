package net.buckleystudios.equigen.entity.client.genetic_horse.texturer.base;

import net.buckleystudios.equigen.EquigenMod;

import java.util.ArrayList;

public class Part {
    public String modelName;
    ArrayList<Block> blocks = new ArrayList<>();

    public void applyBaseUVCoords(String type) {
        //Applies the base TARGET coords for the final texture file to the blocks.
        switch (type) {
            case "back" -> {
                updateBlocks(0, 66, 32, false);
                updateBlocks(1, 128, 12, false);
                updateBlocks(2, 140, 48, false);
            }
            case "top_back_legs" -> {
                updateBlocks(0, 70, 264, false);
                updateBlocks(1, 98, 258, false);
            }
            case "bottom_leg" -> {
                updateBlocks(0, 0, 316, false);
                updateBlocks(1, 36, 282, false);
            }
            case "chest" -> {
                updateBlocks(0, 60, 284, false);
                updateBlocks(1, 118, 272, false);
                updateBlocks(2, 182, 290, false);
                updateBlocks(3, 222, 272, false);
                updateBlocks(4, 150, 274, false);
                updateBlocks(5, 96, 306, false);
                updateBlocks(6, 200, 302, false);
                updateBlocks(7, 128, 288, false);
                updateBlocks(8, 182, 272, false);
                updateBlocks(9, 96, 284, false);
                updateBlocks(10, 48, 306, false);
                updateBlocks(11, 144, 302, false);
            }
            case "left_ear" -> {
                updateBlocks(0, 240, 294, false);
                updateBlocks(1, 242, 286, false);
            }
            case "right_ear" -> {
                updateBlocks(0, 244, 269, false);
                updateBlocks(1, 246, 260, false);
            }
            case "top_front_legs" -> {
                updateBlocks(0, 84, 150, false);
                updateBlocks(1, 46, 240, false);
                updateBlocks(2, 36, 218, false);
            }
            case "head" -> {
                updateBlocks(0, 210, 192, false);
                updateBlocks(1, 182, 208, false);
                updateBlocks(2, 124, 208, false);
                updateBlocks(3, 146, 200, false);
                updateBlocks(4, 220, 206, false);
                updateBlocks(5, 186, 200, false);
                updateBlocks(6, 172, 264, false);
            }
            case "hips" -> {
                updateBlocks(0, 0, 252, false);
                updateBlocks(1, 0, 196, false);
                updateBlocks(2, 0, 286, false);
                updateBlocks(3, 0, 222, false);
                updateBlocks(4, 0, 150, false);
                updateBlocks(5, 0, 174, false);
            }
            case "hoof" -> {
                updateBlocks(0, 204, 266, false);
            }
            case "knees" -> {
                updateBlocks(0, 130, 298, false);
            }
            case "neck" -> {
                updateBlocks(0, 210, 168, false);
                updateBlocks(1, 216, 124, false);
                updateBlocks(2, 210, 50, false);
                updateBlocks(3, 210, 12, false);
                updateBlocks(4, 214, 94, false);
            }
            case "mane" -> {
                updateBlocks(0, 192, 152, false);
                updateBlocks(1, 186, 116, false);
                updateBlocks(2, 224, 226, false);
                updateBlocks(3, 166, 226, false);
                updateBlocks(4, 174, 78, false);
                updateBlocks(5, 170, 38, false);
                updateBlocks(6, 192, 242, false);
                updateBlocks(7, 134, 242, false);
            }
            case "stomach" -> {
                updateBlocks(0, 120, 166, false);
                updateBlocks(1, 168, 166, false);
                updateBlocks(2, 80, 210, false);
                updateBlocks(3, 84, 176, false);
            }
            case "tail" -> {
                updateBlocks(0, 62, 202, false);
                updateBlocks(1, 52, 254, false);
                updateBlocks(2, 132, 146, false);
                updateBlocks(3, 174, 132, false);
            }
            case "withers" -> {
                updateBlocks(0, 48, 160, false);
                updateBlocks(1, 38, 136, false);
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
            EquigenMod.LOGGER.info("{} :: SETTING BLOCK {} TO {} X AND {} Y", this.modelName, index, x, y);
            blocks.get(index).setXandY(x, y);
            blocks.get(index).setModified(modified);
        }
    }

    public Block getSingleBlock(int index) {
        return blocks.get(index);
    }

    public ArrayList<Block> getBlocks() {
        return blocks;
    }
}

