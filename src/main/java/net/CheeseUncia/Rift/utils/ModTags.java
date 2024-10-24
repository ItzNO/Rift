package net.CheeseUncia.Rift.utils;

import net.CheeseUncia.Rift.Rift;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> VALID_BLOCKS = createTag("valid_blocks");
        private static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Rift.MODID,name));
        }
    }

    public static class Items {
        public static final TagKey<Item> VALID_ITEMS = createTag("valid_items");
        private static TagKey<Item> createTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Rift.MODID,name));
        }
    }
}
