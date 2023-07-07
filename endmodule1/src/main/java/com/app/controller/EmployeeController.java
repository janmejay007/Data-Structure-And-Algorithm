package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiResponse;
import com.app.dto.AuthReqDTO;
import com.app.dto.AuthResponseDTO;
import com.app.dto.EmployeeDTO;
import com.app.entities.Employee;
import com.app.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	public EmployeeController() {
		System.out.println("in default constructor of" + getClass());
	}

	@GetMapping
	public List<AuthResponseDTO> listEmps() {
		System.out.println("in list emps");
		return empService.getAllEmployee();
	}

	@PostMapping
	public ResponseEntity<?> saveEMpDetails(@RequestBody EmployeeDTO emp) {
		return new ResponseEntity<>(empService.addEmployee(emp), HttpStatus.CREATED);
	}

	@DeleteMapping("/{empid}")
	public ApiResponse deleteEmpDetails(@PathVariable Long empid) {
		return empService.deleteEmpDetails(empid);
	}

	@GetMapping("/{empid}")
	public AuthResponseDTO getEmpDetails(@PathVariable Long empid) {
		return empService.getEmpDetails(empid);
	}

	@PutMapping("/{id}")
	public AuthResponseDTO updateEnpDetails(@RequestBody EmployeeDTO emp,@PathVariable Long id) {
		return empService.updateEmployee(emp,id);
	}

	@PostMapping("/signin")
	public ResponseEntity<?> authenticateEMp(@RequestBody @Valid AuthReqDTO req) {
		return ResponseEntity.status(HttpStatus.OK).body(empService.authenticateEmp(req));
	}

}
