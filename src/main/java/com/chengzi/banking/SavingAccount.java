package com.chengzi.banking;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(double init_balance,double interest_rate){
        super(init_balance);
        this.interestRate=interest_rate;
    }
    public double getInterestRate(){
        return this.interestRate;
    }
}
