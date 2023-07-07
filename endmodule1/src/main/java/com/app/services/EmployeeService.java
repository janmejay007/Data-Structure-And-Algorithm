package com.app.services;

import java.util.List;

import com.app.dto.ApiResponse;
import com.app.dto.AuthReqDTO;
import com.app.dto.AuthResponseDTO;
import com.app.dto.EmployeeDTO;
import com.app.entities.Employee;

public interface EmployeeService {
	List<AuthResponseDTO> getAllEmployee();

	AuthResponseDTO addEmployee(EmployeeDTO transientEmp);

	ApiResponse deleteEmpDetails(Long empid);

	AuthResponseDTO getEmpDetails(Long empid);

	AuthResponseDTO updateEmployee(EmployeeDTO detachedEmp,Long id);

	AuthResponseDTO authenticateEmp(AuthReqDTO request);

}
