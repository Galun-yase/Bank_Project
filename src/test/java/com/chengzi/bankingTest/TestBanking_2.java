package com.chengzi.bankingTest;


import com.chengzi.banking.Account;
import com.chengzi.banking.Customer;

public class TestBanking_2 {

  public static void main(String[] args) {
    Customer customer;
    Account account;

    // Create an account that can has a 500.00 balance.
    System.out.println("Creating the customer Jane Smith.");
    customer=new Customer("Jane","Smith");
    //code
    System.out.println("Creating her account with a 500.00 balance.");

    customer.setAccount(new Account(500));
    //code
    System.out.println("Withdraw 150.00");
    customer.getAccount().withdraw(150.00);
	//code
    System.out.println("Deposit 22.50");
  	//code
    customer.getAccount().deposit(22.50);

    System.out.println("Withdraw 47.62");
   	//code
    customer.getAccount().withdraw(47.62);
    // Print out the final account balance
    System.out.println("Customer [" + customer.getLastName()
		       + ", " + customer.getFirstName()
		       + "] has a balance of " + customer.getAccount().getBalance());
  }
}
