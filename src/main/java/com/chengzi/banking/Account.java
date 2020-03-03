package com.chengzi.banking;

import com.chengzi.banking.domain.OverdraftException;

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
    public void withdraw(double dec_balance) throws OverdraftException {
        if(dec_balance<=this.balance){
            this.balance=this.balance-dec_balance;
        }else{
            double deficit=dec_balance-this.balance;
            throw new OverdraftException("资金不足",deficit);
        }

    }
}
