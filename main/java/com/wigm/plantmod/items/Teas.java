package com.wigm.plantmod.items;

import com.wigm.plantmod.lib.Constants;
import com.wigm.plantmod.util.PotionHelper;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * @author Thomas Snyder (willkillyaquick)
 * @version Nov 12, 2014
 *
 */
public class Teas extends ItemFood {
	private PotionHelper potion1;
	public Teas(int food, float saturation, boolean wolfFood, String name) {
		super(food, saturation, wolfFood);
		setUnlocalizedName(Constants.MODID + "." + name);
		setTextureName(Constants.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabFood);
		setAlwaysEdible();
	}

	public Teas(int heal, float saturation, boolean wolfFood, String name,
			PotionHelper potion1) {
		super(heal, saturation, wolfFood);
		this.potion1 = potion1;
		setPotionEffect(potion1.id1, potion1.duration1, potion1.amplifer1,
				potion1.probability1);
		setTextureName(Constants.MODID + ":" + name);
		setUnlocalizedName(Constants.MODID + "." + name);
		setCreativeTab(CreativeTabs.tabFood);
		setAlwaysEdible();
	}

	@Override
	protected void onFoodEaten(ItemStack item, World world, EntityPlayer player) {
		super.onFoodEaten(item, world, player);
		if (!world.isRemote && this.potion1.id1 > 0
				&& world.rand.nextFloat() < this.potion1.probability1) {
			player.addPotionEffect(new PotionEffect(this.potion1.id1,
					this.potion1.duration1 * 20, this.potion1.amplifer1));
		}
		if (!world.isRemote && this.potion1.id2 > 0
				&& world.rand.nextFloat() < this.potion1.probability2) {
			player.addPotionEffect(new PotionEffect(this.potion1.id2,
					this.potion1.duration2 * 20, this.potion1.amplifer2));
		}
		if (!world.isRemote && this.potion1.id3 > 0
				&& world.rand.nextFloat() < this.potion1.probability3) {
			player.addPotionEffect(new PotionEffect(this.potion1.id3,
					this.potion1.duration3 * 20, this.potion1.amplifer3));
		}
		if (!world.isRemote && this.potion1.id4 > 0
				&& world.rand.nextFloat() < this.potion1.probability4) {
			player.addPotionEffect(new PotionEffect(this.potion1.id4,
					this.potion1.duration4 * 20, this.potion1.amplifer4));
		}
		if (!world.isRemote && this.potion1.id5 > 0
				&& world.rand.nextFloat() < this.potion1.probability5) {
			player.addPotionEffect(new PotionEffect(this.potion1.id5,
					this.potion1.duration5 * 20, this.potion1.amplifer5));
		}

	}

}
