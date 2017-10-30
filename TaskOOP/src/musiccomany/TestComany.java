package musiccomany;

public class TestComany {

	public static void main(String[] args) {

			MusicComany firstComany = new MusicComany("TheFirst", "ul.Simeonovsko shose 77", "Nedelin");
			Singer singer1 = new Singer("Ivan", "Ivano");
			Singer singer2 = new Singer("Georgi", "Macho");
			Singer singer3 = new Singer("Kiril", "TheBeast");
			firstComany.addSinger(singer1);
			firstComany.addSinger(singer2);
			firstComany.addSinger(singer3);
			Song song1 = new Song("Song1", 330);
			Song song2 = new Song("Song2", 300);
			Song song3 = new Song("Song3", 350);
			Album album1 = new Album("album1", "pop", 2017, 500);
			Album album2 = new Album("album2", "hip hop", 2007, 1500);
			Album album3 = new Album("album3", "rap", 2005, 2500);
			album1.addSong(song1);
			album2.addSong(song2);
			album3.addSong(song3);
			singer1.addAlbums(album1);
			singer2.addAlbums(album2);
			singer3.addAlbums(album3);
			System.out.println(firstComany.getSingers());
	}
	

}
