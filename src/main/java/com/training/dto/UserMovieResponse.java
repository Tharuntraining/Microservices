package com.training.dto;

import java.util.List;

public class UserMovieResponse {
	private int userId;
	private String username;
	private List<MovieCatalogItem> movies;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<MovieCatalogItem> getMovies() {
		return movies;
	}

	public void setMovies(List<MovieCatalogItem> movies) {
		this.movies = movies;
	}

}
