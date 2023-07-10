package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.customException.ResourceNotFoundException;
import com.app.dto.ResponseDto;
import com.app.dto.insertStudentDto;
import com.app.entities.Course;
import com.app.entities.Student;
import com.app.repository.CourseRepository;
import com.app.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	public StudentServiceImpl() {
		System.out.println("Student service Started");
	}
	
	@Autowired
	private StudentRepository stuRepo;
	@Autowired
	private ModelMapper mapper;
	@Autowired
	private CourseRepository courseRepo;
	
	@Override
	public ResponseDto insert(insertStudentDto dto) {
		Student student=mapper.map(dto, Student.class);
		Course c=courseRepo.findById(dto.getCourseId()).orElseThrow(()->new ResourceNotFoundException("invalid id"));
		
		if(student.getScore()>=c.getMinScore())
		{
			c.insertStudent(student);
			stuRepo.save(student);
			return new ResponseDto("Student added");
		}
		
		return new ResponseDto("Student not added");
		
	}

	@Override
	public List<Student> getAllStudents() {
		
		return stuRepo.findAll();
	}

	@Override
	public ResponseDto delete(int sid) {
		Student s=stuRepo.findById(sid).orElseThrow(()->new ResourceNotFoundException("Invalid sid"));
		Course c=courseRepo.findById(s.getId()).orElseThrow(()->new ResourceNotFoundException("Invalid sid"));
		c.deleteStudent(s);
		stuRepo.delete(s);
		return new ResponseDto("Student deleted");
	}
	

}
