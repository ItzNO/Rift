package net.CheeseUncia.Rift.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

public record StatusData(int intelligence,int mana) implements CustomPacketPayload {

    public static final CustomPacketPayload.Type<StatusData> TYPE = new CustomPacketPayload.Type<>(ResourceLocation.fromNamespaceAndPath("rift", "status_data"));


    // The final parameter takes in the previous parameters in the order they are provided to construct the payload object
    public static final StreamCodec<ByteBuf, StatusData> STREAM_CODEC = StreamCodec.composite(
        ByteBufCodecs.VAR_INT, StatusData::intelligence, ByteBufCodecs.VAR_INT,StatusData::mana, StatusData::new);


    @Override
    public CustomPacketPayload.Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
