package com.department.departmentservice.service;

import java.util.Optional;

import com.department.departmentservice.entity.Department;

public interface DepartmentService {
	
	public Department save(Department department);
	
	public Optional<Department> findById(Long id);

}
