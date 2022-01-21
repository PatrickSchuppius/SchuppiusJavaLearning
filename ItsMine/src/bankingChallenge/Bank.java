package bankingChallenge;

import java.util.ArrayList;

public class Bank {

	private String name;
	private ArrayList<Branch> branches;

	public Bank(String name) {
		this.name = name;
		this.branches = new ArrayList<>();
	}

	public boolean addBranch(String nameOfTheBranch) {

		if (findBranch(nameOfTheBranch) == null) {
			Branch newBranch = new Branch(nameOfTheBranch);
			branches.add(newBranch);
			return true;
		}

		System.out.println("Branch " + nameOfTheBranch + " does already exist!");
		return false;

	}

	public boolean addCustomer(String nameOfTheBranch, String nameOfTheCustomer, double initialTransaction) {

		Branch actualBranch = findBranch(nameOfTheBranch);

		if (actualBranch == null) {
			System.out.println("Branch " + nameOfTheBranch + " does not exist!");
			return false;
		}

		return actualBranch.newCustomer(nameOfTheCustomer, initialTransaction);

	}

	public boolean addCustomerTransaction(String nameOfTheBranch, String nameOfTheCustomer, double transaction) {

		Branch actualBranch = findBranch(nameOfTheBranch);
		if (actualBranch == null) {
			System.out.println("Branch " + nameOfTheBranch + " does not exist!");
			return false;
		}

		return actualBranch.addCustomerTransaction(nameOfTheCustomer, transaction);

	}

	private Branch findBranch(String nameOfTheBranch) {

		for (int i = 0; i < branches.size(); i++) {
			if (branches.get(i).getName() == nameOfTheBranch) {
				return branches.get(i);
			}
		}
		return null;
	}

	public boolean listCustomers(String nameOfTheBranch, boolean printTransactions) {

		Branch actualBranch = findBranch(nameOfTheBranch);

		if (actualBranch == null) {

			System.out.println("Branch " + nameOfTheBranch + " does not exist!");
			return false;
		}

		System.out.println("Customer details for branch " + nameOfTheBranch);
		for (int i = 0; i < actualBranch.getCustomers().size(); i++) {
			Customer actualCustomer = actualBranch.getCustomers().get(i);
			System.out.println("Customer: " + actualCustomer.getName() + "[" + (i + 1) + "]");
			// System.out.println("Customer: " + actualBranch.getCustomers().get(i).getName());

			if (printTransactions) {
				System.out.println("Transactions");
				for (int j = 0; j < actualCustomer.getTransactions().size(); j++) {
					System.out.println("[" + (j + 1) + "] Amount " + actualCustomer.getTransactions().get(j));
				}
			}

		}
		return true;

	}

}
