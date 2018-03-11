package com.pjht.ssspcore.item;


import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	public static ItemOre ingotCopper = new ItemOre("ingot_copper", "ingotCopper");
	public static ItemOre rawSilicon = new ItemOre("raw_silicon","itemSilicon");
	public static ItemBase siliconWafer = new ItemBase("silicon_wafer");
	public static ItemFuel coke = new ItemFuel("coke","itemCoke", 1000);
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				ingotCopper,
				rawSilicon,
				siliconWafer,
				coke
		);
	}
	
	public static void registerModels() {
		ingotCopper.registerItemModel();
		rawSilicon.registerItemModel();
		siliconWafer.registerItemModel();
		coke.registerItemModel();
	}
}
