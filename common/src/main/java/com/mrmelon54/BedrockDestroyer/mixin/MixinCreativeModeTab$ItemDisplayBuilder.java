package com.mrmelon54.BedrockDestroyer.mixin;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(CreativeModeTab.ItemDisplayBuilder.class)
public class MixinCreativeModeTab$ItemDisplayBuilder {
    @Redirect(method = "accept", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;getCount()I"))
    private int fakeAccept(ItemStack instance) {
        if (instance.getItem() == Items.BEDROCK) return 1;
        return instance.getCount();
    }
}
