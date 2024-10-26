package net.CheeseUncia.Rift.item;

import net.CheeseUncia.Rift.Rift;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Rift.MODID);

    public static final DeferredItem<Item> MESSAGE = ITEMS.register("message", () -> new custom(new Item.Properties()));
    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
