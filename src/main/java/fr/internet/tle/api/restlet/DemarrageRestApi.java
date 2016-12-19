package fr.internet.tle.api.restlet;

import org.restlet.Component;
import org.restlet.data.Protocol;

import fr.internet.tle.api.restlet.configuration.AnnuaireDeRessources;

public class DemarrageRestApi {

	private static final int PORT = 8182;

	public static void main(String[] args) throws Exception {
		Component component = new Component();
		component.getServers().add(Protocol.HTTP, PORT);

		component.getDefaultHost().attach(new AnnuaireDeRessources());

		component.start();
	}

}
