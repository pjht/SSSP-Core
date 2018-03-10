package com.pjht.ssspcore;

import com.pjht.ssspcore.block.ModBlocks;
import com.pjht.ssspcore.item.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 0.7f);
		GameRegistry.addSmelting(Blocks.SAND, new ItemStack(ModItems.silicon), 0.7f);
	}
}
