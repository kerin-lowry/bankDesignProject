package com.fdmgroup.bankDesignProject;

import java.util.ArrayList;
import java.util.List;

public class AccountController {

	private List<Customer> customers = new ArrayList<Customer>();
	private List<Account> accounts = new ArrayList<Account>();

	// methods
	public Customer createCustomer(String name, String address, String type) {
		if (type.equals("person")) {
			Person person = new Person(name, address);
			customers.add(person);
			return person;
		}
		if (type.equals("company")) {
			Company company = new Company(name, address);
			customers.add(company);
			return company;
		}
		return null;
	}

	public Account createAccount(Customer customer, String type) {
		if (type.equals("checking")) {
			CheckingAccount checkingAccount = new CheckingAccount();
			accounts.add(checkingAccount);
			customer.addAccount(checkingAccount);
			return checkingAccount;
		}
		if (type.equals("savings")) {
			SavingsAccount savingsAccount = new SavingsAccount();
			accounts.add(savingsAccount);
			customer.addAccount(savingsAccount);
			return savingsAccount;
		}
		return null;
	}

	public void removeCustomer(Customer customer) {
		customers.remove(customer);
		accounts.removeAll(customer.getAccounts());
	}

	public void removeAccount(Account account) {
		accounts.remove(account);
		for (Customer customer : getCustomers()) {
			if (customer.getAccounts().contains(account)) {
				customer.removeAccount(account);
			}
		}
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

}
