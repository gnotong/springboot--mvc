package com.notgabs.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Course")
public class Course {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	private String title;

	@Column
	private String description = null;

	@ManyToMany(mappedBy = "courses")
	private Set<Student> students = new HashSet<>();

	public Course() {
	}

	public Course(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Student> getStudents() {
		return this.students;
	}

	public Course addStudent(Student student) {
		if (!this.students.contains(student)) {
			this.students.add(student);
			student.addCourse(this);
		}

		return this;
	}

	public Course removeStudent(Student student) {
		if (this.students.remove(student)) {
			student.removeCourse(this);
		}

		return this;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + "]";
	}
}
