package com.user.userservice.vo;

import java.util.Optional;

import com.user.userservice.entity.User;

public class ResponseTempletVO {

	private Optional<User> user;
	private DepartmentVO department;

	public Optional<User> getUser() {
		return user;
	}

	public void setUser(Optional<User> user2) {
		this.user = user2;
	}

	public DepartmentVO getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentVO department) {
		this.department = department;
	}

}
