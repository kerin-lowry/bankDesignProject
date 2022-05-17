package com.fdmgroup.bankDesignProject;

public abstract class Account {

	private final long ACCOUNT_ID;
	private static long nextAccountId = 1000;
	protected double balance;

	// constructor
	public Account() {
		super();
		ACCOUNT_ID = nextAccountId;
		Account.nextAccountId += 5;
	}

	// methods
	public double withdraw(double amount) {
		balance -= amount;
		return amount;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void correctBalance(double amount) {
		this.balance = amount;
	}

	public long getACCOUNT_ID() {
		return ACCOUNT_ID;
	}

	public double getBalance() {
		return balance;
	}

}
