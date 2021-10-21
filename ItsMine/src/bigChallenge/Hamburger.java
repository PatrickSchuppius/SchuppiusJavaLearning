package bigChallenge;


public class Hamburger {

	private String breadRollType;
	private String meatType;
	private double basePrice;
	private String burgerName;

	private BurgerAddition optionalAddition1;
	private BurgerAddition optionalAddition2;
	private BurgerAddition optionalAddition3;
	private BurgerAddition optionalAddition4;


	public Hamburger(String breadRollType, String meatType) {
		super();
		this.breadRollType = breadRollType;
		this.meatType = meatType;
		this.basePrice = 3.5;
		this.burgerName = "Standard";
	}

	public boolean decorateHamburger(int chosenAdditionCode) {
		switch (chosenAdditionCode) {
			case 1:
				if (optionalAddition1 != null) {
					System.out.println("Tomatoes are already on the burger!");
					return false;
				}
				this.optionalAddition1 = new ExtraTomatoes();
				System.out.println("Tomatoes added!");
				return true;
			case 2:
				if (optionalAddition2 != null) {
					System.out.println("Lettuce is already on the burger!");
					return false;
				}
				this.optionalAddition2 = new ExtraLettuce();
				System.out.println("Lettuce added!");
				return true;
			case 3:
				if (optionalAddition3 != null) {
					System.out.println("Carrots are already on the burger!");
					return false;
				}
				this.optionalAddition3 = new ExtraCarrots();
				System.out.println("Carrots added!");
				return true;
			case 4:
				if (optionalAddition4 != null) {
					System.out.println("Cheddar is already on the burger!");
					return false;
				}
				this.optionalAddition4 = new ExtraCheddar();
				System.out.println("Cheddar added!");
				return true;
			default:
				return false;
		}
		

	}


}
