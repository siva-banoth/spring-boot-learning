package com.pack;

import java.util.ArrayList;
import java.util.List;

public class MovieFinder {

	ArrayList<Movie> moviesList;

	public MovieFinder() {
		moviesList = new ArrayList<>();

		moviesList.add(new Movie(2025, "GameChanger"));
		moviesList.add(new Movie(2025, "OG"));
		moviesList.add(new Movie(2024, "Pushpa2"));
		moviesList.add(new Movie(2024, "LuckyBhasker"));
		moviesList.add(new Movie(2024, "Devara"));
	}

	public List<Movie> getMovies(int year) {

		List<Movie> found = new ArrayList<>();
		/*
		 * for each loop Datatype variable : Array/Collection for each movie in
		 * moviesList
		 */

		for (Movie movie : moviesList) {
			if (movie.getReleasedYear() == year)
				found.add(movie);
		}
		
		return found;
	}

}
