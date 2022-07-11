package com.department.departmentservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.department.departmentservice.entity.Department;
import com.department.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("saveDepartment")
	public Department save(@RequestBody Department department) {
		return departmentService.save(department);
	}
	
	@GetMapping("findDepartmentById/{id}")
	public Optional<Department> findById(@PathVariable Long id) {
		return departmentService.findById(id);
	}
	
}
