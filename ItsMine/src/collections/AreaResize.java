package collections;

import java.util.Scanner;

public class AreaResize {

	private static Scanner scanner = new Scanner(System.in);

	// private static int[] baseData = { 1, 3, 5, 7, 9 };
	private static int[] baseData = new int[5];

	public static void main(String[] args) {

		System.out.println("Enter 5 integers");
		getInput();
		printArray(baseData);
		// resizeArray(baseData);
		resizeArray();
		printArray(baseData);
		System.out.println(baseData.length);
		System.out.println("Enter 8 integers");
		getInput();
		printArray(baseData);
	} // end main

	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// public static void resizeArray(int[] baseData) {
	public static void resizeArray() {
		int[] original = baseData; // erstellt neue Referenz auf existierendes Array
		baseData = new int[8]; // erstellt NEUES Array Länge 8 und switcht die Referenz basedata auf dies neue Array
		for (int i = 0; i < original.length; i++) {
			baseData[i] = original[i];
		}
	}

	public static void getInput() {
		for (int i = 0; i < baseData.length; i++) {
			baseData[i] = scanner.nextInt();
		}
	}

}
