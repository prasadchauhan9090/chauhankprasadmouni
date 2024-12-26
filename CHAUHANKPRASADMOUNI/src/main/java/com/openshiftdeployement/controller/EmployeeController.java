package com.openshiftdeployement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.openshiftdeployement.employee.Employee;
import com.openshiftdeployement.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	public  EmployeeService employeeService;
	
	@PostMapping("/emps")
	public List<Employee> addEmployee(@RequestBody List<Employee> employee)
	{
		List<Employee> em= employeeService.addEmployee(employee);
		return em;
	}
	
	
	
}
