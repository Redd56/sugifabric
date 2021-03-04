package net.Redd56.sugifabric;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ClientMain implements ClientModInitializer{

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(Main.LEAVES_FALLEN_SUGI, RenderLayer.getTranslucent());
    }
}
