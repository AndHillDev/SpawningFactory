package de.andhilldev.spawningfactory.misc;

public class References {
	public static final String MODNAME = "Spawning Factory";
	public static final String MODVERSION = "1.0.5";
	public static final String MODID = "spawningfactory";
	public static final String MCVERSIONS = "[1.8.9]";
	
	public static final String CLIENT_PROXY_CLASS = "de.andhilldev.spawningfactory.proxies.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "de.andhilldev.spawningfactory.proxies.ServerProxy";
	
	public static enum SpawningFactoryItems {
		LIMESTONEDUST("itemLimeStoneDust","itemLimeStoneDust"),
		LIMESTONEBRICK("itemLimeStoneBrick","itemLimeStoneBrick"),
		BLANKEGG("itemBlankEgg","itemBlankEgg"),
		BATDROP("itemBatDrop", "itemBatDrop"),
		BLAZEDROP("itemBlazeDrop","itemBlazeDrop"),
		CAVESPIDERDROP("itemCaveSpiderDrop","itemCaveSpiderDrop"),
		CHICKENDROP("itemChickenDrop","itemChickenDrop"),
		COWDROP("itemCowDrop","itemCowDrop"),
		CREEPERDROP("itemCreeperDrop","itemCreeperDrop"),
		ENDERMANDROP("itemEnderManDrop","itemEnderManDrop"),
		ENDERMITEDROP("itemEnderMiteDrop","itemEnderMiteDrop"),
		GUARDIANDROP("itemGuardianDrop","itemGuardianDrop"),
		HORSEDROP("itemHorseDrop","itemHorseDrop"),
		MAGMACUBEDROP("itemMagmaCubeDrop","itemMagmaCubeDrop"),
		OCELOTDROP("itemOcelotDrop","itemOcelotDrop"),
		PIGDROP("itemPigDrop","itemPigDrop"),
		SHEEPDROP("itemSheepDrop","itemSheepDrop"),
		SILVERFISHDROP("itemSilverFishDrop","itemSilverFishDrop"),
		SKELETONDROP("itemSkeletonDrop","itemSkeletonDrop"),
		SLIMEDROP("itemSlimeDrop","itemSlimeDrop"),
		SPIDERDROP("itemSpiderDrop","itemSpiderDrop"),
		SQUIDDROP("itemSquidDrop","itemSquidDrop"),
		VILLAGERDROP("itemVillagerDrop","itemVillagerDrop"),
		WITCHDROP("itemWitchDrop","itemWitchDrop"),
		WOLFDROP("itemWolfDrop","itemWolfDrop"),
		ZOMBIEDROP("itemZombieDrop","itemZombieDrop"),
		RABBITDROP("itemRabbitDrop","itemRabbitDrop"),
		
		BATEGG("itemBatEgg", "itemBatEgg"),
		BLAZEEGG("itemBlazeEgg","itemBlazeEgg"),
		CAVESPIDEREGG("itemCaveSpiderEgg","itemCaveSpiderEgg"),
		CHICKENEGG("itemChickenEgg","itemChickenEgg"),
		COWEGG("itemCowEgg","itemCowEgg"),
		CREEPEREGG("itemCreeperEgg","itemCreeperEgg"),
		ENDERMANEGG("itemEnderManEgg","itemEnderManEgg"),
		ENDERMITEEGG("itemEnderMiteEgg","itemEnderMiteEgg"),
		GHASTEGG("itemGhastEgg","itemGhastEgg"),
		GUARDIANEGG("itemGuardianEgg","itemGuardianEgg"),
		HORSEEGG("itemHorseEgg","itemHorseEgg"),
		MAGMACUBEEGG("itemMagmaCubeEgg","itemMagmaCubeEgg"),
		MOOSHROOMEGG("itemMooshRoomCowEgg","itemMooshRoomCowEgg"),
		OCELOTEGG("itemOcelotEgg","itemOcelotEgg"),
		PIGEGG("itemPigEgg","itemPigEgg"),
		RABBITEGG("itemRabbitEgg","itemRabbitEgg"),
		SHEEPEGG("itemSheepEgg","itemSheepEgg"),
		SILVERFISHEGG("itemSilverFishEgg","itemSilverFishEgg"),
		SKELETONEGG("itemSkeletonEgg","itemSkeletonEgg"),
		SLIMEEGG("itemSlimeEgg","itemSlimeEgg"),
		SPIDEREGG("itemSpiderEgg","itemSpiderEgg"),
		SQUIDEGG("itemSquidEgg","itemSquidEgg"),
		VILLAGEREGG("itemVillagerEgg","itemVillagerEgg"),
		WITCHEGG("itemWitchEgg","itemWitchEgg"),
		WOLFEGG("itemWolfEgg","itemWolfEgg"),
		ZOMBIEEGG("itemZombieEgg","itemZombieEgg"),
		ZOMBIEPIGMANEGG("itemZombiePigManEgg","itemZombiePigManEgg");
		
		private String unlocalizedName;
		private String registryName;
		
		SpawningFactoryItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
	public static enum SpawningFactoryblocks {
		
		LIMESTONE("blockLimeStone","blockLimeStone"),
		LIMESTONEBRICKS("blockLimeStoneBricks", "blockLimeStoneBricks"),
		LIMESTONEBRICKSSTAIRS("blockLimeStoneBricksStairs","blockLimeStoneBricksStairs"),
		LIMESTONEBRICKSHALFSLAB("blockLimeStoneBricksHalfSlab","blockLimeStoneBricksHalfSlab"),
		LIMESTONEBRICKSDOUBLESLAB("blockLimeStoneBricksDoubleSlab","blockLimeStoneBricksDoubleSlab");
		
		private String unlocalizedName;
		private String registryName;
		
		SpawningFactoryblocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
}