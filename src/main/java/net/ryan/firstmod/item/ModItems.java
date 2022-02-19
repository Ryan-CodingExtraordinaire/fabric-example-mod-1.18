package net.ryan.firstmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.ryan.firstmod.RyansModGeneral;

public class ModItems {

    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item IRON_SPEAR = registerItem("iron_spear",
            new ModSpearItem(ToolMaterials.IRON, 1, -0.4f, new FabricItemSettings().group(ItemGroup.COMBAT)));


    public static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(RyansModGeneral.MOD_ID, name), item);
    }
    public static void registerModItems() {
        RyansModGeneral.LOGGER.info("Registering Mod Items for"+ RyansModGeneral.MOD_ID);
    }

}
