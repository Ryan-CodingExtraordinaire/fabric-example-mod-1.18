package net.ryan.firstmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.ryan.firstmod.RyansMod;

public class ModEntities {
    public static final EntityType<ThrownSpearEntity> SPEAR_PROJECTILE = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(RyansMod.MOD_ID, "mod_projectile"),
            FabricEntityTypeBuilder.<ThrownSpearEntity>create(SpawnGroup.MISC, ThrownSpearEntity::new).build()
    );

      public static void registerModEntities()
    {
        RyansMod.LOGGER.info("Registering ModEntities for " + RyansMod.MOD_ID);
    }

}
