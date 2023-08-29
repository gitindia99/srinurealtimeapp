package com.cts.org.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.org.entity.Employee;



@Service
public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> findAllEmployees();

}
