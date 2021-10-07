package SecondStepsClassesConstructorsInheritance.composition;


public class Car {

	private boolean engine;
	private int cylinders;
	private int wheels;
	private String colour;
	private int velocity;


	public static void main(String[] args) {

		Car car = new Car(6, "rot");
		System.out.println("Car hat " + car.getWheels() + " Räder");
		car.startEngine();
		car.accelerate(7);
		car.brake(3);

		Audi patricksAudi = new Audi("weiß");
		System.out.println("Audi hat " + patricksAudi.getWheels() + " Räder");
		patricksAudi.startEngine();
		patricksAudi.accelerate(7);
		patricksAudi.brake(3);
	}

	public Car(int cylinders, String colour) {
		this.cylinders = cylinders;
		this.colour = colour;
		this.wheels = 4;
		this.engine = true;
		this.velocity = 0;
	}

	public boolean isEngineActive() {
		return engine;
	}

	public int getCylinders() {
		return cylinders;
	}

	public int getWheels() {
		return wheels;
	}

	public String getColour() {
		return colour;
	}

	public int getVelocity() {
		return velocity;
	}

	public void startEngine() {
		engine = true;
		System.out.println("Engine started");
	}

	public void accelerate(int addSpeed) {
		velocity += addSpeed;
		System.out.println("New velocity = " + velocity);
	}

	public void brake(int reduceSpeed) {
		this.accelerate(-1 * reduceSpeed);
	}
}

class Audi extends Car {

	private String specialProperty;

	public Audi(String colour) {
		super(4, colour);
	}

	@Override
	public void accelerate(int addSpeed) {

		super.accelerate(2 * addSpeed);
	}

	@Override
	public void brake(int reduceSpeed) {

		super.brake(2 * reduceSpeed);
	}

}
