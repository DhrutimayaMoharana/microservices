package com.user.userservice.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.user.userservice.entity.User;
import com.user.userservice.vo.ResponseTempletVO;

@Service
public interface UserService {

	public User save(User user);
	
	public Optional<User> findById(Long id);

	ResponseTempletVO getUserWithDept(Long id);
	
}
