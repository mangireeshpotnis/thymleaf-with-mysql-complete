package com.thymleafCrud.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thymleafCrud.models.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
	
	

}
