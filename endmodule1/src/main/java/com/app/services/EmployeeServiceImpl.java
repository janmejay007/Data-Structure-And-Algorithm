package com.app.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dto.ApiResponse;
import com.app.dto.AuthReqDTO;
import com.app.dto.AuthResponseDTO;
import com.app.dto.EmployeeDTO;
import com.app.entities.Employee;
import com.app.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;

	@Autowired
	private ModelMapper mapper;

	@Override
	public List<AuthResponseDTO> getAllEmployee() {
		List<Employee> emp = empRepo.findAll();
		List<AuthResponseDTO> authDto = new ArrayList<>();
		emp.forEach(i -> {
			AuthResponseDTO auth = mapper.map(i, AuthResponseDTO.class);
			authDto.add(auth);
		});
		return authDto;
	}

	@Override
	public AuthResponseDTO addEmployee(EmployeeDTO transientEmp) {
		Employee emp = mapper.map(transientEmp, Employee.class);
		Employee em = empRepo.save(emp);

		return mapper.map(em, AuthResponseDTO.class);
	}

	@Override
	public ApiResponse deleteEmpDetails(Long empid) {
		String msg = "Emp cna't be deleted";
		if (empRepo.existsById(empid)) {
			empRepo.deleteById(empid);
			msg = "employee deleted";
		}
		return new ApiResponse(msg);
	}

	@Override
	public AuthResponseDTO getEmpDetails(Long empid) {
		Employee emp = empRepo.findById(empid).orElseThrow(() -> new ResourceNotFoundException("Invalid employee id"));
		AuthResponseDTO auth = mapper.map(emp, AuthResponseDTO.class);
		return auth;
	}

	@Override
	public AuthResponseDTO updateEmployee(EmployeeDTO detachedEmp, Long id) {

		if (empRepo.existsById(id)) {
			Employee emp = mapper.map(detachedEmp, Employee.class);
			Employee em = empRepo.save(emp);
			return mapper.map(em, AuthResponseDTO.class);
		} else {
			throw new ResourceNotFoundException("Employee does not exist");
		}

	}

	@Override
	public AuthResponseDTO authenticateEmp(AuthReqDTO request) {
		Employee emp = empRepo.findByEmailAndPassword(request.getEmail(), request.getPassword())
				.orElseThrow(() -> new ResourceNotFoundException("Emp not found Invalid email or password"));
		AuthResponseDTO auth = mapper.map(emp, AuthResponseDTO.class);
		return auth;
	}

}
