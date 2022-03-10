package com.example.banking.application;

import com.example.banking.domain.Account;
import com.example.banking.domain.CheckingAccount;
import com.example.banking.domain.SavingsAccount;

public class BankingApp {

	public static void main(String[] args) {
		
		Account account=new SavingsAccount("TR123",1000,2.3);
		System.out.println(account.getBalance());
		
		Account account2=new CheckingAccount("TR235", 1000, 1000);
		System.out.println(account2.deposit(500));
		
		System.out.println(account2.withDraw(4000));
	}

}
