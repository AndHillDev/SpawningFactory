package de.andhilldev.spawningfactory.proxies;

import de.andhilldev.spawningfactory.init.ModBlocks;
import de.andhilldev.spawningfactory.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModBlocks.registerRenders();
		ModItems.registerRenders();
	}

}
