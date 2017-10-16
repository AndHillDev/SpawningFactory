package de.andhilldev.spawningfactory.blocks;

import java.util.Random;

import de.andhilldev.spawningfactory.SpawningFactory;
import de.andhilldev.spawningfactory.init.ModBlocks;
import de.andhilldev.spawningfactory.misc.References;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public abstract class BlockLimeStoneBricksSlab extends BlockSlab {
	
	private static final PropertyBool VARIANT = PropertyBool.create("variant");

	public BlockLimeStoneBricksSlab(String unlocalizedName) {
		super(Material.rock);
		this.setUnlocalizedName(unlocalizedName);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setHarvestLevel("pickaxe", 1);
		this.setStepSound(soundTypeStone);
		this.useNeighborBrightness=true;
		IBlockState state = this.blockState.getBaseState();
		state.withProperty(VARIANT, false);
		if(!this.isDouble()) {
			state.withProperty(HALF, EnumBlockHalf.BOTTOM);
			this.setCreativeTab(SpawningFactory.tabSpawningFactory);
		}
		setDefaultState(state);
	}

	@Override
	public final IBlockState getStateFromMeta(final int meta) {
		IBlockState blockState = this.getDefaultState();
	        blockState = blockState.withProperty(VARIANT, false);
	        if (!this.isDouble()) {
	            EnumBlockHalf value = EnumBlockHalf.BOTTOM;
	            if ((meta & 8) != 0) {
	                value = EnumBlockHalf.TOP;
	            }

	            blockState = blockState.withProperty(HALF, value);
	        }

		return blockState;
	}

	@Override
	public final int getMetaFromState(final IBlockState state) {
	        if (this.isDouble()) {
	           return 0;
	        }

	        if ((EnumBlockHalf) state.getValue(HALF) == EnumBlockHalf.TOP) {
	            return 8;
	        } else {
	            return 0;
	        }
	}

	@Override
	protected final BlockState createBlockState() {
	        if (this.isDouble()) {
	            return new BlockState(this, new IProperty[] {VARIANT});
	        } else {
	            return new BlockState(
	                this,
	                new IProperty[] {VARIANT, HALF});
	        }
	}
	
	@Override
	public String getUnlocalizedName(int meta) {
		return this.getUnlocalizedName();
	}
	
	@Override
	public Object getVariant(ItemStack stack) {
		return false;
	}
	
	@Override
	public IProperty<?> getVariantProperty() {
		return VARIANT;
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return 0;
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(ModBlocks.blockLimeStoneBricksHalfSlab);
    }

}
