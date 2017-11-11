package com.packt.webstore.interceptor;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class EmployeeInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request
			, HttpServletResponse response, Object handler) throws Exception{		
		return super.preHandle(request, response, handler);
	}
	
	@Override
	public void postHandle(HttpServletRequest request
			, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception{
		String message = "Join the Team";
		Principal principal = request.getUserPrincipal();
		if(principal != null){
			if(request.isUserInRole("ROLE_ADMIN"))
				message = "U can add an Employee";
			else 
				message = "keep up the good work!!";
		}
		modelAndView.getModelMap().addAttribute("SpecialBlurb", message);
		super.postHandle(request, response, handler, modelAndView);
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request
			, HttpServletResponse response, Object handler, Exception ex) throws Exception{
		super.afterCompletion(request, response, handler, ex);
	}
}
