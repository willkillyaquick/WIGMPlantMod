package com.wigm.plantmod.receipts;

import net.minecraft.item.ItemStack;

import com.wigm.plantmod.core.StaticItem;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author Thomas Snyder (willkillyaquick)
 * @version Nov 12, 2014
 *
 */
public class Smelting {
	public static void init(){
		//Bakes green tea to black tea leaves
		GameRegistry.addSmelting(new ItemStack(StaticItem.tealeaves, 1, 0), new ItemStack(StaticItem.tealeaves, 1, 1), 0F);
		GameRegistry.addSmelting(new ItemStack(StaticItem.foodStatic, 1, 1), new ItemStack(StaticItem.foodStatic, 1, 7), 0.1F);
		GameRegistry.addSmelting(new ItemStack(StaticItem.foodStatic, 1, 0), new ItemStack(StaticItem.foodStatic, 1, 8), 0.1F);
	}
}
