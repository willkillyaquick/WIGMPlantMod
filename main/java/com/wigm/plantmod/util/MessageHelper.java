/**
 * 
 */
package com.wigm.plantmod.util;

import net.minecraft.util.ChatComponentText;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

/**
 * @author Thomas Snyder (willkillyaquick)
 * @version Nov 19, 2014
 *
 */
public class MessageHelper {
	@SubscribeEvent
	public void checkUpdate(PlayerEvent.PlayerLoggedInEvent event){
		event.player.addChatComponentMessage(new ChatComponentText(UpdateChecker.checkForUpdates()));
	}

}
