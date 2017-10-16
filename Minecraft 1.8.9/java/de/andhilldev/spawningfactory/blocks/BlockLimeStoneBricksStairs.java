package de.andhilldev.spawningfactory.blocks;

import de.andhilldev.spawningfactory.SpawningFactory;
import de.andhilldev.spawningfactory.misc.References;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class BlockLimeStoneBricksStairs extends BlockStairs {

	public BlockLimeStoneBricksStairs(Block block) {
		super(getBlockState(block));
		setCreativeTab(SpawningFactory.tabSpawningFactory);
		setUnlocalizedName(References.SpawningFactoryblocks.LIMESTONEBRICKSSTAIRS.getUnlocalizedName());
		setRegistryName(References.SpawningFactoryblocks.LIMESTONEBRICKSSTAIRS.getRegistryName());
		setHardness(3.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 1);
		setStepSound(soundTypeStone);
		useNeighborBrightness=true;
		
	}
	
	private static IBlockState getBlockState(Block block) {
		return block.getStateFromMeta(0);
	}

}
