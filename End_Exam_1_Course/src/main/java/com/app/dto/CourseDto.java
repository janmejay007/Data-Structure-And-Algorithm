package com.app.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.app.entity.Category;

public class CourseDto {

	private Long id;

	@NotBlank(message = "Name cannot be blank")
	private String name;

	@NotNull(message = "Category cannot be null")
	private Category category;

	@NotNull(message = "Start Date cannot be null")
	private LocalDate startDate;

	@NotNull(message = "End Date cannot be null")
	private LocalDate endDate;

	@DecimalMin(value = "0.0", inclusive = false, message = "Fee should be greater than 0.0")
	private double fee;

	private LocalDateTime updateDateTime;
}
