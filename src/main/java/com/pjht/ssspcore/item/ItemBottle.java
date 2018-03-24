package com.pjht.ssspcore.item;

import net.minecraft.init.Items;

public class ItemBottle extends ItemBase {

    public ItemBottle(String name) {
        super(name);
        this.setContainerItem(Items.GLASS_BOTTLE);
    }
}
