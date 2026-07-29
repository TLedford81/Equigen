package net.buckleystudios.equigen.entity.client.genetic_horse.texturer.base;

import java.util.ArrayList;

public class Part {
    public String modelName;
    ArrayList<Block> blocks = new ArrayList<>();

    public Part(String modelName, ArrayList<Block> blocks) {
        this.modelName = modelName;
        this.blocks = blocks;
    }

    public void printBlockStats() {
        for (int i = 0; i < blocks.size(); i++) {
            System.out.println("BLOCK " + i);
            blocks.get(i).print();
        }
    }
    public void updateBlocks(int index, int x, int y, boolean modified) {
        blocks.get(index).setXandY(x, y);
        blocks.get(index).setModified(modified);
    }

    public Block getSingleBlock(int index) {
        return blocks.get(index);
    }

    public ArrayList<Block> getBlocks() {
        return blocks;
    }
}

