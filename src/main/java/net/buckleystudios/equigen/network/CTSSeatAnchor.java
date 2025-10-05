package net.buckleystudios.equigen.network;

import io.netty.buffer.ByteBuf;
import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

public record CTSSeatAnchor(int entityId, float offX, float offY, float offZ)
        implements CustomPacketPayload {

    public static final Type<CTSSeatAnchor> TYPE =
            new Type<>(ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "seat_anchor_c2s"));

    public static final StreamCodec<ByteBuf, CTSSeatAnchor> STREAM_CODEC = StreamCodec.composite(
            ByteBufCodecs.VAR_INT, CTSSeatAnchor::entityId,
            ByteBufCodecs.FLOAT,   CTSSeatAnchor::offX,
            ByteBufCodecs.FLOAT,   CTSSeatAnchor::offY,
            ByteBufCodecs.FLOAT,   CTSSeatAnchor::offZ,
            CTSSeatAnchor::new
    );

    @Override public Type<? extends CustomPacketPayload> type() { return TYPE; }
}