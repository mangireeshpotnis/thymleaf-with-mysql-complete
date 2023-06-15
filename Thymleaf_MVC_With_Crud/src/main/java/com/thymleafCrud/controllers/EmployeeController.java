package com.thymleafCrud.controllers;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.thymleafCrud.models.Employee;
import com.thymleafCrud.services.EmployeeServices;
import com.thymleafCrud.services.EmployeeServicesImplementation;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeServices employeeServices;
	
	
	//listing all employees
	@GetMapping("/employees")
	public String listAllEmployees(Model model) {
		model.addAttribute("employees",employeeServices.getAllEmployees());
		return "employees";		
	}	
	
	//form to enter new Employee
	@GetMapping("/employees/new")
	public String createEmployeeFrom(Model model) {
		//creating student object to hold form data
		Employee employee = new Employee();
		model.addAttribute("employee",employee);
		return "create_employee";		
	}
	
	//saving a Employee from form details
	@PostMapping("/employees")
	public String saveEmployee(@ModelAttribute Employee employee) {
		employeeServices.saveEmployee(employee);
		return "redirect:/employees";		
	}
	
		
	//handler method to handle updation form employees
	@GetMapping("/employees/edit/{id}")
	public String editEmployeeForm(@PathVariable int id, Model model) {
		model.addAttribute("employee",employeeServices.getEmployeeById(id));
		return "edit_employee";		
	}
	
	//handler method to save data from updation
	@PostMapping("/employees/{id}")
	public String updateEmployee(@PathVariable int id,@ModelAttribute Employee employee,Model model) {
		
		//get employee by id
		Employee existingEmployee = employeeServices.getEmployeeById(id);
		existingEmployee.setId(employee.getId());
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		
		//save updated Employee object
		employeeServices.updateEmployee(existingEmployee);
		return "redirect:/employees";
	}
	
	//handler method to handle delete request
	@GetMapping("/employees/delete/{id}")
	public String deleteEmployeeById(@PathVariable int id) {
		employeeServices.deleteEmployee(id);
		return "redirect:/employees";
		
	}
	
	

}
