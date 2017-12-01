package com.tendercare.model.h2;

import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class User {
	@Id
	@GeneratedValue
	private UUID id;
	private String firstName;
	private String lastName;
	private String email;
	private String location;
	private String password;
	private String description;
	private String imageId;
	private String accountName;

	public User() {
		super();
	}

	public User(UUID id, String firstName, String lastName, String email, String location, String password,
			String description) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.location = location;
		this.password = password;
		this.description = description;
		this.accountName = firstName + lastName;
		this.imageId = accountName;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", location=" + location + ", password=" + password + ", description=" + description + ", imageId="
				+ imageId + ", accountName=" + accountName + "]";
	}

}
