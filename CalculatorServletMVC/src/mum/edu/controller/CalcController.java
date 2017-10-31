package mum.edu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mum.edu.domain.Calculator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.RequestMapping;
import mum.edu.validator.CalcValidator;

public class CalcController {

	@AutoWired
	CalcValidator calcValidator;
	
	@RequestMapping(value={"/","calc2"})
	public String inputCalc(Calculator calc){
		return "/WEB-INF/jsp/calculator.jsp";
	}
	
	@RequestMapping("/calcSave")
	public String doCalc(Calculator calc, HttpServletRequest request, HttpServletResponse response){
		
		List<String> errors = calcValidator.validate(calc);
		if(errors.isEmpty()){
			calc.add();
			calc.mult();
			
			request.setAttribute("calculator", calc);
			return "/WEB-INF/jsp/result.jsp";
		} else{
			request.setAttribute("errors", errors);
			request.setAttribute("calculator", calc);
			return "/WEB-INF/jsp/calculator.jsp";
		}		
	}
}
