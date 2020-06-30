package com.askbri.metier;

import java.util.ArrayList;
import java.util.List;

public class ClientWS {

    public static void main( String[] args ){
        BanqueWS stub = new BanqueImplService().getBanqueWSPort();

        System.out.println("Banque client side : Starting");

        double resultat = stub.convertEuroToDh( 700 );
        System.out.println( " 700Euro = " + resultat + " DH" );

        System.out.println("Adding new account ... ");
        stub.addAccount( 1L , "Ahmed HILALI" , 1000);
        stub.addAccount( 2L , "Hamza ASKOUR" , 28000);
        stub.addAccount( 3L , "Nahid AFFACH" , 4200);


        List<Account> accounts = new ArrayList<>();
        accounts = stub.getAllAccounts();
        for( Account account : accounts ){
            System.out.println("--------------------------------------------------------------");
            System.out.println(" Information relatif à l'utilisateur " + account.getFullName() );
            System.out.println(" Code = " + account.getCode() + " | Solde = " + account.getSolde() + " DH");
        }

    }

}
