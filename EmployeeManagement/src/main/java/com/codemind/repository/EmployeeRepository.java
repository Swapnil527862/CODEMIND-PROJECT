package com.codemind.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.codemind.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	//Custom Query sample
	/*
	 * @Query("") public void deletebyjoining();
	 */
	
	public Employee getByName(String name);
}
