package com.tendercare.model.h2;

import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.tendercare.business.DateUtility;

public class Job {
	@Id
	@GeneratedValue
	private UUID jobid;
	private String jobFunction;
	private String description;
	private String location;
	private String postDate;
	private String expirationDate;
	private float estimatedBudget;
	private UUID user;
	private String userFirstName;
	private String userLastName;
	private String imageId;

	public Job() {
		super();
		this.postDate = DateUtility.dateTimeNow();
	}

	public Job(UUID jobid, String jobFunction, String description, String location, String postDate,
			String expirationDate, float estimatedBudget, UUID user, String userFirstName, String userLastName,
			String imageId) {
		super();
		this.jobid = jobid;
		this.jobFunction = jobFunction;
		this.description = description;
		this.location = location;
		this.postDate = DateUtility.dateTimeNow();
		this.expirationDate = expirationDate;
		this.estimatedBudget = estimatedBudget;
		this.user = user;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.imageId = imageId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public UUID getUser() {
		return user;
	}

	public void setUser(UUID user) {
		this.user = user;
	}

	public UUID getJobid() {
		return jobid;
	}

	public void setJobid(UUID jobid) {
		this.jobid = jobid;
	}

	public String getJobFunction() {
		return jobFunction;
	}

	public void setJobFunction(String jobFunction) {
		this.jobFunction = jobFunction;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getEstimatedBudget() {
		return estimatedBudget;
	}

	public void setEstimatedBudget(float estimatedBudget) {
		this.estimatedBudget = estimatedBudget;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Override
	public String toString() {
		return "Job [jobid=" + jobid + ", jobFunction=" + jobFunction + ", description=" + description + ", location="
				+ location + ", postDate=" + postDate + ", expirationDate=" + expirationDate + ", estimatedBudget="
				+ estimatedBudget + ", user=" + user + ", userFirstName=" + userFirstName + ", userLastName="
				+ userLastName + ", imageId=" + imageId + "]";
	}

}
