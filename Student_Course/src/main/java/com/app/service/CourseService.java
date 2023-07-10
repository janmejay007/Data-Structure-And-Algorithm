package com.app.service;

import java.util.List;

import com.app.dto.ResponseDto;
import com.app.dto.insertCourseDto;
import com.app.entities.Course;

public interface CourseService {
	
	ResponseDto insertCourse(insertCourseDto dto);
	List<Course> getAllCourses();
}
