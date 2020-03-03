package com.chengzi.banking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {
    private List<Customer> customers;//客户数组


    private Bank(){
        customers=new ArrayList<Customer>();
    }
    private static Bank instance=new Bank();
    public static Bank getBanking(){
        return Bank.instance;
    }



    public void addCustomer(String fname,String lname){
        customers.add(new Customer(fname,lname));

    }
    public int getNumberOfCustomers(){
        return customers.size();
    }
    public Customer getCustomer(int index){
        return customers.get(index);
    }

    public Iterator<Customer> getCustomers(){
        return customers.iterator();
    }
}
