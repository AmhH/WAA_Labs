package mum.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.domain.Calculator;
import mum.edu.service.CalculatorService;

@Controller
public class CalculatorController {

	@Autowired
	CalculatorService calculatorService;

	@RequestMapping(value = {"/","/calculator" }, method = RequestMethod.GET)
	public String getCalc(Calculator calculator, Model model) {
		return "calculator";
	}

	@RequestMapping(value = {"/calculator" }, method = RequestMethod.POST)
	public String doCalc(Calculator calculator, Model model) {

		if (calculator.getAdd1() != null && calculator.getAdd2() != null)
			calculatorService.add(calculator);

		if (calculator.getMult1() != null && calculator.getMult2() != null)
			calculatorService.mult(calculator);
		model.addAttribute("calculator", calculator);
		return "result";
	}
}
