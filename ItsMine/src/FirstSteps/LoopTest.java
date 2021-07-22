package FirstSteps;


public class LoopTest {

	public static void main(String[] args) {
		for (int i=2; i<9; i++ ) {
			System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(100000.0, i)));
		}
		for (int i = 8; i > 1; i--) {
			System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(100000.0, i)));
		}
	}

	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}
	Math

}
