package com.tendercare.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tendercare.dao.h2.IUserRepository;
import com.tendercare.model.h2.User;

@RestController
public class UserController {
	@Autowired
	private IUserRepository userRepository;
	@RequestMapping("/TestUser")
	public String test(){
		return "test";
	}
	@RequestMapping("/saveUser")
	public User save(User user){
		userRepository.save(user);
		return user;
	}
	@CrossOrigin(origins="*")
	@RequestMapping("/allUsers")
	public Iterable<User> getUsers(){
		return userRepository.findAll();
	}
	@RequestMapping("/countUser")
	public int countUsers(){
		return userRepository. countUsers();
	}
}
