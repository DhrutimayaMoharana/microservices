package com.user.userservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.userservice.entity.User;
import com.user.userservice.service.UserService;
import com.user.userservice.vo.ResponseTempletVO;

import antlr.collections.List;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/saveUser")
	public User save(@RequestBody User user) {
		return userService.save(user);
	}

	@GetMapping("/findUserById")
	public Optional<User> findById(@RequestParam Long id) {
		return userService.findById(id);
	}
	
	@GetMapping("/findUserWithDeptByUserId")
	public ResponseTempletVO findUserWithDeptByUserId(@RequestParam Long id) {
		return userService.getUserWithDept(id);
	}

}
