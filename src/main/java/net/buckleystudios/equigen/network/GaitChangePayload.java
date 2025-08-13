package net.buckleystudios.equigen.network;

import io.netty.buffer.ByteBuf;
import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

public record GaitChangePayload(int gait) implements CustomPacketPayload {

    public static final Type<GaitChangePayload> TYPE =
            new Type<>(ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "gait_change"));

    public static final StreamCodec<ByteBuf, GaitChangePayload> STREAM_CODEC = StreamCodec.composite(
            ByteBufCodecs.VAR_INT, GaitChangePayload::gait,
            GaitChangePayload::new
    );

    @Override
    public Type<? extends CustomPacketPayload> type() { return TYPE; }
}