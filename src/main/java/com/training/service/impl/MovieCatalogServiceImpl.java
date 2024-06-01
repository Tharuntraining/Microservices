package com.training.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.dao.MovieCatalogDao;
import com.training.dto.MovieCatalogItem;
import com.training.dto.UserMovieResponse;
import com.training.model.UserMovieCatalogMapping;
import com.training.service.MovieCatalogService;

@Service
public class MovieCatalogServiceImpl implements MovieCatalogService {

	@Autowired
	private MovieCatalogDao movieCatalogDao;

	@Override
	public UserMovieResponse getUserMovieCatalogs(int userId) {
		List<UserMovieCatalogMapping> mappings = movieCatalogDao.findByUser_UserId(userId);
		if (mappings.isEmpty()) {
			return null; // Or throw an exception if user not found
		}

		UserMovieResponse response = new UserMovieResponse();
		response.setUserId(userId);
		response.setUsername(mappings.get(0).getUser().getUsername());

		List<MovieCatalogItem> movieDetails = mappings.stream().map(mapping -> {
			MovieCatalogItem detail = new MovieCatalogItem();
			detail.setMovieTitle(mapping.getMovieCatalogItem().getMovieTitle());
			detail.setDescription(mapping.getMovieCatalogItem().getDescription());
			detail.setRating(mapping.getMovieCatalogItem().getRating());
			detail.setCreatedBy(mapping.getMovieCatalogItem().getCreatedBy().getUsername());
			detail.setUpdatedBy(mapping.getMovieCatalogItem().getUpdatedBy().getUsername());
			return detail;
		}).collect(Collectors.toList());

		response.setMovies(movieDetails);

		return response;
	}

}
