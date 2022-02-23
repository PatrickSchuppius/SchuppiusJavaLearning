package generics;

import java.util.ArrayList;

// public class Team<T> { // first version
public class Team<T extends Player> { // T is a "bounded type parameter"
	
//	sowas würde auch gehen: public class Team<T extends Player & Coach & Manager>  
// dann muss Player eine Klasse sein und der Rest Interfaces

	private String name;
	int played = 0;
	int won = 0;
	int lost = 0;
	int tied = 0;

	private ArrayList<T> members = new ArrayList<>();

	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean addPlayer(T player) {
		if (members.contains(player)) {
			// System.out.println(((Player) player).getName() + " is already on the team");
			System.out.println(player.getName() + " is already on the team");
			return false;
		} else {
			members.add(player);
			// System.out.println(((Player) player).getName() + " picked for team " + this.name);
			System.out.println(player.getName() + " picked for team " + this.name);
			return true;
		}
	}

	public int numPlayers() {
		return this.members.size();
	}

	public void matchResult(Team<T> opponent, int ourScore, int theirScore) {

		String message;

		if (ourScore > theirScore) {
			won++;
			message = " beat ";
		} else if (ourScore == theirScore) {
			tied++;
			message = " drew with ";
		} else {
			lost++;
			message = " lost to ";
		}
		played++;
		if (opponent != null) {
			System.out.println(this.getName() + message + opponent.getName());
			opponent.matchResult(null, theirScore, ourScore);
		}
	}

	public int ranking() {
		return (won * 2) + tied;
	}

}
