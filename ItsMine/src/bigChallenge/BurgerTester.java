package bigChallenge;

import java.util.Scanner;

public class BurgerTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int chosenBurgerType;
		String chosenBreadType = "";
		String chosenMeatType = "";

		// select burger type
		while (true) {
			System.out.println("Which kind of burger do you want? 1 for Standard, 2 for Healthy, 3 for Deluxe!");
			if (scanner.hasNextInt()) {
				chosenBurgerType = scanner.nextInt();
				if (chosenBurgerType == 1 || chosenBurgerType == 2 || chosenBurgerType == 3) {
					break;
				}
			} else {
				System.out.println("Wrong input: " + scanner.next());
			}
		}

		// select bread type
		if (chosenBurgerType == 1 || chosenBurgerType == 3) {
			System.out.println("What kind of bread roll type do you want?");
			chosenBreadType = scanner.next();
			System.out.println("Selected bread type: " + chosenBreadType);
		}

		// select meat type
		System.out.println("What kind of meat type do you want?");
		chosenMeatType = scanner.next();
		System.out.println("Selected meat type: " + chosenMeatType);

		Hamburger ourBurger;

		switch (chosenBurgerType) {
			case 1: {
				ourBurger = new StandardBurger(chosenBreadType, chosenMeatType);
				break;
			}
			case 2: {
				ourBurger = new HealthyBurger(chosenMeatType);
				break;
			}
			case 3: {
				ourBurger = new DeLuxeBurger(chosenBreadType, chosenMeatType);
				break;
			}
			// should not happen to reach the default branch
			default: {
				ourBurger = new StandardBurger(chosenBreadType, chosenMeatType);
			}
		}

		System.out.println(
				"You selected the burger type " + ourBurger.getName() + " with " + ourBurger.getBreadRollType() + " bread and "
						+ chosenMeatType);
		System.out.println("The basic price is " + ourBurger.getPrice() + " €");

		if (ourBurger.getMaxNoOfAdditions() > 0) {
			System.out.println("Please select up to " + ourBurger.getMaxNoOfAdditions() + " additions");
		} else {
			System.out.println("No additions possible!");
		}

		for (int i = 1; i <= ourBurger.getMaxNoOfAdditions(); i++) {
			System.out.println("Choose your additions!");
			System.out.println(ourBurger.getPossibleSelections());
			int chosenAddition = scanner.nextInt();
			if (chosenAddition > 6 || chosenAddition < 0) {
				System.out.println("Invalid Input. Retry!");
				i--;
				continue;
			} else if (chosenAddition == 0) {
				System.out.println("Ok, das wars!");
				break;
			} // end if

			boolean burgerDecoratedOk = ourBurger.decorateHamburger(chosenAddition);
			if (burgerDecoratedOk) {
				System.out.println("New price is: " + ourBurger.getPrice() + " €");
			} else {
				i--;
				continue;
			}

		} // end loop

		scanner.close();
		System.out.println("Final Invoice:");
		System.out.println(ourBurger.getName() + " with " + ourBurger.getBreadRollType() + " bread and " + ourBurger.getMeatType() + " meat");
	System.out.println("with following additions:");

	if (ourBurger.getOptionalTomatoes() != null) {
		System.out.println("Tomatoes selected. Extra price: " + ExtraTomatoes.EXTRA_TOMATOES_PRICE + " €");
	}
	if (ourBurger.getOptionalLettuce() != null) {
		System.out.println("Lettuce selected. Extra price: " + ExtraLettuce.EXTRA_LETTUCE_PRICE + " €");
	}
	if (ourBurger.getOptionalMayonnaise() != null) {
		System.out.println("Mayonnaise selected. Extra price: " + ExtraMayonnaise.EXTRA_MAYONNAISE_PRICE + " €");
	}
	if (ourBurger.getOptionalCheddar() != null) {
		System.out.println("Cheddar selected. Extra price: " + ExtraCheddar.EXTRA_CHEDDAR_PRICE + " €");
	}
	if (ourBurger.getOptionalCarrots() != null) {
		System.out.println("Carrots selected. Extra price: " + ExtraCarrots.EXTRA_CARROTS_PRICE + " €");
	}
	if (ourBurger.getOptionalCucumber() != null) {
		System.out.println("Cucumber selected. Extra price: " + ExtraCucumber.EXTRA_CUCUMBER_PRICE + " €");
	}
	System.out.println("Total price is: " + ourBurger.getPrice() + " €");
	}
}
