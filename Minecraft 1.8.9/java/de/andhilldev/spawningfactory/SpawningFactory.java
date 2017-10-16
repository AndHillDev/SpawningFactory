package de.andhilldev.spawningfactory;

import de.andhilldev.spawningfactory.handlers.DropHandler;
import de.andhilldev.spawningfactory.handlers.RecipeHandler;
import de.andhilldev.spawningfactory.handlers.WorldGenerator;
import de.andhilldev.spawningfactory.init.ModBlocks;
import de.andhilldev.spawningfactory.init.ModItems;
import de.andhilldev.spawningfactory.misc.EventListener;
import de.andhilldev.spawningfactory.misc.References;
import de.andhilldev.spawningfactory.misc.TabSpawningFactory;
import de.andhilldev.spawningfactory.misc.Version;
import de.andhilldev.spawningfactory.proxies.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid=References.MODID, name=References.MODNAME, version=References.MODVERSION, acceptedMinecraftVersions=References.MCVERSIONS)
public class SpawningFactory {
	
	@Instance
	public static SpawningFactory instance;
	
	@SidedProxy(clientSide=References.CLIENT_PROXY_CLASS, serverSide=References.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	// Creative Tabs
	public static CreativeTabs tabSpawningFactory = new TabSpawningFactory(CreativeTabs.getNextID(),"TabSpawningFactory");
	
	// WORLDGENERATOR
	public static WorldGenerator WorldGen = new WorldGenerator();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.init();
		ModItems.init();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
		GameRegistry.registerWorldGenerator(WorldGen, 1);
		MinecraftForge.EVENT_BUS.register(new DropHandler());
		EventListener eventListener = new EventListener();
		ModBlocks.register();
		ModBlocks.registerBlockOres();
		ModItems.register();
		ModItems.registerItemOres();
		RecipeHandler.registerRecipes();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		new Version();
	}
}