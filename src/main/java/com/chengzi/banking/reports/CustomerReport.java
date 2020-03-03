package com.chengzi.banking.reports;

import com.chengzi.banking.Account;
import com.chengzi.banking.Bank;
import com.chengzi.banking.CheckingAccount;
import com.chengzi.banking.Customer;
import com.chengzi.banking.SavingAccount;

import java.util.Iterator;

public class CustomerReport {

    Bank bank=Bank.getBanking();
    Customer customer=null;
    public void generateReport(){
//        for (int i=0;i<bank.getNumberOfCustomers();i++){
//            customer = bank.getCustomer(i);
//            System.out.println("Customer:" + customer.getFirstName() + "," + customer.getLastName());
//
//
//            for (int j = 0; j <customer.getNumOfAccounts() ; j++) {
//                Account account=customer.getAccount(j);
//                String account_type="";
//
//                if(account instanceof SavingAccount){
//                    account_type="Savings Account";
//                }else if(account instanceof CheckingAccount){
//                    account_type="Checking Account";
//                }
//                System.out.println("    "+account_type+":current balance is $" + account.getBalance());
//            }
//
//        }
        Iterator<Customer> customers=bank.getCustomers();
        while(customers.hasNext()){
            customer=customers.next();

            System.out.println("Customer:" + customer.getFirstName() + "," + customer.getLastName());
            Iterator<Account> accounts=customer.getAccounts();
            while(accounts.hasNext()){
                Account account=accounts.next();
                String account_type="";

                if(account instanceof SavingAccount){
                    account_type="Savings Account";
                }else if(account instanceof CheckingAccount){
                    account_type="Checking Account";
                }
                System.out.println("    "+account_type+":current balance is $" + account.getBalance());
        }
        }

    }
}
