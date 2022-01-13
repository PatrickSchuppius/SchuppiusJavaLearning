package InnerClasses;

import java.util.ArrayList;

public class GearboxV2 {

	private ArrayList<GearV2> gears;
	private int maxGears;
	private int currentGear = 0;
	private boolean clutchIsIn;

	public GearboxV2(int maxGears) {
		this.maxGears = maxGears;
		this.gears = new ArrayList<>();
		GearV2 neutral = new GearV2(0, 0.0);
		this.gears.add(neutral);

		for (int i = 0; i < maxGears; i++) {
			addGear(i, i * 5.3);
		}
	}

	public void operateClutch(boolean in) {
		this.clutchIsIn = in;
	}

	public void addGear(int number, double ratio) {
		if ((number > 0) && (number <= maxGears)) {
			this.gears.add(new GearV2(number, ratio));
		}
	}

	public void changeGear(int newGear) {
		if ((newGear >= 0) && (newGear < this.gears.size()) && this.clutchIsIn) {
			this.currentGear = newGear;
			System.out.println("Gear " + newGear + " selected.");
		} else {
			System.out.println("Knirsch!");
			this.currentGear = 0;
		}
	}

	public double wheelSpeed(int revs) {
		if (clutchIsIn) {
			System.out.println("AAAAAAHHHHH!!!!!!");
			return 0.0;
		}
		return revs * gears.get(currentGear).getRatio();
		// return gears.get(currentGear).driveSpeed(revs);
	}

	private class GearV2 {

		private int gearNumber;
		private double ratio;

		public GearV2(int gearNumber, double ratio) {
			this.gearNumber = gearNumber;
			this.ratio = ratio;
		}

		public double getRatio() {
			return ratio;
		}

		public double driveSpeed(int revs) {
			return revs * (this.ratio);
		}

	}

}
