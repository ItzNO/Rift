package net.CheeseUncia.Rift.listener;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;

import static net.CheeseUncia.Rift.status.Status.*;

@Mod("rift")
public class PlayerClone {
    public PlayerClone() {
        NeoForge.EVENT_BUS.register(PlayerClone.class);
    }

    @SubscribeEvent
    public static void onPlayerClone(PlayerEvent.Clone event) {
        if(event.isWasDeath() && event.getOriginal().hasData(INTELLIGENCE)) {
            event.getEntity().setData(INTELLIGENCE,event.getOriginal().getData(INTELLIGENCE));
        }

        else if(event.isWasDeath() && event.getOriginal().hasData(MANA)) {
            event.getEntity().setData(MANA,event.getOriginal().getData(INTELLIGENCE)+100);
        }
    }
}
