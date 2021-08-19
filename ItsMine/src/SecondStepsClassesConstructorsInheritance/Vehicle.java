package SecondStepsClassesConstructorsInheritance;


public class Vehicle {

	private int numberOfWheels;

	public Vehicle(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public void steerVehicle(String richtung) {
		switch (richtung) {
			case "links":
				System.out.println("Wir fahren nach links");
				break;
			case "rechts":
				System.out.println("Wir fahren nach rechts");
				break;
			default:
				System.out.println("Wir fahren geradeaus");
				break;
		}

	}

}
