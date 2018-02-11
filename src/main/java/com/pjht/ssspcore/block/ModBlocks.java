package com.pjht.ssspcore.block;

import com.pjht.ssspcore.block.te.counter.BlockCounter;
import com.pjht.ssspcore.block.te.pedestal.BlockPedestal;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	public static BlockOre oreCopper = new BlockOre("ore_copper","oreCopper");
	public static BlockPedestal pedestal = new BlockPedestal();
	public static BlockCounter counter = new BlockCounter();
	
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				oreCopper,
				pedestal
		);
	GameRegistry.registerTileEntity(counter.getTileEntityClass(), counter.getRegistryName().toString());
	GameRegistry.registerTileEntity(pedestal.getTileEntityClass(), pedestal.getRegistryName().toString());
	}
	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
				oreCopper.createItemBlock(),
				pedestal.createItemBlock(),
				counter.createItemBlock()
		);
	}
	
	public static void registerItemModels() {
		oreCopper.registerItemModel(Item.getItemFromBlock(oreCopper));
		pedestal.registerItemModel(Item.getItemFromBlock(pedestal));
		counter.registerItemModel(Item.getItemFromBlock(counter));
	}
}
