package de.andhilldev.spawningfactory.items;

import de.andhilldev.spawningfactory.SpawningFactory;
import net.minecraft.item.Item;

public class ItemDrop extends Item {
	public ItemDrop(String unlocalizedName, String registryName) {
		setCreativeTab(SpawningFactory.tabSpawningFactory);
		setUnlocalizedName(unlocalizedName);
		setRegistryName(registryName);
		setMaxStackSize(64);
	}
}
