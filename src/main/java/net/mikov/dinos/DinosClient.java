package net.mikov.dinos;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.mikov.dinos.entity.ModEntities;
import net.mikov.dinos.entity.client.*;

public class DinosClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.TREX, TrexRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.TREX, TrexModel::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.DODO, DodoRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.DODO, DodoModel::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.COMPY, CompyRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.COMPY, CompyModel::getTexturedModelData);

    }
}
