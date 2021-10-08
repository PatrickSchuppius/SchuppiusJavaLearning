public class ReverseString {

	public static void main(String args[]) {
		System.out.println(reverseString("ABCDEFGHIJKLMN"));
	}

	public static String reverseString(String input) {
		for (int i = 0; i <= Math.floor((input.length() - 2) / 2); i++) {

			String exchangeChar1 = input.substring(i, i + 1);
			String exchangeChar2 = input.substring(input.length() - i - 1, input.length() - i);

			String remainderBeforeFirstChar = input.substring(0, i);
			String remainderBetweenTheTwo = input.substring(i + 1, input.length() - i - 1);
			String remainderAfterSecondChar = input.substring(input.length() - i);

			input = remainderBeforeFirstChar + exchangeChar2 + remainderBetweenTheTwo + exchangeChar1
					+ remainderAfterSecondChar;

		}
		return input;
	}
}
