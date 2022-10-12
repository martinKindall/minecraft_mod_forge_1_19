package com.codigomorsa.tutorialmod.init;

import com.codigomorsa.tutorialmod.Tutorialmod;
import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ConfigurarFeatureInit {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Tutorialmod.MODID);

    private static final Supplier<List<OreConfiguration.TargetBlockState>> EXAMPLE_OVERWORLD_REPLACE =
            Suppliers.memoize(() -> List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.BOB_SPONGE_BLOCK.get().defaultBlockState()),
                    OreConfiguration.target(new BlockMatchTest(Blocks.IRON_ORE), BlockInit.BOB_SPONGE_BLOCK.get().defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.BOB_SPONGE_BLOCK.get().defaultBlockState())
            ));

    public static final RegistryObject<ConfiguredFeature<?, ?>> BOB_SPONGE_ORE = CONFIGURED_FEATURES.register(
            "bobsponge_ore",
            () -> new ConfiguredFeature<>(
                    Feature.ORE,
                    new OreConfiguration(EXAMPLE_OVERWORLD_REPLACE.get(), 12)
            )
    );
}
