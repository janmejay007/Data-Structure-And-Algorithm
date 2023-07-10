package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ResponseDto;
import com.app.dto.insertCourseDto;
import com.app.entities.Course;
import com.app.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {
	
	public CourseController() {
		System.out.println("CourseController started");
	}
	
	@Autowired
	private CourseService cservice;
	
	@PostMapping("/insert")
	public ResponseDto insertCourse(@RequestBody insertCourseDto dto)
	{
		return cservice.insertCourse(dto);
	}
	
	@GetMapping
	public List<Course> getAllCourse()
	{
		return cservice.getAllCourses();
	}

}
