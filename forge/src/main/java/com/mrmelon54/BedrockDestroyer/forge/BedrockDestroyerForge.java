package com.mrmelon54.BedrockDestroyer.forge;

import dev.architectury.platform.forge.EventBuses;
import com.mrmelon54.BedrockDestroyer.BedrockDestroyer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BedrockDestroyer.MOD_ID)
public class BedrockDestroyerForge {
    public BedrockDestroyerForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(BedrockDestroyer.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        BedrockDestroyer.init();
    }
}
