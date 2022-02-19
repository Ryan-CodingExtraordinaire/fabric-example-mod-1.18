package net.ryan.firstmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.impl.client.rendering.EntityRendererRegistryImpl;
import net.ryan.firstmod.entity.ModEntities;
import net.ryan.firstmod.entity.SpearEntityRenderer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RyansModClient implements ClientModInitializer {
    public static final String MOD_ID = "firstmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
    public void onInitializeClient() {

        EntityRendererRegistryImpl.register(ModEntities.SPEAR_PROJECTILE, SpearEntityRenderer::new);
    }
}
