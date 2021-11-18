package bigChallenge;


public class HealthyBurger extends Hamburger {

	private static final String HEALTHY_BURGER_NAME = "Healthy Burger";
	private static final String HEALTHY_BREAD_ROLL_TYPE = "Brown Rye";
	private static final double HEALTHY_BURGER_BASIC_PRICE = 4.5;
	private static final int HEALTHY_BURGER_MAX_NO_OF_ADDITIONS = 6;
	private static final String POSSIBLE_SELECTIONS = "1 for Tomatoes, 2 for Lettuce, 3 for Mayonnaise, 4 for Cheddar, "
			+ "5 for Carrots, 6 for Cucumber, 0 for nothing more";

	private static final boolean TOMATOES_ALLOWED = true;
	private static final boolean LETTUCE_ALLOWED = true;
	private static final boolean MAYONNAISE_ALLOWED = true;
	private static final boolean CHEDDAR_ALLOWED = true;
	private static final boolean CARROTS_ALLOWED = true;
	private static final boolean CUCUMBER_ALLOWED = true;

	public HealthyBurger(String meatType) {
		super(
			HEALTHY_BURGER_NAME,
			HEALTHY_BREAD_ROLL_TYPE,
			meatType,
			HEALTHY_BURGER_BASIC_PRICE,
			HEALTHY_BURGER_MAX_NO_OF_ADDITIONS,
			POSSIBLE_SELECTIONS,
			TOMATOES_ALLOWED,
			LETTUCE_ALLOWED,
			MAYONNAISE_ALLOWED,
			CHEDDAR_ALLOWED,
			CARROTS_ALLOWED,
			CUCUMBER_ALLOWED);
	}

}
