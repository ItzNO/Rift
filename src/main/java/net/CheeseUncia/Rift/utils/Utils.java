package net.CheeseUncia.Rift.utils;

import net.minecraft.network.chat.contents.NbtContents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class Utils {
    public static boolean isValidItem(ItemStack item) {
        return item.is(ModTags.Items.VALID_ITEMS);
    }

}
