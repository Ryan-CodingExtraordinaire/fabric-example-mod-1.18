package net.ryan.firstmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.ryan.firstmod.RyansModGeneral;

public class ModEntities {
    public static final EntityType<SpearProjectileEntity> SPEAR_PROJECTILE = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(RyansModGeneral.MOD_ID, "spear_projectile"),
            FabricEntityTypeBuilder.<SpearProjectileEntity>create(SpawnGroup.MISC, SpearProjectileEntity::new).build()
    );

      public static void registerModEntities()
    {
        RyansModGeneral.LOGGER.info("Registering ModEntities for " + RyansModGeneral.MOD_ID);
    }

}
