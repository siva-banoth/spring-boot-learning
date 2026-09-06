package com.pack;

import java.util.List;

// Dependent
public class MovieLister {

	// Dependent class refVariable
	MovieFinder movieFinder;

	// Constructor
	public MovieLister(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}

	public void showMovies(int year) {

		List<Movie> list = movieFinder.getMovies(year);

		for (Movie movie : list) {
			System.out.println("Released Year : " + movie.getReleasedYear());
			System.out.println("Movie Name : " + movie.getMovieName());
			System.out.println("================================");
		}

	}

}
