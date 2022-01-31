package com.app.repo;

import org.springframework.stereotype.Repository;

import com.app.model.Employee;

@Repository
public interface EmployeeRepository extends BaseRepository<Employee, Long> {

}
