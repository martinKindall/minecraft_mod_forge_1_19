package com.codigomorsa.tutorialmod.init;

import com.codigomorsa.tutorialmod.Tutorialmod;
import com.codigomorsa.tutorialmod.items.Pokeball;
import com.codigomorsa.tutorialmod.items.Varita;
import com.codigomorsa.tutorialmod.items.VaritaHielo;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
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
            "pokeball", () -> new Pokeball(new Item.Properties().tab(CreativeModeTab.TAB_MISC))
    );

    public static final RegistryObject<SwordItem> FIRESWORD = ITEMS.register(
            "firesword", () -> new SwordItem(
                    Tiers.DIAMOND,
                    5,
                    3.5f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT))
    );

    public static final RegistryObject<SwordItem> ICESWORD = ITEMS.register(
            "icesword", () -> new SwordItem(
                    Tiers.NETHERITE,
                    5,
                    3.5f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT))
    );

    public static final RegistryObject<SwordItem> WARHAMMER = ITEMS.register(
            "warhammer", () -> new SwordItem(
                    Tiers.NETHERITE,
                    5,
                    3.5f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT))
    );

    public static final RegistryObject<SwordItem> HACHAHIELO = ITEMS.register(
            "hachahielo", () -> new SwordItem(
                    Tiers.NETHERITE,
                    5,
                    3.5f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
            )
    );

    public static final RegistryObject<Item> VARITA = ITEMS.register(
            "varita", () -> new Varita(new Item.Properties().tab(CreativeModeTab.TAB_MISC))
    );

    public static final RegistryObject<Item> VARITA_HIELO = ITEMS.register(
            "varita_hielo", () -> new VaritaHielo(new Item.Properties().tab(CreativeModeTab.TAB_MISC))
    );

    private static final FoodProperties HERMIT_SEED_PROPS = new FoodProperties.Builder()
            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 600, 3), 1.0f).build();

    private static final FoodProperties HAMBURGUER_PROPS = new FoodProperties.Builder()
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 3), 1.0f).build();

    private static final FoodProperties MUSHROOM_PROPS = new FoodProperties.Builder()
            .effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 600, 3), 1.0f).build();

    private static final FoodProperties FEATHER_PROPS = new FoodProperties.Builder()
            .effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 600, 3), 1.0f).build();

    public static final RegistryObject<Item> HERMIT_SEED = ITEMS.register(
            "hermit_seed", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(HERMIT_SEED_PROPS))
    );

    public static final RegistryObject<Item> HAMBURGER = ITEMS.register(
            "hamburger", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(HAMBURGUER_PROPS))
    );

    public static final RegistryObject<Item> FEATHER = ITEMS.register(
            "feather", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(FEATHER_PROPS))
    );

    public static final RegistryObject<Item> MUSHROOM = ITEMS.register(
            "mushroom_levitate", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(MUSHROOM_PROPS))
    );
}
