package net.buckleystudios.equigen.network.packets;

import io.netty.buffer.ByteBuf;
import net.buckleystudios.equigen.EquigenMod;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

//TODO: Convert String genetic to GeneticValues genetic ???
public record GeneticData(int entityID, String genetic, float value) implements CustomPacketPayload{
    public static final Type<GeneticData> TYPE = new CustomPacketPayload.Type<>(
            ResourceLocation.fromNamespaceAndPath(EquigenMod.MODID, "genetic_data"));

    public static final StreamCodec<ByteBuf, GeneticData> STREAM_CODEC = StreamCodec.composite(
            ByteBufCodecs.INT,
            GeneticData::entityID,
            ByteBufCodecs.STRING_UTF8,
            GeneticData::genetic,
            ByteBufCodecs.FLOAT,
            GeneticData::value,
            GeneticData::new
    );

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
