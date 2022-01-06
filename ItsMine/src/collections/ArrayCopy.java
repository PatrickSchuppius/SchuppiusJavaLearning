package collections;

public class ArrayCopy {

	public static void main(String[] args) {

		int[] arrayA = new int[3];
		int[] arrayB = new int[3];

		arrayA[0] = 11;
		arrayA[1] = 22;
		arrayA[2] = 33;

		arrayCopy(arrayA, arrayB);
		printArray(arrayA);
		printArray(arrayB);

		int[] arrayC = new int[3];
		arrayC = arrayA.clone();
		printArray(arrayC);

	} // end main

	public static void arrayCopy(int[] originalArray, int[] copyArray) {
		for (int i = 0; i < copyArray.length; i++) {
			copyArray[i] = originalArray[i];
		}
	}

	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
			System.out.println();
		}
	}

}
