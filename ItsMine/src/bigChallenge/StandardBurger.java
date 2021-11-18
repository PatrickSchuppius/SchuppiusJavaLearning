package bigChallenge;


public class StandardBurger extends Hamburger {

	private static final String STANDARD_BURGER_NAME = "Standard Burger";
	private static final double STANDARD_BURGER_BASIC_PRICE = 3.5;
	private static final int STANDARD_BURGER_MAX_NO_OF_ADDITIONS = 4;
	private static final String POSSIBLE_SELECTIONS = "1 for Tomatoes, 2 for Lettuce, 3 for Mayonnaise, 4 for Cheddar, "
			+ "0 for nothing more";

	private static final boolean TOMATOES_ALLOWED = true;
	private static final boolean LETTUCE_ALLOWED = true;
	private static final boolean MAYONNAISE_ALLOWED = true;
	private static final boolean CHEDDAR_ALLOWED = true;
	private static final boolean CARROTS_ALLOWED = false;
	private static final boolean CUCUMBER_ALLOWED = false;

	public StandardBurger(String breadRollType, String meatType) {
		super(
			STANDARD_BURGER_NAME,
			breadRollType,
			meatType,
			STANDARD_BURGER_BASIC_PRICE,
			STANDARD_BURGER_MAX_NO_OF_ADDITIONS,
			POSSIBLE_SELECTIONS,
			TOMATOES_ALLOWED,
			LETTUCE_ALLOWED,
			MAYONNAISE_ALLOWED,
			CHEDDAR_ALLOWED,
			CARROTS_ALLOWED,
			CUCUMBER_ALLOWED);

	}

}
