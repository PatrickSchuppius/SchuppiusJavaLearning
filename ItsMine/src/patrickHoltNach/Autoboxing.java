package patrickHoltNach;

import java.util.ArrayList;

public class Autoboxing {

	public static void main(String[] args) {
		String[] myStrings = new String[10];
		int[] myInts = new int[10];

		ArrayList<String> strArrayList = new ArrayList<>();
		
		Integer integer = new Integer(54);
		Double doubleValue = new Double(12.25);

		ArrayList<Integer> intArrayList = new ArrayList<>();

		for (int i = 0; i <= 10; i++) {
			intArrayList.add(integer.valueOf(i));
		}

		// for (int i = 0; i <= 10; i++) {
		// System.out.println(i + " --> " + intArrayList.get(i).intValue()); // .intValue not needed as sysout is smart
		// }

		Integer myIntValue = 56; // Integer.valueOf(56) under the hood
		int myPrimitiveInt = myIntValue; // myIntValue.intValue() under the hood

		ArrayList<Double> myDoubleValues = new ArrayList<>();
		for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
			myDoubleValues.add(dbl);
		}
		System.out.println(myDoubleValues.get(7).getClass());
		for (int i = 0; i < myDoubleValues.size(); i++) {
			System.out.println(i + " --> " + myDoubleValues.get(i)); // .doubleValue not needed as sysout is smart
		}

	}

}
