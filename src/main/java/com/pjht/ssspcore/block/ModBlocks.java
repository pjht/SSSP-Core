package com.pjht.ssspcore.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	public static BlockOre oreCopper = new BlockOre("ore_copper");
	
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				oreCopper
		);
	}
	
	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
				oreCopper.createItemBlock()
		);
	}
	
	public static void registerItemModels() {
		oreCopper.registerItemModel(Item.getItemFromBlock(oreCopper));
	}
}
