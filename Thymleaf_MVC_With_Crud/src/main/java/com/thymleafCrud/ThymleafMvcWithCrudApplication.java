package com.thymleafCrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.thymleafCrud.models.Employee;
import com.thymleafCrud.repositories.EmployeeRepository;

@SpringBootApplication
public class ThymleafMvcWithCrudApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ThymleafMvcWithCrudApplication.class, args);
	}
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		Employee e1 = new Employee("Mangireesh","Potnis","Mangireesh3p@gmail.com");
		employeeRepository.save(e1);
		
		Employee e2 = new Employee("Ganesh","Gaikar","gsgsince2000p@gmail.com");
		employeeRepository.save(e2);		
		*/
	}

}
