package de.andhilldev.spawningfactory.items;

import de.andhilldev.spawningfactory.SpawningFactory;
import de.andhilldev.spawningfactory.misc.References;
import net.minecraft.item.Item;

public class ItemLimeStoneDust extends Item {
	public ItemLimeStoneDust() {
		setCreativeTab(SpawningFactory.tabSpawningFactory);
		setUnlocalizedName(References.SpawningFactoryItems.LIMESTONEDUST.getUnlocalizedName());
		setRegistryName(References.SpawningFactoryItems.LIMESTONEDUST.getRegistryName());
		setMaxStackSize(64);
	}
}