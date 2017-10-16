package de.andhilldev.spawningfactory.blocks;

import de.andhilldev.spawningfactory.SpawningFactory;
import de.andhilldev.spawningfactory.misc.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLimeStoneBricks extends Block {
	public BlockLimeStoneBricks() {
		super(Material.rock);
		this.setCreativeTab(SpawningFactory.tabSpawningFactory);
		setUnlocalizedName(References.SpawningFactoryblocks.LIMESTONEBRICKS.getUnlocalizedName());
		setRegistryName(References.SpawningFactoryblocks.LIMESTONEBRICKS.getRegistryName());
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setHarvestLevel("pickaxe", 1);
		this.setStepSound(soundTypeStone);
	}
}