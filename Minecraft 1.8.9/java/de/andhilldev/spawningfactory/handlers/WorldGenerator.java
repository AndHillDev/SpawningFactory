package de.andhilldev.spawningfactory.handlers;

import java.util.Random;

import de.andhilldev.spawningfactory.init.ModBlocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenerator implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		switch(world.provider.getDimensionId()) {
		case -1:
			generateInNether(world, random, chunkX*16, chunkZ*16);
			break;
		case 0:
			generateInOverworld(world, random, chunkX*16, chunkZ*16);
			break;
		case 1:
			generateInEnd(world, random, chunkX*16, chunkZ*16);
			break;
		}
		
	}

	private void generateInEnd(World world, Random random, int x, int z) {
		
	}

	private void generateInOverworld(World world, Random random, int x, int z) {
		
		for (int i=0; i<15; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(64);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(ModBlocks.blockLimeStone.getDefaultState(), 10)).generate(world, random, new BlockPos(chunkX, chunkY, chunkZ));
		}
	}

	private void generateInNether(World world, Random random, int x, int z) {
		
	}

}
