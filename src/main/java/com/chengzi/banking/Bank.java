package com.chengzi.banking;

public class Bank {
    private Customer[] customers;//客户数组
    private int numberOfCustomers;//客户数量
    public Bank(int init_customer){
        this.customers=new Customer[init_customer];
        this.numberOfCustomers=0;
    }
    public void addCustomer(String fname,String lname){
        customers[this.numberOfCustomers]=new Customer(fname,lname);
        this.numberOfCustomers++;
    }
    public int getNumberOfCustomers(){
        return this.numberOfCustomers;
    }
    public Customer getCustomer(int index){
        return customers[index];
    }
}
