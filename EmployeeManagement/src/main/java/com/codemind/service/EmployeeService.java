package com.codemind.service;

import java.util.List;

import com.codemind.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployee();
	
	public String saveEmployee(Employee employee);
	
	public String deleteEmployee(Integer employeeId);
	
	public Employee updateEmployee(Employee employee, Integer empId);
	
	public Employee getEmployeeById(Integer employeeId);

}
