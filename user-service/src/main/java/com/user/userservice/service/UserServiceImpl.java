package com.user.userservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.userservice.entity.User;
import com.user.userservice.repository.UserRepository;
import com.user.userservice.vo.DepartmentVO;
import com.user.userservice.vo.ResponseTempletVO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public Optional<User> findById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public ResponseTempletVO getUserWithDept(Long id) {
		ResponseTempletVO vo = new ResponseTempletVO();

		Optional<User> user = findById(id);

		DepartmentVO departmentVO = restTemplate.getForObject(
				"http://DEPARTMENT-SERVICE/department/findDepartmentById/" + user.get().getDepartmentId(), DepartmentVO.class);

		vo.setUser(user);
		vo.setDepartment(departmentVO);
		return vo;

	}

}
