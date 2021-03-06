package net.ryan.firstmod;

import net.fabricmc.api.ModInitializer;
import net.ryan.firstmod.entity.ModEntities;
import net.ryan.firstmod.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RyansModGeneral implements ModInitializer {
	public static final String MOD_ID = "firstmod";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModEntities.registerModEntities();
	}
}

//TODO: change how item is held in json files, see trident stuff for reference.
//TODO: change attack animation for the spear
//TODO: change projectile to a spearEntity.
//TODO: reimplement enchantment behaviour of piercing for Spear projectiles.