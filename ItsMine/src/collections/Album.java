package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

	private String name;
	private String artist;
	private ArrayList<Song> songs;

	public Album(String nameOfTheAlbum, String artist) {
		this.name = nameOfTheAlbum;
		this.artist = artist;
		this.songs = new ArrayList<>();
	}

	public boolean addSong(String titleOfSong, double durationOfSong) {
		if (findSong(titleOfSong) != null) {
			System.out.println("Song " + titleOfSong + " already exists!");
			return false;
		}
		songs.add(new Song(titleOfSong, durationOfSong));
		return true;
	}

	private Song findSong(String titleOfSong) {
		for (Song actualSong : songs) {
			if (actualSong.getTitle().equalsIgnoreCase(titleOfSong)) {
				return actualSong;
			}
		}
		return null;
	}

	public boolean addToPlayList(int trackNumberOfSongInAlbum, LinkedList<Song> playList) {

		if (songs.size() < trackNumberOfSongInAlbum || trackNumberOfSongInAlbum <= 0) {
			System.out.println("Index of song out of range!");
			return false;
		}

		return playList.add(songs.get(trackNumberOfSongInAlbum - 1));

	}

	public boolean addToPlayList(String titleOfSong, LinkedList<Song> playList) {

		if (findSong(titleOfSong) == null) {
			System.out.println("Song " + titleOfSong + " does not exist in album!");
			return false;
		}

		return playList.add(findSong(titleOfSong));
	}

}
