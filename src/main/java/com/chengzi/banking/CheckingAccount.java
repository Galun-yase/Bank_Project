package com.chengzi.banking;

import com.chengzi.banking.domain.OverdraftException;

public class CheckingAccount extends Account {
    //private double overdraftProtection;
    private SavingAccount protectedBy=null;

    public CheckingAccount(double init_balance){
        super(init_balance);
    }
    public CheckingAccount(double init_balance,SavingAccount init_protect){
        super(init_balance);
        this.protectedBy=init_protect;
    }

    @Override
    public void withdraw(double dec_balance) throws OverdraftException {
        if (dec_balance <= super.balance) {
            super.balance -= dec_balance;
        }else{
            if(this.protectedBy!=null){
                if(protectedBy.balance>=dec_balance-super.balance){
                    protectedBy.balance-=(dec_balance-super.balance);
                    super.balance=0;
                }else{
                    throw new OverdraftException("Insufficient funds for overdraft protection",dec_balance-super.balance-protectedBy.balance);
                }
            }else{
                throw new OverdraftException("no overdraft protection",dec_balance-super.balance);
            }

        }

    }
}
