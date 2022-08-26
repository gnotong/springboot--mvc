package com.notgabs.mvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@NotNull(message = "required")
	@Column(name = "first_name")
	private String firstName;

	@NotNull(message = "required")
	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	public Student() {

	}

	public Student(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
}
