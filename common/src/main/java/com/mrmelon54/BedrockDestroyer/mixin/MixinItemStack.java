package com.mrmelon54.BedrockDestroyer.mixin;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public abstract class MixinItemStack {
    @Shadow
    public abstract Item getItem();

    @Inject(method = "getCount", at = @At("RETURN"), cancellable = true)
    private void safeCount(CallbackInfoReturnable<Integer> cir) {
        if (getItem() == Items.BEDROCK) cir.setReturnValue(0);
    }
}
