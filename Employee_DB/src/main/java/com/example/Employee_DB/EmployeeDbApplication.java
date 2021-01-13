package com.example.Employee_DB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EmployeeDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDbApplication.class, args);
	}

}
