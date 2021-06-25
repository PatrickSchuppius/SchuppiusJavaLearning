package FirstSteps;


public class PrimeCheckerLoop {

	public static void main(String args[]) {
		int amountOfPrimeNumbers = 0;
		for (int i = 12; i <= 58; i++) {
			if (isPrime(i)) {
				amountOfPrimeNumbers++;
				System.out.println("The prime number found is " + i);
			}

			if (amountOfPrimeNumbers >= 3) {
				System.out.println("Three prime numbers found, program stops!");
				amountOfPrimeNumbers = 0;
				break;
			}
		}
	}

	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

}
