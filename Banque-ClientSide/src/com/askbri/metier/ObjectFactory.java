
package com.askbri.metier;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.askbri.metier package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConvertEuroToDhResponse_QNAME = new QName("http://metier.AskBri.com/", "ConvertEuroToDhResponse");
    private final static QName _AddAccount_QNAME = new QName("http://metier.AskBri.com/", "AddAccount");
    private final static QName _GetAccountResponse_QNAME = new QName("http://metier.AskBri.com/", "getAccountResponse");
    private final static QName _GetAllAccounts_QNAME = new QName("http://metier.AskBri.com/", "getAllAccounts");
    private final static QName _ConvertEuroToDh_QNAME = new QName("http://metier.AskBri.com/", "ConvertEuroToDh");
    private final static QName _AddAccountResponse_QNAME = new QName("http://metier.AskBri.com/", "AddAccountResponse");
    private final static QName _GetAccount_QNAME = new QName("http://metier.AskBri.com/", "getAccount");
    private final static QName _Account_QNAME = new QName("http://metier.AskBri.com/", "account");
    private final static QName _GetAllAccountsResponse_QNAME = new QName("http://metier.AskBri.com/", "getAllAccountsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.askbri.metier
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddAccount }
     * 
     */
    public AddAccount createAddAccount() {
        return new AddAccount();
    }

    /**
     * Create an instance of {@link ConvertEuroToDhResponse }
     * 
     */
    public ConvertEuroToDhResponse createConvertEuroToDhResponse() {
        return new ConvertEuroToDhResponse();
    }

    /**
     * Create an instance of {@link GetAccount }
     * 
     */
    public GetAccount createGetAccount() {
        return new GetAccount();
    }

    /**
     * Create an instance of {@link GetAllAccountsResponse }
     * 
     */
    public GetAllAccountsResponse createGetAllAccountsResponse() {
        return new GetAllAccountsResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link GetAllAccounts }
     * 
     */
    public GetAllAccounts createGetAllAccounts() {
        return new GetAllAccounts();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link ConvertEuroToDh }
     * 
     */
    public ConvertEuroToDh createConvertEuroToDh() {
        return new ConvertEuroToDh();
    }

    /**
     * Create an instance of {@link AddAccountResponse }
     * 
     */
    public AddAccountResponse createAddAccountResponse() {
        return new AddAccountResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDhResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://metier.AskBri.com/", name = "ConvertEuroToDhResponse")
    public JAXBElement<ConvertEuroToDhResponse> createConvertEuroToDhResponse(ConvertEuroToDhResponse value) {
        return new JAXBElement<ConvertEuroToDhResponse>(_ConvertEuroToDhResponse_QNAME, ConvertEuroToDhResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://metier.AskBri.com/", name = "AddAccount")
    public JAXBElement<AddAccount> createAddAccount(AddAccount value) {
        return new JAXBElement<AddAccount>(_AddAccount_QNAME, AddAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://metier.AskBri.com/", name = "getAccountResponse")
    public JAXBElement<GetAccountResponse> createGetAccountResponse(GetAccountResponse value) {
        return new JAXBElement<GetAccountResponse>(_GetAccountResponse_QNAME, GetAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAccounts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://metier.AskBri.com/", name = "getAllAccounts")
    public JAXBElement<GetAllAccounts> createGetAllAccounts(GetAllAccounts value) {
        return new JAXBElement<GetAllAccounts>(_GetAllAccounts_QNAME, GetAllAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDh }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://metier.AskBri.com/", name = "ConvertEuroToDh")
    public JAXBElement<ConvertEuroToDh> createConvertEuroToDh(ConvertEuroToDh value) {
        return new JAXBElement<ConvertEuroToDh>(_ConvertEuroToDh_QNAME, ConvertEuroToDh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://metier.AskBri.com/", name = "AddAccountResponse")
    public JAXBElement<AddAccountResponse> createAddAccountResponse(AddAccountResponse value) {
        return new JAXBElement<AddAccountResponse>(_AddAccountResponse_QNAME, AddAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://metier.AskBri.com/", name = "getAccount")
    public JAXBElement<GetAccount> createGetAccount(GetAccount value) {
        return new JAXBElement<GetAccount>(_GetAccount_QNAME, GetAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://metier.AskBri.com/", name = "account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<Account>(_Account_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAccountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://metier.AskBri.com/", name = "getAllAccountsResponse")
    public JAXBElement<GetAllAccountsResponse> createGetAllAccountsResponse(GetAllAccountsResponse value) {
        return new JAXBElement<GetAllAccountsResponse>(_GetAllAccountsResponse_QNAME, GetAllAccountsResponse.class, null, value);
    }

}
