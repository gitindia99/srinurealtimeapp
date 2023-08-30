package com.cts.org.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cts.org.entity.Employee;
import com.cts.org.repository.EmployeeRepository;
import com.cts.org.service.EmployeeService;


@Component
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> findAllEmployees() {
		List<Employee> findAll = employeeRepository.findAll();
		return findAll;
	}

	@Override
	public Employee findByNameDetails(String name) {
		// TODO Auto-generated method stub
		Employee emp=employeeRepository.findByName(name);
		return emp;
	}

	
}
