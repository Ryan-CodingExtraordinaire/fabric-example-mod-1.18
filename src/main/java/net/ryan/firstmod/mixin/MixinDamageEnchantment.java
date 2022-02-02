package net.ryan.firstmod.mixin;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.item.ItemStack;
import net.ryan.firstmod.item.ModItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DamageEnchantment.class)
public class MixinDamageEnchantment {
    @Inject(method = "isAcceptableItem", at = @At(value = "HEAD"), cancellable = true)
    private void isAcceptableItem(ItemStack stack, CallbackInfoReturnable<Boolean> cir){
        if(stack.getItem() == ModItems.IRON_SPEAR) {
            cir.setReturnValue(Boolean.TRUE);
        }
    }
}
