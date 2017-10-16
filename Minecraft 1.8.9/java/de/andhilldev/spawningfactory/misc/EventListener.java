package de.andhilldev.spawningfactory.misc;

import net.minecraft.util.ChatComponentText;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class EventListener {
	@SubscribeEvent
	public void onPlayerLogin(PlayerLoggedInEvent event) {
		if (Version.hasNewVersion) {
			event.player.addChatComponentMessage(new ChatComponentText("A new version of the SpawningFactory Mod is available. You can download it from Curse.com. The new version is: "+Version.remoteVersion));
		}
	}
}