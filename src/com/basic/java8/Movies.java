package com.basic.java8;

public class Movies {
	
	private int rating;
	private String yearOfRelease;
	public Movies(int rating, String yearOfRelease) {
		super();
		this.rating = rating;
		this.yearOfRelease = yearOfRelease;
	}
	@Override
	public String toString() {
		return "Movies [rating=" + rating + ", yearOfRelease=" + yearOfRelease + "]";
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getYearOfRelease() {
		return yearOfRelease;
	}
	public void setYearOfRelease(String yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	

}
