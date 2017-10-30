package musiccomany;

public class Song {

	public String nameOfTheSong;
	public int timeOfTheSong;
	
	
	
	public Song(String nameOfTheSong, int timeOfTheSong) {
		this.nameOfTheSong = nameOfTheSong;
		this.timeOfTheSong = timeOfTheSong;
	}
	public String getNameOfTheSong() {
		return nameOfTheSong;
	}
	public void setNameOfTheSong(String nameOfTheSong) {
		this.nameOfTheSong = nameOfTheSong;
	}
	public int getTimeOfTheSong() {
		return timeOfTheSong;
	}
	public void setTimeOfTheSong(int timeOfTheSong) {
		this.timeOfTheSong = timeOfTheSong;
	}
	@Override
	public String toString() {
		return "Song [nameOfTheSong=" + nameOfTheSong + ", timeOfTheSong=" + timeOfTheSong + "]";
	}
}
