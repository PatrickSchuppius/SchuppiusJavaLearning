package SecondStepsClassesConstructorsInheritance;


public class Carpet {

	private double cost;

	public double getCost() {
		return cost;
	}

	public Carpet(double cost) {
		this.cost = cost;
		if (cost < 0) {
			this.cost = 0;
		}
	}

}
