package bigChallenge;

import java.util.Scanner;

public class BurgerTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int chosenBurgerType;

		while (true) {
			System.out.println("Which kind of burger do you want? 1 for Standard, 2 for Healthy, 3 for Deluxe!");
			chosenBurgerType = scanner.nextInt();
			if (chosenBurgerType == 1 || chosenBurgerType == 2 || chosenBurgerType == 3) {
				break;
			}
		}

		switch (chosenBurgerType) {
			case 1: {
				System.out.println("What kind of bread roll type do you want?");
				String breadType = scanner.nextLine();
				System.out.println("What kind of meat type do you want?");
				String meatType = scanner.nextLine();

				Hamburger ourStandardBurger = new Hamburger(breadType, meatType);

				for (int i = 1; i <= 4; i++) {
					System.out.println(
							"Choose your additions! 1 for Tomatoes, 2 for Lettuce, 3 for Carrots, 4 for Cheddar, 5 for nothing more");
					int chosenAddition = scanner.nextInt();
					if (chosenAddition > 5 || chosenAddition < 1) {
						System.out.println("Invalid Input. Retry!");
						i--;
						continue;
					} else if (chosenAddition == 5) {
						break;
					}
					boolean burgerDecoratedOk = ourStandardBurger.decorateHamburger(chosenAddition);
					if (!burgerDecoratedOk) {
						i--;
					}
				}
			}
		}
	}

}
