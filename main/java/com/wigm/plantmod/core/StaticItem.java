package com.wigm.plantmod.core;

import net.minecraft.potion.Potion;

import com.wigm.plantmod.items.Food;
import com.wigm.plantmod.items.TeaLeaves;
import com.wigm.plantmod.items.Teas;
import com.wigm.plantmod.lib.Constants;
import com.wigm.plantmod.util.PotionHelper;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author Thomas Snyder (willkillyaquick)
 * @version Dec 5, 2014
 *
 */
public class StaticItem {
	public static TeaLeaves tealeaves;
	public static Food foodStatic;
	public static Food maxfoods;

	public static Teas greentea;
	public static Teas graytea;
	public static Teas blacktea;
	public static Teas whitetea;
	public static Teas minttea;
	public static Teas matetea;
	public static Teas herbaltea;
	public static Teas jollytea;
	public static Teas hotchocolate;
	public static Teas smores;
	public static Teas toadinhole;
	public static Teas bangersandmash;
	public static Teas spotteddick;
	public static Teas bubbleandsqueak;
	// Create Leaves
	private static String[] leaves = { Constants.TEALEAVES,
			Constants.BLACKTEALEAVES, Constants.MINTLEAVES,
			Constants.CAMSINFLOWER };

	// Creates food
	private static String[] food = { Constants.RASPBERRY, Constants.ORANGE,
			Constants.MAILMILK, Constants.SUGARLUMPS, Constants.MARSHMALLOW,
			Constants.CHOCOLATEBAR, Constants.GRAMCRACKER,
			Constants.DRIEDORANGE, Constants.DRIEDRAPBERRY, Constants.ONION };
	private static String[] maxfood = { Constants.GAMMONJOINT,
			Constants.PIGINBLANKET, Constants.ONIONGRAVY, Constants.SAUSSAGE };

	// Create Tea Potion
	private static PotionHelper greenteaPotion = new PotionHelper(
			Potion.moveSpeed.id, 15, 0, 1F);
	private static PotionHelper grayteapotion = new PotionHelper(
			Potion.moveSpeed.id, 15, 0, 1F, Potion.digSpeed.id, 30, 1, 1F);
	private static PotionHelper whiteteapotion = new PotionHelper(
			Potion.moveSpeed.id, 30, 1, 1F, Potion.digSpeed.id, 60, 2, 1F,
			Potion.heal.id, 20, 0, 1F, Potion.resistance.id, 20, 1, 1F);
	private static PotionHelper blackteapotion = new PotionHelper(
			Potion.digSpeed.id, 20, 1, 1F);
	private static PotionHelper mintteapotion = new PotionHelper(
			Potion.jump.id, 20, 2, 1F, Potion.resistance.id, 20, 1, 1F);
	private static PotionHelper mateteapotion = new PotionHelper(
			Potion.digSpeed.id, 60, 2, 1F, Potion.jump.id, 60, 2, 1F);
	private static PotionHelper herbalteapotion = new PotionHelper(
			Potion.regeneration.id, 40, 2, 1F, Potion.jump.id, 40, 3, 1F);
	private static PotionHelper jollyteahelper = new PotionHelper(
			Potion.digSpeed.id, 60, 6, 1F, Potion.moveSpeed.id, 60, 20, 1F,
			Potion.heal.id, 60, 5, 1F, Potion.resistance.id, 60, 5, 1F,
			Potion.jump.id, 60, 20, 1F);
	private static PotionHelper hotchocolatepotion = new PotionHelper(
			Potion.fireResistance.id, 60, 1, 1F);
	private static PotionHelper smorespotion = new PotionHelper(
			Potion.nightVision.id, 30, 1, 0.5F);
	private static PotionHelper toadinholepotion = new PotionHelper(
			Potion.damageBoost.id, 30, 1, 1.0F);
	private static PotionHelper bangersandmashpotion = new PotionHelper(
			Potion.heal.id, 30, 1, 1.0F);
	private static PotionHelper spotteddickpotion = new PotionHelper(
			Potion.waterBreathing.id, 30, 1, 1.0F);
	private static PotionHelper bubbleandsqueakpotion = new PotionHelper(
			Potion.waterBreathing.id, 60, 1, 1F, Potion.damageBoost.id, 30, 2,
			1F);

	public static void init() {
		tealeaves = new TeaLeaves(leaves);
		GameRegistry.registerItem(tealeaves, "leaves");
		// Foods
		foodStatic = new Food(3, 1F, false, food);
		GameRegistry.registerItem(foodStatic, "food");
		// MaxFoods
		maxfoods = new Food(10, 1F, false, maxfood);
		GameRegistry.registerItem(maxfoods, "maxfood");
		// Adds Teas
		greentea = new Teas(0, 1F, false, Constants.GREENTEA, greenteaPotion);
		GameRegistry.registerItem(greentea, Constants.GREENTEA);

		graytea = new Teas(0, 1F, false, Constants.GRAYTEA, grayteapotion);
		GameRegistry.registerItem(graytea, Constants.GRAYTEA);

		whitetea = new Teas(0, 1F, false, Constants.WHITETEA, whiteteapotion);
		GameRegistry.registerItem(whitetea, Constants.WHITETEA);

		blacktea = new Teas(0, 1F, false, Constants.BLACKTEA, blackteapotion);
		GameRegistry.registerItem(blacktea, Constants.BLACKTEA);

		minttea = new Teas(0, 1F, false, Constants.MINTTEA, mintteapotion);
		GameRegistry.registerItem(minttea, Constants.MINTTEA);

		matetea = new Teas(0, 1F, false, Constants.MATETEA, mateteapotion);
		GameRegistry.registerItem(matetea, Constants.MATETEA);

		herbaltea = new Teas(0, 1F, false, Constants.HERBALTEA, herbalteapotion);
		GameRegistry.registerItem(herbaltea, Constants.HERBALTEA);

		jollytea = new Teas(0, 1F, false, Constants.JOLLYTEA, jollyteahelper);
		GameRegistry.registerItem(jollytea, Constants.JOLLYTEA);

		hotchocolate = new Teas(3, 1F, false, Constants.HOTCHOCOLATE,
				hotchocolatepotion);
		GameRegistry.registerItem(hotchocolate, Constants.HOTCHOCOLATE);

		smores = new Teas(3, 1F, false, Constants.SMORES, smorespotion);
		GameRegistry.registerItem(smores, Constants.SMORES);

		toadinhole = new Teas(4, 1.0F, false, Constants.TOADINHOLE,
				toadinholepotion);
		GameRegistry.registerItem(toadinhole, Constants.TOADINHOLE);

		bangersandmash = new Teas(4, 1.0F, false, Constants.BANGERSANDMASH,
				bangersandmashpotion);
		GameRegistry.registerItem(bangersandmash, Constants.BANGERSANDMASH);

		spotteddick = new Teas(6, 1.0F, false, Constants.SPOTTEDDICK,
				spotteddickpotion);
		GameRegistry.registerItem(spotteddick, Constants.SPOTTEDDICK);
		
		bubbleandsqueak = new Teas(6, 1.0F, false, Constants.BUBBLEANDSQUEAK, bubbleandsqueakpotion);
		GameRegistry.registerItem(bubbleandsqueak, Constants.BUBBLEANDSQUEAK);

	}
}
