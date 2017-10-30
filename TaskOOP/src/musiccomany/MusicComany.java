package musiccomany;

import java.util.ArrayList;

public class MusicComany {

	public String name;
	public String adres;
	public String owner;
	public ArrayList<Singer> singers = new ArrayList<>();
	
	public MusicComany(String name, String adres, String owner) {
		this.name = name;
		this.adres = adres;
		this.owner = owner;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public ArrayList<Singer> getSingers() {
		return singers;
	}
	public void addSinger(Singer singer) {
		singers.add(singer);
	}
	public void removeSinger(Singer singer) {
		singers.remove(singer);
	}
	@Override
	public String toString() {
		return "MusicComany [name=" + name + ", adres=" + adres + ", owner=" + owner + ", singers=" + singers + "]";
	}

}
