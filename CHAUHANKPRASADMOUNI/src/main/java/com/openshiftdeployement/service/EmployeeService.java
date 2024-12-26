package com.openshiftdeployement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openshiftdeployement.employee.Employee;
import com.openshiftdeployement.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	public EmployeeRepository employeeRepository;

	public List<Employee> addEmployee(List<Employee> employee) {
		List<Employee> emm= employeeRepository.saveAll(employee);
		return emm;
	}



	
	
}
