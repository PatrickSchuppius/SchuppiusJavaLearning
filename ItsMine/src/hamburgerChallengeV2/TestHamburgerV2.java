package hamburgerChallengeV2;

public class TestHamburgerV2 {

	public static void main(String[] args) {

		Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
		hamburger.addHamburgerAddition1("Tomato", 0.27);
		hamburger.addHamburgerAddition2("Lettuce", 0.75);
		hamburger.addHamburgerAddition3("Cheese", 1.13);
		System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

		HealthyBurger healthyburger = new HealthyBurger("Bacon", 5.67);
		healthyburger.addHamburgerAddition1("Egg", 5.43);
		healthyburger.addHealthyAddition1("Lentils", 3.41);
		System.out.println("Total Healthy Burger price is " + healthyburger.itemizeHamburger());

		DeluxeBurger db = new DeluxeBurger();
		db.addHamburgerAddition3("Should not do this", 50.53);
		// System.out.printf("Total Deluxe Burger price is %.2f", db.itemizeHamburger());
		// System.out.format("Total Deluxe Burger price is %.2f", db.itemizeHamburger());
		System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
	}

}
