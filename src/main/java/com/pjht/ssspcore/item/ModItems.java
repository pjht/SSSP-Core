package com.pjht.ssspcore.item;


import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	public static Map<String,ItemBase> items = new HashMap<String,ItemBase>();
	
	public static void init() {
		registerItem("silicon_wafer");
		registerOredict("ingot_copper", "ingotCopper");
		registerOredict("raw_silicon","itemSilicon");
		registerFuel("coke","itemCoke", 1000);
	}
	
	public static void register(IForgeRegistry<Item> registry) {
		for (ItemBase item: items.values()) {
		    registry.register(item);
		}
	}
	
	public static void registerModels() {
		for (ItemBase item: items.values()) {
		    item.registerItemModel();
		}
	}
	
	private static void registerItem(String name) { 
		items.put(name, new ItemBase(name));
	}
	
	private static void registerOredict(String name, String oredict) {
		items.put(name, new ItemOre(name,oredict));
	}
	
	private static void registerFuel(String name, String fuelName, int burnTime) {
		items.put(name, new ItemFuel(name, fuelName, burnTime));
	}

	public static void initOreDict() {
		for (ItemBase item: items.values()) {
			if (item.isOredict()) {
				item.initOreDict();
			}
		}
	}
}
