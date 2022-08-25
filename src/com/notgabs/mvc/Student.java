package com.notgabs.mvc;

import jakarta.validation.constraints.NotNull;

public class Student {
	@NotNull(message = "required")
	private String firstName;
	@NotNull(message = "required")
	private String lastName;
	private String country;	
	
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
