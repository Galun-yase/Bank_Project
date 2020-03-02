package com.chengzi.banking;

public class CheckingAccount extends Account {
    private double overdraftProtection;

    public CheckingAccount(double init_balance){
        super(init_balance);
    }
    public CheckingAccount(double init_balance,double init_protect){
        super(init_balance);
        this.overdraftProtection=init_protect;
    }

    @Override
    public boolean withdraw(double dec_balance) {
        boolean issuccess=false;
        if (dec_balance <= super.balance) {
            super.balance -= dec_balance;
            issuccess=true;
        } else if (super.balance - dec_balance + this.overdraftProtection >= 0) {
            this.overdraftProtection = super.balance + this.overdraftProtection - dec_balance;
            super.balance = 0;
            issuccess=true;
        } else if (super.balance - dec_balance + this.overdraftProtection < 0) {
            issuccess=false;
        }
        return issuccess;
    }
}
