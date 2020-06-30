package com.AskBri.metier;

import com.AskBri.entities.Account;

import java.util.List;

public interface IBanque {

    double convert( double montant );

    boolean addAccount( Long code , String fullName , double solde );
    Account getAccount( Long id );

    List<Account> getAllAccounts();

}
