package justSomeExercises;

public class autoboxingExperiments {

	private static Integer myInt1Object = new Integer(5);
	private static Integer myInt2Object = new Integer(20);

	private static int i = 17;
	private static Integer myInt3Object = new Integer(i);
	private static Integer myInt4Object = Integer.valueOf(i);
	private static Integer myInt5Object = myInt4Object;

	private static int myInt1 = myInt1Object; // Java macht daraus myInt1Object.intValue()
	private static int myInt2 = myInt2Object.intValue();

	public static void main(String[] args) {

		System.out.println(i);
		System.out.println(myInt1Object);
		System.out.println(myInt2Object);
		System.out.println(myInt3Object);
		System.out.println(myInt4Object);
		System.out.println(myInt5Object);
		System.out.println(myInt1);
		System.out.println(myInt2);
	}

}
