package com.app.entities;
//course title(unique) , start date , end date , fees , min score

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = "studentList")
@Table(name = "course1")
public class Course extends BaseEntity {
	@Column(unique = true)
	private String title;
	@Column(name = "start_date")
	private LocalDate startDate;
	@Column(name = "end_date")
	private LocalDate endDate;
	private double fees;
	private int minScore;
	@OneToMany(mappedBy = "courseId",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
	private List<Student> studentList =new ArrayList<>();
	public Course(String title, LocalDate startDate, LocalDate endDate, double fees, int minScore) {
		super();
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.fees = fees;
		this.minScore = minScore;
	}
	
	public void insertStudent(Student stud) {
		studentList.add(stud);
		stud.setCourseId(this);
	}
	
	public void deleteStudent(Student stud)
	{
		studentList.remove(stud);
		
	}
	
	
}
