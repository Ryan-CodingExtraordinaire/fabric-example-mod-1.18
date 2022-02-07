package net.ryan.firstmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.LivingEntity;
import net.ryan.firstmod.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RyansMod implements ModInitializer {
	public static final String MOD_ID = "firstmod";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}

//TODO: change how item is held in json files, see trident stuff for reference.
//TODO: change attack animation for the spear
//TODO: change projectile to a spearEntity.
//TODO: reimplement enchantment behaviour of piercing for Spear projectiles.