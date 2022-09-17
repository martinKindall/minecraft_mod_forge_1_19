package com.codigomorsa.tutorialmod.client.renderer;

import com.codigomorsa.tutorialmod.Tutorialmod;
import com.codigomorsa.tutorialmod.client.models.MorsaModel;
import com.codigomorsa.tutorialmod.entities.MorsaEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;


public class MorsaEntityRenderer extends MobRenderer<MorsaEntity, MorsaModel> {

    private static final ResourceLocation TEXTURE =
            new ResourceLocation(Tutorialmod.MODID, "textures/entities/morsa.png");

    public MorsaEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new MorsaModel(context.bakeLayer(MorsaModel.LAYER_LOCATION)), 0.25f);
    }

    @Override
    public ResourceLocation getTextureLocation(MorsaEntity p_114482_) {
        return TEXTURE;
    }
}
