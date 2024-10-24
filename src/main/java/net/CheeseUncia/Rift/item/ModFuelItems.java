package net.CheeseUncia.Rift.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

import javax.annotation.Nullable;

public class ModFuelItems extends Item {
    //注册物品若不用此类构造就在neoforge/data_maps/item/furnace_fuels.json里添加burn_time属性
    private int burnTime = 0;

    public ModFuelItems(Properties properties,int burnTime) {
        super(properties);
        this.burnTime = burnTime;
    }

    @Override
    public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType){
        return this.burnTime;
    }
}
