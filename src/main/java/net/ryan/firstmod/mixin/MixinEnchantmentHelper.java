package net.ryan.firstmod.mixin;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static net.minecraft.enchantment.EnchantmentTarget.WEAPON;
import static net.minecraft.enchantment.Enchantments.*;
import static net.ryan.firstmod.item.ModItems.IRON_SPEAR;

@Mixin(EnchantmentHelper.class)
public class MixinEnchantmentHelper {

    @Unique
    private static Enchantment currentEnchantment;

    @Redirect(method = "getPossibleEntries", at = @At(value = "INVOKE", target = "Lnet/minecraft/enchantment/Enchantment;isAvailableForRandomSelection()Z"))
    private static boolean isAvailableForRandomSelection(Enchantment enchantment) {
        currentEnchantment = enchantment;

        return enchantment.isAvailableForRandomSelection();
    }


    @Redirect(method = "getPossibleEntries", at = @At(value = "INVOKE", target = "Lnet/minecraft/enchantment/EnchantmentTarget;isAcceptableItem(Lnet/minecraft/item/Item;)Z"))
    private static boolean isAcceptableItem(EnchantmentTarget enchantmentTarget, Item item) {
        ItemStack stack = new ItemStack(item);
        if(item == IRON_SPEAR) { return currentEnchantment.isAcceptableItem(stack); }
        return enchantmentTarget.isAcceptableItem(item);
    }
// If the iron spear is an acceptable item (mixin'ed into each relevant enchantment) then said enchantment becomes available for both primary and secondary enchanting (ie. ench- table and anvil)
// this code here specifically lets the Iron spear be enchanted by the primary method (ench- table)
// currently all secondary enchantments also become primary.
// to add other primary enchantment option (by not adding secondary ones) just add a 'or' statement in the if return. eg. return currentEnchantment.isAcceptableItem(stack) || currentEnchantment == PROTECTION
}