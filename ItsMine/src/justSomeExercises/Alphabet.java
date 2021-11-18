package justSomeExercises;


public class Alphabet {

	public Alphabet() {
	}

	public static void main(String[] args) {

		for (char abc = 'A'; abc <= 'Z'; abc += 1) {
			System.out.println("char:" + abc + ", code:" + (int) abc);
		}
	}

}
