package com.wigm.plantmod.core;

import com.wigm.plantmod.lib.Constants;
import com.wigm.plantmod.plants.Plant;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author Thomas Snyder (willkillyaquick)
 * @version Nov 12, 2014
 *
 */
public class Plants {
	public static Plant teaplant;
	public static Plant raspberryplant;
	public static Plant mintplant;
	public static Plant orangeplant;
	public static Plant onionplant;

	public static void init() {
		Seeds.init();
		teaplant = new Plant(Constants.TEAPLANT, 0F, 0F, 0F, 1F, 1F, 1F, 0F, 1,
				StaticItem.tealeaves, 0, Seeds.teaseed, Seeds.teaseed, 0);

		raspberryplant = new Plant(Constants.RASPBERRYPLANT, 0F, 0F, 0F, 1F,
				1F, 1F, 0F, 1, StaticItem.foodStatic, 0, Seeds.raspberryseed,
				Seeds.raspberryseed, 0);

		mintplant = new Plant(Constants.MINTPLANT, 0F, 0F, 0F, 1F, 1F, 1F, 0F,
				1, StaticItem.tealeaves, 2, Seeds.mintseed, Seeds.mintseed, 0);

		orangeplant = new Plant(Constants.ORANGEPLANT, 0F, 0F, 0F, 1F, 1F, 1F,
				0F, 1, StaticItem.foodStatic, 1, Seeds.orangeseed,
				Seeds.orangeseed, 0);
		onionplant = new Plant(Constants.ONIONPLANT, 0F, 0F, 0F, 1F, 1F, 1F,
				0F, 1, StaticItem.foodStatic, 9, Seeds.onionseed,
				StaticItem.foodStatic, 9);
		Seeds.addPlants();
	}

	public static void register() {
		GameRegistry.registerBlock(teaplant, Constants.TEAPLANT);
		GameRegistry.registerBlock(raspberryplant, Constants.RASPBERRYPLANT);
		GameRegistry.registerBlock(mintplant, Constants.MINTPLANT);
		GameRegistry.registerBlock(orangeplant, Constants.ORANGEPLANT);
		GameRegistry.registerBlock(onionplant, Constants.ONIONPLANT);
	}
}
