package com.app.service;

import java.util.List;

import com.app.dto.ResponseDto;
import com.app.dto.insertStudentDto;
import com.app.entities.Student;

public interface StudentService {
	
	ResponseDto insert(insertStudentDto dto);
	
	List<Student> getAllStudents();
	
	ResponseDto delete(int sid);

}
