package com.pjht.ssspcore;

import com.pjht.ssspcore.block.ModBlocks;
import com.pjht.ssspcore.item.ModItems;
import com.pjht.ssspcore.proxy.CommonProxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = SSSPCore.modId, name = SSSPCore.name, version = SSSPCore.version)
public class SSSPCore {
	public static final String modId = "ssspcore";
	public static final String name = "SSSP core mod";
	public static final String version = "1.0.0";

	@Mod.Instance(modId)
	public static SSSPCore instance;

	@SidedProxy(serverSide = "com.pjht.ssspcore.proxy.CommonProxy", clientSide = "com.pjht.ssspcore.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	public static final SSSPCoreTab creativeTab = new SSSPCoreTab();
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
			ModBlocks.registerItemBlocks(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			ModItems.registerModels();
			ModBlocks.registerItemModels();
		}
		
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			ModBlocks.register(event.getRegistry());
		}
	}
	
}
