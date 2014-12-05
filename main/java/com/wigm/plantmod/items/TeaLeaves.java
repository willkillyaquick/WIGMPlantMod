package com.wigm.plantmod.items;

import java.util.List;

import com.wigm.plantmod.lib.Constants;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

/**
 * @author Thomas Snyder (willkillyaquick)
 * @version Nov 12, 2014
 *
 */
public class TeaLeaves extends Item {
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	public String[] nameList;

	public TeaLeaves(String[] nameList) {
		this.nameList = nameList;
		setUnlocalizedName(Constants.MODID + ".");
		setCreativeTab(CreativeTabs.tabMaterials);
		setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		int metadata = MathHelper.clamp_int(itemStack.getItemDamage(), 0, 15);
		return super.getUnlocalizedName() + nameList[metadata];
	}

	@SuppressWarnings({"unchecked","rawtypes"})
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for (int x = 0; x < nameList.length; x++) {
			list.add(new ItemStack(this, 1, x));
		}
	}

	@Override
	public void registerIcons(IIconRegister iconRegister) {
		icons = new IIcon[nameList.length];
		for (int i = 0; i < icons.length; i++) {
			icons[i] = iconRegister.registerIcon(Constants.MODID + ":"
					+ nameList[i]);
		}
	}

	@Override
	public IIcon getIconFromDamage(int index) {
		return icons[index];
	}

}
