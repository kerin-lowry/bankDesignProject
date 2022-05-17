package com.fdmgroup.bankDesignProject;

public class SavingsAccount extends Account {

	private double interestRate;

	// methods
	public void addInterest() {
		double interestDue = (balance * interestRate) / 100;
		balance += interestDue;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			return amount;
		}
		return 0;
	}

}
