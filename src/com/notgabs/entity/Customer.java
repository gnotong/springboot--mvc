package com.notgabs.entity;

import javax.validation.constraints.NotBlank;

import com.notgabs.validation.CourseCode;

public class Customer {

	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	@CourseCode(value = "MAMA", message = "must start with MAMA")
	private String courseCode;
	
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
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}
