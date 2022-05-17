package com.fdmgroup.bankDesignProject;

public class Company extends Customer {

	public Company(String name, String address) {
		super(name, address);
	}

	@Override
	public void chargeAllAccounts(double amount) {
		for (Account account : getAccounts()) {
			if (account instanceof SavingsAccount) {
				account.balance -= (2 * amount);
			}
			if (account instanceof CheckingAccount) {
				account.balance -= amount;
			}
		}
	}

}
