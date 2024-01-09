package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmpService {

	List<Employee> findAllEmp();
	void AddNewEmp(Employee e);
}
