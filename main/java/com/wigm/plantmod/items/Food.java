package com.wigm.plantmod.items;

import java.util.List;

import com.wigm.plantmod.lib.Constants;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

/**
 * @author Thomas Snyder (willkillyaquick)
 * @version Nov 12, 2014
 *
 */
public class Food extends ItemFood{
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	public String[] food;
	
	public Food(int food1, float saturation, boolean wolfFood, String[] food) {
		super(food1, saturation, wolfFood);
		this.food = food;
		setUnlocalizedName(Constants.MODID + ".");
		setCreativeTab(CreativeTabs.tabFood);
		setHasSubtypes(true);
	}
	public String getUnlocalizedName(ItemStack itemStack) {
		int metadata = MathHelper.clamp_int(itemStack.getItemDamage(), 0, 15);
		return super.getUnlocalizedName() + food[metadata];
	}
	@SuppressWarnings({"unchecked","rawtypes"})
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for (int x = 0; x < food.length; x++) {
			list.add(new ItemStack(this, 1, x));
		}
	}
	@Override
	public void registerIcons(IIconRegister iconRegister) {
		icons = new IIcon[food.length];
		for (int i = 0; i < icons.length; i++) {
			icons[i] = iconRegister.registerIcon(Constants.MODID + ":"
					+ food[i]);
		}
	}
	@Override
	public IIcon getIconFromDamage(int index) {
		return icons[index];
	}
}
