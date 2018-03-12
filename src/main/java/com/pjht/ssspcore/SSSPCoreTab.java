package com.pjht.ssspcore;

import com.pjht.ssspcore.item.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SSSPCoreTab extends CreativeTabs {

	public SSSPCoreTab() {
		super(SSSPCore.modId);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.items.get("ingot_copper"));
	}


}
