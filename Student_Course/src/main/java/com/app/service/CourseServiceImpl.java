package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.ResponseDto;
import com.app.dto.insertCourseDto;
import com.app.entities.Course;
import com.app.repository.CourseRepository;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository cRepo;
	@Autowired
	private ModelMapper mapper;
	
	public CourseServiceImpl() {
		System.out.println("Course service started");
	}

	@Override
	public ResponseDto insertCourse(insertCourseDto dto) {
		Course c=mapper.map(dto, Course.class);
		cRepo.save(c);
		return new ResponseDto("New Course added");
	}

	@Override
	public List<Course> getAllCourses() {
		
		return cRepo.findAll();
	}

}
