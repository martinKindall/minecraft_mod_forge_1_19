package com.codigomorsa.tutorialmod.init;

import com.codigomorsa.tutorialmod.Tutorialmod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Tutorialmod.MODID);

    public static final RegistryObject<Block> EXAMPLE_BLOCK = register("example_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).friction(0.5f)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    private static <T extends Block> RegistryObject<T> register(
            String name,
            Supplier<T> supplier,
            Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
}