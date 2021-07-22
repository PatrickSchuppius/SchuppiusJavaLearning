package FirstSteps;

import java.util.Scanner;

public class InputCalculator {

	public static void main(String[] args) {

		inputThenPrintSumAndAverage();

	}

	public static void inputThenPrintSumAndAverage() {

		Scanner scanner = new Scanner(System.in);
		boolean nextInputIsInt = true;
		int summe = 0;
		long avg = 0;
		int anzahlIntegers = 0;

		while (nextInputIsInt) {

			nextInputIsInt = scanner.hasNextInt();

			if (nextInputIsInt) {

				summe = summe + scanner.nextInt();
				anzahlIntegers++;
				avg = Math.round(summe / anzahlIntegers);

			} else {

				System.out.println("SUM = " + summe + " AVG = " + avg);
			}

		}

	}

}
