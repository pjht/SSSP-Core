package com.pjht.ssspcore.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	public static BlockOre oreCopper = new BlockOre("ore_copper","oreCopper");
	public static BlockPedestal pedestal = new BlockPedestal();
	
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				oreCopper,
				pedestal
		);
	}
	
	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
				oreCopper.createItemBlock(),
				pedestal.createItemBlock()
		);
	}
	
	public static void registerItemModels() {
		oreCopper.registerItemModel(Item.getItemFromBlock(oreCopper));
		pedestal.registerItemModel(Item.getItemFromBlock(pedestal));
	}
}
