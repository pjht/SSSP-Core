package com.pjht.ssspcore;

import com.pjht.ssspcore.block.ModBlocks;
import com.pjht.ssspcore.item.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.blocks.get("oreCopper"), new ItemStack(ModItems.items.get("ingotCopper")), 0.7f);
	}
}
