package com.app.dto;

import java.time.LocalDate;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class insertCourseDto {
	
	private String title;
	private LocalDate startDate;
	private LocalDate endDate;
	private double fees;
	private int minScore;
}
