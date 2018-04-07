package com.pjht.ssspcore;

import com.pjht.ssspcore.block.te.pedestal.ContainerPedestal;
import com.pjht.ssspcore.block.te.pedestal.GuiPedestal;
import com.pjht.ssspcore.block.te.pedestal.TileEntityPedestal;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class ModGuiHandler implements IGuiHandler {
    public static final int PEDESTAL = 0;
    
    public static void init() {
        NetworkRegistry.INSTANCE.registerGuiHandler(SSSPCore.instance, new ModGuiHandler());
    }
    
    @Override
    public Container getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case PEDESTAL:
                return new ContainerPedestal(player.inventory, (TileEntityPedestal)world.getTileEntity(new BlockPos(x, y, z)));
            default:
                return null;
        }
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case PEDESTAL:
                return new GuiPedestal(getServerGuiElement(ID, player, world, x, y, z), player.inventory);
            default:
                return null;
        }
    }

}
