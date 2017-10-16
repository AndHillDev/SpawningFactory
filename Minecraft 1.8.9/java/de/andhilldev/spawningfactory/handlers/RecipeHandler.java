package de.andhilldev.spawningfactory.handlers;

import de.andhilldev.spawningfactory.init.ModBlocks;
import de.andhilldev.spawningfactory.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {
	
	private static void shapelessRecipes() {
		
	}
	
	private static void shapedRecipes() {
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockLimeStoneBricks, 1), new Object[]{"XX", "XX", 'X', ModItems.itemLimeStoneBrick});
		GameRegistry.addRecipe(new ItemStack(ModItems.itemBlankEgg, 1), new Object[]{"XXX", "XYX", "XXX", 'X', ModItems.itemLimeStoneDust, 'Y', Items.egg});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockLimeStoneBricksStairs, 4), new Object[] {"X  ","XX ","XXX", 'X',ModBlocks.blockLimeStoneBricks});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blockLimeStoneBricksHalfSlab, 6), new Object[] {"XXX", 'X', ModBlocks.blockLimeStoneBricks});
		
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemPigEgg, 1), new Object[] {"X#",'#',ModItems.itemPigDrop,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemCowEgg, 1), new Object[] {"X#",'#',ModItems.itemCowDrop,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemHorseEgg, 1), new Object[] {"X#",'#',ModItems.itemHorseDrop,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemChickenEgg, 1), new Object[] {"X#",'#',ModItems.itemChickenDrop,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemSquidEgg, 1), new Object[] {"X#",'#',ModItems.itemSquidDrop,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemOcelotEgg, 1), new Object[] {"X#",'#',ModItems.itemOcelotDrop,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemVillagerEgg, 1), new Object[] {"X#",'#',ModItems.itemVillagerDrop,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemBatEgg, 1), new Object[] {"X#",'#',ModItems.itemBatDrop,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemSheepEgg, 1), new Object[] {"X#",'#',ModItems.itemSheepDrop,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemCreeperEgg, 1), new Object[] {"X#",'#',ModItems.itemCreeperDrop,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemSkeletonEgg, 1), new Object[] {"X#",'#',ModItems.itemSkeletonDrop,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemSpiderEgg, 1), new Object[] {"X#",'#',ModItems.itemSpiderDrop,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemZombieEgg, 1), new Object[] {"X#",'#',ModItems.itemZombieDrop,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemSlimeEgg, 1), new Object[] {"X#",'#',ModItems.itemSlimeDrop,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemEnderManEgg, 1), new Object[] {"X#",'#',ModItems.itemEnderManDrop,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemCaveSpiderEgg, 1), new Object[] {"X#",'#',ModItems.itemCaveSpiderDrop,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemSilverFishEgg, 1), new Object[] {"X#",'#',ModItems.itemSilverFishDrop,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemWitchEgg, 1), new Object[] {"X#",'#',ModItems.itemWitchDrop,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemWolfEgg, 1), new Object[] {"X#",'#',ModItems.itemWolfDrop,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemGhastEgg, 1), new Object[] {"X#",'#',Items.ghast_tear,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemZombiePigManEgg, 1), new Object[] {"X#","Y ",'#',ModItems.itemPigDrop,'X',ModItems.itemBlankEgg,'Y',ModItems.itemZombieDrop});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemBlazeEgg, 1), new Object[] {"X#",'#',ModItems.itemBlazeDrop,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemMagmaCubeEgg, 1), new Object[] {"X#",'#',ModItems.itemMagmaCubeDrop,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemMooshRoomCowEgg, 1), new Object[] {"X#","Y ",'#',ModItems.itemCowDrop,'X',ModItems.itemBlankEgg,'Y',Blocks.red_mushroom});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemGuardianEgg, 1), new Object[] {"X#",'#',ModItems.itemGuardianDrop,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemRabbitEgg, 1), new Object[] {"X#",'#',ModItems.itemRabbitDrop,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemEnderMiteEgg, 1), new Object[] {"X#",'#',ModItems.itemEnderMiteDrop,'X',ModItems.itemBlankEgg});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.mob_spawner, 1), new Object[] {"XXX", "X X", "XXX",'X', Blocks.iron_bars});
	}
	
	private static void smeltingRecipes() {
		GameRegistry.addSmelting(ModItems.itemLimeStoneDust, new ItemStack(ModItems.itemLimeStoneBrick, 1),  1F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemPigEgg), new ItemStack(Items.spawn_egg, 1, 90), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemCowEgg), new ItemStack(Items.spawn_egg, 1, 92), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemHorseEgg), new ItemStack(Items.spawn_egg, 1, 100), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemChickenEgg), new ItemStack(Items.spawn_egg, 1, 93), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemSquidEgg), new ItemStack(Items.spawn_egg, 1, 94), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemOcelotEgg), new ItemStack(Items.spawn_egg, 1, 98), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemVillagerEgg), new ItemStack(Items.spawn_egg, 1, 120), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemBatEgg), new ItemStack(Items.spawn_egg, 1, 65), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemSheepEgg), new ItemStack(Items.spawn_egg, 1, 91), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemCreeperEgg), new ItemStack(Items.spawn_egg, 1, 50), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemSkeletonEgg), new ItemStack(Items.spawn_egg, 1, 51), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemSpiderEgg), new ItemStack(Items.spawn_egg, 1, 52), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemZombieEgg), new ItemStack(Items.spawn_egg, 1, 54), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemSlimeEgg), new ItemStack(Items.spawn_egg, 1, 55), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemEnderManEgg), new ItemStack(Items.spawn_egg, 1, 58), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemCaveSpiderEgg), new ItemStack(Items.spawn_egg, 1, 59), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemSilverFishEgg), new ItemStack(Items.spawn_egg, 1, 60), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemWitchEgg), new ItemStack(Items.spawn_egg, 1, 66), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemWolfEgg), new ItemStack(Items.spawn_egg, 1, 95), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemGhastEgg), new ItemStack(Items.spawn_egg, 1, 56), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemZombiePigManEgg), new ItemStack(Items.spawn_egg, 1, 57), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemBlazeEgg), new ItemStack(Items.spawn_egg, 1, 61), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemMagmaCubeEgg), new ItemStack(Items.spawn_egg, 1, 62), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemMooshRoomCowEgg), new ItemStack(Items.spawn_egg, 1, 96), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemGuardianEgg), new ItemStack(Items.spawn_egg, 1, 68), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemRabbitEgg), new ItemStack(Items.spawn_egg, 1, 101), 0F);
		GameRegistry.addSmelting(new ItemStack(ModItems.itemEnderMiteEgg), new ItemStack(Items.spawn_egg, 1, 67), 0F);
	}
	
	public static void registerRecipes() {
		shapelessRecipes();
		shapedRecipes();
		smeltingRecipes();
	}
	
}