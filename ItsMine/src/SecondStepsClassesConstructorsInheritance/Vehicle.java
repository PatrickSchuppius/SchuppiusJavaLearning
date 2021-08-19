package SecondStepsClassesConstructorsInheritance;


public class Vehicle {

	private int numberOfWheels;
	private String color;

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

	public void changeGear(String color) {
		this.color = color;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
