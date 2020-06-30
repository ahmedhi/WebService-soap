package com.AskBri.server;

import com.AskBri.metier.BanqueImpl;

import javax.xml.ws.Endpoint;

public class ServerJWS {

    public static void main( String[] args ){

        System.out.println("Banque-SoapWS started");

        String url = "http://localhost:8585/";
        Endpoint.publish( url , new BanqueImpl() );

        System.out.println("Server started at : " + url );

    }

}
