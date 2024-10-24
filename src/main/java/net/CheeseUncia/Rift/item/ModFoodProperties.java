package net.CheeseUncia.Rift.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties FOOD = new FoodProperties.Builder().nutrition(3).alwaysEdible()
            .effect(()->new MobEffectInstance(MobEffects.ABSORPTION,200,1),0.2f).build();
}
