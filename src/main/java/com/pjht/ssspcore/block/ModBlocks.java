package com.pjht.ssspcore.block;

import java.util.HashMap;
import java.util.Map;

import com.pjht.ssspcore.block.te.BlockTileEntity;
import com.pjht.ssspcore.block.te.counter.BlockCounter;
import com.pjht.ssspcore.block.te.pedestal.BlockPedestal;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	public static Map<String,BlockBase> blocks = new HashMap<String,BlockBase>();
	
	public static void init() {
		registerOre("ore_copper","oreCopper");
		registerTileEntity("pedestal", new BlockPedestal());
		registerOre("salt_ore","saltOre");
		//NEXT BLOCK HERE
		//NEXT BLOCK HERE
		//NEXT BLOCK HERE
	}
	
	public static void register(IForgeRegistry<Block> registry) {
		for (BlockBase block: blocks.values()) {
			registry.register(block);
			if (block.isTileEntity()) {
				GameRegistry.registerTileEntity(block.getTileEntityClass(), block.getRegistryName().toString());
			}
		}
	}
	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		for (BlockBase block: blocks.values()) {
			registry.register(block.createItemBlock());
		}
	}
	
	public static void registerItemModels() {
		for (BlockBase block: blocks.values()) {
			block.registerItemModel(Item.getItemFromBlock(block));
		}
	}
	
	private static void registerBlock(Material material, String name) {
		blocks.put(name,  new BlockBase(material, name));
	}
	
	private static void registerOre(String name, String oredict) {
		blocks.put(name, new BlockOre(name, oredict));
	}
	
	private static void registerTileEntity(String name, BlockTileEntity te) {
		blocks.put(name, te);
	}

	public static void initOreDict() {
		for (BlockBase block: blocks.values()) {
			if (block.isOredict()) {
				block.initOreDict();
			}
		}
	}
}