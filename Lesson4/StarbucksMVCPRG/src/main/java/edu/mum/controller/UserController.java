package edu.mum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import edu.mum.domain.User;
import edu.mum.service.UserService;

@Controller
@SessionAttributes({"user"})
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value={"/login"}, method=RequestMethod.GET)
	public String getLogin(){
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String authenticate(User user, Model model) throws Exception{
		User logedUser = userService.findByName(user.getName());
		if(logedUser == null || !logedUser.getPassword().equals(user.getPassword()))
			throw new RuntimeException("Username or Password is invalid");
		model.addAttribute("user", user);
		return "redirect:advice";
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(Model model, SessionStatus status){
		status.setComplete();
		return "redirect:advice";
	}
}
