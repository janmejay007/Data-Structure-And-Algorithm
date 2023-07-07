package com.app.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmployeeDTO {
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private LocalDate joinDate;
	private double salary;
	private String location;
	private String department;

}
