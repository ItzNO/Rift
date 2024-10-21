package net.CheeseUncia.DwarfForging.block;

import net.CheeseUncia.DwarfForging.DwarfForging;
import net.CheeseUncia.DwarfForging.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    //创建BLOCKS
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(DwarfForging.MODID);


    //block_id需要全部小写,BLOCK命名建议全大写
    //注册物品
    //()->new Block(BlockBehaviour.Properties.of. + 返回值为Properties类的方法，可连续)
    //public static final DeferredBlock<Block> BLOCK = registerBlock("block_id",
    //        ()->new Block(BlockBehaviour.Properties.of()
    //        基础属性
    //        .destroyTime(2.0f)
    //        .explosionResistance(10.0f)
    //        .sound(SoundType.GRAVEL)
    //        .lightLevel(state -> 7));
    //需要在主函数中对应创造物品栏accept

    //注册方块及方块物品
    public static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlock(name, toReturn);
        return toReturn;
    }

    //注册方块物品(物品栏中的方块)
    public static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name,()->new BlockItem(block.get(),new Item.Properties()));
    }

    //将BLOCKS注册入总线
    public static void register(IEventBus bus){
        BLOCKS.register(bus);
    }
}
