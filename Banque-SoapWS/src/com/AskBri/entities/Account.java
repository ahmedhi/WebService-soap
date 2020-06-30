package com.AskBri.entities;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

@XmlRootElement( name = "account")
public class Account implements Serializable {

    private static final long serialVersionID = -9042379455915013575L;

    private Long code;
    private String fullName;
    private double solde;
    private Date dateCreate;

    public Account() {
    }

    public Account(Long code, String fullName, double solde) {
        this.code = code;
        this.fullName = fullName;
        this.solde = solde;
        this.dateCreate = new Date();
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }
}
