package org.evergreen.android;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

import org.evergreen.android.searchCatalog.SearchCatalog;
import org.json.JSONObject;
import org.opensrf.Method;
import org.opensrf.net.http.GatewayRequest;
import org.opensrf.net.http.HttpConnection;
import org.opensrf.net.http.HttpRequest;

public class TestGateway {
    
    public static void main(String[] args) throws java.net.MalformedURLException {

    	
    	/*
        if (args.length == 0) {
            System.err.println("Please provide a gateway URL: e.g. http://example.org/osrf-gateway-v1");
            return;
        }
	*/
        // configure the connection

        SearchCatalog search = new SearchCatalog("http://ulysses.calvin.edu","en-US");
        
        search.getSearchResults("drupal");
        
        
    }
}


