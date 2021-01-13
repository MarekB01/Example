package com.example.Employee_DB.repository;

import com.example.Employee_DB.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Employee_DB.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
