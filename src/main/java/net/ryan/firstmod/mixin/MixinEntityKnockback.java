package net.ryan.firstmod.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import net.ryan.firstmod.item.ModItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

import java.util.function.Predicate;


@Mixin(LivingEntity.class)
public abstract class MixinEntityKnockback {
    @ModifyArgs(method = "damage", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;takeKnockback(DDD)V"))
    public void onTakeKnockback(Args args, DamageSource source, float amount){
        final double BASE_KNOCKBACK = 0.4;  //BASE_KNOCKBACK is the hardcoded value in the original takeKnockback method call
        double knockbackStrength = BASE_KNOCKBACK;
        Entity antagoniser = source.getSource();
        if(antagoniser instanceof LivingEntity){ //living entity, so it should work for mobs wielding item (untested)
            Predicate<ItemStack> ModSpearItem;
            if(((LivingEntity) antagoniser).isHolding(ModItems.IRON_SPEAR)) {
                knockbackStrength = 0.1;
            }


        }
        args.set(0, knockbackStrength);
    }
}

