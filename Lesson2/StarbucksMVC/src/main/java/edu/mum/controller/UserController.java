package edu.mum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.domain.User;
import edu.mum.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value={"/","/login"}, method=RequestMethod.GET)
	public String getLogin(){
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String authenticate(User user) throws Exception{
		User logedUser = userService.findByName(user.getName());
		if(logedUser == null || !logedUser.getPassword().equals(user.getPassword()))
			throw new RuntimeException("Username or Password is invalid");
		return "LoginSuccessful";
	}
}
