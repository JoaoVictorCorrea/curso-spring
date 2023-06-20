package com.example.projetoWeb.controllersRest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetoWeb.entities.User;

@RestController
public class UserControllerRest {
	
	@RequestMapping(value = "usersRest", method = RequestMethod.GET)
	public List<User> getUsers() {
		
		List<User> users = new ArrayList<>();
		
		User user = new User("João", "joao@gmail.com");
		
		users.add(user);
		
		return users;
	}
	
	@RequestMapping(value = "userRest/{name}", method = RequestMethod.GET)
	public List<User> getUser(@PathVariable String name) {
		
		List<User> users = new ArrayList<>();
		
		User user = new User(name, "joao@gmail.com");
		
		users.add(user);
		
		return users;
	}
	
	@RequestMapping(value = "userRest", method = RequestMethod.POST)
	public User setUser(@RequestBody User user) {
		
		return user;
	}
}
