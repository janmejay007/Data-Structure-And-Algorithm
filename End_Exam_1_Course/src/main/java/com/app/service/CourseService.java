package com.app.service;

import java.util.List;

import com.app.entity.Category;
import com.app.entity.Course;

public interface CourseService {

	List<Course> getDetailsbyCate(Category c);

}
