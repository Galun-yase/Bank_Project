package com.chengzi.bankingTest;

import com.chengzi.banking.Bank;
import com.chengzi.banking.Customer;

public class TestBanking_4 {

  public static void main(String[] args) {
    Bank bank = new Bank(6);

    // Add Customer Jane, Simms
	bank.addCustomer("Jane","Simms");
    //Add Customer Owen, Bryant
	bank.addCustomer("Owen","Bryant");
    // Add Customer Tim, Soley
	bank.addCustomer("Tim","Soley");
    // Add Customer Maria, Soley
	bank.addCustomer(",aria","Soley");
    for ( int i = 0; i < bank.getNumberOfCustomers(); i++ ) {
      Customer customer = bank.getCustomer(i);

      System.out.println("Customer [" + (i+1) + "] is "
			 + customer.getLastName()
			 + ", " + customer.getFirstName());
    }
  }
}
