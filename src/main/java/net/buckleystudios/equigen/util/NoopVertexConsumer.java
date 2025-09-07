package net.buckleystudios.equigen.util;

public final class NoopVertexConsumer implements com.mojang.blaze3d.vertex.VertexConsumer {
    public static final NoopVertexConsumer INSTANCE = new NoopVertexConsumer();
    private NoopVertexConsumer() {}
    @Override public com.mojang.blaze3d.vertex.VertexConsumer addVertex(float x, float y, float z){ return this; }
    @Override public com.mojang.blaze3d.vertex.VertexConsumer setColor(int r,int g,int b,int a){ return this; }
    @Override public com.mojang.blaze3d.vertex.VertexConsumer setUv(float u,float v){ return this; }
    @Override public com.mojang.blaze3d.vertex.VertexConsumer setUv1(int u,int v){ return this; }
    @Override public com.mojang.blaze3d.vertex.VertexConsumer setUv2(int u,int v){ return this; }
    @Override public com.mojang.blaze3d.vertex.VertexConsumer setNormal(float nx,float ny,float nz){ return this; }
}
