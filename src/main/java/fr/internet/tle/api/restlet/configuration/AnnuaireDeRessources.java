package fr.internet.tle.api.restlet.configuration;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

import fr.internet.tle.api.restlet.resources.HelloWorldResource;
import fr.internet.tle.api.restlet.resources.ReturnJsonResource;

public class AnnuaireDeRessources extends Application {
    
    @Override
    public synchronized Restlet createInboundRoot() {
        final Router router = new Router(this.getContext());
        
        router.attach("/graine-restlet/helloWorld/hello", HelloWorldResource.class);
        router.attach("/graine-restlet/listeFichesServices/lire", ReturnJsonResource.class);

        return router;
    }
    
}