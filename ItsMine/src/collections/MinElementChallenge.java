package collections;

import java.util.Scanner;

public class MinElementChallenge {

	private static Scanner scanner = new Scanner(System.in);
	private static int count = 0;

	public static void main(String[] args) {
		System.out.println("Please enter count:");
		if (scanner.hasNextInt()) {
			count = scanner.nextInt();
			int[] myNumberArray = readIntegers(count);
			System.out.println("The minimum is: " + findMin(myNumberArray));

		}
	}

	// private static int[] readIntegers(int count) {
	// int[] myArray = new int[count];
	// System.out.println("Gib " + count + " Zahlen ein");
	// for (int i = 0; i < count; i++) {
	// if (scanner.hasNextInt()) {
	// myArray[i] = scanner.nextInt();
	// }
	// }
	// return myArray;
	// }

	private static int[] readIntegers(int count) {
		int[] myArray = new int[count];
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("Please enter a number:");
			myArray[i] = scanner.nextInt();
			// der Java Teacher hat hier noch ne Zeile
			// scanner.nextLine();
			// aber bei mir funktioniert es auch ohne
			// er behauptet man bräuchte das, um 'Enter' zu verarbeiten
		}
		return myArray;
	}


	private static int findMin(int[] numberArray) {
		int mini = Integer.MAX_VALUE;
		for (int currentNumber : numberArray) {
			if (currentNumber < mini) {
				mini = currentNumber;
			}
		}
		return mini;
	}

}
