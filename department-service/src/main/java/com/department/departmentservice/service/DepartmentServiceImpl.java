package com.department.departmentservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.departmentservice.entity.Department;
import com.department.departmentservice.repository.DepartmentRepository;


@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department save(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	@Override
	public Optional<Department> findById(Long id) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(id);
	}

}
