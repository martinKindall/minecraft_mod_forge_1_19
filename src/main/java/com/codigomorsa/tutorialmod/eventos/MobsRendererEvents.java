package com.codigomorsa.tutorialmod.eventos;

import com.codigomorsa.tutorialmod.Tutorialmod;
import com.codigomorsa.tutorialmod.client.models.DigletModel;
import com.codigomorsa.tutorialmod.client.renderer.DigletRenderer;
import com.codigomorsa.tutorialmod.init.ModsInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Tutorialmod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MobsRendererEvents {

    @SubscribeEvent
    public static void entityRenders(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModsInit.DIGLET.get(), DigletRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DigletModel.LAYER_LOCATION, DigletModel::createBodyLayer);
    }
}
