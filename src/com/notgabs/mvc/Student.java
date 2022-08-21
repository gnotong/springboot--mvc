package com.notgabs.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String LastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("CMR", "Cameroon");
		countryOptions.put("CI", "Ivory Coast");
		countryOptions.put("BN", "Benin");
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
}
