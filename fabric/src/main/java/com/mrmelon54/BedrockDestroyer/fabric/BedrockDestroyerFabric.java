package com.mrmelon54.BedrockDestroyer.fabric;

import com.mrmelon54.BedrockDestroyer.fabriclike.BedrockDestroyerFabricLike;
import net.fabricmc.api.ModInitializer;

public class BedrockDestroyerFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        BedrockDestroyerFabricLike.init();
    }
}
