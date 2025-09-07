package net.buckleystudios.equigen.util;

import com.mojang.blaze3d.vertex.VertexConsumer;

public final class MeasuringConsumer implements VertexConsumer {
    private final VertexConsumer delegate;
    private final BoundsTracker bounds;

    public MeasuringConsumer(VertexConsumer delegate, BoundsTracker bounds) {
        this.delegate = delegate;
        this.bounds = bounds;
    }

    @Override
    public VertexConsumer addVertex(float x, float y, float z) {
        bounds.include(x, y, z);
        delegate.addVertex(x, y, z);
        return this;
    }

    @Override public VertexConsumer setColor(int r, int g, int b, int a) { delegate.setColor(r,g,b,a); return this; }
    @Override public VertexConsumer setUv(float u, float v)             { delegate.setUv(u,v);       return this; }
    @Override public VertexConsumer setUv1(int u, int v)                { delegate.setUv1(u,v);      return this; }
    @Override public VertexConsumer setUv2(int u, int v)                { delegate.setUv2(u,v);      return this; }
    @Override public VertexConsumer setNormal(float nx, float ny, float nz) { delegate.setNormal(nx,ny,nz); return this; }
}
