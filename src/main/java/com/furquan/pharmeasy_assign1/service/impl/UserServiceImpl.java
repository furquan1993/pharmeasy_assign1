package com.furquan.pharmeasy_assign1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furquan.pharmeasy_assign1.model.User;
import com.furquan.pharmeasy_assign1.repository.UserRepository;
import com.furquan.pharmeasy_assign1.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public User findByUsername(String username) {
		return userRepo.findByUsername(username);
	}

}
