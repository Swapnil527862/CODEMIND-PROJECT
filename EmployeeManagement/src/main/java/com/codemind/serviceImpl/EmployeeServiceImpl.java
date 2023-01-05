package com.codemind.serviceImpl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codemind.exceptions.EmployeeNotFoundException;
import com.codemind.model.Employee;
import com.codemind.repository.EmployeeRepository;
import com.codemind.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployee() {
	
		List<Employee> empList = employeeRepository.findAll();

		return empList;
	}

	
	
	@Override
	public String saveEmployee(Employee employee) {
		try {
			
			employeeRepository.save(employee);
			
			return "Employee Details saved Successfully";
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "Error while saving employee details";
		}
		
	}

	@Override
	public String deleteEmployee(Integer employeeId) {
		try {
			
			employeeRepository.deleteById(employeeId);
			
			return "Employee Deleted Successfully";
			
		}catch (Exception e) {
			e.printStackTrace();
			return "Error while deleting employee details";
		}
		
	}

	@Override
	public Employee updateEmployee(Employee employee, Integer empId) {
		
		Employee employeeDB = employeeRepository.findById(empId).get();
		
		if (Objects.nonNull(employee.getName()) && !"".equalsIgnoreCase(employee.getName())) {
			employeeDB.setName(employee.getName());
		}
		
		if(Objects.nonNull(employee.getAddress()) && !"".equalsIgnoreCase(employee.getAddress())) {
			employeeDB.setAddress(employee.getAddress());
		}
		
		if(Objects.nonNull(employee.getEmailId()) && !"".equalsIgnoreCase(employee.getEmailId())) {
			employeeDB.setEmailId(employee.getEmailId());
		}
		
		if(Objects.nonNull(employee.getMobNo()) && !"".equalsIgnoreCase(employee.getMobNo())) {
			employeeDB.setMobNo(employee.getMobNo());
		}
		
		return employeeRepository.save(employeeDB);
	}



	@Override
	public Employee getEmployeeById(Integer employeeId) {
		
		  Employee emp ; 
		  
		  try { 
			  emp = employeeRepository.findById(employeeId).get();
		  
		  }catch(Exception e) {
		  
		  throw new EmployeeNotFoundException("emp id :"+employeeId); 
		  
		  }
		return emp;
	}

}
