package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//first name , last name , email , course title,score obtained.

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "student1")
public class Student extends BaseEntity {
	
	private String firstName;
	private String lastName;
	@Column(unique = true)
	private String email;
	private String courseTitle;
	private int score;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "course_id",nullable = false)
	private Course courseId;
	public Student(String firstName, String lastName, String email, String courseTitle, int score) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.courseTitle = courseTitle;
		this.score = score;
	}

	
}
