package com.app.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.app.entity.Category;


public class CourseRespDTO {


	 private String name;

	
	 private Category category;

	 private LocalDate startDate;

	private LocalDate endDate;
	
	 private double fee;

	 private LocalDateTime updateTime;
}
