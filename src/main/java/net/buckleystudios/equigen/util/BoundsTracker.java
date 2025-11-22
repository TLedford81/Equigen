package net.buckleystudios.equigen.util;

public final class BoundsTracker {
    public float minX =  Float.POSITIVE_INFINITY, minY =  Float.POSITIVE_INFINITY, minZ =  Float.POSITIVE_INFINITY;
    public float maxX = -Float.POSITIVE_INFINITY, maxY = -Float.POSITIVE_INFINITY, maxZ = -Float.POSITIVE_INFINITY;

    public void include(float x, float y, float z) {
        if (x < minX) minX = x; if (x > maxX) maxX = x;
        if (y < minY) minY = y; if (y > maxY) maxY = y;
        if (z < minZ) minZ = z; if (z > maxZ) maxZ = z;
    }

    public float height() { return maxY - minY; }
}

