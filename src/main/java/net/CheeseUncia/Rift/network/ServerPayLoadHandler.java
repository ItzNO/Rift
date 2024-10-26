package net.CheeseUncia.Rift.network;

import net.minecraft.network.chat.Component;
import net.neoforged.neoforge.network.handling.IPayloadContext;

public class ServerPayLoadHandler {
     public static void handleDataOnNetwork(final StatusData data, final IPayloadContext context) {
        // Do something with the data, on the network thread


        // Do something with the data, on the main thread
        context.enqueueWork(() -> {
            System.out.println("Client"+data.intelligence()+"   "+data.mana());
        })
        .exceptionally(e -> {
            // Handle exception
            context.disconnect(Component.translatable("my_mod.networking.failed", e.getMessage()));
            return null;
        });
    }
}
