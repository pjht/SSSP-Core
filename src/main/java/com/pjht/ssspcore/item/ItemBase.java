package com.pjht.ssspcore.item;

import com.pjht.ssspcore.SSSPCore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {
	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(SSSPCore.creativeTab);
	}
	
	public void registerItemModel() {
		SSSPCore.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
	public Boolean isOredict() {
		return false;
	}

	public void initOreDict() {
	}
}
