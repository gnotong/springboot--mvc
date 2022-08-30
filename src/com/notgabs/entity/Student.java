package com.notgabs.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;

	@NotNull(message = "required")
	@Column(name = "first_name")
	private String firstName;

	@NotNull(message = "required")
	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@ManyToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinTable(
		name = "student_courses", 
		joinColumns = { @JoinColumn(name = "student_id") }, 
		inverseJoinColumns = {@JoinColumn(name = "course_id") }
	)
	private Set<Course> courses = new HashSet<>();

	public Student() {

	}

	public Student(String firstName, String lastName, String email) {
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

	public Set<Course> getCourses() {
		return courses;
	}

	public Student addCourse(Course course) {
		if (!this.courses.contains(course)) {
			this.courses.add(course);
		}

		return this;
	}

	public Student removeCourse(Course course) {
		if (this.courses.contains(course)) {
			this.courses.remove(course);
		}

		return this;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
}
