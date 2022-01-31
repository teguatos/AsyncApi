package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Employee;
import com.app.repo.BaseRepository;
import com.app.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl extends BaseServiceImpl<Employee, Long> implements EmployeeService {

	@SuppressWarnings("unused")
	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(BaseRepository<Employee, Long> baseRepository) {
		super(baseRepository);
	}
}