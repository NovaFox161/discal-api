package com.cloudcraftgaming.discal.api;

import com.cloudcraftgaming.discal.api.object.BotSettings;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.handle.obj.IUser;

/**
 * Created by Nova Fox on 11/5/17.
 * Website: www.cloudcraftgaming.com
 * For Project: DisCal-API
 */
public class DisCalAPI {
	public static String version = "1.0.0";
	public static IDiscordClient client;
	public static BotSettings botSettings;

	public static void init(IDiscordClient _client, BotSettings _settings) {
		client = _client;
		botSettings = _settings;
	}

	/**
	 * Gets The {@link IUser} Object of DisCal.
	 *
	 * @return The {@link IUser} Object of DisCal.
	 */
	public static IUser getSelfUser() {
		if (client != null)
			return client.getOurUser();
		return null;
	}
}