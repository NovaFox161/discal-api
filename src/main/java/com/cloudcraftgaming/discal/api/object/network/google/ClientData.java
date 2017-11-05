package com.cloudcraftgaming.discal.api.object.network.google;

/**
 * Created by Nova Fox on 11/5/17.
 * Website: www.cloudcraftgaming.com
 * For Project: DisCal-API
 */
public class ClientData {
	private final String clientId;
	private final String clientSecret;

	public ClientData(String _clientId, String _clientSecret) {
		clientId = _clientId;
		clientSecret = _clientSecret;
	}

	public String getClientId() {
		return clientId;
	}

	public String getClientSecret() {
		return clientSecret;
	}
}