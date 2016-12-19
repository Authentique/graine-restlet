package fr.internet.tle.api.restlet.resources;

import org.json.JSONException;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class ReturnJsonResource extends ServerResource {

    private static final String JSON_RETOURNEE = "{'id': '78b8394f-358e-4c8b-bee3-55534ed98984','nom': 'Formation OpenAM','typeService': 'métier','logo': '/sites/POCSNED2/files/conf_chain_authent.png','description': '<p>Module de formation &agrave; la configuration d&#39;OpenAM 13.5.</p>\n','editeur': 'TLE & Co.','urlWeb': http://www.pole-emploi.fr,'note': '5'}";

    @Get
    public String lireFichesServices(Representation entity) throws JSONException {
        return JSON_RETOURNEE;
    }
    
}