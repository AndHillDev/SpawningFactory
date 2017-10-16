package de.andhilldev.spawningfactory.items;

import de.andhilldev.spawningfactory.SpawningFactory;
import net.minecraft.item.Item;

public class ItemEgg extends Item {
	public ItemEgg(String unlocalizedName, String registryName) {
		setCreativeTab(SpawningFactory.tabSpawningFactory);
		setUnlocalizedName(unlocalizedName);
		setRegistryName(registryName);
		setMaxStackSize(16);
	}
}
