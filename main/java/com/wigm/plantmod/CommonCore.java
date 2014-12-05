package com.wigm.plantmod;

import net.minecraftforge.common.MinecraftForge;

import com.wigm.plantmod.core.Bushes;
import com.wigm.plantmod.core.GenerateWorldBlocks;
import com.wigm.plantmod.core.Plants;
import com.wigm.plantmod.core.Seeds;
import com.wigm.plantmod.core.StaticItem;
import com.wigm.plantmod.lib.Constants;
import com.wigm.plantmod.receipts.Crafting;
import com.wigm.plantmod.receipts.Smelting;
import com.wigm.plantmod.util.MessageHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author Thomas Snyder (willkillyaquick)
 * @version 1.1b
 *
 */
@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class CommonCore {
	MessageHelper messageEvents = new MessageHelper(); 
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		StaticItem.init();
		Plants.init();//Seeds Init during plant init
		Plants.register();
		Seeds.register();
		Bushes.init();
		GameRegistry.registerWorldGenerator(new GenerateWorldBlocks(), 8);
		MinecraftForge.EVENT_BUS.register(messageEvents);
		FMLCommonHandler.instance().bus().register(messageEvents);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		Crafting.init();
		Smelting.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
