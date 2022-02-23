package generics;


public class genericsTestMain {

	public static void main(String[] args) {
		FootballPlayer joe = new FootballPlayer("Joe");
		BaseballPlayer pat = new BaseballPlayer("Pat");
		SoccerPlayer beckham = new SoccerPlayer("Beckham");

		Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
		adelaideCrows.addPlayer(joe);
//		adelaideCrows.addPlayer(pat);
//		adelaideCrows.addPlayer(beckham);

		System.out.println(adelaideCrows.numPlayers());

		Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
		baseballTeam.addPlayer(pat);

		// Team<String> brokenTeam = new Team<>("this won't work");
		// brokenTeam.addPlayer("no-one");

		Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
		brokenTeam.addPlayer(beckham);

		Team<FootballPlayer> melbourne = new Team<>("Melbourne");
		FootballPlayer banks = new FootballPlayer("Gordon");
		melbourne.addPlayer(banks);

		Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
		Team<FootballPlayer> fremantle = new Team<>("Fremantle");

		hawthorn.matchResult(fremantle, 1, 0);
		hawthorn.matchResult(adelaideCrows, 3, 8);

		adelaideCrows.matchResult(fremantle, 2, 1);
		// adelaideCrows.matchResult(baseballTeam, 1, 1);
		// dieser Fehler kann nicht mehr passieren mit
		// public void matchResult(Team<T> opponent, ... in der Klasse Teams

	}

}
