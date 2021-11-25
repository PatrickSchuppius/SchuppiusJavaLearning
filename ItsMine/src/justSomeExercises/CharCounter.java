package justSomeExercises;


public class CharCounter {

	private int[] counter = new int[26];

	public void process(char c) {

		if (c >= 'a' && c <= 'z') {
			// oder if (isLowerCase(c)) {
			counter[c - 'a']++;
			// oder ++this.counter[c-'a'];
		}

	}

	public int getCount(char c) {

		if (c >= 'a' && c <= 'z') {
			return counter[c - 'a'];
			// oder return this.counter[c - 'a'];
		} else {
			// das else ist eigentlich überflüssig,
			// weil return aus der Methode rausspringt
			return -1;
		}
	}

	private boolean isLowerCase(char c) {
		return c >= 'a' && c <= 'z';
	}

}
