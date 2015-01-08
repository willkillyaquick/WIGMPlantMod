package com.wigm.plantmod.plants;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

/**
 * @author Thomas Snyder (willkillyaquick)
 * @version Nov 19, 2014
 *
 */
public class GrassGenerator extends WorldGenerator {
	private Block grass;

	public GrassGenerator(Block grass) {
		this.grass = grass;

	}

	@Override
	public boolean generate(World world, Random rand, int x, int y, int z) {
		if (rand.nextInt(100) < 30) {
			while (world.getBlock(x, y - 1, z) != Blocks.dirt && y > 55) {
				--y;
			}
			//TODO add in a check for a dirt block
			if (world.getBlock(x, y - 1, z) == Blocks.dirt && (world.isAirBlock(x, y, z) || world.getBlock(x, y, z) == Blocks.grass)) {
				setBlock(world, x, y+1, z, grass);
				//System.out.println(x + " " + y + " " + z);
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	private void setBlock(World world, int x, int y, int z, Block block) {
		world.setBlock(x, y, z, block);

	}

}
