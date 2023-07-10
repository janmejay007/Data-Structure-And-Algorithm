package com.app.entity;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Course extends BaseEntity{

	@Column(length=20)
	@NotBlank(message="name cannot be blank")
	 private String name;
	@NotNull(message = "Category cannot be null")
	@Enumerated(EnumType.STRING)
	private Category category;
	@NotNull(message = "Start Date cannot be null")
	 private LocalDateTime startDate;
	@NotNull(message = "End Date cannot be null")
	private LocalDateTime endDate;
	@DecimalMin(value = "0.0", inclusive = false, message = "Fee should be greater than 0.0")
	 private double fee;
	@NotNull(message = "Update Date Time cannot be null")
	 private LocalDateTime updateTime;
}
