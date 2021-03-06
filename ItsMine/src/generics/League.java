package generics;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

	public String name;
	private ArrayList<T> league = new ArrayList<>();

	public League(String name) {
		this.name = name;
	}

	public boolean add(T team) {
		if (league.contains(team)) {
			return false;
		}
		league.add(team);
		return true;
	}

	public void printLeagueTable() {
		Collections.sort(league);
		for (T team : league) {
			System.out.println(team.getName() + ": " + team.ranking());
		}
	}

}
