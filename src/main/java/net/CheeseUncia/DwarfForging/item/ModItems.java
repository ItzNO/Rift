package net.CheeseUncia.DwarfForging.item;

import net.CheeseUncia.DwarfForging.DwarfForging;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    //创建ITEMS
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DwarfForging.MODID);


    //注册物品(不需要注册方块)
    //item_id需要全部小写 Item命名建议全大写
    //public static final DeferredItem<Item> ITEM = ITEMS.register("item_id",()->new Item(new Item.Properties()));
    //需要在主函数中对应创造物品栏accept

    public  static final DeferredItem<Item> CHALK = ITEMS.register("chalk",()->new Item(new Item.Properties()));

    //将ITEMS注册入总线
    public static void register(IEventBus bus){
        ITEMS.register(bus);
    }
}
