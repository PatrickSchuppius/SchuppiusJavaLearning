package FirstSteps;


public class Experimente {

	public static void main(String[] args) {
		int ganzeZahl = 19;
		int result = ganzeZahl % 5;
		System.out.println("Result = " + result);

		ganzeZahl = Integer.MAX_VALUE;
		System.out.println("Max Value von int ist: " + ganzeZahl);

		long myLongZahl = Long.MAX_VALUE;
		System.out.println("Max Value von long ist: " + myLongZahl);

		double myFliesskommazahl = Double.MAX_VALUE;
		System.out.println("Max Value von double ist: " + myFliesskommazahl);

		double d = Math.random();

	}

}
