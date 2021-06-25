package FirstSteps;


public class SecondsAndMinutesChallenge {

	public static void main(String[] args) {
		String testText = "guckguck";

		System.out.println(stringTest(testText));
		System.out.println(stringTest("gagaga"));

		System.out.println(getDurationString(12, 5));
		System.out.println(getDurationString(72, 35));
		System.out.println(getDurationString(0, 35));
		System.out.println(getDurationString(-3, 45));
		System.out.println(getDurationString(72, 135));
		System.out.println(getDurationString(72, -35));
		System.out.println(getDurationString(61, 0));
		System.out.println(getDurationString(17995, 35));
		System.out.println(getDurationString(17995 * 60 + 35));

	}

	public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

	public static String stringTest(String a) {
		if (a == "guckguck") {
			return a;
		} else {
			return "Käse";
		}
	}

	public static String getDurationString(int minutes, int seconds) {

		if (minutes < 0 || seconds < 0 || seconds > 59) {
			return INVALID_VALUE_MESSAGE;
		}

		return (minutes / 60) + "h " + minutes % 60 + "m " + seconds + "s";
	}

	public static String getDurationString(int seconds) {

		if (seconds < 0) {
			return INVALID_VALUE_MESSAGE;
		}

		return getDurationString(seconds / 60, seconds % 60);
	}

}

