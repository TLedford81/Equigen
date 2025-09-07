package net.buckleystudios.equigen.util;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;

public final class MeasuringBufferSource implements MultiBufferSource {
    private final MultiBufferSource delegate;
    private final BoundsTracker bounds;
    private final boolean measureOnly;

    public MeasuringBufferSource(MultiBufferSource delegate, BoundsTracker bounds, boolean measureOnly) {
        this.delegate = delegate;
        this.bounds = bounds;
        this.measureOnly = measureOnly;
    }

    @Override
    public com.mojang.blaze3d.vertex.VertexConsumer getBuffer(RenderType type) {
        if (measureOnly) {
            return new MeasuringConsumer(NoopVertexConsumer.INSTANCE, bounds);
        } else {
            return new MeasuringConsumer(delegate.getBuffer(type), bounds);
        }
    }
}
