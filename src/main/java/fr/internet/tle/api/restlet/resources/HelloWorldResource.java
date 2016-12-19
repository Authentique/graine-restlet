package fr.internet.tle.api.restlet.resources;

import org.json.JSONException;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class HelloWorldResource extends ServerResource {
    
    private static final String HELLO_WORLD = "hello, world";

    @Get
    public String helloWorld(Representation entity) throws JSONException {
        // return new JsonRepresentation(new JSONObject(HELLO_WORLD));
        return HELLO_WORLD;
    }
}