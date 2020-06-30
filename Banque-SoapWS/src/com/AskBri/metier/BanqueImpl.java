package com.AskBri.metier;

import com.AskBri.entities.Account;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.*;

@WebService( name = "BanqueWS" )
public class BanqueImpl implements IBanque{

    private static final Map<Long , Account> accounts = new HashMap<Long, Account>();

    @WebMethod( operationName = "ConvertEuroToDh" )
    @Override
    public double convert( @WebParam( name = "montant" ) double montant) {
        return montant * 11.3;
    }

    @WebMethod( operationName = "AddAccount" )
    @Override
    public boolean addAccount( @WebParam( name = "code" ) Long code,
                               @WebParam( name = "fullName" ) String fullName,
                               @WebParam( name = "solde" ) double solde ) {
        Account account = new Account( code , fullName , solde );

        if( accounts.get( account.getCode()) != null ) return false;

        accounts.put( code , account );
        return true;
    }

    @WebMethod
    @Override
    public Account getAccount( @WebParam( name = "code" ) Long id) {
        return accounts.get( id );
    }

    @WebMethod
    @Override
    public List<Account> getAllAccounts() {
        Set<Long> ids = accounts.keySet();
        List<Account> accountList = new ArrayList<>();
        for ( Long id : ids ){
            accountList.add( accounts.get(id) );
        }
        return accountList;
    }
}
