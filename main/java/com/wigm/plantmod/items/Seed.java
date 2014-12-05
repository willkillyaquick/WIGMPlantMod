package com.wigm.plantmod.items;
import com.wigm.plantmod.lib.Constants;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;


/**
 * @author Thomas Snyder (willkillyaquick)
 * @version Nov 12, 2014
 *
 */
public class Seed extends Item implements IPlantable{
	private Block plant;
	public void setPlant(Block plant) {
		this.plant = plant;
	}

	public Seed(String name) {
		setUnlocalizedName(Constants.MODID + "." + name);
		setTextureName(Constants.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
	public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z){
		return EnumPlantType.Crop;
	}

	@Override
	public Block getPlant(IBlockAccess world, int x, int y, int z) {
		return plant;
	}

	@Override
	public int getPlantMetadata(IBlockAccess world, int x, int y, int z) {
		return 0;
	}

	@Override
	public boolean onItemUse(ItemStack item, EntityPlayer player,
			World world, int x, int y, int z,
			int n4, float n5, float n6,
			float n7) {
		if (n4 != 1){
			return false;
		}
		else if (player.canPlayerEdit(x, y, z, n4, item) && player.canPlayerEdit(x, y +1, z, n4, item)){
			if (world.getBlock(x, y, z) == Blocks.farmland){
				world.setBlock(x, y +1, z, this.plant);
				--item.stackSize;
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
}
