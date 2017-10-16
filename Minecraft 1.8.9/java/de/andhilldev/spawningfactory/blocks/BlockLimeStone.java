package de.andhilldev.spawningfactory.blocks;

import java.util.Random;

import de.andhilldev.spawningfactory.SpawningFactory;
import de.andhilldev.spawningfactory.init.ModItems;
import de.andhilldev.spawningfactory.misc.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockLimeStone extends Block {

	public BlockLimeStone() {
		super(Material.rock);
		this.setCreativeTab(SpawningFactory.tabSpawningFactory);
		setUnlocalizedName(References.SpawningFactoryblocks.LIMESTONE.getUnlocalizedName());
		setRegistryName(References.SpawningFactoryblocks.LIMESTONE.getRegistryName());
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setHarvestLevel("pickaxe", 1);
		this.setStepSound(soundTypeStone);
	}
	
	
	public int quantityDropped(Random random)
    {
        return 4;
    }

	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.itemLimeStoneDust;
	}
	
	@Override
	public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
		super.onBlockDestroyedByPlayer(worldIn, pos, state);
		this.dropXpOnBlockBreak(worldIn, pos, 1);
	}

}
