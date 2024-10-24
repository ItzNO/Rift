package net.CheeseUncia.Rift.item;

import net.CheeseUncia.Rift.Rift;
import net.CheeseUncia.Rift.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS_DEFERRED_REGISTER =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Rift.MODID);

    public static final Supplier<CreativeModeTab> DWARF_FORGE= CREATIVE_MODE_TABS_DEFERRED_REGISTER.register("dwarf_forging",
            ()-> CreativeModeTab.builder().icon(()->new ItemStack(ModItems.CHALK.get()))
                    .title(Component.translatable("key"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CHALK);
                        output.accept(ModBlocks.CHALK_BLOCK);
                        output.accept(ModItems.JUDGEMENT_CORE);
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS_DEFERRED_REGISTER.register(eventBus);
    }
}
