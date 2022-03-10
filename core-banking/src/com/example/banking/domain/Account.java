package com.example.banking.domain;

public class Account {
	
	private final String iban;
	double balance;  //private--information hiring
	private AccountStatus status=AccountStatus.ACTIVE;  //0:Active 1:Closed 2:Blocked
	private static int numOfAccounts = 0;
	
	public Account(String iban) {  //constructor
		this(iban,0.0);
	}

	public Account(String iban, double balance) {
		this.iban = iban;
		this.balance = balance;
		this.numOfAccounts++;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
	}

	public String getIban() {
		return iban;
	}

	public double getBalance() {
		return balance;
	}
	
	public boolean deposit(double amount) {
		if(amount<=0.0) {
			System.out.println("Deposit amount must be positive");
			return false;
		}
		this.balance+=amount;
		return true;
	}
	
	public boolean withDraw(double amount) {
		if(amount<=0.0) {
			System.out.println("amount must be positive");
			return false;
		}
		if(amount>balance) {
			System.out.println("Your balance does not cover your expenses"+(amount-balance));
			return false;
		}
		this.balance-=amount;
		return true;
	}
	
	@Override
	public String toString() {
		return "Account [iban=" + iban + ", balance=" + balance + "]";
	}
}
