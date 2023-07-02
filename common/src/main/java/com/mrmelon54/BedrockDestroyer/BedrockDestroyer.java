package com.mrmelon54.BedrockDestroyer;

import dev.architectury.event.EventResult;
import dev.architectury.event.events.common.BlockEvent;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;

public class BedrockDestroyer {
    public static final String MOD_ID = "bedrock_destroyer";

    public static void init() {
        BlockEvent.PLACE.register((level, pos, state, placer) -> {
            if (placer instanceof Player player && player.getMainHandItem().getItem() == Items.BEDROCK)
                return EventResult.interruptDefault();
            return EventResult.pass();
        });
    }
}
