package com.pjht.ssspcore.item;


import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	public static ItemOre ingotCopper = new ItemOre("ingot_copper", "ingotCopper");
	public static ItemOre silicon = new ItemOre("silicon","itemSilicon");
	public static ItemFuel coke = new ItemFuel("coke","itemCoke", 1000);
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				ingotCopper,
				silicon,
				coke
		);
	}
	
	public static void registerModels() {
		ingotCopper.registerItemModel();
		silicon.registerItemModel();
		coke.registerItemModel();
	}
}
