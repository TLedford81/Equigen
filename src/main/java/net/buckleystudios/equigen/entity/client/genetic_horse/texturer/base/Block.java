package net.buckleystudios.equigen.entity.client.genetic_horse.texturer.base;

import java.util.ArrayList;

public class Block extends Face {
    public int x; // The x and y of top left corner of face_1, aka the leftmost point of the block.
    public int y;
    public boolean modified = false;
    ArrayList<Face> faces = new ArrayList<>();


    public Block(int sizeX, int sizeY, int sizeZ) {
        this(0, 0, sizeX, sizeY, sizeZ);
    }


    public Block(int x, int y, int sizeX, int sizeY, int sizeZ) {
        this.x = 0;
        this.y = 0;

        sizeX *= 2;
        sizeY *= 2;
        sizeZ *= 2;

        faces.add(new Face(sizeZ, sizeY));
        faces.add(new Face(sizeX, sizeY));
        faces.add(new Face(sizeZ, sizeY));
        faces.add(new Face(sizeX, sizeY));
        faces.add(new Face(sizeX, sizeZ));
        faces.add(new Face(sizeX, sizeZ));

        setFaceCoordinates(faces);
    }


    public static void main(String[] args) {
    }

    public void printFaces() {
        for (int i = 0; i < faces.size(); i++) {
            faces.get(i).printStats();
        }
    }
    public void printBlock() {
        faces.get(0).printStats();
    }

    public void setXandY(int x, int y) {
        this.x = x;
        this.y = y;
        setFaceCoordinates(faces);
    }

    public void setFaceCoordinates(ArrayList<Face> faces) {
        faces.get(0).x = x;
        faces.get(0).y = y;

        for (int i = 1; faces.size() > i; i++) {
            if (i == 4) {
                faces.get(i).x = faces.get(2).getX() - faces.get(i).width;
                faces.get(i).y = faces.get(2).getY() - faces.get(i).height;
            } else if (i == 5) {
                faces.get(i).x = faces.get(2).getX();
                faces.get(i).y = faces.get(2).getY() - faces.get(i).height;
            }else {
                faces.get(i).x = faces.get(i - 1).x + faces.get(i - 1).width;
                faces.get(i).y = faces.get(i - 1).y;
            }
        }
    }

    public boolean isModified() {
        return modified;
    }

    public void setModified(boolean modified) {
        this.modified = modified;
    }
}