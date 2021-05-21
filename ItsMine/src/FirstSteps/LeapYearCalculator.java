package FirstSteps;


public class LeapYearCalculator {

	public static void main(String[] args) {
		if (isLeapYear(-1600) == false) {
			System.out.println("Test success");
		} else {
			System.out.println("Test failure");
		}

		if (isLeapYear(1600) == true) {
			System.out.println("Test success");
		} else {
			System.out.println("Test failure");
		}

		if (isLeapYear(2017) == false) {
			System.out.println("Test success");
		} else {
			System.out.println("Test failure");
		}

		if (isLeapYear(2000) == true) {
			System.out.println("Test success");
		} else {
			System.out.println("Test failure");
		}

		;

	}

	public static boolean isLeapYear(int year) {
		if (year < 1 || year > 9999) {
			return false;
		}

		if (year % 4 != 0) {
			return false;
		} else if (year % 100 != 0) {
			return true;
		} else if (year % 400 != 0) {
			return false;
		}

		return true;
	}

}
