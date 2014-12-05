package com.wigm.plantmod.plants;

import java.util.ArrayList;
import java.util.Random;

import com.wigm.plantmod.lib.Constants;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

/**
 * @author Thomas Snyder (willkillyaquick)
 * @version Nov 12, 2014
 *
 */
public class Plant extends BlockBush implements IGrowable {
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	private String name;
	private Item drops;
	private Item drops2;
	private Item drop3;
	private int damage;
	private int damage3;

	public Plant(String name, float boundsx, float boundsy, float boundsz,
			float boundsx2, float boundsy2, float boundsz2, float hardness,
			int sides, Item drops, int damage, Item drops2, Item drop3,
			int damage3) {
		super(Material.plants);
		this.drops = drops;
		this.drops2 = drops2;
		this.drop3 = drop3;
		this.damage = damage;
		this.damage3 = damage3;
		this.name = name;
		setBlockName(Constants.MODID + "." + name);
		setCreativeTab((CreativeTabs) null);
		setHardness(hardness);
		setBlockBounds(boundsx, boundsy, boundsz, boundsx2, boundsy2, boundsz2);
		setStepSound(soundTypeGrass);
		// setBlockTextureName(Constants.MODID + ":" + name); Replace with
		// graowable
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister icon) {
		icons = new IIcon[3];
		for (int i = 0; i < icons.length; i++) {
			icons[i] = icon.registerIcon(Constants.MODID + ":" + name + i);
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int n1, int n2) {
		if (n2 < 0 || n2 >= 3) {
			System.out.println("Plant generation out of bounds");
			return icons[0];
		} else {
			return icons[n2];
		}
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
		System.out.println("Droping items");
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
		if (metadata >= 2) {
			if (world.rand.nextInt(100) < 100) {
				ret.add(new ItemStack(drops, 3 + fortune, damage));
			}
			if (world.rand.nextInt(100) < 80) {
				ret.add(new ItemStack(drop3, 1 + fortune, damage3));
			}
		}
		if (world.rand.nextInt(100) < 100) {
			ret.add(new ItemStack(drops2, 1 + fortune, 0));
		}
		return ret;
	}

	@Override
	public boolean func_149851_a(World world, int x, int y, int z, boolean n1) {
		return world.getBlockMetadata(x, y, z) != 2;// Allows bonemeal to apply
	}

	@Override
	public boolean func_149852_a(World p_149852_1_, Random p_149852_2_,
			int p_149852_3_, int p_149852_4_, int p_149852_5_) {
		return true; // Allows Bonemeal to work
	}

	@Override
	public void func_149853_b(World world, Random rand, int x, int y, int z) {
		int next = world.getBlockMetadata(x, y, z) + 1;
		if (next > 2) {
			next = 2;
		}
		world.setBlockMetadataWithNotify(x, y, z, next, 2); // Tells bonemeal
															// what to do when
															// applied
	}

	@Override
	public void updateTick(World world, int x, int y, int z, Random rand) {
		super.updateTick(world, x, y, z, rand);

		if (world.getBlockLightValue(x, y + 1, z) >= 9) {
			int l = world.getBlockMetadata(x, y, z);
			if (l < 2) {
				if (rand.nextInt(5) == 0) {
					++l;
					world.setBlockMetadataWithNotify(x, y, z, l, 2);
				}
			}
		}
	}

}
