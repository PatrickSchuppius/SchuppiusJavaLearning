package justSomeExercises;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<String> placesToVisit = new LinkedList<>();

		placesToVisit.add("Hamburg");
		placesToVisit.add("Kiel");
		placesToVisit.add("Berlin");
		placesToVisit.add("Eckernfoerde");
		placesToVisit.add("Balderschwang");
		placesToVisit.add("Nenndorf");
		placesToVisit.add("Ziemendorf");

		printList(placesToVisit);

		placesToVisit.add("Bayreuth");

		printList(placesToVisit);

		placesToVisit.add(5, "Neuschwanstein");

		printList(placesToVisit);

		placesToVisit.remove("Berlin");

		printList(placesToVisit);

		LinkedList<String> firstNames = new LinkedList<>();

		addInOrder(firstNames, "Patrick");
		printList(firstNames);
		addInOrder(firstNames, "Meiko");
		printList(firstNames);
		addInOrder(firstNames, "Wiebke");
		printList(firstNames);
		addInOrder(firstNames, "Anna");
		printList(firstNames);
		addInOrder(firstNames, "Klaus");
		printList(firstNames);

	}

	private static void printList(LinkedList<String> linkedList) {

		Iterator<String> city = linkedList.iterator();
		while (city.hasNext()) {
			System.out.println("Now visiting " + city.next());
		}
		System.out.println("========== end =============");
	}

	private static boolean addInOrder(LinkedList<String> linkedList, String nameToAdd) {
		ListIterator<String> stringListIterator = linkedList.listIterator();

		while (stringListIterator.hasNext()) {
			int compareResult = stringListIterator.next().compareTo(nameToAdd);
			if (compareResult == 0) {
				// equal, do not add
				System.out.println(nameToAdd + " was already in the list");
				return false;
			} else if (compareResult > 0) {
				// next element > than nameToAdd, new name should be inserted before this one
				stringListIterator.previous(); // go back to prvious list entry
				stringListIterator.add(nameToAdd);
				return true;
			}
		}
		stringListIterator.add(nameToAdd);
		return true;
	}

}
