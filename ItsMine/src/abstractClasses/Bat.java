package abstractClasses;


public class Bat implements CanFly {

	private String name;

	public Bat(String name) {
		this.name = name;
	}

	@Override
	public void fly() {
		System.out.println("Flying zigzag");

	}

}
