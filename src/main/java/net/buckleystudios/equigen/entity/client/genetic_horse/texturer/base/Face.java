package net.buckleystudios.equigen.entity.client.genetic_horse.texturer.base;

public class Face {
    protected int width;
    protected int height;
    protected int x;
    protected int y;

    public Face(int width, int height, int x, int y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }
    public Face(int width, int height) {
        this(width, height, 0, 0);
    }

    public Face() {

    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void printStats() {
        System.out.println("X = " + this.getX() + " Y = " + this.getY() + " WIDTH = " + this.getWidth() + " HEIGHT = " + this.getHeight());
    }
}