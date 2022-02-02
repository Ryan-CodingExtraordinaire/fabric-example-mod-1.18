package net.ryan.firstmod.mixin;

import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.LoyaltyEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.ryan.firstmod.item.ModItems;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(LoyaltyEnchantment.class)
public class MixinLoyaltyEnchantment extends Enchantment {
    protected MixinLoyaltyEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
    }
    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        if (stack.getItem() == ModItems.IRON_SPEAR) {
            return true;
        }
        return super.isAcceptableItem(stack);
    }
}
