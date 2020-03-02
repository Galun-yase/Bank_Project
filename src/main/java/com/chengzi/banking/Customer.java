package com.chengzi.banking;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String firstname,String lastname){
        this.firstName=firstname;
        this.lastName=lastname;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public void setAccount(Account account){
        this.account=account;
    }
    public Account getAccount(){
        return this.account;
    }
}
