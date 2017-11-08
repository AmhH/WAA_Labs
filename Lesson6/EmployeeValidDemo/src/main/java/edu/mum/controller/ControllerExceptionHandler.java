package edu.mum.controller;

import java.io.FileNotFoundException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ControllerExceptionHandler {

	public static final String DEFAULT = "error";
	
	@ExceptionHandler(FileNotFoundException.class)
	public ModelAndView handleError(HttpServletRequest request, FileNotFoundException exception){
		ModelAndView mav = new ModelAndView();
		mav.addObject("fileNotFound", exception.getMessage());
		mav.setViewName("fileNotFound");
		return mav;
	}
	
	@ExceptionHandler(value = Exception.class)
	public ModelAndView defaultHandler(HttpServletRequest request, Exception exception) throws Exception{
		if(AnnotationUtils.findAnnotation(exception.getClass(), ResponseStatus.class) != null)
			throw exception;
		ModelAndView mav = new ModelAndView();
		mav.addObject("excepton", exception);
		mav.addObject("url", request.getRequestURI());
		mav.setViewName(DEFAULT);
		return null;
	}
}
