package net.CheeseUncia.Rift.listener;

import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.living.LivingEvent;

import static net.CheeseUncia.Rift.status.Status.INTELLIGENCE;

@Mod("rift")
public class Listeners {
    public Listeners(IEventBus bus) {
        NeoForge.EVENT_BUS.addListener(Listeners::onPlayerJump);
    }

    public static void onPlayerJump(LivingEvent.LivingJumpEvent event){
        if(event.getEntity() instanceof ServerPlayer player){
            int intelligence = player.getData(INTELLIGENCE);
            intelligence += 1;
            player.setData(INTELLIGENCE, intelligence);
            player.sendSystemMessage(Component.literal("your intelligence is now " + intelligence), true);
        }
    }
}
