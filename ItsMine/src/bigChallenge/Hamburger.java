package bigChallenge;

public class Hamburger {

	private String breadRollType;
	private String meatType;
	private double price;
	private String name;
	private int maxNoOfAdditions;
	private String possibleSelections;

	private BurgerAddition optionalTomatoes;
	private BurgerAddition optionalLettuce;
	private BurgerAddition optionalMayonnaise;
	private BurgerAddition optionalCheddar;
	private BurgerAddition optionalCarrots;
	private BurgerAddition optionalCucumber;

	private boolean tomatoesAllowed;
	private boolean lettuceAllowed;
	private boolean mayonnaiseAllowed;
	private boolean cheddarAllowed;
	private boolean carrotsAllowed;
	private boolean cucumberAllowed;

	public Hamburger(
			String name,
			String breadRollType,
			String meatType,
			double price,
			int maxNoOfAdditions,
			String possibleSelections,
			boolean tomatoesAllowed,
			boolean lettuceAllowed,
			boolean mayonnaiseAllowed,
			boolean cheddarAllowed,
			boolean carrotsAllowed,
			boolean cucumberAllowed
			) {
		// super();
		this.breadRollType = breadRollType;
		this.meatType = meatType;
		this.price = price;
		this.name = name;
		this.maxNoOfAdditions = maxNoOfAdditions;
		this.possibleSelections = possibleSelections;
		this.tomatoesAllowed = tomatoesAllowed;
		this.lettuceAllowed = lettuceAllowed;
		this.mayonnaiseAllowed = mayonnaiseAllowed;
		this.cheddarAllowed = cheddarAllowed;
		this.carrotsAllowed = carrotsAllowed;
		this.cucumberAllowed = cucumberAllowed;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public String getBreadRollType() {
		return breadRollType;
	}

	public String getMeatType() {
		return meatType;
	}

	public int getMaxNoOfAdditions() {
		return maxNoOfAdditions;
	}

	public BurgerAddition getOptionalTomatoes() {
		return optionalTomatoes;
	}

	public BurgerAddition getOptionalLettuce() {
		return optionalLettuce;
	}

	public BurgerAddition getOptionalMayonnaise() {
		return optionalMayonnaise;
	}

	public BurgerAddition getOptionalCheddar() {
		return optionalCheddar;
	}

	public BurgerAddition getOptionalCarrots() {
		return optionalCarrots;
	}

	public BurgerAddition getOptionalCucumber() {
		return optionalCucumber;
	}

	public String getPossibleSelections() {
		return possibleSelections;
	}

	public boolean decorateHamburger(int chosenAdditionCode) {
		switch (chosenAdditionCode) {
			case 1:
				if (!tomatoesAllowed) {
					System.out.println("Tomatoes are not allowed on this burger type!");
					return false;
				} 
				if (optionalTomatoes != null) {
					System.out.println("Tomatoes are already on the burger!");
					return false;
				} 
				this.optionalTomatoes = new ExtraTomatoes();
				this.price += optionalTomatoes.getPrice();
				System.out.println("Tomatoes added!");
				return true;
			case 2:
				if (!lettuceAllowed) {
					System.out.println("Lettuce is not allowed on this burger type!");
					return false;
				}
				if (optionalLettuce != null) {
					System.out.println("Lettuce is already on the burger!");
					return false;
				}
				this.optionalLettuce = new ExtraLettuce();
				this.price += optionalLettuce.getPrice();
				System.out.println("Lettuce added!");
				return true;
			case 3:
				if (!mayonnaiseAllowed) {
					System.out.println("Mayonnaise is not allowed on this burger type!");
					return false;
				}
				if (optionalMayonnaise != null) {
					System.out.println("Mayonnaise is already on the burger!");
					return false;
				}
				this.optionalMayonnaise = new ExtraMayonnaise();
				this.price += optionalMayonnaise.getPrice();
				System.out.println("Mayonnaise added!");
				return true;
			case 4:
				if (!cheddarAllowed) {
					System.out.println("Cheddar is not allowed on this burger type!");
					return false;
				}
				if (optionalCheddar != null) {
					System.out.println("Cheddar is already on the burger!");
					return false;
				}
				this.optionalCheddar = new ExtraCheddar();
				this.price += optionalCheddar.getPrice();
				System.out.println("Cheddar added!");
				return true;
			case 5:
				if (!carrotsAllowed) {
					System.out.println("Carrots are not allowed on this burger type!");
					return false;
				}
				if (optionalCarrots != null) {
					System.out.println("Carrots already on the burger!");
					return false;
				}
				this.optionalCarrots = new ExtraCarrots();
				this.price += optionalCarrots.getPrice();
				System.out.println("Carrots added!");
				return true;
			case 6:
				if (!cucumberAllowed) {
					System.out.println("Cucumber is not allowed on this burger type!");
					return false;
				}
				if (optionalCucumber != null) {
					System.out.println("Cucumber is already on the burger!");
					return false;
				}
				this.optionalCucumber = new ExtraCucumber();
				this.price += optionalCucumber.getPrice();
				System.out.println("Cucumber added!");
				return true;

			default:
				return false;
		}

	}


}
