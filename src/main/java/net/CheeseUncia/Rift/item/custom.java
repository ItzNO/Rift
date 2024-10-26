package net.CheeseUncia.Rift.item;

import net.CheeseUncia.Rift.network.StatusData;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.network.PacketDistributor;

import static net.CheeseUncia.Rift.status.Status.*;

public class custom extends Item {
    public custom(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        if(!world.isClientSide()) {
            PacketDistributor.sendToPlayer((ServerPlayer) player,new StatusData(0,0));
            System.out.println("server"+player.getData(INTELLIGENCE)+"server"+player.getData(MANA));
        }
        else if(world.isClientSide()) {
            System.out.println("client"+player.getData(INTELLIGENCE)+"client"+player.getData(MANA));
        }
        return super.use(world, player, hand);
    }
}
