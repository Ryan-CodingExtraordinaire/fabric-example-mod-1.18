package net.ryan.firstmod.mixin;

import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.KnockbackEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.ryan.firstmod.item.ModItems;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(KnockbackEnchantment.class)
public class MixinKnockbackEnchantment extends Enchantment {
    protected MixinKnockbackEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
    }
    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        if (stack.getItem() == ModItems.IRON_SPEAR) {  //If the class your checking is not extended by other Items then it's faster to use == on its singleton/ the static instance made when it's registered. Eg. modItem.ModItemOfMine is the singleton.
            return true;
        }
        return super.isAcceptableItem(stack);
    }
}
