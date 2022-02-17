package patrickHoltNach;

import java.util.ArrayList;

public class LinkedList {

	public static void main(String args[]) {
		Customer customer = new Customer("Patrick", 54.55);
		Customer anotherCustomer = customer;

		anotherCustomer.setBalance(16.55);

		System.out.println("customer.balance = " + customer.getBalance());
		System.out.println("anotherCustomer.balance = " + anotherCustomer.getBalance());
		
		
		ArrayList<Integer> intList = new ArrayList<>();

		intList.add(3);
		intList.add(50);
		intList.add(44);
		intList.add(26);
	}

}
