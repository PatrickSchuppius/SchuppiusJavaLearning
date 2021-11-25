package justSomeExercises;

import java.util.Scanner;

public class CalculatorMain {

	private static Scanner scanner = new Scanner(System.in);
	private static int intA, intB;
	private static char operator;
	private static String operatorInput;

	public static void main(String[] args) {

		System.out.println("Ganzzahliger Taschenrechner. Gib eine Aufgabe ein:");

		if (scanner.hasNextInt()) {

			intA = scanner.nextInt();

			operatorInput = scanner.next();

			if (operatorInput.length() == 1) {

				operator = operatorInput.charAt(0);
				if (operator == '+' || operator == '-' || operator == 'x' || operator == '/' && intB != 0) {

					if (scanner.hasNextInt()) {
						intB = scanner.nextInt();

						Calculator myCalculator = new Calculator(intA, intB, operator);
						System.out.println("Ergebnis: " + myCalculator.calculate());

					} else {
						denyInput();
					}
				} else {
					denyInput();
				}

			} else {
				denyInput();
			}

		} else {
			denyInput();
		}

	} // end main

	private static void denyInput() {
		System.out.println("invalid input!");
	}
}
