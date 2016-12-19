package fr.internet.tle.api.services;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConnecteurHttp {
    
    private static final String VERBE_APPEL_POST = "POST";
    private static final String VERBE_APPEL_GET = "GET";
    
    private HttpURLConnection obtenirUneConnectionHttp(URL urlConnexion, String verbeHttp) throws IOException {
        HttpURLConnection connexion = (HttpURLConnection) urlConnexion.openConnection();
        connexion.setDoOutput(true);
        connexion.setRequestMethod(verbeHttp);

        return connexion;
    }

}