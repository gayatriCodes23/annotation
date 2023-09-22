package com.concerto.user_authentication.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.concerto.user_authentication.entities.User;
import com.concerto.user_authentication.service.UserService;

@RestController
@RequestMapping("/home")
public class UserRestController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> getUser() {
		
		return this.userService.getUsers();
	}
	
	@GetMapping("/current-user")
	public String getLoggedInUser(Principal principal) {
		return principal.getName();
	}
}
