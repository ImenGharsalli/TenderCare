package com.tendercare.model;

import java.util.UUID;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = "careservice")
public class CareService {
	@PrimaryKey(value = "csid")
	private UUID id;
	@Column(value = "jobfucntion")
	private String jobFucntion;
	@Column(value = "overview")
	private String overview;
	@Column(value = "experiencelevel")
	private String experienceLevel;
	@Column(value = "location")
	private String location;
	@Column(value = "availability")
	private float availability;
	@Column(value = "minprice")
	private float minPrice;
	@Column(value = "maxprice")
	private float maxPrice;
	@Column(value = "user")
	private UUID user;

	public CareService() {
		super();
	}

	public CareService(String jobFucntion, String overview, String experienceLevel, String location,
			float availability, float minPrice, float maxPrice, UUID user) {
		super();
		this.id = UUID.randomUUID();
		this.jobFucntion = jobFucntion;
		this.overview = overview;
		this.experienceLevel = experienceLevel;
		this.location = location;
		this.availability = availability;
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
		this.user = user;
	}

	public UUID getUser() {
		return user;
	}

	public void setUser(UUID user) {
		this.user = user;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getJobFucntion() {
		return jobFucntion;
	}

	public void setJobFucntion(String jobFucntion) {
		this.jobFucntion = jobFucntion;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getExperienceLevel() {
		return experienceLevel;
	}

	public void setExperienceLevel(String experienceLevel) {
		this.experienceLevel = experienceLevel;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getAvailability() {
		return availability;
	}

	public void setAvailability(float availability) {
		this.availability = availability;
	}

	public float getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(float minPrice) {
		this.minPrice = minPrice;
	}

	public float getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(float maxPrice) {
		this.maxPrice = maxPrice;
	}

}
