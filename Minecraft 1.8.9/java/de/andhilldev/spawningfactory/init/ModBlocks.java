package de.andhilldev.spawningfactory.init;

import de.andhilldev.spawningfactory.blocks.BlockLimeStone;
import de.andhilldev.spawningfactory.blocks.BlockLimeStoneBricks;
import de.andhilldev.spawningfactory.blocks.BlockLimeStoneBricksDoubleSlab;
import de.andhilldev.spawningfactory.blocks.BlockLimeStoneBricksHalfSlab;
import de.andhilldev.spawningfactory.blocks.BlockLimeStoneBricksSlab;
import de.andhilldev.spawningfactory.blocks.BlockLimeStoneBricksStairs;
import de.andhilldev.spawningfactory.blocks.ItemBlockLimeStoneBricksSlab;
import de.andhilldev.spawningfactory.misc.References;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block blockLimeStone;
	public static Block blockLimeStoneBricks;
	public static BlockLimeStoneBricksStairs blockLimeStoneBricksStairs;
	public static Block blockLimeStoneBricksHalfSlab;
	public static Block blockLimeStoneBricksDoubleSlab;
	
	
	public static void init () {
		blockLimeStone = new BlockLimeStone();
		blockLimeStoneBricks = new BlockLimeStoneBricks();
		blockLimeStoneBricksStairs = new BlockLimeStoneBricksStairs(blockLimeStoneBricks);
		blockLimeStoneBricksHalfSlab = new BlockLimeStoneBricksHalfSlab(References.SpawningFactoryblocks.LIMESTONEBRICKSHALFSLAB.getUnlocalizedName());
		blockLimeStoneBricksDoubleSlab = new BlockLimeStoneBricksDoubleSlab(References.SpawningFactoryblocks.LIMESTONEBRICKSDOUBLESLAB.getUnlocalizedName());
	}
	
	public static void register() {
		GameRegistry.registerBlock(blockLimeStone);
		GameRegistry.registerBlock(blockLimeStoneBricks);
		GameRegistry.registerBlock(blockLimeStoneBricksStairs);
		GameRegistry.registerBlock(blockLimeStoneBricksHalfSlab, ItemBlockLimeStoneBricksSlab.class, "blockLimeStoneBricksHalfSlab", blockLimeStoneBricksHalfSlab, blockLimeStoneBricksDoubleSlab);
		GameRegistry.registerBlock(blockLimeStoneBricksDoubleSlab, ItemBlockLimeStoneBricksSlab.class, "blockLimeStoneBricksDoubleSlab", blockLimeStoneBricksHalfSlab, blockLimeStoneBricksDoubleSlab);
	}
	
	public static void registerRenders() {
		registerRender(blockLimeStone);
		registerRender(blockLimeStoneBricks);
		registerRender(blockLimeStoneBricksStairs);
		registerRender(blockLimeStoneBricksHalfSlab);
		registerRender(blockLimeStoneBricksDoubleSlab);
	}
	
	public static void registerBlockOres() {
		
	}
	
	public static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(References.MODID+':'+block.getUnlocalizedName().substring(5), "inventory"));
	}
	
}