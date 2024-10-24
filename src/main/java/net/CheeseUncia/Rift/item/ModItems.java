package net.CheeseUncia.Rift.item;

import net.CheeseUncia.Rift.Rift;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    //创建ITEMS
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Rift.MODID);


    //注册物品(不需要注册方块)
    //item_id需要全部小写 Item命名建议全大写
    //public static final DeferredItem<Item> ITEM = ITEMS.register("item_id",()->new Item(new Item.Properties()){
    //        @Override
    //        public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponent, TooltipFlag tooltipFlag) {
    //            tooltipComponent.add(Component.translatable("rift.item_id.tooltips"));
    //            super.appendHoverText(stack,context,tooltipComponent,tooltipFlag);
    //        });
    //需要在主函数中对应创造物品栏accept

    public static final DeferredItem<Item> CHALK = ITEMS.register("chalk",()->new Item(new Item.Properties()));
    public static final DeferredItem<Item> JUDGEMENT_CORE = ITEMS.register("judgement_core",()->new Item(new Item.Properties()));

    //将ITEMS注册入总线
    public static void register(IEventBus bus){
        ITEMS.register(bus);
    }
}
