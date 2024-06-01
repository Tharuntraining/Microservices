package com.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.training.dto.UserMovieResponse;
import com.training.service.MovieCatalogService;

@RestController
public class MovieCatalogController {

	@Autowired
	private MovieCatalogService movieCatalogService;

	@GetMapping("getusermoviecatalogs/{userId}")
	public UserMovieResponse getUserMovieCatalogs(@PathVariable("userId") int userId) {
		return movieCatalogService.getUserMovieCatalogs(userId);

	}

}
