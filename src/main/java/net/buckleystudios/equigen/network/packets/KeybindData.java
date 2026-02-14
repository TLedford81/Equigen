package net.buckleystudios.equigen.network.packets;

import io.netty.buffer.ByteBuf;
import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

public record KeybindData(String player, int value) implements CustomPacketPayload{
    public static final Type<KeybindData> TYPE = new CustomPacketPayload.Type<>(
            ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "key_data"));

    public static final StreamCodec<ByteBuf, KeybindData> STREAM_CODEC = StreamCodec.composite(
            ByteBufCodecs.STRING_UTF8,
            KeybindData::player,
            ByteBufCodecs.INT,
            KeybindData::value,
            KeybindData::new
    );

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
