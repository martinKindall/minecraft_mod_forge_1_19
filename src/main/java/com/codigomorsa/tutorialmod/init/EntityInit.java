package com.codigomorsa.tutorialmod.init;

import com.codigomorsa.tutorialmod.Tutorialmod;
import com.codigomorsa.tutorialmod.entities.MorsaEntity;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class EntityInit {

    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITIES , Tutorialmod.MODID);

    public static final RegistryObject<EntityType<MorsaEntity>> MORSA =
            ENTITIES.register("morsa", () -> EntityType.Builder.of(MorsaEntity::new, MobCategory.CREATURE).build(Tutorialmod.MODID + ":morsa"));
}
