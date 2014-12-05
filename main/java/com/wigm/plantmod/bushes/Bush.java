package com.wigm.plantmod.bushes;

import java.util.ArrayList;

import com.wigm.plantmod.lib.Constants;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

/**
 * @author Thomas Snyder (willkillyaquick)
 * @version Nov 11, 2014
 *
 */
public class Bush extends BlockBush {
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	private Item drops;
	private Item drops2;
	private Item drop3;
	private int damage;
	private int damage3;

	public Bush(String name, float boundsx, float boundsy, float boundsz,
			float boundsx2, float boundsy2, float boundsz2, float hardness,
			int sides, Item drops, int damage, Item drops2, Item drop3,
			int damage3) {
		super(Material.plants);
		this.drops = drops;
		this.drops2 = drops2;
		this.drop3 = drop3;
		this.damage = damage;
		this.damage3 = damage3;
		setBlockName(Constants.MODID + "." + name);
		setCreativeTab(CreativeTabs.tabDecorations);
		setHardness(hardness);
		setBlockBounds(boundsx, boundsy, boundsz, boundsx2, boundsy2, boundsz2);
		setStepSound(soundTypeGrass);
		setBlockTextureName(Constants.MODID + ":" + name);
	}

	@Override
	public int getRenderType() {
		return 6;
	}

	public void dropBlockAsItemWithChance(World p_149690_1_, int p_149690_2_,
			int p_149690_3_, int p_149690_4_, int p_149690_5_,
			float p_149690_6_, int p_149690_7_) {
		super.dropBlockAsItemWithChance(p_149690_1_, p_149690_2_, p_149690_3_,
				p_149690_4_, p_149690_5_, p_149690_6_, 0);
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z,
			int metadata, int fortune) {
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
		// if (metadata == 0){
		if (world.rand.nextInt(100) < 80) {
			ret.add(new ItemStack(drops, 3 + fortune, damage));
		}
		// }
		if (world.rand.nextInt(100) < 100) {
			ret.add(new ItemStack(drops2, 1 + fortune, 0));
		}
		if (world.rand.nextInt(100) < 3) {
			ret.add(new ItemStack(drop3, 1, damage3));
		}
		return ret;
	}
}
