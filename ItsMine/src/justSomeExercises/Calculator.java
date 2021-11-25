package justSomeExercises;


public class Calculator {

	private int intA = 0;
	private int intB = 0;
	private char operator;

	public Calculator(int intA, int intB, char operator) {
		super();
		this.intA = intA;
		this.intB = intB;
		this.operator = operator;
	}

	// public int calculate(int intA, int intB, char operator) {
	public int calculate() {
		switch (operator) {

			case '+': {
				return intA + intB;
			}

			case '-': {
				return intA - intB;
			}

			case 'x': {
				return intA * intB;
			}

			case '/': {
				if (intB != 0) {
					return intA / intB;
				} else {
					return 0;
				}
			}

			default: {
				return 0;
			}

		}
	}

}
