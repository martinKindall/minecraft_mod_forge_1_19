package com.codigomorsa.tutorialmod.init;

import com.codigomorsa.tutorialmod.Tutorialmod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, Tutorialmod.MODID
    );

    public static final RegistryObject<Item> RAMEN = ITEMS.register(
            "ramen", () -> new Item(new Item.Properties()
                    .tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().alwaysEat().build())
            )
    );

    public static final RegistryObject<Item> YOSHI_EGG = ITEMS.register(
            "yoshi_egg", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC))
    );

    public static final RegistryObject<Item> POKEBALL = ITEMS.register(
            "pokeball", () -> new ThrowablePotionItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC))
    );

    public static final RegistryObject<SwordItem> FIRESWORD = ITEMS.register(
            "firesword", () -> new SwordItem(
                    Tiers.DIAMOND,
                    5,
                    3.5f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT))
    );
}
