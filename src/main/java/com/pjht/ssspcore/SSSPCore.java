package com.pjht.ssspcore;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SSSPCore.modId, name = SSSPCore.name, version = SSSPCore.version)
public class SSSPCore {
	public static final String modId = "sssp-core";
	public static final String name = "SSSP core mod";
	public static final String version = "1.0.0";

	@Mod.Instance(modId)
	public static SSSPCore instance;

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


}
