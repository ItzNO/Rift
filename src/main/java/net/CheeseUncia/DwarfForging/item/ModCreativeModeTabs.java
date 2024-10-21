package net.CheeseUncia.DwarfForging.item;

import net.CheeseUncia.DwarfForging.DwarfForging;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS_DEFERRED_REGISTER =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DwarfForging.MODID);

    public static final Supplier<CreativeModeTab> DWARF_FORGE= CREATIVE_MODE_TABS_DEFERRED_REGISTER.register("dwarf_forging",
            ()-> CreativeModeTab.builder().icon(()->new ItemStack(ModItems.CHALK.get()))
                    .title(Component.translatable("key"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CHALK);
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS_DEFERRED_REGISTER.register(eventBus);
    }
}
