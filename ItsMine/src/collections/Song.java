package collections;


public class Song {

	private String title;
	private double duration;

	public Song(String titleOfTheSong, double durationOfTheSong) {
		this.title = titleOfTheSong;
		this.duration = durationOfTheSong;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return title + ": " + duration;
	}


}
