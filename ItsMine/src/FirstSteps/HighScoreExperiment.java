package FirstSteps;


public class HighScoreExperiment {

	public static void main(String[] args) {

		displayHighScorePosition("Patrick", calculateHighScorePosition(1500));
		displayHighScorePosition("Wiebke", calculateHighScorePosition(900));
		displayHighScorePosition("Meiko", calculateHighScorePosition(400));
		displayHighScorePosition("Baby", calculateHighScorePosition(50));
	}

	public static void displayHighScorePosition(String playerName, int highScoreTablePosition) {
		System.out
				.println(playerName + " managed to get into position " + highScoreTablePosition + " on the high score table");

	}

	public static int calculateHighScorePosition(int playerScore) {
		if (playerScore >= 1000) {
			return 1;
		} else if (playerScore >= 500) {
			return 2;
		} else if (playerScore >= 100) {
			return 3;
		}
		return 4;

	}

}
