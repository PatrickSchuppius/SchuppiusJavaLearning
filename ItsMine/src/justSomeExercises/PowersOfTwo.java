package justSomeExercises;

public class PowersOfTwo {

	public static void main(String[] args) {
		for (int i = 0, j = 1; i < 10; i++, j *= 2) {
			System.out.println("2^ " + i + " is " + j);
		}
		
		// Ist das egal bei Schleifen: i++ oder ++i ??
		for (int i = 1; i < 5; i++) {
			System.out.println(i);
		}
		for (int i = 1; i < 5; ++i) {
			System.out.println(i);
		}
		
	}

}
