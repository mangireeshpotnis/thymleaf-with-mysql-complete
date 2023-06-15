package com.thymleafCrud.services;

import java.util.List;

import com.thymleafCrud.models.Employee;

public interface EmployeeServices {
	
	public List<Employee> getAllEmployees();
	
	public Employee saveEmployee(Employee employee);
	
	public Employee getEmployeeById(int id);
	
	public Employee updateEmployee(Employee employee);
	
	public void deleteEmployee(int id);
	

}
