package SecondStepsClassesConstructorsInheritance;

public class AufgabenCheck {

	public static void main(String[] args) {

		// Carpet carpet = new Carpet(3.5);
		// Floor floor = new Floor(2.75, 4.0);
		// Calculator calculator = new Calculator(floor, carpet);
		//
		// System.out.println("total = " + calculator.getTotalCost());
		//
		// carpet = new Carpet(1.5);
		// floor = new Floor(5.4, 4.5);
		// calculator = new Calculator(floor, carpet);
		//
		// System.out.println("total = " + calculator.getTotalCost());

		// System.out.println("jetzt gehts los");
		// Point first = new Point(6, 5);
		// Point second = new Point(3, 1);
		// System.out.println("distance(0,0)= " + first.distance());
		// System.out.println("distance (second)= " + first.distance(second));
		// System.out.println("distance(2,2)= " + first.distance(2, 2));
		//
		// Point point = new Point();
		// System.out.println("distance()= " + point.distance());
		
		Subaru mySubaru = new Subaru(4);
		mySubaru.steerVehicle("links");
		mySubaru.steerVehicle("rechts");
		mySubaru.steerVehicle("xxx");
		
	}

}
