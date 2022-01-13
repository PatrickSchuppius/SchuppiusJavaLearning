package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

	private String name;
	private int hitPoints;
	private int strength;

	public Monster(String name, int hitPoints, int strength) {
		super();
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
	}

	@Override
	public List<String> write() {
		List<String> myMonsterValues = new ArrayList<>();
		myMonsterValues.add(0, this.name);
		myMonsterValues.add(1, "" + this.hitPoints);
		myMonsterValues.add(2, "" + this.strength);
		return myMonsterValues;
	}

	@Override
	public void read(List<String> savedValues) {
		if (savedValues == null || savedValues.size() < 1) {
			return;
		}
		this.name = savedValues.get(0);
		this.hitPoints = Integer.parseInt(savedValues.get(1));
		this.strength = Integer.parseInt(savedValues.get(2));
	}

	@Override
	public String toString() {
		return "Monster{name=" + name + ", hitPoints=" + hitPoints + ", strength=" + strength + "}";
	}

	public String getName() {
		return name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public int getStrength() {
		return strength;
	}
}
