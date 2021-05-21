package FirstSteps;


public class EqualSumChecker {

	public static void main(String[] args) {
		if (hasEqualSum(1, 1, 1) == false) {
			System.out.println("Test success!");
		} else {
			System.out.println("Test failure!");
		}

		if (hasEqualSum(1, 1, 2) == true) {
			System.out.println("Test success!");
		} else {
			System.out.println("Test failure!");
		}

		if (hasEqualSum(1, -1, 0) == true) {
			System.out.println("Test success!");
		} else {
			System.out.println("Test failure!");
		}

		if (hasEqualSum(-3, -5, -8) == true) {
			System.out.println("Test success!");
		} else {
			System.out.println("Test failure!");
		}

	}

	public static boolean hasEqualSum(int operand1, int operand2, int checksum) {
		if (operand1 + operand2 == checksum) {
			return true;
		}
		return false;
	}

}
