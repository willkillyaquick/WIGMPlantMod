package com.wigm.plantmod.plants;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

/**
 * @author Thomas Snyder (willkillyaquick)
 * @version Nov 12, 2014
 *
 */
public class TreeGenerator extends WorldGenerator {

	int height;
	Block wood;
	Block leaves;

	public TreeGenerator(int height, Block wood, Block leaves) {
		this.height = height;
		this.leaves = leaves;
		this.wood = wood;
	}

	@Override
	public boolean generate(World world, Random rand, int x, int y, int z) {
		if (rand.nextInt(100) < 25) {
			while (world.getBlock(x, y - 1, z) != Blocks.dirt && y > 55) {
				--y;
			}
			if (!world.isAirBlock(x, y, x)) {
				return false;
			}
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						for (int k = height - 1; k < height + 4; k++) {
							if ((i >= 3 && i <= 5) && (k == height + 1)
									&& (j == 1 || j == 7)) {
								setBlock(world, x + i, y + k, z + j, leaves);// Generates
																				// Front
																				// and
																				// back
																				// leaves
							}
							if ((i >= 2 && i <= 6)
									&& (k >= height && k <= height + 2)
									&& ((j >= 2 && j <= 3) || (j >= 5 && j <= 6))) {
								setBlock(world, x + i, y + k, z + j, leaves);// Generates
																				// Front
																				// and
																				// Back
																				// interLeaves
							}
							if (((i >= 2 && i <= 3) || (i >= 5 && i <= 6))
									&& (k >= height && k <= height + 2)
									& j == 4) {
								setBlock(world, x + i, y + k, z + j, leaves);// Generates
																				// Left
																				// and
																				// Right
																				// interLeaves
							}
							if ((i == 1 || i == 7) && (k == height + 1)
									&& (j >= 3 && j <= 5)) {
								setBlock(world, x + i, y + k, z + j, leaves);// Generate
																				// Left
																				// and
																				// Right
																				// leaves
							}
						}
					}
				}
				for (int i=0; i <= height; i++){
					setBlock(world, x + 4, y + height - i, z + 4, wood);
				}
				setBlock(world, x + 4, y + height + 3, z + 4, leaves);
				return true;
			}
			else {
			return false;
			}
	}

	private void setBlock(World world, int x, int y, int z, Block block) {
		world.setBlock(x, y, z, block);

	}

}
