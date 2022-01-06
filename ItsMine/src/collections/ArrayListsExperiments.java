package collections;

import java.util.ArrayList;

public class ArrayListsExperiments {

	private ArrayList<String> groceryList = new ArrayList<>(); // empty constructor of ArrayList class


	public static void main(String[] args) {

	}

	public void addGroceryItem(String item) {
		groceryList.add(item);
	}

	public void printGroceryList() {
		System.out.println("You have " + groceryList.size() + " items in your list");
		for (int i = 0; i < groceryList.size(); i++) {
			System.out.println((i + 1) + ". " + groceryList.get(i));
		}
	}

	public void modifyGroceryList(int position, String newItem) {
		groceryList.set(position, newItem);
	}

	public void removeGroceryItem(int position) {
		String theItem = groceryList.get(position);
		groceryList.remove(position);
		System.out.println("Item " + theItem + " removed");
	}

}
