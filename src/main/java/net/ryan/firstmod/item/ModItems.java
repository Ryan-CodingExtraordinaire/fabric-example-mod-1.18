package net.ryan.firstmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.ryan.firstmod.RyansMod;

public class ModItems {

    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(RyansMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        RyansMod.LOGGER.info("Registering Mod Items for"+RyansMod.MOD_ID);
    }

}
