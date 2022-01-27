package InnerClassChallenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

	private String name;
	private String artist;
	private SongList songs;
	
	public Album(String nameOfTheAlbum, String artist) {
		this.name = nameOfTheAlbum;
		this.artist = artist;
		this.songs = new SongList();
	}

	public boolean addSong(String titleOfSong, double durationOfSong) {
		return this.songs.add(new Song(titleOfSong, durationOfSong));
	}

	public boolean addToPlayList(int trackNumberOfSongInAlbum, LinkedList<Song> playList) {

		if (this.songs.getSongListSize() < trackNumberOfSongInAlbum || trackNumberOfSongInAlbum <= 0) {
			System.out.println("Index of song out of range!");
			return false;
		}

		return playList.add(songs.getSongForIndexInAlbum(trackNumberOfSongInAlbum - 1));

	}

	public boolean addToPlayList(String titleOfSong, LinkedList<Song> playList) {

		if (this.songs.findSong(titleOfSong) == null) {
			System.out.println("Song " + titleOfSong + " does not exist in album!");
			return false;
		}

		return playList.add(this.songs.findSong(titleOfSong));
	}

	public class SongList {

		private ArrayList<Song> songs;

		public SongList() {
			this.songs = new ArrayList<>();
		}

		public int getSongListSize() {
			return this.songs.size();
		}

		public Song getSongForIndexInAlbum(int index) {
			return this.songs.get(index);
		}

		private boolean add(Song song) {
			if (findSong(song.getTitle()) != null) {
				System.out.println("Song " + song.getTitle() + " already exists!");
				return false;
			}
			songs.add(song);
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

		private Song findSong(int trackNumber) {
			if (trackNumber > getSongListSize()) {
				return null;
			}
			return songs.get(trackNumber - 1);
		}
	}

}
