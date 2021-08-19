package SecondStepsClassesConstructorsInheritance;


public class Car extends Vehicle {

	private String motorType;

	public Car(int numberOfWheels) {
		super(numberOfWheels);
	}

	public void changeGear(String color, String motorType) {
		this.setColor(color);
		this.motorType = motorType;
	}

	public String getMotorType() {
		return motorType;
	}

	public void setMotorType(String motorType) {
		this.motorType = motorType;
	}

}
