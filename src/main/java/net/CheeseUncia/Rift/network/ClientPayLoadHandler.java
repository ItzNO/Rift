package net.CheeseUncia.Rift.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;

public class ClientPayLoadHandler {
    public static void handleDataOnMain(final StatusData data, final IPayloadContext context) {
        System.out.println("Client"+data.intelligence()+"   "+data.mana());
    }
}
