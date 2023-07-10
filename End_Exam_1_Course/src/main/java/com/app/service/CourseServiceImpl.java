package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Category;
import com.app.entity.Course;
import com.app.repository.CourseRepository;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {


	@Autowired
	private CourseRepository courRepo;

	@Override
	public List<Course> getDetailsbyCate(Category c) {
		
		return courRepo.getByCategory(c);
	}
	
	

//
}
