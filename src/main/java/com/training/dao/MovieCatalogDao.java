package com.training.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.model.UserMovieCatalogMapping;

@Repository
public interface MovieCatalogDao extends JpaRepository<UserMovieCatalogMapping, Integer> {
	public List<UserMovieCatalogMapping> findByUser_UserId(int userId);

}
