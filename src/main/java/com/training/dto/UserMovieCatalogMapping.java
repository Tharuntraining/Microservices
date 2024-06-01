package com.training.dto;

import java.time.LocalDateTime;

public class UserMovieCatalogMapping {

	private int id;

	private MovieCatalogItem movieCatalogItem;

	private Users user;

	private String createdBy;

	private String updatedBy;

	private LocalDateTime createdDate;

	private LocalDateTime updatedDate;

	private Boolean isActive;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MovieCatalogItem getMovieCatalogItem() {
		return movieCatalogItem;
	}

	public void setMovieCatalogItem(MovieCatalogItem movieCatalogItem) {
		this.movieCatalogItem = movieCatalogItem;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}