package de.andhilldev.spawningfactory.items;

import de.andhilldev.spawningfactory.SpawningFactory;
import de.andhilldev.spawningfactory.misc.References;
import net.minecraft.item.Item;

public class ItemLimeStoneBrick extends Item {
	public ItemLimeStoneBrick() {
		setCreativeTab(SpawningFactory.tabSpawningFactory);
		setUnlocalizedName(References.SpawningFactoryItems.LIMESTONEBRICK.getUnlocalizedName());
		setRegistryName(References.SpawningFactoryItems.LIMESTONEBRICK.getRegistryName());
		setMaxStackSize(64);
	}
}