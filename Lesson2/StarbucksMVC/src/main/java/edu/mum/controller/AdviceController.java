package edu.mum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.service.AdviceService;

@Controller
public class AdviceController {

	@Autowired
	AdviceService adviceService;
	
	@RequestMapping(value="/advice", method=RequestMethod.GET)
	public String adviceForm(Model model){
		model.addAttribute("roasts", adviceService.getAllRoasts());
		return "advice";
	}
	
	@RequestMapping(value="/advice", method=RequestMethod.POST)
	public String advicePost(Integer roastKey, Model model){
		System.out.println(roastKey);
		String roast = adviceService.getRoast(roastKey);
		List<String> list = adviceService.getListByType(roast);
		model.addAttribute("roast", roast);
		model.addAttribute("list", list);
		return "display";
	}
	
}
