package imdb.desktop.model;

import java.util.HashSet;
import java.util.Set;



public class Movie {

	private String name;
	private int year;
	private Rating rating;
	private String urlPicture;
	private String urlTrailer;
	private String director;
	private Set<String> actors = new HashSet<>();
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getUrlPicture() {
		return urlPicture;
	}

	public void setUrlPicture(String urlPicture) {
		this.urlPicture = urlPicture;
	}

	public String getUrlTrailer() {
		return urlTrailer;
	}

	public void setUrlTrailer(String urlTrailer) {
		this.urlTrailer = urlTrailer;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Set<String> getActors() {
		return actors;
	}

	public void setActors(Set<String> actors) {
		this.actors = actors;
	}

	public Rating getRating() {
		return rating;
	}
	
	public Movie(String name, int year, Rating rating, String urlPicture, String urlTrailer, String director,
			Set<String> actors) {
		this.name = name;
		this.year = year;
		this.rating = rating;
		this.urlPicture = urlPicture;
		this.urlTrailer = urlTrailer;
		this.director = director;
		this.actors = actors;
	}

	public Movie() {
		
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	public void addRating(String username, int userRating) {
		rating.addUserRating(username, userRating);
	}
	
}
