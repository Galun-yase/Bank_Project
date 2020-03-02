package com.chengzi.banking;

public class Account {

    protected double balance;

    public Account(double init_balance){
        this.balance=init_balance;
    }

    public double getBalance(){
        return this.balance;
    }
    public boolean deposit(double add_balance){
        this.balance=this.balance+add_balance;
        return true;
    }
    public boolean withdraw(double dec_balance){
        if(dec_balance<=this.balance){
            this.balance=this.balance-dec_balance;
            return true;
        }else{
            return false;
        }

    }
}
