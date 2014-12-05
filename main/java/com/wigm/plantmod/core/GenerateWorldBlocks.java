package com.wigm.plantmod.core;

import java.util.Random;

import com.wigm.plantmod.plants.GrassGenerator;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

/**
 * @author Thomas Snyder (willkillyaquick)
 * @version Nov 12, 2014
 *
 */
public class GenerateWorldBlocks implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
			switch(world.provider.dimensionId) {
			case 0: generateOverworld(random, world, chunkX * 16, chunkZ * 16); break;
			case 1: generateEnd(random, world, chunkX * 16, chunkZ * 16); break;
			case -1: generateNether(random, world, chunkX * 16, chunkZ * 16); break;
			default: generateOverworld(random, world, chunkX * 16, chunkZ * 16);
			}		
	}

	private void generateNether(Random rand, World world, int x, int z) {
		
	}

	private void generateEnd(Random rand, World world, int x, int z) {
		
	}

	private void generateOverworld(Random rand, World world, int x, int z) {
		//int y = 50 + random.nextInt(35);
		//new TreeGenerator(4, Blocks.log, Blocks.leaves).generate(world, rand, x, 70, z);
		new GrassGenerator(Bushes.teabush).generate(world, rand, x, 70, z);
		new GrassGenerator(Bushes.raspberrybush).generate(world, rand, x, 70, z);
		new GrassGenerator(Bushes.mintbush).generate(world, rand, x, 70, z);
		new GrassGenerator(Bushes.orangebush).generate(world, rand, x, 70, z);
		new GrassGenerator(Bushes.onionbush).generate(world, rand, x, 70, z);
	}
}
