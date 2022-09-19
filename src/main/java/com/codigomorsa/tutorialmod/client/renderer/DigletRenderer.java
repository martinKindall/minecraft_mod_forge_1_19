package com.codigomorsa.tutorialmod.client.renderer;

import com.codigomorsa.tutorialmod.Tutorialmod;
import com.codigomorsa.tutorialmod.client.models.DigletModel;
import com.codigomorsa.tutorialmod.entities.DigletEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DigletRenderer extends MobRenderer<DigletEntity, DigletModel> {

    private static final ResourceLocation TEXTURE =
            new ResourceLocation(Tutorialmod.MODID, "textures/entities/diglet.png");

    public DigletRenderer(EntityRendererProvider.Context context) {
        super(context, new DigletModel(context.bakeLayer(DigletModel.LAYER_LOCATION)), 0.25f);
    }

    @Override
    public ResourceLocation getTextureLocation(DigletEntity p_114482_) {
        return TEXTURE;
    }
}
