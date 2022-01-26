package net.ryan.firstmod.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.ryan.firstmod.item.ModSpearItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import static net.ryan.firstmod.item.ModItems.IRON_SPEAR;


@SuppressWarnings({"UnusedMixin", "unused", "SpellCheckingInspection"})
    @Mixin(LivingEntity.class)
    public abstract class MixinKnockback extends LivingEntity {

    protected MixinKnockback(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @ModifyVariable(method = "takeKnockback", at = @At(value = "HEAD"), ordinal = 0, argsOnly = true)
    public double onTakeKnockback(double strength) {
        LivingEntity agressor = getAttacker();
        System.out.println(agressor.getName());
        if (agressor.isHolding(IRON_SPEAR) ) {
            System.out.println("Iron Spear used");
            return 0;
        }

        else{
            return 2;
        }
    }
}
