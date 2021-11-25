package justSomeExercises;

import java.util.Arrays;

public class ArrayExercises {

	private static int[] vector;
	private static int howLong;

	public static void main(String[] args) {

		howLong = 3;
		vector = new int[howLong];

		printVectorLength(vector);
		fillVector(vector, 3);
		// vektorSum(vector);
		System.out.println("Sum of vector = " + vektorSum(vector));

		int[] otherVector = { 1, 3, 7, 9 };
		System.out.println("Sum of other vector = " + vektorSum(otherVector));

		System.out.println("");

	} // end main method

	public static int vektorSum(int[] vektor) {
		int sum = 0;
		for (int i = 0; i < vektor.length; i++) {
			sum += vektor[i];
		}
		return sum;
	}

	public static void printVectorLength(int[] vector) {

		System.out.println("Length of vector is " + vector.length);
	}

	public static void fillVector(int[] vector, int factor) {

		for (int j = 0; j < vector.length; j++) {
			vector[j] = j * factor;
			System.out.println("vector [" + j + "] = " + vector[j]);
		}
		System.out.println("Vector contents is: " + Arrays.toString(vector));
	}

}
