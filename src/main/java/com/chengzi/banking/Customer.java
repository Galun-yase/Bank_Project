package com.chengzi.banking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {
    private String firstName;
    private String lastName;
    private List<Account> accounts;


    public Customer(String firstname,String lastname){
        this.firstName=firstname;
        this.lastName=lastname;
        accounts=new ArrayList<Account>();
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public void addAccount(Account account){
        accounts.add(account);

    }
    public Account getAccount(int index){
        return this.accounts.get(index);
    }
    public int getNumOfAccounts(){
        return this.accounts.size();
    }

    public Iterator<Account> getAccounts(){
        return this.accounts.iterator();
    }


}
