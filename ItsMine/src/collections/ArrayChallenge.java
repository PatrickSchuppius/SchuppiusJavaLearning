package collections;

import java.util.Scanner;

public class ArrayChallenge {

	public static void main(String[] args) {

		int arrayLength = 5;
		int[] arrayToBeSorted = getIntegers(arrayLength);

		printArray(arrayToBeSorted);

		printArray(sortIntegers(arrayToBeSorted));

	} // end main method

	public static int[] getIntegers(int arrayLength) {

		int[] numberArray = new int[arrayLength];
		int arrayIndex = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Gib " + arrayLength + " Integers ein");

		while (arrayIndex < arrayLength) {
			if (scanner.hasNextInt()) {
				numberArray[arrayIndex] = scanner.nextInt();
				arrayIndex++;
			}
			scanner.nextLine();
		}

		return numberArray;
	}

	public static void printArray(int[] printArray) {

		for (int number : printArray) {
			System.out.println(number);
		}

	}

	public static int[] sortIntegers(int[] sortArray) {
		int tempSave = 0;
		boolean haveSomethingSorted = true;
		while (haveSomethingSorted) {
			haveSomethingSorted = false;
			for (int i = 0; i < sortArray.length - 1; i++) {
				if (sortArray[i] < sortArray[i + 1]) {
					tempSave = sortArray[i];
					sortArray[i] = sortArray[i + 1];
					sortArray[i + 1] = tempSave;
					haveSomethingSorted = true;
				}
			}
		}
		return sortArray;

	}

}
