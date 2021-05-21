package FirstSteps;


public class ThreeDigitComparer {

	public static void main(String[] args) {
		if (areEqualByThreeDecimalPlaces(-3.1756, -3.175) == true) {
			System.out.println("Test success!");
		} else {
			System.out.println("Test failure");
		}

		if (areEqualByThreeDecimalPlaces(3.175, 3.176) == false) {
			System.out.println("Test success!");
		} else {
			System.out.println("Test failure");
		}

		if (areEqualByThreeDecimalPlaces(3.0, 3.0) == true) {
			System.out.println("Test success!");
		} else {
			System.out.println("Test failure");
		}

		if (areEqualByThreeDecimalPlaces(-3.123, 3.123) == false) {
			System.out.println("Test success!");
		} else {
			System.out.println("Test failure");
		}

	}

	public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
		int convertedNumber1 = (int) (number1 * 1000);
		int convertedNumber2 = (int) (number2 * 1000);

		if (convertedNumber1 == convertedNumber2) {
			return true;
		}
		return false;
	}

}
