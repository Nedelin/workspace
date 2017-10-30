package imdb.desktop.model;

import java.util.HashMap;
import java.util.Map;

public class Rating {

	private double averageRating;
	private Map<String, Integer> usersRatings = new HashMap<>();

	public Rating(double averageRating) {
		this.averageRating = averageRating;
	}

	public void addUserRating(String username, int rating) {
		if (!usersRatings.containsKey(username) && rating >= 1 && rating <= 10) {
			usersRatings.put(username, rating);
			calculateAverageRating();
		}
	}

	public double getAverageRating() {
		return averageRating;
	}

	private void calculateAverageRating() {
		int sumOfRatings = 0;
		for (Map.Entry<String, Integer> pair : usersRatings.entrySet()) {
			sumOfRatings += pair.getValue();
		}
		averageRating = sumOfRatings / usersRatings.size();
	}

}
