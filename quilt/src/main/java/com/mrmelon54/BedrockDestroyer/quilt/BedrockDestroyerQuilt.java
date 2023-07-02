package com.mrmelon54.BedrockDestroyer.quilt;

import com.mrmelon54.BedrockDestroyer.fabriclike.BedrockDestroyerFabricLike;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class BedrockDestroyerQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        BedrockDestroyerFabricLike.init();
    }
}
