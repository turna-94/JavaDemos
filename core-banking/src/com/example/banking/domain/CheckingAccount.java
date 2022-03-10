package com.example.banking.domain;

public class CheckingAccount extends Account{
	
	private double overdraftAmount;

	public CheckingAccount(String iban, double balance,double overdraftAmount) {
		super(iban, balance);
		this.overdraftAmount=overdraftAmount;
	}

	public double getOverdraftAmount() {
		return overdraftAmount;
	}

	public void setOverdraftAmount(double overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}
	
	public boolean withDraw(double amount) {
		if(amount<=0.0) {
			System.out.println("Amount must be positive");
			return false;
		}
		if(amount>balance+overdraftAmount) {
			System.out.println("Your balance does not cover your expenses "+(amount-balance-overdraftAmount));
			return false;
		}
		this.balance=balance-amount;
		return true;
	}
}
