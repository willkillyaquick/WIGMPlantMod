package com.wigm.plantmod.core;

import com.wigm.plantmod.items.Seed;
import com.wigm.plantmod.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author Thomas Snyder (willkillyaquick)
 * @version Nov 12, 2014
 *
 */
public class Seeds {

	public static Seed teaseed;
	public static Seed raspberryseed;
	public static Seed mintseed;
	public static Seed orangeseed;
	public static Seed onionseed;

	public static void init() {
		teaseed = new Seed(Constants.TEASEED);
		raspberryseed = new Seed(Constants.RASPBERRYSEED);
		mintseed = new Seed(Constants.MINTSEED);
		orangeseed = new Seed(Constants.ORANGESEED);
		onionseed = new Seed(Constants.ONIONSEED);
	}
	
	public static void addPlants(){
		teaseed.setPlant(Plants.teaplant);
		raspberryseed.setPlant(Plants.raspberryplant);
		mintseed.setPlant(Plants.mintplant);
		orangeseed.setPlant(Plants.orangeplant);
		onionseed.setPlant(Plants.onionplant);
	}
	
	public static void register(){
		GameRegistry.registerItem(teaseed, Constants.TEASEED);
		GameRegistry.registerItem(raspberryseed, Constants.RASPBERRYSEED);
		GameRegistry.registerItem(mintseed, Constants.MINTSEED);
		GameRegistry.registerItem(orangeseed, Constants.ORANGESEED);
		GameRegistry.registerItem(onionseed, Constants.ONIONSEED);
	}
}
