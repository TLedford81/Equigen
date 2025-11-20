package net.buckleystudios.equigen.util;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;

public final class MeasuringBufferSource implements MultiBufferSource {
    private final MultiBufferSource delegate;
    private final BoundsTracker bounds;

    public MeasuringBufferSource(MultiBufferSource delegate, BoundsTracker bounds) {
        this.delegate = delegate;
        this.bounds = bounds;
    }

    @Override
    public com.mojang.blaze3d.vertex.VertexConsumer getBuffer(RenderType type) {
        return new MeasuringConsumer(delegate.getBuffer(type), bounds);
    }
}
