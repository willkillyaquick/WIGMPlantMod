package com.wigm.plantmod.receipts;

import com.wigm.plantmod.core.StaticItem;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author Thomas Snyder (willkillyaquick)
 * @version Dec 5, 2014
 *
 */
public class Crafting {
	public static void init() {
		// Bottle Water + GreeTea Leaves = Green Tea
		GameRegistry.addShapelessRecipe(
				new ItemStack(StaticItem.greentea, 1, 0), new ItemStack(
						Items.potionitem, 1, 0), new ItemStack(
						StaticItem.tealeaves, 1, 0));
		// Bottle Water + Black Tea Leaves = Black Tea
		GameRegistry.addShapelessRecipe(
				new ItemStack(StaticItem.blacktea, 1, 0), new ItemStack(
						Items.potionitem, 1, 0), new ItemStack(
						StaticItem.tealeaves, 1, 1));
		// Bottle Water + Orange + Black Tea = Gray Tea
		GameRegistry.addShapelessRecipe(
				new ItemStack(StaticItem.graytea, 1, 0), new ItemStack(
						Items.potionitem, 1, 0), new ItemStack(
						StaticItem.foodStatic, 1, 1), new ItemStack(
						StaticItem.blacktea));
		// Camellia Sinesnsis Flower + Bottle Water + Black Tea = White Tea
		GameRegistry.addShapelessRecipe(
				new ItemStack(StaticItem.whitetea, 1, 0), new ItemStack(
						Items.potionitem, 1, 0), new ItemStack(
						StaticItem.tealeaves, 1, 3), new ItemStack(
						StaticItem.blacktea));
		// Bottle Water + Dried Orange + gray tea = herbal tea
		GameRegistry
				.addShapelessRecipe(new ItemStack(StaticItem.herbaltea, 1, 0),
						new ItemStack(Items.potionitem, 1, 0), new ItemStack(
								StaticItem.foodStatic, 1, 7), new ItemStack(
								StaticItem.graytea));
		// Bottle Water + dried raspberry + gray tea = mate tea
		GameRegistry.addShapelessRecipe(
				new ItemStack(StaticItem.matetea, 1, 0), new ItemStack(
						Items.potionitem, 1, 0), new ItemStack(
						StaticItem.foodStatic, 1, 8), new ItemStack(
						StaticItem.graytea));
		// Bottle Water + Mint leaves + green tea = mint tea
		GameRegistry.addShapelessRecipe(
				new ItemStack(StaticItem.minttea, 1, 0), new ItemStack(
						Items.potionitem, 1, 0), new ItemStack(
						StaticItem.tealeaves, 1, 2), new ItemStack(
						StaticItem.greentea));
		// Bottle Water + Mail Milk + Sugar Lumps + tea leaves = Jolly Tea
		GameRegistry.addShapelessRecipe(
				new ItemStack(StaticItem.jollytea, 1, 0), new ItemStack(
						Items.potionitem, 1, 0), new ItemStack(
						StaticItem.foodStatic, 1, 2), new ItemStack(
						StaticItem.foodStatic, 1, 3), new ItemStack(
						StaticItem.foodStatic, 1, 3), new ItemStack(
						StaticItem.tealeaves, 1, 0));
		// Mail Milk
		GameRegistry.addShapelessRecipe(new ItemStack(StaticItem.foodStatic, 1,
				2), new ItemStack(Items.milk_bucket, 1, 0), new ItemStack(
				Items.paper, 1, 0));
		// Lumps of sugar
		GameRegistry.addRecipe(new ItemStack(StaticItem.foodStatic, 1, 3),
				"XX", "XX", 'X', new ItemStack(Items.sugar));
		// Marshmallows
		GameRegistry.addRecipe(new ItemStack(StaticItem.foodStatic, 1, 4),
				"XX", "XX", "XX", 'X', new ItemStack(Items.sugar));
		// Hot Chocolate marshmallow + cocoa bean + lava + waterbottle = hot
		// chocolate
		GameRegistry.addRecipe(new ItemStack(StaticItem.hotchocolate, 1, 0),
				"m ", "c ", "lw", 'c', new ItemStack(Items.dye, 1, 3), 'l',
				new ItemStack(Items.lava_bucket, 1, 0), 'm', new ItemStack(
						StaticItem.foodStatic, 1, 4), 'w', new ItemStack(
						Items.potionitem, 1, 0));
		// Choclate Bar = 3 Sugar + 6 Coco
		GameRegistry.addRecipe(new ItemStack(StaticItem.foodStatic, 1, 5),
				"CCS", "CCS", "CCS", 'S', Items.sugar, 'C', new ItemStack(
						Items.dye, 1, 3));
		// Gram Cracker 6 wheats
		GameRegistry.addRecipe(new ItemStack(StaticItem.foodStatic, 1, 6),
				"WW", "WW", "WW", 'W', new ItemStack(Items.wheat, 1, 0));
		// Smores = Marshmallow + Chocolate Bar + Gram Cracker + Gram Cracker
		GameRegistry.addRecipe(new ItemStack(StaticItem.smores, 1, 0), "G ",
				"CM", "G ", 'G', new ItemStack(StaticItem.foodStatic, 1, 6),
				'M', new ItemStack(StaticItem.foodStatic, 1, 4), 'C',
				new ItemStack(StaticItem.foodStatic, 1, 5));
		// Gammon Joint = 3 pork + 3 lead
		GameRegistry.addRecipe(new ItemStack(StaticItem.maxfoods, 1, 0), "LP",
				"LP", "LP", 'L', Items.lead, 'P', Items.porkchop);
		// Pig in blanket = 3 porks and 3 bread
		GameRegistry.addRecipe(new ItemStack(StaticItem.maxfoods, 1, 1), "BBB",
				"PPP", 'B', Items.bread, 'P', Items.porkchop);
		// Onion Gravy = 3 Onion + one bowl
		GameRegistry
				.addShapelessRecipe(new ItemStack(StaticItem.maxfoods, 1, 2),
						new ItemStack(StaticItem.foodStatic, 1, 9),
						new ItemStack(StaticItem.foodStatic, 1, 9),
						new ItemStack(StaticItem.foodStatic, 1, 9),
						new ItemStack(Items.bowl));
		// saussage = 3x pork
		GameRegistry.addRecipe(new ItemStack(StaticItem.maxfoods, 1, 3), "SSS",
				'S', Items.porkchop);
		// Toad in the Hole = 3x Saussage + 6x Bread
		GameRegistry.addRecipe(new ItemStack(StaticItem.toadinhole), "BBB",
				"SSS", "BBB", 'S', new ItemStack(StaticItem.maxfoods, 1, 3),
				'B', Items.bread);
		// Bangers and Mash = 3X saussage + 6x Potato
		GameRegistry.addRecipe(new ItemStack(StaticItem.bangersandmash), "PPP",
				"SSS", "PPP", 'S', new ItemStack(StaticItem.maxfoods, 1, 3),
				'P', Items.potato);
		// Spotted Dick = 1 Dried Raspberry, 1 Dried Orange, 7x Bread
		GameRegistry.addRecipe(new ItemStack(StaticItem.spotteddick), "BBB",
				"BRB", "BOB", 'B', Items.bread, 'R', new ItemStack(
						StaticItem.foodStatic, 1, 8), 'O', new ItemStack(
						StaticItem.foodStatic, 1, 7));
		//Bubble and Squeak = 5X Bread, Carrot, Pumpkin, Potato
		GameRegistry.addRecipe(new ItemStack(StaticItem.bubbleandsqueak),"BCB" , "PBP" ,"BJB" ,'B' ,Items.bread ,
				'C', Items.carrot, 'P', Items.potato, 'J', Blocks.pumpkin);
	}
}
