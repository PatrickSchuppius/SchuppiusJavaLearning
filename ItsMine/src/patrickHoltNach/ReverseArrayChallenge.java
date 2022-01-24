package patrickHoltNach;

import java.util.Arrays;

public class ReverseArrayChallenge {

	public static void main(String[] args) {
		int[] myTestArray = { 1, 2, 3, 4, 5, 6, 7 };
		reverse(myTestArray);

	}

	private static void reverse(int[] intArray) {
		System.out.println("Array = " + Arrays.toString(intArray));

		int flooredHalfOfArraySize = Math.floorDiv(intArray.length, 2);
		for (int i = 0; i <= flooredHalfOfArraySize - 1; i++) {
			int  firstToExchange = intArray[i];
			int secondToExchange = intArray[intArray.length - i - 1];
			
			intArray[i] = secondToExchange;
			intArray[intArray.length - i - 1] = firstToExchange;
		}

		System.out.println("Reversed array = " + Arrays.toString(intArray));
	}

}
