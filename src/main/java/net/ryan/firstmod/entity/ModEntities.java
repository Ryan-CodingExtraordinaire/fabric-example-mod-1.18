package net.ryan.firstmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.util.registry.Registry;
import net.ryan.firstmod.RyansMod;

public class ModEntities {
    public static final EntityType<ThrownSpearEntity> SPEAR_PROJECTILE = registerSpear(
            "spear_projectile",
            FabricEntityTypeBuilder.<ThrownSpearEntity>create(SpawnGroup.MISC, ThrownSpearEntity::new).build()
    );

    public static <T extends PersistentProjectileEntity> EntityType<T> registerSpear(String name, EntityType<T> entity){
        return Registry.register(Registry.ENTITY_TYPE, RyansMod.MOD_ID, entity);
    }

      public static void registerModEntities()
    {
        RyansMod.LOGGER.info("Registering ModEntities for " + RyansMod.MOD_ID);
    }

}
