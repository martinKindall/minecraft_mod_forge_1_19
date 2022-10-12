package com.codigomorsa.tutorialmod.init;

import com.codigomorsa.tutorialmod.Tutorialmod;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ColocarFeatureInit {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURE =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Tutorialmod.MODID);

    public static final RegistryObject<PlacedFeature> SPONGEBOB_ORE = PLACED_FEATURE.register(
            "bobsponge_ore",
            () -> new PlacedFeature(ConfigurarFeatureInit.BOB_SPONGE_ORE.getHolder().get(),
                    commonOrePlacement(100, HeightRangePlacement.triangle(
                            VerticalAnchor.bottom(),
                            VerticalAnchor.absolute(80)
                    )))
    );

    private static List<PlacementModifier> commonOrePlacement(int countPerChunk, PlacementModifier height) {
        return List.of(CountPlacement.of(countPerChunk), InSquarePlacement.spread(), height, BiomeFilter.biome());
    }
}
