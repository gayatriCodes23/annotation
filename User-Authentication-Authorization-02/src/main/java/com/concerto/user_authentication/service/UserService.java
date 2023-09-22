package com.concerto.user_authentication.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concerto.user_authentication.entities.User;
import com.concerto.user_authentication.repository.UserRepository;

@Service
public class UserService {


	@Autowired
	private UserRepository userRepository;

	public List<User> getUsers() {
		return userRepository.findAll();
	}
	
	public User createUser(User user) {
		user.setId(UUID.randomUUID().toString());
		return userRepository.save(user);
	}

}