package de.andhilldev.spawningfactory.misc;

import de.andhilldev.spawningfactory.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class TabSpawningFactory extends CreativeTabs{

	public TabSpawningFactory(int index, String label) {
		super(index, label);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.itemBlankEgg;
	}

}