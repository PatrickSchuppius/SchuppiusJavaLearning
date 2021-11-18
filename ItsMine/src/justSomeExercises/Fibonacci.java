package justSomeExercises;


public class Fibonacci {

	private static long sum = 0L;
	private static long prev = 0L;
	private static long prevprev = 1L;
	private static int loopCount = 60;

	public static void main(String[] args) {
		System.out.println("Die ersten " + loopCount + " Zahlen der Fibonacci-Folge");
		System.out.println(sum);
		for (int i = 1; i < loopCount; ++i) {
			sum = prev + prevprev;
			System.out.println(sum);
			prevprev = prev;
			prev = sum;
			
		}


	}

}
