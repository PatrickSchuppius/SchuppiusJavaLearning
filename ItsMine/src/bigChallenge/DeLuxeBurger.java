package bigChallenge;


public class DeLuxeBurger extends Hamburger {

	private static final String DELUXE_BURGER_NAME = "De Luxe Burger";
	private static final double DELUXE_BURGER_BASIC_PRICE = 8.0;
	private static final int DELUXE_BURGER_MAX_NO_OF_ADDITIONS = 0;
	private static final String POSSIBLE_SELECTIONS = "0 for nothing more";

	private static final boolean TOMATOES_ALLOWED = false;
	private static final boolean LETTUCE_ALLOWED = false;
	private static final boolean MAYONNAISE_ALLOWED = false;
	private static final boolean CHEDDAR_ALLOWED = false;
	private static final boolean CARROTS_ALLOWED = false;
	private static final boolean CUCUMBER_ALLOWED = false;

	public DeLuxeBurger(String breadRollType, String meatType) {
		super(
			DELUXE_BURGER_NAME,
			breadRollType,
			meatType,
			DELUXE_BURGER_BASIC_PRICE,
			DELUXE_BURGER_MAX_NO_OF_ADDITIONS,
			POSSIBLE_SELECTIONS,
			TOMATOES_ALLOWED,
			LETTUCE_ALLOWED,
			MAYONNAISE_ALLOWED,
			CHEDDAR_ALLOWED,
			CARROTS_ALLOWED,
			CUCUMBER_ALLOWED);
	}

}
