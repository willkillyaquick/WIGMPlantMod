package com.wigm.plantmod.core;

import com.wigm.plantmod.bushes.Bush;
import com.wigm.plantmod.lib.Constants;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author Thomas Snyder (willkillyaquick)
 * @version Nov 12, 2014
 *
 */
public class Bushes {
	public static Bush teabush;
	public static Bush raspberrybush;
	public static Bush mintbush;
	public static Bush orangebush;
	public static Bush onionbush;

	public static void init() {
		teabush = new Bush(Constants.TEABUSH, 0F, 0F, 0F, 1F, 1F, 1F, 0.1F, 1,
				StaticItem.tealeaves, 0, Seeds.teaseed, StaticItem.tealeaves, 3);
		GameRegistry.registerBlock(teabush, Constants.TEABUSH);

		raspberrybush = new Bush(Constants.RASPBERRYBUSH, 0F, 0F, 0F, 1F, 1F,
				1F, 0.1F, 1, StaticItem.foodStatic, 0, Seeds.raspberryseed, StaticItem.tealeaves, 1);
		GameRegistry.registerBlock(raspberrybush, Constants.RASPBERRYBUSH);

		mintbush = new Bush(Constants.MINTBUSH, 0F, 0F, 0F, 1F, 1F, 1F, 0.1F,
				1, StaticItem.tealeaves, 2 ,Seeds.mintseed, StaticItem.tealeaves, 2);
		GameRegistry.registerBlock(mintbush, Constants.MINTBUSH);
		
		orangebush = new Bush(Constants.ORANGEBUSH, 0F, 0F, 0F, 1F, 1F, 1F, 0.1F,
				1, StaticItem.foodStatic, 1, Seeds.orangeseed, StaticItem.foodStatic, 1);
		GameRegistry.registerBlock(orangebush, Constants.ORANGEBUSH);
		
		onionbush = new Bush(Constants.ONIONBUSH, 0F, 0F, 0F, 1F, 1F, 1F,
				0F, 1, StaticItem.foodStatic, 9, Seeds.onionseed,
				StaticItem.foodStatic, 9);
		GameRegistry.registerBlock(onionbush, Constants.ONIONBUSH);
	}
}
