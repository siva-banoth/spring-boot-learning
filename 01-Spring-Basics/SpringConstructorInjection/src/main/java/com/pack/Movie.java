package com.pack;

// POJO
public class Movie {
	
	/**
	 * final -> object level constants static final -> class level constants final
	 * variables -> can be initialized 1. at the time of declaration 2. through
	 * constructor
	 * 
	 * can't be with through setters
	 */			
	
	private final int releasedYear; 
	private final String movieName;

	public Movie(int releasedYear, String movieName) {
		this.releasedYear = releasedYear;
		this.movieName = movieName;
	}

	public int getReleasedYear() {
		return releasedYear;
	}

	public String getMovieName() {
		return movieName;
	}
	
	

}
