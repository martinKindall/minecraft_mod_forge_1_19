package com.codigomorsa.tutorialmod.init;

import com.codigomorsa.tutorialmod.Tutorialmod;
import com.codigomorsa.tutorialmod.entities.DigletEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModsInit {

    public static final DeferredRegister<EntityType<?>> MOBS =
            DeferredRegister.create(ForgeRegistries.ENTITIES, Tutorialmod.MODID);

    public static final RegistryObject<EntityType<DigletEntity>> DIGLET =
            MOBS.register("diglet",
                    () -> EntityType.Builder.of(DigletEntity::new, MobCategory.CREATURE)
                            .build(Tutorialmod.MODID + ":diglet"));
}
