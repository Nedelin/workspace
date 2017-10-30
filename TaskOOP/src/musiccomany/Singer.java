package musiccomany;

import java.util.HashSet;

public class Singer {

	public String name;
	public String psevdoName;
	public HashSet<Album> albums = new HashSet<>();
	
	
	public Singer(String name, String psevdoName) {
		this.name = name;
		this.psevdoName = psevdoName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPsevdoName() {
		return psevdoName;
	}
	public void setPsevdoName(String psevdoName) {
		this.psevdoName = psevdoName;
	}
	
	public HashSet<Album> getAlbums() {
		return albums;
	}
	public void addAlbums(Album album) {
		albums.add(album);
	}
	public void removeAlbums(Album album) {
		albums.remove(album);
	}
	@Override
	public String toString() {
		return "Singer [name=" + name + ", psevdoName=" + psevdoName + ", album=" + albums + "]";
	}
}
