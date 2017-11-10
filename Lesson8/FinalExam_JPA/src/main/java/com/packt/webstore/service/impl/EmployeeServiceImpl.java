package com.packt.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.packt.webstore.domain.Employee;
import com.packt.webstore.repository.EmployeeRepository;
import com.packt.webstore.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public List<Employee> findAll() {
		return (List<Employee>)employeeRepository.findAll();
	}

	@Override
	public Employee findByEmployeeNumber(int employeeId) {
		return employeeRepository.findByEmployeeNumber(employeeId);
	}

}
