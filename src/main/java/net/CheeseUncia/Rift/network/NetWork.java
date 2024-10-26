package net.CheeseUncia.Rift.network;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.handling.DirectionalPayloadHandler;
import net.neoforged.neoforge.network.registration.HandlerThread;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;

public class NetWork {
    @SubscribeEvent
    public static void register(final RegisterPayloadHandlersEvent event) {
    PayloadRegistrar registrar = event.registrar("1");
    registrar = registrar.executesOn(HandlerThread.MAIN);
    registrar.playBidirectional(
        StatusData.TYPE,

        StatusData.STREAM_CODEC,
        new DirectionalPayloadHandler<>(
                ClientPayLoadHandler::handleDataOnMain,
                ServerPayLoadHandler::handleDataOnNetwork
        )
    );
}
}
