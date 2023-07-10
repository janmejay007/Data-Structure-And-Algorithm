package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ResponseDto;
import com.app.dto.insertStudentDto;
import com.app.entities.Student;
import com.app.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	public StudentController() {
		System.out.println("Student controller started");
	}
	
	@Autowired
	private StudentService stuService;
	
	@PostMapping("/insert")
	public ResponseDto insert(@RequestBody insertStudentDto dto)
	{
		return stuService.insert(dto);
	}
	
	@GetMapping()
	public List<Student> allStudents(){
		return stuService.getAllStudents();
	}
	
	@DeleteMapping("/{studentId}")
	public ResponseDto deleteStud(@PathVariable int studentId) {
		return stuService.delete(studentId);
	}
}
