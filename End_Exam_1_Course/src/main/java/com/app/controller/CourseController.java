package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Category;
import com.app.entity.Course;
import com.app.service.CourseService;

@RestController
@RequestMapping("/courses")

public class CourseController {

	//add dependancy:
	@Autowired
	private CourseService courServ;
	
	public CourseController() {
		System.out.println("Inside course controller");
		
	}
	
	@GetMapping("/{cname}")
	public List<Course> getCourseDetails(@PathVariable Category cname)
	{
		
		return courServ.getDetailsbyCate(cname);
	}
	

}
