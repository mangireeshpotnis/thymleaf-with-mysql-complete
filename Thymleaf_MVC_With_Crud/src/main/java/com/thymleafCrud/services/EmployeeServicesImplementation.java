package com.thymleafCrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thymleafCrud.models.Employee;
import com.thymleafCrud.repositories.EmployeeRepository;
@Service
public class EmployeeServicesImplementation implements EmployeeServices {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		
		return (List<Employee>) employeeRepository.findAll();				
	}

	@Override
	public Employee saveEmployee(Employee employee) {		
		
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		
		
		
		 employeeRepository.deleteById(id);
	}
	
	

}
