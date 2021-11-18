package FirstSteps;

import java.util.Scanner;

public class ReadingUserInputChallenge {

	public static void main(String[] args) {


		// Variante 1
		 Scanner scanner = new Scanner(System.in);
		
		 System.out.println ("Enter your year of birth:");
			boolean hasnextInt = false;
			hasnextInt = scanner.hasNextInt();

			if (hasnextInt) {

				int yearOfBirth = scanner.nextInt();
				// scanner.nextLine(); // handle next line character (enter key)

				System.out.println("Enter your name: ");
				String name = scanner.next();

				int age = 2021 - yearOfBirth;

				System.out.println("Your name is " + name + " and you are " + age + " years old.");

			} else {

				System.out.println("Du Bösewicht, du sollst eine Jahreszahl eingeben!");

			}
		 scanner.close();

		// Variante 2
		// Scanner scanner = new Scanner(System.in);
		// int zaehler = 1;
		// int summe = 0;
		//
		// while (zaehler <= 10) {
		//
		// System.out.println("Enter number #" + zaehler + ":");
		// boolean hasnextInt = scanner.hasNextInt();
		//
		// // System.out.println("Du hast eingegeben: " + userInput);
		//
		// if (!hasnextInt) {
		// System.out.println("Invalid Number!");
		// } else {
		// int userInput = scanner.nextInt();
		// summe = summe + userInput;
		// zaehler++;
		// }
		// scanner.nextLine();
		// } // ende while
		//
		// System.out.println("Summe ist: " + summe);

//		// Variante 3
//		Scanner scanner = new Scanner(System.in);
//		int zaehler = 1;
//		int summe = 0;
//		
//		while (zaehler <= 10) {
//
//			System.out.println("Enter number #" + zaehler + ":");
//			boolean hasnextInt = scanner.hasNextInt();
//			String userInput = scanner.nextLine();
//
//			System.out.println("Du hast eingegeben: " + userInput);
//
//			if (!hasnextInt) {
//				System.out.println("Invalid Number!");
//			} else {
//				summe = summe + Integer.parseInt(userInput);
//				zaehler++;
//			}
//			// scanner.nextLine();
//		} // ende while
//
//		System.out.println("Summe ist: " + summe);
//		scanner.close();

	}
}
