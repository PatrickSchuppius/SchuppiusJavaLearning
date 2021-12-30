package BankingChallenge;

import java.util.ArrayList;

public class Branch {

	private String name;
	private ArrayList<Customer> customers;

	public Branch(String nameOfTheBranch) {
		this.name = nameOfTheBranch;
		this.customers = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public boolean newCustomer(String nameOfCustomer, double initialTransaction) {

		Customer actualCustomer = findCustomer(nameOfCustomer);

		if (actualCustomer != null) {
			System.out.println("Customer " + nameOfCustomer + " already exists!");
			return false;
		}

		Customer newCustomer = new Customer(nameOfCustomer, initialTransaction);
		customers.add(newCustomer);
		return true;
	}


	public boolean addCustomerTransaction(String nameOfCustomer, double transaction) {

		Customer actualCustomer = findCustomer(nameOfCustomer);

		if (actualCustomer == null) {
			System.out.println("Customer " + nameOfCustomer + " does not exist!");
			return false;
		}
		actualCustomer.addTransaction(transaction);
		return true;
	}


	private Customer findCustomer(String nameOfCustomer) {
		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).getName() == nameOfCustomer) {
				return customers.get(i);
			}
		}
		return null;
	}

}
