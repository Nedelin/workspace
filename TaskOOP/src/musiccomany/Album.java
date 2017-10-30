package musiccomany;
import java.util.HashSet;
public class Album {

	public String name;
	public String genre;
	public int yearOfCreation;
	public int saleCopies;
	public HashSet<Song> songs = new HashSet<>();	
	
	public Album(String name, String genre, int yearOfCreation, int saleCopies) {
		this.name = name;
		this.genre = genre;
		this.yearOfCreation = yearOfCreation;
		this.saleCopies = saleCopies;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYearOfCreation() {
		return yearOfCreation;
	}
	public void setYearOfCreation(int yearOfCreation) {
		this.yearOfCreation = yearOfCreation;
	}
	public int getSaleCopies() {
		return saleCopies;
	}
	public void setSaleCopies(int saleCopies) {
		this.saleCopies = saleCopies;
	}
	public HashSet<Song> getSongs() {
		return songs;
	}
	public void addSong(Song song) {
		songs.add(song);
	}
	public void removeSong(Song song) {
		songs.remove(song);
	}
	@Override
	public String toString() {
		return "Album [name=" + name + ", genre=" + genre + ", yearOfCreation=" + yearOfCreation + ", saleCopies="
				+ saleCopies + ", songs=" + songs + "]";
	}
	
	
}
